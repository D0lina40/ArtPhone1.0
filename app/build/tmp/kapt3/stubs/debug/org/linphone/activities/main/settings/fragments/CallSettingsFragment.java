package org.linphone.activities.main.settings.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0017J-\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u0013H\u0017\u00a2\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/linphone/activities/main/settings/fragments/CallSettingsFragment;", "Lorg/linphone/activities/main/settings/fragments/GenericSettingFragment;", "Lorg/linphone/databinding/SettingsCallFragmentBinding;", "()V", "viewModel", "Lorg/linphone/activities/main/settings/viewmodels/CallSettingsViewModel;", "getLayoutId", "", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "updateTelecomManagerAccount", "app_debug"})
public final class CallSettingsFragment extends org.linphone.activities.main.settings.fragments.GenericSettingFragment<org.linphone.databinding.SettingsCallFragmentBinding> {
    private org.linphone.activities.main.settings.viewmodels.CallSettingsViewModel viewModel;
    
    public CallSettingsFragment() {
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
    @java.lang.Deprecated
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    private final void updateTelecomManagerAccount() {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
}