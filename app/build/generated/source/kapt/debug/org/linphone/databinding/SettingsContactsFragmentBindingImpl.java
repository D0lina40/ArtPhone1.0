package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsContactsFragmentBindingImpl extends SettingsContactsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(14);
        sIncludes.setIncludes(3, 
            new String[] {"settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_switch"},
            new int[] {6, 7, 8, 9, 10, 11},
            new int[] {org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch});
        sIncludes.setIncludes(4, 
            new String[] {"settings_widget_basic"},
            new int[] {12},
            new int[] {org.linphone.R.layout.settings_widget_basic});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 13);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.view.View mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView31;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView32;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView33;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView34;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView35;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView36;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView41;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    // variables
    // values
    private androidx.databinding.InverseBindingListener mOldEventChecked1763403542;
    private androidx.databinding.InverseBindingListener mOldEventChecked1054197276;
    private androidx.databinding.InverseBindingListener mOldEventChecked285963875;
    private androidx.databinding.InverseBindingListener mOldEventChecked182714760;
    private androidx.databinding.InverseBindingListener mOldEventChecked953539169;
    private androidx.databinding.InverseBindingListener mOldEventChecked30033652;
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView31checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.friendListSubscribe.getValue()
            //         is viewModel.friendListSubscribe.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView31.getChecked();
            // localize variables for thread safety
            // viewModel.friendListSubscribe != null
            boolean viewModelFriendListSubscribeJavaLangObjectNull = false;
            // viewModel.friendListSubscribe.getValue()
            java.lang.Boolean viewModelFriendListSubscribeGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ContactsSettingsViewModel viewModel = mViewModel;
            // viewModel.friendListSubscribe
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelFriendListSubscribe = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFriendListSubscribe = viewModel.getFriendListSubscribe();

                viewModelFriendListSubscribeJavaLangObjectNull = (viewModelFriendListSubscribe) != (null);
                if (viewModelFriendListSubscribeJavaLangObjectNull) {




                    viewModelFriendListSubscribe.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView32checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.publishPresence.getValue()
            //         is viewModel.publishPresence.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView32.getChecked();
            // localize variables for thread safety
            // viewModel.publishPresence != null
            boolean viewModelPublishPresenceJavaLangObjectNull = false;
            // viewModel.publishPresence.getValue()
            java.lang.Boolean viewModelPublishPresenceGetValue = null;
            // viewModel.publishPresence
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelPublishPresence = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ContactsSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPublishPresence = viewModel.getPublishPresence();

                viewModelPublishPresenceJavaLangObjectNull = (viewModelPublishPresence) != (null);
                if (viewModelPublishPresenceJavaLangObjectNull) {




                    viewModelPublishPresence.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView33checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.showNewContactAccountDialog.getValue()
            //         is viewModel.showNewContactAccountDialog.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView33.getChecked();
            // localize variables for thread safety
            // viewModel.showNewContactAccountDialog
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowNewContactAccountDialog = null;
            // viewModel.showNewContactAccountDialog.getValue()
            java.lang.Boolean viewModelShowNewContactAccountDialogGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ContactsSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.showNewContactAccountDialog != null
            boolean viewModelShowNewContactAccountDialogJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelShowNewContactAccountDialog = viewModel.getShowNewContactAccountDialog();

                viewModelShowNewContactAccountDialogJavaLangObjectNull = (viewModelShowNewContactAccountDialog) != (null);
                if (viewModelShowNewContactAccountDialogJavaLangObjectNull) {




                    viewModelShowNewContactAccountDialog.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView34checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.nativePresence.getValue()
            //         is viewModel.nativePresence.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView34.getChecked();
            // localize variables for thread safety
            // viewModel.nativePresence != null
            boolean viewModelNativePresenceJavaLangObjectNull = false;
            // viewModel.nativePresence
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelNativePresence = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ContactsSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.nativePresence.getValue()
            java.lang.Boolean viewModelNativePresenceGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelNativePresence = viewModel.getNativePresence();

                viewModelNativePresenceJavaLangObjectNull = (viewModelNativePresence) != (null);
                if (viewModelNativePresenceJavaLangObjectNull) {




                    viewModelNativePresence.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView35checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.showOrganization.getValue()
            //         is viewModel.showOrganization.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView35.getChecked();
            // localize variables for thread safety
            // viewModel.showOrganization.getValue()
            java.lang.Boolean viewModelShowOrganizationGetValue = null;
            // viewModel.showOrganization
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowOrganization = null;
            // viewModel.showOrganization != null
            boolean viewModelShowOrganizationJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ContactsSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelShowOrganization = viewModel.getShowOrganization();

                viewModelShowOrganizationJavaLangObjectNull = (viewModelShowOrganization) != (null);
                if (viewModelShowOrganizationJavaLangObjectNull) {




                    viewModelShowOrganization.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView36checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.launcherShortcuts.getValue()
            //         is viewModel.launcherShortcuts.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView36.getChecked();
            // localize variables for thread safety
            // viewModel.launcherShortcuts != null
            boolean viewModelLauncherShortcutsJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ContactsSettingsViewModel viewModel = mViewModel;
            // viewModel.launcherShortcuts.getValue()
            java.lang.Boolean viewModelLauncherShortcutsGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.launcherShortcuts
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLauncherShortcuts = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelLauncherShortcuts = viewModel.getLauncherShortcuts();

                viewModelLauncherShortcutsJavaLangObjectNull = (viewModelLauncherShortcuts) != (null);
                if (viewModelLauncherShortcutsJavaLangObjectNull) {




                    viewModelLauncherShortcuts.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public SettingsContactsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private SettingsContactsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[13]
            );
        this.back.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[6];
        setContainedBinding(this.mboundView31);
        this.mboundView32 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[7];
        setContainedBinding(this.mboundView32);
        this.mboundView33 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[8];
        setContainedBinding(this.mboundView33);
        this.mboundView34 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[9];
        setContainedBinding(this.mboundView34);
        this.mboundView35 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[10];
        setContainedBinding(this.mboundView35);
        this.mboundView36 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[11];
        setContainedBinding(this.mboundView36);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView41 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[12];
        setContainedBinding(this.mboundView41);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
        }
        mboundView31.invalidateAll();
        mboundView32.invalidateAll();
        mboundView33.invalidateAll();
        mboundView34.invalidateAll();
        mboundView35.invalidateAll();
        mboundView36.invalidateAll();
        mboundView41.invalidateAll();
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
        if (mboundView32.hasPendingBindings()) {
            return true;
        }
        if (mboundView33.hasPendingBindings()) {
            return true;
        }
        if (mboundView34.hasPendingBindings()) {
            return true;
        }
        if (mboundView35.hasPendingBindings()) {
            return true;
        }
        if (mboundView36.hasPendingBindings()) {
            return true;
        }
        if (mboundView41.hasPendingBindings()) {
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
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.settings.viewmodels.ContactsSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.ContactsSettingsViewModel ViewModel) {
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
        mboundView31.setLifecycleOwner(lifecycleOwner);
        mboundView32.setLifecycleOwner(lifecycleOwner);
        mboundView33.setLifecycleOwner(lifecycleOwner);
        mboundView34.setLifecycleOwner(lifecycleOwner);
        mboundView35.setLifecycleOwner(lifecycleOwner);
        mboundView36.setLifecycleOwner(lifecycleOwner);
        mboundView41.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLauncherShortcuts((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelRlsAddressAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelLdapConfigurations((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel>>) object, fieldId);
            case 3 :
                return onChangeViewModelPublishPresence((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelShowOrganization((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelNativePresence((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelFriendListSubscribe((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelLdapAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelShowNewContactAccountDialog((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeViewModelReadContactsPermissionGranted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLauncherShortcuts(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLauncherShortcuts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRlsAddressAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelRlsAddressAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapConfigurations(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel>> ViewModelLdapConfigurations, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPublishPresence(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelPublishPresence, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowOrganization(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowOrganization, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNativePresence(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelNativePresence, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFriendListSubscribe(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelFriendListSubscribe, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLdapAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowNewContactAccountDialog(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowNewContactAccountDialog, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelReadContactsPermissionGranted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelReadContactsPermissionGranted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
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
        boolean viewModelReadContactsPermissionGrantedViewModelFriendListSubscribeBooleanFalse = false;
        java.lang.Boolean viewModelRlsAddressAvailableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelFriendListSubscribeGetValue = false;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelNativePresenceListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLauncherShortcuts = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelShowNewContactAccountDialogListener = null;
        java.lang.Boolean viewModelReadContactsPermissionGrantedGetValue = null;
        java.lang.Boolean viewModelShowOrganizationGetValue = null;
        java.lang.Boolean viewModelFriendListSubscribeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelRlsAddressAvailable = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelShowOrganizationListener = null;
        java.lang.Boolean viewModelPublishPresenceGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLdapAvailableGetValue = false;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelRlsAddressAvailableGetValue = false;
        java.lang.Boolean viewModelLdapAvailableGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelFriendListSubscribeListener = null;
        java.lang.Boolean viewModelNativePresenceGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelPublishPresenceListener = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel>> viewModelLdapConfigurations = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelPublishPresence = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowOrganization = null;
        boolean viewModelReadContactsPermissionGrantedViewModelRlsAddressAvailableBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelNativePresence = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLauncherShortcutsListener = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelFriendListSubscribe = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLdapAvailable = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowNewContactAccountDialog = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelReadContactsPermissionGranted = null;
        java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel> viewModelLdapConfigurationsGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapNewSettingsListener = null;
        int viewModelLdapAvailableViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelLauncherShortcutsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelReadContactsPermissionGrantedGetValue = false;
        java.lang.Boolean viewModelShowNewContactAccountDialogGetValue = null;
        org.linphone.activities.main.settings.viewmodels.ContactsSettingsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x2c00L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(10, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x2c00L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                        dirtyFlags |= 0x100000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x33ffL) != 0) {


            if ((dirtyFlags & 0x3000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nativePresenceListener
                        viewModelNativePresenceListener = viewModel.getNativePresenceListener();
                        // read viewModel.showNewContactAccountDialogListener
                        viewModelShowNewContactAccountDialogListener = viewModel.getShowNewContactAccountDialogListener();
                        // read viewModel.showOrganizationListener
                        viewModelShowOrganizationListener = viewModel.getShowOrganizationListener();
                        // read viewModel.friendListSubscribeListener
                        viewModelFriendListSubscribeListener = viewModel.getFriendListSubscribeListener();
                        // read viewModel.publishPresenceListener
                        viewModelPublishPresenceListener = viewModel.getPublishPresenceListener();
                        // read viewModel.launcherShortcutsListener
                        viewModelLauncherShortcutsListener = viewModel.getLauncherShortcutsListener();
                        // read viewModel.ldapNewSettingsListener
                        viewModelLdapNewSettingsListener = viewModel.getLdapNewSettingsListener();
                    }
            }
            if ((dirtyFlags & 0x3001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.launcherShortcuts
                        viewModelLauncherShortcuts = viewModel.getLauncherShortcuts();
                    }
                    updateLiveDataRegistration(0, viewModelLauncherShortcuts);


                    if (viewModelLauncherShortcuts != null) {
                        // read viewModel.launcherShortcuts.getValue()
                        viewModelLauncherShortcutsGetValue = viewModelLauncherShortcuts.getValue();
                    }
            }
            if ((dirtyFlags & 0x3004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapConfigurations
                        viewModelLdapConfigurations = viewModel.getLdapConfigurations();
                    }
                    updateLiveDataRegistration(2, viewModelLdapConfigurations);


                    if (viewModelLdapConfigurations != null) {
                        // read viewModel.ldapConfigurations.getValue()
                        viewModelLdapConfigurationsGetValue = viewModelLdapConfigurations.getValue();
                    }
            }
            if ((dirtyFlags & 0x3008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.publishPresence
                        viewModelPublishPresence = viewModel.getPublishPresence();
                    }
                    updateLiveDataRegistration(3, viewModelPublishPresence);


                    if (viewModelPublishPresence != null) {
                        // read viewModel.publishPresence.getValue()
                        viewModelPublishPresenceGetValue = viewModelPublishPresence.getValue();
                    }
            }
            if ((dirtyFlags & 0x3010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showOrganization
                        viewModelShowOrganization = viewModel.getShowOrganization();
                    }
                    updateLiveDataRegistration(4, viewModelShowOrganization);


                    if (viewModelShowOrganization != null) {
                        // read viewModel.showOrganization.getValue()
                        viewModelShowOrganizationGetValue = viewModelShowOrganization.getValue();
                    }
            }
            if ((dirtyFlags & 0x3020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.nativePresence
                        viewModelNativePresence = viewModel.getNativePresence();
                    }
                    updateLiveDataRegistration(5, viewModelNativePresence);


                    if (viewModelNativePresence != null) {
                        // read viewModel.nativePresence.getValue()
                        viewModelNativePresenceGetValue = viewModelNativePresence.getValue();
                    }
            }
            if ((dirtyFlags & 0x3040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.friendListSubscribe
                        viewModelFriendListSubscribe = viewModel.getFriendListSubscribe();
                    }
                    updateLiveDataRegistration(6, viewModelFriendListSubscribe);


                    if (viewModelFriendListSubscribe != null) {
                        // read viewModel.friendListSubscribe.getValue()
                        viewModelFriendListSubscribeGetValue = viewModelFriendListSubscribe.getValue();
                    }
            }
            if ((dirtyFlags & 0x3080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapAvailable
                        viewModelLdapAvailable = viewModel.getLdapAvailable();
                    }
                    updateLiveDataRegistration(7, viewModelLdapAvailable);


                    if (viewModelLdapAvailable != null) {
                        // read viewModel.ldapAvailable.getValue()
                        viewModelLdapAvailableGetValue = viewModelLdapAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.ldapAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLdapAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLdapAvailableGetValue);
                if((dirtyFlags & 0x3080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLdapAvailableGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.ldapAvailable.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLdapAvailableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLdapAvailableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showNewContactAccountDialog
                        viewModelShowNewContactAccountDialog = viewModel.getShowNewContactAccountDialog();
                    }
                    updateLiveDataRegistration(8, viewModelShowNewContactAccountDialog);


                    if (viewModelShowNewContactAccountDialog != null) {
                        // read viewModel.showNewContactAccountDialog.getValue()
                        viewModelShowNewContactAccountDialogGetValue = viewModelShowNewContactAccountDialog.getValue();
                    }
            }
            if ((dirtyFlags & 0x3242L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.readContactsPermissionGranted
                        viewModelReadContactsPermissionGranted = viewModel.getReadContactsPermissionGranted();
                    }
                    updateLiveDataRegistration(9, viewModelReadContactsPermissionGranted);


                    if (viewModelReadContactsPermissionGranted != null) {
                        // read viewModel.readContactsPermissionGranted.getValue()
                        viewModelReadContactsPermissionGrantedGetValue = viewModelReadContactsPermissionGranted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readContactsPermissionGranted.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelReadContactsPermissionGrantedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelReadContactsPermissionGrantedGetValue);
                if((dirtyFlags & 0x3240L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelReadContactsPermissionGrantedGetValue) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0x3202L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelReadContactsPermissionGrantedGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.rlsAddressAvailable
                    viewModelRlsAddressAvailable = viewModel.getRlsAddressAvailable();
                }
                updateLiveDataRegistration(1, viewModelRlsAddressAvailable);


                if (viewModelRlsAddressAvailable != null) {
                    // read viewModel.rlsAddressAvailable.getValue()
                    viewModelRlsAddressAvailableGetValue = viewModelRlsAddressAvailable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.rlsAddressAvailable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelRlsAddressAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRlsAddressAvailableGetValue);
        }
        if ((dirtyFlags & 0x8000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.friendListSubscribe
                    viewModelFriendListSubscribe = viewModel.getFriendListSubscribe();
                }
                updateLiveDataRegistration(6, viewModelFriendListSubscribe);


                if (viewModelFriendListSubscribe != null) {
                    // read viewModel.friendListSubscribe.getValue()
                    viewModelFriendListSubscribeGetValue = viewModelFriendListSubscribe.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.friendListSubscribe.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelFriendListSubscribeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelFriendListSubscribeGetValue);
        }

        if ((dirtyFlags & 0x3240L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readContactsPermissionGranted.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.friendListSubscribe.getValue()) : false
                viewModelReadContactsPermissionGrantedViewModelFriendListSubscribeBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelReadContactsPermissionGrantedGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelFriendListSubscribeGetValue) : (false));
        }
        if ((dirtyFlags & 0x3202L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readContactsPermissionGranted.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.rlsAddressAvailable.getValue()) : false
                viewModelReadContactsPermissionGrantedViewModelRlsAddressAvailableBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelReadContactsPermissionGrantedGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelRlsAddressAvailableGetValue) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x2c00L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.mboundView31.setTitle(getRoot().getResources().getString(R.string.contacts_settings_friendlist_subscribe_title));
            setBindingInverseListener(this.mboundView31, this.mOldEventChecked1763403542, mboundView31checked);
            this.mboundView32.setTitle(getRoot().getResources().getString(R.string.account_setting_publish_presence_title));
            setBindingInverseListener(this.mboundView32, this.mOldEventChecked1054197276, mboundView32checked);
            this.mboundView33.setTitle(getRoot().getResources().getString(R.string.contacts_settings_show_new_contact_account_dialog_title));
            this.mboundView33.setSubtitle(getRoot().getResources().getString(R.string.contacts_settings_show_new_contact_account_dialog_summary));
            setBindingInverseListener(this.mboundView33, this.mOldEventChecked285963875, mboundView33checked);
            this.mboundView34.setTitle(getRoot().getResources().getString(R.string.contacts_settings_native_presence_title));
            this.mboundView34.setSubtitle(getRoot().getResources().getString(R.string.contacts_settings_native_presence_summary));
            setBindingInverseListener(this.mboundView34, this.mOldEventChecked182714760, mboundView34checked);
            this.mboundView35.setTitle(getRoot().getResources().getString(R.string.contacts_settings_show_organization_title));
            setBindingInverseListener(this.mboundView35, this.mOldEventChecked953539169, mboundView35checked);
            this.mboundView36.setTitle(getRoot().getResources().getString(R.string.contacts_settings_launcher_shortcuts_title));
            this.mboundView36.setSubtitle(getRoot().getResources().getString(R.string.contacts_settings_launcher_shortcuts_summary));
            setBindingInverseListener(this.mboundView36, this.mOldEventChecked30033652, mboundView36checked);
            this.mboundView41.setTitle(getRoot().getResources().getString(R.string.contacts_settings_create_new_ldap_config_title));
        }
        if ((dirtyFlags & 0x3000L) != 0) {
            // api target 1

            this.mboundView31.setListener(viewModelFriendListSubscribeListener);
            this.mboundView32.setListener(viewModelPublishPresenceListener);
            this.mboundView33.setListener(viewModelShowNewContactAccountDialogListener);
            this.mboundView34.setListener(viewModelNativePresenceListener);
            this.mboundView35.setListener(viewModelShowOrganizationListener);
            this.mboundView36.setListener(viewModelLauncherShortcutsListener);
            this.mboundView41.setListener(viewModelLdapNewSettingsListener);
        }
        if ((dirtyFlags & 0x3040L) != 0) {
            // api target 1

            this.mboundView31.setChecked(viewModelFriendListSubscribeGetValue);
        }
        if ((dirtyFlags & 0x3202L) != 0) {
            // api target 1

            this.mboundView31.setEnabled(viewModelReadContactsPermissionGrantedViewModelRlsAddressAvailableBooleanFalse);
        }
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            this.mboundView32.setChecked(viewModelPublishPresenceGetValue);
        }
        if ((dirtyFlags & 0x3100L) != 0) {
            // api target 1

            this.mboundView33.setChecked(viewModelShowNewContactAccountDialogGetValue);
        }
        if ((dirtyFlags & 0x3200L) != 0) {
            // api target 1

            this.mboundView33.setEnabled(viewModelReadContactsPermissionGrantedGetValue);
            this.mboundView35.setEnabled(viewModelReadContactsPermissionGrantedGetValue);
            this.mboundView36.setEnabled(viewModelReadContactsPermissionGrantedGetValue);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            this.mboundView34.setChecked(viewModelNativePresenceGetValue);
        }
        if ((dirtyFlags & 0x3240L) != 0) {
            // api target 1

            this.mboundView34.setEnabled(viewModelReadContactsPermissionGrantedViewModelFriendListSubscribeBooleanFalse);
        }
        if ((dirtyFlags & 0x3010L) != 0) {
            // api target 1

            this.mboundView35.setChecked(viewModelShowOrganizationGetValue);
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 1

            this.mboundView36.setChecked(viewModelLauncherShortcutsGetValue);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelLdapAvailableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3004L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView5, viewModelLdapConfigurationsGetValue, R.layout.settings_ldap_cell);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            this.mOldEventChecked1763403542 = mboundView31checked;
            this.mOldEventChecked1054197276 = mboundView32checked;
            this.mOldEventChecked285963875 = mboundView33checked;
            this.mOldEventChecked182714760 = mboundView34checked;
            this.mOldEventChecked953539169 = mboundView35checked;
            this.mOldEventChecked30033652 = mboundView36checked;
        }
        executeBindingsOn(mboundView31);
        executeBindingsOn(mboundView32);
        executeBindingsOn(mboundView33);
        executeBindingsOn(mboundView34);
        executeBindingsOn(mboundView35);
        executeBindingsOn(mboundView36);
        executeBindingsOn(mboundView41);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.launcherShortcuts
        flag 1 (0x2L): viewModel.rlsAddressAvailable
        flag 2 (0x3L): viewModel.ldapConfigurations
        flag 3 (0x4L): viewModel.publishPresence
        flag 4 (0x5L): viewModel.showOrganization
        flag 5 (0x6L): viewModel.nativePresence
        flag 6 (0x7L): viewModel.friendListSubscribe
        flag 7 (0x8L): viewModel.ldapAvailable
        flag 8 (0x9L): viewModel.showNewContactAccountDialog
        flag 9 (0xaL): viewModel.readContactsPermissionGranted
        flag 10 (0xbL): sharedMainViewModel.isSlidingPaneSlideable
        flag 11 (0xcL): sharedMainViewModel
        flag 12 (0xdL): viewModel
        flag 13 (0xeL): null
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readContactsPermissionGranted.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.friendListSubscribe.getValue()) : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readContactsPermissionGranted.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.friendListSubscribe.getValue()) : false
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readContactsPermissionGranted.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.rlsAddressAvailable.getValue()) : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.readContactsPermissionGranted.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.rlsAddressAvailable.getValue()) : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.ldapAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.ldapAvailable.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}