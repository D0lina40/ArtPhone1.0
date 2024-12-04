package org.linphone.activities.main.fragments;

/**
 * This fragment can be inherited by all fragments that will display a list
 * where items can be selected for removal through the ListTopBarFragment
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0010\b\u0001\u0010\u0003*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u001aH\u0002J \u0010\u001b\u001a\u00020\u001a2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u001dj\b\u0012\u0004\u0012\u00020\u0010`\u001eH&J\b\u0010\u001f\u001a\u00020\u0010H\u0002J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u000e\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\'R\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0001X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00028\u00018DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\tR\u0014\u0010\u000f\u001a\u00020\u0010X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006)"}, d2 = {"Lorg/linphone/activities/main/fragments/MasterFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "U", "Lorg/linphone/activities/main/adapters/SelectionListAdapter;", "Lorg/linphone/activities/main/fragments/SecureFragment;", "()V", "_adapter", "get_adapter", "()Lorg/linphone/activities/main/adapters/SelectionListAdapter;", "set_adapter", "(Lorg/linphone/activities/main/adapters/SelectionListAdapter;)V", "Lorg/linphone/activities/main/adapters/SelectionListAdapter;", "adapter", "getAdapter", "dialogConfirmationMessageBeforeRemoval", "", "getDialogConfirmationMessageBeforeRemoval", "()I", "listSelectionViewModel", "Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;", "getListSelectionViewModel", "()Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;", "setListSelectionViewModel", "(Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;)V", "delete", "", "deleteItems", "indexesOfItemToDelete", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getItemCount", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setUpSlidingPane", "slidingPane", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "SlidingPaneBackPressedCallback", "app_debug"})
public abstract class MasterFragment<T extends androidx.databinding.ViewDataBinding, U extends org.linphone.activities.main.adapters.SelectionListAdapter<?, ?>> extends org.linphone.activities.main.fragments.SecureFragment<T> {
    @org.jetbrains.annotations.Nullable
    private U _adapter;
    protected org.linphone.activities.main.viewmodels.ListTopBarViewModel listSelectionViewModel;
    private final int dialogConfirmationMessageBeforeRemoval = 0;
    
    public MasterFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    protected final U get_adapter() {
        return null;
    }
    
    protected final void set_adapter(@org.jetbrains.annotations.Nullable
    U p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final U getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.linphone.activities.main.viewmodels.ListTopBarViewModel getListSelectionViewModel() {
        return null;
    }
    
    protected final void setListSelectionViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.viewmodels.ListTopBarViewModel p0) {
    }
    
    protected int getDialogConfirmationMessageBeforeRemoval() {
        return 0;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void setUpSlidingPane(@org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    private final void delete() {
    }
    
    private final int getItemCount() {
        return 0;
    }
    
    public abstract void deleteItems(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> indexesOfItemToDelete);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/linphone/activities/main/fragments/MasterFragment$SlidingPaneBackPressedCallback;", "Landroidx/activity/OnBackPressedCallback;", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout$PanelSlideListener;", "slidingPaneLayout", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "(Landroidx/slidingpanelayout/widget/SlidingPaneLayout;)V", "handleOnBackPressed", "", "onPanelClosed", "panel", "Landroid/view/View;", "onPanelOpened", "onPanelSlide", "slideOffset", "", "app_debug"})
    public static final class SlidingPaneBackPressedCallback extends androidx.activity.OnBackPressedCallback implements androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener {
        @org.jetbrains.annotations.NotNull
        private final androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout = null;
        
        public SlidingPaneBackPressedCallback(@org.jetbrains.annotations.NotNull
        androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPaneLayout) {
            super(false);
        }
        
        @java.lang.Override
        public void handleOnBackPressed() {
        }
        
        @java.lang.Override
        public void onPanelOpened(@org.jetbrains.annotations.NotNull
        android.view.View panel) {
        }
        
        @java.lang.Override
        public void onPanelClosed(@org.jetbrains.annotations.NotNull
        android.view.View panel) {
        }
        
        @java.lang.Override
        public void onPanelSlide(@org.jetbrains.annotations.NotNull
        android.view.View panel, float slideOffset) {
        }
    }
}