package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipStatusFragmentBindingImpl extends VoipStatusFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback96;
    @Nullable
    private final android.view.View.OnClickListener mCallback97;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipStatusFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private VoipStatusFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.statsButton.setTag(null);
        this.statusLed.setTag(null);
        setRootTag(root);
        // listeners
        mCallback96 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback97 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        if (BR.refreshClickListener == variableId) {
            setRefreshClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.voip.viewmodels.StatusViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRefreshClickListener(@Nullable android.view.View.OnClickListener RefreshClickListener) {
        this.mRefreshClickListener = RefreshClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.refreshClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.voip.viewmodels.StatusViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelCallQualityIcon((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelRegistrationStatusDrawable((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeViewModelEncryptionIconVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelCallQualityContentDescription((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeViewModelEncryptionContentDescription((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 5 :
                return onChangeViewModelEncryptionIcon((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 6 :
                return onChangeViewModelRegistrationStatusText((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCallQualityIcon(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelCallQualityIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRegistrationStatusDrawable(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelRegistrationStatusDrawable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEncryptionIconVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelEncryptionIconVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCallQualityContentDescription(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelCallQualityContentDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEncryptionContentDescription(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelEncryptionContentDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEncryptionIcon(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelEncryptionIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRegistrationStatusText(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelRegistrationStatusText, int fieldId) {
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
        int androidxDatabindingViewDataBindingSafeUnboxViewModelCallQualityIconGetValue = 0;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionIconGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelCallQualityIcon = null;
        android.view.View.OnClickListener refreshClickListener = mRefreshClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelRegistrationStatusDrawable = null;
        java.lang.Integer viewModelEncryptionIconGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelEncryptionIconVisible = null;
        int viewModelEncryptionIconVisibleViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelRegistrationStatusDrawableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelCallQualityContentDescription = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelEncryptionContentDescription = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelEncryptionIcon = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusTextGetValue = 0;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionContentDescriptionGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionIconVisibleGetValue = false;
        java.lang.Integer viewModelEncryptionContentDescriptionGetValue = null;
        java.lang.Integer viewModelRegistrationStatusTextGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusDrawableGetValue = 0;
        java.lang.Boolean viewModelEncryptionIconVisibleGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelCallQualityContentDescriptionGetValue = 0;
        org.linphone.activities.voip.viewmodels.StatusViewModel viewModel = mViewModel;
        java.lang.Integer viewModelCallQualityContentDescriptionGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelRegistrationStatusText = null;
        java.lang.Integer viewModelCallQualityIconGetValue = null;

        if ((dirtyFlags & 0x280L) != 0) {
        }
        if ((dirtyFlags & 0x37fL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.callQualityIcon
                        viewModelCallQualityIcon = viewModel.getCallQualityIcon();
                    }
                    updateLiveDataRegistration(0, viewModelCallQualityIcon);


                    if (viewModelCallQualityIcon != null) {
                        // read viewModel.callQualityIcon.getValue()
                        viewModelCallQualityIconGetValue = viewModelCallQualityIcon.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.callQualityIcon.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCallQualityIconGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCallQualityIconGetValue);
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.registrationStatusDrawable
                        viewModelRegistrationStatusDrawable = viewModel.getRegistrationStatusDrawable();
                    }
                    updateLiveDataRegistration(1, viewModelRegistrationStatusDrawable);


                    if (viewModelRegistrationStatusDrawable != null) {
                        // read viewModel.registrationStatusDrawable.getValue()
                        viewModelRegistrationStatusDrawableGetValue = viewModelRegistrationStatusDrawable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.registrationStatusDrawable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusDrawableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRegistrationStatusDrawableGetValue);
            }
            if ((dirtyFlags & 0x304L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.encryptionIconVisible
                        viewModelEncryptionIconVisible = viewModel.getEncryptionIconVisible();
                    }
                    updateLiveDataRegistration(2, viewModelEncryptionIconVisible);


                    if (viewModelEncryptionIconVisible != null) {
                        // read viewModel.encryptionIconVisible.getValue()
                        viewModelEncryptionIconVisibleGetValue = viewModelEncryptionIconVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.encryptionIconVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionIconVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelEncryptionIconVisibleGetValue);
                if((dirtyFlags & 0x304L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionIconVisibleGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.encryptionIconVisible.getValue()) ? View.VISIBLE : View.GONE
                    viewModelEncryptionIconVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionIconVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.callQualityContentDescription
                        viewModelCallQualityContentDescription = viewModel.getCallQualityContentDescription();
                    }
                    updateLiveDataRegistration(3, viewModelCallQualityContentDescription);


                    if (viewModelCallQualityContentDescription != null) {
                        // read viewModel.callQualityContentDescription.getValue()
                        viewModelCallQualityContentDescriptionGetValue = viewModelCallQualityContentDescription.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.callQualityContentDescription.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCallQualityContentDescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCallQualityContentDescriptionGetValue);
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.encryptionContentDescription
                        viewModelEncryptionContentDescription = viewModel.getEncryptionContentDescription();
                    }
                    updateLiveDataRegistration(4, viewModelEncryptionContentDescription);


                    if (viewModelEncryptionContentDescription != null) {
                        // read viewModel.encryptionContentDescription.getValue()
                        viewModelEncryptionContentDescriptionGetValue = viewModelEncryptionContentDescription.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.encryptionContentDescription.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionContentDescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelEncryptionContentDescriptionGetValue);
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.encryptionIcon
                        viewModelEncryptionIcon = viewModel.getEncryptionIcon();
                    }
                    updateLiveDataRegistration(5, viewModelEncryptionIcon);


                    if (viewModelEncryptionIcon != null) {
                        // read viewModel.encryptionIcon.getValue()
                        viewModelEncryptionIconGetValue = viewModelEncryptionIcon.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.encryptionIcon.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionIconGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelEncryptionIconGetValue);
            }
            if ((dirtyFlags & 0x340L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.registrationStatusText
                        viewModelRegistrationStatusText = viewModel.getRegistrationStatusText();
                    }
                    updateLiveDataRegistration(6, viewModelRegistrationStatusText);


                    if (viewModelRegistrationStatusText != null) {
                        // read viewModel.registrationStatusText.getValue()
                        viewModelRegistrationStatusTextGetValue = viewModelRegistrationStatusText.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.registrationStatusText.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusTextGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRegistrationStatusTextGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(refreshClickListener);
            this.statusLed.setOnClickListener(refreshClickListener);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView4, androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionContentDescriptionGetValue);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback97);
            this.statsButton.setOnClickListener(mCallback96);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView4, androidxDatabindingViewDataBindingSafeUnboxViewModelEncryptionIconGetValue);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelEncryptionIconVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.statsButton, androidxDatabindingViewDataBindingSafeUnboxViewModelCallQualityContentDescriptionGetValue);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.statsButton, androidxDatabindingViewDataBindingSafeUnboxViewModelCallQualityIconGetValue);
        }
        if ((dirtyFlags & 0x340L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.statusLed, androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusTextGetValue);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.statusLed, androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusDrawableGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.voip.viewmodels.StatusViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.showCallStats();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.voip.viewmodels.StatusViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.showZrtpDialog();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.callQualityIcon
        flag 1 (0x2L): viewModel.registrationStatusDrawable
        flag 2 (0x3L): viewModel.encryptionIconVisible
        flag 3 (0x4L): viewModel.callQualityContentDescription
        flag 4 (0x5L): viewModel.encryptionContentDescription
        flag 5 (0x6L): viewModel.encryptionIcon
        flag 6 (0x7L): viewModel.registrationStatusText
        flag 7 (0x8L): refreshClickListener
        flag 8 (0x9L): viewModel
        flag 9 (0xaL): null
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.encryptionIconVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.encryptionIconVisible.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}