package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\bH\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010v\u001a\u00020wH\u0002J\b\u0010x\u001a\u00020wH\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0007R\u0011\u0010\u0013\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u0011\u0010\u0015\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0007R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000bR\u0011\u0010\u001d\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0007R\u0011\u0010#\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000bR\'\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050&0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\'\u0010\u0007R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u001d\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0011\u00100\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000bR\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u0011\u00104\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u000bR\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u00110-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050&0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\u0007R\u0011\u00109\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u000bR\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\u0007R\u0011\u0010=\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u000bR\u0017\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\u0007R\u0011\u0010A\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u000bR\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0007R\u0011\u0010E\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u000bR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0007R\u0011\u0010I\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u000bR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0007R\u0011\u0010M\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\u000bR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\u0007R\u0011\u0010Q\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\u000bR\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0007R\u0011\u0010U\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\u000bR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0007R\u001d\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0-0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0007R\u0011\u0010[\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u000bR\u0014\u0010]\u001a\b\u0012\u0004\u0012\u00020.0-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010\u0007R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010\u0007R\u0011\u0010b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010\u000bR\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010\u0007R\u001d\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050&0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010\u0007R\u0011\u0010h\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010\u000bR\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010\u0007R\u0011\u0010l\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010\u000bR\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010\u0007R\u0011\u0010p\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010\u000bR\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020.0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010\u0007R\u0011\u0010t\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010\u000b\u00a8\u0006y"}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/CallSettingsViewModel;", "Lorg/linphone/activities/main/settings/viewmodels/GenericSettingsViewModel;", "()V", "acceptEarlyMedia", "Landroidx/lifecycle/MutableLiveData;", "", "getAcceptEarlyMedia", "()Landroidx/lifecycle/MutableLiveData;", "acceptEarlyMediaListener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "getAcceptEarlyMediaListener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "api29OrHigher", "getApi29OrHigher", "autoAnswer", "getAutoAnswer", "autoAnswerDelay", "", "getAutoAnswerDelay", "autoAnswerDelayListener", "getAutoAnswerDelayListener", "autoAnswerListener", "getAutoAnswerListener", "autoStart", "getAutoStart", "autoStartCallRecording", "getAutoStartCallRecording", "autoStartCallRecordingListener", "getAutoStartCallRecordingListener", "autoStartListener", "getAutoStartListener", "canVibrate", "getCanVibrate", "deviceRingtone", "getDeviceRingtone", "deviceRingtoneListener", "getDeviceRingtoneListener", "enableTelecomManagerEvent", "Lorg/linphone/utils/Event;", "getEnableTelecomManagerEvent", "enableTelecomManagerEvent$delegate", "Lkotlin/Lazy;", "encryptionIndex", "getEncryptionIndex", "encryptionLabels", "Ljava/util/ArrayList;", "", "getEncryptionLabels", "encryptionListener", "getEncryptionListener", "encryptionMandatory", "getEncryptionMandatory", "encryptionMandatoryListener", "getEncryptionMandatoryListener", "encryptionValues", "goToAndroidNotificationSettingsEvent", "getGoToAndroidNotificationSettingsEvent", "goToAndroidNotificationSettingsListener", "getGoToAndroidNotificationSettingsListener", "incomingTimeout", "getIncomingTimeout", "incomingTimeoutListener", "getIncomingTimeoutListener", "overlay", "getOverlay", "overlayListener", "getOverlayListener", "pauseCallsWhenAudioFocusIsLost", "getPauseCallsWhenAudioFocusIsLost", "pauseCallsWhenAudioFocusIsLostListener", "getPauseCallsWhenAudioFocusIsLostListener", "redirectToVoiceMailIncomingDeclinedCalls", "getRedirectToVoiceMailIncomingDeclinedCalls", "redirectToVoiceMailIncomingDeclinedCallsListener", "getRedirectToVoiceMailIncomingDeclinedCallsListener", "remoteCallRecording", "getRemoteCallRecording", "remoteCallRecordingListener", "getRemoteCallRecordingListener", "rfc2833Dtmf", "getRfc2833Dtmf", "rfc2833DtmfListener", "getRfc2833DtmfListener", "ringDuringEarlyMedia", "getRingDuringEarlyMedia", "ringDuringEarlyMediaListener", "getRingDuringEarlyMediaListener", "ringtoneIndex", "getRingtoneIndex", "ringtoneLabels", "getRingtoneLabels", "ringtoneListener", "getRingtoneListener", "ringtoneValues", "showRingtonesList", "getShowRingtonesList", "sipInfoDtmf", "getSipInfoDtmf", "sipInfoDtmfListener", "getSipInfoDtmfListener", "systemWideOverlay", "getSystemWideOverlay", "systemWideOverlayEnabledEvent", "getSystemWideOverlayEnabledEvent", "systemWideOverlayListener", "getSystemWideOverlayListener", "useTelecomManager", "getUseTelecomManager", "useTelecomManagerListener", "getUseTelecomManagerListener", "vibrateOnIncomingCall", "getVibrateOnIncomingCall", "vibrateOnIncomingCallListener", "getVibrateOnIncomingCallListener", "voiceMailUri", "getVoiceMailUri", "voiceMailUriListener", "getVoiceMailUriListener", "initEncryptionList", "", "initRingtonesList", "app_debug"})
public final class CallSettingsViewModel extends org.linphone.activities.main.settings.viewmodels.GenericSettingsViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub deviceRingtoneListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> deviceRingtone = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ringtoneListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> ringtoneIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ringtoneLabels = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.String> ringtoneValues = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showRingtonesList = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub vibrateOnIncomingCallListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> vibrateOnIncomingCall = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> canVibrate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub encryptionListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> encryptionIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> encryptionLabels = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.Integer> encryptionValues = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub encryptionMandatoryListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> encryptionMandatory = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub useTelecomManagerListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> useTelecomManager = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy enableTelecomManagerEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> api29OrHigher = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub overlayListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> overlay = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub systemWideOverlayListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> systemWideOverlay = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> systemWideOverlayEnabledEvent = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub sipInfoDtmfListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sipInfoDtmf = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub rfc2833DtmfListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> rfc2833Dtmf = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub autoStartCallRecordingListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> autoStartCallRecording = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub remoteCallRecordingListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> remoteCallRecording = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub autoStartListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> autoStart = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub autoAnswerListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> autoAnswer = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub autoAnswerDelayListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> autoAnswerDelay = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub incomingTimeoutListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> incomingTimeout = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub voiceMailUriListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> voiceMailUri = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub redirectToVoiceMailIncomingDeclinedCallsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> redirectToVoiceMailIncomingDeclinedCalls = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub acceptEarlyMediaListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> acceptEarlyMedia = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ringDuringEarlyMediaListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> ringDuringEarlyMedia = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub pauseCallsWhenAudioFocusIsLostListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> pauseCallsWhenAudioFocusIsLost = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub goToAndroidNotificationSettingsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> goToAndroidNotificationSettingsEvent = null;
    
    public CallSettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDeviceRingtoneListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDeviceRingtone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getRingtoneListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRingtoneIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getRingtoneLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowRingtonesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getVibrateOnIncomingCallListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getVibrateOnIncomingCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCanVibrate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getEncryptionListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getEncryptionIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getEncryptionLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getEncryptionMandatoryListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEncryptionMandatory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getUseTelecomManagerListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUseTelecomManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getEnableTelecomManagerEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getApi29OrHigher() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getOverlayListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOverlay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getSystemWideOverlayListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSystemWideOverlay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getSystemWideOverlayEnabledEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getSipInfoDtmfListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSipInfoDtmf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getRfc2833DtmfListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRfc2833Dtmf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAutoStartCallRecordingListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAutoStartCallRecording() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getRemoteCallRecordingListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRemoteCallRecording() {
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
    public final org.linphone.activities.main.settings.SettingListenerStub getAutoAnswerListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAutoAnswer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAutoAnswerDelayListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getAutoAnswerDelay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getIncomingTimeoutListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getIncomingTimeout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getVoiceMailUriListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getVoiceMailUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getRedirectToVoiceMailIncomingDeclinedCallsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRedirectToVoiceMailIncomingDeclinedCalls() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAcceptEarlyMediaListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAcceptEarlyMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getRingDuringEarlyMediaListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRingDuringEarlyMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getPauseCallsWhenAudioFocusIsLostListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPauseCallsWhenAudioFocusIsLost() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getGoToAndroidNotificationSettingsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToAndroidNotificationSettingsEvent() {
        return null;
    }
    
    private final void initRingtonesList() {
    }
    
    private final void initEncryptionList() {
    }
}