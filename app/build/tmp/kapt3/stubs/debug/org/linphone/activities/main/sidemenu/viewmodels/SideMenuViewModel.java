package org.linphone.activities.main.sidemenu.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010+\u001a\u00020,H\u0014J\u0006\u0010-\u001a\u00020,J\u000e\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020\u0010J\u0006\u00100\u001a\u00020,R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\bR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\bR\u0011\u0010\u001c\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010!\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010#\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010%\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0011\u0010)\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001e\u00a8\u00061"}, d2 = {"Lorg/linphone/activities/main/sidemenu/viewmodels/SideMenuViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "accounts", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/settings/viewmodels/AccountSettingsViewModel;", "getAccounts", "()Landroidx/lifecycle/MutableLiveData;", "accountsSettingsListener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "getAccountsSettingsListener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "setAccountsSettingsListener", "(Lorg/linphone/activities/main/settings/SettingListenerStub;)V", "defaultAccountAvatar", "", "getDefaultAccountAvatar", "defaultAccountFound", "", "getDefaultAccountFound", "defaultAccountViewModel", "getDefaultAccountViewModel", "listener", "Lorg/linphone/core/CoreListenerStub;", "presenceStatus", "Lorg/linphone/core/ConsolidatedPresence;", "getPresenceStatus", "showAbout", "getShowAbout", "()Z", "showAccounts", "getShowAccounts", "showAssistant", "getShowAssistant", "showQuit", "getShowQuit", "showRecordings", "getShowRecordings", "showScheduledConferences", "getShowScheduledConferences", "showSettings", "getShowSettings", "onCleared", "", "refreshConsolidatedPresence", "setPictureFromPath", "picturePath", "updateAccountsList", "app_debug"})
public final class SideMenuViewModel extends androidx.lifecycle.ViewModel {
    private final boolean showAccounts = false;
    private final boolean showAssistant = false;
    private final boolean showSettings = false;
    private final boolean showRecordings = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showScheduledConferences = null;
    private final boolean showAbout = false;
    private final boolean showQuit = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel> defaultAccountViewModel = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> defaultAccountFound = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> defaultAccountAvatar = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>> accounts = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> presenceStatus = null;
    public org.linphone.activities.main.settings.SettingListenerStub accountsSettingsListener;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public SideMenuViewModel() {
        super();
    }
    
    public final boolean getShowAccounts() {
        return false;
    }
    
    public final boolean getShowAssistant() {
        return false;
    }
    
    public final boolean getShowSettings() {
        return false;
    }
    
    public final boolean getShowRecordings() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowScheduledConferences() {
        return null;
    }
    
    public final boolean getShowAbout() {
        return false;
    }
    
    public final boolean getShowQuit() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel> getDefaultAccountViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDefaultAccountFound() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDefaultAccountAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>> getAccounts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> getPresenceStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAccountsSettingsListener() {
        return null;
    }
    
    public final void setAccountsSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void refreshConsolidatedPresence() {
    }
    
    public final void updateAccountsList() {
    }
    
    public final void setPictureFromPath(@org.jetbrains.annotations.NotNull
    java.lang.String picturePath) {
    }
}