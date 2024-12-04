package org.linphone.activities.main.chat.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0015"}, d2 = {"Lorg/linphone/activities/main/chat/data/EventLogData;", "", "eventLog", "Lorg/linphone/core/EventLog;", "(Lorg/linphone/core/EventLog;)V", "data", "Lorg/linphone/contact/GenericContactData;", "getData", "()Lorg/linphone/contact/GenericContactData;", "getEventLog", "()Lorg/linphone/core/EventLog;", "notifyId", "", "getNotifyId", "()I", "type", "Lorg/linphone/core/EventLog$Type;", "getType", "()Lorg/linphone/core/EventLog$Type;", "destroy", "", "app_debug"})
public final class EventLogData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.EventLog eventLog = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.EventLog.Type type = null;
    private final int notifyId = 0;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.contact.GenericContactData data = null;
    
    public EventLogData(@org.jetbrains.annotations.NotNull
    org.linphone.core.EventLog eventLog) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.EventLog getEventLog() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.EventLog.Type getType() {
        return null;
    }
    
    public final int getNotifyId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.contact.GenericContactData getData() {
        return null;
    }
    
    public final void destroy() {
    }
}