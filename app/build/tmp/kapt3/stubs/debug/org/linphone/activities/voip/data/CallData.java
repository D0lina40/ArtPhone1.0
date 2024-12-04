package org.linphone.activities.voip.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u0001EB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00103\u001a\u000204J\b\u00105\u001a\u00020\tH\u0002J\b\u00106\u001a\u000204H\u0016J\u0006\u00107\u001a\u00020\tJ\b\u00108\u001a\u00020\tH\u0002J\b\u00109\u001a\u00020\tH\u0002J\u0006\u0010:\u001a\u000204J\u0006\u0010;\u001a\u000204J\u000e\u0010<\u001a\u0002042\u0006\u0010=\u001a\u00020>J\b\u0010?\u001a\u000204H\u0002J\u0006\u0010@\u001a\u000204J\u0006\u0010A\u001a\u000204J\u0006\u0010B\u001a\u000204J\b\u0010C\u001a\u000204H\u0002J\b\u0010D\u001a\u000204H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000bR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000bR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000bR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u000bR\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000bR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000bR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u000bR\u000e\u0010+\u001a\u00020,X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00170\b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u000bR\u000e\u0010/\u001a\u000200X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lorg/linphone/activities/voip/data/CallData;", "Lorg/linphone/contact/GenericContactData;", "call", "Lorg/linphone/core/Call;", "(Lorg/linphone/core/Call;)V", "getCall", "()Lorg/linphone/core/Call;", "canBePaused", "Landroidx/lifecycle/MutableLiveData;", "", "getCanBePaused", "()Landroidx/lifecycle/MutableLiveData;", "chatRoom", "Lorg/linphone/core/ChatRoom;", "getChatRoom", "()Lorg/linphone/core/ChatRoom;", "setChatRoom", "(Lorg/linphone/core/ChatRoom;)V", "conferenceParticipants", "", "Lorg/linphone/activities/voip/data/ConferenceInfoParticipantData;", "getConferenceParticipants", "conferenceParticipantsCountLabel", "", "getConferenceParticipantsCountLabel", "contextMenuClickListener", "Lorg/linphone/activities/voip/data/CallData$CallContextMenuClickListener;", "getContextMenuClickListener", "()Lorg/linphone/activities/voip/data/CallData$CallContextMenuClickListener;", "setContextMenuClickListener", "(Lorg/linphone/activities/voip/data/CallData$CallContextMenuClickListener;)V", "displayableAddress", "getDisplayableAddress", "isConferenceCall", "Landroidx/lifecycle/MediatorLiveData;", "()Landroidx/lifecycle/MediatorLiveData;", "isInRemoteConference", "isIncoming", "isOutgoing", "isPaused", "isRecording", "isRemotelyPaused", "isRemotelyRecorded", "listener", "Lorg/linphone/core/CallListenerStub;", "remoteConferenceSubject", "getRemoteConferenceSubject", "scope", "Lkotlinx/coroutines/CoroutineScope;", "timer", "Ljava/util/Timer;", "accept", "", "canCallBePaused", "destroy", "isActiveAndNotInConference", "isCallPaused", "isCallRemotelyPaused", "pause", "resume", "showContextMenu", "anchor", "Landroid/view/View;", "startVideoUpdateAcceptanceTimer", "terminate", "togglePause", "toggleRecording", "update", "updateConferenceInfo", "CallContextMenuClickListener", "app_debug"})
public class CallData extends org.linphone.contact.GenericContactData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Call call = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> displayableAddress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPaused = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRemotelyPaused = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> canBePaused = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRecording = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRemotelyRecorded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isInRemoteConference = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> remoteConferenceSubject = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isConferenceCall = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceInfoParticipantData>> conferenceParticipants = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> conferenceParticipantsCountLabel = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOutgoing = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isIncoming = null;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.ChatRoom chatRoom;
    @org.jetbrains.annotations.Nullable
    private org.linphone.activities.voip.data.CallData.CallContextMenuClickListener contextMenuClickListener;
    @org.jetbrains.annotations.Nullable
    private java.util.Timer timer;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CallListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public CallData(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Call getCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDisplayableAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPaused() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isRemotelyPaused() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCanBePaused() {
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
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isInRemoteConference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRemoteConferenceSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> isConferenceCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceInfoParticipantData>> getConferenceParticipants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getConferenceParticipantsCountLabel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isOutgoing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isIncoming() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.core.ChatRoom getChatRoom() {
        return null;
    }
    
    public final void setChatRoom(@org.jetbrains.annotations.Nullable
    org.linphone.core.ChatRoom p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.activities.voip.data.CallData.CallContextMenuClickListener getContextMenuClickListener() {
        return null;
    }
    
    public final void setContextMenuClickListener(@org.jetbrains.annotations.Nullable
    org.linphone.activities.voip.data.CallData.CallContextMenuClickListener p0) {
    }
    
    @java.lang.Override
    public void destroy() {
    }
    
    public final void togglePause() {
    }
    
    public final void pause() {
    }
    
    public final void resume() {
    }
    
    public final void accept() {
    }
    
    public final void terminate() {
    }
    
    public final void toggleRecording() {
    }
    
    public final void showContextMenu(@org.jetbrains.annotations.NotNull
    android.view.View anchor) {
    }
    
    public final boolean isActiveAndNotInConference() {
        return false;
    }
    
    private final boolean isCallPaused() {
        return false;
    }
    
    private final boolean isCallRemotelyPaused() {
        return false;
    }
    
    private final boolean canCallBePaused() {
        return false;
    }
    
    private final void update() {
    }
    
    private final void updateConferenceInfo() {
    }
    
    private final void startVideoUpdateAcceptanceTimer() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/linphone/activities/voip/data/CallData$CallContextMenuClickListener;", "", "onShowContextMenu", "", "anchor", "Landroid/view/View;", "callData", "Lorg/linphone/activities/voip/data/CallData;", "app_debug"})
    public static abstract interface CallContextMenuClickListener {
        
        public abstract void onShowContextMenu(@org.jetbrains.annotations.NotNull
        android.view.View anchor, @org.jetbrains.annotations.NotNull
        org.linphone.activities.voip.data.CallData callData);
    }
}