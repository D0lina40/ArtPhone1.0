package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 52\u00020\u0001:\u00015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007H\u0002J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u000eH\u0002J\u0010\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020 J\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000eH\u0002J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u0016\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eJ\u000e\u0010\'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020\u000eJ\u0014\u0010)\u001a\u00020\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020+0*J\u0010\u0010,\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010\u0010J\u0016\u0010-\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eJ\u0018\u0010.\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\u0014\u0010/\u001a\u00020\u00002\f\u0010(\u001a\b\u0012\u0004\u0012\u00020+0*J\u0018\u00100\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000eH\u0002J\u0018\u00102\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002J\b\u00103\u001a\u00020\u0016H\u0002J\u0018\u00104\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000eH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lorg/linphone/contact/NativeContactEditor;", "", "friend", "Lorg/linphone/core/Friend;", "(Lorg/linphone/core/Friend;)V", "changes", "Ljava/util/ArrayList;", "Landroid/content/ContentProviderOperation;", "contactUri", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "getFriend", "()Lorg/linphone/core/Friend;", "phoneNumberSelection", "", "pictureByteArray", "", "presenceUpdateSelection", "rawId", "selection", "syncAccountRawId", "addChanges", "", "operation", "addPhoneNumber", "phoneNumber", "addPresenceLinphoneSipAddressForPhoneNumber", "address", "detail", "addSipAddress", "commit", "updateSyncAccountRawId", "", "removeLinphoneOrSipAddress", "sipAddress", "removePhoneNumber", "setFirstAndLastNames", "firstName", "lastName", "setOrganization", "value", "setPhoneNumbers", "", "Lorg/linphone/activities/main/contact/data/NumberOrAddressEditorData;", "setPicture", "setPresenceInformation", "setPresenceLinphoneSipAddressForPhoneNumber", "setSipAddresses", "updateLinphoneOrSipAddress", "currentValue", "updatePhoneNumber", "updatePicture", "updatePresenceLinphoneSipAddressForPhoneNumber", "Companion", "app_debug"})
public final class NativeContactEditor {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Friend friend = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<android.content.ContentProviderOperation> changes = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String selection = "contact_id =? AND mimetype =?";
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumberSelection = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String presenceUpdateSelection = "contact_id =? AND mimetype =? AND data3=?";
    private final android.net.Uri contactUri = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String rawId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String syncAccountRawId;
    @org.jetbrains.annotations.Nullable
    private byte[] pictureByteArray;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.contact.NativeContactEditor.Companion Companion = null;
    
    public NativeContactEditor(@org.jetbrains.annotations.NotNull
    org.linphone.core.Friend friend) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Friend getFriend() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.contact.NativeContactEditor setFirstAndLastNames(@org.jetbrains.annotations.NotNull
    java.lang.String firstName, @org.jetbrains.annotations.NotNull
    java.lang.String lastName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.contact.NativeContactEditor setOrganization(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.contact.NativeContactEditor setPhoneNumbers(@org.jetbrains.annotations.NotNull
    java.util.List<org.linphone.activities.main.contact.data.NumberOrAddressEditorData> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.contact.NativeContactEditor setSipAddresses(@org.jetbrains.annotations.NotNull
    java.util.List<org.linphone.activities.main.contact.data.NumberOrAddressEditorData> value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.contact.NativeContactEditor setPicture(@org.jetbrains.annotations.Nullable
    byte[] value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.contact.NativeContactEditor setPresenceInformation(@org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull
    java.lang.String sipAddress) {
        return null;
    }
    
    public final void commit(boolean updateSyncAccountRawId) {
    }
    
    private final void addChanges(android.content.ContentProviderOperation operation) {
    }
    
    private final void addPhoneNumber(java.lang.String phoneNumber) {
    }
    
    private final void updatePhoneNumber(java.lang.String currentValue, java.lang.String phoneNumber) {
    }
    
    private final void removePhoneNumber(java.lang.String phoneNumber) {
    }
    
    private final void addSipAddress(java.lang.String address) {
    }
    
    private final void updateLinphoneOrSipAddress(java.lang.String currentValue, java.lang.String sipAddress) {
    }
    
    private final void removeLinphoneOrSipAddress(java.lang.String sipAddress) {
    }
    
    private final void setPresenceLinphoneSipAddressForPhoneNumber(java.lang.String sipAddress, java.lang.String phoneNumber) {
    }
    
    private final void addPresenceLinphoneSipAddressForPhoneNumber(java.lang.String address, java.lang.String detail) {
    }
    
    private final void updatePresenceLinphoneSipAddressForPhoneNumber(java.lang.String sipAddress, java.lang.String phoneNumber) {
    }
    
    private final void updatePicture() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\b"}, d2 = {"Lorg/linphone/contact/NativeContactEditor$Companion;", "", "()V", "createAndroidContact", "", "accountName", "", "accountType", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final long createAndroidContact(@org.jetbrains.annotations.Nullable
        java.lang.String accountName, @org.jetbrains.annotations.Nullable
        java.lang.String accountType) {
            return 0L;
        }
    }
}