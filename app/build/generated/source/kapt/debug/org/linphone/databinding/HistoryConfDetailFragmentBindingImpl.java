package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HistoryConfDetailFragmentBindingImpl extends HistoryConfDetailFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(3, 
            new String[] {"conference_scheduling_participant_cell"},
            new int[] {7},
            new int[] {org.linphone.R.layout.conference_scheduling_participant_cell});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 8);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @Nullable
    private final org.linphone.databinding.ConferenceSchedulingParticipantCellBinding mboundView31;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HistoryConfDetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private HistoryConfDetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[8]
            );
        this.back.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (org.linphone.databinding.ConferenceSchedulingParticipantCellBinding) bindings[7];
        setContainedBinding(this.mboundView31);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        mboundView31.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView31.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.newContactClickListener == variableId) {
            setNewContactClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.sharedMainViewModel == variableId) {
            setSharedMainViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else if (BR.contactClickListener == variableId) {
            setContactClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.history.viewmodels.CallLogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNewContactClickListener(@Nullable android.view.View.OnClickListener NewContactClickListener) {
        this.mNewContactClickListener = NewContactClickListener;
    }
    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setContactClickListener(@Nullable android.view.View.OnClickListener ContactClickListener) {
        this.mContactClickListener = ContactClickListener;
    }
    public void setViewModel(@Nullable org.linphone.activities.main.history.viewmodels.CallLogViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView31.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelConferenceDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelOrganizerParticipantData((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>) object, fieldId);
            case 2 :
                return onChangeViewModelConferenceParticipantsData((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>>) object, fieldId);
            case 3 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelConferenceTime((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelConferenceDate(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelConferenceDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrganizerParticipantData(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData> ViewModelOrganizerParticipantData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelConferenceParticipantsData(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> ViewModelConferenceParticipantsData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelConferenceTime(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelConferenceTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelConferenceDate = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        java.util.ArrayList<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData> viewModelConferenceParticipantsDataGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData> viewModelOrganizerParticipantData = null;
        java.lang.String viewModelConferenceTimeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData>> viewModelConferenceParticipantsData = null;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        java.lang.String viewModelConferenceSubject = null;
        java.lang.String viewModelConferenceDateGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData viewModelOrganizerParticipantDataGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelConferenceTime = null;
        org.linphone.activities.main.history.viewmodels.CallLogViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x248L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(3, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x248L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x317L) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.conferenceDate
                        viewModelConferenceDate = viewModel.getConferenceDate();
                    }
                    updateLiveDataRegistration(0, viewModelConferenceDate);


                    if (viewModelConferenceDate != null) {
                        // read viewModel.conferenceDate.getValue()
                        viewModelConferenceDateGetValue = viewModelConferenceDate.getValue();
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.organizerParticipantData
                        viewModelOrganizerParticipantData = viewModel.getOrganizerParticipantData();
                    }
                    updateLiveDataRegistration(1, viewModelOrganizerParticipantData);


                    if (viewModelOrganizerParticipantData != null) {
                        // read viewModel.organizerParticipantData.getValue()
                        viewModelOrganizerParticipantDataGetValue = viewModelOrganizerParticipantData.getValue();
                    }
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.conferenceParticipantsData
                        viewModelConferenceParticipantsData = viewModel.getConferenceParticipantsData();
                    }
                    updateLiveDataRegistration(2, viewModelConferenceParticipantsData);


                    if (viewModelConferenceParticipantsData != null) {
                        // read viewModel.conferenceParticipantsData.getValue()
                        viewModelConferenceParticipantsDataGetValue = viewModelConferenceParticipantsData.getValue();
                    }
            }
            if ((dirtyFlags & 0x300L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.conferenceSubject
                        viewModelConferenceSubject = viewModel.getConferenceSubject();
                    }
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.conferenceTime
                        viewModelConferenceTime = viewModel.getConferenceTime();
                    }
                    updateLiveDataRegistration(4, viewModelConferenceTime);


                    if (viewModelConferenceTime != null) {
                        // read viewModel.conferenceTime.getValue()
                        viewModelConferenceTimeGetValue = viewModelConferenceTime.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x248L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelConferenceSubject);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            this.mboundView31.setData(viewModelOrganizerParticipantDataGetValue);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelConferenceDateGetValue);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelConferenceTimeGetValue);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView6, viewModelConferenceParticipantsDataGetValue, R.layout.conference_scheduling_participant_cell);
        }
        executeBindingsOn(mboundView31);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.conferenceDate
        flag 1 (0x2L): viewModel.organizerParticipantData
        flag 2 (0x3L): viewModel.conferenceParticipantsData
        flag 3 (0x4L): sharedMainViewModel.isSlidingPaneSlideable
        flag 4 (0x5L): viewModel.conferenceTime
        flag 5 (0x6L): newContactClickListener
        flag 6 (0x7L): sharedMainViewModel
        flag 7 (0x8L): contactClickListener
        flag 8 (0x9L): viewModel
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}