package musicapp.playerview

import musicapp.network.models.topfiftycharts.Item
import musicapp.player.MediaPlayerController


/**
 * Created by "Mohamad Abuzaid" on 21/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
data class PlayerViewState(
    val trackList: List<Item>,
    val mediaPlayerController: MediaPlayerController,
    val playingTrackId: String = ""
)

