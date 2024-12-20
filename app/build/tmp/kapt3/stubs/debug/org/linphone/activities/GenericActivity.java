package org.linphone.activities;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0006\u0010\u000b\u001a\u00020\u0004J\u0012\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0015J\u0012\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0014J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/linphone/activities/GenericActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "_isDestructionPending", "", "isDestructionPending", "()Z", "timer", "Ljava/util/Timer;", "finish", "", "isTablet", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onLayoutChanges", "foldingFeature", "Landroidx/window/layout/FoldingFeature;", "onResume", "updateCurrentLayout", "newLayoutInfo", "Landroidx/window/layout/WindowLayoutInfo;", "updateScreenSize", "app_debug"})
public abstract class GenericActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable
    private java.util.Timer timer;
    private boolean _isDestructionPending = false;
    
    public GenericActivity() {
        super();
    }
    
    public final boolean isDestructionPending() {
        return false;
    }
    
    public void onLayoutChanges(@org.jetbrains.annotations.Nullable
    androidx.window.layout.FoldingFeature foldingFeature) {
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"SourceLockedOrientationActivity"})
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    public void finish() {
    }
    
    public final boolean isTablet() {
        return false;
    }
    
    private final void updateScreenSize() {
    }
    
    private final void updateCurrentLayout(androidx.window.layout.WindowLayoutInfo newLayoutInfo) {
    }
}