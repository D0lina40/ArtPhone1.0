package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AssistantQrCodeFragmentBindingImpl extends AssistantQrCodeFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar_fragment, 2);
        sViewsWithIds.put(R.id.qr_code_capture_texture, 3);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback117;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AssistantQrCodeFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private AssistantQrCodeFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[3]
            , (androidx.fragment.app.FragmentContainerView) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        mCallback117 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
            setViewModel((org.linphone.activities.assistant.viewmodels.QrCodeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.assistant.viewmodels.QrCodeViewModel ViewModel) {
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
                return onChangeViewModelShowSwitchCamera((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelShowSwitchCamera(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowSwitchCamera, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowSwitchCamera = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowSwitchCameraGetValue = false;
        int viewModelShowSwitchCameraViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelShowSwitchCameraGetValue = null;
        org.linphone.activities.assistant.viewmodels.QrCodeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.showSwitchCamera
                    viewModelShowSwitchCamera = viewModel.getShowSwitchCamera();
                }
                updateLiveDataRegistration(0, viewModelShowSwitchCamera);


                if (viewModelShowSwitchCamera != null) {
                    // read viewModel.showSwitchCamera.getValue()
                    viewModelShowSwitchCameraGetValue = viewModelShowSwitchCamera.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelShowSwitchCameraGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowSwitchCameraGetValue);
            if((dirtyFlags & 0x7L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowSwitchCameraGetValue) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue()) ? View.VISIBLE : View.GONE
                viewModelShowSwitchCameraViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowSwitchCameraGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback117);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelShowSwitchCameraViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.assistant.viewmodels.QrCodeViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.switchCamera();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.showSwitchCamera
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue()) ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}