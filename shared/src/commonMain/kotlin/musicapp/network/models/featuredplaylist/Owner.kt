package musicapp.network.models.featuredplaylist


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
@Serializable
data class Owner(
    @SerialName("display_name")
    val displayName: String?,
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