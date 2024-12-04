package org.linphone.activities.main.chat.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010`\u001a\u00020\tJ\u0010\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020#H\u0002J\u0006\u0010d\u001a\u00020bJ\b\u0010e\u001a\u00020bH\u0002J\b\u0010f\u001a\u0004\u0018\u00010\u0007J\u000e\u0010g\u001a\u00020b2\u0006\u0010h\u001a\u00020\tJ\b\u0010i\u001a\u00020bH\u0014J\b\u0010j\u001a\u00020bH\u0002J\u0006\u0010k\u001a\u00020bJ\u0006\u0010l\u001a\u00020bJ\b\u0010m\u001a\u00020bH\u0002J\b\u0010n\u001a\u00020bH\u0002J\b\u0010o\u001a\u00020bH\u0002J\b\u0010p\u001a\u00020bH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b \u0010\u000bR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010)\u001a\u00020*X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u001b\u0010/\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\r\u001a\u0004\b0\u0010\u000bR\u001b\u00102\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\r\u001a\u0004\b3\u0010\u000bR\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001bR\u0011\u00107\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u000bR\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u001bR\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u001bR!\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\r\u001a\u0004\b=\u0010\u001bR\u001a\u0010?\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u000b\"\u0004\bA\u0010BR\u001b\u0010C\u001a\u00020\t8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bE\u0010\r\u001a\u0004\bD\u0010\u000bR\u001c\u0010F\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\u001bR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020N0\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010\u001bR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010\u001bR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020S0\u0018X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\u001bR\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020V0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010\u001bR\u0017\u0010X\u001a\b\u0012\u0004\u0012\u00020V0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010\u001bR\u0014\u0010Z\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b[\u0010\u000bR\u0017\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010\u001bR\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020V0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010\u001b\u00a8\u0006q"}, d2 = {"Lorg/linphone/activities/main/chat/viewmodels/ChatRoomViewModel;", "Landroidx/lifecycle/ViewModel;", "Lorg/linphone/contact/ContactDataInterface;", "chatRoom", "Lorg/linphone/core/ChatRoom;", "(Lorg/linphone/core/ChatRoom;)V", "addressToCall", "Lorg/linphone/core/Address;", "basicChatRoom", "", "getBasicChatRoom", "()Z", "basicChatRoom$delegate", "Lkotlin/Lazy;", "bounceAnimator", "Landroid/animation/ValueAnimator;", "getBounceAnimator", "()Landroid/animation/ValueAnimator;", "bounceAnimator$delegate", "getChatRoom", "()Lorg/linphone/core/ChatRoom;", "chatRoomListener", "Lorg/linphone/core/ChatRoomListenerStub;", "chatUnreadCountTranslateY", "Landroidx/lifecycle/MutableLiveData;", "", "getChatUnreadCountTranslateY", "()Landroidx/lifecycle/MutableLiveData;", "composingList", "", "getComposingList", "conferenceChatRoom", "getConferenceChatRoom", "conferenceChatRoom$delegate", "contact", "Lorg/linphone/core/Friend;", "getContact", "contactsUpdatedListener", "Lorg/linphone/contact/ContactsUpdatedListenerStub;", "coreListener", "Lorg/linphone/core/CoreListenerStub;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "displayName", "getDisplayName", "encryptedChatRoom", "getEncryptedChatRoom", "encryptedChatRoom$delegate", "ephemeralChatRoom", "getEphemeralChatRoom", "ephemeralChatRoom$delegate", "ephemeralEnabled", "getEphemeralEnabled", "groupCallAvailable", "getGroupCallAvailable", "isUserScrollingUp", "lastPresenceInfo", "getLastPresenceInfo", "meAdmin", "getMeAdmin", "meAdmin$delegate", "oneParticipantOneDevice", "getOneParticipantOneDevice", "setOneParticipantOneDevice", "(Z)V", "oneToOneChatRoom", "getOneToOneChatRoom", "oneToOneChatRoom$delegate", "onlyParticipantOnlyDeviceAddress", "getOnlyParticipantOnlyDeviceAddress", "()Lorg/linphone/core/Address;", "setOnlyParticipantOnlyDeviceAddress", "(Lorg/linphone/core/Address;)V", "participants", "getParticipants", "presenceStatus", "Lorg/linphone/core/ConsolidatedPresence;", "getPresenceStatus", "remoteIsComposing", "getRemoteIsComposing", "securityLevel", "Lorg/linphone/core/ChatRoom$SecurityLevel;", "getSecurityLevel", "securityLevelContentDescription", "", "getSecurityLevelContentDescription", "securityLevelIcon", "getSecurityLevelIcon", "showGroupChatAvatar", "getShowGroupChatAvatar", "subject", "getSubject", "unreadMessagesCount", "getUnreadMessagesCount", "areNotificationsMuted", "computeLastSeenLabel", "", "friend", "contactLookup", "getParticipantsNames", "getRemoteAddress", "muteNotifications", "mute", "onCleared", "searchMatchingContact", "startCall", "startGroupCall", "updateParticipants", "updateRemotesComposing", "updateSecurityIcon", "updateUnreadMessageCount", "app_debug"})
public final class ChatRoomViewModel extends androidx.lifecycle.ViewModel implements org.linphone.contact.ContactDataInterface {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoom chatRoom = null;
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
    private final androidx.lifecycle.MutableLiveData<java.lang.String> subject = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> participants = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> unreadMessagesCount = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> remoteIsComposing = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> composingList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> securityLevelIcon = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> securityLevelContentDescription = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> lastPresenceInfo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> ephemeralEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy basicChatRoom$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy oneToOneChatRoom$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy conferenceChatRoom$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy encryptedChatRoom$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy ephemeralChatRoom$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy meAdmin$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isUserScrollingUp = null;
    private boolean oneParticipantOneDevice = false;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.Address onlyParticipantOnlyDeviceAddress;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Float> chatUnreadCountTranslateY = null;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.Address addressToCall;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy bounceAnimator$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.contact.ContactsUpdatedListenerStub contactsUpdatedListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub coreListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoomListenerStub chatRoomListener = null;
    
    public ChatRoomViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatRoom chatRoom) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.ChatRoom getChatRoom() {
        return null;
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
    public boolean getShowGroupChatAvatar() {
        return false;
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
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSubject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getParticipants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getUnreadMessagesCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRemoteIsComposing() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getComposingList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSecurityLevelIcon() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getSecurityLevelContentDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLastPresenceInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEphemeralEnabled() {
        return null;
    }
    
    public final boolean getBasicChatRoom() {
        return false;
    }
    
    public final boolean getOneToOneChatRoom() {
        return false;
    }
    
    private final boolean getConferenceChatRoom() {
        return false;
    }
    
    public final boolean getEncryptedChatRoom() {
        return false;
    }
    
    public final boolean getEphemeralChatRoom() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMeAdmin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isUserScrollingUp() {
        return null;
    }
    
    public final boolean getOneParticipantOneDevice() {
        return false;
    }
    
    public final void setOneParticipantOneDevice(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.core.Address getOnlyParticipantOnlyDeviceAddress() {
        return null;
    }
    
    public final void setOnlyParticipantOnlyDeviceAddress(@org.jetbrains.annotations.Nullable
    org.linphone.core.Address p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Float> getChatUnreadCountTranslateY() {
        return null;
    }
    
    public final boolean getGroupCallAvailable() {
        return false;
    }
    
    private final android.animation.ValueAnimator getBounceAnimator() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void contactLookup() {
    }
    
    public final void startCall() {
    }
    
    public final void startGroupCall() {
    }
    
    public final boolean areNotificationsMuted() {
        return false;
    }
    
    public final void muteNotifications(boolean mute) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.core.Address getRemoteAddress() {
        return null;
    }
    
    private final void searchMatchingContact() {
    }
    
    private final void computeLastSeenLabel(org.linphone.core.Friend friend) {
    }
    
    private final void getParticipantsNames() {
    }
    
    private final void updateSecurityIcon() {
    }
    
    private final void updateRemotesComposing() {
    }
    
    private final void updateParticipants() {
    }
    
    private final void updateUnreadMessageCount() {
    }
}