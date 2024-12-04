package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AssistantGenericAccountLoginFragmentBindingImpl extends AssistantGenericAccountLoginFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {9},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar_fragment, 10);
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
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.radiobutton.MaterialRadioButton mboundView5;
    @NonNull
    private final com.google.android.material.radiobutton.MaterialRadioButton mboundView6;
    @NonNull
    private final com.google.android.material.radiobutton.MaterialRadioButton mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback104;
    @Nullable
    private final android.view.View.OnClickListener mCallback102;
    @Nullable
    private final android.view.View.OnClickListener mCallback103;
    @Nullable
    private final android.view.View.OnClickListener mCallback101;
    // values
    // listeners
    // Inverse Binding Event Handlers
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
            org.linphone.activities.assistant.viewmodels.GenericLoginViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.password.getValue()
            //         is viewModel.password.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.password != null
            boolean viewModelPasswordJavaLangObjectNull = false;
            // viewModel.password.getValue()
            java.lang.String viewModelPasswordGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.GenericLoginViewModel viewModel = mViewModel;
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
    private androidx.databinding.InverseBindingListener mboundView3androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.domain.getValue()
            //         is viewModel.domain.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView3);
            // localize variables for thread safety
            // viewModel.domain
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDomain = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.GenericLoginViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.domain != null
            boolean viewModelDomainJavaLangObjectNull = false;
            // viewModel.domain.getValue()
            java.lang.String viewModelDomainGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDomain = viewModel.getDomain();

                viewModelDomainJavaLangObjectNull = (viewModelDomain) != (null);
                if (viewModelDomainJavaLangObjectNull) {




                    viewModelDomain.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.displayName.getValue()
            //         is viewModel.displayName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.displayName
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
            // viewModel.displayName.getValue()
            java.lang.String viewModelDisplayNameGetValue = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.GenericLoginViewModel viewModel = mViewModel;
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

    public AssistantGenericAccountLoginFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private AssistantGenericAccountLoginFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (androidx.fragment.app.FragmentContainerView) bindings[10]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[9];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (com.google.android.material.textfield.TextInputEditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.radiobutton.MaterialRadioButton) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.radiobutton.MaterialRadioButton) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.radiobutton.MaterialRadioButton) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        setRootTag(root);
        // listeners
        mCallback104 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback102 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback103 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback101 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setViewModel((org.linphone.activities.assistant.viewmodels.GenericLoginViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.assistant.viewmodels.GenericLoginViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
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
                return onChangeViewModelDomain((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelUsername((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelTransport((androidx.lifecycle.MutableLiveData<org.linphone.core.TransportType>) object, fieldId);
            case 5 :
                return onChangeViewModelPassword((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeViewModelLoginEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeViewModelDomain(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDomain, int fieldId) {
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
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTransport(androidx.lifecycle.MutableLiveData<org.linphone.core.TransportType> ViewModelTransport, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPassword(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoginEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelLoginEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        boolean viewModelTransportTransportTypeTcp = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWaitForServerAnswer = null;
        java.lang.String viewModelDisplayNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDomain = null;
        java.lang.String viewModelPasswordGetValue = null;
        java.lang.String viewModelUsernameGetValue = null;
        boolean viewModelTransportTransportTypeUdp = false;
        java.lang.Boolean viewModelWaitForServerAnswerGetValue = null;
        java.lang.String viewModelDomainGetValue = null;
        boolean viewModelTransportTransportTypeTls = false;
        org.linphone.core.TransportType viewModelTransportGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUsername = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLoginEnabledGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.TransportType> viewModelTransport = null;
        org.linphone.activities.assistant.viewmodels.GenericLoginViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelPassword = null;
        java.lang.Boolean viewModelLoginEnabledGetValue = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelLoginEnabled = null;

        if ((dirtyFlags & 0x1ffL) != 0) {


            if ((dirtyFlags & 0x181L) != 0) {

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
            if ((dirtyFlags & 0x182L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.domain
                        viewModelDomain = viewModel.getDomain();
                    }
                    updateLiveDataRegistration(1, viewModelDomain);


                    if (viewModelDomain != null) {
                        // read viewModel.domain.getValue()
                        viewModelDomainGetValue = viewModelDomain.getValue();
                    }
            }
            if ((dirtyFlags & 0x184L) != 0) {

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
            if ((dirtyFlags & 0x188L) != 0) {

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
            if ((dirtyFlags & 0x190L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.transport
                        viewModelTransport = viewModel.getTransport();
                    }
                    updateLiveDataRegistration(4, viewModelTransport);


                    if (viewModelTransport != null) {
                        // read viewModel.transport.getValue()
                        viewModelTransportGetValue = viewModelTransport.getValue();
                    }


                    // read viewModel.transport.getValue() == TransportType.Tcp
                    viewModelTransportTransportTypeTcp = (viewModelTransportGetValue) == (org.linphone.core.TransportType.Tcp);
                    // read viewModel.transport.getValue() == TransportType.Udp
                    viewModelTransportTransportTypeUdp = (viewModelTransportGetValue) == (org.linphone.core.TransportType.Udp);
                    // read viewModel.transport.getValue() == TransportType.Tls
                    viewModelTransportTransportTypeTls = (viewModelTransportGetValue) == (org.linphone.core.TransportType.Tls);
            }
            if ((dirtyFlags & 0x1a0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.password
                        viewModelPassword = viewModel.getPassword();
                    }
                    updateLiveDataRegistration(5, viewModelPassword);


                    if (viewModelPassword != null) {
                        // read viewModel.password.getValue()
                        viewModelPasswordGetValue = viewModelPassword.getValue();
                    }
            }
            if ((dirtyFlags & 0x1c0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loginEnabled
                        viewModelLoginEnabled = viewModel.getLoginEnabled();
                    }
                    updateLiveDataRegistration(6, viewModelLoginEnabled);


                    if (viewModelLoginEnabled != null) {
                        // read viewModel.loginEnabled.getValue()
                        viewModelLoginEnabledGetValue = viewModelLoginEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.loginEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLoginEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLoginEnabledGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x181L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForServerAnswerGetValue);
        }
        if ((dirtyFlags & 0x184L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelUsernameGetValue);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView3, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView3androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            this.mboundView5.setOnClickListener(mCallback101);
            this.mboundView6.setOnClickListener(mCallback102);
            this.mboundView7.setOnClickListener(mCallback103);
            this.mboundView8.setOnClickListener(mCallback104);
        }
        if ((dirtyFlags & 0x1a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelPasswordGetValue);
        }
        if ((dirtyFlags & 0x182L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelDomainGetValue);
        }
        if ((dirtyFlags & 0x188L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelDisplayNameGetValue);
        }
        if ((dirtyFlags & 0x190L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView5, viewModelTransportTransportTypeUdp);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView6, viewModelTransportTransportTypeTcp);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView7, viewModelTransportTransportTypeTls);
        }
        if ((dirtyFlags & 0x1c0L) != 0) {
            // api target 1

            this.mboundView8.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelLoginEnabledGetValue);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.assistant.viewmodels.GenericLoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.createAccountAndAuthInfo();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.assistant.viewmodels.GenericLoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.setTransport(org.linphone.core.TransportType.Tcp);
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.assistant.viewmodels.GenericLoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.setTransport(org.linphone.core.TransportType.Tls);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.assistant.viewmodels.GenericLoginViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {




                    viewModel.setTransport(org.linphone.core.TransportType.Udp);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.waitForServerAnswer
        flag 1 (0x2L): viewModel.domain
        flag 2 (0x3L): viewModel.username
        flag 3 (0x4L): viewModel.displayName
        flag 4 (0x5L): viewModel.transport
        flag 5 (0x6L): viewModel.password
        flag 6 (0x7L): viewModel.loginEnabled
        flag 7 (0x8L): viewModel
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}