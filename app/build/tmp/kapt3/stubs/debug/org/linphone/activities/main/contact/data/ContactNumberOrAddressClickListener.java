package org.linphone.activities.main.contact.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lorg/linphone/activities/main/contact/data/ContactNumberOrAddressClickListener;", "", "onCall", "", "address", "Lorg/linphone/core/Address;", "onChat", "isSecured", "", "onSmsInvite", "number", "", "app_debug"})
public abstract interface ContactNumberOrAddressClickListener {
    
    public abstract void onCall(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address address);
    
    public abstract void onChat(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address address, boolean isSecured);
    
    public abstract void onSmsInvite(@org.jetbrains.annotations.NotNull
    java.lang.String number);
}