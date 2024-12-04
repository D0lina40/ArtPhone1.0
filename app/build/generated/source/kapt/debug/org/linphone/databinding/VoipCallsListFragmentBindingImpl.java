package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipCallsListFragmentBindingImpl extends VoipCallsListFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 8);
        sViewsWithIds.put(R.id.bottom_buttons, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipCallsListFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private VoipCallsListFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.LinearLayout) bindings[9]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[6]
            , (android.widget.ImageView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            );
        this.localPreviewVideoSurface.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.switchCamera.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback19 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback18 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        if (BR.conferenceViewModel == variableId) {
            setConferenceViewModel((org.linphone.activities.voip.viewmodels.ConferenceViewModel) variable);
        }
        else if (BR.callsViewModel == variableId) {
            setCallsViewModel((org.linphone.activities.voip.viewmodels.CallsViewModel) variable);
        }
        else if (BR.cancelClickListener == variableId) {
            setCancelClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.addCallClickListener == variableId) {
            setAddCallClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.controlsViewModel == variableId) {
            setControlsViewModel((org.linphone.activities.voip.viewmodels.ControlsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setConferenceViewModel(@Nullable org.linphone.activities.voip.viewmodels.ConferenceViewModel ConferenceViewModel) {
        this.mConferenceViewModel = ConferenceViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.conferenceViewModel);
        super.requestRebind();
    }
    public void setCallsViewModel(@Nullable org.linphone.activities.voip.viewmodels.CallsViewModel CallsViewModel) {
        this.mCallsViewModel = CallsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.callsViewModel);
        super.requestRebind();
    }
    public void setCancelClickListener(@Nullable android.view.View.OnClickListener CancelClickListener) {
        this.mCancelClickListener = CancelClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.cancelClickListener);
        super.requestRebind();
    }
    public void setAddCallClickListener(@Nullable android.view.View.OnClickListener AddCallClickListener) {
        this.mAddCallClickListener = AddCallClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.addCallClickListener);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
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
                return onChangeCallsViewModelCallsData((androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.CallData>>) object, fieldId);
            case 2 :
                return onChangeControlsViewModelIsSwitchCameraAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeConferenceViewModelConferenceExists((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeConferenceViewModelIsMeAdmin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeCallsViewModelCallsData(androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.CallData>> CallsViewModelCallsData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsSwitchCameraAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsSwitchCameraAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceExists(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelConferenceExists, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsMeAdmin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsMeAdmin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.CallData>> callsViewModelCallsData = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSwitchCameraAvailable = null;
        java.lang.Boolean controlsViewModelPipModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue = false;
        org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;
        java.lang.Boolean conferenceViewModelConferenceExistsGetValue = null;
        int controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = 0;
        boolean callsViewModelCallsDataSizeInt2 = false;
        int conferenceViewModelConferenceExistsViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelConferenceExists = null;
        int conferenceViewModelConferenceExistsViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener cancelClickListener = mCancelClickListener;
        boolean callsViewModelCallsDataSizeInt2ConferenceViewModelIsMeAdminBooleanFalse = false;
        java.lang.Boolean controlsViewModelIsSwitchCameraAvailableGetValue = null;
        boolean controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeAdminGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsMeAdmin = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue = false;
        java.lang.Boolean conferenceViewModelIsMeAdminGetValue = null;
        android.view.View.OnClickListener addCallClickListener = mAddCallClickListener;
        boolean ControlsViewModelPipMode1 = false;
        java.util.List<org.linphone.activities.voip.data.CallData> callsViewModelCallsDataGetValue = null;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = false;
        int callsViewModelCallsDataSize = 0;

        if ((dirtyFlags & 0x428L) != 0) {



                if (conferenceViewModel != null) {
                    // read conferenceViewModel.conferenceExists
                    conferenceViewModelConferenceExists = conferenceViewModel.getConferenceExists();
                }
                updateLiveDataRegistration(3, conferenceViewModelConferenceExists);


                if (conferenceViewModelConferenceExists != null) {
                    // read conferenceViewModel.conferenceExists.getValue()
                    conferenceViewModelConferenceExistsGetValue = conferenceViewModelConferenceExists.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue())
                androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelConferenceExistsGetValue);
            if((dirtyFlags & 0x428L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.VISIBLE : View.GONE
                conferenceViewModelConferenceExistsViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.GONE : View.VISIBLE
                conferenceViewModelConferenceExistsViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x472L) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.callsData
                    callsViewModelCallsData = callsViewModel.getCallsData();
                }
                updateLiveDataRegistration(1, callsViewModelCallsData);


                if (callsViewModelCallsData != null) {
                    // read callsViewModel.callsData.getValue()
                    callsViewModelCallsDataGetValue = callsViewModelCallsData.getValue();
                }

            if ((dirtyFlags & 0x442L) != 0) {
            }

                if (callsViewModelCallsDataGetValue != null) {
                    // read callsViewModel.callsData.getValue().size()
                    callsViewModelCallsDataSize = callsViewModelCallsDataGetValue.size();
                }


                // read callsViewModel.callsData.getValue().size() >= 2
                callsViewModelCallsDataSizeInt2 = (callsViewModelCallsDataSize) >= (2);
            if((dirtyFlags & 0x472L) != 0) {
                if(callsViewModelCallsDataSizeInt2) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }
        }
        if ((dirtyFlags & 0x480L) != 0) {
        }
        if ((dirtyFlags & 0x500L) != 0) {
        }
        if ((dirtyFlags & 0x605L) != 0) {



                if (controlsViewModel != null) {
                    // read controlsViewModel.isSwitchCameraAvailable
                    controlsViewModelIsSwitchCameraAvailable = controlsViewModel.isSwitchCameraAvailable();
                }
                updateLiveDataRegistration(2, controlsViewModelIsSwitchCameraAvailable);


                if (controlsViewModelIsSwitchCameraAvailable != null) {
                    // read controlsViewModel.isSwitchCameraAvailable.getValue()
                    controlsViewModelIsSwitchCameraAvailableGetValue = controlsViewModelIsSwitchCameraAvailable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSwitchCameraAvailableGetValue);
            if((dirtyFlags & 0x605L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000L) != 0) {

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


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                ControlsViewModelPipMode1 = !androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue;
        }
        if ((dirtyFlags & 0x40000L) != 0) {



                if (conferenceViewModel != null) {
                    // read conferenceViewModel.isMeAdmin
                    conferenceViewModelIsMeAdmin = conferenceViewModel.isMeAdmin();
                }
                updateLiveDataRegistration(4, conferenceViewModelIsMeAdmin);


                if (conferenceViewModelIsMeAdmin != null) {
                    // read conferenceViewModel.isMeAdmin.getValue()
                    conferenceViewModelIsMeAdminGetValue = conferenceViewModelIsMeAdmin.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeAdmin.getValue())
                androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeAdminGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsMeAdminGetValue);
        }

        if ((dirtyFlags & 0x472L) != 0) {

                // read callsViewModel.callsData.getValue().size() >= 2 ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeAdmin.getValue()) : false
                callsViewModelCallsDataSizeInt2ConferenceViewModelIsMeAdminBooleanFalse = ((callsViewModelCallsDataSizeInt2) ? (androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeAdminGetValue) : (false));
        }
        if ((dirtyFlags & 0x605L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) ? (ControlsViewModelPipMode1) : (false));
            if((dirtyFlags & 0x605L) != 0) {
                if(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = ((controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutSize(this.localPreviewVideoSurface, localPreviewVideoSurface.getResources().getDimension(R.dimen.video_preview_max_size));
            this.mboundView4.setOnClickListener(mCallback17);
            this.mboundView5.setOnClickListener(mCallback18);
            this.switchCamera.setOnClickListener(mCallback19);
        }
        if ((dirtyFlags & 0x480L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(cancelClickListener);
        }
        if ((dirtyFlags & 0x442L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView2, callsViewModelCallsDataGetValue, R.layout.voip_calls_cell);
            this.mboundView5.setEnabled(callsViewModelCallsDataSizeInt2);
        }
        if ((dirtyFlags & 0x500L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(addCallClickListener);
        }
        if ((dirtyFlags & 0x472L) != 0) {
            // api target 1

            this.mboundView4.setEnabled(callsViewModelCallsDataSizeInt2ConferenceViewModelIsMeAdminBooleanFalse);
        }
        if ((dirtyFlags & 0x428L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(conferenceViewModelConferenceExistsViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(conferenceViewModelConferenceExistsViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x605L) != 0) {
            // api target 1

            this.switchCamera.setVisibility(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // conferenceViewModel
                org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
                // conferenceViewModel != null
                boolean conferenceViewModelJavaLangObjectNull = false;



                conferenceViewModelJavaLangObjectNull = (conferenceViewModel) != (null);
                if (conferenceViewModelJavaLangObjectNull) {


                    conferenceViewModel.addCallsToConference();
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


                    controlsViewModel.switchCamera();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // callsViewModel != null
                boolean callsViewModelJavaLangObjectNull = false;
                // callsViewModel
                org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;



                callsViewModelJavaLangObjectNull = (callsViewModel) != (null);
                if (callsViewModelJavaLangObjectNull) {


                    callsViewModel.mergeCallsIntoConference();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.pipMode
        flag 1 (0x2L): callsViewModel.callsData
        flag 2 (0x3L): controlsViewModel.isSwitchCameraAvailable
        flag 3 (0x4L): conferenceViewModel.conferenceExists
        flag 4 (0x5L): conferenceViewModel.isMeAdmin
        flag 5 (0x6L): conferenceViewModel
        flag 6 (0x7L): callsViewModel
        flag 7 (0x8L): cancelClickListener
        flag 8 (0x9L): addCallClickListener
        flag 9 (0xaL): controlsViewModel
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.GONE : View.VISIBLE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.GONE : View.VISIBLE
        flag 17 (0x12L): callsViewModel.callsData.getValue().size() >= 2 ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeAdmin.getValue()) : false
        flag 18 (0x13L): callsViewModel.callsData.getValue().size() >= 2 ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeAdmin.getValue()) : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
    flag mapping end*/
    //end
}