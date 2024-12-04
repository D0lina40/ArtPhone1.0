package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipCallIncomingFragmentBindingImpl extends VoipCallIncomingFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(0, 
            new String[] {"voip_buttons_incoming"},
            new int[] {13},
            new int[] {org.linphone.R.layout.voip_buttons_incoming});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.remote_video_surface, 14);
        sViewsWithIds.put(R.id.progress, 15);
        sViewsWithIds.put(R.id.conference_avatar, 16);
        sViewsWithIds.put(R.id.participants_count, 17);
        sViewsWithIds.put(R.id.participants_list, 18);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipCallIncomingFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private VoipCallIncomingFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (android.widget.ImageView) bindings[4]
            , (org.linphone.databinding.VoipButtonsIncomingBinding) bindings[13]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[16]
            , (androidx.constraintlayout.widget.Group) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.Chronometer) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[17]
            , (androidx.core.widget.NestedScrollView) bindings[18]
            , (android.widget.ProgressBar) bindings[15]
            , (android.view.TextureView) bindings[14]
            , (androidx.constraintlayout.widget.Group) bindings[12]
            , (androidx.constraintlayout.widget.Group) bindings[10]
            );
        this.avatar.setTag(null);
        setContainedBinding(this.buttons);
        this.callerName.setTag(null);
        this.conferenceGroup.setTag(null);
        this.earlyMediaCallerName.setTag(null);
        this.earlyMediaSipAddress.setTag(null);
        this.incomingCallTimer.setTag(null);
        this.incomingCallTitle.setTag(null);
        this.incomingConferenceSubject.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.singleCallEarlyMediaGroup.setTag(null);
        this.singleCallGroup.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
        }
        buttons.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (buttons.hasPendingBindings()) {
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
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.callsViewModel);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        buttons.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCallsViewModelCurrentCallDataConferenceParticipants((androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceInfoParticipantData>>) object, fieldId);
            case 1 :
                return onChangeButtons((org.linphone.databinding.VoipButtonsIncomingBinding) object, fieldId);
            case 2 :
                return onChangeControlsViewModelIsIncomingEarlyMediaVideo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeCallsViewModelCurrentCallDataRemoteConferenceSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeCallsViewModelCurrentCallDataDisplayableAddress((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeCallsViewModelCurrentCallDataConferenceParticipantsCountLabel((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeCallsViewModelCurrentCallDataIsConferenceCall((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeCallsViewModelCurrentCallDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 8 :
                return onChangeCallsViewModelCurrentCallDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeCallsViewModelCurrentCallData((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataConferenceParticipants(androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceInfoParticipantData>> CallsViewModelCurrentCallDataConferenceParticipants, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeButtons(org.linphone.databinding.VoipButtonsIncomingBinding Buttons, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelIsIncomingEarlyMediaVideo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelIsIncomingEarlyMediaVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataRemoteConferenceSubject(androidx.lifecycle.MutableLiveData<java.lang.String> CallsViewModelCurrentCallDataRemoteConferenceSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataDisplayableAddress(androidx.lifecycle.MutableLiveData<java.lang.String> CallsViewModelCurrentCallDataDisplayableAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataConferenceParticipantsCountLabel(androidx.lifecycle.MutableLiveData<java.lang.String> CallsViewModelCurrentCallDataConferenceParticipantsCountLabel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataIsConferenceCall(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> CallsViewModelCurrentCallDataIsConferenceCall, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> CallsViewModelCurrentCallDataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> CallsViewModelCurrentCallDataDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallData(androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> CallsViewModelCurrentCallData, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.voip.data.ConferenceInfoParticipantData>> callsViewModelCurrentCallDataConferenceParticipants = null;
        java.lang.String callsViewModelCurrentCallDataContactName = null;
        java.lang.String callsViewModelCurrentCallDataRemoteConferenceSubjectGetValue = null;
        java.lang.Boolean callsViewModelCurrentCallDataIsConferenceCallGetValue = null;
        int callsViewModelCurrentCallDataIsConferenceCallBooleanTrueControlsViewModelIsIncomingEarlyMediaVideoViewGONEViewVISIBLE = 0;
        org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;
        java.lang.Boolean controlsViewModelIsIncomingEarlyMediaVideoGetValue = null;
        boolean callsViewModelCurrentCallDataContactNameJavaLangObjectNull = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsIncomingEarlyMediaVideo = null;
        org.linphone.core.Friend callsViewModelCurrentCallDataContactGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> callsViewModelCurrentCallDataRemoteConferenceSubject = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> callsViewModelCurrentCallDataDisplayableAddress = null;
        int controlsViewModelIsIncomingEarlyMediaVideoViewVISIBLEViewGONE = 0;
        java.lang.String callsViewModelCurrentCallDataDisplayNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> callsViewModelCurrentCallDataConferenceParticipantsCountLabel = null;
        java.lang.String callsViewModelCurrentCallDataDisplayableAddressGetValue = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> callsViewModelCurrentCallDataIsConferenceCall = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> callsViewModelCurrentCallDataContact = null;
        java.lang.String callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> callsViewModelCurrentCallDataDisplayName = null;
        boolean callsViewModelCurrentCallDataIsConferenceCallBooleanTrueControlsViewModelIsIncomingEarlyMediaVideo = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsIncomingEarlyMediaVideoGetValue = false;
        java.lang.String callsViewModelCurrentCallDataConferenceParticipantsCountLabelGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> callsViewModelCurrentCallData = null;
        java.lang.String callsViewModelCurrentCallDataIsConferenceCallIncomingCallTitleAndroidStringConferenceIncomingTitleIncomingCallTitleAndroidStringCallIncomingTitle = null;
        int callsViewModelCurrentCallDataIsConferenceCallViewGONEViewVISIBLE = 0;
        int callsViewModelCurrentCallDataIsConferenceCallViewVISIBLEViewGONE = 0;
        org.linphone.activities.voip.data.CallData callsViewModelCurrentCallDataGetValue = null;
        java.util.List<org.linphone.activities.voip.data.ConferenceInfoParticipantData> callsViewModelCurrentCallDataConferenceParticipantsGetValue = null;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;

        if ((dirtyFlags & 0x1ffdL) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.currentCallData
                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();
                }
                updateLiveDataRegistration(9, callsViewModelCurrentCallData);


                if (callsViewModelCurrentCallData != null) {
                    // read callsViewModel.currentCallData.getValue()
                    callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();
                }

            if ((dirtyFlags & 0x1601L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().conferenceParticipants
                        callsViewModelCurrentCallDataConferenceParticipants = callsViewModelCurrentCallDataGetValue.getConferenceParticipants();
                    }
                    updateLiveDataRegistration(0, callsViewModelCurrentCallDataConferenceParticipants);


                    if (callsViewModelCurrentCallDataConferenceParticipants != null) {
                        // read callsViewModel.currentCallData.getValue().conferenceParticipants.getValue()
                        callsViewModelCurrentCallDataConferenceParticipantsGetValue = callsViewModelCurrentCallDataConferenceParticipants.getValue();
                    }
            }
            if ((dirtyFlags & 0x1608L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().remoteConferenceSubject
                        callsViewModelCurrentCallDataRemoteConferenceSubject = callsViewModelCurrentCallDataGetValue.getRemoteConferenceSubject();
                    }
                    updateLiveDataRegistration(3, callsViewModelCurrentCallDataRemoteConferenceSubject);


                    if (callsViewModelCurrentCallDataRemoteConferenceSubject != null) {
                        // read callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue()
                        callsViewModelCurrentCallDataRemoteConferenceSubjectGetValue = callsViewModelCurrentCallDataRemoteConferenceSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x1610L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().displayableAddress
                        callsViewModelCurrentCallDataDisplayableAddress = callsViewModelCurrentCallDataGetValue.getDisplayableAddress();
                    }
                    updateLiveDataRegistration(4, callsViewModelCurrentCallDataDisplayableAddress);


                    if (callsViewModelCurrentCallDataDisplayableAddress != null) {
                        // read callsViewModel.currentCallData.getValue().displayableAddress.getValue()
                        callsViewModelCurrentCallDataDisplayableAddressGetValue = callsViewModelCurrentCallDataDisplayableAddress.getValue();
                    }
            }
            if ((dirtyFlags & 0x1620L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().conferenceParticipantsCountLabel
                        callsViewModelCurrentCallDataConferenceParticipantsCountLabel = callsViewModelCurrentCallDataGetValue.getConferenceParticipantsCountLabel();
                    }
                    updateLiveDataRegistration(5, callsViewModelCurrentCallDataConferenceParticipantsCountLabel);


                    if (callsViewModelCurrentCallDataConferenceParticipantsCountLabel != null) {
                        // read callsViewModel.currentCallData.getValue().conferenceParticipantsCountLabel.getValue()
                        callsViewModelCurrentCallDataConferenceParticipantsCountLabelGetValue = callsViewModelCurrentCallDataConferenceParticipantsCountLabel.getValue();
                    }
            }
            if ((dirtyFlags & 0x1e44L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isConferenceCall
                        callsViewModelCurrentCallDataIsConferenceCall = callsViewModelCurrentCallDataGetValue.isConferenceCall();
                    }
                    updateLiveDataRegistration(6, callsViewModelCurrentCallDataIsConferenceCall);


                    if (callsViewModelCurrentCallDataIsConferenceCall != null) {
                        // read callsViewModel.currentCallData.getValue().isConferenceCall.getValue()
                        callsViewModelCurrentCallDataIsConferenceCallGetValue = callsViewModelCurrentCallDataIsConferenceCall.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsConferenceCallGetValue);
                if((dirtyFlags & 0x1e44L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x1640L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue) {
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x2000000L;
                    }
                }

                if ((dirtyFlags & 0x1640L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? @android:string/conference_incoming_title : @android:string/call_incoming_title
                        callsViewModelCurrentCallDataIsConferenceCallIncomingCallTitleAndroidStringConferenceIncomingTitleIncomingCallTitleAndroidStringCallIncomingTitle = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue) ? (incomingCallTitle.getResources().getString(R.string.conference_incoming_title)) : (incomingCallTitle.getResources().getString(R.string.call_incoming_title)));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.GONE : View.VISIBLE
                        callsViewModelCurrentCallDataIsConferenceCallViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.VISIBLE : View.GONE
                        callsViewModelCurrentCallDataIsConferenceCallViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x1780L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().contact
                        callsViewModelCurrentCallDataContact = callsViewModelCurrentCallDataGetValue.getContact();
                    }
                    updateLiveDataRegistration(7, callsViewModelCurrentCallDataContact);


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
                if((dirtyFlags & 0x1780L) != 0) {
                    if(callsViewModelCurrentCallDataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x1804L) != 0) {



                if (controlsViewModel != null) {
                    // read controlsViewModel.isIncomingEarlyMediaVideo
                    controlsViewModelIsIncomingEarlyMediaVideo = controlsViewModel.isIncomingEarlyMediaVideo();
                }
                updateLiveDataRegistration(2, controlsViewModelIsIncomingEarlyMediaVideo);


                if (controlsViewModelIsIncomingEarlyMediaVideo != null) {
                    // read controlsViewModel.isIncomingEarlyMediaVideo.getValue()
                    controlsViewModelIsIncomingEarlyMediaVideoGetValue = controlsViewModelIsIncomingEarlyMediaVideo.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsIncomingEarlyMediaVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsIncomingEarlyMediaVideoGetValue);
            if((dirtyFlags & 0x1804L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsIncomingEarlyMediaVideoGetValue) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue()) ? View.VISIBLE : View.GONE
                controlsViewModelIsIncomingEarlyMediaVideoViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsIncomingEarlyMediaVideoGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x40000L) != 0) {

                if (callsViewModelCurrentCallDataGetValue != null) {
                    // read callsViewModel.currentCallData.getValue().displayName
                    callsViewModelCurrentCallDataDisplayName = callsViewModelCurrentCallDataGetValue.getDisplayName();
                }
                updateLiveDataRegistration(8, callsViewModelCurrentCallDataDisplayName);


                if (callsViewModelCurrentCallDataDisplayName != null) {
                    // read callsViewModel.currentCallData.getValue().displayName.getValue()
                    callsViewModelCurrentCallDataDisplayNameGetValue = callsViewModelCurrentCallDataDisplayName.getValue();
                }
        }
        if ((dirtyFlags & 0x80000L) != 0) {



                if (controlsViewModel != null) {
                    // read controlsViewModel.isIncomingEarlyMediaVideo
                    controlsViewModelIsIncomingEarlyMediaVideo = controlsViewModel.isIncomingEarlyMediaVideo();
                }
                updateLiveDataRegistration(2, controlsViewModelIsIncomingEarlyMediaVideo);


                if (controlsViewModelIsIncomingEarlyMediaVideo != null) {
                    // read controlsViewModel.isIncomingEarlyMediaVideo.getValue()
                    controlsViewModelIsIncomingEarlyMediaVideoGetValue = controlsViewModelIsIncomingEarlyMediaVideo.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsIncomingEarlyMediaVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelIsIncomingEarlyMediaVideoGetValue);
            if((dirtyFlags & 0x1804L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsIncomingEarlyMediaVideoGetValue) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
        }

        if ((dirtyFlags & 0x1780L) != 0) {

                // read callsViewModel.currentCallData.getValue().contact.getValue().name == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().contact.getValue().name
                callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactName = ((callsViewModelCurrentCallDataContactNameJavaLangObjectNull) ? (callsViewModelCurrentCallDataDisplayNameGetValue) : (callsViewModelCurrentCallDataContactName));
        }
        if ((dirtyFlags & 0x1e44L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue())
                callsViewModelCurrentCallDataIsConferenceCallBooleanTrueControlsViewModelIsIncomingEarlyMediaVideo = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsIncomingEarlyMediaVideoGetValue));
            if((dirtyFlags & 0x1e44L) != 0) {
                if(callsViewModelCurrentCallDataIsConferenceCallBooleanTrueControlsViewModelIsIncomingEarlyMediaVideo) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue()) ? View.GONE : View.VISIBLE
                callsViewModelCurrentCallDataIsConferenceCallBooleanTrueControlsViewModelIsIncomingEarlyMediaVideoViewGONEViewVISIBLE = ((callsViewModelCurrentCallDataIsConferenceCallBooleanTrueControlsViewModelIsIncomingEarlyMediaVideo) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x1600L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadVoipContactPictureWithCoilAlt(this.avatar, callsViewModelCurrentCallDataGetValue);
        }
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            this.buttons.setViewModel(controlsViewModel);
        }
        if ((dirtyFlags & 0x1780L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.callerName, callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.earlyMediaCallerName, callsViewModelCurrentCallDataContactNameJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataContactName);
        }
        if ((dirtyFlags & 0x1640L) != 0) {
            // api target 1

            this.conferenceGroup.setVisibility(callsViewModelCurrentCallDataIsConferenceCallViewVISIBLEViewGONE);
            this.incomingCallTimer.setVisibility(callsViewModelCurrentCallDataIsConferenceCallViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.incomingCallTitle, callsViewModelCurrentCallDataIsConferenceCallIncomingCallTitleAndroidStringConferenceIncomingTitleIncomingCallTitleAndroidStringCallIncomingTitle);
        }
        if ((dirtyFlags & 0x1610L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.earlyMediaSipAddress, callsViewModelCurrentCallDataDisplayableAddressGetValue);
        }
        if ((dirtyFlags & 0x1608L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.incomingConferenceSubject, callsViewModelCurrentCallDataRemoteConferenceSubjectGetValue);
        }
        if ((dirtyFlags & 0x1620L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, callsViewModelCurrentCallDataConferenceParticipantsCountLabelGetValue);
        }
        if ((dirtyFlags & 0x1601L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView7, callsViewModelCurrentCallDataConferenceParticipantsGetValue, R.layout.voip_conference_incoming_participant_cell);
        }
        if ((dirtyFlags & 0x1804L) != 0) {
            // api target 1

            this.singleCallEarlyMediaGroup.setVisibility(controlsViewModelIsIncomingEarlyMediaVideoViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1e44L) != 0) {
            // api target 1

            this.singleCallGroup.setVisibility(callsViewModelCurrentCallDataIsConferenceCallBooleanTrueControlsViewModelIsIncomingEarlyMediaVideoViewGONEViewVISIBLE);
        }
        executeBindingsOn(buttons);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): callsViewModel.currentCallData.getValue().conferenceParticipants
        flag 1 (0x2L): buttons
        flag 2 (0x3L): controlsViewModel.isIncomingEarlyMediaVideo
        flag 3 (0x4L): callsViewModel.currentCallData.getValue().remoteConferenceSubject
        flag 4 (0x5L): callsViewModel.currentCallData.getValue().displayableAddress
        flag 5 (0x6L): callsViewModel.currentCallData.getValue().conferenceParticipantsCountLabel
        flag 6 (0x7L): callsViewModel.currentCallData.getValue().isConferenceCall
        flag 7 (0x8L): callsViewModel.currentCallData.getValue().contact
        flag 8 (0x9L): callsViewModel.currentCallData.getValue().displayName
        flag 9 (0xaL): callsViewModel.currentCallData
        flag 10 (0xbL): callsViewModel
        flag 11 (0xcL): controlsViewModel
        flag 12 (0xdL): null
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue()) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue()) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): callsViewModel.currentCallData.getValue().contact.getValue().name == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().contact.getValue().name
        flag 18 (0x13L): callsViewModel.currentCallData.getValue().contact.getValue().name == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().contact.getValue().name
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue())
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isIncomingEarlyMediaVideo.getValue())
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? @android:string/conference_incoming_title : @android:string/call_incoming_title
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? @android:string/conference_incoming_title : @android:string/call_incoming_title
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.GONE : View.VISIBLE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}