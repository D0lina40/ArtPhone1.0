package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConferencesScheduledFragmentBindingImpl extends ConferencesScheduledFragmentBinding implements org.linphone.generated.callback.OnCheckedChangeListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 6);
        sViewsWithIds.put(R.id.back, 7);
        sViewsWithIds.put(R.id.list_edit_top_bar_fragment, 8);
        sViewsWithIds.put(R.id.chips, 9);
        sViewsWithIds.put(R.id.divider, 10);
        sViewsWithIds.put(R.id.conference_info_list, 11);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final com.google.android.material.chip.Chip mboundView2;
    @NonNull
    private final com.google.android.material.chip.Chip mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback130;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback129;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.showTerminated.getValue()
            //         is viewModel.showTerminated.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView2.isChecked();
            // localize variables for thread safety
            // viewModel.showTerminated
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowTerminated = null;
            // viewModel.showTerminated != null
            boolean viewModelShowTerminatedJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ScheduledConferencesViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.showTerminated.getValue()
            java.lang.Boolean viewModelShowTerminatedGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelShowTerminated = viewModel.getShowTerminated();

                viewModelShowTerminatedJavaLangObjectNull = (viewModelShowTerminated) != (null);
                if (viewModelShowTerminatedJavaLangObjectNull) {




                    viewModelShowTerminated.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of !viewModel.showTerminated.getValue()
            //         is viewModel.showTerminated.setValue((java.lang.Boolean) !callbackArg_0)
            boolean callbackArg_0 = mboundView3.isChecked();
            // localize variables for thread safety
            // viewModel.showTerminated
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowTerminated = null;
            // !viewModel.showTerminated.getValue()
            java.lang.Boolean ViewModelShowTerminated1 = null;
            // viewModel.showTerminated != null
            boolean viewModelShowTerminatedJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ScheduledConferencesViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.showTerminated.getValue()
            java.lang.Boolean viewModelShowTerminatedGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelShowTerminated = viewModel.getShowTerminated();

                viewModelShowTerminatedJavaLangObjectNull = (viewModelShowTerminated) != (null);
                if (viewModelShowTerminatedJavaLangObjectNull) {





                    viewModelShowTerminated.setValue(((java.lang.Boolean) (!callbackArg_0)));
                }
            }
        }
    };

    public ConferencesScheduledFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ConferencesScheduledFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[7]
            , (com.google.android.material.chip.ChipGroup) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[11]
            , (android.view.View) bindings[10]
            , (androidx.fragment.app.FragmentContainerView) bindings[8]
            , (android.widget.LinearLayout) bindings[6]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.chip.Chip) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.chip.Chip) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback130 = new org.linphone.generated.callback.OnCheckedChangeListener(this, 2);
        mCallback129 = new org.linphone.generated.callback.OnCheckedChangeListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.newConferenceClickListener == variableId) {
            setNewConferenceClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.conference.viewmodels.ScheduledConferencesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNewConferenceClickListener(@Nullable android.view.View.OnClickListener NewConferenceClickListener) {
        this.mNewConferenceClickListener = NewConferenceClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.newConferenceClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.conference.viewmodels.ScheduledConferencesViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelShowTerminated((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelConferences((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ScheduledConferenceData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowTerminated(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowTerminated, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelConferences(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ScheduledConferenceData>> ViewModelConferences, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowTerminated = null;
        boolean ViewModelShowTerminated1 = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.conference.data.ScheduledConferenceData>> viewModelConferences = null;
        int viewModelShowTerminatedViewModelConferencesEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelShowTerminatedViewModelConferencesEmptyBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowTerminatedGetValue = false;
        boolean ViewModelShowTerminatedViewModelConferencesEmptyBooleanFalse1 = false;
        int ViewModelShowTerminatedViewModelConferencesEmptyBooleanFalseViewVISIBLEViewGONE1 = 0;
        java.lang.Boolean viewModelShowTerminatedGetValue = null;
        java.util.ArrayList<org.linphone.activities.main.conference.data.ScheduledConferenceData> viewModelConferencesGetValue = null;
        android.view.View.OnClickListener newConferenceClickListener = mNewConferenceClickListener;
        boolean viewModelConferencesEmpty = false;
        org.linphone.activities.main.conference.viewmodels.ScheduledConferencesViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowTerminated = false;

        if ((dirtyFlags & 0x14L) != 0) {
        }
        if ((dirtyFlags & 0x1bL) != 0) {



                if (viewModel != null) {
                    // read viewModel.showTerminated
                    viewModelShowTerminated = viewModel.getShowTerminated();
                }
                updateLiveDataRegistration(0, viewModelShowTerminated);


                if (viewModelShowTerminated != null) {
                    // read viewModel.showTerminated.getValue()
                    viewModelShowTerminatedGetValue = viewModelShowTerminated.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelShowTerminatedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowTerminatedGetValue);
            if((dirtyFlags & 0x1bL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowTerminatedGetValue) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue())
                ViewModelShowTerminated1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelShowTerminatedGetValue;
            if((dirtyFlags & 0x1bL) != 0) {
                if(ViewModelShowTerminated1) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }

            if ((dirtyFlags & 0x19L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowTerminated = androidx.databinding.ViewDataBinding.safeUnbox(ViewModelShowTerminated1);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x500L) != 0) {

                if (viewModel != null) {
                    // read viewModel.conferences
                    viewModelConferences = viewModel.getConferences();
                }
                updateLiveDataRegistration(1, viewModelConferences);


                if (viewModelConferences != null) {
                    // read viewModel.conferences.getValue()
                    viewModelConferencesGetValue = viewModelConferences.getValue();
                }


                if (viewModelConferencesGetValue != null) {
                    // read viewModel.conferences.getValue().empty
                    viewModelConferencesEmpty = viewModelConferencesGetValue.isEmpty();
                }
        }

        if ((dirtyFlags & 0x1bL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false
                viewModelShowTerminatedViewModelConferencesEmptyBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowTerminatedGetValue) ? (viewModelConferencesEmpty) : (false));
                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false
                ViewModelShowTerminatedViewModelConferencesEmptyBooleanFalse1 = ((ViewModelShowTerminated1) ? (viewModelConferencesEmpty) : (false));
            if((dirtyFlags & 0x1bL) != 0) {
                if(viewModelShowTerminatedViewModelConferencesEmptyBooleanFalse) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x1bL) != 0) {
                if(ViewModelShowTerminatedViewModelConferencesEmptyBooleanFalse1) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false ? View.VISIBLE : View.GONE
                ViewModelShowTerminatedViewModelConferencesEmptyBooleanFalseViewVISIBLEViewGONE1 = ((viewModelShowTerminatedViewModelConferencesEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false ? View.VISIBLE : View.GONE
                viewModelShowTerminatedViewModelConferencesEmptyBooleanFalseViewVISIBLEViewGONE = ((ViewModelShowTerminatedViewModelConferencesEmptyBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(newConferenceClickListener);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxViewModelShowTerminatedGetValue);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, androidxDatabindingViewDataBindingSafeUnboxViewModelShowTerminated);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView2, mCallback129, mboundView2androidCheckedAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView3, mCallback130, mboundView3androidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x1bL) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelShowTerminatedViewModelConferencesEmptyBooleanFalseViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(ViewModelShowTerminatedViewModelConferencesEmptyBooleanFalseViewVISIBLEViewGONE1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ScheduledConferencesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.applyFilter();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ScheduledConferencesViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.applyFilter();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showTerminated
        flag 1 (0x2L): viewModel.conferences
        flag 2 (0x3L): newConferenceClickListener
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 6 (0x7L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false
        flag 9 (0xaL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false
        flag 10 (0xbL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showTerminated.getValue()) ? viewModel.conferences.getValue().empty : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}