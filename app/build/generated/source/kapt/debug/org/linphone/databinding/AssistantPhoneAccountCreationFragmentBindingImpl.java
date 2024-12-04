package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AssistantPhoneAccountCreationFragmentBindingImpl extends AssistantPhoneAccountCreationFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {10},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar_fragment, 11);
        sViewsWithIds.put(R.id.select_country_label, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView7;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback72;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView3errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.prefixError.getValue()
            //         is viewModel.prefixError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView3);
            // localize variables for thread safety
            // viewModel.prefixError
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrefixError = null;
            // viewModel.prefixError.getValue()
            java.lang.String viewModelPrefixErrorGetValue = null;
            // viewModel.prefixError != null
            boolean viewModelPrefixErrorJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.prefix.getValue()
            //         is viewModel.prefix.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.prefix.getValue()
            java.lang.String viewModelPrefixGetValue = null;
            // viewModel.prefix != null
            boolean viewModelPrefixJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView4errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.phoneNumberError.getValue()
            //         is viewModel.phoneNumberError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView4);
            // localize variables for thread safety
            // viewModel.phoneNumberError.getValue()
            java.lang.String viewModelPhoneNumberErrorGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.phoneNumber.getValue()
            //         is viewModel.phoneNumber.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.phoneNumber
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumber = null;
            // viewModel.phoneNumber != null
            boolean viewModelPhoneNumberJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView5androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.useUsername.getValue()
            //         is viewModel.useUsername.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView5.isChecked();
            // localize variables for thread safety
            // viewModel.useUsername
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelUseUsername = null;
            // viewModel.useUsername.getValue()
            java.lang.Boolean viewModelUseUsernameGetValue = null;
            // viewModel.useUsername != null
            boolean viewModelUseUsernameJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUseUsername = viewModel.getUseUsername();

                viewModelUseUsernameJavaLangObjectNull = (viewModelUseUsername) != (null);
                if (viewModelUseUsernameJavaLangObjectNull) {




                    viewModelUseUsername.setValue(((java.lang.Boolean) (callbackArg_0)));
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
            org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;
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
            org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView8androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.displayName.getValue()
            //         is viewModel.displayName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView8);
            // localize variables for thread safety
            // viewModel.displayName
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
            // viewModel.displayName.getValue()
            java.lang.String viewModelDisplayNameGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;
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

    public AssistantPhoneAccountCreationFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private AssistantPhoneAccountCreationFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (androidx.fragment.app.FragmentContainerView) bindings[11]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[10];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputLayout) bindings[6];
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
        mCallback72 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4000L;
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
        if (BR.selectCountryClickListener == variableId) {
            setSelectCountryClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.infoClickListener == variableId) {
            setInfoClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelectCountryClickListener(@Nullable android.view.View.OnClickListener SelectCountryClickListener) {
        this.mSelectCountryClickListener = SelectCountryClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.selectCountryClickListener);
        super.requestRebind();
    }
    public void setInfoClickListener(@Nullable android.view.View.OnClickListener InfoClickListener) {
        this.mInfoClickListener = InfoClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.infoClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
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
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelWaitForServerAnswer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelUseUsername((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelUsername((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelCreateEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelPrefix((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelUsernameError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelCountryName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
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
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWaitForServerAnswer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelWaitForServerAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUseUsername(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelUseUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsername(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCreateEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelCreateEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPrefix(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPrefix, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsernameError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUsernameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCountryName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelCountryName, int fieldId) {
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
        java.lang.String viewModelUsernameErrorGetValue = null;
        java.lang.String viewModelPrefixErrorGetValue = null;
        int viewModelCountryNameLength = 0;
        java.lang.Boolean viewModelWaitForServerAnswerGetValue = null;
        java.lang.String viewModelCountryNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrefixError = null;
        java.lang.Boolean viewModelCreateEnabledGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelUseUsernameGetValue = false;
        android.view.View.OnClickListener selectCountryClickListener = mSelectCountryClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumber = null;
        android.view.View.OnClickListener infoClickListener = mInfoClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumberError = null;
        boolean viewModelCountryNameLengthInt0 = false;
        int viewModelUseUsernameViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWaitForServerAnswer = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelCreateEnabledGetValue = false;
        java.lang.String viewModelDisplayNameGetValue = null;
        java.lang.Boolean viewModelUseUsernameGetValue = null;
        java.lang.String viewModelUsernameGetValue = null;
        java.lang.String viewModelCountryNameLengthInt0ViewModelCountryNameSelectCountryAndroidStringSelectYourCountry = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelUseUsername = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsername = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelCreateEnabled = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrefix = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsernameError = null;
        java.lang.String viewModelPrefixGetValue = null;
        java.lang.String viewModelPhoneNumberGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelCountryName = null;
        java.lang.String viewModelPhoneNumberErrorGetValue = null;
        org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x4800L) != 0) {
        }
        if ((dirtyFlags & 0x5000L) != 0) {
        }
        if ((dirtyFlags & 0x67ffL) != 0) {


            if ((dirtyFlags & 0x6001L) != 0) {

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
            if ((dirtyFlags & 0x6002L) != 0) {

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
            if ((dirtyFlags & 0x6004L) != 0) {

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
            if ((dirtyFlags & 0x6008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayName
                        viewModelDisplayName = viewModel.getDisplayName();
                    }
                    updateLiveDataRegistration(3, viewModelDisplayName);


                    if (viewModelDisplayName != null) {
                        // read viewModel.displayName.getValue()
                        viewModelDisplayNameGetValue = viewModelDisplayName.getValue();
                    }
            }
            if ((dirtyFlags & 0x6010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.waitForServerAnswer
                        viewModelWaitForServerAnswer = viewModel.getWaitForServerAnswer();
                    }
                    updateLiveDataRegistration(4, viewModelWaitForServerAnswer);


                    if (viewModelWaitForServerAnswer != null) {
                        // read viewModel.waitForServerAnswer.getValue()
                        viewModelWaitForServerAnswerGetValue = viewModelWaitForServerAnswer.getValue();
                    }
            }
            if ((dirtyFlags & 0x6020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.useUsername
                        viewModelUseUsername = viewModel.getUseUsername();
                    }
                    updateLiveDataRegistration(5, viewModelUseUsername);


                    if (viewModelUseUsername != null) {
                        // read viewModel.useUsername.getValue()
                        viewModelUseUsernameGetValue = viewModelUseUsername.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.useUsername.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelUseUsernameGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelUseUsernameGetValue);
                if((dirtyFlags & 0x6020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelUseUsernameGetValue) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.useUsername.getValue()) ? View.VISIBLE : View.GONE
                    viewModelUseUsernameViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelUseUsernameGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x6040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.username
                        viewModelUsername = viewModel.getUsername();
                    }
                    updateLiveDataRegistration(6, viewModelUsername);


                    if (viewModelUsername != null) {
                        // read viewModel.username.getValue()
                        viewModelUsernameGetValue = viewModelUsername.getValue();
                    }
            }
            if ((dirtyFlags & 0x6080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.createEnabled
                        viewModelCreateEnabled = viewModel.getCreateEnabled();
                    }
                    updateLiveDataRegistration(7, viewModelCreateEnabled);


                    if (viewModelCreateEnabled != null) {
                        // read viewModel.createEnabled.getValue()
                        viewModelCreateEnabledGetValue = viewModelCreateEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.createEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCreateEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCreateEnabledGetValue);
            }
            if ((dirtyFlags & 0x6100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.prefix
                        viewModelPrefix = viewModel.getPrefix();
                    }
                    updateLiveDataRegistration(8, viewModelPrefix);


                    if (viewModelPrefix != null) {
                        // read viewModel.prefix.getValue()
                        viewModelPrefixGetValue = viewModelPrefix.getValue();
                    }
            }
            if ((dirtyFlags & 0x6200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.usernameError
                        viewModelUsernameError = viewModel.getUsernameError();
                    }
                    updateLiveDataRegistration(9, viewModelUsernameError);


                    if (viewModelUsernameError != null) {
                        // read viewModel.usernameError.getValue()
                        viewModelUsernameErrorGetValue = viewModelUsernameError.getValue();
                    }
            }
            if ((dirtyFlags & 0x6400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.countryName
                        viewModelCountryName = viewModel.getCountryName();
                    }
                    updateLiveDataRegistration(10, viewModelCountryName);


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
                if((dirtyFlags & 0x6400L) != 0) {
                    if(viewModelCountryNameLengthInt0) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x6400L) != 0) {

                // read viewModel.countryName.getValue().length > 0 ? viewModel.countryName.getValue() : @android:string/select_your_country
                viewModelCountryNameLengthInt0ViewModelCountryNameSelectCountryAndroidStringSelectYourCountry = ((viewModelCountryNameLengthInt0) ? (viewModelCountryNameGetValue) : (selectCountry.getResources().getString(R.string.select_your_country)));
        }
        // batch finished
        if ((dirtyFlags & 0x6010L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForServerAnswerGetValue);
        }
        if ((dirtyFlags & 0x5000L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(infoClickListener);
        }
        if ((dirtyFlags & 0x4000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.addPrefixEditTextValidation(this.mboundView3, true);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView3, mboundView3errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.addPhoneNumberEditTextValidation(this.mboundView4, true);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView4, mboundView4errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView5, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView5androidCheckedAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.addUsernameEditTextValidation(this.mboundView7, true);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView7, mboundView7errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView8, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView8androidTextAttrChanged);
            this.mboundView9.setOnClickListener(mCallback72);
        }
        if ((dirtyFlags & 0x6001L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView3, viewModelPrefixErrorGetValue);
        }
        if ((dirtyFlags & 0x6100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelPrefixGetValue);
        }
        if ((dirtyFlags & 0x6004L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView4, viewModelPhoneNumberErrorGetValue);
        }
        if ((dirtyFlags & 0x6002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelPhoneNumberGetValue);
        }
        if ((dirtyFlags & 0x6020L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView5, androidxDatabindingViewDataBindingSafeUnboxViewModelUseUsernameGetValue);
            this.mboundView6.setVisibility(viewModelUseUsernameViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6200L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView7, viewModelUsernameErrorGetValue);
        }
        if ((dirtyFlags & 0x6040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelUsernameGetValue);
        }
        if ((dirtyFlags & 0x6008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, viewModelDisplayNameGetValue);
        }
        if ((dirtyFlags & 0x6080L) != 0) {
            // api target 1

            this.mboundView9.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelCreateEnabledGetValue);
        }
        if ((dirtyFlags & 0x4800L) != 0) {
            // api target 1

            this.selectCountry.setOnClickListener(selectCountryClickListener);
        }
        if ((dirtyFlags & 0x6400L) != 0) {
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
        org.linphone.activities.assistant.viewmodels.PhoneAccountCreationViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.create();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.prefixError
        flag 1 (0x2L): viewModel.phoneNumber
        flag 2 (0x3L): viewModel.phoneNumberError
        flag 3 (0x4L): viewModel.displayName
        flag 4 (0x5L): viewModel.waitForServerAnswer
        flag 5 (0x6L): viewModel.useUsername
        flag 6 (0x7L): viewModel.username
        flag 7 (0x8L): viewModel.createEnabled
        flag 8 (0x9L): viewModel.prefix
        flag 9 (0xaL): viewModel.usernameError
        flag 10 (0xbL): viewModel.countryName
        flag 11 (0xcL): selectCountryClickListener
        flag 12 (0xdL): infoClickListener
        flag 13 (0xeL): viewModel
        flag 14 (0xfL): null
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.useUsername.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.useUsername.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.countryName.getValue().length > 0 ? viewModel.countryName.getValue() : @android:string/select_your_country
        flag 18 (0x13L): viewModel.countryName.getValue().length > 0 ? viewModel.countryName.getValue() : @android:string/select_your_country
    flag mapping end*/
    //end
}