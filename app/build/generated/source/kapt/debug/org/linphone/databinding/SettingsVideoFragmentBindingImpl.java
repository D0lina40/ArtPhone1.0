package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsVideoFragmentBindingImpl extends SettingsVideoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(3, 
            new String[] {"settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_list", "settings_widget_list", "settings_widget_list", "settings_widget_list", "settings_widget_text"},
            new int[] {5, 6, 7, 8, 9, 10, 11, 12, 13},
            new int[] {org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_text});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 14);
        sViewsWithIds.put(R.id.pref_video_codecs_header, 15);
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
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView35;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView36;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView37;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView38;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView39;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    // values
    private androidx.databinding.InverseBindingListener mOldEventChecked982275499;
    private androidx.databinding.InverseBindingListener mOldEventChecked1262865143;
    private androidx.databinding.InverseBindingListener mOldEventChecked2088609229;
    private androidx.databinding.InverseBindingListener mOldEventChecked978157691;
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView31checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.enableVideo.getValue()
            //         is viewModel.enableVideo.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView31.getChecked();
            // localize variables for thread safety
            // viewModel.enableVideo != null
            boolean viewModelEnableVideoJavaLangObjectNull = false;
            // viewModel.enableVideo.getValue()
            java.lang.Boolean viewModelEnableVideoGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.VideoSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.enableVideo
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelEnableVideo = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEnableVideo = viewModel.getEnableVideo();

                viewModelEnableVideoJavaLangObjectNull = (viewModelEnableVideo) != (null);
                if (viewModelEnableVideoJavaLangObjectNull) {




                    viewModelEnableVideo.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView32checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.tabletPreview.getValue()
            //         is viewModel.tabletPreview.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView32.getChecked();
            // localize variables for thread safety
            // viewModel.tabletPreview.getValue()
            java.lang.Boolean viewModelTabletPreviewGetValue = null;
            // viewModel.tabletPreview
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelTabletPreview = null;
            // viewModel.tabletPreview != null
            boolean viewModelTabletPreviewJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.VideoSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelTabletPreview = viewModel.getTabletPreview();

                viewModelTabletPreviewJavaLangObjectNull = (viewModelTabletPreview) != (null);
                if (viewModelTabletPreviewJavaLangObjectNull) {




                    viewModelTabletPreview.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView33checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.initiateCall.getValue()
            //         is viewModel.initiateCall.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView33.getChecked();
            // localize variables for thread safety
            // viewModel.initiateCall.getValue()
            java.lang.Boolean viewModelInitiateCallGetValue = null;
            // viewModel.initiateCall
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelInitiateCall = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.VideoSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.initiateCall != null
            boolean viewModelInitiateCallJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelInitiateCall = viewModel.getInitiateCall();

                viewModelInitiateCallJavaLangObjectNull = (viewModelInitiateCall) != (null);
                if (viewModelInitiateCallJavaLangObjectNull) {




                    viewModelInitiateCall.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView34checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.autoAccept.getValue()
            //         is viewModel.autoAccept.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView34.getChecked();
            // localize variables for thread safety
            // viewModel.autoAccept != null
            boolean viewModelAutoAcceptJavaLangObjectNull = false;
            // viewModel.autoAccept
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAutoAccept = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.VideoSettingsViewModel viewModel = mViewModel;
            // viewModel.autoAccept.getValue()
            java.lang.Boolean viewModelAutoAcceptGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAutoAccept = viewModel.getAutoAccept();

                viewModelAutoAcceptJavaLangObjectNull = (viewModelAutoAccept) != (null);
                if (viewModelAutoAcceptJavaLangObjectNull) {




                    viewModelAutoAccept.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public SettingsVideoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private SettingsVideoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 16
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[15]
            , (android.widget.LinearLayout) bindings[14]
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
        this.mboundView32 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[6];
        setContainedBinding(this.mboundView32);
        this.mboundView33 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[7];
        setContainedBinding(this.mboundView33);
        this.mboundView34 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[8];
        setContainedBinding(this.mboundView34);
        this.mboundView35 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[9];
        setContainedBinding(this.mboundView35);
        this.mboundView36 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[10];
        setContainedBinding(this.mboundView36);
        this.mboundView37 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[11];
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sharedMainViewModel == variableId) {
            setSharedMainViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.settings.viewmodels.VideoSettingsViewModel) variable);
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
    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.VideoSettingsViewModel ViewModel) {
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
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCameraDeviceIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelPreferredFpsLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 2 :
                return onChangeViewModelVideoSizeLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 3 :
                return onChangeViewModelTabletPreview((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelEnableVideo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelVideoCodecs((androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>>) object, fieldId);
            case 6 :
                return onChangeViewModelInitiateCall((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelBandwidthLimit((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 8 :
                return onChangeViewModelVideoPresetIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 9 :
                return onChangeViewModelVideoSizeIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 10 :
                return onChangeViewModelPreferredFpsIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 11 :
                return onChangeViewModelIsTablet((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeViewModelCameraDeviceLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 13 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeViewModelAutoAccept((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 15 :
                return onChangeViewModelVideoPresetLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCameraDeviceIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelCameraDeviceIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPreferredFpsLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelPreferredFpsLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVideoSizeLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelVideoSizeLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTabletPreview(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelTabletPreview, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEnableVideo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelEnableVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVideoCodecs(androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>> ViewModelVideoCodecs, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelInitiateCall(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelInitiateCall, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelBandwidthLimit(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelBandwidthLimit, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVideoPresetIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelVideoPresetIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVideoSizeIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelVideoSizeIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPreferredFpsIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelPreferredFpsIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsTablet(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsTablet, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCameraDeviceLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelCameraDeviceLabels, int fieldId) {
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
    private boolean onChangeViewModelAutoAccept(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAutoAccept, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVideoPresetLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelVideoPresetLabels, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelCameraDeviceIndex = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelPreferredFpsListener = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelVideoPresetListener = null;
        java.lang.Integer viewModelVideoPresetIndexGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelVideoPresetIndexGetValue = 0;
        java.util.ArrayList<java.lang.String> viewModelVideoPresetLabelsGetValue = null;
        java.util.ArrayList<java.lang.String> viewModelVideoSizeLabelsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelPreferredFpsLabels = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelInitiateCallListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAutoAcceptListener = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelVideoSizeLabels = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelTabletPreview = null;
        java.util.ArrayList<java.lang.String> viewModelPreferredFpsLabelsGetValue = null;
        java.util.ArrayList<androidx.databinding.ViewDataBinding> viewModelVideoCodecsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelEnableVideo = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelTabletPreviewListener = null;
        java.lang.Boolean viewModelTabletPreviewGetValue = null;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        org.linphone.activities.main.settings.SettingListenerStub viewModelVideoSizeListener = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<androidx.databinding.ViewDataBinding>> viewModelVideoCodecs = null;
        java.lang.Boolean viewModelAutoAcceptGetValue = null;
        java.lang.Integer viewModelVideoSizeIndexGetValue = null;
        java.lang.String viewModelBandwidthLimitToString = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelInitiateCall = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsTabletGetValue = false;
        org.linphone.activities.main.settings.SettingListenerStub viewModelEnableVideoListener = null;
        java.util.ArrayList<java.lang.String> viewModelCameraDeviceLabelsGetValue = null;
        int viewModelVideoPresetIndexInt2ViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelBandwidthLimit = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelVideoPresetIndex = null;
        java.lang.Integer viewModelBandwidthLimitGetValue = null;
        boolean viewModelVideoPresetIndexInt2 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelVideoSizeIndex = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelBandwidthLimitListener = null;
        java.lang.Boolean viewModelEnableVideoGetValue = null;
        java.lang.Integer viewModelPreferredFpsIndexGetValue = null;
        int viewModelIsTabletViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelCameraDeviceIndexGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelCameraDeviceListener = null;
        java.lang.Boolean viewModelIsTabletGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelPreferredFpsIndex = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsTablet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelCameraDeviceLabels = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        java.lang.Boolean viewModelInitiateCallGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAutoAccept = null;
        org.linphone.activities.main.settings.viewmodels.VideoSettingsViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelVideoPresetLabels = null;

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
                        dirtyFlags |= 0x100000L;
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
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
                        // read viewModel.cameraDeviceIndex
                        viewModelCameraDeviceIndex = viewModel.getCameraDeviceIndex();
                    }
                    updateLiveDataRegistration(0, viewModelCameraDeviceIndex);


                    if (viewModelCameraDeviceIndex != null) {
                        // read viewModel.cameraDeviceIndex.getValue()
                        viewModelCameraDeviceIndexGetValue = viewModelCameraDeviceIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x60000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.preferredFpsListener
                        viewModelPreferredFpsListener = viewModel.getPreferredFpsListener();
                        // read viewModel.videoPresetListener
                        viewModelVideoPresetListener = viewModel.getVideoPresetListener();
                        // read viewModel.initiateCallListener
                        viewModelInitiateCallListener = viewModel.getInitiateCallListener();
                        // read viewModel.autoAcceptListener
                        viewModelAutoAcceptListener = viewModel.getAutoAcceptListener();
                        // read viewModel.tabletPreviewListener
                        viewModelTabletPreviewListener = viewModel.getTabletPreviewListener();
                        // read viewModel.videoSizeListener
                        viewModelVideoSizeListener = viewModel.getVideoSizeListener();
                        // read viewModel.enableVideoListener
                        viewModelEnableVideoListener = viewModel.getEnableVideoListener();
                        // read viewModel.bandwidthLimitListener
                        viewModelBandwidthLimitListener = viewModel.getBandwidthLimitListener();
                        // read viewModel.cameraDeviceListener
                        viewModelCameraDeviceListener = viewModel.getCameraDeviceListener();
                    }
            }
            if ((dirtyFlags & 0x60002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.preferredFpsLabels
                        viewModelPreferredFpsLabels = viewModel.getPreferredFpsLabels();
                    }
                    updateLiveDataRegistration(1, viewModelPreferredFpsLabels);


                    if (viewModelPreferredFpsLabels != null) {
                        // read viewModel.preferredFpsLabels.getValue()
                        viewModelPreferredFpsLabelsGetValue = viewModelPreferredFpsLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x60004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.videoSizeLabels
                        viewModelVideoSizeLabels = viewModel.getVideoSizeLabels();
                    }
                    updateLiveDataRegistration(2, viewModelVideoSizeLabels);


                    if (viewModelVideoSizeLabels != null) {
                        // read viewModel.videoSizeLabels.getValue()
                        viewModelVideoSizeLabelsGetValue = viewModelVideoSizeLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x60008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.tabletPreview
                        viewModelTabletPreview = viewModel.getTabletPreview();
                    }
                    updateLiveDataRegistration(3, viewModelTabletPreview);


                    if (viewModelTabletPreview != null) {
                        // read viewModel.tabletPreview.getValue()
                        viewModelTabletPreviewGetValue = viewModelTabletPreview.getValue();
                    }
            }
            if ((dirtyFlags & 0x60010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.enableVideo
                        viewModelEnableVideo = viewModel.getEnableVideo();
                    }
                    updateLiveDataRegistration(4, viewModelEnableVideo);


                    if (viewModelEnableVideo != null) {
                        // read viewModel.enableVideo.getValue()
                        viewModelEnableVideoGetValue = viewModelEnableVideo.getValue();
                    }
            }
            if ((dirtyFlags & 0x60020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.videoCodecs
                        viewModelVideoCodecs = viewModel.getVideoCodecs();
                    }
                    updateLiveDataRegistration(5, viewModelVideoCodecs);


                    if (viewModelVideoCodecs != null) {
                        // read viewModel.videoCodecs.getValue()
                        viewModelVideoCodecsGetValue = viewModelVideoCodecs.getValue();
                    }
            }
            if ((dirtyFlags & 0x60040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.initiateCall
                        viewModelInitiateCall = viewModel.getInitiateCall();
                    }
                    updateLiveDataRegistration(6, viewModelInitiateCall);


                    if (viewModelInitiateCall != null) {
                        // read viewModel.initiateCall.getValue()
                        viewModelInitiateCallGetValue = viewModelInitiateCall.getValue();
                    }
            }
            if ((dirtyFlags & 0x60080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.bandwidthLimit
                        viewModelBandwidthLimit = viewModel.getBandwidthLimit();
                    }
                    updateLiveDataRegistration(7, viewModelBandwidthLimit);


                    if (viewModelBandwidthLimit != null) {
                        // read viewModel.bandwidthLimit.getValue()
                        viewModelBandwidthLimitGetValue = viewModelBandwidthLimit.getValue();
                    }


                    if (viewModelBandwidthLimitGetValue != null) {
                        // read viewModel.bandwidthLimit.getValue().toString()
                        viewModelBandwidthLimitToString = viewModelBandwidthLimitGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x60100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.videoPresetIndex
                        viewModelVideoPresetIndex = viewModel.getVideoPresetIndex();
                    }
                    updateLiveDataRegistration(8, viewModelVideoPresetIndex);


                    if (viewModelVideoPresetIndex != null) {
                        // read viewModel.videoPresetIndex.getValue()
                        viewModelVideoPresetIndexGetValue = viewModelVideoPresetIndex.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.videoPresetIndex.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelVideoPresetIndexGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelVideoPresetIndexGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.videoPresetIndex.getValue()) == 2
                    viewModelVideoPresetIndexInt2 = (androidxDatabindingViewDataBindingSafeUnboxViewModelVideoPresetIndexGetValue) == (2);
                if((dirtyFlags & 0x60100L) != 0) {
                    if(viewModelVideoPresetIndexInt2) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.videoPresetIndex.getValue()) == 2 ? View.VISIBLE : View.GONE
                    viewModelVideoPresetIndexInt2ViewVISIBLEViewGONE = ((viewModelVideoPresetIndexInt2) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x60200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.videoSizeIndex
                        viewModelVideoSizeIndex = viewModel.getVideoSizeIndex();
                    }
                    updateLiveDataRegistration(9, viewModelVideoSizeIndex);


                    if (viewModelVideoSizeIndex != null) {
                        // read viewModel.videoSizeIndex.getValue()
                        viewModelVideoSizeIndexGetValue = viewModelVideoSizeIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x60400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.preferredFpsIndex
                        viewModelPreferredFpsIndex = viewModel.getPreferredFpsIndex();
                    }
                    updateLiveDataRegistration(10, viewModelPreferredFpsIndex);


                    if (viewModelPreferredFpsIndex != null) {
                        // read viewModel.preferredFpsIndex.getValue()
                        viewModelPreferredFpsIndexGetValue = viewModelPreferredFpsIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x60800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isTablet
                        viewModelIsTablet = viewModel.isTablet();
                    }
                    updateLiveDataRegistration(11, viewModelIsTablet);


                    if (viewModelIsTablet != null) {
                        // read viewModel.isTablet.getValue()
                        viewModelIsTabletGetValue = viewModelIsTablet.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTablet.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsTabletGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsTabletGetValue);
                if((dirtyFlags & 0x60800L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsTabletGetValue) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTablet.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsTabletViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsTabletGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x61000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cameraDeviceLabels
                        viewModelCameraDeviceLabels = viewModel.getCameraDeviceLabels();
                    }
                    updateLiveDataRegistration(12, viewModelCameraDeviceLabels);


                    if (viewModelCameraDeviceLabels != null) {
                        // read viewModel.cameraDeviceLabels.getValue()
                        viewModelCameraDeviceLabelsGetValue = viewModelCameraDeviceLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x64000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.autoAccept
                        viewModelAutoAccept = viewModel.getAutoAccept();
                    }
                    updateLiveDataRegistration(14, viewModelAutoAccept);


                    if (viewModelAutoAccept != null) {
                        // read viewModel.autoAccept.getValue()
                        viewModelAutoAcceptGetValue = viewModelAutoAccept.getValue();
                    }
            }
            if ((dirtyFlags & 0x68000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.videoPresetLabels
                        viewModelVideoPresetLabels = viewModel.getVideoPresetLabels();
                    }
                    updateLiveDataRegistration(15, viewModelVideoPresetLabels);


                    if (viewModelVideoPresetLabels != null) {
                        // read viewModel.videoPresetLabels.getValue()
                        viewModelVideoPresetLabelsGetValue = viewModelVideoPresetLabels.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x52000L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            this.mboundView31.setTitle(getRoot().getResources().getString(R.string.video_settings_enable_title));
            setBindingInverseListener(this.mboundView31, this.mOldEventChecked982275499, mboundView31checked);
            this.mboundView32.setTitle(getRoot().getResources().getString(R.string.video_settings_tablet_preview_title));
            setBindingInverseListener(this.mboundView32, this.mOldEventChecked1262865143, mboundView32checked);
            this.mboundView33.setTitle(getRoot().getResources().getString(R.string.video_settings_initiate_call_title));
            this.mboundView33.setSubtitle(getRoot().getResources().getString(R.string.video_settings_initiate_call_summary));
            setBindingInverseListener(this.mboundView33, this.mOldEventChecked2088609229, mboundView33checked);
            this.mboundView34.setTitle(getRoot().getResources().getString(R.string.video_settings_automatically_accept_title));
            this.mboundView34.setSubtitle(getRoot().getResources().getString(R.string.video_settings_automatically_accept_summary));
            setBindingInverseListener(this.mboundView34, this.mOldEventChecked978157691, mboundView34checked);
            this.mboundView35.setTitle(getRoot().getResources().getString(R.string.video_settings_camera_device_title));
            this.mboundView36.setTitle(getRoot().getResources().getString(R.string.video_settings_video_size_title));
            this.mboundView37.setTitle(getRoot().getResources().getString(R.string.video_settings_video_preset_title));
            this.mboundView38.setTitle(getRoot().getResources().getString(R.string.video_settings_preferred_fps_title));
            this.mboundView39.setTitle(getRoot().getResources().getString(R.string.video_settings_bandwidth_limit_title));
            this.mboundView39.setSubtitle(getRoot().getResources().getString(R.string.video_settings_bandwidth_limit_summary));
            this.mboundView39.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
        }
        if ((dirtyFlags & 0x60000L) != 0) {
            // api target 1

            this.mboundView31.setListener(viewModelEnableVideoListener);
            this.mboundView32.setListener(viewModelTabletPreviewListener);
            this.mboundView33.setListener(viewModelInitiateCallListener);
            this.mboundView34.setListener(viewModelAutoAcceptListener);
            this.mboundView35.setListener(viewModelCameraDeviceListener);
            this.mboundView36.setListener(viewModelVideoSizeListener);
            this.mboundView37.setListener(viewModelVideoPresetListener);
            this.mboundView38.setListener(viewModelPreferredFpsListener);
            this.mboundView39.setListener(viewModelBandwidthLimitListener);
        }
        if ((dirtyFlags & 0x60010L) != 0) {
            // api target 1

            this.mboundView31.setChecked(viewModelEnableVideoGetValue);
            this.mboundView32.setEnabled(viewModelEnableVideoGetValue);
            this.mboundView33.setEnabled(viewModelEnableVideoGetValue);
            this.mboundView34.setEnabled(viewModelEnableVideoGetValue);
            this.mboundView35.setEnabled(viewModelEnableVideoGetValue);
            this.mboundView36.setEnabled(viewModelEnableVideoGetValue);
            this.mboundView37.setEnabled(viewModelEnableVideoGetValue);
            this.mboundView38.setEnabled(viewModelEnableVideoGetValue);
            this.mboundView39.setEnabled(viewModelEnableVideoGetValue);
        }
        if ((dirtyFlags & 0x60008L) != 0) {
            // api target 1

            this.mboundView32.setChecked(viewModelTabletPreviewGetValue);
        }
        if ((dirtyFlags & 0x60800L) != 0) {
            // api target 1

            this.mboundView32.getRoot().setVisibility(viewModelIsTabletViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x60040L) != 0) {
            // api target 1

            this.mboundView33.setChecked(viewModelInitiateCallGetValue);
        }
        if ((dirtyFlags & 0x64000L) != 0) {
            // api target 1

            this.mboundView34.setChecked(viewModelAutoAcceptGetValue);
        }
        if ((dirtyFlags & 0x60001L) != 0) {
            // api target 1

            this.mboundView35.setSelectedIndex(viewModelCameraDeviceIndexGetValue);
        }
        if ((dirtyFlags & 0x61000L) != 0) {
            // api target 1

            this.mboundView35.setLabels(viewModelCameraDeviceLabelsGetValue);
        }
        if ((dirtyFlags & 0x60200L) != 0) {
            // api target 1

            this.mboundView36.setSelectedIndex(viewModelVideoSizeIndexGetValue);
        }
        if ((dirtyFlags & 0x60004L) != 0) {
            // api target 1

            this.mboundView36.setLabels(viewModelVideoSizeLabelsGetValue);
        }
        if ((dirtyFlags & 0x60100L) != 0) {
            // api target 1

            this.mboundView37.setSelectedIndex(viewModelVideoPresetIndexGetValue);
            this.mboundView38.getRoot().setVisibility(viewModelVideoPresetIndexInt2ViewVISIBLEViewGONE);
            this.mboundView39.getRoot().setVisibility(viewModelVideoPresetIndexInt2ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x68000L) != 0) {
            // api target 1

            this.mboundView37.setLabels(viewModelVideoPresetLabelsGetValue);
        }
        if ((dirtyFlags & 0x60400L) != 0) {
            // api target 1

            this.mboundView38.setSelectedIndex(viewModelPreferredFpsIndexGetValue);
        }
        if ((dirtyFlags & 0x60002L) != 0) {
            // api target 1

            this.mboundView38.setLabels(viewModelPreferredFpsLabelsGetValue);
        }
        if ((dirtyFlags & 0x60080L) != 0) {
            // api target 1

            this.mboundView39.setDefaultValue(viewModelBandwidthLimitToString);
        }
        if ((dirtyFlags & 0x60020L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView4, viewModelVideoCodecsGetValue);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            this.mOldEventChecked982275499 = mboundView31checked;
            this.mOldEventChecked1262865143 = mboundView32checked;
            this.mOldEventChecked2088609229 = mboundView33checked;
            this.mOldEventChecked978157691 = mboundView34checked;
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
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.cameraDeviceIndex
        flag 1 (0x2L): viewModel.preferredFpsLabels
        flag 2 (0x3L): viewModel.videoSizeLabels
        flag 3 (0x4L): viewModel.tabletPreview
        flag 4 (0x5L): viewModel.enableVideo
        flag 5 (0x6L): viewModel.videoCodecs
        flag 6 (0x7L): viewModel.initiateCall
        flag 7 (0x8L): viewModel.bandwidthLimit
        flag 8 (0x9L): viewModel.videoPresetIndex
        flag 9 (0xaL): viewModel.videoSizeIndex
        flag 10 (0xbL): viewModel.preferredFpsIndex
        flag 11 (0xcL): viewModel.isTablet
        flag 12 (0xdL): viewModel.cameraDeviceLabels
        flag 13 (0xeL): sharedMainViewModel.isSlidingPaneSlideable
        flag 14 (0xfL): viewModel.autoAccept
        flag 15 (0x10L): viewModel.videoPresetLabels
        flag 16 (0x11L): sharedMainViewModel
        flag 17 (0x12L): viewModel
        flag 18 (0x13L): null
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.videoPresetIndex.getValue()) == 2 ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.videoPresetIndex.getValue()) == 2 ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTablet.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTablet.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}