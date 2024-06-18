package musicapp.player

/**
 * Created by "Mohamad Abuzaid" on 21/06/2023.
 * Email: m.abuzaid.ali@gmail.com
 */
interface MediaPlayerListener {
    fun onReady()
    fun onAudioCompleted()
    fun onError()
}
