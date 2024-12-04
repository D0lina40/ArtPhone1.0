package org.linphone.activities.main.chat.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\b\u0018\u0000 _2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0003^_`B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010B\u001a\u00020CH\u0002J\u0014\u0010D\u001a\u00060ER\u00020\u00002\u0006\u0010F\u001a\u00020GH\u0002J\u0014\u0010H\u001a\u00060IR\u00020\u00002\u0006\u0010F\u001a\u00020GH\u0002J\u0006\u0010J\u001a\u00020CJ\u0010\u0010K\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u001fH\u0016J\u0006\u0010M\u001a\u00020\u001fJ\u0018\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u001fH\u0016J\u0010\u0010R\u001a\u00020\u001f2\u0006\u0010L\u001a\u00020\u001fH\u0016J\u0018\u0010S\u001a\u00020C2\u0006\u0010T\u001a\u00020\u00032\u0006\u0010L\u001a\u00020\u001fH\u0016J\u0018\u0010U\u001a\u00020\u00032\u0006\u0010F\u001a\u00020G2\u0006\u0010V\u001a\u00020\u001fH\u0016J$\u0010W\u001a\u00020C2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00020Y2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00020YH\u0016J\u0016\u0010[\u001a\u00020C2\u0006\u0010\\\u001a\u00020\u001f2\u0006\u0010]\u001a\u00020\u0013R\'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R5\u0010\u0014\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00150\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000fR\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001c\u0010\u000fR\'\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b \u0010\u000fR\u000e\u0010\"\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\u0011\u001a\u0004\b$\u0010\u000fR\'\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b)\u0010\u0011\u001a\u0004\b(\u0010\u000fR\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u0011\u001a\u0004\b-\u0010\u000fR\'\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b1\u0010\u0011\u001a\u0004\b0\u0010\u000fR\'\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b4\u0010\u0011\u001a\u0004\b3\u0010\u000fR\'\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b7\u0010\u0011\u001a\u0004\b6\u0010\u000fR\'\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\u0011\u001a\u0004\b9\u0010\u000fR\'\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b=\u0010\u0011\u001a\u0004\b<\u0010\u000fR\u000e\u0010>\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\'\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bA\u0010\u0011\u001a\u0004\b@\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006a"}, d2 = {"Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter;", "Lorg/linphone/activities/main/adapters/SelectionListAdapter;", "Lorg/linphone/activities/main/chat/data/EventLogData;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/linphone/utils/HeaderAdapter;", "selectionVM", "Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "addSipUriToContactEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getAddSipUriToContactEvent", "()Landroidx/lifecycle/MutableLiveData;", "addSipUriToContactEvent$delegate", "Lkotlin/Lazy;", "advancedContextMenuOptionsDisabled", "", "callConferenceEvent", "Lkotlin/Pair;", "getCallConferenceEvent", "callConferenceEvent$delegate", "contentClickedListener", "Lorg/linphone/activities/main/chat/data/OnContentClickedListener;", "deleteMessageEvent", "Lorg/linphone/core/ChatMessage;", "getDeleteMessageEvent", "deleteMessageEvent$delegate", "errorEvent", "", "getErrorEvent", "errorEvent$delegate", "firstUnreadMessagePosition", "forwardMessageEvent", "getForwardMessageEvent", "forwardMessageEvent$delegate", "openContentEvent", "Lorg/linphone/core/Content;", "getOpenContentEvent", "openContentEvent$delegate", "popup", "Landroid/widget/PopupWindow;", "replyMessageEvent", "getReplyMessageEvent", "replyMessageEvent$delegate", "resendMessageEvent", "getResendMessageEvent", "resendMessageEvent$delegate", "scrollToChatMessageEvent", "getScrollToChatMessageEvent", "scrollToChatMessageEvent$delegate", "showImdnForMessageEvent", "getShowImdnForMessageEvent", "showImdnForMessageEvent$delegate", "showReactionsListEvent", "getShowReactionsListEvent", "showReactionsListEvent$delegate", "sipUriClickedEvent", "getSipUriClickedEvent", "sipUriClickedEvent$delegate", "unreadMessagesCount", "urlClickEvent", "getUrlClickEvent", "urlClickEvent$delegate", "computeFirstUnreadMessagePosition", "", "createChatMessageViewHolder", "Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter$ChatMessageViewHolder;", "parent", "Landroid/view/ViewGroup;", "createEventViewHolder", "Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter$EventViewHolder;", "disableAdvancedContextMenuOptions", "displayHeaderForPosition", "position", "getFirstUnreadMessagePosition", "getHeaderViewForPosition", "Landroid/view/View;", "context", "Landroid/content/Context;", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "viewType", "onCurrentListChanged", "previousList", "", "currentList", "setUnreadMessageCount", "count", "forceUpdate", "ChatMessageViewHolder", "Companion", "EventViewHolder", "app_debug"})
public final class ChatMessagesListAdapter extends org.linphone.activities.main.adapters.SelectionListAdapter<org.linphone.activities.main.chat.data.EventLogData, androidx.recyclerview.widget.RecyclerView.ViewHolder> implements org.linphone.utils.HeaderAdapter {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleOwner viewLifecycleOwner = null;
    public static final int MAX_TIME_TO_GROUP_MESSAGES = 60;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy resendMessageEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy deleteMessageEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy forwardMessageEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy replyMessageEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy showImdnForMessageEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy addSipUriToContactEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy openContentEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy urlClickEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sipUriClickedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy callConferenceEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy scrollToChatMessageEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy showReactionsListEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy errorEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.chat.data.OnContentClickedListener contentClickedListener = null;
    private boolean advancedContextMenuOptionsDisabled = false;
    @org.jetbrains.annotations.Nullable
    private android.widget.PopupWindow popup;
    private int unreadMessagesCount = 0;
    private int firstUnreadMessagePosition = -1;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.activities.main.chat.adapters.ChatMessagesListAdapter.Companion Companion = null;
    
    public ChatMessagesListAdapter(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionVM, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatMessage>> getResendMessageEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatMessage>> getDeleteMessageEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatMessage>> getForwardMessageEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatMessage>> getReplyMessageEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatMessage>> getShowImdnForMessageEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getAddSipUriToContactEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.Content>> getOpenContentEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getUrlClickEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getSipUriClickedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<kotlin.Pair<java.lang.String, java.lang.String>>> getCallConferenceEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatMessage>> getScrollToChatMessageEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatMessage>> getShowReactionsListEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Integer>> getErrorEvent() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    private final org.linphone.activities.main.chat.adapters.ChatMessagesListAdapter.ChatMessageViewHolder createChatMessageViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    private final org.linphone.activities.main.chat.adapters.ChatMessagesListAdapter.EventViewHolder createEventViewHolder(android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public void onCurrentListChanged(@org.jetbrains.annotations.NotNull
    java.util.List<org.linphone.activities.main.chat.data.EventLogData> previousList, @org.jetbrains.annotations.NotNull
    java.util.List<org.linphone.activities.main.chat.data.EventLogData> currentList) {
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
    
    public final void disableAdvancedContextMenuOptions() {
    }
    
    public final void setUnreadMessageCount(int count, boolean forceUpdate) {
    }
    
    public final int getFirstUnreadMessagePosition() {
        return 0;
    }
    
    private final void computeFirstUnreadMessagePosition() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010\u0014\u001a\u00020\bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0015"}, d2 = {"Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter$ChatMessageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/linphone/databinding/ChatMessageListCellBinding;", "(Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter;Lorg/linphone/databinding/ChatMessageListCellBinding;)V", "getBinding", "()Lorg/linphone/databinding/ChatMessageListCellBinding;", "addSenderToContacts", "", "bind", "eventLog", "Lorg/linphone/activities/main/chat/data/EventLogData;", "copyTextToClipboard", "deleteMessage", "forwardMessage", "reactToMessage", "reaction", "", "replyMessage", "resendMessage", "showImdnDeliveryFragment", "app_debug"})
    public final class ChatMessageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.linphone.databinding.ChatMessageListCellBinding binding = null;
        
        public ChatMessageViewHolder(@org.jetbrains.annotations.NotNull
        org.linphone.databinding.ChatMessageListCellBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.databinding.ChatMessageListCellBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.linphone.activities.main.chat.data.EventLogData eventLog) {
        }
        
        private final void reactToMessage(java.lang.String reaction) {
        }
        
        private final void resendMessage() {
        }
        
        private final void copyTextToClipboard() {
        }
        
        private final void forwardMessage() {
        }
        
        private final void replyMessage() {
        }
        
        private final void showImdnDeliveryFragment() {
        }
        
        private final void deleteMessage() {
        }
        
        private final void addSenderToContacts() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter$Companion;", "", "()V", "MAX_TIME_TO_GROUP_MESSAGES", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter$EventViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/linphone/databinding/ChatEventListCellBinding;", "(Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter;Lorg/linphone/databinding/ChatEventListCellBinding;)V", "bind", "", "eventLog", "Lorg/linphone/activities/main/chat/data/EventLogData;", "app_debug"})
    public final class EventViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.linphone.databinding.ChatEventListCellBinding binding = null;
        
        public EventViewHolder(@org.jetbrains.annotations.NotNull
        org.linphone.databinding.ChatEventListCellBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.linphone.activities.main.chat.data.EventLogData eventLog) {
        }
    }
}