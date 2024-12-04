package org.linphone.activities.main.conference.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000eJ\u0014\u0010\u001b\u001a\u00020\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001dJ\b\u0010\u001e\u001a\u00020\u0017H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lorg/linphone/activities/main/conference/viewmodels/ScheduledConferencesViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "conferenceListener", "Lorg/linphone/core/ConferenceSchedulerListenerStub;", "conferenceScheduler", "Lorg/linphone/core/ConferenceScheduler;", "getConferenceScheduler", "()Lorg/linphone/core/ConferenceScheduler;", "conferenceScheduler$delegate", "Lkotlin/Lazy;", "conferences", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/conference/data/ScheduledConferenceData;", "getConferences", "()Landroidx/lifecycle/MutableLiveData;", "listener", "Lorg/linphone/core/CoreListenerStub;", "showTerminated", "", "getShowTerminated", "applyFilter", "", "computeConferenceInfoList", "deleteConferenceInfo", "data", "deleteConferencesInfo", "toRemoveList", "", "onCleared", "app_debug"})
public final class ScheduledConferencesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ScheduledConferenceData>> conferences = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showTerminated = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy conferenceScheduler$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ConferenceSchedulerListenerStub conferenceListener = null;
    
    public ScheduledConferencesViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ScheduledConferenceData>> getConferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowTerminated() {
        return null;
    }
    
    private final org.linphone.core.ConferenceScheduler getConferenceScheduler() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void applyFilter() {
    }
    
    public final void deleteConferenceInfo(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.conference.data.ScheduledConferenceData data) {
    }
    
    public final void deleteConferencesInfo(@org.jetbrains.annotations.NotNull
    java.util.List<org.linphone.activities.main.conference.data.ScheduledConferenceData> toRemoveList) {
    }
    
    private final void computeConferenceInfoList() {
    }
}