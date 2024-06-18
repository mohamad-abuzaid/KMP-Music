package musicapp.network.models.featuredplaylist


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
@Serializable
data class Playlists(
    @SerialName("href")
    val href: String?,
    @SerialName("items")
    val items: List<Item>?,
    @SerialName("limit")
    val limit: Int?,
    @SerialName("next")
    val next: String?,
    @SerialName("offset")
    val offset: Int?,
    @SerialName("previous")
    val previous: String?,
    @SerialName("total")
    val total: Int?
)