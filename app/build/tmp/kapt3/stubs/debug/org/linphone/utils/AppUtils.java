package org.linphone.utils;

/**
 * Various utility methods for application
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lorg/linphone/utils/AppUtils;", "", "()V", "Companion", "KeyboardVisibilityListener", "app_debug"})
public final class AppUtils {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.AppUtils.Companion Companion = null;
    
    public AppUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\b\b\u0002\u0010\u001f\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010!\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018J\u001e\u0010!\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\fJ\n\u0010$\u001a\u0004\u0018\u00010\u0004H\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\'\u001a\u00020&2\u0006\u0010(\u001a\u00020\fJ\u000e\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u0014J\u0016\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010-\u001a\u00020\bJ\u0016\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u00062"}, d2 = {"Lorg/linphone/utils/AppUtils$Companion;", "", "()V", "emojiCompat", "Landroidx/emoji2/text/EmojiCompat;", "getEmojiCompat", "()Landroidx/emoji2/text/EmojiCompat;", "acquireAudioFocusForVoiceRecordingOrPlayback", "Landroidx/media/AudioFocusRequestCompat;", "context", "Landroid/content/Context;", "bytesToDisplayableSize", "", "bytes", "", "createBundleWithSharedTextAndFiles", "Landroid/os/Bundle;", "sharedViewModel", "Lorg/linphone/activities/main/viewmodels/SharedMainViewModel;", "dpToPixels", "", "dp", "getDimension", "id", "", "getDividerDecoration", "Landroidx/recyclerview/widget/DividerItemDecoration;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getInitials", "displayName", "limit", "getString", "getStringWithPlural", "count", "value", "initEmojiCompat", "isMediaVolumeLow", "", "isTextOnlyContainingEmoji", "text", "pixelsToDp", "pixels", "releaseAudioFocusForVoiceRecordingOrPlayback", "", "request", "shareUploadedLogsUrl", "activity", "Landroid/app/Activity;", "info", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final androidx.emoji2.text.EmojiCompat getEmojiCompat() {
            return null;
        }
        
        private final androidx.emoji2.text.EmojiCompat initEmojiCompat() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getString(int id) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStringWithPlural(int id, int count) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getStringWithPlural(int id, int count, @org.jetbrains.annotations.NotNull
        java.lang.String value) {
            return null;
        }
        
        public final float getDimension(int id) {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getInitials(@org.jetbrains.annotations.NotNull
        java.lang.String displayName, int limit) {
            return null;
        }
        
        public final boolean isTextOnlyContainingEmoji(@org.jetbrains.annotations.NotNull
        java.lang.String text) {
            return false;
        }
        
        public final float pixelsToDp(float pixels) {
            return 0.0F;
        }
        
        public final float dpToPixels(@org.jetbrains.annotations.NotNull
        android.content.Context context, float dp) {
            return 0.0F;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String bytesToDisplayableSize(long bytes) {
            return null;
        }
        
        public final void shareUploadedLogsUrl(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, @org.jetbrains.annotations.NotNull
        java.lang.String info) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.recyclerview.widget.DividerItemDecoration getDividerDecoration(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.recyclerview.widget.LinearLayoutManager layoutManager) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.os.Bundle createBundleWithSharedTextAndFiles(@org.jetbrains.annotations.NotNull
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedViewModel) {
            return null;
        }
        
        public final boolean isMediaVolumeLow(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final androidx.media.AudioFocusRequestCompat acquireAudioFocusForVoiceRecordingOrPlayback(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        public final void releaseAudioFocusForVoiceRecordingOrPlayback(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        androidx.media.AudioFocusRequestCompat request) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/linphone/utils/AppUtils$KeyboardVisibilityListener;", "", "onKeyboardVisibilityChanged", "", "visible", "", "app_debug"})
    public static abstract interface KeyboardVisibilityListener {
        
        public abstract void onKeyboardVisibilityChanged(boolean visible);
    }
}