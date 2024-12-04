package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceActiveSpeakerBindingImpl extends VoipConferenceActiveSpeakerBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(28);
        sIncludes.setIncludes(0, 
            new String[] {"voip_remote_recording"},
            new int[] {24},
            new int[] {org.linphone.R.layout.voip_remote_recording});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.hinge_top, 25);
        sViewsWithIds.put(R.id.hinge_bottom, 26);
        sViewsWithIds.put(R.id.active_conference_timer, 27);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    @Nullable
    private final android.view.View.OnClickListener mCallback61;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceActiveSpeakerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private VoipConferenceActiveSpeakerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 31
            , (android.widget.Chronometer) bindings[27]
            , (android.view.View) bindings[6]
            , (android.widget.ImageView) bindings[11]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.flexbox.FlexboxLayout) bindings[14]
            , (androidx.constraintlayout.widget.Group) bindings[2]
            , (androidx.constraintlayout.widget.Guideline) bindings[26]
            , (androidx.constraintlayout.widget.Guideline) bindings[25]
            , (android.widget.ImageView) bindings[17]
            , (android.view.View) bindings[16]
            , (android.widget.ImageView) bindings[22]
            , (android.widget.TextView) bindings[19]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[21]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[18]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[3]
            , (org.linphone.databinding.VoipRemoteRecordingBinding) bindings[24]
            , (org.linphone.activities.voip.views.ScrollDotsView) bindings[15]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ProgressBar) bindings[9]
            , (android.widget.TextView) bindings[12]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.view.View) bindings[1]
            );
        this.activeSpeakerBackground.setTag(null);
        this.activeSpeakerMuted.setTag(null);
        this.conferenceActiveSpeakerRemoteVideo.setTag(null);
        this.conferenceConstraintLayout.setTag(null);
        this.flexboxLayout.setTag(null);
        this.group.setTag(null);
        this.localParticipantAvatar.setTag(null);
        this.localParticipantBackground.setTag(null);
        this.localParticipantMuted.setTag(null);
        this.localParticipantName.setTag(null);
        this.localParticipantPaused.setTag(null);
        this.localParticipantSpeakingBorder.setTag(null);
        this.localPreviewVideoSurface.setTag(null);
        this.miniatures.setTag(null);
        this.remoteName.setTag(null);
        setContainedBinding(this.remoteRecording);
        this.scrollIndicator.setTag(null);
        this.speakingParticipantAvatar.setTag(null);
        this.speakingParticipantJoining.setTag(null);
        this.speakingParticipantName.setTag(null);
        this.speakingParticipantPaused.setTag(null);
        this.switchCamera.setTag(null);
        this.toggleConferenceRecording.setTag(null);
        this.togglePauseConference.setTag(null);
        this.topBarrier.setTag(null);
        setRootTag(root);
        // listeners
        mCallback65 = new org.linphone.generated.callback.OnClickListener(this, 5);
        mCallback64 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback62 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback63 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback61 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400000000L;
                mDirtyFlags_1 = 0x0L;
        }
        remoteRecording.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0 || mDirtyFlags_1 != 0) {
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
            mDirtyFlags |= 0x80000000L;
        }
        notifyPropertyChanged(BR.conferenceViewModel);
        super.requestRebind();
    }
    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x100000000L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200000000L;
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
                return onChangeConferenceViewModelIsConferenceLocallyPaused((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeConferenceViewModelSpeakingParticipantIsInConference((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeConferenceViewModelConferenceParticipantDevices((androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>>) object, fieldId);
            case 3 :
                return onChangeControlsViewModelFolded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeControlsViewModelIsSendingVideo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeControlsViewModelFullScreenMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeConferenceViewModelMeParticipantDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeConferenceViewModelSpeakingParticipantVideoEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeControlsViewModelPipMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeControlsViewModelIsSwitchCameraAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeConferenceViewModelTwoOrMoreParticipants((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeConferenceViewModelSpeakingParticipant((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>) object, fieldId);
            case 12 :
                return onChangeConferenceViewModelMeParticipantIsInConference((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeConferenceViewModelSpeakingParticipantFound((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeConferenceViewModelSpeakingParticipantIsJoining((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 15 :
                return onChangeConferenceViewModelMeParticipantIsMuted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 16 :
                return onChangeConferenceViewModelMoreThanTwoParticipants((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 17 :
                return onChangeConferenceViewModelMeParticipantIsSpeaking((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 18 :
                return onChangeConferenceViewModelMeParticipantContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 19 :
                return onChangeConferenceViewModelIsRemotelyRecorded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 20 :
                return onChangeConferenceViewModelMeParticipantIsJoining((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 21 :
                return onChangeConferenceViewModelSpeakingParticipantDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 22 :
                return onChangeConferenceViewModelConferenceCreationPending((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 23 :
                return onChangeConferenceViewModelIsRecording((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 24 :
                return onChangeConferenceViewModelSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 25 :
                return onChangeConferenceViewModelMeParticipant((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>) object, fieldId);
            case 26 :
                return onChangeConferenceViewModelActiveSpeakerConferenceParticipantDevices((androidx.lifecycle.MediatorLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>>) object, fieldId);
            case 27 :
                return onChangeConferenceViewModelSpeakingParticipantContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 28 :
                return onChangeConferenceViewModelIsMeListenerOnly((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 29 :
                return onChangeConferenceViewModelSpeakingParticipantIsMuted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 30 :
                return onChangeRemoteRecording((org.linphone.databinding.VoipRemoteRecordingBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsConferenceLocallyPaused(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsConferenceLocallyPaused, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSpeakingParticipantIsInConference(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelSpeakingParticipantIsInConference, int fieldId) {
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
    private boolean onChangeControlsViewModelIsSendingVideo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsSendingVideo, int fieldId) {
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
    private boolean onChangeConferenceViewModelMeParticipantDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ConferenceViewModelMeParticipantDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSpeakingParticipantVideoEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelSpeakingParticipantVideoEnabled, int fieldId) {
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
    private boolean onChangeConferenceViewModelTwoOrMoreParticipants(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelTwoOrMoreParticipants, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSpeakingParticipant(androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> ConferenceViewModelSpeakingParticipant, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelMeParticipantIsInConference(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelMeParticipantIsInConference, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSpeakingParticipantFound(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelSpeakingParticipantFound, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSpeakingParticipantIsJoining(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelSpeakingParticipantIsJoining, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelMeParticipantIsMuted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelMeParticipantIsMuted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelMoreThanTwoParticipants(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelMoreThanTwoParticipants, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelMeParticipantIsSpeaking(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelMeParticipantIsSpeaking, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelMeParticipantContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> ConferenceViewModelMeParticipantContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsRemotelyRecorded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsRemotelyRecorded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelMeParticipantIsJoining(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelMeParticipantIsJoining, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSpeakingParticipantDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ConferenceViewModelSpeakingParticipantDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceCreationPending(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelConferenceCreationPending, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsRecording(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSubject(androidx.lifecycle.MutableLiveData<java.lang.String> ConferenceViewModelSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelMeParticipant(androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> ConferenceViewModelMeParticipant, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelActiveSpeakerConferenceParticipantDevices(androidx.lifecycle.MediatorLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> ConferenceViewModelActiveSpeakerConferenceParticipantDevices, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSpeakingParticipantContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> ConferenceViewModelSpeakingParticipantContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsMeListenerOnly(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsMeListenerOnly, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelSpeakingParticipantIsMuted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelSpeakingParticipantIsMuted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeRemoteRecording(org.linphone.databinding.VoipRemoteRecordingBinding RemoteRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000000L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsSpeakingGetValue = false;
        java.lang.Boolean conferenceViewModelMeParticipantIsMutedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsConferenceLocallyPaused = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelSpeakingParticipantIsInConference = null;
        int conferenceViewModelSpeakingParticipantIsMutedConferenceViewModelMoreThanTwoParticipantsBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Boolean conferenceViewModelIsConferenceLocallyPausedGetValue = null;
        boolean conferenceViewModelSpeakingParticipantFoundConferenceViewModelSpeakingParticipantIsInConferenceBooleanFalse = false;
        int conferenceViewModelMeParticipantIsMutedViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> conferenceViewModelConferenceParticipantDevices = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelFolded = null;
        boolean conferenceViewModelConferenceCreationPending = false;
        java.lang.Boolean controlsViewModelIsSwitchCameraAvailableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSendingVideo = null;
        java.lang.Boolean controlsViewModelIsSendingVideoGetValue = null;
        boolean conferenceViewModelSpeakingParticipantContactNameJavaLangObjectNull = false;
        java.lang.String conferenceViewModelSpeakingParticipantContactNameJavaLangObjectNullConferenceViewModelSpeakingParticipantDisplayNameConferenceViewModelSpeakingParticipantContactName = null;
        int conferenceViewModelIsConferenceLocallyPausedConferenceViewModelSpeakingParticipantVideoEnabledBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsMutedGetValue = false;
        boolean controlsViewModelPipMode = false;
        java.lang.Boolean conferenceViewModelIsRemotelyRecordedGetValue = null;
        java.lang.Boolean conferenceViewModelIsRecordingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelFullScreenMode = null;
        java.lang.Boolean conferenceViewModelConferenceCreationPendingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue = false;
        float controlsViewModelFullScreenModeScrollIndicatorAndroidDimenMargin0dpScrollIndicatorAndroidDimenVoipConferenceActiveSpeakerDotsMargin = 0f;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPending = false;
        java.lang.Boolean conferenceViewModelSpeakingParticipantFoundGetValue = null;
        int conferenceViewModelSpeakingParticipantFoundViewVISIBLEViewGONE = 0;
        int controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String conferenceViewModelMeParticipantContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> conferenceViewModelMeParticipantDisplayName = null;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        int conferenceViewModelIsMeListenerOnlyViewGONEViewVISIBLE = 0;
        boolean controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenMode = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelSpeakingParticipantVideoEnabled = null;
        boolean controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = false;
        boolean conferenceViewModelMoreThanTwoParticipants = false;
        java.lang.Boolean conferenceViewModelSpeakingParticipantIsInConferenceGetValue = null;
        org.linphone.activities.voip.data.ConferenceParticipantDeviceData conferenceViewModelSpeakingParticipantGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantVideoEnabledGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelPipMode1 = null;
        float conferenceViewModelTwoOrMoreParticipantsLocalParticipantMutedAndroidDimenMuteMicMiniatureMarginLocalParticipantMutedAndroidDimenMuteMicGridMargin = 0f;
        android.graphics.drawable.Drawable conferenceViewModelSpeakingParticipantIsInConferenceActiveSpeakerBackgroundAndroidDrawableShapeRemotePausedBackgroundActiveSpeakerBackgroundAndroidDrawableShapeRemoteBackground = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSwitchCameraAvailable = null;
        float controlsViewModelFullScreenModeActiveSpeakerBackgroundAndroidDimenMargin0dpActiveSpeakerBackgroundAndroidDimenVoipActiveSpeakerTopMargin = 0f;
        int controlsViewModelPipModeBooleanTrueConferenceViewModelMoreThanTwoParticipantsViewGONEViewVISIBLE = 0;
        float controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipRemoteMargin = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelTwoOrMoreParticipants = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsInConferenceGetValue = false;
        boolean conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPaused = false;
        org.linphone.activities.voip.data.ConferenceParticipantDeviceData conferenceViewModelMeParticipantGetValue = null;
        java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> conferenceViewModelConferenceParticipantDevicesGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue = false;
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> conferenceViewModelSpeakingParticipant = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue = false;
        java.lang.String conferenceViewModelMeParticipantContactNameJavaLangObjectNullConferenceViewModelMeParticipantDisplayNameConferenceViewModelMeParticipantContactName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue = false;
        int conferenceViewModelConferenceParticipantDevicesSize = 0;
        boolean conferenceViewModelMeParticipantIsInConferenceControlsViewModelIsSendingVideoBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelMeParticipantIsInConference = null;
        float controlsViewModelFullScreenModeBooleanTrueConferenceViewModelTwoOrMoreParticipantsLocalParticipantBackgroundAndroidDimenMargin0dpLocalParticipantBackgroundAndroidDimenVoipActiveSpeakerTopMargin = 0f;
        boolean conferenceViewModelMeParticipantContactNameJavaLangObjectNull = false;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        java.lang.Boolean conferenceViewModelSpeakingParticipantIsMutedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelSpeakingParticipantFound = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelSpeakingParticipantIsJoining = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelMeParticipantIsMuted = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelMoreThanTwoParticipants1 = null;
        java.lang.Boolean conferenceViewModelMeParticipantIsInConferenceGetValue = null;
        boolean conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPausedBooleanTrueConferenceViewModelMeParticipantIsJoining = false;
        java.lang.Boolean conferenceViewModelMeParticipantIsSpeakingGetValue = null;
        java.lang.String conferenceViewModelSpeakingParticipantDisplayNameGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue = false;
        int conferenceViewModelMeParticipantIsInConferenceControlsViewModelIsSendingVideoBooleanFalseViewVISIBLEViewGONE = 0;
        float conferenceViewModelTwoOrMoreParticipantsSwitchCameraAndroidDimenMargin0dpSwitchCameraAndroidDimenVoipActiveSpeakerTopMargin = 0f;
        java.lang.Boolean conferenceViewModelTwoOrMoreParticipantsGetValue = null;
        boolean controlsViewModelFullScreenModeBooleanTrueConferenceViewModelTwoOrMoreParticipants = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelMeParticipantIsSpeaking = null;
        int conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPausedBooleanTrueConferenceViewModelMeParticipantIsJoiningViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> conferenceViewModelMeParticipantContact = null;
        boolean controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = false;
        java.lang.Boolean controlsViewModelFoldedGetValue = null;
        java.lang.String conferenceViewModelSpeakingParticipantContactName = null;
        java.lang.Boolean conferenceViewModelMeParticipantIsJoiningGetValue = null;
        boolean conferenceViewModelSpeakingParticipantIsMutedConferenceViewModelMoreThanTwoParticipantsBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsRemotelyRecorded = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelMeParticipantIsJoining = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue = false;
        java.lang.Boolean controlsViewModelPipModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsJoiningGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> conferenceViewModelSpeakingParticipantDisplayName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelConferenceCreationPending1 = null;
        float controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeTopBarrierAndroidDimenMargin0dpConferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = 0f;
        org.linphone.core.Friend conferenceViewModelSpeakingParticipantContactGetValue = null;
        boolean ConferenceViewModelIsConferenceLocallyPaused1 = false;
        boolean conferenceViewModelIsConferenceLocallyPausedConferenceViewModelSpeakingParticipantVideoEnabledBooleanFalse = false;
        java.lang.String conferenceViewModelMeParticipantDisplayNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsRecording = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> conferenceViewModelSubject = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> conferenceViewModelMeParticipant = null;
        org.linphone.core.Friend conferenceViewModelMeParticipantContactGetValue = null;
        float controlsViewModelFoldedRemoteNameAndroidDimenVoipConferenceHeaderFoldedTopMarginRemoteNameAndroidDimenMargin0dp = 0f;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = false;
        java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData> conferenceViewModelActiveSpeakerConferenceParticipantDevicesGetValue = null;
        androidx.lifecycle.MediatorLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceParticipantDeviceData>> conferenceViewModelActiveSpeakerConferenceParticipantDevices = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPendingGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRecordingGetValue = false;
        int conferenceViewModelSpeakingParticipantIsJoiningViewVISIBLEViewGONE = 0;
        float controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipButtonsFragmentMarginSize = 0f;
        boolean ConferenceViewModelSpeakingParticipantIsInConference1 = false;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> conferenceViewModelSpeakingParticipantContact = null;
        java.lang.String conferenceViewModelSubjectGetValue = null;
        int conferenceViewModelMeParticipantIsSpeakingViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsInConferenceGetValue = false;
        java.lang.Boolean conferenceViewModelMoreThanTwoParticipantsGetValue = null;
        boolean controlsViewModelPipModeBooleanTrueConferenceViewModelMoreThanTwoParticipants = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsMeListenerOnly = null;
        java.lang.Boolean conferenceViewModelSpeakingParticipantIsJoiningGetValue = null;
        int conferenceViewModelSpeakingParticipantFoundConferenceViewModelSpeakingParticipantIsInConferenceBooleanFalseViewGONEViewVISIBLE = 0;
        int controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelSpeakingParticipantIsMuted = null;
        float conferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = 0f;
        java.lang.Boolean conferenceViewModelIsMeListenerOnlyGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsMutedGetValue = false;
        boolean controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = false;
        java.lang.Boolean controlsViewModelFullScreenModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = false;
        int conferenceViewModelIsRemotelyRecordedViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantFoundGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsJoiningGetValue = false;
        int conferenceViewModelMoreThanTwoParticipantsViewVISIBLEViewGONE = 0;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelTwoOrMoreParticipantsGetValue = false;
        java.lang.Boolean conferenceViewModelSpeakingParticipantVideoEnabledGetValue = null;

        if ((dirtyFlags & 0x6bffffcd7L) != 0) {


            if ((dirtyFlags & 0x480000081L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isConferenceLocallyPaused
                        conferenceViewModelIsConferenceLocallyPaused = conferenceViewModel.isConferenceLocallyPaused();
                    }
                    updateLiveDataRegistration(0, conferenceViewModelIsConferenceLocallyPaused);


                    if (conferenceViewModelIsConferenceLocallyPaused != null) {
                        // read conferenceViewModel.isConferenceLocallyPaused.getValue()
                        conferenceViewModelIsConferenceLocallyPausedGetValue = conferenceViewModelIsConferenceLocallyPaused.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsConferenceLocallyPausedGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue())
                    ConferenceViewModelIsConferenceLocallyPaused1 = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue;
                if((dirtyFlags & 0x480000081L) != 0) {
                    if(ConferenceViewModelIsConferenceLocallyPaused1) {
                            dirtyFlags_1 |= 0x10000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x480000004L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceParticipantDevices
                        conferenceViewModelConferenceParticipantDevices = conferenceViewModel.getConferenceParticipantDevices();
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
            }
            if ((dirtyFlags & 0x480000400L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.twoOrMoreParticipants
                        conferenceViewModelTwoOrMoreParticipants = conferenceViewModel.getTwoOrMoreParticipants();
                    }
                    updateLiveDataRegistration(10, conferenceViewModelTwoOrMoreParticipants);


                    if (conferenceViewModelTwoOrMoreParticipants != null) {
                        // read conferenceViewModel.twoOrMoreParticipants.getValue()
                        conferenceViewModelTwoOrMoreParticipantsGetValue = conferenceViewModelTwoOrMoreParticipants.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelTwoOrMoreParticipantsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelTwoOrMoreParticipantsGetValue);
                if((dirtyFlags & 0x480000400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelTwoOrMoreParticipantsGetValue) {
                            dirtyFlags |= 0x400000000000000L;
                            dirtyFlags_1 |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000000L;
                            dirtyFlags_1 |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue()) ? @android:dimen/mute_mic_miniature_margin : @android:dimen/mute_mic_grid_margin
                    conferenceViewModelTwoOrMoreParticipantsLocalParticipantMutedAndroidDimenMuteMicMiniatureMarginLocalParticipantMutedAndroidDimenMuteMicGridMargin = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelTwoOrMoreParticipantsGetValue) ? (localParticipantMuted.getResources().getDimension(R.dimen.mute_mic_miniature_margin)) : (localParticipantMuted.getResources().getDimension(R.dimen.mute_mic_grid_margin)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_active_speaker_top_margin
                    conferenceViewModelTwoOrMoreParticipantsSwitchCameraAndroidDimenMargin0dpSwitchCameraAndroidDimenVoipActiveSpeakerTopMargin = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelTwoOrMoreParticipantsGetValue) ? (switchCamera.getResources().getDimension(R.dimen.margin_0dp)) : (switchCamera.getResources().getDimension(R.dimen.voip_active_speaker_top_margin)));
            }
            if ((dirtyFlags & 0x4a8214802L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.speakingParticipant
                        conferenceViewModelSpeakingParticipant = conferenceViewModel.getSpeakingParticipant();
                    }
                    updateLiveDataRegistration(11, conferenceViewModelSpeakingParticipant);


                    if (conferenceViewModelSpeakingParticipant != null) {
                        // read conferenceViewModel.speakingParticipant.getValue()
                        conferenceViewModelSpeakingParticipantGetValue = conferenceViewModelSpeakingParticipant.getValue();
                    }

                if ((dirtyFlags & 0x480000802L) != 0) {

                        if (conferenceViewModelSpeakingParticipantGetValue != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().isInConference
                            conferenceViewModelSpeakingParticipantIsInConference = conferenceViewModelSpeakingParticipantGetValue.isInConference();
                        }
                        updateLiveDataRegistration(1, conferenceViewModelSpeakingParticipantIsInConference);


                        if (conferenceViewModelSpeakingParticipantIsInConference != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()
                            conferenceViewModelSpeakingParticipantIsInConferenceGetValue = conferenceViewModelSpeakingParticipantIsInConference.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsInConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelSpeakingParticipantIsInConferenceGetValue);


                        // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue())
                        ConferenceViewModelSpeakingParticipantIsInConference1 = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsInConferenceGetValue;
                    if((dirtyFlags & 0x480000802L) != 0) {
                        if(ConferenceViewModelSpeakingParticipantIsInConference1) {
                                dirtyFlags |= 0x1000000000000000L;
                        }
                        else {
                                dirtyFlags |= 0x800000000000000L;
                        }
                    }


                        // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()) ? @android:drawable/shape_remote_paused_background : @android:drawable/shape_remote_background
                        conferenceViewModelSpeakingParticipantIsInConferenceActiveSpeakerBackgroundAndroidDrawableShapeRemotePausedBackgroundActiveSpeakerBackgroundAndroidDrawableShapeRemoteBackground = ((ConferenceViewModelSpeakingParticipantIsInConference1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(activeSpeakerBackground.getContext(), R.drawable.shape_remote_paused_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(activeSpeakerBackground.getContext(), R.drawable.shape_remote_background)));
                }
                if ((dirtyFlags & 0x480004800L) != 0) {

                        if (conferenceViewModelSpeakingParticipantGetValue != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().isJoining
                            conferenceViewModelSpeakingParticipantIsJoining = conferenceViewModelSpeakingParticipantGetValue.isJoining();
                        }
                        updateLiveDataRegistration(14, conferenceViewModelSpeakingParticipantIsJoining);


                        if (conferenceViewModelSpeakingParticipantIsJoining != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().isJoining.getValue()
                            conferenceViewModelSpeakingParticipantIsJoiningGetValue = conferenceViewModelSpeakingParticipantIsJoining.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isJoining.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsJoiningGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelSpeakingParticipantIsJoiningGetValue);
                    if((dirtyFlags & 0x480004800L) != 0) {
                        if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsJoiningGetValue) {
                                dirtyFlags_1 |= 0x100000000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x80000000L;
                        }
                    }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isJoining.getValue()) ? View.VISIBLE : View.GONE
                        conferenceViewModelSpeakingParticipantIsJoiningViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsJoiningGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x488200800L) != 0) {

                        if (conferenceViewModelSpeakingParticipantGetValue != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().contact
                            conferenceViewModelSpeakingParticipantContact = conferenceViewModelSpeakingParticipantGetValue.getContact();
                        }
                        updateLiveDataRegistration(27, conferenceViewModelSpeakingParticipantContact);


                        if (conferenceViewModelSpeakingParticipantContact != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().contact.getValue()
                            conferenceViewModelSpeakingParticipantContactGetValue = conferenceViewModelSpeakingParticipantContact.getValue();
                        }


                        if (conferenceViewModelSpeakingParticipantContactGetValue != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().contact.getValue().name
                            conferenceViewModelSpeakingParticipantContactName = conferenceViewModelSpeakingParticipantContactGetValue.getName();
                        }


                        // read conferenceViewModel.speakingParticipant.getValue().contact.getValue().name == null
                        conferenceViewModelSpeakingParticipantContactNameJavaLangObjectNull = (conferenceViewModelSpeakingParticipantContactName) == (null);
                    if((dirtyFlags & 0x488200800L) != 0) {
                        if(conferenceViewModelSpeakingParticipantContactNameJavaLangObjectNull) {
                                dirtyFlags |= 0x40000000000L;
                        }
                        else {
                                dirtyFlags |= 0x20000000000L;
                        }
                    }
                }
                if ((dirtyFlags & 0x4a0010800L) != 0) {

                        if (conferenceViewModelSpeakingParticipantGetValue != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().isMuted
                            conferenceViewModelSpeakingParticipantIsMuted = conferenceViewModelSpeakingParticipantGetValue.isMuted();
                        }
                        updateLiveDataRegistration(29, conferenceViewModelSpeakingParticipantIsMuted);


                        if (conferenceViewModelSpeakingParticipantIsMuted != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().isMuted.getValue()
                            conferenceViewModelSpeakingParticipantIsMutedGetValue = conferenceViewModelSpeakingParticipantIsMuted.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isMuted.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsMutedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelSpeakingParticipantIsMutedGetValue);
                    if((dirtyFlags & 0x4a0010800L) != 0) {
                        if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsMutedGetValue) {
                                dirtyFlags_1 |= 0x1000000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x800000L;
                        }
                    }
                }
            }
            if ((dirtyFlags & 0x480002802L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.speakingParticipantFound
                        conferenceViewModelSpeakingParticipantFound = conferenceViewModel.getSpeakingParticipantFound();
                    }
                    updateLiveDataRegistration(13, conferenceViewModelSpeakingParticipantFound);


                    if (conferenceViewModelSpeakingParticipantFound != null) {
                        // read conferenceViewModel.speakingParticipantFound.getValue()
                        conferenceViewModelSpeakingParticipantFoundGetValue = conferenceViewModelSpeakingParticipantFound.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantFoundGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelSpeakingParticipantFoundGetValue);
                if((dirtyFlags & 0x480002802L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantFoundGetValue) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }
                if((dirtyFlags & 0x480002000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantFoundGetValue) {
                            dirtyFlags |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000000L;
                    }
                }

                if ((dirtyFlags & 0x480002000L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue()) ? View.VISIBLE : View.GONE
                        conferenceViewModelSpeakingParticipantFoundViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantFoundGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x480010000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.moreThanTwoParticipants
                        ConferenceViewModelMoreThanTwoParticipants1 = conferenceViewModel.getMoreThanTwoParticipants();
                    }
                    updateLiveDataRegistration(16, ConferenceViewModelMoreThanTwoParticipants1);


                    if (ConferenceViewModelMoreThanTwoParticipants1 != null) {
                        // read conferenceViewModel.moreThanTwoParticipants.getValue()
                        conferenceViewModelMoreThanTwoParticipantsGetValue = ConferenceViewModelMoreThanTwoParticipants1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelMoreThanTwoParticipantsGetValue);
                if((dirtyFlags & 0x480010000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue) {
                            dirtyFlags_1 |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) ? View.VISIBLE : View.GONE
                    conferenceViewModelMoreThanTwoParticipantsViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x480080000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isRemotelyRecorded
                        conferenceViewModelIsRemotelyRecorded = conferenceViewModel.isRemotelyRecorded();
                    }
                    updateLiveDataRegistration(19, conferenceViewModelIsRemotelyRecorded);


                    if (conferenceViewModelIsRemotelyRecorded != null) {
                        // read conferenceViewModel.isRemotelyRecorded.getValue()
                        conferenceViewModelIsRemotelyRecordedGetValue = conferenceViewModelIsRemotelyRecorded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsRemotelyRecordedGetValue);
                if((dirtyFlags_1 & 0x2000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) {
                            dirtyFlags_1 |= 0x100000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x80000000000L;
                    }
                }
                if((dirtyFlags & 0x480080000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) {
                            dirtyFlags_1 |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x800000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? View.VISIBLE : View.GONE
                    conferenceViewModelIsRemotelyRecordedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x482500001L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceCreationPending
                        ConferenceViewModelConferenceCreationPending1 = conferenceViewModel.getConferenceCreationPending();
                    }
                    updateLiveDataRegistration(22, ConferenceViewModelConferenceCreationPending1);


                    if (ConferenceViewModelConferenceCreationPending1 != null) {
                        // read conferenceViewModel.conferenceCreationPending.getValue()
                        conferenceViewModelConferenceCreationPendingGetValue = ConferenceViewModelConferenceCreationPending1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPendingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelConferenceCreationPendingGetValue);
                if((dirtyFlags & 0x482500001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPendingGetValue) {
                            dirtyFlags_1 |= 0x10L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8L;
                    }
                }

                if ((dirtyFlags & 0x480400000L) != 0) {

                        // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue())
                        conferenceViewModelConferenceCreationPending = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPendingGetValue;


                        // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()))
                        androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPending = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelConferenceCreationPending);
                }
            }
            if ((dirtyFlags & 0x480800000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isRecording
                        conferenceViewModelIsRecording = conferenceViewModel.isRecording();
                    }
                    updateLiveDataRegistration(23, conferenceViewModelIsRecording);


                    if (conferenceViewModelIsRecording != null) {
                        // read conferenceViewModel.isRecording.getValue()
                        conferenceViewModelIsRecordingGetValue = conferenceViewModelIsRecording.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRecording.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRecordingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsRecordingGetValue);
            }
            if ((dirtyFlags & 0x481000000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.subject
                        conferenceViewModelSubject = conferenceViewModel.getSubject();
                    }
                    updateLiveDataRegistration(24, conferenceViewModelSubject);


                    if (conferenceViewModelSubject != null) {
                        // read conferenceViewModel.subject.getValue()
                        conferenceViewModelSubjectGetValue = conferenceViewModelSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x682069050L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.meParticipant
                        conferenceViewModelMeParticipant = conferenceViewModel.getMeParticipant();
                    }
                    updateLiveDataRegistration(25, conferenceViewModelMeParticipant);


                    if (conferenceViewModelMeParticipant != null) {
                        // read conferenceViewModel.meParticipant.getValue()
                        conferenceViewModelMeParticipantGetValue = conferenceViewModelMeParticipant.getValue();
                    }

                if ((dirtyFlags & 0x682001010L) != 0) {

                        if (conferenceViewModelMeParticipantGetValue != null) {
                            // read conferenceViewModel.meParticipant.getValue().isInConference
                            conferenceViewModelMeParticipantIsInConference = conferenceViewModelMeParticipantGetValue.isInConference();
                        }
                        updateLiveDataRegistration(12, conferenceViewModelMeParticipantIsInConference);


                        if (conferenceViewModelMeParticipantIsInConference != null) {
                            // read conferenceViewModel.meParticipant.getValue().isInConference.getValue()
                            conferenceViewModelMeParticipantIsInConferenceGetValue = conferenceViewModelMeParticipantIsInConference.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isInConference.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsInConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelMeParticipantIsInConferenceGetValue);
                    if((dirtyFlags & 0x682001010L) != 0) {
                        if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsInConferenceGetValue) {
                                dirtyFlags_1 |= 0x100L;
                        }
                        else {
                                dirtyFlags_1 |= 0x80L;
                        }
                    }
                }
                if ((dirtyFlags & 0x482008000L) != 0) {

                        if (conferenceViewModelMeParticipantGetValue != null) {
                            // read conferenceViewModel.meParticipant.getValue().isMuted
                            conferenceViewModelMeParticipantIsMuted = conferenceViewModelMeParticipantGetValue.isMuted();
                        }
                        updateLiveDataRegistration(15, conferenceViewModelMeParticipantIsMuted);


                        if (conferenceViewModelMeParticipantIsMuted != null) {
                            // read conferenceViewModel.meParticipant.getValue().isMuted.getValue()
                            conferenceViewModelMeParticipantIsMutedGetValue = conferenceViewModelMeParticipantIsMuted.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isMuted.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsMutedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelMeParticipantIsMutedGetValue);
                    if((dirtyFlags & 0x482008000L) != 0) {
                        if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsMutedGetValue) {
                                dirtyFlags |= 0x10000000000L;
                        }
                        else {
                                dirtyFlags |= 0x8000000000L;
                        }
                    }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isMuted.getValue()) ? View.VISIBLE : View.GONE
                        conferenceViewModelMeParticipantIsMutedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsMutedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x482020000L) != 0) {

                        if (conferenceViewModelMeParticipantGetValue != null) {
                            // read conferenceViewModel.meParticipant.getValue().isSpeaking
                            conferenceViewModelMeParticipantIsSpeaking = conferenceViewModelMeParticipantGetValue.isSpeaking();
                        }
                        updateLiveDataRegistration(17, conferenceViewModelMeParticipantIsSpeaking);


                        if (conferenceViewModelMeParticipantIsSpeaking != null) {
                            // read conferenceViewModel.meParticipant.getValue().isSpeaking.getValue()
                            conferenceViewModelMeParticipantIsSpeakingGetValue = conferenceViewModelMeParticipantIsSpeaking.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isSpeaking.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsSpeakingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelMeParticipantIsSpeakingGetValue);
                    if((dirtyFlags & 0x482020000L) != 0) {
                        if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsSpeakingGetValue) {
                                dirtyFlags_1 |= 0x1000000000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x800000000L;
                        }
                    }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isSpeaking.getValue()) ? View.VISIBLE : View.GONE
                        conferenceViewModelMeParticipantIsSpeakingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsSpeakingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x482040040L) != 0) {

                        if (conferenceViewModelMeParticipantGetValue != null) {
                            // read conferenceViewModel.meParticipant.getValue().contact
                            conferenceViewModelMeParticipantContact = conferenceViewModelMeParticipantGetValue.getContact();
                        }
                        updateLiveDataRegistration(18, conferenceViewModelMeParticipantContact);


                        if (conferenceViewModelMeParticipantContact != null) {
                            // read conferenceViewModel.meParticipant.getValue().contact.getValue()
                            conferenceViewModelMeParticipantContactGetValue = conferenceViewModelMeParticipantContact.getValue();
                        }


                        if (conferenceViewModelMeParticipantContactGetValue != null) {
                            // read conferenceViewModel.meParticipant.getValue().contact.getValue().name
                            conferenceViewModelMeParticipantContactName = conferenceViewModelMeParticipantContactGetValue.getName();
                        }


                        // read conferenceViewModel.meParticipant.getValue().contact.getValue().name == null
                        conferenceViewModelMeParticipantContactNameJavaLangObjectNull = (conferenceViewModelMeParticipantContactName) == (null);
                    if((dirtyFlags & 0x482040040L) != 0) {
                        if(conferenceViewModelMeParticipantContactNameJavaLangObjectNull) {
                                dirtyFlags_1 |= 0x40L;
                        }
                        else {
                                dirtyFlags_1 |= 0x20L;
                        }
                    }
                }
            }
            if ((dirtyFlags & 0x484000000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.activeSpeakerConferenceParticipantDevices
                        conferenceViewModelActiveSpeakerConferenceParticipantDevices = conferenceViewModel.getActiveSpeakerConferenceParticipantDevices();
                    }
                    updateLiveDataRegistration(26, conferenceViewModelActiveSpeakerConferenceParticipantDevices);


                    if (conferenceViewModelActiveSpeakerConferenceParticipantDevices != null) {
                        // read conferenceViewModel.activeSpeakerConferenceParticipantDevices.getValue()
                        conferenceViewModelActiveSpeakerConferenceParticipantDevicesGetValue = conferenceViewModelActiveSpeakerConferenceParticipantDevices.getValue();
                    }
            }
            if ((dirtyFlags & 0x490000000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isMeListenerOnly
                        conferenceViewModelIsMeListenerOnly = conferenceViewModel.isMeListenerOnly();
                    }
                    updateLiveDataRegistration(28, conferenceViewModelIsMeListenerOnly);


                    if (conferenceViewModelIsMeListenerOnly != null) {
                        // read conferenceViewModel.isMeListenerOnly.getValue()
                        conferenceViewModelIsMeListenerOnlyGetValue = conferenceViewModelIsMeListenerOnly.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsMeListenerOnlyGetValue);
                if((dirtyFlags & 0x490000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue) {
                            dirtyFlags |= 0x10000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) ? View.GONE : View.VISIBLE
                    conferenceViewModelIsMeListenerOnlyViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0x500000000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        if ((dirtyFlags & 0x680090728L) != 0) {


            if ((dirtyFlags & 0x680080128L) != 0) {

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
                if((dirtyFlags & 0x680080128L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue) {
                            dirtyFlags |= 0x40000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000000L;
                    }
                }
                if((dirtyFlags & 0x600000008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue) {
                            dirtyFlags_1 |= 0x40000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x20000000L;
                    }
                }

                if ((dirtyFlags & 0x600000008L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/voip_conference_header_folded_top_margin : @android:dimen/margin_0dp
                        controlsViewModelFoldedRemoteNameAndroidDimenVoipConferenceHeaderFoldedTopMarginRemoteNameAndroidDimenMargin0dp = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue) ? (remoteName.getResources().getDimension(R.dimen.voip_conference_header_folded_top_margin)) : (remoteName.getResources().getDimension(R.dimen.margin_0dp)));
                }
            }
            if ((dirtyFlags & 0x680000520L) != 0) {

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
                if((dirtyFlags & 0x600000020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags |= 0x400000000000L;
                            dirtyFlags |= 0x4000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                            dirtyFlags |= 0x2000000000000000L;
                    }
                }
                if((dirtyFlags & 0x600000120L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags |= 0x100000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000000L;
                    }
                }
                if((dirtyFlags & 0x680000420L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags_1 |= 0x40000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x20000L;
                    }
                }

                if ((dirtyFlags & 0x600000020L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_conference_active_speaker_dots_margin
                        controlsViewModelFullScreenModeScrollIndicatorAndroidDimenMargin0dpScrollIndicatorAndroidDimenVoipConferenceActiveSpeakerDotsMargin = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (scrollIndicator.getResources().getDimension(R.dimen.margin_0dp)) : (scrollIndicator.getResources().getDimension(R.dimen.voip_conference_active_speaker_dots_margin)));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_active_speaker_top_margin
                        controlsViewModelFullScreenModeActiveSpeakerBackgroundAndroidDimenMargin0dpActiveSpeakerBackgroundAndroidDimenVoipActiveSpeakerTopMargin = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (activeSpeakerBackground.getResources().getDimension(R.dimen.margin_0dp)) : (activeSpeakerBackground.getResources().getDimension(R.dimen.voip_active_speaker_top_margin)));
                }
            }
            if ((dirtyFlags & 0x680010100L) != 0) {

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
                if((dirtyFlags & 0x680010100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue) {
                            dirtyFlags_1 |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x600000300L) != 0) {

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
                if((dirtyFlags & 0x600000300L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) {
                            dirtyFlags_1 |= 0x400000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x200000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x44000000000L) != 0 || (dirtyFlags_1 & 0x1000048L) != 0) {


            if ((dirtyFlags_1 & 0x8L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isConferenceLocallyPaused
                        conferenceViewModelIsConferenceLocallyPaused = conferenceViewModel.isConferenceLocallyPaused();
                    }
                    updateLiveDataRegistration(0, conferenceViewModelIsConferenceLocallyPaused);


                    if (conferenceViewModelIsConferenceLocallyPaused != null) {
                        // read conferenceViewModel.isConferenceLocallyPaused.getValue()
                        conferenceViewModelIsConferenceLocallyPausedGetValue = conferenceViewModelIsConferenceLocallyPaused.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsConferenceLocallyPausedGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue())
                    ConferenceViewModelIsConferenceLocallyPaused1 = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue;
                if((dirtyFlags & 0x480000081L) != 0) {
                    if(ConferenceViewModelIsConferenceLocallyPaused1) {
                            dirtyFlags_1 |= 0x10000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x44000000000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.speakingParticipant
                        conferenceViewModelSpeakingParticipant = conferenceViewModel.getSpeakingParticipant();
                    }
                    updateLiveDataRegistration(11, conferenceViewModelSpeakingParticipant);


                    if (conferenceViewModelSpeakingParticipant != null) {
                        // read conferenceViewModel.speakingParticipant.getValue()
                        conferenceViewModelSpeakingParticipantGetValue = conferenceViewModelSpeakingParticipant.getValue();
                    }

                if ((dirtyFlags & 0x4000000000L) != 0) {

                        if (conferenceViewModelSpeakingParticipantGetValue != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().isInConference
                            conferenceViewModelSpeakingParticipantIsInConference = conferenceViewModelSpeakingParticipantGetValue.isInConference();
                        }
                        updateLiveDataRegistration(1, conferenceViewModelSpeakingParticipantIsInConference);


                        if (conferenceViewModelSpeakingParticipantIsInConference != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()
                            conferenceViewModelSpeakingParticipantIsInConferenceGetValue = conferenceViewModelSpeakingParticipantIsInConference.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsInConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelSpeakingParticipantIsInConferenceGetValue);
                }
                if ((dirtyFlags & 0x40000000000L) != 0) {

                        if (conferenceViewModelSpeakingParticipantGetValue != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().displayName
                            conferenceViewModelSpeakingParticipantDisplayName = conferenceViewModelSpeakingParticipantGetValue.getDisplayName();
                        }
                        updateLiveDataRegistration(21, conferenceViewModelSpeakingParticipantDisplayName);


                        if (conferenceViewModelSpeakingParticipantDisplayName != null) {
                            // read conferenceViewModel.speakingParticipant.getValue().displayName.getValue()
                            conferenceViewModelSpeakingParticipantDisplayNameGetValue = conferenceViewModelSpeakingParticipantDisplayName.getValue();
                        }
                }
            }
            if ((dirtyFlags_1 & 0x1000000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.moreThanTwoParticipants
                        ConferenceViewModelMoreThanTwoParticipants1 = conferenceViewModel.getMoreThanTwoParticipants();
                    }
                    updateLiveDataRegistration(16, ConferenceViewModelMoreThanTwoParticipants1);


                    if (ConferenceViewModelMoreThanTwoParticipants1 != null) {
                        // read conferenceViewModel.moreThanTwoParticipants.getValue()
                        conferenceViewModelMoreThanTwoParticipantsGetValue = ConferenceViewModelMoreThanTwoParticipants1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelMoreThanTwoParticipantsGetValue);
                if((dirtyFlags & 0x480010000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue) {
                            dirtyFlags_1 |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000000000000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue())
                    conferenceViewModelMoreThanTwoParticipants = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue;
            }
            if ((dirtyFlags_1 & 0x40L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.meParticipant
                        conferenceViewModelMeParticipant = conferenceViewModel.getMeParticipant();
                    }
                    updateLiveDataRegistration(25, conferenceViewModelMeParticipant);


                    if (conferenceViewModelMeParticipant != null) {
                        // read conferenceViewModel.meParticipant.getValue()
                        conferenceViewModelMeParticipantGetValue = conferenceViewModelMeParticipant.getValue();
                    }


                    if (conferenceViewModelMeParticipantGetValue != null) {
                        // read conferenceViewModel.meParticipant.getValue().displayName
                        conferenceViewModelMeParticipantDisplayName = conferenceViewModelMeParticipantGetValue.getDisplayName();
                    }
                    updateLiveDataRegistration(6, conferenceViewModelMeParticipantDisplayName);


                    if (conferenceViewModelMeParticipantDisplayName != null) {
                        // read conferenceViewModel.meParticipant.getValue().displayName.getValue()
                        conferenceViewModelMeParticipantDisplayNameGetValue = conferenceViewModelMeParticipantDisplayName.getValue();
                    }
            }
        }
        if ((dirtyFlags & 0x20000000000000L) != 0 || (dirtyFlags_1 & 0x400100L) != 0) {


            if ((dirtyFlags_1 & 0x100L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isSendingVideo
                        controlsViewModelIsSendingVideo = controlsViewModel.isSendingVideo();
                    }
                    updateLiveDataRegistration(4, controlsViewModelIsSendingVideo);


                    if (controlsViewModelIsSendingVideo != null) {
                        // read controlsViewModel.isSendingVideo.getValue()
                        controlsViewModelIsSendingVideoGetValue = controlsViewModelIsSendingVideo.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSendingVideoGetValue);
            }
            if ((dirtyFlags & 0x20000000000000L) != 0) {

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
                if((dirtyFlags & 0x600000020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags |= 0x400000000000L;
                            dirtyFlags |= 0x4000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                            dirtyFlags |= 0x2000000000000000L;
                    }
                }
                if((dirtyFlags & 0x600000120L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags |= 0x100000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000000L;
                    }
                }
                if((dirtyFlags & 0x680000420L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags_1 |= 0x40000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x20000L;
                    }
                }
            }
            if ((dirtyFlags_1 & 0x400000L) != 0) {

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
                if((dirtyFlags & 0x680010100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue) {
                            dirtyFlags_1 |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000000000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                    controlsViewModelPipMode = !androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue;
            }
        }

        if ((dirtyFlags & 0x480002802L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()) : false
                conferenceViewModelSpeakingParticipantFoundConferenceViewModelSpeakingParticipantIsInConferenceBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantFoundGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsInConferenceGetValue) : (false));
            if((dirtyFlags & 0x480002802L) != 0) {
                if(conferenceViewModelSpeakingParticipantFoundConferenceViewModelSpeakingParticipantIsInConferenceBooleanFalse) {
                        dirtyFlags_1 |= 0x10000000000L;
                }
                else {
                        dirtyFlags_1 |= 0x8000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()) : false ? View.GONE : View.VISIBLE
                conferenceViewModelSpeakingParticipantFoundConferenceViewModelSpeakingParticipantIsInConferenceBooleanFalseViewGONEViewVISIBLE = ((conferenceViewModelSpeakingParticipantFoundConferenceViewModelSpeakingParticipantIsInConferenceBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x488200800L) != 0) {

                // read conferenceViewModel.speakingParticipant.getValue().contact.getValue().name == null ? conferenceViewModel.speakingParticipant.getValue().displayName.getValue() : conferenceViewModel.speakingParticipant.getValue().contact.getValue().name
                conferenceViewModelSpeakingParticipantContactNameJavaLangObjectNullConferenceViewModelSpeakingParticipantDisplayNameConferenceViewModelSpeakingParticipantContactName = ((conferenceViewModelSpeakingParticipantContactNameJavaLangObjectNull) ? (conferenceViewModelSpeakingParticipantDisplayNameGetValue) : (conferenceViewModelSpeakingParticipantContactName));
        }
        if ((dirtyFlags & 0x680080128L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
                controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenMode = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFoldedGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue));
            if((dirtyFlags & 0x680080128L) != 0) {
                if(controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenMode) {
                        dirtyFlags_1 |= 0x400000000000L;
                }
                else {
                        dirtyFlags_1 |= 0x200000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x482500001L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue())
                conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPaused = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPendingGetValue) ? (true) : (ConferenceViewModelIsConferenceLocallyPaused1));
            if((dirtyFlags & 0x482500001L) != 0) {
                if(conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPaused) {
                        dirtyFlags_1 |= 0x1000L;
                }
                else {
                        dirtyFlags_1 |= 0x800L;
                }
            }
        }
        if ((dirtyFlags & 0x482040040L) != 0) {

                // read conferenceViewModel.meParticipant.getValue().contact.getValue().name == null ? conferenceViewModel.meParticipant.getValue().displayName.getValue() : conferenceViewModel.meParticipant.getValue().contact.getValue().name
                conferenceViewModelMeParticipantContactNameJavaLangObjectNullConferenceViewModelMeParticipantDisplayNameConferenceViewModelMeParticipantContactName = ((conferenceViewModelMeParticipantContactNameJavaLangObjectNull) ? (conferenceViewModelMeParticipantDisplayNameGetValue) : (conferenceViewModelMeParticipantContactName));
        }
        if ((dirtyFlags & 0x682001010L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isInConference.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false
                conferenceViewModelMeParticipantIsInConferenceControlsViewModelIsSendingVideoBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsInConferenceGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue) : (false));
            if((dirtyFlags & 0x682001010L) != 0) {
                if(conferenceViewModelMeParticipantIsInConferenceControlsViewModelIsSendingVideoBooleanFalse) {
                        dirtyFlags_1 |= 0x4000L;
                }
                else {
                        dirtyFlags_1 |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isInConference.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? View.VISIBLE : View.GONE
                conferenceViewModelMeParticipantIsInConferenceControlsViewModelIsSendingVideoBooleanFalseViewVISIBLEViewGONE = ((conferenceViewModelMeParticipantIsInConferenceControlsViewModelIsSendingVideoBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x600000300L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) ? (controlsViewModelPipMode) : (false));
            if((dirtyFlags & 0x600000300L) != 0) {
                if(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) {
                        dirtyFlags |= 0x4000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = ((controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x4a0010800L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isMuted.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) : false
                conferenceViewModelSpeakingParticipantIsMutedConferenceViewModelMoreThanTwoParticipantsBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantIsMutedGetValue) ? (conferenceViewModelMoreThanTwoParticipants) : (false));
            if((dirtyFlags & 0x4a0010800L) != 0) {
                if(conferenceViewModelSpeakingParticipantIsMutedConferenceViewModelMoreThanTwoParticipantsBooleanFalse) {
                        dirtyFlags |= 0x1000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isMuted.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) : false ? View.VISIBLE : View.GONE
                conferenceViewModelSpeakingParticipantIsMutedConferenceViewModelMoreThanTwoParticipantsBooleanFalseViewVISIBLEViewGONE = ((conferenceViewModelSpeakingParticipantIsMutedConferenceViewModelMoreThanTwoParticipantsBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x80000000000000L) != 0 || (dirtyFlags_1 & 0x200000000000L) != 0) {

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
            if((dirtyFlags & 0x680010100L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue) {
                        dirtyFlags_1 |= 0x4000000000L;
                }
                else {
                        dirtyFlags_1 |= 0x2000000000L;
                }
            }
        }
        if ((dirtyFlags_1 & 0x10020800L) != 0) {


            if ((dirtyFlags_1 & 0x10000000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.speakingParticipantVideoEnabled
                        conferenceViewModelSpeakingParticipantVideoEnabled = conferenceViewModel.getSpeakingParticipantVideoEnabled();
                    }
                    updateLiveDataRegistration(7, conferenceViewModelSpeakingParticipantVideoEnabled);


                    if (conferenceViewModelSpeakingParticipantVideoEnabled != null) {
                        // read conferenceViewModel.speakingParticipantVideoEnabled.getValue()
                        conferenceViewModelSpeakingParticipantVideoEnabledGetValue = conferenceViewModelSpeakingParticipantVideoEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantVideoEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantVideoEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelSpeakingParticipantVideoEnabledGetValue);
            }
            if ((dirtyFlags_1 & 0x20000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.twoOrMoreParticipants
                        conferenceViewModelTwoOrMoreParticipants = conferenceViewModel.getTwoOrMoreParticipants();
                    }
                    updateLiveDataRegistration(10, conferenceViewModelTwoOrMoreParticipants);


                    if (conferenceViewModelTwoOrMoreParticipants != null) {
                        // read conferenceViewModel.twoOrMoreParticipants.getValue()
                        conferenceViewModelTwoOrMoreParticipantsGetValue = conferenceViewModelTwoOrMoreParticipants.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelTwoOrMoreParticipantsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelTwoOrMoreParticipantsGetValue);
                if((dirtyFlags & 0x480000400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelTwoOrMoreParticipantsGetValue) {
                            dirtyFlags |= 0x400000000000000L;
                            dirtyFlags_1 |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000000L;
                            dirtyFlags_1 |= 0x8000L;
                    }
                }
            }
            if ((dirtyFlags_1 & 0x800L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.meParticipant
                        conferenceViewModelMeParticipant = conferenceViewModel.getMeParticipant();
                    }
                    updateLiveDataRegistration(25, conferenceViewModelMeParticipant);


                    if (conferenceViewModelMeParticipant != null) {
                        // read conferenceViewModel.meParticipant.getValue()
                        conferenceViewModelMeParticipantGetValue = conferenceViewModelMeParticipant.getValue();
                    }


                    if (conferenceViewModelMeParticipantGetValue != null) {
                        // read conferenceViewModel.meParticipant.getValue().isJoining
                        conferenceViewModelMeParticipantIsJoining = conferenceViewModelMeParticipantGetValue.isJoining();
                    }
                    updateLiveDataRegistration(20, conferenceViewModelMeParticipantIsJoining);


                    if (conferenceViewModelMeParticipantIsJoining != null) {
                        // read conferenceViewModel.meParticipant.getValue().isJoining.getValue()
                        conferenceViewModelMeParticipantIsJoiningGetValue = conferenceViewModelMeParticipantIsJoining.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isJoining.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsJoiningGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelMeParticipantIsJoiningGetValue);
            }
        }

        if ((dirtyFlags & 0x600000120L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue));
            if((dirtyFlags & 0x600000120L) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) {
                        dirtyFlags_1 |= 0x4L;
                        dirtyFlags_1 |= 0x400000000L;
                        dirtyFlags_1 |= 0x40000000000L;
                }
                else {
                        dirtyFlags_1 |= 0x2L;
                        dirtyFlags_1 |= 0x200000000L;
                        dirtyFlags_1 |= 0x20000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_remote_margin
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipRemoteMargin = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (conferenceConstraintLayout.getResources().getDimension(R.dimen.margin_0dp)) : (conferenceConstraintLayout.getResources().getDimension(R.dimen.voip_remote_margin)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_buttons_fragment_margin_size
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipButtonsFragmentMarginSize = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (conferenceConstraintLayout.getResources().getDimension(R.dimen.margin_0dp)) : (conferenceConstraintLayout.getResources().getDimension(R.dimen.voip_buttons_fragment_margin_size)));
                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x482500001L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isJoining.getValue())
                conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPausedBooleanTrueConferenceViewModelMeParticipantIsJoining = ((conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPaused) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMeParticipantIsJoiningGetValue));
            if((dirtyFlags & 0x482500001L) != 0) {
                if(conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPausedBooleanTrueConferenceViewModelMeParticipantIsJoining) {
                        dirtyFlags_1 |= 0x100000L;
                }
                else {
                        dirtyFlags_1 |= 0x80000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isJoining.getValue()) ? View.GONE : View.VISIBLE
                conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPausedBooleanTrueConferenceViewModelMeParticipantIsJoiningViewGONEViewVISIBLE = ((conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPausedBooleanTrueConferenceViewModelMeParticipantIsJoining) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x680000420L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue())
                controlsViewModelFullScreenModeBooleanTrueConferenceViewModelTwoOrMoreParticipants = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelTwoOrMoreParticipantsGetValue));
            if((dirtyFlags & 0x680000420L) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueConferenceViewModelTwoOrMoreParticipants) {
                        dirtyFlags_1 |= 0x400L;
                }
                else {
                        dirtyFlags_1 |= 0x200L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_active_speaker_top_margin
                controlsViewModelFullScreenModeBooleanTrueConferenceViewModelTwoOrMoreParticipantsLocalParticipantBackgroundAndroidDimenMargin0dpLocalParticipantBackgroundAndroidDimenVoipActiveSpeakerTopMargin = ((controlsViewModelFullScreenModeBooleanTrueConferenceViewModelTwoOrMoreParticipants) ? (localParticipantBackground.getResources().getDimension(R.dimen.margin_0dp)) : (localParticipantBackground.getResources().getDimension(R.dimen.voip_active_speaker_top_margin)));
        }
        if ((dirtyFlags & 0x480000081L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantVideoEnabled.getValue()) : false
                conferenceViewModelIsConferenceLocallyPausedConferenceViewModelSpeakingParticipantVideoEnabledBooleanFalse = ((ConferenceViewModelIsConferenceLocallyPaused1) ? (androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelSpeakingParticipantVideoEnabledGetValue) : (false));
            if((dirtyFlags & 0x480000081L) != 0) {
                if(conferenceViewModelIsConferenceLocallyPausedConferenceViewModelSpeakingParticipantVideoEnabledBooleanFalse) {
                        dirtyFlags |= 0x100000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantVideoEnabled.getValue()) : false ? View.VISIBLE : View.GONE
                conferenceViewModelIsConferenceLocallyPausedConferenceViewModelSpeakingParticipantVideoEnabledBooleanFalseViewVISIBLEViewGONE = ((conferenceViewModelIsConferenceLocallyPausedConferenceViewModelSpeakingParticipantVideoEnabledBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x680080128L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = ((controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenMode) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue));
            if((dirtyFlags & 0x680080128L) != 0) {
                if(controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) {
                        dirtyFlags_1 |= 0x4000000L;
                }
                else {
                        dirtyFlags_1 |= 0x2000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags_1 & 0x2002000000L) != 0) {


            if ((dirtyFlags_1 & 0x2000000000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.moreThanTwoParticipants
                        ConferenceViewModelMoreThanTwoParticipants1 = conferenceViewModel.getMoreThanTwoParticipants();
                    }
                    updateLiveDataRegistration(16, ConferenceViewModelMoreThanTwoParticipants1);


                    if (ConferenceViewModelMoreThanTwoParticipants1 != null) {
                        // read conferenceViewModel.moreThanTwoParticipants.getValue()
                        conferenceViewModelMoreThanTwoParticipantsGetValue = ConferenceViewModelMoreThanTwoParticipants1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelMoreThanTwoParticipantsGetValue);
                if((dirtyFlags & 0x480010000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue) {
                            dirtyFlags_1 |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000000000000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue())
                    conferenceViewModelMoreThanTwoParticipants = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelMoreThanTwoParticipantsGetValue;
            }
            if ((dirtyFlags_1 & 0x2000000L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isRemotelyRecorded
                        conferenceViewModelIsRemotelyRecorded = conferenceViewModel.isRemotelyRecorded();
                    }
                    updateLiveDataRegistration(19, conferenceViewModelIsRemotelyRecorded);


                    if (conferenceViewModelIsRemotelyRecorded != null) {
                        // read conferenceViewModel.isRemotelyRecorded.getValue()
                        conferenceViewModelIsRemotelyRecordedGetValue = conferenceViewModelIsRemotelyRecorded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsRemotelyRecordedGetValue);
                if((dirtyFlags_1 & 0x2000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) {
                            dirtyFlags_1 |= 0x100000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x80000000000L;
                    }
                }
                if((dirtyFlags & 0x480080000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) {
                            dirtyFlags_1 |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x800000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
                    conferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRemotelyRecordedGetValue) ? (topBarrier.getResources().getDimension(R.dimen.voip_single_call_header_size_with_record_info)) : (topBarrier.getResources().getDimension(R.dimen.voip_single_call_header_size)));
            }
        }

        if ((dirtyFlags & 0x680080128L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
                controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeTopBarrierAndroidDimenMargin0dpConferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize = ((controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (topBarrier.getResources().getDimension(R.dimen.margin_0dp)) : (conferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize));
        }
        if ((dirtyFlags & 0x680010100L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue())
                controlsViewModelPipModeBooleanTrueConferenceViewModelMoreThanTwoParticipants = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue) ? (true) : (conferenceViewModelMoreThanTwoParticipants));
            if((dirtyFlags & 0x680010100L) != 0) {
                if(controlsViewModelPipModeBooleanTrueConferenceViewModelMoreThanTwoParticipants) {
                        dirtyFlags_1 |= 0x1L;
                }
                else {
                        dirtyFlags |= 0x8000000000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) ? View.GONE : View.VISIBLE
                controlsViewModelPipModeBooleanTrueConferenceViewModelMoreThanTwoParticipantsViewGONEViewVISIBLE = ((controlsViewModelPipModeBooleanTrueConferenceViewModelMoreThanTwoParticipants) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x480002000L) != 0) {
            // api target 1

            this.activeSpeakerBackground.setVisibility(conferenceViewModelSpeakingParticipantFoundViewVISIBLEViewGONE);
            this.speakingParticipantAvatar.setVisibility(conferenceViewModelSpeakingParticipantFoundViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x600000020L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutTopMargin(this.activeSpeakerBackground, controlsViewModelFullScreenModeActiveSpeakerBackgroundAndroidDimenMargin0dpActiveSpeakerBackgroundAndroidDimenVoipActiveSpeakerTopMargin);
            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutBottomMargin(this.scrollIndicator, controlsViewModelFullScreenModeScrollIndicatorAndroidDimenMargin0dpScrollIndicatorAndroidDimenVoipConferenceActiveSpeakerDotsMargin);
        }
        if ((dirtyFlags & 0x480000802L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.activeSpeakerBackground, conferenceViewModelSpeakingParticipantIsInConferenceActiveSpeakerBackgroundAndroidDrawableShapeRemotePausedBackgroundActiveSpeakerBackgroundAndroidDrawableShapeRemoteBackground);
        }
        if ((dirtyFlags & 0x400000000L) != 0) {
            // api target 1

            this.activeSpeakerBackground.setOnClickListener(mCallback63);
            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.conferenceConstraintLayout, true);
            this.localParticipantBackground.setOnClickListener(mCallback64);
            org.linphone.utils.DataBindingUtilsKt.setSelectedIndex(this.scrollIndicator, 0);
            this.switchCamera.setOnClickListener(mCallback65);
            this.toggleConferenceRecording.setOnClickListener(mCallback62);
            this.togglePauseConference.setOnClickListener(mCallback61);
        }
        if ((dirtyFlags & 0x4a0010800L) != 0) {
            // api target 1

            this.activeSpeakerMuted.setVisibility(conferenceViewModelSpeakingParticipantIsMutedConferenceViewModelMoreThanTwoParticipantsBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x480000081L) != 0) {
            // api target 1

            this.conferenceActiveSpeakerRemoteVideo.setVisibility(conferenceViewModelIsConferenceLocallyPausedConferenceViewModelSpeakingParticipantVideoEnabledBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x600000120L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutMargins(this.conferenceConstraintLayout, controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipRemoteMargin);
            androidx.databinding.adapters.ViewBindingAdapter.setPaddingBottom(this.conferenceConstraintLayout, controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeConferenceConstraintLayoutAndroidDimenMargin0dpConferenceConstraintLayoutAndroidDimenVoipButtonsFragmentMarginSize);
            this.group.setVisibility(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x500000000L) != 0) {
            // api target 1

            this.conferenceConstraintLayout.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x484000000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.flexboxLayout, conferenceViewModelActiveSpeakerConferenceParticipantDevicesGetValue, R.layout.voip_conference_participant_remote_active_speaker_miniature);
        }
        if ((dirtyFlags & 0x490000000L) != 0) {
            // api target 1

            this.localParticipantAvatar.setVisibility(conferenceViewModelIsMeListenerOnlyViewGONEViewVISIBLE);
            this.localParticipantBackground.setVisibility(conferenceViewModelIsMeListenerOnlyViewGONEViewVISIBLE);
            this.localParticipantName.setVisibility(conferenceViewModelIsMeListenerOnlyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x482000000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadSelfAvatarWithCoil(this.localParticipantAvatar, conferenceViewModelMeParticipantGetValue);
        }
        if ((dirtyFlags & 0x680000420L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutTopMargin(this.localParticipantBackground, controlsViewModelFullScreenModeBooleanTrueConferenceViewModelTwoOrMoreParticipantsLocalParticipantBackgroundAndroidDimenMargin0dpLocalParticipantBackgroundAndroidDimenVoipActiveSpeakerTopMargin);
        }
        if ((dirtyFlags & 0x480000400L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutMargins(this.localParticipantMuted, conferenceViewModelTwoOrMoreParticipantsLocalParticipantMutedAndroidDimenMuteMicMiniatureMarginLocalParticipantMutedAndroidDimenMuteMicGridMargin);
            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutMargins(this.switchCamera, conferenceViewModelTwoOrMoreParticipantsSwitchCameraAndroidDimenMargin0dpSwitchCameraAndroidDimenVoipActiveSpeakerTopMargin);
        }
        if ((dirtyFlags & 0x482008000L) != 0) {
            // api target 1

            this.localParticipantMuted.setVisibility(conferenceViewModelMeParticipantIsMutedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x482040040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.localParticipantName, conferenceViewModelMeParticipantContactNameJavaLangObjectNullConferenceViewModelMeParticipantDisplayNameConferenceViewModelMeParticipantContactName);
        }
        if ((dirtyFlags & 0x482500001L) != 0) {
            // api target 1

            this.localParticipantPaused.setVisibility(conferenceViewModelConferenceCreationPendingBooleanTrueConferenceViewModelIsConferenceLocallyPausedBooleanTrueConferenceViewModelMeParticipantIsJoiningViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x482020000L) != 0) {
            // api target 1

            this.localParticipantSpeakingBorder.setVisibility(conferenceViewModelMeParticipantIsSpeakingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x682001010L) != 0) {
            // api target 1

            this.localPreviewVideoSurface.setVisibility(conferenceViewModelMeParticipantIsInConferenceControlsViewModelIsSendingVideoBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x480010000L) != 0) {
            // api target 1

            ((android.widget.HorizontalScrollView) this.miniatures).setVisibility(conferenceViewModelMoreThanTwoParticipantsViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x600000008L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutTopMargin(this.remoteName, controlsViewModelFoldedRemoteNameAndroidDimenVoipConferenceHeaderFoldedTopMarginRemoteNameAndroidDimenMargin0dp);
        }
        if ((dirtyFlags & 0x481000000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.remoteName, conferenceViewModelSubjectGetValue);
        }
        if ((dirtyFlags & 0x480080000L) != 0) {
            // api target 1

            this.remoteRecording.getRoot().setVisibility(conferenceViewModelIsRemotelyRecordedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x680010100L) != 0) {
            // api target 1

            this.scrollIndicator.setVisibility(controlsViewModelPipModeBooleanTrueConferenceViewModelMoreThanTwoParticipantsViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x480000004L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setItems(this.scrollIndicator, conferenceViewModelConferenceParticipantDevicesSize);
        }
        if ((dirtyFlags & 0x480000800L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadVoipContactPictureWithCoil(this.speakingParticipantAvatar, conferenceViewModelSpeakingParticipantGetValue);
        }
        if ((dirtyFlags & 0x480004800L) != 0) {
            // api target 1

            this.speakingParticipantJoining.setVisibility(conferenceViewModelSpeakingParticipantIsJoiningViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x488200800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speakingParticipantName, conferenceViewModelSpeakingParticipantContactNameJavaLangObjectNullConferenceViewModelSpeakingParticipantDisplayNameConferenceViewModelSpeakingParticipantContactName);
        }
        if ((dirtyFlags & 0x480002802L) != 0) {
            // api target 1

            this.speakingParticipantPaused.setVisibility(conferenceViewModelSpeakingParticipantFoundConferenceViewModelSpeakingParticipantIsInConferenceBooleanFalseViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x600000300L) != 0) {
            // api target 1

            this.switchCamera.setVisibility(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x480800000L) != 0) {
            // api target 1

            this.toggleConferenceRecording.setSelected(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsRecordingGetValue);
        }
        if ((dirtyFlags & 0x480400000L) != 0) {
            // api target 1

            this.togglePauseConference.setEnabled(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceCreationPending);
        }
        if ((dirtyFlags & 0x480000001L) != 0) {
            // api target 1

            this.togglePauseConference.setSelected(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue);
        }
        if ((dirtyFlags & 0x680080128L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutTopMargin(this.topBarrier, controlsViewModelFoldedBooleanTrueControlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeTopBarrierAndroidDimenMargin0dpConferenceViewModelIsRemotelyRecordedTopBarrierAndroidDimenVoipSingleCallHeaderSizeWithRecordInfoTopBarrierAndroidDimenVoipSingleCallHeaderSize);
        }
        executeBindingsOn(remoteRecording);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
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
            case 4: {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): conferenceViewModel.isConferenceLocallyPaused
        flag 1 (0x2L): conferenceViewModel.speakingParticipant.getValue().isInConference
        flag 2 (0x3L): conferenceViewModel.conferenceParticipantDevices
        flag 3 (0x4L): controlsViewModel.folded
        flag 4 (0x5L): controlsViewModel.isSendingVideo
        flag 5 (0x6L): controlsViewModel.fullScreenMode
        flag 6 (0x7L): conferenceViewModel.meParticipant.getValue().displayName
        flag 7 (0x8L): conferenceViewModel.speakingParticipantVideoEnabled
        flag 8 (0x9L): controlsViewModel.pipMode
        flag 9 (0xaL): controlsViewModel.isSwitchCameraAvailable
        flag 10 (0xbL): conferenceViewModel.twoOrMoreParticipants
        flag 11 (0xcL): conferenceViewModel.speakingParticipant
        flag 12 (0xdL): conferenceViewModel.meParticipant.getValue().isInConference
        flag 13 (0xeL): conferenceViewModel.speakingParticipantFound
        flag 14 (0xfL): conferenceViewModel.speakingParticipant.getValue().isJoining
        flag 15 (0x10L): conferenceViewModel.meParticipant.getValue().isMuted
        flag 16 (0x11L): conferenceViewModel.moreThanTwoParticipants
        flag 17 (0x12L): conferenceViewModel.meParticipant.getValue().isSpeaking
        flag 18 (0x13L): conferenceViewModel.meParticipant.getValue().contact
        flag 19 (0x14L): conferenceViewModel.isRemotelyRecorded
        flag 20 (0x15L): conferenceViewModel.meParticipant.getValue().isJoining
        flag 21 (0x16L): conferenceViewModel.speakingParticipant.getValue().displayName
        flag 22 (0x17L): conferenceViewModel.conferenceCreationPending
        flag 23 (0x18L): conferenceViewModel.isRecording
        flag 24 (0x19L): conferenceViewModel.subject
        flag 25 (0x1aL): conferenceViewModel.meParticipant
        flag 26 (0x1bL): conferenceViewModel.activeSpeakerConferenceParticipantDevices
        flag 27 (0x1cL): conferenceViewModel.speakingParticipant.getValue().contact
        flag 28 (0x1dL): conferenceViewModel.isMeListenerOnly
        flag 29 (0x1eL): conferenceViewModel.speakingParticipant.getValue().isMuted
        flag 30 (0x1fL): remoteRecording
        flag 31 (0x20L): conferenceViewModel
        flag 32 (0x21L): inflatedVisibility
        flag 33 (0x22L): controlsViewModel
        flag 34 (0x23L): null
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isMuted.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) : false ? View.VISIBLE : View.GONE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isMuted.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) : false ? View.VISIBLE : View.GONE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()) : false
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()) : false
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): conferenceViewModel.speakingParticipant.getValue().contact.getValue().name == null ? conferenceViewModel.speakingParticipant.getValue().displayName.getValue() : conferenceViewModel.speakingParticipant.getValue().contact.getValue().name
        flag 42 (0x2bL): conferenceViewModel.speakingParticipant.getValue().contact.getValue().name == null ? conferenceViewModel.speakingParticipant.getValue().displayName.getValue() : conferenceViewModel.speakingParticipant.getValue().contact.getValue().name
        flag 43 (0x2cL): !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantVideoEnabled.getValue()) : false ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantVideoEnabled.getValue()) : false ? View.VISIBLE : View.GONE
        flag 45 (0x2eL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_conference_active_speaker_dots_margin
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_conference_active_speaker_dots_margin
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue()) ? View.VISIBLE : View.GONE
        flag 48 (0x31L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue()) ? View.VISIBLE : View.GONE
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) ? View.GONE : View.VISIBLE
        flag 52 (0x35L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) ? View.GONE : View.VISIBLE
        flag 53 (0x36L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
        flag 54 (0x37L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
        flag 55 (0x38L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 56 (0x39L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 57 (0x3aL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue()) ? @android:dimen/mute_mic_miniature_margin : @android:dimen/mute_mic_grid_margin
        flag 58 (0x3bL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue()) ? @android:dimen/mute_mic_miniature_margin : @android:dimen/mute_mic_grid_margin
        flag 59 (0x3cL): !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()) ? @android:drawable/shape_remote_paused_background : @android:drawable/shape_remote_background
        flag 60 (0x3dL): !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()) ? @android:drawable/shape_remote_paused_background : @android:drawable/shape_remote_background
        flag 61 (0x3eL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_active_speaker_top_margin
        flag 62 (0x3fL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_active_speaker_top_margin
        flag 63 (0x40L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) ? View.GONE : View.VISIBLE
        flag 64 (0x41L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) ? View.GONE : View.VISIBLE
        flag 65 (0x42L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_remote_margin
        flag 66 (0x43L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_remote_margin
        flag 67 (0x44L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue())
        flag 68 (0x45L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue())
        flag 69 (0x46L): conferenceViewModel.meParticipant.getValue().contact.getValue().name == null ? conferenceViewModel.meParticipant.getValue().displayName.getValue() : conferenceViewModel.meParticipant.getValue().contact.getValue().name
        flag 70 (0x47L): conferenceViewModel.meParticipant.getValue().contact.getValue().name == null ? conferenceViewModel.meParticipant.getValue().displayName.getValue() : conferenceViewModel.meParticipant.getValue().contact.getValue().name
        flag 71 (0x48L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isInConference.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false
        flag 72 (0x49L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isInConference.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false
        flag 73 (0x4aL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_active_speaker_top_margin
        flag 74 (0x4bL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_active_speaker_top_margin
        flag 75 (0x4cL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isJoining.getValue())
        flag 76 (0x4dL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isJoining.getValue())
        flag 77 (0x4eL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isInConference.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? View.VISIBLE : View.GONE
        flag 78 (0x4fL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isInConference.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? View.VISIBLE : View.GONE
        flag 79 (0x50L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_active_speaker_top_margin
        flag 80 (0x51L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_active_speaker_top_margin
        flag 81 (0x52L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue())
        flag 82 (0x53L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.twoOrMoreParticipants.getValue())
        flag 83 (0x54L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isJoining.getValue()) ? View.GONE : View.VISIBLE
        flag 84 (0x55L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceCreationPending.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isJoining.getValue()) ? View.GONE : View.VISIBLE
        flag 85 (0x56L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 86 (0x57L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 87 (0x58L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isMuted.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) : false
        flag 88 (0x59L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isMuted.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) : false
        flag 89 (0x5aL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 90 (0x5bL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 91 (0x5cL): !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantVideoEnabled.getValue()) : false
        flag 92 (0x5dL): !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantVideoEnabled.getValue()) : false
        flag 93 (0x5eL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/voip_conference_header_folded_top_margin : @android:dimen/margin_0dp
        flag 94 (0x5fL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? @android:dimen/voip_conference_header_folded_top_margin : @android:dimen/margin_0dp
        flag 95 (0x60L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 96 (0x61L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 97 (0x62L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_buttons_fragment_margin_size
        flag 98 (0x63L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? @android:dimen/margin_0dp : @android:dimen/voip_buttons_fragment_margin_size
        flag 99 (0x64L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isSpeaking.getValue()) ? View.VISIBLE : View.GONE
        flag 100 (0x65L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.meParticipant.getValue().isSpeaking.getValue()) ? View.VISIBLE : View.GONE
        flag 101 (0x66L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue())
        flag 102 (0x67L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue())
        flag 103 (0x68L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()) : false ? View.GONE : View.VISIBLE
        flag 104 (0x69L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipantFound.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.speakingParticipant.getValue().isInConference.getValue()) : false ? View.GONE : View.VISIBLE
        flag 105 (0x6aL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 106 (0x6bL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 107 (0x6cL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 108 (0x6dL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? @android:dimen/voip_single_call_header_size_with_record_info : @android:dimen/voip_single_call_header_size
        flag 109 (0x6eL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 110 (0x6fL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.folded.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 111 (0x70L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? View.VISIBLE : View.GONE
        flag 112 (0x71L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isRemotelyRecorded.getValue()) ? View.VISIBLE : View.GONE
        flag 113 (0x72L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) ? View.VISIBLE : View.GONE
        flag 114 (0x73L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.moreThanTwoParticipants.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}