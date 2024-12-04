package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR&\u0010\u0003\u001a\u001a\u0012\b\u0012\u00060\u0005R\u00020\u00000\u0004j\f\u0012\b\u0012\u00060\u0005R\u00020\u0000`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/linphone/utils/PatternClickableSpan;", "", "()V", "patterns", "Ljava/util/ArrayList;", "Lorg/linphone/utils/PatternClickableSpan$SpannablePatternItem;", "Lkotlin/collections/ArrayList;", "add", "pattern", "Ljava/util/regex/Pattern;", "listener", "Lorg/linphone/utils/PatternClickableSpan$SpannableClickedListener;", "build", "Landroid/text/SpannableStringBuilder;", "editable", "", "SpannableClickedListener", "SpannablePatternItem", "StyledClickableSpan", "app_debug"})
public final class PatternClickableSpan {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<org.linphone.utils.PatternClickableSpan.SpannablePatternItem> patterns;
    
    public PatternClickableSpan() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.utils.PatternClickableSpan add(@org.jetbrains.annotations.NotNull
    java.util.regex.Pattern pattern, @org.jetbrains.annotations.NotNull
    org.linphone.utils.PatternClickableSpan.SpannableClickedListener listener) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.text.SpannableStringBuilder build(@org.jetbrains.annotations.Nullable
    java.lang.CharSequence editable) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lorg/linphone/utils/PatternClickableSpan$SpannableClickedListener;", "", "onSpanClicked", "", "text", "", "app_debug"})
    public static abstract interface SpannableClickedListener {
        
        public abstract void onSpanClicked(@org.jetbrains.annotations.NotNull
        java.lang.String text);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lorg/linphone/utils/PatternClickableSpan$SpannablePatternItem;", "", "pattern", "Ljava/util/regex/Pattern;", "listener", "Lorg/linphone/utils/PatternClickableSpan$SpannableClickedListener;", "(Lorg/linphone/utils/PatternClickableSpan;Ljava/util/regex/Pattern;Lorg/linphone/utils/PatternClickableSpan$SpannableClickedListener;)V", "getListener", "()Lorg/linphone/utils/PatternClickableSpan$SpannableClickedListener;", "setListener", "(Lorg/linphone/utils/PatternClickableSpan$SpannableClickedListener;)V", "getPattern", "()Ljava/util/regex/Pattern;", "setPattern", "(Ljava/util/regex/Pattern;)V", "app_debug"})
    public final class SpannablePatternItem {
        @org.jetbrains.annotations.NotNull
        private java.util.regex.Pattern pattern;
        @org.jetbrains.annotations.NotNull
        private org.linphone.utils.PatternClickableSpan.SpannableClickedListener listener;
        
        public SpannablePatternItem(@org.jetbrains.annotations.NotNull
        java.util.regex.Pattern pattern, @org.jetbrains.annotations.NotNull
        org.linphone.utils.PatternClickableSpan.SpannableClickedListener listener) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.regex.Pattern getPattern() {
            return null;
        }
        
        public final void setPattern(@org.jetbrains.annotations.NotNull
        java.util.regex.Pattern p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.utils.PatternClickableSpan.SpannableClickedListener getListener() {
            return null;
        }
        
        public final void setListener(@org.jetbrains.annotations.NotNull
        org.linphone.utils.PatternClickableSpan.SpannableClickedListener p0) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001e\u0010\u0002\u001a\u00060\u0003R\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lorg/linphone/utils/PatternClickableSpan$StyledClickableSpan;", "Landroid/text/style/ClickableSpan;", "item", "Lorg/linphone/utils/PatternClickableSpan$SpannablePatternItem;", "Lorg/linphone/utils/PatternClickableSpan;", "(Lorg/linphone/utils/PatternClickableSpan;Lorg/linphone/utils/PatternClickableSpan$SpannablePatternItem;)V", "getItem", "()Lorg/linphone/utils/PatternClickableSpan$SpannablePatternItem;", "setItem", "(Lorg/linphone/utils/PatternClickableSpan$SpannablePatternItem;)V", "onClick", "", "widget", "Landroid/view/View;", "app_debug"})
    public final class StyledClickableSpan extends android.text.style.ClickableSpan {
        @org.jetbrains.annotations.NotNull
        private org.linphone.utils.PatternClickableSpan.SpannablePatternItem item;
        
        public StyledClickableSpan(@org.jetbrains.annotations.NotNull
        org.linphone.utils.PatternClickableSpan.SpannablePatternItem item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.utils.PatternClickableSpan.SpannablePatternItem getItem() {
            return null;
        }
        
        public final void setItem(@org.jetbrains.annotations.NotNull
        org.linphone.utils.PatternClickableSpan.SpannablePatternItem p0) {
        }
        
        @java.lang.Override
        public void onClick(@org.jetbrains.annotations.NotNull
        android.view.View widget) {
        }
    }
}