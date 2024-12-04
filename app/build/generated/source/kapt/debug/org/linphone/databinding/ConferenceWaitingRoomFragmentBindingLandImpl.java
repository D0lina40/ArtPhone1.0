package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConferenceWaitingRoomFragmentBindingLandImpl extends ConferenceWaitingRoomFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.local_preview_video_surface, 20);
        sViewsWithIds.put(R.id.conference_controls, 21);
        sViewsWithIds.put(R.id.buttons, 22);
        sViewsWithIds.put(R.id.speaker, 23);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView11;
    @NonNull
    private final android.widget.ImageView mboundView12;
    @NonNull
    private final android.widget.ImageView mboundView13;
    @NonNull
    private final android.widget.ImageView mboundView14;
    @NonNull
    private final android.widget.ImageView mboundView15;
    @NonNull
    private final android.widget.ImageView mboundView16;
    @NonNull
    private final android.widget.ImageView mboundView17;
    @NonNull
    private final android.widget.ImageView mboundView18;
    @NonNull
    private final android.widget.ImageView mboundView19;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback136;
    @Nullable
    private final android.view.View.OnClickListener mCallback140;
    @Nullable
    private final android.view.View.OnClickListener mCallback137;
    @Nullable
    private final android.view.View.OnClickListener mCallback141;
    @Nullable
    private final android.view.View.OnClickListener mCallback134;
    @Nullable
    private final android.view.View.OnClickListener mCallback135;
    @Nullable
    private final android.view.View.OnClickListener mCallback144;
    @Nullable
    private final android.view.View.OnClickListener mCallback132;
    @Nullable
    private final android.view.View.OnClickListener mCallback133;
    @Nullable
    private final android.view.View.OnClickListener mCallback138;
    @Nullable
    private final android.view.View.OnClickListener mCallback142;
    @Nullable
    private final android.view.View.OnClickListener mCallback139;
    @Nullable
    private final android.view.View.OnClickListener mCallback131;
    @Nullable
    private final android.view.View.OnClickListener mCallback143;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ConferenceWaitingRoomFragmentBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private ConferenceWaitingRoomFragmentBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 15
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[22]
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[21]
            , (android.widget.TextView) bindings[3]
            , (org.linphone.activities.voip.views.RoundCornersTextureView) bindings[20]
            , (android.widget.RelativeLayout) bindings[23]
            , (android.widget.TextView) bindings[6]
            );
        this.cancel.setTag(null);
        this.conferenceSubject.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.ImageView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.ImageView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.ImageView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.ImageView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.ImageView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView16 = (android.widget.ImageView) bindings[16];
        this.mboundView16.setTag(null);
        this.mboundView17 = (android.widget.ImageView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.ImageView) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (android.widget.ImageView) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.start.setTag(null);
        setRootTag(root);
        // listeners
        mCallback136 = new org.linphone.generated.callback.OnClickListener(this, 6);
        mCallback140 = new org.linphone.generated.callback.OnClickListener(this, 10);
        mCallback137 = new org.linphone.generated.callback.OnClickListener(this, 7);
        mCallback141 = new org.linphone.generated.callback.OnClickListener(this, 11);
        mCallback134 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback135 = new org.linphone.generated.callback.OnClickListener(this, 5);
        mCallback144 = new org.linphone.generated.callback.OnClickListener(this, 14);
        mCallback132 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback133 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback138 = new org.linphone.generated.callback.OnClickListener(this, 8);
        mCallback142 = new org.linphone.generated.callback.OnClickListener(this, 12);
        mCallback139 = new org.linphone.generated.callback.OnClickListener(this, 9);
        mCallback131 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback143 = new org.linphone.generated.callback.OnClickListener(this, 13);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10000L;
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
            setViewModel((org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLowBandwidth((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelAudioRoutesSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelIsVideoAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelJoinInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelIsVideoEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelLayoutMenuSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelConferenceLayoutMenuTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 8 :
                return onChangeViewModelIsSpeakerSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeViewModelSelectedLayout((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode>) object, fieldId);
            case 10 :
                return onChangeViewModelAudioRoutesEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelIsSwitchCameraAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeViewModelIsBluetoothHeadsetSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeViewModelAudioRoutesMenuTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 14 :
                return onChangeViewModelIsMicrophoneMuted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLowBandwidth(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLowBandwidth, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAudioRoutesSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAudioRoutesSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsVideoAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsVideoAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelJoinInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelJoinInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSubject(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsVideoEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsVideoEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLayoutMenuSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelLayoutMenuSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelConferenceLayoutMenuTranslateY(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelConferenceLayoutMenuTranslateY, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsSpeakerSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsSpeakerSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectedLayout(androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> ViewModelSelectedLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAudioRoutesEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelAudioRoutesEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsSwitchCameraAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsSwitchCameraAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsBluetoothHeadsetSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsBluetoothHeadsetSelected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAudioRoutesMenuTranslateY(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelAudioRoutesMenuTranslateY, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsMicrophoneMuted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsMicrophoneMuted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
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
        int viewModelHideVideoViewGONEViewVISIBLE = 0;
        int viewModelAudioRoutesEnabledViewGONEViewVISIBLE = 0;
        java.lang.Boolean viewModelJoinInProgressGetValue = null;
        java.lang.String viewModelIsSpeakerSelectedMboundView16AndroidStringContentDescriptionDisableSpeakerMboundView16AndroidStringContentDescriptionEnableSpeaker = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLowBandwidth = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgressGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAudioRoutesSelected = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsVideoAvailable = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelJoinInProgress = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesSelectedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSubject = null;
        boolean viewModelSelectedLayoutConferenceDisplayModeACTIVESPEAKER = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgress = false;
        int viewModelAudioRoutesEnabledViewVISIBLEViewGONE = 0;
        boolean viewModelJoinInProgressViewModelIsVideoAvailableBooleanFalse = false;
        boolean viewModelJoinInProgressViewModelIsVideoAvailableBooleanFalseViewModelIsLowBandwidthBooleanFalse = false;
        java.lang.Boolean viewModelIsLowBandwidthGetValue = null;
        boolean viewModelJoinInProgressViewModelIsLowBandwidthBooleanFalse = false;
        java.lang.Boolean viewModelIsSwitchCameraAvailableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsBluetoothHeadsetSelectedGetValue = false;
        org.linphone.activities.voip.ConferenceDisplayMode viewModelSelectedLayoutGetValue = null;
        int viewModelIsSwitchCameraAvailableViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsVideoEnabled = null;
        java.lang.String viewModelIsVideoEnabledMboundView18AndroidStringContentDescriptionDisableVideoMboundView18AndroidStringContentDescriptionEnableVideo = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelLayoutMenuSelected = null;
        float androidxDatabindingViewDataBindingSafeUnboxViewModelConferenceLayoutMenuTranslateYGetValue = 0f;
        java.lang.Boolean viewModelIsBluetoothHeadsetSelectedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelConferenceLayoutMenuTranslateY = null;
        boolean viewModelIsBluetoothHeadsetSelected = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelLayoutMenuSelectedGetValue = false;
        boolean ViewModelJoinInProgress1 = false;
        java.lang.Boolean viewModelLayoutMenuSelectedGetValue = null;
        boolean ViewModelIsLowBandwidth1 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsMicrophoneMutedGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoAvailableGetValue = false;
        boolean viewModelSelectedLayoutConferenceDisplayModeGRID = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesEnabledGetValue = false;
        java.lang.Float viewModelAudioRoutesMenuTranslateYGetValue = null;
        java.lang.Boolean viewModelAudioRoutesEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsSpeakerSelected = null;
        boolean ViewModelIsSpeakerSelected1 = false;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> viewModelSelectedLayout = null;
        java.lang.Boolean viewModelIsVideoEnabledGetValue = null;
        java.lang.String viewModelIsMicrophoneMutedMboundView15AndroidStringContentDescriptionDisableMicMuteMboundView15AndroidStringContentDescriptionEnableMicMute = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSpeakerSelectedGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelAudioRoutesEnabled = null;
        int viewModelIsVideoEnabledViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSwitchCameraAvailableGetValue = false;
        android.graphics.drawable.Drawable viewModelSelectedLayoutConferenceDisplayModeAUDIOONLYMboundView19AndroidDrawableIconConferenceLayoutAudioOnlyMboundView19AndroidDrawableIconConferenceLayoutGrid = null;
        java.lang.Boolean viewModelIsSpeakerSelectedGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoEnabledGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsSwitchCameraAvailable = null;
        int viewModelIsVideoEnabledViewVISIBLEViewGONE = 0;
        java.lang.String viewModelSubjectGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsBluetoothHeadsetSelected1 = null;
        java.lang.Float viewModelConferenceLayoutMenuTranslateYGetValue = null;
        boolean viewModelHideVideo = false;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelAudioRoutesMenuTranslateY = null;
        android.graphics.drawable.Drawable viewModelSelectedLayoutConferenceDisplayModeACTIVESPEAKERMboundView19AndroidDrawableIconConferenceLayoutActiveSpeakerViewModelSelectedLayoutConferenceDisplayModeAUDIOONLYMboundView19AndroidDrawableIconConferenceLayoutAudioOnlyMboundView19AndroidDrawableIconConferenceLayoutGrid = null;
        java.lang.Boolean viewModelAudioRoutesSelectedGetValue = null;
        boolean viewModelIsSpeakerSelectedViewModelIsBluetoothHeadsetSelectedBooleanFalse = false;
        java.lang.Boolean viewModelIsMicrophoneMutedGetValue = null;
        java.lang.Boolean viewModelIsVideoAvailableGetValue = null;
        boolean viewModelSelectedLayoutConferenceDisplayModeAUDIOONLY = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLowBandwidthGetValue = false;
        float androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesMenuTranslateYGetValue = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsMicrophoneMuted = null;
        org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1ffffL) != 0) {


            if ((dirtyFlags & 0x18002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.audioRoutesSelected
                        viewModelAudioRoutesSelected = viewModel.getAudioRoutesSelected();
                    }
                    updateLiveDataRegistration(1, viewModelAudioRoutesSelected);


                    if (viewModelAudioRoutesSelected != null) {
                        // read viewModel.audioRoutesSelected.getValue()
                        viewModelAudioRoutesSelectedGetValue = viewModelAudioRoutesSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.audioRoutesSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAudioRoutesSelectedGetValue);
            }
            if ((dirtyFlags & 0x1800dL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.joinInProgress
                        viewModelJoinInProgress = viewModel.getJoinInProgress();
                    }
                    updateLiveDataRegistration(3, viewModelJoinInProgress);


                    if (viewModelJoinInProgress != null) {
                        // read viewModel.joinInProgress.getValue()
                        viewModelJoinInProgressGetValue = viewModelJoinInProgress.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelJoinInProgressGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue())
                    ViewModelJoinInProgress1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgressGetValue;
                if((dirtyFlags & 0x1800dL) != 0) {
                    if(ViewModelJoinInProgress1) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
                if((dirtyFlags & 0x18009L) != 0) {
                    if(ViewModelJoinInProgress1) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }

                if ((dirtyFlags & 0x18008L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()))
                        androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgress = androidx.databinding.ViewDataBinding.safeUnbox(ViewModelJoinInProgress1);
                }
            }
            if ((dirtyFlags & 0x18010L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subject
                        viewModelSubject = viewModel.getSubject();
                    }
                    updateLiveDataRegistration(4, viewModelSubject);


                    if (viewModelSubject != null) {
                        // read viewModel.subject.getValue()
                        viewModelSubjectGetValue = viewModelSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x18020L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isVideoEnabled
                        viewModelIsVideoEnabled = viewModel.isVideoEnabled();
                    }
                    updateLiveDataRegistration(5, viewModelIsVideoEnabled);


                    if (viewModelIsVideoEnabled != null) {
                        // read viewModel.isVideoEnabled.getValue()
                        viewModelIsVideoEnabledGetValue = viewModelIsVideoEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsVideoEnabledGetValue);
                if((dirtyFlags & 0x18020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoEnabledGetValue) {
                            dirtyFlags |= 0x400000000L;
                            dirtyFlags |= 0x4000000000L;
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                            dirtyFlags |= 0x2000000000L;
                            dirtyFlags |= 0x20000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue()) ? @android:string/content_description_disable_video : @android:string/content_description_enable_video
                    viewModelIsVideoEnabledMboundView18AndroidStringContentDescriptionDisableVideoMboundView18AndroidStringContentDescriptionEnableVideo = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoEnabledGetValue) ? (mboundView18.getResources().getString(R.string.content_description_disable_video)) : (mboundView18.getResources().getString(R.string.content_description_enable_video)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue()) ? View.GONE : View.VISIBLE
                    viewModelIsVideoEnabledViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoEnabledGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsVideoEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.layoutMenuSelected
                        viewModelLayoutMenuSelected = viewModel.getLayoutMenuSelected();
                    }
                    updateLiveDataRegistration(6, viewModelLayoutMenuSelected);


                    if (viewModelLayoutMenuSelected != null) {
                        // read viewModel.layoutMenuSelected.getValue()
                        viewModelLayoutMenuSelectedGetValue = viewModelLayoutMenuSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.layoutMenuSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLayoutMenuSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLayoutMenuSelectedGetValue);
            }
            if ((dirtyFlags & 0x18080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.conferenceLayoutMenuTranslateY
                        viewModelConferenceLayoutMenuTranslateY = viewModel.getConferenceLayoutMenuTranslateY();
                    }
                    updateLiveDataRegistration(7, viewModelConferenceLayoutMenuTranslateY);


                    if (viewModelConferenceLayoutMenuTranslateY != null) {
                        // read viewModel.conferenceLayoutMenuTranslateY.getValue()
                        viewModelConferenceLayoutMenuTranslateYGetValue = viewModelConferenceLayoutMenuTranslateY.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.conferenceLayoutMenuTranslateY.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelConferenceLayoutMenuTranslateYGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelConferenceLayoutMenuTranslateYGetValue);
            }
            if ((dirtyFlags & 0x19100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSpeakerSelected
                        viewModelIsSpeakerSelected = viewModel.isSpeakerSelected();
                    }
                    updateLiveDataRegistration(8, viewModelIsSpeakerSelected);


                    if (viewModelIsSpeakerSelected != null) {
                        // read viewModel.isSpeakerSelected.getValue()
                        viewModelIsSpeakerSelectedGetValue = viewModelIsSpeakerSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSpeakerSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsSpeakerSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsSpeakerSelectedGetValue);
                if((dirtyFlags & 0x18100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSpeakerSelectedGetValue) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }

                if ((dirtyFlags & 0x18100L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSpeakerSelected.getValue()) ? @android:string/content_description_disable_speaker : @android:string/content_description_enable_speaker
                        viewModelIsSpeakerSelectedMboundView16AndroidStringContentDescriptionDisableSpeakerMboundView16AndroidStringContentDescriptionEnableSpeaker = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsSpeakerSelectedGetValue) ? (mboundView16.getResources().getString(R.string.content_description_disable_speaker)) : (mboundView16.getResources().getString(R.string.content_description_enable_speaker)));
                }

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSpeakerSelected.getValue())
                    ViewModelIsSpeakerSelected1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsSpeakerSelectedGetValue;
                if((dirtyFlags & 0x19100L) != 0) {
                    if(ViewModelIsSpeakerSelected1) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x18200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedLayout
                        viewModelSelectedLayout = viewModel.getSelectedLayout();
                    }
                    updateLiveDataRegistration(9, viewModelSelectedLayout);


                    if (viewModelSelectedLayout != null) {
                        // read viewModel.selectedLayout.getValue()
                        viewModelSelectedLayoutGetValue = viewModelSelectedLayout.getValue();
                    }


                    // read viewModel.selectedLayout.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER
                    viewModelSelectedLayoutConferenceDisplayModeACTIVESPEAKER = (viewModelSelectedLayoutGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.ACTIVE_SPEAKER);
                    // read viewModel.selectedLayout.getValue() == ConferenceDisplayMode.GRID
                    viewModelSelectedLayoutConferenceDisplayModeGRID = (viewModelSelectedLayoutGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.GRID);
                    // read viewModel.selectedLayout.getValue() == ConferenceDisplayMode.AUDIO_ONLY
                    viewModelSelectedLayoutConferenceDisplayModeAUDIOONLY = (viewModelSelectedLayoutGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.AUDIO_ONLY);
                if((dirtyFlags & 0x18200L) != 0) {
                    if(viewModelSelectedLayoutConferenceDisplayModeACTIVESPEAKER) {
                            dirtyFlags |= 0x100000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000L;
                    }
                }
                if((dirtyFlags & 0x80000000000L) != 0) {
                    if(viewModelSelectedLayoutConferenceDisplayModeAUDIOONLY) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x18400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.audioRoutesEnabled
                        viewModelAudioRoutesEnabled = viewModel.getAudioRoutesEnabled();
                    }
                    updateLiveDataRegistration(10, viewModelAudioRoutesEnabled);


                    if (viewModelAudioRoutesEnabled != null) {
                        // read viewModel.audioRoutesEnabled.getValue()
                        viewModelAudioRoutesEnabledGetValue = viewModelAudioRoutesEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.audioRoutesEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAudioRoutesEnabledGetValue);
                if((dirtyFlags & 0x18400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesEnabledGetValue) {
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.audioRoutesEnabled.getValue()) ? View.GONE : View.VISIBLE
                    viewModelAudioRoutesEnabledViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesEnabledGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
                    viewModelAudioRoutesEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSwitchCameraAvailable
                        viewModelIsSwitchCameraAvailable = viewModel.isSwitchCameraAvailable();
                    }
                    updateLiveDataRegistration(11, viewModelIsSwitchCameraAvailable);


                    if (viewModelIsSwitchCameraAvailable != null) {
                        // read viewModel.isSwitchCameraAvailable.getValue()
                        viewModelIsSwitchCameraAvailableGetValue = viewModelIsSwitchCameraAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSwitchCameraAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsSwitchCameraAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsSwitchCameraAvailableGetValue);
                if((dirtyFlags & 0x18800L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSwitchCameraAvailableGetValue) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSwitchCameraAvailable.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsSwitchCameraAvailableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsSwitchCameraAvailableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x19000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isBluetoothHeadsetSelected
                        ViewModelIsBluetoothHeadsetSelected1 = viewModel.isBluetoothHeadsetSelected();
                    }
                    updateLiveDataRegistration(12, ViewModelIsBluetoothHeadsetSelected1);


                    if (ViewModelIsBluetoothHeadsetSelected1 != null) {
                        // read viewModel.isBluetoothHeadsetSelected.getValue()
                        viewModelIsBluetoothHeadsetSelectedGetValue = ViewModelIsBluetoothHeadsetSelected1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBluetoothHeadsetSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsBluetoothHeadsetSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsBluetoothHeadsetSelectedGetValue);
            }
            if ((dirtyFlags & 0x18000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hideVideo
                        viewModelHideVideo = viewModel.getHideVideo();
                    }
                if((dirtyFlags & 0x18000L) != 0) {
                    if(viewModelHideVideo) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read viewModel.hideVideo ? View.GONE : View.VISIBLE
                    viewModelHideVideoViewGONEViewVISIBLE = ((viewModelHideVideo) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1a000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.audioRoutesMenuTranslateY
                        viewModelAudioRoutesMenuTranslateY = viewModel.getAudioRoutesMenuTranslateY();
                    }
                    updateLiveDataRegistration(13, viewModelAudioRoutesMenuTranslateY);


                    if (viewModelAudioRoutesMenuTranslateY != null) {
                        // read viewModel.audioRoutesMenuTranslateY.getValue()
                        viewModelAudioRoutesMenuTranslateYGetValue = viewModelAudioRoutesMenuTranslateY.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.audioRoutesMenuTranslateY.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesMenuTranslateYGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAudioRoutesMenuTranslateYGetValue);
            }
            if ((dirtyFlags & 0x1c000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isMicrophoneMuted
                        viewModelIsMicrophoneMuted = viewModel.isMicrophoneMuted();
                    }
                    updateLiveDataRegistration(14, viewModelIsMicrophoneMuted);


                    if (viewModelIsMicrophoneMuted != null) {
                        // read viewModel.isMicrophoneMuted.getValue()
                        viewModelIsMicrophoneMutedGetValue = viewModelIsMicrophoneMuted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMicrophoneMuted.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsMicrophoneMutedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsMicrophoneMutedGetValue);
                if((dirtyFlags & 0x1c000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsMicrophoneMutedGetValue) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMicrophoneMuted.getValue()) ? @android:string/content_description_disable_mic_mute : @android:string/content_description_enable_mic_mute
                    viewModelIsMicrophoneMutedMboundView15AndroidStringContentDescriptionDisableMicMuteMboundView15AndroidStringContentDescriptionEnableMicMute = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsMicrophoneMutedGetValue) ? (mboundView15.getResources().getString(R.string.content_description_disable_mic_mute)) : (mboundView15.getResources().getString(R.string.content_description_enable_mic_mute)));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isLowBandwidth
                    viewModelIsLowBandwidth = viewModel.isLowBandwidth();
                }
                updateLiveDataRegistration(0, viewModelIsLowBandwidth);


                if (viewModelIsLowBandwidth != null) {
                    // read viewModel.isLowBandwidth.getValue()
                    viewModelIsLowBandwidthGetValue = viewModelIsLowBandwidth.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsLowBandwidthGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLowBandwidthGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue())
                ViewModelIsLowBandwidth1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsLowBandwidthGetValue;
        }
        if ((dirtyFlags & 0x4000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isVideoAvailable
                    viewModelIsVideoAvailable = viewModel.isVideoAvailable();
                }
                updateLiveDataRegistration(2, viewModelIsVideoAvailable);


                if (viewModelIsVideoAvailable != null) {
                    // read viewModel.isVideoAvailable.getValue()
                    viewModelIsVideoAvailableGetValue = viewModelIsVideoAvailable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoAvailable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsVideoAvailableGetValue);
        }
        if ((dirtyFlags & 0x80000000000L) != 0) {

                // read viewModel.selectedLayout.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
                viewModelSelectedLayoutConferenceDisplayModeAUDIOONLYMboundView19AndroidDrawableIconConferenceLayoutAudioOnlyMboundView19AndroidDrawableIconConferenceLayoutGrid = ((viewModelSelectedLayoutConferenceDisplayModeAUDIOONLY) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView19.getContext(), R.drawable.icon_conference_layout_audio_only)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView19.getContext(), R.drawable.icon_conference_layout_grid)));
        }
        if ((dirtyFlags & 0x400000000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isBluetoothHeadsetSelected
                    ViewModelIsBluetoothHeadsetSelected1 = viewModel.isBluetoothHeadsetSelected();
                }
                updateLiveDataRegistration(12, ViewModelIsBluetoothHeadsetSelected1);


                if (ViewModelIsBluetoothHeadsetSelected1 != null) {
                    // read viewModel.isBluetoothHeadsetSelected.getValue()
                    viewModelIsBluetoothHeadsetSelectedGetValue = ViewModelIsBluetoothHeadsetSelected1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBluetoothHeadsetSelected.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsBluetoothHeadsetSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsBluetoothHeadsetSelectedGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBluetoothHeadsetSelected.getValue())
                viewModelIsBluetoothHeadsetSelected = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsBluetoothHeadsetSelectedGetValue;
        }

        if ((dirtyFlags & 0x1800dL) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoAvailable.getValue()) : false
                viewModelJoinInProgressViewModelIsVideoAvailableBooleanFalse = ((ViewModelJoinInProgress1) ? (androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoAvailableGetValue) : (false));
            if((dirtyFlags & 0x1800dL) != 0) {
                if(viewModelJoinInProgressViewModelIsVideoAvailableBooleanFalse) {
                        dirtyFlags |= 0x10000000L;
                }
                else {
                        dirtyFlags |= 0x8000000L;
                }
            }
        }
        if ((dirtyFlags & 0x18009L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue()) : false
                viewModelJoinInProgressViewModelIsLowBandwidthBooleanFalse = ((ViewModelJoinInProgress1) ? (ViewModelIsLowBandwidth1) : (false));
        }
        if ((dirtyFlags & 0x18200L) != 0) {

                // read viewModel.selectedLayout.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? @android:drawable/icon_conference_layout_active_speaker : viewModel.selectedLayout.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
                viewModelSelectedLayoutConferenceDisplayModeACTIVESPEAKERMboundView19AndroidDrawableIconConferenceLayoutActiveSpeakerViewModelSelectedLayoutConferenceDisplayModeAUDIOONLYMboundView19AndroidDrawableIconConferenceLayoutAudioOnlyMboundView19AndroidDrawableIconConferenceLayoutGrid = ((viewModelSelectedLayoutConferenceDisplayModeACTIVESPEAKER) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView19.getContext(), R.drawable.icon_conference_layout_active_speaker)) : (viewModelSelectedLayoutConferenceDisplayModeAUDIOONLYMboundView19AndroidDrawableIconConferenceLayoutAudioOnlyMboundView19AndroidDrawableIconConferenceLayoutGrid));
        }
        if ((dirtyFlags & 0x19100L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSpeakerSelected.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBluetoothHeadsetSelected.getValue()) : false
                viewModelIsSpeakerSelectedViewModelIsBluetoothHeadsetSelectedBooleanFalse = ((ViewModelIsSpeakerSelected1) ? (viewModelIsBluetoothHeadsetSelected) : (false));
        }
        // batch finished

        if ((dirtyFlags & 0x10000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isLowBandwidth
                    viewModelIsLowBandwidth = viewModel.isLowBandwidth();
                }
                updateLiveDataRegistration(0, viewModelIsLowBandwidth);


                if (viewModelIsLowBandwidth != null) {
                    // read viewModel.isLowBandwidth.getValue()
                    viewModelIsLowBandwidthGetValue = viewModelIsLowBandwidth.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelIsLowBandwidthGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLowBandwidthGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue())
                ViewModelIsLowBandwidth1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsLowBandwidthGetValue;
        }

        if ((dirtyFlags & 0x1800dL) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoAvailable.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue()) : false
                viewModelJoinInProgressViewModelIsVideoAvailableBooleanFalseViewModelIsLowBandwidthBooleanFalse = ((viewModelJoinInProgressViewModelIsVideoAvailableBooleanFalse) ? (ViewModelIsLowBandwidth1) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x10000L) != 0) {
            // api target 1

            this.cancel.setOnClickListener(mCallback132);
            this.mboundView10.setOnClickListener(mCallback136);
            this.mboundView12.setOnClickListener(mCallback137);
            this.mboundView13.setOnClickListener(mCallback138);
            this.mboundView14.setOnClickListener(mCallback139);
            this.mboundView15.setOnClickListener(mCallback140);
            this.mboundView16.setOnClickListener(mCallback141);
            this.mboundView17.setOnClickListener(mCallback142);
            this.mboundView18.setOnClickListener(mCallback143);
            this.mboundView19.setOnClickListener(mCallback144);
            this.mboundView2.setOnClickListener(mCallback131);
            this.mboundView8.setOnClickListener(mCallback134);
            this.mboundView9.setOnClickListener(mCallback135);
            this.start.setOnClickListener(mCallback133);
        }
        if ((dirtyFlags & 0x18010L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.conferenceSubject, viewModelSubjectGetValue);
        }
        if ((dirtyFlags & 0x18020L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelIsVideoEnabledViewVISIBLEViewGONE);
            this.mboundView18.setSelected(androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoEnabledGetValue);
            this.mboundView4.setVisibility(viewModelIsVideoEnabledViewGONEViewVISIBLE);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.mboundView18.setContentDescription(viewModelIsVideoEnabledMboundView18AndroidStringContentDescriptionDisableVideoMboundView18AndroidStringContentDescriptionEnableVideo);
            }
        }
        if ((dirtyFlags & 0x18100L) != 0) {
            // api target 1

            this.mboundView10.setSelected(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSpeakerSelectedGetValue);
            this.mboundView16.setSelected(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSpeakerSelectedGetValue);
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.mboundView16.setContentDescription(viewModelIsSpeakerSelectedMboundView16AndroidStringContentDescriptionDisableSpeakerMboundView16AndroidStringContentDescriptionEnableSpeaker);
            }
        }
        if ((dirtyFlags & 0x18080L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.mboundView11.setTranslationY(androidxDatabindingViewDataBindingSafeUnboxViewModelConferenceLayoutMenuTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x18200L) != 0) {
            // api target 1

            this.mboundView12.setSelected(viewModelSelectedLayoutConferenceDisplayModeGRID);
            this.mboundView13.setSelected(viewModelSelectedLayoutConferenceDisplayModeACTIVESPEAKER);
            this.mboundView14.setSelected(viewModelSelectedLayoutConferenceDisplayModeAUDIOONLY);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView19, viewModelSelectedLayoutConferenceDisplayModeACTIVESPEAKERMboundView19AndroidDrawableIconConferenceLayoutActiveSpeakerViewModelSelectedLayoutConferenceDisplayModeAUDIOONLYMboundView19AndroidDrawableIconConferenceLayoutAudioOnlyMboundView19AndroidDrawableIconConferenceLayoutGrid);
        }
        if ((dirtyFlags & 0x1c000L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.mboundView15.setContentDescription(viewModelIsMicrophoneMutedMboundView15AndroidStringContentDescriptionDisableMicMuteMboundView15AndroidStringContentDescriptionEnableMicMute);
            }
            // api target 1

            this.mboundView15.setSelected(androidxDatabindingViewDataBindingSafeUnboxViewModelIsMicrophoneMutedGetValue);
        }
        if ((dirtyFlags & 0x18008L) != 0) {
            // api target 1

            this.mboundView15.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgress);
            this.mboundView16.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgress);
            this.mboundView17.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgress);
            this.mboundView2.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgress);
            this.start.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelJoinInProgress);
        }
        if ((dirtyFlags & 0x18400L) != 0) {
            // api target 1

            this.mboundView16.setVisibility(viewModelAudioRoutesEnabledViewGONEViewVISIBLE);
            this.mboundView17.setVisibility(viewModelAudioRoutesEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18002L) != 0) {
            // api target 1

            this.mboundView17.setSelected(androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesSelectedGetValue);
        }
        if ((dirtyFlags & 0x1800dL) != 0) {
            // api target 1

            this.mboundView18.setEnabled(viewModelJoinInProgressViewModelIsVideoAvailableBooleanFalseViewModelIsLowBandwidthBooleanFalse);
        }
        if ((dirtyFlags & 0x18000L) != 0) {
            // api target 1

            this.mboundView18.setVisibility(viewModelHideVideoViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x18009L) != 0) {
            // api target 1

            this.mboundView19.setEnabled(viewModelJoinInProgressViewModelIsLowBandwidthBooleanFalse);
        }
        if ((dirtyFlags & 0x18040L) != 0) {
            // api target 1

            this.mboundView19.setSelected(androidxDatabindingViewDataBindingSafeUnboxViewModelLayoutMenuSelectedGetValue);
        }
        if ((dirtyFlags & 0x18800L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelIsSwitchCameraAvailableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1a000L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.mboundView7.setTranslationY(androidxDatabindingViewDataBindingSafeUnboxViewModelAudioRoutesMenuTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x19000L) != 0) {
            // api target 1

            this.mboundView8.setSelected(androidxDatabindingViewDataBindingSafeUnboxViewModelIsBluetoothHeadsetSelectedGetValue);
        }
        if ((dirtyFlags & 0x19100L) != 0) {
            // api target 1

            this.mboundView9.setSelected(viewModelIsSpeakerSelectedViewModelIsBluetoothHeadsetSelectedBooleanFalse);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setSpeakerAudioRoute();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleMuteMicrophone();
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setMosaicLayout();
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleSpeaker();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setBluetoothAudioRoute();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setEarpieceAudioRoute();
                }
                break;
            }
            case 14: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleLayoutMenu();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.cancel();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.start();
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setActiveSpeakerLayout();
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleAudioRoutesMenu();
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setAudioOnlyLayout();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.switchCamera();
                }
                break;
            }
            case 13: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.conference.viewmodels.ConferenceWaitingRoomViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.toggleVideo();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLowBandwidth
        flag 1 (0x2L): viewModel.audioRoutesSelected
        flag 2 (0x3L): viewModel.isVideoAvailable
        flag 3 (0x4L): viewModel.joinInProgress
        flag 4 (0x5L): viewModel.subject
        flag 5 (0x6L): viewModel.isVideoEnabled
        flag 6 (0x7L): viewModel.layoutMenuSelected
        flag 7 (0x8L): viewModel.conferenceLayoutMenuTranslateY
        flag 8 (0x9L): viewModel.isSpeakerSelected
        flag 9 (0xaL): viewModel.selectedLayout
        flag 10 (0xbL): viewModel.audioRoutesEnabled
        flag 11 (0xcL): viewModel.isSwitchCameraAvailable
        flag 12 (0xdL): viewModel.isBluetoothHeadsetSelected
        flag 13 (0xeL): viewModel.audioRoutesMenuTranslateY
        flag 14 (0xfL): viewModel.isMicrophoneMuted
        flag 15 (0x10L): viewModel
        flag 16 (0x11L): null
        flag 17 (0x12L): viewModel.hideVideo ? View.GONE : View.VISIBLE
        flag 18 (0x13L): viewModel.hideVideo ? View.GONE : View.VISIBLE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.audioRoutesEnabled.getValue()) ? View.GONE : View.VISIBLE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.audioRoutesEnabled.getValue()) ? View.GONE : View.VISIBLE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSpeakerSelected.getValue()) ? @android:string/content_description_disable_speaker : @android:string/content_description_enable_speaker
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSpeakerSelected.getValue()) ? @android:string/content_description_disable_speaker : @android:string/content_description_enable_speaker
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoAvailable.getValue()) : false
        flag 26 (0x1bL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoAvailable.getValue()) : false
        flag 27 (0x1cL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoAvailable.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue()) : false
        flag 28 (0x1dL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoAvailable.getValue()) : false ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue()) : false
        flag 29 (0x1eL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue()) : false
        flag 30 (0x1fL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.joinInProgress.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLowBandwidth.getValue()) : false
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSwitchCameraAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSwitchCameraAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue()) ? @android:string/content_description_disable_video : @android:string/content_description_enable_video
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue()) ? @android:string/content_description_disable_video : @android:string/content_description_enable_video
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMicrophoneMuted.getValue()) ? @android:string/content_description_disable_mic_mute : @android:string/content_description_enable_mic_mute
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMicrophoneMuted.getValue()) ? @android:string/content_description_disable_mic_mute : @android:string/content_description_enable_mic_mute
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue()) ? View.GONE : View.VISIBLE
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue()) ? View.GONE : View.VISIBLE
        flag 39 (0x28L): viewModel.selectedLayout.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
        flag 40 (0x29L): viewModel.selectedLayout.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): viewModel.selectedLayout.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? @android:drawable/icon_conference_layout_active_speaker : viewModel.selectedLayout.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
        flag 44 (0x2dL): viewModel.selectedLayout.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? @android:drawable/icon_conference_layout_active_speaker : viewModel.selectedLayout.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? @android:drawable/icon_conference_layout_audio_only : @android:drawable/icon_conference_layout_grid
        flag 45 (0x2eL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSpeakerSelected.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBluetoothHeadsetSelected.getValue()) : false
        flag 46 (0x2fL): !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSpeakerSelected.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isBluetoothHeadsetSelected.getValue()) : false
    flag mapping end*/
    //end
}