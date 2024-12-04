package org.linphone.activities.main.dialer.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\b\u0010\u000b\u001a\u00020\tH\u0003J\b\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\tH\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\tH\u0016J-\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00122\u000e\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0017\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\tH\u0016J\u001a\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/linphone/activities/main/dialer/fragments/DialerFragment;", "Lorg/linphone/activities/main/fragments/SecureFragment;", "Lorg/linphone/databinding/DialerFragmentBinding;", "()V", "uploadLogsInitiatedByUs", "", "viewModel", "Lorg/linphone/activities/main/dialer/viewmodels/DialerViewModel;", "checkForUpdate", "", "checkPermissions", "checkTelecomManagerPermissions", "displayDebugPopup", "displayNewVersionAvailableDialog", "url", "", "enableTelecomManager", "getLayoutId", "", "onPause", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class DialerFragment extends org.linphone.activities.main.fragments.SecureFragment<org.linphone.databinding.DialerFragmentBinding> {
    private org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel;
    private boolean uploadLogsInitiatedByUs = false;
    
    public DialerFragment() {
        super();
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    private final void checkPermissions() {
    }
    
    @android.annotation.TargetApi(value = org.linphone.mediastream.Version.API26_O_80)
    private final void checkTelecomManagerPermissions() {
    }
    
    @android.annotation.TargetApi(value = org.linphone.mediastream.Version.API26_O_80)
    private final void enableTelecomManager() {
    }
    
    private final void displayDebugPopup() {
    }
    
    private final void checkForUpdate() {
    }
    
    private final void displayNewVersionAvailableDialog(java.lang.String url) {
    }
}