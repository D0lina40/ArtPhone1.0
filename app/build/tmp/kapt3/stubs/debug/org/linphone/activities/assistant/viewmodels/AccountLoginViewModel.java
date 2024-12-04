package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00101\u001a\u000202J\b\u00103\u001a\u00020\u000fH\u0002J\b\u00104\u001a\u00020\u000fH\u0002J\u0006\u00105\u001a\u000202J\b\u00106\u001a\u000202H\u0002J\b\u00107\u001a\u000202H\u0002J\b\u00108\u001a\u000202H\u0014J\b\u00109\u001a\u000202H\u0016J\b\u0010:\u001a\u000202H\u0016J\u0006\u0010;\u001a\u000202R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0013\u0010\rR\'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\'\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00120\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001a\u0010\rR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\rR\'\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00120\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\u0015\u001a\u0004\b%\u0010\rR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\rR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\rR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\rR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\rR\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\r\u00a8\u0006<"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/AccountLoginViewModel;", "Lorg/linphone/activities/assistant/viewmodels/AbstractPhoneViewModel;", "accountCreator", "Lorg/linphone/core/AccountCreator;", "(Lorg/linphone/core/AccountCreator;)V", "accountToCheck", "Lorg/linphone/core/Account;", "coreListener", "Lorg/linphone/core/CoreListenerStub;", "displayName", "Landroidx/lifecycle/MutableLiveData;", "", "getDisplayName", "()Landroidx/lifecycle/MutableLiveData;", "forceLoginUsingUsernameAndPassword", "", "getForceLoginUsingUsernameAndPassword", "goToSmsValidationEvent", "Lorg/linphone/utils/Event;", "getGoToSmsValidationEvent", "goToSmsValidationEvent$delegate", "Lkotlin/Lazy;", "invalidCredentialsEvent", "getInvalidCredentialsEvent", "invalidCredentialsEvent$delegate", "leaveAssistantEvent", "getLeaveAssistantEvent", "leaveAssistantEvent$delegate", "listener", "Lorg/linphone/core/AccountCreatorListenerStub;", "loginEnabled", "Landroidx/lifecycle/MediatorLiveData;", "getLoginEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "loginWithUsernamePassword", "getLoginWithUsernamePassword", "onErrorEvent", "getOnErrorEvent", "onErrorEvent$delegate", "password", "getPassword", "passwordError", "getPasswordError", "username", "getUsername", "usernameError", "getUsernameError", "waitForServerAnswer", "getWaitForServerAnswer", "continueEvenIfInvalidCredentials", "", "createAccountAndAuthInfo", "isLoginButtonEnabled", "login", "loginWithPhoneNumber", "loginWithUsername", "onCleared", "onFlexiApiTokenReceived", "onFlexiApiTokenRequestError", "removeInvalidProxyConfig", "app_debug"})
public final class AccountLoginViewModel extends org.linphone.activities.assistant.viewmodels.AbstractPhoneViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loginWithUsernamePassword = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> usernameError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> passwordError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> loginEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForServerAnswer = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> displayName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> forceLoginUsingUsernameAndPassword = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy leaveAssistantEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy invalidCredentialsEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy goToSmsValidationEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy onErrorEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.AccountCreatorListenerStub listener = null;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.Account accountToCheck;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub coreListener = null;
    
    public AccountLoginViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.AccountCreator accountCreator) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoginWithUsernamePassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUsernameError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPasswordError() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getForceLoginUsingUsernameAndPassword() {
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
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToSmsValidationEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getOnErrorEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    @java.lang.Override
    public void onFlexiApiTokenReceived() {
    }
    
    @java.lang.Override
    public void onFlexiApiTokenRequestError() {
    }
    
    public final void removeInvalidProxyConfig() {
    }
    
    public final void continueEvenIfInvalidCredentials() {
    }
    
    private final void loginWithUsername() {
    }
    
    private final void loginWithPhoneNumber() {
    }
    
    public final void login() {
    }
    
    private final boolean isLoginButtonEnabled() {
        return false;
    }
    
    private final boolean createAccountAndAuthInfo() {
        return false;
    }
}