package org.linphone.activities.main.chat.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0006\u0010\u000f\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0010"}, d2 = {"Lorg/linphone/activities/main/chat/viewmodels/DevicesListViewModel;", "Landroidx/lifecycle/ViewModel;", "chatRoom", "Lorg/linphone/core/ChatRoom;", "(Lorg/linphone/core/ChatRoom;)V", "listener", "Lorg/linphone/core/ChatRoomListenerStub;", "participants", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/chat/data/DevicesListGroupData;", "getParticipants", "()Landroidx/lifecycle/MutableLiveData;", "onCleared", "", "updateParticipants", "app_debug"})
public final class DevicesListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoom chatRoom = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListGroupData>> participants = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoomListenerStub listener = null;
    
    public DevicesListViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatRoom chatRoom) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListGroupData>> getParticipants() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void updateParticipants() {
    }
}