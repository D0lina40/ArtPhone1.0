package org.linphone.activities.main.chat.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000eH\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0005\u0010\u0007R\u001b\u0010\n\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lorg/linphone/activities/main/chat/data/EventData;", "Lorg/linphone/contact/GenericContactData;", "eventLog", "Lorg/linphone/core/EventLog;", "(Lorg/linphone/core/EventLog;)V", "isGroupLeft", "", "()Z", "isGroupLeft$delegate", "Lkotlin/Lazy;", "isSecurity", "isSecurity$delegate", "text", "Landroidx/lifecycle/MutableLiveData;", "", "getText", "()Landroidx/lifecycle/MutableLiveData;", "formatEphemeralExpiration", "context", "Landroid/content/Context;", "duration", "", "getName", "updateEventText", "", "app_debug"})
public final class EventData extends org.linphone.contact.GenericContactData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.EventLog eventLog = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> text = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy isSecurity$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy isGroupLeft$delegate = null;
    
    public EventData(@org.jetbrains.annotations.NotNull
    org.linphone.core.EventLog eventLog) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getText() {
        return null;
    }
    
    public final boolean isSecurity() {
        return false;
    }
    
    public final boolean isGroupLeft() {
        return false;
    }
    
    private final java.lang.String getName() {
        return null;
    }
    
    private final void updateEventText() {
    }
    
    private final java.lang.String formatEphemeralExpiration(android.content.Context context, long duration) {
        return null;
    }
}