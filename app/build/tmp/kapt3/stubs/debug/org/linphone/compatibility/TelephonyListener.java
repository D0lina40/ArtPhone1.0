package org.linphone.compatibility;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/linphone/compatibility/TelephonyListener;", "Lorg/linphone/compatibility/PhoneStateInterface;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "(Landroid/telephony/TelephonyManager;)V", "gsmCallActive", "", "telephonyListener", "Lorg/linphone/compatibility/TelephonyListener$TelephonyListener;", "destroy", "", "isInCall", "runOnUiThreadExecutor", "Ljava/util/concurrent/Executor;", "TelephonyListener", "app_debug"})
@android.annotation.TargetApi(value = 31)
public final class TelephonyListener implements org.linphone.compatibility.PhoneStateInterface {
    @org.jetbrains.annotations.NotNull
    private final android.telephony.TelephonyManager telephonyManager = null;
    private boolean gsmCallActive = false;
    
    public TelephonyListener(@org.jetbrains.annotations.NotNull
    android.telephony.TelephonyManager telephonyManager) {
        super();
    }
    
    private final java.util.concurrent.Executor runOnUiThreadExecutor() {
        return null;
    }
    
    @java.lang.Override
    public void destroy() {
    }
    
    @java.lang.Override
    public boolean isInCall() {
        return false;
    }
}