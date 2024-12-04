package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010+\u001a\u00020,H\u0002R\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0017\u001a\u00020\u00188F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001b\u0010\u000fR\u001b\u0010\u001d\u001a\u00020\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\n\u001a\u0004\b\u001d\u0010\u001aR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000fR\u001b\u0010\'\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\n\u001a\u0004\b(\u0010)\u00a8\u0006-"}, d2 = {"Lorg/linphone/contact/ContactSelectionData;", "Lorg/linphone/contact/ContactDataInterface;", "searchResult", "Lorg/linphone/core/SearchResult;", "(Lorg/linphone/core/SearchResult;)V", "address", "Lorg/linphone/core/Address;", "getAddress", "()Lorg/linphone/core/Address;", "address$delegate", "Lkotlin/Lazy;", "contact", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/core/Friend;", "getContact", "()Landroidx/lifecycle/MutableLiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "displayName", "", "getDisplayName", "hasLimeX3DHCapability", "", "getHasLimeX3DHCapability", "()Z", "isDisabled", "isDisabled$delegate", "isLinphoneUser", "isLinphoneUser$delegate", "isSelected", "isSelected$delegate", "presenceStatus", "Lorg/linphone/core/ConsolidatedPresence;", "getPresenceStatus", "securityLevel", "Lorg/linphone/core/ChatRoom$SecurityLevel;", "getSecurityLevel", "sipUri", "getSipUri", "()Ljava/lang/String;", "sipUri$delegate", "searchMatchingContact", "", "app_debug"})
public final class ContactSelectionData implements org.linphone.contact.ContactDataInterface {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.SearchResult searchResult = null;
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
    private final kotlin.Lazy isDisabled$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy isSelected$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy isLinphoneUser$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sipUri$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy address$delegate = null;
    
    public ContactSelectionData(@org.jetbrains.annotations.NotNull
    org.linphone.core.SearchResult searchResult) {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isDisabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelected() {
        return null;
    }
    
    public final boolean isLinphoneUser() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSipUri() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.core.Address getAddress() {
        return null;
    }
    
    public final boolean getHasLimeX3DHCapability() {
        return false;
    }
    
    private final void searchMatchingContact() {
    }
    
    @java.lang.Override
    public boolean getShowGroupChatAvatar() {
        return false;
    }
}