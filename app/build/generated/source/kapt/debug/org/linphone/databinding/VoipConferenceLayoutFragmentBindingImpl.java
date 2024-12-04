package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceLayoutFragmentBindingImpl extends VoipConferenceLayoutFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(0, 
            new String[] {"voip_dialog_info"},
            new int[] {7},
            new int[] {org.linphone.R.layout.voip_dialog_info});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.RadioButton mboundView2;
    @NonNull
    private final android.widget.RadioButton mboundView3;
    @NonNull
    private final android.widget.RadioButton mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback188;
    @Nullable
    private final android.view.View.OnClickListener mCallback189;
    @Nullable
    private final android.view.View.OnClickListener mCallback187;
    @Nullable
    private final android.view.View.OnClickListener mCallback190;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceLayoutFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private VoipConferenceLayoutFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (org.linphone.databinding.VoipDialogInfoBinding) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[8]
            );
        this.localPreviewVideoSurface.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.RadioButton) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RadioButton) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.RadioButton) bindings[4];
        this.mboundView4.setTag(null);
        this.switchCamera.setTag(null);
        setContainedBinding(this.tooManyParticipantsDialog);
        setRootTag(root);
        // listeners
        mCallback188 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback189 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback187 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback190 = new org.linphone.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        tooManyParticipantsDialog.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (tooManyParticipantsDialog.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.conferenceViewModel == variableId) {
            setConferenceViewModel((org.linphone.activities.voip.viewmodels.ConferenceViewModel) variable);
        }
        else if (BR.dismissDialogClickListener == variableId) {
            setDismissDialogClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.cancelClickListener == variableId) {
            setCancelClickListener((android.view.View.OnClickListener) variable);
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
    public void setDismissDialogClickListener(@Nullable android.view.View.OnClickListener DismissDialogClickListener) {
        this.mDismissDialogClickListener = DismissDialogClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.dismissDialogClickListener);
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
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        tooManyParticipantsDialog.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelPipMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeControlsViewModelIsSwitchCameraAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeConferenceViewModelConferenceParticipantDevices((androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>>) object, fieldId);
            case 3 :
                return onChangeTooManyParticipantsDialog((org.linphone.databinding.VoipDialogInfoBinding) object, fieldId);
            case 4 :
                return onChangeConferenceViewModelConferenceDisplayMode((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode>) object, fieldId);
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
    private boolean onChangeControlsViewModelIsSwitchCameraAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsSwitchCameraAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceParticipantDevices(androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> ConferenceViewModelConferenceParticipantDevices, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTooManyParticipantsDialog(org.linphone.databinding.VoipDialogInfoBinding TooManyParticipantsDialog, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceDisplayMode(androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> ConferenceViewModelConferenceDisplayMode, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSwitchCameraAvailable = null;
        java.lang.Boolean controlsViewModelPipModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue = false;
        int controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> conferenceViewModelConferenceParticipantDevices = null;
        int conferenceViewModelConferenceParticipantDevicesSize = 0;
        android.view.View.OnClickListener dismissDialogClickListener = mDismissDialogClickListener;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = false;
        android.view.View.OnClickListener cancelClickListener = mCancelClickListener;
        java.lang.Boolean controlsViewModelIsSwitchCameraAvailableGetValue = null;
        boolean controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = false;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER = false;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRID = false;
        boolean conferenceViewModelConferenceParticipantDevicesSizeConferenceViewModelMaxParticipantsForMosaicLayoutBooleanFalseBooleanTrue = false;
        int conferenceViewModelMaxParticipantsForMosaicLayout = 0;
        org.linphone.activities.voip.ConferenceDisplayMode conferenceViewModelConferenceDisplayModeGetValue = null;
        java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> conferenceViewModelConferenceParticipantDevicesGetValue = null;
        boolean ControlsViewModelPipMode1 = false;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = false;
        boolean conferenceViewModelConferenceParticipantDevicesSizeConferenceViewModelMaxParticipantsForMosaicLayout = false;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> conferenceViewModelConferenceDisplayMode = null;

        if ((dirtyFlags & 0x234L) != 0) {


            if ((dirtyFlags & 0x224L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceParticipantDevices
                        conferenceViewModelConferenceParticipantDevices = conferenceViewModel.getConferenceParticipantDevices();
                        // read conferenceViewModel.maxParticipantsForMosaicLayout
                        conferenceViewModelMaxParticipantsForMosaicLayout = conferenceViewModel.getMaxParticipantsForMosaicLayout();
                    }
                    updateLiveDataRegistration(2, conferenceViewModelConferenceParticipantDevices);


                    if (conferenceViewModelConferenceParticipantDevices != null) {
                        // read conferenceViewModel.conferenceParticipantDevices.getValue()
                        conferenceViewModelConferenceParticipantDevicesGetValue = conferenceViewModelConferenceParticipantDevices.getValue();
                    }


                    if (conferenceViewModelConferenceParticipantDevicesGetValue != null) {
                        // read conferenceViewModel.conferenceParticipantDevices.getValue().size()
                        conferenceViewModelConferenceParticipantDevicesSize = conferenceViewModelConferenceParticipantDevicesGetValue.size();
                    }


                    // read conferenceViewModel.conferenceParticipantDevices.getValue().size() > conferenceViewModel.maxParticipantsForMosaicLayout
                    conferenceViewModelConferenceParticipantDevicesSizeConferenceViewModelMaxParticipantsForMosaicLayout = (conferenceViewModelConferenceParticipantDevicesSize) > (conferenceViewModelMaxParticipantsForMosaicLayout);
                if((dirtyFlags & 0x224L) != 0) {
                    if(conferenceViewModelConferenceParticipantDevicesSizeConferenceViewModelMaxParticipantsForMosaicLayout) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read conferenceViewModel.conferenceParticipantDevices.getValue().size() > conferenceViewModel.maxParticipantsForMosaicLayout ? false : true
                    conferenceViewModelConferenceParticipantDevicesSizeConferenceViewModelMaxParticipantsForMosaicLayoutBooleanFalseBooleanTrue = ((conferenceViewModelConferenceParticipantDevicesSizeConferenceViewModelMaxParticipantsForMosaicLayout) ? (false) : (true));
            }
            if ((dirtyFlags & 0x230L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceDisplayMode
                        conferenceViewModelConferenceDisplayMode = conferenceViewModel.getConferenceDisplayMode();
                    }
                    updateLiveDataRegistration(4, conferenceViewModelConferenceDisplayMode);


                    if (conferenceViewModelConferenceDisplayMode != null) {
                        // read conferenceViewModel.conferenceDisplayMode.getValue()
                        conferenceViewModelConferenceDisplayModeGetValue = conferenceViewModelConferenceDisplayMode.getValue();
                    }


                    // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY
                    conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = (conferenceViewModelConferenceDisplayModeGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.AUDIO_ONLY);
                    // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER
                    conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER = (conferenceViewModelConferenceDisplayModeGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.ACTIVE_SPEAKER);
                    // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID
                    conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRID = (conferenceViewModelConferenceDisplayModeGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.GRID);
            }
        }
        if ((dirtyFlags & 0x240L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {
        }
        if ((dirtyFlags & 0x303L) != 0) {



                if (controlsViewModel != null) {
                    // read controlsViewModel.isSwitchCameraAvailable
                    controlsViewModelIsSwitchCameraAvailable = controlsViewModel.isSwitchCameraAvailable();
                }
                updateLiveDataRegistration(1, controlsViewModelIsSwitchCameraAvailable);


                if (controlsViewModelIsSwitchCameraAvailable != null) {
                    // read controlsViewModel.isSwitchCameraAvailable.getValue()
                    controlsViewModelIsSwitchCameraAvailableGetValue = controlsViewModelIsSwitchCameraAvailable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSwitchCameraAvailableGetValue);
            if((dirtyFlags & 0x303L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2000L) != 0) {

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

        if ((dirtyFlags & 0x303L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) ? (ControlsViewModelPipMode1) : (false));
            if((dirtyFlags & 0x303L) != 0) {
                if(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = ((controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutSize(this.localPreviewVideoSurface, localPreviewVideoSurface.getResources().getDimension(R.dimen.video_preview_max_size));
            this.mboundView2.setOnClickListener(mCallback187);
            this.mboundView3.setOnClickListener(mCallback188);
            this.mboundView4.setOnClickListener(mCallback189);
            this.switchCamera.setOnClickListener(mCallback190);
            this.tooManyParticipantsDialog.setDialogMessage(getRoot().getResources().getString(R.string.conference_layout_too_many_participants_for_mosaic));
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(cancelClickListener);
        }
        if ((dirtyFlags & 0x230L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView2, conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRID);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView4, conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY);
        }
        if ((dirtyFlags & 0x224L) != 0) {
            // api target 1

            this.mboundView2.setEnabled(conferenceViewModelConferenceParticipantDevicesSizeConferenceViewModelMaxParticipantsForMosaicLayoutBooleanFalseBooleanTrue);
        }
        if ((dirtyFlags & 0x303L) != 0) {
            // api target 1

            this.switchCamera.setVisibility(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            this.tooManyParticipantsDialog.setDismissClickListener(dismissDialogClickListener);
        }
        executeBindingsOn(tooManyParticipantsDialog);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // conferenceViewModel
                org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
                // conferenceViewModel != null
                boolean conferenceViewModelJavaLangObjectNull = false;



                conferenceViewModelJavaLangObjectNull = (conferenceViewModel) != (null);
                if (conferenceViewModelJavaLangObjectNull) {





                    conferenceViewModel.changeLayout(org.linphone.activities.voip.ConferenceDisplayMode.ACTIVE_SPEAKER, false);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // conferenceViewModel
                org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
                // conferenceViewModel != null
                boolean conferenceViewModelJavaLangObjectNull = false;



                conferenceViewModelJavaLangObjectNull = (conferenceViewModel) != (null);
                if (conferenceViewModelJavaLangObjectNull) {





                    conferenceViewModel.changeLayout(org.linphone.activities.voip.ConferenceDisplayMode.AUDIO_ONLY, false);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // conferenceViewModel
                org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
                // conferenceViewModel != null
                boolean conferenceViewModelJavaLangObjectNull = false;



                conferenceViewModelJavaLangObjectNull = (conferenceViewModel) != (null);
                if (conferenceViewModelJavaLangObjectNull) {





                    conferenceViewModel.changeLayout(org.linphone.activities.voip.ConferenceDisplayMode.GRID, false);
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


                    controlsViewModel.switchCamera();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.pipMode
        flag 1 (0x2L): controlsViewModel.isSwitchCameraAvailable
        flag 2 (0x3L): conferenceViewModel.conferenceParticipantDevices
        flag 3 (0x4L): tooManyParticipantsDialog
        flag 4 (0x5L): conferenceViewModel.conferenceDisplayMode
        flag 5 (0x6L): conferenceViewModel
        flag 6 (0x7L): dismissDialogClickListener
        flag 7 (0x8L): cancelClickListener
        flag 8 (0x9L): controlsViewModel
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 14 (0xfL): conferenceViewModel.conferenceParticipantDevices.getValue().size() > conferenceViewModel.maxParticipantsForMosaicLayout ? false : true
        flag 15 (0x10L): conferenceViewModel.conferenceParticipantDevices.getValue().size() > conferenceViewModel.maxParticipantsForMosaicLayout ? false : true
    flag mapping end*/
    //end
}