package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomCreationFragmentBindingImpl extends ChatRoomCreationFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(22);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {18},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 19);
        sViewsWithIds.put(R.id.back, 20);
        sViewsWithIds.put(R.id.contactsList, 21);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.view.View mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView11;
    @NonNull
    private final android.widget.ImageView mboundView13;
    @NonNull
    private final android.widget.LinearLayout mboundView15;
    @NonNull
    private final android.widget.TextView mboundView16;
    @NonNull
    private final android.widget.TextView mboundView17;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.RelativeLayout mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.view.View mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView8;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback241;
    @Nullable
    private final android.view.View.OnClickListener mCallback242;
    @Nullable
    private final android.view.View.OnClickListener mCallback243;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView3androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.isEncrypted.getValue()
            //         is viewModel.isEncrypted.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView3.isChecked();
            // localize variables for thread safety
            // viewModel.isEncrypted
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEncrypted = null;
            // viewModel.isEncrypted.getValue()
            java.lang.Boolean viewModelIsEncryptedGetValue = null;
            // viewModel.isEncrypted != null
            boolean viewModelIsEncryptedJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.chat.viewmodels.ChatRoomCreationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelIsEncrypted = viewModel.isEncrypted();

                viewModelIsEncryptedJavaLangObjectNull = (viewModelIsEncrypted) != (null);
                if (viewModelIsEncryptedJavaLangObjectNull) {




                    viewModelIsEncrypted.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
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
            org.linphone.activities.main.chat.viewmodels.ChatRoomCreationViewModel viewModel = mViewModel;
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

    public ChatRoomCreationFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private ChatRoomCreationFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (android.widget.ImageView) bindings[20]
            , (androidx.recyclerview.widget.RecyclerView) bindings[21]
            , (android.widget.HorizontalScrollView) bindings[14]
            , (android.widget.EditText) bindings[12]
            , (android.widget.LinearLayout) bindings[19]
            );
        this.layoutContactsSelected.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[18];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.view.View) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.ImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView13 = (android.widget.ImageView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView15 = (android.widget.LinearLayout) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.TextView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.widget.TextView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.RelativeLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.view.View) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.searchBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback241 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback242 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback243 = new org.linphone.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
        if (BR.sipContactsToggleClickListener == variableId) {
            setSipContactsToggleClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.nextClickListener == variableId) {
            setNextClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.allContactsToggleClickListener == variableId) {
            setAllContactsToggleClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.chat.viewmodels.ChatRoomCreationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSipContactsToggleClickListener(@Nullable android.view.View.OnClickListener SipContactsToggleClickListener) {
        this.mSipContactsToggleClickListener = SipContactsToggleClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.sipContactsToggleClickListener);
        super.requestRebind();
    }
    public void setNextClickListener(@Nullable android.view.View.OnClickListener NextClickListener) {
        this.mNextClickListener = NextClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.nextClickListener);
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
    public void setViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.ChatRoomCreationViewModel ViewModel) {
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
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelSecureChatAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelSelectedAddresses((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>>) object, fieldId);
            case 2 :
                return onChangeViewModelFetchInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelCreateGroupChat((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelContactsList((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.SearchResult>>) object, fieldId);
            case 5 :
                return onChangeViewModelSipContactsSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelFilter((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelIsEncrypted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelWaitForChatRoomCreation((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSecureChatAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSecureChatAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectedAddresses(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>> ViewModelSelectedAddresses, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFetchInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelFetchInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCreateGroupChat(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelCreateGroupChat, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelContactsList(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.SearchResult>> ViewModelContactsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSipContactsSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSipContactsSelected, int fieldId) {
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
    private boolean onChangeViewModelIsEncrypted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsEncrypted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWaitForChatRoomCreation(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelWaitForChatRoomCreation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        java.lang.Boolean viewModelFetchInProgressGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSecureChatAvailable = null;
        boolean viewModelSecureChatMandatory = false;
        boolean viewModelSipContactsSelected = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue = false;
        int viewModelSipContactsSelectedViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>> viewModelSelectedAddresses = null;
        boolean viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse = false;
        java.lang.String viewModelFilterGetValue = null;
        java.lang.Boolean viewModelSipContactsSelectedGetValue = null;
        boolean viewModelSelectedAddressesSizeInt0 = false;
        java.lang.Boolean viewModelSecureChatAvailableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelected = false;
        boolean viewModelContactsListEmpty = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelFetchInProgress = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelCreateGroupChat = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.SearchResult>> viewModelContactsList = null;
        java.util.ArrayList<org.linphone.core.Address> viewModelSelectedAddressesGetValue = null;
        android.view.View.OnClickListener sipContactsToggleClickListener = mSipContactsToggleClickListener;
        boolean ViewModelSecureChatMandatory1 = false;
        boolean ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1 = false;
        int viewModelSipContactsSelectedViewGONEViewVISIBLE = 0;
        int viewModelSecureChatAvailableViewModelSecureChatMandatoryBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        java.lang.Boolean viewModelWaitForChatRoomCreationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSipContactsSelected1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelCreateGroupChatGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFilter = null;
        boolean viewModelWaitForChatRoomCreationBooleanTrueViewModelFetchInProgress = false;
        java.lang.Boolean viewModelCreateGroupChatGetValue = null;
        java.util.ArrayList<org.linphone.core.SearchResult> viewModelContactsListGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEncrypted = null;
        int ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE1 = 0;
        int viewModelSelectedAddressesSize = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelWaitForChatRoomCreationGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelFetchInProgressGetValue = false;
        boolean viewModelSecureChatAvailableViewModelSecureChatMandatoryBooleanFalse = false;
        int viewModelCreateGroupChatViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener nextClickListener = mNextClickListener;
        java.lang.Boolean viewModelIsEncryptedGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelSecureChatAvailableGetValue = false;
        int viewModelCreateGroupChatViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener allContactsToggleClickListener = mAllContactsToggleClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWaitForChatRoomCreation = null;
        org.linphone.activities.main.chat.viewmodels.ChatRoomCreationViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x2200L) != 0) {
        }
        if ((dirtyFlags & 0x2400L) != 0) {
        }
        if ((dirtyFlags & 0x2800L) != 0) {
        }
        if ((dirtyFlags & 0x31ffL) != 0) {


            if ((dirtyFlags & 0x3001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.secureChatAvailable
                        viewModelSecureChatAvailable = viewModel.getSecureChatAvailable();
                    }
                    updateLiveDataRegistration(0, viewModelSecureChatAvailable);


                    if (viewModelSecureChatAvailable != null) {
                        // read viewModel.secureChatAvailable.getValue()
                        viewModelSecureChatAvailableGetValue = viewModelSecureChatAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secureChatAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSecureChatAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSecureChatAvailableGetValue);
                if((dirtyFlags & 0x3001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelSecureChatAvailableGetValue) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x3002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedAddresses
                        viewModelSelectedAddresses = viewModel.getSelectedAddresses();
                    }
                    updateLiveDataRegistration(1, viewModelSelectedAddresses);


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
            if ((dirtyFlags & 0x3008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.createGroupChat
                        viewModelCreateGroupChat = viewModel.getCreateGroupChat();
                    }
                    updateLiveDataRegistration(3, viewModelCreateGroupChat);


                    if (viewModelCreateGroupChat != null) {
                        // read viewModel.createGroupChat.getValue()
                        viewModelCreateGroupChatGetValue = viewModelCreateGroupChat.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.createGroupChat.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCreateGroupChatGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCreateGroupChatGetValue);
                if((dirtyFlags & 0x3008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelCreateGroupChatGetValue) {
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.createGroupChat.getValue()) ? View.VISIBLE : View.GONE
                    viewModelCreateGroupChatViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelCreateGroupChatGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.createGroupChat.getValue()) ? View.GONE : View.VISIBLE
                    viewModelCreateGroupChatViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelCreateGroupChatGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x3030L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.sipContactsSelected
                        ViewModelSipContactsSelected1 = viewModel.getSipContactsSelected();
                    }
                    updateLiveDataRegistration(5, ViewModelSipContactsSelected1);


                    if (ViewModelSipContactsSelected1 != null) {
                        // read viewModel.sipContactsSelected.getValue()
                        viewModelSipContactsSelectedGetValue = ViewModelSipContactsSelected1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSipContactsSelectedGetValue);
                if((dirtyFlags & 0x3020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0x3030L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue())
                    viewModelSipContactsSelected = !androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue;
                if((dirtyFlags & 0x3030L) != 0) {
                    if(viewModelSipContactsSelected) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }

                if ((dirtyFlags & 0x3020L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()))
                        androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelected = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSipContactsSelected);
                }
                if ((dirtyFlags & 0x3020L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.VISIBLE : View.GONE
                        viewModelSipContactsSelectedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.GONE : View.VISIBLE
                        viewModelSipContactsSelectedViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
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
                        // read viewModel.isEncrypted
                        viewModelIsEncrypted = viewModel.isEncrypted();
                    }
                    updateLiveDataRegistration(7, viewModelIsEncrypted);


                    if (viewModelIsEncrypted != null) {
                        // read viewModel.isEncrypted.getValue()
                        viewModelIsEncryptedGetValue = viewModelIsEncrypted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEncrypted.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEncryptedGetValue);
            }
            if ((dirtyFlags & 0x3104L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.waitForChatRoomCreation
                        viewModelWaitForChatRoomCreation = viewModel.getWaitForChatRoomCreation();
                    }
                    updateLiveDataRegistration(8, viewModelWaitForChatRoomCreation);


                    if (viewModelWaitForChatRoomCreation != null) {
                        // read viewModel.waitForChatRoomCreation.getValue()
                        viewModelWaitForChatRoomCreationGetValue = viewModelWaitForChatRoomCreation.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.waitForChatRoomCreation.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelWaitForChatRoomCreationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelWaitForChatRoomCreationGetValue);
                if((dirtyFlags & 0x3104L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelWaitForChatRoomCreationGetValue) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.fetchInProgress
                    viewModelFetchInProgress = viewModel.getFetchInProgress();
                }
                updateLiveDataRegistration(2, viewModelFetchInProgress);


                if (viewModelFetchInProgress != null) {
                    // read viewModel.fetchInProgress.getValue()
                    viewModelFetchInProgressGetValue = viewModelFetchInProgress.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchInProgress.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelFetchInProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelFetchInProgressGetValue);
        }
        if ((dirtyFlags & 0x280000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.contactsList
                    viewModelContactsList = viewModel.getContactsList();
                }
                updateLiveDataRegistration(4, viewModelContactsList);


                if (viewModelContactsList != null) {
                    // read viewModel.contactsList.getValue()
                    viewModelContactsListGetValue = viewModelContactsList.getValue();
                }


                if (viewModelContactsListGetValue != null) {
                    // read viewModel.contactsList.getValue().empty
                    viewModelContactsListEmpty = viewModelContactsListGetValue.isEmpty();
                }
        }
        if ((dirtyFlags & 0x80000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.secureChatMandatory
                    ViewModelSecureChatMandatory1 = viewModel.getSecureChatMandatory();
                }


                // read !viewModel.secureChatMandatory
                viewModelSecureChatMandatory = !ViewModelSecureChatMandatory1;
        }

        if ((dirtyFlags & 0x3030L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
                viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse = ((viewModelSipContactsSelected) ? (viewModelContactsListEmpty) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
                ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue) ? (viewModelContactsListEmpty) : (false));
            if((dirtyFlags & 0x3030L) != 0) {
                if(viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalse) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
            if((dirtyFlags & 0x3030L) != 0) {
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
        if ((dirtyFlags & 0x3104L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.waitForChatRoomCreation.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchInProgress.getValue())
                viewModelWaitForChatRoomCreationBooleanTrueViewModelFetchInProgress = ((androidxDatabindingViewDataBindingSafeUnboxViewModelWaitForChatRoomCreationGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelFetchInProgressGetValue));
        }
        if ((dirtyFlags & 0x3001L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secureChatAvailable.getValue()) ? !viewModel.secureChatMandatory : false
                viewModelSecureChatAvailableViewModelSecureChatMandatoryBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelSecureChatAvailableGetValue) ? (viewModelSecureChatMandatory) : (false));
            if((dirtyFlags & 0x3001L) != 0) {
                if(viewModelSecureChatAvailableViewModelSecureChatMandatoryBooleanFalse) {
                        dirtyFlags |= 0x2000000L;
                }
                else {
                        dirtyFlags |= 0x1000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secureChatAvailable.getValue()) ? !viewModel.secureChatMandatory : false ? View.VISIBLE : View.INVISIBLE
                viewModelSecureChatAvailableViewModelSecureChatMandatoryBooleanFalseViewVISIBLEViewINVISIBLE = ((viewModelSecureChatAvailableViewModelSecureChatMandatoryBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            this.layoutContactsSelected.setVisibility(viewModelCreateGroupChatViewVISIBLEViewGONE);
            this.mboundView11.setVisibility(viewModelCreateGroupChatViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(viewModelCreateGroupChatViewGONEViewVISIBLE);
            this.mboundView8.setVisibility(viewModelCreateGroupChatViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x3104L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForChatRoomCreationBooleanTrueViewModelFetchInProgress);
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelSecureChatAvailableViewModelSecureChatMandatoryBooleanFalseViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelSipContactsSelectedViewVISIBLEViewGONE);
            this.mboundView6.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelectedGetValue);
            this.mboundView7.setVisibility(viewModelSipContactsSelectedViewGONEViewVISIBLE);
            this.mboundView9.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelSipContactsSelected);
        }
        if ((dirtyFlags & 0x2400L) != 0) {
            // api target 1

            this.mboundView11.setOnClickListener(nextClickListener);
        }
        if ((dirtyFlags & 0x3002L) != 0) {
            // api target 1

            this.mboundView11.setEnabled(viewModelSelectedAddressesSizeInt0);
            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView15, viewModelSelectedAddressesGetValue, R.layout.contact_selected_cell, viewModel);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.mboundView13.setOnClickListener(mCallback243);
            this.mboundView2.setOnClickListener(mCallback241);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView3, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView3androidCheckedAttrChanged);
            this.mboundView4.setOnClickListener(mCallback242);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.searchBar, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, searchBarandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x3030L) != 0) {
            // api target 1

            this.mboundView16.setVisibility(viewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE);
            this.mboundView17.setVisibility(ViewModelSipContactsSelectedViewModelContactsListEmptyBooleanFalseViewVISIBLEViewGONE1);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, androidxDatabindingViewDataBindingSafeUnboxViewModelIsEncryptedGetValue);
        }
        if ((dirtyFlags & 0x2800L) != 0) {
            // api target 1

            this.mboundView6.setOnClickListener(allContactsToggleClickListener);
        }
        if ((dirtyFlags & 0x2200L) != 0) {
            // api target 1

            this.mboundView9.setOnClickListener(sipContactsToggleClickListener);
        }
        if ((dirtyFlags & 0x3040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchBar, viewModelFilterGetValue);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.chat.viewmodels.ChatRoomCreationViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.updateEncryption(false);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.chat.viewmodels.ChatRoomCreationViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.updateEncryption(true);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.chat.viewmodels.ChatRoomCreationViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.clearFilter();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.secureChatAvailable
        flag 1 (0x2L): viewModel.selectedAddresses
        flag 2 (0x3L): viewModel.fetchInProgress
        flag 3 (0x4L): viewModel.createGroupChat
        flag 4 (0x5L): viewModel.contactsList
        flag 5 (0x6L): viewModel.sipContactsSelected
        flag 6 (0x7L): viewModel.filter
        flag 7 (0x8L): viewModel.isEncrypted
        flag 8 (0x9L): viewModel.waitForChatRoomCreation
        flag 9 (0xaL): sipContactsToggleClickListener
        flag 10 (0xbL): nextClickListener
        flag 11 (0xcL): allContactsToggleClickListener
        flag 12 (0xdL): viewModel
        flag 13 (0xeL): null
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 19 (0x14L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.GONE : View.VISIBLE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? View.GONE : View.VISIBLE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secureChatAvailable.getValue()) ? !viewModel.secureChatMandatory : false ? View.VISIBLE : View.INVISIBLE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secureChatAvailable.getValue()) ? !viewModel.secureChatMandatory : false ? View.VISIBLE : View.INVISIBLE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.waitForChatRoomCreation.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchInProgress.getValue())
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.waitForChatRoomCreation.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchInProgress.getValue())
        flag 28 (0x1dL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.sipContactsSelected.getValue()) ? viewModel.contactsList.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secureChatAvailable.getValue()) ? !viewModel.secureChatMandatory : false
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.secureChatAvailable.getValue()) ? !viewModel.secureChatMandatory : false
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.createGroupChat.getValue()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.createGroupChat.getValue()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.createGroupChat.getValue()) ? View.GONE : View.VISIBLE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.createGroupChat.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}