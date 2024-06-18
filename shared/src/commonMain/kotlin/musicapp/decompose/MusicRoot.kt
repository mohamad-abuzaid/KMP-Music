package musicapp.decompose

import com.arkivanov.decompose.router.slot.ChildSlot
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

/**
 * Created by "Mohamad Abuzaid" on 20/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
interface MusicRoot {

    val childStack: Value<ChildStack<*, Child>>
    val dialogOverlay: Value<ChildSlot<*, PlayerComponent>>

    sealed class Child {
        data class Dashboard(val dashboardMainComponent: DashboardMainComponent) : Child()
        data class Details(val detailsComponent: ChartDetailsComponent) : Child()
    }
}
