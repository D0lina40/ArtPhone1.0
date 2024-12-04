package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0018\u001a\u00020\u0019H\u0002R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/linphone/contact/GenericContactViewModel;", "Lorg/linphone/activities/main/viewmodels/MessageNotifierViewModel;", "Lorg/linphone/contact/ContactDataInterface;", "sipAddress", "Lorg/linphone/core/Address;", "(Lorg/linphone/core/Address;)V", "contact", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/core/Friend;", "getContact", "()Landroidx/lifecycle/MutableLiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "displayName", "", "getDisplayName", "presenceStatus", "Lorg/linphone/core/ConsolidatedPresence;", "getPresenceStatus", "securityLevel", "Lorg/linphone/core/ChatRoom$SecurityLevel;", "getSecurityLevel", "contactLookup", "", "app_debug"})
public abstract class GenericContactViewModel extends org.linphone.activities.main.viewmodels.MessageNotifierViewModel implements org.linphone.contact.ContactDataInterface {
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
    
    public GenericContactViewModel(@org.jetbrains.annotations.NotNull
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
    
    private final void contactLookup() {
    }
    
    @java.lang.Override
    public boolean getShowGroupChatAvatar() {
        return false;
    }
}