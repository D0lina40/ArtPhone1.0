package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0019J\b\u0010U\u001a\u00020QH\u0002J\b\u0010V\u001a\u00020QH\u0002J\b\u0010W\u001a\u00020QH\u0002J\u0006\u0010X\u001a\u00020QJ\u0006\u0010Y\u001a\u00020QJ\u0006\u0010Z\u001a\u00020QR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\'\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0007R\'\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u0007R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u0011\u0010\u001e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u000bR\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\"\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000bR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0007R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0007R\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0007R\u0011\u0010*\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000bR\u001a\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00150\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0017\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0007R\u0011\u00105\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u000bR\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u00190\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0007R\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0007R\u0011\u0010;\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u000bR\u001a\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00150\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u0002030\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0007R\u0011\u0010@\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u000bR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\u0007R\u0011\u0010D\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\u000bR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\u0007R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0007R\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010\u0007R\u0011\u0010L\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010\u000bR\u0011\u0010N\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010\u000b\u00a8\u0006["}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/AudioSettingsViewModel;", "Lorg/linphone/activities/main/settings/viewmodels/GenericSettingsViewModel;", "()V", "adaptiveRateControl", "Landroidx/lifecycle/MutableLiveData;", "", "getAdaptiveRateControl", "()Landroidx/lifecycle/MutableLiveData;", "adaptiveRateControlListener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "getAdaptiveRateControlListener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "askAudioRecordPermissionForEchoCancellerCalibrationEvent", "Lorg/linphone/utils/Event;", "getAskAudioRecordPermissionForEchoCancellerCalibrationEvent", "askAudioRecordPermissionForEchoCancellerCalibrationEvent$delegate", "Lkotlin/Lazy;", "askAudioRecordPermissionForEchoTesterEvent", "getAskAudioRecordPermissionForEchoTesterEvent", "askAudioRecordPermissionForEchoTesterEvent$delegate", "audioCodecs", "Ljava/util/ArrayList;", "Landroidx/databinding/ViewDataBinding;", "getAudioCodecs", "codecBitrateIndex", "", "getCodecBitrateIndex", "codecBitrateLabels", "", "getCodecBitrateLabels", "codecBitrateListener", "getCodecBitrateListener", "codecBitrateValues", "echoTesterIsRunning", "echoTesterListener", "getEchoTesterListener", "echoTesterStatus", "getEchoTesterStatus", "inputAudioDeviceIndex", "getInputAudioDeviceIndex", "inputAudioDeviceLabels", "getInputAudioDeviceLabels", "inputAudioDeviceListener", "getInputAudioDeviceListener", "inputAudioDeviceValues", "Lorg/linphone/core/AudioDevice;", "listener", "Lorg/linphone/core/CoreListenerStub;", "getListener", "()Lorg/linphone/core/CoreListenerStub;", "microphoneGain", "", "getMicrophoneGain", "microphoneGainListener", "getMicrophoneGainListener", "outputAudioDeviceIndex", "getOutputAudioDeviceIndex", "outputAudioDeviceLabels", "getOutputAudioDeviceLabels", "outputAudioDeviceListener", "getOutputAudioDeviceListener", "outputAudioDeviceValues", "playbackGain", "getPlaybackGain", "playbackGainListener", "getPlaybackGainListener", "preferBluetoothDevices", "getPreferBluetoothDevices", "preferBluetoothDevicesListener", "getPreferBluetoothDevicesListener", "showEchoTester", "getShowEchoTester", "softwareEchoCalibration", "getSoftwareEchoCalibration", "softwareEchoCanceller", "getSoftwareEchoCanceller", "softwareEchoCancellerCalibrationListener", "getSoftwareEchoCancellerCalibrationListener", "softwareEchoCancellerListener", "getSoftwareEchoCancellerListener", "echoCancellerCalibrationFinished", "", "status", "Lorg/linphone/core/EcCalibratorStatus;", "delay", "initCodecBitrateList", "initInputAudioDevicesList", "initOutputAudioDevicesList", "startEchoCancellerCalibration", "startEchoTester", "stopEchoTester", "app_debug"})
public final class AudioSettingsViewModel extends org.linphone.activities.main.settings.viewmodels.GenericSettingsViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy askAudioRecordPermissionForEchoCancellerCalibrationEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy askAudioRecordPermissionForEchoTesterEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub softwareEchoCancellerListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> softwareEchoCanceller = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub softwareEchoCancellerCalibrationListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> softwareEchoCalibration = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub echoTesterListener = null;
    private boolean echoTesterIsRunning = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> echoTesterStatus = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showEchoTester = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub adaptiveRateControlListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> adaptiveRateControl = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub inputAudioDeviceListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> inputAudioDeviceIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> inputAudioDeviceLabels = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.AudioDevice>> inputAudioDeviceValues = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub outputAudioDeviceListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> outputAudioDeviceIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> outputAudioDeviceLabels = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.AudioDevice>> outputAudioDeviceValues = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub preferBluetoothDevicesListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> preferBluetoothDevices = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub codecBitrateListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> codecBitrateIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> codecBitrateLabels = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.Integer> codecBitrateValues = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub microphoneGainListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Float> microphoneGain = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub playbackGainListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Float> playbackGain = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>> audioCodecs = null;
    
    public AudioSettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getAskAudioRecordPermissionForEchoCancellerCalibrationEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getAskAudioRecordPermissionForEchoTesterEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getSoftwareEchoCancellerListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSoftwareEchoCanceller() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.CoreListenerStub getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getSoftwareEchoCancellerCalibrationListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSoftwareEchoCalibration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getEchoTesterListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEchoTesterStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowEchoTester() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAdaptiveRateControlListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAdaptiveRateControl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getInputAudioDeviceListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getInputAudioDeviceIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getInputAudioDeviceLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getOutputAudioDeviceListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getOutputAudioDeviceIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getOutputAudioDeviceLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getPreferBluetoothDevicesListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPreferBluetoothDevices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getCodecBitrateListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCodecBitrateIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getCodecBitrateLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getMicrophoneGainListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Float> getMicrophoneGain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getPlaybackGainListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Float> getPlaybackGain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>> getAudioCodecs() {
        return null;
    }
    
    public final void startEchoCancellerCalibration() {
    }
    
    public final void echoCancellerCalibrationFinished(@org.jetbrains.annotations.NotNull
    org.linphone.core.EcCalibratorStatus status, int delay) {
    }
    
    public final void startEchoTester() {
    }
    
    public final void stopEchoTester() {
    }
    
    private final void initInputAudioDevicesList() {
    }
    
    private final void initOutputAudioDevicesList() {
    }
    
    private final void initCodecBitrateList() {
    }
}