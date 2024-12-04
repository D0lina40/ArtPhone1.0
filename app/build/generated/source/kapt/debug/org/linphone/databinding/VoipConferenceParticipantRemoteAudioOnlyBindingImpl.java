package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceParticipantRemoteAudioOnlyBindingImpl extends VoipConferenceParticipantRemoteAudioOnlyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.endBarrier, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceParticipantRemoteAudioOnlyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private VoipConferenceParticipantRemoteAudioOnlyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (androidx.constraintlayout.widget.Barrier) bindings[8]
            , (android.widget.ProgressBar) bindings[6]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.view.View) bindings[1]
            );
        this.joining.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.participantAvatar.setTag(null);
        this.participantMicMuted.setTag(null);
        this.participantName.setTag(null);
        this.pausedAvatar.setTag(null);
        this.view.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            mDirtyFlags |= 0x40L;
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
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactNameDataIsInConferenceBooleanTrueDataIsJoiningJavaLangStringJavaLangStringParticipantNameAndroidStringConferenceParticipantPaused = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsMutedGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue = false;
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
        java.lang.String dataIsInConferenceBooleanTrueDataIsJoiningJavaLangStringJavaLangStringParticipantNameAndroidStringConferenceParticipantPaused = null;
        java.lang.Boolean dataIsSpeakingGetValue = null;
        int dataIsMutedViewVISIBLEViewGONE = 0;
        boolean dataIsInConferenceBooleanTrueDataIsJoining = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsInConference = null;
        org.linphone.core.Friend dataContactGetValue = null;
        int dataIsSpeakingViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsSpeaking = null;
        java.lang.String dataContactName = null;
        int dataIsJoiningViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue = false;
        android.graphics.drawable.Drawable dataIsMeViewAndroidDrawableShapeAudioOnlyMeBackgroundViewAndroidDrawableShapeAudioOnlyRemoteBackground = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        boolean dataIsMe = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue = false;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

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
                if((dirtyFlags & 0xc1L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
                    dataIsJoiningViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc4L) != 0) {

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
                if((dirtyFlags & 0xc4L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsMutedGetValue) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue()) ? View.VISIBLE : View.GONE
                    dataIsMutedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsMutedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xebL) != 0) {

                    if (data != null) {
                        // read data.isInConference
                        dataIsInConference = data.isInConference();
                        // read data.contact
                        dataContact = data.getContact();
                    }
                    updateLiveDataRegistration(3, dataIsInConference);
                    updateLiveDataRegistration(5, dataContact);


                    if (dataIsInConference != null) {
                        // read data.isInConference.getValue()
                        dataIsInConferenceGetValue = dataIsInConference.getValue();
                    }
                    if (dataContact != null) {
                        // read data.contact.getValue()
                        dataContactGetValue = dataContact.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsInConferenceGetValue);
                if((dirtyFlags & 0xebL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
                    if (dataContactGetValue != null) {
                        // read data.contact.getValue().name
                        dataContactName = dataContactGetValue.getName();
                    }


                    // read data.contact.getValue().name == null
                    dataContactNameJavaLangObjectNull = (dataContactName) == (null);
                if((dirtyFlags & 0xebL) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

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
                if((dirtyFlags & 0xd0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue()) ? View.VISIBLE : View.GONE
                    dataIsSpeakingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (data != null) {
                        // read data.isMe
                        dataIsMe = data.isMe();
                    }
                if((dirtyFlags & 0xc0L) != 0) {
                    if(dataIsMe) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read data.isMe ? @android:drawable/shape_audio_only_me_background : @android:drawable/shape_audio_only_remote_background
                    dataIsMeViewAndroidDrawableShapeAudioOnlyMeBackgroundViewAndroidDrawableShapeAudioOnlyRemoteBackground = ((dataIsMe) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(view.getContext(), R.drawable.shape_audio_only_me_background)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(view.getContext(), R.drawable.shape_audio_only_remote_background)));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40000L) != 0) {

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
            if((dirtyFlags & 0xc1L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }
        }
        if ((dirtyFlags & 0x800L) != 0) {

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

        if ((dirtyFlags & 0xebL) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
                dataIsInConferenceBooleanTrueDataIsJoining = ((androidxDatabindingViewDataBindingSafeUnboxDataIsInConferenceGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataIsJoiningGetValue));
            if((dirtyFlags & 0xc9L) != 0) {
                if(dataIsInConferenceBooleanTrueDataIsJoining) {
                        dirtyFlags |= 0x200L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x100L;
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0xebL) != 0) {
                if(dataIsInConferenceBooleanTrueDataIsJoining) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }

            if ((dirtyFlags & 0xc9L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.GONE : View.VISIBLE
                    dataIsInConferenceBooleanTrueDataIsJoiningViewGONEViewVISIBLE = ((dataIsInConferenceBooleanTrueDataIsJoining) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
                    dataIsInConferenceBooleanTrueDataIsJoiningViewVISIBLEViewGONE = ((dataIsInConferenceBooleanTrueDataIsJoining) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? "" : (" ") + (@android:string/conference_participant_paused)
                dataIsInConferenceBooleanTrueDataIsJoiningJavaLangStringJavaLangStringParticipantNameAndroidStringConferenceParticipantPaused = ((dataIsInConferenceBooleanTrueDataIsJoining) ? ("") : ((" ") + (participantName.getResources().getString(R.string.conference_participant_paused))));


                // read (data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name) + (androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? "" : (" ") + (@android:string/conference_participant_paused))
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactNameDataIsInConferenceBooleanTrueDataIsJoiningJavaLangStringJavaLangStringParticipantNameAndroidStringConferenceParticipantPaused = (dataContactNameJavaLangObjectNullDataDisplayNameDataContactName) + (dataIsInConferenceBooleanTrueDataIsJoiningJavaLangStringJavaLangStringParticipantNameAndroidStringConferenceParticipantPaused);
        }
        // batch finished
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.joining.setVisibility(dataIsJoiningViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(dataIsSpeakingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc9L) != 0) {
            // api target 1

            this.participantAvatar.setVisibility(dataIsInConferenceBooleanTrueDataIsJoiningViewVISIBLEViewGONE);
            this.pausedAvatar.setVisibility(dataIsInConferenceBooleanTrueDataIsJoiningViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadVoipContactPictureWithCoil(this.participantAvatar, data);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.view, dataIsMeViewAndroidDrawableShapeAudioOnlyMeBackgroundViewAndroidDrawableShapeAudioOnlyRemoteBackground);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.participantMicMuted.setVisibility(dataIsMutedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xebL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.participantName, dataContactNameJavaLangObjectNullDataDisplayNameDataContactNameDataIsInConferenceBooleanTrueDataIsJoiningJavaLangStringJavaLangStringParticipantNameAndroidStringConferenceParticipantPaused);
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
        flag 3 (0x4L): data.isInConference
        flag 4 (0x5L): data.isSpeaking
        flag 5 (0x6L): data.contact
        flag 6 (0x7L): data
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 11 (0xcL): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? "" : (" ") + (@android:string/conference_participant_paused)
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? "" : (" ") + (@android:string/conference_participant_paused)
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInConference.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue())
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaking.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(data.isJoining.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): data.isMe ? @android:drawable/shape_audio_only_me_background : @android:drawable/shape_audio_only_remote_background
        flag 25 (0x1aL): data.isMe ? @android:drawable/shape_audio_only_me_background : @android:drawable/shape_audio_only_remote_background
    flag mapping end*/
    //end
}