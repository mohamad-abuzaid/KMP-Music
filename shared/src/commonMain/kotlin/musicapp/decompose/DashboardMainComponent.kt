package musicapp.decompose

import musicapp.dashboard.DashboardViewModel


/**
 * Created by "Mohamad Abuzaid" on 20/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
interface DashboardMainComponent {
    val viewModel: DashboardViewModel

    fun onOutPut(output: Output)

    sealed class Output {
        data class PlaylistSelected(val playlistId: String) : Output()
    }
}
