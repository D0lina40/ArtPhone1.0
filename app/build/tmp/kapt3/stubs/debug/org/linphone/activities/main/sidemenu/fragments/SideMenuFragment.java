package org.linphone.activities.main.sidemenu.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0017J\u001a\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000bH\u0002J&\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/linphone/activities/main/sidemenu/fragments/SideMenuFragment;", "Lorg/linphone/activities/GenericFragment;", "Lorg/linphone/databinding/SideMenuFragmentBinding;", "()V", "temporaryPicturePath", "Ljava/io/File;", "viewModel", "Lorg/linphone/activities/main/sidemenu/viewmodels/SideMenuViewModel;", "getLayoutId", "", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pickFile", "showPasswordDialog", "goToSettings", "", "goToAccountSettings", "accountIdentity", "", "app_debug"})
public final class SideMenuFragment extends org.linphone.activities.GenericFragment<org.linphone.databinding.SideMenuFragmentBinding> {
    private org.linphone.activities.main.sidemenu.viewmodels.SideMenuViewModel viewModel;
    @org.jetbrains.annotations.Nullable
    private java.io.File temporaryPicturePath;
    
    public SideMenuFragment() {
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
    
    private final void pickFile() {
    }
    
    private final void showPasswordDialog(boolean goToSettings, boolean goToAccountSettings, java.lang.String accountIdentity) {
    }
}