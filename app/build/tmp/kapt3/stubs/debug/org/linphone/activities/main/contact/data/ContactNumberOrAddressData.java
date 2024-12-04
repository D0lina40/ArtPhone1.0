package org.linphone.activities.main.contact.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014\u00a8\u0006!"}, d2 = {"Lorg/linphone/activities/main/contact/data/ContactNumberOrAddressData;", "", "address", "Lorg/linphone/core/Address;", "hasPresence", "", "displayedValue", "", "isSip", "showSecureChat", "typeLabel", "listener", "Lorg/linphone/activities/main/contact/data/ContactNumberOrAddressClickListener;", "(Lorg/linphone/core/Address;ZLjava/lang/String;ZZLjava/lang/String;Lorg/linphone/activities/main/contact/data/ContactNumberOrAddressClickListener;)V", "getAddress", "()Lorg/linphone/core/Address;", "chatAllowed", "getChatAllowed", "()Z", "getDisplayedValue", "()Ljava/lang/String;", "getHasPresence", "hidePlainChat", "getHidePlainChat", "showInvite", "getShowInvite", "getShowSecureChat", "getTypeLabel", "smsInvite", "", "startCall", "startChat", "secured", "app_debug"})
public final class ContactNumberOrAddressData {
    @org.jetbrains.annotations.Nullable
    private final org.linphone.core.Address address = null;
    private final boolean hasPresence = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String displayedValue = null;
    private final boolean isSip = false;
    private final boolean showSecureChat = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String typeLabel = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.contact.data.ContactNumberOrAddressClickListener listener = null;
    private final boolean showInvite = false;
    private final boolean chatAllowed = false;
    private final boolean hidePlainChat = false;
    
    public ContactNumberOrAddressData(@org.jetbrains.annotations.Nullable
    org.linphone.core.Address address, boolean hasPresence, @org.jetbrains.annotations.NotNull
    java.lang.String displayedValue, boolean isSip, boolean showSecureChat, @org.jetbrains.annotations.NotNull
    java.lang.String typeLabel, @org.jetbrains.annotations.NotNull
    org.linphone.activities.main.contact.data.ContactNumberOrAddressClickListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.core.Address getAddress() {
        return null;
    }
    
    public final boolean getHasPresence() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDisplayedValue() {
        return null;
    }
    
    public final boolean isSip() {
        return false;
    }
    
    public final boolean getShowSecureChat() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTypeLabel() {
        return null;
    }
    
    public final boolean getShowInvite() {
        return false;
    }
    
    public final boolean getChatAllowed() {
        return false;
    }
    
    public final boolean getHidePlainChat() {
        return false;
    }
    
    public final void startCall() {
    }
    
    public final void startChat(boolean secured) {
    }
    
    public final void smsInvite() {
    }
}