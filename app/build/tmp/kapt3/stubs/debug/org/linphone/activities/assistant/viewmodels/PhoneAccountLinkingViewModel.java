package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001e\u001a\u00020\u0007H\u0002J\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020 H\u0014J\b\u0010\"\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020 H\u0016J\u0006\u0010$\u001a\u00020 R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000b0\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\t\u00a8\u0006%"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/PhoneAccountLinkingViewModel;", "Lorg/linphone/activities/assistant/viewmodels/AbstractPhoneViewModel;", "accountCreator", "Lorg/linphone/core/AccountCreator;", "(Lorg/linphone/core/AccountCreator;)V", "allowSkip", "Landroidx/lifecycle/MutableLiveData;", "", "getAllowSkip", "()Landroidx/lifecycle/MutableLiveData;", "goToSmsValidationEvent", "Lorg/linphone/utils/Event;", "getGoToSmsValidationEvent", "leaveAssistantEvent", "getLeaveAssistantEvent", "linkEnabled", "Landroidx/lifecycle/MediatorLiveData;", "getLinkEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "listener", "Lorg/linphone/core/AccountCreatorListenerStub;", "onErrorEvent", "", "getOnErrorEvent", "onErrorEvent$delegate", "Lkotlin/Lazy;", "username", "getUsername", "waitForServerAnswer", "getWaitForServerAnswer", "isLinkButtonEnabled", "link", "", "onCleared", "onFlexiApiTokenReceived", "onFlexiApiTokenRequestError", "skip", "app_debug"})
public final class PhoneAccountLinkingViewModel extends org.linphone.activities.assistant.viewmodels.AbstractPhoneViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> username = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> allowSkip = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> linkEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForServerAnswer = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> leaveAssistantEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> goToSmsValidationEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy onErrorEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.AccountCreatorListenerStub listener = null;
    
    public PhoneAccountLinkingViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.AccountCreator accountCreator) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAllowSkip() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getLinkEnabled() {
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
    
    public final void link() {
    }
    
    public final void skip() {
    }
    
    private final boolean isLinkButtonEnabled() {
        return false;
    }
}