package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n\u00a8\u0006\u001c"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/AbstractPhoneViewModel;", "Lorg/linphone/activities/assistant/viewmodels/AbstractPushTokenViewModel;", "Lorg/linphone/activities/assistant/fragments/CountryPickerFragment$CountryPickedListener;", "accountCreator", "Lorg/linphone/core/AccountCreator;", "(Lorg/linphone/core/AccountCreator;)V", "countryName", "Landroidx/lifecycle/MutableLiveData;", "", "getCountryName", "()Landroidx/lifecycle/MutableLiveData;", "phoneNumber", "getPhoneNumber", "phoneNumberError", "getPhoneNumberError", "prefix", "getPrefix", "prefixError", "getPrefixError", "getCountryNameFromPrefix", "", "isPhoneNumberOk", "", "onCountryClicked", "dialPlan", "Lorg/linphone/core/DialPlan;", "updateFromPhoneNumberAndOrDialPlan", "number", "app_debug"})
public abstract class AbstractPhoneViewModel extends org.linphone.activities.assistant.viewmodels.AbstractPushTokenViewModel implements org.linphone.activities.assistant.fragments.CountryPickerFragment.CountryPickedListener {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> prefix = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> prefixError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> phoneNumber = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> phoneNumberError = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> countryName = null;
    
    public AbstractPhoneViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.AccountCreator accountCreator) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrefixError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPhoneNumberError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCountryName() {
        return null;
    }
    
    @java.lang.Override
    public void onCountryClicked(@org.jetbrains.annotations.NotNull
    org.linphone.core.DialPlan dialPlan) {
    }
    
    public final boolean isPhoneNumberOk() {
        return false;
    }
    
    public final void updateFromPhoneNumberAndOrDialPlan(@org.jetbrains.annotations.Nullable
    java.lang.String number, @org.jetbrains.annotations.Nullable
    org.linphone.core.DialPlan dialPlan) {
    }
    
    public final void getCountryNameFromPrefix(@org.jetbrains.annotations.Nullable
    java.lang.String prefix) {
    }
}