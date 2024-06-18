package musicapp.decompose

import musicapp.chartdetails.ChartDetailsViewModel
import musicapp.network.models.topfiftycharts.Item
import kotlinx.serialization.Serializable


/**
 * Created by "Mohamad Abuzaid" on 20/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
interface ChartDetailsComponent {
    val viewModel: ChartDetailsViewModel
    fun onOutPut(output: Output)
    sealed class Output {
        data object GoBack : Output()
        data class OnPlayAllSelected(val playlist: List<Item>) : Output()
        data class OnTrackSelected(val trackId: String, val playlist: List<Item>) : Output()
    }

    @Serializable
    sealed interface Input {

        @Serializable
        data class TrackUpdated(val trackId: String) : Input
    }
}
