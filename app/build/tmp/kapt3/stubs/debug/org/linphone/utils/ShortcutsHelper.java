package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lorg/linphone/utils/ShortcutsHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "Companion", "app_debug"})
@android.annotation.TargetApi(value = 25)
public final class ShortcutsHelper {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.ShortcutsHelper.Companion Companion = null;
    
    public ShortcutsHelper(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0012"}, d2 = {"Lorg/linphone/utils/ShortcutsHelper$Companion;", "", "()V", "createChatRoomShortcut", "Landroidx/core/content/pm/ShortcutInfoCompat;", "context", "Landroid/content/Context;", "chatRoom", "Lorg/linphone/core/ChatRoom;", "createContactShortcut", "contact", "Lorg/linphone/core/Friend;", "createShortcutsToChatRooms", "", "createShortcutsToContacts", "isShortcutToChatRoomAlreadyCreated", "", "removeShortcuts", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void createShortcutsToContacts(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        private final androidx.core.content.pm.ShortcutInfoCompat createContactShortcut(android.content.Context context, org.linphone.core.Friend contact) {
            return null;
        }
        
        public final void createShortcutsToChatRooms(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        private final androidx.core.content.pm.ShortcutInfoCompat createChatRoomShortcut(android.content.Context context, org.linphone.core.ChatRoom chatRoom) {
            return null;
        }
        
        public final void removeShortcuts(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
        }
        
        public final boolean isShortcutToChatRoomAlreadyCreated(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        org.linphone.core.ChatRoom chatRoom) {
            return false;
        }
    }
}