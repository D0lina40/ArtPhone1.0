package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AssistantPhoneAccountValidationFragmentBindingImpl extends AssistantPhoneAccountValidationFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback211;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.code.getValue()
            //         is viewModel.code.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.code != null
            boolean viewModelCodeJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.assistant.viewmodels.PhoneAccountValidationViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.code
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelCode = null;
            // viewModel.code.getValue()
            java.lang.String viewModelCodeGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelCode = viewModel.getCode();

                viewModelCodeJavaLangObjectNull = (viewModelCode) != (null);
                if (viewModelCodeJavaLangObjectNull) {




                    viewModelCode.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public AssistantPhoneAccountValidationFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private AssistantPhoneAccountValidationFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (androidx.fragment.app.FragmentContainerView) bindings[8]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[7];
        setContainedBinding(this.mboundView01);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.titleAccountCreation.setTag(null);
        this.titleAccountLinking.setTag(null);
        this.titleAccountLogin.setTag(null);
        setRootTag(root);
        // listeners
        mCallback211 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            setViewModel((org.linphone.activities.assistant.viewmodels.PhoneAccountValidationViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.assistant.viewmodels.PhoneAccountValidationViewModel ViewModel) {
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
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelWaitForServerAnswer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsLinking((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelIsCreation((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelPhoneNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelIsLogin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelCode((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
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
    private boolean onChangeViewModelIsLinking(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLinking, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsCreation(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsCreation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhoneNumber(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPhoneNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLogin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLogin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCode(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWaitForServerAnswer = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoginGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsCreationGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLinking = null;
        java.lang.Boolean viewModelWaitForServerAnswerGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsCreation = null;
        int viewModelIsLoginViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumber = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLogin = null;
        java.lang.Boolean viewModelIsLoginGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelCode = null;
        int viewModelCodeLength = 0;
        java.lang.String viewModelPhoneNumberGetValue = null;
        java.lang.Boolean viewModelIsCreationGetValue = null;
        java.lang.String viewModelCodeGetValue = null;
        int viewModelIsCreationViewVISIBLEViewGONE = 0;
        int viewModelIsLinkingViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLinkingGetValue = false;
        java.lang.Boolean viewModelIsLinkingGetValue = null;
        org.linphone.activities.assistant.viewmodels.PhoneAccountValidationViewModel viewModel = mViewModel;
        boolean viewModelCodeLengthInt0 = false;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

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
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLinking
                        viewModelIsLinking = viewModel.isLinking();
                    }
                    updateLiveDataRegistration(1, viewModelIsLinking);


                    if (viewModelIsLinking != null) {
                        // read viewModel.isLinking.getValue()
                        viewModelIsLinkingGetValue = viewModelIsLinking.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLinking.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLinkingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLinkingGetValue);
                if((dirtyFlags & 0xc2L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLinkingGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLinking.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLinkingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLinkingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isCreation
                        viewModelIsCreation = viewModel.isCreation();
                    }
                    updateLiveDataRegistration(2, viewModelIsCreation);


                    if (viewModelIsCreation != null) {
                        // read viewModel.isCreation.getValue()
                        viewModelIsCreationGetValue = viewModelIsCreation.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCreation.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsCreationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsCreationGetValue);
                if((dirtyFlags & 0xc4L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsCreationGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCreation.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsCreationViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsCreationGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phoneNumber
                        viewModelPhoneNumber = viewModel.getPhoneNumber();
                    }
                    updateLiveDataRegistration(3, viewModelPhoneNumber);


                    if (viewModelPhoneNumber != null) {
                        // read viewModel.phoneNumber.getValue()
                        viewModelPhoneNumberGetValue = viewModelPhoneNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLogin
                        viewModelIsLogin = viewModel.isLogin();
                    }
                    updateLiveDataRegistration(4, viewModelIsLogin);


                    if (viewModelIsLogin != null) {
                        // read viewModel.isLogin.getValue()
                        viewModelIsLoginGetValue = viewModelIsLogin.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLogin.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoginGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoginGetValue);
                if((dirtyFlags & 0xd0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoginGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLogin.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsLoginViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoginGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.code
                        viewModelCode = viewModel.getCode();
                    }
                    updateLiveDataRegistration(5, viewModelCode);


                    if (viewModelCode != null) {
                        // read viewModel.code.getValue()
                        viewModelCodeGetValue = viewModelCode.getValue();
                    }


                    if (viewModelCodeGetValue != null) {
                        // read viewModel.code.getValue().length()
                        viewModelCodeLength = viewModelCodeGetValue.length();
                    }


                    // read viewModel.code.getValue().length() > 0
                    viewModelCodeLengthInt0 = (viewModelCodeLength) > (0);
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForServerAnswerGetValue);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelPhoneNumberGetValue);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelCodeGetValue);
            this.mboundView6.setEnabled(viewModelCodeLengthInt0);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.mboundView6.setOnClickListener(mCallback211);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.titleAccountCreation.setVisibility(viewModelIsCreationViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.titleAccountLinking.setVisibility(viewModelIsLinkingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            this.titleAccountLogin.setVisibility(viewModelIsLoginViewVISIBLEViewGONE);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.assistant.viewmodels.PhoneAccountValidationViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.finish();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.waitForServerAnswer
        flag 1 (0x2L): viewModel.isLinking
        flag 2 (0x3L): viewModel.isCreation
        flag 3 (0x4L): viewModel.phoneNumber
        flag 4 (0x5L): viewModel.isLogin
        flag 5 (0x6L): viewModel.code
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLogin.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLogin.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCreation.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isCreation.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLinking.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLinking.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}