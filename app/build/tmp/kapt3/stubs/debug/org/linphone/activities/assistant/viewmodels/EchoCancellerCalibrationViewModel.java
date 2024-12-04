package org.linphone.activities.assistant.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/linphone/activities/assistant/viewmodels/EchoCancellerCalibrationViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "echoCalibrationTerminated", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getEchoCalibrationTerminated", "()Landroidx/lifecycle/MutableLiveData;", "listener", "Lorg/linphone/core/CoreListenerStub;", "echoCancellerCalibrationFinished", "", "status", "Lorg/linphone/core/EcCalibratorStatus;", "delay", "", "startEchoCancellerCalibration", "app_debug"})
public final class EchoCancellerCalibrationViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> echoCalibrationTerminated = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public EchoCancellerCalibrationViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getEchoCalibrationTerminated() {
        return null;
    }
    
    public final void startEchoCancellerCalibration() {
    }
    
    public final void echoCancellerCalibrationFinished(@org.jetbrains.annotations.NotNull
    org.linphone.core.EcCalibratorStatus status, int delay) {
    }
}