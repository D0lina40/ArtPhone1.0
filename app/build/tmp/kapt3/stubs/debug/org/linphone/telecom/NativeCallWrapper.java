package org.linphone.telecom;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\b\u0010\u0019\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u001b\u001a\u00020\u000eH\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0002J\u0006\u0010\u001d\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u001e"}, d2 = {"Lorg/linphone/telecom/NativeCallWrapper;", "Landroid/telecom/Connection;", "callId", "", "(Ljava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "setCallId", "getCall", "Lorg/linphone/core/Call;", "intStateToString", "state", "", "onAbort", "", "onAnswer", "videoState", "onCallAudioStateChanged", "Landroid/telecom/CallAudioState;", "onDisconnect", "onHold", "onPlayDtmfTone", "c", "", "onReject", "onSilence", "onStateChanged", "onUnhold", "selfDestroy", "stateAsString", "app_debug"})
@android.annotation.TargetApi(value = 29)
public final class NativeCallWrapper extends android.telecom.Connection {
    @org.jetbrains.annotations.NotNull
    private java.lang.String callId;
    
    public NativeCallWrapper(@org.jetbrains.annotations.NotNull
    java.lang.String callId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCallId() {
        return null;
    }
    
    public final void setCallId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @java.lang.Override
    public void onStateChanged(int state) {
    }
    
    @java.lang.Override
    public void onAnswer(int videoState) {
    }
    
    @java.lang.Override
    public void onHold() {
    }
    
    @java.lang.Override
    public void onUnhold() {
    }
    
    @java.lang.Override
    public void onCallAudioStateChanged(@org.jetbrains.annotations.NotNull
    android.telecom.CallAudioState state) {
    }
    
    @java.lang.Override
    public void onPlayDtmfTone(char c) {
    }
    
    @java.lang.Override
    public void onDisconnect() {
    }
    
    @java.lang.Override
    public void onAbort() {
    }
    
    @java.lang.Override
    public void onReject() {
    }
    
    @java.lang.Override
    public void onSilence() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String stateAsString() {
        return null;
    }
    
    private final org.linphone.core.Call getCall() {
        return null;
    }
    
    private final void selfDestroy() {
    }
    
    private final java.lang.String intStateToString(int state) {
        return null;
    }
}