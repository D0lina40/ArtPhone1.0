package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceParticipantRemoteGridBindingImpl extends VoipConferenceParticipantRemoteGridBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final android.view.View mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback158;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceParticipantRemoteGridBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private VoipConferenceParticipantRemoteGridBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.ProgressBar) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            );
        this.joining.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.view.View) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.participantAvatar.setTag(null);
        this.participantName.setTag(null);
        this.participantVideoSurface.setTag(null);
        this.paused.setTag(null);
        setRootTag(root);
        // listeners
        mCallback158 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
        if (BR.data == variableId) {
            setData((org.linphone.activities.voip.data.ConferenceParticipantDeviceData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.voip.data.ConferenceParticipantDeviceData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataIsJoining((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataIsMuted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeDataIsInConference((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeDataIsSpeaking((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeDataVideoEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataIsJoining(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsJoining, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> DataDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsMuted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsMuted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsInConference(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsInConference, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsSpeaking(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsSpeaking, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataVideoEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> DataVideoEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        java.lang.Boolean dataIsInConferenceGetValue = null;
        int dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalseDataIsInConferenceBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsMutedGetValue = false;
        boolean dataVideoEnabledDataIsInConferenceBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue = false;
        boolean dataIsInConference = false;
        java.lang.String dataDisplayNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsJoining = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        java.lang.Boolean dataIsMutedGetValue = null;
        org.linphone.activities.voip.data.ConferenceParticipantDeviceData data = mData;
        int dataIsInConferenceBooleanTrueDataIsJoiningViewGONEViewVISIBLE = 0;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsMuted = null;
        java.lang.Boolean dataIsJoiningGetValue = null;
        int dataIsInConferenceBooleanTrueDataIsJoiningViewVISIBLEViewGONE = 0;
        java.lang.Boolean dataIsSpeakingGetValue = null;
        int dataVideoEnabledDataIsInConferenceBooleanFalseViewVISIBLEViewGONE = 0;
        int dataIsMutedViewVISIBLEViewGONE = 0;
        boolean DataIsJoining1 = false;
        boolean dataIsInConferenceBooleanTrueDataIsJoining = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsInConference1 = null;
        org.linphone.core.Friend dataContactGetValue = null;
        int dataIsSpeakingViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsSpeaking = null;
        android.graphics.drawable.Drawable dataIsInConferenceDataIsJoiningBooleanFalseMboundView1AndroidDrawableShapeRemotePausedBackgroundDataIsMeMboundView1AndroidDrawableShapeMeBackgroundMboundView1AndroidDrawableShapeRemoteBackground = null;
        boolean dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalse = false;
        boolean dataIsInConferenceDataIsJoiningBooleanFalse = false;
        java.lang.String dataContactName = null;
        boolean dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalseDataIsInConferenceBooleanFalse = false;
        android.graphics.drawable.Drawable dataIsMeMboundView1AndroidDrawableShapeMeBackgroundMboundView1AndroidDrawableShapeRemoteBackground = null;
        int dataIsJoiningViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> dataVideoEnabled = null;
        java.lang.Boolean dataVideoEnabledGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue = false;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        boolean dataIsMe = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataVideoEnabledGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue = false;
        boolean dataIsSwitchCameraAvailable = false;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

                    if (data != null) {
                        // read data.isJoining
                        dataIsJoining = data.isJoining();
                    }
                    updateLiveDataRegistration(0, dataIsJoining);


                    if (dataIsJoining != null) {
                        // read data.isJoining.getValue()
                        dataIsJoiningGetValue = dataIsJoining.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsJoiningGetValue);
                if((dirtyFlags & 0x181L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
                    dataIsJoiningViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x184L) != 0) {

                    if (data != null) {
                        // read data.isMuted
                        dataIsMuted = data.isMuted();
                    }
                    updateLiveDataRegistration(2, dataIsMuted);


                    if (dataIsMuted != null) {
                        // read data.isMuted.getValue()
                        dataIsMutedGetValue = dataIsMuted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsMutedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsMutedGetValue);
                if((dirtyFlags & 0x184L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsMutedGetValue) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue()) ? View.VISIBLE : View.GONE
                    dataIsMutedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsMutedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x189L) != 0) {

                    if (data != null) {
                        // read data.isInConference
                        DataIsInConference1 = data.isInConference();
                    }
                    updateLiveDataRegistration(3, DataIsInConference1);


                    if (DataIsInConference1 != null) {
                        // read data.isInConference.getValue()
                        dataIsInConferenceGetValue = DataIsInConference1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsInConferenceGetValue);
                if((dirtyFlags & 0x189L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue())
                    dataIsInConference = !androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue;
                if((dirtyFlags & 0x189L) != 0) {
                    if(dataIsInConference) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x190L) != 0) {

                    if (data != null) {
                        // read data.isSpeaking
                        dataIsSpeaking = data.isSpeaking();
                    }
                    updateLiveDataRegistration(4, dataIsSpeaking);


                    if (dataIsSpeaking != null) {
                        // read data.isSpeaking.getValue()
                        dataIsSpeakingGetValue = dataIsSpeaking.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsSpeakingGetValue);
                if((dirtyFlags & 0x190L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue()) ? View.VISIBLE : View.GONE
                    dataIsSpeakingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1a8L) != 0) {

                    if (data != null) {
                        // read data.videoEnabled
                        dataVideoEnabled = data.getVideoEnabled();
                    }
                    updateLiveDataRegistration(5, dataVideoEnabled);


                    if (dataVideoEnabled != null) {
                        // read data.videoEnabled.getValue()
                        dataVideoEnabledGetValue = dataVideoEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataVideoEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataVideoEnabledGetValue);
                if((dirtyFlags & 0x1a8L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataVideoEnabledGetValue) {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x20000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1c2L) != 0) {

                    if (data != null) {
                        // read data.contact
                        dataContact = data.getContact();
                    }
                    updateLiveDataRegistration(6, dataContact);


                    if (dataContact != null) {
                        // read data.contact.getValue()
                        dataContactGetValue = dataContact.getValue();
                    }


                    if (dataContactGetValue != null) {
                        // read data.contact.getValue().name
                        dataContactName = dataContactGetValue.getName();
                    }


                    // read data.contact.getValue().name == null
                    dataContactNameJavaLangObjectNull = (dataContactName) == (null);
                if((dirtyFlags & 0x1c2L) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000000L) != 0) {

                if (data != null) {
                    // read data.isJoining
                    dataIsJoining = data.isJoining();
                }
                updateLiveDataRegistration(0, dataIsJoining);


                if (dataIsJoining != null) {
                    // read data.isJoining.getValue()
                    dataIsJoiningGetValue = dataIsJoining.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsJoiningGetValue);
            if((dirtyFlags & 0x181L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) {
                        dirtyFlags |= 0x4000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
                DataIsJoining1 = !androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue;
        }
        if ((dirtyFlags & 0x10000L) != 0) {

                if (data != null) {
                    // read data.displayName
                    dataDisplayName = data.getDisplayName();
                }
                updateLiveDataRegistration(1, dataDisplayName);


                if (dataDisplayName != null) {
                    // read data.displayName.getValue()
                    dataDisplayNameGetValue = dataDisplayName.getValue();
                }
        }
        if ((dirtyFlags & 0x1000L) != 0) {

                if (data != null) {
                    // read data.isInConference
                    DataIsInConference1 = data.isInConference();
                }
                updateLiveDataRegistration(3, DataIsInConference1);


                if (DataIsInConference1 != null) {
                    // read data.isInConference.getValue()
                    dataIsInConferenceGetValue = DataIsInConference1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsInConferenceGetValue);
            if((dirtyFlags & 0x189L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }
        }
        if ((dirtyFlags & 0x40000000L) != 0) {

                if (data != null) {
                    // read data.isSwitchCameraAvailable()
                    dataIsSwitchCameraAvailable = data.isSwitchCameraAvailable();
                }
        }

        if ((dirtyFlags & 0x1a8L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false
                dataVideoEnabledDataIsInConferenceBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxDataVideoEnabledGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? data.isSwitchCameraAvailable() : false
                dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxDataVideoEnabledGetValue) ? (dataIsSwitchCameraAvailable) : (false));
            if((dirtyFlags & 0x1a8L) != 0) {
                if(dataVideoEnabledDataIsInConferenceBooleanFalse) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
            if((dirtyFlags & 0x1a8L) != 0) {
                if(dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalse) {
                        dirtyFlags |= 0x400000000L;
                }
                else {
                        dirtyFlags |= 0x200000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false ? View.VISIBLE : View.GONE
                dataVideoEnabledDataIsInConferenceBooleanFalseViewVISIBLEViewGONE = ((dataVideoEnabledDataIsInConferenceBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1c2L) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        if ((dirtyFlags & 0x189L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false
                dataIsInConferenceDataIsJoiningBooleanFalse = ((dataIsInConference) ? (DataIsJoining1) : (false));
            if((dirtyFlags & 0x189L) != 0) {
                if(dataIsInConferenceDataIsJoiningBooleanFalse) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400000000L) != 0) {

                if (data != null) {
                    // read data.isInConference
                    DataIsInConference1 = data.isInConference();
                }
                updateLiveDataRegistration(3, DataIsInConference1);


                if (DataIsInConference1 != null) {
                    // read data.isInConference.getValue()
                    dataIsInConferenceGetValue = DataIsInConference1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsInConferenceGetValue);
            if((dirtyFlags & 0x189L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }
        }
        if ((dirtyFlags & 0x8000000L) != 0) {

                if (data != null) {
                    // read data.isMe
                    dataIsMe = data.isMe();
                }
            if((dirtyFlags & 0x8000000L) != 0) {
                if(dataIsMe) {
                        dirtyFlags |= 0x1000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                }
            }


                // read data.isMe ? @android:drawable/shape_me_background : @android:drawable/shape_remote_background
                dataIsMeMboundView1AndroidDrawableShapeMeBackgroundMboundView1AndroidDrawableShapeRemoteBackground = ((dataIsMe) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.shape_me_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.shape_remote_background)));
        }

        if ((dirtyFlags & 0x189L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false ? @android:drawable/shape_remote_paused_background : data.isMe ? @android:drawable/shape_me_background : @android:drawable/shape_remote_background
                dataIsInConferenceDataIsJoiningBooleanFalseMboundView1AndroidDrawableShapeRemotePausedBackgroundDataIsMeMboundView1AndroidDrawableShapeMeBackgroundMboundView1AndroidDrawableShapeRemoteBackground = ((dataIsInConferenceDataIsJoiningBooleanFalse) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.shape_remote_paused_background)) : (dataIsMeMboundView1AndroidDrawableShapeMeBackgroundMboundView1AndroidDrawableShapeRemoteBackground));
        }
        if ((dirtyFlags & 0x1a8L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? data.isSwitchCameraAvailable() : false ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false
                dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalseDataIsInConferenceBooleanFalse = ((dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) : (false));
            if((dirtyFlags & 0x1a8L) != 0) {
                if(dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalseDataIsInConferenceBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? data.isSwitchCameraAvailable() : false ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false ? View.VISIBLE : View.GONE
                dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalseDataIsInConferenceBooleanFalseViewVISIBLEViewGONE = ((dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalseDataIsInConferenceBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x800000L) != 0) {

                if (data != null) {
                    // read data.isJoining
                    dataIsJoining = data.isJoining();
                }
                updateLiveDataRegistration(0, dataIsJoining);


                if (dataIsJoining != null) {
                    // read data.isJoining.getValue()
                    dataIsJoiningGetValue = dataIsJoining.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsJoiningGetValue);
            if((dirtyFlags & 0x181L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) {
                        dirtyFlags |= 0x4000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x189L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
                dataIsInConferenceBooleanTrueDataIsJoining = ((androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue));
            if((dirtyFlags & 0x189L) != 0) {
                if(dataIsInConferenceBooleanTrueDataIsJoining) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x20000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.GONE : View.VISIBLE
                dataIsInConferenceBooleanTrueDataIsJoiningViewGONEViewVISIBLE = ((dataIsInConferenceBooleanTrueDataIsJoining) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
                dataIsInConferenceBooleanTrueDataIsJoiningViewVISIBLEViewGONE = ((dataIsInConferenceBooleanTrueDataIsJoining) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            this.joining.setVisibility(dataIsJoiningViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x189L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView1, dataIsInConferenceDataIsJoiningBooleanFalseMboundView1AndroidDrawableShapeRemotePausedBackgroundDataIsMeMboundView1AndroidDrawableShapeMeBackgroundMboundView1AndroidDrawableShapeRemoteBackground);
            this.participantAvatar.setVisibility(dataIsInConferenceBooleanTrueDataIsJoiningViewVISIBLEViewGONE);
            this.paused.setVisibility(dataIsInConferenceBooleanTrueDataIsJoiningViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(dataIsSpeakingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(mCallback158);
        }
        if ((dirtyFlags & 0x1a8L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(dataVideoEnabledDataIsSwitchCameraAvailableBooleanFalseDataIsInConferenceBooleanFalseViewVISIBLEViewGONE);
            this.participantVideoSurface.setVisibility(dataVideoEnabledDataIsInConferenceBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            this.mboundView9.setVisibility(dataIsMutedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadVoipContactPictureWithCoil(this.participantAvatar, data);
            org.linphone.utils.DataBindingUtilsKt.setParticipantTextureView(this.participantVideoSurface, data);
        }
        if ((dirtyFlags & 0x1c2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.participantName, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.voip.data.ConferenceParticipantDeviceData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.switchCamera();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.isJoining
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.isMuted
        flag 3 (0x4L): data.isInConference
        flag 4 (0x5L): data.isSpeaking
        flag 5 (0x6L): data.videoEnabled
        flag 6 (0x7L): data.contact
        flag 7 (0x8L): data
        flag 8 (0x9L): null
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? data.isSwitchCameraAvailable() : false ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? data.isSwitchCameraAvailable() : false ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 16 (0x11L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue()) ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false ? @android:drawable/shape_remote_paused_background : data.isMe ? @android:drawable/shape_me_background : @android:drawable/shape_remote_background
        flag 28 (0x1dL): !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false ? @android:drawable/shape_remote_paused_background : data.isMe ? @android:drawable/shape_me_background : @android:drawable/shape_remote_background
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? data.isSwitchCameraAvailable() : false
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? data.isSwitchCameraAvailable() : false
        flag 31 (0x20L): !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false
        flag 32 (0x21L): !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? data.isSwitchCameraAvailable() : false ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? data.isSwitchCameraAvailable() : false ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false
        flag 35 (0x24L): data.isMe ? @android:drawable/shape_me_background : @android:drawable/shape_remote_background
        flag 36 (0x25L): data.isMe ? @android:drawable/shape_me_background : @android:drawable/shape_remote_background
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}