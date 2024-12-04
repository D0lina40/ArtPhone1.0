package org.linphone.compatibility;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/compatibility/Api26Compatibility;", "", "()V", "Companion", "app_debug"})
@android.annotation.TargetApi(value = 26)
public final class Api26Compatibility {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.compatibility.Api26Compatibility.Companion Companion = null;
    
    public Api26Compatibility() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ6\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aJ.\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0004J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0007J\u0016\u0010&\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020\u0014J\u0006\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020\bJ\u000e\u0010*\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010+\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010,\u001a\u00020\bJ\u0010\u0010-\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0016\u0010.\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010/\u001a\u000200\u00a8\u00061"}, d2 = {"Lorg/linphone/compatibility/Api26Compatibility$Companion;", "", "()V", "changeAudioRouteForTelecomManager", "", "connection", "Lorg/linphone/telecom/NativeCallWrapper;", "route", "", "createCallNotification", "Landroid/app/Notification;", "context", "Landroid/content/Context;", "call", "Lorg/linphone/core/Call;", "notifiable", "Lorg/linphone/notifications/Notifiable;", "pendingIntent", "Landroid/app/PendingIntent;", "channel", "", "notificationsManager", "Lorg/linphone/notifications/NotificationsManager;", "createIncomingCallChannel", "", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "createIncomingCallNotification", "createMessageChannel", "createMissedCallChannel", "createServiceChannel", "enterPipMode", "activity", "Landroid/app/Activity;", "conference", "eventVibration", "vibrator", "Landroid/os/Vibrator;", "getChannelImportance", "channelId", "getImeFlagsForSecureChatRoom", "getOverlayType", "hasTelecomManagerFeature", "requestTelecomManagerPermission", "code", "routeToString", "startForegroundService", "intent", "Landroid/content/Intent;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void enterPipMode(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, boolean conference) {
        }
        
        public final void createServiceChannel(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.core.app.NotificationManagerCompat notificationManager) {
        }
        
        public final void createMissedCallChannel(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.core.app.NotificationManagerCompat notificationManager) {
        }
        
        public final void createIncomingCallChannel(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.core.app.NotificationManagerCompat notificationManager) {
        }
        
        public final void createMessageChannel(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.core.app.NotificationManagerCompat notificationManager) {
        }
        
        public final int getChannelImportance(@org.jetbrains.annotations.NotNull
        androidx.core.app.NotificationManagerCompat notificationManager, @org.jetbrains.annotations.NotNull
        java.lang.String channelId) {
            return 0;
        }
        
        public final int getOverlayType() {
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
        
        @android.annotation.SuppressLint(value = {"MissingPermission"})
        public final void eventVibration(@org.jetbrains.annotations.NotNull
        android.os.Vibrator vibrator) {
        }
        
        public final boolean changeAudioRouteForTelecomManager(@org.jetbrains.annotations.NotNull
        org.linphone.telecom.NativeCallWrapper connection, int route) {
            return false;
        }
        
        public final void requestTelecomManagerPermission(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, int code) {
        }
        
        public final int getImeFlagsForSecureChatRoom() {
            return 0;
        }
        
        public final void startForegroundService(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.content.Intent intent) {
        }
        
        public final boolean hasTelecomManagerFeature(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        private final java.lang.String routeToString(int route) {
            return null;
        }
    }
}