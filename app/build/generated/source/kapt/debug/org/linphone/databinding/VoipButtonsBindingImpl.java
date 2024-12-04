package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipButtonsBindingImpl extends VoipButtonsBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipButtonsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private VoipButtonsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 12
            , (android.widget.ImageView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ProgressBar) bindings[6]
            );
        this.audioRoutes.setTag(null);
        this.buttonsLayout.setTag(null);
        this.extraCount.setTag(null);
        this.hangup.setTag(null);
        this.microphone.setTag(null);
        this.more.setTag(null);
        this.speaker.setTag(null);
        this.video.setTag(null);
        this.videoToggleInProgress.setTag(null);
        setRootTag(root);
        // listeners
        mCallback15 = new org.linphone.generated.callback.OnClickListener(this, 5);
        mCallback11 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback16 = new org.linphone.generated.callback.OnClickListener(this, 6);
        mCallback12 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback13 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback14 = new org.linphone.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8000L;
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
        if (BR.callsViewModel == variableId) {
            setCallsViewModel((org.linphone.activities.voip.viewmodels.CallsViewModel) variable);
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
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.callsViewModel);
        super.requestRebind();
    }
    public void setConferenceViewModel(@Nullable org.linphone.activities.voip.viewmodels.ConferenceViewModel ConferenceViewModel) {
        this.mConferenceViewModel = ConferenceViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.conferenceViewModel);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelIsSendingVideo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeControlsViewModelAudioRoutesEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeControlsViewModelBouncyCounterTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 3 :
                return onChangeControlsViewModelAudioRoutesSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeControlsViewModelIsVideoAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeControlsViewModelIsVideoEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeControlsViewModelIsSpeakerSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeCallsViewModelIsMuteMicrophoneEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeControlsViewModelIsVideoUpdateInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeConferenceViewModelIsMeListenerOnly((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeCallsViewModelIsMicrophoneMuted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeCallsViewModelChatAndCallsCount((androidx.lifecycle.MediatorLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsSendingVideo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsSendingVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelAudioRoutesEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelAudioRoutesEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelBouncyCounterTranslateY(androidx.lifecycle.MutableLiveData<java.lang.Float> ControlsViewModelBouncyCounterTranslateY, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelAudioRoutesSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelAudioRoutesSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsVideoAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsVideoAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsVideoEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsVideoEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsSpeakerSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsSpeakerSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelIsMuteMicrophoneEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelIsMuteMicrophoneEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsVideoUpdateInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsVideoUpdateInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsMeListenerOnly(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsMeListenerOnly, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelIsMicrophoneMuted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelIsMicrophoneMuted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelChatAndCallsCount(androidx.lifecycle.MediatorLiveData<java.lang.Integer> CallsViewModelChatAndCallsCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
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
        int callsViewModelChatAndCallsCountInt0ViewGONEViewVISIBLE = 0;
        boolean controlsViewModelHideVideo = false;
        boolean controlsViewModelIsVideoAvailableControlsViewModelIsVideoUpdateInProgressBooleanFalse = false;
        boolean controlsViewModelIsVideoUpdateInProgress = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMuteMicrophoneEnabledGetValue = false;
        org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;
        java.lang.Boolean callsViewModelIsMicrophoneMutedGetValue = null;
        java.lang.Integer callsViewModelChatAndCallsCountGetValue = null;
        int controlsViewModelHideVideoViewGONEViewVISIBLE = 0;
        boolean callsViewModelIsMicrophoneMutedBooleanTrueConferenceViewModelIsMeListenerOnly = false;
        java.lang.Boolean controlsViewModelIsVideoAvailableGetValue = null;
        java.lang.Boolean callsViewModelIsMuteMicrophoneEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSendingVideo = null;
        boolean callsViewModelChatAndCallsCountInt0 = false;
        java.lang.Boolean controlsViewModelAudioRoutesSelectedGetValue = null;
        java.lang.Boolean controlsViewModelIsSendingVideoGetValue = null;
        java.lang.String controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseVideoAndroidStringContentDescriptionDisableVideoVideoAndroidStringContentDescriptionEnableVideo = null;
        java.lang.String controlsViewModelIsSpeakerSelectedSpeakerAndroidStringContentDescriptionDisableSpeakerSpeakerAndroidStringContentDescriptionEnableSpeaker = null;
        int controlsViewModelAudioRoutesEnabledViewGONEViewVISIBLE = 0;
        boolean controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse = false;
        java.lang.Boolean controlsViewModelIsVideoUpdateInProgressGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelAudioRoutesEnabled = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Float> controlsViewModelBouncyCounterTranslateY = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelAudioRoutesSelected = null;
        java.lang.Boolean controlsViewModelIsVideoEnabledGetValue = null;
        java.lang.String callsViewModelIsMicrophoneMutedMicrophoneAndroidStringContentDescriptionDisableMicMuteMicrophoneAndroidStringContentDescriptionEnableMicMute = null;
        java.lang.String stringValueOfCallsViewModelChatAndCallsCount = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsVideoAvailable = null;
        int controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesSelectedGetValue = false;
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsVideoEnabled = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSpeakerSelected = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoAvailableGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue = false;
        int androidxDatabindingViewDataBindingSafeUnboxCallsViewModelChatAndCallsCountGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> callsViewModelIsMuteMicrophoneEnabled = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsVideoUpdateInProgress1 = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsMeListenerOnly = null;
        java.lang.Boolean controlsViewModelAudioRoutesEnabledGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue = false;
        boolean controlsViewModelIsVideoAvailableControlsViewModelIsVideoUpdateInProgressBooleanFalseConferenceViewModelIsMeListenerOnlyBooleanFalse = false;
        java.lang.Boolean controlsViewModelIsSpeakerSelectedGetValue = null;
        float androidxDatabindingViewDataBindingSafeUnboxControlsViewModelBouncyCounterTranslateYGetValue = 0f;
        java.lang.Boolean conferenceViewModelIsMeListenerOnlyGetValue = null;
        boolean ConferenceViewModelIsMeListenerOnly1 = false;
        boolean callsViewModelIsMuteMicrophoneEnabledConferenceViewModelIsMeListenerOnlyBooleanFalse = false;
        boolean controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseConferenceViewModelIsMeListenerOnlyBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> callsViewModelIsMicrophoneMuted = null;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        int controlsViewModelIsVideoUpdateInProgressViewVISIBLEViewGONE = 0;
        java.lang.Float controlsViewModelBouncyCounterTranslateYGetValue = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Integer> callsViewModelChatAndCallsCount = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoUpdateInProgressGetValue = false;

        if ((dirtyFlags & 0xbe80L) != 0) {


            if ((dirtyFlags & 0xb280L) != 0) {

                    if (callsViewModel != null) {
                        // read callsViewModel.isMuteMicrophoneEnabled
                        callsViewModelIsMuteMicrophoneEnabled = callsViewModel.isMuteMicrophoneEnabled();
                    }
                    updateLiveDataRegistration(7, callsViewModelIsMuteMicrophoneEnabled);


                    if (callsViewModelIsMuteMicrophoneEnabled != null) {
                        // read callsViewModel.isMuteMicrophoneEnabled.getValue()
                        callsViewModelIsMuteMicrophoneEnabledGetValue = callsViewModelIsMuteMicrophoneEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMuteMicrophoneEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMuteMicrophoneEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelIsMuteMicrophoneEnabledGetValue);
                if((dirtyFlags & 0xb280L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMuteMicrophoneEnabledGetValue) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xb600L) != 0) {

                    if (callsViewModel != null) {
                        // read callsViewModel.isMicrophoneMuted
                        callsViewModelIsMicrophoneMuted = callsViewModel.isMicrophoneMuted();
                    }
                    updateLiveDataRegistration(10, callsViewModelIsMicrophoneMuted);


                    if (callsViewModelIsMicrophoneMuted != null) {
                        // read callsViewModel.isMicrophoneMuted.getValue()
                        callsViewModelIsMicrophoneMutedGetValue = callsViewModelIsMicrophoneMuted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelIsMicrophoneMutedGetValue);
                if((dirtyFlags & 0xb600L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0x9400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }

                if ((dirtyFlags & 0x9400L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue()) ? @android:string/content_description_disable_mic_mute : @android:string/content_description_enable_mic_mute
                        callsViewModelIsMicrophoneMutedMicrophoneAndroidStringContentDescriptionDisableMicMuteMicrophoneAndroidStringContentDescriptionEnableMicMute = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue) ? (microphone.getResources().getString(R.string.content_description_disable_mic_mute)) : (microphone.getResources().getString(R.string.content_description_enable_mic_mute)));
                }
            }
            if ((dirtyFlags & 0x9800L) != 0) {

                    if (callsViewModel != null) {
                        // read callsViewModel.chatAndCallsCount
                        callsViewModelChatAndCallsCount = callsViewModel.getChatAndCallsCount();
                    }
                    updateLiveDataRegistration(11, callsViewModelChatAndCallsCount);


                    if (callsViewModelChatAndCallsCount != null) {
                        // read callsViewModel.chatAndCallsCount.getValue()
                        callsViewModelChatAndCallsCountGetValue = callsViewModelChatAndCallsCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.chatAndCallsCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelChatAndCallsCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelChatAndCallsCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.chatAndCallsCount.getValue()) == 0
                    callsViewModelChatAndCallsCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxCallsViewModelChatAndCallsCountGetValue) == (0);
                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.chatAndCallsCount.getValue()))
                    stringValueOfCallsViewModelChatAndCallsCount = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelChatAndCallsCountGetValue);
                if((dirtyFlags & 0x9800L) != 0) {
                    if(callsViewModelChatAndCallsCountInt0) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.chatAndCallsCount.getValue()) == 0 ? View.GONE : View.VISIBLE
                    callsViewModelChatAndCallsCountInt0ViewGONEViewVISIBLE = ((callsViewModelChatAndCallsCountInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0xe37fL) != 0) {


            if ((dirtyFlags & 0xc000L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.hideVideo
                        controlsViewModelHideVideo = controlsViewModel.getHideVideo();
                    }
                if((dirtyFlags & 0xc000L) != 0) {
                    if(controlsViewModelHideVideo) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read controlsViewModel.hideVideo ? View.GONE : View.VISIBLE
                    controlsViewModelHideVideoViewGONEViewVISIBLE = ((controlsViewModelHideVideo) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc002L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.audioRoutesEnabled
                        controlsViewModelAudioRoutesEnabled = controlsViewModel.getAudioRoutesEnabled();
                    }
                    updateLiveDataRegistration(1, controlsViewModelAudioRoutesEnabled);


                    if (controlsViewModelAudioRoutesEnabled != null) {
                        // read controlsViewModel.audioRoutesEnabled.getValue()
                        controlsViewModelAudioRoutesEnabledGetValue = controlsViewModelAudioRoutesEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelAudioRoutesEnabledGetValue);
                if((dirtyFlags & 0xc002L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue) {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.GONE : View.VISIBLE
                    controlsViewModelAudioRoutesEnabledViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc004L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.bouncyCounterTranslateY
                        controlsViewModelBouncyCounterTranslateY = controlsViewModel.getBouncyCounterTranslateY();
                    }
                    updateLiveDataRegistration(2, controlsViewModelBouncyCounterTranslateY);


                    if (controlsViewModelBouncyCounterTranslateY != null) {
                        // read controlsViewModel.bouncyCounterTranslateY.getValue()
                        controlsViewModelBouncyCounterTranslateYGetValue = controlsViewModelBouncyCounterTranslateY.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.bouncyCounterTranslateY.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelBouncyCounterTranslateYGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelBouncyCounterTranslateYGetValue);
            }
            if ((dirtyFlags & 0xc008L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.audioRoutesSelected
                        controlsViewModelAudioRoutesSelected = controlsViewModel.getAudioRoutesSelected();
                    }
                    updateLiveDataRegistration(3, controlsViewModelAudioRoutesSelected);


                    if (controlsViewModelAudioRoutesSelected != null) {
                        // read controlsViewModel.audioRoutesSelected.getValue()
                        controlsViewModelAudioRoutesSelectedGetValue = controlsViewModelAudioRoutesSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelAudioRoutesSelectedGetValue);
            }
            if ((dirtyFlags & 0xe310L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isVideoAvailable
                        controlsViewModelIsVideoAvailable = controlsViewModel.isVideoAvailable();
                    }
                    updateLiveDataRegistration(4, controlsViewModelIsVideoAvailable);


                    if (controlsViewModelIsVideoAvailable != null) {
                        // read controlsViewModel.isVideoAvailable.getValue()
                        controlsViewModelIsVideoAvailableGetValue = controlsViewModelIsVideoAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsVideoAvailableGetValue);
                if((dirtyFlags & 0xe310L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoAvailableGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
            }
            if ((dirtyFlags & 0xe221L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isVideoEnabled
                        controlsViewModelIsVideoEnabled = controlsViewModel.isVideoEnabled();
                    }
                    updateLiveDataRegistration(5, controlsViewModelIsVideoEnabled);


                    if (controlsViewModelIsVideoEnabled != null) {
                        // read controlsViewModel.isVideoEnabled.getValue()
                        controlsViewModelIsVideoEnabledGetValue = controlsViewModelIsVideoEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsVideoEnabledGetValue);
                if((dirtyFlags & 0xe221L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc040L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isSpeakerSelected
                        controlsViewModelIsSpeakerSelected = controlsViewModel.isSpeakerSelected();
                    }
                    updateLiveDataRegistration(6, controlsViewModelIsSpeakerSelected);


                    if (controlsViewModelIsSpeakerSelected != null) {
                        // read controlsViewModel.isSpeakerSelected.getValue()
                        controlsViewModelIsSpeakerSelectedGetValue = controlsViewModelIsSpeakerSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSpeakerSelectedGetValue);
                if((dirtyFlags & 0xc040L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue()) ? @android:string/content_description_disable_speaker : @android:string/content_description_enable_speaker
                    controlsViewModelIsSpeakerSelectedSpeakerAndroidStringContentDescriptionDisableSpeakerSpeakerAndroidStringContentDescriptionEnableSpeaker = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue) ? (speaker.getResources().getString(R.string.content_description_disable_speaker)) : (speaker.getResources().getString(R.string.content_description_enable_speaker)));
            }
            if ((dirtyFlags & 0xc100L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isVideoUpdateInProgress
                        ControlsViewModelIsVideoUpdateInProgress1 = controlsViewModel.isVideoUpdateInProgress();
                    }
                    updateLiveDataRegistration(8, ControlsViewModelIsVideoUpdateInProgress1);


                    if (ControlsViewModelIsVideoUpdateInProgress1 != null) {
                        // read controlsViewModel.isVideoUpdateInProgress.getValue()
                        controlsViewModelIsVideoUpdateInProgressGetValue = ControlsViewModelIsVideoUpdateInProgress1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoUpdateInProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsVideoUpdateInProgressGetValue);
                if((dirtyFlags & 0xc100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoUpdateInProgressGetValue) {
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelIsVideoUpdateInProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoUpdateInProgressGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80000000L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.isSendingVideo
                    controlsViewModelIsSendingVideo = controlsViewModel.isSendingVideo();
                }
                updateLiveDataRegistration(0, controlsViewModelIsSendingVideo);


                if (controlsViewModelIsSendingVideo != null) {
                    // read controlsViewModel.isSendingVideo.getValue()
                    controlsViewModelIsSendingVideoGetValue = controlsViewModelIsSendingVideo.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSendingVideoGetValue);
        }
        if ((dirtyFlags & 0x8000400000L) != 0) {



                if (conferenceViewModel != null) {
                    // read conferenceViewModel.isMeListenerOnly
                    conferenceViewModelIsMeListenerOnly = conferenceViewModel.isMeListenerOnly();
                }
                updateLiveDataRegistration(9, conferenceViewModelIsMeListenerOnly);


                if (conferenceViewModelIsMeListenerOnly != null) {
                    // read conferenceViewModel.isMeListenerOnly.getValue()
                    conferenceViewModelIsMeListenerOnlyGetValue = conferenceViewModelIsMeListenerOnly.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue())
                androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsMeListenerOnlyGetValue);

            if ((dirtyFlags & 0x8000000000L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue())
                    ConferenceViewModelIsMeListenerOnly1 = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue;
            }
        }
        if ((dirtyFlags & 0x80000L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.isVideoUpdateInProgress
                    ControlsViewModelIsVideoUpdateInProgress1 = controlsViewModel.isVideoUpdateInProgress();
                }
                updateLiveDataRegistration(8, ControlsViewModelIsVideoUpdateInProgress1);


                if (ControlsViewModelIsVideoUpdateInProgress1 != null) {
                    // read controlsViewModel.isVideoUpdateInProgress.getValue()
                    controlsViewModelIsVideoUpdateInProgressGetValue = ControlsViewModelIsVideoUpdateInProgress1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoUpdateInProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsVideoUpdateInProgressGetValue);
            if((dirtyFlags & 0xc100L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoUpdateInProgressGetValue) {
                        dirtyFlags |= 0x80000000000L;
                }
                else {
                        dirtyFlags |= 0x40000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue())
                controlsViewModelIsVideoUpdateInProgress = !androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoUpdateInProgressGetValue;
        }

        if ((dirtyFlags & 0xe310L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue()) : false
                controlsViewModelIsVideoAvailableControlsViewModelIsVideoUpdateInProgressBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoAvailableGetValue) ? (controlsViewModelIsVideoUpdateInProgress) : (false));
            if((dirtyFlags & 0xe310L) != 0) {
                if(controlsViewModelIsVideoAvailableControlsViewModelIsVideoUpdateInProgressBooleanFalse) {
                        dirtyFlags |= 0x2000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000L;
                }
            }
        }
        if ((dirtyFlags & 0xb600L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue())
                callsViewModelIsMicrophoneMutedBooleanTrueConferenceViewModelIsMeListenerOnly = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue));
        }
        if ((dirtyFlags & 0xe221L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false
                controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsVideoEnabledGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSendingVideoGetValue) : (false));
            if((dirtyFlags & 0xc021L) != 0) {
                if(controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
            if((dirtyFlags & 0xe221L) != 0) {
                if(controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse) {
                        dirtyFlags |= 0x20000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000000L;
                }
            }

            if ((dirtyFlags & 0xc021L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? @android:string/content_description_disable_video : @android:string/content_description_enable_video
                    controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseVideoAndroidStringContentDescriptionDisableVideoVideoAndroidStringContentDescriptionEnableVideo = ((controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse) ? (video.getResources().getString(R.string.content_description_disable_video)) : (video.getResources().getString(R.string.content_description_enable_video)));
            }
        }
        if ((dirtyFlags & 0xb280L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMuteMicrophoneEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) : false
                callsViewModelIsMuteMicrophoneEnabledConferenceViewModelIsMeListenerOnlyBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMuteMicrophoneEnabledGetValue) ? (ConferenceViewModelIsMeListenerOnly1) : (false));
        }
        // batch finished

        if ((dirtyFlags & 0x22000000000L) != 0) {



                if (conferenceViewModel != null) {
                    // read conferenceViewModel.isMeListenerOnly
                    conferenceViewModelIsMeListenerOnly = conferenceViewModel.isMeListenerOnly();
                }
                updateLiveDataRegistration(9, conferenceViewModelIsMeListenerOnly);


                if (conferenceViewModelIsMeListenerOnly != null) {
                    // read conferenceViewModel.isMeListenerOnly.getValue()
                    conferenceViewModelIsMeListenerOnlyGetValue = conferenceViewModelIsMeListenerOnly.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue())
                androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsMeListenerOnlyGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue())
                ConferenceViewModelIsMeListenerOnly1 = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsMeListenerOnlyGetValue;
        }

        if ((dirtyFlags & 0xe310L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) : false
                controlsViewModelIsVideoAvailableControlsViewModelIsVideoUpdateInProgressBooleanFalseConferenceViewModelIsMeListenerOnlyBooleanFalse = ((controlsViewModelIsVideoAvailableControlsViewModelIsVideoUpdateInProgressBooleanFalse) ? (ConferenceViewModelIsMeListenerOnly1) : (false));
        }
        if ((dirtyFlags & 0xe221L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) : false
                controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseConferenceViewModelIsMeListenerOnlyBooleanFalse = ((controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalse) ? (ConferenceViewModelIsMeListenerOnly1) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x8000L) != 0) {
            // api target 1

            this.audioRoutes.setOnClickListener(mCallback14);
            this.hangup.setOnClickListener(mCallback11);
            this.microphone.setOnClickListener(mCallback12);
            this.more.setOnClickListener(mCallback16);
            this.speaker.setOnClickListener(mCallback13);
            this.video.setOnClickListener(mCallback15);
        }
        if ((dirtyFlags & 0xc008L) != 0) {
            // api target 1

            this.audioRoutes.setSelected(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesSelectedGetValue);
        }
        if ((dirtyFlags & 0xc002L) != 0) {
            // api target 1

            this.audioRoutes.setVisibility(controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE);
            this.speaker.setVisibility(controlsViewModelAudioRoutesEnabledViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x9800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.extraCount, stringValueOfCallsViewModelChatAndCallsCount);
            this.extraCount.setVisibility(callsViewModelChatAndCallsCountInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc004L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.extraCount.setTranslationY(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelBouncyCounterTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x9400L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.microphone.setContentDescription(callsViewModelIsMicrophoneMutedMicrophoneAndroidStringContentDescriptionDisableMicMuteMicrophoneAndroidStringContentDescriptionEnableMicMute);
            }
        }
        if ((dirtyFlags & 0xb280L) != 0) {
            // api target 1

            this.microphone.setEnabled(callsViewModelIsMuteMicrophoneEnabledConferenceViewModelIsMeListenerOnlyBooleanFalse);
        }
        if ((dirtyFlags & 0xb600L) != 0) {
            // api target 1

            this.microphone.setSelected(callsViewModelIsMicrophoneMutedBooleanTrueConferenceViewModelIsMeListenerOnly);
        }
        if ((dirtyFlags & 0xc040L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.speaker.setContentDescription(controlsViewModelIsSpeakerSelectedSpeakerAndroidStringContentDescriptionDisableSpeakerSpeakerAndroidStringContentDescriptionEnableSpeaker);
            }
            // api target 1

            this.speaker.setSelected(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue);
        }
        if ((dirtyFlags & 0xc021L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.video.setContentDescription(controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseVideoAndroidStringContentDescriptionDisableVideoVideoAndroidStringContentDescriptionEnableVideo);
            }
        }
        if ((dirtyFlags & 0xe310L) != 0) {
            // api target 1

            this.video.setEnabled(controlsViewModelIsVideoAvailableControlsViewModelIsVideoUpdateInProgressBooleanFalseConferenceViewModelIsMeListenerOnlyBooleanFalse);
        }
        if ((dirtyFlags & 0xe221L) != 0) {
            // api target 1

            this.video.setSelected(controlsViewModelIsVideoEnabledControlsViewModelIsSendingVideoBooleanFalseConferenceViewModelIsMeListenerOnlyBooleanFalse);
        }
        if ((dirtyFlags & 0xc000L) != 0) {
            // api target 1

            this.video.setVisibility(controlsViewModelHideVideoViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc100L) != 0) {
            // api target 1

            this.videoToggleInProgress.setVisibility(controlsViewModelIsVideoUpdateInProgressViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
                // localize variables for thread safety
                // !conferenceViewModel.conferenceExists.getValue()
                java.lang.Boolean conferenceViewModelConferenceExists = null;
                // conferenceViewModel
                org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
                // conferenceViewModel.conferenceDisplayMode != null
                boolean conferenceViewModelConferenceDisplayModeJavaLangObjectNull = false;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;
                // conferenceViewModel.conferenceDisplayMode.getValue() != ConferenceDisplayMode.AUDIO_ONLY
                boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = false;
                // conferenceViewModel.conferenceExists.getValue()
                java.lang.Boolean conferenceViewModelConferenceExistsGetValue = null;
                // !conferenceViewModel.conferenceExists.getValue() ? true : conferenceViewModel.conferenceDisplayMode.getValue() != ConferenceDisplayMode.AUDIO_ONLY
                boolean conferenceViewModelConferenceExistsBooleanTrueConferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = false;
                // conferenceViewModel.conferenceExists != null
                boolean conferenceViewModelConferenceExistsJavaLangObjectNull = false;
                // conferenceViewModel.conferenceDisplayMode.getValue()
                org.linphone.activities.voip.ConferenceDisplayMode conferenceViewModelConferenceDisplayModeGetValue = null;
                // conferenceViewModel.conferenceExists
                androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelConferenceExists1 = null;
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // conferenceViewModel != null
                boolean conferenceViewModelJavaLangObjectNull = false;
                // conferenceViewModel.conferenceDisplayMode
                androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> conferenceViewModelConferenceDisplayMode = null;



                conferenceViewModelJavaLangObjectNull = (conferenceViewModel) != (null);
                if (conferenceViewModelJavaLangObjectNull) {


                    ConferenceViewModelConferenceExists1 = conferenceViewModel.getConferenceExists();

                    conferenceViewModelConferenceExistsJavaLangObjectNull = (ConferenceViewModelConferenceExists1) != (null);
                    if (conferenceViewModelConferenceExistsJavaLangObjectNull) {


                        conferenceViewModelConferenceExistsGetValue = ConferenceViewModelConferenceExists1.getValue();

                        conferenceViewModelConferenceExists = !conferenceViewModelConferenceExistsGetValue;
                        if (conferenceViewModelConferenceExists) {



                            conferenceViewModelConferenceExistsBooleanTrueConferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = true;
                            if (conferenceViewModelConferenceExistsBooleanTrueConferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY) {



                                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                                if (controlsViewModelJavaLangObjectNull) {


                                    controlsViewModel.toggleVideo();
                                }
                            }
                            else {




                                conferenceViewModel.switchLayoutFromAudioOnlyToActiveSpeaker();
                            }
                        }
                        else {




                            conferenceViewModelConferenceDisplayMode = conferenceViewModel.getConferenceDisplayMode();

                            conferenceViewModelConferenceDisplayModeJavaLangObjectNull = (conferenceViewModelConferenceDisplayMode) != (null);
                            if (conferenceViewModelConferenceDisplayModeJavaLangObjectNull) {


                                conferenceViewModelConferenceDisplayModeGetValue = conferenceViewModelConferenceDisplayMode.getValue();



                                conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = (conferenceViewModelConferenceDisplayModeGetValue) != (org.linphone.activities.voip.ConferenceDisplayMode.AUDIO_ONLY);

                                conferenceViewModelConferenceExistsBooleanTrueConferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY;
                                if (conferenceViewModelConferenceExistsBooleanTrueConferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY) {



                                    controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                                    if (controlsViewModelJavaLangObjectNull) {


                                        controlsViewModel.toggleVideo();
                                    }
                                }
                                else {




                                    conferenceViewModel.switchLayoutFromAudioOnlyToActiveSpeaker();
                                }
                            }
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


                    controlsViewModel.hangUp();
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


                    controlsViewModel.showExtraButtons();
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


                    callsViewModel.toggleMuteMicrophone();
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


                    controlsViewModel.toggleSpeaker();
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


                    controlsViewModel.toggleRoutesMenu();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.isSendingVideo
        flag 1 (0x2L): controlsViewModel.audioRoutesEnabled
        flag 2 (0x3L): controlsViewModel.bouncyCounterTranslateY
        flag 3 (0x4L): controlsViewModel.audioRoutesSelected
        flag 4 (0x5L): controlsViewModel.isVideoAvailable
        flag 5 (0x6L): controlsViewModel.isVideoEnabled
        flag 6 (0x7L): controlsViewModel.isSpeakerSelected
        flag 7 (0x8L): callsViewModel.isMuteMicrophoneEnabled
        flag 8 (0x9L): controlsViewModel.isVideoUpdateInProgress
        flag 9 (0xaL): conferenceViewModel.isMeListenerOnly
        flag 10 (0xbL): callsViewModel.isMicrophoneMuted
        flag 11 (0xcL): callsViewModel.chatAndCallsCount
        flag 12 (0xdL): callsViewModel
        flag 13 (0xeL): conferenceViewModel
        flag 14 (0xfL): controlsViewModel
        flag 15 (0x10L): null
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.chatAndCallsCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.chatAndCallsCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue()) : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue()) : false
        flag 20 (0x15L): controlsViewModel.hideVideo ? View.GONE : View.VISIBLE
        flag 21 (0x16L): controlsViewModel.hideVideo ? View.GONE : View.VISIBLE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue())
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue())
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? @android:string/content_description_disable_video : @android:string/content_description_enable_video
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? @android:string/content_description_disable_video : @android:string/content_description_enable_video
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue()) ? @android:string/content_description_disable_speaker : @android:string/content_description_enable_speaker
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue()) ? @android:string/content_description_disable_speaker : @android:string/content_description_enable_speaker
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.GONE : View.VISIBLE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.GONE : View.VISIBLE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue()) ? @android:string/content_description_disable_mic_mute : @android:string/content_description_enable_mic_mute
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue()) ? @android:string/content_description_disable_mic_mute : @android:string/content_description_enable_mic_mute
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) : false
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) : false
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMuteMicrophoneEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) : false
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMuteMicrophoneEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) : false
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) : false
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSendingVideo.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isMeListenerOnly.getValue()) : false
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isVideoUpdateInProgress.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}