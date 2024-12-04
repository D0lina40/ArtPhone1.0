package org.linphone.activities.voip.views;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u001f\u001a\u00020 H\u0002J\u000e\u0010!\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u0003J\u0010\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0014J\u0018\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\t2\u0006\u0010\'\u001a\u00020\tH\u0014J\u0010\u0010(\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\tH\u0002J\u000e\u0010)\u001a\u00020 2\u0006\u0010*\u001a\u00020\tJ\u000e\u0010+\u001a\u00020 2\u0006\u0010,\u001a\u00020\tR\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006-"}, d2 = {"Lorg/linphone/activities/voip/views/ScrollDotsView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "count", "dotPaint", "Landroid/graphics/Paint;", "isHorizontal", "", "itemCount", "itemHeight", "", "itemWidth", "margin", "radius", "screenHeight", "screenWidth", "scrollListener", "Landroid/view/View$OnScrollChangeListener;", "scrollView", "Landroid/widget/FrameLayout;", "scrollViewRef", "selected", "selectedDotPaint", "checkOrientation", "", "init", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setDotCount", "setItemCount", "items", "setSelectedDot", "index", "app_debug"})
public final class ScrollDotsView extends android.view.View {
    private int count = 2;
    private int itemCount = 0;
    private int selected = 0;
    private float radius = 5.0F;
    private float margin = 2.0F;
    private float screenWidth = 0.0F;
    private float itemWidth = 0.0F;
    private float screenHeight = 0.0F;
    private float itemHeight = 0.0F;
    private android.graphics.Paint dotPaint;
    private android.graphics.Paint selectedDotPaint;
    private int scrollViewRef = 0;
    private android.widget.FrameLayout scrollView;
    private boolean isHorizontal = false;
    @org.jetbrains.annotations.NotNull
    private final android.view.View.OnScrollChangeListener scrollListener = null;
    
    public ScrollDotsView(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    public ScrollDotsView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ScrollDotsView(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void init(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    protected void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
    }
    
    private final void checkOrientation() {
    }
    
    private final void setDotCount(int count) {
    }
    
    public final void setItemCount(int items) {
    }
    
    public final void setSelectedDot(int index) {
    }
}