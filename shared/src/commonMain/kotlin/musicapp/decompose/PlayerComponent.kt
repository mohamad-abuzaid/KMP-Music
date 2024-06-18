package musicapp.decompose

import musicapp.network.models.topfiftycharts.Item
import musicapp.playerview.PlayerViewModel


/**
 * Created by "Mohamad Abuzaid" on 20/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
interface PlayerComponent {
    val viewModel: PlayerViewModel

    fun onOutPut(output: Output)

    sealed class Output {
        data object OnPause : Output()
        data object OnPlay : Output()
        data class OnTrackUpdated(val trackId: String) : Output()
    }

    sealed interface Input {
        data class PlayTrack(val trackId: String, val tracksList: List<Item>) : Input
        data class UpdateTracks(val tracksList: List<Item>) : Input
    }

}
