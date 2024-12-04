package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SideMenuFragmentBindingImpl extends SideMenuFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.view.View mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @NonNull
    private final android.view.View mboundView13;
    @NonNull
    private final android.widget.LinearLayout mboundView14;
    @NonNull
    private final android.view.View mboundView15;
    @NonNull
    private final android.widget.LinearLayout mboundView16;
    @NonNull
    private final android.view.View mboundView17;
    @NonNull
    private final android.widget.LinearLayout mboundView18;
    @NonNull
    private final android.view.View mboundView19;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback116;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SideMenuFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private SideMenuFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[20]
            );
        this.avatar.setTag(null);
        this.avatarBorder.setTag(null);
        this.mainAccount.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.view.View) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.view.View) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.LinearLayout) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.view.View) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.LinearLayout) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.view.View) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.LinearLayout) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (android.view.View) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.sideMenuQuit.setTag(null);
        setRootTag(root);
        // listeners
        mCallback116 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000L;
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
        if (BR.assistantClickListener == variableId) {
            setAssistantClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.settingsClickListener == variableId) {
            setSettingsClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.conferencesClickListener == variableId) {
            setConferencesClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.quitClickListener == variableId) {
            setQuitClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.aboutClickListener == variableId) {
            setAboutClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.selfPictureClickListener == variableId) {
            setSelfPictureClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.sidemenu.viewmodels.SideMenuViewModel) variable);
        }
        else if (BR.recordingsClickListener == variableId) {
            setRecordingsClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAssistantClickListener(@Nullable android.view.View.OnClickListener AssistantClickListener) {
        this.mAssistantClickListener = AssistantClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.assistantClickListener);
        super.requestRebind();
    }
    public void setSettingsClickListener(@Nullable android.view.View.OnClickListener SettingsClickListener) {
        this.mSettingsClickListener = SettingsClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.settingsClickListener);
        super.requestRebind();
    }
    public void setConferencesClickListener(@Nullable android.view.View.OnClickListener ConferencesClickListener) {
        this.mConferencesClickListener = ConferencesClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.conferencesClickListener);
        super.requestRebind();
    }
    public void setQuitClickListener(@Nullable android.view.View.OnClickListener QuitClickListener) {
        this.mQuitClickListener = QuitClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.quitClickListener);
        super.requestRebind();
    }
    public void setAboutClickListener(@Nullable android.view.View.OnClickListener AboutClickListener) {
        this.mAboutClickListener = AboutClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.aboutClickListener);
        super.requestRebind();
    }
    public void setSelfPictureClickListener(@Nullable android.view.View.OnClickListener SelfPictureClickListener) {
        this.mSelfPictureClickListener = SelfPictureClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.selfPictureClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.sidemenu.viewmodels.SideMenuViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setRecordingsClickListener(@Nullable android.view.View.OnClickListener RecordingsClickListener) {
        this.mRecordingsClickListener = RecordingsClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.recordingsClickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDefaultAccountViewModelUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelAccounts((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>>) object, fieldId);
            case 2 :
                return onChangeViewModelDefaultAccountViewModelIdentity((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelDefaultAccountViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 5 :
                return onChangeViewModelDefaultAccountAvatar((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelDefaultAccountViewModelIconResource((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 7 :
                return onChangeViewModelDefaultAccountViewModel((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>) object, fieldId);
            case 8 :
                return onChangeViewModelShowScheduledConferences((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeViewModelDefaultAccountFound((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeViewModelDefaultAccountViewModelIconContentDescription((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDefaultAccountViewModelUserName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDefaultAccountViewModelUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAccounts(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>> ViewModelAccounts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDefaultAccountViewModelIdentity(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDefaultAccountViewModelIdentity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDefaultAccountViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDefaultAccountViewModelDisplayName, int fieldId) {
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
    private boolean onChangeViewModelDefaultAccountAvatar(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDefaultAccountAvatar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDefaultAccountViewModelIconResource(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelDefaultAccountViewModelIconResource, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDefaultAccountViewModel(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel> ViewModelDefaultAccountViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowScheduledConferences(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowScheduledConferences, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDefaultAccountFound(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDefaultAccountFound, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDefaultAccountViewModelIconContentDescription(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelDefaultAccountViewModelIconContentDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDefaultAccountViewModelUserName = null;
        java.lang.Integer viewModelDefaultAccountViewModelIconResourceGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>> viewModelAccounts = null;
        java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel> viewModelAccountsGetValue = null;
        int viewModelDefaultAccountFoundViewINVISIBLEViewGONE = 0;
        android.view.View.OnClickListener assistantClickListener = mAssistantClickListener;
        int viewModelDefaultAccountFoundBooleanTrueViewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDefaultAccountViewModelIdentity = null;
        boolean viewModelDefaultAccountViewModelDisplayNameIsEmpty = false;
        int viewModelShowAssistantViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener settingsClickListener = mSettingsClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDefaultAccountViewModelDisplayName = null;
        java.lang.Boolean viewModelDefaultAccountFoundGetValue = null;
        java.lang.String viewModelDefaultAccountViewModelDisplayUsernameInsteadOfIdentityViewModelDefaultAccountViewModelUserNameViewModelDefaultAccountViewModelIdentity = null;
        boolean viewModelShowAccounts = false;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountViewModelIconResourceGetValue = 0;
        boolean viewModelPresenceStatusConsolidatedPresenceOffline = false;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> viewModelPresenceStatus = null;
        int viewModelShowRecordingsViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener conferencesClickListener = mConferencesClickListener;
        android.view.View.OnClickListener quitClickListener = mQuitClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDefaultAccountAvatar = null;
        boolean viewModelDefaultAccountFound = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountFoundGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelDefaultAccountViewModelIconResource = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountViewModelIconContentDescriptionGetValue = 0;
        java.lang.Boolean viewModelShowScheduledConferencesGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel> viewModelDefaultAccountViewModel = null;
        java.lang.String viewModelDefaultAccountViewModelDisplayNameIsEmptyViewModelDefaultAccountViewModelUserNameViewModelDefaultAccountViewModelDisplayName = null;
        int viewModelShowAccountsViewVISIBLEViewGONE = 0;
        boolean viewModelDefaultAccountViewModelDisplayUsernameInsteadOfIdentity = false;
        org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel viewModelDefaultAccountViewModelGetValue = null;
        int viewModelShowQuitViewVISIBLEViewGONE = 0;
        boolean viewModelShowSettings = false;
        android.view.View.OnClickListener aboutClickListener = mAboutClickListener;
        int viewModelShowSettingsViewVISIBLEViewGONE = 0;
        java.lang.String viewModelDefaultAccountViewModelUserNameGetValue = null;
        boolean viewModelDefaultAccountFoundBooleanTrueViewModelPresenceStatusConsolidatedPresenceOffline = false;
        java.lang.String viewModelDefaultAccountAvatarGetValue = null;
        java.lang.String viewModelDefaultAccountViewModelIdentityGetValue = null;
        int viewModelDefaultAccountFoundViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowScheduledConferences = null;
        boolean viewModelShowQuit = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDefaultAccountFound1 = null;
        int viewModelShowScheduledConferencesViewVISIBLEViewGONE = 0;
        org.linphone.core.ConsolidatedPresence viewModelPresenceStatusGetValue = null;
        java.lang.String viewModelDefaultAccountViewModelDisplayNameGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowScheduledConferencesGetValue = false;
        boolean viewModelShowAbout = false;
        boolean viewModelShowAssistant = false;
        int viewModelShowAboutViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelDefaultAccountViewModelIconContentDescriptionGetValue = null;
        android.view.View.OnClickListener selfPictureClickListener = mSelfPictureClickListener;
        int viewModelDefaultAccountFoundViewGONEViewVISIBLE = 0;
        boolean viewModelShowRecordings = false;
        org.linphone.activities.main.sidemenu.viewmodels.SideMenuViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelDefaultAccountViewModelIconContentDescription = null;
        android.view.View.OnClickListener recordingsClickListener = mRecordingsClickListener;

        if ((dirtyFlags & 0x80800L) != 0) {
        }
        if ((dirtyFlags & 0x81000L) != 0) {
        }
        if ((dirtyFlags & 0x82000L) != 0) {
        }
        if ((dirtyFlags & 0x84000L) != 0) {
        }
        if ((dirtyFlags & 0x88000L) != 0) {
        }
        if ((dirtyFlags & 0x90000L) != 0) {
        }
        if ((dirtyFlags & 0xa07ffL) != 0) {


            if ((dirtyFlags & 0xa0002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.accounts
                        viewModelAccounts = viewModel.getAccounts();
                    }
                    updateLiveDataRegistration(1, viewModelAccounts);


                    if (viewModelAccounts != null) {
                        // read viewModel.accounts.getValue()
                        viewModelAccountsGetValue = viewModelAccounts.getValue();
                    }
            }
            if ((dirtyFlags & 0xa0000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showAccounts
                        viewModelShowAccounts = viewModel.getShowAccounts();
                        // read viewModel.showSettings
                        viewModelShowSettings = viewModel.getShowSettings();
                        // read viewModel.showQuit
                        viewModelShowQuit = viewModel.getShowQuit();
                        // read viewModel.showAbout
                        viewModelShowAbout = viewModel.getShowAbout();
                        // read viewModel.showAssistant
                        viewModelShowAssistant = viewModel.getShowAssistant();
                        // read viewModel.showRecordings
                        viewModelShowRecordings = viewModel.getShowRecordings();
                    }
                if((dirtyFlags & 0xa0000L) != 0) {
                    if(viewModelShowAccounts) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }
                if((dirtyFlags & 0xa0000L) != 0) {
                    if(viewModelShowSettings) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }
                if((dirtyFlags & 0xa0000L) != 0) {
                    if(viewModelShowQuit) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }
                if((dirtyFlags & 0xa0000L) != 0) {
                    if(viewModelShowAbout) {
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000000L;
                    }
                }
                if((dirtyFlags & 0xa0000L) != 0) {
                    if(viewModelShowAssistant) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }
                if((dirtyFlags & 0xa0000L) != 0) {
                    if(viewModelShowRecordings) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read viewModel.showAccounts ? View.VISIBLE : View.GONE
                    viewModelShowAccountsViewVISIBLEViewGONE = ((viewModelShowAccounts) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showSettings ? View.VISIBLE : View.GONE
                    viewModelShowSettingsViewVISIBLEViewGONE = ((viewModelShowSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showQuit ? View.VISIBLE : View.GONE
                    viewModelShowQuitViewVISIBLEViewGONE = ((viewModelShowQuit) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showAbout ? View.VISIBLE : View.GONE
                    viewModelShowAboutViewVISIBLEViewGONE = ((viewModelShowAbout) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showAssistant ? View.VISIBLE : View.GONE
                    viewModelShowAssistantViewVISIBLEViewGONE = ((viewModelShowAssistant) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showRecordings ? View.VISIBLE : View.GONE
                    viewModelShowRecordingsViewVISIBLEViewGONE = ((viewModelShowRecordings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xa0010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.presenceStatus
                        viewModelPresenceStatus = viewModel.getPresenceStatus();
                    }
                    updateLiveDataRegistration(4, viewModelPresenceStatus);


                    if (viewModelPresenceStatus != null) {
                        // read viewModel.presenceStatus.getValue()
                        viewModelPresenceStatusGetValue = viewModelPresenceStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0xa0020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.defaultAccountAvatar
                        viewModelDefaultAccountAvatar = viewModel.getDefaultAccountAvatar();
                    }
                    updateLiveDataRegistration(5, viewModelDefaultAccountAvatar);


                    if (viewModelDefaultAccountAvatar != null) {
                        // read viewModel.defaultAccountAvatar.getValue()
                        viewModelDefaultAccountAvatarGetValue = viewModelDefaultAccountAvatar.getValue();
                    }
            }
            if ((dirtyFlags & 0xa04cdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.defaultAccountViewModel
                        viewModelDefaultAccountViewModel = viewModel.getDefaultAccountViewModel();
                    }
                    updateLiveDataRegistration(7, viewModelDefaultAccountViewModel);


                    if (viewModelDefaultAccountViewModel != null) {
                        // read viewModel.defaultAccountViewModel.getValue()
                        viewModelDefaultAccountViewModelGetValue = viewModelDefaultAccountViewModel.getValue();
                    }

                if ((dirtyFlags & 0xa0089L) != 0) {

                        if (viewModelDefaultAccountViewModelGetValue != null) {
                            // read viewModel.defaultAccountViewModel.getValue().displayName
                            viewModelDefaultAccountViewModelDisplayName = viewModelDefaultAccountViewModelGetValue.getDisplayName();
                        }
                        updateLiveDataRegistration(3, viewModelDefaultAccountViewModelDisplayName);


                        if (viewModelDefaultAccountViewModelDisplayName != null) {
                            // read viewModel.defaultAccountViewModel.getValue().displayName.getValue()
                            viewModelDefaultAccountViewModelDisplayNameGetValue = viewModelDefaultAccountViewModelDisplayName.getValue();
                        }


                        if (viewModelDefaultAccountViewModelDisplayNameGetValue != null) {
                            // read viewModel.defaultAccountViewModel.getValue().displayName.getValue().isEmpty()
                            viewModelDefaultAccountViewModelDisplayNameIsEmpty = viewModelDefaultAccountViewModelDisplayNameGetValue.isEmpty();
                        }
                    if((dirtyFlags & 0xa0089L) != 0) {
                        if(viewModelDefaultAccountViewModelDisplayNameIsEmpty) {
                                dirtyFlags |= 0x80000000L;
                        }
                        else {
                                dirtyFlags |= 0x40000000L;
                        }
                    }
                }
                if ((dirtyFlags & 0xa00c0L) != 0) {

                        if (viewModelDefaultAccountViewModelGetValue != null) {
                            // read viewModel.defaultAccountViewModel.getValue().iconResource
                            viewModelDefaultAccountViewModelIconResource = viewModelDefaultAccountViewModelGetValue.getIconResource();
                        }
                        updateLiveDataRegistration(6, viewModelDefaultAccountViewModelIconResource);


                        if (viewModelDefaultAccountViewModelIconResource != null) {
                            // read viewModel.defaultAccountViewModel.getValue().iconResource.getValue()
                            viewModelDefaultAccountViewModelIconResourceGetValue = viewModelDefaultAccountViewModelIconResource.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountViewModel.getValue().iconResource.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountViewModelIconResourceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDefaultAccountViewModelIconResourceGetValue);
                }
                if ((dirtyFlags & 0xa0085L) != 0) {

                        if (viewModelDefaultAccountViewModelGetValue != null) {
                            // read viewModel.defaultAccountViewModel.getValue().displayUsernameInsteadOfIdentity
                            viewModelDefaultAccountViewModelDisplayUsernameInsteadOfIdentity = viewModelDefaultAccountViewModelGetValue.getDisplayUsernameInsteadOfIdentity();
                        }
                    if((dirtyFlags & 0xa0085L) != 0) {
                        if(viewModelDefaultAccountViewModelDisplayUsernameInsteadOfIdentity) {
                                dirtyFlags |= 0x8000000L;
                        }
                        else {
                                dirtyFlags |= 0x4000000L;
                        }
                    }
                }
                if ((dirtyFlags & 0xa0480L) != 0) {

                        if (viewModelDefaultAccountViewModelGetValue != null) {
                            // read viewModel.defaultAccountViewModel.getValue().iconContentDescription
                            viewModelDefaultAccountViewModelIconContentDescription = viewModelDefaultAccountViewModelGetValue.getIconContentDescription();
                        }
                        updateLiveDataRegistration(10, viewModelDefaultAccountViewModelIconContentDescription);


                        if (viewModelDefaultAccountViewModelIconContentDescription != null) {
                            // read viewModel.defaultAccountViewModel.getValue().iconContentDescription.getValue()
                            viewModelDefaultAccountViewModelIconContentDescriptionGetValue = viewModelDefaultAccountViewModelIconContentDescription.getValue();
                        }


                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountViewModel.getValue().iconContentDescription.getValue())
                        androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountViewModelIconContentDescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDefaultAccountViewModelIconContentDescriptionGetValue);
                }
            }
            if ((dirtyFlags & 0xa0100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showScheduledConferences
                        viewModelShowScheduledConferences = viewModel.getShowScheduledConferences();
                    }
                    updateLiveDataRegistration(8, viewModelShowScheduledConferences);


                    if (viewModelShowScheduledConferences != null) {
                        // read viewModel.showScheduledConferences.getValue()
                        viewModelShowScheduledConferencesGetValue = viewModelShowScheduledConferences.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showScheduledConferences.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowScheduledConferencesGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowScheduledConferencesGetValue);
                if((dirtyFlags & 0xa0100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowScheduledConferencesGetValue) {
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showScheduledConferences.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowScheduledConferencesViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowScheduledConferencesGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xa0210L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.defaultAccountFound
                        ViewModelDefaultAccountFound1 = viewModel.getDefaultAccountFound();
                    }
                    updateLiveDataRegistration(9, ViewModelDefaultAccountFound1);


                    if (ViewModelDefaultAccountFound1 != null) {
                        // read viewModel.defaultAccountFound.getValue()
                        viewModelDefaultAccountFoundGetValue = ViewModelDefaultAccountFound1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountFoundGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDefaultAccountFoundGetValue);
                if((dirtyFlags & 0xa0200L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountFoundGetValue) {
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x20000000000L;
                            dirtyFlags |= 0x800000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x10000000000L;
                            dirtyFlags |= 0x400000000000L;
                    }
                }

                if ((dirtyFlags & 0xa0200L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? View.INVISIBLE : View.GONE
                        viewModelDefaultAccountFoundViewINVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountFoundGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? View.VISIBLE : View.GONE
                        viewModelDefaultAccountFoundViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountFoundGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? View.GONE : View.VISIBLE
                        viewModelDefaultAccountFoundViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountFoundGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue())
                    viewModelDefaultAccountFound = !androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountFoundGetValue;
                if((dirtyFlags & 0xa0210L) != 0) {
                    if(viewModelDefaultAccountFound) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0xc0000L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x88000000L) != 0) {

                if (viewModelDefaultAccountViewModelGetValue != null) {
                    // read viewModel.defaultAccountViewModel.getValue().userName
                    viewModelDefaultAccountViewModelUserName = viewModelDefaultAccountViewModelGetValue.getUserName();
                }
                updateLiveDataRegistration(0, viewModelDefaultAccountViewModelUserName);


                if (viewModelDefaultAccountViewModelUserName != null) {
                    // read viewModel.defaultAccountViewModel.getValue().userName.getValue()
                    viewModelDefaultAccountViewModelUserNameGetValue = viewModelDefaultAccountViewModelUserName.getValue();
                }
        }
        if ((dirtyFlags & 0x4000000L) != 0) {

                if (viewModelDefaultAccountViewModelGetValue != null) {
                    // read viewModel.defaultAccountViewModel.getValue().identity
                    viewModelDefaultAccountViewModelIdentity = viewModelDefaultAccountViewModelGetValue.getIdentity();
                }
                updateLiveDataRegistration(2, viewModelDefaultAccountViewModelIdentity);


                if (viewModelDefaultAccountViewModelIdentity != null) {
                    // read viewModel.defaultAccountViewModel.getValue().identity.getValue()
                    viewModelDefaultAccountViewModelIdentityGetValue = viewModelDefaultAccountViewModelIdentity.getValue();
                }
        }
        if ((dirtyFlags & 0x4000000000L) != 0) {

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
        }

        if ((dirtyFlags & 0xa0085L) != 0) {

                // read viewModel.defaultAccountViewModel.getValue().displayUsernameInsteadOfIdentity ? viewModel.defaultAccountViewModel.getValue().userName.getValue() : viewModel.defaultAccountViewModel.getValue().identity.getValue()
                viewModelDefaultAccountViewModelDisplayUsernameInsteadOfIdentityViewModelDefaultAccountViewModelUserNameViewModelDefaultAccountViewModelIdentity = ((viewModelDefaultAccountViewModelDisplayUsernameInsteadOfIdentity) ? (viewModelDefaultAccountViewModelUserNameGetValue) : (viewModelDefaultAccountViewModelIdentityGetValue));
        }
        if ((dirtyFlags & 0xa0089L) != 0) {

                // read viewModel.defaultAccountViewModel.getValue().displayName.getValue().isEmpty() ? viewModel.defaultAccountViewModel.getValue().userName.getValue() : viewModel.defaultAccountViewModel.getValue().displayName.getValue()
                viewModelDefaultAccountViewModelDisplayNameIsEmptyViewModelDefaultAccountViewModelUserNameViewModelDefaultAccountViewModelDisplayName = ((viewModelDefaultAccountViewModelDisplayNameIsEmpty) ? (viewModelDefaultAccountViewModelUserNameGetValue) : (viewModelDefaultAccountViewModelDisplayNameGetValue));
        }
        if ((dirtyFlags & 0xa0210L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? true : viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline
                viewModelDefaultAccountFoundBooleanTrueViewModelPresenceStatusConsolidatedPresenceOffline = ((viewModelDefaultAccountFound) ? (true) : (viewModelPresenceStatusConsolidatedPresenceOffline));
            if((dirtyFlags & 0xa0210L) != 0) {
                if(viewModelDefaultAccountFoundBooleanTrueViewModelPresenceStatusConsolidatedPresenceOffline) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? true : viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
                viewModelDefaultAccountFoundBooleanTrueViewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = ((viewModelDefaultAccountFoundBooleanTrueViewModelPresenceStatusConsolidatedPresenceOffline) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0xa0020L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadRoundImageWithCoil(this.avatar, viewModelDefaultAccountAvatarGetValue);
        }
        if ((dirtyFlags & 0x90000L) != 0) {
            // api target 1

            this.avatar.setOnClickListener(selfPictureClickListener);
        }
        if ((dirtyFlags & 0xa0200L) != 0) {
            // api target 1

            this.avatar.setVisibility(viewModelDefaultAccountFoundViewVISIBLEViewGONE);
            this.avatarBorder.setVisibility(viewModelDefaultAccountFoundViewVISIBLEViewGONE);
            this.mainAccount.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountFoundGetValue);
            this.mboundView5.setVisibility(viewModelDefaultAccountFoundViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(viewModelDefaultAccountFoundViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(viewModelDefaultAccountFoundViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x80000L) != 0) {
            // api target 1

            this.mainAccount.setOnClickListener(mCallback116);
        }
        if ((dirtyFlags & 0xa0000L) != 0) {
            // api target 1

            this.mainAccount.setVisibility(viewModelShowAccountsViewVISIBLEViewGONE);
            this.mboundView10.setVisibility(viewModelShowAssistantViewVISIBLEViewGONE);
            this.mboundView11.setVisibility(viewModelShowAssistantViewVISIBLEViewGONE);
            this.mboundView12.setVisibility(viewModelShowSettingsViewVISIBLEViewGONE);
            this.mboundView13.setVisibility(viewModelShowSettingsViewVISIBLEViewGONE);
            this.mboundView14.setVisibility(viewModelShowRecordingsViewVISIBLEViewGONE);
            this.mboundView15.setVisibility(viewModelShowRecordingsViewVISIBLEViewGONE);
            this.mboundView18.setVisibility(viewModelShowAboutViewVISIBLEViewGONE);
            this.mboundView19.setVisibility(viewModelShowAboutViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(viewModelShowAccountsViewVISIBLEViewGONE);
            this.sideMenuQuit.setVisibility(viewModelShowQuitViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x80800L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(assistantClickListener);
        }
        if ((dirtyFlags & 0x81000L) != 0) {
            // api target 1

            this.mboundView12.setOnClickListener(settingsClickListener);
        }
        if ((dirtyFlags & 0xc0000L) != 0) {
            // api target 1

            this.mboundView14.setOnClickListener(recordingsClickListener);
        }
        if ((dirtyFlags & 0x82000L) != 0) {
            // api target 1

            this.mboundView16.setOnClickListener(conferencesClickListener);
        }
        if ((dirtyFlags & 0xa0100L) != 0) {
            // api target 1

            this.mboundView16.setVisibility(viewModelShowScheduledConferencesViewVISIBLEViewGONE);
            this.mboundView17.setVisibility(viewModelShowScheduledConferencesViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x88000L) != 0) {
            // api target 1

            this.mboundView18.setOnClickListener(aboutClickListener);
        }
        if ((dirtyFlags & 0xa0010L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView4, viewModelPresenceStatusGetValue);
        }
        if ((dirtyFlags & 0xa0210L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelDefaultAccountFoundBooleanTrueViewModelPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xa0089L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelDefaultAccountViewModelDisplayNameIsEmptyViewModelDefaultAccountViewModelUserNameViewModelDefaultAccountViewModelDisplayName);
        }
        if ((dirtyFlags & 0xa0085L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelDefaultAccountViewModelDisplayUsernameInsteadOfIdentityViewModelDefaultAccountViewModelUserNameViewModelDefaultAccountViewModelIdentity);
        }
        if ((dirtyFlags & 0xa00c0L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView8, androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountViewModelIconResourceGetValue);
        }
        if ((dirtyFlags & 0xa0480L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView8, androidxDatabindingViewDataBindingSafeUnboxViewModelDefaultAccountViewModelIconContentDescriptionGetValue);
        }
        if ((dirtyFlags & 0xa0002L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView9, viewModelAccountsGetValue, R.layout.side_menu_account_cell);
        }
        if ((dirtyFlags & 0x84000L) != 0) {
            // api target 1

            this.sideMenuQuit.setOnClickListener(quitClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel.defaultAccountViewModel.getValue().identity != null
        boolean viewModelDefaultAccountViewModelIdentityJavaLangObjectNull = false;
        // viewModel.defaultAccountViewModel
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel> viewModelDefaultAccountViewModel = null;
        // viewModel.defaultAccountViewModel.getValue() != null
        boolean viewModelDefaultAccountViewModelGetValueJavaLangObjectNull = false;
        // viewModel.defaultAccountViewModel.getValue()
        org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel viewModelDefaultAccountViewModelGetValue = null;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;
        // viewModel.defaultAccountViewModel.getValue().accountsSettingsListener != null
        boolean viewModelDefaultAccountViewModelAccountsSettingsListenerJavaLangObjectNull = false;
        // viewModel.defaultAccountViewModel.getValue().accountsSettingsListener
        org.linphone.activities.main.settings.SettingListenerStub viewModelDefaultAccountViewModelAccountsSettingsListener = null;
        // viewModel.defaultAccountViewModel != null
        boolean viewModelDefaultAccountViewModelJavaLangObjectNull = false;
        // viewModel.defaultAccountViewModel.getValue().identity
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDefaultAccountViewModelIdentity = null;
        // viewModel
        org.linphone.activities.main.sidemenu.viewmodels.SideMenuViewModel viewModel = mViewModel;
        // viewModel.defaultAccountViewModel.getValue().identity.getValue()
        java.lang.String viewModelDefaultAccountViewModelIdentityGetValue = null;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModelDefaultAccountViewModel = viewModel.getDefaultAccountViewModel();

            viewModelDefaultAccountViewModelJavaLangObjectNull = (viewModelDefaultAccountViewModel) != (null);
            if (viewModelDefaultAccountViewModelJavaLangObjectNull) {


                viewModelDefaultAccountViewModelGetValue = viewModelDefaultAccountViewModel.getValue();

                viewModelDefaultAccountViewModelGetValueJavaLangObjectNull = (viewModelDefaultAccountViewModelGetValue) != (null);
                if (viewModelDefaultAccountViewModelGetValueJavaLangObjectNull) {


                    viewModelDefaultAccountViewModelAccountsSettingsListener = viewModelDefaultAccountViewModelGetValue.getAccountsSettingsListener();

                    viewModelDefaultAccountViewModelAccountsSettingsListenerJavaLangObjectNull = (viewModelDefaultAccountViewModelAccountsSettingsListener) != (null);
                    if (viewModelDefaultAccountViewModelAccountsSettingsListenerJavaLangObjectNull) {







                        viewModelDefaultAccountViewModelIdentity = viewModelDefaultAccountViewModelGetValue.getIdentity();

                        viewModelDefaultAccountViewModelIdentityJavaLangObjectNull = (viewModelDefaultAccountViewModelIdentity) != (null);
                        if (viewModelDefaultAccountViewModelIdentityJavaLangObjectNull) {


                            viewModelDefaultAccountViewModelIdentityGetValue = viewModelDefaultAccountViewModelIdentity.getValue();

                            viewModelDefaultAccountViewModelAccountsSettingsListener.onAccountClicked(viewModelDefaultAccountViewModelIdentityGetValue);
                        }
                    }
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.defaultAccountViewModel.getValue().userName
        flag 1 (0x2L): viewModel.accounts
        flag 2 (0x3L): viewModel.defaultAccountViewModel.getValue().identity
        flag 3 (0x4L): viewModel.defaultAccountViewModel.getValue().displayName
        flag 4 (0x5L): viewModel.presenceStatus
        flag 5 (0x6L): viewModel.defaultAccountAvatar
        flag 6 (0x7L): viewModel.defaultAccountViewModel.getValue().iconResource
        flag 7 (0x8L): viewModel.defaultAccountViewModel
        flag 8 (0x9L): viewModel.showScheduledConferences
        flag 9 (0xaL): viewModel.defaultAccountFound
        flag 10 (0xbL): viewModel.defaultAccountViewModel.getValue().iconContentDescription
        flag 11 (0xcL): assistantClickListener
        flag 12 (0xdL): settingsClickListener
        flag 13 (0xeL): conferencesClickListener
        flag 14 (0xfL): quitClickListener
        flag 15 (0x10L): aboutClickListener
        flag 16 (0x11L): selfPictureClickListener
        flag 17 (0x12L): viewModel
        flag 18 (0x13L): recordingsClickListener
        flag 19 (0x14L): null
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? View.INVISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? View.INVISIBLE : View.GONE
        flag 22 (0x17L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? true : viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 23 (0x18L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? true : viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 24 (0x19L): viewModel.showAssistant ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.showAssistant ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewModel.defaultAccountViewModel.getValue().displayUsernameInsteadOfIdentity ? viewModel.defaultAccountViewModel.getValue().userName.getValue() : viewModel.defaultAccountViewModel.getValue().identity.getValue()
        flag 27 (0x1cL): viewModel.defaultAccountViewModel.getValue().displayUsernameInsteadOfIdentity ? viewModel.defaultAccountViewModel.getValue().userName.getValue() : viewModel.defaultAccountViewModel.getValue().identity.getValue()
        flag 28 (0x1dL): viewModel.showRecordings ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): viewModel.showRecordings ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): viewModel.defaultAccountViewModel.getValue().displayName.getValue().isEmpty() ? viewModel.defaultAccountViewModel.getValue().userName.getValue() : viewModel.defaultAccountViewModel.getValue().displayName.getValue()
        flag 31 (0x20L): viewModel.defaultAccountViewModel.getValue().displayName.getValue().isEmpty() ? viewModel.defaultAccountViewModel.getValue().userName.getValue() : viewModel.defaultAccountViewModel.getValue().displayName.getValue()
        flag 32 (0x21L): viewModel.showAccounts ? View.VISIBLE : View.GONE
        flag 33 (0x22L): viewModel.showAccounts ? View.VISIBLE : View.GONE
        flag 34 (0x23L): viewModel.showQuit ? View.VISIBLE : View.GONE
        flag 35 (0x24L): viewModel.showQuit ? View.VISIBLE : View.GONE
        flag 36 (0x25L): viewModel.showSettings ? View.VISIBLE : View.GONE
        flag 37 (0x26L): viewModel.showSettings ? View.VISIBLE : View.GONE
        flag 38 (0x27L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? true : viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline
        flag 39 (0x28L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? true : viewModel.presenceStatus.getValue() == ConsolidatedPresence.Offline
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showScheduledConferences.getValue()) ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showScheduledConferences.getValue()) ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): viewModel.showAbout ? View.VISIBLE : View.GONE
        flag 45 (0x2eL): viewModel.showAbout ? View.VISIBLE : View.GONE
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? View.GONE : View.VISIBLE
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.defaultAccountFound.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}