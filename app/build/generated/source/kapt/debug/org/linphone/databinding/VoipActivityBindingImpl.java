package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipActivityBindingImpl extends VoipActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nav_host_fragment, 2);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private VoipActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.fragment.app.FragmentContainerView) bindings[2]
            , (androidx.fragment.app.FragmentContainerView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.statusFragment.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.controlsViewModel == variableId) {
            setControlsViewModel((org.linphone.activities.voip.viewmodels.ControlsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelPipMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeControlsViewModelFullScreenMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControlsViewModelPipMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelPipMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelFullScreenMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelFullScreenMode, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelPipMode = null;
        int controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = 0;
        java.lang.Boolean controlsViewModelPipModeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelFullScreenMode = null;
        java.lang.Boolean controlsViewModelFullScreenModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = false;
        boolean controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = false;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = false;

        if ((dirtyFlags & 0xfL) != 0) {



                if (controlsViewModel != null) {
                    // read controlsViewModel.fullScreenMode
                    controlsViewModelFullScreenMode = controlsViewModel.getFullScreenMode();
                }
                updateLiveDataRegistration(1, controlsViewModelFullScreenMode);


                if (controlsViewModelFullScreenMode != null) {
                    // read controlsViewModel.fullScreenMode.getValue()
                    controlsViewModelFullScreenModeGetValue = controlsViewModelFullScreenMode.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelFullScreenModeGetValue);
            if((dirtyFlags & 0xfL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.pipMode
                    controlsViewModelPipMode = controlsViewModel.getPipMode();
                }
                updateLiveDataRegistration(0, controlsViewModelPipMode);


                if (controlsViewModelPipMode != null) {
                    // read controlsViewModel.pipMode.getValue()
                    controlsViewModelPipModeGetValue = controlsViewModelPipMode.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelPipModeGetValue);
        }

        if ((dirtyFlags & 0xfL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue));
            if((dirtyFlags & 0xfL) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            this.statusFragment.setVisibility(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.pipMode
        flag 1 (0x2L): controlsViewModel.fullScreenMode
        flag 2 (0x3L): controlsViewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
    flag mapping end*/
    //end
}