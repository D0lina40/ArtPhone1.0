package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0014H\u0002J \u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/linphone/utils/RecyclerViewHeaderDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "adapter", "Lorg/linphone/utils/HeaderAdapter;", "(Landroid/content/Context;Lorg/linphone/utils/HeaderAdapter;)V", "headers", "Landroid/util/SparseArray;", "Landroid/view/View;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "measureHeaderView", "Landroid/view/ViewGroup;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class RecyclerViewHeaderDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.utils.HeaderAdapter adapter = null;
    @org.jetbrains.annotations.NotNull
    private final android.util.SparseArray<android.view.View> headers = null;
    
    public RecyclerViewHeaderDecoration(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    org.linphone.utils.HeaderAdapter adapter) {
        super();
    }
    
    @java.lang.Override
    public void getItemOffsets(@org.jetbrains.annotations.NotNull
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
    
    private final void measureHeaderView(android.view.View view, android.view.ViewGroup parent) {
    }
    
    @java.lang.Override
    public void onDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.State state) {
    }
}