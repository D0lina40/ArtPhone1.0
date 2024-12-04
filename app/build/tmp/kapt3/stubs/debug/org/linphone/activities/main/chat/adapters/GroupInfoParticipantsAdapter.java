package org.linphone.activities.main.chat.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0016H\u0016J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/linphone/activities/main/chat/adapters/GroupInfoParticipantsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lorg/linphone/activities/main/chat/data/GroupInfoParticipantData;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "isEncryptionEnabled", "", "(Landroidx/lifecycle/LifecycleOwner;Z)V", "participantRemovedEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "Lorg/linphone/activities/main/chat/GroupChatRoomMember;", "getParticipantRemovedEvent", "()Landroidx/lifecycle/MutableLiveData;", "participantRemovedEvent$delegate", "Lkotlin/Lazy;", "showAdmin", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "Lorg/linphone/activities/main/chat/adapters/GroupInfoParticipantsAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "showAdminControls", "show", "ViewHolder", "app_debug"})
public final class GroupInfoParticipantsAdapter extends androidx.recyclerview.widget.ListAdapter<org.linphone.activities.main.chat.data.GroupInfoParticipantData, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleOwner viewLifecycleOwner = null;
    private final boolean isEncryptionEnabled = false;
    private boolean showAdmin = false;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy participantRemovedEvent$delegate = null;
    
    public GroupInfoParticipantsAdapter(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner, boolean isEncryptionEnabled) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.activities.main.chat.GroupChatRoomMember>> getParticipantRemovedEvent() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.linphone.activities.main.chat.adapters.GroupInfoParticipantsAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void showAdminControls(boolean show) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/linphone/activities/main/chat/adapters/GroupInfoParticipantsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/linphone/databinding/ChatRoomGroupInfoParticipantCellBinding;", "(Lorg/linphone/activities/main/chat/adapters/GroupInfoParticipantsAdapter;Lorg/linphone/databinding/ChatRoomGroupInfoParticipantCellBinding;)V", "getBinding", "()Lorg/linphone/databinding/ChatRoomGroupInfoParticipantCellBinding;", "bind", "", "participantViewModel", "Lorg/linphone/activities/main/chat/data/GroupInfoParticipantData;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.linphone.databinding.ChatRoomGroupInfoParticipantCellBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        org.linphone.databinding.ChatRoomGroupInfoParticipantCellBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.databinding.ChatRoomGroupInfoParticipantCellBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.linphone.activities.main.chat.data.GroupInfoParticipantData participantViewModel) {
        }
    }
}