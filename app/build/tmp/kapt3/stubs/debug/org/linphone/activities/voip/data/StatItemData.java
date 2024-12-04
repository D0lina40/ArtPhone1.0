package org.linphone.activities.voip.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lorg/linphone/activities/voip/data/StatItemData;", "", "type", "Lorg/linphone/activities/voip/data/StatType;", "(Lorg/linphone/activities/voip/data/StatType;)V", "getType", "()Lorg/linphone/activities/voip/data/StatType;", "value", "Landroidx/lifecycle/MutableLiveData;", "", "getValue", "()Landroidx/lifecycle/MutableLiveData;", "update", "", "call", "Lorg/linphone/core/Call;", "stats", "Lorg/linphone/core/CallStats;", "Companion", "app_debug"})
public final class StatItemData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.voip.data.StatType type = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> value = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.activities.voip.data.StatItemData.Companion Companion = null;
    
    public StatItemData(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.data.StatType type) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.voip.data.StatType getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getValue() {
        return null;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call, @org.jetbrains.annotations.NotNull
    org.linphone.core.CallStats stats) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/linphone/activities/voip/data/StatItemData$Companion;", "", "()V", "audioDeviceToString", "", "device", "Lorg/linphone/core/AudioDevice;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String audioDeviceToString(@org.jetbrains.annotations.Nullable
        org.linphone.core.AudioDevice device) {
            return null;
        }
    }
}