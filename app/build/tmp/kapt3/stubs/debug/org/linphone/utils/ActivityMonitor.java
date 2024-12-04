package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001\u001cB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u001a\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\rH\u0002J\b\u0010\u001a\u001a\u00020\rH\u0002J\b\u0010\u001b\u001a\u00020\rH\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\tR\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lorg/linphone/utils/ActivityMonitor;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "activities", "Ljava/util/ArrayList;", "Landroid/app/Activity;", "mActive", "", "mLastChecker", "Lorg/linphone/utils/ActivityMonitor$InactivityChecker;", "mRunningActivities", "", "checkActivity", "", "onActivityCreated", "activity", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "onBackgroundMode", "onForegroundMode", "startInactivityChecker", "InactivityChecker", "app_debug"})
public final class ActivityMonitor implements android.app.Application.ActivityLifecycleCallbacks {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<android.app.Activity> activities = null;
    private boolean mActive = false;
    private int mRunningActivities = 0;
    @org.jetbrains.annotations.Nullable
    private org.linphone.utils.ActivityMonitor.InactivityChecker mLastChecker;
    
    public ActivityMonitor() {
        super();
    }
    
    @java.lang.Override
    @kotlin.jvm.Synchronized
    public synchronized void onActivityCreated(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onActivityStarted(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @java.lang.Override
    @kotlin.jvm.Synchronized
    public synchronized void onActivityResumed(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @java.lang.Override
    @kotlin.jvm.Synchronized
    public synchronized void onActivityPaused(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @java.lang.Override
    public void onActivityStopped(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    @java.lang.Override
    @kotlin.jvm.Synchronized
    public synchronized void onActivityDestroyed(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
    }
    
    private final void startInactivityChecker() {
    }
    
    private final void checkActivity() {
    }
    
    private final void onBackgroundMode() {
    }
    
    private final void onForegroundMode() {
    }
    
    @java.lang.Override
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/linphone/utils/ActivityMonitor$InactivityChecker;", "Ljava/lang/Runnable;", "(Lorg/linphone/utils/ActivityMonitor;)V", "isCanceled", "", "cancel", "", "run", "app_debug"})
    public final class InactivityChecker implements java.lang.Runnable {
        private boolean isCanceled = false;
        
        public InactivityChecker() {
            super();
        }
        
        public final void cancel() {
        }
        
        @java.lang.Override
        public void run() {
        }
    }
}