package org.linphone.activities.assistant.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\t2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017\u00a2\u0006\u0002\u0010\u0013J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u001a\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/linphone/activities/assistant/fragments/QrCodeFragment;", "Lorg/linphone/activities/GenericFragment;", "Lorg/linphone/databinding/AssistantQrCodeFragmentBinding;", "()V", "sharedAssistantViewModel", "Lorg/linphone/activities/assistant/viewmodels/SharedAssistantViewModel;", "viewModel", "Lorg/linphone/activities/assistant/viewmodels/QrCodeViewModel;", "getLayoutId", "", "onPause", "", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class QrCodeFragment extends org.linphone.activities.GenericFragment<org.linphone.databinding.AssistantQrCodeFragmentBinding> {
    public static final int CAMERA_PERMISSION_REQUEST_CODE = 0;
    private org.linphone.activities.assistant.viewmodels.SharedAssistantViewModel sharedAssistantViewModel;
    private org.linphone.activities.assistant.viewmodels.QrCodeViewModel viewModel;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.activities.assistant.fragments.QrCodeFragment.Companion Companion = null;
    
    public QrCodeFragment() {
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
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/linphone/activities/assistant/fragments/QrCodeFragment$Companion;", "", "()V", "CAMERA_PERMISSION_REQUEST_CODE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}