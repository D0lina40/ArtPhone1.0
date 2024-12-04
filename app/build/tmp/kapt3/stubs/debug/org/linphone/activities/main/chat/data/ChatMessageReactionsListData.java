package org.linphone.activities.main.chat.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0006J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\fR\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001e"}, d2 = {"Lorg/linphone/activities/main/chat/data/ChatMessageReactionsListData;", "", "chatMessage", "Lorg/linphone/core/ChatMessage;", "(Lorg/linphone/core/ChatMessage;)V", "filter", "", "filteredReactions", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/chat/data/ChatMessageReactionData;", "getFilteredReactions", "()Landroidx/lifecycle/MutableLiveData;", "listener", "Lorg/linphone/core/ChatMessageListenerStub;", "getListener", "()Lorg/linphone/core/ChatMessageListenerStub;", "reactions", "Lorg/linphone/core/ChatMessageReaction;", "getReactions", "reactionsMap", "Ljava/util/HashMap;", "", "getReactionsMap", "()Ljava/util/HashMap;", "onDestroy", "", "updateFilteredReactions", "newFilter", "updateReactionsList", "app_debug"})
public final class ChatMessageReactionsListData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatMessage chatMessage = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.ChatMessageReaction>> reactions = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageReactionData>> filteredReactions = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.HashMap<java.lang.String, java.lang.Integer> reactionsMap = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatMessageListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String filter = "";
    
    public ChatMessageReactionsListData(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatMessage chatMessage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.ChatMessageReaction>> getReactions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageReactionData>> getFilteredReactions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.HashMap<java.lang.String, java.lang.Integer> getReactionsMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.ChatMessageListenerStub getListener() {
        return null;
    }
    
    public final void onDestroy() {
    }
    
    public final void updateFilteredReactions(@org.jetbrains.annotations.NotNull
    java.lang.String newFilter) {
    }
    
    private final void updateReactionsList(org.linphone.core.ChatMessage chatMessage) {
    }
}