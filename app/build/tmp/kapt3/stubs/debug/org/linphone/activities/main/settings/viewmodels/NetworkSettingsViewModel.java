package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/NetworkSettingsViewModel;", "Lorg/linphone/activities/main/settings/viewmodels/GenericSettingsViewModel;", "()V", "allowIpv6", "Landroidx/lifecycle/MutableLiveData;", "", "getAllowIpv6", "()Landroidx/lifecycle/MutableLiveData;", "allowIpv6Listener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "getAllowIpv6Listener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "randomPorts", "getRandomPorts", "randomPortsListener", "getRandomPortsListener", "sipPort", "", "getSipPort", "sipPortListener", "getSipPortListener", "wifiOnly", "getWifiOnly", "wifiOnlyListener", "getWifiOnlyListener", "getTransportPort", "setTransportPort", "", "port", "app_debug"})
public final class NetworkSettingsViewModel extends org.linphone.activities.main.settings.viewmodels.GenericSettingsViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub wifiOnlyListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> wifiOnly = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub allowIpv6Listener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> allowIpv6 = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub randomPortsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> randomPorts = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub sipPortListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> sipPort = null;
    
    public NetworkSettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getWifiOnlyListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWifiOnly() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAllowIpv6Listener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAllowIpv6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getRandomPortsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRandomPorts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getSipPortListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSipPort() {
        return null;
    }
    
    private final void setTransportPort(int port) {
    }
    
    private final int getTransportPort() {
        return 0;
    }
}