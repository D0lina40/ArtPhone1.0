package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0007R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0011\u0010!\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000bR\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u000bR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0011\u0010*\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000bR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u0011\u0010.\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000bR\u001d\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0005010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0007R\u0011\u00103\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u000bR\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0005010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007R\u0011\u00107\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u000bR\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0005010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0007R\u0011\u0010;\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u000bR\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0007R\u0011\u0010?\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u000bR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0007R\u000e\u0010C\u001a\u00020DX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0007R\u0011\u0010G\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\u000bR\u0011\u0010I\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u000bR\u0011\u0010K\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u000bR\u001d\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0007R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0007R\u0011\u0010Q\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\u000b\u00a8\u0006S"}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/AdvancedSettingsViewModel;", "Lorg/linphone/activities/main/viewmodels/LogsUploadViewModel;", "()V", "animations", "Landroidx/lifecycle/MutableLiveData;", "", "getAnimations", "()Landroidx/lifecycle/MutableLiveData;", "animationsListener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "getAnimationsListener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "autoStart", "getAutoStart", "autoStartListener", "getAutoStartListener", "backgroundMode", "getBackgroundMode", "backgroundModeEnabled", "getBackgroundModeEnabled", "backgroundModeListener", "getBackgroundModeListener", "batterySettingsVisibility", "getBatterySettingsVisibility", "core", "Lorg/linphone/core/Core;", "darkModeIndex", "", "getDarkModeIndex", "darkModeLabels", "Ljava/util/ArrayList;", "", "getDarkModeLabels", "darkModeListener", "getDarkModeListener", "darkModeValues", "debugMode", "getDebugMode", "debugModeListener", "getDebugModeListener", "deviceName", "getDeviceName", "deviceNameListener", "getDeviceNameListener", "disableSecureFragment", "getDisableSecureFragment", "disableSecureFragmentListener", "getDisableSecureFragmentListener", "goToAndroidSettingsEvent", "Lorg/linphone/utils/Event;", "getGoToAndroidSettingsEvent", "goToAndroidSettingsListener", "getGoToAndroidSettingsListener", "goToBatterySettingsEvent", "getGoToBatterySettingsEvent", "goToBatterySettingsListener", "getGoToBatterySettingsListener", "goToPowerManagerSettingsEvent", "getGoToPowerManagerSettingsEvent", "goToPowerManagerSettingsListener", "getGoToPowerManagerSettingsListener", "logsServerUrl", "getLogsServerUrl", "logsServerUrlListener", "getLogsServerUrlListener", "powerManagerSettingsVisibility", "getPowerManagerSettingsVisibility", "prefs", "Lorg/linphone/core/CorePreferences;", "remoteProvisioningUrl", "getRemoteProvisioningUrl", "remoteProvisioningUrlListener", "getRemoteProvisioningUrlListener", "resetDebugLogsListener", "getResetDebugLogsListener", "sendDebugLogsListener", "getSendDebugLogsListener", "setNightModeEvent", "getSetNightModeEvent", "vfs", "getVfs", "vfsListener", "getVfsListener", "app_debug"})
public final class AdvancedSettingsViewModel extends org.linphone.activities.main.viewmodels.LogsUploadViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CorePreferences prefs = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Core core = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub debugModeListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> debugMode = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub logsServerUrlListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> logsServerUrl = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub sendDebugLogsListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub resetDebugLogsListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub backgroundModeListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> backgroundMode = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> backgroundModeEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub autoStartListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> autoStart = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub darkModeListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> darkModeIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> darkModeLabels = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.Integer> darkModeValues = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Integer>> setNightModeEvent = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub animationsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> animations = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub deviceNameListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> deviceName = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub remoteProvisioningUrlListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> remoteProvisioningUrl = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub vfsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> vfs = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub disableSecureFragmentListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> disableSecureFragment = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub goToBatterySettingsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> goToBatterySettingsEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> batterySettingsVisibility = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub goToPowerManagerSettingsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> goToPowerManagerSettingsEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> powerManagerSettingsVisibility = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub goToAndroidSettingsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> goToAndroidSettingsEvent = null;
    
    public AdvancedSettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDebugModeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDebugMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLogsServerUrlListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLogsServerUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getSendDebugLogsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getResetDebugLogsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getBackgroundModeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBackgroundMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBackgroundModeEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAutoStartListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAutoStart() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDarkModeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getDarkModeIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getDarkModeLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Integer>> getSetNightModeEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAnimationsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAnimations() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDeviceNameListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDeviceName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getRemoteProvisioningUrlListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRemoteProvisioningUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getVfsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getVfs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDisableSecureFragmentListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDisableSecureFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getGoToBatterySettingsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToBatterySettingsEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getBatterySettingsVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getGoToPowerManagerSettingsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToPowerManagerSettingsEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPowerManagerSettingsVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getGoToAndroidSettingsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToAndroidSettingsEvent() {
        return null;
    }
}