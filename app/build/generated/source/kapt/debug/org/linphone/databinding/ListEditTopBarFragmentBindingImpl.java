package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListEditTopBarFragmentBindingImpl extends ListEditTopBarFragmentBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListEditTopBarFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ListEditTopBarFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.cancelClickListener == variableId) {
            setCancelClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.selectAllClickListener == variableId) {
            setSelectAllClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.unSelectAllClickListener == variableId) {
            setUnSelectAllClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.deleteClickListener == variableId) {
            setDeleteClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.viewmodels.ListTopBarViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCancelClickListener(@Nullable android.view.View.OnClickListener CancelClickListener) {
        this.mCancelClickListener = CancelClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.cancelClickListener);
        super.requestRebind();
    }
    public void setSelectAllClickListener(@Nullable android.view.View.OnClickListener SelectAllClickListener) {
        this.mSelectAllClickListener = SelectAllClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.selectAllClickListener);
        super.requestRebind();
    }
    public void setUnSelectAllClickListener(@Nullable android.view.View.OnClickListener UnSelectAllClickListener) {
        this.mUnSelectAllClickListener = UnSelectAllClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.unSelectAllClickListener);
        super.requestRebind();
    }
    public void setDeleteClickListener(@Nullable android.view.View.OnClickListener DeleteClickListener) {
        this.mDeleteClickListener = DeleteClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.deleteClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.viewmodels.ListTopBarViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsSelectionNotEmpty((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsEditionEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsSelectionNotEmpty(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsSelectionNotEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsEditionEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsEditionEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.Boolean viewModelIsSelectionNotEmptyGetValue = null;
        android.view.View.OnClickListener cancelClickListener = mCancelClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsSelectionNotEmpty = null;
        android.view.View.OnClickListener selectAllClickListener = mSelectAllClickListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSelectionNotEmptyGetValue = false;
        int viewModelIsSelectionNotEmptyViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsEditionEnabled = null;
        java.lang.Boolean viewModelIsEditionEnabledGetValue = null;
        int viewModelIsSelectionNotEmptyViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditionEnabledGetValue = false;
        android.view.View.OnClickListener unSelectAllClickListener = mUnSelectAllClickListener;
        android.view.View.OnClickListener deleteClickListener = mDeleteClickListener;
        org.linphone.activities.main.viewmodels.ListTopBarViewModel viewModel = mViewModel;
        int viewModelIsEditionEnabledViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x84L) != 0) {
        }
        if ((dirtyFlags & 0x88L) != 0) {
        }
        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xa0L) != 0) {
        }
        if ((dirtyFlags & 0xc3L) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSelectionNotEmpty
                        viewModelIsSelectionNotEmpty = viewModel.isSelectionNotEmpty();
                    }
                    updateLiveDataRegistration(0, viewModelIsSelectionNotEmpty);


                    if (viewModelIsSelectionNotEmpty != null) {
                        // read viewModel.isSelectionNotEmpty.getValue()
                        viewModelIsSelectionNotEmptyGetValue = viewModelIsSelectionNotEmpty.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSelectionNotEmpty.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsSelectionNotEmptyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsSelectionNotEmptyGetValue);
                if((dirtyFlags & 0xc1L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSelectionNotEmptyGetValue) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSelectionNotEmpty.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsSelectionNotEmptyViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsSelectionNotEmptyGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSelectionNotEmpty.getValue()) ? View.GONE : View.VISIBLE
                    viewModelIsSelectionNotEmptyViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsSelectionNotEmptyGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xc2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEditionEnabled
                        viewModelIsEditionEnabled = viewModel.isEditionEnabled();
                    }
                    updateLiveDataRegistration(1, viewModelIsEditionEnabled);


                    if (viewModelIsEditionEnabled != null) {
                        // read viewModel.isEditionEnabled.getValue()
                        viewModelIsEditionEnabledGetValue = viewModelIsEditionEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEditionEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditionEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEditionEnabledGetValue);
                if((dirtyFlags & 0xc2L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditionEnabledGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsEditionEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsEditionEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc2L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(viewModelIsEditionEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x84L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(cancelClickListener);
        }
        if ((dirtyFlags & 0x88L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(selectAllClickListener);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelIsSelectionNotEmptyViewGONEViewVISIBLE);
            this.mboundView3.setVisibility(viewModelIsSelectionNotEmptyViewVISIBLEViewGONE);
            this.mboundView4.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSelectionNotEmptyGetValue);
        }
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(unSelectAllClickListener);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(deleteClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isSelectionNotEmpty
        flag 1 (0x2L): viewModel.isEditionEnabled
        flag 2 (0x3L): cancelClickListener
        flag 3 (0x4L): selectAllClickListener
        flag 4 (0x5L): unSelectAllClickListener
        flag 5 (0x6L): deleteClickListener
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSelectionNotEmpty.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSelectionNotEmpty.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSelectionNotEmpty.getValue()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSelectionNotEmpty.getValue()) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}