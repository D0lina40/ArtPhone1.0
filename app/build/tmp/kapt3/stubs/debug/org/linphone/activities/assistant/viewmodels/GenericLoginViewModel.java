package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020)J\b\u0010+\u001a\u00020\u0012H\u0002J\u0006\u0010,\u001a\u00020)J\u000e\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\"R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\'\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\rR\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\'\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00110\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001d\u0010\rR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\rR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\rR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\rR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\r\u00a8\u0006/"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/GenericLoginViewModel;", "Landroidx/lifecycle/ViewModel;", "accountCreator", "Lorg/linphone/core/AccountCreator;", "(Lorg/linphone/core/AccountCreator;)V", "accountToCheck", "Lorg/linphone/core/Account;", "coreListener", "Lorg/linphone/core/CoreListenerStub;", "displayName", "Landroidx/lifecycle/MutableLiveData;", "", "getDisplayName", "()Landroidx/lifecycle/MutableLiveData;", "domain", "getDomain", "invalidCredentialsEvent", "Lorg/linphone/utils/Event;", "", "getInvalidCredentialsEvent", "invalidCredentialsEvent$delegate", "Lkotlin/Lazy;", "leaveAssistantEvent", "getLeaveAssistantEvent", "loginEnabled", "Landroidx/lifecycle/MediatorLiveData;", "getLoginEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "onErrorEvent", "getOnErrorEvent", "onErrorEvent$delegate", "password", "getPassword", "transport", "Lorg/linphone/core/TransportType;", "getTransport", "username", "getUsername", "waitForServerAnswer", "getWaitForServerAnswer", "continueEvenIfInvalidCredentials", "", "createAccountAndAuthInfo", "isLoginButtonEnabled", "removeInvalidProxyConfig", "setTransport", "transportType", "app_debug"})
public final class GenericLoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.AccountCreator accountCreator = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> domain = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> displayName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.TransportType> transport = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> loginEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForServerAnswer = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> leaveAssistantEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy invalidCredentialsEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy onErrorEvent$delegate = null;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.Account accountToCheck;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub coreListener = null;
    
    public GenericLoginViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.AccountCreator accountCreator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.TransportType> getTransport() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getLoginEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWaitForServerAnswer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getLeaveAssistantEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getInvalidCredentialsEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getOnErrorEvent() {
        return null;
    }
    
    public final void setTransport(@org.jetbrains.annotations.NotNull
    org.linphone.core.TransportType transportType) {
    }
    
    public final void removeInvalidProxyConfig() {
    }
    
    public final void continueEvenIfInvalidCredentials() {
    }
    
    public final void createAccountAndAuthInfo() {
    }
    
    private final boolean isLoginButtonEnabled() {
        return false;
    }
}