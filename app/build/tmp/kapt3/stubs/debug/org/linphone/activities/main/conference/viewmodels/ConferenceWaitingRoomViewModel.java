package org.linphone.activities.main.conference.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010C\u001a\u00020DJ\u0006\u0010E\u001a\u00020DJ\u0006\u0010F\u001a\u00020DJ\u0010\u0010G\u001a\u00020D2\b\u0010H\u001a\u0004\u0018\u00010\u0006J\b\u0010I\u001a\u00020\fH\u0002J\b\u0010J\u001a\u00020DH\u0002J\b\u0010K\u001a\u00020DH\u0014J\u0006\u0010L\u001a\u00020DJ\u0006\u0010M\u001a\u00020DJ\u0006\u0010N\u001a\u00020DJ\u0006\u0010O\u001a\u00020DJ\u0006\u0010P\u001a\u00020DJ\u0006\u0010Q\u001a\u00020DJ\u0006\u0010R\u001a\u00020DJ\u0006\u0010S\u001a\u00020DJ\u0006\u0010T\u001a\u00020DJ\u0006\u0010U\u001a\u00020DJ\u0006\u0010V\u001a\u00020DJ\u0006\u0010W\u001a\u00020DJ\u0006\u0010X\u001a\u00020DJ\b\u0010Y\u001a\u00020DH\u0002J\b\u0010Z\u001a\u00020DH\u0002J\b\u0010[\u001a\u00020DH\u0002J\b\u0010\\\u001a\u00020DH\u0002R\'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\bR\u001b\u0010\u001d\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00140\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR\u0011\u0010\"\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\bR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\bR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\bR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\bR\'\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b/\u0010\n\u001a\u0004\b.\u0010\bR\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\bR\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\bR\'\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010\n\u001a\u0004\b5\u0010\bR\u000e\u00107\u001a\u000208X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010\n\u001a\u0004\b:\u0010\bR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\bR\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020?0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\bR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\b\u00a8\u0006]"}, d2 = {"Lorg/linphone/activities/main/conference/viewmodels/ConferenceWaitingRoomViewModel;", "Lorg/linphone/activities/main/viewmodels/MessageNotifierViewModel;", "()V", "askPermissionEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getAskPermissionEvent", "()Landroidx/lifecycle/MutableLiveData;", "askPermissionEvent$delegate", "Lkotlin/Lazy;", "audioRoutesEnabled", "", "getAudioRoutesEnabled", "audioRoutesMenuAnimator", "Landroid/animation/ValueAnimator;", "getAudioRoutesMenuAnimator", "()Landroid/animation/ValueAnimator;", "audioRoutesMenuAnimator$delegate", "audioRoutesMenuTranslateY", "", "getAudioRoutesMenuTranslateY", "audioRoutesSelected", "getAudioRoutesSelected", "callParams", "Lorg/linphone/core/CallParams;", "cancelConferenceJoiningEvent", "getCancelConferenceJoiningEvent", "cancelConferenceJoiningEvent$delegate", "conferenceLayoutMenuAnimator", "getConferenceLayoutMenuAnimator", "conferenceLayoutMenuAnimator$delegate", "conferenceLayoutMenuTranslateY", "getConferenceLayoutMenuTranslateY", "hideVideo", "getHideVideo", "()Z", "isBluetoothHeadsetSelected", "isConferenceBroadcastWithListenerRole", "isLowBandwidth", "isMicrophoneMuted", "isSpeakerSelected", "isSwitchCameraAvailable", "isVideoAvailable", "isVideoEnabled", "joinConferenceEvent", "getJoinConferenceEvent", "joinConferenceEvent$delegate", "joinInProgress", "getJoinInProgress", "layoutMenuSelected", "getLayoutMenuSelected", "leaveWaitingRoomEvent", "getLeaveWaitingRoomEvent", "leaveWaitingRoomEvent$delegate", "listener", "Lorg/linphone/core/CoreListenerStub;", "networkNotReachableEvent", "getNetworkNotReachableEvent", "networkNotReachableEvent$delegate", "networkReachable", "getNetworkReachable", "selectedLayout", "Lorg/linphone/activities/voip/ConferenceDisplayMode;", "getSelectedLayout", "subject", "getSubject", "cancel", "", "enableMic", "enableVideo", "findConferenceInfoByAddress", "stringAddress", "isVideoAvailableInCore", "onAudioDevicesListUpdated", "onCleared", "setActiveSpeakerLayout", "setAudioOnlyLayout", "setBluetoothAudioRoute", "setEarpieceAudioRoute", "setMosaicLayout", "setSpeakerAudioRoute", "start", "switchCamera", "toggleAudioRoutesMenu", "toggleLayoutMenu", "toggleMuteMicrophone", "toggleSpeaker", "toggleVideo", "updateAudioRouteState", "updateLayout", "updateMicState", "updateVideoState", "app_debug"})
public final class ConferenceWaitingRoomViewModel extends org.linphone.activities.main.viewmodels.MessageNotifierViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> subject = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMicrophoneMuted = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> audioRoutesEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> audioRoutesSelected = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSpeakerSelected = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isBluetoothHeadsetSelected = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> layoutMenuSelected = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> selectedLayout = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSwitchCameraAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLowBandwidth = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> joinInProgress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> networkReachable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConferenceBroadcastWithListenerRole = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy askPermissionEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy cancelConferenceJoiningEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy joinConferenceEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy leaveWaitingRoomEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy networkNotReachableEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Float> audioRoutesMenuTranslateY = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy audioRoutesMenuAnimator$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Float> conferenceLayoutMenuTranslateY = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy conferenceLayoutMenuAnimator$delegate = null;
    private final boolean hideVideo = false;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CallParams callParams = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public ConferenceWaitingRoomViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMicrophoneMuted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAudioRoutesEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAudioRoutesSelected() {
        return null;
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
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLayoutMenuSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> getSelectedLayout() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSwitchCameraAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLowBandwidth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getJoinInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNetworkReachable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConferenceBroadcastWithListenerRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getAskPermissionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getCancelConferenceJoiningEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.CallParams>> getJoinConferenceEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getLeaveWaitingRoomEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getNetworkNotReachableEvent() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.Float> getConferenceLayoutMenuTranslateY() {
        return null;
    }
    
    private final android.animation.ValueAnimator getConferenceLayoutMenuAnimator() {
        return null;
    }
    
    public final boolean getHideVideo() {
        return false;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void findConferenceInfoByAddress(@org.jetbrains.annotations.Nullable
    java.lang.String stringAddress) {
    }
    
    public final void cancel() {
    }
    
    public final void start() {
    }
    
    public final void toggleMuteMicrophone() {
    }
    
    public final void enableMic() {
    }
    
    public final void toggleSpeaker() {
    }
    
    public final void toggleAudioRoutesMenu() {
    }
    
    public final void setBluetoothAudioRoute() {
    }
    
    public final void setSpeakerAudioRoute() {
    }
    
    public final void setEarpieceAudioRoute() {
    }
    
    public final void toggleLayoutMenu() {
    }
    
    public final void setMosaicLayout() {
    }
    
    public final void setActiveSpeakerLayout() {
    }
    
    public final void setAudioOnlyLayout() {
    }
    
    public final void toggleVideo() {
    }
    
    public final void enableVideo() {
    }
    
    public final void switchCamera() {
    }
    
    private final void updateMicState() {
    }
    
    private final void onAudioDevicesListUpdated() {
    }
    
    private final void updateAudioRouteState() {
    }
    
    private final void updateLayout() {
    }
    
    private final void updateVideoState() {
    }
    
    private final boolean isVideoAvailableInCore() {
        return false;
    }
}