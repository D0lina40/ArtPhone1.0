package org.linphone.activities.main.recordings.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002>?B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010-\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010/\u001a\u00020,J\u0006\u00100\u001a\u00020,J\b\u00101\u001a\u00020,H\u0002J\b\u00102\u001a\u00020\u0019H\u0002J\u0006\u00103\u001a\u00020\u0019J\u000e\u00104\u001a\u00020,2\u0006\u00105\u001a\u000206J\u0006\u00107\u001a\u00020,J\u0006\u00108\u001a\u00020,J\u000e\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020;J\b\u0010<\u001a\u00020,H\u0002J\b\u0010=\u001a\u00020,H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lorg/linphone/activities/main/recordings/data/RecordingData;", "", "path", "", "recordingListener", "Lorg/linphone/activities/main/recordings/data/RecordingData$RecordingListener;", "(Ljava/lang/String;Lorg/linphone/activities/main/recordings/data/RecordingData$RecordingListener;)V", "date", "Ljava/util/Date;", "getDate", "()Ljava/util/Date;", "setDate", "(Ljava/util/Date;)V", "duration", "Landroidx/lifecycle/MutableLiveData;", "", "getDuration", "()Landroidx/lifecycle/MutableLiveData;", "formattedDate", "getFormattedDate", "formattedDuration", "getFormattedDuration", "formattedPosition", "getFormattedPosition", "isPlaying", "", "listener", "Lorg/linphone/core/PlayerListener;", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getPath", "player", "Lorg/linphone/core/Player;", "position", "getPosition", "scope", "Lkotlinx/coroutines/CoroutineScope;", "textureViewListener", "Landroid/view/TextureView$SurfaceTextureListener;", "tickerChannel", "Lkotlinx/coroutines/channels/ReceiveChannel;", "", "compareTo", "other", "destroy", "export", "initPlayer", "isClosed", "isVideoAvailable", "onProgressChanged", "progress", "", "pause", "play", "setTextureView", "textureView", "Landroid/view/TextureView;", "stop", "updatePosition", "Companion", "RecordingListener", "app_debug"})
public final class RecordingData implements java.lang.Comparable<org.linphone.activities.main.recordings.data.RecordingData> {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String path = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.recordings.data.RecordingData.RecordingListener recordingListener = null;
    @org.jetbrains.annotations.NotNull
    private static final java.util.regex.Pattern RECORD_PATTERN = null;
    public java.lang.String name;
    public java.util.Date date;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> duration = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> formattedDuration = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> formattedDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> position = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> formattedPosition = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPlaying = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> tickerChannel = null;
    private org.linphone.core.Player player;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.PlayerListener listener = null;
    @org.jetbrains.annotations.NotNull
    private final android.view.TextureView.SurfaceTextureListener textureViewListener = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.activities.main.recordings.data.RecordingData.Companion Companion = null;
    
    public RecordingData(@org.jetbrains.annotations.NotNull
    java.lang.String path, @org.jetbrains.annotations.NotNull
    org.linphone.activities.main.recordings.data.RecordingData.RecordingListener recordingListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Date getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFormattedDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFormattedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFormattedPosition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPlaying() {
        return null;
    }
    
    @java.lang.Override
    public int compareTo(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.recordings.data.RecordingData other) {
        return 0;
    }
    
    public final void destroy() {
    }
    
    public final void play() {
    }
    
    public final boolean isVideoAvailable() {
        return false;
    }
    
    public final void pause() {
    }
    
    public final void onProgressChanged(@org.jetbrains.annotations.NotNull
    java.lang.Object progress) {
    }
    
    public final void setTextureView(@org.jetbrains.annotations.NotNull
    android.view.TextureView textureView) {
    }
    
    public final void export() {
    }
    
    private final void initPlayer() {
    }
    
    private final void updatePosition() {
    }
    
    private final void stop() {
    }
    
    private final boolean isClosed() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/linphone/activities/main/recordings/data/RecordingData$Companion;", "", "()V", "RECORD_PATTERN", "Ljava/util/regex/Pattern;", "getRECORD_PATTERN", "()Ljava/util/regex/Pattern;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.regex.Pattern getRECORD_PATTERN() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lorg/linphone/activities/main/recordings/data/RecordingData$RecordingListener;", "", "onExportClicked", "", "path", "", "onPlayingEnded", "onPlayingStarted", "videoAvailable", "", "app_debug"})
    public static abstract interface RecordingListener {
        
        public abstract void onPlayingStarted(boolean videoAvailable);
        
        public abstract void onPlayingEnded();
        
        public abstract void onExportClicked(@org.jetbrains.annotations.NotNull
        java.lang.String path);
    }
}