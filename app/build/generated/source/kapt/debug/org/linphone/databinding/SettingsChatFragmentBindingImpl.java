package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsChatFragmentBindingImpl extends SettingsChatFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(3, 
            new String[] {"settings_widget_switch", "settings_widget_list", "settings_widget_text", "settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_text", "settings_widget_basic"},
            new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15},
            new int[] {org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_basic});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 16);
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
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView310;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView311;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView312;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView32;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView33;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView34;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView35;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView36;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView37;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView38;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView39;
    // variables
    // values
    private androidx.databinding.InverseBindingListener mOldEventChecked981227930;
    private androidx.databinding.InverseBindingListener mOldEventChecked1862635654;
    private androidx.databinding.InverseBindingListener mOldEventChecked651511483;
    private androidx.databinding.InverseBindingListener mOldEventChecked383572025;
    private androidx.databinding.InverseBindingListener mOldEventChecked79714112;
    private androidx.databinding.InverseBindingListener mOldEventChecked603397816;
    private androidx.databinding.InverseBindingListener mOldEventChecked464420055;
    private androidx.databinding.InverseBindingListener mOldEventChecked299717912;
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView31checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.markAsReadNotifDismissal.getValue()
            //         is viewModel.markAsReadNotifDismissal.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView31.getChecked();
            // localize variables for thread safety
            // viewModel.markAsReadNotifDismissal != null
            boolean viewModelMarkAsReadNotifDismissalJavaLangObjectNull = false;
            // viewModel.markAsReadNotifDismissal
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelMarkAsReadNotifDismissal = null;
            // viewModel.markAsReadNotifDismissal.getValue()
            java.lang.Boolean viewModelMarkAsReadNotifDismissalGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelMarkAsReadNotifDismissal = viewModel.getMarkAsReadNotifDismissal();

                viewModelMarkAsReadNotifDismissalJavaLangObjectNull = (viewModelMarkAsReadNotifDismissal) != (null);
                if (viewModelMarkAsReadNotifDismissalJavaLangObjectNull) {




                    viewModelMarkAsReadNotifDismissal.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView310checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.hideRoomsRemovedProxies.getValue()
            //         is viewModel.hideRoomsRemovedProxies.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView310.getChecked();
            // localize variables for thread safety
            // viewModel.hideRoomsRemovedProxies
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHideRoomsRemovedProxies = null;
            // viewModel.hideRoomsRemovedProxies != null
            boolean viewModelHideRoomsRemovedProxiesJavaLangObjectNull = false;
            // viewModel.hideRoomsRemovedProxies.getValue()
            java.lang.Boolean viewModelHideRoomsRemovedProxiesGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelHideRoomsRemovedProxies = viewModel.getHideRoomsRemovedProxies();

                viewModelHideRoomsRemovedProxiesJavaLangObjectNull = (viewModelHideRoomsRemovedProxies) != (null);
                if (viewModelHideRoomsRemovedProxiesJavaLangObjectNull) {




                    viewModelHideRoomsRemovedProxies.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView34checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.autoDownloadVoiceRecordings.getValue()
            //         is viewModel.autoDownloadVoiceRecordings.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView34.getChecked();
            // localize variables for thread safety
            // viewModel.autoDownloadVoiceRecordings
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAutoDownloadVoiceRecordings = null;
            // viewModel.autoDownloadVoiceRecordings != null
            boolean viewModelAutoDownloadVoiceRecordingsJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel viewModel = mViewModel;
            // viewModel.autoDownloadVoiceRecordings.getValue()
            java.lang.Boolean viewModelAutoDownloadVoiceRecordingsGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAutoDownloadVoiceRecordings = viewModel.getAutoDownloadVoiceRecordings();

                viewModelAutoDownloadVoiceRecordingsJavaLangObjectNull = (viewModelAutoDownloadVoiceRecordings) != (null);
                if (viewModelAutoDownloadVoiceRecordingsJavaLangObjectNull) {




                    viewModelAutoDownloadVoiceRecordings.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView35checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.downloadedMediaPublic.getValue()
            //         is viewModel.downloadedMediaPublic.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView35.getChecked();
            // localize variables for thread safety
            // viewModel.downloadedMediaPublic.getValue()
            java.lang.Boolean viewModelDownloadedMediaPublicGetValue = null;
            // viewModel.downloadedMediaPublic
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDownloadedMediaPublic = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.downloadedMediaPublic != null
            boolean viewModelDownloadedMediaPublicJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDownloadedMediaPublic = viewModel.getDownloadedMediaPublic();

                viewModelDownloadedMediaPublicJavaLangObjectNull = (viewModelDownloadedMediaPublic) != (null);
                if (viewModelDownloadedMediaPublicJavaLangObjectNull) {




                    viewModelDownloadedMediaPublic.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView36checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.useInAppFileViewer.getValue()
            //         is viewModel.useInAppFileViewer.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView36.getChecked();
            // localize variables for thread safety
            // viewModel.useInAppFileViewer != null
            boolean viewModelUseInAppFileViewerJavaLangObjectNull = false;
            // viewModel.useInAppFileViewer.getValue()
            java.lang.Boolean viewModelUseInAppFileViewerGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.useInAppFileViewer
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelUseInAppFileViewer = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUseInAppFileViewer = viewModel.getUseInAppFileViewer();

                viewModelUseInAppFileViewerJavaLangObjectNull = (viewModelUseInAppFileViewer) != (null);
                if (viewModelUseInAppFileViewerJavaLangObjectNull) {




                    viewModelUseInAppFileViewer.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView37checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.hideNotificationContent.getValue()
            //         is viewModel.hideNotificationContent.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView37.getChecked();
            // localize variables for thread safety
            // viewModel.hideNotificationContent.getValue()
            java.lang.Boolean viewModelHideNotificationContentGetValue = null;
            // viewModel.hideNotificationContent
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHideNotificationContent = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.hideNotificationContent != null
            boolean viewModelHideNotificationContentJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelHideNotificationContent = viewModel.getHideNotificationContent();

                viewModelHideNotificationContentJavaLangObjectNull = (viewModelHideNotificationContent) != (null);
                if (viewModelHideNotificationContentJavaLangObjectNull) {




                    viewModelHideNotificationContent.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView38checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.launcherShortcuts.getValue()
            //         is viewModel.launcherShortcuts.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView38.getChecked();
            // localize variables for thread safety
            // viewModel.launcherShortcuts != null
            boolean viewModelLauncherShortcutsJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel viewModel = mViewModel;
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
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView39checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.hideEmptyRooms.getValue()
            //         is viewModel.hideEmptyRooms.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView39.getChecked();
            // localize variables for thread safety
            // viewModel.hideEmptyRooms.getValue()
            java.lang.Boolean viewModelHideEmptyRoomsGetValue = null;
            // viewModel.hideEmptyRooms
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHideEmptyRooms = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel viewModel = mViewModel;
            // viewModel.hideEmptyRooms != null
            boolean viewModelHideEmptyRoomsJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelHideEmptyRooms = viewModel.getHideEmptyRooms();

                viewModelHideEmptyRoomsJavaLangObjectNull = (viewModelHideEmptyRooms) != (null);
                if (viewModelHideEmptyRoomsJavaLangObjectNull) {




                    viewModelHideEmptyRooms.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public SettingsChatFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private SettingsChatFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 14
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[16]
            );
        this.back.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[4];
        setContainedBinding(this.mboundView31);
        this.mboundView310 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[13];
        setContainedBinding(this.mboundView310);
        this.mboundView311 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[14];
        setContainedBinding(this.mboundView311);
        this.mboundView312 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[15];
        setContainedBinding(this.mboundView312);
        this.mboundView32 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[5];
        setContainedBinding(this.mboundView32);
        this.mboundView33 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[6];
        setContainedBinding(this.mboundView33);
        this.mboundView34 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[7];
        setContainedBinding(this.mboundView34);
        this.mboundView35 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[8];
        setContainedBinding(this.mboundView35);
        this.mboundView36 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[9];
        setContainedBinding(this.mboundView36);
        this.mboundView37 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[10];
        setContainedBinding(this.mboundView37);
        this.mboundView38 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[11];
        setContainedBinding(this.mboundView38);
        this.mboundView39 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[12];
        setContainedBinding(this.mboundView39);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10000L;
        }
        mboundView31.invalidateAll();
        mboundView32.invalidateAll();
        mboundView33.invalidateAll();
        mboundView34.invalidateAll();
        mboundView35.invalidateAll();
        mboundView36.invalidateAll();
        mboundView37.invalidateAll();
        mboundView38.invalidateAll();
        mboundView39.invalidateAll();
        mboundView310.invalidateAll();
        mboundView311.invalidateAll();
        mboundView312.invalidateAll();
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
        if (mboundView37.hasPendingBindings()) {
            return true;
        }
        if (mboundView38.hasPendingBindings()) {
            return true;
        }
        if (mboundView39.hasPendingBindings()) {
            return true;
        }
        if (mboundView310.hasPendingBindings()) {
            return true;
        }
        if (mboundView311.hasPendingBindings()) {
            return true;
        }
        if (mboundView312.hasPendingBindings()) {
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
            setViewModel((org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
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
        mboundView37.setLifecycleOwner(lifecycleOwner);
        mboundView38.setLifecycleOwner(lifecycleOwner);
        mboundView39.setLifecycleOwner(lifecycleOwner);
        mboundView310.setLifecycleOwner(lifecycleOwner);
        mboundView311.setLifecycleOwner(lifecycleOwner);
        mboundView312.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelUseInAppFileViewer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelLauncherShortcuts((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelMarkAsReadNotifDismissal((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelAutoDownloadVoiceRecordings((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelHideEmptyRooms((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelAutoDownloadIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 6 :
                return onChangeViewModelHideRoomsRemovedProxies((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelVfs((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelAutoDownloadLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 9 :
                return onChangeViewModelFileSharingUrl((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelDownloadedMediaPublic((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelHideNotificationContent((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeViewModelAutoDownloadMaxSize((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUseInAppFileViewer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelUseInAppFileViewer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLauncherShortcuts(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLauncherShortcuts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMarkAsReadNotifDismissal(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelMarkAsReadNotifDismissal, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAutoDownloadVoiceRecordings(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAutoDownloadVoiceRecordings, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHideEmptyRooms(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelHideEmptyRooms, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAutoDownloadIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelAutoDownloadIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHideRoomsRemovedProxies(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelHideRoomsRemovedProxies, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVfs(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelVfs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAutoDownloadLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelAutoDownloadLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFileSharingUrl(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFileSharingUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDownloadedMediaPublic(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDownloadedMediaPublic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHideNotificationContent(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelHideNotificationContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAutoDownloadMaxSize(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelAutoDownloadMaxSize, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
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
        java.lang.String viewModelAutoDownloadMaxSizeToString = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelFileSharingUrlListener = null;
        java.lang.Boolean viewModelVfsGetValue = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelUseInAppFileViewer = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLauncherShortcuts = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelMarkAsReadNotifDismissal = null;
        java.lang.String viewModelFileSharingUrlGetValue = null;
        java.lang.Boolean viewModelMarkAsReadNotifDismissalGetValue = null;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        java.lang.Boolean viewModelDownloadedMediaPublicGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAutoDownloadVoiceRecordings = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHideEmptyRooms = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAutoDownloadListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelAutoDownloadIndex = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelUseInAppFileViewerListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelHideNotificationContentListener = null;
        java.lang.Integer viewModelAutoDownloadIndexGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelHideEmptyRoomsListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHideRoomsRemovedProxies = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelVfs = null;
        java.util.ArrayList<java.lang.String> viewModelAutoDownloadLabelsGetValue = null;
        java.lang.Integer viewModelAutoDownloadMaxSizeGetValue = null;
        boolean viewModelAutoDownloadIndexInt2 = false;
        int sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelAutoDownloadVoiceRecordingsGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelHideRoomsRemovedProxiesListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAutoDownloadVoiceRecordingsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLauncherShortcutsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelMarkAsReadNotifDismissalListener = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelAutoDownloadLabels = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelHideRoomsRemovedProxiesGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFileSharingUrl = null;
        java.lang.Boolean viewModelHideNotificationContentGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDownloadedMediaPublic = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelDownloadedMediaPublicListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAutoDownloadMaxSizeListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelVfsGetValue = false;
        int viewModelAutoDownloadIndexInt2ViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHideNotificationContent = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelGoToAndroidNotificationSettingsListener = null;
        java.lang.Boolean viewModelLauncherShortcutsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        java.lang.Boolean viewModelHideEmptyRoomsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelAutoDownloadMaxSize = null;
        java.lang.Boolean viewModelUseInAppFileViewerGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelAutoDownloadIndexGetValue = 0;
        org.linphone.activities.main.settings.viewmodels.ChatSettingsViewModel viewModel = mViewModel;
        boolean ViewModelVfs1 = false;

        if ((dirtyFlags & 0x15000L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(12, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x15000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x80000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1afffL) != 0) {


            if ((dirtyFlags & 0x18000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fileSharingUrlListener
                        viewModelFileSharingUrlListener = viewModel.getFileSharingUrlListener();
                        // read viewModel.autoDownloadListener
                        viewModelAutoDownloadListener = viewModel.getAutoDownloadListener();
                        // read viewModel.useInAppFileViewerListener
                        viewModelUseInAppFileViewerListener = viewModel.getUseInAppFileViewerListener();
                        // read viewModel.hideNotificationContentListener
                        viewModelHideNotificationContentListener = viewModel.getHideNotificationContentListener();
                        // read viewModel.hideEmptyRoomsListener
                        viewModelHideEmptyRoomsListener = viewModel.getHideEmptyRoomsListener();
                        // read viewModel.hideRoomsRemovedProxiesListener
                        viewModelHideRoomsRemovedProxiesListener = viewModel.getHideRoomsRemovedProxiesListener();
                        // read viewModel.autoDownloadVoiceRecordingsListener
                        viewModelAutoDownloadVoiceRecordingsListener = viewModel.getAutoDownloadVoiceRecordingsListener();
                        // read viewModel.launcherShortcutsListener
                        viewModelLauncherShortcutsListener = viewModel.getLauncherShortcutsListener();
                        // read viewModel.markAsReadNotifDismissalListener
                        viewModelMarkAsReadNotifDismissalListener = viewModel.getMarkAsReadNotifDismissalListener();
                        // read viewModel.downloadedMediaPublicListener
                        viewModelDownloadedMediaPublicListener = viewModel.getDownloadedMediaPublicListener();
                        // read viewModel.autoDownloadMaxSizeListener
                        viewModelAutoDownloadMaxSizeListener = viewModel.getAutoDownloadMaxSizeListener();
                        // read viewModel.goToAndroidNotificationSettingsListener
                        viewModelGoToAndroidNotificationSettingsListener = viewModel.getGoToAndroidNotificationSettingsListener();
                    }
            }
            if ((dirtyFlags & 0x18001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.useInAppFileViewer
                        viewModelUseInAppFileViewer = viewModel.getUseInAppFileViewer();
                    }
                    updateLiveDataRegistration(0, viewModelUseInAppFileViewer);


                    if (viewModelUseInAppFileViewer != null) {
                        // read viewModel.useInAppFileViewer.getValue()
                        viewModelUseInAppFileViewerGetValue = viewModelUseInAppFileViewer.getValue();
                    }
            }
            if ((dirtyFlags & 0x18002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.launcherShortcuts
                        viewModelLauncherShortcuts = viewModel.getLauncherShortcuts();
                    }
                    updateLiveDataRegistration(1, viewModelLauncherShortcuts);


                    if (viewModelLauncherShortcuts != null) {
                        // read viewModel.launcherShortcuts.getValue()
                        viewModelLauncherShortcutsGetValue = viewModelLauncherShortcuts.getValue();
                    }
            }
            if ((dirtyFlags & 0x18004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.markAsReadNotifDismissal
                        viewModelMarkAsReadNotifDismissal = viewModel.getMarkAsReadNotifDismissal();
                    }
                    updateLiveDataRegistration(2, viewModelMarkAsReadNotifDismissal);


                    if (viewModelMarkAsReadNotifDismissal != null) {
                        // read viewModel.markAsReadNotifDismissal.getValue()
                        viewModelMarkAsReadNotifDismissalGetValue = viewModelMarkAsReadNotifDismissal.getValue();
                    }
            }
            if ((dirtyFlags & 0x18008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.autoDownloadVoiceRecordings
                        viewModelAutoDownloadVoiceRecordings = viewModel.getAutoDownloadVoiceRecordings();
                    }
                    updateLiveDataRegistration(3, viewModelAutoDownloadVoiceRecordings);


                    if (viewModelAutoDownloadVoiceRecordings != null) {
                        // read viewModel.autoDownloadVoiceRecordings.getValue()
                        viewModelAutoDownloadVoiceRecordingsGetValue = viewModelAutoDownloadVoiceRecordings.getValue();
                    }
            }
            if ((dirtyFlags & 0x18010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hideEmptyRooms
                        viewModelHideEmptyRooms = viewModel.getHideEmptyRooms();
                    }
                    updateLiveDataRegistration(4, viewModelHideEmptyRooms);


                    if (viewModelHideEmptyRooms != null) {
                        // read viewModel.hideEmptyRooms.getValue()
                        viewModelHideEmptyRoomsGetValue = viewModelHideEmptyRooms.getValue();
                    }
            }
            if ((dirtyFlags & 0x18020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.autoDownloadIndex
                        viewModelAutoDownloadIndex = viewModel.getAutoDownloadIndex();
                    }
                    updateLiveDataRegistration(5, viewModelAutoDownloadIndex);


                    if (viewModelAutoDownloadIndex != null) {
                        // read viewModel.autoDownloadIndex.getValue()
                        viewModelAutoDownloadIndexGetValue = viewModelAutoDownloadIndex.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoDownloadIndex.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAutoDownloadIndexGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAutoDownloadIndexGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoDownloadIndex.getValue()) == 2
                    viewModelAutoDownloadIndexInt2 = (androidxDatabindingViewDataBindingSafeUnboxViewModelAutoDownloadIndexGetValue) == (2);
                if((dirtyFlags & 0x18020L) != 0) {
                    if(viewModelAutoDownloadIndexInt2) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoDownloadIndex.getValue()) == 2 ? View.VISIBLE : View.GONE
                    viewModelAutoDownloadIndexInt2ViewVISIBLEViewGONE = ((viewModelAutoDownloadIndexInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hideRoomsRemovedProxies
                        viewModelHideRoomsRemovedProxies = viewModel.getHideRoomsRemovedProxies();
                    }
                    updateLiveDataRegistration(6, viewModelHideRoomsRemovedProxies);


                    if (viewModelHideRoomsRemovedProxies != null) {
                        // read viewModel.hideRoomsRemovedProxies.getValue()
                        viewModelHideRoomsRemovedProxiesGetValue = viewModelHideRoomsRemovedProxies.getValue();
                    }
            }
            if ((dirtyFlags & 0x18080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.vfs
                        viewModelVfs = viewModel.getVfs();
                    }
                    updateLiveDataRegistration(7, viewModelVfs);


                    if (viewModelVfs != null) {
                        // read viewModel.vfs.getValue()
                        viewModelVfsGetValue = viewModelVfs.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.vfs.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelVfsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelVfsGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.vfs.getValue())
                    ViewModelVfs1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelVfsGetValue;
            }
            if ((dirtyFlags & 0x18100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.autoDownloadLabels
                        viewModelAutoDownloadLabels = viewModel.getAutoDownloadLabels();
                    }
                    updateLiveDataRegistration(8, viewModelAutoDownloadLabels);


                    if (viewModelAutoDownloadLabels != null) {
                        // read viewModel.autoDownloadLabels.getValue()
                        viewModelAutoDownloadLabelsGetValue = viewModelAutoDownloadLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x18200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fileSharingUrl
                        viewModelFileSharingUrl = viewModel.getFileSharingUrl();
                    }
                    updateLiveDataRegistration(9, viewModelFileSharingUrl);


                    if (viewModelFileSharingUrl != null) {
                        // read viewModel.fileSharingUrl.getValue()
                        viewModelFileSharingUrlGetValue = viewModelFileSharingUrl.getValue();
                    }
            }
            if ((dirtyFlags & 0x18400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.downloadedMediaPublic
                        viewModelDownloadedMediaPublic = viewModel.getDownloadedMediaPublic();
                    }
                    updateLiveDataRegistration(10, viewModelDownloadedMediaPublic);


                    if (viewModelDownloadedMediaPublic != null) {
                        // read viewModel.downloadedMediaPublic.getValue()
                        viewModelDownloadedMediaPublicGetValue = viewModelDownloadedMediaPublic.getValue();
                    }
            }
            if ((dirtyFlags & 0x18800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hideNotificationContent
                        viewModelHideNotificationContent = viewModel.getHideNotificationContent();
                    }
                    updateLiveDataRegistration(11, viewModelHideNotificationContent);


                    if (viewModelHideNotificationContent != null) {
                        // read viewModel.hideNotificationContent.getValue()
                        viewModelHideNotificationContentGetValue = viewModelHideNotificationContent.getValue();
                    }
            }
            if ((dirtyFlags & 0x1a000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.autoDownloadMaxSize
                        viewModelAutoDownloadMaxSize = viewModel.getAutoDownloadMaxSize();
                    }
                    updateLiveDataRegistration(13, viewModelAutoDownloadMaxSize);


                    if (viewModelAutoDownloadMaxSize != null) {
                        // read viewModel.autoDownloadMaxSize.getValue()
                        viewModelAutoDownloadMaxSizeGetValue = viewModelAutoDownloadMaxSize.getValue();
                    }


                    if (viewModelAutoDownloadMaxSizeGetValue != null) {
                        // read viewModel.autoDownloadMaxSize.getValue().toString()
                        viewModelAutoDownloadMaxSizeToString = viewModelAutoDownloadMaxSizeGetValue.toString();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x15000L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10000L) != 0) {
            // api target 1

            this.mboundView31.setTitle(getRoot().getResources().getString(R.string.chat_settings_mark_as_read_notif_dismissal_title));
            setBindingInverseListener(this.mboundView31, this.mOldEventChecked981227930, mboundView31checked);
            this.mboundView310.setTitle(getRoot().getResources().getString(R.string.chat_settings_hide_rooms_removed_proxies_title));
            this.mboundView310.setSubtitle(getRoot().getResources().getString(R.string.chat_settings_hide_rooms_removed_proxies_summary));
            setBindingInverseListener(this.mboundView310, this.mOldEventChecked1862635654, mboundView310checked);
            this.mboundView311.setTitle(getRoot().getResources().getString(R.string.chat_settings_file_sharing_url_title));
            this.mboundView311.setSubtitle(getRoot().getResources().getString(R.string.chat_settings_file_sharing_url_summary));
            this.mboundView311.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_URI);
            this.mboundView312.setTitle(getRoot().getResources().getString(R.string.chat_settings_go_to_android_notification_settings));
            this.mboundView32.setTitle(getRoot().getResources().getString(R.string.chat_settings_auto_download_title));
            this.mboundView32.setSubtitle(getRoot().getResources().getString(R.string.chat_settings_auto_download_summary));
            this.mboundView33.setTitle(getRoot().getResources().getString(R.string.chat_settings_auto_download_max_size_title));
            this.mboundView33.setSubtitle(getRoot().getResources().getString(R.string.chat_settings_auto_download_max_size_summary));
            this.mboundView33.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
            this.mboundView34.setTitle(getRoot().getResources().getString(R.string.chat_settings_auto_download_voice_recordings));
            setBindingInverseListener(this.mboundView34, this.mOldEventChecked651511483, mboundView34checked);
            this.mboundView35.setTitle(getRoot().getResources().getString(R.string.chat_settings_downloaded_media_public_title));
            this.mboundView35.setSubtitle(getRoot().getResources().getString(R.string.chat_settings_downloaded_media_public_summary));
            setBindingInverseListener(this.mboundView35, this.mOldEventChecked383572025, mboundView35checked);
            this.mboundView36.setTitle(getRoot().getResources().getString(R.string.chat_settings_use_in_app_file_viewer_title));
            this.mboundView36.setSubtitle(getRoot().getResources().getString(R.string.chat_settings_use_in_app_file_viewer_summary));
            setBindingInverseListener(this.mboundView36, this.mOldEventChecked79714112, mboundView36checked);
            this.mboundView37.setTitle(getRoot().getResources().getString(R.string.chat_settings_hide_notification_content_title));
            this.mboundView37.setSubtitle(getRoot().getResources().getString(R.string.chat_settings_hide_notification_content_summary));
            setBindingInverseListener(this.mboundView37, this.mOldEventChecked603397816, mboundView37checked);
            this.mboundView38.setTitle(getRoot().getResources().getString(R.string.chat_settings_launcher_shortcuts_title));
            this.mboundView38.setSubtitle(getRoot().getResources().getString(R.string.chat_settings_launcher_shortcuts_summary));
            setBindingInverseListener(this.mboundView38, this.mOldEventChecked464420055, mboundView38checked);
            this.mboundView39.setTitle(getRoot().getResources().getString(R.string.chat_settings_hide_empty_rooms_title));
            setBindingInverseListener(this.mboundView39, this.mOldEventChecked299717912, mboundView39checked);
        }
        if ((dirtyFlags & 0x18000L) != 0) {
            // api target 1

            this.mboundView31.setListener(viewModelMarkAsReadNotifDismissalListener);
            this.mboundView310.setListener(viewModelHideRoomsRemovedProxiesListener);
            this.mboundView311.setListener(viewModelFileSharingUrlListener);
            this.mboundView312.setListener(viewModelGoToAndroidNotificationSettingsListener);
            this.mboundView32.setListener(viewModelAutoDownloadListener);
            this.mboundView33.setListener(viewModelAutoDownloadMaxSizeListener);
            this.mboundView34.setListener(viewModelAutoDownloadVoiceRecordingsListener);
            this.mboundView35.setListener(viewModelDownloadedMediaPublicListener);
            this.mboundView36.setListener(viewModelUseInAppFileViewerListener);
            this.mboundView37.setListener(viewModelHideNotificationContentListener);
            this.mboundView38.setListener(viewModelLauncherShortcutsListener);
            this.mboundView39.setListener(viewModelHideEmptyRoomsListener);
        }
        if ((dirtyFlags & 0x18004L) != 0) {
            // api target 1

            this.mboundView31.setChecked(viewModelMarkAsReadNotifDismissalGetValue);
        }
        if ((dirtyFlags & 0x18040L) != 0) {
            // api target 1

            this.mboundView310.setChecked(viewModelHideRoomsRemovedProxiesGetValue);
        }
        if ((dirtyFlags & 0x18200L) != 0) {
            // api target 1

            this.mboundView311.setDefaultValue(viewModelFileSharingUrlGetValue);
        }
        if ((dirtyFlags & 0x18020L) != 0) {
            // api target 1

            this.mboundView32.setSelectedIndex(viewModelAutoDownloadIndexGetValue);
            this.mboundView33.setEnabled(viewModelAutoDownloadIndexInt2);
            this.mboundView33.getRoot().setVisibility(viewModelAutoDownloadIndexInt2ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18100L) != 0) {
            // api target 1

            this.mboundView32.setLabels(viewModelAutoDownloadLabelsGetValue);
        }
        if ((dirtyFlags & 0x1a000L) != 0) {
            // api target 1

            this.mboundView33.setDefaultValue(viewModelAutoDownloadMaxSizeToString);
        }
        if ((dirtyFlags & 0x18008L) != 0) {
            // api target 1

            this.mboundView34.setChecked(viewModelAutoDownloadVoiceRecordingsGetValue);
        }
        if ((dirtyFlags & 0x18080L) != 0) {
            // api target 1

            this.mboundView35.setEnabled(ViewModelVfs1);
            this.mboundView36.setEnabled(ViewModelVfs1);
        }
        if ((dirtyFlags & 0x18400L) != 0) {
            // api target 1

            this.mboundView35.setChecked(viewModelDownloadedMediaPublicGetValue);
        }
        if ((dirtyFlags & 0x18001L) != 0) {
            // api target 1

            this.mboundView36.setChecked(viewModelUseInAppFileViewerGetValue);
        }
        if ((dirtyFlags & 0x18800L) != 0) {
            // api target 1

            this.mboundView37.setChecked(viewModelHideNotificationContentGetValue);
        }
        if ((dirtyFlags & 0x18002L) != 0) {
            // api target 1

            this.mboundView38.setChecked(viewModelLauncherShortcutsGetValue);
        }
        if ((dirtyFlags & 0x18010L) != 0) {
            // api target 1

            this.mboundView39.setChecked(viewModelHideEmptyRoomsGetValue);
        }
        if ((dirtyFlags & 0x10000L) != 0) {
            this.mOldEventChecked981227930 = mboundView31checked;
            this.mOldEventChecked1862635654 = mboundView310checked;
            this.mOldEventChecked651511483 = mboundView34checked;
            this.mOldEventChecked383572025 = mboundView35checked;
            this.mOldEventChecked79714112 = mboundView36checked;
            this.mOldEventChecked603397816 = mboundView37checked;
            this.mOldEventChecked464420055 = mboundView38checked;
            this.mOldEventChecked299717912 = mboundView39checked;
        }
        executeBindingsOn(mboundView31);
        executeBindingsOn(mboundView32);
        executeBindingsOn(mboundView33);
        executeBindingsOn(mboundView34);
        executeBindingsOn(mboundView35);
        executeBindingsOn(mboundView36);
        executeBindingsOn(mboundView37);
        executeBindingsOn(mboundView38);
        executeBindingsOn(mboundView39);
        executeBindingsOn(mboundView310);
        executeBindingsOn(mboundView311);
        executeBindingsOn(mboundView312);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.useInAppFileViewer
        flag 1 (0x2L): viewModel.launcherShortcuts
        flag 2 (0x3L): viewModel.markAsReadNotifDismissal
        flag 3 (0x4L): viewModel.autoDownloadVoiceRecordings
        flag 4 (0x5L): viewModel.hideEmptyRooms
        flag 5 (0x6L): viewModel.autoDownloadIndex
        flag 6 (0x7L): viewModel.hideRoomsRemovedProxies
        flag 7 (0x8L): viewModel.vfs
        flag 8 (0x9L): viewModel.autoDownloadLabels
        flag 9 (0xaL): viewModel.fileSharingUrl
        flag 10 (0xbL): viewModel.downloadedMediaPublic
        flag 11 (0xcL): viewModel.hideNotificationContent
        flag 12 (0xdL): sharedMainViewModel.isSlidingPaneSlideable
        flag 13 (0xeL): viewModel.autoDownloadMaxSize
        flag 14 (0xfL): sharedMainViewModel
        flag 15 (0x10L): viewModel
        flag 16 (0x11L): null
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoDownloadIndex.getValue()) == 2 ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoDownloadIndex.getValue()) == 2 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}