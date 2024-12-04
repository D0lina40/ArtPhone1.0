package org.linphone.activities.chat_bubble;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0014J\b\u0010\u0017\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/linphone/activities/chat_bubble/ChatBubbleActivity;", "Lorg/linphone/activities/GenericActivity;", "()V", "adapter", "Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter;", "binding", "Lorg/linphone/databinding/ChatBubbleActivityBinding;", "chatSendingViewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatMessageSendingViewModel;", "listViewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatMessagesListViewModel;", "listener", "Lorg/linphone/core/ChatRoomListenerStub;", "observer", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "viewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatRoomViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "scrollToBottom", "app_debug"})
public final class ChatBubbleActivity extends org.linphone.activities.GenericActivity {
    private org.linphone.databinding.ChatBubbleActivityBinding binding;
    private org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel viewModel;
    private org.linphone.activities.main.chat.viewmodels.ChatMessagesListViewModel listViewModel;
    private org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel;
    private org.linphone.activities.main.chat.adapters.ChatMessagesListAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.RecyclerView.AdapterDataObserver observer = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoomListenerStub listener = null;
    
    public ChatBubbleActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    private final void scrollToBottom() {
    }
}