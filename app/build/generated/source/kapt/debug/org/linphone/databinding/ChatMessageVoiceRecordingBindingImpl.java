package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageVoiceRecordingBindingImpl extends ChatMessageVoiceRecordingBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.play_pause_stop, 8);
    }
    // views
    @NonNull
    private final org.linphone.views.VoiceRecordProgressBar mboundView2;
    @NonNull
    private final android.widget.ProgressBar mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView7;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback233;
    @Nullable
    private final android.view.View.OnClickListener mCallback231;
    @Nullable
    private final android.view.View.OnClickListener mCallback232;
    @Nullable
    private final android.view.View.OnClickListener mCallback230;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageVoiceRecordingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ChatMessageVoiceRecordingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[0]
            );
        this.cancelRecording.setTag(null);
        this.duration.setTag(null);
        this.mboundView2 = (org.linphone.views.VoiceRecordProgressBar) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ProgressBar) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.voiceRecording.setTag(null);
        setRootTag(root);
        // listeners
        mCallback233 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback231 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback232 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback230 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
        if (BR.inflatedVisibility == variableId) {
            setInflatedVisibility((java.lang.Integer) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel ViewModel) {
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
                return onChangeViewModelFormattedDuration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelIsPlayingVoiceRecording((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelVoiceRecordPlayingPosition((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeViewModelVoiceRecordingDuration((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeViewModelIsVoiceRecording((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFormattedDuration(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFormattedDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsPlayingVoiceRecording(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsPlayingVoiceRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVoiceRecordPlayingPosition(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelVoiceRecordPlayingPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelVoiceRecordingDuration(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelVoiceRecordingDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsVoiceRecording(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsVoiceRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        int androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceRecordingDurationGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlayingVoiceRecordingGetValue = false;
        java.lang.Integer viewModelVoiceRecordingDurationGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceRecordPlayingPositionGetValue = 0;
        boolean viewModelIsPlayingVoiceRecording = false;
        int viewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Integer viewModelVoiceRecordPlayingPositionGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFormattedDuration = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsPlayingVoiceRecording1 = null;
        int viewModelVoiceRecordingProgressBarMax = 0;
        int viewModelIsVoiceRecordingViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelVoiceRecordPlayingPosition = null;
        int viewModelIsVoiceRecordingViewVISIBLEViewGONE = 0;
        boolean viewModelIsVoiceRecording = false;
        java.lang.Boolean viewModelIsPlayingVoiceRecordingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelVoiceRecordingDuration = null;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        boolean viewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalse = false;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        int ViewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalseViewVISIBLEViewGONE1 = 0;
        java.lang.String viewModelFormattedDurationGetValue = null;
        boolean ViewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalse1 = false;
        java.lang.Boolean viewModelIsVoiceRecordingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsVoiceRecordingGetValue = false;
        org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsVoiceRecording1 = null;

        if ((dirtyFlags & 0xa0L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        if ((dirtyFlags & 0xdfL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.formattedDuration
                        viewModelFormattedDuration = viewModel.getFormattedDuration();
                    }
                    updateLiveDataRegistration(0, viewModelFormattedDuration);


                    if (viewModelFormattedDuration != null) {
                        // read viewModel.formattedDuration.getValue()
                        viewModelFormattedDurationGetValue = viewModelFormattedDuration.getValue();
                    }
            }
            if ((dirtyFlags & 0xc0L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.voiceRecordingProgressBarMax
                        viewModelVoiceRecordingProgressBarMax = viewModel.getVoiceRecordingProgressBarMax();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.voiceRecordPlayingPosition
                        viewModelVoiceRecordPlayingPosition = viewModel.getVoiceRecordPlayingPosition();
                    }
                    updateLiveDataRegistration(2, viewModelVoiceRecordPlayingPosition);


                    if (viewModelVoiceRecordPlayingPosition != null) {
                        // read viewModel.voiceRecordPlayingPosition.getValue()
                        viewModelVoiceRecordPlayingPositionGetValue = viewModelVoiceRecordPlayingPosition.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceRecordPlayingPosition.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceRecordPlayingPositionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelVoiceRecordPlayingPositionGetValue);
            }
            if ((dirtyFlags & 0xc8L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.voiceRecordingDuration
                        viewModelVoiceRecordingDuration = viewModel.getVoiceRecordingDuration();
                    }
                    updateLiveDataRegistration(3, viewModelVoiceRecordingDuration);


                    if (viewModelVoiceRecordingDuration != null) {
                        // read viewModel.voiceRecordingDuration.getValue()
                        viewModelVoiceRecordingDurationGetValue = viewModelVoiceRecordingDuration.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.voiceRecordingDuration.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceRecordingDurationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelVoiceRecordingDurationGetValue);
            }
            if ((dirtyFlags & 0xd2L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isVoiceRecording
                        ViewModelIsVoiceRecording1 = viewModel.isVoiceRecording();
                    }
                    updateLiveDataRegistration(4, ViewModelIsVoiceRecording1);


                    if (ViewModelIsVoiceRecording1 != null) {
                        // read viewModel.isVoiceRecording.getValue()
                        viewModelIsVoiceRecordingGetValue = ViewModelIsVoiceRecording1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsVoiceRecordingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsVoiceRecordingGetValue);
                if((dirtyFlags & 0xd0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsVoiceRecordingGetValue) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                    }
                }

                if ((dirtyFlags & 0xd0L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? View.GONE : View.VISIBLE
                        viewModelIsVoiceRecordingViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsVoiceRecordingGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? View.VISIBLE : View.GONE
                        viewModelIsVoiceRecordingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsVoiceRecordingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue())
                    viewModelIsVoiceRecording = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsVoiceRecordingGetValue;
                if((dirtyFlags & 0xd2L) != 0) {
                    if(viewModelIsVoiceRecording) {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x40000L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x88000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isPlayingVoiceRecording
                    ViewModelIsPlayingVoiceRecording1 = viewModel.isPlayingVoiceRecording();
                }
                updateLiveDataRegistration(1, ViewModelIsPlayingVoiceRecording1);


                if (ViewModelIsPlayingVoiceRecording1 != null) {
                    // read viewModel.isPlayingVoiceRecording.getValue()
                    viewModelIsPlayingVoiceRecordingGetValue = ViewModelIsPlayingVoiceRecording1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlayingVoiceRecordingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsPlayingVoiceRecordingGetValue);

            if ((dirtyFlags & 0x80000L) != 0) {

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue())
                    viewModelIsPlayingVoiceRecording = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlayingVoiceRecordingGetValue;
            }
        }

        if ((dirtyFlags & 0xd2L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false
                viewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalse = ((viewModelIsVoiceRecording) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlayingVoiceRecordingGetValue) : (false));
                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false
                ViewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalse1 = ((viewModelIsVoiceRecording) ? (viewModelIsPlayingVoiceRecording) : (false));
            if((dirtyFlags & 0xd2L) != 0) {
                if(viewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalse) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0xd2L) != 0) {
                if(ViewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalse1) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalseViewVISIBLEViewGONE = ((viewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false ? View.VISIBLE : View.GONE
                ViewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalseViewVISIBLEViewGONE1 = ((ViewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.cancelRecording.setOnClickListener(mCallback230);
            org.linphone.utils.DataBindingUtilsKt.setSecProgressTint(this.mboundView2, getColorFromResource(mboundView2, R.color.green_color));
            this.mboundView5.setOnClickListener(mCallback231);
            this.mboundView6.setOnClickListener(mCallback232);
            this.mboundView7.setOnClickListener(mCallback233);
            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.voiceRecording, true);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.duration, viewModelFormattedDurationGetValue);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelIsVoiceRecordingViewGONEViewVISIBLE);
            this.mboundView3.setVisibility(viewModelIsVoiceRecordingViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(viewModelIsVoiceRecordingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPrimaryProgress(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceRecordPlayingPositionGetValue);
            org.linphone.utils.DataBindingUtilsKt.setSecProgress(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceRecordPlayingPositionGetValue);
        }
        if ((dirtyFlags & 0xc8L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setProgressMax(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceRecordingDurationGetValue);
            this.mboundView3.setProgress(androidxDatabindingViewDataBindingSafeUnboxViewModelVoiceRecordingDurationGetValue);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.mboundView3.setMax(viewModelVoiceRecordingProgressBarMax);
        }
        if ((dirtyFlags & 0xd2L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(ViewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalseViewVISIBLEViewGONE1);
            this.mboundView7.setVisibility(viewModelIsVoiceRecordingViewModelIsPlayingVoiceRecordingBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            this.voiceRecording.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.pauseRecordedMessage();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.stopVoiceRecording();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.playRecordedMessage();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.cancelVoiceRecording();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.formattedDuration
        flag 1 (0x2L): viewModel.isPlayingVoiceRecording
        flag 2 (0x3L): viewModel.voiceRecordPlayingPosition
        flag 3 (0x4L): viewModel.voiceRecordingDuration
        flag 4 (0x5L): viewModel.isVoiceRecording
        flag 5 (0x6L): inflatedVisibility
        flag 6 (0x7L): viewModel
        flag 7 (0x8L): null
        flag 8 (0x9L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false ? View.VISIBLE : View.GONE
        flag 9 (0xaL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false
        flag 15 (0x10L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false
        flag 16 (0x11L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false ? View.VISIBLE : View.GONE
        flag 18 (0x13L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false
        flag 19 (0x14L): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVoiceRecording.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlayingVoiceRecording.getValue()) : false
    flag mapping end*/
    //end
}