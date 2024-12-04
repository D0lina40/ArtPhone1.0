package org.linphone.activities.main.chat.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 &2\u00020\u0001:\u0001&B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0014\u0010\u001d\u001a\u00020\u00182\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u000e\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u000fJ\b\u0010$\u001a\u00020\u0018H\u0014J\u000e\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\fR\'\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\f\u00a8\u0006\'"}, d2 = {"Lorg/linphone/activities/main/chat/viewmodels/ChatMessagesListViewModel;", "Landroidx/lifecycle/ViewModel;", "chatRoom", "Lorg/linphone/core/ChatRoom;", "(Lorg/linphone/core/ChatRoom;)V", "chatRoomListener", "Lorg/linphone/core/ChatRoomListenerStub;", "events", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/chat/data/EventLogData;", "getEvents", "()Landroidx/lifecycle/MutableLiveData;", "messageUpdatedEvent", "Lorg/linphone/utils/Event;", "", "getMessageUpdatedEvent", "messageUpdatedEvent$delegate", "Lkotlin/Lazy;", "requestWriteExternalStoragePermissionEvent", "", "getRequestWriteExternalStoragePermissionEvent", "requestWriteExternalStoragePermissionEvent$delegate", "addChatMessageEventLog", "", "eventLog", "Lorg/linphone/core/EventLog;", "addEvent", "deleteEvent", "deleteEventLogs", "listToDelete", "deleteMessage", "chatMessage", "Lorg/linphone/core/ChatMessage;", "loadMoreData", "totalItemsCount", "onCleared", "resendMessage", "Companion", "app_debug"})
public final class ChatMessagesListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoom chatRoom = null;
    private static final int MESSAGES_PER_PAGE = 20;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.EventLogData>> events = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy messageUpdatedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy requestWriteExternalStoragePermissionEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoomListenerStub chatRoomListener = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.activities.main.chat.viewmodels.ChatMessagesListViewModel.Companion Companion = null;
    
    public ChatMessagesListViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatRoom chatRoom) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.EventLogData>> getEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Integer>> getMessageUpdatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getRequestWriteExternalStoragePermissionEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void resendMessage(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatMessage chatMessage) {
    }
    
    public final void deleteMessage(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatMessage chatMessage) {
    }
    
    public final void deleteEventLogs(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<org.linphone.activities.main.chat.data.EventLogData> listToDelete) {
    }
    
    public final void loadMoreData(int totalItemsCount) {
    }
    
    private final void addEvent(org.linphone.core.EventLog eventLog) {
    }
    
    private final java.util.ArrayList<org.linphone.activities.main.chat.data.EventLogData> getEvents() {
        return null;
    }
    
    private final void deleteEvent(org.linphone.core.EventLog eventLog) {
    }
    
    private final void addChatMessageEventLog(org.linphone.core.EventLog eventLog) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/linphone/activities/main/chat/viewmodels/ChatMessagesListViewModel$Companion;", "", "()V", "MESSAGES_PER_PAGE", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}