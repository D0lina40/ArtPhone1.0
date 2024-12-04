package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialogBindingImpl extends DialogBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final com.google.android.material.switchmaterial.SwitchMaterial mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView8androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.doNotAskAgain.getValue()
            //         is viewModel.doNotAskAgain.setValue((java.lang.Boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView8.isChecked();
            // localize variables for thread safety
            // viewModel.doNotAskAgain
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDoNotAskAgain = null;
            // viewModel
            org.linphone.activities.main.viewmodels.DialogViewModel viewModel = mViewModel;
            // viewModel.doNotAskAgain != null
            boolean viewModelDoNotAskAgainJavaLangObjectNull = false;
            // viewModel.doNotAskAgain.getValue()
            java.lang.Boolean viewModelDoNotAskAgainGetValue = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelDoNotAskAgain = viewModel.getDoNotAskAgain();

                viewModelDoNotAskAgainJavaLangObjectNull = (viewModelDoNotAskAgain) != (null);
                if (viewModelDoNotAskAgainJavaLangObjectNull) {




                    viewModelDoNotAskAgain.setValue(((java.lang.Boolean) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener settingsInputandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.password
            //         is viewModel.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(settingsInput);
            // localize variables for thread safety
            // viewModel
            org.linphone.activities.main.viewmodels.DialogViewModel viewModel = mViewModel;
            // viewModel.password
            java.lang.String viewModelPassword = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {




                viewModel.setPassword(((java.lang.String) (callbackArg_0)));
            }
        }
    };

    public DialogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DialogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (org.linphone.views.SettingTextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (com.google.android.material.switchmaterial.SwitchMaterial) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.settingsInput.setTag(null);
        this.settingsInputLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback32 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback33 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback34 = new org.linphone.generated.callback.OnClickListener(this, 3);
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDoNotAskAgain((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDoNotAskAgain(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelDoNotAskAgain, int fieldId) {
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
        java.lang.String viewModelPasswordTitle = null;
        java.lang.String viewModelMessage = null;
        boolean viewModelDeleteLabelJavaLangObjectNull = false;
        int viewModelShowTitleViewVISIBLEViewGONE = 0;
        int viewModelShowDeleteViewVISIBLEViewGONE = 0;
        boolean viewModelShowPassword = false;
        java.lang.String viewModelCancelLabel = null;
        boolean viewModelShowCancel = false;
        boolean viewModelShowOk = false;
        java.lang.String viewModelOkLabel = null;
        int viewModelShowPasswordViewVISIBLEViewGONE = 0;
        int viewModelIconResource = 0;
        int viewModelShowIconViewVISIBLEViewGONE = 0;
        java.lang.String viewModelTitle = null;
        boolean viewModelShowDoNotAskAgain = false;
        java.lang.Boolean viewModelDoNotAskAgainGetValue = null;
        java.lang.String viewModelPasswordSubtitle = null;
        boolean viewModelPasswordSubtitleLengthInt0 = false;
        boolean viewModelShowTitle = false;
        int viewModelShowDoNotAskAgainViewVISIBLEViewGONE = 0;
        int viewModelPasswordSubtitleLength = 0;
        java.lang.String viewModelPassword = null;
        java.lang.String viewModelDeleteLabel = null;
        int viewModelShowCancelViewVISIBLEViewGONE = 0;
        java.lang.String viewModelCancelLabelJavaLangObjectNullMboundView9AndroidStringDialogCancelViewModelCancelLabel = null;
        java.lang.String viewModelDeleteLabelJavaLangObjectNullMboundView10AndroidStringDialogDeleteViewModelDeleteLabel = null;
        int viewModelShowSubscribeLinphoneOrgLinkViewVISIBLEViewGONE = 0;
        boolean viewModelCancelLabelJavaLangObjectNull = false;
        boolean viewModelShowIcon = false;
        int viewModelShowOkViewVISIBLEViewGONE = 0;
        boolean viewModelShowDelete = false;
        boolean viewModelShowSubscribeLinphoneOrgLink = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelDoNotAskAgain = null;
        org.linphone.activities.main.viewmodels.DialogViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelDoNotAskAgainGetValue = false;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.passwordTitle
                        viewModelPasswordTitle = viewModel.getPasswordTitle();
                        // read viewModel.message
                        viewModelMessage = viewModel.getMessage();
                        // read viewModel.showPassword
                        viewModelShowPassword = viewModel.getShowPassword();
                        // read viewModel.cancelLabel
                        viewModelCancelLabel = viewModel.getCancelLabel();
                        // read viewModel.showCancel
                        viewModelShowCancel = viewModel.getShowCancel();
                        // read viewModel.showOk
                        viewModelShowOk = viewModel.getShowOk();
                        // read viewModel.okLabel
                        viewModelOkLabel = viewModel.getOkLabel();
                        // read viewModel.iconResource
                        viewModelIconResource = viewModel.getIconResource();
                        // read viewModel.title
                        viewModelTitle = viewModel.getTitle();
                        // read viewModel.showDoNotAskAgain
                        viewModelShowDoNotAskAgain = viewModel.getShowDoNotAskAgain();
                        // read viewModel.passwordSubtitle
                        viewModelPasswordSubtitle = viewModel.getPasswordSubtitle();
                        // read viewModel.showTitle
                        viewModelShowTitle = viewModel.getShowTitle();
                        // read viewModel.password
                        viewModelPassword = viewModel.getPassword();
                        // read viewModel.deleteLabel
                        viewModelDeleteLabel = viewModel.getDeleteLabel();
                        // read viewModel.showIcon
                        viewModelShowIcon = viewModel.getShowIcon();
                        // read viewModel.showDelete
                        viewModelShowDelete = viewModel.getShowDelete();
                        // read viewModel.showSubscribeLinphoneOrgLink
                        viewModelShowSubscribeLinphoneOrgLink = viewModel.getShowSubscribeLinphoneOrgLink();
                    }
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelShowPassword) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelShowCancel) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelShowOk) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelShowDoNotAskAgain) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelShowTitle) {
                            dirtyFlags |= 0x10L;
                    }
                    else {
                            dirtyFlags |= 0x8L;
                    }
                }
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelShowIcon) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelShowDelete) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelShowSubscribeLinphoneOrgLink) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read viewModel.showPassword ? View.VISIBLE : View.GONE
                    viewModelShowPasswordViewVISIBLEViewGONE = ((viewModelShowPassword) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.cancelLabel == null
                    viewModelCancelLabelJavaLangObjectNull = (viewModelCancelLabel) == (null);
                    // read viewModel.showCancel ? View.VISIBLE : View.GONE
                    viewModelShowCancelViewVISIBLEViewGONE = ((viewModelShowCancel) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showOk ? View.VISIBLE : View.GONE
                    viewModelShowOkViewVISIBLEViewGONE = ((viewModelShowOk) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showDoNotAskAgain ? View.VISIBLE : View.GONE
                    viewModelShowDoNotAskAgainViewVISIBLEViewGONE = ((viewModelShowDoNotAskAgain) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showTitle ? View.VISIBLE : View.GONE
                    viewModelShowTitleViewVISIBLEViewGONE = ((viewModelShowTitle) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.deleteLabel == null
                    viewModelDeleteLabelJavaLangObjectNull = (viewModelDeleteLabel) == (null);
                    // read viewModel.showIcon ? View.VISIBLE : View.GONE
                    viewModelShowIconViewVISIBLEViewGONE = ((viewModelShowIcon) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showDelete ? View.VISIBLE : View.GONE
                    viewModelShowDeleteViewVISIBLEViewGONE = ((viewModelShowDelete) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read viewModel.showSubscribeLinphoneOrgLink ? View.VISIBLE : View.GONE
                    viewModelShowSubscribeLinphoneOrgLinkViewVISIBLEViewGONE = ((viewModelShowSubscribeLinphoneOrgLink) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelCancelLabelJavaLangObjectNull) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
                if((dirtyFlags & 0x6L) != 0) {
                    if(viewModelDeleteLabelJavaLangObjectNull) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                    if (viewModelPasswordSubtitle != null) {
                        // read viewModel.passwordSubtitle.length()
                        viewModelPasswordSubtitleLength = viewModelPasswordSubtitle.length();
                    }


                    // read viewModel.passwordSubtitle.length() > 0
                    viewModelPasswordSubtitleLengthInt0 = (viewModelPasswordSubtitleLength) > (0);
            }

                if (viewModel != null) {
                    // read viewModel.doNotAskAgain
                    viewModelDoNotAskAgain = viewModel.getDoNotAskAgain();
                }
                updateLiveDataRegistration(0, viewModelDoNotAskAgain);


                if (viewModelDoNotAskAgain != null) {
                    // read viewModel.doNotAskAgain.getValue()
                    viewModelDoNotAskAgainGetValue = viewModelDoNotAskAgain.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.doNotAskAgain.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelDoNotAskAgainGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelDoNotAskAgainGetValue);
        }
        // batch finished

        if ((dirtyFlags & 0x6L) != 0) {

                // read viewModel.cancelLabel == null ? @android:string/dialog_cancel : viewModel.cancelLabel
                viewModelCancelLabelJavaLangObjectNullMboundView9AndroidStringDialogCancelViewModelCancelLabel = ((viewModelCancelLabelJavaLangObjectNull) ? (mboundView9.getResources().getString(R.string.dialog_cancel)) : (viewModelCancelLabel));
                // read viewModel.deleteLabel == null ? @android:string/dialog_delete : viewModel.deleteLabel
                viewModelDeleteLabelJavaLangObjectNullMboundView10AndroidStringDialogDeleteViewModelDeleteLabel = ((viewModelDeleteLabelJavaLangObjectNull) ? (mboundView10.getResources().getString(R.string.dialog_delete)) : (viewModelDeleteLabel));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.mboundView1.setContentDescription(viewModelTitle);
            }
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView1, viewModelIconResource);
            this.mboundView1.setVisibility(viewModelShowIconViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, viewModelDeleteLabelJavaLangObjectNullMboundView10AndroidStringDialogDeleteViewModelDeleteLabel);
            this.mboundView10.setVisibility(viewModelShowDeleteViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewModelOkLabel);
            this.mboundView11.setVisibility(viewModelShowOkViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelTitle);
            this.mboundView2.setVisibility(viewModelShowTitleViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelMessage);
            this.mboundView4.setVisibility(viewModelShowSubscribeLinphoneOrgLinkViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(viewModelShowDoNotAskAgainViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelCancelLabelJavaLangObjectNullMboundView9AndroidStringDialogCancelViewModelCancelLabel);
            this.mboundView9.setVisibility(viewModelShowCancelViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsInput, viewModelPassword);
            this.settingsInputLayout.setHint(viewModelPasswordTitle);
            this.settingsInputLayout.setVisibility(viewModelShowPasswordViewVISIBLEViewGONE);
            this.settingsInputLayout.setHelperText(viewModelPasswordSubtitle);
            this.settingsInputLayout.setHelperTextEnabled(viewModelPasswordSubtitleLengthInt0);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(mCallback33);
            this.mboundView11.setOnClickListener(mCallback34);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView8, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView8androidCheckedAttrChanged);
            this.mboundView9.setOnClickListener(mCallback32);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.settingsInput, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, settingsInputandroidTextAttrChanged);
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.settingsInput.setInputType((android.text.InputType.TYPE_CLASS_TEXT) | (android.text.InputType.TYPE_TEXT_VARIATION_PASSWORD));
            }
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView8, androidxDatabindingViewDataBindingSafeUnboxViewModelDoNotAskAgainGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
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
            case 2: {
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
            case 3: {
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
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.doNotAskAgain
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.showTitle ? View.VISIBLE : View.GONE
        flag 4 (0x5L): viewModel.showTitle ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.showDelete ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.showDelete ? View.VISIBLE : View.GONE
        flag 7 (0x8L): viewModel.showPassword ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.showPassword ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.showIcon ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.showIcon ? View.VISIBLE : View.GONE
        flag 11 (0xcL): viewModel.showDoNotAskAgain ? View.VISIBLE : View.GONE
        flag 12 (0xdL): viewModel.showDoNotAskAgain ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.showCancel ? View.VISIBLE : View.GONE
        flag 14 (0xfL): viewModel.showCancel ? View.VISIBLE : View.GONE
        flag 15 (0x10L): viewModel.cancelLabel == null ? @android:string/dialog_cancel : viewModel.cancelLabel
        flag 16 (0x11L): viewModel.cancelLabel == null ? @android:string/dialog_cancel : viewModel.cancelLabel
        flag 17 (0x12L): viewModel.deleteLabel == null ? @android:string/dialog_delete : viewModel.deleteLabel
        flag 18 (0x13L): viewModel.deleteLabel == null ? @android:string/dialog_delete : viewModel.deleteLabel
        flag 19 (0x14L): viewModel.showSubscribeLinphoneOrgLink ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.showSubscribeLinphoneOrgLink ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.showOk ? View.VISIBLE : View.GONE
        flag 22 (0x17L): viewModel.showOk ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}