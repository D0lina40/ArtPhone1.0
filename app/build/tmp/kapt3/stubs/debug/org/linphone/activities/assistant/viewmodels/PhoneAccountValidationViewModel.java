package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001f\u001a\u00020\rH\u0002J\u0006\u0010 \u001a\u00020!J\b\u0010\"\u001a\u00020!H\u0014R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00110\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000bR\u0011\u0010\u0013\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\'\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000b\u00a8\u0006#"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/PhoneAccountValidationViewModel;", "Landroidx/lifecycle/ViewModel;", "accountCreator", "Lorg/linphone/core/AccountCreator;", "(Lorg/linphone/core/AccountCreator;)V", "getAccountCreator", "()Lorg/linphone/core/AccountCreator;", "code", "Landroidx/lifecycle/MutableLiveData;", "", "getCode", "()Landroidx/lifecycle/MutableLiveData;", "isCreation", "", "isLinking", "isLogin", "leaveAssistantEvent", "Lorg/linphone/utils/Event;", "getLeaveAssistantEvent", "listener", "Lorg/linphone/core/AccountCreatorListenerStub;", "getListener", "()Lorg/linphone/core/AccountCreatorListenerStub;", "onErrorEvent", "getOnErrorEvent", "onErrorEvent$delegate", "Lkotlin/Lazy;", "phoneNumber", "getPhoneNumber", "waitForServerAnswer", "getWaitForServerAnswer", "createAccountAndAuthInfo", "finish", "", "onCleared", "app_debug"})
public final class PhoneAccountValidationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.AccountCreator accountCreator = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> phoneNumber = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> code = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLogin = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isCreation = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLinking = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForServerAnswer = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> leaveAssistantEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy onErrorEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.AccountCreatorListenerStub listener = null;
    
    public PhoneAccountValidationViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.AccountCreator accountCreator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.AccountCreator getAccountCreator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isCreation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLinking() {
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
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getOnErrorEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.AccountCreatorListenerStub getListener() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void finish() {
    }
    
    private final boolean createAccountAndAuthInfo() {
        return false;
    }
}