package musicapp.chartdetails

import musicapp.network.models.topfiftycharts.TopFiftyCharts


/**
 * Created by "Mohamad Abuzaid" on 18/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
sealed interface ChartDetailsViewState {
    data object Loading : ChartDetailsViewState
    data class Success(
        val chartDetails: TopFiftyCharts,
        val playingTrackId: String,
    ) : ChartDetailsViewState

    data class Failure(val error: String) : ChartDetailsViewState
}
