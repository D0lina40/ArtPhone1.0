package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class StatusFragmentBindingImpl extends StatusFragmentBinding  {

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
    // values
    // listeners
    // Inverse Binding Event Handlers

    public StatusFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private StatusFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[5]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.menuButton.setTag(null);
        this.statusLed.setTag(null);
        this.voiceMailCount.setTag(null);
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
        if (BR.menuClickListener == variableId) {
            setMenuClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.refreshClickListener == variableId) {
            setRefreshClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.viewmodels.StatusViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMenuClickListener(@Nullable android.view.View.OnClickListener MenuClickListener) {
        this.mMenuClickListener = MenuClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.menuClickListener);
        super.requestRebind();
    }
    public void setRefreshClickListener(@Nullable android.view.View.OnClickListener RefreshClickListener) {
        this.mRefreshClickListener = RefreshClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.refreshClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.viewmodels.StatusViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRegistrationStatusDrawable((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelVoiceMailCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeViewModelRegistrationStatusText((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRegistrationStatusDrawable(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelRegistrationStatusDrawable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVoiceMailCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelVoiceMailCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRegistrationStatusText(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelRegistrationStatusText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.Integer viewModelVoiceMailCountGetValue = null;
        android.view.View.OnClickListener menuClickListener = mMenuClickListener;
        java.lang.Integer viewModelRegistrationStatusTextGetValue = null;
        android.view.View.OnClickListener refreshClickListener = mRefreshClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelRegistrationStatusDrawable = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusDrawableGetValue = 0;
        int viewModelVoiceMailCountInt0ViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelRegistrationStatusDrawableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelVoiceMailCount = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceMailCountGetValue = 0;
        org.linphone.activities.main.viewmodels.StatusViewModel viewModel = mViewModel;
        java.lang.String viewModelVoiceMailCountToString = null;
        boolean viewModelVoiceMailCountInt0 = false;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusTextGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelRegistrationStatusText = null;

        if ((dirtyFlags & 0x48L) != 0) {
        }
        if ((dirtyFlags & 0x50L) != 0) {
        }
        if ((dirtyFlags & 0x67L) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.registrationStatusDrawable
                        viewModelRegistrationStatusDrawable = viewModel.getRegistrationStatusDrawable();
                    }
                    updateLiveDataRegistration(0, viewModelRegistrationStatusDrawable);


                    if (viewModelRegistrationStatusDrawable != null) {
                        // read viewModel.registrationStatusDrawable.getValue()
                        viewModelRegistrationStatusDrawableGetValue = viewModelRegistrationStatusDrawable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.registrationStatusDrawable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusDrawableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRegistrationStatusDrawableGetValue);
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.voiceMailCount
                        viewModelVoiceMailCount = viewModel.getVoiceMailCount();
                    }
                    updateLiveDataRegistration(1, viewModelVoiceMailCount);


                    if (viewModelVoiceMailCount != null) {
                        // read viewModel.voiceMailCount.getValue()
                        viewModelVoiceMailCountGetValue = viewModelVoiceMailCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceMailCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceMailCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelVoiceMailCountGetValue);
                    if (viewModelVoiceMailCountGetValue != null) {
                        // read viewModel.voiceMailCount.getValue().toString()
                        viewModelVoiceMailCountToString = viewModelVoiceMailCountGetValue.toString();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceMailCount.getValue()) > 0
                    viewModelVoiceMailCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceMailCountGetValue) > (0);
                if((dirtyFlags & 0x62L) != 0) {
                    if(viewModelVoiceMailCountInt0) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceMailCount.getValue()) > 0 ? View.VISIBLE : View.GONE
                    viewModelVoiceMailCountInt0ViewVISIBLEViewGONE = ((viewModelVoiceMailCountInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.registrationStatusText
                        viewModelRegistrationStatusText = viewModel.getRegistrationStatusText();
                    }
                    updateLiveDataRegistration(2, viewModelRegistrationStatusText);


                    if (viewModelRegistrationStatusText != null) {
                        // read viewModel.registrationStatusText.getValue()
                        viewModelRegistrationStatusTextGetValue = viewModelRegistrationStatusText.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.registrationStatusText.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusTextGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRegistrationStatusTextGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.mboundView3.setText(androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusTextGetValue);
            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.statusLed, androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusTextGetValue);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(refreshClickListener);
            this.statusLed.setOnClickListener(refreshClickListener);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelVoiceMailCountInt0ViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.voiceMailCount, viewModelVoiceMailCountToString);
            this.voiceMailCount.setVisibility(viewModelVoiceMailCountInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            this.menuButton.setOnClickListener(menuClickListener);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.statusLed, androidxDatabindingViewDataBindingSafeUnboxViewModelRegistrationStatusDrawableGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.registrationStatusDrawable
        flag 1 (0x2L): viewModel.voiceMailCount
        flag 2 (0x3L): viewModel.registrationStatusText
        flag 3 (0x4L): menuClickListener
        flag 4 (0x5L): refreshClickListener
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceMailCount.getValue()) > 0 ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceMailCount.getValue()) > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}