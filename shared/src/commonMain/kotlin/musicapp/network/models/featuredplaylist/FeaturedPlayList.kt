package musicapp.network.models.featuredplaylist


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
@Serializable
data class FeaturedPlayList(
    @SerialName("message")
    val message: String?,
    @SerialName("playlists")
    val playlists: Playlists?
)