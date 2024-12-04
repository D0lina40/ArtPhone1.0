package org.linphone.utils;

/**
 * Helper methods to check whether a permission has been granted and log the result
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/linphone/utils/PermissionHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "hasCameraPermission", "", "hasPermission", "permission", "", "hasPostNotificationsPermission", "hasReadContactsPermission", "hasReadExternalStoragePermission", "hasReadPhoneStateOrPhoneNumbersPermission", "hasReadPhoneStatePermission", "hasRecordAudioPermission", "hasWriteContactsPermission", "hasWriteExternalStoragePermission", "Companion", "app_debug"})
public final class PermissionHelper {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.PermissionHelper.Companion Companion = null;
    
    private PermissionHelper(android.content.Context context) {
        super();
    }
    
    private final boolean hasPermission(java.lang.String permission) {
        return false;
    }
    
    public final boolean hasReadContactsPermission() {
        return false;
    }
    
    public final boolean hasWriteContactsPermission() {
        return false;
    }
    
    public final boolean hasReadPhoneStatePermission() {
        return false;
    }
    
    public final boolean hasReadPhoneStateOrPhoneNumbersPermission() {
        return false;
    }
    
    public final boolean hasReadExternalStoragePermission() {
        return false;
    }
    
    public final boolean hasWriteExternalStoragePermission() {
        return false;
    }
    
    public final boolean hasCameraPermission() {
        return false;
    }
    
    public final boolean hasRecordAudioPermission() {
        return false;
    }
    
    public final boolean hasPostNotificationsPermission() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/linphone/utils/PermissionHelper$Companion;", "Lorg/linphone/utils/SingletonHolder;", "Lorg/linphone/utils/PermissionHelper;", "Landroid/content/Context;", "()V", "app_debug"})
    public static final class Companion extends org.linphone.utils.SingletonHolder<org.linphone.utils.PermissionHelper, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}