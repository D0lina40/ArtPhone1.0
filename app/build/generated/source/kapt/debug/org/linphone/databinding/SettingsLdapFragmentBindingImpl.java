package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsLdapFragmentBindingImpl extends SettingsLdapFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(23);
        sIncludes.setIncludes(3, 
            new String[] {"settings_widget_switch", "settings_widget_basic", "settings_widget_text", "settings_widget_text", "settings_widget_text", "settings_widget_list", "settings_widget_switch", "settings_widget_list", "settings_widget_text", "settings_widget_text", "settings_widget_text", "settings_widget_text", "settings_widget_text", "settings_widget_text", "settings_widget_text", "settings_widget_text", "settings_widget_text", "settings_widget_switch"},
            new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21},
            new int[] {org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_basic,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_switch,
                org.linphone.R.layout.settings_widget_list,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_text,
                org.linphone.R.layout.settings_widget_switch});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 22);
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
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView311;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView312;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView313;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView314;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView315;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView316;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView317;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView318;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetBasicBinding mboundView32;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView33;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView34;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView35;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView36;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetSwitchBinding mboundView37;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetListBinding mboundView38;
    @Nullable
    private final org.linphone.databinding.SettingsWidgetTextBinding mboundView39;
    // variables
    // values
    private androidx.databinding.InverseBindingListener mOldEventChecked932835436;
    private androidx.databinding.InverseBindingListener mOldEventChecked1857516547;
    private androidx.databinding.InverseBindingListener mOldEventChecked1056193881;
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView31checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.ldapEnable.getValue()
            //         is viewModel.ldapEnable.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView31.getChecked();
            // localize variables for thread safety
            // viewModel.ldapEnable.getValue()
            java.lang.Boolean viewModelLdapEnableGetValue = null;
            // viewModel.ldapEnable != null
            boolean viewModelLdapEnableJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.ldapEnable
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLdapEnable = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelLdapEnable = viewModel.getLdapEnable();

                viewModelLdapEnableJavaLangObjectNull = (viewModelLdapEnable) != (null);
                if (viewModelLdapEnableJavaLangObjectNull) {




                    viewModelLdapEnable.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView318checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.ldapDebug.getValue()
            //         is viewModel.ldapDebug.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView318.getChecked();
            // localize variables for thread safety
            // viewModel.ldapDebug
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLdapDebug = null;
            // viewModel.ldapDebug.getValue()
            java.lang.Boolean viewModelLdapDebugGetValue = null;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.ldapDebug != null
            boolean viewModelLdapDebugJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelLdapDebug = viewModel.getLdapDebug();

                viewModelLdapDebugJavaLangObjectNull = (viewModelLdapDebug) != (null);
                if (viewModelLdapDebugJavaLangObjectNull) {




                    viewModelLdapDebug.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.ViewDataBinding.PropertyChangedInverseListener mboundView37checked = new androidx.databinding.ViewDataBinding.PropertyChangedInverseListener(BR.checked) {
        @Override
        public void onChange() {
            // Inverse of viewModel.ldapTls.getValue()
            //         is viewModel.ldapTls.setValue((java.lang.Boolean) callbackArg_0)
            java.lang.Boolean callbackArg_0 = mboundView37.getChecked();
            // localize variables for thread safety
            // viewModel.ldapTls
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLdapTls = null;
            // viewModel.ldapTls != null
            boolean viewModelLdapTlsJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel viewModel = mViewModel;
            // viewModel.ldapTls.getValue()
            java.lang.Boolean viewModelLdapTlsGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelLdapTls = viewModel.getLdapTls();

                viewModelLdapTlsJavaLangObjectNull = (viewModelLdapTls) != (null);
                if (viewModelLdapTlsJavaLangObjectNull) {




                    viewModelLdapTls.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public SettingsLdapFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private SettingsLdapFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 20
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[22]
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
        this.mboundView310 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[13];
        setContainedBinding(this.mboundView310);
        this.mboundView311 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[14];
        setContainedBinding(this.mboundView311);
        this.mboundView312 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[15];
        setContainedBinding(this.mboundView312);
        this.mboundView313 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[16];
        setContainedBinding(this.mboundView313);
        this.mboundView314 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[17];
        setContainedBinding(this.mboundView314);
        this.mboundView315 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[18];
        setContainedBinding(this.mboundView315);
        this.mboundView316 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[19];
        setContainedBinding(this.mboundView316);
        this.mboundView317 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[20];
        setContainedBinding(this.mboundView317);
        this.mboundView318 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[21];
        setContainedBinding(this.mboundView318);
        this.mboundView32 = (org.linphone.databinding.SettingsWidgetBasicBinding) bindings[5];
        setContainedBinding(this.mboundView32);
        this.mboundView33 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[6];
        setContainedBinding(this.mboundView33);
        this.mboundView34 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[7];
        setContainedBinding(this.mboundView34);
        this.mboundView35 = (org.linphone.databinding.SettingsWidgetTextBinding) bindings[8];
        setContainedBinding(this.mboundView35);
        this.mboundView36 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[9];
        setContainedBinding(this.mboundView36);
        this.mboundView37 = (org.linphone.databinding.SettingsWidgetSwitchBinding) bindings[10];
        setContainedBinding(this.mboundView37);
        this.mboundView38 = (org.linphone.databinding.SettingsWidgetListBinding) bindings[11];
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
                mDirtyFlags = 0x400000L;
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
        mboundView316.invalidateAll();
        mboundView317.invalidateAll();
        mboundView318.invalidateAll();
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
        if (mboundView316.hasPendingBindings()) {
            return true;
        }
        if (mboundView317.hasPendingBindings()) {
            return true;
        }
        if (mboundView318.hasPendingBindings()) {
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
            setViewModel((org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100000L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200000L;
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
        mboundView316.setLifecycleOwner(lifecycleOwner);
        mboundView317.setLifecycleOwner(lifecycleOwner);
        mboundView318.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelLdapRequestDelay((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelLdapServer((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelLdapDebug((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelLdapSearchFilter((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelLdapAuthMethodLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 5 :
                return onChangeViewModelLdapCertCheckLabels((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 6 :
                return onChangeViewModelLdapBindDn((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelLdapSearchTimeout((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 8 :
                return onChangeViewModelLdapCertCheckIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 9 :
                return onChangeViewModelLdapSearchBase((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelLdapSipDomain((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeViewModelLdapPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeViewModelLdapEnable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeViewModelLdapAuthMethodIndex((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 14 :
                return onChangeViewModelLdapSearchMaxResults((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 15 :
                return onChangeViewModelLdapNameAttribute((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 16 :
                return onChangeViewModelLdapMinimumCharacters((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 17 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 18 :
                return onChangeViewModelLdapTls((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 19 :
                return onChangeViewModelLdapSipAttribute((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelLdapRequestDelay(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelLdapRequestDelay, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapServer(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLdapServer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapDebug(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLdapDebug, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapSearchFilter(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLdapSearchFilter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapAuthMethodLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelLdapAuthMethodLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapCertCheckLabels(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ViewModelLdapCertCheckLabels, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapBindDn(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLdapBindDn, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapSearchTimeout(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelLdapSearchTimeout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapCertCheckIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelLdapCertCheckIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapSearchBase(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLdapSearchBase, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapSipDomain(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLdapSipDomain, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLdapPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapEnable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLdapEnable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapAuthMethodIndex(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelLdapAuthMethodIndex, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapSearchMaxResults(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelLdapSearchMaxResults, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapNameAttribute(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLdapNameAttribute, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapMinimumCharacters(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelLdapMinimumCharacters, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapTls(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLdapTls, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLdapSipAttribute(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLdapSipAttribute, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80000L;
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
        java.lang.Integer viewModelLdapCertCheckIndexGetValue = null;
        java.lang.String viewModelLdapSearchFilterGetValue = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapSipDomainListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelLdapRequestDelay = null;
        java.lang.String viewModelLdapPasswordGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapSearchTimeoutListener = null;
        java.lang.Integer viewModelLdapRequestDelayGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapTlsListener = null;
        java.util.ArrayList<java.lang.String> viewModelLdapAuthMethodLabelsGetValue = null;
        java.lang.Integer viewModelLdapAuthMethodIndexGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLdapServer = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapAuthMethodListener = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLdapDebug = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapNameAttributeListener = null;
        java.lang.Boolean viewModelLdapEnableGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapSearchMaxResultsListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapServerListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLdapSearchFilter = null;
        java.lang.String viewModelLdapRequestDelayToString = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapSearchFilterListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapSipAttributeListener = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelLdapAuthMethodLabels = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelDeleteListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapRequestDelayListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapBindDnListener = null;
        java.lang.String viewModelLdapMinimumCharactersToString = null;
        java.lang.String viewModelLdapSearchTimeoutToString = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> viewModelLdapCertCheckLabels = null;
        java.lang.Integer viewModelLdapSearchMaxResultsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLdapBindDn = null;
        java.lang.String viewModelLdapNameAttributeGetValue = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapEnableListener = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapSearchBaseListener = null;
        java.lang.String viewModelLdapSearchBaseGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelLdapSearchTimeout = null;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelLdapCertCheckIndex = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapCertCheckListener = null;
        java.lang.String viewModelLdapSearchMaxResultsToString = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLdapSearchBase = null;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapPasswordListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLdapSipDomain = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLdapPassword = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLdapEnable = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelLdapAuthMethodIndex = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelLdapSearchMaxResults = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLdapNameAttribute = null;
        java.lang.String viewModelLdapSipAttributeGetValue = null;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapDebugListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelLdapMinimumCharacters = null;
        java.lang.String viewModelLdapSipDomainGetValue = null;
        java.lang.Boolean viewModelLdapTlsGetValue = null;
        java.lang.String viewModelLdapServerGetValue = null;
        java.util.ArrayList<java.lang.String> viewModelLdapCertCheckLabelsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        java.lang.Boolean viewModelLdapDebugGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLdapTls = null;
        java.lang.Integer viewModelLdapSearchTimeoutGetValue = null;
        java.lang.String viewModelLdapBindDnGetValue = null;
        org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel viewModel = mViewModel;
        org.linphone.activities.main.settings.SettingListenerStub viewModelLdapMinimumCharactersListener = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLdapSipAttribute = null;
        java.lang.Integer viewModelLdapMinimumCharactersGetValue = null;

        if ((dirtyFlags & 0x520000L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(17, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x520000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x1000000L;
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                        dirtyFlags |= 0x2000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x6dffffL) != 0) {


            if ((dirtyFlags & 0x600000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapSipDomainListener
                        viewModelLdapSipDomainListener = viewModel.getLdapSipDomainListener();
                        // read viewModel.ldapSearchTimeoutListener
                        viewModelLdapSearchTimeoutListener = viewModel.getLdapSearchTimeoutListener();
                        // read viewModel.ldapTlsListener
                        viewModelLdapTlsListener = viewModel.getLdapTlsListener();
                        // read viewModel.ldapAuthMethodListener
                        viewModelLdapAuthMethodListener = viewModel.getLdapAuthMethodListener();
                        // read viewModel.ldapNameAttributeListener
                        viewModelLdapNameAttributeListener = viewModel.getLdapNameAttributeListener();
                        // read viewModel.ldapSearchMaxResultsListener
                        viewModelLdapSearchMaxResultsListener = viewModel.getLdapSearchMaxResultsListener();
                        // read viewModel.ldapServerListener
                        viewModelLdapServerListener = viewModel.getLdapServerListener();
                        // read viewModel.ldapSearchFilterListener
                        viewModelLdapSearchFilterListener = viewModel.getLdapSearchFilterListener();
                        // read viewModel.ldapSipAttributeListener
                        viewModelLdapSipAttributeListener = viewModel.getLdapSipAttributeListener();
                        // read viewModel.deleteListener
                        viewModelDeleteListener = viewModel.getDeleteListener();
                        // read viewModel.ldapRequestDelayListener
                        viewModelLdapRequestDelayListener = viewModel.getLdapRequestDelayListener();
                        // read viewModel.ldapBindDnListener
                        viewModelLdapBindDnListener = viewModel.getLdapBindDnListener();
                        // read viewModel.ldapEnableListener
                        viewModelLdapEnableListener = viewModel.getLdapEnableListener();
                        // read viewModel.ldapSearchBaseListener
                        viewModelLdapSearchBaseListener = viewModel.getLdapSearchBaseListener();
                        // read viewModel.ldapCertCheckListener
                        viewModelLdapCertCheckListener = viewModel.getLdapCertCheckListener();
                        // read viewModel.ldapPasswordListener
                        viewModelLdapPasswordListener = viewModel.getLdapPasswordListener();
                        // read viewModel.ldapDebugListener
                        viewModelLdapDebugListener = viewModel.getLdapDebugListener();
                        // read viewModel.ldapMinimumCharactersListener
                        viewModelLdapMinimumCharactersListener = viewModel.getLdapMinimumCharactersListener();
                    }
            }
            if ((dirtyFlags & 0x600001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapRequestDelay
                        viewModelLdapRequestDelay = viewModel.getLdapRequestDelay();
                    }
                    updateLiveDataRegistration(0, viewModelLdapRequestDelay);


                    if (viewModelLdapRequestDelay != null) {
                        // read viewModel.ldapRequestDelay.getValue()
                        viewModelLdapRequestDelayGetValue = viewModelLdapRequestDelay.getValue();
                    }


                    if (viewModelLdapRequestDelayGetValue != null) {
                        // read viewModel.ldapRequestDelay.getValue().toString()
                        viewModelLdapRequestDelayToString = viewModelLdapRequestDelayGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x600002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapServer
                        viewModelLdapServer = viewModel.getLdapServer();
                    }
                    updateLiveDataRegistration(1, viewModelLdapServer);


                    if (viewModelLdapServer != null) {
                        // read viewModel.ldapServer.getValue()
                        viewModelLdapServerGetValue = viewModelLdapServer.getValue();
                    }
            }
            if ((dirtyFlags & 0x600004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapDebug
                        viewModelLdapDebug = viewModel.getLdapDebug();
                    }
                    updateLiveDataRegistration(2, viewModelLdapDebug);


                    if (viewModelLdapDebug != null) {
                        // read viewModel.ldapDebug.getValue()
                        viewModelLdapDebugGetValue = viewModelLdapDebug.getValue();
                    }
            }
            if ((dirtyFlags & 0x600008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapSearchFilter
                        viewModelLdapSearchFilter = viewModel.getLdapSearchFilter();
                    }
                    updateLiveDataRegistration(3, viewModelLdapSearchFilter);


                    if (viewModelLdapSearchFilter != null) {
                        // read viewModel.ldapSearchFilter.getValue()
                        viewModelLdapSearchFilterGetValue = viewModelLdapSearchFilter.getValue();
                    }
            }
            if ((dirtyFlags & 0x600010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapAuthMethodLabels
                        viewModelLdapAuthMethodLabels = viewModel.getLdapAuthMethodLabels();
                    }
                    updateLiveDataRegistration(4, viewModelLdapAuthMethodLabels);


                    if (viewModelLdapAuthMethodLabels != null) {
                        // read viewModel.ldapAuthMethodLabels.getValue()
                        viewModelLdapAuthMethodLabelsGetValue = viewModelLdapAuthMethodLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x600020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapCertCheckLabels
                        viewModelLdapCertCheckLabels = viewModel.getLdapCertCheckLabels();
                    }
                    updateLiveDataRegistration(5, viewModelLdapCertCheckLabels);


                    if (viewModelLdapCertCheckLabels != null) {
                        // read viewModel.ldapCertCheckLabels.getValue()
                        viewModelLdapCertCheckLabelsGetValue = viewModelLdapCertCheckLabels.getValue();
                    }
            }
            if ((dirtyFlags & 0x600040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapBindDn
                        viewModelLdapBindDn = viewModel.getLdapBindDn();
                    }
                    updateLiveDataRegistration(6, viewModelLdapBindDn);


                    if (viewModelLdapBindDn != null) {
                        // read viewModel.ldapBindDn.getValue()
                        viewModelLdapBindDnGetValue = viewModelLdapBindDn.getValue();
                    }
            }
            if ((dirtyFlags & 0x600080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapSearchTimeout
                        viewModelLdapSearchTimeout = viewModel.getLdapSearchTimeout();
                    }
                    updateLiveDataRegistration(7, viewModelLdapSearchTimeout);


                    if (viewModelLdapSearchTimeout != null) {
                        // read viewModel.ldapSearchTimeout.getValue()
                        viewModelLdapSearchTimeoutGetValue = viewModelLdapSearchTimeout.getValue();
                    }


                    if (viewModelLdapSearchTimeoutGetValue != null) {
                        // read viewModel.ldapSearchTimeout.getValue().toString()
                        viewModelLdapSearchTimeoutToString = viewModelLdapSearchTimeoutGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x600100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapCertCheckIndex
                        viewModelLdapCertCheckIndex = viewModel.getLdapCertCheckIndex();
                    }
                    updateLiveDataRegistration(8, viewModelLdapCertCheckIndex);


                    if (viewModelLdapCertCheckIndex != null) {
                        // read viewModel.ldapCertCheckIndex.getValue()
                        viewModelLdapCertCheckIndexGetValue = viewModelLdapCertCheckIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x600200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapSearchBase
                        viewModelLdapSearchBase = viewModel.getLdapSearchBase();
                    }
                    updateLiveDataRegistration(9, viewModelLdapSearchBase);


                    if (viewModelLdapSearchBase != null) {
                        // read viewModel.ldapSearchBase.getValue()
                        viewModelLdapSearchBaseGetValue = viewModelLdapSearchBase.getValue();
                    }
            }
            if ((dirtyFlags & 0x600400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapSipDomain
                        viewModelLdapSipDomain = viewModel.getLdapSipDomain();
                    }
                    updateLiveDataRegistration(10, viewModelLdapSipDomain);


                    if (viewModelLdapSipDomain != null) {
                        // read viewModel.ldapSipDomain.getValue()
                        viewModelLdapSipDomainGetValue = viewModelLdapSipDomain.getValue();
                    }
            }
            if ((dirtyFlags & 0x600800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapPassword
                        viewModelLdapPassword = viewModel.getLdapPassword();
                    }
                    updateLiveDataRegistration(11, viewModelLdapPassword);


                    if (viewModelLdapPassword != null) {
                        // read viewModel.ldapPassword.getValue()
                        viewModelLdapPasswordGetValue = viewModelLdapPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x601000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapEnable
                        viewModelLdapEnable = viewModel.getLdapEnable();
                    }
                    updateLiveDataRegistration(12, viewModelLdapEnable);


                    if (viewModelLdapEnable != null) {
                        // read viewModel.ldapEnable.getValue()
                        viewModelLdapEnableGetValue = viewModelLdapEnable.getValue();
                    }
            }
            if ((dirtyFlags & 0x602000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapAuthMethodIndex
                        viewModelLdapAuthMethodIndex = viewModel.getLdapAuthMethodIndex();
                    }
                    updateLiveDataRegistration(13, viewModelLdapAuthMethodIndex);


                    if (viewModelLdapAuthMethodIndex != null) {
                        // read viewModel.ldapAuthMethodIndex.getValue()
                        viewModelLdapAuthMethodIndexGetValue = viewModelLdapAuthMethodIndex.getValue();
                    }
            }
            if ((dirtyFlags & 0x604000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapSearchMaxResults
                        viewModelLdapSearchMaxResults = viewModel.getLdapSearchMaxResults();
                    }
                    updateLiveDataRegistration(14, viewModelLdapSearchMaxResults);


                    if (viewModelLdapSearchMaxResults != null) {
                        // read viewModel.ldapSearchMaxResults.getValue()
                        viewModelLdapSearchMaxResultsGetValue = viewModelLdapSearchMaxResults.getValue();
                    }


                    if (viewModelLdapSearchMaxResultsGetValue != null) {
                        // read viewModel.ldapSearchMaxResults.getValue().toString()
                        viewModelLdapSearchMaxResultsToString = viewModelLdapSearchMaxResultsGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x608000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapNameAttribute
                        viewModelLdapNameAttribute = viewModel.getLdapNameAttribute();
                    }
                    updateLiveDataRegistration(15, viewModelLdapNameAttribute);


                    if (viewModelLdapNameAttribute != null) {
                        // read viewModel.ldapNameAttribute.getValue()
                        viewModelLdapNameAttributeGetValue = viewModelLdapNameAttribute.getValue();
                    }
            }
            if ((dirtyFlags & 0x610000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapMinimumCharacters
                        viewModelLdapMinimumCharacters = viewModel.getLdapMinimumCharacters();
                    }
                    updateLiveDataRegistration(16, viewModelLdapMinimumCharacters);


                    if (viewModelLdapMinimumCharacters != null) {
                        // read viewModel.ldapMinimumCharacters.getValue()
                        viewModelLdapMinimumCharactersGetValue = viewModelLdapMinimumCharacters.getValue();
                    }


                    if (viewModelLdapMinimumCharactersGetValue != null) {
                        // read viewModel.ldapMinimumCharacters.getValue().toString()
                        viewModelLdapMinimumCharactersToString = viewModelLdapMinimumCharactersGetValue.toString();
                    }
            }
            if ((dirtyFlags & 0x640000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapTls
                        viewModelLdapTls = viewModel.getLdapTls();
                    }
                    updateLiveDataRegistration(18, viewModelLdapTls);


                    if (viewModelLdapTls != null) {
                        // read viewModel.ldapTls.getValue()
                        viewModelLdapTlsGetValue = viewModelLdapTls.getValue();
                    }
            }
            if ((dirtyFlags & 0x680000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.ldapSipAttribute
                        viewModelLdapSipAttribute = viewModel.getLdapSipAttribute();
                    }
                    updateLiveDataRegistration(19, viewModelLdapSipAttribute);


                    if (viewModelLdapSipAttribute != null) {
                        // read viewModel.ldapSipAttribute.getValue()
                        viewModelLdapSipAttributeGetValue = viewModelLdapSipAttribute.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x520000L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewINVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x400000L) != 0) {
            // api target 1

            this.mboundView31.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_enable_title));
            setBindingInverseListener(this.mboundView31, this.mOldEventChecked932835436, mboundView31checked);
            this.mboundView310.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_search_filter_title));
            this.mboundView310.setInputType(android.text.InputType.TYPE_CLASS_TEXT);
            this.mboundView311.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_search_max_results_title));
            this.mboundView311.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
            this.mboundView312.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_search_timeout_title));
            this.mboundView312.setSubtitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_search_timeout_subtitle));
            this.mboundView312.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
            this.mboundView313.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_request_delay_title));
            this.mboundView313.setSubtitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_request_delay_subtitle));
            this.mboundView313.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
            this.mboundView314.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_minimum_characters_title));
            this.mboundView314.setInputType(android.text.InputType.TYPE_CLASS_NUMBER);
            this.mboundView315.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_name_attribute_title));
            this.mboundView315.setInputType(android.text.InputType.TYPE_CLASS_TEXT);
            this.mboundView316.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_sip_attribute_title));
            this.mboundView316.setInputType(android.text.InputType.TYPE_CLASS_TEXT);
            this.mboundView317.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_sip_domain_title));
            this.mboundView317.setInputType(android.text.InputType.TYPE_CLASS_TEXT);
            this.mboundView318.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_debug_title));
            setBindingInverseListener(this.mboundView318, this.mOldEventChecked1857516547, mboundView318checked);
            this.mboundView32.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_delete_title));
            this.mboundView33.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_server_title));
            this.mboundView33.setInputType(android.text.InputType.TYPE_TEXT_VARIATION_URI);
            this.mboundView34.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_bind_dn_title));
            this.mboundView34.setInputType(android.text.InputType.TYPE_CLASS_TEXT);
            this.mboundView35.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_password_title));
            this.mboundView35.setInputType((android.text.InputType.TYPE_CLASS_TEXT) | (android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD));
            this.mboundView36.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_auth_method_title));
            this.mboundView37.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_tls_title));
            setBindingInverseListener(this.mboundView37, this.mOldEventChecked1056193881, mboundView37checked);
            this.mboundView38.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_cert_check_title));
            this.mboundView39.setTitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_search_base_title));
            this.mboundView39.setSubtitle(getRoot().getResources().getString(R.string.contacts_settings_ldap_search_base_subtitle));
            this.mboundView39.setInputType(android.text.InputType.TYPE_CLASS_TEXT);
        }
        if ((dirtyFlags & 0x600000L) != 0) {
            // api target 1

            this.mboundView31.setListener(viewModelLdapEnableListener);
            this.mboundView310.setListener(viewModelLdapSearchFilterListener);
            this.mboundView311.setListener(viewModelLdapSearchMaxResultsListener);
            this.mboundView312.setListener(viewModelLdapSearchTimeoutListener);
            this.mboundView313.setListener(viewModelLdapRequestDelayListener);
            this.mboundView314.setListener(viewModelLdapMinimumCharactersListener);
            this.mboundView315.setListener(viewModelLdapNameAttributeListener);
            this.mboundView316.setListener(viewModelLdapSipAttributeListener);
            this.mboundView317.setListener(viewModelLdapSipDomainListener);
            this.mboundView318.setListener(viewModelLdapDebugListener);
            this.mboundView32.setListener(viewModelDeleteListener);
            this.mboundView33.setListener(viewModelLdapServerListener);
            this.mboundView34.setListener(viewModelLdapBindDnListener);
            this.mboundView35.setListener(viewModelLdapPasswordListener);
            this.mboundView36.setListener(viewModelLdapAuthMethodListener);
            this.mboundView37.setListener(viewModelLdapTlsListener);
            this.mboundView38.setListener(viewModelLdapCertCheckListener);
            this.mboundView39.setListener(viewModelLdapSearchBaseListener);
        }
        if ((dirtyFlags & 0x601000L) != 0) {
            // api target 1

            this.mboundView31.setChecked(viewModelLdapEnableGetValue);
        }
        if ((dirtyFlags & 0x600008L) != 0) {
            // api target 1

            this.mboundView310.setDefaultValue(viewModelLdapSearchFilterGetValue);
        }
        if ((dirtyFlags & 0x604000L) != 0) {
            // api target 1

            this.mboundView311.setDefaultValue(viewModelLdapSearchMaxResultsToString);
        }
        if ((dirtyFlags & 0x600080L) != 0) {
            // api target 1

            this.mboundView312.setDefaultValue(viewModelLdapSearchTimeoutToString);
        }
        if ((dirtyFlags & 0x600001L) != 0) {
            // api target 1

            this.mboundView313.setDefaultValue(viewModelLdapRequestDelayToString);
        }
        if ((dirtyFlags & 0x610000L) != 0) {
            // api target 1

            this.mboundView314.setDefaultValue(viewModelLdapMinimumCharactersToString);
        }
        if ((dirtyFlags & 0x608000L) != 0) {
            // api target 1

            this.mboundView315.setDefaultValue(viewModelLdapNameAttributeGetValue);
        }
        if ((dirtyFlags & 0x680000L) != 0) {
            // api target 1

            this.mboundView316.setDefaultValue(viewModelLdapSipAttributeGetValue);
        }
        if ((dirtyFlags & 0x600400L) != 0) {
            // api target 1

            this.mboundView317.setDefaultValue(viewModelLdapSipDomainGetValue);
        }
        if ((dirtyFlags & 0x600004L) != 0) {
            // api target 1

            this.mboundView318.setChecked(viewModelLdapDebugGetValue);
        }
        if ((dirtyFlags & 0x600002L) != 0) {
            // api target 1

            this.mboundView33.setDefaultValue(viewModelLdapServerGetValue);
        }
        if ((dirtyFlags & 0x600040L) != 0) {
            // api target 1

            this.mboundView34.setDefaultValue(viewModelLdapBindDnGetValue);
        }
        if ((dirtyFlags & 0x600800L) != 0) {
            // api target 1

            this.mboundView35.setDefaultValue(viewModelLdapPasswordGetValue);
        }
        if ((dirtyFlags & 0x602000L) != 0) {
            // api target 1

            this.mboundView36.setSelectedIndex(viewModelLdapAuthMethodIndexGetValue);
        }
        if ((dirtyFlags & 0x600010L) != 0) {
            // api target 1

            this.mboundView36.setLabels(viewModelLdapAuthMethodLabelsGetValue);
        }
        if ((dirtyFlags & 0x640000L) != 0) {
            // api target 1

            this.mboundView37.setChecked(viewModelLdapTlsGetValue);
        }
        if ((dirtyFlags & 0x600100L) != 0) {
            // api target 1

            this.mboundView38.setSelectedIndex(viewModelLdapCertCheckIndexGetValue);
        }
        if ((dirtyFlags & 0x600020L) != 0) {
            // api target 1

            this.mboundView38.setLabels(viewModelLdapCertCheckLabelsGetValue);
        }
        if ((dirtyFlags & 0x600200L) != 0) {
            // api target 1

            this.mboundView39.setDefaultValue(viewModelLdapSearchBaseGetValue);
        }
        if ((dirtyFlags & 0x400000L) != 0) {
            this.mOldEventChecked932835436 = mboundView31checked;
            this.mOldEventChecked1857516547 = mboundView318checked;
            this.mOldEventChecked1056193881 = mboundView37checked;
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
        executeBindingsOn(mboundView316);
        executeBindingsOn(mboundView317);
        executeBindingsOn(mboundView318);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.ldapRequestDelay
        flag 1 (0x2L): viewModel.ldapServer
        flag 2 (0x3L): viewModel.ldapDebug
        flag 3 (0x4L): viewModel.ldapSearchFilter
        flag 4 (0x5L): viewModel.ldapAuthMethodLabels
        flag 5 (0x6L): viewModel.ldapCertCheckLabels
        flag 6 (0x7L): viewModel.ldapBindDn
        flag 7 (0x8L): viewModel.ldapSearchTimeout
        flag 8 (0x9L): viewModel.ldapCertCheckIndex
        flag 9 (0xaL): viewModel.ldapSearchBase
        flag 10 (0xbL): viewModel.ldapSipDomain
        flag 11 (0xcL): viewModel.ldapPassword
        flag 12 (0xdL): viewModel.ldapEnable
        flag 13 (0xeL): viewModel.ldapAuthMethodIndex
        flag 14 (0xfL): viewModel.ldapSearchMaxResults
        flag 15 (0x10L): viewModel.ldapNameAttribute
        flag 16 (0x11L): viewModel.ldapMinimumCharacters
        flag 17 (0x12L): sharedMainViewModel.isSlidingPaneSlideable
        flag 18 (0x13L): viewModel.ldapTls
        flag 19 (0x14L): viewModel.ldapSipAttribute
        flag 20 (0x15L): sharedMainViewModel
        flag 21 (0x16L): viewModel
        flag 22 (0x17L): null
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.INVISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}