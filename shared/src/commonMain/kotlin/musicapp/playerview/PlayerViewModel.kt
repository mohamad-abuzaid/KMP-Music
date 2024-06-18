package musicapp.playerview

import com.arkivanov.essenty.instancekeeper.InstanceKeeper
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import musicapp.decompose.PlayerComponent
import musicapp.network.models.topfiftycharts.Item
import musicapp.player.MediaPlayerController


/**
 * Created by "Mohamad Abuzaid" on 21/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
class PlayerViewModel(
    mediaPlayerController: MediaPlayerController,
    trackList: List<Item>,
    selectedTrack: String,
    playerInputs: SharedFlow<PlayerComponent.Input>
) : InstanceKeeper.Instance {

    private val coroutineExceptionHandler = CoroutineExceptionHandler { _, exception ->
        exception.printStackTrace()
    }

    private val job = SupervisorJob()
    private val viewModelScope = CoroutineScope(Dispatchers.Main + coroutineExceptionHandler + job)

    val playerViewState = MutableStateFlow(
        PlayerViewState(
            trackList = trackList,
            mediaPlayerController = mediaPlayerController,
            playingTrackId = selectedTrack
        )
    )

    init {
        viewModelScope.launch {
            playerInputs.collectLatest {
                when (it) {
                    is PlayerComponent.Input.PlayTrack -> {
                        playerViewState.value =
                            playerViewState.value.copy(playingTrackId = it.trackId, trackList = it.tracksList)
                    }

                    is PlayerComponent.Input.UpdateTracks ->
                        playerViewState.value = playerViewState.value.copy(trackList = it.tracksList)
                }
            }
        }
    }

    override fun onDestroy() {
        viewModelScope.cancel()
    }
}