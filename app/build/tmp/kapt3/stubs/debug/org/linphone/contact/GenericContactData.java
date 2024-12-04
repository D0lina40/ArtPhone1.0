package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0004J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/linphone/contact/GenericContactData;", "Lorg/linphone/contact/ContactDataInterface;", "sipAddress", "Lorg/linphone/core/Address;", "(Lorg/linphone/core/Address;)V", "contact", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/core/Friend;", "getContact", "()Landroidx/lifecycle/MutableLiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "displayName", "", "getDisplayName", "presenceStatus", "Lorg/linphone/core/ConsolidatedPresence;", "getPresenceStatus", "securityLevel", "Lorg/linphone/core/ChatRoom$SecurityLevel;", "getSecurityLevel", "contactLookup", "", "destroy", "app_debug"})
public class GenericContactData implements org.linphone.contact.ContactDataInterface {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Address sipAddress = null;
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
    
    public GenericContactData(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address sipAddress) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> getContact() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDisplayName() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom.SecurityLevel> getSecurityLevel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> getPresenceStatus() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    public void destroy() {
    }
    
    protected final void contactLookup() {
    }
    
    @java.lang.Override
    public boolean getShowGroupChatAvatar() {
        return false;
    }
}