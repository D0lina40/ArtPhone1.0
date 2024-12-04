package org.linphone.utils;

/**
 * Helper class to properly display swipe actions in list items.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lorg/linphone/utils/RecyclerViewSwipeUtils;", "Landroidx/recyclerview/widget/ItemTouchHelper;", "direction", "", "configuration", "Lorg/linphone/utils/RecyclerViewSwipeConfiguration;", "listener", "Lorg/linphone/utils/RecyclerViewSwipeListener;", "(ILorg/linphone/utils/RecyclerViewSwipeConfiguration;Lorg/linphone/utils/RecyclerViewSwipeListener;)V", "app_debug"})
public final class RecyclerViewSwipeUtils extends androidx.recyclerview.widget.ItemTouchHelper {
    
    public RecyclerViewSwipeUtils(int direction, @org.jetbrains.annotations.NotNull
    org.linphone.utils.RecyclerViewSwipeConfiguration configuration, @org.jetbrains.annotations.NotNull
    org.linphone.utils.RecyclerViewSwipeListener listener) {
        super(null);
    }
}