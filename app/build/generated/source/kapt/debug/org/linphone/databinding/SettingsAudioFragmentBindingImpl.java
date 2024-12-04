package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsAudioFragmentBindingImpl extends SettingsAudioFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(3, 
            new String[] {"settings_widget_switch", "settings_widget_basic", "settings_widget_basic", "settings_widget_switch", "settings_widget_list", "settings_widget_list", "settings_widget_switch", "settings_widget_list", "settings_widget_text", "settings_widget_text"},
            new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13, 14},
            new int[] {org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 15);
        sViewsWithIds.put(R.id.pref_video_codecs_header, 16);
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
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView310;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView32;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView33;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView34;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView35;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView36;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView37;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView38;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView39;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    // values
    private androidx.databinding.InverseBindingListener mOldEventChecked1848472246;
    private androidx.databinding.InverseBindingListener mOldEventChecked1018994321;
    private androidx.databinding.InverseBindingListener mOldEventChecked1491324005;
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView31checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.softwareEchoCanceller.getValue()
            //         is viewModel.softwareEchoCanceller.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView31.getChecked();
            // localize variables for thread safety
            // viewModel.softwareEchoCanceller.getValue()
            java.lang.Boolean viewModelSoftwareEchoCancellerGetValue = null;
            // viewModel.softwareEchoCanceller != null
            boolean viewModelSoftwareEchoCancellerJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.AudioSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.softwareEchoCanceller
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSoftwareEchoCanceller = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSoftwareEchoCanceller = viewModel.getSoftwareEchoCanceller();

                viewModelSoftwareEchoCancellerJavaLangObjectNull = (viewModelSoftwareEchoCanceller) != (null);
                if (viewModelSoftwareEchoCancellerJavaLangObjectNull) {




                    viewModelSoftwareEchoCanceller.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView34checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.adaptiveRateControl.getValue()
            //         is viewModel.adaptiveRateControl.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView34.getChecked();
            // localize variables for thread safety
            // viewModel.adaptiveRateControl
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAdaptiveRateControl = null;
            // viewModel.adaptiveRateControl != null
            boolean viewModelAdaptiveRateControlJavaLangObjectNull = false;
            // viewModel.adaptiveRateControl.getValue()
            java.lang.Boolean viewModelAdaptiveRateControlGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.AudioSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAdaptiveRateControl = viewModel.getAdaptiveRateControl();

                viewModelAdaptiveRateControlJavaLangObjectNull = (viewModelAdaptiveRateControl) != (null);
                if (viewModelAdaptiveRateControlJavaLangObjectNull) {




                    viewModelAdaptiveRateControl.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView37checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.preferBluetoothDevices.getValue()
            //         is viewModel.preferBluetoothDevices.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView37.getChecked();
            // localize variables for thread safety
            // viewModel.preferBluetoothDevices.getValue()
            java.lang.Boolean viewModelPreferBluetoothDevicesGetValue = null;
            // viewModel.preferBluetoothDevices != null
            boolean viewModelPreferBluetoothDevicesJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.AudioSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.preferBluetoothDevices
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelPreferBluetoothDevices = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPreferBluetoothDevices = viewModel.getPreferBluetoothDevices();

                viewModelPreferBluetoothDevicesJavaLangObjectNull = (viewModelPreferBluetoothDevices) != (null);
                if (viewModelPreferBluetoothDevicesJavaLangObjectNull) {




                    viewModelPreferBluetoothDevices.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public SettingsAudioFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private SettingsAudioFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 16
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[16]
            , (android.widget.LinearLayout) bindings[15]
            );
        this.back.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[5];
        setContainedBinding(this.mboundView31);
        this.mboundView310 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[14];
        setContainedBinding(this.mboundView310);
        this.mboundView32 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[6];
        setContainedBinding(this.mboundView32);
        this.mboundView33 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[7];
        setContainedBinding(this.mboundView33);
        this.mboundView34 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[8];
        setContainedBinding(this.mboundView34);
        this.mboundView35 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[9];
        setContainedBinding(this.mboundView35);
        this.mboundView36 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[10];
        setContainedBinding(this.mboundView36);
        this.mboundView37 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[11];
        setContainedBinding(this.mboundView37);
        this.mboundView38 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[12];
        setContainedBinding(this.mboundView38);
        this.mboundView39 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[13];
        setContainedBinding(this.mboundView39);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sharedMainViewModel == variableId) {
            setSharedMainViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.settings.viewmodels.AudioSettingsViewModel) variable);
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
    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.AudioSettingsViewModel ViewModel) {
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
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCodecBitrateIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelEchoTesterStatus((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelCodecBitrateLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 3 :
                return onChangeViewModelAdaptiveRateControl((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelInputAudioDeviceLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 5 :
                return onChangeViewModelMicrophoneGain((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 6 :
                return onChangeViewModelPreferBluetoothDevices((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelOutputAudioDeviceIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 8 :
                return onChangeViewModelOutputAudioDeviceLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 9 :
                return onChangeViewModelSoftwareEchoCanceller((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeViewModelSoftwareEchoCalibration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeViewModelInputAudioDeviceIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 12 :
                return onChangeViewModelAudioCodecs((androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>>) object, fieldId);
            case 13 :
                return onChangeViewModelShowEchoTester((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeViewModelPlaybackGain((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 15 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCodecBitrateIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelCodecBitrateIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEchoTesterStatus(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEchoTesterStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCodecBitrateLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelCodecBitrateLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAdaptiveRateControl(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAdaptiveRateControl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelInputAudioDeviceLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelInputAudioDeviceLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMicrophoneGain(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelMicrophoneGain, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPreferBluetoothDevices(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelPreferBluetoothDevices, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOutputAudioDeviceIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelOutputAudioDeviceIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOutputAudioDeviceLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelOutputAudioDeviceLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSoftwareEchoCanceller(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelSoftwareEchoCanceller, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSoftwareEchoCalibration(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSoftwareEchoCalibration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelInputAudioDeviceIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelInputAudioDeviceIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAudioCodecs(androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>> ViewModelAudioCodecs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowEchoTester(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowEchoTester, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPlaybackGain(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelPlaybackGain, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
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
        org.linphone.activities.main.settings.SettingListenerStub viewModelMicrophoneGainListener = null;
        java.lang.String viewModelEchoTesterStatusGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelCodecBitrateListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowEchoTesterGetValue = false;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        int viewModelShowEchoTesterViewVISIBLEViewGONE = 0;
        java.util.ArrayList<java.lang.String> viewModelInputAudioDeviceLabelsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelCodecBitrateIndex = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelPlaybackGainListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelPreferBluetoothDevicesListener = null;
        java.lang.Boolean viewModelShowEchoTesterGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEchoTesterStatus = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelCodecBitrateLabels = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelOutputAudioDeviceListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAdaptiveRateControl = null;
        java.lang.Integer viewModelCodecBitrateIndexGetValue = null;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        org.linphone.activities.main.settings.SettingListenerStub viewModelEchoTesterListener = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelInputAudioDeviceLabels = null;
        java.util.ArrayList<java.lang.String> viewModelOutputAudioDeviceLabelsGetValue = null;
        java.lang.Integer viewModelInputAudioDeviceIndexGetValue = null;
        java.util.ArrayList<androidx.databinding.ViewDataBinding> viewModelAudioCodecsGetValue = null;
        java.lang.Float viewModelPlaybackGainGetValue = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelMicrophoneGain = null;
        java.lang.Boolean viewModelAdaptiveRateControlGetValue = null;
        java.lang.String viewModelPlaybackGainToString = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelPreferBluetoothDevices = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelOutputAudioDeviceIndex = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelOutputAudioDeviceLabels = null;
        java.lang.String viewModelMicrophoneGainToString = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAdaptiveRateControlListener = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelSoftwareEchoCanceller = null;
        java.lang.Integer viewModelOutputAudioDeviceIndexGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSoftwareEchoCalibration = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelSoftwareEchoCancellerCalibrationListener = null;
        java.lang.String viewModelSoftwareEchoCalibrationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelInputAudioDeviceIndex = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>> viewModelAudioCodecs = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowEchoTester = null;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelPlaybackGain = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelSoftwareEchoCancellerListener = null;
        java.lang.Boolean viewModelPreferBluetoothDevicesGetValue = null;
        java.lang.Boolean viewModelSoftwareEchoCancellerGetValue = null;
        java.util.ArrayList<java.lang.String> viewModelCodecBitrateLabelsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelInputAudioDeviceListener = null;
        org.linphone.activities.main.settings.viewmodels.AudioSettingsViewModel viewModel = mViewModel;
        java.lang.Float viewModelMicrophoneGainGetValue = null;

        if ((dirtyFlags & 0x58000L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(15, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x58000L) != 0) {
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
        if ((dirtyFlags & 0x67fffL) != 0) {


            if ((dirtyFlags & 0x60000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.microphoneGainListener
                        viewModelMicrophoneGainListener = viewModel.getMicrophoneGainListener();
                        // read viewModel.codecBitrateListener
                        viewModelCodecBitrateListener = viewModel.getCodecBitrateListener();
                        // read viewModel.playbackGainListener
                        viewModelPlaybackGainListener = viewModel.getPlaybackGainListener();
                        // read viewModel.preferBluetoothDevicesListener
                        viewModelPreferBluetoothDevicesListener = viewModel.getPreferBluetoothDevicesListener();
                        // read viewModel.outputAudioDeviceListener
                        viewModelOutputAudioDeviceListener = viewModel.getOutputAudioDeviceListener();
                        // read viewModel.echoTesterListener
                        viewModelEchoTesterListener = viewModel.getEchoTesterListener();
                        // read viewModel.adaptiveRateControlListener
                        viewModelAdaptiveRateControlListener = viewModel.getAdaptiveRateControlListener();
                        // read viewModel.softwareEchoCancellerCalibrationListener
                        viewModelSoftwareEchoCancellerCalibrationListener = viewModel.getSoftwareEchoCancellerCalibrationListener();
                        // read viewModel.softwareEchoCancellerListener
                        viewModelSoftwareEchoCancellerListener = viewModel.getSoftwareEchoCancellerListener();
                        // read viewModel.inputAudioDeviceListener
                        viewModelInputAudioDeviceListener = viewModel.getInputAudioDeviceListener();
                    }
            }
            if ((dirtyFlags & 0x60001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.codecBitrateIndex
                        viewModelCodecBitrateIndex = viewModel.getCodecBitrateIndex();
                    }
                    updateLiveDataRegistration(0, viewModelCodecBitrateIndex);


                    if (viewModelCodecBitrateIndex != null) {
                        // read viewModel.codecBitrateIndex.getValue()
                        viewModelCodecBitrateIndexGetValue = viewModelCodecBitrateIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x60002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.echoTesterStatus
                        viewModelEchoTesterStatus = viewModel.getEchoTesterStatus();
                    }
                    updateLiveDataRegistration(1, viewModelEchoTesterStatus);


                    if (viewModelEchoTesterStatus != null) {
                        // read viewModel.echoTesterStatus.getValue()
                        viewModelEchoTesterStatusGetValue = viewModelEchoTesterStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0x60004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.codecBitrateLabels
                        viewModelCodecBitrateLabels = viewModel.getCodecBitrateLabels();
                    }
                    updateLiveDataRegistration(2, viewModelCodecBitrateLabels);


                    if (viewModelCodecBitrateLabels != null) {
                        // read viewModel.codecBitrateLabels.getValue()
                        viewModelCodecBitrateLabelsGetValue = viewModelCodecBitrateLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x60008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.adaptiveRateControl
                        viewModelAdaptiveRateControl = viewModel.getAdaptiveRateControl();
                    }
                    updateLiveDataRegistration(3, viewModelAdaptiveRateControl);


                    if (viewModelAdaptiveRateControl != null) {
                        // read viewModel.adaptiveRateControl.getValue()
                        viewModelAdaptiveRateControlGetValue = viewModelAdaptiveRateControl.getValue();
                    }
            }
            if ((dirtyFlags & 0x60010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.inputAudioDeviceLabels
                        viewModelInputAudioDeviceLabels = viewModel.getInputAudioDeviceLabels();
                    }
                    updateLiveDataRegistration(4, viewModelInputAudioDeviceLabels);


                    if (viewModelInputAudioDeviceLabels != null) {
                        // read viewModel.inputAudioDeviceLabels.getValue()
                        viewModelInputAudioDeviceLabelsGetValue = viewModelInputAudioDeviceLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x60020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.microphoneGain
                        viewModelMicrophoneGain = viewModel.getMicrophoneGain();
                    }
                    updateLiveDataRegistration(5, viewModelMicrophoneGain);


                    if (viewModelMicrophoneGain != null) {
                        // read viewModel.microphoneGain.getValue()
                        viewModelMicrophoneGainGetValue = viewModelMicrophoneGain.getValue();
                    }


                    if (viewModelMicrophoneGainGetValue != null) {
                        // read viewModel.microphoneGain.getValue().toString()
                        viewModelMicrophoneGainToString = viewModelMicrophoneGainGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x60040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.preferBluetoothDevices
                        viewModelPreferBluetoothDevices = viewModel.getPreferBluetoothDevices();
                    }
                    updateLiveDataRegistration(6, viewModelPreferBluetoothDevices);


                    if (viewModelPreferBluetoothDevices != null) {
                        // read viewModel.preferBluetoothDevices.getValue()
                        viewModelPreferBluetoothDevicesGetValue = viewModelPreferBluetoothDevices.getValue();
                    }
            }
            if ((dirtyFlags & 0x60080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.outputAudioDeviceIndex
                        viewModelOutputAudioDeviceIndex = viewModel.getOutputAudioDeviceIndex();
                    }
                    updateLiveDataRegistration(7, viewModelOutputAudioDeviceIndex);


                    if (viewModelOutputAudioDeviceIndex != null) {
                        // read viewModel.outputAudioDeviceIndex.getValue()
                        viewModelOutputAudioDeviceIndexGetValue = viewModelOutputAudioDeviceIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x60100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.outputAudioDeviceLabels
                        viewModelOutputAudioDeviceLabels = viewModel.getOutputAudioDeviceLabels();
                    }
                    updateLiveDataRegistration(8, viewModelOutputAudioDeviceLabels);


                    if (viewModelOutputAudioDeviceLabels != null) {
                        // read viewModel.outputAudioDeviceLabels.getValue()
                        viewModelOutputAudioDeviceLabelsGetValue = viewModelOutputAudioDeviceLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x60200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.softwareEchoCanceller
                        viewModelSoftwareEchoCanceller = viewModel.getSoftwareEchoCanceller();
                    }
                    updateLiveDataRegistration(9, viewModelSoftwareEchoCanceller);


                    if (viewModelSoftwareEchoCanceller != null) {
                        // read viewModel.softwareEchoCanceller.getValue()
                        viewModelSoftwareEchoCancellerGetValue = viewModelSoftwareEchoCanceller.getValue();
                    }
            }
            if ((dirtyFlags & 0x60400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.softwareEchoCalibration
                        viewModelSoftwareEchoCalibration = viewModel.getSoftwareEchoCalibration();
                    }
                    updateLiveDataRegistration(10, viewModelSoftwareEchoCalibration);


                    if (viewModelSoftwareEchoCalibration != null) {
                        // read viewModel.softwareEchoCalibration.getValue()
                        viewModelSoftwareEchoCalibrationGetValue = viewModelSoftwareEchoCalibration.getValue();
                    }
            }
            if ((dirtyFlags & 0x60800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.inputAudioDeviceIndex
                        viewModelInputAudioDeviceIndex = viewModel.getInputAudioDeviceIndex();
                    }
                    updateLiveDataRegistration(11, viewModelInputAudioDeviceIndex);


                    if (viewModelInputAudioDeviceIndex != null) {
                        // read viewModel.inputAudioDeviceIndex.getValue()
                        viewModelInputAudioDeviceIndexGetValue = viewModelInputAudioDeviceIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x61000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.audioCodecs
                        viewModelAudioCodecs = viewModel.getAudioCodecs();
                    }
                    updateLiveDataRegistration(12, viewModelAudioCodecs);


                    if (viewModelAudioCodecs != null) {
                        // read viewModel.audioCodecs.getValue()
                        viewModelAudioCodecsGetValue = viewModelAudioCodecs.getValue();
                    }
            }
            if ((dirtyFlags & 0x62000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showEchoTester
                        viewModelShowEchoTester = viewModel.getShowEchoTester();
                    }
                    updateLiveDataRegistration(13, viewModelShowEchoTester);


                    if (viewModelShowEchoTester != null) {
                        // read viewModel.showEchoTester.getValue()
                        viewModelShowEchoTesterGetValue = viewModelShowEchoTester.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showEchoTester.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowEchoTesterGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowEchoTesterGetValue);
                if((dirtyFlags & 0x62000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowEchoTesterGetValue) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showEchoTester.getValue()) ? View.VISIBLE : View.GONE
                    viewModelShowEchoTesterViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowEchoTesterGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.playbackGain
                        viewModelPlaybackGain = viewModel.getPlaybackGain();
                    }
                    updateLiveDataRegistration(14, viewModelPlaybackGain);


                    if (viewModelPlaybackGain != null) {
                        // read viewModel.playbackGain.getValue()
                        viewModelPlaybackGainGetValue = viewModelPlaybackGain.getValue();
                    }


                    if (viewModelPlaybackGainGetValue != null) {
                        // read viewModel.playbackGain.getValue().toString()
                        viewModelPlaybackGainToString = viewModelPlaybackGainGetValue.toString();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x58000L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            this.mboundView31.setTitle(getRoot().getResources().getString(R.string.audio_settings_software_echo_cancellation_title));
            this.mboundView31.setSubtitle(getRoot().getResources().getString(R.string.audio_settings_echo_cancellation_summary));
            setBindingInverseListener(this.mboundView31, this.mOldEventChecked1848472246, mboundView31checked);
            this.mboundView310.setTitle(getRoot().getResources().getString(R.string.audio_settings_playback_gain_title));
            this.mboundView310.setSubtitle(getRoot().getResources().getString(R.string.audio_settings_playback_gain_summary));
            this.mboundView310.setInputType(((android.text.InputType.TYPE_CLASS_NUMBER) | (android.text.InputType.TYPE_NUMBER_FLAG_SIGNED)) | (android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL));
            this.mboundView32.setTitle(getRoot().getResources().getString(R.string.audio_settings_echo_canceller_calibration_title));
            this.mboundView33.setTitle(getRoot().getResources().getString(R.string.audio_settings_echo_tester_title));
            this.mboundView34.setTitle(getRoot().getResources().getString(R.string.audio_settings_adaptive_rate_control_title));
            setBindingInverseListener(this.mboundView34, this.mOldEventChecked1018994321, mboundView34checked);
            this.mboundView35.setTitle(getRoot().getResources().getString(R.string.audio_settings_input_device_title));
            this.mboundView35.setSubtitle(getRoot().getResources().getString(R.string.audio_settings_input_device_summary));
            this.mboundView36.setTitle(getRoot().getResources().getString(R.string.audio_settings_output_device_title));
            this.mboundView36.setSubtitle(getRoot().getResources().getString(R.string.audio_settings_output_device_summary));
            this.mboundView37.setTitle(getRoot().getResources().getString(R.string.audio_settings_prefer_bluetooth_devices_title));
            setBindingInverseListener(this.mboundView37, this.mOldEventChecked1491324005, mboundView37checked);
            this.mboundView38.setTitle(getRoot().getResources().getString(R.string.audio_settings_codec_bitrate_title));
            this.mboundView39.setTitle(getRoot().getResources().getString(R.string.audio_settings_microphone_gain_title));
            this.mboundView39.setSubtitle(getRoot().getResources().getString(R.string.audio_settings_microphone_gain_summary));
            this.mboundView39.setInputType(((android.text.InputType.TYPE_CLASS_NUMBER) | (android.text.InputType.TYPE_NUMBER_FLAG_SIGNED)) | (android.text.InputType.TYPE_NUMBER_FLAG_DECIMAL));
        }
        if ((dirtyFlags & 0x60000L) != 0) {
            // api target 1

            this.mboundView31.setListener(viewModelSoftwareEchoCancellerListener);
            this.mboundView310.setListener(viewModelPlaybackGainListener);
            this.mboundView32.setListener(viewModelSoftwareEchoCancellerCalibrationListener);
            this.mboundView33.setListener(viewModelEchoTesterListener);
            this.mboundView34.setListener(viewModelAdaptiveRateControlListener);
            this.mboundView35.setListener(viewModelInputAudioDeviceListener);
            this.mboundView36.setListener(viewModelOutputAudioDeviceListener);
            this.mboundView37.setListener(viewModelPreferBluetoothDevicesListener);
            this.mboundView38.setListener(viewModelCodecBitrateListener);
            this.mboundView39.setListener(viewModelMicrophoneGainListener);
        }
        if ((dirtyFlags & 0x60200L) != 0) {
            // api target 1

            this.mboundView31.setChecked(viewModelSoftwareEchoCancellerGetValue);
        }
        if ((dirtyFlags & 0x64000L) != 0) {
            // api target 1

            this.mboundView310.setDefaultValue(viewModelPlaybackGainToString);
        }
        if ((dirtyFlags & 0x60400L) != 0) {
            // api target 1

            this.mboundView32.setSubtitle(viewModelSoftwareEchoCalibrationGetValue);
        }
        if ((dirtyFlags & 0x62000L) != 0) {
            // api target 1

            this.mboundView33.getRoot().setVisibility(viewModelShowEchoTesterViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x60002L) != 0) {
            // api target 1

            this.mboundView33.setSubtitle(viewModelEchoTesterStatusGetValue);
        }
        if ((dirtyFlags & 0x60008L) != 0) {
            // api target 1

            this.mboundView34.setChecked(viewModelAdaptiveRateControlGetValue);
        }
        if ((dirtyFlags & 0x60800L) != 0) {
            // api target 1

            this.mboundView35.setSelectedIndex(viewModelInputAudioDeviceIndexGetValue);
        }
        if ((dirtyFlags & 0x60010L) != 0) {
            // api target 1

            this.mboundView35.setLabels(viewModelInputAudioDeviceLabelsGetValue);
        }
        if ((dirtyFlags & 0x60080L) != 0) {
            // api target 1

            this.mboundView36.setSelectedIndex(viewModelOutputAudioDeviceIndexGetValue);
        }
        if ((dirtyFlags & 0x60100L) != 0) {
            // api target 1

            this.mboundView36.setLabels(viewModelOutputAudioDeviceLabelsGetValue);
        }
        if ((dirtyFlags & 0x60040L) != 0) {
            // api target 1

            this.mboundView37.setChecked(viewModelPreferBluetoothDevicesGetValue);
        }
        if ((dirtyFlags & 0x60001L) != 0) {
            // api target 1

            this.mboundView38.setSelectedIndex(viewModelCodecBitrateIndexGetValue);
        }
        if ((dirtyFlags & 0x60004L) != 0) {
            // api target 1

            this.mboundView38.setLabels(viewModelCodecBitrateLabelsGetValue);
        }
        if ((dirtyFlags & 0x60020L) != 0) {
            // api target 1

            this.mboundView39.setDefaultValue(viewModelMicrophoneGainToString);
        }
        if ((dirtyFlags & 0x61000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView4, viewModelAudioCodecsGetValue);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            this.mOldEventChecked1848472246 = mboundView31checked;
            this.mOldEventChecked1018994321 = mboundView34checked;
            this.mOldEventChecked1491324005 = mboundView37checked;
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.codecBitrateIndex
        flag 1 (0x2L): viewModel.echoTesterStatus
        flag 2 (0x3L): viewModel.codecBitrateLabels
        flag 3 (0x4L): viewModel.adaptiveRateControl
        flag 4 (0x5L): viewModel.inputAudioDeviceLabels
        flag 5 (0x6L): viewModel.microphoneGain
        flag 6 (0x7L): viewModel.preferBluetoothDevices
        flag 7 (0x8L): viewModel.outputAudioDeviceIndex
        flag 8 (0x9L): viewModel.outputAudioDeviceLabels
        flag 9 (0xaL): viewModel.softwareEchoCanceller
        flag 10 (0xbL): viewModel.softwareEchoCalibration
        flag 11 (0xcL): viewModel.inputAudioDeviceIndex
        flag 12 (0xdL): viewModel.audioCodecs
        flag 13 (0xeL): viewModel.showEchoTester
        flag 14 (0xfL): viewModel.playbackGain
        flag 15 (0x10L): sharedMainViewModel.isSlidingPaneSlideable
        flag 16 (0x11L): sharedMainViewModel
        flag 17 (0x12L): viewModel
        flag 18 (0x13L): null
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showEchoTester.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showEchoTester.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}