package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipButtonsOutgoingBindingImpl extends VoipButtonsOutgoingBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback176;
    @Nullable
    private final android.view.View.OnClickListener mCallback174;
    @Nullable
    private final android.view.View.OnClickListener mCallback175;
    @Nullable
    private final android.view.View.OnClickListener mCallback173;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipButtonsOutgoingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private VoipButtonsOutgoingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[3]
            );
        this.hangup.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.microphone.setTag(null);
        this.numpad.setTag(null);
        this.speaker.setTag(null);
        setRootTag(root);
        // listeners
        mCallback176 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback174 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback175 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback173 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.callsViewModel);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelIsSpeakerSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeCallsViewModelIsMuteMicrophoneEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeControlsViewModelIsOutgoingEarlyMedia((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeCallsViewModelIsMicrophoneMuted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsSpeakerSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsSpeakerSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelIsMuteMicrophoneEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelIsMuteMicrophoneEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsOutgoingEarlyMedia(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsOutgoingEarlyMedia, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelIsMicrophoneMuted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> CallsViewModelIsMicrophoneMuted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMuteMicrophoneEnabledGetValue = false;
        org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSpeakerSelected = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> callsViewModelIsMuteMicrophoneEnabled = null;
        java.lang.Boolean callsViewModelIsMicrophoneMutedGetValue = null;
        int controlsViewModelIsOutgoingEarlyMediaViewVISIBLEViewGONE = 0;
        java.lang.Boolean callsViewModelIsMuteMicrophoneEnabledGetValue = null;
        java.lang.Boolean controlsViewModelIsSpeakerSelectedGetValue = null;
        java.lang.String controlsViewModelIsSpeakerSelectedSpeakerAndroidStringContentDescriptionDisableSpeakerSpeakerAndroidStringContentDescriptionEnableSpeaker = null;
        java.lang.Boolean controlsViewModelIsOutgoingEarlyMediaGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsOutgoingEarlyMedia = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> callsViewModelIsMicrophoneMuted = null;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        java.lang.String callsViewModelIsMicrophoneMutedMicrophoneAndroidStringContentDescriptionDisableMicMuteMicrophoneAndroidStringContentDescriptionEnableMicMute = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsOutgoingEarlyMediaGetValue = false;

        if ((dirtyFlags & 0x5aL) != 0) {


            if ((dirtyFlags & 0x52L) != 0) {

                    if (callsViewModel != null) {
                        // read callsViewModel.isMuteMicrophoneEnabled
                        callsViewModelIsMuteMicrophoneEnabled = callsViewModel.isMuteMicrophoneEnabled();
                    }
                    updateLiveDataRegistration(1, callsViewModelIsMuteMicrophoneEnabled);


                    if (callsViewModelIsMuteMicrophoneEnabled != null) {
                        // read callsViewModel.isMuteMicrophoneEnabled.getValue()
                        callsViewModelIsMuteMicrophoneEnabledGetValue = callsViewModelIsMuteMicrophoneEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMuteMicrophoneEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMuteMicrophoneEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelIsMuteMicrophoneEnabledGetValue);
            }
            if ((dirtyFlags & 0x58L) != 0) {

                    if (callsViewModel != null) {
                        // read callsViewModel.isMicrophoneMuted
                        callsViewModelIsMicrophoneMuted = callsViewModel.isMicrophoneMuted();
                    }
                    updateLiveDataRegistration(3, callsViewModelIsMicrophoneMuted);


                    if (callsViewModelIsMicrophoneMuted != null) {
                        // read callsViewModel.isMicrophoneMuted.getValue()
                        callsViewModelIsMicrophoneMutedGetValue = callsViewModelIsMicrophoneMuted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelIsMicrophoneMutedGetValue);
                if((dirtyFlags & 0x58L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue()) ? @android:string/content_description_disable_mic_mute : @android:string/content_description_enable_mic_mute
                    callsViewModelIsMicrophoneMutedMicrophoneAndroidStringContentDescriptionDisableMicMuteMicrophoneAndroidStringContentDescriptionEnableMicMute = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue) ? (microphone.getResources().getString(R.string.content_description_disable_mic_mute)) : (microphone.getResources().getString(R.string.content_description_enable_mic_mute)));
            }
        }
        if ((dirtyFlags & 0x65L) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isSpeakerSelected
                        controlsViewModelIsSpeakerSelected = controlsViewModel.isSpeakerSelected();
                    }
                    updateLiveDataRegistration(0, controlsViewModelIsSpeakerSelected);


                    if (controlsViewModelIsSpeakerSelected != null) {
                        // read controlsViewModel.isSpeakerSelected.getValue()
                        controlsViewModelIsSpeakerSelectedGetValue = controlsViewModelIsSpeakerSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsSpeakerSelectedGetValue);
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue()) ? @android:string/content_description_disable_speaker : @android:string/content_description_enable_speaker
                    controlsViewModelIsSpeakerSelectedSpeakerAndroidStringContentDescriptionDisableSpeakerSpeakerAndroidStringContentDescriptionEnableSpeaker = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue) ? (speaker.getResources().getString(R.string.content_description_disable_speaker)) : (speaker.getResources().getString(R.string.content_description_enable_speaker)));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.isOutgoingEarlyMedia
                        controlsViewModelIsOutgoingEarlyMedia = controlsViewModel.isOutgoingEarlyMedia();
                    }
                    updateLiveDataRegistration(2, controlsViewModelIsOutgoingEarlyMedia);


                    if (controlsViewModelIsOutgoingEarlyMedia != null) {
                        // read controlsViewModel.isOutgoingEarlyMedia.getValue()
                        controlsViewModelIsOutgoingEarlyMediaGetValue = controlsViewModelIsOutgoingEarlyMedia.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isOutgoingEarlyMedia.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsOutgoingEarlyMediaGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsOutgoingEarlyMediaGetValue);
                if((dirtyFlags & 0x64L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsOutgoingEarlyMediaGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isOutgoingEarlyMedia.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelIsOutgoingEarlyMediaViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsOutgoingEarlyMediaGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.hangup.setOnClickListener(mCallback173);
            this.microphone.setOnClickListener(mCallback174);
            this.numpad.setOnClickListener(mCallback176);
            this.speaker.setOnClickListener(mCallback175);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.microphone.setContentDescription(callsViewModelIsMicrophoneMutedMicrophoneAndroidStringContentDescriptionDisableMicMuteMicrophoneAndroidStringContentDescriptionEnableMicMute);
            }
            // api target 1

            this.microphone.setSelected(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMicrophoneMutedGetValue);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.microphone.setEnabled(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelIsMuteMicrophoneEnabledGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.numpad.setVisibility(controlsViewModelIsOutgoingEarlyMediaViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.speaker.setContentDescription(controlsViewModelIsSpeakerSelectedSpeakerAndroidStringContentDescriptionDisableSpeakerSpeakerAndroidStringContentDescriptionEnableSpeaker);
            }
            // api target 1

            this.speaker.setSelected(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSpeakerSelectedGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {


                    controlsViewModel.showNumpad();
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.isSpeakerSelected
        flag 1 (0x2L): callsViewModel.isMuteMicrophoneEnabled
        flag 2 (0x3L): controlsViewModel.isOutgoingEarlyMedia
        flag 3 (0x4L): callsViewModel.isMicrophoneMuted
        flag 4 (0x5L): callsViewModel
        flag 5 (0x6L): controlsViewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isOutgoingEarlyMedia.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isOutgoingEarlyMedia.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue()) ? @android:string/content_description_disable_speaker : @android:string/content_description_enable_speaker
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSpeakerSelected.getValue()) ? @android:string/content_description_disable_speaker : @android:string/content_description_enable_speaker
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue()) ? @android:string/content_description_disable_mic_mute : @android:string/content_description_enable_mic_mute
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.isMicrophoneMuted.getValue()) ? @android:string/content_description_disable_mic_mute : @android:string/content_description_enable_mic_mute
    flag mapping end*/
    //end
}