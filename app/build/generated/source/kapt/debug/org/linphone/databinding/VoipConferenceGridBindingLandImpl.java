package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceGridBindingLandImpl extends VoipConferenceGridBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"voip_remote_recording"},
            new int[] {7},
            new int[] {org.linphone.R.layout.voip_remote_recording});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.hinge_top, 8);
        sViewsWithIds.put(R.id.hinge_bottom, 9);
        sViewsWithIds.put(R.id.active_conference_timer, 10);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceGridBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private VoipConferenceGridBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (android.widget.Chronometer) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (org.linphone.activities.voip.views.GridBoxLayout) bindings[6]
            , (androidx.constraintlayout.widget.Group) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[9]
            , (androidx.constraintlayout.widget.Guideline) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (org.linphone.databinding.VoipRemoteRecordingBinding) bindings[7]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.view.View) bindings[1]
            );
        this.conferenceConstraintLayout.setTag(null);
        this.gridBoxLayout.setTag(null);
        this.group.setTag(null);
        this.remoteName.setTag(null);
        setContainedBinding(this.remoteRecording);
        this.toggleConferenceRecording.setTag(null);
        this.togglePauseConference.setTag(null);
        this.topBarrier.setTag(null);
        setRootTag(root);
        // listeners
        mCallback42 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback40 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback41 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
        }
        remoteRecording.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (remoteRecording.hasPendingBindings()) {
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
        else if (BR.inflatedVisibility == variableId) {
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

    public void setConferenceViewModel(@Nullable org.linphone.activities.voip.viewmodels.ConferenceViewModel ConferenceViewModel) {
        this.mConferenceViewModel = ConferenceViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.conferenceViewModel);
        super.requestRebind();
    }
    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        remoteRecording.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelPipMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeConferenceViewModelIsConferenceLocallyPaused((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeConferenceViewModelConferenceParticipantDevices((androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>>) object, fieldId);
            case 3 :
                return onChangeControlsViewModelFolded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeConferenceViewModelIsRemotelyRecorded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeControlsViewModelFullScreenMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeConferenceViewModelConferenceCreationPending((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeRemoteRecording((org.linphone.databinding.VoipRemoteRecordingBinding) object, fieldId);
            case 8 :
                return onChangeConferenceViewModelIsRecording((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeConferenceViewModelSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
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
    private boolean onChangeConferenceViewModelIsConferenceLocallyPaused(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsConferenceLocallyPaused, int fieldId) {
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
    private boolean onChangeControlsViewModelFolded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelFolded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsRemotelyRecorded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsRemotelyRecorded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelFullScreenMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelFullScreenMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceCreationPending(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelConferenceCreationPending, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRemoteRecording(org.linphone.databinding.VoipRemoteRecordingBinding RemoteRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsRecording(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSubject(androidx.lifecycle.MutableLiveData<java.lang.String> ConferenceViewModelSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsConferenceLocallyPaused = null;
        java.lang.Boolean conferenceViewModelIsConferenceLocallyPausedGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPendingGetValue = false;
        androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> conferenceViewModelConferenceParticipantDevices = null;
        float controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipRemoteMargin = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelFolded = null;
        boolean conferenceViewModelConferenceCreationPending = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRecordingGetValue = false;
        float controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFoldedTopBarrierAndroidDimenMargin0dpConferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = 0f;
        java.lang.Boolean controlsViewModelFoldedGetValue = null;
        float controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipButtonsFragmentMarginSize = 0f;
        java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> conferenceViewModelConferenceParticipantDevicesGetValue = null;
        java.lang.String conferenceViewModelSubjectGetValue = null;
        java.lang.Boolean conferenceViewModelIsRemotelyRecordedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsRemotelyRecorded = null;
        java.lang.Boolean conferenceViewModelIsRecordingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue = false;
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue = false;
        java.lang.Boolean controlsViewModelPipModeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelFullScreenMode = null;
        java.lang.Boolean conferenceViewModelConferenceCreationPendingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPending = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelConferenceCreationPending1 = null;
        boolean controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFolded = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue = false;
        int controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = 0;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        float conferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsRecording = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> conferenceViewModelSubject = null;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        float controlsViewModelFoldedRemoteNameAndroidDimenVoipConferenceHeaderFoldedTopMarginRemoteNameAndroidDimenMargin0dp = 0f;
        java.lang.Boolean controlsViewModelFullScreenModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = false;
        int conferenceViewModelIsRemotelyRecordedViewVISIBLEViewGONE = 0;
        boolean controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = false;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = false;

        if ((dirtyFlags & 0x2756L) != 0) {


            if ((dirtyFlags & 0x2402L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isConferenceLocallyPaused
                        conferenceViewModelIsConferenceLocallyPaused = conferenceViewModel.isConferenceLocallyPaused();
                    }
                    updateLiveDataRegistration(1, conferenceViewModelIsConferenceLocallyPaused);


                    if (conferenceViewModelIsConferenceLocallyPaused != null) {
                        // read conferenceViewModel.isConferenceLocallyPaused.getValue()
                        conferenceViewModelIsConferenceLocallyPausedGetValue = conferenceViewModelIsConferenceLocallyPaused.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsConferenceLocallyPausedGetValue);
            }
            if ((dirtyFlags & 0x2404L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceParticipantDevices
                        conferenceViewModelConferenceParticipantDevices = conferenceViewModel.getConferenceParticipantDevices();
                    }
                    updateLiveDataRegistration(2, conferenceViewModelConferenceParticipantDevices);


                    if (conferenceViewModelConferenceParticipantDevices != null) {
                        // read conferenceViewModel.conferenceParticipantDevices.getValue()
                        conferenceViewModelConferenceParticipantDevicesGetValue = conferenceViewModelConferenceParticipantDevices.getValue();
                    }
            }
            if ((dirtyFlags & 0x2410L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isRemotelyRecorded
                        conferenceViewModelIsRemotelyRecorded = conferenceViewModel.isRemotelyRecorded();
                    }
                    updateLiveDataRegistration(4, conferenceViewModelIsRemotelyRecorded);


                    if (conferenceViewModelIsRemotelyRecorded != null) {
                        // read conferenceViewModel.isRemotelyRecorded.getValue()
                        conferenceViewModelIsRemotelyRecordedGetValue = conferenceViewModelIsRemotelyRecorded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsRemotelyRecordedGetValue);
                if((dirtyFlags & 0x10000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }
                if((dirtyFlags & 0x2410L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? View.VISIBLE : View.GONE
                    conferenceViewModelIsRemotelyRecordedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x2440L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceCreationPending
                        ConferenceViewModelConferenceCreationPending1 = conferenceViewModel.getConferenceCreationPending();
                    }
                    updateLiveDataRegistration(6, ConferenceViewModelConferenceCreationPending1);


                    if (ConferenceViewModelConferenceCreationPending1 != null) {
                        // read conferenceViewModel.conferenceCreationPending.getValue()
                        conferenceViewModelConferenceCreationPendingGetValue = ConferenceViewModelConferenceCreationPending1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPendingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelConferenceCreationPendingGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue())
                    conferenceViewModelConferenceCreationPending = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPendingGetValue;


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPending = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelConferenceCreationPending);
            }
            if ((dirtyFlags & 0x2500L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isRecording
                        conferenceViewModelIsRecording = conferenceViewModel.isRecording();
                    }
                    updateLiveDataRegistration(8, conferenceViewModelIsRecording);


                    if (conferenceViewModelIsRecording != null) {
                        // read conferenceViewModel.isRecording.getValue()
                        conferenceViewModelIsRecordingGetValue = conferenceViewModelIsRecording.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRecording.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRecordingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsRecordingGetValue);
            }
            if ((dirtyFlags & 0x2600L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.subject
                        conferenceViewModelSubject = conferenceViewModel.getSubject();
                    }
                    updateLiveDataRegistration(9, conferenceViewModelSubject);


                    if (conferenceViewModelSubject != null) {
                        // read conferenceViewModel.subject.getValue()
                        conferenceViewModelSubjectGetValue = conferenceViewModelSubject.getValue();
                    }
            }
        }
        if ((dirtyFlags & 0x2800L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        if ((dirtyFlags & 0x3439L) != 0) {


            if ((dirtyFlags & 0x3008L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.folded
                        controlsViewModelFolded = controlsViewModel.getFolded();
                    }
                    updateLiveDataRegistration(3, controlsViewModelFolded);


                    if (controlsViewModelFolded != null) {
                        // read controlsViewModel.folded.getValue()
                        controlsViewModelFoldedGetValue = controlsViewModelFolded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelFoldedGetValue);
                if((dirtyFlags & 0x3008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/voip_conference_header_folded_top_margin : @android:dimen/margin_0dp
                    controlsViewModelFoldedRemoteNameAndroidDimenVoipConferenceHeaderFoldedTopMarginRemoteNameAndroidDimenMargin0dp = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue) ? (remoteName.getResources().getDimension(R.dimen.voip_conference_header_folded_top_margin)) : (remoteName.getResources().getDimension(R.dimen.margin_0dp)));
            }

                if (controlsViewModel != null) {
                    // read controlsViewModel.fullScreenMode
                    controlsViewModelFullScreenMode = controlsViewModel.getFullScreenMode();
                }
                updateLiveDataRegistration(5, controlsViewModelFullScreenMode);


                if (controlsViewModelFullScreenMode != null) {
                    // read controlsViewModel.fullScreenMode.getValue()
                    controlsViewModelFullScreenModeGetValue = controlsViewModelFullScreenMode.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelFullScreenModeGetValue);
            if((dirtyFlags & 0x3439L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40000000L) != 0) {

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

        if ((dirtyFlags & 0x3439L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue));
            if((dirtyFlags & 0x3021L) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) {
                        dirtyFlags |= 0x8000L;
                        dirtyFlags |= 0x80000L;
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x400000L;
                }
            }
            if((dirtyFlags & 0x3439L) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }

            if ((dirtyFlags & 0x3021L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_remote_margin
                    controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipRemoteMargin = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (conferenceConstraintLayout.getResources().getDimension(R.dimen.margin_0dp)) : (conferenceConstraintLayout.getResources().getDimension(R.dimen.voip_remote_margin)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_buttons_fragment_margin_size
                    controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipButtonsFragmentMarginSize = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (conferenceConstraintLayout.getResources().getDimension(R.dimen.margin_0dp)) : (conferenceConstraintLayout.getResources().getDimension(R.dimen.voip_buttons_fragment_margin_size)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
                    controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.folded
                    controlsViewModelFolded = controlsViewModel.getFolded();
                }
                updateLiveDataRegistration(3, controlsViewModelFolded);


                if (controlsViewModelFolded != null) {
                    // read controlsViewModel.folded.getValue()
                    controlsViewModelFoldedGetValue = controlsViewModelFolded.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelFoldedGetValue);
            if((dirtyFlags & 0x3008L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }
        }

        if ((dirtyFlags & 0x3439L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue())
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFolded = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue));
            if((dirtyFlags & 0x3439L) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFolded) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000L) != 0) {



                if (conferenceViewModel != null) {
                    // read conferenceViewModel.isRemotelyRecorded
                    conferenceViewModelIsRemotelyRecorded = conferenceViewModel.isRemotelyRecorded();
                }
                updateLiveDataRegistration(4, conferenceViewModelIsRemotelyRecorded);


                if (conferenceViewModelIsRemotelyRecorded != null) {
                    // read conferenceViewModel.isRemotelyRecorded.getValue()
                    conferenceViewModelIsRemotelyRecordedGetValue = conferenceViewModelIsRemotelyRecorded.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue())
                androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsRemotelyRecordedGetValue);
            if((dirtyFlags & 0x10000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
            if((dirtyFlags & 0x2410L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
                conferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) ? (topBarrier.getResources().getDimension(R.dimen.voip_single_call_header_size_with_record_info)) : (topBarrier.getResources().getDimension(R.dimen.voip_single_call_header_size)));
        }

        if ((dirtyFlags & 0x3439L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/margin_0dp : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFoldedTopBarrierAndroidDimenMargin0dpConferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFolded) ? (topBarrier.getResources().getDimension(R.dimen.margin_0dp)) : (conferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize));
        }
        // batch finished
        if ((dirtyFlags & 0x3021L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutMargins(this.conferenceConstraintLayout, controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipRemoteMargin);
            androidx.databinding.adapters.ViewBindingAdapter.setPaddingBottom(this.conferenceConstraintLayout, controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipButtonsFragmentMarginSize);
            this.group.setVisibility(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x2800L) != 0) {
            // api target 1

            this.conferenceConstraintLayout.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.conferenceConstraintLayout, true);
            this.gridBoxLayout.setCenterContent(true);
            this.gridBoxLayout.setOnClickListener(mCallback42);
            this.toggleConferenceRecording.setOnClickListener(mCallback41);
            this.togglePauseConference.setOnClickListener(mCallback40);
        }
        if ((dirtyFlags & 0x2404L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.gridBoxLayout, conferenceViewModelConferenceParticipantDevicesGetValue, R.layout.voip_conference_participant_remote_grid);
        }
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutTopMargin(this.remoteName, controlsViewModelFoldedRemoteNameAndroidDimenVoipConferenceHeaderFoldedTopMarginRemoteNameAndroidDimenMargin0dp);
        }
        if ((dirtyFlags & 0x2600L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.remoteName, conferenceViewModelSubjectGetValue);
        }
        if ((dirtyFlags & 0x2410L) != 0) {
            // api target 1

            this.remoteRecording.getRoot().setVisibility(conferenceViewModelIsRemotelyRecordedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2500L) != 0) {
            // api target 1

            this.toggleConferenceRecording.setSelected(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRecordingGetValue);
        }
        if ((dirtyFlags & 0x2440L) != 0) {
            // api target 1

            this.togglePauseConference.setEnabled(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPending);
        }
        if ((dirtyFlags & 0x2402L) != 0) {
            // api target 1

            this.togglePauseConference.setSelected(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue);
        }
        if ((dirtyFlags & 0x3439L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutTopMargin(this.topBarrier, controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFoldedTopBarrierAndroidDimenMargin0dpConferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize);
        }
        executeBindingsOn(remoteRecording);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {


                    controlsViewModel.toggleFullScreen();
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


                    conferenceViewModel.pauseConference();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // conferenceViewModel
                org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
                // conferenceViewModel != null
                boolean conferenceViewModelJavaLangObjectNull = false;



                conferenceViewModelJavaLangObjectNull = (conferenceViewModel) != (null);
                if (conferenceViewModelJavaLangObjectNull) {


                    conferenceViewModel.toggleRecording();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.pipMode
        flag 1 (0x2L): conferenceViewModel.isConferenceLocallyPaused
        flag 2 (0x3L): conferenceViewModel.conferenceParticipantDevices
        flag 3 (0x4L): controlsViewModel.folded
        flag 4 (0x5L): conferenceViewModel.isRemotelyRecorded
        flag 5 (0x6L): controlsViewModel.fullScreenMode
        flag 6 (0x7L): conferenceViewModel.conferenceCreationPending
        flag 7 (0x8L): remoteRecording
        flag 8 (0x9L): conferenceViewModel.isRecording
        flag 9 (0xaL): conferenceViewModel.subject
        flag 10 (0xbL): conferenceViewModel
        flag 11 (0xcL): inflatedVisibility
        flag 12 (0xdL): controlsViewModel
        flag 13 (0xeL): null
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_remote_margin
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_remote_margin
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/margin_0dp : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/margin_0dp : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_buttons_fragment_margin_size
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_buttons_fragment_margin_size
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue())
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue())
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/voip_conference_header_folded_top_margin : @android:dimen/margin_0dp
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/voip_conference_header_folded_top_margin : @android:dimen/margin_0dp
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
    flag mapping end*/
    //end
}