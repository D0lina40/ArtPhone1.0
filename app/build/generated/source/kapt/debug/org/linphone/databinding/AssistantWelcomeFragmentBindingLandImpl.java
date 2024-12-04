package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AssistantWelcomeFragmentBindingLandImpl extends AssistantWelcomeFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar_fragment, 6);
        sViewsWithIds.put(R.id.terms_and_privacy, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.CheckBox mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.termsAndPrivacyAccepted.getValue()
            //         is viewModel.termsAndPrivacyAccepted.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView1.isChecked();
            // localize variables for thread safety
            // viewModel.termsAndPrivacyAccepted != null
            boolean viewModelTermsAndPrivacyAcceptedJavaLangObjectNull = false;
            // viewModel.termsAndPrivacyAccepted.getValue()
            java.lang.Boolean viewModelTermsAndPrivacyAcceptedGetValue = null;
            // viewModel.termsAndPrivacyAccepted
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelTermsAndPrivacyAccepted = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.WelcomeViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelTermsAndPrivacyAccepted = viewModel.getTermsAndPrivacyAccepted();

                viewModelTermsAndPrivacyAcceptedJavaLangObjectNull = (viewModelTermsAndPrivacyAccepted) != (null);
                if (viewModelTermsAndPrivacyAcceptedJavaLangObjectNull) {




                    viewModelTermsAndPrivacyAccepted.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };

    public AssistantWelcomeFragmentBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private AssistantWelcomeFragmentBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (androidx.fragment.app.FragmentContainerView) bindings[6]
            );
        this.accountConnection.setTag(null);
        this.accountCreation.setTag(null);
        this.genericConnection.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.CheckBox) bindings[1];
        this.mboundView1.setTag(null);
        this.remoteConfiguration.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.createAccountClickListener == variableId) {
            setCreateAccountClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.accountLoginClickListener == variableId) {
            setAccountLoginClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.remoteProvisioningClickListener == variableId) {
            setRemoteProvisioningClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.assistant.viewmodels.WelcomeViewModel) variable);
        }
        else if (BR.genericAccountLoginClickListener == variableId) {
            setGenericAccountLoginClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCreateAccountClickListener(@Nullable android.view.View.OnClickListener CreateAccountClickListener) {
        this.mCreateAccountClickListener = CreateAccountClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.createAccountClickListener);
        super.requestRebind();
    }
    public void setAccountLoginClickListener(@Nullable android.view.View.OnClickListener AccountLoginClickListener) {
        this.mAccountLoginClickListener = AccountLoginClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.accountLoginClickListener);
        super.requestRebind();
    }
    public void setRemoteProvisioningClickListener(@Nullable android.view.View.OnClickListener RemoteProvisioningClickListener) {
        this.mRemoteProvisioningClickListener = RemoteProvisioningClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.remoteProvisioningClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.assistant.viewmodels.WelcomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setGenericAccountLoginClickListener(@Nullable android.view.View.OnClickListener GenericAccountLoginClickListener) {
        this.mGenericAccountLoginClickListener = GenericAccountLoginClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.genericAccountLoginClickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTermsAndPrivacyAccepted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTermsAndPrivacyAccepted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelTermsAndPrivacyAccepted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        boolean viewModelShowLinphoneLogin = false;
        int viewModelShowRemoteProvisioningViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener createAccountClickListener = mCreateAccountClickListener;
        int viewModelShowLinphoneLoginViewVISIBLEViewGONE = 0;
        boolean viewModelTermsAndPrivacyAccepted = false;
        boolean viewModelShowGenericLogin = false;
        int viewModelShowGenericLoginViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAcceptedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelTermsAndPrivacyAccepted1 = null;
        android.view.View.OnClickListener accountLoginClickListener = mAccountLoginClickListener;
        boolean viewModelShowCreateAccount = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAccepted = false;
        java.lang.Boolean viewModelTermsAndPrivacyAcceptedGetValue = null;
        android.view.View.OnClickListener remoteProvisioningClickListener = mRemoteProvisioningClickListener;
        int viewModelShowCreateAccountViewVISIBLEViewGONE = 0;
        org.linphone.activities.assistant.viewmodels.WelcomeViewModel viewModel = mViewModel;
        boolean viewModelShowRemoteProvisioning = false;
        android.view.View.OnClickListener genericAccountLoginClickListener = mGenericAccountLoginClickListener;

        if ((dirtyFlags & 0x42L) != 0) {
        }
        if ((dirtyFlags & 0x44L) != 0) {
        }
        if ((dirtyFlags & 0x48L) != 0) {
        }
        if ((dirtyFlags & 0x51L) != 0) {


            if ((dirtyFlags & 0x50L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showLinphoneLogin
                        viewModelShowLinphoneLogin = viewModel.getShowLinphoneLogin();
                        // read viewModel.showGenericLogin
                        viewModelShowGenericLogin = viewModel.getShowGenericLogin();
                        // read viewModel.showCreateAccount
                        viewModelShowCreateAccount = viewModel.getShowCreateAccount();
                        // read viewModel.showRemoteProvisioning
                        viewModelShowRemoteProvisioning = viewModel.getShowRemoteProvisioning();
                    }
                if((dirtyFlags & 0x50L) != 0) {
                    if(viewModelShowLinphoneLogin) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x50L) != 0) {
                    if(viewModelShowGenericLogin) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x50L) != 0) {
                    if(viewModelShowCreateAccount) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
                if((dirtyFlags & 0x50L) != 0) {
                    if(viewModelShowRemoteProvisioning) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read viewModel.showLinphoneLogin ? View.VISIBLE : View.GONE
                    viewModelShowLinphoneLoginViewVISIBLEViewGONE = ((viewModelShowLinphoneLogin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showGenericLogin ? View.VISIBLE : View.GONE
                    viewModelShowGenericLoginViewVISIBLEViewGONE = ((viewModelShowGenericLogin) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showCreateAccount ? View.VISIBLE : View.GONE
                    viewModelShowCreateAccountViewVISIBLEViewGONE = ((viewModelShowCreateAccount) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showRemoteProvisioning ? View.VISIBLE : View.GONE
                    viewModelShowRemoteProvisioningViewVISIBLEViewGONE = ((viewModelShowRemoteProvisioning) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (viewModel != null) {
                    // read viewModel.termsAndPrivacyAccepted
                    ViewModelTermsAndPrivacyAccepted1 = viewModel.getTermsAndPrivacyAccepted();
                }
                updateLiveDataRegistration(0, ViewModelTermsAndPrivacyAccepted1);


                if (ViewModelTermsAndPrivacyAccepted1 != null) {
                    // read viewModel.termsAndPrivacyAccepted.getValue()
                    viewModelTermsAndPrivacyAcceptedGetValue = ViewModelTermsAndPrivacyAccepted1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.termsAndPrivacyAccepted.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAcceptedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelTermsAndPrivacyAcceptedGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.termsAndPrivacyAccepted.getValue())
                viewModelTermsAndPrivacyAccepted = !androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAcceptedGetValue;


                // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.termsAndPrivacyAccepted.getValue()))
                androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAccepted = androidx.databinding.ViewDataBinding.safeUnbox(viewModelTermsAndPrivacyAccepted);
        }
        if ((dirtyFlags & 0x60L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            this.accountConnection.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAcceptedGetValue);
            this.accountCreation.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAcceptedGetValue);
            this.genericConnection.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAcceptedGetValue);
            this.mboundView1.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAccepted);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView1, androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAcceptedGetValue);
            this.remoteConfiguration.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelTermsAndPrivacyAcceptedGetValue);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            this.accountConnection.setVisibility(viewModelShowLinphoneLoginViewVISIBLEViewGONE);
            this.accountCreation.setVisibility(viewModelShowCreateAccountViewVISIBLEViewGONE);
            this.genericConnection.setVisibility(viewModelShowGenericLoginViewVISIBLEViewGONE);
            this.remoteConfiguration.setVisibility(viewModelShowRemoteProvisioningViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x44L) != 0) {
            // api target 1

            this.accountConnection.setOnClickListener(accountLoginClickListener);
        }
        if ((dirtyFlags & 0x42L) != 0) {
            // api target 1

            this.accountCreation.setOnClickListener(createAccountClickListener);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.genericConnection.setOnClickListener(genericAccountLoginClickListener);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView1, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView1androidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            this.remoteConfiguration.setOnClickListener(remoteProvisioningClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.termsAndPrivacyAccepted
        flag 1 (0x2L): createAccountClickListener
        flag 2 (0x3L): accountLoginClickListener
        flag 3 (0x4L): remoteProvisioningClickListener
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): genericAccountLoginClickListener
        flag 6 (0x7L): null
        flag 7 (0x8L): viewModel.showRemoteProvisioning ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.showRemoteProvisioning ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.showLinphoneLogin ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.showLinphoneLogin ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.showGenericLogin ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.showGenericLogin ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.showCreateAccount ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.showCreateAccount ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}