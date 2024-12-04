package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageConferenceInvitationContentCellBindingImpl extends ChatMessageConferenceInvitationContentCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback214;
    @Nullable
    private final android.view.View.OnClickListener mCallback215;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageConferenceInvitationContentCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ChatMessageConferenceInvitationContentCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (android.widget.TextView) bindings[12]
            );
        this.joinConference.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.ImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback214 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback215 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4000L;
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
            setData((org.linphone.activities.main.chat.data.ChatMessageContentData) variable);
        }
        else if (BR.longClickListener == variableId) {
            setLongClickListener((android.view.View.OnLongClickListener) variable);
        }
        else if (BR.inflatedVisibility == variableId) {
            setInflatedVisibility((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageContentData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setLongClickListener(@Nullable android.view.View.OnLongClickListener LongClickListener) {
        this.mLongClickListener = LongClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.longClickListener);
        super.requestRebind();
    }
    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataShowDuration((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataConferenceDuration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataConferenceDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeDataIsConferenceCancelled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeDataIsSpeaker((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeDataConferenceTime((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeDataConferenceSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeDataConferenceParticipantCount((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeDataConferenceDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeDataIsBroadcast((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeDataIsConferenceUpdated((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataShowDuration(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataShowDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataConferenceDuration(androidx.lifecycle.MutableLiveData<java.lang.String> DataConferenceDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataConferenceDescription(androidx.lifecycle.MutableLiveData<java.lang.String> DataConferenceDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsConferenceCancelled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsConferenceCancelled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsSpeaker(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsSpeaker, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataConferenceTime(androidx.lifecycle.MutableLiveData<java.lang.String> DataConferenceTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataConferenceSubject(androidx.lifecycle.MutableLiveData<java.lang.String> DataConferenceSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataConferenceParticipantCount(androidx.lifecycle.MutableLiveData<java.lang.String> DataConferenceParticipantCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataConferenceDate(androidx.lifecycle.MutableLiveData<java.lang.String> DataConferenceDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsBroadcast(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsBroadcast, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsConferenceUpdated(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsConferenceUpdated, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        int dataIsBroadcastDataIsSpeakerBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue = false;
        java.lang.String dataConferenceTimeGetValue = null;
        org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;
        boolean dataIsBroadcastDataIsSpeakerBooleanFalse = false;
        java.lang.String javaLangStringDataConferenceDurationJavaLangString = null;
        java.lang.Boolean dataIsConferenceUpdatedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataShowDuration = null;
        java.lang.String dataIsBroadcastMboundView1AndroidStringConferenceBroadcastInviteTitleMboundView1AndroidStringConferenceInviteTitle = null;
        java.lang.String dataConferenceDescriptionGetValue = null;
        int dataIsConferenceCancelledViewVISIBLEViewGONE = 0;
        java.lang.String javaLangStringDataConferenceDuration = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataConferenceDuration = null;
        java.lang.Boolean dataShowDurationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataConferenceDescription = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue = false;
        java.lang.Boolean dataIsBroadcastGetValue = null;
        java.lang.String dataConferenceSubjectGetValue = null;
        java.lang.String dataConferenceParticipantCountGetValue = null;
        boolean dataIsConferenceCancelled = false;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        boolean dataConferenceDescriptionLengthInt0 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakerGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsConferenceCancelled1 = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsSpeaker = null;
        int dataIsConferenceUpdatedBooleanTrueDataIsConferenceCancelledViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataConferenceTime = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataConferenceSubject = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataConferenceParticipantCount = null;
        int dataConferenceDescriptionLengthInt0ViewGONEViewVISIBLE = 0;
        java.lang.String dataShowDurationJavaLangStringDataConferenceDurationJavaLangStringJavaLangString = null;
        int dataIsConferenceUpdatedViewVISIBLEViewGONE = 0;
        int dataIsConferenceCancelledViewGONEViewVISIBLE = 0;
        java.lang.String dataConferenceDateGetValue = null;
        java.lang.Boolean dataIsConferenceCancelledGetValue = null;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        boolean dataIsConferenceUpdatedBooleanTrueDataIsConferenceCancelled = false;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        boolean dataIsOutgoingBooleanTrueDataIsConferenceCancelled = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataShowDurationGetValue = false;
        java.lang.String dataConferenceDurationGetValue = null;
        int dataConferenceDescriptionLength = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataConferenceDate = null;
        boolean dataIsOutgoing = false;
        java.lang.Boolean dataIsSpeakerGetValue = null;
        java.lang.String dataConferenceTimeDataShowDurationJavaLangStringDataConferenceDurationJavaLangStringJavaLangString = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsBroadcast = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsConferenceUpdated = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceUpdatedGetValue = false;

        if ((dirtyFlags & 0x4fffL) != 0) {


            if ((dirtyFlags & 0x4823L) != 0) {

                    if (data != null) {
                        // read data.showDuration
                        dataShowDuration = data.getShowDuration();
                        // read data.conferenceTime
                        dataConferenceTime = data.getConferenceTime();
                    }
                    updateLiveDataRegistration(0, dataShowDuration);
                    updateLiveDataRegistration(5, dataConferenceTime);


                    if (dataShowDuration != null) {
                        // read data.showDuration.getValue()
                        dataShowDurationGetValue = dataShowDuration.getValue();
                    }
                    if (dataConferenceTime != null) {
                        // read data.conferenceTime.getValue()
                        dataConferenceTimeGetValue = dataConferenceTime.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showDuration.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataShowDurationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataShowDurationGetValue);
                if((dirtyFlags & 0x4823L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataShowDurationGetValue) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x4804L) != 0) {

                    if (data != null) {
                        // read data.conferenceDescription
                        dataConferenceDescription = data.getConferenceDescription();
                    }
                    updateLiveDataRegistration(2, dataConferenceDescription);


                    if (dataConferenceDescription != null) {
                        // read data.conferenceDescription.getValue()
                        dataConferenceDescriptionGetValue = dataConferenceDescription.getValue();
                    }


                    if (dataConferenceDescriptionGetValue != null) {
                        // read data.conferenceDescription.getValue().length()
                        dataConferenceDescriptionLength = dataConferenceDescriptionGetValue.length();
                    }


                    // read data.conferenceDescription.getValue().length() == 0
                    dataConferenceDescriptionLengthInt0 = (dataConferenceDescriptionLength) == (0);
                if((dirtyFlags & 0x4804L) != 0) {
                    if(dataConferenceDescriptionLengthInt0) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read data.conferenceDescription.getValue().length() == 0 ? View.GONE : View.VISIBLE
                    dataConferenceDescriptionLengthInt0ViewGONEViewVISIBLE = ((dataConferenceDescriptionLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x4808L) != 0) {

                    if (data != null) {
                        // read data.isConferenceCancelled
                        DataIsConferenceCancelled1 = data.isConferenceCancelled();
                        // read data.isOutgoing
                        dataIsOutgoing = data.isOutgoing();
                    }
                    updateLiveDataRegistration(3, DataIsConferenceCancelled1);
                if((dirtyFlags & 0x4808L) != 0) {
                    if(dataIsOutgoing) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }


                    if (DataIsConferenceCancelled1 != null) {
                        // read data.isConferenceCancelled.getValue()
                        dataIsConferenceCancelledGetValue = DataIsConferenceCancelled1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsConferenceCancelledGetValue);
                if((dirtyFlags & 0x4808L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) {
                            dirtyFlags |= 0x400000L;
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.VISIBLE : View.GONE
                    dataIsConferenceCancelledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.GONE : View.VISIBLE
                    dataIsConferenceCancelledViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x4840L) != 0) {

                    if (data != null) {
                        // read data.conferenceSubject
                        dataConferenceSubject = data.getConferenceSubject();
                    }
                    updateLiveDataRegistration(6, dataConferenceSubject);


                    if (dataConferenceSubject != null) {
                        // read data.conferenceSubject.getValue()
                        dataConferenceSubjectGetValue = dataConferenceSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x4880L) != 0) {

                    if (data != null) {
                        // read data.conferenceParticipantCount
                        dataConferenceParticipantCount = data.getConferenceParticipantCount();
                    }
                    updateLiveDataRegistration(7, dataConferenceParticipantCount);


                    if (dataConferenceParticipantCount != null) {
                        // read data.conferenceParticipantCount.getValue()
                        dataConferenceParticipantCountGetValue = dataConferenceParticipantCount.getValue();
                    }
            }
            if ((dirtyFlags & 0x4900L) != 0) {

                    if (data != null) {
                        // read data.conferenceDate
                        dataConferenceDate = data.getConferenceDate();
                    }
                    updateLiveDataRegistration(8, dataConferenceDate);


                    if (dataConferenceDate != null) {
                        // read data.conferenceDate.getValue()
                        dataConferenceDateGetValue = dataConferenceDate.getValue();
                    }
            }
            if ((dirtyFlags & 0x4a10L) != 0) {

                    if (data != null) {
                        // read data.isBroadcast
                        dataIsBroadcast = data.isBroadcast();
                    }
                    updateLiveDataRegistration(9, dataIsBroadcast);


                    if (dataIsBroadcast != null) {
                        // read data.isBroadcast.getValue()
                        dataIsBroadcastGetValue = dataIsBroadcast.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsBroadcastGetValue);
                if((dirtyFlags & 0x4a10L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x4a00L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }

                if ((dirtyFlags & 0x4a00L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? @android:string/conference_broadcast_invite_title : @android:string/conference_invite_title
                        dataIsBroadcastMboundView1AndroidStringConferenceBroadcastInviteTitleMboundView1AndroidStringConferenceInviteTitle = ((androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue) ? (mboundView1.getResources().getString(R.string.conference_broadcast_invite_title)) : (mboundView1.getResources().getString(R.string.conference_invite_title)));
                }
            }
            if ((dirtyFlags & 0x4c08L) != 0) {

                    if (data != null) {
                        // read data.isConferenceUpdated
                        dataIsConferenceUpdated = data.isConferenceUpdated();
                    }
                    updateLiveDataRegistration(10, dataIsConferenceUpdated);


                    if (dataIsConferenceUpdated != null) {
                        // read data.isConferenceUpdated.getValue()
                        dataIsConferenceUpdatedGetValue = dataIsConferenceUpdated.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceUpdatedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsConferenceUpdatedGetValue);
                if((dirtyFlags & 0x4c00L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceUpdatedGetValue) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }
                if((dirtyFlags & 0x4c08L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceUpdatedGetValue) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }

                if ((dirtyFlags & 0x4c00L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue()) ? View.VISIBLE : View.GONE
                        dataIsConferenceUpdatedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceUpdatedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
        }
        if ((dirtyFlags & 0x5000L) != 0) {
        }
        if ((dirtyFlags & 0x6000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        // batch finished

        if ((dirtyFlags & 0x10000000L) != 0) {

                if (data != null) {
                    // read data.conferenceDuration
                    dataConferenceDuration = data.getConferenceDuration();
                }
                updateLiveDataRegistration(1, dataConferenceDuration);


                if (dataConferenceDuration != null) {
                    // read data.conferenceDuration.getValue()
                    dataConferenceDurationGetValue = dataConferenceDuration.getValue();
                }


                // read (" (") + (data.conferenceDuration.getValue())
                javaLangStringDataConferenceDuration = (" (") + (dataConferenceDurationGetValue);


                // read ((" (") + (data.conferenceDuration.getValue())) + (")")
                javaLangStringDataConferenceDurationJavaLangString = (javaLangStringDataConferenceDuration) + (")");
        }
        if ((dirtyFlags & 0xa00000000L) != 0) {

                if (data != null) {
                    // read data.isConferenceCancelled
                    DataIsConferenceCancelled1 = data.isConferenceCancelled();
                }
                updateLiveDataRegistration(3, DataIsConferenceCancelled1);


                if (DataIsConferenceCancelled1 != null) {
                    // read data.isConferenceCancelled.getValue()
                    dataIsConferenceCancelledGetValue = DataIsConferenceCancelled1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsConferenceCancelledGetValue);
            if((dirtyFlags & 0x4808L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) {
                        dirtyFlags |= 0x400000L;
                        dirtyFlags |= 0x100000000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                        dirtyFlags |= 0x80000000L;
                }
            }

            if ((dirtyFlags & 0x800000000L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
                    dataIsConferenceCancelled = !androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue;
            }
        }
        if ((dirtyFlags & 0x40000L) != 0) {

                if (data != null) {
                    // read data.isSpeaker
                    dataIsSpeaker = data.isSpeaker();
                }
                updateLiveDataRegistration(4, dataIsSpeaker);


                if (dataIsSpeaker != null) {
                    // read data.isSpeaker.getValue()
                    dataIsSpeakerGetValue = dataIsSpeaker.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsSpeakerGetValue);
        }

        if ((dirtyFlags & 0x4a10L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue()) : false
                dataIsBroadcastDataIsSpeakerBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakerGetValue) : (false));
            if((dirtyFlags & 0x4a10L) != 0) {
                if(dataIsBroadcastDataIsSpeakerBooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue()) : false ? View.VISIBLE : View.GONE
                dataIsBroadcastDataIsSpeakerBooleanFalseViewVISIBLEViewGONE = ((dataIsBroadcastDataIsSpeakerBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x4823L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.showDuration.getValue()) ? ((" (") + (data.conferenceDuration.getValue())) + (")") : ""
                dataShowDurationJavaLangStringDataConferenceDurationJavaLangStringJavaLangString = ((androidxDatabindingViewDataBindingSafeUnboxDataShowDurationGetValue) ? (javaLangStringDataConferenceDurationJavaLangString) : (""));


                // read (data.conferenceTime.getValue()) + (androidx.databinding.ViewDataBinding.safeUnbox(data.showDuration.getValue()) ? ((" (") + (data.conferenceDuration.getValue())) + (")") : "")
                dataConferenceTimeDataShowDurationJavaLangStringDataConferenceDurationJavaLangStringJavaLangString = (dataConferenceTimeGetValue) + (dataShowDurationJavaLangStringDataConferenceDurationJavaLangStringJavaLangString);
        }
        if ((dirtyFlags & 0x4c08L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
                dataIsConferenceUpdatedBooleanTrueDataIsConferenceCancelled = ((androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceUpdatedGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue));
            if((dirtyFlags & 0x4c08L) != 0) {
                if(dataIsConferenceUpdatedBooleanTrueDataIsConferenceCancelled) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.GONE : View.VISIBLE
                dataIsConferenceUpdatedBooleanTrueDataIsConferenceCancelledViewGONEViewVISIBLE = ((dataIsConferenceUpdatedBooleanTrueDataIsConferenceCancelled) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x4808L) != 0) {

                // read data.isOutgoing ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
                dataIsOutgoingBooleanTrueDataIsConferenceCancelled = ((dataIsOutgoing) ? (true) : (dataIsConferenceCancelled));
        }
        // batch finished
        if ((dirtyFlags & 0x4808L) != 0) {
            // api target 1

            this.joinConference.setEnabled(dataIsOutgoingBooleanTrueDataIsConferenceCancelled);
            this.mboundView3.setVisibility(dataIsConferenceCancelledViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(dataIsConferenceCancelledViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x4000L) != 0) {
            // api target 1

            this.joinConference.setOnClickListener(mCallback215);
            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.mboundView0, true);
            this.mboundView11.setOnClickListener(mCallback214);
        }
        if ((dirtyFlags & 0x5000L) != 0) {
            // api target 1

            this.mboundView0.setOnLongClickListener(longClickListener);
        }
        if ((dirtyFlags & 0x6000L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x4a00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataIsBroadcastMboundView1AndroidStringConferenceBroadcastInviteTitleMboundView1AndroidStringConferenceInviteTitle);
        }
        if ((dirtyFlags & 0x4c08L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(dataIsConferenceUpdatedBooleanTrueDataIsConferenceCancelledViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x4804L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(dataConferenceDescriptionLengthInt0ViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, dataConferenceDescriptionGetValue);
            this.mboundView9.setVisibility(dataConferenceDescriptionLengthInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x4c00L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(dataIsConferenceUpdatedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4840L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataConferenceSubjectGetValue);
        }
        if ((dirtyFlags & 0x4880L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataConferenceParticipantCountGetValue);
        }
        if ((dirtyFlags & 0x4a10L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(dataIsBroadcastDataIsSpeakerBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x4900L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, dataConferenceDateGetValue);
        }
        if ((dirtyFlags & 0x4823L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, dataConferenceTimeDataShowDurationJavaLangStringDataConferenceDurationJavaLangStringJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.openFile();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.callConferenceAddress();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.showDuration
        flag 1 (0x2L): data.conferenceDuration
        flag 2 (0x3L): data.conferenceDescription
        flag 3 (0x4L): data.isConferenceCancelled
        flag 4 (0x5L): data.isSpeaker
        flag 5 (0x6L): data.conferenceTime
        flag 6 (0x7L): data.conferenceSubject
        flag 7 (0x8L): data.conferenceParticipantCount
        flag 8 (0x9L): data.conferenceDate
        flag 9 (0xaL): data.isBroadcast
        flag 10 (0xbL): data.isConferenceUpdated
        flag 11 (0xcL): data
        flag 12 (0xdL): longClickListener
        flag 13 (0xeL): inflatedVisibility
        flag 14 (0xfL): null
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue()) : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue()) : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue()) : false
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue()) : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? @android:string/conference_broadcast_invite_title : @android:string/conference_invite_title
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? @android:string/conference_broadcast_invite_title : @android:string/conference_invite_title
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.GONE : View.VISIBLE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): data.conferenceDescription.getValue().length() == 0 ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): data.conferenceDescription.getValue().length() == 0 ? View.GONE : View.VISIBLE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(data.showDuration.getValue()) ? ((" (") + (data.conferenceDuration.getValue())) + (")") : ""
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(data.showDuration.getValue()) ? ((" (") + (data.conferenceDuration.getValue())) + (")") : ""
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.GONE : View.VISIBLE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.GONE : View.VISIBLE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceUpdated.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
        flag 35 (0x24L): data.isOutgoing ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
        flag 36 (0x25L): data.isOutgoing ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
    flag mapping end*/
    //end
}