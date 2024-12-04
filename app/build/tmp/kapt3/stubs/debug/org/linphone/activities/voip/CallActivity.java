package org.linphone.activities.voip;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0014J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0017J\u0012\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J-\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u000e\u0010 \u001a\n\u0012\u0006\b\u0001\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0016\u00a2\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u000eH\u0014J\b\u0010\'\u001a\u00020\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/linphone/activities/voip/CallActivity;", "Lorg/linphone/activities/ProximitySensorActivity;", "()V", "binding", "Lorg/linphone/databinding/VoipActivityBinding;", "callsViewModel", "Lorg/linphone/activities/voip/viewmodels/CallsViewModel;", "conferenceViewModel", "Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "controlsViewModel", "Lorg/linphone/activities/voip/viewmodels/ControlsViewModel;", "statsViewModel", "Lorg/linphone/activities/voip/viewmodels/StatisticsListViewModel;", "checkPermissions", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLayoutChanges", "foldingFeature", "Landroidx/window/layout/FoldingFeature;", "onPause", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "", "newConfig", "Landroid/content/res/Configuration;", "onPostCreate", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onUserLeaveHint", "app_debug"})
public final class CallActivity extends org.linphone.activities.ProximitySensorActivity {
    private org.linphone.databinding.VoipActivityBinding binding;
    private org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel;
    private org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel;
    private org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel;
    private org.linphone.activities.voip.viewmodels.StatisticsListViewModel statsViewModel;
    
    public CallActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onPostCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onUserLeaveHint() {
    }
    
    @java.lang.Override
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    private final void checkPermissions() {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    public void onLayoutChanges(@org.jetbrains.annotations.Nullable
    androidx.window.layout.FoldingFeature foldingFeature) {
    }
}