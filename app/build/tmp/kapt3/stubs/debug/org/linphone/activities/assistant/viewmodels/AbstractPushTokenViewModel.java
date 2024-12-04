package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000eH&J\b\u0010\u0011\u001a\u00020\u000eH\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/AbstractPushTokenViewModel;", "Landroidx/lifecycle/ViewModel;", "accountCreator", "Lorg/linphone/core/AccountCreator;", "(Lorg/linphone/core/AccountCreator;)V", "getAccountCreator", "()Lorg/linphone/core/AccountCreator;", "coreListener", "Lorg/linphone/core/CoreListenerStub;", "waitForPushJob", "Lkotlinx/coroutines/Job;", "waitingForPushToken", "", "onCleared", "", "onFlexiApiTokenReceived", "onFlexiApiTokenRequestError", "requestFlexiApiToken", "app_debug"})
public abstract class AbstractPushTokenViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.AccountCreator accountCreator = null;
    private boolean waitingForPushToken = false;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job waitForPushJob;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub coreListener = null;
    
    public AbstractPushTokenViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.AccountCreator accountCreator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.AccountCreator getAccountCreator() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public abstract void onFlexiApiTokenReceived();
    
    public abstract void onFlexiApiTokenRequestError();
    
    protected final void requestFlexiApiToken() {
    }
}