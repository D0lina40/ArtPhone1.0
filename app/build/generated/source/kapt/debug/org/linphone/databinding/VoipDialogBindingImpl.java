package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipDialogBindingImpl extends VoipDialogBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_barrier, 9);
        sViewsWithIds.put(R.id.background, 10);
        sViewsWithIds.put(R.id.dialog_message, 11);
        sViewsWithIds.put(R.id.dialog_zrtp_1, 12);
        sViewsWithIds.put(R.id.dialog_zrtp_2, 13);
        sViewsWithIds.put(R.id.buttons_top_barrier, 14);
        sViewsWithIds.put(R.id.buttons_bottom_barrier, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipDialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private VoipDialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.view.View) bindings[10]
            , (androidx.constraintlayout.widget.Barrier) bindings[15]
            , (androidx.constraintlayout.widget.Barrier) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[13]
            , (androidx.constraintlayout.widget.Group) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (androidx.constraintlayout.widget.Barrier) bindings[9]
            );
        this.cancelButton.setTag(null);
        this.deleteButton.setTag(null);
        this.dialogIcon.setTag(null);
        this.dialogTitle.setTag(null);
        this.dialogZrtpGroup.setTag(null);
        this.dialogZrtpSas1.setTag(null);
        this.dialogZrtpSas2.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.okButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback37 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback35 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback38 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback36 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setViewModel((org.linphone.activities.main.viewmodels.DialogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.main.viewmodels.DialogViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        int viewModelShowCancelViewVISIBLEViewGONE = 0;
        int viewModelShowTitleViewVISIBLEViewGONE = 0;
        int viewModelShowDeleteViewVISIBLEViewGONE = 0;
        boolean viewModelShowCancel = false;
        boolean viewModelShowIcon = false;
        boolean viewModelShowOk = false;
        java.lang.String viewModelOkLabel = null;
        int viewModelIconResource = 0;
        int viewModelShowIconViewVISIBLEViewGONE = 0;
        int viewModelShowOkViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTitle = null;
        boolean viewModelShowDelete = false;
        int viewModelShowZrtpViewVISIBLEViewGONE = 0;
        boolean viewModelShowTitle = false;
        boolean viewModelShowZrtp = false;
        org.linphone.activities.main.viewmodels.DialogViewModel viewModel = mViewModel;
        java.lang.String viewModelZrtpReadSas = null;
        java.lang.String viewModelZrtpListenSas = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.showCancel
                    viewModelShowCancel = viewModel.getShowCancel();
                    // read viewModel.showIcon
                    viewModelShowIcon = viewModel.getShowIcon();
                    // read viewModel.showOk
                    viewModelShowOk = viewModel.getShowOk();
                    // read viewModel.okLabel
                    viewModelOkLabel = viewModel.getOkLabel();
                    // read viewModel.iconResource
                    viewModelIconResource = viewModel.getIconResource();
                    // read viewModel.title
                    viewModelTitle = viewModel.getTitle();
                    // read viewModel.showDelete
                    viewModelShowDelete = viewModel.getShowDelete();
                    // read viewModel.showTitle
                    viewModelShowTitle = viewModel.getShowTitle();
                    // read viewModel.showZrtp
                    viewModelShowZrtp = viewModel.getShowZrtp();
                    // read viewModel.zrtpReadSas
                    viewModelZrtpReadSas = viewModel.getZrtpReadSas();
                    // read viewModel.zrtpListenSas
                    viewModelZrtpListenSas = viewModel.getZrtpListenSas();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelShowCancel) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelShowIcon) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelShowOk) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelShowDelete) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelShowTitle) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(viewModelShowZrtp) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read viewModel.showCancel ? View.VISIBLE : View.GONE
                viewModelShowCancelViewVISIBLEViewGONE = ((viewModelShowCancel) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.showIcon ? View.VISIBLE : View.GONE
                viewModelShowIconViewVISIBLEViewGONE = ((viewModelShowIcon) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.showOk ? View.VISIBLE : View.GONE
                viewModelShowOkViewVISIBLEViewGONE = ((viewModelShowOk) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.showDelete ? View.VISIBLE : View.GONE
                viewModelShowDeleteViewVISIBLEViewGONE = ((viewModelShowDelete) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.showTitle ? View.VISIBLE : View.GONE
                viewModelShowTitleViewVISIBLEViewGONE = ((viewModelShowTitle) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read viewModel.showZrtp ? View.VISIBLE : View.GONE
                viewModelShowZrtpViewVISIBLEViewGONE = ((viewModelShowZrtp) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.cancelButton.setOnClickListener(mCallback36);
            this.deleteButton.setOnClickListener(mCallback37);
            this.mboundView0.setOnClickListener(mCallback35);
            this.okButton.setOnClickListener(mCallback38);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.cancelButton.setVisibility(viewModelShowCancelViewVISIBLEViewGONE);
            this.deleteButton.setVisibility(viewModelShowDeleteViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.dialogIcon, viewModelIconResource);
            this.dialogIcon.setVisibility(viewModelShowIconViewVISIBLEViewGONE);
            this.dialogTitle.setVisibility(viewModelShowTitleViewVISIBLEViewGONE);
            this.dialogZrtpGroup.setVisibility(viewModelShowZrtpViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dialogZrtpSas1, viewModelZrtpReadSas);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.dialogZrtpSas2, viewModelZrtpListenSas);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.okButton, viewModelOkLabel);
            this.okButton.setVisibility(viewModelShowOkViewVISIBLEViewGONE);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.dialogIcon.setContentDescription(viewModelTitle);
            }
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.viewmodels.DialogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onDeleteClicked();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.viewmodels.DialogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.dismiss();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.viewmodels.DialogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onOkClicked();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.viewmodels.DialogViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onCancelClicked();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
        flag 2 (0x3L): viewModel.showCancel ? View.VISIBLE : View.GONE
        flag 3 (0x4L): viewModel.showCancel ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.showTitle ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.showTitle ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.showDelete ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.showDelete ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.showIcon ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.showIcon ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.showOk ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.showOk ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.showZrtp ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.showZrtp ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}