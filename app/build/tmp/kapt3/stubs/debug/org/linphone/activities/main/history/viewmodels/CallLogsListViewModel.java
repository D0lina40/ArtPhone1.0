package org.linphone.activities.main.history.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J;\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0019j\b\u0012\u0004\u0012\u00020\u0006`\u001a2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0006J\u001e\u0010#\u001a\u00020!2\u0016\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0019j\b\u0012\u0004\u0012\u00020\u0006`\u001aJ\b\u0010%\u001a\u00020!H\u0014J\u0006\u0010&\u001a\u00020!J\u0006\u0010\'\u001a\u00020!J\u0006\u0010(\u001a\u00020!J\b\u0010)\u001a\u00020!H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\b\u00a8\u0006*"}, d2 = {"Lorg/linphone/activities/main/history/viewmodels/CallLogsListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "callLogs", "Landroidx/lifecycle/MutableLiveData;", "", "Lorg/linphone/activities/main/history/data/GroupedCallLogData;", "getCallLogs", "()Landroidx/lifecycle/MutableLiveData;", "contactsUpdatedEvent", "Lorg/linphone/utils/Event;", "", "getContactsUpdatedEvent", "contactsUpdatedEvent$delegate", "Lkotlin/Lazy;", "contactsUpdatedListener", "Lorg/linphone/contact/ContactsUpdatedListenerStub;", "filter", "Lorg/linphone/activities/main/history/viewmodels/CallLogsFilter;", "getFilter", "listener", "Lorg/linphone/core/CoreListenerStub;", "showConferencesFilter", "getShowConferencesFilter", "computeCallLogs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "Lorg/linphone/core/CallLog;", "missed", "conference", "([Lorg/linphone/core/CallLog;ZZ)Ljava/util/ArrayList;", "deleteCallLogGroup", "", "callLog", "deleteCallLogGroups", "listToDelete", "onCleared", "showAllCallLogs", "showOnlyConferenceCallLogs", "showOnlyMissedCallLogs", "updateCallLogs", "app_debug"})
public final class CallLogsListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.history.data.GroupedCallLogData>> callLogs = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.history.viewmodels.CallLogsFilter> filter = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showConferencesFilter = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy contactsUpdatedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.contact.ContactsUpdatedListenerStub contactsUpdatedListener = null;
    
    public CallLogsListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.history.data.GroupedCallLogData>> getCallLogs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.history.viewmodels.CallLogsFilter> getFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowConferencesFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getContactsUpdatedEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void showAllCallLogs() {
    }
    
    public final void showOnlyMissedCallLogs() {
    }
    
    public final void showOnlyConferenceCallLogs() {
    }
    
    public final void deleteCallLogGroup(@org.jetbrains.annotations.Nullable
    org.linphone.activities.main.history.data.GroupedCallLogData callLog) {
    }
    
    public final void deleteCallLogGroups(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<org.linphone.activities.main.history.data.GroupedCallLogData> listToDelete) {
    }
    
    private final java.util.ArrayList<org.linphone.activities.main.history.data.GroupedCallLogData> computeCallLogs(org.linphone.core.CallLog[] callLogs, boolean missed, boolean conference) {
        return null;
    }
    
    private final void updateCallLogs() {
    }
}