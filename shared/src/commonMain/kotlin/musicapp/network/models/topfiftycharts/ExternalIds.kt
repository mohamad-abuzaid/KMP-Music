package musicapp.network.models.topfiftycharts

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
@Serializable
data class ExternalIds(
    @SerialName("isrc")
    val isrc: String?
)