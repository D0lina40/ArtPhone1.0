package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceParticipantRemoteActiveSpeakerMiniatureBindingImpl extends VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding  {

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
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceParticipantRemoteActiveSpeakerMiniatureBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private VoipConferenceParticipantRemoteActiveSpeakerMiniatureBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[5]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            );
        this.joining.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.participantAvatar.setTag(null);
        this.participantName.setTag(null);
        this.participantVideoSurface.setTag(null);
        this.paused.setTag(null);
        setRootTag(root);
        // listeners
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
            mDirtyFlags |= 0x100L;
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
                return onChangeDataIsActiveSpeaker((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeDataIsInConference((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeDataIsSpeaking((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeDataVideoEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
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
    private boolean onChangeDataIsActiveSpeaker(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsActiveSpeaker, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsInConference(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsInConference, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsSpeaking(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsSpeaking, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataVideoEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> DataVideoEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsActiveSpeaker = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsInConference1 = null;
        org.linphone.core.Friend dataContactGetValue = null;
        int dataIsSpeakingViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsSpeaking = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsActiveSpeakerGetValue = false;
        android.graphics.drawable.Drawable dataIsInConferenceDataIsJoiningBooleanFalseMboundView0AndroidDrawableShapeRemotePausedBackgroundMboundView0AndroidDrawableShapeRemoteBackground = null;
        boolean dataIsInConferenceDataIsJoiningBooleanFalse = false;
        java.lang.String dataContactName = null;
        int dataIsJoiningViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> dataVideoEnabled = null;
        java.lang.Boolean dataIsActiveSpeakerGetValue = null;
        java.lang.Boolean dataVideoEnabledGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue = false;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataVideoEnabledGetValue = false;
        int dataIsActiveSpeakerViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue = false;

        if ((dirtyFlags & 0x3ffL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

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
                if((dirtyFlags & 0x301L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
                    dataIsJoiningViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x304L) != 0) {

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
                if((dirtyFlags & 0x304L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsMutedGetValue) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue()) ? View.VISIBLE : View.GONE
                    dataIsMutedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsMutedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (data != null) {
                        // read data.isActiveSpeaker
                        dataIsActiveSpeaker = data.isActiveSpeaker();
                    }
                    updateLiveDataRegistration(3, dataIsActiveSpeaker);


                    if (dataIsActiveSpeaker != null) {
                        // read data.isActiveSpeaker.getValue()
                        dataIsActiveSpeakerGetValue = dataIsActiveSpeaker.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isActiveSpeaker.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsActiveSpeakerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsActiveSpeakerGetValue);
                if((dirtyFlags & 0x308L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsActiveSpeakerGetValue) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isActiveSpeaker.getValue()) ? View.GONE : View.VISIBLE
                    dataIsActiveSpeakerViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsActiveSpeakerGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x311L) != 0) {

                    if (data != null) {
                        // read data.isInConference
                        DataIsInConference1 = data.isInConference();
                    }
                    updateLiveDataRegistration(4, DataIsInConference1);


                    if (DataIsInConference1 != null) {
                        // read data.isInConference.getValue()
                        dataIsInConferenceGetValue = DataIsInConference1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsInConferenceGetValue);
                if((dirtyFlags & 0x311L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue())
                    dataIsInConference = !androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue;
                if((dirtyFlags & 0x311L) != 0) {
                    if(dataIsInConference) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (data != null) {
                        // read data.isSpeaking
                        dataIsSpeaking = data.isSpeaking();
                    }
                    updateLiveDataRegistration(5, dataIsSpeaking);


                    if (dataIsSpeaking != null) {
                        // read data.isSpeaking.getValue()
                        dataIsSpeakingGetValue = dataIsSpeaking.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsSpeakingGetValue);
                if((dirtyFlags & 0x320L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue()) ? View.VISIBLE : View.GONE
                    dataIsSpeakingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x350L) != 0) {

                    if (data != null) {
                        // read data.videoEnabled
                        dataVideoEnabled = data.getVideoEnabled();
                    }
                    updateLiveDataRegistration(6, dataVideoEnabled);


                    if (dataVideoEnabled != null) {
                        // read data.videoEnabled.getValue()
                        dataVideoEnabledGetValue = dataVideoEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataVideoEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataVideoEnabledGetValue);
                if((dirtyFlags & 0x350L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataVideoEnabledGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
            }
            if ((dirtyFlags & 0x382L) != 0) {

                    if (data != null) {
                        // read data.contact
                        dataContact = data.getContact();
                    }
                    updateLiveDataRegistration(7, dataContact);


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
                if((dirtyFlags & 0x382L) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20000000L) != 0) {

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
            if((dirtyFlags & 0x301L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
                DataIsJoining1 = !androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue;
        }
        if ((dirtyFlags & 0x8000L) != 0) {

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
        if ((dirtyFlags & 0x800L) != 0) {

                if (data != null) {
                    // read data.isInConference
                    DataIsInConference1 = data.isInConference();
                }
                updateLiveDataRegistration(4, DataIsInConference1);


                if (DataIsInConference1 != null) {
                    // read data.isInConference.getValue()
                    dataIsInConferenceGetValue = DataIsInConference1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsInConferenceGetValue);
            if((dirtyFlags & 0x311L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }
        }

        if ((dirtyFlags & 0x350L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false
                dataVideoEnabledDataIsInConferenceBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxDataVideoEnabledGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) : (false));
            if((dirtyFlags & 0x350L) != 0) {
                if(dataVideoEnabledDataIsInConferenceBooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false ? View.VISIBLE : View.GONE
                dataVideoEnabledDataIsInConferenceBooleanFalseViewVISIBLEViewGONE = ((dataVideoEnabledDataIsInConferenceBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x382L) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        if ((dirtyFlags & 0x311L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false
                dataIsInConferenceDataIsJoiningBooleanFalse = ((dataIsInConference) ? (DataIsJoining1) : (false));
            if((dirtyFlags & 0x311L) != 0) {
                if(dataIsInConferenceDataIsJoiningBooleanFalse) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false ? @android:drawable/shape_remote_paused_background : @android:drawable/shape_remote_background
                dataIsInConferenceDataIsJoiningBooleanFalseMboundView0AndroidDrawableShapeRemotePausedBackgroundMboundView0AndroidDrawableShapeRemoteBackground = ((dataIsInConferenceDataIsJoiningBooleanFalse) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView0.getContext(), R.drawable.shape_remote_paused_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView0.getContext(), R.drawable.shape_remote_background)));
        }
        // batch finished

        if ((dirtyFlags & 0x400000L) != 0) {

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
            if((dirtyFlags & 0x301L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }
        }

        if ((dirtyFlags & 0x311L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
                dataIsInConferenceBooleanTrueDataIsJoining = ((androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue));
            if((dirtyFlags & 0x311L) != 0) {
                if(dataIsInConferenceBooleanTrueDataIsJoining) {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.GONE : View.VISIBLE
                dataIsInConferenceBooleanTrueDataIsJoiningViewGONEViewVISIBLE = ((dataIsInConferenceBooleanTrueDataIsJoining) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
                dataIsInConferenceBooleanTrueDataIsJoiningViewVISIBLEViewGONE = ((dataIsInConferenceBooleanTrueDataIsJoining) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            this.joining.setVisibility(dataIsJoiningViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x311L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView0, dataIsInConferenceDataIsJoiningBooleanFalseMboundView0AndroidDrawableShapeRemotePausedBackgroundMboundView0AndroidDrawableShapeRemoteBackground);
            this.participantAvatar.setVisibility(dataIsInConferenceBooleanTrueDataIsJoiningViewVISIBLEViewGONE);
            this.paused.setVisibility(dataIsInConferenceBooleanTrueDataIsJoiningViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(dataIsActiveSpeakerViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(dataIsSpeakingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(dataIsMutedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadVoipContactPictureWithCoil(this.participantAvatar, data);
            org.linphone.utils.DataBindingUtilsKt.setParticipantTextureView(this.participantVideoSurface, data);
        }
        if ((dirtyFlags & 0x382L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.participantName, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
        if ((dirtyFlags & 0x350L) != 0) {
            // api target 1

            this.participantVideoSurface.setVisibility(dataVideoEnabledDataIsInConferenceBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.isJoining
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.isMuted
        flag 3 (0x4L): data.isActiveSpeaker
        flag 4 (0x5L): data.isInConference
        flag 5 (0x6L): data.isSpeaking
        flag 6 (0x7L): data.videoEnabled
        flag 7 (0x8L): data.contact
        flag 8 (0x9L): data
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 15 (0x10L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(data.videoEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false ? @android:drawable/shape_remote_paused_background : @android:drawable/shape_remote_background
        flag 27 (0x1cL): !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false ? @android:drawable/shape_remote_paused_background : @android:drawable/shape_remote_background
        flag 28 (0x1dL): !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false
        flag 29 (0x1eL): !androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) : false
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(data.isActiveSpeaker.getValue()) ? View.GONE : View.VISIBLE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(data.isActiveSpeaker.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}