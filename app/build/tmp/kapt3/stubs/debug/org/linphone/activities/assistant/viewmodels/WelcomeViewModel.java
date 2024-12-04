package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/WelcomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "showCreateAccount", "", "getShowCreateAccount", "()Z", "showGenericLogin", "getShowGenericLogin", "showLinphoneLogin", "getShowLinphoneLogin", "showRemoteProvisioning", "getShowRemoteProvisioning", "termsAndPrivacyAccepted", "Landroidx/lifecycle/MutableLiveData;", "getTermsAndPrivacyAccepted", "()Landroidx/lifecycle/MutableLiveData;", "app_debug"})
public final class WelcomeViewModel extends androidx.lifecycle.ViewModel {
    private final boolean showCreateAccount = false;
    private final boolean showLinphoneLogin = false;
    private final boolean showGenericLogin = false;
    private final boolean showRemoteProvisioning = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> termsAndPrivacyAccepted = null;
    
    public WelcomeViewModel() {
        super();
    }
    
    public final boolean getShowCreateAccount() {
        return false;
    }
    
    public final boolean getShowLinphoneLogin() {
        return false;
    }
    
    public final boolean getShowGenericLogin() {
        return false;
    }
    
    public final boolean getShowRemoteProvisioning() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTermsAndPrivacyAccepted() {
        return null;
    }
}