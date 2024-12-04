package org.linphone.activities.main.chat.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0010j\b\u0012\u0004\u0012\u00020\u0006`\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0012\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u000eH\u0016J\u001a\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/linphone/activities/main/chat/fragments/MasterChatRoomsFragment;", "Lorg/linphone/activities/main/fragments/MasterFragment;", "Lorg/linphone/databinding/ChatRoomMasterFragmentBinding;", "Lorg/linphone/activities/main/chat/adapters/ChatRoomsListAdapter;", "()V", "dialogConfirmationMessageBeforeRemoval", "", "getDialogConfirmationMessageBeforeRemoval", "()I", "listViewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatRoomsListViewModel;", "observer", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "deleteItems", "", "indexesOfItemToDelete", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLayoutId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onViewCreated", "view", "Landroid/view/View;", "scrollToTop", "app_debug"})
public final class MasterChatRoomsFragment extends org.linphone.activities.main.fragments.MasterFragment<org.linphone.databinding.ChatRoomMasterFragmentBinding, org.linphone.activities.main.chat.adapters.ChatRoomsListAdapter> {
    private final int dialogConfirmationMessageBeforeRemoval = 0;
    private org.linphone.activities.main.chat.viewmodels.ChatRoomsListViewModel listViewModel;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.RecyclerView.AdapterDataObserver observer = null;
    
    public MasterChatRoomsFragment() {
        super();
    }
    
    @java.lang.Override
    protected int getDialogConfirmationMessageBeforeRemoval() {
        return 0;
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void deleteItems(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> indexesOfItemToDelete) {
    }
    
    private final void scrollToTop() {
    }
}