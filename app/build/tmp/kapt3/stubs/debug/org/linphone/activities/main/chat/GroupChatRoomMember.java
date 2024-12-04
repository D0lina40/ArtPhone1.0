package org.linphone.activities.main.chat;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lorg/linphone/activities/main/chat/GroupChatRoomMember;", "", "address", "Lorg/linphone/core/Address;", "isAdmin", "", "securityLevel", "Lorg/linphone/core/ChatRoom$SecurityLevel;", "hasLimeX3DHCapability", "canBeSetAdmin", "(Lorg/linphone/core/Address;ZLorg/linphone/core/ChatRoom$SecurityLevel;ZZ)V", "getAddress", "()Lorg/linphone/core/Address;", "getCanBeSetAdmin", "()Z", "getHasLimeX3DHCapability", "setAdmin", "(Z)V", "getSecurityLevel", "()Lorg/linphone/core/ChatRoom$SecurityLevel;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "app_debug"})
public final class GroupChatRoomMember {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Address address = null;
    private boolean isAdmin;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoom.SecurityLevel securityLevel = null;
    private final boolean hasLimeX3DHCapability = false;
    private final boolean canBeSetAdmin = false;
    
    public GroupChatRoomMember(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address address, boolean isAdmin, @org.jetbrains.annotations.NotNull
    org.linphone.core.ChatRoom.SecurityLevel securityLevel, boolean hasLimeX3DHCapability, boolean canBeSetAdmin) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Address getAddress() {
        return null;
    }
    
    public final boolean isAdmin() {
        return false;
    }
    
    public final void setAdmin(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.ChatRoom.SecurityLevel getSecurityLevel() {
        return null;
    }
    
    public final boolean getHasLimeX3DHCapability() {
        return false;
    }
    
    public final boolean getCanBeSetAdmin() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Address component1() {
        return null;
    }
    
    public final boolean component2() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.ChatRoom.SecurityLevel component3() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.chat.GroupChatRoomMember copy(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address address, boolean isAdmin, @org.jetbrains.annotations.NotNull
    org.linphone.core.ChatRoom.SecurityLevel securityLevel, boolean hasLimeX3DHCapability, boolean canBeSetAdmin) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}