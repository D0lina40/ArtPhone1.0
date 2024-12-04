package org.linphone;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\t"}, d2 = {"Lorg/linphone/LinphoneApplication;", "Landroid/app/Application;", "Lcoil/ImageLoaderFactory;", "()V", "newImageLoader", "Lcoil/ImageLoader;", "onCreate", "", "Companion", "app_debug"})
public final class LinphoneApplication extends android.app.Application implements coil.ImageLoaderFactory {
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    public static org.linphone.core.CorePreferences corePreferences;
    @android.annotation.SuppressLint(value = {"StaticFieldLeak"})
    public static org.linphone.core.CoreContext coreContext;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.LinphoneApplication.Companion Companion = null;
    
    public LinphoneApplication() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public coil.ImageLoader newImageLoader() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J8\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u0010R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lorg/linphone/LinphoneApplication$Companion;", "", "()V", "coreContext", "Lorg/linphone/core/CoreContext;", "getCoreContext", "()Lorg/linphone/core/CoreContext;", "setCoreContext", "(Lorg/linphone/core/CoreContext;)V", "corePreferences", "Lorg/linphone/core/CorePreferences;", "getCorePreferences", "()Lorg/linphone/core/CorePreferences;", "setCorePreferences", "(Lorg/linphone/core/CorePreferences;)V", "contextExists", "", "createConfig", "", "context", "Landroid/content/Context;", "ensureCoreExists", "pushReceived", "service", "Lorg/linphone/core/CoreService;", "useAutoStartDescription", "skipCoreStart", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.core.CorePreferences getCorePreferences() {
            return null;
        }
        
        public final void setCorePreferences(@org.jetbrains.annotations.NotNull
        org.linphone.core.CorePreferences p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.core.CoreContext getCoreContext() {
            return null;
        }
        
        public final void setCoreContext(@org.jetbrains.annotations.NotNull
        org.linphone.core.CoreContext p0) {
        }
        
        private final void createConfig(android.content.Context context) {
        }
        
        public final boolean ensureCoreExists(@org.jetbrains.annotations.NotNull
        android.content.Context context, boolean pushReceived, @org.jetbrains.annotations.Nullable
        org.linphone.core.CoreService service, boolean useAutoStartDescription, boolean skipCoreStart) {
            return false;
        }
        
        public final boolean contextExists() {
            return false;
        }
    }
}