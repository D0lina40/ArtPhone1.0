package org.linphone.compatibility;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/compatibility/Api27Compatibility;", "", "()V", "Companion", "app_debug"})
@android.annotation.TargetApi(value = 27)
public final class Api27Compatibility {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.compatibility.Api27Compatibility.Companion Companion = null;
    
    public Api27Compatibility() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\u000b"}, d2 = {"Lorg/linphone/compatibility/Api27Compatibility$Companion;", "", "()V", "requestDismissKeyguard", "", "activity", "Landroid/app/Activity;", "setShowWhenLocked", "enable", "", "setTurnScreenOn", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void setShowWhenLocked(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, boolean enable) {
        }
        
        public final void setTurnScreenOn(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, boolean enable) {
        }
        
        public final void requestDismissKeyguard(@org.jetbrains.annotations.NotNull
        android.app.Activity activity) {
        }
    }
}