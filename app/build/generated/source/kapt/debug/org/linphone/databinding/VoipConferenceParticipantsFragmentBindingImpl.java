package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceParticipantsFragmentBindingImpl extends VoipConferenceParticipantsFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceParticipantsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private VoipConferenceParticipantsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageView) bindings[2]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[5]
            , (android.widget.ImageView) bindings[6]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            );
        this.cancel.setTag(null);
        this.localPreviewVideoSurface.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.switchCamera.setTag(null);
        setRootTag(root);
        // listeners
        mCallback10 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        else if (BR.editClickListener == variableId) {
            setEditClickListener((android.view.View.OnClickListener) variable);
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
    public void setEditClickListener(@Nullable android.view.View.OnClickListener EditClickListener) {
        this.mEditClickListener = EditClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.editClickListener);
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
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelPipMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeConferenceViewModelConferenceParticipants((androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantData>>) object, fieldId);
            case 2 :
                return onChangeControlsViewModelIsSwitchCameraAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeConferenceViewModelIsMeAdmin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeConferenceViewModelIsBroadcast((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeConferenceViewModelConferenceParticipants(androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantData>> ConferenceViewModelConferenceParticipants, int fieldId) {
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
    private boolean onChangeConferenceViewModelIsMeAdmin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsMeAdmin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsBroadcast(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsBroadcast, int fieldId) {
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
        int conferenceViewModelConferenceParticipantsEmptyViewVISIBLEViewGONE = 0;
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantData>> conferenceViewModelConferenceParticipants = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSwitchCameraAvailable = null;
        java.lang.Boolean controlsViewModelPipModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcastGetValue = false;
        android.view.View.OnClickListener editClickListener = mEditClickListener;
        int controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = 0;
        boolean conferenceViewModelConferenceParticipantsEmpty = false;
        android.view.View.OnClickListener cancelClickListener = mCancelClickListener;
        java.lang.Boolean controlsViewModelIsSwitchCameraAvailableGetValue = null;
        boolean controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeAdminGetValue = false;
        int conferenceViewModelIsMeAdminViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsMeAdmin = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsBroadcast = null;
        int conferenceViewModelIsBroadcastAndroidLayoutVoipConferenceParticipantBroadcastCellAndroidLayoutVoipConferenceParticipantCell = 0;
        java.lang.Boolean conferenceViewModelIsMeAdminGetValue = null;
        java.lang.Boolean conferenceViewModelIsBroadcastGetValue = null;
        boolean ControlsViewModelPipMode1 = false;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        java.util.List<org.linphone.activities.voip.data.ConferenceParticipantData> conferenceViewModelConferenceParticipantsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = false;

        if ((dirtyFlags & 0x23aL) != 0) {


            if ((dirtyFlags & 0x232L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceParticipants
                        conferenceViewModelConferenceParticipants = conferenceViewModel.getConferenceParticipants();
                        // read conferenceViewModel.isBroadcast
                        conferenceViewModelIsBroadcast = conferenceViewModel.isBroadcast();
                    }
                    updateLiveDataRegistration(1, conferenceViewModelConferenceParticipants);
                    updateLiveDataRegistration(4, conferenceViewModelIsBroadcast);


                    if (conferenceViewModelConferenceParticipants != null) {
                        // read conferenceViewModel.conferenceParticipants.getValue()
                        conferenceViewModelConferenceParticipantsGetValue = conferenceViewModelConferenceParticipants.getValue();
                    }
                    if (conferenceViewModelIsBroadcast != null) {
                        // read conferenceViewModel.isBroadcast.getValue()
                        conferenceViewModelIsBroadcastGetValue = conferenceViewModelIsBroadcast.getValue();
                    }

                if ((dirtyFlags & 0x222L) != 0) {

                        if (conferenceViewModelConferenceParticipantsGetValue != null) {
                            // read conferenceViewModel.conferenceParticipants.getValue().empty
                            conferenceViewModelConferenceParticipantsEmpty = conferenceViewModelConferenceParticipantsGetValue.isEmpty();
                        }
                    if((dirtyFlags & 0x222L) != 0) {
                        if(conferenceViewModelConferenceParticipantsEmpty) {
                                dirtyFlags |= 0x800L;
                        }
                        else {
                                dirtyFlags |= 0x400L;
                        }
                    }


                        // read conferenceViewModel.conferenceParticipants.getValue().empty ? View.VISIBLE : View.GONE
                        conferenceViewModelConferenceParticipantsEmptyViewVISIBLEViewGONE = ((conferenceViewModelConferenceParticipantsEmpty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }

                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isBroadcast.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcastGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsBroadcastGetValue);
                if((dirtyFlags & 0x232L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcastGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isBroadcast.getValue()) ? @android:layout/voip_conference_participant_broadcast_cell : @android:layout/voip_conference_participant_cell
                    conferenceViewModelIsBroadcastAndroidLayoutVoipConferenceParticipantBroadcastCellAndroidLayoutVoipConferenceParticipantCell = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcastGetValue) ? (R.layout.voip_conference_participant_broadcast_cell) : (R.layout.voip_conference_participant_cell));
            }
            if ((dirtyFlags & 0x228L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isMeAdmin
                        conferenceViewModelIsMeAdmin = conferenceViewModel.isMeAdmin();
                    }
                    updateLiveDataRegistration(3, conferenceViewModelIsMeAdmin);


                    if (conferenceViewModelIsMeAdmin != null) {
                        // read conferenceViewModel.isMeAdmin.getValue()
                        conferenceViewModelIsMeAdminGetValue = conferenceViewModelIsMeAdmin.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeAdmin.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeAdminGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsMeAdminGetValue);
                if((dirtyFlags & 0x228L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeAdminGetValue) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeAdmin.getValue()) ? View.VISIBLE : View.GONE
                    conferenceViewModelIsMeAdminViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeAdminGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x240L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {
        }
        if ((dirtyFlags & 0x305L) != 0) {



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
            if((dirtyFlags & 0x305L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8000L) != 0) {

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

        if ((dirtyFlags & 0x305L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) ? (ControlsViewModelPipMode1) : (false));
            if((dirtyFlags & 0x305L) != 0) {
                if(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = ((controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.cancel.setOnClickListener(cancelClickListener);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutSize(this.localPreviewVideoSurface, localPreviewVideoSurface.getResources().getDimension(R.dimen.video_preview_max_size));
            this.switchCamera.setOnClickListener(mCallback10);
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(editClickListener);
        }
        if ((dirtyFlags & 0x228L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(conferenceViewModelIsMeAdminViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x232L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView3, conferenceViewModelConferenceParticipantsGetValue, conferenceViewModelIsBroadcastAndroidLayoutVoipConferenceParticipantBroadcastCellAndroidLayoutVoipConferenceParticipantCell);
        }
        if ((dirtyFlags & 0x222L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(conferenceViewModelConferenceParticipantsEmptyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x305L) != 0) {
            // api target 1

            this.switchCamera.setVisibility(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // controlsViewModel
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        // controlsViewModel != null
        boolean controlsViewModelJavaLangObjectNull = false;



        controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
        if (controlsViewModelJavaLangObjectNull) {


            controlsViewModel.switchCamera();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.pipMode
        flag 1 (0x2L): conferenceViewModel.conferenceParticipants
        flag 2 (0x3L): controlsViewModel.isSwitchCameraAvailable
        flag 3 (0x4L): conferenceViewModel.isMeAdmin
        flag 4 (0x5L): conferenceViewModel.isBroadcast
        flag 5 (0x6L): conferenceViewModel
        flag 6 (0x7L): editClickListener
        flag 7 (0x8L): cancelClickListener
        flag 8 (0x9L): controlsViewModel
        flag 9 (0xaL): null
        flag 10 (0xbL): conferenceViewModel.conferenceParticipants.getValue().empty ? View.VISIBLE : View.GONE
        flag 11 (0xcL): conferenceViewModel.conferenceParticipants.getValue().empty ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeAdmin.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeAdmin.getValue()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isBroadcast.getValue()) ? @android:layout/voip_conference_participant_broadcast_cell : @android:layout/voip_conference_participant_cell
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isBroadcast.getValue()) ? @android:layout/voip_conference_participant_broadcast_cell : @android:layout/voip_conference_participant_cell
    flag mapping end*/
    //end
}