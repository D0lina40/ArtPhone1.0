package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsNetworkFragmentBindingImpl extends SettingsNetworkFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(3, 
            new String[] {"settings_widget_switch", "settings_widget_switch", "settings_widget_switch", "settings_widget_text"},
            new int[] {4, 5, 6, 7},
            new int[] {org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_text});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 8);
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
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView34;
    // variables
    // values
    private androidx.databinding.InverseBindingListener mOldEventChecked191339560;
    private androidx.databinding.InverseBindingListener mOldEventChecked710396108;
    private androidx.databinding.InverseBindingListener mOldEventChecked1940884294;
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView31checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.wifiOnly.getValue()
            //         is viewModel.wifiOnly.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView31.getChecked();
            // localize variables for thread safety
            // viewModel.wifiOnly != null
            boolean viewModelWifiOnlyJavaLangObjectNull = false;
            // viewModel.wifiOnly.getValue()
            java.lang.Boolean viewModelWifiOnlyGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.NetworkSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.wifiOnly
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWifiOnly = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelWifiOnly = viewModel.getWifiOnly();

                viewModelWifiOnlyJavaLangObjectNull = (viewModelWifiOnly) != (null);
                if (viewModelWifiOnlyJavaLangObjectNull) {




                    viewModelWifiOnly.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView32checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.allowIpv6.getValue()
            //         is viewModel.allowIpv6.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView32.getChecked();
            // localize variables for thread safety
            // viewModel.allowIpv6 != null
            boolean viewModelAllowIpv6JavaLangObjectNull = false;
            // viewModel.allowIpv6
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAllowIpv6 = null;
            // viewModel.allowIpv6.getValue()
            java.lang.Boolean viewModelAllowIpv6GetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.NetworkSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelAllowIpv6 = viewModel.getAllowIpv6();

                viewModelAllowIpv6JavaLangObjectNull = (viewModelAllowIpv6) != (null);
                if (viewModelAllowIpv6JavaLangObjectNull) {




                    viewModelAllowIpv6.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView33checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.randomPorts.getValue()
            //         is viewModel.randomPorts.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView33.getChecked();
            // localize variables for thread safety
            // viewModel.randomPorts
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelRandomPorts = null;
            // viewModel.randomPorts.getValue()
            java.lang.Boolean viewModelRandomPortsGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.NetworkSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.randomPorts != null
            boolean viewModelRandomPortsJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelRandomPorts = viewModel.getRandomPorts();

                viewModelRandomPortsJavaLangObjectNull = (viewModelRandomPorts) != (null);
                if (viewModelRandomPortsJavaLangObjectNull) {




                    viewModelRandomPorts.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public SettingsNetworkFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private SettingsNetworkFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[8]
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
        this.mboundView32 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[5];
        setContainedBinding(this.mboundView32);
        this.mboundView33 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[6];
        setContainedBinding(this.mboundView33);
        this.mboundView34 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[7];
        setContainedBinding(this.mboundView34);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        mboundView31.invalidateAll();
        mboundView32.invalidateAll();
        mboundView33.invalidateAll();
        mboundView34.invalidateAll();
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sharedMainViewModel == variableId) {
            setSharedMainViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.settings.viewmodels.NetworkSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.NetworkSettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
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
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAllowIpv6((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelWifiOnly((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelRandomPorts((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelSipPort((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAllowIpv6(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAllowIpv6, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWifiOnly(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelWifiOnly, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRandomPorts(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelRandomPorts, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSipPort(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelSipPort, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAllowIpv6 = null;
        int viewModelRandomPortsViewGONEViewVISIBLE = 0;
        java.lang.Integer viewModelSipPortGetValue = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        boolean viewModelRandomPorts = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWifiOnly = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelWifiOnlyListener = null;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelRandomPorts1 = null;
        java.lang.Boolean viewModelAllowIpv6GetValue = null;
        java.lang.Boolean viewModelWifiOnlyGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        java.lang.String viewModelSipPortToString = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelRandomPortsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelSipPortListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelRandomPortsGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelSipPort = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelAllowIpv6Listener = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelRandomPortsGetValue = null;
        org.linphone.activities.main.settings.viewmodels.NetworkSettingsViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xa8L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(3, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0xa8L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x800L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x400L;
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xd7L) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.allowIpv6
                        viewModelAllowIpv6 = viewModel.getAllowIpv6();
                    }
                    updateLiveDataRegistration(0, viewModelAllowIpv6);


                    if (viewModelAllowIpv6 != null) {
                        // read viewModel.allowIpv6.getValue()
                        viewModelAllowIpv6GetValue = viewModelAllowIpv6.getValue();
                    }
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.wifiOnly
                        viewModelWifiOnly = viewModel.getWifiOnly();
                    }
                    updateLiveDataRegistration(1, viewModelWifiOnly);


                    if (viewModelWifiOnly != null) {
                        // read viewModel.wifiOnly.getValue()
                        viewModelWifiOnlyGetValue = viewModelWifiOnly.getValue();
                    }
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.wifiOnlyListener
                        viewModelWifiOnlyListener = viewModel.getWifiOnlyListener();
                        // read viewModel.randomPortsListener
                        viewModelRandomPortsListener = viewModel.getRandomPortsListener();
                        // read viewModel.sipPortListener
                        viewModelSipPortListener = viewModel.getSipPortListener();
                        // read viewModel.allowIpv6Listener
                        viewModelAllowIpv6Listener = viewModel.getAllowIpv6Listener();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.randomPorts
                        ViewModelRandomPorts1 = viewModel.getRandomPorts();
                    }
                    updateLiveDataRegistration(2, ViewModelRandomPorts1);


                    if (ViewModelRandomPorts1 != null) {
                        // read viewModel.randomPorts.getValue()
                        viewModelRandomPortsGetValue = ViewModelRandomPorts1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.randomPorts.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelRandomPortsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRandomPortsGetValue);
                if((dirtyFlags & 0xc4L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelRandomPortsGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.randomPorts.getValue()) ? View.GONE : View.VISIBLE
                    viewModelRandomPortsViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelRandomPortsGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.randomPorts.getValue())
                    viewModelRandomPorts = !androidxDatabindingViewDataBindingSafeUnboxViewModelRandomPortsGetValue;
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.sipPort
                        viewModelSipPort = viewModel.getSipPort();
                    }
                    updateLiveDataRegistration(4, viewModelSipPort);


                    if (viewModelSipPort != null) {
                        // read viewModel.sipPort.getValue()
                        viewModelSipPortGetValue = viewModelSipPort.getValue();
                    }


                    if (viewModelSipPortGetValue != null) {
                        // read viewModel.sipPort.getValue().toString()
                        viewModelSipPortToString = viewModelSipPortGetValue.toString();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xa8L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.mboundView31.setTitle(getRoot().getResources().getString(R.string.network_settings_wifi_only_title));
            setBindingInverseListener(this.mboundView31, this.mOldEventChecked191339560, mboundView31checked);
            this.mboundView32.setTitle(getRoot().getResources().getString(R.string.network_settings_allow_ipv6_title));
            setBindingInverseListener(this.mboundView32, this.mOldEventChecked710396108, mboundView32checked);
            this.mboundView33.setTitle(getRoot().getResources().getString(R.string.network_settings_random_ports_title));
            setBindingInverseListener(this.mboundView33, this.mOldEventChecked1940884294, mboundView33checked);
            this.mboundView34.setTitle(getRoot().getResources().getString(R.string.network_settings_sip_port_title));
            this.mboundView34.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.mboundView31.setListener(viewModelWifiOnlyListener);
            this.mboundView32.setListener(viewModelAllowIpv6Listener);
            this.mboundView33.setListener(viewModelRandomPortsListener);
            this.mboundView34.setListener(viewModelSipPortListener);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.mboundView31.setChecked(viewModelWifiOnlyGetValue);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.mboundView32.setChecked(viewModelAllowIpv6GetValue);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.mboundView33.setChecked(viewModelRandomPortsGetValue);
            this.mboundView34.setEnabled(viewModelRandomPorts);
            this.mboundView34.getRoot().setVisibility(viewModelRandomPortsViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            this.mboundView34.setDefaultValue(viewModelSipPortToString);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            this.mOldEventChecked191339560 = mboundView31checked;
            this.mOldEventChecked710396108 = mboundView32checked;
            this.mOldEventChecked1940884294 = mboundView33checked;
        }
        executeBindingsOn(mboundView31);
        executeBindingsOn(mboundView32);
        executeBindingsOn(mboundView33);
        executeBindingsOn(mboundView34);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.allowIpv6
        flag 1 (0x2L): viewModel.wifiOnly
        flag 2 (0x3L): viewModel.randomPorts
        flag 3 (0x4L): sharedMainViewModel.isSlidingPaneSlideable
        flag 4 (0x5L): viewModel.sipPort
        flag 5 (0x6L): sharedMainViewModel
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.randomPorts.getValue()) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.randomPorts.getValue()) ? View.GONE : View.VISIBLE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
    flag mapping end*/
    //end
}