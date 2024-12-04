package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipCallOutgoingFragmentBindingImpl extends VoipCallOutgoingFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"voip_buttons_outgoing"},
            new int[] {7},
            new int[] {org.linphone.R.layout.voip_buttons_outgoing});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.stub_numpad, 6);
        sViewsWithIds.put(R.id.progress, 8);
        sViewsWithIds.put(R.id.outgoing_call_title, 9);
        sViewsWithIds.put(R.id.outgoing_call_timer, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback95;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipCallOutgoingFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private VoipCallOutgoingFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (android.widget.ImageView) bindings[1]
            , (org.linphone.databinding.VoipButtonsOutgoingBinding) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[4]
            , (android.widget.Chronometer) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ProgressBar) bindings[8]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[6])
            , (android.widget.ImageView) bindings[5]
            );
        this.avatar.setTag(null);
        setContainedBinding(this.buttons);
        this.calleeName.setTag(null);
        this.conferenceAvatar.setTag(null);
        this.localPreviewVideoSurface.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.stubNumpad.setContainingBinding(this);
        this.switchCamera.setTag(null);
        setRootTag(root);
        // listeners
        mCallback95 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.callsViewModel);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
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
                return onChangeControlsViewModelPipMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeControlsViewModelIsSwitchCameraAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeButtons((org.linphone.databinding.VoipButtonsOutgoingBinding) object, fieldId);
            case 3 :
                return onChangeCallsViewModelCurrentCallDataRemoteConferenceSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeCallsViewModelCurrentCallDataIsConferenceCall((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeCallsViewModelCurrentCallDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 6 :
                return onChangeCallsViewModelCurrentCallDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeCallsViewModelCurrentCallData((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData>) object, fieldId);
            case 8 :
                return onChangeControlsViewModelNumpadVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeButtons(org.linphone.databinding.VoipButtonsOutgoingBinding Buttons, int fieldId) {
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
    private boolean onChangeCallsViewModelCurrentCallDataIsConferenceCall(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> CallsViewModelCurrentCallDataIsConferenceCall, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> CallsViewModelCurrentCallDataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallDataDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> CallsViewModelCurrentCallDataDisplayName, int fieldId) {
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
    private boolean onChangeControlsViewModelNumpadVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelNumpadVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        java.lang.String callsViewModelCurrentCallDataContactName = null;
        java.lang.String callsViewModelCurrentCallDataRemoteConferenceSubjectGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelIsSwitchCameraAvailable = null;
        java.lang.Boolean callsViewModelCurrentCallDataIsConferenceCallGetValue = null;
        org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;
        int controlsViewModelNumpadVisibleViewVISIBLEViewGONE = 0;
        org.linphone.core.Friend callsViewModelCurrentCallDataContactGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> callsViewModelCurrentCallDataRemoteConferenceSubject = null;
        java.lang.Boolean controlsViewModelIsSwitchCameraAvailableGetValue = null;
        boolean controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = false;
        java.lang.String callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubject = null;
        boolean ControlsViewModelPipMode1 = false;
        java.lang.String callsViewModelCurrentCallDataDisplayNameGetValue = null;
        java.lang.Boolean controlsViewModelPipModeGetValue = null;
        boolean callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNull = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue = false;
        java.lang.String callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubject = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> callsViewModelCurrentCallDataIsConferenceCall = null;
        int controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> callsViewModelCurrentCallDataContact = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> callsViewModelCurrentCallDataDisplayName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue = false;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> callsViewModelCurrentCallData = null;
        int callsViewModelCurrentCallDataIsConferenceCallViewGONEViewVISIBLE = 0;
        int callsViewModelCurrentCallDataIsConferenceCallViewVISIBLEViewGONE = 0;
        org.linphone.activities.voip.data.CallData callsViewModelCurrentCallDataGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelNumpadVisible = null;
        boolean callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNull = false;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = false;
        java.lang.Boolean controlsViewModelNumpadVisibleGetValue = null;

        if ((dirtyFlags & 0xaf8L) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.currentCallData
                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();
                }
                updateLiveDataRegistration(7, callsViewModelCurrentCallData);


                if (callsViewModelCurrentCallData != null) {
                    // read callsViewModel.currentCallData.getValue()
                    callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();
                }

            if ((dirtyFlags & 0xae8L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().remoteConferenceSubject
                        callsViewModelCurrentCallDataRemoteConferenceSubject = callsViewModelCurrentCallDataGetValue.getRemoteConferenceSubject();
                    }
                    updateLiveDataRegistration(3, callsViewModelCurrentCallDataRemoteConferenceSubject);


                    if (callsViewModelCurrentCallDataRemoteConferenceSubject != null) {
                        // read callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue()
                        callsViewModelCurrentCallDataRemoteConferenceSubjectGetValue = callsViewModelCurrentCallDataRemoteConferenceSubject.getValue();
                    }


                    // read callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null
                    callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNull = (callsViewModelCurrentCallDataRemoteConferenceSubjectGetValue) == (null);
                if((dirtyFlags & 0x10ae8L) != 0) {
                    if(callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNull) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
            }
            if ((dirtyFlags & 0xa90L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().isConferenceCall
                        callsViewModelCurrentCallDataIsConferenceCall = callsViewModelCurrentCallDataGetValue.isConferenceCall();
                    }
                    updateLiveDataRegistration(4, callsViewModelCurrentCallDataIsConferenceCall);


                    if (callsViewModelCurrentCallDataIsConferenceCall != null) {
                        // read callsViewModel.currentCallData.getValue().isConferenceCall.getValue()
                        callsViewModelCurrentCallDataIsConferenceCallGetValue = callsViewModelCurrentCallDataIsConferenceCall.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue = androidx.databinding.ViewDataBinding.safeUnbox(callsViewModelCurrentCallDataIsConferenceCallGetValue);
                if((dirtyFlags & 0xa90L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue) {
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.GONE : View.VISIBLE
                    callsViewModelCurrentCallDataIsConferenceCallViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.VISIBLE : View.GONE
                    callsViewModelCurrentCallDataIsConferenceCallViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxCallsViewModelCurrentCallDataIsConferenceCallGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0xd03L) != 0) {


            if ((dirtyFlags & 0xc03L) != 0) {

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
                if((dirtyFlags & 0xc03L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
            }
            if ((dirtyFlags & 0xd00L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.numpadVisible
                        controlsViewModelNumpadVisible = controlsViewModel.getNumpadVisible();
                    }
                    updateLiveDataRegistration(8, controlsViewModelNumpadVisible);


                    if (controlsViewModelNumpadVisible != null) {
                        // read controlsViewModel.numpadVisible.getValue()
                        controlsViewModelNumpadVisibleGetValue = controlsViewModelNumpadVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelNumpadVisibleGetValue);
                if((dirtyFlags & 0xd00L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelNumpadVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
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
        if ((dirtyFlags & 0xc0000L) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.currentCallData
                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();
                }
                updateLiveDataRegistration(7, callsViewModelCurrentCallData);


                if (callsViewModelCurrentCallData != null) {
                    // read callsViewModel.currentCallData.getValue()
                    callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();
                }

            if ((dirtyFlags & 0x40000L) != 0) {

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
            if ((dirtyFlags & 0x80000L) != 0) {

                    if (callsViewModelCurrentCallDataGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().contact
                        callsViewModelCurrentCallDataContact = callsViewModelCurrentCallDataGetValue.getContact();
                    }
                    updateLiveDataRegistration(5, callsViewModelCurrentCallDataContact);


                    if (callsViewModelCurrentCallDataContact != null) {
                        // read callsViewModel.currentCallData.getValue().contact.getValue()
                        callsViewModelCurrentCallDataContactGetValue = callsViewModelCurrentCallDataContact.getValue();
                    }


                    if (callsViewModelCurrentCallDataContactGetValue != null) {
                        // read callsViewModel.currentCallData.getValue().contact.getValue().name
                        callsViewModelCurrentCallDataContactName = callsViewModelCurrentCallDataContactGetValue.getName();
                    }
            }
        }

        if ((dirtyFlags & 0xc03L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelIsSwitchCameraAvailableGetValue) ? (ControlsViewModelPipMode1) : (false));
            if((dirtyFlags & 0xc03L) != 0) {
                if(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
                controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE = ((controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xae8L) != 0) {

                // read callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue()
                callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubject = ((callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNull) ? (callsViewModelCurrentCallDataContactName) : (callsViewModelCurrentCallDataRemoteConferenceSubjectGetValue));


                // read callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null
                callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNull = (callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubject) == (null);
            if((dirtyFlags & 0xae8L) != 0) {
                if(callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNull) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20000L) != 0) {

                if (callsViewModelCurrentCallDataGetValue != null) {
                    // read callsViewModel.currentCallData.getValue().displayName
                    callsViewModelCurrentCallDataDisplayName = callsViewModelCurrentCallDataGetValue.getDisplayName();
                }
                updateLiveDataRegistration(6, callsViewModelCurrentCallDataDisplayName);


                if (callsViewModelCurrentCallDataDisplayName != null) {
                    // read callsViewModel.currentCallData.getValue().displayName.getValue()
                    callsViewModelCurrentCallDataDisplayNameGetValue = callsViewModelCurrentCallDataDisplayName.getValue();
                }
        }

        if ((dirtyFlags & 0xae8L) != 0) {

                // read callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue()
                callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubject = ((callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNull) ? (callsViewModelCurrentCallDataDisplayNameGetValue) : (callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubject));
        }
        // batch finished
        if ((dirtyFlags & 0xa80L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadVoipContactPictureWithCoilAlt(this.avatar, callsViewModelCurrentCallDataGetValue);
        }
        if ((dirtyFlags & 0xa90L) != 0) {
            // api target 1

            this.avatar.setVisibility(callsViewModelCurrentCallDataIsConferenceCallViewGONEViewVISIBLE);
            this.conferenceAvatar.setVisibility(callsViewModelCurrentCallDataIsConferenceCallViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa00L) != 0) {
            // api target 1

            this.buttons.setCallsViewModel(callsViewModel);
        }
        if ((dirtyFlags & 0xc00L) != 0) {
            // api target 1

            this.buttons.setControlsViewModel(controlsViewModel);
            if (this.stubNumpad.isInflated()) this.stubNumpad.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
        }
        if ((dirtyFlags & 0xae8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.calleeName, callsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataDisplayNameCallsViewModelCurrentCallDataRemoteConferenceSubjectJavaLangObjectNullCallsViewModelCurrentCallDataContactNameCallsViewModelCurrentCallDataRemoteConferenceSubject);
        }
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutSize(this.localPreviewVideoSurface, localPreviewVideoSurface.getResources().getDimension(R.dimen.video_preview_max_size));
            this.switchCamera.setOnClickListener(mCallback95);
        }
        if ((dirtyFlags & 0xd00L) != 0) {
            // api target 1

            if (!this.stubNumpad.isInflated()) this.stubNumpad.getViewStub().setVisibility(controlsViewModelNumpadVisibleViewVISIBLEViewGONE);
            if (this.stubNumpad.isInflated()) this.stubNumpad.getBinding().setVariable(BR.inflatedVisibility, controlsViewModelNumpadVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc03L) != 0) {
            // api target 1

            this.switchCamera.setVisibility(controlsViewModelIsSwitchCameraAvailableControlsViewModelPipModeBooleanFalseViewVISIBLEViewGONE);
        }
        executeBindingsOn(buttons);
        if (stubNumpad.getBinding() != null) {
            executeBindingsOn(stubNumpad.getBinding());
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
        flag 1 (0x2L): controlsViewModel.isSwitchCameraAvailable
        flag 2 (0x3L): buttons
        flag 3 (0x4L): callsViewModel.currentCallData.getValue().remoteConferenceSubject
        flag 4 (0x5L): callsViewModel.currentCallData.getValue().isConferenceCall
        flag 5 (0x6L): callsViewModel.currentCallData.getValue().contact
        flag 6 (0x7L): callsViewModel.currentCallData.getValue().displayName
        flag 7 (0x8L): callsViewModel.currentCallData
        flag 8 (0x9L): controlsViewModel.numpadVisible
        flag 9 (0xaL): callsViewModel
        flag 10 (0xbL): controlsViewModel
        flag 11 (0xcL): null
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false
        flag 16 (0x11L): callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue()
        flag 17 (0x12L): callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().displayName.getValue() : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue()
        flag 18 (0x13L): callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue()
        flag 19 (0x14L): callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue() == null ? callsViewModel.currentCallData.getValue().contact.getValue().name : callsViewModel.currentCallData.getValue().remoteConferenceSubject.getValue()
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.isSwitchCameraAvailable.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.GONE : View.VISIBLE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.GONE : View.VISIBLE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(callsViewModel.currentCallData.getValue().isConferenceCall.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}