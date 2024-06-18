package musicapp.network.models.featuredplaylist


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Created by "Mohamad Abuzaid" on 21/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
@Serializable
data class Tracks(
    @SerialName("href")
    val href: String?,
    @SerialName("total")
    val total: Int?
)