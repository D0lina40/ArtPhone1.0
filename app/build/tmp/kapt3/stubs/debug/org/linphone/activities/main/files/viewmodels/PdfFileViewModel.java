package org.linphone.activities.main.files.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t\u00a8\u0006\u0017"}, d2 = {"Lorg/linphone/activities/main/files/viewmodels/PdfFileViewModel;", "Lorg/linphone/activities/main/files/viewmodels/FileViewerViewModel;", "content", "Lorg/linphone/core/Content;", "(Lorg/linphone/core/Content;)V", "operationInProgress", "Landroidx/lifecycle/MutableLiveData;", "", "getOperationInProgress", "()Landroidx/lifecycle/MutableLiveData;", "pdfRenderer", "Landroid/graphics/pdf/PdfRenderer;", "rendererReady", "Lorg/linphone/utils/Event;", "getRendererReady", "getPagesCount", "", "loadPdfPageInto", "", "index", "view", "Landroid/widget/ImageView;", "onCleared", "app_debug"})
public final class PdfFileViewModel extends org.linphone.activities.main.files.viewmodels.FileViewerViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> operationInProgress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> rendererReady = null;
    private android.graphics.pdf.PdfRenderer pdfRenderer;
    
    public PdfFileViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.Content content) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOperationInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getRendererReady() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final int getPagesCount() {
        return 0;
    }
    
    public final void loadPdfPageInto(int index, @org.jetbrains.annotations.NotNull
    android.widget.ImageView view) {
    }
}