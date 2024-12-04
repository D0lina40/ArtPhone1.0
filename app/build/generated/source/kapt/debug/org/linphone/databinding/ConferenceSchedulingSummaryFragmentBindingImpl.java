package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConferenceSchedulingSummaryFragmentBindingImpl extends ConferenceSchedulingSummaryFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(21);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {19},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.back, 20);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.EditText mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.LinearLayout mboundView16;
    @NonNull
    private final android.widget.TextView mboundView17;
    @NonNull
    private final android.widget.TextView mboundView18;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.EditText mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ConferenceSchedulingSummaryFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private ConferenceSchedulingSummaryFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 13
            , (android.widget.ImageView) bindings[20]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[19];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.EditText) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.LinearLayout) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.widget.TextView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.TextView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback5 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4000L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelParticipantsData((androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>>) object, fieldId);
            case 1 :
                return onChangeViewModelFormattedDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelDuration((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration>) object, fieldId);
            case 3 :
                return onChangeViewModelFormattedTime((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelConferenceCreationInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelTimeZone((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData>) object, fieldId);
            case 8 :
                return onChangeViewModelSpeakersData((androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>>) object, fieldId);
            case 9 :
                return onChangeViewModelIsUpdate((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeViewModelScheduleForLater((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelIsEncrypted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeViewModelSendInviteViaChat((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelParticipantsData(androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> ViewModelParticipantsData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFormattedDate(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFormattedDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDuration(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration> ViewModelDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFormattedTime(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFormattedTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSubject(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelConferenceCreationInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelConferenceCreationInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDescription(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTimeZone(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData> ViewModelTimeZone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSpeakersData(androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> ViewModelSpeakersData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsUpdate(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsUpdate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelScheduleForLater(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelScheduleForLater, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsEncrypted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsEncrypted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSendInviteViaChat(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSendInviteViaChat, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
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
        java.lang.Boolean viewModelIsUpdateGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> viewModelParticipantsData = null;
        int viewModelScheduleForLaterViewVISIBLEViewGONE = 0;
        int viewModelIsModeBroadcastCurrentlySelectedViewModelSpeakersDataSizeInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue = false;
        java.lang.String viewModelScheduleForLaterMboundView17AndroidStringConferenceScheduleStartMboundView17AndroidStringConferenceGroupCallCreate = null;
        boolean viewModelIsModeBroadcastCurrentlySelected = false;
        boolean viewModelParticipantsDataSizeInt0ViewModelSpeakersDataSizeInt0BooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFormattedDate = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.Duration> viewModelDuration = null;
        boolean viewModelDescriptionLengthInt0 = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFormattedTime = null;
        java.lang.String viewModelDescriptionGetValue = null;
        int viewModelParticipantsDataSizeInt0ViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSubject = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelConferenceCreationInProgress = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue = false;
        java.lang.String viewModelIsUpdateMboundView18AndroidStringConferenceBroadcastEditMboundView18AndroidStringConferenceBroadcastStart = null;
        java.lang.String viewModelFormattedTimeGetValue = null;
        boolean viewModelScheduleForLaterViewModelSendInviteViaChatBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDescription = null;
        org.linphone.activities.main.conference.data.TimeZoneData viewModelTimeZoneGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.TimeZoneData> viewModelTimeZone = null;
        androidx.lifecycle.MutableLiveData<java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> viewModelSpeakersData = null;
        java.lang.Boolean viewModelSendInviteViaChatGetValue = null;
        java.lang.String viewModelTimeZoneToString = null;
        boolean viewModelSpeakersDataSizeInt0 = false;
        java.lang.String viewModelFormattedDateGetValue = null;
        java.lang.Boolean viewModelScheduleForLaterGetValue = null;
        java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData> viewModelParticipantsDataGetValue = null;
        java.lang.Boolean viewModelConferenceCreationInProgressGetValue = null;
        int viewModelIsModeBroadcastCurrentlySelectedViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsUpdate = null;
        java.lang.String viewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleSummaryMboundView1AndroidStringConferenceGroupCallSummary = null;
        boolean viewModelParticipantsDataSizeInt0 = false;
        java.lang.String viewModelDurationToString = null;
        int viewModelDescriptionLengthInt0ViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelScheduleForLater = null;
        int viewModelParticipantsDataSize = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEncrypted = null;
        java.lang.String viewModelSubjectGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSendInviteViaChat = null;
        int viewModelIsModeBroadcastCurrentlySelectedViewVISIBLEViewGONE = 0;
        int viewModelSpeakersDataSize = 0;
        boolean viewModelIsModeBroadcastCurrentlySelectedViewModelSpeakersDataSizeInt0BooleanFalse = false;
        boolean ViewModelSpeakersDataSizeInt01 = false;
        java.util.List<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData> viewModelSpeakersDataGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue = false;
        java.lang.Boolean viewModelIsEncryptedGetValue = null;
        org.linphone.activities.main.conference.data.Duration viewModelDurationGetValue = null;
        int viewModelDescriptionLength = 0;
        int viewModelIsEncryptedViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSendInviteViaChatGetValue = false;
        boolean ViewModelParticipantsDataSizeInt01 = false;
        int viewModelScheduleForLaterViewModelSendInviteViaChatBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String viewModelIsUpdateMboundView17AndroidStringConferenceScheduleEditViewModelScheduleForLaterMboundView17AndroidStringConferenceScheduleStartMboundView17AndroidStringConferenceGroupCallCreate = null;
        org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
        java.lang.String viewModelIsModeBroadcastCurrentlySelectedMboundView1AndroidStringConferenceScheduleBroadcastSummaryViewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleSummaryMboundView1AndroidStringConferenceGroupCallSummary = null;

        if ((dirtyFlags & 0x7fffL) != 0) {


            if ((dirtyFlags & 0x6101L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.participantsData
                        viewModelParticipantsData = viewModel.getParticipantsData();
                    }
                    updateLiveDataRegistration(0, viewModelParticipantsData);


                    if (viewModelParticipantsData != null) {
                        // read viewModel.participantsData.getValue()
                        viewModelParticipantsDataGetValue = viewModelParticipantsData.getValue();
                    }


                    if (viewModelParticipantsDataGetValue != null) {
                        // read viewModel.participantsData.getValue().size()
                        viewModelParticipantsDataSize = viewModelParticipantsDataGetValue.size();
                    }


                    // read viewModel.participantsData.getValue().size() != 0
                    viewModelParticipantsDataSizeInt0 = (viewModelParticipantsDataSize) != (0);
                if((dirtyFlags & 0x6101L) != 0) {
                    if(viewModelParticipantsDataSizeInt0) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
                if ((dirtyFlags & 0x6001L) != 0) {

                        // read viewModel.participantsData.getValue().size() == 0
                        ViewModelParticipantsDataSizeInt01 = (viewModelParticipantsDataSize) == (0);
                    if((dirtyFlags & 0x6001L) != 0) {
                        if(ViewModelParticipantsDataSizeInt01) {
                                dirtyFlags |= 0x1000000L;
                        }
                        else {
                                dirtyFlags |= 0x800000L;
                        }
                    }


                        // read viewModel.participantsData.getValue().size() == 0 ? View.VISIBLE : View.GONE
                        viewModelParticipantsDataSizeInt0ViewVISIBLEViewGONE = ((ViewModelParticipantsDataSizeInt01) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
                if ((dirtyFlags & 0x6001L) != 0) {
                }
            }
            if ((dirtyFlags & 0x6500L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isModeBroadcastCurrentlySelected()
                        viewModelIsModeBroadcastCurrentlySelected = viewModel.isModeBroadcastCurrentlySelected();
                    }
                if((dirtyFlags & 0x6000L) != 0) {
                    if(viewModelIsModeBroadcastCurrentlySelected) {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x800000000L;
                    }
                }
                if((dirtyFlags & 0x6100L) != 0) {
                    if(viewModelIsModeBroadcastCurrentlySelected) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }
                if((dirtyFlags & 0x6400L) != 0) {
                    if(viewModelIsModeBroadcastCurrentlySelected) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }

                if ((dirtyFlags & 0x6000L) != 0) {

                        // read viewModel.isModeBroadcastCurrentlySelected() ? View.GONE : View.VISIBLE
                        viewModelIsModeBroadcastCurrentlySelectedViewGONEViewVISIBLE = ((viewModelIsModeBroadcastCurrentlySelected) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read viewModel.isModeBroadcastCurrentlySelected() ? View.VISIBLE : View.GONE
                        viewModelIsModeBroadcastCurrentlySelectedViewVISIBLEViewGONE = ((viewModelIsModeBroadcastCurrentlySelected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x6002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.formattedDate
                        viewModelFormattedDate = viewModel.getFormattedDate();
                    }
                    updateLiveDataRegistration(1, viewModelFormattedDate);


                    if (viewModelFormattedDate != null) {
                        // read viewModel.formattedDate.getValue()
                        viewModelFormattedDateGetValue = viewModelFormattedDate.getValue();
                    }
            }
            if ((dirtyFlags & 0x6004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.duration
                        viewModelDuration = viewModel.getDuration();
                    }
                    updateLiveDataRegistration(2, viewModelDuration);


                    if (viewModelDuration != null) {
                        // read viewModel.duration.getValue()
                        viewModelDurationGetValue = viewModelDuration.getValue();
                    }


                    if (viewModelDurationGetValue != null) {
                        // read viewModel.duration.getValue().toString()
                        viewModelDurationToString = viewModelDurationGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x6008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.formattedTime
                        viewModelFormattedTime = viewModel.getFormattedTime();
                    }
                    updateLiveDataRegistration(3, viewModelFormattedTime);


                    if (viewModelFormattedTime != null) {
                        // read viewModel.formattedTime.getValue()
                        viewModelFormattedTimeGetValue = viewModelFormattedTime.getValue();
                    }
            }
            if ((dirtyFlags & 0x6010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subject
                        viewModelSubject = viewModel.getSubject();
                    }
                    updateLiveDataRegistration(4, viewModelSubject);


                    if (viewModelSubject != null) {
                        // read viewModel.subject.getValue()
                        viewModelSubjectGetValue = viewModelSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x6020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.conferenceCreationInProgress
                        viewModelConferenceCreationInProgress = viewModel.getConferenceCreationInProgress();
                    }
                    updateLiveDataRegistration(5, viewModelConferenceCreationInProgress);


                    if (viewModelConferenceCreationInProgress != null) {
                        // read viewModel.conferenceCreationInProgress.getValue()
                        viewModelConferenceCreationInProgressGetValue = viewModelConferenceCreationInProgress.getValue();
                    }
            }
            if ((dirtyFlags & 0x6040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.description
                        viewModelDescription = viewModel.getDescription();
                    }
                    updateLiveDataRegistration(6, viewModelDescription);


                    if (viewModelDescription != null) {
                        // read viewModel.description.getValue()
                        viewModelDescriptionGetValue = viewModelDescription.getValue();
                    }


                    if (viewModelDescriptionGetValue != null) {
                        // read viewModel.description.getValue().length()
                        viewModelDescriptionLength = viewModelDescriptionGetValue.length();
                    }


                    // read viewModel.description.getValue().length() == 0
                    viewModelDescriptionLengthInt0 = (viewModelDescriptionLength) == (0);
                if((dirtyFlags & 0x6040L) != 0) {
                    if(viewModelDescriptionLengthInt0) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read viewModel.description.getValue().length() == 0 ? View.GONE : View.VISIBLE
                    viewModelDescriptionLengthInt0ViewGONEViewVISIBLE = ((viewModelDescriptionLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x6080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.timeZone
                        viewModelTimeZone = viewModel.getTimeZone();
                    }
                    updateLiveDataRegistration(7, viewModelTimeZone);


                    if (viewModelTimeZone != null) {
                        // read viewModel.timeZone.getValue()
                        viewModelTimeZoneGetValue = viewModelTimeZone.getValue();
                    }


                    if (viewModelTimeZoneGetValue != null) {
                        // read viewModel.timeZone.getValue().toString()
                        viewModelTimeZoneToString = viewModelTimeZoneGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x6100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.speakersData
                        viewModelSpeakersData = viewModel.getSpeakersData();
                    }
                    updateLiveDataRegistration(8, viewModelSpeakersData);


                    if (viewModelSpeakersData != null) {
                        // read viewModel.speakersData.getValue()
                        viewModelSpeakersDataGetValue = viewModelSpeakersData.getValue();
                    }
            }
            if ((dirtyFlags & 0x6600L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isUpdate
                        viewModelIsUpdate = viewModel.isUpdate();
                    }
                    updateLiveDataRegistration(9, viewModelIsUpdate);


                    if (viewModelIsUpdate != null) {
                        // read viewModel.isUpdate.getValue()
                        viewModelIsUpdateGetValue = viewModelIsUpdate.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsUpdateGetValue);
                if((dirtyFlags & 0x6200L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
                if((dirtyFlags & 0x6600L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue) {
                            dirtyFlags |= 0x100000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000L;
                    }
                }

                if ((dirtyFlags & 0x6200L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_broadcast_edit : @android:string/conference_broadcast_start
                        viewModelIsUpdateMboundView18AndroidStringConferenceBroadcastEditMboundView18AndroidStringConferenceBroadcastStart = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue) ? (mboundView18.getResources().getString(R.string.conference_broadcast_edit)) : (mboundView18.getResources().getString(R.string.conference_broadcast_start)));
                }
            }
            if ((dirtyFlags & 0x7400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.scheduleForLater
                        viewModelScheduleForLater = viewModel.getScheduleForLater();
                    }
                    updateLiveDataRegistration(10, viewModelScheduleForLater);


                    if (viewModelScheduleForLater != null) {
                        // read viewModel.scheduleForLater.getValue()
                        viewModelScheduleForLaterGetValue = viewModelScheduleForLater.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelScheduleForLaterGetValue);
                if((dirtyFlags & 0x6400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
                if((dirtyFlags & 0x80000000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x7400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
                if((dirtyFlags & 0x200000000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }

                if ((dirtyFlags & 0x6400L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? View.VISIBLE : View.GONE
                        viewModelScheduleForLaterViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x6800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEncrypted
                        viewModelIsEncrypted = viewModel.isEncrypted();
                    }
                    updateLiveDataRegistration(11, viewModelIsEncrypted);


                    if (viewModelIsEncrypted != null) {
                        // read viewModel.isEncrypted.getValue()
                        viewModelIsEncryptedGetValue = viewModelIsEncrypted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEncrypted.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEncryptedGetValue);
                if((dirtyFlags & 0x6800L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEncrypted.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsEncryptedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000400000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.speakersData
                    viewModelSpeakersData = viewModel.getSpeakersData();
                }
                updateLiveDataRegistration(8, viewModelSpeakersData);


                if (viewModelSpeakersData != null) {
                    // read viewModel.speakersData.getValue()
                    viewModelSpeakersDataGetValue = viewModelSpeakersData.getValue();
                }


                if (viewModelSpeakersDataGetValue != null) {
                    // read viewModel.speakersData.getValue().size()
                    viewModelSpeakersDataSize = viewModelSpeakersDataGetValue.size();
                }

            if ((dirtyFlags & 0x400000L) != 0) {

                    // read viewModel.speakersData.getValue().size() != 0
                    viewModelSpeakersDataSizeInt0 = (viewModelSpeakersDataSize) != (0);
            }
            if ((dirtyFlags & 0x4000000000L) != 0) {

                    // read viewModel.speakersData.getValue().size() == 0
                    ViewModelSpeakersDataSizeInt01 = (viewModelSpeakersDataSize) == (0);
            }
        }
        if ((dirtyFlags & 0x280000000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.scheduleForLater
                    viewModelScheduleForLater = viewModel.getScheduleForLater();
                }
                updateLiveDataRegistration(10, viewModelScheduleForLater);


                if (viewModelScheduleForLater != null) {
                    // read viewModel.scheduleForLater.getValue()
                    viewModelScheduleForLaterGetValue = viewModelScheduleForLater.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelScheduleForLaterGetValue);
            if((dirtyFlags & 0x6400L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }
            if((dirtyFlags & 0x80000000000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
            if((dirtyFlags & 0x7400L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }
            if((dirtyFlags & 0x200000000000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) {
                        dirtyFlags |= 0x100000000L;
                }
                else {
                        dirtyFlags |= 0x80000000L;
                }
            }

            if ((dirtyFlags & 0x80000000000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_start : @android:string/conference_group_call_create
                    viewModelScheduleForLaterMboundView17AndroidStringConferenceScheduleStartMboundView17AndroidStringConferenceGroupCallCreate = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) ? (mboundView17.getResources().getString(R.string.conference_schedule_start)) : (mboundView17.getResources().getString(R.string.conference_group_call_create)));
            }
            if ((dirtyFlags & 0x200000000000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_summary : @android:string/conference_group_call_summary
                    viewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleSummaryMboundView1AndroidStringConferenceGroupCallSummary = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) ? (mboundView1.getResources().getString(R.string.conference_schedule_summary)) : (mboundView1.getResources().getString(R.string.conference_group_call_summary)));
            }
        }

        if ((dirtyFlags & 0x6101L) != 0) {

                // read viewModel.participantsData.getValue().size() != 0 ? viewModel.speakersData.getValue().size() != 0 : false
                viewModelParticipantsDataSizeInt0ViewModelSpeakersDataSizeInt0BooleanFalse = ((viewModelParticipantsDataSizeInt0) ? (viewModelSpeakersDataSizeInt0) : (false));
        }
        if ((dirtyFlags & 0x6100L) != 0) {

                // read viewModel.isModeBroadcastCurrentlySelected() ? viewModel.speakersData.getValue().size() == 0 : false
                viewModelIsModeBroadcastCurrentlySelectedViewModelSpeakersDataSizeInt0BooleanFalse = ((viewModelIsModeBroadcastCurrentlySelected) ? (ViewModelSpeakersDataSizeInt01) : (false));
            if((dirtyFlags & 0x6100L) != 0) {
                if(viewModelIsModeBroadcastCurrentlySelectedViewModelSpeakersDataSizeInt0BooleanFalse) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }


                // read viewModel.isModeBroadcastCurrentlySelected() ? viewModel.speakersData.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
                viewModelIsModeBroadcastCurrentlySelectedViewModelSpeakersDataSizeInt0BooleanFalseViewVISIBLEViewGONE = ((viewModelIsModeBroadcastCurrentlySelectedViewModelSpeakersDataSizeInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6600L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_edit : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_start : @android:string/conference_group_call_create
                viewModelIsUpdateMboundView17AndroidStringConferenceScheduleEditViewModelScheduleForLaterMboundView17AndroidStringConferenceScheduleStartMboundView17AndroidStringConferenceGroupCallCreate = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsUpdateGetValue) ? (mboundView17.getResources().getString(R.string.conference_schedule_edit)) : (viewModelScheduleForLaterMboundView17AndroidStringConferenceScheduleStartMboundView17AndroidStringConferenceGroupCallCreate));
        }
        if ((dirtyFlags & 0x6400L) != 0) {

                // read viewModel.isModeBroadcastCurrentlySelected() ? @android:string/conference_schedule_broadcast_summary : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_summary : @android:string/conference_group_call_summary
                viewModelIsModeBroadcastCurrentlySelectedMboundView1AndroidStringConferenceScheduleBroadcastSummaryViewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleSummaryMboundView1AndroidStringConferenceGroupCallSummary = ((viewModelIsModeBroadcastCurrentlySelected) ? (mboundView1.getResources().getString(R.string.conference_schedule_broadcast_summary)) : (viewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleSummaryMboundView1AndroidStringConferenceGroupCallSummary));
        }
        // batch finished

        if ((dirtyFlags & 0x10000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.sendInviteViaChat
                    viewModelSendInviteViaChat = viewModel.getSendInviteViaChat();
                }
                updateLiveDataRegistration(12, viewModelSendInviteViaChat);


                if (viewModelSendInviteViaChat != null) {
                    // read viewModel.sendInviteViaChat.getValue()
                    viewModelSendInviteViaChatGetValue = viewModelSendInviteViaChat.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendInviteViaChat.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelSendInviteViaChatGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSendInviteViaChatGetValue);
        }

        if ((dirtyFlags & 0x7400L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendInviteViaChat.getValue()) : false
                viewModelScheduleForLaterViewModelSendInviteViaChatBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleForLaterGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelSendInviteViaChatGetValue) : (false));
            if((dirtyFlags & 0x7400L) != 0) {
                if(viewModelScheduleForLaterViewModelSendInviteViaChatBooleanFalse) {
                        dirtyFlags |= 0x40000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendInviteViaChat.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelScheduleForLaterViewModelSendInviteViaChatBooleanFalseViewVISIBLEViewGONE = ((viewModelScheduleForLaterViewModelSendInviteViaChatBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6020L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelConferenceCreationInProgressGetValue);
        }
        if ((dirtyFlags & 0x6400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelIsModeBroadcastCurrentlySelectedMboundView1AndroidStringConferenceScheduleBroadcastSummaryViewModelScheduleForLaterMboundView1AndroidStringConferenceScheduleSummaryMboundView1AndroidStringConferenceGroupCallSummary);
            this.mboundView4.setVisibility(viewModelScheduleForLaterViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewModelDescriptionGetValue);
            this.mboundView9.setVisibility(viewModelDescriptionLengthInt0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x7400L) != 0) {
            // api target 1

            this.mboundView11.setVisibility(viewModelScheduleForLaterViewModelSendInviteViaChatBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6000L) != 0) {
            // api target 1

            this.mboundView12.setVisibility(viewModelIsModeBroadcastCurrentlySelectedViewVISIBLEViewGONE);
            this.mboundView13.setVisibility(viewModelIsModeBroadcastCurrentlySelectedViewVISIBLEViewGONE);
            this.mboundView17.setVisibility(viewModelIsModeBroadcastCurrentlySelectedViewGONEViewVISIBLE);
            this.mboundView18.setVisibility(viewModelIsModeBroadcastCurrentlySelectedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6100L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView13, viewModelSpeakersDataGetValue, R.layout.conference_scheduling_participant_cell);
            this.mboundView14.setVisibility(viewModelIsModeBroadcastCurrentlySelectedViewModelSpeakersDataSizeInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6001L) != 0) {
            // api target 1

            this.mboundView15.setVisibility(viewModelParticipantsDataSizeInt0ViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView16, viewModelParticipantsDataGetValue, R.layout.conference_scheduling_participant_cell);
        }
        if ((dirtyFlags & 0x4000L) != 0) {
            // api target 1

            this.mboundView17.setOnClickListener(mCallback5);
            this.mboundView18.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0x6600L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView17, viewModelIsUpdateMboundView17AndroidStringConferenceScheduleEditViewModelScheduleForLaterMboundView17AndroidStringConferenceScheduleStartMboundView17AndroidStringConferenceGroupCallCreate);
        }
        if ((dirtyFlags & 0x6101L) != 0) {
            // api target 1

            this.mboundView18.setEnabled(viewModelParticipantsDataSizeInt0ViewModelSpeakersDataSizeInt0BooleanFalse);
        }
        if ((dirtyFlags & 0x6200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView18, viewModelIsUpdateMboundView18AndroidStringConferenceBroadcastEditMboundView18AndroidStringConferenceBroadcastStart);
        }
        if ((dirtyFlags & 0x6800L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelIsEncryptedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelSubjectGetValue);
        }
        if ((dirtyFlags & 0x6002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelFormattedDateGetValue);
        }
        if ((dirtyFlags & 0x6004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelDurationToString);
        }
        if ((dirtyFlags & 0x6008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelFormattedTimeGetValue);
        }
        if ((dirtyFlags & 0x6080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelTimeZoneToString);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.createConference();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.createConference();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.participantsData
        flag 1 (0x2L): viewModel.formattedDate
        flag 2 (0x3L): viewModel.duration
        flag 3 (0x4L): viewModel.formattedTime
        flag 4 (0x5L): viewModel.subject
        flag 5 (0x6L): viewModel.conferenceCreationInProgress
        flag 6 (0x7L): viewModel.description
        flag 7 (0x8L): viewModel.timeZone
        flag 8 (0x9L): viewModel.speakersData
        flag 9 (0xaL): viewModel.isUpdate
        flag 10 (0xbL): viewModel.scheduleForLater
        flag 11 (0xcL): viewModel.isEncrypted
        flag 12 (0xdL): viewModel.sendInviteViaChat
        flag 13 (0xeL): viewModel
        flag 14 (0xfL): null
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.isModeBroadcastCurrentlySelected() ? viewModel.speakersData.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.isModeBroadcastCurrentlySelected() ? viewModel.speakersData.getValue().size() == 0 : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_start : @android:string/conference_group_call_create
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_start : @android:string/conference_group_call_create
        flag 21 (0x16L): viewModel.participantsData.getValue().size() != 0 ? viewModel.speakersData.getValue().size() != 0 : false
        flag 22 (0x17L): viewModel.participantsData.getValue().size() != 0 ? viewModel.speakersData.getValue().size() != 0 : false
        flag 23 (0x18L): viewModel.participantsData.getValue().size() == 0 ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.participantsData.getValue().size() == 0 ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_broadcast_edit : @android:string/conference_broadcast_start
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_broadcast_edit : @android:string/conference_broadcast_start
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendInviteViaChat.getValue()) : false
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendInviteViaChat.getValue()) : false
        flag 29 (0x1eL): viewModel.isModeBroadcastCurrentlySelected() ? View.GONE : View.VISIBLE
        flag 30 (0x1fL): viewModel.isModeBroadcastCurrentlySelected() ? View.GONE : View.VISIBLE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_summary : @android:string/conference_group_call_summary
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_summary : @android:string/conference_group_call_summary
        flag 33 (0x22L): viewModel.description.getValue().length() == 0 ? View.GONE : View.VISIBLE
        flag 34 (0x23L): viewModel.description.getValue().length() == 0 ? View.GONE : View.VISIBLE
        flag 35 (0x24L): viewModel.isModeBroadcastCurrentlySelected() ? View.VISIBLE : View.GONE
        flag 36 (0x25L): viewModel.isModeBroadcastCurrentlySelected() ? View.VISIBLE : View.GONE
        flag 37 (0x26L): viewModel.isModeBroadcastCurrentlySelected() ? viewModel.speakersData.getValue().size() == 0 : false
        flag 38 (0x27L): viewModel.isModeBroadcastCurrentlySelected() ? viewModel.speakersData.getValue().size() == 0 : false
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEncrypted.getValue()) ? View.VISIBLE : View.GONE
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEncrypted.getValue()) ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendInviteViaChat.getValue()) : false ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sendInviteViaChat.getValue()) : false ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_edit : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_start : @android:string/conference_group_call_create
        flag 44 (0x2dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUpdate.getValue()) ? @android:string/conference_schedule_edit : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_start : @android:string/conference_group_call_create
        flag 45 (0x2eL): viewModel.isModeBroadcastCurrentlySelected() ? @android:string/conference_schedule_broadcast_summary : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_summary : @android:string/conference_group_call_summary
        flag 46 (0x2fL): viewModel.isModeBroadcastCurrentlySelected() ? @android:string/conference_schedule_broadcast_summary : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleForLater.getValue()) ? @android:string/conference_schedule_summary : @android:string/conference_group_call_summary
    flag mapping end*/
    //end
}