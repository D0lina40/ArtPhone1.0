package org.linphone.activities.voip.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0004J\u001a\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/linphone/activities/voip/fragments/GenericVideoPreviewFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "Lorg/linphone/activities/GenericFragment;", "()V", "previewTouchListener", "Landroid/view/View$OnTouchListener;", "previewX", "", "previewY", "switchCameraImageView", "Landroid/widget/ImageView;", "switchX", "switchY", "cleanUpLocalVideoPreview", "", "localVideoPreview", "Landroid/view/TextureView;", "setupLocalVideoPreview", "switchCamera", "app_debug"})
public abstract class GenericVideoPreviewFragment<T extends androidx.databinding.ViewDataBinding> extends org.linphone.activities.GenericFragment<T> {
    private float previewX = 0.0F;
    private float previewY = 0.0F;
    private float switchX = 0.0F;
    private float switchY = 0.0F;
    @org.jetbrains.annotations.Nullable
    private android.widget.ImageView switchCameraImageView;
    @org.jetbrains.annotations.NotNull
    private final android.view.View.OnTouchListener previewTouchListener = null;
    
    public GenericVideoPreviewFragment() {
        super();
    }
    
    protected final void setupLocalVideoPreview(@org.jetbrains.annotations.NotNull
    android.view.TextureView localVideoPreview, @org.jetbrains.annotations.Nullable
    android.widget.ImageView switchCamera) {
    }
    
    protected final void cleanUpLocalVideoPreview(@org.jetbrains.annotations.NotNull
    android.view.TextureView localVideoPreview) {
    }
}