package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipButtonsExtraBindingImpl extends VoipButtonsExtraBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    @Nullable
    private final android.view.View.OnClickListener mCallback25;
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipButtonsExtraBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private VoipButtonsExtraBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ProgressBar) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[4]
            );
        this.addCall.setTag(null);
        this.callStats.setTag(null);
        this.calls.setTag(null);
        this.chat.setTag(null);
        this.chatRoomCreationProgress.setTag(null);
        this.conferenceLayout.setTag(null);
        this.conferenceParticipants.setTag(null);
        this.extraButtonsLayout.setTag(null);
        this.numpad.setTag(null);
        this.pausedCallsCount.setTag(null);
        this.transferCall.setTag(null);
        this.unreadChatCount.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new org.linphone.generated.callback.OnClickListener(this, 7);
        mCallback23 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback28 = new org.linphone.generated.callback.OnClickListener(this, 8);
        mCallback24 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback25 = new org.linphone.generated.callback.OnClickListener(this, 5);
        mCallback21 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback26 = new org.linphone.generated.callback.OnClickListener(this, 6);
        mCallback22 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.callsViewModel);
        super.requestRebind();
    }
    public void setConferenceViewModel(@Nullable org.linphone.activities.voip.viewmodels.ConferenceViewModel ConferenceViewModel) {
        this.mConferenceViewModel = ConferenceViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.conferenceViewModel);
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
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelAttendedTransfer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeConferenceViewModelIsBroadcast((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeControlsViewModelBouncyCounterTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 3 :
                return onChangeCallsViewModelCurrentCallUnreadChatMessageCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeConferenceViewModelIsVideoConference((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeConferenceViewModelConferenceExists((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeCallsViewModelInactiveCallsCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 7 :
                return onChangeControlsViewModelChatDisabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeControlsViewModelChatRoomCreationInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeConferenceViewModelConferenceDisplayMode((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControlsViewModelAttendedTransfer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelAttendedTransfer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsBroadcast(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsBroadcast, int fieldId) {
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
    private boolean onChangeCallsViewModelCurrentCallUnreadChatMessageCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> CallsViewModelCurrentCallUnreadChatMessageCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsVideoConference(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsVideoConference, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceExists(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelConferenceExists, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelInactiveCallsCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> CallsViewModelInactiveCallsCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelChatDisabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelChatDisabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelChatRoomCreationInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelChatRoomCreationInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceDisplayMode(androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> ConferenceViewModelConferenceDisplayMode, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatDisabledGetValue = false;
        boolean callsViewModelCurrentCallUnreadChatMessageCountInt0BooleanTrueControlsViewModelChatDisabled = false;
        int callsViewModelCurrentCallUnreadChatMessageCountInt0BooleanTrueControlsViewModelChatDisabledViewGONEViewVISIBLE = 0;
        org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;
        java.lang.Boolean conferenceViewModelConferenceExistsGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallUnreadChatMessageCountGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcast = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelAttendedTransfer = null;
        int conferenceViewModelConferenceExistsViewVISIBLEViewGONE = 0;
        int callsViewModelInactiveCallsCountInt0ViewGONEViewVISIBLE = 0;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = false;
        java.lang.String stringValueOfCallsViewModelCurrentCallUnreadChatMessageCount = null;
        boolean callsViewModelInactiveCallsCountInt0 = false;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER = false;
        int controlsViewModelChatRoomCreationInProgressViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsBroadcast = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatRoomCreationInProgressGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Float> controlsViewModelBouncyCounterTranslateY = null;
        java.lang.Boolean conferenceViewModelIsBroadcastGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxCallsViewModelInactiveCallsCountGetValue = 0;
        int controlsViewModelChatDisabledViewINVISIBLEViewVISIBLE = 0;
        android.graphics.drawable.Drawable conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceLayoutAndroidDrawableIconConferenceLayoutAudioOnlyConferenceLayoutAndroidDrawableIconConferenceLayoutGrid = null;
        java.lang.Integer callsViewModelCurrentCallUnreadChatMessageCountGetValue = null;
        java.lang.String controlsViewModelAttendedTransferTransferCallAndroidStringCallActionAttendedTransferCallTransferCallAndroidStringCallActionTransferCall = null;
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        java.lang.Boolean conferenceViewModelIsVideoConferenceGetValue = null;
        java.lang.Boolean controlsViewModelChatRoomCreationInProgressGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsVideoConferenceGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcastGetValue = false;
        java.lang.Boolean controlsViewModelAttendedTransferGetValue = null;
        boolean callsViewModelCurrentCallUnreadChatMessageCountInt0 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> callsViewModelCurrentCallUnreadChatMessageCount = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAttendedTransferGetValue = false;
        java.lang.Boolean controlsViewModelChatDisabledGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsVideoConference = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelConferenceExists = null;
        int conferenceViewModelConferenceExistsViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> callsViewModelInactiveCallsCount = null;
        float androidxDatabindingViewDataBindingSafeUnboxControlsViewModelBouncyCounterTranslateYGetValue = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelChatDisabled = null;
        java.lang.Integer callsViewModelInactiveCallsCountGetValue = null;
        android.graphics.drawable.Drawable conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceLayoutAndroidDrawableIconConferenceLayoutActiveSpeakerConferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceLayoutAndroidDrawableIconConferenceLayoutAudioOnlyConferenceLayoutAndroidDrawableIconConferenceLayoutGrid = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelChatRoomCreationInProgress = null;
        org.linphone.activities.voip.ConferenceDisplayMode conferenceViewModelConferenceDisplayModeGetValue = null;
        boolean ConferenceViewModelIsBroadcast1 = false;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        java.lang.Float controlsViewModelBouncyCounterTranslateYGetValue = null;
        java.lang.String stringValueOfCallsViewModelInactiveCallsCount = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> conferenceViewModelConferenceDisplayMode = null;

        if ((dirtyFlags & 0x34c8L) != 0) {


            if ((dirtyFlags & 0x3488L) != 0) {

                    if (callsViewModel != null) {
                        // read callsViewModel.currentCallUnreadChatMessageCount
                        callsViewModelCurrentCallUnreadChatMessageCount = callsViewModel.getCurrentCallUnreadChatMessageCount();
                    }
                    updateLiveDataRegistration(3, callsViewModelCurrentCallUnreadChatMessageCount);


                    if (callsViewModelCurrentCallUnreadChatMessageCount != null) {
                        // read callsViewModel.currentCallUnreadChatMessageCount.getValue()
                        callsViewModelCurrentCallUnreadChatMessageCountGetValue = callsViewModelCurrentCallUnreadChatMessageCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallUnreadChatMessageCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallUnreadChatMessageCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallUnreadChatMessageCountGetValue);

                if ((dirtyFlags & 0x2408L) != 0) {

                        // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallUnreadChatMessageCount.getValue()))
                        stringValueOfCallsViewModelCurrentCallUnreadChatMessageCount = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallUnreadChatMessageCountGetValue);
                }

                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallUnreadChatMessageCount.getValue()) == 0
                    callsViewModelCurrentCallUnreadChatMessageCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallUnreadChatMessageCountGetValue) == (0);
                if((dirtyFlags & 0x3488L) != 0) {
                    if(callsViewModelCurrentCallUnreadChatMessageCountInt0) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
            }
            if ((dirtyFlags & 0x2440L) != 0) {

                    if (callsViewModel != null) {
                        // read callsViewModel.inactiveCallsCount
                        callsViewModelInactiveCallsCount = callsViewModel.getInactiveCallsCount();
                    }
                    updateLiveDataRegistration(6, callsViewModelInactiveCallsCount);


                    if (callsViewModelInactiveCallsCount != null) {
                        // read callsViewModel.inactiveCallsCount.getValue()
                        callsViewModelInactiveCallsCountGetValue = callsViewModelInactiveCallsCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.inactiveCallsCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelInactiveCallsCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelInactiveCallsCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.inactiveCallsCount.getValue()) == 0
                    callsViewModelInactiveCallsCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxCallsViewModelInactiveCallsCountGetValue) == (0);
                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.inactiveCallsCount.getValue()))
                    stringValueOfCallsViewModelInactiveCallsCount = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelInactiveCallsCountGetValue);
                if((dirtyFlags & 0x2440L) != 0) {
                    if(callsViewModelInactiveCallsCountInt0) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.inactiveCallsCount.getValue()) == 0 ? View.GONE : View.VISIBLE
                    callsViewModelInactiveCallsCountInt0ViewGONEViewVISIBLE = ((callsViewModelInactiveCallsCountInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0x2a32L) != 0) {


            if ((dirtyFlags & 0x2802L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isBroadcast
                        conferenceViewModelIsBroadcast = conferenceViewModel.isBroadcast();
                    }
                    updateLiveDataRegistration(1, conferenceViewModelIsBroadcast);


                    if (conferenceViewModelIsBroadcast != null) {
                        // read conferenceViewModel.isBroadcast.getValue()
                        conferenceViewModelIsBroadcastGetValue = conferenceViewModelIsBroadcast.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isBroadcast.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcastGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsBroadcastGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isBroadcast.getValue())
                    ConferenceViewModelIsBroadcast1 = !androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcastGetValue;


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isBroadcast.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcast = androidx.databinding.ViewDataBinding.safeUnbox(ConferenceViewModelIsBroadcast1);
            }
            if ((dirtyFlags & 0x2810L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isVideoConference
                        conferenceViewModelIsVideoConference = conferenceViewModel.isVideoConference();
                    }
                    updateLiveDataRegistration(4, conferenceViewModelIsVideoConference);


                    if (conferenceViewModelIsVideoConference != null) {
                        // read conferenceViewModel.isVideoConference.getValue()
                        conferenceViewModelIsVideoConferenceGetValue = conferenceViewModelIsVideoConference.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isVideoConference.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsVideoConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsVideoConferenceGetValue);
            }
            if ((dirtyFlags & 0x2820L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceExists
                        conferenceViewModelConferenceExists = conferenceViewModel.getConferenceExists();
                    }
                    updateLiveDataRegistration(5, conferenceViewModelConferenceExists);


                    if (conferenceViewModelConferenceExists != null) {
                        // read conferenceViewModel.conferenceExists.getValue()
                        conferenceViewModelConferenceExistsGetValue = conferenceViewModelConferenceExists.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelConferenceExistsGetValue);
                if((dirtyFlags & 0x2820L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.VISIBLE : View.GONE
                    conferenceViewModelConferenceExistsViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.GONE : View.VISIBLE
                    conferenceViewModelConferenceExistsViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x2a00L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceDisplayMode
                        conferenceViewModelConferenceDisplayMode = conferenceViewModel.getConferenceDisplayMode();
                    }
                    updateLiveDataRegistration(9, conferenceViewModelConferenceDisplayMode);


                    if (conferenceViewModelConferenceDisplayMode != null) {
                        // read conferenceViewModel.conferenceDisplayMode.getValue()
                        conferenceViewModelConferenceDisplayModeGetValue = conferenceViewModelConferenceDisplayMode.getValue();
                    }


                    // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER
                    conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER = (conferenceViewModelConferenceDisplayModeGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.ACTIVE_SPEAKER);
                if((dirtyFlags & 0x2a00L) != 0) {
                    if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x3185L) != 0) {


            if ((dirtyFlags & 0x3001L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.attendedTransfer
                        controlsViewModelAttendedTransfer = controlsViewModel.getAttendedTransfer();
                    }
                    updateLiveDataRegistration(0, controlsViewModelAttendedTransfer);


                    if (controlsViewModelAttendedTransfer != null) {
                        // read controlsViewModel.attendedTransfer.getValue()
                        controlsViewModelAttendedTransferGetValue = controlsViewModelAttendedTransfer.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.attendedTransfer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAttendedTransferGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelAttendedTransferGetValue);
                if((dirtyFlags & 0x3001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAttendedTransferGetValue) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.attendedTransfer.getValue()) ? @android:string/call_action_attended_transfer_call : @android:string/call_action_transfer_call
                    controlsViewModelAttendedTransferTransferCallAndroidStringCallActionAttendedTransferCallTransferCallAndroidStringCallActionTransferCall = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAttendedTransferGetValue) ? (transferCall.getResources().getString(R.string.call_action_attended_transfer_call)) : (transferCall.getResources().getString(R.string.call_action_transfer_call)));
            }
            if ((dirtyFlags & 0x3004L) != 0) {

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
            if ((dirtyFlags & 0x3080L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.chatDisabled
                        controlsViewModelChatDisabled = controlsViewModel.getChatDisabled();
                    }
                    updateLiveDataRegistration(7, controlsViewModelChatDisabled);


                    if (controlsViewModelChatDisabled != null) {
                        // read controlsViewModel.chatDisabled.getValue()
                        controlsViewModelChatDisabledGetValue = controlsViewModelChatDisabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatDisabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelChatDisabledGetValue);
                if((dirtyFlags & 0x3080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatDisabledGetValue) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue()) ? View.INVISIBLE : View.VISIBLE
                    controlsViewModelChatDisabledViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatDisabledGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x3100L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.chatRoomCreationInProgress
                        controlsViewModelChatRoomCreationInProgress = controlsViewModel.getChatRoomCreationInProgress();
                    }
                    updateLiveDataRegistration(8, controlsViewModelChatRoomCreationInProgress);


                    if (controlsViewModelChatRoomCreationInProgress != null) {
                        // read controlsViewModel.chatRoomCreationInProgress.getValue()
                        controlsViewModelChatRoomCreationInProgressGetValue = controlsViewModelChatRoomCreationInProgress.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatRoomCreationInProgress.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatRoomCreationInProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelChatRoomCreationInProgressGetValue);
                if((dirtyFlags & 0x3100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatRoomCreationInProgressGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatRoomCreationInProgress.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelChatRoomCreationInProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatRoomCreationInProgressGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000000L) != 0) {

                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = (conferenceViewModelConferenceDisplayModeGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.AUDIO_ONLY);
            if((dirtyFlags & 0x100000000L) != 0) {
                if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceLayoutAndroidDrawableIconConferenceLayoutAudioOnlyConferenceLayoutAndroidDrawableIconConferenceLayoutGrid = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(conferenceLayout.getContext(), R.drawable.icon_conference_layout_audio_only)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(conferenceLayout.getContext(), R.drawable.icon_conference_layout_grid)));
        }
        if ((dirtyFlags & 0x4000L) != 0) {



                if (controlsViewModel != null) {
                    // read controlsViewModel.chatDisabled
                    controlsViewModelChatDisabled = controlsViewModel.getChatDisabled();
                }
                updateLiveDataRegistration(7, controlsViewModelChatDisabled);


                if (controlsViewModelChatDisabled != null) {
                    // read controlsViewModel.chatDisabled.getValue()
                    controlsViewModelChatDisabledGetValue = controlsViewModelChatDisabled.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatDisabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelChatDisabledGetValue);
            if((dirtyFlags & 0x3080L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatDisabledGetValue) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }
        }

        if ((dirtyFlags & 0x3488L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallUnreadChatMessageCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue())
                callsViewModelCurrentCallUnreadChatMessageCountInt0BooleanTrueControlsViewModelChatDisabled = ((callsViewModelCurrentCallUnreadChatMessageCountInt0) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelChatDisabledGetValue));
            if((dirtyFlags & 0x3488L) != 0) {
                if(callsViewModelCurrentCallUnreadChatMessageCountInt0BooleanTrueControlsViewModelChatDisabled) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallUnreadChatMessageCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue()) ? View.GONE : View.VISIBLE
                callsViewModelCurrentCallUnreadChatMessageCountInt0BooleanTrueControlsViewModelChatDisabledViewGONEViewVISIBLE = ((callsViewModelCurrentCallUnreadChatMessageCountInt0BooleanTrueControlsViewModelChatDisabled) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x2a00L) != 0) {

                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? @android:drawable/icon_conference_layout_active_speaker : conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceLayoutAndroidDrawableIconConferenceLayoutActiveSpeakerConferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceLayoutAndroidDrawableIconConferenceLayoutAudioOnlyConferenceLayoutAndroidDrawableIconConferenceLayoutGrid = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(conferenceLayout.getContext(), R.drawable.icon_conference_layout_active_speaker)) : (conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceLayoutAndroidDrawableIconConferenceLayoutAudioOnlyConferenceLayoutAndroidDrawableIconConferenceLayoutGrid));
        }
        // batch finished
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.addCall.setOnClickListener(mCallback26);
            this.callStats.setOnClickListener(mCallback22);
            this.calls.setOnClickListener(mCallback28);
            this.chat.setOnClickListener(mCallback23);
            this.conferenceLayout.setOnClickListener(mCallback27);
            this.conferenceParticipants.setOnClickListener(mCallback25);
            this.numpad.setOnClickListener(mCallback21);
            this.transferCall.setOnClickListener(mCallback24);
        }
        if ((dirtyFlags & 0x2820L) != 0) {
            // api target 1

            this.addCall.setVisibility(conferenceViewModelConferenceExistsViewGONEViewVISIBLE);
            this.conferenceLayout.setVisibility(conferenceViewModelConferenceExistsViewVISIBLEViewGONE);
            this.conferenceParticipants.setVisibility(conferenceViewModelConferenceExistsViewVISIBLEViewGONE);
            this.transferCall.setVisibility(conferenceViewModelConferenceExistsViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x2802L) != 0) {
            // api target 1

            this.calls.setEnabled(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcast);
            this.numpad.setEnabled(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsBroadcast);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            this.chat.setVisibility(controlsViewModelChatDisabledViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x3100L) != 0) {
            // api target 1

            this.chatRoomCreationProgress.setVisibility(controlsViewModelChatRoomCreationInProgressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2a00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableTop(this.conferenceLayout, conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceLayoutAndroidDrawableIconConferenceLayoutActiveSpeakerConferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceLayoutAndroidDrawableIconConferenceLayoutAudioOnlyConferenceLayoutAndroidDrawableIconConferenceLayoutGrid);
        }
        if ((dirtyFlags & 0x2810L) != 0) {
            // api target 1

            this.conferenceLayout.setEnabled(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsVideoConferenceGetValue);
        }
        if ((dirtyFlags & 0x2440L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pausedCallsCount, stringValueOfCallsViewModelInactiveCallsCount);
            this.pausedCallsCount.setVisibility(callsViewModelInactiveCallsCountInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.pausedCallsCount.setTranslationY(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelBouncyCounterTranslateYGetValue);
                this.unreadChatCount.setTranslationY(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelBouncyCounterTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.transferCall, controlsViewModelAttendedTransferTransferCallAndroidStringCallActionAttendedTransferCallTransferCallAndroidStringCallActionTransferCall);
        }
        if ((dirtyFlags & 0x2408L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unreadChatCount, stringValueOfCallsViewModelCurrentCallUnreadChatMessageCount);
        }
        if ((dirtyFlags & 0x3488L) != 0) {
            // api target 1

            this.unreadChatCount.setVisibility(callsViewModelCurrentCallUnreadChatMessageCountInt0BooleanTrueControlsViewModelChatDisabledViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 7: {
                // localize variables for thread safety
                // controlsViewModel
                org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
                // controlsViewModel != null
                boolean controlsViewModelJavaLangObjectNull = false;



                controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
                if (controlsViewModelJavaLangObjectNull) {


                    controlsViewModel.goToConferenceLayout();
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


                    controlsViewModel.goToChat();
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


                    controlsViewModel.goToCallsList();
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


                    controlsViewModel.transferCall();
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


                    controlsViewModel.goToConferenceParticipantsList();
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


                    controlsViewModel.showNumpad();
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


                    controlsViewModel.goToDialerForNewCall();
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



                    controlsViewModel.showCallStats(false);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.attendedTransfer
        flag 1 (0x2L): conferenceViewModel.isBroadcast
        flag 2 (0x3L): controlsViewModel.bouncyCounterTranslateY
        flag 3 (0x4L): callsViewModel.currentCallUnreadChatMessageCount
        flag 4 (0x5L): conferenceViewModel.isVideoConference
        flag 5 (0x6L): conferenceViewModel.conferenceExists
        flag 6 (0x7L): callsViewModel.inactiveCallsCount
        flag 7 (0x8L): controlsViewModel.chatDisabled
        flag 8 (0x9L): controlsViewModel.chatRoomCreationInProgress
        flag 9 (0xaL): conferenceViewModel.conferenceDisplayMode
        flag 10 (0xbL): callsViewModel
        flag 11 (0xcL): conferenceViewModel
        flag 12 (0xdL): controlsViewModel
        flag 13 (0xeL): null
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallUnreadChatMessageCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue())
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallUnreadChatMessageCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue())
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallUnreadChatMessageCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue()) ? View.GONE : View.VISIBLE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallUnreadChatMessageCount.getValue()) == 0 ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue()) ? View.GONE : View.VISIBLE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.inactiveCallsCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.inactiveCallsCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatRoomCreationInProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatRoomCreationInProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.chatDisabled.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 26 (0x1bL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
        flag 27 (0x1cL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.attendedTransfer.getValue()) ? @android:string/call_action_attended_transfer_call : @android:string/call_action_transfer_call
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.attendedTransfer.getValue()) ? @android:string/call_action_attended_transfer_call : @android:string/call_action_transfer_call
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.GONE : View.VISIBLE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) ? View.GONE : View.VISIBLE
        flag 32 (0x21L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? @android:drawable/icon_conference_layout_active_speaker : conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
        flag 33 (0x22L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? @android:drawable/icon_conference_layout_active_speaker : conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
    flag mapping end*/
    //end
}