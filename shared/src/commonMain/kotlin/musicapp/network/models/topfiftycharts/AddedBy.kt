package musicapp.network.models.topfiftycharts


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
@Serializable
data class AddedBy(
    @SerialName("external_urls")
    val externalUrls: ExternalUrls?,
    @SerialName("href")
    val href: String?,
    @SerialName("id")
    val id: String?,
    @SerialName("type")
    val type: String?,
    @SerialName("uri")
    val uri: String?
)