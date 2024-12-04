package org.linphone.activities.main.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0014J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\'\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lorg/linphone/activities/main/viewmodels/LogsUploadViewModel;", "Lorg/linphone/activities/main/viewmodels/MessageNotifierViewModel;", "()V", "listener", "Lorg/linphone/core/CoreListenerStub;", "resetCompleteEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getResetCompleteEvent", "()Landroidx/lifecycle/MutableLiveData;", "resetCompleteEvent$delegate", "Lkotlin/Lazy;", "uploadErrorEvent", "getUploadErrorEvent", "uploadErrorEvent$delegate", "uploadFinishedEvent", "", "getUploadFinishedEvent", "uploadFinishedEvent$delegate", "uploadInProgress", "getUploadInProgress", "onCleared", "", "resetLogs", "uploadLogs", "app_debug"})
public class LogsUploadViewModel extends org.linphone.activities.main.viewmodels.MessageNotifierViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> uploadInProgress = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy resetCompleteEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy uploadFinishedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy uploadErrorEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public LogsUploadViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUploadInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getResetCompleteEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getUploadFinishedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getUploadErrorEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void uploadLogs() {
    }
    
    public final void resetLogs() {
    }
}