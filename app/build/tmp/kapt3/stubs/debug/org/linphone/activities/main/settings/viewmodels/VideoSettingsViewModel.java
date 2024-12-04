package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010;\u001a\u00020<J\b\u0010=\u001a\u00020<H\u0002J\b\u0010>\u001a\u00020<H\u0002J\b\u0010?\u001a\u00020<H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0011\u0010\u001f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000bR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0007R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u001d\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0011\u0010&\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u000bR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0011\u0010*\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000bR\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0007R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0007R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0007R\u0011\u00103\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u000bR\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007R\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0007R\u0011\u00109\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u000b\u00a8\u0006@"}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/VideoSettingsViewModel;", "Lorg/linphone/activities/main/settings/viewmodels/GenericSettingsViewModel;", "()V", "autoAccept", "Landroidx/lifecycle/MutableLiveData;", "", "getAutoAccept", "()Landroidx/lifecycle/MutableLiveData;", "autoAcceptListener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "getAutoAcceptListener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "bandwidthLimit", "", "getBandwidthLimit", "bandwidthLimitListener", "getBandwidthLimitListener", "cameraDeviceIndex", "getCameraDeviceIndex", "cameraDeviceLabels", "Ljava/util/ArrayList;", "", "getCameraDeviceLabels", "cameraDeviceListener", "getCameraDeviceListener", "enableVideo", "getEnableVideo", "enableVideoListener", "getEnableVideoListener", "initiateCall", "getInitiateCall", "initiateCallListener", "getInitiateCallListener", "isTablet", "preferredFpsIndex", "getPreferredFpsIndex", "preferredFpsLabels", "getPreferredFpsLabels", "preferredFpsListener", "getPreferredFpsListener", "tabletPreview", "getTabletPreview", "tabletPreviewListener", "getTabletPreviewListener", "videoCodecs", "Landroidx/databinding/ViewDataBinding;", "getVideoCodecs", "videoPresetIndex", "getVideoPresetIndex", "videoPresetLabels", "getVideoPresetLabels", "videoPresetListener", "getVideoPresetListener", "videoSizeIndex", "getVideoSizeIndex", "videoSizeLabels", "getVideoSizeLabels", "videoSizeListener", "getVideoSizeListener", "initCameraDevicesList", "", "initFpsList", "initVideoPresetList", "initVideoSizeList", "app_debug"})
public final class VideoSettingsViewModel extends org.linphone.activities.main.settings.viewmodels.GenericSettingsViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub enableVideoListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> enableVideo = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub tabletPreviewListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> tabletPreview = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTablet = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub initiateCallListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> initiateCall = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub autoAcceptListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> autoAccept = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub cameraDeviceListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> cameraDeviceIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> cameraDeviceLabels = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub videoSizeListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> videoSizeIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> videoSizeLabels = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub videoPresetListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> videoPresetIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> videoPresetLabels = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub preferredFpsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> preferredFpsIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> preferredFpsLabels = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub bandwidthLimitListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> bandwidthLimit = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>> videoCodecs = null;
    
    public VideoSettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getEnableVideoListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEnableVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getTabletPreviewListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTabletPreview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isTablet() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getInitiateCallListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getInitiateCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAutoAcceptListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAutoAccept() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getCameraDeviceListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCameraDeviceIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getCameraDeviceLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getVideoSizeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getVideoSizeIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getVideoSizeLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getVideoPresetListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getVideoPresetIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getVideoPresetLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getPreferredFpsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getPreferredFpsIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getPreferredFpsLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getBandwidthLimitListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getBandwidthLimit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>> getVideoCodecs() {
        return null;
    }
    
    public final void initCameraDevicesList() {
    }
    
    private final void initVideoSizeList() {
    }
    
    private final void initVideoPresetList() {
    }
    
    private final void initFpsList() {
    }
}