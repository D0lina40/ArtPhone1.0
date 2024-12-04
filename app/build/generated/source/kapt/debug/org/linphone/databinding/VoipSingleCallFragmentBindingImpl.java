package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipSingleCallFragmentBindingImpl extends VoipSingleCallFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(28);
        sIncludes.setIncludes(1, 
            new String[] {"voip_remote_recording", "voip_buttons", "voip_buttons_extra"},
            new int[] {20, 21, 22},
            new int[] {org.linphone.R.layout.voip_remote_recording,
                org.linphone.R.layout.voip_buttons,
                org.linphone.R.layout.voip_buttons_extra});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.stubbed_audio_routes, 14);
        sViewsWithIds.put(R.id.stubbed_remotely_paused_call, 15);
        sViewsWithIds.put(R.id.stubbed_paused_call, 16);
        sViewsWithIds.put(R.id.stubbed_call_stats, 18);
        sViewsWithIds.put(R.id.stubbed_numpad, 19);
        sViewsWithIds.put(R.id.hinge_top, 23);
        sViewsWithIds.put(R.id.hinge_bottom, 24);
        sViewsWithIds.put(R.id.active_call_timer, 25);
        sViewsWithIds.put(R.id.call_header_barrier, 26);
        sViewsWithIds.put(R.id.bottom_barrier, 27);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback82;
    @Nullable
    private final android.view.View.OnClickListener mCallback83;
    @Nullable
    private final android.view.View.OnClickListener mCallback80;
    @Nullable
    private final android.view.View.OnClickListener mCallback81;
    @Nullable
    private final android.view.View.OnClickListener mCallback84;
    @Nullable
    private final android.view.View.OnClickListener mCallback85;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipSingleCallFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private VoipSingleCallFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 22
            , (android.widget.Chronometer) bindings[25]
            , (android.widget.ImageView) bindings[6]
            , (android.view.View) bindings[5]
            , (androidx.constraintlayout.widget.Barrier) bindings[27]
            , (androidx.constraintlayout.widget.Barrier) bindings[26]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (android.widget.TextView) bindings[7]
            , (org.linphone.databinding.VoipButtonsExtraBinding) bindings[22]
            , (androidx.constraintlayout.widget.Group) bindings[3]
            , (androidx.constraintlayout.widget.Guideline) bindings[24]
            , (androidx.constraintlayout.widget.Guideline) bindings[23]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[12]
            , (android.widget.ImageView) bindings[11]
            , (android.view.View) bindings[17]
            , (org.linphone.databinding.VoipButtonsBinding) bindings[21]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[4]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[8]
            , (org.linphone.databinding.VoipRemoteRecordingBinding) bindings[20]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[14])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[18])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[19])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[16])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[15])
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[10]
            , (android.view.View) bindings[2]
            );
        this.avatar.setTag(null);
        this.background.setTag(null);
        this.constraintLayout.setTag(null);
        this.coordinator.setTag(null);
        this.displayName.setTag(null);
        setContainedBinding(this.extraButtons);
        this.group.setTag(null);
        this.localPreviewVideoSurface.setTag(null);
        this.pauseCall.setTag(null);
        this.popupBackground.setTag(null);
        setContainedBinding(this.primaryButtons);
        this.recordCall.setTag(null);
        this.remoteName.setTag(null);
        this.remoteVideoSurface.setTag(null);
        setContainedBinding(this.remotelyRecorded);
        this.stubbedAudioRoutes.setContainingBinding(this);
        this.stubbedCallStats.setContainingBinding(this);
        this.stubbedNumpad.setContainingBinding(this);
        this.stubbedPausedCall.setContainingBinding(this);
        this.stubbedRemotelyPausedCall.setContainingBinding(this);
        this.switchCamera.setTag(null);
        this.takeSnapshot.setTag(null);
        this.topBarrier.setTag(null);
        setRootTag(root);
        // listeners
        mCallback82 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback83 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback80 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback81 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback84 = new org.linphone.generated.callback.OnClickListener(this, 5);
        mCallback85 = new org.linphone.generated.callback.OnClickListener(this, 6);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4000000L;
                mDirtyFlags_1 = 0x0L;
        }
        remotelyRecorded.invalidateAll();
        primaryButtons.invalidateAll();
        extraButtons.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0 || mDirtyFlags_1 != 0) {
                return true;
            }
        }
        if (remotelyRecorded.hasPendingBindings()) {
            return true;
        }
        if (primaryButtons.hasPendingBindings()) {
            return true;
        }
        if (extraButtons.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.callsViewModel == variableId) {
            setCallsViewModel((org.linphone.activities.voip.viewmodels.CallsViewModel) variable);
        }
        else if (BR.statsViewModel == variableId) {
            setStatsViewModel((org.linphone.activities.voip.viewmodels.StatisticsListViewModel) variable);
        }
        else if (BR.conferenceViewModel == variableId) {
            setConferenceViewModel((org.linphone.activities.voip.viewmodels.ConferenceViewModel) variable);
        }
        else if (BR.controlsViewModel == variableId) {
            setControlsViewModel((org.linphone.activities.voip.viewmodels.ControlsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallsViewModel(@Nullable org.linphone.activities.voip.viewmodels.CallsViewModel CallsViewModel) {
        this.mCallsViewModel = CallsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400000L;
        }
        notifyPropertyChanged(BR.callsViewModel);
        super.requestRebind();
    }
    public void setStatsViewModel(@Nullable org.linphone.activities.voip.viewmodels.StatisticsListViewModel StatsViewModel) {
        this.mStatsViewModel = StatsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800000L;
        }
        notifyPropertyChanged(BR.statsViewModel);
        super.requestRebind();
    }
    public void setConferenceViewModel(@Nullable org.linphone.activities.voip.viewmodels.ConferenceViewModel ConferenceViewModel) {
        this.mConferenceViewModel = ConferenceViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1000000L;
        }
        notifyPropertyChanged(BR.conferenceViewModel);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2000000L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        remotelyRecorded.setLifecycleOwner(lifecycleOwner);
        primaryButtons.setLifecycleOwner(lifecycleOwner);
        extraButtons.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelFolded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeControlsViewModelIsSendingVideo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeControlsViewModelAudioRoutesEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeCallsViewModelCurrentCallDataIsPaused((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeControlsViewModelFullScreenMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeCallsViewModelCurrentCallDataIsRecording((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeControlsViewModelShowTakeSnapshotButton((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeCallsViewModelCurrentCallData((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData>) object, fieldId);
            case 8 :
                return onChangeControlsViewModelPipMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeControlsViewModelIsSwitchCameraAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeControlsViewModelCallStatsVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeCallsViewModelCurrentCallDataCanBePaused((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeCallsViewModelCurrentCallDataIsRemotelyPaused((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeRemotelyRecorded((org.linphone.databinding.VoipRemoteRecordingBinding) object, fieldId);
            case 14 :
                return onChangeControlsViewModelExtraButtonsMenuTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 15 :
                return onChangePrimaryButtons((org.linphone.databinding.VoipButtonsBinding) object, fieldId);
            case 16 :
                return onChangeControlsViewModelIsVideoEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 17 :
                return onChangeCallsViewModelCurrentCallDataIsRemotelyRecorded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 18 :
                return onChangeExtraButtons((org.linphone.databinding.VoipButtonsExtraBinding) object, fieldId);
            case 19 :
                return onChangeCallsViewModelCurrentCallDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 20 :
                return onChangeCallsViewModelCurrentCallDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 21 :
                return onChangeControlsViewModelNumpadVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControlsViewModelFolded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelFolded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsSendingVideo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsSendingVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelAudioRoutesEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelAudioRoutesEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataIsPaused(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelCurrentCallDataIsPaused, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelFullScreenMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelFullScreenMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataIsRecording(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelCurrentCallDataIsRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelShowTakeSnapshotButton(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelShowTakeSnapshotButton, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallData(androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> CallsViewModelCurrentCallData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelPipMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelPipMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsSwitchCameraAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsSwitchCameraAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelCallStatsVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelCallStatsVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataCanBePaused(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelCurrentCallDataCanBePaused, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataIsRemotelyPaused(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelCurrentCallDataIsRemotelyPaused, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRemotelyRecorded(org.linphone.databinding.VoipRemoteRecordingBinding RemotelyRecorded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelExtraButtonsMenuTranslateY(androidx.lifecycle.MutableLiveData<java.lang.Float> ControlsViewModelExtraButtonsMenuTranslateY, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePrimaryButtons(org.linphone.databinding.VoipButtonsBinding PrimaryButtons, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsVideoEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsVideoEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataIsRemotelyRecorded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelCurrentCallDataIsRemotelyRecorded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeExtraButtons(org.linphone.databinding.VoipButtonsExtraBinding ExtraButtons, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> CallsViewModelCurrentCallDataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> CallsViewModelCurrentCallDataDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelNumpadVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelNumpadVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200000L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        long dirtyFlags_1 = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
            dirtyFlags_1 = mDirtyFlags_1;
            mDirtyFlags_1 = 0;
        }
        org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyRecordedGetValue = false;
        int controlsViewModelNumpadVisibleViewVISIBLEViewGONE = 0;
        boolean callsViewModelCurrentCallDataIsPaused = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelFolded = null;
        java.lang.Boolean controlsViewModelIsSwitchCameraAvailableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSendingVideo = null;
        java.lang.Boolean controlsViewModelIsSendingVideoGetValue = null;
        java.lang.Boolean controlsViewModelFoldedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelAudioRoutesEnabled = null;
        boolean controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse = false;
        java.lang.Float controlsViewModelExtraButtonsMenuTranslateYGetValue = null;
        java.lang.Boolean callsViewModelCurrentCallDataIsRemotelyPausedGetValue = null;
        boolean controlsViewModelPipMode = false;
        float controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFoldedTopBarrierAndroidDimenMargin0dpCallsViewModelCurrentCallDataIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = 0f;
        float androidxDatabindingViewDataBindingSafeUnboxControlsViewModelExtraButtonsMenuTranslateYGetValue = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelCurrentCallDataIsPaused1 = null;
        int controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelCallStatsVisibleGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelShowTakeSnapshotButtonGetValue = false;
        boolean controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue = false;
        boolean controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRecordingGetValue = false;
        java.lang.String callsViewModelCurrentCallDataDisplayNameGetValue = null;
        java.lang.Boolean controlsViewModelPipModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelFullScreenMode = null;
        boolean callsViewModelCurrentCallDataIsPausedCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> callsViewModelCurrentCallDataIsRecording = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue = false;
        boolean callsViewModelCurrentCallDataIsPausedBooleanTrueCallsViewModelCurrentCallDataCanBePaused = false;
        boolean controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFolded = false;
        int callsViewModelCurrentCallDataIsPausedViewVISIBLEViewGONE = 0;
        java.lang.Boolean callsViewModelCurrentCallDataIsPausedGetValue = null;
        java.lang.String callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelShowTakeSnapshotButton = null;
        java.lang.Boolean controlsViewModelShowTakeSnapshotButtonGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> callsViewModelCurrentCallData = null;
        org.linphone.activities.voip.viewmodels.StatisticsListViewModel statsViewModel = mStatsViewModel;
        boolean controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenMode = false;
        org.linphone.activities.voip.data.CallData callsViewModelCurrentCallDataGetValue = null;
        boolean controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue = false;
        int controlsViewModelCallStatsVisibleViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelPipMode1 = null;
        java.lang.String callsViewModelCurrentCallDataContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSwitchCameraAvailable = null;
        boolean controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalseControlsViewModelPipModeBooleanFalse = false;
        java.lang.Boolean controlsViewModelCallStatsVisibleGetValue = null;
        int controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalseControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelCallStatsVisible = null;
        boolean callsViewModelCurrentCallDataContactNameJavaLangObjectNull = false;
        java.lang.Boolean callsViewModelCurrentCallDataCanBePausedGetValue = null;
        boolean callsViewModelCurrentCallDataIsRemotelyPaused = false;
        boolean controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse = false;
        org.linphone.core.Friend callsViewModelCurrentCallDataContactGetValue = null;
        int controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = 0;
        boolean controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalse = false;
        boolean controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> callsViewModelCurrentCallDataCanBePaused = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelCurrentCallDataIsRemotelyPaused1 = null;
        boolean controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse = false;
        int callsViewModelCurrentCallDataIsRemotelyRecordedViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue = false;
        boolean controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse = false;
        java.lang.Boolean controlsViewModelIsVideoEnabledGetValue = null;
        float callsViewModelCurrentCallDataIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Float> controlsViewModelExtraButtonsMenuTranslateY = null;
        float controlsViewModelPipModeLocalPreviewVideoSurfaceAndroidDimenVideoPreviewPipMaxSizeLocalPreviewVideoSurfaceAndroidDimenVideoPreviewMaxSize = 0f;
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsVideoEnabled = null;
        boolean ControlsViewModelShowTakeSnapshotButton1 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> callsViewModelCurrentCallDataIsRemotelyRecorded = null;
        int controlsViewModelFullScreenModeConstraintLayoutAndroidColorBlackColorConstraintLayoutAndroidColorTransparentColor = 0;
        java.lang.Boolean controlsViewModelAudioRoutesEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> callsViewModelCurrentCallDataContact = null;
        int callsViewModelCurrentCallDataIsRemotelyPausedViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> callsViewModelCurrentCallDataDisplayName = null;
        float controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBackgroundAndroidDimenMargin0dpBackgroundAndroidDimenVoipRemoteMargin = 0f;
        int controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = 0;
        java.lang.Boolean callsViewModelCurrentCallDataIsRemotelyRecordedGetValue = null;
        java.lang.Boolean callsViewModelCurrentCallDataIsRecordingGetValue = null;
        java.lang.Boolean controlsViewModelFullScreenModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = false;
        java.lang.String callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactNameJavaLangString = null;
        int controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelNumpadVisible = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataCanBePausedGetValue = false;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        boolean controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = false;
        int controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue = false;
        java.lang.Boolean controlsViewModelNumpadVisibleGetValue = null;

        if ((dirtyFlags & 0x45a18a8L) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.currentCallData
                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();
                }
                updateLiveDataRegistration(7, callsViewModelCurrentCallData);


                if (callsViewModelCurrentCallData != null) {
                    // read callsViewModel.currentCallData.getValue()
                    callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();
                }

            if ((dirtyFlags & 0x4401888L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isPaused
                        CallsViewModelCurrentCallDataIsPaused1 = callsViewModelCurrentCallDataGetValue.isPaused();
                    }
                    updateLiveDataRegistration(3, CallsViewModelCurrentCallDataIsPaused1);


                    if (CallsViewModelCurrentCallDataIsPaused1 != null) {
                        // read callsViewModel.currentCallData.getValue().isPaused.getValue()
                        callsViewModelCurrentCallDataIsPausedGetValue = CallsViewModelCurrentCallDataIsPaused1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsPausedGetValue);
                if((dirtyFlags & 0x4400888L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue) {
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000L;
                    }
                }
                if((dirtyFlags & 0x4400088L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }

                if ((dirtyFlags & 0x4401088L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue())
                        callsViewModelCurrentCallDataIsPaused = !androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue;
                    if((dirtyFlags & 0x4401088L) != 0) {
                        if(callsViewModelCurrentCallDataIsPaused) {
                                dirtyFlags |= 0x10000000000L;
                        }
                        else {
                                dirtyFlags |= 0x8000000000L;
                        }
                    }
                }
                if ((dirtyFlags & 0x4400088L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) ? View.VISIBLE : View.GONE
                        callsViewModelCurrentCallDataIsPausedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x44000a0L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isRecording
                        callsViewModelCurrentCallDataIsRecording = callsViewModelCurrentCallDataGetValue.isRecording();
                    }
                    updateLiveDataRegistration(5, callsViewModelCurrentCallDataIsRecording);


                    if (callsViewModelCurrentCallDataIsRecording != null) {
                        // read callsViewModel.currentCallData.getValue().isRecording.getValue()
                        callsViewModelCurrentCallDataIsRecordingGetValue = callsViewModelCurrentCallDataIsRecording.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRecording.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRecordingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsRecordingGetValue);
            }
            if ((dirtyFlags & 0x4401080L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyPaused
                        CallsViewModelCurrentCallDataIsRemotelyPaused1 = callsViewModelCurrentCallDataGetValue.isRemotelyPaused();
                    }
                    updateLiveDataRegistration(12, CallsViewModelCurrentCallDataIsRemotelyPaused1);


                    if (CallsViewModelCurrentCallDataIsRemotelyPaused1 != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()
                        callsViewModelCurrentCallDataIsRemotelyPausedGetValue = CallsViewModelCurrentCallDataIsRemotelyPaused1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsRemotelyPausedGetValue);
                if((dirtyFlags & 0x4401080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue) {
                            dirtyFlags_1 |= 0x10000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) ? View.VISIBLE : View.GONE
                    callsViewModelCurrentCallDataIsRemotelyPausedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x4420080L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyRecorded
                        callsViewModelCurrentCallDataIsRemotelyRecorded = callsViewModelCurrentCallDataGetValue.isRemotelyRecorded();
                    }
                    updateLiveDataRegistration(17, callsViewModelCurrentCallDataIsRemotelyRecorded);


                    if (callsViewModelCurrentCallDataIsRemotelyRecorded != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()
                        callsViewModelCurrentCallDataIsRemotelyRecordedGetValue = callsViewModelCurrentCallDataIsRemotelyRecorded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyRecordedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsRemotelyRecordedGetValue);
                if((dirtyFlags & 0x4420080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyRecordedGetValue) {
                            dirtyFlags_1 |= 0x40L;
                    }
                    else {
                            dirtyFlags_1 |= 0x20L;
                    }
                }
                if((dirtyFlags & 0x80000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyRecordedGetValue) {
                            dirtyFlags_1 |= 0x400L;
                    }
                    else {
                            dirtyFlags_1 |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()) ? View.VISIBLE : View.GONE
                    callsViewModelCurrentCallDataIsRemotelyRecordedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyRecordedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x4580080L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().contact
                        callsViewModelCurrentCallDataContact = callsViewModelCurrentCallDataGetValue.getContact();
                    }
                    updateLiveDataRegistration(19, callsViewModelCurrentCallDataContact);


                    if (callsViewModelCurrentCallDataContact != null) {
                        // read callsViewModel.currentCallData.getValue().contact.getValue()
                        callsViewModelCurrentCallDataContactGetValue = callsViewModelCurrentCallDataContact.getValue();
                    }


                    if (callsViewModelCurrentCallDataContactGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().contact.getValue().name
                        callsViewModelCurrentCallDataContactName = callsViewModelCurrentCallDataContactGetValue.getName();
                    }


                    // read callsViewModel.currentCallData.getValue().contact.getValue().name == null
                    callsViewModelCurrentCallDataContactNameJavaLangObjectNull = (callsViewModelCurrentCallDataContactName) == (null);
                if((dirtyFlags & 0x4580080L) != 0) {
                    if(callsViewModelCurrentCallDataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x4800000L) != 0) {
        }
        if ((dirtyFlags & 0x5000000L) != 0) {
        }
        if ((dirtyFlags & 0x66357dfL) != 0) {


            if ((dirtyFlags & 0x640138aL) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isSendingVideo
                        controlsViewModelIsSendingVideo = controlsViewModel.isSendingVideo();
                    }
                    updateLiveDataRegistration(1, controlsViewModelIsSendingVideo);


                    if (controlsViewModelIsSendingVideo != null) {
                        // read controlsViewModel.isSendingVideo.getValue()
                        controlsViewModelIsSendingVideoGetValue = controlsViewModelIsSendingVideo.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSendingVideoGetValue);
                if((dirtyFlags & 0x640138aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue) {
                            dirtyFlags |= 0x1000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x6000004L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.audioRoutesEnabled
                        controlsViewModelAudioRoutesEnabled = controlsViewModel.getAudioRoutesEnabled();
                    }
                    updateLiveDataRegistration(2, controlsViewModelAudioRoutesEnabled);


                    if (controlsViewModelAudioRoutesEnabled != null) {
                        // read controlsViewModel.audioRoutesEnabled.getValue()
                        controlsViewModelAudioRoutesEnabledGetValue = controlsViewModelAudioRoutesEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelAudioRoutesEnabledGetValue);
                if((dirtyFlags & 0x6000004L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x6420191L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.fullScreenMode
                        controlsViewModelFullScreenMode = controlsViewModel.getFullScreenMode();
                    }
                    updateLiveDataRegistration(4, controlsViewModelFullScreenMode);


                    if (controlsViewModelFullScreenMode != null) {
                        // read controlsViewModel.fullScreenMode.getValue()
                        controlsViewModelFullScreenModeGetValue = controlsViewModelFullScreenMode.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelFullScreenModeGetValue);
                if((dirtyFlags & 0x6420191L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags |= 0x10000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000000L;
                    }
                }
                if((dirtyFlags & 0x6000010L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags_1 |= 0x4000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000L;
                    }
                }

                if ((dirtyFlags & 0x6000010L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:color/black_color : @android:color/transparent_color
                        controlsViewModelFullScreenModeConstraintLayoutAndroidColorBlackColorConstraintLayoutAndroidColorTransparentColor = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (getColorFromResource(constraintLayout, R.color.black_color)) : (getColorFromResource(constraintLayout, R.color.transparent_color)));
                }
            }
            if ((dirtyFlags & 0x6000150L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.showTakeSnapshotButton
                        controlsViewModelShowTakeSnapshotButton = controlsViewModel.getShowTakeSnapshotButton();
                    }
                    updateLiveDataRegistration(6, controlsViewModelShowTakeSnapshotButton);


                    if (controlsViewModelShowTakeSnapshotButton != null) {
                        // read controlsViewModel.showTakeSnapshotButton.getValue()
                        controlsViewModelShowTakeSnapshotButtonGetValue = controlsViewModelShowTakeSnapshotButton.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelShowTakeSnapshotButtonGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelShowTakeSnapshotButtonGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue())
                    ControlsViewModelShowTakeSnapshotButton1 = !androidxDatabindingViewDataBindingSafeUnboxControlsViewModelShowTakeSnapshotButtonGetValue;
                if((dirtyFlags & 0x6000150L) != 0) {
                    if(ControlsViewModelShowTakeSnapshotButton1) {
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x6000100L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.pipMode
                        ControlsViewModelPipMode1 = controlsViewModel.getPipMode();
                    }
                    updateLiveDataRegistration(8, ControlsViewModelPipMode1);


                    if (ControlsViewModelPipMode1 != null) {
                        // read controlsViewModel.pipMode.getValue()
                        controlsViewModelPipModeGetValue = ControlsViewModelPipMode1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelPipModeGetValue);
                if((dirtyFlags & 0x6000100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue) {
                            dirtyFlags_1 |= 0x1000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/video_preview_pip_max_size : @android:dimen/video_preview_max_size
                    controlsViewModelPipModeLocalPreviewVideoSurfaceAndroidDimenVideoPreviewPipMaxSizeLocalPreviewVideoSurfaceAndroidDimenVideoPreviewMaxSize = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue) ? (localPreviewVideoSurface.getResources().getDimension(R.dimen.video_preview_pip_max_size)) : (localPreviewVideoSurface.getResources().getDimension(R.dimen.video_preview_max_size)));
            }
            if ((dirtyFlags & 0x6000400L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.callStatsVisible
                        controlsViewModelCallStatsVisible = controlsViewModel.getCallStatsVisible();
                    }
                    updateLiveDataRegistration(10, controlsViewModelCallStatsVisible);


                    if (controlsViewModelCallStatsVisible != null) {
                        // read controlsViewModel.callStatsVisible.getValue()
                        controlsViewModelCallStatsVisibleGetValue = controlsViewModelCallStatsVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.callStatsVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelCallStatsVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelCallStatsVisibleGetValue);
                if((dirtyFlags & 0x6000400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelCallStatsVisibleGetValue) {
                            dirtyFlags |= 0x40000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.callStatsVisible.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelCallStatsVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelCallStatsVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x6004000L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.extraButtonsMenuTranslateY
                        controlsViewModelExtraButtonsMenuTranslateY = controlsViewModel.getExtraButtonsMenuTranslateY();
                    }
                    updateLiveDataRegistration(14, controlsViewModelExtraButtonsMenuTranslateY);


                    if (controlsViewModelExtraButtonsMenuTranslateY != null) {
                        // read controlsViewModel.extraButtonsMenuTranslateY.getValue()
                        controlsViewModelExtraButtonsMenuTranslateYGetValue = controlsViewModelExtraButtonsMenuTranslateY.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.extraButtonsMenuTranslateY.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelExtraButtonsMenuTranslateYGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelExtraButtonsMenuTranslateYGetValue);
            }
            if ((dirtyFlags & 0x641108aL) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isVideoEnabled
                        controlsViewModelIsVideoEnabled = controlsViewModel.isVideoEnabled();
                    }
                    updateLiveDataRegistration(16, controlsViewModelIsVideoEnabled);


                    if (controlsViewModelIsVideoEnabled != null) {
                        // read controlsViewModel.isVideoEnabled.getValue()
                        controlsViewModelIsVideoEnabledGetValue = controlsViewModelIsVideoEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsVideoEnabledGetValue);
                if((dirtyFlags & 0x6411088L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }
                if((dirtyFlags & 0x641108aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue) {
                            dirtyFlags_1 |= 0x10L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8L;
                    }
                }
            }
            if ((dirtyFlags & 0x6200000L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.numpadVisible
                        controlsViewModelNumpadVisible = controlsViewModel.getNumpadVisible();
                    }
                    updateLiveDataRegistration(21, controlsViewModelNumpadVisible);


                    if (controlsViewModelNumpadVisible != null) {
                        // read controlsViewModel.numpadVisible.getValue()
                        controlsViewModelNumpadVisibleGetValue = controlsViewModelNumpadVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelNumpadVisibleGetValue);
                if((dirtyFlags & 0x6200000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelNumpadVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000040000000L) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.currentCallData
                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();
                }
                updateLiveDataRegistration(7, callsViewModelCurrentCallData);


                if (callsViewModelCurrentCallData != null) {
                    // read callsViewModel.currentCallData.getValue()
                    callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();
                }

            if ((dirtyFlags & 0x40000000L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyPaused
                        CallsViewModelCurrentCallDataIsRemotelyPaused1 = callsViewModelCurrentCallDataGetValue.isRemotelyPaused();
                    }
                    updateLiveDataRegistration(12, CallsViewModelCurrentCallDataIsRemotelyPaused1);


                    if (CallsViewModelCurrentCallDataIsRemotelyPaused1 != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()
                        callsViewModelCurrentCallDataIsRemotelyPausedGetValue = CallsViewModelCurrentCallDataIsRemotelyPaused1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsRemotelyPausedGetValue);
                if((dirtyFlags & 0x4401080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue) {
                            dirtyFlags_1 |= 0x10000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue())
                    callsViewModelCurrentCallDataIsRemotelyPaused = !androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue;
            }
            if ((dirtyFlags & 0x1000000000000L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().displayName
                        callsViewModelCurrentCallDataDisplayName = callsViewModelCurrentCallDataGetValue.getDisplayName();
                    }
                    updateLiveDataRegistration(20, callsViewModelCurrentCallDataDisplayName);


                    if (callsViewModelCurrentCallDataDisplayName != null) {
                        // read callsViewModel.currentCallData.getValue().displayName.getValue()
                        callsViewModelCurrentCallDataDisplayNameGetValue = callsViewModelCurrentCallDataDisplayName.getValue();
                    }
            }
        }
        if ((dirtyFlags_1 & 0x10L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.isSendingVideo
                    controlsViewModelIsSendingVideo = controlsViewModel.isSendingVideo();
                }
                updateLiveDataRegistration(1, controlsViewModelIsSendingVideo);


                if (controlsViewModelIsSendingVideo != null) {
                    // read controlsViewModel.isSendingVideo.getValue()
                    controlsViewModelIsSendingVideoGetValue = controlsViewModelIsSendingVideo.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSendingVideoGetValue);
            if((dirtyFlags & 0x640138aL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue) {
                        dirtyFlags |= 0x1000000000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x2000000000000L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.fullScreenMode
                    controlsViewModelFullScreenMode = controlsViewModel.getFullScreenMode();
                }
                updateLiveDataRegistration(4, controlsViewModelFullScreenMode);


                if (controlsViewModelFullScreenMode != null) {
                    // read controlsViewModel.fullScreenMode.getValue()
                    controlsViewModelFullScreenModeGetValue = controlsViewModelFullScreenMode.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelFullScreenModeGetValue);
            if((dirtyFlags & 0x6420191L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                        dirtyFlags |= 0x10000000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000000L;
                }
            }
            if((dirtyFlags & 0x6000010L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                        dirtyFlags_1 |= 0x4000L;
                }
                else {
                        dirtyFlags_1 |= 0x2000L;
                }
            }
        }

        if ((dirtyFlags & 0x6411088L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
                controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue) ? (callsViewModelCurrentCallDataIsRemotelyPaused) : (false));
            if((dirtyFlags & 0x6411088L) != 0) {
                if(controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse) {
                        dirtyFlags_1 |= 0x100L;
                }
                else {
                        dirtyFlags_1 |= 0x80L;
                }
            }
        }
        if ((dirtyFlags & 0x4580080L) != 0) {

                // read callsViewModel.currentCallData.getValue().contact.getValue().name == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().contact.getValue().name
                callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactName = ((callsViewModelCurrentCallDataContactNameJavaLangObjectNull) ? (callsViewModelCurrentCallDataDisplayNameGetValue) : (callsViewModelCurrentCallDataContactName));


                // read (callsViewModel.currentCallData.getValue().contact.getValue().name == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().contact.getValue().name) + (" - ")
                callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactNameJavaLangString = (callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactName) + (" - ");
        }
        if ((dirtyFlags & 0x6000150L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
                controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenMode = ((ControlsViewModelShowTakeSnapshotButton1) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue));
            if((dirtyFlags & 0x6000150L) != 0) {
                if(controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenMode) {
                        dirtyFlags_1 |= 0x1000000L;
                }
                else {
                        dirtyFlags_1 |= 0x800000L;
                }
            }
        }
        if ((dirtyFlags & 0x641108aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false
                controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue) : (false));
            if((dirtyFlags & 0x641108aL) != 0) {
                if(controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse) {
                        dirtyFlags |= 0x1000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000001000000000L) != 0 || (dirtyFlags_1 & 0x100L) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.currentCallData
                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();
                }
                updateLiveDataRegistration(7, callsViewModelCurrentCallData);


                if (callsViewModelCurrentCallData != null) {
                    // read callsViewModel.currentCallData.getValue()
                    callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();
                }

            if ((dirtyFlags_1 & 0x100L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isPaused
                        CallsViewModelCurrentCallDataIsPaused1 = callsViewModelCurrentCallDataGetValue.isPaused();
                    }
                    updateLiveDataRegistration(3, CallsViewModelCurrentCallDataIsPaused1);


                    if (CallsViewModelCurrentCallDataIsPaused1 != null) {
                        // read callsViewModel.currentCallData.getValue().isPaused.getValue()
                        callsViewModelCurrentCallDataIsPausedGetValue = CallsViewModelCurrentCallDataIsPaused1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsPausedGetValue);
                if((dirtyFlags & 0x4400888L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue) {
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000L;
                    }
                }
                if((dirtyFlags & 0x4400088L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue())
                    callsViewModelCurrentCallDataIsPaused = !androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue;
                if((dirtyFlags & 0x4401088L) != 0) {
                    if(callsViewModelCurrentCallDataIsPaused) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1000001000000000L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyPaused
                        CallsViewModelCurrentCallDataIsRemotelyPaused1 = callsViewModelCurrentCallDataGetValue.isRemotelyPaused();
                    }
                    updateLiveDataRegistration(12, CallsViewModelCurrentCallDataIsRemotelyPaused1);


                    if (CallsViewModelCurrentCallDataIsRemotelyPaused1 != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()
                        callsViewModelCurrentCallDataIsRemotelyPausedGetValue = CallsViewModelCurrentCallDataIsRemotelyPaused1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsRemotelyPausedGetValue);
                if((dirtyFlags & 0x4401080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue) {
                            dirtyFlags_1 |= 0x10000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue())
                    callsViewModelCurrentCallDataIsRemotelyPaused = !androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue;
            }
        }
        if ((dirtyFlags & 0x8000000000000L) != 0 || (dirtyFlags_1 & 0x800000L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.pipMode
                    ControlsViewModelPipMode1 = controlsViewModel.getPipMode();
                }
                updateLiveDataRegistration(8, ControlsViewModelPipMode1);


                if (ControlsViewModelPipMode1 != null) {
                    // read controlsViewModel.pipMode.getValue()
                    controlsViewModelPipModeGetValue = ControlsViewModelPipMode1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelPipModeGetValue);
            if((dirtyFlags & 0x6000100L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue) {
                        dirtyFlags_1 |= 0x1000L;
                }
                else {
                        dirtyFlags_1 |= 0x800L;
                }
            }
        }

        if ((dirtyFlags & 0x641108aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
                controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse = ((controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse) ? (callsViewModelCurrentCallDataIsRemotelyPaused) : (false));
            if((dirtyFlags & 0x641108aL) != 0) {
                if(controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse) {
                        dirtyFlags_1 |= 0x4L;
                }
                else {
                        dirtyFlags_1 |= 0x2L;
                }
            }
        }
        if ((dirtyFlags & 0x6420191L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue));
            if((dirtyFlags & 0x6420191L) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) {
                        dirtyFlags |= 0x100000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000L;
                }
            }
            if((dirtyFlags & 0x6000110L) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) {
                        dirtyFlags_1 |= 0x40000L;
                        dirtyFlags_1 |= 0x100000L;
                }
                else {
                        dirtyFlags_1 |= 0x20000L;
                        dirtyFlags_1 |= 0x80000L;
                }
            }

            if ((dirtyFlags & 0x6000110L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_remote_margin
                    controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBackgroundAndroidDimenMargin0dpBackgroundAndroidDimenVoipRemoteMargin = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (background.getResources().getDimension(R.dimen.margin_0dp)) : (background.getResources().getDimension(R.dimen.voip_remote_margin)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
                    controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0x640138aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
                controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue) ? (callsViewModelCurrentCallDataIsRemotelyPaused) : (false));
            if((dirtyFlags & 0x640138aL) != 0) {
                if(controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse) {
                        dirtyFlags |= 0x4000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x6411088L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false
                controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse = ((controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse) ? (callsViewModelCurrentCallDataIsPaused) : (false));
            if((dirtyFlags & 0x6411088L) != 0) {
                if(controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse) {
                        dirtyFlags_1 |= 0x4000000L;
                }
                else {
                        dirtyFlags_1 |= 0x2000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? View.VISIBLE : View.GONE
                controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseViewVISIBLEViewGONE = ((controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6000150L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = ((controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenMode) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue));
            if((dirtyFlags & 0x6000150L) != 0) {
                if(controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) {
                        dirtyFlags |= 0x4000000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
                controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = ((controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x4000000000L) != 0 || (dirtyFlags_1 & 0x4L) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.currentCallData
                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();
                }
                updateLiveDataRegistration(7, callsViewModelCurrentCallData);


                if (callsViewModelCurrentCallData != null) {
                    // read callsViewModel.currentCallData.getValue()
                    callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();
                }


                if (callsViewModelCurrentCallDataGetValue != null) {
                    // read callsViewModel.currentCallData.getValue().isPaused
                    CallsViewModelCurrentCallDataIsPaused1 = callsViewModelCurrentCallDataGetValue.isPaused();
                }
                updateLiveDataRegistration(3, CallsViewModelCurrentCallDataIsPaused1);


                if (CallsViewModelCurrentCallDataIsPaused1 != null) {
                    // read callsViewModel.currentCallData.getValue().isPaused.getValue()
                    callsViewModelCurrentCallDataIsPausedGetValue = CallsViewModelCurrentCallDataIsPaused1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue())
                androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsPausedGetValue);
            if((dirtyFlags & 0x4400888L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue) {
                        dirtyFlags |= 0x40000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000000L;
                }
            }
            if((dirtyFlags & 0x4400088L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue) {
                        dirtyFlags |= 0x400000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue())
                callsViewModelCurrentCallDataIsPaused = !androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue;
            if((dirtyFlags & 0x4401088L) != 0) {
                if(callsViewModelCurrentCallDataIsPaused) {
                        dirtyFlags |= 0x10000000000L;
                }
                else {
                        dirtyFlags |= 0x8000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x80000000000L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.folded
                    controlsViewModelFolded = controlsViewModel.getFolded();
                }
                updateLiveDataRegistration(0, controlsViewModelFolded);


                if (controlsViewModelFolded != null) {
                    // read controlsViewModel.folded.getValue()
                    controlsViewModelFoldedGetValue = controlsViewModelFolded.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelFoldedGetValue);
        }

        if ((dirtyFlags & 0x640138aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false
                controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse = ((controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse) ? (callsViewModelCurrentCallDataIsPaused) : (false));
            if((dirtyFlags & 0x640138aL) != 0) {
                if(controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse) {
                        dirtyFlags_1 |= 0x1L;
                }
                else {
                        dirtyFlags |= 0x8000000000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x6420191L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue())
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFolded = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue));
            if((dirtyFlags & 0x6420191L) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFolded) {
                        dirtyFlags |= 0x100000000L;
                }
                else {
                        dirtyFlags |= 0x80000000L;
                }
            }
        }
        if ((dirtyFlags & 0x641108aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false
                controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse = ((controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse) ? (callsViewModelCurrentCallDataIsPaused) : (false));
            if((dirtyFlags & 0x641108aL) != 0) {
                if(controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse) {
                        dirtyFlags_1 |= 0x400000L;
                }
                else {
                        dirtyFlags_1 |= 0x200000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? View.VISIBLE : View.GONE
                controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseViewVISIBLEViewGONE = ((controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x30080000000L) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.currentCallData
                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();
                }
                updateLiveDataRegistration(7, callsViewModelCurrentCallData);


                if (callsViewModelCurrentCallData != null) {
                    // read callsViewModel.currentCallData.getValue()
                    callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();
                }

            if ((dirtyFlags & 0x20000000000L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().canBePaused
                        callsViewModelCurrentCallDataCanBePaused = callsViewModelCurrentCallDataGetValue.getCanBePaused();
                    }
                    updateLiveDataRegistration(11, callsViewModelCurrentCallDataCanBePaused);


                    if (callsViewModelCurrentCallDataCanBePaused != null) {
                        // read callsViewModel.currentCallData.getValue().canBePaused.getValue()
                        callsViewModelCurrentCallDataCanBePausedGetValue = callsViewModelCurrentCallDataCanBePaused.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().canBePaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataCanBePausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataCanBePausedGetValue);
            }
            if ((dirtyFlags & 0x10000000000L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyPaused
                        CallsViewModelCurrentCallDataIsRemotelyPaused1 = callsViewModelCurrentCallDataGetValue.isRemotelyPaused();
                    }
                    updateLiveDataRegistration(12, CallsViewModelCurrentCallDataIsRemotelyPaused1);


                    if (CallsViewModelCurrentCallDataIsRemotelyPaused1 != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()
                        callsViewModelCurrentCallDataIsRemotelyPausedGetValue = CallsViewModelCurrentCallDataIsRemotelyPaused1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsRemotelyPausedGetValue);
                if((dirtyFlags & 0x4401080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue) {
                            dirtyFlags_1 |= 0x10000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue())
                    callsViewModelCurrentCallDataIsRemotelyPaused = !androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyPausedGetValue;
            }
            if ((dirtyFlags & 0x80000000L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyRecorded
                        callsViewModelCurrentCallDataIsRemotelyRecorded = callsViewModelCurrentCallDataGetValue.isRemotelyRecorded();
                    }
                    updateLiveDataRegistration(17, callsViewModelCurrentCallDataIsRemotelyRecorded);


                    if (callsViewModelCurrentCallDataIsRemotelyRecorded != null) {
                        // read callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()
                        callsViewModelCurrentCallDataIsRemotelyRecordedGetValue = callsViewModelCurrentCallDataIsRemotelyRecorded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyRecordedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsRemotelyRecordedGetValue);
                if((dirtyFlags & 0x4420080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyRecordedGetValue) {
                            dirtyFlags_1 |= 0x40L;
                    }
                    else {
                            dirtyFlags_1 |= 0x20L;
                    }
                }
                if((dirtyFlags & 0x80000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyRecordedGetValue) {
                            dirtyFlags_1 |= 0x400L;
                    }
                    else {
                            dirtyFlags_1 |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
                    callsViewModelCurrentCallDataIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRemotelyRecordedGetValue) ? (topBarrier.getResources().getDimension(R.dimen.voip_single_call_header_size_with_record_info)) : (topBarrier.getResources().getDimension(R.dimen.voip_single_call_header_size)));
            }
        }
        if ((dirtyFlags_1 & 0x1L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.isSwitchCameraAvailable
                    controlsViewModelIsSwitchCameraAvailable = controlsViewModel.isSwitchCameraAvailable();
                }
                updateLiveDataRegistration(9, controlsViewModelIsSwitchCameraAvailable);


                if (controlsViewModelIsSwitchCameraAvailable != null) {
                    // read controlsViewModel.isSwitchCameraAvailable.getValue()
                    controlsViewModelIsSwitchCameraAvailableGetValue = controlsViewModelIsSwitchCameraAvailable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSwitchCameraAvailableGetValue);
        }

        if ((dirtyFlags & 0x6420191L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/margin_0dp : androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFoldedTopBarrierAndroidDimenMargin0dpCallsViewModelCurrentCallDataIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFolded) ? (topBarrier.getResources().getDimension(R.dimen.margin_0dp)) : (callsViewModelCurrentCallDataIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize));
        }
        if ((dirtyFlags & 0x4401088L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
                callsViewModelCurrentCallDataIsPausedCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse = ((callsViewModelCurrentCallDataIsPaused) ? (callsViewModelCurrentCallDataIsRemotelyPaused) : (false));
        }
        if ((dirtyFlags & 0x4400888L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().canBePaused.getValue())
                callsViewModelCurrentCallDataIsPausedBooleanTrueCallsViewModelCurrentCallDataCanBePaused = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataCanBePausedGetValue));
        }
        if ((dirtyFlags & 0x640138aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) : false
                controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalse = ((controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) : (false));
            if((dirtyFlags & 0x640138aL) != 0) {
                if(controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalse) {
                        dirtyFlags |= 0x100000000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000000000000L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.pipMode
                    ControlsViewModelPipMode1 = controlsViewModel.getPipMode();
                }
                updateLiveDataRegistration(8, ControlsViewModelPipMode1);


                if (ControlsViewModelPipMode1 != null) {
                    // read controlsViewModel.pipMode.getValue()
                    controlsViewModelPipModeGetValue = ControlsViewModelPipMode1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelPipModeGetValue);
            if((dirtyFlags & 0x6000100L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue) {
                        dirtyFlags_1 |= 0x1000L;
                }
                else {
                        dirtyFlags_1 |= 0x800L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                controlsViewModelPipMode = !androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue;
        }

        if ((dirtyFlags & 0x640138aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
                controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalseControlsViewModelPipModeBooleanFalse = ((controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalse) ? (controlsViewModelPipMode) : (false));
            if((dirtyFlags & 0x640138aL) != 0) {
                if(controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalseControlsViewModelPipModeBooleanFalse) {
                        dirtyFlags |= 0x400000000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
                controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalseControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = ((controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalseControlsViewModelPipModeBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4400080L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadVoipContactPictureWithCoil(this.avatar, callsViewModelCurrentCallDataGetValue);
            if (this.stubbedPausedCall.isInflated()) this.stubbedPausedCall.getBinding().setVariable(BR.data, callsViewModelCurrentCallDataGetValue);
        }
        if ((dirtyFlags & 0x6000110L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutMargins(this.background, controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBackgroundAndroidDimenMargin0dpBackgroundAndroidDimenVoipRemoteMargin);
            this.group.setVisibility(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE);
            this.pauseCall.setVisibility(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE);
            this.primaryButtons.getRoot().setVisibility(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE);
            this.recordCall.setVisibility(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6000010L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.constraintLayout, androidx.databinding.adapters.Converters.convertColorToDrawable(controlsViewModelFullScreenModeConstraintLayoutAndroidColorBlackColorConstraintLayoutAndroidColorTransparentColor));
        }
        if ((dirtyFlags & 0x4580080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.displayName, callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.remoteName, callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactNameJavaLangString);
        }
        if ((dirtyFlags & 0x6004000L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.extraButtons.getRoot().setTranslationY(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelExtraButtonsMenuTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x4000000L) != 0) {
            // api target 1

            this.extraButtons.getRoot().setVisibility(android.view.View.VISIBLE);
            this.pauseCall.setOnClickListener(mCallback83);
            this.popupBackground.setOnClickListener(mCallback85);
            this.recordCall.setOnClickListener(mCallback81);
            this.remoteVideoSurface.setOnClickListener(mCallback80);
            this.switchCamera.setOnClickListener(mCallback84);
            this.takeSnapshot.setOnClickListener(mCallback82);
        }
        if ((dirtyFlags & 0x4400000L) != 0) {
            // api target 1

            this.extraButtons.setCallsViewModel(callsViewModel);
            this.primaryButtons.setCallsViewModel(callsViewModel);
        }
        if ((dirtyFlags & 0x5000000L) != 0) {
            // api target 1

            this.extraButtons.setConferenceViewModel(conferenceViewModel);
            this.primaryButtons.setConferenceViewModel(conferenceViewModel);
        }
        if ((dirtyFlags & 0x6000000L) != 0) {
            // api target 1

            this.extraButtons.setControlsViewModel(controlsViewModel);
            this.primaryButtons.setControlsViewModel(controlsViewModel);
            if (this.stubbedAudioRoutes.isInflated()) this.stubbedAudioRoutes.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
            if (this.stubbedCallStats.isInflated()) this.stubbedCallStats.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
            if (this.stubbedNumpad.isInflated()) this.stubbedNumpad.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
        }
        if ((dirtyFlags & 0x6000100L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutSize(this.localPreviewVideoSurface, controlsViewModelPipModeLocalPreviewVideoSurfaceAndroidDimenVideoPreviewPipMaxSizeLocalPreviewVideoSurfaceAndroidDimenVideoPreviewMaxSize);
        }
        if ((dirtyFlags & 0x6411088L) != 0) {
            // api target 1

            this.localPreviewVideoSurface.setVisibility(controlsViewModelIsVideoEnabledCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4400888L) != 0) {
            // api target 1

            this.pauseCall.setEnabled(callsViewModelCurrentCallDataIsPausedBooleanTrueCallsViewModelCurrentCallDataCanBePaused);
        }
        if ((dirtyFlags & 0x4400088L) != 0) {
            // api target 1

            this.pauseCall.setSelected(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsPausedGetValue);
            if (!this.stubbedPausedCall.isInflated()) this.stubbedPausedCall.getViewStub().setVisibility(callsViewModelCurrentCallDataIsPausedViewVISIBLEViewGONE);
            if (this.stubbedPausedCall.isInflated()) this.stubbedPausedCall.getBinding().setVariable(BR.inflatedVisibility, callsViewModelCurrentCallDataIsPausedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4401088L) != 0) {
            // api target 1

            this.recordCall.setEnabled(callsViewModelCurrentCallDataIsPausedCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse);
            this.takeSnapshot.setEnabled(callsViewModelCurrentCallDataIsPausedCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalse);
        }
        if ((dirtyFlags & 0x44000a0L) != 0) {
            // api target 1

            this.recordCall.setSelected(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsRecordingGetValue);
        }
        if ((dirtyFlags & 0x641108aL) != 0) {
            // api target 1

            this.remoteVideoSurface.setVisibility(controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4420080L) != 0) {
            // api target 1

            this.remotelyRecorded.getRoot().setVisibility(callsViewModelCurrentCallDataIsRemotelyRecordedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6000004L) != 0) {
            // api target 1

            if (!this.stubbedAudioRoutes.isInflated()) this.stubbedAudioRoutes.getViewStub().setVisibility(controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE);
            if (this.stubbedAudioRoutes.isInflated()) this.stubbedAudioRoutes.getBinding().setVariable(BR.inflatedVisibility, controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6000400L) != 0) {
            // api target 1

            if (!this.stubbedCallStats.isInflated()) this.stubbedCallStats.getViewStub().setVisibility(controlsViewModelCallStatsVisibleViewVISIBLEViewGONE);
            if (this.stubbedCallStats.isInflated()) this.stubbedCallStats.getBinding().setVariable(BR.inflatedVisibility, controlsViewModelCallStatsVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4800000L) != 0) {
            // api target 1

            if (this.stubbedCallStats.isInflated()) this.stubbedCallStats.getBinding().setVariable(BR.statsViewModel, statsViewModel);
        }
        if ((dirtyFlags & 0x6200000L) != 0) {
            // api target 1

            if (!this.stubbedNumpad.isInflated()) this.stubbedNumpad.getViewStub().setVisibility(controlsViewModelNumpadVisibleViewVISIBLEViewGONE);
            if (this.stubbedNumpad.isInflated()) this.stubbedNumpad.getBinding().setVariable(BR.inflatedVisibility, controlsViewModelNumpadVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4401080L) != 0) {
            // api target 1

            if (!this.stubbedRemotelyPausedCall.isInflated()) this.stubbedRemotelyPausedCall.getViewStub().setVisibility(callsViewModelCurrentCallDataIsRemotelyPausedViewVISIBLEViewGONE);
            if (this.stubbedRemotelyPausedCall.isInflated()) this.stubbedRemotelyPausedCall.getBinding().setVariable(BR.inflatedVisibility, callsViewModelCurrentCallDataIsRemotelyPausedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x640138aL) != 0) {
            // api target 1

            this.switchCamera.setVisibility(controlsViewModelIsSendingVideoCallsViewModelCurrentCallDataIsRemotelyPausedBooleanFalseCallsViewModelCurrentCallDataIsPausedBooleanFalseControlsViewModelIsSwitchCameraAvailableBooleanFalseControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6000150L) != 0) {
            // api target 1

            this.takeSnapshot.setVisibility(controlsViewModelShowTakeSnapshotButtonBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x6420191L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutTopMargin(this.topBarrier, controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeBooleanTrueControlsViewModelFoldedTopBarrierAndroidDimenMargin0dpCallsViewModelCurrentCallDataIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize);
        }
        executeBindingsOn(remotelyRecorded);
        executeBindingsOn(primaryButtons);
        executeBindingsOn(extraButtons);
        if (stubbedAudioRoutes.getBinding() != null) {
            executeBindingsOn(stubbedAudioRoutes.getBinding());
        }
        if (stubbedCallStats.getBinding() != null) {
            executeBindingsOn(stubbedCallStats.getBinding());
        }
        if (stubbedNumpad.getBinding() != null) {
            executeBindingsOn(stubbedNumpad.getBinding());
        }
        if (stubbedPausedCall.getBinding() != null) {
            executeBindingsOn(stubbedPausedCall.getBinding());
        }
        if (stubbedRemotelyPausedCall.getBinding() != null) {
            executeBindingsOn(stubbedRemotelyPausedCall.getBinding());
        }
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


                    controlsViewModel.takeSnapshot();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // callsViewModel.currentCallData.getValue()
                org.linphone.activities.voip.data.CallData callsViewModelCurrentCallDataGetValue = null;
                // callsViewModel.currentCallData.getValue() != null
                boolean callsViewModelCurrentCallDataGetValueJavaLangObjectNull = false;
                // callsViewModel.currentCallData != null
                boolean callsViewModelCurrentCallDataJavaLangObjectNull = false;
                // callsViewModel != null
                boolean callsViewModelJavaLangObjectNull = false;
                // callsViewModel.currentCallData
                androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> callsViewModelCurrentCallData = null;
                // callsViewModel
                org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;



                callsViewModelJavaLangObjectNull = (callsViewModel) != (null);
                if (callsViewModelJavaLangObjectNull) {


                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();

                    callsViewModelCurrentCallDataJavaLangObjectNull = (callsViewModelCurrentCallData) != (null);
                    if (callsViewModelCurrentCallDataJavaLangObjectNull) {


                        callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();

                        callsViewModelCurrentCallDataGetValueJavaLangObjectNull = (callsViewModelCurrentCallDataGetValue) != (null);
                        if (callsViewModelCurrentCallDataGetValueJavaLangObjectNull) {


                            callsViewModelCurrentCallDataGetValue.togglePause();
                        }
                    }
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


                    controlsViewModel.toggleFullScreen();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // callsViewModel.currentCallData.getValue()
                org.linphone.activities.voip.data.CallData callsViewModelCurrentCallDataGetValue = null;
                // callsViewModel.currentCallData.getValue() != null
                boolean callsViewModelCurrentCallDataGetValueJavaLangObjectNull = false;
                // callsViewModel.currentCallData != null
                boolean callsViewModelCurrentCallDataJavaLangObjectNull = false;
                // callsViewModel != null
                boolean callsViewModelJavaLangObjectNull = false;
                // callsViewModel.currentCallData
                androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> callsViewModelCurrentCallData = null;
                // callsViewModel
                org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;



                callsViewModelJavaLangObjectNull = (callsViewModel) != (null);
                if (callsViewModelJavaLangObjectNull) {


                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();

                    callsViewModelCurrentCallDataJavaLangObjectNull = (callsViewModelCurrentCallData) != (null);
                    if (callsViewModelCurrentCallDataJavaLangObjectNull) {


                        callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();

                        callsViewModelCurrentCallDataGetValueJavaLangObjectNull = (callsViewModelCurrentCallDataGetValue) != (null);
                        if (callsViewModelCurrentCallDataGetValueJavaLangObjectNull) {


                            callsViewModelCurrentCallDataGetValue.toggleRecording();
                        }
                    }
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


                    controlsViewModel.switchCamera();
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



                    controlsViewModel.hideExtraButtons(false);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.folded
        flag 1 (0x2L): controlsViewModel.isSendingVideo
        flag 2 (0x3L): controlsViewModel.audioRoutesEnabled
        flag 3 (0x4L): callsViewModel.currentCallData.getValue().isPaused
        flag 4 (0x5L): controlsViewModel.fullScreenMode
        flag 5 (0x6L): callsViewModel.currentCallData.getValue().isRecording
        flag 6 (0x7L): controlsViewModel.showTakeSnapshotButton
        flag 7 (0x8L): callsViewModel.currentCallData
        flag 8 (0x9L): controlsViewModel.pipMode
        flag 9 (0xaL): controlsViewModel.isSwitchCameraAvailable
        flag 10 (0xbL): controlsViewModel.callStatsVisible
        flag 11 (0xcL): callsViewModel.currentCallData.getValue().canBePaused
        flag 12 (0xdL): callsViewModel.currentCallData.getValue().isRemotelyPaused
        flag 13 (0xeL): remotelyRecorded
        flag 14 (0xfL): controlsViewModel.extraButtonsMenuTranslateY
        flag 15 (0x10L): primaryButtons
        flag 16 (0x11L): controlsViewModel.isVideoEnabled
        flag 17 (0x12L): callsViewModel.currentCallData.getValue().isRemotelyRecorded
        flag 18 (0x13L): extraButtons
        flag 19 (0x14L): callsViewModel.currentCallData.getValue().contact
        flag 20 (0x15L): callsViewModel.currentCallData.getValue().displayName
        flag 21 (0x16L): controlsViewModel.numpadVisible
        flag 22 (0x17L): callsViewModel
        flag 23 (0x18L): statsViewModel
        flag 24 (0x19L): conferenceViewModel
        flag 25 (0x1aL): controlsViewModel
        flag 26 (0x1bL): null
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/margin_0dp : androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/margin_0dp : androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false
        flag 39 (0x28L): !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
        flag 40 (0x29L): !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().canBePaused.getValue())
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().canBePaused.getValue())
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue())
        flag 44 (0x2dL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue())
        flag 45 (0x2eL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 47 (0x30L): callsViewModel.currentCallData.getValue().contact.getValue().name == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().contact.getValue().name
        flag 48 (0x31L): callsViewModel.currentCallData.getValue().contact.getValue().name == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().contact.getValue().name
        flag 49 (0x32L): !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
        flag 50 (0x33L): !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 52 (0x35L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 53 (0x36L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.callStatsVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 54 (0x37L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.callStatsVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 55 (0x38L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 56 (0x39L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 57 (0x3aL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 58 (0x3bL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 59 (0x3cL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
        flag 60 (0x3dL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false
        flag 61 (0x3eL): !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 62 (0x3fL): !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 63 (0x40L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) : false
        flag 64 (0x41L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) : false
        flag 65 (0x42L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false
        flag 66 (0x43L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false
        flag 67 (0x44L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false
        flag 68 (0x45L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false
        flag 69 (0x46L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()) ? View.VISIBLE : View.GONE
        flag 70 (0x47L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()) ? View.VISIBLE : View.GONE
        flag 71 (0x48L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false
        flag 72 (0x49L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false
        flag 73 (0x4aL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 74 (0x4bL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 75 (0x4cL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/video_preview_pip_max_size : @android:dimen/video_preview_max_size
        flag 76 (0x4dL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/video_preview_pip_max_size : @android:dimen/video_preview_max_size
        flag 77 (0x4eL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:color/black_color : @android:color/transparent_color
        flag 78 (0x4fL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:color/black_color : @android:color/transparent_color
        flag 79 (0x50L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 80 (0x51L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 81 (0x52L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_remote_margin
        flag 82 (0x53L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_remote_margin
        flag 83 (0x54L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 84 (0x55L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 85 (0x56L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? View.VISIBLE : View.GONE
        flag 86 (0x57L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? View.VISIBLE : View.GONE
        flag 87 (0x58L): !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 88 (0x59L): !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showTakeSnapshotButton.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 89 (0x5aL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? View.VISIBLE : View.GONE
        flag 90 (0x5bL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isRemotelyPaused.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isPaused.getValue()) : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}