package org.linphone.activities.main.chat;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bH$J \u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u000bH$J\b\u0010\u0013\u001a\u00020\u000bH$R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/linphone/activities/main/chat/ChatScrollListener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "mLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "loading", "", "previousTotalItemCount", "", "userHasScrolledUp", "onLoadMore", "", "totalItemsCount", "onScrolled", "view", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "dy", "onScrolledToEnd", "onScrolledUp", "Companion", "app_debug"})
public abstract class ChatScrollListener extends androidx.recyclerview.widget.RecyclerView.OnScrollListener {
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.LinearLayoutManager mLayoutManager = null;
    private int previousTotalItemCount = 0;
    private boolean loading = true;
    private boolean userHasScrolledUp = false;
    private static final int mVisibleThreshold = 5;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.activities.main.chat.ChatScrollListener.Companion Companion = null;
    
    public ChatScrollListener(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.LinearLayoutManager mLayoutManager) {
        super();
    }
    
    @java.lang.Override
    public void onScrolled(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView view, int dx, int dy) {
    }
    
    protected abstract void onLoadMore(int totalItemsCount);
    
    protected abstract void onScrolledUp();
    
    protected abstract void onScrolledToEnd();
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/linphone/activities/main/chat/ChatScrollListener$Companion;", "", "()V", "mVisibleThreshold", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}