package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HistoryListCellBindingImpl extends HistoryListCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.CheckBox mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback105;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HistoryListCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private HistoryListCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[7]
            , (org.linphone.views.MarqueeTextView) bindings[6]
            );
        this.avatar.setTag(null);
        this.icon.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.CheckBox) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.sipUri.setTag(null);
        setRootTag(root);
        // listeners
        mCallback105 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
        if (BR.detailsClickListener == variableId) {
            setDetailsClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.selectionListViewModel == variableId) {
            setSelectionListViewModel((org.linphone.activities.main.viewmodels.ListTopBarViewModel) variable);
        }
        else if (BR.groupCount == variableId) {
            setGroupCount((java.lang.Integer) variable);
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
            setViewModel((org.linphone.activities.main.history.viewmodels.CallLogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDetailsClickListener(@Nullable android.view.View.OnClickListener DetailsClickListener) {
        this.mDetailsClickListener = DetailsClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.detailsClickListener);
        super.requestRebind();
    }
    public void setSelectionListViewModel(@Nullable org.linphone.activities.main.viewmodels.ListTopBarViewModel SelectionListViewModel) {
        this.mSelectionListViewModel = SelectionListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.selectionListViewModel);
        super.requestRebind();
    }
    public void setGroupCount(@Nullable java.lang.Integer GroupCount) {
        this.mGroupCount = GroupCount;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.groupCount);
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
    public void setViewModel(@Nullable org.linphone.activities.main.history.viewmodels.CallLogViewModel ViewModel) {
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.view.View.OnClickListener detailsClickListener = mDetailsClickListener;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> viewModelContact = null;
        org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;
        boolean selectionListViewModelSelectedItemsContainsPosition = false;
        java.lang.Integer groupCount = mGroupCount;
        int viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        java.lang.Boolean selectionListViewModelIsEditionEnabledGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = false;
        int selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = 0;
        int viewModelIconContentDescription = 0;
        java.lang.String javaLangStringGroupCountJavaLangString = null;
        java.lang.String viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameGroupCountInt1JavaLangStringGroupCountJavaLangStringJavaLangString = null;
        boolean viewModelIsConferenceCallLog = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> selectionListViewModelSelectedItems = null;
        java.lang.String viewModelConferenceSubject = null;
        boolean viewModelPresenceStatusConsolidatedPresenceOffline = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> selectionListViewModelIsEditionEnabled = null;
        java.lang.String viewModelContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> viewModelPresenceStatus = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabled = false;
        int viewModelStatusIconResource = 0;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        java.lang.String viewModelDisplayNameGetValue = null;
        java.lang.Integer position = mPosition;
        int androidxDatabindingViewDataBindingSafeUnboxGroupCount = 0;
        org.linphone.core.Friend viewModelContactGetValue = null;
        boolean viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNull = false;
        boolean SelectionListViewModelIsEditionEnabled1 = false;
        java.lang.String javaLangStringGroupCount = null;
        java.util.ArrayList<java.lang.Integer> selectionListViewModelSelectedItemsGetValue = null;
        boolean groupCountInt1 = false;
        java.lang.String groupCountInt1JavaLangStringGroupCountJavaLangStringJavaLangString = null;
        org.linphone.core.ConsolidatedPresence viewModelPresenceStatusGetValue = null;
        java.lang.String viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactName = null;
        int viewModelIsConferenceCallLogViewGONEViewVISIBLE = 0;
        org.linphone.activities.main.history.viewmodels.CallLogViewModel viewModel = mViewModel;
        java.lang.String viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactName = null;

        if ((dirtyFlags & 0x1020L) != 0) {
        }
        if ((dirtyFlags & 0x1446L) != 0) {


            if ((dirtyFlags & 0x1442L) != 0) {

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
            if ((dirtyFlags & 0x1044L) != 0) {

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
                if((dirtyFlags & 0x1044L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
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
        if ((dirtyFlags & 0x1889L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(groupCount)
                androidxDatabindingViewDataBindingSafeUnboxGroupCount = androidx.databinding.ViewDataBinding.safeUnbox(groupCount);


                // read androidx.databinding.ViewDataBinding.safeUnbox(groupCount) > 1
                groupCountInt1 = (androidxDatabindingViewDataBindingSafeUnboxGroupCount) > (1);
            if((dirtyFlags & 0x1889L) != 0) {
                if(groupCountInt1) {
                        dirtyFlags |= 0x40000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                }
            }
        }
        if ((dirtyFlags & 0x1100L) != 0) {
        }
        if ((dirtyFlags & 0x1200L) != 0) {
        }
        if ((dirtyFlags & 0x1442L) != 0) {



                if (selectionListViewModelSelectedItemsGetValue != null) {
                    // read selectionListViewModel.selectedItems.getValue().contains(position)
                    selectionListViewModelSelectedItemsContainsPosition = selectionListViewModelSelectedItemsGetValue.contains(position);
                }
        }
        if ((dirtyFlags & 0x1899L) != 0) {


            if ((dirtyFlags & 0x1800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.iconContentDescription
                        viewModelIconContentDescription = viewModel.getIconContentDescription();
                        // read viewModel.statusIconResource
                        viewModelStatusIconResource = viewModel.getStatusIconResource();
                    }
            }
            if ((dirtyFlags & 0x1889L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isConferenceCallLog
                        viewModelIsConferenceCallLog = viewModel.isConferenceCallLog();
                    }
                if((dirtyFlags & 0x1800L) != 0) {
                    if(viewModelIsConferenceCallLog) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
                if((dirtyFlags & 0x81889L) != 0) {
                    if(viewModelIsConferenceCallLog) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }

                if ((dirtyFlags & 0x1800L) != 0) {

                        // read viewModel.isConferenceCallLog ? View.GONE : View.VISIBLE
                        viewModelIsConferenceCallLogViewGONEViewVISIBLE = ((viewModelIsConferenceCallLog) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
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
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
                    viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = ((viewModelPresenceStatusConsolidatedPresenceOffline) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40000L) != 0) {

                // read (" (") + (groupCount)
                javaLangStringGroupCount = (" (") + (groupCount);


                // read ((" (") + (groupCount)) + (")")
                javaLangStringGroupCountJavaLangString = (javaLangStringGroupCount) + (")");
        }
        if ((dirtyFlags & 0x1800000L) != 0) {


            if ((dirtyFlags & 0x800000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contact
                        viewModelContact = viewModel.getContact();
                    }
                    updateLiveDataRegistration(0, viewModelContact);


                    if (viewModelContact != null) {
                        // read viewModel.contact.getValue()
                        viewModelContactGetValue = viewModelContact.getValue();
                    }


                    if (viewModelContactGetValue != null) {
                        // read viewModel.contact.getValue().name
                        viewModelContactName = viewModelContactGetValue.getName();
                    }
            }
            if ((dirtyFlags & 0x1000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.conferenceSubject
                        viewModelConferenceSubject = viewModel.getConferenceSubject();
                    }
            }
        }

        if ((dirtyFlags & 0x1889L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(groupCount) > 1 ? ((" (") + (groupCount)) + (")") : ""
                groupCountInt1JavaLangStringGroupCountJavaLangStringJavaLangString = ((groupCountInt1) ? (javaLangStringGroupCountJavaLangString) : (""));
                // read viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name
                viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactName = ((viewModelIsConferenceCallLog) ? (viewModelConferenceSubject) : (viewModelContactName));


                // read viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name == null
                viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNull = (viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactName) == (null);
            if((dirtyFlags & 0x1889L) != 0) {
                if(viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNull) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000L) != 0) {

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

        if ((dirtyFlags & 0x1889L) != 0) {

                // read viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name
                viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactName = ((viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNull) ? (viewModelDisplayNameGetValue) : (viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactName));


                // read (viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name) + (androidx.databinding.ViewDataBinding.safeUnbox(groupCount) > 1 ? ((" (") + (groupCount)) + (")") : "")
                viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameGroupCountInt1JavaLangStringGroupCountJavaLangStringJavaLangString = (viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactName) + (groupCountInt1JavaLangStringGroupCountJavaLangStringJavaLangString);
        }
        // batch finished
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.avatar, viewModel);
            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.icon, viewModelIconContentDescription);
            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.icon, viewModelStatusIconResource);
            this.icon.setVisibility(viewModelIsConferenceCallLogViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1100L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x1200L) != 0) {
            // api target 1

            this.mboundView0.setOnLongClickListener(longClickListener);
        }
        if ((dirtyFlags & 0x1044L) != 0) {
            // api target 1

            this.mboundView1.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabled);
            this.mboundView2.setVisibility(selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1020L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(detailsClickListener);
        }
        if ((dirtyFlags & 0x1442L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView2, selectionListViewModelSelectedItemsContainsPosition);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback105);
        }
        if ((dirtyFlags & 0x1810L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView4, viewModelPresenceStatusGetValue);
            this.mboundView4.setVisibility(viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1889L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sipUri, viewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelIsConferenceCallLogViewModelConferenceSubjectViewModelContactNameGroupCountInt1JavaLangStringGroupCountJavaLangStringJavaLangString);
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
        flag 5 (0x6L): detailsClickListener
        flag 6 (0x7L): selectionListViewModel
        flag 7 (0x8L): groupCount
        flag 8 (0x9L): clickListener
        flag 9 (0xaL): longClickListener
        flag 10 (0xbL): position
        flag 11 (0xcL): viewModel
        flag 12 (0xdL): null
        flag 13 (0xeL): viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 14 (0xfL): viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(groupCount) > 1 ? ((" (") + (groupCount)) + (")") : ""
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(groupCount) > 1 ? ((" (") + (groupCount)) + (")") : ""
        flag 19 (0x14L): viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name
        flag 20 (0x15L): viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name
        flag 21 (0x16L): viewModel.isConferenceCallLog ? View.GONE : View.VISIBLE
        flag 22 (0x17L): viewModel.isConferenceCallLog ? View.GONE : View.VISIBLE
        flag 23 (0x18L): viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name
        flag 24 (0x19L): viewModel.isConferenceCallLog ? viewModel.conferenceSubject : viewModel.contact.getValue().name
    flag mapping end*/
    //end
}