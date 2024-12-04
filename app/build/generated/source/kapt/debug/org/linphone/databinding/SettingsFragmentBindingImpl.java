package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsFragmentBindingImpl extends SettingsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(1, 
            new String[] {"settings_widget_text", "settings_widget_text", "settings_widget_basic", "settings_widget_basic", "settings_widget_basic", "settings_widget_basic", "settings_widget_basic", "settings_widget_basic", "settings_widget_basic", "settings_widget_basic", "settings_widget_basic"},
            new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
            new int[] {org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 16);
        sViewsWithIds.put(R.id.back, 17);
        sViewsWithIds.put(R.id.settings_nav_container, 18);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView11;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView110;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView111;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView12;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView13;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView14;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView15;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView16;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView17;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView18;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView19;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SettingsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private SettingsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[17]
            , (androidx.fragment.app.FragmentContainerView) bindings[18]
            , (androidx.slidingpanelayout.widget.SlidingPaneLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[16]
            );
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[5];
        setContainedBinding(this.mboundView11);
        this.mboundView110 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[14];
        setContainedBinding(this.mboundView110);
        this.mboundView111 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[15];
        setContainedBinding(this.mboundView111);
        this.mboundView12 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[6];
        setContainedBinding(this.mboundView12);
        this.mboundView13 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[7];
        setContainedBinding(this.mboundView13);
        this.mboundView14 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[8];
        setContainedBinding(this.mboundView14);
        this.mboundView15 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[9];
        setContainedBinding(this.mboundView15);
        this.mboundView16 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[10];
        setContainedBinding(this.mboundView16);
        this.mboundView17 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[11];
        setContainedBinding(this.mboundView17);
        this.mboundView18 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[12];
        setContainedBinding(this.mboundView18);
        this.mboundView19 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[13];
        setContainedBinding(this.mboundView19);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.slidingPane.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        mboundView11.invalidateAll();
        mboundView12.invalidateAll();
        mboundView13.invalidateAll();
        mboundView14.invalidateAll();
        mboundView15.invalidateAll();
        mboundView16.invalidateAll();
        mboundView17.invalidateAll();
        mboundView18.invalidateAll();
        mboundView19.invalidateAll();
        mboundView110.invalidateAll();
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
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        if (mboundView12.hasPendingBindings()) {
            return true;
        }
        if (mboundView13.hasPendingBindings()) {
            return true;
        }
        if (mboundView14.hasPendingBindings()) {
            return true;
        }
        if (mboundView15.hasPendingBindings()) {
            return true;
        }
        if (mboundView16.hasPendingBindings()) {
            return true;
        }
        if (mboundView17.hasPendingBindings()) {
            return true;
        }
        if (mboundView18.hasPendingBindings()) {
            return true;
        }
        if (mboundView19.hasPendingBindings()) {
            return true;
        }
        if (mboundView110.hasPendingBindings()) {
            return true;
        }
        if (mboundView111.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.settings.viewmodels.SettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.SettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
        mboundView12.setLifecycleOwner(lifecycleOwner);
        mboundView13.setLifecycleOwner(lifecycleOwner);
        mboundView14.setLifecycleOwner(lifecycleOwner);
        mboundView15.setLifecycleOwner(lifecycleOwner);
        mboundView16.setLifecycleOwner(lifecycleOwner);
        mboundView17.setLifecycleOwner(lifecycleOwner);
        mboundView18.setLifecycleOwner(lifecycleOwner);
        mboundView19.setLifecycleOwner(lifecycleOwner);
        mboundView110.setLifecycleOwner(lifecycleOwner);
        mboundView111.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAccounts((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>>) object, fieldId);
            case 1 :
                return onChangeViewModelPrimaryAccountUsername((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPrimaryAccountDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAccounts(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>> ViewModelAccounts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPrimaryAccountUsername(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPrimaryAccountUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPrimaryAccountDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPrimaryAccountDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean viewModelShowNetworkSettings = false;
        boolean viewModelShowTunnelSettings = false;
        int viewModelShowContactsSettingsViewVISIBLEViewGONE = 0;
        boolean viewModelAccountsEmpty = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel>> viewModelAccounts = null;
        boolean ViewModelAccountsEmpty1 = false;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAudioSettingsListener = null;
        java.util.ArrayList<org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel> viewModelAccountsGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelPrimaryAccountDisplayNameListener = null;
        boolean viewModelShowAudioSettings = false;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAdvancedSettingsListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrimaryAccountUsername = null;
        boolean viewModelShowConferencesSettings = false;
        boolean viewModelShowContactsSettings = false;
        org.linphone.activities.main.settings.SettingListenerStub viewModelNetworkSettingsListener = null;
        boolean viewModelShowAccountSettings = false;
        java.lang.String viewModelPrimaryAccountUsernameGetValue = null;
        int viewModelShowAccountSettingsViewVISIBLEViewGONE = 0;
        int viewModelShowConferencesSettingsViewVISIBLEViewGONE = 0;
        int viewModelShowCallSettingsViewVISIBLEViewGONE = 0;
        int viewModelShowVideoSettingsViewVISIBLEViewGONE = 0;
        boolean viewModelShowCallSettings = false;
        int viewModelShowChatSettingsViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.settings.SettingListenerStub viewModelTunnelSettingsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelContactsSettingsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelConferencesSettingsListener = null;
        int viewModelShowAdvancedSettingsViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrimaryAccountDisplayName = null;
        int viewModelAccountsEmptyViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.settings.SettingListenerStub viewModelPrimaryAccountUsernameListener = null;
        java.lang.String viewModelPrimaryAccountDisplayNameGetValue = null;
        boolean viewModelShowVideoSettings = false;
        boolean viewModelShowChatSettings = false;
        org.linphone.activities.main.settings.SettingListenerStub viewModelVideoSettingsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelCallSettingsListener = null;
        int viewModelShowAccountSettingsViewModelAccountsEmptyBooleanFalseViewVISIBLEViewGONE = 0;
        boolean viewModelShowAccountSettingsViewModelAccountsEmptyBooleanFalse = false;
        org.linphone.activities.main.settings.SettingListenerStub viewModelChatSettingsListener = null;
        org.linphone.activities.main.settings.viewmodels.SettingsViewModel viewModel = mViewModel;
        int viewModelShowTunnelSettingsViewVISIBLEViewGONE = 0;
        int viewModelShowAudioSettingsViewVISIBLEViewGONE = 0;
        boolean viewModelShowAdvancedSettings = false;
        int viewModelShowNetworkSettingsViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showNetworkSettings
                        viewModelShowNetworkSettings = viewModel.getShowNetworkSettings();
                        // read viewModel.showTunnelSettings
                        viewModelShowTunnelSettings = viewModel.getShowTunnelSettings();
                        // read viewModel.audioSettingsListener
                        viewModelAudioSettingsListener = viewModel.getAudioSettingsListener();
                        // read viewModel.primaryAccountDisplayNameListener
                        viewModelPrimaryAccountDisplayNameListener = viewModel.getPrimaryAccountDisplayNameListener();
                        // read viewModel.showAudioSettings
                        viewModelShowAudioSettings = viewModel.getShowAudioSettings();
                        // read viewModel.advancedSettingsListener
                        viewModelAdvancedSettingsListener = viewModel.getAdvancedSettingsListener();
                        // read viewModel.showConferencesSettings
                        viewModelShowConferencesSettings = viewModel.getShowConferencesSettings();
                        // read viewModel.showContactsSettings
                        viewModelShowContactsSettings = viewModel.getShowContactsSettings();
                        // read viewModel.networkSettingsListener
                        viewModelNetworkSettingsListener = viewModel.getNetworkSettingsListener();
                        // read viewModel.showCallSettings
                        viewModelShowCallSettings = viewModel.getShowCallSettings();
                        // read viewModel.tunnelSettingsListener
                        viewModelTunnelSettingsListener = viewModel.getTunnelSettingsListener();
                        // read viewModel.contactsSettingsListener
                        viewModelContactsSettingsListener = viewModel.getContactsSettingsListener();
                        // read viewModel.conferencesSettingsListener
                        viewModelConferencesSettingsListener = viewModel.getConferencesSettingsListener();
                        // read viewModel.primaryAccountUsernameListener
                        viewModelPrimaryAccountUsernameListener = viewModel.getPrimaryAccountUsernameListener();
                        // read viewModel.showVideoSettings
                        viewModelShowVideoSettings = viewModel.getShowVideoSettings();
                        // read viewModel.showChatSettings
                        viewModelShowChatSettings = viewModel.getShowChatSettings();
                        // read viewModel.videoSettingsListener
                        viewModelVideoSettingsListener = viewModel.getVideoSettingsListener();
                        // read viewModel.callSettingsListener
                        viewModelCallSettingsListener = viewModel.getCallSettingsListener();
                        // read viewModel.chatSettingsListener
                        viewModelChatSettingsListener = viewModel.getChatSettingsListener();
                        // read viewModel.showAdvancedSettings
                        viewModelShowAdvancedSettings = viewModel.getShowAdvancedSettings();
                    }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowNetworkSettings) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowTunnelSettings) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowAudioSettings) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowConferencesSettings) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowContactsSettings) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowCallSettings) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowVideoSettings) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowChatSettings) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowAdvancedSettings) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read viewModel.showNetworkSettings ? View.VISIBLE : View.GONE
                    viewModelShowNetworkSettingsViewVISIBLEViewGONE = ((viewModelShowNetworkSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showTunnelSettings ? View.VISIBLE : View.GONE
                    viewModelShowTunnelSettingsViewVISIBLEViewGONE = ((viewModelShowTunnelSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showAudioSettings ? View.VISIBLE : View.GONE
                    viewModelShowAudioSettingsViewVISIBLEViewGONE = ((viewModelShowAudioSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showConferencesSettings ? View.VISIBLE : View.GONE
                    viewModelShowConferencesSettingsViewVISIBLEViewGONE = ((viewModelShowConferencesSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showContactsSettings ? View.VISIBLE : View.GONE
                    viewModelShowContactsSettingsViewVISIBLEViewGONE = ((viewModelShowContactsSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showCallSettings ? View.VISIBLE : View.GONE
                    viewModelShowCallSettingsViewVISIBLEViewGONE = ((viewModelShowCallSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showVideoSettings ? View.VISIBLE : View.GONE
                    viewModelShowVideoSettingsViewVISIBLEViewGONE = ((viewModelShowVideoSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showChatSettings ? View.VISIBLE : View.GONE
                    viewModelShowChatSettingsViewVISIBLEViewGONE = ((viewModelShowChatSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showAdvancedSettings ? View.VISIBLE : View.GONE
                    viewModelShowAdvancedSettingsViewVISIBLEViewGONE = ((viewModelShowAdvancedSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.accounts
                        viewModelAccounts = viewModel.getAccounts();
                        // read viewModel.showAccountSettings
                        viewModelShowAccountSettings = viewModel.getShowAccountSettings();
                    }
                    updateLiveDataRegistration(0, viewModelAccounts);
                if((dirtyFlags & 0x18L) != 0) {
                    if(viewModelShowAccountSettings) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
                if((dirtyFlags & 0x19L) != 0) {
                    if(viewModelShowAccountSettings) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }


                    if (viewModelAccounts != null) {
                        // read viewModel.accounts.getValue()
                        viewModelAccountsGetValue = viewModelAccounts.getValue();
                    }


                    if (viewModelAccountsGetValue != null) {
                        // read viewModel.accounts.getValue().empty
                        ViewModelAccountsEmpty1 = viewModelAccountsGetValue.isEmpty();
                    }
                if((dirtyFlags & 0x19L) != 0) {
                    if(ViewModelAccountsEmpty1) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read viewModel.accounts.getValue().empty ? View.VISIBLE : View.GONE
                    viewModelAccountsEmptyViewVISIBLEViewGONE = ((ViewModelAccountsEmpty1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if ((dirtyFlags & 0x18L) != 0) {

                        // read viewModel.showAccountSettings ? View.VISIBLE : View.GONE
                        viewModelShowAccountSettingsViewVISIBLEViewGONE = ((viewModelShowAccountSettings) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.primaryAccountUsername
                        viewModelPrimaryAccountUsername = viewModel.getPrimaryAccountUsername();
                    }
                    updateLiveDataRegistration(1, viewModelPrimaryAccountUsername);


                    if (viewModelPrimaryAccountUsername != null) {
                        // read viewModel.primaryAccountUsername.getValue()
                        viewModelPrimaryAccountUsernameGetValue = viewModelPrimaryAccountUsername.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.primaryAccountDisplayName
                        viewModelPrimaryAccountDisplayName = viewModel.getPrimaryAccountDisplayName();
                    }
                    updateLiveDataRegistration(2, viewModelPrimaryAccountDisplayName);


                    if (viewModelPrimaryAccountDisplayName != null) {
                        // read viewModel.primaryAccountDisplayName.getValue()
                        viewModelPrimaryAccountDisplayNameGetValue = viewModelPrimaryAccountDisplayName.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000000L) != 0) {

                // read !viewModel.accounts.getValue().empty
                viewModelAccountsEmpty = !ViewModelAccountsEmpty1;
        }

        if ((dirtyFlags & 0x19L) != 0) {

                // read viewModel.showAccountSettings ? !viewModel.accounts.getValue().empty : false
                viewModelShowAccountSettingsViewModelAccountsEmptyBooleanFalse = ((viewModelShowAccountSettings) ? (viewModelAccountsEmpty) : (false));
            if((dirtyFlags & 0x19L) != 0) {
                if(viewModelShowAccountSettingsViewModelAccountsEmptyBooleanFalse) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read viewModel.showAccountSettings ? !viewModel.accounts.getValue().empty : false ? View.VISIBLE : View.GONE
                viewModelShowAccountSettingsViewModelAccountsEmptyBooleanFalseViewVISIBLEViewGONE = ((viewModelShowAccountSettingsViewModelAccountsEmptyBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView11.setTitle(getRoot().getResources().getString(R.string.settings_primary_account_display_name_title));
            this.mboundView11.setInputType(android.text.InputType.TYPE_CLASS_TEXT);
            this.mboundView110.setTitle(getRoot().getResources().getString(R.string.settings_contacts_title));
            this.mboundView110.setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.settings_contacts));
            this.mboundView111.setTitle(getRoot().getResources().getString(R.string.settings_advanced_title));
            this.mboundView111.setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.settings_advanced));
            this.mboundView12.setTitle(getRoot().getResources().getString(R.string.settings_primary_account_username_title));
            this.mboundView12.setInputType(android.text.InputType.TYPE_CLASS_TEXT);
            this.mboundView13.setTitle(getRoot().getResources().getString(R.string.settings_tunnel_title));
            this.mboundView14.setTitle(getRoot().getResources().getString(R.string.settings_audio_title));
            this.mboundView14.setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.settings_audio));
            this.mboundView15.setTitle(getRoot().getResources().getString(R.string.settings_video_title));
            this.mboundView15.setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.settings_video));
            this.mboundView16.setTitle(getRoot().getResources().getString(R.string.settings_call_title));
            this.mboundView16.setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.settings_call));
            this.mboundView17.setTitle(getRoot().getResources().getString(R.string.settings_conferences_title));
            this.mboundView17.setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.settings_conferences));
            this.mboundView18.setTitle(getRoot().getResources().getString(R.string.settings_chat_title));
            this.mboundView18.setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.settings_chat));
            this.mboundView19.setTitle(getRoot().getResources().getString(R.string.settings_network_title));
            this.mboundView19.setIcon(androidx.appcompat.content.res.AppCompatResources.getDrawable(getRoot().getContext(), R.drawable.settings_network));
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView11.setListener(viewModelPrimaryAccountDisplayNameListener);
            this.mboundView110.getRoot().setVisibility(viewModelShowContactsSettingsViewVISIBLEViewGONE);
            this.mboundView110.setListener(viewModelContactsSettingsListener);
            this.mboundView111.getRoot().setVisibility(viewModelShowAdvancedSettingsViewVISIBLEViewGONE);
            this.mboundView111.setListener(viewModelAdvancedSettingsListener);
            this.mboundView12.setListener(viewModelPrimaryAccountUsernameListener);
            this.mboundView13.setListener(viewModelTunnelSettingsListener);
            this.mboundView13.getRoot().setVisibility(viewModelShowTunnelSettingsViewVISIBLEViewGONE);
            this.mboundView14.getRoot().setVisibility(viewModelShowAudioSettingsViewVISIBLEViewGONE);
            this.mboundView14.setListener(viewModelAudioSettingsListener);
            this.mboundView15.getRoot().setVisibility(viewModelShowVideoSettingsViewVISIBLEViewGONE);
            this.mboundView15.setListener(viewModelVideoSettingsListener);
            this.mboundView16.getRoot().setVisibility(viewModelShowCallSettingsViewVISIBLEViewGONE);
            this.mboundView16.setListener(viewModelCallSettingsListener);
            this.mboundView17.getRoot().setVisibility(viewModelShowConferencesSettingsViewVISIBLEViewGONE);
            this.mboundView17.setListener(viewModelConferencesSettingsListener);
            this.mboundView18.getRoot().setVisibility(viewModelShowChatSettingsViewVISIBLEViewGONE);
            this.mboundView18.setListener(viewModelChatSettingsListener);
            this.mboundView19.getRoot().setVisibility(viewModelShowNetworkSettingsViewVISIBLEViewGONE);
            this.mboundView19.setListener(viewModelNetworkSettingsListener);
            this.mboundView4.setVisibility(viewModelShowAccountSettingsViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView11.setDefaultValue(viewModelPrimaryAccountDisplayNameGetValue);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.mboundView11.getRoot().setVisibility(viewModelAccountsEmptyViewVISIBLEViewGONE);
            this.mboundView12.getRoot().setVisibility(viewModelAccountsEmptyViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(viewModelAccountsEmptyViewVISIBLEViewGONE);
            this.mboundView3.setVisibility(viewModelShowAccountSettingsViewModelAccountsEmptyBooleanFalseViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView4, viewModelAccountsGetValue, R.layout.settings_account_cell);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView12.setDefaultValue(viewModelPrimaryAccountUsernameGetValue);
        }
        executeBindingsOn(mboundView11);
        executeBindingsOn(mboundView12);
        executeBindingsOn(mboundView13);
        executeBindingsOn(mboundView14);
        executeBindingsOn(mboundView15);
        executeBindingsOn(mboundView16);
        executeBindingsOn(mboundView17);
        executeBindingsOn(mboundView18);
        executeBindingsOn(mboundView19);
        executeBindingsOn(mboundView110);
        executeBindingsOn(mboundView111);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.accounts
        flag 1 (0x2L): viewModel.primaryAccountUsername
        flag 2 (0x3L): viewModel.primaryAccountDisplayName
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): viewModel.showContactsSettings ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.showContactsSettings ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.showAccountSettings ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.showAccountSettings ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.showConferencesSettings ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.showConferencesSettings ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.showCallSettings ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.showCallSettings ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.showVideoSettings ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.showVideoSettings ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.showChatSettings ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.showChatSettings ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.showAdvancedSettings ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.showAdvancedSettings ? View.VISIBLE : View.GONE
        flag 19 (0x14L): viewModel.accounts.getValue().empty ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.accounts.getValue().empty ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.showAccountSettings ? !viewModel.accounts.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.showAccountSettings ? !viewModel.accounts.getValue().empty : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): viewModel.showAccountSettings ? !viewModel.accounts.getValue().empty : false
        flag 24 (0x19L): viewModel.showAccountSettings ? !viewModel.accounts.getValue().empty : false
        flag 25 (0x1aL): viewModel.showTunnelSettings ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewModel.showTunnelSettings ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): viewModel.showAudioSettings ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): viewModel.showAudioSettings ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): viewModel.showNetworkSettings ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): viewModel.showNetworkSettings ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}