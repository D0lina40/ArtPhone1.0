package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/SharedAssistantViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "accountCreator", "Lorg/linphone/core/AccountCreator;", "remoteProvisioningUrl", "Landroidx/lifecycle/MutableLiveData;", "", "getRemoteProvisioningUrl", "()Landroidx/lifecycle/MutableLiveData;", "useGenericSipAccount", "", "getAccountCreator", "genericAccountCreator", "app_debug"})
public final class SharedAssistantViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> remoteProvisioningUrl = null;
    @org.jetbrains.annotations.NotNull
    private org.linphone.core.AccountCreator accountCreator;
    private boolean useGenericSipAccount = false;
    
    public SharedAssistantViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRemoteProvisioningUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.AccountCreator getAccountCreator(boolean genericAccountCreator) {
        return null;
    }
}