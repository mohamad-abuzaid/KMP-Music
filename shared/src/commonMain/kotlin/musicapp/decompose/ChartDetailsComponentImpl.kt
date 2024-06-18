package musicapp.decompose

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.essenty.instancekeeper.getOrCreate
import musicapp.chartdetails.ChartDetailsViewModel
import musicapp.network.SpotifyApi
import kotlinx.coroutines.flow.SharedFlow


/**
 * Created by "Mohamad Abuzaid" on 20/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
class ChartDetailsComponentImpl(
    componentContext: ComponentContext,
    val spotifyApi: SpotifyApi,
    val playlistId: String,
    val playingTrackId: String,
    val chatDetailsInput: SharedFlow<ChartDetailsComponent.Input>,
    val output: (ChartDetailsComponent.Output) -> Unit,
) : ChartDetailsComponent, ComponentContext by componentContext {
    override val viewModel: ChartDetailsViewModel
        get() = instanceKeeper.getOrCreate {
            ChartDetailsViewModel(
                spotifyApi,
                playlistId,
                playingTrackId,
                chatDetailsInput
            )
        }

    override fun onOutPut(output: ChartDetailsComponent.Output) {
        output(output)
    }
}