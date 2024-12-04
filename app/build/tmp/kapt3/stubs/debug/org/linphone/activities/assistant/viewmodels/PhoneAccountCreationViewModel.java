package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020\"H\u0002J\u0006\u0010$\u001a\u00020\"J\b\u0010%\u001a\u00020\u0007H\u0002J\b\u0010&\u001a\u00020\"H\u0014J\b\u0010\'\u001a\u00020\"H\u0016J\b\u0010(\u001a\u00020\"H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\'\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000e\u00a8\u0006)"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/PhoneAccountCreationViewModel;", "Lorg/linphone/activities/assistant/viewmodels/AbstractPhoneViewModel;", "accountCreator", "Lorg/linphone/core/AccountCreator;", "(Lorg/linphone/core/AccountCreator;)V", "createEnabled", "Landroidx/lifecycle/MediatorLiveData;", "", "getCreateEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "displayName", "Landroidx/lifecycle/MutableLiveData;", "", "getDisplayName", "()Landroidx/lifecycle/MutableLiveData;", "goToSmsValidationEvent", "Lorg/linphone/utils/Event;", "getGoToSmsValidationEvent", "goToSmsValidationEvent$delegate", "Lkotlin/Lazy;", "listener", "Lorg/linphone/core/AccountCreatorListenerStub;", "onErrorEvent", "getOnErrorEvent", "onErrorEvent$delegate", "useUsername", "getUseUsername", "username", "getUsername", "usernameError", "getUsernameError", "waitForServerAnswer", "getWaitForServerAnswer", "checkPhoneNumber", "", "checkUsername", "create", "isCreateButtonEnabled", "onCleared", "onFlexiApiTokenReceived", "onFlexiApiTokenRequestError", "app_debug"})
public final class PhoneAccountCreationViewModel extends org.linphone.activities.assistant.viewmodels.AbstractPhoneViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> useUsername = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> usernameError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> displayName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> createEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForServerAnswer = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy goToSmsValidationEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy onErrorEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.AccountCreatorListenerStub listener = null;
    
    public PhoneAccountCreationViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.AccountCreator accountCreator) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUseUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUsernameError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getCreateEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWaitForServerAnswer() {
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
    
    private final void checkUsername() {
    }
    
    private final void checkPhoneNumber() {
    }
    
    public final void create() {
    }
    
    private final boolean isCreateButtonEnabled() {
        return false;
    }
}