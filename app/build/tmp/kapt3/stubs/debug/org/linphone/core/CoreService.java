package org.linphone.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\"\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016\u00a8\u0006\u0013"}, d2 = {"Lorg/linphone/core/CoreService;", "Lorg/linphone/core/tools/service/CoreService;", "()V", "createServiceNotificationChannel", "", "hideForegroundServiceNotification", "onCreate", "onDestroy", "onStartCommand", "", "intent", "Landroid/content/Intent;", "flags", "startId", "onTaskRemoved", "rootIntent", "showForegroundServiceNotification", "isVideoCall", "", "app_debug"})
public final class CoreService extends org.linphone.core.tools.service.CoreService {
    
    public CoreService() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public int onStartCommand(@org.jetbrains.annotations.Nullable
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override
    public void createServiceNotificationChannel() {
    }
    
    @java.lang.Override
    public void showForegroundServiceNotification(boolean isVideoCall) {
    }
    
    @java.lang.Override
    public void hideForegroundServiceNotification() {
    }
    
    @java.lang.Override
    public void onTaskRemoved(@org.jetbrains.annotations.Nullable
    android.content.Intent rootIntent) {
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}