package org.linphone.compatibility;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/linphone/compatibility/PhoneStateListener;", "Lorg/linphone/compatibility/PhoneStateInterface;", "telephonyManager", "Landroid/telephony/TelephonyManager;", "(Landroid/telephony/TelephonyManager;)V", "gsmCallActive", "", "phoneStateListener", "Landroid/telephony/PhoneStateListener;", "destroy", "", "isInCall", "app_debug"})
public final class PhoneStateListener implements org.linphone.compatibility.PhoneStateInterface {
    @org.jetbrains.annotations.NotNull
    private final android.telephony.TelephonyManager telephonyManager = null;
    private boolean gsmCallActive = false;
    @org.jetbrains.annotations.NotNull
    private final android.telephony.PhoneStateListener phoneStateListener = null;
    
    public PhoneStateListener(@org.jetbrains.annotations.NotNull
    android.telephony.TelephonyManager telephonyManager) {
        super();
    }
    
    @java.lang.Override
    public void destroy() {
    }
    
    @java.lang.Override
    public boolean isInCall() {
        return false;
    }
}