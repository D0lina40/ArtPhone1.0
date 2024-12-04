package org.linphone.activities.main.chat.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lorg/linphone/activities/main/chat/viewmodels/ImdnViewModel;", "Landroidx/lifecycle/ViewModel;", "chatMessage", "Lorg/linphone/core/ChatMessage;", "(Lorg/linphone/core/ChatMessage;)V", "chatMessageViewModel", "Lorg/linphone/activities/main/chat/data/ChatMessageData;", "getChatMessageViewModel", "()Lorg/linphone/activities/main/chat/data/ChatMessageData;", "listener", "Lorg/linphone/core/ChatMessageListenerStub;", "participants", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/chat/data/ImdnParticipantData;", "getParticipants", "()Landroidx/lifecycle/MutableLiveData;", "onCleared", "", "updateParticipantsLists", "app_debug"})
public final class ImdnViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatMessage chatMessage = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ImdnParticipantData>> participants = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.chat.data.ChatMessageData chatMessageViewModel = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatMessageListenerStub listener = null;
    
    public ImdnViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatMessage chatMessage) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ImdnParticipantData>> getParticipants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.chat.data.ChatMessageData getChatMessageViewModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    private final void updateParticipantsLists() {
    }
}