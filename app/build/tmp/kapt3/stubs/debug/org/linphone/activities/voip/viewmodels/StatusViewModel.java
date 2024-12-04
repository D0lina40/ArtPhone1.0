package org.linphone.activities.voip.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010!\u001a\u00020\"H\u0014J\u0006\u0010#\u001a\u00020\"J\u0006\u0010$\u001a\u00020\"J\u001a\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001e2\b\b\u0002\u0010&\u001a\u00020\u000fH\u0002J\b\u0010\'\u001a\u00020\"H\u0002J\u000e\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0007R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\'\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00190\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0007R\'\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00190\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u0007\u00a8\u0006)"}, d2 = {"Lorg/linphone/activities/voip/viewmodels/StatusViewModel;", "Lorg/linphone/activities/main/viewmodels/StatusViewModel;", "()V", "callQualityContentDescription", "Landroidx/lifecycle/MutableLiveData;", "", "getCallQualityContentDescription", "()Landroidx/lifecycle/MutableLiveData;", "callQualityIcon", "getCallQualityIcon", "encryptionContentDescription", "getEncryptionContentDescription", "encryptionIcon", "getEncryptionIcon", "encryptionIconVisible", "", "getEncryptionIconVisible", "listener", "Lorg/linphone/core/CoreListenerStub;", "previouslyDeclineToken", "getPreviouslyDeclineToken", "()Z", "setPreviouslyDeclineToken", "(Z)V", "showCallStatsEvent", "Lorg/linphone/utils/Event;", "getShowCallStatsEvent", "showCallStatsEvent$delegate", "Lkotlin/Lazy;", "showZrtpDialogEvent", "Lorg/linphone/core/Call;", "getShowZrtpDialogEvent", "showZrtpDialogEvent$delegate", "onCleared", "", "showCallStats", "showZrtpDialog", "call", "force", "updateCallQualityIcon", "updateEncryptionInfo", "app_debug"})
public final class StatusViewModel extends org.linphone.activities.main.viewmodels.StatusViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> callQualityIcon = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> callQualityContentDescription = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> encryptionIcon = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> encryptionContentDescription = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> encryptionIconVisible = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy showZrtpDialogEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy showCallStatsEvent$delegate = null;
    private boolean previouslyDeclineToken = false;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public StatusViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCallQualityIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCallQualityContentDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getEncryptionIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getEncryptionContentDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEncryptionIconVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.Call>> getShowZrtpDialogEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getShowCallStatsEvent() {
        return null;
    }
    
    public final boolean getPreviouslyDeclineToken() {
        return false;
    }
    
    public final void setPreviouslyDeclineToken(boolean p0) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void showZrtpDialog() {
    }
    
    public final void showCallStats() {
    }
    
    public final void updateEncryptionInfo(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call) {
    }
    
    private final void showZrtpDialog(org.linphone.core.Call call, boolean force) {
    }
    
    private final void updateCallQualityIcon() {
    }
}