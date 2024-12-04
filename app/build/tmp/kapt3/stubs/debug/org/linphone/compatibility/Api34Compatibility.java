package org.linphone.compatibility;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/compatibility/Api34Compatibility;", "", "()V", "Companion", "app_debug"})
@android.annotation.TargetApi(value = 34)
public final class Api34Compatibility {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.compatibility.Api34Compatibility.Companion Companion = null;
    
    public Api34Compatibility() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J&\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004J&\u0010\u0011\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004\u00a8\u0006\u0012"}, d2 = {"Lorg/linphone/compatibility/Api34Compatibility$Companion;", "", "()V", "hasFullScreenIntentPermission", "", "context", "Landroid/content/Context;", "requestFullScreenIntentPermission", "", "startCallForegroundService", "service", "Landroid/app/Service;", "notifId", "", "notif", "Landroid/app/Notification;", "isCallActive", "startDataSyncForegroundService", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean hasFullScreenIntentPermission(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        public final void requestFullScreenIntentPermission(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        public final void startCallForegroundService(@org.jetbrains.annotations.NotNull
        android.app.Service service, int notifId, @org.jetbrains.annotations.NotNull
        android.app.Notification notif, boolean isCallActive) {
        }
        
        public final void startDataSyncForegroundService(@org.jetbrains.annotations.NotNull
        android.app.Service service, int notifId, @org.jetbrains.annotations.NotNull
        android.app.Notification notif, boolean isCallActive) {
        }
    }
}