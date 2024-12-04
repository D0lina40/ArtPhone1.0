package org.linphone.notifications;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J \u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/linphone/notifications/NotificationBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "getMessageText", "", "intent", "Landroid/content/Intent;", "handleCallIntent", "", "handleChatIntent", "context", "Landroid/content/Context;", "notificationId", "", "onReceive", "app_debug"})
public final class NotificationBroadcastReceiver extends android.content.BroadcastReceiver {
    
    public NotificationBroadcastReceiver() {
        super();
    }
    
    @java.lang.Override
    public void onReceive(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.content.Intent intent) {
    }
    
    private final void handleChatIntent(android.content.Context context, android.content.Intent intent, int notificationId) {
    }
    
    private final void handleCallIntent(android.content.Intent intent) {
    }
    
    private final java.lang.CharSequence getMessageText(android.content.Intent intent) {
        return null;
    }
}