package org.linphone.activities.voip.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0011H\u0016J-\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0017\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u0011H\u0002J\b\u0010%\u001a\u00020\u0011H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lorg/linphone/activities/voip/fragments/ChatFragment;", "Lorg/linphone/activities/GenericFragment;", "Lorg/linphone/databinding/VoipChatFragmentBinding;", "()V", "adapter", "Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter;", "chatSendingViewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatMessageSendingViewModel;", "listViewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatMessagesListViewModel;", "observer", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "viewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatRoomViewModel;", "getLayoutId", "", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onPause", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pickFile", "scrollToBottom", "app_debug"})
public final class ChatFragment extends org.linphone.activities.GenericFragment<org.linphone.databinding.VoipChatFragmentBinding> {
    private org.linphone.activities.main.chat.adapters.ChatMessagesListAdapter adapter;
    private org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel viewModel;
    private org.linphone.activities.main.chat.viewmodels.ChatMessagesListViewModel listViewModel;
    private org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.RecyclerView.AdapterDataObserver observer = null;
    
    public ChatFragment() {
        super();
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
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
    public void onPause() {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    private final void scrollToBottom() {
    }
    
    private final void pickFile() {
    }
}