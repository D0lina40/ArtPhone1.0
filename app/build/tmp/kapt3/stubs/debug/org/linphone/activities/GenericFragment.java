package org.linphone.activities;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 ,*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001,B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH&J\b\u0010\u001d\u001a\u00020\u001eH\u0004J\b\u0010\u001f\u001a\u00020\u0013H\u0004J\b\u0010 \u001a\u00020\u0013H\u0004J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0016J\b\u0010)\u001a\u00020\u001eH\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\b\u0010+\u001a\u00020\u001eH\u0002R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00028\u00008DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006-"}, d2 = {"Lorg/linphone/activities/GenericFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Landroidx/databinding/ViewDataBinding;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "onBackPressedCallback", "Landroidx/activity/OnBackPressedCallback;", "sharedViewModel", "Lorg/linphone/activities/main/viewmodels/SharedMainViewModel;", "getSharedViewModel", "()Lorg/linphone/activities/main/viewmodels/SharedMainViewModel;", "setSharedViewModel", "(Lorg/linphone/activities/main/viewmodels/SharedMainViewModel;)V", "useMaterialSharedAxisXForwardAnimation", "", "getUseMaterialSharedAxisXForwardAnimation", "()Z", "setUseMaterialSharedAxisXForwardAnimation", "(Z)V", "backPressedCallBackEnabled", "getFragmentRealClassName", "", "getLayoutId", "", "goBack", "", "isBindingAvailable", "isSharedViewModelInitialized", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onStart", "setupBackPressCallback", "Companion", "app_debug"})
public abstract class GenericFragment<T extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private static final java.util.ArrayList<java.lang.Integer> emptyFragmentsIds = null;
    @org.jetbrains.annotations.Nullable
    private T _binding;
    private boolean useMaterialSharedAxisXForwardAnimation = true;
    protected org.linphone.activities.main.viewmodels.SharedMainViewModel sharedViewModel;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.OnBackPressedCallback onBackPressedCallback = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.activities.GenericFragment.Companion Companion = null;
    
    public GenericFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final T getBinding() {
        return null;
    }
    
    protected final boolean getUseMaterialSharedAxisXForwardAnimation() {
        return false;
    }
    
    protected final void setUseMaterialSharedAxisXForwardAnimation(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.linphone.activities.main.viewmodels.SharedMainViewModel getSharedViewModel() {
        return null;
    }
    
    protected final void setSharedViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.viewmodels.SharedMainViewModel p0) {
    }
    
    protected final boolean isSharedViewModelInitialized() {
        return false;
    }
    
    protected final boolean isBindingAvailable() {
        return false;
    }
    
    private final java.lang.String getFragmentRealClassName() {
        return null;
    }
    
    public abstract int getLayoutId();
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    protected final void goBack() {
    }
    
    private final void setupBackPressCallback() {
    }
    
    private final boolean backPressedCallBackEnabled() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lorg/linphone/activities/GenericFragment$Companion;", "", "()V", "emptyFragmentsIds", "Ljava/util/ArrayList;", "", "getEmptyFragmentsIds", "()Ljava/util/ArrayList;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.ArrayList<java.lang.Integer> getEmptyFragmentsIds() {
            return null;
        }
    }
}