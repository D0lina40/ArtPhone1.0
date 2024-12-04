package org.linphone.telecom;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\u0006H\u0016J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/linphone/telecom/TelecomConnectionService;", "Landroid/telecom/ConnectionService;", "()V", "listener", "Lorg/linphone/core/CoreListenerStub;", "onCallConnected", "", "call", "Lorg/linphone/core/Call;", "onCallEnded", "onCallError", "onCallPaused", "onCreate", "onCreateIncomingConnection", "Landroid/telecom/Connection;", "connectionManagerPhoneAccount", "Landroid/telecom/PhoneAccountHandle;", "request", "Landroid/telecom/ConnectionRequest;", "onCreateOutgoingConnection", "onUnbind", "", "intent", "Landroid/content/Intent;", "app_debug"})
@android.annotation.TargetApi(value = 29)
public final class TelecomConnectionService extends android.telecom.ConnectionService {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public TelecomConnectionService() {
        super();
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    @java.lang.Override
    public boolean onUnbind(@org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
        return false;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.telecom.Connection onCreateOutgoingConnection(@org.jetbrains.annotations.Nullable
    android.telecom.PhoneAccountHandle connectionManagerPhoneAccount, @org.jetbrains.annotations.NotNull
    android.telecom.ConnectionRequest request) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.telecom.Connection onCreateIncomingConnection(@org.jetbrains.annotations.Nullable
    android.telecom.PhoneAccountHandle connectionManagerPhoneAccount, @org.jetbrains.annotations.NotNull
    android.telecom.ConnectionRequest request) {
        return null;
    }
    
    private final void onCallError(org.linphone.core.Call call) {
    }
    
    private final void onCallEnded(org.linphone.core.Call call) {
    }
    
    private final void onCallPaused(org.linphone.core.Call call) {
    }
    
    private final void onCallConnected(org.linphone.core.Call call) {
    }
}