package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J&\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J@\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 H\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u0016H\u0016J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J&\u0010$\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006%"}, d2 = {"Lorg/linphone/utils/RecyclerViewSwipeUtilsCallback;", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "direction", "", "configuration", "Lorg/linphone/utils/RecyclerViewSwipeConfiguration;", "listener", "Lorg/linphone/utils/RecyclerViewSwipeListener;", "(ILorg/linphone/utils/RecyclerViewSwipeConfiguration;Lorg/linphone/utils/RecyclerViewSwipeListener;)V", "getConfiguration", "()Lorg/linphone/utils/RecyclerViewSwipeConfiguration;", "getDirection", "()I", "getListener", "()Lorg/linphone/utils/RecyclerViewSwipeListener;", "applyConfiguration", "", "canvas", "Landroid/graphics/Canvas;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "dX", "", "actionState", "getSwipeDirs", "getSwipeThreshold", "leftToRightSwipe", "onChildDraw", "dY", "isCurrentlyActive", "", "onMove", "target", "onSwiped", "rightToLeftSwipe", "app_debug"})
final class RecyclerViewSwipeUtilsCallback extends androidx.recyclerview.widget.ItemTouchHelper.SimpleCallback {
    private final int direction = 0;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.utils.RecyclerViewSwipeConfiguration configuration = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.utils.RecyclerViewSwipeListener listener = null;
    
    public RecyclerViewSwipeUtilsCallback(int direction, @org.jetbrains.annotations.NotNull
    org.linphone.utils.RecyclerViewSwipeConfiguration configuration, @org.jetbrains.annotations.NotNull
    org.linphone.utils.RecyclerViewSwipeListener listener) {
        super(0, 0);
    }
    
    public final int getDirection() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.utils.RecyclerViewSwipeConfiguration getConfiguration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.utils.RecyclerViewSwipeListener getListener() {
        return null;
    }
    
    public final void leftToRightSwipe(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX) {
    }
    
    public final void rightToLeftSwipe(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX) {
    }
    
    public final void applyConfiguration(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, int actionState) {
    }
    
    @java.lang.Override
    public int getSwipeDirs(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0;
    }
    
    @java.lang.Override
    public boolean onMove(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder target) {
        return false;
    }
    
    @java.lang.Override
    public void onSwiped(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, int direction) {
    }
    
    @java.lang.Override
    public float getSwipeThreshold(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder) {
        return 0.0F;
    }
    
    @java.lang.Override
    public void onChildDraw(@org.jetbrains.annotations.NotNull
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
    }
}