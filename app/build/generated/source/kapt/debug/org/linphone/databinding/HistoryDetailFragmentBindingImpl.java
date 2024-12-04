package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HistoryDetailFragmentBindingImpl extends HistoryDetailFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(14);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {12},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 13);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final android.widget.RelativeLayout mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView11;
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
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback238;
    @Nullable
    private final android.view.View.OnClickListener mCallback239;
    @Nullable
    private final android.view.View.OnClickListener mCallback240;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HistoryDetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private HistoryDetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[13]
            );
        this.avatar.setTag(null);
        this.back.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[12];
        setContainedBinding(this.mboundView01);
        this.mboundView10 = (android.widget.RelativeLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11.setTag(null);
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
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback238 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback239 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback240 = new org.linphone.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
        if (BR.sharedMainViewModel == variableId) {
            setSharedMainViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else if (BR.contactClickListener == variableId) {
            setContactClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.newContactClickListener == variableId) {
            setNewContactClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.history.viewmodels.CallLogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setContactClickListener(@Nullable android.view.View.OnClickListener ContactClickListener) {
        this.mContactClickListener = ContactClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.contactClickListener);
        super.requestRebind();
    }
    public void setNewContactClickListener(@Nullable android.view.View.OnClickListener NewContactClickListener) {
        this.mNewContactClickListener = NewContactClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.newContactClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.history.viewmodels.CallLogViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
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
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 3 :
                return onChangeViewModelRelatedCallLogs((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.history.viewmodels.CallLogViewModel>>) object, fieldId);
            case 4 :
                return onChangeViewModelWaitForChatRoomCreation((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
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
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPresenceStatus(androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> ViewModelPresenceStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRelatedCallLogs(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.history.viewmodels.CallLogViewModel>> ViewModelRelatedCallLogs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWaitForChatRoomCreation(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelWaitForChatRoomCreation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelReadOnlyNativeAddressBook(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelReadOnlyNativeAddressBook, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> viewModelContact = null;
        java.lang.Boolean viewModelReadOnlyNativeAddressBookGetValue = null;
        java.lang.String viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        int viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue = false;
        boolean viewModelChatAllowedViewModelSecureChatAllowedBooleanFalse = false;
        int viewModelChatAllowedViewModelHidePlainChatBooleanFalseViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        android.view.View.OnClickListener contactClickListener = mContactClickListener;
        boolean viewModelPresenceStatusConsolidatedPresenceOffline = false;
        boolean viewModelContactJavaLangObjectNull = false;
        java.lang.String viewModelContactName = null;
        java.util.ArrayList<org.linphone.activities.main.history.viewmodels.CallLogViewModel> viewModelRelatedCallLogsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> viewModelPresenceStatus = null;
        boolean viewModelHidePlainChat = false;
        java.lang.Boolean viewModelWaitForChatRoomCreationGetValue = null;
        java.lang.String viewModelDisplayNameGetValue = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        int viewModelContactJavaLangObjectNullBooleanTrueViewModelReadOnlyNativeAddressBookViewGONEViewVISIBLE = 0;
        boolean ViewModelContactJavaLangObjectNull1 = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.history.viewmodels.CallLogViewModel>> viewModelRelatedCallLogs = null;
        org.linphone.core.Friend viewModelContactGetValue = null;
        boolean ViewModelHidePlainChat1 = false;
        android.view.View.OnClickListener newContactClickListener = mNewContactClickListener;
        boolean viewModelChatAllowedViewModelHidePlainChatBooleanFalse = false;
        boolean viewModelSecureChatAllowed = false;
        int viewModelContactJavaLangObjectNullViewGONEViewVISIBLE = 0;
        org.linphone.core.ConsolidatedPresence viewModelPresenceStatusGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        boolean viewModelChatAllowed = false;
        int viewModelChatAllowedViewModelSecureChatAllowedBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelContactJavaLangObjectNullBooleanTrueViewModelReadOnlyNativeAddressBook = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWaitForChatRoomCreation = null;
        java.lang.String viewModelPeerSipUri = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelReadOnlyNativeAddressBook = null;
        org.linphone.activities.main.history.viewmodels.CallLogViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x8a0L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(5, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x8a0L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x900L) != 0) {
        }
        if ((dirtyFlags & 0xa00L) != 0) {
        }
        if ((dirtyFlags & 0xc5fL) != 0) {


            if ((dirtyFlags & 0xc43L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contact
                        viewModelContact = viewModel.getContact();
                    }
                    updateLiveDataRegistration(0, viewModelContact);


                    if (viewModelContact != null) {
                        // read viewModel.contact.getValue()
                        viewModelContactGetValue = viewModelContact.getValue();
                    }

                if ((dirtyFlags & 0xc41L) != 0) {

                        // read viewModel.contact.getValue() != null
                        viewModelContactJavaLangObjectNull = (viewModelContactGetValue) != (null);
                    if((dirtyFlags & 0xc41L) != 0) {
                        if(viewModelContactJavaLangObjectNull) {
                                dirtyFlags |= 0x80000000L;
                        }
                        else {
                                dirtyFlags |= 0x40000000L;
                        }
                    }
                }
                if ((dirtyFlags & 0xc03L) != 0) {

                        if (viewModelContactGetValue != null) {
                            // read viewModel.contact.getValue().name
                            viewModelContactName = viewModelContactGetValue.getName();
                        }


                        // read viewModel.contact.getValue().name == null
                        viewModelContactNameJavaLangObjectNull = (viewModelContactName) == (null);
                    if((dirtyFlags & 0xc03L) != 0) {
                        if(viewModelContactNameJavaLangObjectNull) {
                                dirtyFlags |= 0x2000L;
                        }
                        else {
                                dirtyFlags |= 0x1000L;
                        }
                    }
                }
                if ((dirtyFlags & 0xc01L) != 0) {

                        // read viewModel.contact.getValue() == null
                        ViewModelContactJavaLangObjectNull1 = (viewModelContactGetValue) == (null);
                    if((dirtyFlags & 0xc01L) != 0) {
                        if(ViewModelContactJavaLangObjectNull1) {
                                dirtyFlags |= 0x8000000L;
                        }
                        else {
                                dirtyFlags |= 0x4000000L;
                        }
                    }


                        // read viewModel.contact.getValue() == null ? View.GONE : View.VISIBLE
                        viewModelContactJavaLangObjectNullViewGONEViewVISIBLE = ((ViewModelContactJavaLangObjectNull1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0xc04L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.presenceStatus
                        viewModelPresenceStatus = viewModel.getPresenceStatus();
                    }
                    updateLiveDataRegistration(2, viewModelPresenceStatus);


                    if (viewModelPresenceStatus != null) {
                        // read viewModel.presenceStatus.getValue()
                        viewModelPresenceStatusGetValue = viewModelPresenceStatus.getValue();
                    }


                    // read viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline
                    viewModelPresenceStatusConsolidatedPresenceOffline = (viewModelPresenceStatusGetValue) == (org.linphone.core.ConsolidatedPresence.Offline);
                if((dirtyFlags & 0xc04L) != 0) {
                    if(viewModelPresenceStatusConsolidatedPresenceOffline) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
                    viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = ((viewModelPresenceStatusConsolidatedPresenceOffline) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc08L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.relatedCallLogs
                        viewModelRelatedCallLogs = viewModel.getRelatedCallLogs();
                    }
                    updateLiveDataRegistration(3, viewModelRelatedCallLogs);


                    if (viewModelRelatedCallLogs != null) {
                        // read viewModel.relatedCallLogs.getValue()
                        viewModelRelatedCallLogsGetValue = viewModelRelatedCallLogs.getValue();
                    }
            }
            if ((dirtyFlags & 0xc00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.chatAllowed
                        viewModelChatAllowed = viewModel.getChatAllowed();
                        // read viewModel.peerSipUri
                        viewModelPeerSipUri = viewModel.getPeerSipUri();
                    }
                if((dirtyFlags & 0xc00L) != 0) {
                    if(viewModelChatAllowed) {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x1000000L;
                    }
                }
            }
            if ((dirtyFlags & 0xc10L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.waitForChatRoomCreation
                        viewModelWaitForChatRoomCreation = viewModel.getWaitForChatRoomCreation();
                    }
                    updateLiveDataRegistration(4, viewModelWaitForChatRoomCreation);


                    if (viewModelWaitForChatRoomCreation != null) {
                        // read viewModel.waitForChatRoomCreation.getValue()
                        viewModelWaitForChatRoomCreationGetValue = viewModelWaitForChatRoomCreation.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.displayName
                    viewModelDisplayName = viewModel.getDisplayName();
                }
                updateLiveDataRegistration(1, viewModelDisplayName);


                if (viewModelDisplayName != null) {
                    // read viewModel.displayName.getValue()
                    viewModelDisplayNameGetValue = viewModelDisplayName.getValue();
                }
        }
        if ((dirtyFlags & 0x2000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.hidePlainChat
                    ViewModelHidePlainChat1 = viewModel.getHidePlainChat();
                }


                // read !viewModel.hidePlainChat
                viewModelHidePlainChat = !ViewModelHidePlainChat1;
        }
        if ((dirtyFlags & 0x20000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.secureChatAllowed
                    viewModelSecureChatAllowed = viewModel.getSecureChatAllowed();
                }
        }
        if ((dirtyFlags & 0x40000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.readOnlyNativeAddressBook
                    viewModelReadOnlyNativeAddressBook = viewModel.getReadOnlyNativeAddressBook();
                }
                updateLiveDataRegistration(6, viewModelReadOnlyNativeAddressBook);


                if (viewModelReadOnlyNativeAddressBook != null) {
                    // read viewModel.readOnlyNativeAddressBook.getValue()
                    viewModelReadOnlyNativeAddressBookGetValue = viewModelReadOnlyNativeAddressBook.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelReadOnlyNativeAddressBookGetValue);
        }

        if ((dirtyFlags & 0xc03L) != 0) {

                // read viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
                viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = ((viewModelContactNameJavaLangObjectNull) ? (viewModelDisplayNameGetValue) : (viewModelContactName));
        }
        if ((dirtyFlags & 0xc00L) != 0) {

                // read viewModel.chatAllowed ? viewModel.secureChatAllowed : false
                viewModelChatAllowedViewModelSecureChatAllowedBooleanFalse = ((viewModelChatAllowed) ? (viewModelSecureChatAllowed) : (false));
                // read viewModel.chatAllowed ? !viewModel.hidePlainChat : false
                viewModelChatAllowedViewModelHidePlainChatBooleanFalse = ((viewModelChatAllowed) ? (viewModelHidePlainChat) : (false));
            if((dirtyFlags & 0xc00L) != 0) {
                if(viewModelChatAllowedViewModelSecureChatAllowedBooleanFalse) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
            if((dirtyFlags & 0xc00L) != 0) {
                if(viewModelChatAllowedViewModelHidePlainChatBooleanFalse) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }


                // read viewModel.chatAllowed ? viewModel.secureChatAllowed : false ? View.VISIBLE : View.GONE
                viewModelChatAllowedViewModelSecureChatAllowedBooleanFalseViewVISIBLEViewGONE = ((viewModelChatAllowedViewModelSecureChatAllowedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.chatAllowed ? !viewModel.hidePlainChat : false ? View.VISIBLE : View.GONE
                viewModelChatAllowedViewModelHidePlainChatBooleanFalseViewVISIBLEViewGONE = ((viewModelChatAllowedViewModelHidePlainChatBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xc41L) != 0) {

                // read viewModel.contact.getValue() != null ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue())
                viewModelContactJavaLangObjectNullBooleanTrueViewModelReadOnlyNativeAddressBook = ((viewModelContactJavaLangObjectNull) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelReadOnlyNativeAddressBookGetValue));
            if((dirtyFlags & 0xc41L) != 0) {
                if(viewModelContactJavaLangObjectNullBooleanTrueViewModelReadOnlyNativeAddressBook) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read viewModel.contact.getValue() != null ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) ? View.GONE : View.VISIBLE
                viewModelContactJavaLangObjectNullBooleanTrueViewModelReadOnlyNativeAddressBookViewGONEViewVISIBLE = ((viewModelContactJavaLangObjectNullBooleanTrueViewModelReadOnlyNativeAddressBook) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0xc00L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadBigContactPictureWithCoil(this.avatar, viewModel);
            this.mboundView10.setVisibility(viewModelChatAllowedViewModelSecureChatAllowedBooleanFalseViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelPeerSipUri);
            this.mboundView9.setVisibility(viewModelChatAllowedViewModelHidePlainChatBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x8a0L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc10L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForChatRoomCreationGetValue);
        }
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(mCallback240);
            this.mboundView8.setOnClickListener(mCallback238);
            this.mboundView9.setOnClickListener(mCallback239);
        }
        if ((dirtyFlags & 0xc08L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView11, viewModelRelatedCallLogsGetValue, R.layout.history_detail_cell);
        }
        if ((dirtyFlags & 0xa00L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(newContactClickListener);
        }
        if ((dirtyFlags & 0xc41L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelContactJavaLangObjectNullBooleanTrueViewModelReadOnlyNativeAddressBookViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x900L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(contactClickListener);
        }
        if ((dirtyFlags & 0xc01L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelContactJavaLangObjectNullViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc04L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView5, viewModelPresenceStatusGetValue);
            this.mboundView5.setVisibility(viewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc03L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName);
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
                org.linphone.activities.main.history.viewmodels.CallLogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.startCall();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.history.viewmodels.CallLogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.startChat(false);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.history.viewmodels.CallLogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.startChat(true);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.contact
        flag 1 (0x2L): viewModel.displayName
        flag 2 (0x3L): viewModel.presenceStatus
        flag 3 (0x4L): viewModel.relatedCallLogs
        flag 4 (0x5L): viewModel.waitForChatRoomCreation
        flag 5 (0x6L): sharedMainViewModel.isSlidingPaneSlideable
        flag 6 (0x7L): viewModel.readOnlyNativeAddressBook
        flag 7 (0x8L): sharedMainViewModel
        flag 8 (0x9L): contactClickListener
        flag 9 (0xaL): newContactClickListener
        flag 10 (0xbL): viewModel
        flag 11 (0xcL): null
        flag 12 (0xdL): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 13 (0xeL): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 14 (0xfL): viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 15 (0x10L): viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 16 (0x11L): viewModel.chatAllowed ? viewModel.secureChatAllowed : false
        flag 17 (0x12L): viewModel.chatAllowed ? viewModel.secureChatAllowed : false
        flag 18 (0x13L): viewModel.chatAllowed ? !viewModel.hidePlainChat : false ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.chatAllowed ? !viewModel.hidePlainChat : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.contact.getValue() != null ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) ? View.GONE : View.VISIBLE
        flag 23 (0x18L): viewModel.contact.getValue() != null ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue()) ? View.GONE : View.VISIBLE
        flag 24 (0x19L): viewModel.chatAllowed ? !viewModel.hidePlainChat : false
        flag 25 (0x1aL): viewModel.chatAllowed ? !viewModel.hidePlainChat : false
        flag 26 (0x1bL): viewModel.contact.getValue() == null ? View.GONE : View.VISIBLE
        flag 27 (0x1cL): viewModel.contact.getValue() == null ? View.GONE : View.VISIBLE
        flag 28 (0x1dL): viewModel.chatAllowed ? viewModel.secureChatAllowed : false ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): viewModel.chatAllowed ? viewModel.secureChatAllowed : false ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): viewModel.contact.getValue() != null ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue())
        flag 31 (0x20L): viewModel.contact.getValue() != null ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readOnlyNativeAddressBook.getValue())
    flag mapping end*/
    //end
}