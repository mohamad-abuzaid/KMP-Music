package musicapp.network.models.newreleases


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
@Serializable
data class NewReleasedAlbums(
    @SerialName("albums")
    val albums: Albums?
)