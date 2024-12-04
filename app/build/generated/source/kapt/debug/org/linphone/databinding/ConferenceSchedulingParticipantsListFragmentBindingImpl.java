package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConferenceSchedulingParticipantsListFragmentBindingImpl extends ConferenceSchedulingParticipantsListFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.back, 7);
        sViewsWithIds.put(R.id.layoutContactsSelected, 8);
        sViewsWithIds.put(R.id.contactsList, 9);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback216;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener searchBarandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.filter.getValue()
            //         is viewModel.filter.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(searchBar);
            // localize variables for thread safety
            // viewModel.filter
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFilter = null;
            // viewModel.filter != null
            boolean viewModelFilterJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
            // viewModel.filter.getValue()
            java.lang.String viewModelFilterGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFilter = viewModel.getFilter();

                viewModelFilterJavaLangObjectNull = (viewModelFilter) != (null);
                if (viewModelFilterJavaLangObjectNull) {




                    viewModelFilter.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ConferenceSchedulingParticipantsListFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ConferenceSchedulingParticipantsListFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (android.widget.HorizontalScrollView) bindings[8]
            , (android.widget.EditText) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.searchBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback216 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.nextClickListener == variableId) {
            setNextClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNextClickListener(@Nullable android.view.View.OnClickListener NextClickListener) {
        this.mNextClickListener = NextClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.nextClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSipContactsSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelFilter((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelSelectedAddresses((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>>) object, fieldId);
            case 3 :
                return onChangeViewModelContactsList((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.SearchResult>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSipContactsSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSipContactsSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFilter(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFilter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectedAddresses(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>> ViewModelSelectedAddresses, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContactsList(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.SearchResult>> ViewModelContactsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSipContactsSelected = null;
        int viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFilter = null;
        boolean ViewModelSipContactsSelected1 = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>> viewModelSelectedAddresses = null;
        java.util.ArrayList<org.linphone.core.SearchResult> viewModelContactsListGetValue = null;
        int ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE1 = 0;
        int viewModelSelectedAddressesSize = 0;
        boolean viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse = false;
        java.lang.String viewModelFilterGetValue = null;
        java.lang.Boolean viewModelSipContactsSelectedGetValue = null;
        boolean viewModelSelectedAddressesSizeInt0 = false;
        android.view.View.OnClickListener nextClickListener = mNextClickListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue = false;
        boolean viewModelContactsListEmpty = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.SearchResult>> viewModelContactsList = null;
        java.util.ArrayList<org.linphone.core.Address> viewModelSelectedAddressesGetValue = null;
        org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
        boolean ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1 = false;

        if ((dirtyFlags & 0x50L) != 0) {
        }
        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x69L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.sipContactsSelected
                        viewModelSipContactsSelected = viewModel.getSipContactsSelected();
                    }
                    updateLiveDataRegistration(0, viewModelSipContactsSelected);


                    if (viewModelSipContactsSelected != null) {
                        // read viewModel.sipContactsSelected.getValue()
                        viewModelSipContactsSelectedGetValue = viewModelSipContactsSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSipContactsSelectedGetValue);
                if((dirtyFlags & 0x69L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue())
                    ViewModelSipContactsSelected1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue;
                if((dirtyFlags & 0x69L) != 0) {
                    if(ViewModelSipContactsSelected1) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.filter
                        viewModelFilter = viewModel.getFilter();
                    }
                    updateLiveDataRegistration(1, viewModelFilter);


                    if (viewModelFilter != null) {
                        // read viewModel.filter.getValue()
                        viewModelFilterGetValue = viewModelFilter.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedAddresses
                        viewModelSelectedAddresses = viewModel.getSelectedAddresses();
                    }
                    updateLiveDataRegistration(2, viewModelSelectedAddresses);


                    if (viewModelSelectedAddresses != null) {
                        // read viewModel.selectedAddresses.getValue()
                        viewModelSelectedAddressesGetValue = viewModelSelectedAddresses.getValue();
                    }


                    if (viewModelSelectedAddressesGetValue != null) {
                        // read viewModel.selectedAddresses.getValue().size()
                        viewModelSelectedAddressesSize = viewModelSelectedAddressesGetValue.size();
                    }


                    // read viewModel.selectedAddresses.getValue().size() > 0
                    viewModelSelectedAddressesSizeInt0 = (viewModelSelectedAddressesSize) > (0);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x5000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.contactsList
                    viewModelContactsList = viewModel.getContactsList();
                }
                updateLiveDataRegistration(3, viewModelContactsList);


                if (viewModelContactsList != null) {
                    // read viewModel.contactsList.getValue()
                    viewModelContactsListGetValue = viewModelContactsList.getValue();
                }


                if (viewModelContactsListGetValue != null) {
                    // read viewModel.contactsList.getValue().empty
                    viewModelContactsListEmpty = viewModelContactsListGetValue.isEmpty();
                }
        }

        if ((dirtyFlags & 0x69L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
                viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse = ((ViewModelSipContactsSelected1) ? (viewModelContactsListEmpty) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
                ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) ? (viewModelContactsListEmpty) : (false));
            if((dirtyFlags & 0x69L) != 0) {
                if(viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
            if((dirtyFlags & 0x69L) != 0) {
                if(ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
                ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE1 = ((viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
                viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE = ((ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(nextClickListener);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.mboundView1.setEnabled(viewModelSelectedAddressesSizeInt0);
            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView4, viewModelSelectedAddressesGetValue, R.layout.contact_selected_cell, viewModel);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback216);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.searchBar, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, searchBarandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x69L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE1);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchBar, viewModelFilterGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.clearFilter();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.sipContactsSelected
        flag 1 (0x2L): viewModel.filter
        flag 2 (0x3L): viewModel.selectedAddresses
        flag 3 (0x4L): viewModel.contactsList
        flag 4 (0x5L): nextClickListener
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 11 (0xcL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 12 (0xdL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
    flag mapping end*/
    //end
}