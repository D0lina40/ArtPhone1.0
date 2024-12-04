package org.linphone.activities.main.chat.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00060\u001bR\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/linphone/activities/main/chat/adapters/ChatRoomsListAdapter;", "Lorg/linphone/activities/main/adapters/SelectionListAdapter;", "Lorg/linphone/activities/main/chat/data/ChatRoomData;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "selectionVM", "Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "isForwardPending", "", "selectedChatRoomEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "Lorg/linphone/core/ChatRoom;", "getSelectedChatRoomEvent", "()Landroidx/lifecycle/MutableLiveData;", "selectedChatRoomEvent$delegate", "Lkotlin/Lazy;", "forwardPending", "", "pending", "onBindViewHolder", "holder", "position", "", "onCreateViewHolder", "Lorg/linphone/activities/main/chat/adapters/ChatRoomsListAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ChatRoomsListAdapter extends org.linphone.activities.main.adapters.SelectionListAdapter<org.linphone.activities.main.chat.data.ChatRoomData, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleOwner viewLifecycleOwner = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy selectedChatRoomEvent$delegate = null;
    private boolean isForwardPending = false;
    
    public ChatRoomsListAdapter(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionVM, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatRoom>> getSelectedChatRoomEvent() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public org.linphone.activities.main.chat.adapters.ChatRoomsListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    public final void forwardPending(boolean pending) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/linphone/activities/main/chat/adapters/ChatRoomsListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/linphone/databinding/ChatRoomListCellBinding;", "(Lorg/linphone/activities/main/chat/adapters/ChatRoomsListAdapter;Lorg/linphone/databinding/ChatRoomListCellBinding;)V", "bind", "", "chatRoomData", "Lorg/linphone/activities/main/chat/data/ChatRoomData;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.linphone.databinding.ChatRoomListCellBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        org.linphone.databinding.ChatRoomListCellBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.linphone.activities.main.chat.data.ChatRoomData chatRoomData) {
        }
    }
}