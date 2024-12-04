package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AssistantAccountLoginFragmentBindingImpl extends AssistantAccountLoginFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(19);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {14},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar_fragment, 15);
        sViewsWithIds.put(R.id.phone_number_desc, 16);
        sViewsWithIds.put(R.id.select_country_label, 17);
        sViewsWithIds.put(R.id.username_layout, 18);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView11;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView11androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.loginWithUsernamePassword.getValue()
            //         is viewModel.loginWithUsernamePassword.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView11.isChecked();
            // localize variables for thread safety
            // viewModel.loginWithUsernamePassword
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoginWithUsernamePassword = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.loginWithUsernamePassword != null
            boolean viewModelLoginWithUsernamePasswordJavaLangObjectNull = false;
            // viewModel.loginWithUsernamePassword.getValue()
            java.lang.Boolean viewModelLoginWithUsernamePasswordGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelLoginWithUsernamePassword = viewModel.getLoginWithUsernamePassword();

                viewModelLoginWithUsernamePasswordJavaLangObjectNull = (viewModelLoginWithUsernamePassword) != (null);
                if (viewModelLoginWithUsernamePasswordJavaLangObjectNull) {




                    viewModelLoginWithUsernamePassword.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView12androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.displayName.getValue()
            //         is viewModel.displayName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView12);
            // localize variables for thread safety
            // viewModel.displayName
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
            // viewModel.displayName.getValue()
            java.lang.String viewModelDisplayNameGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.displayName != null
            boolean viewModelDisplayNameJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDisplayName = viewModel.getDisplayName();

                viewModelDisplayNameJavaLangObjectNull = (viewModelDisplayName) != (null);
                if (viewModelDisplayNameJavaLangObjectNull) {




                    viewModelDisplayName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.prefixError.getValue()
            //         is viewModel.prefixError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView4);
            // localize variables for thread safety
            // viewModel.prefixError
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrefixError = null;
            // viewModel.prefixError.getValue()
            java.lang.String viewModelPrefixErrorGetValue = null;
            // viewModel.prefixError != null
            boolean viewModelPrefixErrorJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPrefixError = viewModel.getPrefixError();

                viewModelPrefixErrorJavaLangObjectNull = (viewModelPrefixError) != (null);
                if (viewModelPrefixErrorJavaLangObjectNull) {




                    viewModelPrefixError.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.prefix.getValue()
            //         is viewModel.prefix.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.prefix.getValue()
            java.lang.String viewModelPrefixGetValue = null;
            // viewModel.prefix != null
            boolean viewModelPrefixJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.prefix
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrefix = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPrefix = viewModel.getPrefix();

                viewModelPrefixJavaLangObjectNull = (viewModelPrefix) != (null);
                if (viewModelPrefixJavaLangObjectNull) {




                    viewModelPrefix.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.phoneNumberError.getValue()
            //         is viewModel.phoneNumberError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView5);
            // localize variables for thread safety
            // viewModel.phoneNumberError.getValue()
            java.lang.String viewModelPhoneNumberErrorGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel.phoneNumberError
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumberError = null;
            // viewModel.phoneNumberError != null
            boolean viewModelPhoneNumberErrorJavaLangObjectNull = false;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPhoneNumberError = viewModel.getPhoneNumberError();

                viewModelPhoneNumberErrorJavaLangObjectNull = (viewModelPhoneNumberError) != (null);
                if (viewModelPhoneNumberErrorJavaLangObjectNull) {




                    viewModelPhoneNumberError.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.phoneNumber.getValue()
            //         is viewModel.phoneNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.phoneNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumber = null;
            // viewModel.phoneNumber != null
            boolean viewModelPhoneNumberJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel.phoneNumber.getValue()
            java.lang.String viewModelPhoneNumberGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPhoneNumber = viewModel.getPhoneNumber();

                viewModelPhoneNumberJavaLangObjectNull = (viewModelPhoneNumber) != (null);
                if (viewModelPhoneNumberJavaLangObjectNull) {




                    viewModelPhoneNumber.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.usernameError.getValue()
            //         is viewModel.usernameError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView7);
            // localize variables for thread safety
            // viewModel.usernameError.getValue()
            java.lang.String viewModelUsernameErrorGetValue = null;
            // viewModel.usernameError != null
            boolean viewModelUsernameErrorJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.usernameError
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsernameError = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUsernameError = viewModel.getUsernameError();

                viewModelUsernameErrorJavaLangObjectNull = (viewModelUsernameError) != (null);
                if (viewModelUsernameErrorJavaLangObjectNull) {




                    viewModelUsernameError.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.username.getValue()
            //         is viewModel.username.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewModel.username != null
            boolean viewModelUsernameJavaLangObjectNull = false;
            // viewModel.username.getValue()
            java.lang.String viewModelUsernameGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel.username
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsername = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUsername = viewModel.getUsername();

                viewModelUsernameJavaLangObjectNull = (viewModelUsername) != (null);
                if (viewModelUsernameJavaLangObjectNull) {




                    viewModelUsername.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.passwordError.getValue()
            //         is viewModel.passwordError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView8);
            // localize variables for thread safety
            // viewModel.passwordError
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordError = null;
            // viewModel.passwordError.getValue()
            java.lang.String viewModelPasswordErrorGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.passwordError != null
            boolean viewModelPasswordErrorJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPasswordError = viewModel.getPasswordError();

                viewModelPasswordErrorJavaLangObjectNull = (viewModelPasswordError) != (null);
                if (viewModelPasswordErrorJavaLangObjectNull) {




                    viewModelPasswordError.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.password.getValue()
            //         is viewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewModel.password != null
            boolean viewModelPasswordJavaLangObjectNull = false;
            // viewModel.password.getValue()
            java.lang.String viewModelPasswordGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
            // viewModel.password
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPassword = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPassword = viewModel.getPassword();

                viewModelPasswordJavaLangObjectNull = (viewModelPassword) != (null);
                if (viewModelPasswordJavaLangObjectNull) {




                    viewModelPassword.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public AssistantAccountLoginFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private AssistantAccountLoginFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 14
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[17]
            , (androidx.fragment.app.FragmentContainerView) bindings[15]
            , (com.google.android.material.textfield.TextInputLayout) bindings[18]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[14];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (com.google.android.material.textfield.TextInputEditText) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (com.google.android.material.textfield.TextInputEditText) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.selectCountry.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40000L;
        }
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
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.forgotPasswordClickListener == variableId) {
            setForgotPasswordClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.selectCountryClickListener == variableId) {
            setSelectCountryClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.infoClickListener == variableId) {
            setInfoClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.assistant.viewmodels.AccountLoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setForgotPasswordClickListener(@Nullable android.view.View.OnClickListener ForgotPasswordClickListener) {
        this.mForgotPasswordClickListener = ForgotPasswordClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.forgotPasswordClickListener);
        super.requestRebind();
    }
    public void setSelectCountryClickListener(@Nullable android.view.View.OnClickListener SelectCountryClickListener) {
        this.mSelectCountryClickListener = SelectCountryClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.selectCountryClickListener);
        super.requestRebind();
    }
    public void setInfoClickListener(@Nullable android.view.View.OnClickListener InfoClickListener) {
        this.mInfoClickListener = InfoClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.infoClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.assistant.viewmodels.AccountLoginViewModel ViewModel) {
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
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPrefixError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelPhoneNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPhoneNumberError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelLoginWithUsernamePassword((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelForceLoginUsingUsernameAndPassword((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelWaitForServerAnswer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelUsername((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelPrefix((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelUsernameError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeViewModelCountryName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeViewModelPasswordError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeViewModelLoginEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPrefixError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPrefixError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhoneNumber(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPhoneNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhoneNumberError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPhoneNumberError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoginWithUsernamePassword(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLoginWithUsernamePassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelForceLoginUsingUsernameAndPassword(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelForceLoginUsingUsernameAndPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWaitForServerAnswer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelWaitForServerAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsername(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPrefix(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPrefix, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsernameError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUsernameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCountryName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelCountryName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPasswordError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoginEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelLoginEnabled, int fieldId) {
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
        java.lang.String viewModelUsernameErrorGetValue = null;
        java.lang.String viewModelPrefixErrorGetValue = null;
        android.view.View.OnClickListener forgotPasswordClickListener = mForgotPasswordClickListener;
        int viewModelLoginWithUsernamePasswordViewGONEViewVISIBLE = 0;
        java.lang.String viewModelPasswordGetValue = null;
        int viewModelCountryNameLength = 0;
        java.lang.Boolean viewModelWaitForServerAnswerGetValue = null;
        java.lang.String viewModelCountryNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrefixError = null;
        int viewModelForceLoginUsingUsernameAndPasswordViewGONEViewVISIBLE = 0;
        android.view.View.OnClickListener selectCountryClickListener = mSelectCountryClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumber = null;
        android.view.View.OnClickListener infoClickListener = mInfoClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumberError = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoginWithUsernamePasswordGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoginEnabledGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLoginWithUsernamePassword = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelForceLoginUsingUsernameAndPassword = null;
        java.lang.String viewModelPasswordErrorGetValue = null;
        boolean viewModelCountryNameLengthInt0 = false;
        java.lang.Boolean viewModelForceLoginUsingUsernameAndPasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPassword = null;
        java.lang.Boolean viewModelLoginEnabledGetValue = null;
        int viewModelLoginWithUsernamePasswordViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWaitForServerAnswer = null;
        java.lang.String viewModelDisplayNameGetValue = null;
        java.lang.String viewModelUsernameGetValue = null;
        java.lang.String viewModelCountryNameLengthInt0ViewModelCountryNameSelectCountryAndroidStringSelectYourCountry = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelForceLoginUsingUsernameAndPasswordGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsername = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrefix = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsernameError = null;
        java.lang.String viewModelPrefixGetValue = null;
        java.lang.String viewModelPhoneNumberGetValue = null;
        java.lang.Boolean viewModelLoginWithUsernamePasswordGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelCountryName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordError = null;
        java.lang.String viewModelPhoneNumberErrorGetValue = null;
        org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelLoginEnabled = null;

        if ((dirtyFlags & 0x44000L) != 0) {
        }
        if ((dirtyFlags & 0x48000L) != 0) {
        }
        if ((dirtyFlags & 0x50000L) != 0) {
        }
        if ((dirtyFlags & 0x63fffL) != 0) {


            if ((dirtyFlags & 0x60001L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.prefixError
                        viewModelPrefixError = viewModel.getPrefixError();
                    }
                    updateLiveDataRegistration(0, viewModelPrefixError);


                    if (viewModelPrefixError != null) {
                        // read viewModel.prefixError.getValue()
                        viewModelPrefixErrorGetValue = viewModelPrefixError.getValue();
                    }
            }
            if ((dirtyFlags & 0x60002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phoneNumber
                        viewModelPhoneNumber = viewModel.getPhoneNumber();
                    }
                    updateLiveDataRegistration(1, viewModelPhoneNumber);


                    if (viewModelPhoneNumber != null) {
                        // read viewModel.phoneNumber.getValue()
                        viewModelPhoneNumberGetValue = viewModelPhoneNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0x60004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phoneNumberError
                        viewModelPhoneNumberError = viewModel.getPhoneNumberError();
                    }
                    updateLiveDataRegistration(2, viewModelPhoneNumberError);


                    if (viewModelPhoneNumberError != null) {
                        // read viewModel.phoneNumberError.getValue()
                        viewModelPhoneNumberErrorGetValue = viewModelPhoneNumberError.getValue();
                    }
            }
            if ((dirtyFlags & 0x60008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loginWithUsernamePassword
                        viewModelLoginWithUsernamePassword = viewModel.getLoginWithUsernamePassword();
                    }
                    updateLiveDataRegistration(3, viewModelLoginWithUsernamePassword);


                    if (viewModelLoginWithUsernamePassword != null) {
                        // read viewModel.loginWithUsernamePassword.getValue()
                        viewModelLoginWithUsernamePasswordGetValue = viewModelLoginWithUsernamePassword.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loginWithUsernamePassword.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoginWithUsernamePasswordGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoginWithUsernamePasswordGetValue);
                if((dirtyFlags & 0x60008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelLoginWithUsernamePasswordGetValue) {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loginWithUsernamePassword.getValue()) ? View.GONE : View.VISIBLE
                    viewModelLoginWithUsernamePasswordViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoginWithUsernamePasswordGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loginWithUsernamePassword.getValue()) ? View.VISIBLE : View.GONE
                    viewModelLoginWithUsernamePasswordViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelLoginWithUsernamePasswordGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x60010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.forceLoginUsingUsernameAndPassword
                        viewModelForceLoginUsingUsernameAndPassword = viewModel.getForceLoginUsingUsernameAndPassword();
                    }
                    updateLiveDataRegistration(4, viewModelForceLoginUsingUsernameAndPassword);


                    if (viewModelForceLoginUsingUsernameAndPassword != null) {
                        // read viewModel.forceLoginUsingUsernameAndPassword.getValue()
                        viewModelForceLoginUsingUsernameAndPasswordGetValue = viewModelForceLoginUsingUsernameAndPassword.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forceLoginUsingUsernameAndPassword.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelForceLoginUsingUsernameAndPasswordGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelForceLoginUsingUsernameAndPasswordGetValue);
                if((dirtyFlags & 0x60010L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelForceLoginUsingUsernameAndPasswordGetValue) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forceLoginUsingUsernameAndPassword.getValue()) ? View.GONE : View.VISIBLE
                    viewModelForceLoginUsingUsernameAndPasswordViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelForceLoginUsingUsernameAndPasswordGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x60020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayName
                        viewModelDisplayName = viewModel.getDisplayName();
                    }
                    updateLiveDataRegistration(5, viewModelDisplayName);


                    if (viewModelDisplayName != null) {
                        // read viewModel.displayName.getValue()
                        viewModelDisplayNameGetValue = viewModelDisplayName.getValue();
                    }
            }
            if ((dirtyFlags & 0x60040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.password
                        viewModelPassword = viewModel.getPassword();
                    }
                    updateLiveDataRegistration(6, viewModelPassword);


                    if (viewModelPassword != null) {
                        // read viewModel.password.getValue()
                        viewModelPasswordGetValue = viewModelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x60080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.waitForServerAnswer
                        viewModelWaitForServerAnswer = viewModel.getWaitForServerAnswer();
                    }
                    updateLiveDataRegistration(7, viewModelWaitForServerAnswer);


                    if (viewModelWaitForServerAnswer != null) {
                        // read viewModel.waitForServerAnswer.getValue()
                        viewModelWaitForServerAnswerGetValue = viewModelWaitForServerAnswer.getValue();
                    }
            }
            if ((dirtyFlags & 0x60100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.username
                        viewModelUsername = viewModel.getUsername();
                    }
                    updateLiveDataRegistration(8, viewModelUsername);


                    if (viewModelUsername != null) {
                        // read viewModel.username.getValue()
                        viewModelUsernameGetValue = viewModelUsername.getValue();
                    }
            }
            if ((dirtyFlags & 0x60200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.prefix
                        viewModelPrefix = viewModel.getPrefix();
                    }
                    updateLiveDataRegistration(9, viewModelPrefix);


                    if (viewModelPrefix != null) {
                        // read viewModel.prefix.getValue()
                        viewModelPrefixGetValue = viewModelPrefix.getValue();
                    }
            }
            if ((dirtyFlags & 0x60400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.usernameError
                        viewModelUsernameError = viewModel.getUsernameError();
                    }
                    updateLiveDataRegistration(10, viewModelUsernameError);


                    if (viewModelUsernameError != null) {
                        // read viewModel.usernameError.getValue()
                        viewModelUsernameErrorGetValue = viewModelUsernameError.getValue();
                    }
            }
            if ((dirtyFlags & 0x60800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.countryName
                        viewModelCountryName = viewModel.getCountryName();
                    }
                    updateLiveDataRegistration(11, viewModelCountryName);


                    if (viewModelCountryName != null) {
                        // read viewModel.countryName.getValue()
                        viewModelCountryNameGetValue = viewModelCountryName.getValue();
                    }


                    if (viewModelCountryNameGetValue != null) {
                        // read viewModel.countryName.getValue().length
                        viewModelCountryNameLength = viewModelCountryNameGetValue.length();
                    }


                    // read viewModel.countryName.getValue().length > 0
                    viewModelCountryNameLengthInt0 = (viewModelCountryNameLength) > (0);
                if((dirtyFlags & 0x60800L) != 0) {
                    if(viewModelCountryNameLengthInt0) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x61000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passwordError
                        viewModelPasswordError = viewModel.getPasswordError();
                    }
                    updateLiveDataRegistration(12, viewModelPasswordError);


                    if (viewModelPasswordError != null) {
                        // read viewModel.passwordError.getValue()
                        viewModelPasswordErrorGetValue = viewModelPasswordError.getValue();
                    }
            }
            if ((dirtyFlags & 0x62000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loginEnabled
                        viewModelLoginEnabled = viewModel.getLoginEnabled();
                    }
                    updateLiveDataRegistration(13, viewModelLoginEnabled);


                    if (viewModelLoginEnabled != null) {
                        // read viewModel.loginEnabled.getValue()
                        viewModelLoginEnabledGetValue = viewModelLoginEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loginEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoginEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoginEnabledGetValue);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x60800L) != 0) {

                // read viewModel.countryName.getValue().length > 0 ? viewModel.countryName.getValue() : @android:string/select_your_country
                viewModelCountryNameLengthInt0ViewModelCountryNameSelectCountryAndroidStringSelectYourCountry = ((viewModelCountryNameLengthInt0) ? (viewModelCountryNameGetValue) : (selectCountry.getResources().getString(R.string.select_your_country)));
        }
        // batch finished
        if ((dirtyFlags & 0x60080L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForServerAnswerGetValue);
        }
        if ((dirtyFlags & 0x60008L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelLoginWithUsernamePasswordViewGONEViewVISIBLE);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView11, androidxDatabindingViewDataBindingSafeUnboxViewModelLoginWithUsernamePasswordGetValue);
            this.mboundView6.setVisibility(viewModelLoginWithUsernamePasswordViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x60010L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelForceLoginUsingUsernameAndPasswordViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x40000L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView11, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView11androidCheckedAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView12, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView12androidTextAttrChanged);
            this.mboundView13.setOnClickListener(mCallback3);
            org.linphone.utils.DataBindingUtilsKt.addPrefixEditTextValidation(this.mboundView4, true);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView4, mboundView4errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.addPhoneNumberEditTextValidation(this.mboundView5, true);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView5, mboundView5errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView7, mboundView7errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView8, mboundView8errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x60020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, viewModelDisplayNameGetValue);
        }
        if ((dirtyFlags & 0x62000L) != 0) {
            // api target 1

            this.mboundView13.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelLoginEnabledGetValue);
        }
        if ((dirtyFlags & 0x50000L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(infoClickListener);
        }
        if ((dirtyFlags & 0x60001L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView4, viewModelPrefixErrorGetValue);
        }
        if ((dirtyFlags & 0x60200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelPrefixGetValue);
        }
        if ((dirtyFlags & 0x60004L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView5, viewModelPhoneNumberErrorGetValue);
        }
        if ((dirtyFlags & 0x60002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelPhoneNumberGetValue);
        }
        if ((dirtyFlags & 0x60400L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView7, viewModelUsernameErrorGetValue);
        }
        if ((dirtyFlags & 0x60100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelUsernameGetValue);
        }
        if ((dirtyFlags & 0x61000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView8, viewModelPasswordErrorGetValue);
        }
        if ((dirtyFlags & 0x60040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelPasswordGetValue);
        }
        if ((dirtyFlags & 0x44000L) != 0) {
            // api target 1

            this.mboundView9.setOnClickListener(forgotPasswordClickListener);
        }
        if ((dirtyFlags & 0x48000L) != 0) {
            // api target 1

            this.selectCountry.setOnClickListener(selectCountryClickListener);
        }
        if ((dirtyFlags & 0x60800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.selectCountry, viewModelCountryNameLengthInt0ViewModelCountryNameSelectCountryAndroidStringSelectYourCountry);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.assistant.viewmodels.AccountLoginViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.login();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.prefixError
        flag 1 (0x2L): viewModel.phoneNumber
        flag 2 (0x3L): viewModel.phoneNumberError
        flag 3 (0x4L): viewModel.loginWithUsernamePassword
        flag 4 (0x5L): viewModel.forceLoginUsingUsernameAndPassword
        flag 5 (0x6L): viewModel.displayName
        flag 6 (0x7L): viewModel.password
        flag 7 (0x8L): viewModel.waitForServerAnswer
        flag 8 (0x9L): viewModel.username
        flag 9 (0xaL): viewModel.prefix
        flag 10 (0xbL): viewModel.usernameError
        flag 11 (0xcL): viewModel.countryName
        flag 12 (0xdL): viewModel.passwordError
        flag 13 (0xeL): viewModel.loginEnabled
        flag 14 (0xfL): forgotPasswordClickListener
        flag 15 (0x10L): selectCountryClickListener
        flag 16 (0x11L): infoClickListener
        flag 17 (0x12L): viewModel
        flag 18 (0x13L): null
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loginWithUsernamePassword.getValue()) ? View.GONE : View.VISIBLE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loginWithUsernamePassword.getValue()) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forceLoginUsingUsernameAndPassword.getValue()) ? View.GONE : View.VISIBLE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forceLoginUsingUsernameAndPassword.getValue()) ? View.GONE : View.VISIBLE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loginWithUsernamePassword.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loginWithUsernamePassword.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.countryName.getValue().length > 0 ? viewModel.countryName.getValue() : @android:string/select_your_country
        flag 26 (0x1bL): viewModel.countryName.getValue().length > 0 ? viewModel.countryName.getValue() : @android:string/select_your_country
    flag mapping end*/
    //end
}