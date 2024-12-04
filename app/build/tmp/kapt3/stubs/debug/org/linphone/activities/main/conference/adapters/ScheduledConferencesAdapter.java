package org.linphone.activities.main.conference.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001/B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001c\u0010*\u001a\u00060+R\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u001fH\u0016R\'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\'\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000fR\'\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000fR5\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00190\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001a\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lorg/linphone/activities/main/conference/adapters/ScheduledConferencesAdapter;", "Lorg/linphone/activities/main/adapters/SelectionListAdapter;", "Lorg/linphone/activities/main/conference/data/ScheduledConferenceData;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/linphone/utils/HeaderAdapter;", "selectionVM", "Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "copyAddressToClipboardEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getCopyAddressToClipboardEvent", "()Landroidx/lifecycle/MutableLiveData;", "copyAddressToClipboardEvent$delegate", "Lkotlin/Lazy;", "deleteConferenceInfoEvent", "getDeleteConferenceInfoEvent", "deleteConferenceInfoEvent$delegate", "editConferenceEvent", "getEditConferenceEvent", "editConferenceEvent$delegate", "joinConferenceEvent", "Lkotlin/Pair;", "getJoinConferenceEvent", "joinConferenceEvent$delegate", "displayHeaderForPosition", "", "position", "", "formatDate", "context", "Landroid/content/Context;", "date", "", "getHeaderViewForPosition", "Landroid/view/View;", "onBindViewHolder", "", "holder", "onCreateViewHolder", "Lorg/linphone/activities/main/conference/adapters/ScheduledConferencesAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ScheduledConferencesAdapter extends org.linphone.activities.main.adapters.SelectionListAdapter<org.linphone.activities.main.conference.data.ScheduledConferenceData, androidx.recyclerview.widget.RecyclerView.ViewHolder> implements org.linphone.utils.HeaderAdapter {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleOwner viewLifecycleOwner = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy copyAddressToClipboardEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy joinConferenceEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy editConferenceEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy deleteConferenceInfoEvent$delegate = null;
    
    public ScheduledConferencesAdapter(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionVM, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getCopyAddressToClipboardEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<kotlin.Pair<java.lang.String, java.lang.String>>> getJoinConferenceEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getEditConferenceEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.activities.main.conference.data.ScheduledConferenceData>> getDeleteConferenceInfoEvent() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.linphone.activities.main.conference.adapters.ScheduledConferencesAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public boolean displayHeaderForPosition(int position) {
        return false;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View getHeaderViewForPosition(@org.jetbrains.annotations.NotNull
    android.content.Context context, int position) {
        return null;
    }
    
    private final java.lang.String formatDate(android.content.Context context, long date) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/linphone/activities/main/conference/adapters/ScheduledConferencesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/linphone/databinding/ConferenceScheduleCellBinding;", "(Lorg/linphone/activities/main/conference/adapters/ScheduledConferencesAdapter;Lorg/linphone/databinding/ConferenceScheduleCellBinding;)V", "getBinding", "()Lorg/linphone/databinding/ConferenceScheduleCellBinding;", "bind", "", "conferenceData", "Lorg/linphone/activities/main/conference/data/ScheduledConferenceData;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.linphone.databinding.ConferenceScheduleCellBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        org.linphone.databinding.ConferenceScheduleCellBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.databinding.ConferenceScheduleCellBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.linphone.activities.main.conference.data.ScheduledConferenceData conferenceData) {
        }
    }
}