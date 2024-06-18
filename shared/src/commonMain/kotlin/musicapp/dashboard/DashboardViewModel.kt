package musicapp.dashboard

import com.arkivanov.essenty.instancekeeper.InstanceKeeper
import musicapp.network.SpotifyApi
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch


/**
 * Created by "Mohamad Abuzaid" on 18/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
class DashboardViewModel(api: SpotifyApi) : InstanceKeeper.Instance {
    val dashboardState = MutableStateFlow<DashboardViewState>(DashboardViewState.Loading)

    private val coroutineExceptionHandler = CoroutineExceptionHandler { _, exception ->
        exception.printStackTrace()
        dashboardState.value = DashboardViewState.Failure(exception.message.toString())
    }

    private val job = SupervisorJob()
    private val viewModelScope = CoroutineScope(Dispatchers.Main + coroutineExceptionHandler + job)

    init {
        viewModelScope.launch {
            try {
                val topFiftyCharts = async { api.getTopFiftyChart() }.await()
                val newReleasedAlbums = async { api.getNewReleases() }.await()
                val featuredPlaylist = async { api.getFeaturedPlaylist() }.await()
                dashboardState.value = DashboardViewState.Success(
                    topFiftyCharts = topFiftyCharts,
                    newReleasedAlbums = newReleasedAlbums,
                    featuredPlayList = featuredPlaylist
                )
            } catch (e: Exception) {
                e.printStackTrace()
                dashboardState.value = DashboardViewState.Failure(e.message.toString())
            }
        }
    }

    override fun onDestroy() {
        viewModelScope.cancel()
    }
}