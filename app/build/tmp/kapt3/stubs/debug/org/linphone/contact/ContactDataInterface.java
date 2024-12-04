package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"Lorg/linphone/contact/ContactDataInterface;", "", "contact", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/core/Friend;", "getContact", "()Landroidx/lifecycle/MutableLiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "displayName", "", "getDisplayName", "presenceStatus", "Lorg/linphone/core/ConsolidatedPresence;", "getPresenceStatus", "securityLevel", "Lorg/linphone/core/ChatRoom$SecurityLevel;", "getSecurityLevel", "showGroupChatAvatar", "", "getShowGroupChatAvatar", "()Z", "app_debug"})
public abstract interface ContactDataInterface {
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> getContact();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<java.lang.String> getDisplayName();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom.SecurityLevel> getSecurityLevel();
    
    public abstract boolean getShowGroupChatAvatar();
    
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> getPresenceStatus();
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.CoroutineScope getCoroutineScope();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
        
        public static boolean getShowGroupChatAvatar(@org.jetbrains.annotations.NotNull
        org.linphone.contact.ContactDataInterface $this) {
            return false;
        }
    }
}