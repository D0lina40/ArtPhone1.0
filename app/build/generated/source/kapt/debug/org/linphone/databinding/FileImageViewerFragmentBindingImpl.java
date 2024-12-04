package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FileImageViewerFragmentBindingImpl extends FileImageViewerFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final com.github.chrisbanes.photoview.PhotoView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FileImageViewerFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FileImageViewerFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.fragment.app.FragmentContainerView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.github.chrisbanes.photoview.PhotoView) bindings[2];
        this.mboundView2.setTag(null);
        this.topBarFragment.setTag(null);
        setRootTag(root);
        // listeners
        mCallback20 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.files.viewmodels.ImageFileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.main.files.viewmodels.ImageFileViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFullScreenMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFullScreenMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelFullScreenMode, int fieldId) {
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
        java.lang.Boolean viewModelFullScreenModeGetValue = null;
        int viewModelFullScreenModeViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelFullScreenModeGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelFullScreenMode = null;
        java.lang.String viewModelFilePath = null;
        org.linphone.activities.main.files.viewmodels.ImageFileViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.fullScreenMode
                    viewModelFullScreenMode = viewModel.getFullScreenMode();
                }
                updateLiveDataRegistration(0, viewModelFullScreenMode);


                if (viewModelFullScreenMode != null) {
                    // read viewModel.fullScreenMode.getValue()
                    viewModelFullScreenModeGetValue = viewModelFullScreenMode.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fullScreenMode.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelFullScreenModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelFullScreenModeGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelFullScreenModeGetValue) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fullScreenMode.getValue()) ? View.GONE : View.VISIBLE
                viewModelFullScreenModeViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelFullScreenModeGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.filePath
                        viewModelFilePath = viewModel.getFilePath();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(mCallback20);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadImageWithCoil(this.mboundView2, viewModelFilePath);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.topBarFragment.setVisibility(viewModelFullScreenModeViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.main.files.viewmodels.ImageFileViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.toggleFullScreen();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.fullScreenMode
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fullScreenMode.getValue()) ? View.GONE : View.VISIBLE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fullScreenMode.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}