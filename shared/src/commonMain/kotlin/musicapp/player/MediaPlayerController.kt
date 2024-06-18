package musicapp.player

/**
 * Created by "Mohamad Abuzaid" on 21/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
expect class MediaPlayerController(platformContext: PlatformContext) {
    fun prepare(pathSource: String, listener: MediaPlayerListener)

    fun start()

    fun pause()

    fun stop()

    fun isPlaying(): Boolean

    fun release()
}

expect class PlatformContext