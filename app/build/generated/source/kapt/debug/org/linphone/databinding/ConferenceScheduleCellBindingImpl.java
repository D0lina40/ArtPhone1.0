package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConferenceScheduleCellBindingImpl extends ConferenceScheduleCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.time, 28);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView11;
    @NonNull
    private final android.widget.RelativeLayout mboundView12;
    @NonNull
    private final android.widget.LinearLayout mboundView18;
    @NonNull
    private final android.widget.TextView mboundView19;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView20;
    @NonNull
    private final android.widget.TextView mboundView21;
    @NonNull
    private final android.widget.LinearLayout mboundView22;
    @NonNull
    private final android.widget.TextView mboundView23;
    @NonNull
    private final android.widget.ImageView mboundView24;
    @NonNull
    private final android.widget.TextView mboundView25;
    @NonNull
    private final android.widget.ImageView mboundView26;
    @NonNull
    private final android.widget.ImageView mboundView27;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback201;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ConferenceScheduleCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 29, sIncludes, sViewsWithIds));
    }
    private ConferenceScheduleCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 18
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[16]
            , (android.widget.CheckBox) bindings[4]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.LinearLayout) bindings[28]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.ImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.RelativeLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView18 = (android.widget.LinearLayout) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (android.widget.TextView) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.widget.TextView) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView21 = (android.widget.TextView) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView22 = (android.widget.LinearLayout) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView23 = (android.widget.TextView) bindings[23];
        this.mboundView23.setTag(null);
        this.mboundView24 = (android.widget.ImageView) bindings[24];
        this.mboundView24.setTag(null);
        this.mboundView25 = (android.widget.TextView) bindings[25];
        this.mboundView25.setTag(null);
        this.mboundView26 = (android.widget.ImageView) bindings[26];
        this.mboundView26.setTag(null);
        this.mboundView27 = (android.widget.ImageView) bindings[27];
        this.mboundView27.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.meetingType.setTag(null);
        this.participantsList.setTag(null);
        this.participantsTitle.setTag(null);
        this.select.setTag(null);
        this.selectedInfo.setTag(null);
        this.speakersList.setTag(null);
        this.speakersTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback201 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8000000L;
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
        if (BR.deleteConferenceClickListener == variableId) {
            setDeleteConferenceClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.editConferenceClickListener == variableId) {
            setEditConferenceClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.joinConferenceClickListener == variableId) {
            setJoinConferenceClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.selectionListViewModel == variableId) {
            setSelectionListViewModel((org.linphone.activities.main.viewmodels.ListTopBarViewModel) variable);
        }
        else if (BR.data == variableId) {
            setData((org.linphone.activities.main.conference.data.ScheduledConferenceData) variable);
        }
        else if (BR.copyAddressClickListener == variableId) {
            setCopyAddressClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.longClickListener == variableId) {
            setLongClickListener((android.view.View.OnLongClickListener) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDeleteConferenceClickListener(@Nullable android.view.View.OnClickListener DeleteConferenceClickListener) {
        this.mDeleteConferenceClickListener = DeleteConferenceClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.deleteConferenceClickListener);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setEditConferenceClickListener(@Nullable android.view.View.OnClickListener EditConferenceClickListener) {
        this.mEditConferenceClickListener = EditConferenceClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100000L;
        }
        notifyPropertyChanged(BR.editConferenceClickListener);
        super.requestRebind();
    }
    public void setJoinConferenceClickListener(@Nullable android.view.View.OnClickListener JoinConferenceClickListener) {
        this.mJoinConferenceClickListener = JoinConferenceClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200000L;
        }
        notifyPropertyChanged(BR.joinConferenceClickListener);
        super.requestRebind();
    }
    public void setSelectionListViewModel(@Nullable org.linphone.activities.main.viewmodels.ListTopBarViewModel SelectionListViewModel) {
        this.mSelectionListViewModel = SelectionListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400000L;
        }
        notifyPropertyChanged(BR.selectionListViewModel);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.conference.data.ScheduledConferenceData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x800000L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setCopyAddressClickListener(@Nullable android.view.View.OnClickListener CopyAddressClickListener) {
        this.mCopyAddressClickListener = CopyAddressClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1000000L;
        }
        notifyPropertyChanged(BR.copyAddressClickListener);
        super.requestRebind();
    }
    public void setLongClickListener(@Nullable android.view.View.OnLongClickListener LongClickListener) {
        this.mLongClickListener = LongClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2000000L;
        }
        notifyPropertyChanged(BR.longClickListener);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x4000000L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataParticipantsExpanded((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDataTime((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataParticipantsShort((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeDataDuration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeSelectionListViewModelSelectedItems((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>>) object, fieldId);
            case 5 :
                return onChangeDataShowDuration((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeDataSpeakersExpanded((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeDataCanEdit((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeDataIsConferenceCancelled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeDataExpanded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeDataSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeDataIsBroadcast((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeDataBackgroundResId((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 13 :
                return onChangeDataIsBroadcast1((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeSelectionListViewModelIsEditionEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 15 :
                return onChangeDataDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 16 :
                return onChangeDataOrganizer((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 17 :
                return onChangeDataAddress((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataParticipantsExpanded(androidx.lifecycle.MutableLiveData<java.lang.String> DataParticipantsExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataTime(androidx.lifecycle.MutableLiveData<java.lang.String> DataTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataParticipantsShort(androidx.lifecycle.MutableLiveData<java.lang.String> DataParticipantsShort, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDuration(androidx.lifecycle.MutableLiveData<java.lang.String> DataDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelSelectedItems(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> SelectionListViewModelSelectedItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataShowDuration(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataShowDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataSpeakersExpanded(androidx.lifecycle.MutableLiveData<java.lang.String> DataSpeakersExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataCanEdit(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataCanEdit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsConferenceCancelled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsConferenceCancelled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataExpanded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataExpanded, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataSubject(androidx.lifecycle.MutableLiveData<java.lang.String> DataSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsBroadcast(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsBroadcast, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataBackgroundResId(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataBackgroundResId, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsBroadcast1(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsBroadcast, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelIsEditionEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SelectionListViewModelIsEditionEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDescription(androidx.lifecycle.MutableLiveData<java.lang.String> DataDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataOrganizer(androidx.lifecycle.MutableLiveData<java.lang.String> DataOrganizer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataAddress(androidx.lifecycle.MutableLiveData<java.lang.String> DataAddress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
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
        java.lang.Boolean dataCanEditGetValue = null;
        android.view.View.OnClickListener deleteConferenceClickListener = mDeleteConferenceClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataParticipantsExpanded = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataTime = null;
        java.lang.Boolean selectionListViewModelIsEditionEnabledGetValue = null;
        int dataIsConferenceCancelledViewINVISIBLEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataParticipantsShort = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDuration = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> selectionListViewModelSelectedItems = null;
        java.lang.String dataCanEditMboundView6AndroidStringConferenceScheduledCancelledByMeMboundView6AndroidStringConferenceScheduledCancelledByOrganizer = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataShowDuration = null;
        java.lang.Boolean dataIsBroadcastGetValue = null;
        int dataIsConferenceCancelledViewVISIBLEViewGONE = 0;
        boolean dataCanEditDataIsConferenceCancelledBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataSpeakersExpanded = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String dataSubjectGetValue = null;
        int dataExpandedViewVISIBLEViewGONE = 0;
        boolean dataIsConferenceCancelled = false;
        android.view.View.OnClickListener editConferenceClickListener = mEditConferenceClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataCanEdit = null;
        int dataExpandedViewGONEViewVISIBLE = 0;
        int dataDescriptionLengthInt0ViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsConferenceCancelled1 = null;
        java.lang.String dataSpeakersExpandedGetValue = null;
        android.view.View.OnClickListener joinConferenceClickListener = mJoinConferenceClickListener;
        int androidxDatabindingViewDataBindingSafeUnboxDataBackgroundResIdGetValue = 0;
        java.lang.Boolean dataExpandedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataExpanded = null;
        java.lang.String dataDurationGetValue = null;
        java.lang.Boolean dataIsConferenceCancelledGetValue = null;
        java.lang.String dataDescriptionGetValue = null;
        java.lang.String javaLangStringDataDurationJavaLangString = null;
        java.lang.String dataParticipantsExpandedGetValue = null;
        java.lang.Integer dataBackgroundResIdGetValue = null;
        boolean dataIsBroadcast = false;
        int dataIsConferenceCancelledBooleanTrueDataIsBroadcastViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataSubject = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsBroadcast1 = null;
        java.lang.String dataIsBroadcastMboundView21AndroidStringConferenceScheduleBroadcastAddressTitleMboundView21AndroidStringConferenceScheduleAddressTitle = null;
        int dataCanEditDataIsConferenceCancelledBooleanFalseViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;
        boolean selectionListViewModelSelectedItemsContainsPosition = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataBackgroundResId = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = false;
        int selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsBroadcast2 = null;
        int dataDescriptionLength = 0;
        org.linphone.activities.main.conference.data.ScheduledConferenceData data = mData;
        java.lang.String dataAddressGetValue = null;
        java.lang.String dataOrganizerGetValue = null;
        java.lang.String dataIsBroadcastMeetingTypeAndroidStringConferenceBroadcastTitleMeetingTypeAndroidStringConferenceMeetingTitle = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> selectionListViewModelIsEditionEnabled = null;
        java.lang.Boolean dataShowDurationGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataCanEditGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDescription = null;
        boolean AndroidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue1 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabled = false;
        java.lang.Boolean DataIsBroadcastGetValue1 = null;
        java.lang.String mboundView5AndroidStringConferenceScheduleOrganizerJavaLangStringDataOrganizer = null;
        android.view.View.OnClickListener copyAddressClickListener = mCopyAddressClickListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataExpandedGetValue = false;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        java.lang.Integer position = mPosition;
        boolean SelectionListViewModelIsEditionEnabled1 = false;
        java.util.ArrayList<java.lang.Integer> selectionListViewModelSelectedItemsGetValue = null;
        int dataIsConferenceCancelledViewGONEViewVISIBLE = 0;
        java.lang.String dataTimeGetValue = null;
        java.lang.String javaLangStringDataDuration = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataOrganizer = null;
        boolean dataDescriptionLengthInt0 = false;
        java.lang.String dataParticipantsShortGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataShowDurationGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataAddress = null;
        int dataShowDurationViewVISIBLEViewGONE = 0;
        boolean dataIsConferenceCancelledBooleanTrueDataIsBroadcast = false;

        if ((dirtyFlags & 0x8040000L) != 0) {
        }
        if ((dirtyFlags & 0x8080000L) != 0) {
        }
        if ((dirtyFlags & 0x8100000L) != 0) {
        }
        if ((dirtyFlags & 0x8200000L) != 0) {
        }
        if ((dirtyFlags & 0xc404010L) != 0) {


            if ((dirtyFlags & 0xc400010L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.selectedItems
                        selectionListViewModelSelectedItems = selectionListViewModel.getSelectedItems();
                    }
                    updateLiveDataRegistration(4, selectionListViewModelSelectedItems);


                    if (selectionListViewModelSelectedItems != null) {
                        // read selectionListViewModel.selectedItems.getValue()
                        selectionListViewModelSelectedItemsGetValue = selectionListViewModelSelectedItems.getValue();
                    }
            }
            if ((dirtyFlags & 0x8404000L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.isEditionEnabled
                        selectionListViewModelIsEditionEnabled = selectionListViewModel.isEditionEnabled();
                    }
                    updateLiveDataRegistration(14, selectionListViewModelIsEditionEnabled);


                    if (selectionListViewModelIsEditionEnabled != null) {
                        // read selectionListViewModel.isEditionEnabled.getValue()
                        selectionListViewModelIsEditionEnabledGetValue = selectionListViewModelIsEditionEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModelIsEditionEnabledGetValue);
                if((dirtyFlags & 0x8404000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                            dirtyFlags |= 0x2000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
                    selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read !androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
                    SelectionListViewModelIsEditionEnabled1 = !androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue;


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabled = androidx.databinding.ViewDataBinding.safeUnbox(SelectionListViewModelIsEditionEnabled1);
            }
        }
        if ((dirtyFlags & 0x883bfefL) != 0) {


            if ((dirtyFlags & 0x8800001L) != 0) {

                    if (data != null) {
                        // read data.participantsExpanded
                        dataParticipantsExpanded = data.getParticipantsExpanded();
                    }
                    updateLiveDataRegistration(0, dataParticipantsExpanded);


                    if (dataParticipantsExpanded != null) {
                        // read data.participantsExpanded.getValue()
                        dataParticipantsExpandedGetValue = dataParticipantsExpanded.getValue();
                    }
            }
            if ((dirtyFlags & 0x8800002L) != 0) {

                    if (data != null) {
                        // read data.time
                        dataTime = data.getTime();
                    }
                    updateLiveDataRegistration(1, dataTime);


                    if (dataTime != null) {
                        // read data.time.getValue()
                        dataTimeGetValue = dataTime.getValue();
                    }
            }
            if ((dirtyFlags & 0x8800004L) != 0) {

                    if (data != null) {
                        // read data.participantsShort
                        dataParticipantsShort = data.getParticipantsShort();
                    }
                    updateLiveDataRegistration(2, dataParticipantsShort);


                    if (dataParticipantsShort != null) {
                        // read data.participantsShort.getValue()
                        dataParticipantsShortGetValue = dataParticipantsShort.getValue();
                    }
            }
            if ((dirtyFlags & 0x8800008L) != 0) {

                    if (data != null) {
                        // read data.duration
                        dataDuration = data.getDuration();
                    }
                    updateLiveDataRegistration(3, dataDuration);


                    if (dataDuration != null) {
                        // read data.duration.getValue()
                        dataDurationGetValue = dataDuration.getValue();
                    }


                    // read ("(") + (data.duration.getValue())
                    javaLangStringDataDuration = ("(") + (dataDurationGetValue);


                    // read (("(") + (data.duration.getValue())) + (")")
                    javaLangStringDataDurationJavaLangString = (javaLangStringDataDuration) + (")");
            }
            if ((dirtyFlags & 0x8800020L) != 0) {

                    if (data != null) {
                        // read data.showDuration
                        dataShowDuration = data.getShowDuration();
                    }
                    updateLiveDataRegistration(5, dataShowDuration);


                    if (dataShowDuration != null) {
                        // read data.showDuration.getValue()
                        dataShowDurationGetValue = dataShowDuration.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showDuration.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataShowDurationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataShowDurationGetValue);
                if((dirtyFlags & 0x8800020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataShowDurationGetValue) {
                            dirtyFlags |= 0x80000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showDuration.getValue()) ? View.VISIBLE : View.GONE
                    dataShowDurationViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataShowDurationGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x8800040L) != 0) {

                    if (data != null) {
                        // read data.speakersExpanded
                        dataSpeakersExpanded = data.getSpeakersExpanded();
                    }
                    updateLiveDataRegistration(6, dataSpeakersExpanded);


                    if (dataSpeakersExpanded != null) {
                        // read data.speakersExpanded.getValue()
                        dataSpeakersExpandedGetValue = dataSpeakersExpanded.getValue();
                    }
            }
            if ((dirtyFlags & 0x8800180L) != 0) {

                    if (data != null) {
                        // read data.canEdit
                        dataCanEdit = data.getCanEdit();
                    }
                    updateLiveDataRegistration(7, dataCanEdit);


                    if (dataCanEdit != null) {
                        // read data.canEdit.getValue()
                        dataCanEditGetValue = dataCanEdit.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataCanEditGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataCanEditGetValue);
                if((dirtyFlags & 0x8800080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataCanEditGetValue) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
                if((dirtyFlags & 0x8800180L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataCanEditGetValue) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }

                if ((dirtyFlags & 0x8800080L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue()) ? @android:string/conference_scheduled_cancelled_by_me : @android:string/conference_scheduled_cancelled_by_organizer
                        dataCanEditMboundView6AndroidStringConferenceScheduledCancelledByMeMboundView6AndroidStringConferenceScheduledCancelledByOrganizer = ((androidxDatabindingViewDataBindingSafeUnboxDataCanEditGetValue) ? (mboundView6.getResources().getString(R.string.conference_scheduled_cancelled_by_me)) : (mboundView6.getResources().getString(R.string.conference_scheduled_cancelled_by_organizer)));
                }
            }
            if ((dirtyFlags & 0x8800900L) != 0) {

                    if (data != null) {
                        // read data.isConferenceCancelled
                        DataIsConferenceCancelled1 = data.isConferenceCancelled();
                    }
                    updateLiveDataRegistration(8, DataIsConferenceCancelled1);


                    if (DataIsConferenceCancelled1 != null) {
                        // read data.isConferenceCancelled.getValue()
                        dataIsConferenceCancelledGetValue = DataIsConferenceCancelled1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsConferenceCancelledGetValue);
                if((dirtyFlags & 0x8800100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) {
                            dirtyFlags |= 0x20000000L;
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags |= 0x20000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x10000000000000L;
                    }
                }
                if((dirtyFlags & 0x8800900L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) {
                            dirtyFlags |= 0x200000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000000000L;
                    }
                }

                if ((dirtyFlags & 0x8800100L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.INVISIBLE : View.VISIBLE
                        dataIsConferenceCancelledViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.VISIBLE : View.GONE
                        dataIsConferenceCancelledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.GONE : View.VISIBLE
                        dataIsConferenceCancelledViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x8800200L) != 0) {

                    if (data != null) {
                        // read data.expanded
                        dataExpanded = data.getExpanded();
                    }
                    updateLiveDataRegistration(9, dataExpanded);


                    if (dataExpanded != null) {
                        // read data.expanded.getValue()
                        dataExpandedGetValue = dataExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.expanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataExpandedGetValue);
                if((dirtyFlags & 0x8800200L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataExpandedGetValue) {
                            dirtyFlags |= 0x2000000000L;
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.expanded.getValue()) ? View.VISIBLE : View.GONE
                    dataExpandedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataExpandedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.expanded.getValue()) ? View.GONE : View.VISIBLE
                    dataExpandedViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataExpandedGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x8800400L) != 0) {

                    if (data != null) {
                        // read data.subject
                        dataSubject = data.getSubject();
                    }
                    updateLiveDataRegistration(10, dataSubject);


                    if (dataSubject != null) {
                        // read data.subject.getValue()
                        dataSubjectGetValue = dataSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x8800800L) != 0) {

                    if (data != null) {
                        // read data.isBroadcast
                        DataIsBroadcast1 = data.isBroadcast();
                    }
                    updateLiveDataRegistration(11, DataIsBroadcast1);


                    if (DataIsBroadcast1 != null) {
                        // read data.isBroadcast.getValue()
                        DataIsBroadcastGetValue1 = DataIsBroadcast1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue())
                    AndroidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue1 = androidx.databinding.ViewDataBinding.safeUnbox(DataIsBroadcastGetValue1);
                if((dirtyFlags & 0x8800800L) != 0) {
                    if(AndroidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue1) {
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? @android:string/conference_schedule_broadcast_address_title : @android:string/conference_schedule_address_title
                    dataIsBroadcastMboundView21AndroidStringConferenceScheduleBroadcastAddressTitleMboundView21AndroidStringConferenceScheduleAddressTitle = ((AndroidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue1) ? (mboundView21.getResources().getString(R.string.conference_schedule_broadcast_address_title)) : (mboundView21.getResources().getString(R.string.conference_schedule_address_title)));
            }
            if ((dirtyFlags & 0x8801000L) != 0) {

                    if (data != null) {
                        // read data.backgroundResId
                        dataBackgroundResId = data.getBackgroundResId();
                    }
                    updateLiveDataRegistration(12, dataBackgroundResId);


                    if (dataBackgroundResId != null) {
                        // read data.backgroundResId.getValue()
                        dataBackgroundResIdGetValue = dataBackgroundResId.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.backgroundResId.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataBackgroundResIdGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataBackgroundResIdGetValue);
            }
            if ((dirtyFlags & 0x8802000L) != 0) {

                    if (data != null) {
                        // read data.isBroadcast()
                        DataIsBroadcast2 = data.isBroadcast();
                    }
                    updateLiveDataRegistration(13, DataIsBroadcast2);


                    if (DataIsBroadcast2 != null) {
                        // read data.isBroadcast().getValue()
                        dataIsBroadcastGetValue = DataIsBroadcast2.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsBroadcastGetValue);
                if((dirtyFlags & 0x8802000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue) {
                            dirtyFlags |= 0x8000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast().getValue()) ? @android:string/conference_broadcast_title : @android:string/conference_meeting_title
                    dataIsBroadcastMeetingTypeAndroidStringConferenceBroadcastTitleMeetingTypeAndroidStringConferenceMeetingTitle = ((androidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue) ? (meetingType.getResources().getString(R.string.conference_broadcast_title)) : (meetingType.getResources().getString(R.string.conference_meeting_title)));
            }
            if ((dirtyFlags & 0x8808000L) != 0) {

                    if (data != null) {
                        // read data.description
                        dataDescription = data.getDescription();
                    }
                    updateLiveDataRegistration(15, dataDescription);


                    if (dataDescription != null) {
                        // read data.description.getValue()
                        dataDescriptionGetValue = dataDescription.getValue();
                    }


                    if (dataDescriptionGetValue != null) {
                        // read data.description.getValue().length()
                        dataDescriptionLength = dataDescriptionGetValue.length();
                    }


                    // read data.description.getValue().length() == 0
                    dataDescriptionLengthInt0 = (dataDescriptionLength) == (0);
                if((dirtyFlags & 0x8808000L) != 0) {
                    if(dataDescriptionLengthInt0) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read data.description.getValue().length() == 0 ? View.GONE : View.VISIBLE
                    dataDescriptionLengthInt0ViewGONEViewVISIBLE = ((dataDescriptionLengthInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x8810000L) != 0) {

                    if (data != null) {
                        // read data.organizer
                        dataOrganizer = data.getOrganizer();
                    }
                    updateLiveDataRegistration(16, dataOrganizer);


                    if (dataOrganizer != null) {
                        // read data.organizer.getValue()
                        dataOrganizerGetValue = dataOrganizer.getValue();
                    }


                    // read ((@android:string/conference_schedule_organizer) + (" ")) + (data.organizer.getValue())
                    mboundView5AndroidStringConferenceScheduleOrganizerJavaLangStringDataOrganizer = ((mboundView5.getResources().getString(R.string.conference_schedule_organizer)) + (" ")) + (dataOrganizerGetValue);
            }
            if ((dirtyFlags & 0x8820000L) != 0) {

                    if (data != null) {
                        // read data.address
                        dataAddress = data.getAddress();
                    }
                    updateLiveDataRegistration(17, dataAddress);


                    if (dataAddress != null) {
                        // read data.address.getValue()
                        dataAddressGetValue = dataAddress.getValue();
                    }
            }
        }
        if ((dirtyFlags & 0x9000000L) != 0) {
        }
        if ((dirtyFlags & 0xa000000L) != 0) {
        }
        if ((dirtyFlags & 0xc400010L) != 0) {



                if (selectionListViewModelSelectedItemsGetValue != null) {
                    // read selectionListViewModel.selectedItems.getValue().contains(position)
                    selectionListViewModelSelectedItemsContainsPosition = selectionListViewModelSelectedItemsGetValue.contains(position);
                }
        }
        // batch finished

        if ((dirtyFlags & 0x800000000L) != 0) {

                if (data != null) {
                    // read data.isConferenceCancelled
                    DataIsConferenceCancelled1 = data.isConferenceCancelled();
                }
                updateLiveDataRegistration(8, DataIsConferenceCancelled1);


                if (DataIsConferenceCancelled1 != null) {
                    // read data.isConferenceCancelled.getValue()
                    dataIsConferenceCancelledGetValue = DataIsConferenceCancelled1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsConferenceCancelledGetValue);
            if((dirtyFlags & 0x8800100L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) {
                        dirtyFlags |= 0x20000000L;
                        dirtyFlags |= 0x200000000L;
                        dirtyFlags |= 0x20000000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                        dirtyFlags |= 0x100000000L;
                        dirtyFlags |= 0x10000000000000L;
                }
            }
            if((dirtyFlags & 0x8800900L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) {
                        dirtyFlags |= 0x200000000000000L;
                }
                else {
                        dirtyFlags |= 0x100000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue())
                dataIsConferenceCancelled = !androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue;
        }

        if ((dirtyFlags & 0x8800180L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) : false
                dataCanEditDataIsConferenceCancelledBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxDataCanEditGetValue) ? (dataIsConferenceCancelled) : (false));
            if((dirtyFlags & 0x8800180L) != 0) {
                if(dataCanEditDataIsConferenceCancelledBooleanFalse) {
                        dirtyFlags |= 0x800000000000L;
                }
                else {
                        dirtyFlags |= 0x400000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) : false ? View.VISIBLE : View.GONE
                dataCanEditDataIsConferenceCancelledBooleanFalseViewVISIBLEViewGONE = ((dataCanEditDataIsConferenceCancelledBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x100000000000000L) != 0) {

                if (data != null) {
                    // read data.isBroadcast
                    DataIsBroadcast1 = data.isBroadcast();
                }
                updateLiveDataRegistration(11, DataIsBroadcast1);


                if (DataIsBroadcast1 != null) {
                    // read data.isBroadcast.getValue()
                    DataIsBroadcastGetValue1 = DataIsBroadcast1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue())
                AndroidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue1 = androidx.databinding.ViewDataBinding.safeUnbox(DataIsBroadcastGetValue1);
            if((dirtyFlags & 0x8800800L) != 0) {
                if(AndroidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue1) {
                        dirtyFlags |= 0x200000000000L;
                }
                else {
                        dirtyFlags |= 0x100000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue())
                dataIsBroadcast = !AndroidxDatabindingViewDataBindingSafeUnboxDataIsBroadcastGetValue1;
        }

        if ((dirtyFlags & 0x8800900L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue())
                dataIsConferenceCancelledBooleanTrueDataIsBroadcast = ((androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceCancelledGetValue) ? (true) : (dataIsBroadcast));
            if((dirtyFlags & 0x8800900L) != 0) {
                if(dataIsConferenceCancelledBooleanTrueDataIsBroadcast) {
                        dirtyFlags |= 0x80000000000L;
                }
                else {
                        dirtyFlags |= 0x40000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? View.GONE : View.VISIBLE
                dataIsConferenceCancelledBooleanTrueDataIsBroadcastViewGONEViewVISIBLE = ((dataIsConferenceCancelledBooleanTrueDataIsBroadcast) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x8080000L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0xa000000L) != 0) {
            // api target 1

            this.mboundView0.setOnLongClickListener(longClickListener);
        }
        if ((dirtyFlags & 0x8801000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setBackgroundImage(this.mboundView1, androidxDatabindingViewDataBindingSafeUnboxDataBackgroundResIdGetValue);
        }
        if ((dirtyFlags & 0x8800004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, dataParticipantsShortGetValue);
        }
        if ((dirtyFlags & 0x8800100L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(dataIsConferenceCancelledViewINVISIBLEViewVISIBLE);
            this.mboundView21.setVisibility(dataIsConferenceCancelledViewGONEViewVISIBLE);
            this.mboundView22.setVisibility(dataIsConferenceCancelledViewGONEViewVISIBLE);
            this.mboundView25.setVisibility(dataIsConferenceCancelledViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(dataIsConferenceCancelledViewVISIBLEViewGONE);
            this.participantsList.setVisibility(dataIsConferenceCancelledViewGONEViewVISIBLE);
            this.participantsTitle.setVisibility(dataIsConferenceCancelledViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x8404000L) != 0) {
            // api target 1

            this.mboundView11.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabled);
            this.select.setVisibility(selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE);
            this.selectedInfo.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabled);
        }
        if ((dirtyFlags & 0x8800200L) != 0) {
            // api target 1

            this.mboundView12.setVisibility(dataExpandedViewVISIBLEViewGONE);
            this.mboundView18.setVisibility(dataExpandedViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(dataExpandedViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x8808000L) != 0) {
            // api target 1

            this.mboundView19.setVisibility(dataDescriptionLengthInt0ViewGONEViewVISIBLE);
            this.mboundView20.setVisibility(dataDescriptionLengthInt0ViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView20, dataDescriptionGetValue);
        }
        if ((dirtyFlags & 0x8800002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataTimeGetValue);
        }
        if ((dirtyFlags & 0x8800800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView21, dataIsBroadcastMboundView21AndroidStringConferenceScheduleBroadcastAddressTitleMboundView21AndroidStringConferenceScheduleAddressTitle);
        }
        if ((dirtyFlags & 0x8820000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView23, dataAddressGetValue);
        }
        if ((dirtyFlags & 0x9000000L) != 0) {
            // api target 1

            this.mboundView24.setOnClickListener(copyAddressClickListener);
        }
        if ((dirtyFlags & 0x8200000L) != 0) {
            // api target 1

            this.mboundView25.setOnClickListener(joinConferenceClickListener);
        }
        if ((dirtyFlags & 0x8100000L) != 0) {
            // api target 1

            this.mboundView26.setOnClickListener(editConferenceClickListener);
        }
        if ((dirtyFlags & 0x8800180L) != 0) {
            // api target 1

            this.mboundView26.setVisibility(dataCanEditDataIsConferenceCancelledBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8040000L) != 0) {
            // api target 1

            this.mboundView27.setOnClickListener(deleteConferenceClickListener);
        }
        if ((dirtyFlags & 0x8800020L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(dataShowDurationViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8800008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, javaLangStringDataDurationJavaLangString);
        }
        if ((dirtyFlags & 0x8810000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, mboundView5AndroidStringConferenceScheduleOrganizerJavaLangStringDataOrganizer);
        }
        if ((dirtyFlags & 0x8800080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, dataCanEditMboundView6AndroidStringConferenceScheduledCancelledByMeMboundView6AndroidStringConferenceScheduledCancelledByOrganizer);
        }
        if ((dirtyFlags & 0x8800400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, dataSubjectGetValue);
        }
        if ((dirtyFlags & 0x8802000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.meetingType, dataIsBroadcastMeetingTypeAndroidStringConferenceBroadcastTitleMeetingTypeAndroidStringConferenceMeetingTitle);
        }
        if ((dirtyFlags & 0x8800001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.participantsList, dataParticipantsExpandedGetValue);
        }
        if ((dirtyFlags & 0xc400010L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.select, selectionListViewModelSelectedItemsContainsPosition);
        }
        if ((dirtyFlags & 0x8000000L) != 0) {
            // api target 1

            this.select.setOnClickListener(mCallback201);
            this.selectedInfo.setSelected(true);
        }
        if ((dirtyFlags & 0x8800900L) != 0) {
            // api target 1

            this.speakersList.setVisibility(dataIsConferenceCancelledBooleanTrueDataIsBroadcastViewGONEViewVISIBLE);
            this.speakersTitle.setVisibility(dataIsConferenceCancelledBooleanTrueDataIsBroadcastViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x8800040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.speakersList, dataSpeakersExpandedGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // selectionListViewModel != null
        boolean selectionListViewModelJavaLangObjectNull = false;
        // position
        java.lang.Integer position = mPosition;
        // selectionListViewModel
        org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;



        selectionListViewModelJavaLangObjectNull = (selectionListViewModel) != (null);
        if (selectionListViewModelJavaLangObjectNull) {



            selectionListViewModel.onToggleSelect(position);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.participantsExpanded
        flag 1 (0x2L): data.time
        flag 2 (0x3L): data.participantsShort
        flag 3 (0x4L): data.duration
        flag 4 (0x5L): selectionListViewModel.selectedItems
        flag 5 (0x6L): data.showDuration
        flag 6 (0x7L): data.speakersExpanded
        flag 7 (0x8L): data.canEdit
        flag 8 (0x9L): data.isConferenceCancelled
        flag 9 (0xaL): data.expanded
        flag 10 (0xbL): data.subject
        flag 11 (0xcL): data.isBroadcast
        flag 12 (0xdL): data.backgroundResId
        flag 13 (0xeL): data.isBroadcast()
        flag 14 (0xfL): selectionListViewModel.isEditionEnabled
        flag 15 (0x10L): data.description
        flag 16 (0x11L): data.organizer
        flag 17 (0x12L): data.address
        flag 18 (0x13L): deleteConferenceClickListener
        flag 19 (0x14L): clickListener
        flag 20 (0x15L): editConferenceClickListener
        flag 21 (0x16L): joinConferenceClickListener
        flag 22 (0x17L): selectionListViewModel
        flag 23 (0x18L): data
        flag 24 (0x19L): copyAddressClickListener
        flag 25 (0x1aL): longClickListener
        flag 26 (0x1bL): position
        flag 27 (0x1cL): null
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue()) ? @android:string/conference_scheduled_cancelled_by_me : @android:string/conference_scheduled_cancelled_by_organizer
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue()) ? @android:string/conference_scheduled_cancelled_by_me : @android:string/conference_scheduled_cancelled_by_organizer
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) : false
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) : false
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(data.expanded.getValue()) ? View.VISIBLE : View.GONE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(data.expanded.getValue()) ? View.VISIBLE : View.GONE
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(data.expanded.getValue()) ? View.GONE : View.VISIBLE
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(data.expanded.getValue()) ? View.GONE : View.VISIBLE
        flag 40 (0x29L): data.description.getValue().length() == 0 ? View.GONE : View.VISIBLE
        flag 41 (0x2aL): data.description.getValue().length() == 0 ? View.GONE : View.VISIBLE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? View.GONE : View.VISIBLE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? View.GONE : View.VISIBLE
        flag 44 (0x2dL): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? @android:string/conference_schedule_broadcast_address_title : @android:string/conference_schedule_address_title
        flag 45 (0x2eL): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue()) ? @android:string/conference_schedule_broadcast_address_title : @android:string/conference_schedule_address_title
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) : false ? View.VISIBLE : View.GONE
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(data.canEdit.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) : false ? View.VISIBLE : View.GONE
        flag 48 (0x31L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast().getValue()) ? @android:string/conference_broadcast_title : @android:string/conference_meeting_title
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast().getValue()) ? @android:string/conference_broadcast_title : @android:string/conference_meeting_title
        flag 52 (0x35L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.GONE : View.VISIBLE
        flag 53 (0x36L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? View.GONE : View.VISIBLE
        flag 54 (0x37L): androidx.databinding.ViewDataBinding.safeUnbox(data.showDuration.getValue()) ? View.VISIBLE : View.GONE
        flag 55 (0x38L): androidx.databinding.ViewDataBinding.safeUnbox(data.showDuration.getValue()) ? View.VISIBLE : View.GONE
        flag 56 (0x39L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue())
        flag 57 (0x3aL): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceCancelled.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isBroadcast.getValue())
    flag mapping end*/
    //end
}