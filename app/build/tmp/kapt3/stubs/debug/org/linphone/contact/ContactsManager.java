package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0011J\u000e\u0010/\u001a\u00020%2\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020-J\u0006\u00103\u001a\u00020-J\u0010\u00104\u001a\u0004\u0018\u00010%2\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u0004\u0018\u00010%2\u0006\u00108\u001a\u00020\nJ\u0010\u00109\u001a\u0004\u0018\u00010%2\u0006\u0010:\u001a\u00020\nJ\u0010\u0010;\u001a\u0004\u0018\u00010\n2\u0006\u0010<\u001a\u00020=J \u0010>\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010A0@0?J\u000e\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u000206J\b\u0010E\u001a\u00020-H\u0002J\u000e\u0010F\u001a\u00020\u00162\u0006\u00105\u001a\u000206J\u0006\u0010G\u001a\u00020-J\u000e\u0010G\u001a\u00020-2\u0006\u0010H\u001a\u00020%J\u0010\u0010I\u001a\u00020-2\u0006\u0010H\u001a\u00020%H\u0002J\u000e\u0010J\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0011J\u0006\u0010K\u001a\u00020\u0016J\u0010\u0010L\u001a\u00020-2\u0006\u0010H\u001a\u00020%H\u0002J\u0006\u0010M\u001a\u00020-R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020\'8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b(\u0010)\u00a8\u0006N"}, d2 = {"Lorg/linphone/contact/ContactsManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "contactAvatar", "Landroidx/core/graphics/drawable/IconCompat;", "getContactAvatar", "()Landroidx/core/graphics/drawable/IconCompat;", "contactIdToWatchFor", "", "getContactIdToWatchFor", "()Ljava/lang/String;", "setContactIdToWatchFor", "(Ljava/lang/String;)V", "contactsUpdatedListeners", "Ljava/util/ArrayList;", "Lorg/linphone/contact/ContactsUpdatedListener;", "coreListener", "Lorg/linphone/core/CoreListenerStub;", "fetchInProgress", "Landroidx/lifecycle/MutableLiveData;", "", "getFetchInProgress", "()Landroidx/lifecycle/MutableLiveData;", "friendListListener", "Lorg/linphone/core/FriendListListenerStub;", "groupAvatar", "getGroupAvatar", "groupBitmap", "Landroid/graphics/Bitmap;", "getGroupBitmap", "()Landroid/graphics/Bitmap;", "latestContactFetch", "getLatestContactFetch", "setLatestContactFetch", "localFriends", "Lorg/linphone/core/Friend;", "magicSearch", "Lorg/linphone/core/MagicSearch;", "getMagicSearch", "()Lorg/linphone/core/MagicSearch;", "magicSearch$delegate", "Lkotlin/Lazy;", "addListener", "", "listener", "createFriendFromSearchResult", "searchResult", "Lorg/linphone/core/SearchResult;", "destroy", "fetchFinished", "findContactByAddress", "address", "Lorg/linphone/core/Address;", "findContactById", "id", "findContactByPhoneNumber", "number", "getAndroidContactIdFromUri", "uri", "Landroid/net/Uri;", "getAvailableSyncAccounts", "", "Lkotlin/Triple;", "Landroid/graphics/drawable/Drawable;", "getMePerson", "Landroidx/core/app/Person;", "localAddress", "initSyncAccount", "isAddressMyself", "notifyListeners", "friend", "refreshContactOnPresenceReceived", "removeListener", "shouldDisplaySipContactsList", "storePresenceInNativeContact", "updateLocalContacts", "app_debug"})
public final class ContactsManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy magicSearch$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String latestContactFetch = "";
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> fetchInProgress = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String contactIdToWatchFor = "";
    @org.jetbrains.annotations.NotNull
    private final androidx.core.graphics.drawable.IconCompat contactAvatar = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.core.graphics.drawable.IconCompat groupAvatar = null;
    @org.jetbrains.annotations.NotNull
    private final android.graphics.Bitmap groupBitmap = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<org.linphone.core.Friend> localFriends = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<org.linphone.contact.ContactsUpdatedListener> contactsUpdatedListeners = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.FriendListListenerStub friendListListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub coreListener = null;
    
    public ContactsManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.MagicSearch getMagicSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLatestContactFetch() {
        return null;
    }
    
    public final void setLatestContactFetch(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFetchInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContactIdToWatchFor() {
        return null;
    }
    
    public final void setContactIdToWatchFor(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.graphics.drawable.IconCompat getContactAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.graphics.drawable.IconCompat getGroupAvatar() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.graphics.Bitmap getGroupBitmap() {
        return null;
    }
    
    public final boolean shouldDisplaySipContactsList() {
        return false;
    }
    
    public final void fetchFinished() {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void updateLocalContacts() {
    }
    
    @kotlin.jvm.Synchronized
    @org.jetbrains.annotations.NotNull
    public final synchronized androidx.core.app.Person getMePerson(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address localAddress) {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    @org.jetbrains.annotations.Nullable
    public final synchronized java.lang.String getAndroidContactIdFromUri(@org.jetbrains.annotations.NotNull
    android.net.Uri uri) {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    @org.jetbrains.annotations.Nullable
    public final synchronized org.linphone.core.Friend findContactById(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    @org.jetbrains.annotations.Nullable
    public final synchronized org.linphone.core.Friend findContactByPhoneNumber(@org.jetbrains.annotations.NotNull
    java.lang.String number) {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    @org.jetbrains.annotations.Nullable
    public final synchronized org.linphone.core.Friend findContactByAddress(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address address) {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized boolean isAddressMyself(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address address) {
        return false;
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void addListener(@org.jetbrains.annotations.NotNull
    org.linphone.contact.ContactsUpdatedListener listener) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void removeListener(@org.jetbrains.annotations.NotNull
    org.linphone.contact.ContactsUpdatedListener listener) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void notifyListeners() {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void notifyListeners(@org.jetbrains.annotations.NotNull
    org.linphone.core.Friend friend) {
    }
    
    @kotlin.jvm.Synchronized
    public final synchronized void destroy() {
    }
    
    private final void initSyncAccount() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<kotlin.Triple<java.lang.String, java.lang.String, android.graphics.drawable.Drawable>> getAvailableSyncAccounts() {
        return null;
    }
    
    @kotlin.jvm.Synchronized
    private final synchronized void refreshContactOnPresenceReceived(org.linphone.core.Friend friend) {
    }
    
    private final void storePresenceInNativeContact(org.linphone.core.Friend friend) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Friend createFriendFromSearchResult(@org.jetbrains.annotations.NotNull
    org.linphone.core.SearchResult searchResult) {
        return null;
    }
}