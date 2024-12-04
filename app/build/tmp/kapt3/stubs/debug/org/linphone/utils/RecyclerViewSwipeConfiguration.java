package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u00a8\u0006\u001b"}, d2 = {"Lorg/linphone/utils/RecyclerViewSwipeConfiguration;", "", "()V", "actionTextFont", "Landroid/graphics/Typeface;", "getActionTextFont", "()Landroid/graphics/Typeface;", "actionTextSize", "", "getActionTextSize", "()F", "actionTextSizeUnit", "", "getActionTextSizeUnit", "()I", "iconMargin", "getIconMargin", "leftToRightAction", "Lorg/linphone/utils/RecyclerViewSwipeConfiguration$Action;", "getLeftToRightAction", "()Lorg/linphone/utils/RecyclerViewSwipeConfiguration$Action;", "setLeftToRightAction", "(Lorg/linphone/utils/RecyclerViewSwipeConfiguration$Action;)V", "rightToLeftAction", "getRightToLeftAction", "setRightToLeftAction", "Action", "app_debug"})
public final class RecyclerViewSwipeConfiguration {
    private final float iconMargin = 16.0F;
    private final int actionTextSizeUnit = android.util.TypedValue.COMPLEX_UNIT_SP;
    @org.jetbrains.annotations.Nullable
    private final android.graphics.Typeface actionTextFont = null;
    private final float actionTextSize = 14.0F;
    @org.jetbrains.annotations.NotNull
    private org.linphone.utils.RecyclerViewSwipeConfiguration.Action leftToRightAction;
    @org.jetbrains.annotations.NotNull
    private org.linphone.utils.RecyclerViewSwipeConfiguration.Action rightToLeftAction;
    
    public RecyclerViewSwipeConfiguration() {
        super();
    }
    
    public final float getIconMargin() {
        return 0.0F;
    }
    
    public final int getActionTextSizeUnit() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.graphics.Typeface getActionTextFont() {
        return null;
    }
    
    public final float getActionTextSize() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.utils.RecyclerViewSwipeConfiguration.Action getLeftToRightAction() {
        return null;
    }
    
    public final void setLeftToRightAction(@org.jetbrains.annotations.NotNull
    org.linphone.utils.RecyclerViewSwipeConfiguration.Action p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.utils.RecyclerViewSwipeConfiguration.Action getRightToLeftAction() {
        return null;
    }
    
    public final void setRightToLeftAction(@org.jetbrains.annotations.NotNull
    org.linphone.utils.RecyclerViewSwipeConfiguration.Action p0) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lorg/linphone/utils/RecyclerViewSwipeConfiguration$Action;", "", "text", "", "textColor", "", "backgroundColor", "icon", "iconTint", "preventFor", "Ljava/lang/Class;", "(Ljava/lang/String;IIIILjava/lang/Class;)V", "getBackgroundColor", "()I", "getIcon", "getIconTint", "getPreventFor", "()Ljava/lang/Class;", "getText", "()Ljava/lang/String;", "getTextColor", "app_debug"})
    public static final class Action {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String text = null;
        private final int textColor = 0;
        private final int backgroundColor = 0;
        private final int icon = 0;
        private final int iconTint = 0;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Class<?> preventFor = null;
        
        public Action(@org.jetbrains.annotations.NotNull
        java.lang.String text, int textColor, int backgroundColor, int icon, int iconTint, @org.jetbrains.annotations.Nullable
        java.lang.Class<?> preventFor) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getText() {
            return null;
        }
        
        public final int getTextColor() {
            return 0;
        }
        
        public final int getBackgroundColor() {
            return 0;
        }
        
        public final int getIcon() {
            return 0;
        }
        
        public final int getIconTint() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Class<?> getPreventFor() {
            return null;
        }
        
        public Action() {
            super();
        }
    }
}