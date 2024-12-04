package org.linphone.activities.main.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u00a8\u0006\u0016"}, d2 = {"Lorg/linphone/activities/main/viewmodels/StatusViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "listener", "Lorg/linphone/core/CoreListenerStub;", "registrationStatusDrawable", "Landroidx/lifecycle/MutableLiveData;", "", "getRegistrationStatusDrawable", "()Landroidx/lifecycle/MutableLiveData;", "registrationStatusText", "getRegistrationStatusText", "voiceMailCount", "getVoiceMailCount", "getStatusIconResource", "state", "Lorg/linphone/core/RegistrationState;", "getStatusIconText", "onCleared", "", "refreshRegister", "updateDefaultAccountRegistrationStatus", "app_debug"})
public class StatusViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> registrationStatusText = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> registrationStatusDrawable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> voiceMailCount = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public StatusViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRegistrationStatusText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRegistrationStatusDrawable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getVoiceMailCount() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void refreshRegister() {
    }
    
    public final void updateDefaultAccountRegistrationStatus(@org.jetbrains.annotations.NotNull
    org.linphone.core.RegistrationState state) {
    }
    
    private final int getStatusIconText(org.linphone.core.RegistrationState state) {
        return 0;
    }
    
    private final int getStatusIconResource(org.linphone.core.RegistrationState state) {
        return 0;
    }
}