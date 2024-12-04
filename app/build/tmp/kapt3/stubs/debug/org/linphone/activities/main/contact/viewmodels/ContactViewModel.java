package org.linphone.activities.main.contact.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010>\u001a\u00020?J\u0006\u0010@\u001a\u00020?J\b\u0010A\u001a\u00020?H\u0014J\u0006\u0010B\u001a\u00020?J\u0006\u0010C\u001a\u00020?J\u0006\u0010D\u001a\u00020?R\'\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000bR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000bR\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u000bR\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u000bR\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000bR\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002030\u0007X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u000bR\'\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\b0\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\r\u001a\u0004\b6\u0010\u000bR\'\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002090\b0\u00078FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b;\u0010\r\u001a\u0004\b:\u0010\u000bR\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u000b\u00a8\u0006E"}, d2 = {"Lorg/linphone/activities/main/contact/viewmodels/ContactViewModel;", "Lorg/linphone/activities/main/viewmodels/MessageNotifierViewModel;", "Lorg/linphone/contact/ContactDataInterface;", "friend", "Lorg/linphone/core/Friend;", "(Lorg/linphone/core/Friend;)V", "chatRoomCreatedEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "Lorg/linphone/core/ChatRoom;", "getChatRoomCreatedEvent", "()Landroidx/lifecycle/MutableLiveData;", "chatRoomCreatedEvent$delegate", "Lkotlin/Lazy;", "chatRoomListener", "Lorg/linphone/core/ChatRoomListenerStub;", "contact", "getContact", "contactsListener", "Lorg/linphone/contact/ContactsUpdatedListenerStub;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "displayName", "", "getDisplayName", "displayOrganization", "", "getDisplayOrganization", "()Z", "fullName", "getFullName", "()Ljava/lang/String;", "setFullName", "(Ljava/lang/String;)V", "hasLongTermPresence", "getHasLongTermPresence", "isNativeContact", "listener", "Lorg/linphone/activities/main/contact/data/ContactNumberOrAddressClickListener;", "numbersAndAddresses", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/contact/data/ContactNumberOrAddressData;", "getNumbersAndAddresses", "presenceStatus", "Lorg/linphone/core/ConsolidatedPresence;", "getPresenceStatus", "readOnlyNativeAddressBook", "getReadOnlyNativeAddressBook", "securityLevel", "Lorg/linphone/core/ChatRoom$SecurityLevel;", "getSecurityLevel", "sendSmsToEvent", "getSendSmsToEvent", "sendSmsToEvent$delegate", "startCallToEvent", "Lorg/linphone/core/Address;", "getStartCallToEvent", "startCallToEvent$delegate", "waitForChatRoomCreation", "getWaitForChatRoomCreation", "deleteContact", "", "destroy", "onCleared", "registerContactListener", "unregisterContactListener", "updateNumbersAndAddresses", "app_debug"})
public final class ContactViewModel extends org.linphone.activities.main.viewmodels.MessageNotifierViewModel implements org.linphone.contact.ContactDataInterface {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> contact = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> displayName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom.SecurityLevel> securityLevel = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> presenceStatus = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String fullName = "";
    private final boolean displayOrganization = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.ContactNumberOrAddressData>> numbersAndAddresses = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sendSmsToEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy startCallToEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy chatRoomCreatedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForChatRoomCreation = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNativeContact = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> readOnlyNativeAddressBook = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hasLongTermPresence = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoomListenerStub chatRoomListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.contact.ContactsUpdatedListenerStub contactsListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.contact.data.ContactNumberOrAddressClickListener listener = null;
    
    public ContactViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.Friend friend) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> getContact() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<java.lang.String> getDisplayName() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom.SecurityLevel> getSecurityLevel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> getPresenceStatus() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFullName() {
        return null;
    }
    
    public final void setFullName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getDisplayOrganization() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.ContactNumberOrAddressData>> getNumbersAndAddresses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getSendSmsToEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.Address>> getStartCallToEvent() {
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
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isNativeContact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getReadOnlyNativeAddressBook() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHasLongTermPresence() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void destroy() {
    }
    
    public final void registerContactListener() {
    }
    
    public final void unregisterContactListener() {
    }
    
    public final void deleteContact() {
    }
    
    public final void updateNumbersAndAddresses() {
    }
    
    @java.lang.Override
    public boolean getShowGroupChatAvatar() {
        return false;
    }
}