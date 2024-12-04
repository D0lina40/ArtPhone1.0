package org.linphone.compatibility;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/compatibility/Api33Compatibility;", "", "()V", "Companion", "app_debug"})
@android.annotation.TargetApi(value = 33)
public final class Api33Compatibility {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.compatibility.Api33Compatibility.Companion Companion = null;
    
    public Api33Compatibility() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u0010"}, d2 = {"Lorg/linphone/compatibility/Api33Compatibility$Companion;", "", "()V", "hasPostNotificationsPermission", "", "context", "Landroid/content/Context;", "hasReadExternalStoragePermission", "hasTelecomManagerFeature", "requestPostNotificationsPermission", "", "fragment", "Landroidx/fragment/app/Fragment;", "code", "", "requestReadMediaAndCameraPermissions", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void requestPostNotificationsPermission(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.Fragment fragment, int code) {
        }
        
        public final boolean hasPostNotificationsPermission(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        public final void requestReadMediaAndCameraPermissions(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.Fragment fragment, int code) {
        }
        
        public final boolean hasReadExternalStoragePermission(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        public final boolean hasTelecomManagerFeature(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
    }
}