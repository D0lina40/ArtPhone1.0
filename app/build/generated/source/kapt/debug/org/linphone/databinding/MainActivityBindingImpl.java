package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainActivityBindingImpl extends MainActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(1, 
            new String[] {"call_overlay"},
            new int[] {4},
            new int[] {org.linphone.R.layout.call_overlay});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.content, 3);
        sViewsWithIds.put(R.id.status_fragment, 5);
        sViewsWithIds.put(R.id.side_menu_content, 6);
        sViewsWithIds.put(R.id.side_menu_fragment, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private MainActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (org.linphone.databinding.CallOverlayBinding) bindings[4]
            , (bindings[3] != null) ? org.linphone.databinding.MainActivityContentBinding.bind((android.view.View) bindings[3]) : null
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[6]
            , (androidx.fragment.app.FragmentContainerView) bindings[7]
            , (androidx.fragment.app.FragmentContainerView) bindings[5]
            );
        setContainedBinding(this.callOverlay);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.rootCoordinatorLayout.setTag(null);
        this.sideMenu.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        callOverlay.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (callOverlay.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.callOverlayViewModel == variableId) {
            setCallOverlayViewModel((org.linphone.activities.main.viewmodels.CallOverlayViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallOverlayViewModel(@Nullable org.linphone.activities.main.viewmodels.CallOverlayViewModel CallOverlayViewModel) {
        this.mCallOverlayViewModel = CallOverlayViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.callOverlayViewModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        callOverlay.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCallOverlay((org.linphone.databinding.CallOverlayBinding) object, fieldId);
            case 1 :
                return onChangeCallOverlayViewModelDisplayCallOverlay((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCallOverlay(org.linphone.databinding.CallOverlayBinding CallOverlay, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallOverlayViewModelDisplayCallOverlay(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallOverlayViewModelDisplayCallOverlay, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        org.linphone.activities.main.viewmodels.CallOverlayViewModel callOverlayViewModel = mCallOverlayViewModel;
        java.lang.Boolean callOverlayViewModelDisplayCallOverlayGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> callOverlayViewModelDisplayCallOverlay = null;

        if ((dirtyFlags & 0x16L) != 0) {



                if (callOverlayViewModel != null) {
                    // read callOverlayViewModel.displayCallOverlay
                    callOverlayViewModelDisplayCallOverlay = callOverlayViewModel.getDisplayCallOverlay();
                }
                updateLiveDataRegistration(1, callOverlayViewModelDisplayCallOverlay);


                if (callOverlayViewModelDisplayCallOverlay != null) {
                    // read callOverlayViewModel.displayCallOverlay.getValue()
                    callOverlayViewModelDisplayCallOverlayGetValue = callOverlayViewModelDisplayCallOverlay.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            this.callOverlay.setVisibility(callOverlayViewModelDisplayCallOverlayGetValue);
        }
        executeBindingsOn(callOverlay);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): callOverlay
        flag 1 (0x2L): callOverlayViewModel.displayCallOverlay
        flag 2 (0x3L): callOverlayViewModel
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}