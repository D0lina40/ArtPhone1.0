package org.linphone.activities.voip.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0002R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\nR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\n\u00a8\u0006\u001f"}, d2 = {"Lorg/linphone/activities/voip/data/CallStatisticsData;", "Lorg/linphone/contact/GenericContactData;", "call", "Lorg/linphone/core/Call;", "(Lorg/linphone/core/Call;)V", "audioStats", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lorg/linphone/activities/voip/data/StatItemData;", "getAudioStats", "()Landroidx/lifecycle/MutableLiveData;", "getCall", "()Lorg/linphone/core/Call;", "enabled", "", "isVideoEnabled", "listener", "Lorg/linphone/core/CallListenerStub;", "mediaEncryptionStats", "getMediaEncryptionStats", "videoStats", "getVideoStats", "destroy", "", "disable", "enable", "initCallStats", "updateCallStats", "stats", "Lorg/linphone/core/CallStats;", "updateMediaEncryptionStats", "app_debug"})
public final class CallStatisticsData extends org.linphone.contact.GenericContactData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Call call = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> audioStats = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> videoStats = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> mediaEncryptionStats = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoEnabled = null;
    private boolean enabled = false;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CallListenerStub listener = null;
    
    public CallStatisticsData(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Call getCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> getAudioStats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> getVideoStats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> getMediaEncryptionStats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoEnabled() {
        return null;
    }
    
    public final void enable() {
    }
    
    public final void disable() {
    }
    
    @java.lang.Override
    public void destroy() {
    }
    
    private final void updateMediaEncryptionStats() {
    }
    
    private final void initCallStats() {
    }
    
    private final void updateCallStats(org.linphone.core.CallStats stats) {
    }
}