package org.linphone.notifications;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u0006("}, d2 = {"Lorg/linphone/notifications/NotifiableMessage;", "", "message", "", "friend", "Lorg/linphone/core/Friend;", "sender", "time", "", "senderAvatar", "Landroid/graphics/Bitmap;", "filePath", "Landroid/net/Uri;", "fileMime", "isOutgoing", "", "isReaction", "reactionToMessageId", "reactionFrom", "(Ljava/lang/String;Lorg/linphone/core/Friend;Ljava/lang/String;JLandroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;)V", "getFileMime", "()Ljava/lang/String;", "setFileMime", "(Ljava/lang/String;)V", "getFilePath", "()Landroid/net/Uri;", "setFilePath", "(Landroid/net/Uri;)V", "getFriend", "()Lorg/linphone/core/Friend;", "()Z", "getMessage", "setMessage", "getReactionFrom", "getReactionToMessageId", "getSender", "getSenderAvatar", "()Landroid/graphics/Bitmap;", "getTime", "()J", "app_debug"})
public final class NotifiableMessage {
    @org.jetbrains.annotations.NotNull
    private java.lang.String message;
    @org.jetbrains.annotations.Nullable
    private final org.linphone.core.Friend friend = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String sender = null;
    private final long time = 0L;
    @org.jetbrains.annotations.Nullable
    private final android.graphics.Bitmap senderAvatar = null;
    @org.jetbrains.annotations.Nullable
    private android.net.Uri filePath;
    @org.jetbrains.annotations.Nullable
    private java.lang.String fileMime;
    private final boolean isOutgoing = false;
    private final boolean isReaction = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String reactionToMessageId = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String reactionFrom = null;
    
    public NotifiableMessage(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.Nullable
    org.linphone.core.Friend friend, @org.jetbrains.annotations.NotNull
    java.lang.String sender, long time, @org.jetbrains.annotations.Nullable
    android.graphics.Bitmap senderAvatar, @org.jetbrains.annotations.Nullable
    android.net.Uri filePath, @org.jetbrains.annotations.Nullable
    java.lang.String fileMime, boolean isOutgoing, boolean isReaction, @org.jetbrains.annotations.Nullable
    java.lang.String reactionToMessageId, @org.jetbrains.annotations.Nullable
    java.lang.String reactionFrom) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.core.Friend getFriend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSender() {
        return null;
    }
    
    public final long getTime() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Bitmap getSenderAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.net.Uri getFilePath() {
        return null;
    }
    
    public final void setFilePath(@org.jetbrains.annotations.Nullable
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getFileMime() {
        return null;
    }
    
    public final void setFileMime(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final boolean isOutgoing() {
        return false;
    }
    
    public final boolean isReaction() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReactionToMessageId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReactionFrom() {
        return null;
    }
}