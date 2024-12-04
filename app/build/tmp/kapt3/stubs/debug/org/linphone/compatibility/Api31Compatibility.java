package org.linphone.compatibility;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/compatibility/Api31Compatibility;", "", "()V", "Companion", "app_debug"})
@android.annotation.TargetApi(value = 31)
public final class Api31Compatibility {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.compatibility.Api31Compatibility.Companion Companion = null;
    
    public Api31Compatibility() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J.\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u001aJ \u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!\u00a8\u0006\""}, d2 = {"Lorg/linphone/compatibility/Api31Compatibility$Companion;", "", "()V", "createCallNotification", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "call", "Lorg/linphone/core/Call;", "notifiable", "Lorg/linphone/notifications/Notifiable;", "pendingIntent", "Landroid/app/PendingIntent;", "channel", "", "notificationsManager", "Lorg/linphone/notifications/NotificationsManager;", "createIncomingCallNotification", "enableAutoEnterPiP", "", "activity", "Landroid/app/Activity;", "enable", "", "conference", "getUpdateCurrentPendingIntentFlag", "", "startForegroundService", "service", "Landroid/app/Service;", "notifId", "notif", "intent", "Landroid/content/Intent;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final int getUpdateCurrentPendingIntentFlag() {
            return 0;
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
        
        @org.jetbrains.annotations.NotNull
        public final android.app.Notification createCallNotification(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        org.linphone.core.Call call, @org.jetbrains.annotations.NotNull
        org.linphone.notifications.Notifiable notifiable, @org.jetbrains.annotations.NotNull
        android.app.PendingIntent pendingIntent, @org.jetbrains.annotations.NotNull
        java.lang.String channel, @org.jetbrains.annotations.NotNull
        org.linphone.notifications.NotificationsManager notificationsManager) {
            return null;
        }
        
        public final void startForegroundService(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.content.Intent intent) {
        }
        
        public final void startForegroundService(@org.jetbrains.annotations.NotNull
        android.app.Service service, int notifId, @org.jetbrains.annotations.Nullable
        android.app.Notification notif) {
        }
        
        public final void enableAutoEnterPiP(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, boolean enable, boolean conference) {
        }
    }
}