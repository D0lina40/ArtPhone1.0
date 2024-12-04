package org.linphone.activities.main.chat.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020#J\b\u0010%\u001a\u00020#H\u0014J\u000e\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(J\b\u0010)\u001a\u00020#H\u0002J\u0006\u0010*\u001a\u00020#R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\tR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\tR\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\tR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\t\u00a8\u0006+"}, d2 = {"Lorg/linphone/activities/main/chat/viewmodels/GroupInfoViewModel;", "Lorg/linphone/activities/main/viewmodels/MessageNotifierViewModel;", "chatRoom", "Lorg/linphone/core/ChatRoom;", "(Lorg/linphone/core/ChatRoom;)V", "canLeaveGroup", "Landroidx/lifecycle/MutableLiveData;", "", "getCanLeaveGroup", "()Landroidx/lifecycle/MutableLiveData;", "getChatRoom", "()Lorg/linphone/core/ChatRoom;", "createdChatRoomEvent", "Lorg/linphone/utils/Event;", "getCreatedChatRoomEvent", "isEncrypted", "isMeAdmin", "listener", "Lorg/linphone/core/ChatRoomListenerStub;", "meAdminChangedEvent", "getMeAdminChangedEvent", "meAdminChangedEvent$delegate", "Lkotlin/Lazy;", "participants", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/chat/data/GroupInfoParticipantData;", "getParticipants", "subject", "", "getSubject", "updatedChatRoomEvent", "getUpdatedChatRoomEvent", "waitForChatRoomCreation", "getWaitForChatRoomCreation", "createChatRoom", "", "leaveGroup", "onCleared", "removeParticipant", "participant", "Lorg/linphone/activities/main/chat/GroupChatRoomMember;", "updateParticipants", "updateRoom", "app_debug"})
public final class GroupInfoViewModel extends org.linphone.activities.main.viewmodels.MessageNotifierViewModel {
    @org.jetbrains.annotations.Nullable
    private final org.linphone.core.ChatRoom chatRoom = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatRoom>> createdChatRoomEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatRoom>> updatedChatRoomEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> subject = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.GroupInfoParticipantData>> participants = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEncrypted = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMeAdmin = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> canLeaveGroup = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForChatRoomCreation = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy meAdminChangedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoomListenerStub listener = null;
    
    public GroupInfoViewModel(@org.jetbrains.annotations.Nullable
    org.linphone.core.ChatRoom chatRoom) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.core.ChatRoom getChatRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatRoom>> getCreatedChatRoomEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatRoom>> getUpdatedChatRoomEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.GroupInfoParticipantData>> getParticipants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEncrypted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMeAdmin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCanLeaveGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWaitForChatRoomCreation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getMeAdminChangedEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void createChatRoom() {
    }
    
    public final void updateRoom() {
    }
    
    public final void leaveGroup() {
    }
    
    public final void removeParticipant(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.GroupChatRoomMember participant) {
    }
    
    private final void updateParticipants() {
    }
}