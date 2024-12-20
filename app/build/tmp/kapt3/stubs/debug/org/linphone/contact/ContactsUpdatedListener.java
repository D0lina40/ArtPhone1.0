package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lorg/linphone/contact/ContactsUpdatedListener;", "", "onContactUpdated", "", "friend", "Lorg/linphone/core/Friend;", "onContactsUpdated", "app_debug"})
public abstract interface ContactsUpdatedListener {
    
    public abstract void onContactsUpdated();
    
    public abstract void onContactUpdated(@org.jetbrains.annotations.NotNull
    org.linphone.core.Friend friend);
}