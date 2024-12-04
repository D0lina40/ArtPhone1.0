package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContactDetailFragmentBindingImpl extends ContactDetailFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {9},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView7;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContactDetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ContactDetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[10]
            );
        this.avatar.setTag(null);
        this.back.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[9];
        setContainedBinding(this.mboundView01);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (org.linphone.views.MarqueeTextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
        if (BR.deleteClickListener == variableId) {
            setDeleteClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.sharedMainViewModel == variableId) {
            setSharedMainViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else if (BR.editClickListener == variableId) {
            setEditClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.contact.viewmodels.ContactViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDeleteClickListener(@Nullable android.view.View.OnClickListener DeleteClickListener) {
        this.mDeleteClickListener = DeleteClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.deleteClickListener);
        super.requestRebind();
    }
    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setEditClickListener(@Nullable android.view.View.OnClickListener EditClickListener) {
        this.mEditClickListener = EditClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.editClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.contact.viewmodels.ContactViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
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
                return onChangeViewModelContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 1 :
                return onChangeViewModelNumbersAndAddresses((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.ContactNumberOrAddressData>>) object, fieldId);
            case 2 :
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 4 :
                return onChangeViewModelIsNativeContact((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelWaitForChatRoomCreation((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelReadOnlyNativeAddressBook((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> ViewModelContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNumbersAndAddresses(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.ContactNumberOrAddressData>> ViewModelNumbersAndAddresses, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPresenceStatus(androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> ViewModelPresenceStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNativeContact(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsNativeContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWaitForChatRoomCreation(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelWaitForChatRoomCreation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
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
        boolean viewModelContactNameJavaLangObjectNull = false;
        java.lang.String viewModelContactOrganization = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> viewModelContact = null;
        java.lang.Boolean viewModelReadOnlyNativeAddressBookGetValue = null;
        java.lang.String viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        boolean viewModelIsNativeContactViewModelReadOnlyNativeAddressBookBooleanFalse = false;
        int viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue = false;
        boolean viewModelDisplayOrganization = false;
        android.view.View.OnClickListener deleteClickListener = mDeleteClickListener;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.ContactNumberOrAddressData>> viewModelNumbersAndAddresses = null;
        boolean viewModelPresenceStatusConsolidatedPresenceOffline = false;
        java.lang.String viewModelContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> viewModelPresenceStatus = null;
        boolean viewModelReadOnlyNativeAddressBook = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsNativeContact = null;
        java.lang.Boolean viewModelWaitForChatRoomCreationGetValue = null;
        java.lang.String viewModelDisplayNameGetValue = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        java.util.ArrayList<org.linphone.activities.main.contact.data.ContactNumberOrAddressData> viewModelNumbersAndAddressesGetValue = null;
        android.view.View.OnClickListener editClickListener = mEditClickListener;
        int viewModelIsNativeContactViewModelReadOnlyNativeAddressBookBooleanFalseViewVISIBLEViewINVISIBLE = 0;
        org.linphone.core.Friend viewModelContactGetValue = null;
        int viewModelDisplayOrganizationViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsNativeContactGetValue = null;
        org.linphone.core.ConsolidatedPresence viewModelPresenceStatusGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWaitForChatRoomCreation = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsNativeContactGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelReadOnlyNativeAddressBook1 = null;
        org.linphone.activities.main.contact.viewmodels.ContactViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1100L) != 0) {
        }
        if ((dirtyFlags & 0x1240L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(6, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x1240L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1400L) != 0) {
        }
        if ((dirtyFlags & 0x18bfL) != 0) {


            if ((dirtyFlags & 0x1805L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contact
                        viewModelContact = viewModel.getContact();
                    }
                    updateLiveDataRegistration(0, viewModelContact);


                    if (viewModelContact != null) {
                        // read viewModel.contact.getValue()
                        viewModelContactGetValue = viewModelContact.getValue();
                    }

                if ((dirtyFlags & 0x1801L) != 0) {

                        if (viewModelContactGetValue != null) {
                            // read viewModel.contact.getValue().organization
                            viewModelContactOrganization = viewModelContactGetValue.getOrganization();
                        }
                }

                    if (viewModelContactGetValue != null) {
                        // read viewModel.contact.getValue().name
                        viewModelContactName = viewModelContactGetValue.getName();
                    }


                    // read viewModel.contact.getValue().name == null
                    viewModelContactNameJavaLangObjectNull = (viewModelContactName) == (null);
                if((dirtyFlags & 0x1805L) != 0) {
                    if(viewModelContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayOrganization
                        viewModelDisplayOrganization = viewModel.getDisplayOrganization();
                    }
                if((dirtyFlags & 0x1800L) != 0) {
                    if(viewModelDisplayOrganization) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read viewModel.displayOrganization ? View.VISIBLE : View.GONE
                    viewModelDisplayOrganizationViewVISIBLEViewGONE = ((viewModelDisplayOrganization) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1802L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.numbersAndAddresses
                        viewModelNumbersAndAddresses = viewModel.getNumbersAndAddresses();
                    }
                    updateLiveDataRegistration(1, viewModelNumbersAndAddresses);


                    if (viewModelNumbersAndAddresses != null) {
                        // read viewModel.numbersAndAddresses.getValue()
                        viewModelNumbersAndAddressesGetValue = viewModelNumbersAndAddresses.getValue();
                    }
            }
            if ((dirtyFlags & 0x1808L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.presenceStatus
                        viewModelPresenceStatus = viewModel.getPresenceStatus();
                    }
                    updateLiveDataRegistration(3, viewModelPresenceStatus);


                    if (viewModelPresenceStatus != null) {
                        // read viewModel.presenceStatus.getValue()
                        viewModelPresenceStatusGetValue = viewModelPresenceStatus.getValue();
                    }


                    // read viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline
                    viewModelPresenceStatusConsolidatedPresenceOffline = (viewModelPresenceStatusGetValue) == (org.linphone.core.ConsolidatedPresence.Offline);
                if((dirtyFlags & 0x1808L) != 0) {
                    if(viewModelPresenceStatusConsolidatedPresenceOffline) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
                    viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = ((viewModelPresenceStatusConsolidatedPresenceOffline) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1890L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNativeContact
                        viewModelIsNativeContact = viewModel.isNativeContact();
                    }
                    updateLiveDataRegistration(4, viewModelIsNativeContact);


                    if (viewModelIsNativeContact != null) {
                        // read viewModel.isNativeContact.getValue()
                        viewModelIsNativeContactGetValue = viewModelIsNativeContact.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsNativeContactGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsNativeContactGetValue);
                if((dirtyFlags & 0x1890L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsNativeContactGetValue) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1820L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.waitForChatRoomCreation
                        viewModelWaitForChatRoomCreation = viewModel.getWaitForChatRoomCreation();
                    }
                    updateLiveDataRegistration(5, viewModelWaitForChatRoomCreation);


                    if (viewModelWaitForChatRoomCreation != null) {
                        // read viewModel.waitForChatRoomCreation.getValue()
                        viewModelWaitForChatRoomCreationGetValue = viewModelWaitForChatRoomCreation.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.displayName
                    viewModelDisplayName = viewModel.getDisplayName();
                }
                updateLiveDataRegistration(2, viewModelDisplayName);


                if (viewModelDisplayName != null) {
                    // read viewModel.displayName.getValue()
                    viewModelDisplayNameGetValue = viewModelDisplayName.getValue();
                }
        }
        if ((dirtyFlags & 0x10000L) != 0) {

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


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue())
                viewModelReadOnlyNativeAddressBook = !androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue;
        }

        if ((dirtyFlags & 0x1805L) != 0) {

                // read viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
                viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = ((viewModelContactNameJavaLangObjectNull) ? (viewModelDisplayNameGetValue) : (viewModelContactName));
        }
        if ((dirtyFlags & 0x1890L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false
                viewModelIsNativeContactViewModelReadOnlyNativeAddressBookBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsNativeContactGetValue) ? (viewModelReadOnlyNativeAddressBook) : (false));
            if((dirtyFlags & 0x1890L) != 0) {
                if(viewModelIsNativeContactViewModelReadOnlyNativeAddressBookBooleanFalse) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false ? View.VISIBLE : View.INVISIBLE
                viewModelIsNativeContactViewModelReadOnlyNativeAddressBookBooleanFalseViewVISIBLEViewINVISIBLE = ((viewModelIsNativeContactViewModelReadOnlyNativeAddressBookBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadBigContactPictureWithCoil(this.avatar, viewModel);
            this.mboundView7.setVisibility(viewModelDisplayOrganizationViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1240L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1820L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForChatRoomCreationGetValue);
        }
        if ((dirtyFlags & 0x1400L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(editClickListener);
        }
        if ((dirtyFlags & 0x1890L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelIsNativeContactViewModelReadOnlyNativeAddressBookBooleanFalseViewVISIBLEViewINVISIBLE);
            this.mboundView3.setVisibility(viewModelIsNativeContactViewModelReadOnlyNativeAddressBookBooleanFalseViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x1100L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(deleteClickListener);
        }
        if ((dirtyFlags & 0x1808L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView5, viewModelPresenceStatusGetValue);
            this.mboundView5.setVisibility(viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1805L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName);
        }
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelContactOrganization);
        }
        if ((dirtyFlags & 0x1802L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView8, viewModelNumbersAndAddressesGetValue, R.layout.contact_detail_cell);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.contact
        flag 1 (0x2L): viewModel.numbersAndAddresses
        flag 2 (0x3L): viewModel.displayName
        flag 3 (0x4L): viewModel.presenceStatus
        flag 4 (0x5L): viewModel.isNativeContact
        flag 5 (0x6L): viewModel.waitForChatRoomCreation
        flag 6 (0x7L): sharedMainViewModel.isSlidingPaneSlideable
        flag 7 (0x8L): viewModel.readOnlyNativeAddressBook
        flag 8 (0x9L): deleteClickListener
        flag 9 (0xaL): sharedMainViewModel
        flag 10 (0xbL): editClickListener
        flag 11 (0xcL): viewModel
        flag 12 (0xdL): null
        flag 13 (0xeL): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 14 (0xfL): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false
        flag 17 (0x12L): viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 18 (0x13L): viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false ? View.VISIBLE : View.INVISIBLE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) : false ? View.VISIBLE : View.INVISIBLE
        flag 23 (0x18L): viewModel.displayOrganization ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.displayOrganization ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}