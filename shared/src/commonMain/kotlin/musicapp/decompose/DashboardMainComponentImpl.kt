package musicapp.decompose

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.essenty.instancekeeper.getOrCreate
import musicapp.dashboard.DashboardViewModel
import musicapp.network.SpotifyApi


/**
 * Created by "Mohamad Abuzaid" on 20/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
class DashboardMainComponentImpl(
    componentContext: ComponentContext,
    val output: (DashboardMainComponent.Output) -> Unit,
    val spotifyApi: SpotifyApi
) : DashboardMainComponent, ComponentContext by componentContext {
    override val viewModel: DashboardViewModel
        get() = instanceKeeper.getOrCreate { DashboardViewModel(spotifyApi) }

    override fun onOutPut(output: DashboardMainComponent.Output) {
        output(output)
    }
}