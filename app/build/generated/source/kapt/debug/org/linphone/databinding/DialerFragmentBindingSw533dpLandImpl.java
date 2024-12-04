package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialerFragmentBindingSw533dpLandImpl extends DialerFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener, org.linphone.generated.callback.OnLongClickListener.Listener, org.linphone.generated.callback.BeforeTextChanged.Listener, org.linphone.generated.callback.AfterTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(15);
        sIncludes.setIncludes(4, 
            new String[] {"numpad"},
            new int[] {12},
            new int[] {org.linphone.R.layout.numpad});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.address_bar, 13);
        sViewsWithIds.put(R.id.controls, 14);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView10;
    @NonNull
    private final android.widget.ImageView mboundView11;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @Nullable
    private final org.linphone.databinding.NumpadBinding mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback184;
    @Nullable
    private final android.view.View.OnClickListener mCallback180;
    @Nullable
    private final android.view.View.OnClickListener mCallback185;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback181;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged mCallback182;
    @Nullable
    private final android.view.View.OnClickListener mCallback179;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback183;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener sipUriInputandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.enteredUri.getValue()
            //         is viewModel.enteredUri.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(sipUriInput);
            // localize variables for thread safety
            // viewModel.enteredUri
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEnteredUri = null;
            // viewModel.enteredUri.getValue()
            java.lang.String viewModelEnteredUriGetValue = null;
            // viewModel
            org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.enteredUri != null
            boolean viewModelEnteredUriJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelEnteredUri = viewModel.getEnteredUri();

                viewModelEnteredUriJavaLangObjectNull = (viewModelEnteredUri) != (null);
                if (viewModelEnteredUriJavaLangObjectNull) {




                    viewModelEnteredUri.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DialerFragmentBindingSw533dpLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private DialerFragmentBindingSw533dpLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.RelativeLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.EditText) bindings[6]
            , (android.widget.RelativeLayout) bindings[4]
            , (org.linphone.mediastream.video.capture.CaptureTextureView) bindings[2]
            );
        this.erase.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.ImageView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.ImageView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (org.linphone.databinding.NumpadBinding) bindings[12];
        setContainedBinding(this.mboundView4);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.sipUriInput.setTag(null);
        this.uiLayout.setTag(null);
        this.videoPreviewWindow.setTag(null);
        setRootTag(root);
        // listeners
        mCallback184 = new org.linphone.generated.callback.OnClickListener(this, 6);
        mCallback180 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback185 = new org.linphone.generated.callback.OnClickListener(this, 7);
        mCallback181 = new org.linphone.generated.callback.OnLongClickListener(this, 3);
        mCallback182 = new org.linphone.generated.callback.BeforeTextChanged(this, 4);
        mCallback179 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback183 = new org.linphone.generated.callback.AfterTextChanged(this, 5);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
        }
        mboundView4.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView4.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.newContactClickListener == variableId) {
            setNewContactClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.newConferenceClickListener == variableId) {
            setNewConferenceClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.transferCallClickListener == variableId) {
            setTransferCallClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.dialer.viewmodels.DialerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setNewContactClickListener(@Nullable android.view.View.OnClickListener NewContactClickListener) {
        this.mNewContactClickListener = NewContactClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.newContactClickListener);
        super.requestRebind();
    }
    public void setNewConferenceClickListener(@Nullable android.view.View.OnClickListener NewConferenceClickListener) {
        this.mNewConferenceClickListener = NewConferenceClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.newConferenceClickListener);
        super.requestRebind();
    }
    public void setTransferCallClickListener(@Nullable android.view.View.OnClickListener TransferCallClickListener) {
        this.mTransferCallClickListener = TransferCallClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.transferCallClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.dialer.viewmodels.DialerViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView4.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAutoInitiateVideoCalls((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelScheduleConferenceAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelAtLeastOneCall((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelHideAddContactButton((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelShowPreview((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelShowSwitchCamera((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelEnteredUri((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeViewModelTransferVisibility((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAutoInitiateVideoCalls(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAutoInitiateVideoCalls, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelScheduleConferenceAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelScheduleConferenceAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAtLeastOneCall(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAtLeastOneCall, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHideAddContactButton(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelHideAddContactButton, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPreview(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowPreview, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowSwitchCamera(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelShowSwitchCamera, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelEnteredUri(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEnteredUri, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTransferVisibility(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelTransferVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAutoInitiateVideoCalls = null;
        int viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButtonViewGONEViewVISIBLE = 0;
        int viewModelShowPreviewViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelScheduleConferenceAvailable = null;
        java.lang.Boolean viewModelHideAddContactButtonGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowSwitchCameraGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelTransferVisibilityGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAtLeastOneCall = null;
        int viewModelAtLeastOneCallViewGONEViewVISIBLE = 0;
        boolean viewModelEnteredUriLengthInt0 = false;
        java.lang.Boolean viewModelShowSwitchCameraGetValue = null;
        int viewModelEnteredUriLength = 0;
        boolean viewModelTransferVisibility = false;
        int viewModelShowPreviewViewModelShowSwitchCameraBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHideAddContactButton = null;
        int viewModelScheduleConferenceAvailableViewVISIBLEViewGONE = 0;
        boolean viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelShowPreviewGetValue = false;
        java.lang.Boolean viewModelScheduleConferenceAvailableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAutoInitiateVideoCallsGetValue = false;
        java.lang.String viewModelEnteredUriGetValue = null;
        java.lang.Boolean viewModelTransferVisibilityGetValue = null;
        java.lang.Boolean viewModelAtLeastOneCallGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue = false;
        boolean viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButton = false;
        android.view.View.OnClickListener newContactClickListener = mNewContactClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowPreview = null;
        int viewModelShowPreviewViewGONEViewVISIBLE = 0;
        int viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelShowSwitchCamera = null;
        android.graphics.drawable.Drawable viewModelAutoInitiateVideoCallsMboundView9AndroidDrawableCallVideoStartMboundView9AndroidDrawableCallAudioStart = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEnteredUri = null;
        org.linphone.activities.main.dialer.NumpadDigitListener viewModelOnKeyClick = null;
        boolean viewModelShowPreviewViewModelShowSwitchCameraBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHideAddContactButtonGetValue = false;
        int ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE1 = 0;
        java.lang.Boolean viewModelAutoInitiateVideoCallsGetValue = null;
        boolean ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse1 = false;
        java.lang.Boolean viewModelShowPreviewGetValue = null;
        android.view.View.OnClickListener newConferenceClickListener = mNewConferenceClickListener;
        android.view.View.OnClickListener transferCallClickListener = mTransferCallClickListener;
        org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelTransferVisibility1 = null;

        if ((dirtyFlags & 0x1100L) != 0) {
        }
        if ((dirtyFlags & 0x1200L) != 0) {
        }
        if ((dirtyFlags & 0x1400L) != 0) {
        }
        if ((dirtyFlags & 0x18ffL) != 0) {


            if ((dirtyFlags & 0x1801L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.autoInitiateVideoCalls
                        viewModelAutoInitiateVideoCalls = viewModel.getAutoInitiateVideoCalls();
                    }
                    updateLiveDataRegistration(0, viewModelAutoInitiateVideoCalls);


                    if (viewModelAutoInitiateVideoCalls != null) {
                        // read viewModel.autoInitiateVideoCalls.getValue()
                        viewModelAutoInitiateVideoCallsGetValue = viewModelAutoInitiateVideoCalls.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoInitiateVideoCalls.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAutoInitiateVideoCallsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAutoInitiateVideoCallsGetValue);
                if((dirtyFlags & 0x1801L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAutoInitiateVideoCallsGetValue) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoInitiateVideoCalls.getValue()) ? @android:drawable/call_video_start : @android:drawable/call_audio_start
                    viewModelAutoInitiateVideoCallsMboundView9AndroidDrawableCallVideoStartMboundView9AndroidDrawableCallAudioStart = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAutoInitiateVideoCallsGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView9.getContext(), R.drawable.call_video_start)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView9.getContext(), R.drawable.call_audio_start)));
            }
            if ((dirtyFlags & 0x180aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.scheduleConferenceAvailable
                        viewModelScheduleConferenceAvailable = viewModel.getScheduleConferenceAvailable();
                    }
                    updateLiveDataRegistration(1, viewModelScheduleConferenceAvailable);


                    if (viewModelScheduleConferenceAvailable != null) {
                        // read viewModel.scheduleConferenceAvailable.getValue()
                        viewModelScheduleConferenceAvailableGetValue = viewModelScheduleConferenceAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelScheduleConferenceAvailableGetValue);
                if((dirtyFlags & 0x1802L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
                if((dirtyFlags & 0x180aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }

                if ((dirtyFlags & 0x1802L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? View.VISIBLE : View.GONE
                        viewModelScheduleConferenceAvailableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x1884L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.atLeastOneCall
                        viewModelAtLeastOneCall = viewModel.getAtLeastOneCall();
                    }
                    updateLiveDataRegistration(2, viewModelAtLeastOneCall);


                    if (viewModelAtLeastOneCall != null) {
                        // read viewModel.atLeastOneCall.getValue()
                        viewModelAtLeastOneCallGetValue = viewModelAtLeastOneCall.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAtLeastOneCallGetValue);
                if((dirtyFlags & 0x1804L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x1884L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) {
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                            dirtyFlags |= 0x2000000000L;
                    }
                }

                if ((dirtyFlags & 0x1804L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? View.GONE : View.VISIBLE
                        viewModelAtLeastOneCallViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x1830L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPreview
                        viewModelShowPreview = viewModel.getShowPreview();
                    }
                    updateLiveDataRegistration(4, viewModelShowPreview);


                    if (viewModelShowPreview != null) {
                        // read viewModel.showPreview.getValue()
                        viewModelShowPreviewGetValue = viewModelShowPreview.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelShowPreviewGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowPreviewGetValue);
                if((dirtyFlags & 0x1810L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPreviewGetValue) {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x8000000L;
                    }
                }
                if((dirtyFlags & 0x1830L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelShowPreviewGetValue) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }

                if ((dirtyFlags & 0x1810L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? View.VISIBLE : View.GONE
                        viewModelShowPreviewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPreviewGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? View.GONE : View.VISIBLE
                        viewModelShowPreviewViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPreviewGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x1840L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.enteredUri
                        viewModelEnteredUri = viewModel.getEnteredUri();
                    }
                    updateLiveDataRegistration(6, viewModelEnteredUri);


                    if (viewModelEnteredUri != null) {
                        // read viewModel.enteredUri.getValue()
                        viewModelEnteredUriGetValue = viewModelEnteredUri.getValue();
                    }


                    if (viewModelEnteredUriGetValue != null) {
                        // read viewModel.enteredUri.getValue().length()
                        viewModelEnteredUriLength = viewModelEnteredUriGetValue.length();
                    }


                    // read viewModel.enteredUri.getValue().length() > 0
                    viewModelEnteredUriLengthInt0 = (viewModelEnteredUriLength) > (0);
            }
            if ((dirtyFlags & 0x1800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.onKeyClick
                        viewModelOnKeyClick = viewModel.getOnKeyClick();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x2000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.hideAddContactButton
                    viewModelHideAddContactButton = viewModel.getHideAddContactButton();
                }
                updateLiveDataRegistration(3, viewModelHideAddContactButton);


                if (viewModelHideAddContactButton != null) {
                    // read viewModel.hideAddContactButton.getValue()
                    viewModelHideAddContactButtonGetValue = viewModelHideAddContactButton.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelHideAddContactButtonGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHideAddContactButtonGetValue);
        }
        if ((dirtyFlags & 0x400000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.showSwitchCamera
                    viewModelShowSwitchCamera = viewModel.getShowSwitchCamera();
                }
                updateLiveDataRegistration(5, viewModelShowSwitchCamera);


                if (viewModelShowSwitchCamera != null) {
                    // read viewModel.showSwitchCamera.getValue()
                    viewModelShowSwitchCameraGetValue = viewModelShowSwitchCamera.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelShowSwitchCameraGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelShowSwitchCameraGetValue);
        }
        if ((dirtyFlags & 0x4001000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.transferVisibility
                    ViewModelTransferVisibility1 = viewModel.getTransferVisibility();
                }
                updateLiveDataRegistration(7, ViewModelTransferVisibility1);


                if (ViewModelTransferVisibility1 != null) {
                    // read viewModel.transferVisibility.getValue()
                    viewModelTransferVisibilityGetValue = ViewModelTransferVisibility1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelTransferVisibilityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelTransferVisibilityGetValue);

            if ((dirtyFlags & 0x1000000L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue())
                    viewModelTransferVisibility = !androidxDatabindingViewDataBindingSafeUnboxViewModelTransferVisibilityGetValue;
            }
        }

        if ((dirtyFlags & 0x1884L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
                viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) ? (viewModelTransferVisibility) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
                ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelTransferVisibilityGetValue) : (false));
            if((dirtyFlags & 0x1884L) != 0) {
                if(viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse) {
                        dirtyFlags |= 0x40000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                }
            }
            if((dirtyFlags & 0x1884L) != 0) {
                if(ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse1) {
                        dirtyFlags |= 0x1000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE = ((viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
                ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE1 = ((ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x180aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue())
                viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButton = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelHideAddContactButtonGetValue));
            if((dirtyFlags & 0x180aL) != 0) {
                if(viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButton) {
                        dirtyFlags |= 0x4000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue()) ? View.GONE : View.VISIBLE
                viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButtonViewGONEViewVISIBLE = ((viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButton) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        if ((dirtyFlags & 0x1830L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue()) : false
                viewModelShowPreviewViewModelShowSwitchCameraBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelShowPreviewGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelShowSwitchCameraGetValue) : (false));
            if((dirtyFlags & 0x1830L) != 0) {
                if(viewModelShowPreviewViewModelShowSwitchCameraBooleanFalse) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelShowPreviewViewModelShowSwitchCameraBooleanFalseViewVISIBLEViewGONE = ((viewModelShowPreviewViewModelShowSwitchCameraBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x1000L) != 0) {
            // api target 1

            this.erase.setOnClickListener(mCallback180);
            this.erase.setOnLongClickListener(mCallback181);
            this.mboundView10.setOnClickListener(mCallback185);
            this.mboundView3.setOnClickListener(mCallback179);
            this.mboundView9.setOnClickListener(mCallback184);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.sipUriInput, mCallback182, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback183, sipUriInputandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x1810L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelShowPreviewViewGONEViewVISIBLE);
            this.videoPreviewWindow.setVisibility(viewModelShowPreviewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1884L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE);
            this.mboundView11.setVisibility(ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE1);
        }
        if ((dirtyFlags & 0x1400L) != 0) {
            // api target 1

            this.mboundView11.setOnClickListener(transferCallClickListener);
        }
        if ((dirtyFlags & 0x1830L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelShowPreviewViewModelShowSwitchCameraBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            this.mboundView4.setKeyListener(viewModelOnKeyClick);
        }
        if ((dirtyFlags & 0x1200L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(newConferenceClickListener);
        }
        if ((dirtyFlags & 0x1802L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(viewModelScheduleConferenceAvailableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1100L) != 0) {
            // api target 1

            this.mboundView8.setOnClickListener(newContactClickListener);
        }
        if ((dirtyFlags & 0x180aL) != 0) {
            // api target 1

            this.mboundView8.setVisibility(viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButtonViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1840L) != 0) {
            // api target 1

            this.mboundView8.setEnabled(viewModelEnteredUriLengthInt0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sipUriInput, viewModelEnteredUriGetValue);
        }
        if ((dirtyFlags & 0x1804L) != 0) {
            // api target 1

            this.mboundView9.setVisibility(viewModelAtLeastOneCallViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView9, viewModelAutoInitiateVideoCallsMboundView9AndroidDrawableCallVideoStartMboundView9AndroidDrawableCallAudioStart);
        }
        executeBindingsOn(mboundView4);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.startCall();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.eraseLastChar();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.startCall();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.switchCamera();
                }
                break;
            }
        }
    }
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
        // viewModel.eraseAll()
        boolean viewModelEraseAll = false;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModelEraseAll = viewModel.eraseAll();
        }
        return viewModelEraseAll;
    }
    public final void _internalCallbackBeforeTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {





            viewModel.onBeforeUriChanged(sipUriInput, callbackArg_2, callbackArg_3);
        }
    }
    public final void _internalCallbackAfterTextChanged(int sourceId , android.text.Editable callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            viewModel.onAfterUriChanged(sipUriInput, callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.autoInitiateVideoCalls
        flag 1 (0x2L): viewModel.scheduleConferenceAvailable
        flag 2 (0x3L): viewModel.atLeastOneCall
        flag 3 (0x4L): viewModel.hideAddContactButton
        flag 4 (0x5L): viewModel.showPreview
        flag 5 (0x6L): viewModel.showSwitchCamera
        flag 6 (0x7L): viewModel.enteredUri
        flag 7 (0x8L): viewModel.transferVisibility
        flag 8 (0x9L): newContactClickListener
        flag 9 (0xaL): newConferenceClickListener
        flag 10 (0xbL): transferCallClickListener
        flag 11 (0xcL): viewModel
        flag 12 (0xdL): null
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue()) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue()) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? View.GONE : View.VISIBLE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? View.GONE : View.VISIBLE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue()) : false ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue()) : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue())
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue())
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? View.GONE : View.VISIBLE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? View.GONE : View.VISIBLE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoInitiateVideoCalls.getValue()) ? @android:drawable/call_video_start : @android:drawable/call_audio_start
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoInitiateVideoCalls.getValue()) ? @android:drawable/call_video_start : @android:drawable/call_audio_start
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue()) : false
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showPreview.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.showSwitchCamera.getValue()) : false
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
    flag mapping end*/
    //end
}