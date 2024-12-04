package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContactListCellBindingImpl extends ContactListCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.right, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.CheckBox mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContactListCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ContactListCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.ImageView) bindings[1]
            , (org.linphone.views.MarqueeTextView) bindings[6]
            , (org.linphone.views.MarqueeTextView) bindings[5]
            , (android.widget.LinearLayout) bindings[7]
            );
        this.avatar.setTag(null);
        this.contactOrganization.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.CheckBox) bindings[4];
        this.mboundView4.setTag(null);
        this.name.setTag(null);
        setRootTag(root);
        // listeners
        mCallback48 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
        if (BR.selectionListViewModel == variableId) {
            setSelectionListViewModel((org.linphone.activities.main.viewmodels.ListTopBarViewModel) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.longClickListener == variableId) {
            setLongClickListener((android.view.View.OnLongClickListener) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.contact.viewmodels.ContactViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelectionListViewModel(@Nullable org.linphone.activities.main.viewmodels.ListTopBarViewModel SelectionListViewModel) {
        this.mSelectionListViewModel = SelectionListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.selectionListViewModel);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setLongClickListener(@Nullable android.view.View.OnLongClickListener LongClickListener) {
        this.mLongClickListener = LongClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.longClickListener);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.position);
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
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 1 :
                return onChangeSelectionListViewModelSelectedItems((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>>) object, fieldId);
            case 2 :
                return onChangeSelectionListViewModelIsEditionEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 5 :
                return onChangeViewModelIsNativeContact((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelHasLongTermPresence((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeSelectionListViewModelSelectedItems(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> SelectionListViewModelSelectedItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelIsEditionEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SelectionListViewModelIsEditionEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPresenceStatus(androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> ViewModelPresenceStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNativeContact(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsNativeContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHasLongTermPresence(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelHasLongTermPresence, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;
        java.lang.String viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = null;
        boolean selectionListViewModelSelectedItemsContainsPosition = false;
        int viewModelDisplayOrganizationViewModelContactOrganizationLengthInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHasLongTermPresenceGetValue = false;
        int viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        java.lang.Boolean selectionListViewModelIsEditionEnabledGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = false;
        boolean viewModelDisplayOrganization = false;
        int viewModelHasLongTermPresenceViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> selectionListViewModelSelectedItems = null;
        boolean viewModelPresenceStatusConsolidatedPresenceOffline = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> selectionListViewModelIsEditionEnabled = null;
        java.lang.String viewModelContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> viewModelPresenceStatus = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsNativeContact = null;
        boolean viewModelContactOrganizationLengthInt0 = false;
        boolean selectionListViewModelIsEditionEnabledViewModelIsNativeContactBooleanFalse = false;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        java.lang.String viewModelDisplayNameGetValue = null;
        java.lang.Integer position = mPosition;
        int viewModelContactOrganizationLength = 0;
        org.linphone.core.Friend viewModelContactGetValue = null;
        java.util.ArrayList<java.lang.Integer> selectionListViewModelSelectedItemsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHasLongTermPresence = null;
        int selectionListViewModelIsEditionEnabledViewModelIsNativeContactBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsNativeContactGetValue = null;
        org.linphone.core.ConsolidatedPresence viewModelPresenceStatusGetValue = null;
        boolean viewModelDisplayOrganizationViewModelContactOrganizationLengthInt0BooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsNativeContactGetValue = false;
        org.linphone.activities.main.contact.viewmodels.ContactViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelHasLongTermPresenceGetValue = null;

        if ((dirtyFlags & 0x1ca6L) != 0) {


            if ((dirtyFlags & 0x1482L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.selectedItems
                        selectionListViewModelSelectedItems = selectionListViewModel.getSelectedItems();
                    }
                    updateLiveDataRegistration(1, selectionListViewModelSelectedItems);


                    if (selectionListViewModelSelectedItems != null) {
                        // read selectionListViewModel.selectedItems.getValue()
                        selectionListViewModelSelectedItemsGetValue = selectionListViewModelSelectedItems.getValue();
                    }
            }
            if ((dirtyFlags & 0x18a4L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.isEditionEnabled
                        selectionListViewModelIsEditionEnabled = selectionListViewModel.isEditionEnabled();
                    }
                    updateLiveDataRegistration(2, selectionListViewModelIsEditionEnabled);


                    if (selectionListViewModelIsEditionEnabled != null) {
                        // read selectionListViewModel.isEditionEnabled.getValue()
                        selectionListViewModelIsEditionEnabledGetValue = selectionListViewModelIsEditionEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModelIsEditionEnabledGetValue);
                if((dirtyFlags & 0x18a4L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0x1100L) != 0) {
        }
        if ((dirtyFlags & 0x1200L) != 0) {
        }
        if ((dirtyFlags & 0x1482L) != 0) {



                if (selectionListViewModelSelectedItemsGetValue != null) {
                    // read selectionListViewModel.selectedItems.getValue().contains(position)
                    selectionListViewModelSelectedItemsContainsPosition = selectionListViewModelSelectedItemsGetValue.contains(position);
                }
        }
        if ((dirtyFlags & 0x1859L) != 0) {


            if ((dirtyFlags & 0x1809L) != 0) {

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
                if((dirtyFlags & 0x1809L) != 0) {
                    if(viewModelContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1801L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayOrganization
                        viewModelDisplayOrganization = viewModel.getDisplayOrganization();
                    }
                if((dirtyFlags & 0x1801L) != 0) {
                    if(viewModelDisplayOrganization) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1810L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.presenceStatus
                        viewModelPresenceStatus = viewModel.getPresenceStatus();
                    }
                    updateLiveDataRegistration(4, viewModelPresenceStatus);


                    if (viewModelPresenceStatus != null) {
                        // read viewModel.presenceStatus.getValue()
                        viewModelPresenceStatusGetValue = viewModelPresenceStatus.getValue();
                    }


                    // read viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline
                    viewModelPresenceStatusConsolidatedPresenceOffline = (viewModelPresenceStatusGetValue) == (org.linphone.core.ConsolidatedPresence.Offline);
                if((dirtyFlags & 0x1810L) != 0) {
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
            if ((dirtyFlags & 0x1840L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hasLongTermPresence
                        viewModelHasLongTermPresence = viewModel.getHasLongTermPresence();
                    }
                    updateLiveDataRegistration(6, viewModelHasLongTermPresence);


                    if (viewModelHasLongTermPresence != null) {
                        // read viewModel.hasLongTermPresence.getValue()
                        viewModelHasLongTermPresenceGetValue = viewModelHasLongTermPresence.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasLongTermPresence.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelHasLongTermPresenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHasLongTermPresenceGetValue);
                if((dirtyFlags & 0x1840L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelHasLongTermPresenceGetValue) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasLongTermPresence.getValue()) ? View.VISIBLE : View.GONE
                    viewModelHasLongTermPresenceViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelHasLongTermPresenceGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x4000000L) != 0) {

                if (viewModelContactOrganization != null) {
                    // read viewModel.contact.getValue().organization.length()
                    viewModelContactOrganizationLength = viewModelContactOrganization.length();
                }


                // read viewModel.contact.getValue().organization.length() > 0
                viewModelContactOrganizationLengthInt0 = (viewModelContactOrganizationLength) > (0);
        }
        if ((dirtyFlags & 0x404000L) != 0) {


            if ((dirtyFlags & 0x4000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayName
                        viewModelDisplayName = viewModel.getDisplayName();
                    }
                    updateLiveDataRegistration(3, viewModelDisplayName);


                    if (viewModelDisplayName != null) {
                        // read viewModel.displayName.getValue()
                        viewModelDisplayNameGetValue = viewModelDisplayName.getValue();
                    }
            }
            if ((dirtyFlags & 0x400000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNativeContact
                        viewModelIsNativeContact = viewModel.isNativeContact();
                    }
                    updateLiveDataRegistration(5, viewModelIsNativeContact);


                    if (viewModelIsNativeContact != null) {
                        // read viewModel.isNativeContact.getValue()
                        viewModelIsNativeContactGetValue = viewModelIsNativeContact.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsNativeContactGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsNativeContactGetValue);
            }
        }

        if ((dirtyFlags & 0x1809L) != 0) {

                // read viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
                viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = ((viewModelContactNameJavaLangObjectNull) ? (viewModelDisplayNameGetValue) : (viewModelContactName));
        }
        if ((dirtyFlags & 0x18a4L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) : false
                selectionListViewModelIsEditionEnabledViewModelIsNativeContactBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelIsNativeContactGetValue) : (false));
            if((dirtyFlags & 0x18a4L) != 0) {
                if(selectionListViewModelIsEditionEnabledViewModelIsNativeContactBooleanFalse) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) : false ? View.VISIBLE : View.GONE
                selectionListViewModelIsEditionEnabledViewModelIsNativeContactBooleanFalseViewVISIBLEViewGONE = ((selectionListViewModelIsEditionEnabledViewModelIsNativeContactBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1801L) != 0) {

                // read viewModel.displayOrganization ? viewModel.contact.getValue().organization.length() > 0 : false
                viewModelDisplayOrganizationViewModelContactOrganizationLengthInt0BooleanFalse = ((viewModelDisplayOrganization) ? (viewModelContactOrganizationLengthInt0) : (false));
            if((dirtyFlags & 0x1801L) != 0) {
                if(viewModelDisplayOrganizationViewModelContactOrganizationLengthInt0BooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read viewModel.displayOrganization ? viewModel.contact.getValue().organization.length() > 0 : false ? View.VISIBLE : View.GONE
                viewModelDisplayOrganizationViewModelContactOrganizationLengthInt0BooleanFalseViewVISIBLEViewGONE = ((viewModelDisplayOrganizationViewModelContactOrganizationLengthInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.avatar, viewModel);
        }
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.contactOrganization, viewModelContactOrganization);
            this.contactOrganization.setVisibility(viewModelDisplayOrganizationViewModelContactOrganizationLengthInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1100L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x1200L) != 0) {
            // api target 1

            this.mboundView0.setOnLongClickListener(longClickListener);
        }
        if ((dirtyFlags & 0x1810L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView2, viewModelPresenceStatusGetValue);
            this.mboundView2.setVisibility(viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1840L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelHasLongTermPresenceViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback48);
        }
        if ((dirtyFlags & 0x18a4L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(selectionListViewModelIsEditionEnabledViewModelIsNativeContactBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1482L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView4, selectionListViewModelSelectedItemsContainsPosition);
        }
        if ((dirtyFlags & 0x1809L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.name, viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName);
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
        flag 0 (0x1L): viewModel.contact
        flag 1 (0x2L): selectionListViewModel.selectedItems
        flag 2 (0x3L): selectionListViewModel.isEditionEnabled
        flag 3 (0x4L): viewModel.displayName
        flag 4 (0x5L): viewModel.presenceStatus
        flag 5 (0x6L): viewModel.isNativeContact
        flag 6 (0x7L): viewModel.hasLongTermPresence
        flag 7 (0x8L): selectionListViewModel
        flag 8 (0x9L): clickListener
        flag 9 (0xaL): longClickListener
        flag 10 (0xbL): position
        flag 11 (0xcL): viewModel
        flag 12 (0xdL): null
        flag 13 (0xeL): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 14 (0xfL): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 15 (0x10L): viewModel.displayOrganization ? viewModel.contact.getValue().organization.length() > 0 : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.displayOrganization ? viewModel.contact.getValue().organization.length() > 0 : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 18 (0x13L): viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasLongTermPresence.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hasLongTermPresence.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) : false
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) : false
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNativeContact.getValue()) : false ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.displayOrganization ? viewModel.contact.getValue().organization.length() > 0 : false
        flag 26 (0x1bL): viewModel.displayOrganization ? viewModel.contact.getValue().organization.length() > 0 : false
    flag mapping end*/
    //end
}