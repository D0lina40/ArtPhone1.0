package org.linphone.activities.main.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lorg/linphone/activities/main/viewmodels/MessageNotifierViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "onMessageToNotifyEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getOnMessageToNotifyEvent", "()Landroidx/lifecycle/MutableLiveData;", "app_debug"})
public abstract class MessageNotifierViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Integer>> onMessageToNotifyEvent = null;
    
    public MessageNotifierViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Integer>> getOnMessageToNotifyEvent() {
        return null;
    }
}