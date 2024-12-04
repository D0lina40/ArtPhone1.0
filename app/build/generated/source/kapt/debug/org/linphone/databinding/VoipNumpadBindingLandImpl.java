package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipNumpadBindingLandImpl extends VoipNumpadBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 15);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback227;
    @Nullable
    private final android.view.View.OnClickListener mCallback217;
    @Nullable
    private final android.view.View.OnClickListener mCallback225;
    @Nullable
    private final android.view.View.OnClickListener mCallback223;
    @Nullable
    private final android.view.View.OnClickListener mCallback221;
    @Nullable
    private final android.view.View.OnClickListener mCallback229;
    @Nullable
    private final android.view.View.OnClickListener mCallback219;
    @Nullable
    private final android.view.View.OnClickListener mCallback228;
    @Nullable
    private final android.view.View.OnClickListener mCallback226;
    @Nullable
    private final android.view.View.OnClickListener mCallback224;
    @Nullable
    private final android.view.View.OnClickListener mCallback222;
    @Nullable
    private final android.view.View.OnClickListener mCallback220;
    @Nullable
    private final android.view.View.OnClickListener mCallback218;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipNumpadBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private VoipNumpadBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.view.View) bindings[15]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.dtmf0.setTag(null);
        this.dtmf1.setTag(null);
        this.dtmf2.setTag(null);
        this.dtmf3.setTag(null);
        this.dtmf4.setTag(null);
        this.dtmf5.setTag(null);
        this.dtmf6.setTag(null);
        this.dtmf7.setTag(null);
        this.dtmf8.setTag(null);
        this.dtmf9.setTag(null);
        this.dtmfSharp.setTag(null);
        this.dtmfStar.setTag(null);
        this.enteredDtmfs.setTag(null);
        this.hideNumpad.setTag(null);
        this.numpadLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback227 = new org.linphone.generated.callback.OnClickListener(this, 11);
        mCallback217 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback225 = new org.linphone.generated.callback.OnClickListener(this, 9);
        mCallback223 = new org.linphone.generated.callback.OnClickListener(this, 7);
        mCallback221 = new org.linphone.generated.callback.OnClickListener(this, 5);
        mCallback229 = new org.linphone.generated.callback.OnClickListener(this, 13);
        mCallback219 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback228 = new org.linphone.generated.callback.OnClickListener(this, 12);
        mCallback226 = new org.linphone.generated.callback.OnClickListener(this, 10);
        mCallback224 = new org.linphone.generated.callback.OnClickListener(this, 8);
        mCallback222 = new org.linphone.generated.callback.OnClickListener(this, 6);
        mCallback220 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback218 = new org.linphone.generated.callback.OnClickListener(this, 2);
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
        if (BR.inflatedVisibility == variableId) {
            setInflatedVisibility((java.lang.Integer) variable);
        }
        else if (BR.controlsViewModel == variableId) {
            setControlsViewModel((org.linphone.activities.voip.viewmodels.ControlsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
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
                return onChangeControlsViewModelDtmfHistory((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControlsViewModelDtmfHistory(androidx.lifecycle.MutableLiveData<java.lang.String> ControlsViewModelDtmfHistory, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> controlsViewModelDtmfHistory = null;
        java.lang.String controlsViewModelDtmfHistoryGetValue = null;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;

        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (controlsViewModel != null) {
                    // read controlsViewModel.dtmfHistory
                    controlsViewModelDtmfHistory = controlsViewModel.getDtmfHistory();
                }
                updateLiveDataRegistration(0, controlsViewModelDtmfHistory);


                if (controlsViewModelDtmfHistory != null) {
                    // read controlsViewModel.dtmfHistory.getValue()
                    controlsViewModelDtmfHistoryGetValue = controlsViewModelDtmfHistory.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.dtmf0.setOnClickListener(mCallback228);
            this.dtmf1.setOnClickListener(mCallback218);
            this.dtmf2.setOnClickListener(mCallback219);
            this.dtmf3.setOnClickListener(mCallback220);
            this.dtmf4.setOnClickListener(mCallback221);
            this.dtmf5.setOnClickListener(mCallback222);
            this.dtmf6.setOnClickListener(mCallback223);
            this.dtmf7.setOnClickListener(mCallback224);
            this.dtmf8.setOnClickListener(mCallback225);
            this.dtmf9.setOnClickListener(mCallback226);
            this.dtmfSharp.setOnClickListener(mCallback229);
            this.dtmfStar.setOnClickListener(mCallback227);
            this.hideNumpad.setOnClickListener(mCallback217);
            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.numpadLayout, true);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.enteredDtmfs, controlsViewModelDtmfHistoryGetValue);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.numpadLayout.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 11: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('*');
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {


                    controlsViewModel.hideNumpad();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('8');
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('6');
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('4');
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('#');
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('2');
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('0');
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('9');
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('7');
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('5');
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('3');
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {



                    controlsViewModel.handleDtmfClick('1');
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.dtmfHistory
        flag 1 (0x2L): inflatedVisibility
        flag 2 (0x3L): controlsViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}