package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsAdvancedFragmentBindingImpl extends SettingsAdvancedFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(21);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {19},
            new int[] {org.linphone.R.layout.wait_layout});
        sIncludes.setIncludes(3, 
            new String[] {"settings_widget_switch", "settings_widget_text", "settings_widget_basic", "settings_widget_basic", "settings_widget_switch", "settings_widget_switch", "settings_widget_list", "settings_widget_switch", "settings_widget_text", "settings_widget_text", "settings_widget_switch", "settings_widget_switch", "settings_widget_basic", "settings_widget_basic", "settings_widget_basic"},
            new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18},
            new int[] {org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 20);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final android.view.View mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView31;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView310;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView311;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView312;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView313;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView314;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView315;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView32;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView33;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView34;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView35;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView36;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView37;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView38;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView39;
    // variables
    // values
    private androidx.databinding.InverseBindingListener mOldEventChecked2087004857;
    private androidx.databinding.InverseBindingListener mOldEventChecked1320393562;
    private androidx.databinding.InverseBindingListener mOldEventChecked820582319;
    private androidx.databinding.InverseBindingListener mOldEventChecked1495962634;
    private androidx.databinding.InverseBindingListener mOldEventChecked721155660;
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView311checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.vfs.getValue()
            //         is viewModel.vfs.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView311.getChecked();
            // localize variables for thread safety
            // viewModel.vfs
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelVfs = null;
            // viewModel.vfs != null
            boolean viewModelVfsJavaLangObjectNull = false;
            // viewModel.vfs.getValue()
            java.lang.Boolean viewModelVfsGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.AdvancedSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelVfs = viewModel.getVfs();

                viewModelVfsJavaLangObjectNull = (viewModelVfs) != (null);
                if (viewModelVfsJavaLangObjectNull) {




                    viewModelVfs.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView312checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.disableSecureFragment.getValue()
            //         is viewModel.disableSecureFragment.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView312.getChecked();
            // localize variables for thread safety
            // viewModel.disableSecureFragment.getValue()
            java.lang.Boolean viewModelDisableSecureFragmentGetValue = null;
            // viewModel.disableSecureFragment
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDisableSecureFragment = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.AdvancedSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.disableSecureFragment != null
            boolean viewModelDisableSecureFragmentJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDisableSecureFragment = viewModel.getDisableSecureFragment();

                viewModelDisableSecureFragmentJavaLangObjectNull = (viewModelDisableSecureFragment) != (null);
                if (viewModelDisableSecureFragmentJavaLangObjectNull) {




                    viewModelDisableSecureFragment.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView35checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.backgroundMode.getValue()
            //         is viewModel.backgroundMode.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView35.getChecked();
            // localize variables for thread safety
            // viewModel.backgroundMode
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelBackgroundMode = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.AdvancedSettingsViewModel viewModel = mViewModel;
            // viewModel.backgroundMode != null
            boolean viewModelBackgroundModeJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.backgroundMode.getValue()
            java.lang.Boolean viewModelBackgroundModeGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelBackgroundMode = viewModel.getBackgroundMode();

                viewModelBackgroundModeJavaLangObjectNull = (viewModelBackgroundMode) != (null);
                if (viewModelBackgroundModeJavaLangObjectNull) {




                    viewModelBackgroundMode.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView36checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.autoStart.getValue()
            //         is viewModel.autoStart.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView36.getChecked();
            // localize variables for thread safety
            // viewModel.autoStart
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAutoStart = null;
            // viewModel.autoStart != null
            boolean viewModelAutoStartJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.AdvancedSettingsViewModel viewModel = mViewModel;
            // viewModel.autoStart.getValue()
            java.lang.Boolean viewModelAutoStartGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAutoStart = viewModel.getAutoStart();

                viewModelAutoStartJavaLangObjectNull = (viewModelAutoStart) != (null);
                if (viewModelAutoStartJavaLangObjectNull) {




                    viewModelAutoStart.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView38checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.animations.getValue()
            //         is viewModel.animations.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView38.getChecked();
            // localize variables for thread safety
            // viewModel.animations.getValue()
            java.lang.Boolean viewModelAnimationsGetValue = null;
            // viewModel.animations
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAnimations = null;
            // viewModel.animations != null
            boolean viewModelAnimationsJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.AdvancedSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAnimations = viewModel.getAnimations();

                viewModelAnimationsJavaLangObjectNull = (viewModelAnimations) != (null);
                if (viewModelAnimationsJavaLangObjectNull) {




                    viewModelAnimations.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public SettingsAdvancedFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 21, sIncludes, sViewsWithIds));
    }
    private SettingsAdvancedFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 16
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[20]
            );
        this.back.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[19];
        setContainedBinding(this.mboundView01);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[4];
        setContainedBinding(this.mboundView31);
        this.mboundView310 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[13];
        setContainedBinding(this.mboundView310);
        this.mboundView311 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[14];
        setContainedBinding(this.mboundView311);
        this.mboundView312 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[15];
        setContainedBinding(this.mboundView312);
        this.mboundView313 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[16];
        setContainedBinding(this.mboundView313);
        this.mboundView314 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[17];
        setContainedBinding(this.mboundView314);
        this.mboundView315 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[18];
        setContainedBinding(this.mboundView315);
        this.mboundView32 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[5];
        setContainedBinding(this.mboundView32);
        this.mboundView33 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[6];
        setContainedBinding(this.mboundView33);
        this.mboundView34 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[7];
        setContainedBinding(this.mboundView34);
        this.mboundView35 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[8];
        setContainedBinding(this.mboundView35);
        this.mboundView36 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[9];
        setContainedBinding(this.mboundView36);
        this.mboundView37 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[10];
        setContainedBinding(this.mboundView37);
        this.mboundView38 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[11];
        setContainedBinding(this.mboundView38);
        this.mboundView39 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[12];
        setContainedBinding(this.mboundView39);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40000L;
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
        mboundView313.invalidateAll();
        mboundView314.invalidateAll();
        mboundView315.invalidateAll();
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
        if (mboundView313.hasPendingBindings()) {
            return true;
        }
        if (mboundView314.hasPendingBindings()) {
            return true;
        }
        if (mboundView315.hasPendingBindings()) {
            return true;
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
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.settings.viewmodels.AdvancedSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.AdvancedSettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
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
        mboundView313.setLifecycleOwner(lifecycleOwner);
        mboundView314.setLifecycleOwner(lifecycleOwner);
        mboundView315.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDisableSecureFragment((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelDarkModeIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeViewModelLogsServerUrl((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelAnimations((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelDeviceName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelBackgroundMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelDebugMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelVfs((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelDarkModeLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 9 :
                return onChangeViewModelAutoStart((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeViewModelBatterySettingsVisibility((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelBackgroundModeEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeViewModelPowerManagerSettingsVisibility((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeViewModelRemoteProvisioningUrl((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 15 :
                return onChangeViewModelUploadInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDisableSecureFragment(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDisableSecureFragment, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDarkModeIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelDarkModeIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLogsServerUrl(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLogsServerUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAnimations(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAnimations, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDeviceName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDeviceName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBackgroundMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelBackgroundMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDebugMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDebugMode, int fieldId) {
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
    private boolean onChangeViewModelDarkModeLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelDarkModeLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAutoStart(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAutoStart, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBatterySettingsVisibility(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelBatterySettingsVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBackgroundModeEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelBackgroundModeEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPowerManagerSettingsVisibility(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelPowerManagerSettingsVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRemoteProvisioningUrl(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelRemoteProvisioningUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUploadInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelUploadInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDisableSecureFragment = null;
        java.lang.Boolean viewModelVfsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelPowerManagerSettingsVisibilityGetValue = false;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelGoToPowerManagerSettingsListener = null;
        java.lang.Boolean viewModelDebugModeGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelVfsListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelDarkModeIndex = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLogsServerUrl = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAnimations = null;
        int viewModelPowerManagerSettingsVisibilityViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelAutoStartGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelBatterySettingsVisibilityGetValue = false;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDeviceName = null;
        java.lang.Boolean viewModelUploadInProgressGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelBackgroundMode = null;
        java.lang.String viewModelRemoteProvisioningUrlGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDebugMode = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelResetDebugLogsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelDisableSecureFragmentListener = null;
        java.lang.Boolean viewModelBatterySettingsVisibilityGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelVfs = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelDarkModeLabels = null;
        java.lang.Boolean viewModelDisableSecureFragmentGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAutoStart = null;
        java.lang.Boolean viewModelBackgroundModeEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelBatterySettingsVisibility = null;
        java.lang.Boolean viewModelAnimationsGetValue = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.settings.SettingListenerStub viewModelBackgroundModeListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelRemoteProvisioningUrlListener = null;
        int viewModelBatterySettingsVisibilityViewVISIBLEViewGONE = 0;
        java.lang.String viewModelLogsServerUrlGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAnimationsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelDeviceNameListener = null;
        java.lang.Integer viewModelDarkModeIndexGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAutoStartListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelGoToAndroidSettingsListener = null;
        java.util.ArrayList<java.lang.String> viewModelDarkModeLabelsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelBackgroundModeEnabled = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelPowerManagerSettingsVisibility = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelVfsGetValue = false;
        org.linphone.activities.main.settings.SettingListenerStub viewModelGoToBatterySettingsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLogsServerUrlListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        org.linphone.activities.main.settings.SettingListenerStub viewModelSendDebugLogsListener = null;
        java.lang.Boolean viewModelPowerManagerSettingsVisibilityGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelDebugModeListener = null;
        java.lang.String viewModelDeviceNameGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelDarkModeListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelRemoteProvisioningUrl = null;
        org.linphone.activities.main.settings.viewmodels.AdvancedSettingsViewModel viewModel = mViewModel;
        boolean ViewModelVfs1 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelUploadInProgress = null;
        java.lang.Boolean viewModelBackgroundModeGetValue = null;

        if ((dirtyFlags & 0x52000L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(13, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x52000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x400000L;
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                        dirtyFlags |= 0x800000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6dfffL) != 0) {


            if ((dirtyFlags & 0x60001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.disableSecureFragment
                        viewModelDisableSecureFragment = viewModel.getDisableSecureFragment();
                    }
                    updateLiveDataRegistration(0, viewModelDisableSecureFragment);


                    if (viewModelDisableSecureFragment != null) {
                        // read viewModel.disableSecureFragment.getValue()
                        viewModelDisableSecureFragmentGetValue = viewModelDisableSecureFragment.getValue();
                    }
            }
            if ((dirtyFlags & 0x60000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.goToPowerManagerSettingsListener
                        viewModelGoToPowerManagerSettingsListener = viewModel.getGoToPowerManagerSettingsListener();
                        // read viewModel.vfsListener
                        viewModelVfsListener = viewModel.getVfsListener();
                        // read viewModel.resetDebugLogsListener
                        viewModelResetDebugLogsListener = viewModel.getResetDebugLogsListener();
                        // read viewModel.disableSecureFragmentListener
                        viewModelDisableSecureFragmentListener = viewModel.getDisableSecureFragmentListener();
                        // read viewModel.backgroundModeListener
                        viewModelBackgroundModeListener = viewModel.getBackgroundModeListener();
                        // read viewModel.remoteProvisioningUrlListener
                        viewModelRemoteProvisioningUrlListener = viewModel.getRemoteProvisioningUrlListener();
                        // read viewModel.animationsListener
                        viewModelAnimationsListener = viewModel.getAnimationsListener();
                        // read viewModel.deviceNameListener
                        viewModelDeviceNameListener = viewModel.getDeviceNameListener();
                        // read viewModel.autoStartListener
                        viewModelAutoStartListener = viewModel.getAutoStartListener();
                        // read viewModel.goToAndroidSettingsListener
                        viewModelGoToAndroidSettingsListener = viewModel.getGoToAndroidSettingsListener();
                        // read viewModel.goToBatterySettingsListener
                        viewModelGoToBatterySettingsListener = viewModel.getGoToBatterySettingsListener();
                        // read viewModel.logsServerUrlListener
                        viewModelLogsServerUrlListener = viewModel.getLogsServerUrlListener();
                        // read viewModel.sendDebugLogsListener
                        viewModelSendDebugLogsListener = viewModel.getSendDebugLogsListener();
                        // read viewModel.debugModeListener
                        viewModelDebugModeListener = viewModel.getDebugModeListener();
                        // read viewModel.darkModeListener
                        viewModelDarkModeListener = viewModel.getDarkModeListener();
                    }
            }
            if ((dirtyFlags & 0x60002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.darkModeIndex
                        viewModelDarkModeIndex = viewModel.getDarkModeIndex();
                    }
                    updateLiveDataRegistration(1, viewModelDarkModeIndex);


                    if (viewModelDarkModeIndex != null) {
                        // read viewModel.darkModeIndex.getValue()
                        viewModelDarkModeIndexGetValue = viewModelDarkModeIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x60004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.logsServerUrl
                        viewModelLogsServerUrl = viewModel.getLogsServerUrl();
                    }
                    updateLiveDataRegistration(2, viewModelLogsServerUrl);


                    if (viewModelLogsServerUrl != null) {
                        // read viewModel.logsServerUrl.getValue()
                        viewModelLogsServerUrlGetValue = viewModelLogsServerUrl.getValue();
                    }
            }
            if ((dirtyFlags & 0x60008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.animations
                        viewModelAnimations = viewModel.getAnimations();
                    }
                    updateLiveDataRegistration(3, viewModelAnimations);


                    if (viewModelAnimations != null) {
                        // read viewModel.animations.getValue()
                        viewModelAnimationsGetValue = viewModelAnimations.getValue();
                    }
            }
            if ((dirtyFlags & 0x60010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.deviceName
                        viewModelDeviceName = viewModel.getDeviceName();
                    }
                    updateLiveDataRegistration(4, viewModelDeviceName);


                    if (viewModelDeviceName != null) {
                        // read viewModel.deviceName.getValue()
                        viewModelDeviceNameGetValue = viewModelDeviceName.getValue();
                    }
            }
            if ((dirtyFlags & 0x60020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.backgroundMode
                        viewModelBackgroundMode = viewModel.getBackgroundMode();
                    }
                    updateLiveDataRegistration(5, viewModelBackgroundMode);


                    if (viewModelBackgroundMode != null) {
                        // read viewModel.backgroundMode.getValue()
                        viewModelBackgroundModeGetValue = viewModelBackgroundMode.getValue();
                    }
            }
            if ((dirtyFlags & 0x60040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.debugMode
                        viewModelDebugMode = viewModel.getDebugMode();
                    }
                    updateLiveDataRegistration(6, viewModelDebugMode);


                    if (viewModelDebugMode != null) {
                        // read viewModel.debugMode.getValue()
                        viewModelDebugModeGetValue = viewModelDebugMode.getValue();
                    }
            }
            if ((dirtyFlags & 0x60080L) != 0) {

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
            if ((dirtyFlags & 0x60100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.darkModeLabels
                        viewModelDarkModeLabels = viewModel.getDarkModeLabels();
                    }
                    updateLiveDataRegistration(8, viewModelDarkModeLabels);


                    if (viewModelDarkModeLabels != null) {
                        // read viewModel.darkModeLabels.getValue()
                        viewModelDarkModeLabelsGetValue = viewModelDarkModeLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x60200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.autoStart
                        viewModelAutoStart = viewModel.getAutoStart();
                    }
                    updateLiveDataRegistration(9, viewModelAutoStart);


                    if (viewModelAutoStart != null) {
                        // read viewModel.autoStart.getValue()
                        viewModelAutoStartGetValue = viewModelAutoStart.getValue();
                    }
            }
            if ((dirtyFlags & 0x60400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.batterySettingsVisibility
                        viewModelBatterySettingsVisibility = viewModel.getBatterySettingsVisibility();
                    }
                    updateLiveDataRegistration(10, viewModelBatterySettingsVisibility);


                    if (viewModelBatterySettingsVisibility != null) {
                        // read viewModel.batterySettingsVisibility.getValue()
                        viewModelBatterySettingsVisibilityGetValue = viewModelBatterySettingsVisibility.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.batterySettingsVisibility.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelBatterySettingsVisibilityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelBatterySettingsVisibilityGetValue);
                if((dirtyFlags & 0x60400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelBatterySettingsVisibilityGetValue) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.batterySettingsVisibility.getValue()) ? View.VISIBLE : View.GONE
                    viewModelBatterySettingsVisibilityViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelBatterySettingsVisibilityGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x60800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.backgroundModeEnabled
                        viewModelBackgroundModeEnabled = viewModel.getBackgroundModeEnabled();
                    }
                    updateLiveDataRegistration(11, viewModelBackgroundModeEnabled);


                    if (viewModelBackgroundModeEnabled != null) {
                        // read viewModel.backgroundModeEnabled.getValue()
                        viewModelBackgroundModeEnabledGetValue = viewModelBackgroundModeEnabled.getValue();
                    }
            }
            if ((dirtyFlags & 0x61000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.powerManagerSettingsVisibility
                        viewModelPowerManagerSettingsVisibility = viewModel.getPowerManagerSettingsVisibility();
                    }
                    updateLiveDataRegistration(12, viewModelPowerManagerSettingsVisibility);


                    if (viewModelPowerManagerSettingsVisibility != null) {
                        // read viewModel.powerManagerSettingsVisibility.getValue()
                        viewModelPowerManagerSettingsVisibilityGetValue = viewModelPowerManagerSettingsVisibility.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.powerManagerSettingsVisibility.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelPowerManagerSettingsVisibilityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelPowerManagerSettingsVisibilityGetValue);
                if((dirtyFlags & 0x61000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelPowerManagerSettingsVisibilityGetValue) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.powerManagerSettingsVisibility.getValue()) ? View.VISIBLE : View.GONE
                    viewModelPowerManagerSettingsVisibilityViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelPowerManagerSettingsVisibilityGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.remoteProvisioningUrl
                        viewModelRemoteProvisioningUrl = viewModel.getRemoteProvisioningUrl();
                    }
                    updateLiveDataRegistration(14, viewModelRemoteProvisioningUrl);


                    if (viewModelRemoteProvisioningUrl != null) {
                        // read viewModel.remoteProvisioningUrl.getValue()
                        viewModelRemoteProvisioningUrlGetValue = viewModelRemoteProvisioningUrl.getValue();
                    }
            }
            if ((dirtyFlags & 0x68000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.uploadInProgress
                        viewModelUploadInProgress = viewModel.getUploadInProgress();
                    }
                    updateLiveDataRegistration(15, viewModelUploadInProgress);


                    if (viewModelUploadInProgress != null) {
                        // read viewModel.uploadInProgress.getValue()
                        viewModelUploadInProgressGetValue = viewModelUploadInProgress.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x52000L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x68000L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelUploadInProgressGetValue);
        }
        if ((dirtyFlags & 0x60000L) != 0) {
            // api target 1

            this.mboundView31.setListener(viewModelDebugModeListener);
            this.mboundView310.setListener(viewModelRemoteProvisioningUrlListener);
            this.mboundView311.setListener(viewModelVfsListener);
            this.mboundView312.setListener(viewModelDisableSecureFragmentListener);
            this.mboundView313.setListener(viewModelGoToBatterySettingsListener);
            this.mboundView314.setListener(viewModelGoToPowerManagerSettingsListener);
            this.mboundView315.setListener(viewModelGoToAndroidSettingsListener);
            this.mboundView32.setListener(viewModelLogsServerUrlListener);
            this.mboundView33.setListener(viewModelSendDebugLogsListener);
            this.mboundView34.setListener(viewModelResetDebugLogsListener);
            this.mboundView35.setListener(viewModelBackgroundModeListener);
            this.mboundView36.setListener(viewModelAutoStartListener);
            this.mboundView37.setListener(viewModelDarkModeListener);
            this.mboundView38.setListener(viewModelAnimationsListener);
            this.mboundView39.setListener(viewModelDeviceNameListener);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            this.mboundView31.setTitle(getRoot().getResources().getString(R.string.advanced_settings_debug_mode_title));
            this.mboundView310.setTitle(getRoot().getResources().getString(R.string.advanced_settings_remote_provisioning_url_title));
            this.mboundView310.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_URI);
            this.mboundView311.setTitle(getRoot().getResources().getString(R.string.advanced_settings_vfs_title));
            this.mboundView311.setSubtitle(getRoot().getResources().getString(R.string.advanced_settings_vfs_summary));
            setBindingInverseListener(this.mboundView311, this.mOldEventChecked2087004857, mboundView311checked);
            this.mboundView312.setTitle(getRoot().getResources().getString(R.string.advanced_settings_disable_fragment_security_title));
            this.mboundView312.setSubtitle(getRoot().getResources().getString(R.string.advanced_settings_disable_fragment_security_summary));
            setBindingInverseListener(this.mboundView312, this.mOldEventChecked1320393562, mboundView312checked);
            this.mboundView313.setTitle(getRoot().getResources().getString(R.string.advanced_settings_go_to_battery_optimization_settings));
            this.mboundView314.setTitle(getRoot().getResources().getString(R.string.advanced_settings_go_to_power_manager_settings));
            this.mboundView315.setTitle(getRoot().getResources().getString(R.string.advanced_settings_go_to_android_app_settings));
            this.mboundView32.setTitle(getRoot().getResources().getString(R.string.advanced_settings_logs_server_url_title));
            this.mboundView32.setSubtitle(getRoot().getResources().getString(R.string.advanced_settings_logs_server_url_summary));
            this.mboundView32.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_URI);
            this.mboundView33.setTitle(getRoot().getResources().getString(R.string.advanced_settings_send_debug_logs_title));
            this.mboundView34.setTitle(getRoot().getResources().getString(R.string.advanced_settings_reset_debug_logs_title));
            this.mboundView35.setTitle(getRoot().getResources().getString(R.string.advanced_settings_background_mode_title));
            this.mboundView35.setSubtitle(getRoot().getResources().getString(R.string.advanced_settings_background_mode_summary));
            setBindingInverseListener(this.mboundView35, this.mOldEventChecked820582319, mboundView35checked);
            this.mboundView36.setTitle(getRoot().getResources().getString(R.string.advanced_settings_auto_start_title));
            setBindingInverseListener(this.mboundView36, this.mOldEventChecked1495962634, mboundView36checked);
            this.mboundView37.setTitle(getRoot().getResources().getString(R.string.advanced_settings_dark_mode_title));
            this.mboundView38.setTitle(getRoot().getResources().getString(R.string.advanced_settings_animations_title));
            setBindingInverseListener(this.mboundView38, this.mOldEventChecked721155660, mboundView38checked);
            this.mboundView39.setTitle(getRoot().getResources().getString(R.string.advanced_settings_device_name_title));
            this.mboundView39.setSubtitle(getRoot().getResources().getString(R.string.advanced_settings_device_name_summary));
        }
        if ((dirtyFlags & 0x64000L) != 0) {
            // api target 1

            this.mboundView310.setDefaultValue(viewModelRemoteProvisioningUrlGetValue);
        }
        if ((dirtyFlags & 0x60080L) != 0) {
            // api target 1

            this.mboundView311.setChecked(viewModelVfsGetValue);
            this.mboundView311.setEnabled(ViewModelVfs1);
        }
        if ((dirtyFlags & 0x60001L) != 0) {
            // api target 1

            this.mboundView312.setChecked(viewModelDisableSecureFragmentGetValue);
        }
        if ((dirtyFlags & 0x60400L) != 0) {
            // api target 1

            this.mboundView313.getRoot().setVisibility(viewModelBatterySettingsVisibilityViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x61000L) != 0) {
            // api target 1

            this.mboundView314.getRoot().setVisibility(viewModelPowerManagerSettingsVisibilityViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x60004L) != 0) {
            // api target 1

            this.mboundView32.setDefaultValue(viewModelLogsServerUrlGetValue);
        }
        if ((dirtyFlags & 0x60040L) != 0) {
            // api target 1

            this.mboundView32.setEnabled(viewModelDebugModeGetValue);
            this.mboundView33.setEnabled(viewModelDebugModeGetValue);
            this.mboundView34.setEnabled(viewModelDebugModeGetValue);
        }
        if ((dirtyFlags & 0x60800L) != 0) {
            // api target 1

            this.mboundView35.setEnabled(viewModelBackgroundModeEnabledGetValue);
        }
        if ((dirtyFlags & 0x60020L) != 0) {
            // api target 1

            this.mboundView35.setChecked(viewModelBackgroundModeGetValue);
        }
        if ((dirtyFlags & 0x60200L) != 0) {
            // api target 1

            this.mboundView36.setChecked(viewModelAutoStartGetValue);
        }
        if ((dirtyFlags & 0x60002L) != 0) {
            // api target 1

            this.mboundView37.setSelectedIndex(viewModelDarkModeIndexGetValue);
        }
        if ((dirtyFlags & 0x60100L) != 0) {
            // api target 1

            this.mboundView37.setLabels(viewModelDarkModeLabelsGetValue);
        }
        if ((dirtyFlags & 0x60008L) != 0) {
            // api target 1

            this.mboundView38.setChecked(viewModelAnimationsGetValue);
        }
        if ((dirtyFlags & 0x60010L) != 0) {
            // api target 1

            this.mboundView39.setDefaultValue(viewModelDeviceNameGetValue);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            this.mOldEventChecked2087004857 = mboundView311checked;
            this.mOldEventChecked1320393562 = mboundView312checked;
            this.mOldEventChecked820582319 = mboundView35checked;
            this.mOldEventChecked1495962634 = mboundView36checked;
            this.mOldEventChecked721155660 = mboundView38checked;
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
        executeBindingsOn(mboundView313);
        executeBindingsOn(mboundView314);
        executeBindingsOn(mboundView315);
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.disableSecureFragment
        flag 1 (0x2L): viewModel.darkModeIndex
        flag 2 (0x3L): viewModel.logsServerUrl
        flag 3 (0x4L): viewModel.animations
        flag 4 (0x5L): viewModel.deviceName
        flag 5 (0x6L): viewModel.backgroundMode
        flag 6 (0x7L): viewModel.debugMode
        flag 7 (0x8L): viewModel.vfs
        flag 8 (0x9L): viewModel.darkModeLabels
        flag 9 (0xaL): viewModel.autoStart
        flag 10 (0xbL): viewModel.batterySettingsVisibility
        flag 11 (0xcL): viewModel.backgroundModeEnabled
        flag 12 (0xdL): viewModel.powerManagerSettingsVisibility
        flag 13 (0xeL): sharedMainViewModel.isSlidingPaneSlideable
        flag 14 (0xfL): viewModel.remoteProvisioningUrl
        flag 15 (0x10L): viewModel.uploadInProgress
        flag 16 (0x11L): sharedMainViewModel
        flag 17 (0x12L): viewModel
        flag 18 (0x13L): null
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.powerManagerSettingsVisibility.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.powerManagerSettingsVisibility.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.batterySettingsVisibility.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.batterySettingsVisibility.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}