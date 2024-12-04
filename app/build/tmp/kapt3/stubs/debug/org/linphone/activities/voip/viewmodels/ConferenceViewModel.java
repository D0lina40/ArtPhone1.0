package org.linphone.activities.voip.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010N\u001a\u00020OJ\u0018\u0010P\u001a\u00020O2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010Q\u001a\u00020RH\u0002J\u0016\u0010S\u001a\u00020O2\u0006\u0010T\u001a\u00020\u00172\u0006\u0010U\u001a\u00020\fJ\u000e\u0010V\u001a\u00020O2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010W\u001a\u00020O2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010X\u001a\u00020OH\u0014J\u0006\u0010Y\u001a\u00020OJ\u0010\u0010Z\u001a\u00020O2\u0006\u0010Q\u001a\u00020RH\u0002J\u0006\u0010[\u001a\u00020OJ&\u0010\\\u001a\u0012\u0012\u0004\u0012\u00020\u00060]j\b\u0012\u0004\u0012\u00020\u0006`^2\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0006\u0010`\u001a\u00020OJ\u0010\u0010a\u001a\u00020O2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010b\u001a\u00020OJ\u0010\u0010c\u001a\u00020O2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010d\u001a\u00020O2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010e\u001a\u00020O2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000eR\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00050\n\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000eR\'\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u0010\u001a\u0004\b#\u0010\u000eR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000eR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000eR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u000eR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000eR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000eR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u000eR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u000eR\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010.\u001a\u00020/\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u000eR\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u000eR\'\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b8\u0010\u0010\u001a\u0004\b7\u0010\u000eR\'\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010\u0010\u001a\u0004\b:\u0010\u000eR\'\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\u0010\u001a\u0004\b=\u0010\u000eR\'\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\u0010\u001a\u0004\b@\u0010\u000eR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00060\n\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\u000eR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\u000eR\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\u000eR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020I0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u000eR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u000eR\u000e\u0010M\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006f"}, d2 = {"Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "activeSpeakerConferenceParticipantDevices", "Landroidx/lifecycle/MediatorLiveData;", "", "Lorg/linphone/activities/voip/data/ConferenceParticipantDeviceData;", "getActiveSpeakerConferenceParticipantDevices", "()Landroidx/lifecycle/MediatorLiveData;", "allParticipantsLeftEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getAllParticipantsLeftEvent", "()Landroidx/lifecycle/MutableLiveData;", "allParticipantsLeftEvent$delegate", "Lkotlin/Lazy;", "conference", "Lorg/linphone/core/Conference;", "getConference", "conferenceCreationPending", "getConferenceCreationPending", "conferenceDisplayMode", "Lorg/linphone/activities/voip/ConferenceDisplayMode;", "getConferenceDisplayMode", "conferenceExists", "getConferenceExists", "conferenceListener", "Lorg/linphone/core/ConferenceListenerStub;", "conferenceParticipantDevices", "getConferenceParticipantDevices", "conferenceParticipants", "Lorg/linphone/activities/voip/data/ConferenceParticipantData;", "getConferenceParticipants", "firstToJoinEvent", "getFirstToJoinEvent", "firstToJoinEvent$delegate", "isBroadcast", "isConferenceLocallyPaused", "isMeAdmin", "isMeListenerOnly", "isRecording", "isRemotelyRecorded", "isVideoConference", "listener", "Lorg/linphone/core/CoreListenerStub;", "maxParticipantsForMosaicLayout", "", "getMaxParticipantsForMosaicLayout", "()I", "meParticipant", "getMeParticipant", "moreThanTwoParticipants", "getMoreThanTwoParticipants", "moreThanTwoParticipantsJoinedEvent", "getMoreThanTwoParticipantsJoinedEvent", "moreThanTwoParticipantsJoinedEvent$delegate", "participantAdminStatusChangedEvent", "getParticipantAdminStatusChangedEvent", "participantAdminStatusChangedEvent$delegate", "reloadConferenceFragmentEvent", "getReloadConferenceFragmentEvent", "reloadConferenceFragmentEvent$delegate", "secondParticipantJoinedEvent", "getSecondParticipantJoinedEvent", "secondParticipantJoinedEvent$delegate", "speakingParticipant", "getSpeakingParticipant", "speakingParticipantFound", "getSpeakingParticipantFound", "speakingParticipantVideoEnabled", "getSpeakingParticipantVideoEnabled", "subject", "", "getSubject", "twoOrMoreParticipants", "getTwoOrMoreParticipants", "waitForNextStreamsRunningToUpdateLayout", "addCallsToConference", "", "addParticipantDevice", "device", "Lorg/linphone/core/ParticipantDevice;", "changeLayout", "layout", "forceSendingVideo", "configureConference", "initConference", "onCleared", "pauseConference", "removeParticipantDevice", "resumeConference", "sortDevicesDataList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "devices", "switchLayoutFromAudioOnlyToActiveSpeaker", "terminateConference", "toggleRecording", "updateConferenceLayout", "updateParticipantsDevicesList", "updateParticipantsList", "app_debug"})
public final class ConferenceViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceExists = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> subject = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConferenceLocallyPaused = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoConference = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMeAdmin = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.Conference> conference = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceCreationPending = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantData>> conferenceParticipants = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> conferenceParticipantDevices = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> conferenceDisplayMode = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> activeSpeakerConferenceParticipantDevices = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRecording = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRemotelyRecorded = null;
    private final int maxParticipantsForMosaicLayout = 0;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> twoOrMoreParticipants = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> moreThanTwoParticipants = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> speakingParticipantFound = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> speakingParticipant = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> speakingParticipantVideoEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> meParticipant = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isBroadcast = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMeListenerOnly = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy participantAdminStatusChangedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy firstToJoinEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy allParticipantsLeftEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy secondParticipantJoinedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy moreThanTwoParticipantsJoinedEvent$delegate = null;
    private boolean waitForNextStreamsRunningToUpdateLayout = false;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy reloadConferenceFragmentEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ConferenceListenerStub conferenceListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public ConferenceViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getConferenceExists() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isConferenceLocallyPaused() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoConference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMeAdmin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.Conference> getConference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getConferenceCreationPending() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantData>> getConferenceParticipants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> getConferenceParticipantDevices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> getConferenceDisplayMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> getActiveSpeakerConferenceParticipantDevices() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRecording() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRemotelyRecorded() {
        return null;
    }
    
    public final int getMaxParticipantsForMosaicLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTwoOrMoreParticipants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMoreThanTwoParticipants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSpeakingParticipantFound() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> getSpeakingParticipant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSpeakingParticipantVideoEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> getMeParticipant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isBroadcast() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMeListenerOnly() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.activities.voip.data.ConferenceParticipantData>> getParticipantAdminStatusChangedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getFirstToJoinEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getAllParticipantsLeftEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getSecondParticipantJoinedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getMoreThanTwoParticipantsJoinedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getReloadConferenceFragmentEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void pauseConference() {
    }
    
    public final void resumeConference() {
    }
    
    public final void toggleRecording() {
    }
    
    public final void initConference(@org.jetbrains.annotations.NotNull
    org.linphone.core.Conference conference) {
    }
    
    public final void configureConference(@org.jetbrains.annotations.NotNull
    org.linphone.core.Conference conference) {
    }
    
    public final void addCallsToConference() {
    }
    
    public final void switchLayoutFromAudioOnlyToActiveSpeaker() {
    }
    
    public final void changeLayout(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.ConferenceDisplayMode layout, boolean forceSendingVideo) {
    }
    
    private final void updateConferenceLayout(org.linphone.core.Conference conference) {
    }
    
    private final void terminateConference(org.linphone.core.Conference conference) {
    }
    
    private final void updateParticipantsList(org.linphone.core.Conference conference) {
    }
    
    private final void updateParticipantsDevicesList(org.linphone.core.Conference conference) {
    }
    
    private final void addParticipantDevice(org.linphone.core.Conference conference, org.linphone.core.ParticipantDevice device) {
    }
    
    private final void removeParticipantDevice(org.linphone.core.ParticipantDevice device) {
    }
    
    private final java.util.ArrayList<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> sortDevicesDataList(java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> devices) {
        return null;
    }
}