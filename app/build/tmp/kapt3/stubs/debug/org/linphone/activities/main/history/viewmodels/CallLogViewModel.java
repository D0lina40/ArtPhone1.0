package org.linphone.activities.main.history.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010J\u001a\u00020K2\u0016\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u001aj\b\u0012\u0004\u0012\u00020\u0003`MJ\u0006\u0010N\u001a\u00020KJ\u000e\u0010O\u001a\u00020K2\u0006\u0010P\u001a\u00020\u0005J\b\u0010Q\u001a\u00020KH\u0014J\u0006\u0010R\u001a\u00020KJ\u000e\u0010S\u001a\u00020K2\u0006\u0010T\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\'\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\r\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0011R\u001b\u0010\"\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b$\u0010\u0013\u001a\u0004\b#\u0010\u001fR\u001b\u0010%\u001a\u00020&8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0013\u001a\u0004\b\'\u0010(R\u001b\u0010*\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b,\u0010\u0013\u001a\u0004\b+\u0010\u001fR\u0011\u0010-\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u000bR\u001b\u0010/\u001a\u00020&8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\u0013\u001a\u0004\b0\u0010(R\u0011\u00102\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u001b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0011R\u001b\u00107\u001a\u00020\u00178FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b9\u0010\u0013\u001a\u0004\b8\u0010\u001fR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0011R\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u001a0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0011R\u0011\u0010>\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\u000bR\u0014\u0010@\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bA\u0010\u000bR\'\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000e0\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bD\u0010\u0013\u001a\u0004\bC\u0010\u0011R\u001b\u0010E\u001a\u00020&8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010\u0013\u001a\u0004\bF\u0010(R\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\u0011\u00a8\u0006U"}, d2 = {"Lorg/linphone/activities/main/history/viewmodels/CallLogViewModel;", "Lorg/linphone/contact/GenericContactViewModel;", "callLog", "Lorg/linphone/core/CallLog;", "isRelated", "", "(Lorg/linphone/core/CallLog;Z)V", "getCallLog", "()Lorg/linphone/core/CallLog;", "chatAllowed", "getChatAllowed", "()Z", "chatRoomCreatedEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "Lorg/linphone/core/ChatRoom;", "getChatRoomCreatedEvent", "()Landroidx/lifecycle/MutableLiveData;", "chatRoomCreatedEvent$delegate", "Lkotlin/Lazy;", "chatRoomListener", "Lorg/linphone/core/ChatRoomListenerStub;", "conferenceDate", "", "getConferenceDate", "conferenceParticipantsData", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/conference/data/ConferenceSchedulingParticipantData;", "getConferenceParticipantsData", "conferenceSubject", "getConferenceSubject", "()Ljava/lang/String;", "conferenceTime", "getConferenceTime", "date", "getDate", "date$delegate", "directionIconResource", "", "getDirectionIconResource", "()I", "directionIconResource$delegate", "duration", "getDuration", "duration$delegate", "hidePlainChat", "getHidePlainChat", "iconContentDescription", "getIconContentDescription", "iconContentDescription$delegate", "isConferenceCallLog", "listener", "Lorg/linphone/core/CoreListenerStub;", "organizerParticipantData", "getOrganizerParticipantData", "peerSipUri", "getPeerSipUri", "peerSipUri$delegate", "readOnlyNativeAddressBook", "getReadOnlyNativeAddressBook", "relatedCallLogs", "getRelatedCallLogs", "secureChatAllowed", "getSecureChatAllowed", "showGroupChatAvatar", "getShowGroupChatAvatar", "startCallEvent", "getStartCallEvent", "startCallEvent$delegate", "statusIconResource", "getStatusIconResource", "statusIconResource$delegate", "waitForChatRoomCreation", "getWaitForChatRoomCreation", "addRelatedCallLogs", "", "callLogs", "Lkotlin/collections/ArrayList;", "destroy", "enableListener", "enable", "onCleared", "startCall", "startChat", "isSecured", "app_debug"})
public final class CallLogViewModel extends org.linphone.contact.GenericContactViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CallLog callLog = null;
    private final boolean isRelated = false;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy peerSipUri$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy statusIconResource$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy iconContentDescription$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy directionIconResource$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy duration$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy date$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy startCallEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy chatRoomCreatedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForChatRoomCreation = null;
    private final boolean chatAllowed = false;
    private final boolean hidePlainChat = false;
    private final boolean secureChatAllowed = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.history.viewmodels.CallLogViewModel>> relatedCallLogs = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    private final boolean isConferenceCallLog = false;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String conferenceSubject = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> conferenceParticipantsData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData> organizerParticipantData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> conferenceTime = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> conferenceDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> readOnlyNativeAddressBook = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoomListenerStub chatRoomListener = null;
    
    public CallLogViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.CallLog callLog, boolean isRelated) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.CallLog getCallLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPeerSipUri() {
        return null;
    }
    
    public final int getStatusIconResource() {
        return 0;
    }
    
    public final int getIconContentDescription() {
        return 0;
    }
    
    public final int getDirectionIconResource() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.CallLog>> getStartCallEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatRoom>> getChatRoomCreatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWaitForChatRoomCreation() {
        return null;
    }
    
    public final boolean getChatAllowed() {
        return false;
    }
    
    public final boolean getHidePlainChat() {
        return false;
    }
    
    public final boolean getSecureChatAllowed() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.history.viewmodels.CallLogViewModel>> getRelatedCallLogs() {
        return null;
    }
    
    public final boolean isConferenceCallLog() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getConferenceSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> getConferenceParticipantsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData> getOrganizerParticipantData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getConferenceTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getConferenceDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getReadOnlyNativeAddressBook() {
        return null;
    }
    
    @java.lang.Override
    public boolean getShowGroupChatAvatar() {
        return false;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void destroy() {
    }
    
    public final void startCall() {
    }
    
    public final void startChat(boolean isSecured) {
    }
    
    public final void addRelatedCallLogs(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<org.linphone.core.CallLog> callLogs) {
    }
    
    public final void enableListener(boolean enable) {
    }
}