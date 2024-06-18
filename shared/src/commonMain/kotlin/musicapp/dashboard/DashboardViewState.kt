package musicapp.dashboard

import musicapp.network.models.featuredplaylist.FeaturedPlayList
import musicapp.network.models.newreleases.NewReleasedAlbums
import musicapp.network.models.topfiftycharts.TopFiftyCharts


/**
 * Created by "Mohamad Abuzaid" on 18/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
sealed interface DashboardViewState {
    data object Loading : DashboardViewState
    data class Success(
        val topFiftyCharts: TopFiftyCharts,
        val newReleasedAlbums: NewReleasedAlbums,
        val featuredPlayList: FeaturedPlayList
    ) : DashboardViewState

    data class Failure(val error: String) : DashboardViewState
}
