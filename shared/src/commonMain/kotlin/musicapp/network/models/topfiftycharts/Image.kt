package musicapp.network.models.topfiftycharts


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
@Serializable
data class Image(
    @SerialName("height")
    val height: String?,
    @SerialName("url")
    val url: String?,
    @SerialName("width")
    val width: String?
)