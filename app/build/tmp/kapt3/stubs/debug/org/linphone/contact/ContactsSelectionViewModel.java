package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\"J\b\u0010$\u001a\u00020\"H\u0014J\u001b\u0010%\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\'H\u0002\u00a2\u0006\u0002\u0010(J\u000e\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\u001dJ\u000e\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u0006R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\bR\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00160\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\bR\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\b\u00a8\u0006-"}, d2 = {"Lorg/linphone/contact/ContactsSelectionViewModel;", "Lorg/linphone/activities/main/viewmodels/MessageNotifierViewModel;", "()V", "contactsList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/core/SearchResult;", "getContactsList", "()Landroidx/lifecycle/MutableLiveData;", "contactsUpdatedListener", "Lorg/linphone/contact/ContactsUpdatedListenerStub;", "fastFetchJob", "Lkotlinx/coroutines/Job;", "fetchInProgress", "", "getFetchInProgress", "filter", "", "getFilter", "magicSearchListener", "Lorg/linphone/core/MagicSearchListenerStub;", "moreResultsAvailableEvent", "Lorg/linphone/utils/Event;", "getMoreResultsAvailableEvent", "moreResultsAvailableEvent$delegate", "Lkotlin/Lazy;", "previousFilter", "searchResultsPending", "selectedAddresses", "Lorg/linphone/core/Address;", "getSelectedAddresses", "sipContactsSelected", "getSipContactsSelected", "applyFilter", "", "clearFilter", "onCleared", "processMagicSearchResults", "results", "", "([Lorg/linphone/core/SearchResult;)V", "toggleSelectionForAddress", "address", "toggleSelectionForSearchResult", "searchResult", "app_debug"})
public class ContactsSelectionViewModel extends org.linphone.activities.main.viewmodels.MessageNotifierViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.SearchResult>> contactsList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sipContactsSelected = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>> selectedAddresses = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> filter = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String previousFilter = "NotSet";
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> fetchInProgress = null;
    private boolean searchResultsPending = false;
    @org.jetbrains.annotations.Nullable
    private kotlinx.coroutines.Job fastFetchJob;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy moreResultsAvailableEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.contact.ContactsUpdatedListenerStub contactsUpdatedListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.MagicSearchListenerStub magicSearchListener = null;
    
    public ContactsSelectionViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.SearchResult>> getContactsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSipContactsSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>> getSelectedAddresses() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFetchInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getMoreResultsAvailableEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void applyFilter() {
    }
    
    public final void clearFilter() {
    }
    
    public final void toggleSelectionForSearchResult(@org.jetbrains.annotations.NotNull
    org.linphone.core.SearchResult searchResult) {
    }
    
    public final void toggleSelectionForAddress(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address address) {
    }
    
    private final void processMagicSearchResults(org.linphone.core.SearchResult[] results) {
    }
}