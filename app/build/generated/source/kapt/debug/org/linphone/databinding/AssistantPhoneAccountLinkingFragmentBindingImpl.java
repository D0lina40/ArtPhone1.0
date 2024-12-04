package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AssistantPhoneAccountLinkingFragmentBindingImpl extends AssistantPhoneAccountLinkingFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {8},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar_fragment, 9);
        sViewsWithIds.put(R.id.select_country_label, 10);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback94;
    @Nullable
    private final android.view.View.OnClickListener mCallback93;
    // values
    // listeners
    // Inverse Binding Event Handlers
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
            org.linphone.activities.assistant.viewmodels.PhoneAccountLinkingViewModel viewModel = mViewModel;
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
            org.linphone.activities.assistant.viewmodels.PhoneAccountLinkingViewModel viewModel = mViewModel;
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
            org.linphone.activities.assistant.viewmodels.PhoneAccountLinkingViewModel viewModel = mViewModel;
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
            org.linphone.activities.assistant.viewmodels.PhoneAccountLinkingViewModel viewModel = mViewModel;
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

    public AssistantPhoneAccountLinkingFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private AssistantPhoneAccountLinkingFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 9
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[10]
            , (androidx.fragment.app.FragmentContainerView) bindings[9]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[8];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.selectCountry.setTag(null);
        setRootTag(root);
        // listeners
        mCallback94 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback93 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
        if (BR.selectCountryClickListener == variableId) {
            setSelectCountryClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.infoClickListener == variableId) {
            setInfoClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.assistant.viewmodels.PhoneAccountLinkingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelectCountryClickListener(@Nullable android.view.View.OnClickListener SelectCountryClickListener) {
        this.mSelectCountryClickListener = SelectCountryClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.selectCountryClickListener);
        super.requestRebind();
    }
    public void setInfoClickListener(@Nullable android.view.View.OnClickListener InfoClickListener) {
        this.mInfoClickListener = InfoClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.infoClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.assistant.viewmodels.PhoneAccountLinkingViewModel ViewModel) {
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
                return onChangeViewModelPrefixError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelPhoneNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelUsername((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelPhoneNumberError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelPrefix((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelCountryName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelLinkEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelAllowSkip((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeViewModelPrefixError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPrefixError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhoneNumber(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPhoneNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUsername(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUsername, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPhoneNumberError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPhoneNumberError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPrefix(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPrefix, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCountryName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelCountryName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLinkEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelLinkEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAllowSkip(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAllowSkip, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
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
        java.lang.String viewModelPrefixErrorGetValue = null;
        java.lang.String viewModelUsernameGetValue = null;
        int viewModelCountryNameLength = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAllowSkipGetValue = false;
        java.lang.String viewModelCountryNameLengthInt0ViewModelCountryNameSelectCountryAndroidStringSelectYourCountry = null;
        java.lang.Boolean viewModelWaitForServerAnswerGetValue = null;
        java.lang.String viewModelCountryNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrefixError = null;
        android.view.View.OnClickListener selectCountryClickListener = mSelectCountryClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumber = null;
        java.lang.Boolean viewModelLinkEnabledGetValue = null;
        android.view.View.OnClickListener infoClickListener = mInfoClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsername = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPhoneNumberError = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPrefix = null;
        java.lang.String viewModelPrefixGetValue = null;
        java.lang.Boolean viewModelAllowSkipGetValue = null;
        java.lang.String viewModelPhoneNumberGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLinkEnabledGetValue = false;
        boolean viewModelCountryNameLengthInt0 = false;
        int viewModelAllowSkipViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelCountryName = null;
        java.lang.String viewModelPhoneNumberErrorGetValue = null;
        org.linphone.activities.assistant.viewmodels.PhoneAccountLinkingViewModel viewModel = mViewModel;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelLinkEnabled = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAllowSkip = null;

        if ((dirtyFlags & 0x1200L) != 0) {
        }
        if ((dirtyFlags & 0x1400L) != 0) {
        }
        if ((dirtyFlags & 0x19ffL) != 0) {


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
                        // read viewModel.prefixError
                        viewModelPrefixError = viewModel.getPrefixError();
                    }
                    updateLiveDataRegistration(1, viewModelPrefixError);


                    if (viewModelPrefixError != null) {
                        // read viewModel.prefixError.getValue()
                        viewModelPrefixErrorGetValue = viewModelPrefixError.getValue();
                    }
            }
            if ((dirtyFlags & 0x1804L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phoneNumber
                        viewModelPhoneNumber = viewModel.getPhoneNumber();
                    }
                    updateLiveDataRegistration(2, viewModelPhoneNumber);


                    if (viewModelPhoneNumber != null) {
                        // read viewModel.phoneNumber.getValue()
                        viewModelPhoneNumberGetValue = viewModelPhoneNumber.getValue();
                    }
            }
            if ((dirtyFlags & 0x1808L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.username
                        viewModelUsername = viewModel.getUsername();
                    }
                    updateLiveDataRegistration(3, viewModelUsername);


                    if (viewModelUsername != null) {
                        // read viewModel.username.getValue()
                        viewModelUsernameGetValue = viewModelUsername.getValue();
                    }
            }
            if ((dirtyFlags & 0x1810L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.phoneNumberError
                        viewModelPhoneNumberError = viewModel.getPhoneNumberError();
                    }
                    updateLiveDataRegistration(4, viewModelPhoneNumberError);


                    if (viewModelPhoneNumberError != null) {
                        // read viewModel.phoneNumberError.getValue()
                        viewModelPhoneNumberErrorGetValue = viewModelPhoneNumberError.getValue();
                    }
            }
            if ((dirtyFlags & 0x1820L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.prefix
                        viewModelPrefix = viewModel.getPrefix();
                    }
                    updateLiveDataRegistration(5, viewModelPrefix);


                    if (viewModelPrefix != null) {
                        // read viewModel.prefix.getValue()
                        viewModelPrefixGetValue = viewModelPrefix.getValue();
                    }
            }
            if ((dirtyFlags & 0x1840L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.countryName
                        viewModelCountryName = viewModel.getCountryName();
                    }
                    updateLiveDataRegistration(6, viewModelCountryName);


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
                if((dirtyFlags & 0x1840L) != 0) {
                    if(viewModelCountryNameLengthInt0) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1880L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.linkEnabled
                        viewModelLinkEnabled = viewModel.getLinkEnabled();
                    }
                    updateLiveDataRegistration(7, viewModelLinkEnabled);


                    if (viewModelLinkEnabled != null) {
                        // read viewModel.linkEnabled.getValue()
                        viewModelLinkEnabledGetValue = viewModelLinkEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.linkEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLinkEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLinkEnabledGetValue);
            }
            if ((dirtyFlags & 0x1900L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.allowSkip
                        viewModelAllowSkip = viewModel.getAllowSkip();
                    }
                    updateLiveDataRegistration(8, viewModelAllowSkip);


                    if (viewModelAllowSkip != null) {
                        // read viewModel.allowSkip.getValue()
                        viewModelAllowSkipGetValue = viewModelAllowSkip.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.allowSkip.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAllowSkipGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAllowSkipGetValue);
                if((dirtyFlags & 0x1900L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAllowSkipGetValue) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.allowSkip.getValue()) ? View.VISIBLE : View.GONE
                    viewModelAllowSkipViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAllowSkipGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1840L) != 0) {

                // read viewModel.countryName.getValue().length > 0 ? viewModel.countryName.getValue() : @android:string/select_your_country
                viewModelCountryNameLengthInt0ViewModelCountryNameSelectCountryAndroidStringSelectYourCountry = ((viewModelCountryNameLengthInt0) ? (viewModelCountryNameGetValue) : (selectCountry.getResources().getString(R.string.select_your_country)));
        }
        // batch finished
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForServerAnswerGetValue);
        }
        if ((dirtyFlags & 0x1808L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelUsernameGetValue);
        }
        if ((dirtyFlags & 0x1400L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(infoClickListener);
        }
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.addPrefixEditTextValidation(this.mboundView4, true);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView4, mboundView4errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.addPhoneNumberEditTextValidation(this.mboundView5, true);
            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView5, mboundView5errorMessageAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            this.mboundView6.setOnClickListener(mCallback93);
            this.mboundView7.setOnClickListener(mCallback94);
        }
        if ((dirtyFlags & 0x1802L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView4, viewModelPrefixErrorGetValue);
        }
        if ((dirtyFlags & 0x1820L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelPrefixGetValue);
        }
        if ((dirtyFlags & 0x1810L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView5, viewModelPhoneNumberErrorGetValue);
        }
        if ((dirtyFlags & 0x1804L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelPhoneNumberGetValue);
        }
        if ((dirtyFlags & 0x1880L) != 0) {
            // api target 1

            this.mboundView6.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelLinkEnabledGetValue);
        }
        if ((dirtyFlags & 0x1900L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(viewModelAllowSkipViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1200L) != 0) {
            // api target 1

            this.selectCountry.setOnClickListener(selectCountryClickListener);
        }
        if ((dirtyFlags & 0x1840L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.selectCountry, viewModelCountryNameLengthInt0ViewModelCountryNameSelectCountryAndroidStringSelectYourCountry);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.assistant.viewmodels.PhoneAccountLinkingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.skip();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.assistant.viewmodels.PhoneAccountLinkingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.link();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.waitForServerAnswer
        flag 1 (0x2L): viewModel.prefixError
        flag 2 (0x3L): viewModel.phoneNumber
        flag 3 (0x4L): viewModel.username
        flag 4 (0x5L): viewModel.phoneNumberError
        flag 5 (0x6L): viewModel.prefix
        flag 6 (0x7L): viewModel.countryName
        flag 7 (0x8L): viewModel.linkEnabled
        flag 8 (0x9L): viewModel.allowSkip
        flag 9 (0xaL): selectCountryClickListener
        flag 10 (0xbL): infoClickListener
        flag 11 (0xcL): viewModel
        flag 12 (0xdL): null
        flag 13 (0xeL): viewModel.countryName.getValue().length > 0 ? viewModel.countryName.getValue() : @android:string/select_your_country
        flag 14 (0xfL): viewModel.countryName.getValue().length > 0 ? viewModel.countryName.getValue() : @android:string/select_your_country
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.allowSkip.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.allowSkip.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}