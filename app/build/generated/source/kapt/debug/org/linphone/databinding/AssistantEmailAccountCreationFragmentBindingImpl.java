package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AssistantEmailAccountCreationFragmentBindingImpl extends AssistantEmailAccountCreationFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {7},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar_fragment, 8);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback68;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.usernameError.getValue()
            //         is viewModel.usernameError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView1);
            // localize variables for thread safety
            // viewModel.usernameError.getValue()
            java.lang.String viewModelUsernameErrorGetValue = null;
            // viewModel.usernameError != null
            boolean viewModelUsernameErrorJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.username.getValue()
            //         is viewModel.username.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.username != null
            boolean viewModelUsernameJavaLangObjectNull = false;
            // viewModel.username.getValue()
            java.lang.String viewModelUsernameGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView2errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.emailError.getValue()
            //         is viewModel.emailError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView2);
            // localize variables for thread safety
            // viewModel.emailError.getValue()
            java.lang.String viewModelEmailErrorGetValue = null;
            // viewModel.emailError
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmailError = null;
            // viewModel.emailError != null
            boolean viewModelEmailErrorJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEmailError = viewModel.getEmailError();

                viewModelEmailErrorJavaLangObjectNull = (viewModelEmailError) != (null);
                if (viewModelEmailErrorJavaLangObjectNull) {




                    viewModelEmailError.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.email.getValue()
            //         is viewModel.email.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.email.getValue()
            java.lang.String viewModelEmailGetValue = null;
            // viewModel.email
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmail = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.email != null
            boolean viewModelEmailJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEmail = viewModel.getEmail();

                viewModelEmailJavaLangObjectNull = (viewModelEmail) != (null);
                if (viewModelEmailJavaLangObjectNull) {




                    viewModelEmail.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView3errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.passwordError.getValue()
            //         is viewModel.passwordError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView3);
            // localize variables for thread safety
            // viewModel.passwordError
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordError = null;
            // viewModel.passwordError.getValue()
            java.lang.String viewModelPasswordErrorGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.password.getValue()
            //         is viewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.password != null
            boolean viewModelPasswordJavaLangObjectNull = false;
            // viewModel.password.getValue()
            java.lang.String viewModelPasswordGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.displayName.getValue()
            //         is viewModel.displayName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.displayName
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
            // viewModel.displayName.getValue()
            java.lang.String viewModelDisplayNameGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener passwordConfirmationerrorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.passwordConfirmationError.getValue()
            //         is viewModel.passwordConfirmationError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(passwordConfirmation);
            // localize variables for thread safety
            // viewModel.passwordConfirmationError != null
            boolean viewModelPasswordConfirmationErrorJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.passwordConfirmationError.getValue()
            java.lang.String viewModelPasswordConfirmationErrorGetValue = null;
            // viewModel.passwordConfirmationError
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordConfirmationError = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPasswordConfirmationError = viewModel.getPasswordConfirmationError();

                viewModelPasswordConfirmationErrorJavaLangObjectNull = (viewModelPasswordConfirmationError) != (null);
                if (viewModelPasswordConfirmationErrorJavaLangObjectNull) {




                    viewModelPasswordConfirmationError.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener passwordConfirmationandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.passwordConfirmation.getValue()
            //         is viewModel.passwordConfirmation.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(passwordConfirmation);
            // localize variables for thread safety
            // viewModel.passwordConfirmation
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordConfirmation = null;
            // viewModel.passwordConfirmation.getValue()
            java.lang.String viewModelPasswordConfirmationGetValue = null;
            // viewModel.passwordConfirmation != null
            boolean viewModelPasswordConfirmationJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelPasswordConfirmation = viewModel.getPasswordConfirmation();

                viewModelPasswordConfirmationJavaLangObjectNull = (viewModelPasswordConfirmation) != (null);
                if (viewModelPasswordConfirmationJavaLangObjectNull) {




                    viewModelPasswordConfirmation.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public AssistantEmailAccountCreationFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private AssistantEmailAccountCreationFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (androidx.fragment.app.FragmentContainerView) bindings[8]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[7];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.passwordConfirmation.setTag(null);
        setRootTag(root);
        // listeners
        mCallback68 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
        if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
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
                return onChangeViewModelWaitForServerAnswer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelEmailError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelUsername((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelCreateEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelUsernameError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelPasswordConfirmation((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelEmail((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelPasswordConfirmationError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelPasswordError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelWaitForServerAnswer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelWaitForServerAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmailError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEmailError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsername(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCreateEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelCreateEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsernameError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUsernameError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPasswordConfirmation(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPasswordConfirmation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEmail(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEmail, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPasswordConfirmationError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPasswordConfirmationError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPasswordError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPasswordError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPassword, int fieldId) {
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
        java.lang.String viewModelEmailGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWaitForServerAnswer = null;
        java.lang.String viewModelEmailErrorGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelCreateEnabledGetValue = false;
        java.lang.String viewModelDisplayNameGetValue = null;
        java.lang.String viewModelPasswordGetValue = null;
        java.lang.String viewModelUsernameGetValue = null;
        java.lang.Boolean viewModelWaitForServerAnswerGetValue = null;
        java.lang.Boolean viewModelCreateEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmailError = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsername = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelCreateEnabled = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsernameError = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordConfirmation = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEmail = null;
        java.lang.String viewModelPasswordErrorGetValue = null;
        java.lang.String viewModelPasswordConfirmationErrorGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordConfirmationError = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPasswordError = null;
        java.lang.String viewModelPasswordConfirmationGetValue = null;
        org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPassword = null;

        if ((dirtyFlags & 0x1fffL) != 0) {


            if ((dirtyFlags & 0x1801L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.waitForServerAnswer
                        viewModelWaitForServerAnswer = viewModel.getWaitForServerAnswer();
                    }
                    updateLiveDataRegistration(0, viewModelWaitForServerAnswer);


                    if (viewModelWaitForServerAnswer != null) {
                        // read viewModel.waitForServerAnswer.getValue()
                        viewModelWaitForServerAnswerGetValue = viewModelWaitForServerAnswer.getValue();
                    }
            }
            if ((dirtyFlags & 0x1802L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.emailError
                        viewModelEmailError = viewModel.getEmailError();
                    }
                    updateLiveDataRegistration(1, viewModelEmailError);


                    if (viewModelEmailError != null) {
                        // read viewModel.emailError.getValue()
                        viewModelEmailErrorGetValue = viewModelEmailError.getValue();
                    }
            }
            if ((dirtyFlags & 0x1804L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.username
                        viewModelUsername = viewModel.getUsername();
                    }
                    updateLiveDataRegistration(2, viewModelUsername);


                    if (viewModelUsername != null) {
                        // read viewModel.username.getValue()
                        viewModelUsernameGetValue = viewModelUsername.getValue();
                    }
            }
            if ((dirtyFlags & 0x1808L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.createEnabled
                        viewModelCreateEnabled = viewModel.getCreateEnabled();
                    }
                    updateLiveDataRegistration(3, viewModelCreateEnabled);


                    if (viewModelCreateEnabled != null) {
                        // read viewModel.createEnabled.getValue()
                        viewModelCreateEnabledGetValue = viewModelCreateEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.createEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCreateEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCreateEnabledGetValue);
            }
            if ((dirtyFlags & 0x1810L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.usernameError
                        viewModelUsernameError = viewModel.getUsernameError();
                    }
                    updateLiveDataRegistration(4, viewModelUsernameError);


                    if (viewModelUsernameError != null) {
                        // read viewModel.usernameError.getValue()
                        viewModelUsernameErrorGetValue = viewModelUsernameError.getValue();
                    }
            }
            if ((dirtyFlags & 0x1820L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passwordConfirmation
                        viewModelPasswordConfirmation = viewModel.getPasswordConfirmation();
                    }
                    updateLiveDataRegistration(5, viewModelPasswordConfirmation);


                    if (viewModelPasswordConfirmation != null) {
                        // read viewModel.passwordConfirmation.getValue()
                        viewModelPasswordConfirmationGetValue = viewModelPasswordConfirmation.getValue();
                    }
            }
            if ((dirtyFlags & 0x1840L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.email
                        viewModelEmail = viewModel.getEmail();
                    }
                    updateLiveDataRegistration(6, viewModelEmail);


                    if (viewModelEmail != null) {
                        // read viewModel.email.getValue()
                        viewModelEmailGetValue = viewModelEmail.getValue();
                    }
            }
            if ((dirtyFlags & 0x1880L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passwordConfirmationError
                        viewModelPasswordConfirmationError = viewModel.getPasswordConfirmationError();
                    }
                    updateLiveDataRegistration(7, viewModelPasswordConfirmationError);


                    if (viewModelPasswordConfirmationError != null) {
                        // read viewModel.passwordConfirmationError.getValue()
                        viewModelPasswordConfirmationErrorGetValue = viewModelPasswordConfirmationError.getValue();
                    }
            }
            if ((dirtyFlags & 0x1900L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayName
                        viewModelDisplayName = viewModel.getDisplayName();
                    }
                    updateLiveDataRegistration(8, viewModelDisplayName);


                    if (viewModelDisplayName != null) {
                        // read viewModel.displayName.getValue()
                        viewModelDisplayNameGetValue = viewModelDisplayName.getValue();
                    }
            }
            if ((dirtyFlags & 0x1a00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passwordError
                        viewModelPasswordError = viewModel.getPasswordError();
                    }
                    updateLiveDataRegistration(9, viewModelPasswordError);


                    if (viewModelPasswordError != null) {
                        // read viewModel.passwordError.getValue()
                        viewModelPasswordErrorGetValue = viewModelPasswordError.getValue();
                    }
            }
            if ((dirtyFlags & 0x1c00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.password
                        viewModelPassword = viewModel.getPassword();
                    }
                    updateLiveDataRegistration(10, viewModelPassword);


                    if (viewModelPassword != null) {
                        // read viewModel.password.getValue()
                        viewModelPasswordGetValue = viewModelPassword.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForServerAnswerGetValue);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.addUsernameEditTextValidation(this.mboundView1, true);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView1, mboundView1errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView2, mboundView2errorMessageAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.addEmailEditTextValidation(this.mboundView2, true);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView3, mboundView3errorMessageAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.addPasswordConfirmationEditTextValidation(this.mboundView3, passwordConfirmation);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.mboundView6.setOnClickListener(mCallback68);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.passwordConfirmation, passwordConfirmationerrorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.passwordConfirmation, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, passwordConfirmationandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1810L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView1, viewModelUsernameErrorGetValue);
        }
        if ((dirtyFlags & 0x1804L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelUsernameGetValue);
        }
        if ((dirtyFlags & 0x1802L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView2, viewModelEmailErrorGetValue);
        }
        if ((dirtyFlags & 0x1840L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelEmailGetValue);
        }
        if ((dirtyFlags & 0x1a00L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView3, viewModelPasswordErrorGetValue);
        }
        if ((dirtyFlags & 0x1c00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelPasswordGetValue);
        }
        if ((dirtyFlags & 0x1900L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelDisplayNameGetValue);
        }
        if ((dirtyFlags & 0x1808L) != 0) {
            // api target 1

            this.mboundView6.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelCreateEnabledGetValue);
        }
        if ((dirtyFlags & 0x1880L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.passwordConfirmation, viewModelPasswordConfirmationErrorGetValue);
        }
        if ((dirtyFlags & 0x1820L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.passwordConfirmation, viewModelPasswordConfirmationGetValue);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.assistant.viewmodels.EmailAccountCreationViewModel viewModel = mViewModel;
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
        flag 0 (0x1L): viewModel.waitForServerAnswer
        flag 1 (0x2L): viewModel.emailError
        flag 2 (0x3L): viewModel.username
        flag 3 (0x4L): viewModel.createEnabled
        flag 4 (0x5L): viewModel.usernameError
        flag 5 (0x6L): viewModel.passwordConfirmation
        flag 6 (0x7L): viewModel.email
        flag 7 (0x8L): viewModel.passwordConfirmationError
        flag 8 (0x9L): viewModel.displayName
        flag 9 (0xaL): viewModel.passwordError
        flag 10 (0xbL): viewModel.password
        flag 11 (0xcL): viewModel
        flag 12 (0xdL): null
    flag mapping end*/
    //end
}