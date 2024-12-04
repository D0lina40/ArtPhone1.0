package org.linphone.activities.voip.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\f\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010`\u001a\u00020aJ\b\u0010\u000b\u001a\u00020aH\u0002J\u0006\u0010b\u001a\u00020aJ\u0006\u0010c\u001a\u00020aJ\u0006\u0010d\u001a\u00020aJ\u0006\u0010e\u001a\u00020aJ\u0006\u0010f\u001a\u00020aJ\u0006\u0010g\u001a\u00020aJ\u0006\u0010h\u001a\u00020aJ\b\u0010i\u001a\u00020aH\u0002J\u0006\u0010j\u001a\u00020aJ\u000e\u0010k\u001a\u00020a2\u0006\u0010l\u001a\u00020mJ\u0006\u0010n\u001a\u00020aJ\u0006\u0010o\u001a\u00020aJ\u000e\u0010p\u001a\u00020a2\u0006\u0010q\u001a\u00020\fJ\u0006\u0010r\u001a\u00020aJ\b\u0010s\u001a\u00020aH\u0014J\b\u0010t\u001a\u00020\fH\u0002J\u0010\u0010u\u001a\u00020a2\b\b\u0002\u0010q\u001a\u00020\fJ\u0006\u0010v\u001a\u00020aJ\u0006\u0010w\u001a\u00020aJ\u0006\u0010x\u001a\u00020aJ\u0006\u0010y\u001a\u00020aJ\u0006\u0010z\u001a\u00020aJ\u0006\u0010{\u001a\u00020aJ\u0006\u0010|\u001a\u00020aJ\u0006\u0010}\u001a\u00020aJ\u0006\u0010~\u001a\u00020aJ\b\u0010\u007f\u001a\u00020aH\u0002J\t\u0010\u0080\u0001\u001a\u00020aH\u0002J\t\u0010\u0081\u0001\u001a\u00020aH\u0002J\t\u0010\u0082\u0001\u001a\u00020aH\u0002J\t\u0010\u0083\u0001\u001a\u00020aH\u0002J\t\u0010\u0084\u0001\u001a\u00020aH\u0002R\'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u001b\u0010\u001a\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\bR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u001b\u0010\'\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\n\u001a\u0004\b(\u0010\u0013R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\bR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\bR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\bR\u0017\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\bR\'\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b6\u0010\bR\'\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\n\u001a\u0004\b9\u0010\bR\'\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\n\u001a\u0004\b<\u0010\bR\'\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b@\u0010\n\u001a\u0004\b?\u0010\bR\'\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bC\u0010\n\u001a\u0004\bB\u0010\bR\u0011\u0010D\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\bR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\bR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\bR\u0017\u0010J\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\bR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010\bR\u0017\u0010L\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\bR\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010\bR\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\bR\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010\bR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\bR\u000e\u0010Q\u001a\u00020RX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010S\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010T\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010\bR\u0017\u0010V\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010\bR\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020\f0Y\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010\bR\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010\b\u00a8\u0006\u0085\u0001"}, d2 = {"Lorg/linphone/activities/voip/viewmodels/ControlsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "askPermissionEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getAskPermissionEvent", "()Landroidx/lifecycle/MutableLiveData;", "askPermissionEvent$delegate", "Lkotlin/Lazy;", "attendedTransfer", "", "getAttendedTransfer", "audioRoutesEnabled", "getAudioRoutesEnabled", "audioRoutesMenuAnimator", "Landroid/animation/ValueAnimator;", "getAudioRoutesMenuAnimator", "()Landroid/animation/ValueAnimator;", "audioRoutesMenuAnimator$delegate", "audioRoutesMenuTranslateY", "", "getAudioRoutesMenuTranslateY", "audioRoutesSelected", "getAudioRoutesSelected", "bounceAnimator", "getBounceAnimator", "bounceAnimator$delegate", "bouncyCounterTranslateY", "getBouncyCounterTranslateY", "callStatsVisible", "getCallStatsVisible", "chatDisabled", "getChatDisabled", "chatRoomCreationInProgress", "getChatRoomCreationInProgress", "dtmfHistory", "getDtmfHistory", "extraButtonsMenuAnimator", "getExtraButtonsMenuAnimator", "extraButtonsMenuAnimator$delegate", "extraButtonsMenuTranslateY", "getExtraButtonsMenuTranslateY", "folded", "getFolded", "foldingState", "Landroidx/window/layout/FoldingFeature;", "getFoldingState", "forceDisableProximitySensor", "getForceDisableProximitySensor", "fullScreenMode", "getFullScreenMode", "goToCallsListEvent", "getGoToCallsListEvent", "goToCallsListEvent$delegate", "goToChatEvent", "getGoToChatEvent", "goToChatEvent$delegate", "goToConferenceLayoutSettingsEvent", "getGoToConferenceLayoutSettingsEvent", "goToConferenceLayoutSettingsEvent$delegate", "goToConferenceParticipantsListEvent", "getGoToConferenceParticipantsListEvent", "goToConferenceParticipantsListEvent$delegate", "goToDialerEvent", "getGoToDialerEvent", "goToDialerEvent$delegate", "hideVideo", "getHideVideo", "()Z", "isBluetoothHeadsetSelected", "isIncomingCallVideo", "isIncomingEarlyMediaVideo", "isOutgoingEarlyMedia", "isSendingVideo", "isSpeakerSelected", "isSwitchCameraAvailable", "isVideoAvailable", "isVideoEnabled", "isVideoUpdateInProgress", "listener", "Lorg/linphone/core/CoreListenerStub;", "nonEarpieceOutputAudioDevice", "numpadVisible", "getNumpadVisible", "pipMode", "getPipMode", "proximitySensorEnabled", "Landroidx/lifecycle/MediatorLiveData;", "getProximitySensorEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "showExtras", "getShowExtras", "showTakeSnapshotButton", "getShowTakeSnapshotButton", "answer", "", "forceBluetoothAudioRoute", "forceEarpieceAudioRoute", "forceSpeakerAudioRoute", "goToCallsList", "goToChat", "goToConferenceLayout", "goToConferenceParticipantsList", "goToDialerForCallTransfer", "goToDialerForNewCall", "handleDtmfClick", "key", "", "hangUp", "hideCallStats", "hideExtraButtons", "skipAnimation", "hideNumpad", "onCleared", "shouldProximitySensorBeEnabled", "showCallStats", "showExtraButtons", "showNumpad", "switchCamera", "takeSnapshot", "toggleFullScreen", "toggleRoutesMenu", "toggleSpeaker", "toggleVideo", "transferCall", "updateAudioRoutesState", "updateBluetoothHeadsetState", "updateSpeakerState", "updateUI", "updateVideoAvailable", "updateVideoEnabled", "app_debug"})
public final class ControlsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSpeakerSelected = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isBluetoothHeadsetSelected = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> audioRoutesSelected = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> audioRoutesEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSendingVideo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoUpdateInProgress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSwitchCameraAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOutgoingEarlyMedia = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isIncomingEarlyMediaVideo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isIncomingCallVideo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showExtras = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> fullScreenMode = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> folded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> pipMode = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatRoomCreationInProgress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> numpadVisible = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> dtmfHistory = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> callStatsVisible = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> proximitySensorEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> forceDisableProximitySensor = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showTakeSnapshotButton = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> attendedTransfer = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatDisabled = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy goToConferenceParticipantsListEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy goToChatEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy goToCallsListEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy goToConferenceLayoutSettingsEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy askPermissionEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy goToDialerEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<androidx.window.layout.FoldingFeature> foldingState = null;
    private final boolean hideVideo = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> nonEarpieceOutputAudioDevice = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Float> extraButtonsMenuTranslateY = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy extraButtonsMenuAnimator$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Float> audioRoutesMenuTranslateY = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy audioRoutesMenuAnimator$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Float> bouncyCounterTranslateY = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy bounceAnimator$delegate = null;
    
    public ControlsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSpeakerSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isBluetoothHeadsetSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAudioRoutesSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAudioRoutesEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSendingVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoUpdateInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSwitchCameraAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOutgoingEarlyMedia() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isIncomingEarlyMediaVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isIncomingCallVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowExtras() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFullScreenMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFolded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPipMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getChatRoomCreationInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNumpadVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDtmfHistory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCallStatsVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getProximitySensorEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getForceDisableProximitySensor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowTakeSnapshotButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAttendedTransfer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getChatDisabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToConferenceParticipantsListEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToChatEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToCallsListEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToConferenceLayoutSettingsEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getAskPermissionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToDialerEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<androidx.window.layout.FoldingFeature> getFoldingState() {
        return null;
    }
    
    public final boolean getHideVideo() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Float> getExtraButtonsMenuTranslateY() {
        return null;
    }
    
    private final android.animation.ValueAnimator getExtraButtonsMenuAnimator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Float> getAudioRoutesMenuTranslateY() {
        return null;
    }
    
    private final android.animation.ValueAnimator getAudioRoutesMenuAnimator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Float> getBouncyCounterTranslateY() {
        return null;
    }
    
    private final android.animation.ValueAnimator getBounceAnimator() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void hangUp() {
    }
    
    public final void answer() {
    }
    
    public final void toggleSpeaker() {
    }
    
    public final void toggleRoutesMenu() {
    }
    
    public final void forceEarpieceAudioRoute() {
    }
    
    public final void forceSpeakerAudioRoute() {
    }
    
    public final void forceBluetoothAudioRoute() {
    }
    
    public final void toggleVideo() {
    }
    
    public final void switchCamera() {
    }
    
    public final void takeSnapshot() {
    }
    
    public final void showExtraButtons() {
    }
    
    public final void hideExtraButtons(boolean skipAnimation) {
    }
    
    public final void toggleFullScreen() {
    }
    
    public final void goToConferenceParticipantsList() {
    }
    
    public final void goToChat() {
    }
    
    public final void showNumpad() {
    }
    
    public final void hideNumpad() {
    }
    
    public final void handleDtmfClick(char key) {
    }
    
    public final void goToCallsList() {
    }
    
    public final void showCallStats(boolean skipAnimation) {
    }
    
    public final void hideCallStats() {
    }
    
    public final void goToConferenceLayout() {
    }
    
    public final void transferCall() {
    }
    
    private final void attendedTransfer() {
    }
    
    private final void goToDialerForCallTransfer() {
    }
    
    public final void goToDialerForNewCall() {
    }
    
    private final void updateUI() {
    }
    
    private final void updateSpeakerState() {
    }
    
    private final void updateBluetoothHeadsetState() {
    }
    
    private final void updateAudioRoutesState() {
    }
    
    private final void updateVideoAvailable() {
    }
    
    private final void updateVideoEnabled() {
    }
    
    private final boolean shouldProximitySensorBeEnabled() {
        return false;
    }
}