package org.linphone.activities.main.chat.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0016\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001d"}, d2 = {"Lorg/linphone/activities/main/chat/data/DevicesListGroupData;", "Lorg/linphone/contact/GenericContactData;", "participant", "Lorg/linphone/core/Participant;", "(Lorg/linphone/core/Participant;)V", "devices", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/chat/data/DevicesListChildData;", "getDevices", "()Landroidx/lifecycle/MutableLiveData;", "isExpanded", "", "securityLevelContentDescription", "", "getSecurityLevelContentDescription", "()I", "securityLevelContentDescription$delegate", "Lkotlin/Lazy;", "securityLevelIcon", "getSecurityLevelIcon", "securityLevelIcon$delegate", "sipUri", "", "getSipUri", "()Ljava/lang/String;", "onClick", "", "toggleExpanded", "app_debug"})
public final class DevicesListGroupData extends org.linphone.contact.GenericContactData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Participant participant = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy securityLevelIcon$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy securityLevelContentDescription$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isExpanded = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListChildData>> devices = null;
    
    public DevicesListGroupData(@org.jetbrains.annotations.NotNull
    org.linphone.core.Participant participant) {
        super(null);
    }
    
    public final int getSecurityLevelIcon() {
        return 0;
    }
    
    public final int getSecurityLevelContentDescription() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSipUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isExpanded() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListChildData>> getDevices() {
        return null;
    }
    
    public final void toggleExpanded() {
    }
    
    public final void onClick() {
    }
}