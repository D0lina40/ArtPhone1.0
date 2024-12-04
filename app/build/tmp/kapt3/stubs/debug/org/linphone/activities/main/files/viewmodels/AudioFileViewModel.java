package org.linphone.activities.main.files.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lorg/linphone/activities/main/files/viewmodels/AudioFileViewModel;", "Lorg/linphone/activities/main/files/viewmodels/FileViewerViewModel;", "Landroid/widget/MediaController$MediaPlayerControl;", "content", "Lorg/linphone/core/Content;", "(Lorg/linphone/core/Content;)V", "mediaPlayer", "Landroid/media/MediaPlayer;", "getMediaPlayer", "()Landroid/media/MediaPlayer;", "canPause", "", "canSeekBackward", "canSeekForward", "getAudioSessionId", "", "getBufferPercentage", "getCurrentPosition", "getDuration", "isPlaying", "onCleared", "", "pause", "seekTo", "pos", "start", "app_debug"})
public final class AudioFileViewModel extends org.linphone.activities.main.files.viewmodels.FileViewerViewModel implements android.widget.MediaController.MediaPlayerControl {
    @org.jetbrains.annotations.NotNull
    private final android.media.MediaPlayer mediaPlayer = null;
    
    public AudioFileViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.Content content) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.media.MediaPlayer getMediaPlayer() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @java.lang.Override
    public void start() {
    }
    
    @java.lang.Override
    public void pause() {
    }
    
    @java.lang.Override
    public int getDuration() {
        return 0;
    }
    
    @java.lang.Override
    public int getCurrentPosition() {
        return 0;
    }
    
    @java.lang.Override
    public void seekTo(int pos) {
    }
    
    @java.lang.Override
    public boolean isPlaying() {
        return false;
    }
    
    @java.lang.Override
    public int getBufferPercentage() {
        return 0;
    }
    
    @java.lang.Override
    public boolean canPause() {
        return false;
    }
    
    @java.lang.Override
    public boolean canSeekBackward() {
        return false;
    }
    
    @java.lang.Override
    public boolean canSeekForward() {
        return false;
    }
    
    @java.lang.Override
    public int getAudioSessionId() {
        return 0;
    }
}