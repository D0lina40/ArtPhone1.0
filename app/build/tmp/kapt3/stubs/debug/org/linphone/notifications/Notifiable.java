package org.linphone.notifications;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR!\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\n\u00a8\u0006!"}, d2 = {"Lorg/linphone/notifications/Notifiable;", "", "notificationId", "", "(I)V", "groupTitle", "", "getGroupTitle", "()Ljava/lang/String;", "setGroupTitle", "(Ljava/lang/String;)V", "isGroup", "", "()Z", "setGroup", "(Z)V", "localIdentity", "getLocalIdentity", "setLocalIdentity", "messages", "Ljava/util/ArrayList;", "Lorg/linphone/notifications/NotifiableMessage;", "Lkotlin/collections/ArrayList;", "getMessages", "()Ljava/util/ArrayList;", "myself", "getMyself", "setMyself", "getNotificationId", "()I", "remoteAddress", "getRemoteAddress", "setRemoteAddress", "app_debug"})
public final class Notifiable {
    private final int notificationId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<org.linphone.notifications.NotifiableMessage> messages = null;
    private boolean isGroup = false;
    @org.jetbrains.annotations.Nullable
    private java.lang.String groupTitle;
    @org.jetbrains.annotations.Nullable
    private java.lang.String localIdentity;
    @org.jetbrains.annotations.Nullable
    private java.lang.String myself;
    @org.jetbrains.annotations.Nullable
    private java.lang.String remoteAddress;
    
    public Notifiable(int notificationId) {
        super();
    }
    
    public final int getNotificationId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<org.linphone.notifications.NotifiableMessage> getMessages() {
        return null;
    }
    
    public final boolean isGroup() {
        return false;
    }
    
    public final void setGroup(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGroupTitle() {
        return null;
    }
    
    public final void setGroupTitle(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLocalIdentity() {
        return null;
    }
    
    public final void setLocalIdentity(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMyself() {
        return null;
    }
    
    public final void setMyself(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRemoteAddress() {
        return null;
    }
    
    public final void setRemoteAddress(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
}