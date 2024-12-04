package org.linphone.activities.main.chat.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\fR\'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u0011\u0010\u0013\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\b\u00a8\u0006\u001e"}, d2 = {"Lorg/linphone/activities/main/chat/viewmodels/ChatRoomCreationViewModel;", "Lorg/linphone/contact/ContactsSelectionViewModel;", "()V", "chatRoomCreatedEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "Lorg/linphone/core/ChatRoom;", "getChatRoomCreatedEvent", "()Landroidx/lifecycle/MutableLiveData;", "chatRoomCreatedEvent$delegate", "Lkotlin/Lazy;", "createGroupChat", "", "getCreateGroupChat", "isEncrypted", "listener", "Lorg/linphone/core/ChatRoomListenerStub;", "secureChatAvailable", "getSecureChatAvailable", "secureChatMandatory", "getSecureChatMandatory", "()Z", "waitForChatRoomCreation", "getWaitForChatRoomCreation", "createOneToOneChat", "", "searchResult", "Lorg/linphone/core/SearchResult;", "updateEncryption", "encrypted", "app_debug"})
public final class ChatRoomCreationViewModel extends org.linphone.contact.ContactsSelectionViewModel {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy chatRoomCreatedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> createGroupChat = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEncrypted = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForChatRoomCreation = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> secureChatAvailable = null;
    private final boolean secureChatMandatory = false;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoomListenerStub listener = null;
    
    public ChatRoomCreationViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatRoom>> getChatRoomCreatedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCreateGroupChat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEncrypted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWaitForChatRoomCreation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSecureChatAvailable() {
        return null;
    }
    
    public final boolean getSecureChatMandatory() {
        return false;
    }
    
    public final void updateEncryption(boolean encrypted) {
    }
    
    public final void createOneToOneChat(@org.jetbrains.annotations.NotNull
    org.linphone.core.SearchResult searchResult) {
    }
}