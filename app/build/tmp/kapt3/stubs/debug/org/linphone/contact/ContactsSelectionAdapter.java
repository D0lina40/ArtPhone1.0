package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001 B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tJ\u000e\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tJ\u0014\u0010\u001e\u001a\u00020\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lorg/linphone/contact/ContactsSelectionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/linphone/core/SearchResult;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;)V", "requireGroupChatCapability", "Landroidx/lifecycle/MutableLiveData;", "", "requireLimeCapability", "selectedContact", "Lorg/linphone/utils/Event;", "getSelectedContact", "()Landroidx/lifecycle/MutableLiveData;", "selection", "", "Lorg/linphone/core/Address;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setGroupChatCapabilityRequired", "enabled", "setLimeCapabilityRequired", "updateSelectedAddresses", "selectedAddresses", "ViewHolder", "app_debug"})
public final class ContactsSelectionAdapter extends androidx.recyclerview.widget.ListAdapter<org.linphone.core.SearchResult, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleOwner viewLifecycleOwner = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.SearchResult>> selectedContact = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.core.Address>> selection = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> requireGroupChatCapability = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> requireLimeCapability;
    
    public ContactsSelectionAdapter(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.SearchResult>> getSelectedContact() {
        return null;
    }
    
    public final void updateSelectedAddresses(@org.jetbrains.annotations.NotNull
    java.util.List<? extends org.linphone.core.Address> selectedAddresses) {
    }
    
    public final void setLimeCapabilityRequired(boolean enabled) {
    }
    
    public final void setGroupChatCapabilityRequired(boolean enabled) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/linphone/contact/ContactsSelectionAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/linphone/databinding/ContactSelectionCellBinding;", "(Lorg/linphone/contact/ContactsSelectionAdapter;Lorg/linphone/databinding/ContactSelectionCellBinding;)V", "bind", "", "searchResult", "Lorg/linphone/core/SearchResult;", "updateSecurity", "viewModel", "Lorg/linphone/contact/ContactSelectionData;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.linphone.databinding.ContactSelectionCellBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        org.linphone.databinding.ContactSelectionCellBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.linphone.core.SearchResult searchResult) {
        }
        
        private final void updateSecurity(org.linphone.core.SearchResult searchResult, org.linphone.contact.ContactSelectionData viewModel) {
        }
    }
}