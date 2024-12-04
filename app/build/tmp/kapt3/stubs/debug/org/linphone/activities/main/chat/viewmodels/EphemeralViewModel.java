package org.linphone.activities.main.chat.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/linphone/activities/main/chat/viewmodels/EphemeralViewModel;", "Landroidx/lifecycle/ViewModel;", "chatRoom", "Lorg/linphone/core/ChatRoom;", "(Lorg/linphone/core/ChatRoom;)V", "currentSelectedDuration", "", "getCurrentSelectedDuration", "()J", "setCurrentSelectedDuration", "(J)V", "durationsList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/chat/data/EphemeralDurationData;", "getDurationsList", "()Landroidx/lifecycle/MutableLiveData;", "listener", "Lorg/linphone/activities/main/chat/data/DurationItemClicked;", "computeEphemeralDurationValues", "", "updateChatRoomEphemeralDuration", "app_debug"})
public final class EphemeralViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoom chatRoom = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.EphemeralDurationData>> durationsList = null;
    private long currentSelectedDuration = 0L;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.chat.data.DurationItemClicked listener = null;
    
    public EphemeralViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatRoom chatRoom) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.EphemeralDurationData>> getDurationsList() {
        return null;
    }
    
    public final long getCurrentSelectedDuration() {
        return 0L;
    }
    
    public final void setCurrentSelectedDuration(long p0) {
    }
    
    public final void updateChatRoomEphemeralDuration() {
    }
    
    private final void computeEphemeralDurationValues() {
    }
}