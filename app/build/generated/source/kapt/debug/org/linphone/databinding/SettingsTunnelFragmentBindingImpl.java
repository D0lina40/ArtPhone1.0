package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsTunnelFragmentBindingImpl extends SettingsTunnelFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(3, 
            new String[] {"settings_widget_text", "settings_widget_text", "settings_widget_switch", "settings_widget_text", "settings_widget_text", "settings_widget_list"},
            new int[] {4, 5, 6, 7, 8, 9},
            new int[] {org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_list});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.view.View mboundView2;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView31;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView32;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView33;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView34;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView35;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView36;
    // variables
    // values
    private androidx.databinding.InverseBindingListener mOldEventChecked1054790455;
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView33checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.useDualMode.getValue()
            //         is viewModel.useDualMode.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView33.getChecked();
            // localize variables for thread safety
            // viewModel.useDualMode.getValue()
            java.lang.Boolean viewModelUseDualModeGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.TunnelSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.useDualMode != null
            boolean viewModelUseDualModeJavaLangObjectNull = false;
            // viewModel.useDualMode
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelUseDualMode = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUseDualMode = viewModel.getUseDualMode();

                viewModelUseDualModeJavaLangObjectNull = (viewModelUseDualMode) != (null);
                if (viewModelUseDualModeJavaLangObjectNull) {




                    viewModelUseDualMode.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public SettingsTunnelFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private SettingsTunnelFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[10]
            );
        this.back.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.view.View) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[4];
        setContainedBinding(this.mboundView31);
        this.mboundView32 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[5];
        setContainedBinding(this.mboundView32);
        this.mboundView33 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[6];
        setContainedBinding(this.mboundView33);
        this.mboundView34 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[7];
        setContainedBinding(this.mboundView34);
        this.mboundView35 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[8];
        setContainedBinding(this.mboundView35);
        this.mboundView36 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[9];
        setContainedBinding(this.mboundView36);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
        }
        mboundView31.invalidateAll();
        mboundView32.invalidateAll();
        mboundView33.invalidateAll();
        mboundView34.invalidateAll();
        mboundView35.invalidateAll();
        mboundView36.invalidateAll();
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
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sharedMainViewModel == variableId) {
            setSharedMainViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.settings.viewmodels.TunnelSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.TunnelSettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
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
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPort((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelHostnameUrl((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelUseDualMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelHostnameUrl2((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelPort2((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 5 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelModeIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 7 :
                return onChangeViewModelModeLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPort(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelPort, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHostnameUrl(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelHostnameUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUseDualMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelUseDualMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHostnameUrl2(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelHostnameUrl2, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPort2(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelPort2, int fieldId) {
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
    private boolean onChangeViewModelModeIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelModeIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelModeLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelModeLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelPort = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelHostnameUrl = null;
        java.lang.String viewModelHostnameUrlGetValue = null;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        org.linphone.activities.main.settings.SettingListenerStub viewModelPort2Listener = null;
        int viewModelUseDualModeViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelUseDualMode = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelHostnameUrl2Listener = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = 0;
        java.util.ArrayList<java.lang.String> viewModelModeLabelsGetValue = null;
        java.lang.Integer viewModelModeIndexGetValue = null;
        java.lang.Boolean viewModelUseDualModeGetValue = null;
        java.lang.String viewModelHostnameUrl2GetValue = null;
        java.lang.Integer viewModelPortGetValue = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelPort2GetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelHostnameUrlListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelHostnameUrl2 = null;
        java.lang.String viewModelPort2ToString = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelModeListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        java.lang.String viewModelPortToString = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelUseDualModeGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelPort2 = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelUseDualModeListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelModeIndex = null;
        org.linphone.activities.main.settings.viewmodels.TunnelSettingsViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelModeLabels = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelPortListener = null;

        if ((dirtyFlags & 0x520L) != 0) {



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
            if((dirtyFlags & 0x520L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x8000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6dfL) != 0) {


            if ((dirtyFlags & 0x601L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.port
                        viewModelPort = viewModel.getPort();
                    }
                    updateLiveDataRegistration(0, viewModelPort);


                    if (viewModelPort != null) {
                        // read viewModel.port.getValue()
                        viewModelPortGetValue = viewModelPort.getValue();
                    }


                    if (viewModelPortGetValue != null) {
                        // read viewModel.port.getValue().toString()
                        viewModelPortToString = viewModelPortGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x602L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hostnameUrl
                        viewModelHostnameUrl = viewModel.getHostnameUrl();
                    }
                    updateLiveDataRegistration(1, viewModelHostnameUrl);


                    if (viewModelHostnameUrl != null) {
                        // read viewModel.hostnameUrl.getValue()
                        viewModelHostnameUrlGetValue = viewModelHostnameUrl.getValue();
                    }
            }
            if ((dirtyFlags & 0x600L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.port2Listener
                        viewModelPort2Listener = viewModel.getPort2Listener();
                        // read viewModel.hostnameUrl2Listener
                        viewModelHostnameUrl2Listener = viewModel.getHostnameUrl2Listener();
                        // read viewModel.hostnameUrlListener
                        viewModelHostnameUrlListener = viewModel.getHostnameUrlListener();
                        // read viewModel.modeListener
                        viewModelModeListener = viewModel.getModeListener();
                        // read viewModel.useDualModeListener
                        viewModelUseDualModeListener = viewModel.getUseDualModeListener();
                        // read viewModel.portListener
                        viewModelPortListener = viewModel.getPortListener();
                    }
            }
            if ((dirtyFlags & 0x604L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.useDualMode
                        viewModelUseDualMode = viewModel.getUseDualMode();
                    }
                    updateLiveDataRegistration(2, viewModelUseDualMode);


                    if (viewModelUseDualMode != null) {
                        // read viewModel.useDualMode.getValue()
                        viewModelUseDualModeGetValue = viewModelUseDualMode.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.useDualMode.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelUseDualModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelUseDualModeGetValue);
                if((dirtyFlags & 0x604L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelUseDualModeGetValue) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.useDualMode.getValue()) ? View.VISIBLE : View.GONE
                    viewModelUseDualModeViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelUseDualModeGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x608L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hostnameUrl2
                        viewModelHostnameUrl2 = viewModel.getHostnameUrl2();
                    }
                    updateLiveDataRegistration(3, viewModelHostnameUrl2);


                    if (viewModelHostnameUrl2 != null) {
                        // read viewModel.hostnameUrl2.getValue()
                        viewModelHostnameUrl2GetValue = viewModelHostnameUrl2.getValue();
                    }
            }
            if ((dirtyFlags & 0x610L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.port2
                        viewModelPort2 = viewModel.getPort2();
                    }
                    updateLiveDataRegistration(4, viewModelPort2);


                    if (viewModelPort2 != null) {
                        // read viewModel.port2.getValue()
                        viewModelPort2GetValue = viewModelPort2.getValue();
                    }


                    if (viewModelPort2GetValue != null) {
                        // read viewModel.port2.getValue().toString()
                        viewModelPort2ToString = viewModelPort2GetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x640L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.modeIndex
                        viewModelModeIndex = viewModel.getModeIndex();
                    }
                    updateLiveDataRegistration(6, viewModelModeIndex);


                    if (viewModelModeIndex != null) {
                        // read viewModel.modeIndex.getValue()
                        viewModelModeIndexGetValue = viewModelModeIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x680L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.modeLabels
                        viewModelModeLabels = viewModel.getModeLabels();
                    }
                    updateLiveDataRegistration(7, viewModelModeLabels);


                    if (viewModelModeLabels != null) {
                        // read viewModel.modeLabels.getValue()
                        viewModelModeLabelsGetValue = viewModelModeLabels.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x520L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.mboundView31.setTitle(getRoot().getResources().getString(R.string.tunnel_settings_hostname_url_title));
            this.mboundView31.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_URI);
            this.mboundView32.setTitle(getRoot().getResources().getString(R.string.tunnel_settings_port_title));
            this.mboundView32.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
            this.mboundView33.setTitle(getRoot().getResources().getString(R.string.tunnel_settings_dual_mode_title));
            this.mboundView33.setSubtitle(getRoot().getResources().getString(R.string.tunnel_settings_dual_mode_summary));
            setBindingInverseListener(this.mboundView33, this.mOldEventChecked1054790455, mboundView33checked);
            this.mboundView34.setTitle(getRoot().getResources().getString(R.string.tunnel_settings_dual_hostname_url_title));
            this.mboundView34.setSubtitle(getRoot().getResources().getString(R.string.tunnel_settings_dual_hostname_url_summary));
            this.mboundView34.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_URI);
            this.mboundView35.setTitle(getRoot().getResources().getString(R.string.tunnel_settings_dual_port_title));
            this.mboundView35.setSubtitle(getRoot().getResources().getString(R.string.tunnel_settings_dual_port_summary));
            this.mboundView35.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
            this.mboundView36.setTitle(getRoot().getResources().getString(R.string.tunnel_settings_mode_title));
        }
        if ((dirtyFlags & 0x600L) != 0) {
            // api target 1

            this.mboundView31.setListener(viewModelHostnameUrlListener);
            this.mboundView32.setListener(viewModelPortListener);
            this.mboundView33.setListener(viewModelUseDualModeListener);
            this.mboundView34.setListener(viewModelHostnameUrl2Listener);
            this.mboundView35.setListener(viewModelPort2Listener);
            this.mboundView36.setListener(viewModelModeListener);
        }
        if ((dirtyFlags & 0x602L) != 0) {
            // api target 1

            this.mboundView31.setDefaultValue(viewModelHostnameUrlGetValue);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            this.mboundView32.setDefaultValue(viewModelPortToString);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            this.mboundView33.setChecked(viewModelUseDualModeGetValue);
            this.mboundView34.setEnabled(viewModelUseDualModeGetValue);
            this.mboundView34.getRoot().setVisibility(viewModelUseDualModeViewVISIBLEViewGONE);
            this.mboundView35.setEnabled(viewModelUseDualModeGetValue);
            this.mboundView35.getRoot().setVisibility(viewModelUseDualModeViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x608L) != 0) {
            // api target 1

            this.mboundView34.setDefaultValue(viewModelHostnameUrl2GetValue);
        }
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            this.mboundView35.setDefaultValue(viewModelPort2ToString);
        }
        if ((dirtyFlags & 0x640L) != 0) {
            // api target 1

            this.mboundView36.setSelectedIndex(viewModelModeIndexGetValue);
        }
        if ((dirtyFlags & 0x680L) != 0) {
            // api target 1

            this.mboundView36.setLabels(viewModelModeLabelsGetValue);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            this.mOldEventChecked1054790455 = mboundView33checked;
        }
        executeBindingsOn(mboundView31);
        executeBindingsOn(mboundView32);
        executeBindingsOn(mboundView33);
        executeBindingsOn(mboundView34);
        executeBindingsOn(mboundView35);
        executeBindingsOn(mboundView36);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.port
        flag 1 (0x2L): viewModel.hostnameUrl
        flag 2 (0x3L): viewModel.useDualMode
        flag 3 (0x4L): viewModel.hostnameUrl2
        flag 4 (0x5L): viewModel.port2
        flag 5 (0x6L): sharedMainViewModel.isSlidingPaneSlideable
        flag 6 (0x7L): viewModel.modeIndex
        flag 7 (0x8L): viewModel.modeLabels
        flag 8 (0x9L): sharedMainViewModel
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.useDualMode.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.useDualMode.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}