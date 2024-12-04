package org.linphone.activities.main.chat.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\u001f"}, d2 = {"Lorg/linphone/activities/main/chat/data/GroupInfoParticipantData;", "Lorg/linphone/contact/GenericContactData;", "participant", "Lorg/linphone/activities/main/chat/GroupChatRoomMember;", "(Lorg/linphone/activities/main/chat/GroupChatRoomMember;)V", "canBeSetAdmin", "Landroidx/lifecycle/MutableLiveData;", "", "getCanBeSetAdmin", "()Landroidx/lifecycle/MutableLiveData;", "isAdmin", "getParticipant", "()Lorg/linphone/activities/main/chat/GroupChatRoomMember;", "securityLevelContentDescription", "", "getSecurityLevelContentDescription", "()I", "securityLevelContentDescription$delegate", "Lkotlin/Lazy;", "securityLevelIcon", "getSecurityLevelIcon", "securityLevelIcon$delegate", "showAdminControls", "getShowAdminControls", "sipUri", "", "getSipUri", "()Ljava/lang/String;", "setAdmin", "", "unSetAdmin", "app_debug"})
public final class GroupInfoParticipantData extends org.linphone.contact.GenericContactData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.chat.GroupChatRoomMember participant = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAdmin = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showAdminControls = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> canBeSetAdmin = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy securityLevelIcon$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy securityLevelContentDescription$delegate = null;
    
    public GroupInfoParticipantData(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.GroupChatRoomMember participant) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.chat.GroupChatRoomMember getParticipant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSipUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAdmin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowAdminControls() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getCanBeSetAdmin() {
        return null;
    }
    
    public final int getSecurityLevelIcon() {
        return 0;
    }
    
    public final int getSecurityLevelContentDescription() {
        return 0;
    }
    
    public final void setAdmin() {
    }
    
    public final void unSetAdmin() {
    }
}