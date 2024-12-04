package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010K\u001a\u00020LH\u0014J\u0006\u0010M\u001a\u00020LR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR\u001a\u0010\"\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\nR\u0011\u0010(\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\rR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020&0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\nR\u0011\u0010,\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\rR\u0011\u0010.\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u00102\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00101R\u0011\u00104\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0011\u00106\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0011\u00108\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0011\u0010:\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0011\u0010<\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0011\u0010>\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0011\u0010@\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0011\u0010B\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u000e\u0010D\u001a\u00020/X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\r\"\u0004\bG\u0010\u000fR\u001a\u0010H\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\r\"\u0004\bJ\u0010\u000f\u00a8\u0006N"}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "accountClickListener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "accounts", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/settings/viewmodels/AccountSettingsViewModel;", "getAccounts", "()Landroidx/lifecycle/MutableLiveData;", "accountsSettingsListener", "getAccountsSettingsListener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "setAccountsSettingsListener", "(Lorg/linphone/activities/main/settings/SettingListenerStub;)V", "advancedSettingsListener", "getAdvancedSettingsListener", "setAdvancedSettingsListener", "audioSettingsListener", "getAudioSettingsListener", "setAudioSettingsListener", "callSettingsListener", "getCallSettingsListener", "setCallSettingsListener", "chatSettingsListener", "getChatSettingsListener", "setChatSettingsListener", "conferencesSettingsListener", "getConferencesSettingsListener", "setConferencesSettingsListener", "contactsSettingsListener", "getContactsSettingsListener", "setContactsSettingsListener", "networkSettingsListener", "getNetworkSettingsListener", "setNetworkSettingsListener", "primaryAccountDisplayName", "", "getPrimaryAccountDisplayName", "primaryAccountDisplayNameListener", "getPrimaryAccountDisplayNameListener", "primaryAccountUsername", "getPrimaryAccountUsername", "primaryAccountUsernameListener", "getPrimaryAccountUsernameListener", "showAccountSettings", "", "getShowAccountSettings", "()Z", "showAdvancedSettings", "getShowAdvancedSettings", "showAudioSettings", "getShowAudioSettings", "showCallSettings", "getShowCallSettings", "showChatSettings", "getShowChatSettings", "showConferencesSettings", "getShowConferencesSettings", "showContactsSettings", "getShowContactsSettings", "showNetworkSettings", "getShowNetworkSettings", "showTunnelSettings", "getShowTunnelSettings", "showVideoSettings", "getShowVideoSettings", "tunnelAvailable", "tunnelSettingsListener", "getTunnelSettingsListener", "setTunnelSettingsListener", "videoSettingsListener", "getVideoSettingsListener", "setVideoSettingsListener", "onCleared", "", "updateAccountsList", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    private final boolean tunnelAvailable = false;
    private final boolean showAccountSettings = false;
    private final boolean showTunnelSettings = false;
    private final boolean showAudioSettings = false;
    private final boolean showVideoSettings = false;
    private final boolean showCallSettings = false;
    private final boolean showChatSettings = false;
    private final boolean showNetworkSettings = false;
    private final boolean showContactsSettings = false;
    private final boolean showAdvancedSettings = false;
    private final boolean showConferencesSettings = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>> accounts = null;
    @org.jetbrains.annotations.NotNull
    private org.linphone.activities.main.settings.SettingListenerStub accountClickListener;
    public org.linphone.activities.main.settings.SettingListenerStub accountsSettingsListener;
    public org.linphone.activities.main.settings.SettingListenerStub tunnelSettingsListener;
    public org.linphone.activities.main.settings.SettingListenerStub audioSettingsListener;
    public org.linphone.activities.main.settings.SettingListenerStub videoSettingsListener;
    public org.linphone.activities.main.settings.SettingListenerStub callSettingsListener;
    public org.linphone.activities.main.settings.SettingListenerStub chatSettingsListener;
    public org.linphone.activities.main.settings.SettingListenerStub networkSettingsListener;
    public org.linphone.activities.main.settings.SettingListenerStub contactsSettingsListener;
    public org.linphone.activities.main.settings.SettingListenerStub advancedSettingsListener;
    public org.linphone.activities.main.settings.SettingListenerStub conferencesSettingsListener;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub primaryAccountDisplayNameListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> primaryAccountDisplayName = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub primaryAccountUsernameListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> primaryAccountUsername = null;
    
    public SettingsViewModel() {
        super();
    }
    
    public final boolean getShowAccountSettings() {
        return false;
    }
    
    public final boolean getShowTunnelSettings() {
        return false;
    }
    
    public final boolean getShowAudioSettings() {
        return false;
    }
    
    public final boolean getShowVideoSettings() {
        return false;
    }
    
    public final boolean getShowCallSettings() {
        return false;
    }
    
    public final boolean getShowChatSettings() {
        return false;
    }
    
    public final boolean getShowNetworkSettings() {
        return false;
    }
    
    public final boolean getShowContactsSettings() {
        return false;
    }
    
    public final boolean getShowAdvancedSettings() {
        return false;
    }
    
    public final boolean getShowConferencesSettings() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>> getAccounts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAccountsSettingsListener() {
        return null;
    }
    
    public final void setAccountsSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getTunnelSettingsListener() {
        return null;
    }
    
    public final void setTunnelSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAudioSettingsListener() {
        return null;
    }
    
    public final void setAudioSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getVideoSettingsListener() {
        return null;
    }
    
    public final void setVideoSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getCallSettingsListener() {
        return null;
    }
    
    public final void setCallSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getChatSettingsListener() {
        return null;
    }
    
    public final void setChatSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getNetworkSettingsListener() {
        return null;
    }
    
    public final void setNetworkSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getContactsSettingsListener() {
        return null;
    }
    
    public final void setContactsSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAdvancedSettingsListener() {
        return null;
    }
    
    public final void setAdvancedSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getConferencesSettingsListener() {
        return null;
    }
    
    public final void setConferencesSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getPrimaryAccountDisplayNameListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrimaryAccountDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getPrimaryAccountUsernameListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrimaryAccountUsername() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void updateAccountsList() {
    }
}