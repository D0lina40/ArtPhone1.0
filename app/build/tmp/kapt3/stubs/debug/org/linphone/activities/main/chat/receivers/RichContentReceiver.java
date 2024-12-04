package org.linphone.activities.main.chat.receivers;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB(\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\u0002\u0010\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004\u00a2\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/linphone/activities/main/chat/receivers/RichContentReceiver;", "Landroidx/core/view/OnReceiveContentListener;", "contentReceived", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", "name", "uri", "", "(Lkotlin/jvm/functions/Function1;)V", "onReceiveContent", "Landroidx/core/view/ContentInfoCompat;", "view", "Landroid/view/View;", "payload", "Companion", "app_debug"})
public final class RichContentReceiver implements androidx.core.view.OnReceiveContentListener {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> contentReceived = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] MIME_TYPES = {"image/png", "image/gif", "image/jpeg"};
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.activities.main.chat.receivers.RichContentReceiver.Companion Companion = null;
    
    public RichContentReceiver(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> contentReceived) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public androidx.core.view.ContentInfoCompat onReceiveContent(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    androidx.core.view.ContentInfoCompat payload) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/linphone/activities/main/chat/receivers/RichContentReceiver$Companion;", "", "()V", "MIME_TYPES", "", "", "getMIME_TYPES", "()[Ljava/lang/String;", "[Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] getMIME_TYPES() {
            return null;
        }
    }
}