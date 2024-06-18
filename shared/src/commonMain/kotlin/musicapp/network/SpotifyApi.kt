package musicapp.network

import musicapp.network.models.featuredplaylist.FeaturedPlayList
import musicapp.network.models.newreleases.NewReleasedAlbums
import musicapp.network.models.topfiftycharts.TopFiftyCharts


/**
 * Created by "Mohamad Abuzaid" on 21/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
interface SpotifyApi {
    suspend fun getTopFiftyChart(): TopFiftyCharts
    suspend fun getNewReleases(): NewReleasedAlbums
    suspend fun getFeaturedPlaylist(): FeaturedPlayList
    suspend fun getPlayList(playlistId: String): TopFiftyCharts
}