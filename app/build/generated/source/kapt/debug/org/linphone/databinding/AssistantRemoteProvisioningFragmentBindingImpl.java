package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AssistantRemoteProvisioningFragmentBindingImpl extends AssistantRemoteProvisioningFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(6);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {4},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar_fragment, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView1errorMessageAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.urlError.getValue()
            //         is viewModel.urlError.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = org.linphone.utils.DataBindingUtilsKt.getEditTextError(mboundView1);
            // localize variables for thread safety
            // viewModel.urlError.getValue()
            java.lang.String viewModelUrlErrorGetValue = null;
            // viewModel.urlError != null
            boolean viewModelUrlErrorJavaLangObjectNull = false;
            // viewModel.urlError
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUrlError = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.RemoteProvisioningViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUrlError = viewModel.getUrlError();

                viewModelUrlErrorJavaLangObjectNull = (viewModelUrlError) != (null);
                if (viewModelUrlErrorJavaLangObjectNull) {




                    viewModelUrlError.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView1androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.urlToFetch.getValue()
            //         is viewModel.urlToFetch.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // viewModel.urlToFetch.getValue()
            java.lang.String viewModelUrlToFetchGetValue = null;
            // viewModel.urlToFetch != null
            boolean viewModelUrlToFetchJavaLangObjectNull = false;
            // viewModel.urlToFetch
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUrlToFetch = null;
            // viewModel
            org.linphone.activities.assistant.viewmodels.RemoteProvisioningViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelUrlToFetch = viewModel.getUrlToFetch();

                viewModelUrlToFetchJavaLangObjectNull = (viewModelUrlToFetch) != (null);
                if (viewModelUrlToFetchJavaLangObjectNull) {




                    viewModelUrlToFetch.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public AssistantRemoteProvisioningFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private AssistantRemoteProvisioningFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (androidx.fragment.app.FragmentContainerView) bindings[5]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[4];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (com.google.android.material.textfield.TextInputEditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback49 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.qrCodeClickListener == variableId) {
            setQrCodeClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.assistant.viewmodels.RemoteProvisioningViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQrCodeClickListener(@Nullable android.view.View.OnClickListener QrCodeClickListener) {
        this.mQrCodeClickListener = QrCodeClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.qrCodeClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.assistant.viewmodels.RemoteProvisioningViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
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
                return onChangeViewModelUrlError((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelFetchInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelFetchEnabled((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelUrlToFetch((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelUrlError(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUrlError, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFetchInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelFetchInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFetchEnabled(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> ViewModelFetchEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUrlToFetch(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelUrlToFetch, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        java.lang.String viewModelUrlErrorGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUrlError = null;
        java.lang.Boolean viewModelFetchEnabledGetValue = null;
        java.lang.Boolean viewModelFetchInProgressGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelFetchInProgress = null;
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> viewModelFetchEnabled = null;
        java.lang.String viewModelUrlToFetchGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelUrlToFetch = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelFetchEnabledGetValue = false;
        android.view.View.OnClickListener qrCodeClickListener = mQrCodeClickListener;
        org.linphone.activities.assistant.viewmodels.RemoteProvisioningViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x50L) != 0) {
        }
        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.urlError
                        viewModelUrlError = viewModel.getUrlError();
                    }
                    updateLiveDataRegistration(0, viewModelUrlError);


                    if (viewModelUrlError != null) {
                        // read viewModel.urlError.getValue()
                        viewModelUrlErrorGetValue = viewModelUrlError.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fetchInProgress
                        viewModelFetchInProgress = viewModel.getFetchInProgress();
                    }
                    updateLiveDataRegistration(1, viewModelFetchInProgress);


                    if (viewModelFetchInProgress != null) {
                        // read viewModel.fetchInProgress.getValue()
                        viewModelFetchInProgressGetValue = viewModelFetchInProgress.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fetchEnabled
                        viewModelFetchEnabled = viewModel.getFetchEnabled();
                    }
                    updateLiveDataRegistration(2, viewModelFetchEnabled);


                    if (viewModelFetchEnabled != null) {
                        // read viewModel.fetchEnabled.getValue()
                        viewModelFetchEnabledGetValue = viewModelFetchEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fetchEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelFetchEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelFetchEnabledGetValue);
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.urlToFetch
                        viewModelUrlToFetch = viewModel.getUrlToFetch();
                    }
                    updateLiveDataRegistration(3, viewModelUrlToFetch);


                    if (viewModelUrlToFetch != null) {
                        // read viewModel.urlToFetch.getValue()
                        viewModelUrlToFetchGetValue = viewModelUrlToFetch.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelFetchInProgressGetValue);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextError(this.mboundView1, viewModelUrlErrorGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEditTextErrorListener(this.mboundView1, mboundView1errorMessageAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.addUrlEditTextValidation(this.mboundView1, true);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTextAttrChanged);
            this.mboundView2.setOnClickListener(mCallback49);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelUrlToFetchGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.mboundView2.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelFetchEnabledGetValue);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(qrCodeClickListener);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.assistant.viewmodels.RemoteProvisioningViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.fetchAndApply();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.urlError
        flag 1 (0x2L): viewModel.fetchInProgress
        flag 2 (0x3L): viewModel.fetchEnabled
        flag 3 (0x4L): viewModel.urlToFetch
        flag 4 (0x5L): qrCodeClickListener
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}