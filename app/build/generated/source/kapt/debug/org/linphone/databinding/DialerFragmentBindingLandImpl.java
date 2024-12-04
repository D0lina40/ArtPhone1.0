package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DialerFragmentBindingLandImpl extends DialerFragmentBinding implements org.linphone.generated.callback.AfterTextChanged.Listener, org.linphone.generated.callback.OnClickListener.Listener, org.linphone.generated.callback.OnLongClickListener.Listener, org.linphone.generated.callback.BeforeTextChanged.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.address_bar, 8);
        sViewsWithIds.put(R.id.controls, 9);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView7;
    // variables
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged mCallback112;
    @Nullable
    private final android.view.View.OnClickListener mCallback113;
    @Nullable
    private final android.view.View.OnClickListener mCallback109;
    @Nullable
    private final android.view.View.OnClickListener mCallback114;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback110;
    @Nullable
    private final androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged mCallback111;
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

    public DialerFragmentBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private DialerFragmentBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.EditText) bindings[2]
            , null
            , null
            );
        this.erase.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.sipUriInput.setTag(null);
        setRootTag(root);
        // listeners
        mCallback112 = new org.linphone.generated.callback.AfterTextChanged(this, 4);
        mCallback113 = new org.linphone.generated.callback.OnClickListener(this, 5);
        mCallback109 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback114 = new org.linphone.generated.callback.OnClickListener(this, 6);
        mCallback110 = new org.linphone.generated.callback.OnLongClickListener(this, 2);
        mCallback111 = new org.linphone.generated.callback.BeforeTextChanged(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.newContactClickListener);
        super.requestRebind();
    }
    public void setNewConferenceClickListener(@Nullable android.view.View.OnClickListener NewConferenceClickListener) {
        this.mNewConferenceClickListener = NewConferenceClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.newConferenceClickListener);
        super.requestRebind();
    }
    public void setTransferCallClickListener(@Nullable android.view.View.OnClickListener TransferCallClickListener) {
        this.mTransferCallClickListener = TransferCallClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.transferCallClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.dialer.viewmodels.DialerViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
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
                return onChangeViewModelEnteredUri((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
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
    private boolean onChangeViewModelEnteredUri(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelEnteredUri, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTransferVisibility(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelTransferVisibility, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelScheduleConferenceAvailable = null;
        java.lang.Boolean viewModelHideAddContactButtonGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelTransferVisibilityGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAtLeastOneCall = null;
        int viewModelAtLeastOneCallViewGONEViewVISIBLE = 0;
        boolean viewModelEnteredUriLengthInt0 = false;
        int viewModelEnteredUriLength = 0;
        boolean viewModelTransferVisibility = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelHideAddContactButton = null;
        int viewModelScheduleConferenceAvailableViewVISIBLEViewGONE = 0;
        boolean viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse = false;
        java.lang.Boolean viewModelScheduleConferenceAvailableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAutoInitiateVideoCallsGetValue = false;
        java.lang.String viewModelEnteredUriGetValue = null;
        java.lang.Boolean viewModelTransferVisibilityGetValue = null;
        java.lang.Boolean viewModelAtLeastOneCallGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue = false;
        boolean viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButton = false;
        android.view.View.OnClickListener newContactClickListener = mNewContactClickListener;
        int viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelEnteredUri = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelHideAddContactButtonGetValue = false;
        int ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE1 = 0;
        java.lang.Boolean viewModelAutoInitiateVideoCallsGetValue = null;
        boolean ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse1 = false;
        android.graphics.drawable.Drawable viewModelAutoInitiateVideoCallsMboundView5AndroidDrawableCallVideoStartMboundView5AndroidDrawableCallAudioStart = null;
        android.view.View.OnClickListener newConferenceClickListener = mNewConferenceClickListener;
        android.view.View.OnClickListener transferCallClickListener = mTransferCallClickListener;
        org.linphone.activities.main.dialer.viewmodels.DialerViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelTransferVisibility1 = null;

        if ((dirtyFlags & 0x440L) != 0) {
        }
        if ((dirtyFlags & 0x480L) != 0) {
        }
        if ((dirtyFlags & 0x500L) != 0) {
        }
        if ((dirtyFlags & 0x63fL) != 0) {


            if ((dirtyFlags & 0x601L) != 0) {

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
                if((dirtyFlags & 0x601L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAutoInitiateVideoCallsGetValue) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoInitiateVideoCalls.getValue()) ? @android:drawable/call_video_start : @android:drawable/call_audio_start
                    viewModelAutoInitiateVideoCallsMboundView5AndroidDrawableCallVideoStartMboundView5AndroidDrawableCallAudioStart = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAutoInitiateVideoCallsGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.call_video_start)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView5.getContext(), R.drawable.call_audio_start)));
            }
            if ((dirtyFlags & 0x60aL) != 0) {

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
                if((dirtyFlags & 0x602L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
                if((dirtyFlags & 0x60aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }

                if ((dirtyFlags & 0x602L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? View.VISIBLE : View.GONE
                        viewModelScheduleConferenceAvailableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x624L) != 0) {

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
                if((dirtyFlags & 0x604L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }
                if((dirtyFlags & 0x624L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x2000000L;
                    }
                }

                if ((dirtyFlags & 0x604L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? View.GONE : View.VISIBLE
                        viewModelAtLeastOneCallViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x610L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.enteredUri
                        viewModelEnteredUri = viewModel.getEnteredUri();
                    }
                    updateLiveDataRegistration(4, viewModelEnteredUri);


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
        }
        // batch finished

        if ((dirtyFlags & 0x80000L) != 0) {

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
        if ((dirtyFlags & 0x4040000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.transferVisibility
                    ViewModelTransferVisibility1 = viewModel.getTransferVisibility();
                }
                updateLiveDataRegistration(5, ViewModelTransferVisibility1);


                if (ViewModelTransferVisibility1 != null) {
                    // read viewModel.transferVisibility.getValue()
                    viewModelTransferVisibilityGetValue = ViewModelTransferVisibility1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelTransferVisibilityGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelTransferVisibilityGetValue);

            if ((dirtyFlags & 0x40000L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue())
                    viewModelTransferVisibility = !androidxDatabindingViewDataBindingSafeUnboxViewModelTransferVisibilityGetValue;
            }
        }

        if ((dirtyFlags & 0x624L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
                viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) ? (viewModelTransferVisibility) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
                ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAtLeastOneCallGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelTransferVisibilityGetValue) : (false));
            if((dirtyFlags & 0x624L) != 0) {
                if(viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }
            if((dirtyFlags & 0x624L) != 0) {
                if(ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse1) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE = ((viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
                ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE1 = ((ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x60aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue())
                viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButton = ((androidxDatabindingViewDataBindingSafeUnboxViewModelScheduleConferenceAvailableGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelHideAddContactButtonGetValue));
            if((dirtyFlags & 0x60aL) != 0) {
                if(viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButton) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue()) ? View.GONE : View.VISIBLE
                viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButtonViewGONEViewVISIBLE = ((viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButton) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.erase.setOnClickListener(mCallback109);
            this.erase.setOnLongClickListener(mCallback110);
            this.mboundView5.setOnClickListener(mCallback113);
            this.mboundView6.setOnClickListener(mCallback114);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.sipUriInput, mCallback111, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, mCallback112, sipUriInputandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x480L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(newConferenceClickListener);
        }
        if ((dirtyFlags & 0x602L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelScheduleConferenceAvailableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x440L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(newContactClickListener);
        }
        if ((dirtyFlags & 0x60aL) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelScheduleConferenceAvailableBooleanTrueViewModelHideAddContactButtonViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            this.mboundView4.setEnabled(viewModelEnteredUriLengthInt0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sipUriInput, viewModelEnteredUriGetValue);
        }
        if ((dirtyFlags & 0x604L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelAtLeastOneCallViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x601L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView5, viewModelAutoInitiateVideoCallsMboundView5AndroidDrawableCallVideoStartMboundView5AndroidDrawableCallAudioStart);
        }
        if ((dirtyFlags & 0x624L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(viewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(ViewModelAtLeastOneCallViewModelTransferVisibilityBooleanFalseViewVISIBLEViewGONE1);
        }
        if ((dirtyFlags & 0x500L) != 0) {
            // api target 1

            this.mboundView7.setOnClickListener(transferCallClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
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
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 5: {
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


                    viewModel.eraseLastChar();
                }
                break;
            }
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
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.autoInitiateVideoCalls
        flag 1 (0x2L): viewModel.scheduleConferenceAvailable
        flag 2 (0x3L): viewModel.atLeastOneCall
        flag 3 (0x4L): viewModel.hideAddContactButton
        flag 4 (0x5L): viewModel.enteredUri
        flag 5 (0x6L): viewModel.transferVisibility
        flag 6 (0x7L): newContactClickListener
        flag 7 (0x8L): newConferenceClickListener
        flag 8 (0x9L): transferCallClickListener
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue()) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue()) ? View.GONE : View.VISIBLE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? View.GONE : View.VISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue())
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.scheduleConferenceAvailable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.hideAddContactButton.getValue())
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.atLeastOneCall.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.transferVisibility.getValue()) : false
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoInitiateVideoCalls.getValue()) ? @android:drawable/call_video_start : @android:drawable/call_audio_start
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.autoInitiateVideoCalls.getValue()) ? @android:drawable/call_video_start : @android:drawable/call_audio_start
    flag mapping end*/
    //end
}