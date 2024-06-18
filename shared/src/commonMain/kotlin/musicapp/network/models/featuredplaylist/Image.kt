package musicapp.network.models.featuredplaylist


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2023.
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