package org.linphone.activities.assistant.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\b&\u0018\u0000 \u0016*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0004J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\nH\u0004J\b\u0010\u0015\u001a\u00020\nH\u0002R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lorg/linphone/activities/assistant/fragments/AbstractPhoneFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "Lorg/linphone/activities/GenericFragment;", "()V", "viewModel", "Lorg/linphone/activities/assistant/viewmodels/AbstractPhoneViewModel;", "getViewModel", "()Lorg/linphone/activities/assistant/viewmodels/AbstractPhoneViewModel;", "checkPermissions", "", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "showPhoneNumberInfoDialog", "updateFromDeviceInfo", "Companion", "app_debug"})
public abstract class AbstractPhoneFragment<T extends androidx.databinding.ViewDataBinding> extends org.linphone.activities.GenericFragment<T> {
    public static final int READ_PHONE_STATE_PERMISSION_REQUEST_CODE = 0;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.activities.assistant.fragments.AbstractPhoneFragment.Companion Companion = null;
    
    public AbstractPhoneFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract org.linphone.activities.assistant.viewmodels.AbstractPhoneViewModel getViewModel();
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    protected final void checkPermissions() {
    }
    
    private final void updateFromDeviceInfo() {
    }
    
    protected final void showPhoneNumberInfoDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/linphone/activities/assistant/fragments/AbstractPhoneFragment$Companion;", "", "()V", "READ_PHONE_STATE_PERMISSION_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}