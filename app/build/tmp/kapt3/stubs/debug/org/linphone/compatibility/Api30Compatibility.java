package org.linphone.compatibility;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/compatibility/Api30Compatibility;", "", "()V", "Companion", "app_debug"})
@android.annotation.TargetApi(value = 30)
public final class Api30Compatibility {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.compatibility.Api30Compatibility.Companion Companion = null;
    
    public Api30Compatibility() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0014\u00a8\u0006\u0018"}, d2 = {"Lorg/linphone/compatibility/Api30Compatibility$Companion;", "", "()V", "hasReadPhoneNumbersPermission", "", "context", "Landroid/content/Context;", "hasTelecomManagerPermission", "hideAndroidSystemUI", "", "hide", "window", "Landroid/view/Window;", "removeChatRoomShortcut", "chatRoom", "Lorg/linphone/core/ChatRoom;", "requestReadPhoneNumbersPermission", "fragment", "Landroidx/fragment/app/Fragment;", "code", "", "requestTelecomManagerPermission", "activity", "Landroid/app/Activity;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean hasReadPhoneNumbersPermission(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        public final void requestReadPhoneNumbersPermission(@org.jetbrains.annotations.NotNull
        androidx.fragment.app.Fragment fragment, int code) {
        }
        
        public final void requestTelecomManagerPermission(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, int code) {
        }
        
        public final boolean hasTelecomManagerPermission(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        public final void removeChatRoomShortcut(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        org.linphone.core.ChatRoom chatRoom) {
        }
        
        public final void hideAndroidSystemUI(boolean hide, @org.jetbrains.annotations.NotNull
        android.view.Window window) {
        }
    }
}