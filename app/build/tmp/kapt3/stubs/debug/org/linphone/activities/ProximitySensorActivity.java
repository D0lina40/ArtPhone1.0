package org.linphone.activities;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0004J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\tH\u0014J\b\u0010\u000f\u001a\u00020\tH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/linphone/activities/ProximitySensorActivity;", "Lorg/linphone/activities/GenericActivity;", "()V", "proximitySensorEnabled", "", "proximityWakeLock", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "enableProximitySensor", "", "enable", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "app_debug"})
public abstract class ProximitySensorActivity extends org.linphone.activities.GenericActivity {
    private android.os.PowerManager.WakeLock proximityWakeLock;
    private boolean proximitySensorEnabled = false;
    
    public ProximitySensorActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onPause() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    protected final void enableProximitySensor(boolean enable) {
    }
}