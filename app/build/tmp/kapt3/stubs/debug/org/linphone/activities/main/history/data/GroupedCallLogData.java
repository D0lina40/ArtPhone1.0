package org.linphone.activities.main.history.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006!"}, d2 = {"Lorg/linphone/activities/main/history/data/GroupedCallLogData;", "", "callLog", "Lorg/linphone/core/CallLog;", "(Lorg/linphone/core/CallLog;)V", "_lastCallLogViewModel", "Lorg/linphone/activities/main/history/viewmodels/CallLogViewModel;", "callLogs", "Ljava/util/ArrayList;", "getCallLogs", "()Ljava/util/ArrayList;", "lastCallLog", "getLastCallLog", "()Lorg/linphone/core/CallLog;", "setLastCallLog", "lastCallLogId", "", "getLastCallLogId", "()Ljava/lang/String;", "setLastCallLogId", "(Ljava/lang/String;)V", "lastCallLogStartTimestamp", "", "getLastCallLogStartTimestamp", "()J", "setLastCallLogStartTimestamp", "(J)V", "lastCallLogViewModel", "getLastCallLogViewModel", "()Lorg/linphone/activities/main/history/viewmodels/CallLogViewModel;", "destroy", "", "updateLastCallLog", "app_debug"})
public final class GroupedCallLogData {
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<org.linphone.core.CallLog> callLogs = null;
    @org.jetbrains.annotations.NotNull
    private org.linphone.core.CallLog lastCallLog;
    @org.jetbrains.annotations.Nullable
    private java.lang.String lastCallLogId;
    private long lastCallLogStartTimestamp;
    private org.linphone.activities.main.history.viewmodels.CallLogViewModel _lastCallLogViewModel;
    
    public GroupedCallLogData(@org.jetbrains.annotations.NotNull
    org.linphone.core.CallLog callLog) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<org.linphone.core.CallLog> getCallLogs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.CallLog getLastCallLog() {
        return null;
    }
    
    public final void setLastCallLog(@org.jetbrains.annotations.NotNull
    org.linphone.core.CallLog p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLastCallLogId() {
        return null;
    }
    
    public final void setLastCallLogId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final long getLastCallLogStartTimestamp() {
        return 0L;
    }
    
    public final void setLastCallLogStartTimestamp(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.history.viewmodels.CallLogViewModel getLastCallLogViewModel() {
        return null;
    }
    
    public final void destroy() {
    }
    
    public final void updateLastCallLog(@org.jetbrains.annotations.NotNull
    org.linphone.core.CallLog callLog) {
    }
}