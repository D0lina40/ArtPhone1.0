package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/utils/PowerManagerUtils;", "", "()V", "Companion", "app_debug"})
public final class PowerManagerUtils {
    @org.jetbrains.annotations.NotNull
    private static final android.content.Intent[] POWER_MANAGER_INTENTS = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.PowerManagerUtils.Companion Companion = null;
    
    public PowerManagerUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0005H\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lorg/linphone/utils/PowerManagerUtils$Companion;", "", "()V", "POWER_MANAGER_INTENTS", "", "Landroid/content/Intent;", "[Landroid/content/Intent;", "getDevicePowerManagerIntent", "context", "Landroid/content/Context;", "isIntentCallable", "", "intent", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.content.Intent getDevicePowerManagerIntent(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final boolean isIntentCallable(android.content.Context context, android.content.Intent intent) {
            return false;
        }
    }
}