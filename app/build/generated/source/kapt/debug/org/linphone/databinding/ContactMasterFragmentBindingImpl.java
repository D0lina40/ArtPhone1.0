package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContactMasterFragmentBindingImpl extends ContactMasterFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(11, 
            new String[] {"wait_layout"},
            new int[] {14},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 15);
        sViewsWithIds.put(R.id.list_edit_top_bar_fragment, 16);
        sViewsWithIds.put(R.id.contactsList, 17);
        sViewsWithIds.put(R.id.contacts_nav_container, 18);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.RelativeLayout mboundView11;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView111;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.view.View mboundView3;
    @NonNull
    private final android.widget.RelativeLayout mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.view.View mboundView6;
    @NonNull
    private final android.view.View mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
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
            org.linphone.activities.main.contact.viewmodels.ContactsListViewModel viewModel = mViewModel;
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

    public ContactMasterFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ContactMasterFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (androidx.recyclerview.widget.RecyclerView) bindings[17]
            , (androidx.fragment.app.FragmentContainerView) bindings[18]
            , (androidx.fragment.app.FragmentContainerView) bindings[16]
            , (android.widget.EditText) bindings[10]
            , (androidx.slidingpanelayout.widget.SlidingPaneLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[15]
            );
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (android.widget.RelativeLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView111 = (org.linphone.databinding.WaitLayoutBinding) bindings[14];
        setContainedBinding(this.mboundView111);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.view.View) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.RelativeLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.view.View) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.view.View) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.searchBar.setTag(null);
        this.slidingPane.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
        }
        mboundView111.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView111.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sipContactsToggleClickListener == variableId) {
            setSipContactsToggleClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.editClickListener == variableId) {
            setEditClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.newContactClickListener == variableId) {
            setNewContactClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.allContactsToggleClickListener == variableId) {
            setAllContactsToggleClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.contact.viewmodels.ContactsListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSipContactsToggleClickListener(@Nullable android.view.View.OnClickListener SipContactsToggleClickListener) {
        this.mSipContactsToggleClickListener = SipContactsToggleClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.sipContactsToggleClickListener);
        super.requestRebind();
    }
    public void setEditClickListener(@Nullable android.view.View.OnClickListener EditClickListener) {
        this.mEditClickListener = EditClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.editClickListener);
        super.requestRebind();
    }
    public void setNewContactClickListener(@Nullable android.view.View.OnClickListener NewContactClickListener) {
        this.mNewContactClickListener = NewContactClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.newContactClickListener);
        super.requestRebind();
    }
    public void setAllContactsToggleClickListener(@Nullable android.view.View.OnClickListener AllContactsToggleClickListener) {
        this.mAllContactsToggleClickListener = AllContactsToggleClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.allContactsToggleClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.contact.viewmodels.ContactsListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView111.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelNativeAddressBookEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelFetchInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelContactsList((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.viewmodels.ContactViewModel>>) object, fieldId);
            case 3 :
                return onChangeViewModelOnlyShowSipContactsList((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelSipContactsSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelHideSipContactsList((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelFilter((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelReadOnlyNativeAddressBook((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelNativeAddressBookEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelNativeAddressBookEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFetchInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelFetchInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContactsList(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.viewmodels.ContactViewModel>> ViewModelContactsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOnlyShowSipContactsList(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelOnlyShowSipContactsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSipContactsSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSipContactsSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHideSipContactsList(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelHideSipContactsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFilter(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFilter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelReadOnlyNativeAddressBook(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelReadOnlyNativeAddressBook, int fieldId) {
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
        int viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelReadOnlyNativeAddressBookGetValue = null;
        java.lang.Boolean viewModelFetchInProgressGetValue = null;
        boolean viewModelSipContactsSelected = false;
        int viewModelNativeAddressBookEnabledViewModelReadOnlyNativeAddressBookBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        int viewModelSipContactsSelectedViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue = false;
        boolean viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelNativeAddressBookEnabled = null;
        java.lang.String viewModelFilterGetValue = null;
        java.lang.Boolean viewModelOnlyShowSipContactsListGetValue = null;
        java.lang.Boolean viewModelSipContactsSelectedGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue = false;
        java.lang.Boolean viewModelHideSipContactsListGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelected = false;
        boolean viewModelContactsListEmpty = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelFetchInProgress = null;
        boolean viewModelNativeAddressBookEnabledViewModelReadOnlyNativeAddressBookBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.viewmodels.ContactViewModel>> viewModelContactsList = null;
        boolean viewModelReadOnlyNativeAddressBook = false;
        android.view.View.OnClickListener sipContactsToggleClickListener = mSipContactsToggleClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelOnlyShowSipContactsList = null;
        boolean ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1 = false;
        int viewModelSipContactsSelectedViewGONEViewVISIBLE = 0;
        boolean ViewModelContactsListEmpty1 = false;
        java.lang.Boolean viewModelNativeAddressBookEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSipContactsSelected1 = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHideSipContactsList = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFilter = null;
        java.util.ArrayList<org.linphone.activities.main.contact.viewmodels.ContactViewModel> viewModelContactsListGetValue = null;
        int ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE1 = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelNativeAddressBookEnabledGetValue = false;
        android.view.View.OnClickListener editClickListener = mEditClickListener;
        android.view.View.OnClickListener newContactClickListener = mNewContactClickListener;
        int viewModelOnlyShowSipContactsListViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelOnlyShowSipContactsListGetValue = false;
        android.view.View.OnClickListener allContactsToggleClickListener = mAllContactsToggleClickListener;
        int viewModelHideSipContactsListViewGONEViewVISIBLE = 0;
        int viewModelReadOnlyNativeAddressBookViewINVISIBLEViewVISIBLE = 0;
        boolean viewModelOnlyShowSipContactsListBooleanTrueViewModelHideSipContactsList = false;
        int viewModelOnlyShowSipContactsListBooleanTrueViewModelHideSipContactsListViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHideSipContactsListGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelReadOnlyNativeAddressBook1 = null;
        org.linphone.activities.main.contact.viewmodels.ContactsListViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x2100L) != 0) {
        }
        if ((dirtyFlags & 0x2200L) != 0) {
        }
        if ((dirtyFlags & 0x2400L) != 0) {
        }
        if ((dirtyFlags & 0x2800L) != 0) {
        }
        if ((dirtyFlags & 0x30ffL) != 0) {


            if ((dirtyFlags & 0x3081L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nativeAddressBookEnabled
                        viewModelNativeAddressBookEnabled = viewModel.getNativeAddressBookEnabled();
                    }
                    updateLiveDataRegistration(0, viewModelNativeAddressBookEnabled);


                    if (viewModelNativeAddressBookEnabled != null) {
                        // read viewModel.nativeAddressBookEnabled.getValue()
                        viewModelNativeAddressBookEnabledGetValue = viewModelNativeAddressBookEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nativeAddressBookEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelNativeAddressBookEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelNativeAddressBookEnabledGetValue);
                if((dirtyFlags & 0x3081L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelNativeAddressBookEnabledGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
            }
            if ((dirtyFlags & 0x3002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fetchInProgress
                        viewModelFetchInProgress = viewModel.getFetchInProgress();
                    }
                    updateLiveDataRegistration(1, viewModelFetchInProgress);


                    if (viewModelFetchInProgress != null) {
                        // read viewModel.fetchInProgress.getValue()
                        viewModelFetchInProgressGetValue = viewModelFetchInProgress.getValue();
                    }
            }
            if ((dirtyFlags & 0x3004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contactsList
                        viewModelContactsList = viewModel.getContactsList();
                    }
                    updateLiveDataRegistration(2, viewModelContactsList);


                    if (viewModelContactsList != null) {
                        // read viewModel.contactsList.getValue()
                        viewModelContactsListGetValue = viewModelContactsList.getValue();
                    }


                    if (viewModelContactsListGetValue != null) {
                        // read viewModel.contactsList.getValue().empty
                        viewModelContactsListEmpty = viewModelContactsListGetValue.isEmpty();
                    }


                    // read !viewModel.contactsList.getValue().empty
                    ViewModelContactsListEmpty1 = !viewModelContactsListEmpty;
            }
            if ((dirtyFlags & 0x3028L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.onlyShowSipContactsList
                        viewModelOnlyShowSipContactsList = viewModel.getOnlyShowSipContactsList();
                    }
                    updateLiveDataRegistration(3, viewModelOnlyShowSipContactsList);


                    if (viewModelOnlyShowSipContactsList != null) {
                        // read viewModel.onlyShowSipContactsList.getValue()
                        viewModelOnlyShowSipContactsListGetValue = viewModelOnlyShowSipContactsList.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelOnlyShowSipContactsListGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelOnlyShowSipContactsListGetValue);
                if((dirtyFlags & 0x3008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelOnlyShowSipContactsListGetValue) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
                if((dirtyFlags & 0x3028L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelOnlyShowSipContactsListGetValue) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }

                if ((dirtyFlags & 0x3008L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue()) ? View.GONE : View.VISIBLE
                        viewModelOnlyShowSipContactsListViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOnlyShowSipContactsListGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x3014L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.sipContactsSelected
                        ViewModelSipContactsSelected1 = viewModel.getSipContactsSelected();
                    }
                    updateLiveDataRegistration(4, ViewModelSipContactsSelected1);


                    if (ViewModelSipContactsSelected1 != null) {
                        // read viewModel.sipContactsSelected.getValue()
                        viewModelSipContactsSelectedGetValue = ViewModelSipContactsSelected1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSipContactsSelectedGetValue);
                if((dirtyFlags & 0x3010L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x4000000L;
                    }
                }
                if((dirtyFlags & 0x3014L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue())
                    viewModelSipContactsSelected = !androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue;
                if((dirtyFlags & 0x3014L) != 0) {
                    if(viewModelSipContactsSelected) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }

                if ((dirtyFlags & 0x3010L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()))
                        androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelected = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSipContactsSelected);
                }
                if ((dirtyFlags & 0x3010L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.VISIBLE : View.GONE
                        viewModelSipContactsSelectedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.GONE : View.VISIBLE
                        viewModelSipContactsSelectedViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x3020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hideSipContactsList
                        viewModelHideSipContactsList = viewModel.getHideSipContactsList();
                    }
                    updateLiveDataRegistration(5, viewModelHideSipContactsList);


                    if (viewModelHideSipContactsList != null) {
                        // read viewModel.hideSipContactsList.getValue()
                        viewModelHideSipContactsListGetValue = viewModelHideSipContactsList.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelHideSipContactsListGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHideSipContactsListGetValue);
                if((dirtyFlags & 0x3020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelHideSipContactsListGetValue) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue()) ? View.GONE : View.VISIBLE
                    viewModelHideSipContactsListViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelHideSipContactsListGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x3040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.filter
                        viewModelFilter = viewModel.getFilter();
                    }
                    updateLiveDataRegistration(6, viewModelFilter);


                    if (viewModelFilter != null) {
                        // read viewModel.filter.getValue()
                        viewModelFilterGetValue = viewModelFilter.getValue();
                    }
            }
            if ((dirtyFlags & 0x3080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.readOnlyNativeAddressBook
                        ViewModelReadOnlyNativeAddressBook1 = viewModel.getReadOnlyNativeAddressBook();
                    }
                    updateLiveDataRegistration(7, ViewModelReadOnlyNativeAddressBook1);


                    if (ViewModelReadOnlyNativeAddressBook1 != null) {
                        // read viewModel.readOnlyNativeAddressBook.getValue()
                        viewModelReadOnlyNativeAddressBookGetValue = ViewModelReadOnlyNativeAddressBook1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelReadOnlyNativeAddressBookGetValue);
                if((dirtyFlags & 0x3080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) ? View.INVISIBLE : View.VISIBLE
                    viewModelReadOnlyNativeAddressBookViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2200000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.contactsList
                    viewModelContactsList = viewModel.getContactsList();
                }
                updateLiveDataRegistration(2, viewModelContactsList);


                if (viewModelContactsList != null) {
                    // read viewModel.contactsList.getValue()
                    viewModelContactsListGetValue = viewModelContactsList.getValue();
                }


                if (viewModelContactsListGetValue != null) {
                    // read viewModel.contactsList.getValue().empty
                    viewModelContactsListEmpty = viewModelContactsListGetValue.isEmpty();
                }
        }
        if ((dirtyFlags & 0x1000000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.hideSipContactsList
                    viewModelHideSipContactsList = viewModel.getHideSipContactsList();
                }
                updateLiveDataRegistration(5, viewModelHideSipContactsList);


                if (viewModelHideSipContactsList != null) {
                    // read viewModel.hideSipContactsList.getValue()
                    viewModelHideSipContactsListGetValue = viewModelHideSipContactsList.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelHideSipContactsListGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHideSipContactsListGetValue);
            if((dirtyFlags & 0x3020L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelHideSipContactsListGetValue) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }
        }
        if ((dirtyFlags & 0x800000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.readOnlyNativeAddressBook
                    ViewModelReadOnlyNativeAddressBook1 = viewModel.getReadOnlyNativeAddressBook();
                }
                updateLiveDataRegistration(7, ViewModelReadOnlyNativeAddressBook1);


                if (ViewModelReadOnlyNativeAddressBook1 != null) {
                    // read viewModel.readOnlyNativeAddressBook.getValue()
                    viewModelReadOnlyNativeAddressBookGetValue = ViewModelReadOnlyNativeAddressBook1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelReadOnlyNativeAddressBookGetValue);
            if((dirtyFlags & 0x3080L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue) {
                        dirtyFlags |= 0x800000000L;
                }
                else {
                        dirtyFlags |= 0x400000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue())
                viewModelReadOnlyNativeAddressBook = !androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue;
        }

        if ((dirtyFlags & 0x3014L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
                viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse = ((viewModelSipContactsSelected) ? (viewModelContactsListEmpty) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
                ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) ? (viewModelContactsListEmpty) : (false));
            if((dirtyFlags & 0x3014L) != 0) {
                if(viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
            if((dirtyFlags & 0x3014L) != 0) {
                if(ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
                ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE1 = ((viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
                viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE = ((ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x3081L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nativeAddressBookEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false
                viewModelNativeAddressBookEnabledViewModelReadOnlyNativeAddressBookBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelNativeAddressBookEnabledGetValue) ? (viewModelReadOnlyNativeAddressBook) : (false));
            if((dirtyFlags & 0x3081L) != 0) {
                if(viewModelNativeAddressBookEnabledViewModelReadOnlyNativeAddressBookBooleanFalse) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nativeAddressBookEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false ? View.VISIBLE : View.INVISIBLE
                viewModelNativeAddressBookEnabledViewModelReadOnlyNativeAddressBookBooleanFalseViewVISIBLEViewINVISIBLE = ((viewModelNativeAddressBookEnabledViewModelReadOnlyNativeAddressBookBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x3028L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue())
                viewModelOnlyShowSipContactsListBooleanTrueViewModelHideSipContactsList = ((androidxDatabindingViewDataBindingSafeUnboxViewModelOnlyShowSipContactsListGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelHideSipContactsListGetValue));
            if((dirtyFlags & 0x3028L) != 0) {
                if(viewModelOnlyShowSipContactsListBooleanTrueViewModelHideSipContactsList) {
                        dirtyFlags |= 0x8000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue()) ? View.VISIBLE : View.GONE
                viewModelOnlyShowSipContactsListBooleanTrueViewModelHideSipContactsListViewVISIBLEViewGONE = ((viewModelOnlyShowSipContactsListBooleanTrueViewModelHideSipContactsList) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelOnlyShowSipContactsListViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x3002L) != 0) {
            // api target 1

            this.mboundView111.setVisibility(viewModelFetchInProgressGetValue);
        }
        if ((dirtyFlags & 0x3014L) != 0) {
            // api target 1

            this.mboundView12.setVisibility(viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE);
            this.mboundView13.setVisibility(ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE1);
        }
        if ((dirtyFlags & 0x2800L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(allContactsToggleClickListener);
        }
        if ((dirtyFlags & 0x3010L) != 0) {
            // api target 1

            this.mboundView2.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue);
            this.mboundView3.setVisibility(viewModelSipContactsSelectedViewGONEViewVISIBLE);
            this.mboundView5.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelected);
            this.mboundView6.setVisibility(viewModelSipContactsSelectedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelHideSipContactsListViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x2100L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(sipContactsToggleClickListener);
        }
        if ((dirtyFlags & 0x3028L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(viewModelOnlyShowSipContactsListBooleanTrueViewModelHideSipContactsListViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2400L) != 0) {
            // api target 1

            this.mboundView8.setOnClickListener(newContactClickListener);
        }
        if ((dirtyFlags & 0x3081L) != 0) {
            // api target 1

            this.mboundView8.setVisibility(viewModelNativeAddressBookEnabledViewModelReadOnlyNativeAddressBookBooleanFalseViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x2200L) != 0) {
            // api target 1

            this.mboundView9.setOnClickListener(editClickListener);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 1

            this.mboundView9.setEnabled(ViewModelContactsListEmpty1);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            this.mboundView9.setVisibility(viewModelReadOnlyNativeAddressBookViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x3040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchBar, viewModelFilterGetValue);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.searchBar, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, searchBarandroidTextAttrChanged);
        }
        executeBindingsOn(mboundView111);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.nativeAddressBookEnabled
        flag 1 (0x2L): viewModel.fetchInProgress
        flag 2 (0x3L): viewModel.contactsList
        flag 3 (0x4L): viewModel.onlyShowSipContactsList
        flag 4 (0x5L): viewModel.sipContactsSelected
        flag 5 (0x6L): viewModel.hideSipContactsList
        flag 6 (0x7L): viewModel.filter
        flag 7 (0x8L): viewModel.readOnlyNativeAddressBook
        flag 8 (0x9L): sipContactsToggleClickListener
        flag 9 (0xaL): editClickListener
        flag 10 (0xbL): newContactClickListener
        flag 11 (0xcL): allContactsToggleClickListener
        flag 12 (0xdL): viewModel
        flag 13 (0xeL): null
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nativeAddressBookEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false ? View.VISIBLE : View.INVISIBLE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nativeAddressBookEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false ? View.VISIBLE : View.INVISIBLE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 21 (0x16L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nativeAddressBookEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.nativeAddressBookEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.GONE : View.VISIBLE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.GONE : View.VISIBLE
        flag 28 (0x1dL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue()) ? View.GONE : View.VISIBLE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue()) ? View.GONE : View.VISIBLE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue()) ? View.GONE : View.VISIBLE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue()) ? View.GONE : View.VISIBLE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue())
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue())
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue()) ? View.VISIBLE : View.GONE
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.onlyShowSipContactsList.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideSipContactsList.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}