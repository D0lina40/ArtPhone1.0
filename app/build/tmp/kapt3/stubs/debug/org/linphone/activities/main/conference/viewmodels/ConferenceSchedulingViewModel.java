package org.linphone.activities.main.conference.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010U\u001a\u00020\fH\u0002J\u000e\u0010V\u001a\b\u0012\u0004\u0012\u00020\"0\'H\u0002J\u0006\u0010W\u001a\u00020XJ\u000e\u0010Y\u001a\b\u0012\u0004\u0012\u00020P0\'H\u0002J\u0006\u0010Z\u001a\u00020XJ\b\u0010[\u001a\u00020\u0019H\u0002J\u0006\u0010\\\u001a\u00020\fJ\b\u0010]\u001a\u00020XH\u0014J\u000e\u0010^\u001a\u00020X2\u0006\u0010_\u001a\u00020\tJ\u001c\u0010`\u001a\u00020X2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00050F2\u0006\u0010b\u001a\u00020\fJ\u000e\u0010c\u001a\u00020X2\u0006\u0010d\u001a\u00020\u0019J\u0016\u0010e\u001a\u00020X2\u0006\u0010f\u001a\u00020/2\u0006\u0010g\u001a\u00020/J\u0006\u0010h\u001a\u00020XJ\u000e\u0010i\u001a\u00020X2\u0006\u0010j\u001a\u00020\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0007R \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010%R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0\'\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0007R\u001a\u0010.\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0007R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007R\u000e\u00107\u001a\u000208X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00101\"\u0004\b;\u00103R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0007R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001f0\'\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\'0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0007R\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0007R\u001a\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050F0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\u0007R\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0007R\u001d\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\'0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u0007R\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0007R \u0010O\u001a\b\u0012\u0004\u0012\u00020P0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u0007\"\u0004\bR\u0010%R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020P0\'\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010)\u00a8\u0006k"}, d2 = {"Lorg/linphone/activities/main/conference/viewmodels/ConferenceSchedulingViewModel;", "Lorg/linphone/contact/ContactsSelectionViewModel;", "()V", "address", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/core/Address;", "getAddress", "()Landroidx/lifecycle/MutableLiveData;", "confInfo", "Lorg/linphone/core/ConferenceInfo;", "conferenceCreationCompletedEvent", "Lorg/linphone/utils/Event;", "", "getConferenceCreationCompletedEvent", "conferenceCreationCompletedEvent$delegate", "Lkotlin/Lazy;", "conferenceCreationInProgress", "getConferenceCreationInProgress", "conferenceScheduler", "Lorg/linphone/core/ConferenceScheduler;", "continueEnabled", "Landroidx/lifecycle/MediatorLiveData;", "getContinueEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "dateTimestamp", "", "getDateTimestamp", "()J", "setDateTimestamp", "(J)V", "description", "", "getDescription", "duration", "Lorg/linphone/activities/main/conference/data/Duration;", "getDuration", "setDuration", "(Landroidx/lifecycle/MutableLiveData;)V", "durationList", "", "getDurationList", "()Ljava/util/List;", "formattedDate", "getFormattedDate", "formattedTime", "getFormattedTime", "hour", "", "getHour", "()I", "setHour", "(I)V", "isBroadcastAllowed", "isEncrypted", "isUpdate", "listener", "Lorg/linphone/core/ConferenceSchedulerListenerStub;", "minutes", "getMinutes", "setMinutes", "mode", "getMode", "modesList", "getModesList", "participantsData", "Lorg/linphone/activities/main/conference/data/ConferenceSchedulingParticipantData;", "getParticipantsData", "scheduleForLater", "getScheduleForLater", "selectedSpeakersAddresses", "Ljava/util/ArrayList;", "sendInviteViaChat", "getSendInviteViaChat", "sendInviteViaEmail", "getSendInviteViaEmail", "speakersData", "getSpeakersData", "subject", "getSubject", "timeZone", "Lorg/linphone/activities/main/conference/data/TimeZoneData;", "getTimeZone", "setTimeZone", "timeZones", "getTimeZones", "allMandatoryFieldsFilled", "computeDurationList", "computeParticipantsData", "", "computeTimeZonesList", "createConference", "getConferenceStartTimestamp", "isModeBroadcastCurrentlySelected", "onCleared", "populateFromConferenceInfo", "conferenceInfo", "prePopulateParticipantsList", "participants", "isSchedule", "setDate", "d", "setTime", "h", "m", "toggleSchedule", "updateEncryption", "enable", "app_debug"})
public final class ConferenceSchedulingViewModel extends org.linphone.contact.ContactsSelectionViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> subject = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> description = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> scheduleForLater = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isUpdate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isBroadcastAllowed = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mode = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> modesList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> formattedDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> formattedTime = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEncrypted = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sendInviteViaChat = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sendInviteViaEmail = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> participantsData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> speakersData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.Address> address = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceCreationInProgress = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy conferenceCreationCompletedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> continueEnabled = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData> timeZone;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<org.linphone.activities.main.conference.data.TimeZoneData> timeZones = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration> duration;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<org.linphone.activities.main.conference.data.Duration> durationList = null;
    private long dateTimestamp;
    private int hour = 0;
    private int minutes = 0;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.ConferenceInfo confInfo;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ConferenceScheduler conferenceScheduler = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>> selectedSpeakersAddresses = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ConferenceSchedulerListenerStub listener = null;
    
    public ConferenceSchedulingViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getScheduleForLater() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isBroadcastAllowed() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getModesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFormattedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFormattedTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEncrypted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSendInviteViaChat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSendInviteViaEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> getParticipantsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> getSpeakersData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.Address> getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getConferenceCreationInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getConferenceCreationCompletedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getContinueEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData> getTimeZone() {
        return null;
    }
    
    public final void setTimeZone(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.linphone.activities.main.conference.data.TimeZoneData> getTimeZones() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration> getDuration() {
        return null;
    }
    
    public final void setDuration(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<org.linphone.activities.main.conference.data.Duration> getDurationList() {
        return null;
    }
    
    public final long getDateTimestamp() {
        return 0L;
    }
    
    public final void setDateTimestamp(long p0) {
    }
    
    public final int getHour() {
        return 0;
    }
    
    public final void setHour(int p0) {
    }
    
    public final int getMinutes() {
        return 0;
    }
    
    public final void setMinutes(int p0) {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void prePopulateParticipantsList(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<org.linphone.core.Address> participants, boolean isSchedule) {
    }
    
    public final void populateFromConferenceInfo(@org.jetbrains.annotations.NotNull
    org.linphone.core.ConferenceInfo conferenceInfo) {
    }
    
    public final void toggleSchedule() {
    }
    
    public final void setDate(long d) {
    }
    
    public final void setTime(int h, int m) {
    }
    
    public final void updateEncryption(boolean enable) {
    }
    
    public final void computeParticipantsData() {
    }
    
    public final void createConference() {
    }
    
    public final boolean isModeBroadcastCurrentlySelected() {
        return false;
    }
    
    private final java.util.List<org.linphone.activities.main.conference.data.TimeZoneData> computeTimeZonesList() {
        return null;
    }
    
    private final java.util.List<org.linphone.activities.main.conference.data.Duration> computeDurationList() {
        return null;
    }
    
    private final boolean allMandatoryFieldsFilled() {
        return false;
    }
    
    private final long getConferenceStartTimestamp() {
        return 0L;
    }
}