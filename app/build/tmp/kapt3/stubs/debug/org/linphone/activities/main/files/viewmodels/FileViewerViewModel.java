package org.linphone.activities.main.files.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\u0006\u0010\u0013\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lorg/linphone/activities/main/files/viewmodels/FileViewerViewModel;", "Landroidx/lifecycle/ViewModel;", "content", "Lorg/linphone/core/Content;", "(Lorg/linphone/core/Content;)V", "getContent", "()Lorg/linphone/core/Content;", "deleteAfterUse", "", "filePath", "", "getFilePath", "()Ljava/lang/String;", "fullScreenMode", "Landroidx/lifecycle/MutableLiveData;", "getFullScreenMode", "()Landroidx/lifecycle/MutableLiveData;", "onCleared", "", "toggleFullScreen", "app_debug"})
public class FileViewerViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Content content = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String filePath = null;
    private final boolean deleteAfterUse = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> fullScreenMode = null;
    
    public FileViewerViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.Content content) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Content getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFilePath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFullScreenMode() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void toggleFullScreen() {
    }
}