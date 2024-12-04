package org.linphone.activities.voip.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0002J\u0010\u0010/\u001a\u00020%2\u0006\u0010.\u001a\u00020\fH\u0002J\b\u00100\u001a\u00020-H\u0002J\u0006\u00101\u001a\u00020-J\b\u00102\u001a\u00020-H\u0014J\u0010\u00103\u001a\u00020-2\u0006\u0010.\u001a\u00020\fH\u0002J\u0006\u00104\u001a\u00020-J\b\u00105\u001a\u00020\u001bH\u0002J\u0012\u00106\u001a\u00020-2\b\u00107\u001a\u0004\u0018\u00010\fH\u0002J\b\u00108\u001a\u00020-H\u0002J\u0006\u00109\u001a\u00020-J\b\u0010:\u001a\u00020-H\u0002R\'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\bR\'\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0010\u0010\bR\'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\bR\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\bR\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b*\u0010\b\u00a8\u0006;"}, d2 = {"Lorg/linphone/activities/voip/viewmodels/CallsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "askPermissionEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getAskPermissionEvent", "()Landroidx/lifecycle/MutableLiveData;", "askPermissionEvent$delegate", "Lkotlin/Lazy;", "callConnectedEvent", "Lorg/linphone/core/Call;", "getCallConnectedEvent", "callConnectedEvent$delegate", "callEndedEvent", "getCallEndedEvent", "callEndedEvent$delegate", "callUpdateEvent", "getCallUpdateEvent", "callUpdateEvent$delegate", "callsData", "", "Lorg/linphone/activities/voip/data/CallData;", "getCallsData", "chatAndCallsCount", "Landroidx/lifecycle/MediatorLiveData;", "", "getChatAndCallsCount", "()Landroidx/lifecycle/MediatorLiveData;", "currentCallData", "getCurrentCallData", "currentCallUnreadChatMessageCount", "getCurrentCallUnreadChatMessageCount", "inactiveCallsCount", "getInactiveCallsCount", "isMicrophoneMuted", "", "isMuteMicrophoneEnabled", "listener", "Lorg/linphone/core/CoreListenerStub;", "noMoreCallEvent", "getNoMoreCallEvent", "noMoreCallEvent$delegate", "addCallToList", "", "call", "callDataAlreadyExists", "initCallList", "mergeCallsIntoConference", "onCleared", "removeCallFromList", "toggleMuteMicrophone", "updateCallsAndChatCount", "updateCurrentCallData", "currentCall", "updateInactiveCallsCount", "updateMicState", "updateUnreadChatCount", "app_debug"})
public final class CallsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> currentCallData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.CallData>> callsData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> inactiveCallsCount = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> currentCallUnreadChatMessageCount = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Integer> chatAndCallsCount = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMicrophoneMuted = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMuteMicrophoneEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy callConnectedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy callEndedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy callUpdateEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy noMoreCallEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy askPermissionEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public CallsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> getCurrentCallData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.CallData>> getCallsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getInactiveCallsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getCurrentCallUnreadChatMessageCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.Integer> getChatAndCallsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMicrophoneMuted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMuteMicrophoneEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.Call>> getCallConnectedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.Call>> getCallEndedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.Call>> getCallUpdateEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getNoMoreCallEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getAskPermissionEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void toggleMuteMicrophone() {
    }
    
    public final void mergeCallsIntoConference() {
    }
    
    private final void initCallList() {
    }
    
    private final void addCallToList(org.linphone.core.Call call) {
    }
    
    private final void removeCallFromList(org.linphone.core.Call call) {
    }
    
    private final void updateCurrentCallData(org.linphone.core.Call currentCall) {
    }
    
    private final boolean callDataAlreadyExists(org.linphone.core.Call call) {
        return false;
    }
    
    public final void updateMicState() {
    }
    
    private final int updateCallsAndChatCount() {
        return 0;
    }
    
    private final void updateUnreadChatCount() {
    }
    
    private final void updateInactiveCallsCount() {
    }
}