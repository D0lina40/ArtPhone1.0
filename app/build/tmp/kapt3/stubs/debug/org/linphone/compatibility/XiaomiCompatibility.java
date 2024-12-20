package org.linphone.compatibility;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/compatibility/XiaomiCompatibility;", "", "()V", "Companion", "app_debug"})
@android.annotation.TargetApi(value = 26)
public final class XiaomiCompatibility {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.compatibility.XiaomiCompatibility.Companion Companion = null;
    
    public XiaomiCompatibility() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/linphone/compatibility/XiaomiCompatibility$Companion;", "", "()V", "createIncomingCallNotification", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "call", "Lorg/linphone/core/Call;", "notifiable", "Lorg/linphone/notifications/Notifiable;", "pendingIntent", "Landroid/app/PendingIntent;", "notificationsManager", "Lorg/linphone/notifications/NotificationsManager;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.app.Notification createIncomingCallNotification(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        org.linphone.core.Call call, @org.jetbrains.annotations.NotNull
        org.linphone.notifications.Notifiable notifiable, @org.jetbrains.annotations.NotNull
        android.app.PendingIntent pendingIntent, @org.jetbrains.annotations.NotNull
        org.linphone.notifications.NotificationsManager notificationsManager) {
            return null;
        }
    }
}