package org.linphone.activities.voip.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\b\u0010\u0011\u001a\u00020\u000eH\u0014R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/linphone/activities/voip/viewmodels/StatisticsListViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "callStatsList", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/voip/data/CallStatisticsData;", "getCallStatsList", "()Landroidx/lifecycle/MutableLiveData;", "enabled", "", "listener", "Lorg/linphone/core/CoreListenerStub;", "computeCallsList", "", "disable", "enable", "onCleared", "app_debug"})
public final class StatisticsListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.CallStatisticsData>> callStatsList = null;
    private boolean enabled = false;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public StatisticsListViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.CallStatisticsData>> getCallStatsList() {
        return null;
    }
    
    public final void enable() {
    }
    
    public final void disable() {
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    private final void computeCallsList() {
    }
}