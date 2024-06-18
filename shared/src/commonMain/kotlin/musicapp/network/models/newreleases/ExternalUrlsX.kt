package musicapp.network.models.newreleases


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2024.
 * Email: m.abuzaid.ali@gmail.com
 */
@Serializable
data class ExternalUrlsX(
    @SerialName("spotify")
    val spotify: String?
)