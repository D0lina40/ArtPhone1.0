package org.linphone.activities.main.files.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/linphone/activities/main/files/fragments/ImageViewerFragment;", "Lorg/linphone/activities/main/files/fragments/GenericViewerFragment;", "Lorg/linphone/databinding/FileImageViewerFragmentBinding;", "()V", "viewModel", "Lorg/linphone/activities/main/files/viewmodels/ImageFileViewModel;", "getLayoutId", "", "onPause", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ImageViewerFragment extends org.linphone.activities.main.files.fragments.GenericViewerFragment<org.linphone.databinding.FileImageViewerFragmentBinding> {
    private org.linphone.activities.main.files.viewmodels.ImageFileViewModel viewModel;
    
    public ImageViewerFragment() {
        super();
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onPause() {
    }
}