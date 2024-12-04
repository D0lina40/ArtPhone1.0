package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceCallFragmentBindingImpl extends VoipConferenceCallFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(13);
        sIncludes.setIncludes(0, 
            new String[] {"voip_conference_creation_pending_wait_layout"},
            new int[] {12},
            new int[] {org.linphone.R.layout.voip_conference_creation_pending_wait_layout});
        sIncludes.setIncludes(1, 
            new String[] {"voip_buttons", "voip_buttons_extra"},
            new int[] {10, 11},
            new int[] {org.linphone.R.layout.voip_buttons,
                org.linphone.R.layout.voip_buttons_extra});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.stubbed_conference_active_speaker_layout, 2);
        sViewsWithIds.put(R.id.stubbed_conference_grid_layout, 3);
        sViewsWithIds.put(R.id.stubbed_conference_audio_only_layout, 4);
        sViewsWithIds.put(R.id.stubbed_audio_routes, 5);
        sViewsWithIds.put(R.id.stubbed_paused_conference, 6);
        sViewsWithIds.put(R.id.stubbed_call_stats, 8);
        sViewsWithIds.put(R.id.stubbed_numpad, 9);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback108;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceCallFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private VoipConferenceCallFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 15
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0]
            , (org.linphone.databinding.VoipConferenceCreationPendingWaitLayoutBinding) bindings[12]
            , (org.linphone.databinding.VoipButtonsExtraBinding) bindings[11]
            , (android.view.View) bindings[7]
            , (org.linphone.databinding.VoipButtonsBinding) bindings[10]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[5])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[8])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[2])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[4])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[3])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[9])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[6])
            );
        this.constraintLayout.setTag(null);
        this.coordinator.setTag(null);
        setContainedBinding(this.creationPendingLayout);
        setContainedBinding(this.extraButtonsLayout);
        this.popupBackground.setTag(null);
        setContainedBinding(this.primaryButtons);
        this.stubbedAudioRoutes.setContainingBinding(this);
        this.stubbedCallStats.setContainingBinding(this);
        this.stubbedConferenceActiveSpeakerLayout.setContainingBinding(this);
        this.stubbedConferenceAudioOnlyLayout.setContainingBinding(this);
        this.stubbedConferenceGridLayout.setContainingBinding(this);
        this.stubbedNumpad.setContainingBinding(this);
        this.stubbedPausedConference.setContainingBinding(this);
        setRootTag(root);
        // listeners
        mCallback108 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000L;
        }
        primaryButtons.invalidateAll();
        extraButtonsLayout.invalidateAll();
        creationPendingLayout.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (primaryButtons.hasPendingBindings()) {
            return true;
        }
        if (extraButtonsLayout.hasPendingBindings()) {
            return true;
        }
        if (creationPendingLayout.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.callsViewModel == variableId) {
            setCallsViewModel((org.linphone.activities.voip.viewmodels.CallsViewModel) variable);
        }
        else if (BR.conferenceViewModel == variableId) {
            setConferenceViewModel((org.linphone.activities.voip.viewmodels.ConferenceViewModel) variable);
        }
        else if (BR.statsViewModel == variableId) {
            setStatsViewModel((org.linphone.activities.voip.viewmodels.StatisticsListViewModel) variable);
        }
        else if (BR.controlsViewModel == variableId) {
            setControlsViewModel((org.linphone.activities.voip.viewmodels.ControlsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCallsViewModel(@Nullable org.linphone.activities.voip.viewmodels.CallsViewModel CallsViewModel) {
        this.mCallsViewModel = CallsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.callsViewModel);
        super.requestRebind();
    }
    public void setConferenceViewModel(@Nullable org.linphone.activities.voip.viewmodels.ConferenceViewModel ConferenceViewModel) {
        this.mConferenceViewModel = ConferenceViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.conferenceViewModel);
        super.requestRebind();
    }
    public void setStatsViewModel(@Nullable org.linphone.activities.voip.viewmodels.StatisticsListViewModel StatsViewModel) {
        this.mStatsViewModel = StatsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.statsViewModel);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        primaryButtons.setLifecycleOwner(lifecycleOwner);
        extraButtonsLayout.setLifecycleOwner(lifecycleOwner);
        creationPendingLayout.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeControlsViewModelPipMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeControlsViewModelShowExtras((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeConferenceViewModelIsConferenceLocallyPaused((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeControlsViewModelCallStatsVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeExtraButtonsLayout((org.linphone.databinding.VoipButtonsExtraBinding) object, fieldId);
            case 5 :
                return onChangeControlsViewModelAudioRoutesEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeControlsViewModelExtraButtonsMenuTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 7 :
                return onChangePrimaryButtons((org.linphone.databinding.VoipButtonsBinding) object, fieldId);
            case 8 :
                return onChangeControlsViewModelFullScreenMode((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeConferenceViewModelConferenceCreationPending((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeCreationPendingLayout((org.linphone.databinding.VoipConferenceCreationPendingWaitLayoutBinding) object, fieldId);
            case 11 :
                return onChangeConferenceViewModelConferenceExists((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeCallsViewModelCurrentCallData((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData>) object, fieldId);
            case 13 :
                return onChangeControlsViewModelNumpadVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeConferenceViewModelConferenceDisplayMode((androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeControlsViewModelPipMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelPipMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelShowExtras(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelShowExtras, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelIsConferenceLocallyPaused(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelIsConferenceLocallyPaused, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelCallStatsVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelCallStatsVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeExtraButtonsLayout(org.linphone.databinding.VoipButtonsExtraBinding ExtraButtonsLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelAudioRoutesEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelAudioRoutesEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelExtraButtonsMenuTranslateY(androidx.lifecycle.MutableLiveData<java.lang.Float> ControlsViewModelExtraButtonsMenuTranslateY, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangePrimaryButtons(org.linphone.databinding.VoipButtonsBinding PrimaryButtons, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelFullScreenMode(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelFullScreenMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceCreationPending(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelConferenceCreationPending, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCreationPendingLayout(org.linphone.databinding.VoipConferenceCreationPendingWaitLayoutBinding CreationPendingLayout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceExists(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ConferenceViewModelConferenceExists, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCallsViewModelCurrentCallData(androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> CallsViewModelCurrentCallData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeControlsViewModelNumpadVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ControlsViewModelNumpadVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeConferenceViewModelConferenceDisplayMode(androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> ConferenceViewModelConferenceDisplayMode, int fieldId) {
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
        int conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelPipMode = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelShowExtras = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelIsConferenceLocallyPaused = null;
        java.lang.Boolean controlsViewModelCallStatsVisibleGetValue = null;
        org.linphone.activities.voip.viewmodels.CallsViewModel callsViewModel = mCallsViewModel;
        java.lang.Boolean conferenceViewModelConferenceExistsGetValue = null;
        java.lang.Boolean conferenceViewModelIsConferenceLocallyPausedGetValue = null;
        int controlsViewModelNumpadVisibleViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelCallStatsVisible = null;
        java.lang.Boolean controlsViewModelShowExtrasGetValue = null;
        int controlsViewModelShowExtrasViewVISIBLEViewGONE = 0;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = false;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue = false;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRID = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelAudioRoutesEnabled = null;
        int conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Float controlsViewModelExtraButtonsMenuTranslateYGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelShowExtrasGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Float> controlsViewModelExtraButtonsMenuTranslateY = null;
        float androidxDatabindingViewDataBindingSafeUnboxControlsViewModelExtraButtonsMenuTranslateYGetValue = 0f;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse = false;
        int controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelCallStatsVisibleGetValue = false;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue = false;
        int conferenceViewModelIsConferenceLocallyPausedViewVISIBLEViewGONE = 0;
        org.linphone.activities.voip.viewmodels.ConferenceViewModel conferenceViewModel = mConferenceViewModel;
        boolean callsViewModelCurrentCallDataIsActiveAndNotInConference = false;
        java.lang.Boolean controlsViewModelPipModeGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelFullScreenMode = null;
        java.lang.Boolean conferenceViewModelConferenceCreationPendingGetValue = null;
        int controlsViewModelFullScreenModeConstraintLayoutAndroidColorBlackColorConstraintLayoutAndroidColorTransparentColor = 0;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelConferenceCreationPending = null;
        java.lang.Boolean controlsViewModelAudioRoutesEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> conferenceViewModelConferenceExists = null;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue = false;
        int controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = 0;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse = false;
        boolean conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.data.CallData> callsViewModelCurrentCallData = null;
        boolean CallsViewModelCurrentCallDataIsActiveAndNotInConference1 = false;
        org.linphone.activities.voip.viewmodels.StatisticsListViewModel statsViewModel = mStatsViewModel;
        java.lang.Boolean controlsViewModelFullScreenModeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = false;
        org.linphone.activities.voip.data.CallData callsViewModelCurrentCallDataGetValue = null;
        org.linphone.activities.voip.ConferenceDisplayMode conferenceViewModelConferenceDisplayModeGetValue = null;
        boolean controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> controlsViewModelNumpadVisible = null;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue = false;
        int controlsViewModelCallStatsVisibleViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = false;
        int conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Boolean controlsViewModelNumpadVisibleGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.voip.ConferenceDisplayMode> conferenceViewModelConferenceDisplayMode = null;

        if ((dirtyFlags & 0x88000L) != 0) {
        }
        if ((dirtyFlags & 0x9da04L) != 0) {


            if ((dirtyFlags & 0x90004L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.isConferenceLocallyPaused
                        conferenceViewModelIsConferenceLocallyPaused = conferenceViewModel.isConferenceLocallyPaused();
                    }
                    updateLiveDataRegistration(2, conferenceViewModelIsConferenceLocallyPaused);


                    if (conferenceViewModelIsConferenceLocallyPaused != null) {
                        // read conferenceViewModel.isConferenceLocallyPaused.getValue()
                        conferenceViewModelIsConferenceLocallyPausedGetValue = conferenceViewModelIsConferenceLocallyPaused.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelIsConferenceLocallyPausedGetValue);
                if((dirtyFlags & 0x90004L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? View.VISIBLE : View.GONE
                    conferenceViewModelIsConferenceLocallyPausedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelIsConferenceLocallyPausedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x90200L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceCreationPending
                        conferenceViewModelConferenceCreationPending = conferenceViewModel.getConferenceCreationPending();
                    }
                    updateLiveDataRegistration(9, conferenceViewModelConferenceCreationPending);


                    if (conferenceViewModelConferenceCreationPending != null) {
                        // read conferenceViewModel.conferenceCreationPending.getValue()
                        conferenceViewModelConferenceCreationPendingGetValue = conferenceViewModelConferenceCreationPending.getValue();
                    }
            }
            if ((dirtyFlags & 0x9d800L) != 0) {

                    if (conferenceViewModel != null) {
                        // read conferenceViewModel.conferenceDisplayMode
                        conferenceViewModelConferenceDisplayMode = conferenceViewModel.getConferenceDisplayMode();
                    }
                    updateLiveDataRegistration(14, conferenceViewModelConferenceDisplayMode);


                    if (conferenceViewModelConferenceDisplayMode != null) {
                        // read conferenceViewModel.conferenceDisplayMode.getValue()
                        conferenceViewModelConferenceDisplayModeGetValue = conferenceViewModelConferenceDisplayMode.getValue();
                    }


                    // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY
                    conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY = (conferenceViewModelConferenceDisplayModeGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.AUDIO_ONLY);
                    // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER
                    conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER = (conferenceViewModelConferenceDisplayModeGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.ACTIVE_SPEAKER);
                    // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID
                    conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRID = (conferenceViewModelConferenceDisplayModeGetValue) == (org.linphone.activities.voip.ConferenceDisplayMode.GRID);
                if((dirtyFlags & 0x9d800L) != 0) {
                    if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY) {
                            dirtyFlags |= 0x800000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000000L;
                    }
                }
                if((dirtyFlags & 0x9d800L) != 0) {
                    if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }
                if((dirtyFlags & 0x9d800L) != 0) {
                    if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRID) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0xa0000L) != 0) {
        }
        if ((dirtyFlags & 0xc216bL) != 0) {


            if ((dirtyFlags & 0xc0002L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.showExtras
                        controlsViewModelShowExtras = controlsViewModel.getShowExtras();
                    }
                    updateLiveDataRegistration(1, controlsViewModelShowExtras);


                    if (controlsViewModelShowExtras != null) {
                        // read controlsViewModel.showExtras.getValue()
                        controlsViewModelShowExtrasGetValue = controlsViewModelShowExtras.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showExtras.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelShowExtrasGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelShowExtrasGetValue);
                if((dirtyFlags & 0xc0002L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelShowExtrasGetValue) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showExtras.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelShowExtrasViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelShowExtrasGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0008L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.callStatsVisible
                        controlsViewModelCallStatsVisible = controlsViewModel.getCallStatsVisible();
                    }
                    updateLiveDataRegistration(3, controlsViewModelCallStatsVisible);


                    if (controlsViewModelCallStatsVisible != null) {
                        // read controlsViewModel.callStatsVisible.getValue()
                        controlsViewModelCallStatsVisibleGetValue = controlsViewModelCallStatsVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.callStatsVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelCallStatsVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelCallStatsVisibleGetValue);
                if((dirtyFlags & 0xc0008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelCallStatsVisibleGetValue) {
                            dirtyFlags |= 0x8000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.callStatsVisible.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelCallStatsVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelCallStatsVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0020L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.audioRoutesEnabled
                        controlsViewModelAudioRoutesEnabled = controlsViewModel.getAudioRoutesEnabled();
                    }
                    updateLiveDataRegistration(5, controlsViewModelAudioRoutesEnabled);


                    if (controlsViewModelAudioRoutesEnabled != null) {
                        // read controlsViewModel.audioRoutesEnabled.getValue()
                        controlsViewModelAudioRoutesEnabledGetValue = controlsViewModelAudioRoutesEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelAudioRoutesEnabledGetValue);
                if((dirtyFlags & 0xc0020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelAudioRoutesEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc0040L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.extraButtonsMenuTranslateY
                        controlsViewModelExtraButtonsMenuTranslateY = controlsViewModel.getExtraButtonsMenuTranslateY();
                    }
                    updateLiveDataRegistration(6, controlsViewModelExtraButtonsMenuTranslateY);


                    if (controlsViewModelExtraButtonsMenuTranslateY != null) {
                        // read controlsViewModel.extraButtonsMenuTranslateY.getValue()
                        controlsViewModelExtraButtonsMenuTranslateYGetValue = controlsViewModelExtraButtonsMenuTranslateY.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.extraButtonsMenuTranslateY.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelExtraButtonsMenuTranslateYGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelExtraButtonsMenuTranslateYGetValue);
            }
            if ((dirtyFlags & 0xc0101L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.fullScreenMode
                        controlsViewModelFullScreenMode = controlsViewModel.getFullScreenMode();
                    }
                    updateLiveDataRegistration(8, controlsViewModelFullScreenMode);


                    if (controlsViewModelFullScreenMode != null) {
                        // read controlsViewModel.fullScreenMode.getValue()
                        controlsViewModelFullScreenModeGetValue = controlsViewModelFullScreenMode.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelFullScreenModeGetValue);
                if((dirtyFlags & 0xc0100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }
                if((dirtyFlags & 0xc0101L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) {
                            dirtyFlags |= 0x2000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000000L;
                    }
                }

                if ((dirtyFlags & 0xc0100L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:color/black_color : @android:color/transparent_color
                        controlsViewModelFullScreenModeConstraintLayoutAndroidColorBlackColorConstraintLayoutAndroidColorTransparentColor = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (getColorFromResource(constraintLayout, R.color.black_color)) : (getColorFromResource(constraintLayout, R.color.transparent_color)));
                }
            }
            if ((dirtyFlags & 0xc2000L) != 0) {

                    if (controlsViewModel != null) {
                        // read controlsViewModel.numpadVisible
                        controlsViewModelNumpadVisible = controlsViewModel.getNumpadVisible();
                    }
                    updateLiveDataRegistration(13, controlsViewModelNumpadVisible);


                    if (controlsViewModelNumpadVisible != null) {
                        // read controlsViewModel.numpadVisible.getValue()
                        controlsViewModelNumpadVisibleGetValue = controlsViewModelNumpadVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelNumpadVisibleGetValue);
                if((dirtyFlags & 0xc2000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue()) ? View.VISIBLE : View.GONE
                    controlsViewModelNumpadVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelNumpadVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000000000000L) != 0) {

                if (controlsViewModel != null) {
                    // read controlsViewModel.pipMode
                    controlsViewModelPipMode = controlsViewModel.getPipMode();
                }
                updateLiveDataRegistration(0, controlsViewModelPipMode);


                if (controlsViewModelPipMode != null) {
                    // read controlsViewModel.pipMode.getValue()
                    controlsViewModelPipModeGetValue = controlsViewModelPipMode.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModelPipModeGetValue);
        }
        if ((dirtyFlags & 0x820200000000L) != 0) {

                if (conferenceViewModel != null) {
                    // read conferenceViewModel.conferenceExists
                    conferenceViewModelConferenceExists = conferenceViewModel.getConferenceExists();
                }
                updateLiveDataRegistration(11, conferenceViewModelConferenceExists);


                if (conferenceViewModelConferenceExists != null) {
                    // read conferenceViewModel.conferenceExists.getValue()
                    conferenceViewModelConferenceExistsGetValue = conferenceViewModelConferenceExists.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue())
                androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModelConferenceExistsGetValue);
        }

        if ((dirtyFlags & 0x9d800L) != 0) {

                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalse = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRID) ? (androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue) : (false));
                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalse = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKER) ? (androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue) : (false));
                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalse = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLY) ? (androidxDatabindingViewDataBindingSafeUnboxConferenceViewModelConferenceExistsGetValue) : (false));
            if((dirtyFlags & 0x9d800L) != 0) {
                if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalse) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
            if((dirtyFlags & 0x9d800L) != 0) {
                if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalse) {
                        dirtyFlags |= 0x8000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000L;
                }
            }
            if((dirtyFlags & 0x9d800L) != 0) {
                if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalse) {
                        dirtyFlags |= 0x200000000000L;
                }
                else {
                        dirtyFlags |= 0x100000000000L;
                }
            }
        }
        if ((dirtyFlags & 0xc0101L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode = ((androidxDatabindingViewDataBindingSafeUnboxControlsViewModelFullScreenModeGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxControlsViewModelPipModeGetValue));
            if((dirtyFlags & 0xc0101L) != 0) {
                if(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) {
                        dirtyFlags |= 0x80000000000L;
                }
                else {
                        dirtyFlags |= 0x40000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
                controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE = ((controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipMode) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished

        if ((dirtyFlags & 0x208020000000L) != 0) {



                if (callsViewModel != null) {
                    // read callsViewModel.currentCallData
                    callsViewModelCurrentCallData = callsViewModel.getCurrentCallData();
                }
                updateLiveDataRegistration(12, callsViewModelCurrentCallData);


                if (callsViewModelCurrentCallData != null) {
                    // read callsViewModel.currentCallData.getValue()
                    callsViewModelCurrentCallDataGetValue = callsViewModelCurrentCallData.getValue();
                }


                if (callsViewModelCurrentCallDataGetValue != null) {
                    // read callsViewModel.currentCallData.getValue().isActiveAndNotInConference
                    CallsViewModelCurrentCallDataIsActiveAndNotInConference1 = callsViewModelCurrentCallDataGetValue.isActiveAndNotInConference();
                }


                // read !callsViewModel.currentCallData.getValue().isActiveAndNotInConference
                callsViewModelCurrentCallDataIsActiveAndNotInConference = !CallsViewModelCurrentCallDataIsActiveAndNotInConference1;
        }

        if ((dirtyFlags & 0x9d800L) != 0) {

                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalse) ? (callsViewModelCurrentCallDataIsActiveAndNotInConference) : (false));
                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalse) ? (callsViewModelCurrentCallDataIsActiveAndNotInConference) : (false));
                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalse) ? (callsViewModelCurrentCallDataIsActiveAndNotInConference) : (false));
            if((dirtyFlags & 0x9d800L) != 0) {
                if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse) {
                        dirtyFlags |= 0x20000000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000000000L;
                }
            }
            if((dirtyFlags & 0x9d800L) != 0) {
                if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
            if((dirtyFlags & 0x9d800L) != 0) {
                if(conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false ? View.VISIBLE : View.GONE
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false ? View.VISIBLE : View.GONE
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false ? View.VISIBLE : View.GONE
                conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE = ((conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xc0100L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.constraintLayout, androidx.databinding.adapters.Converters.convertColorToDrawable(controlsViewModelFullScreenModeConstraintLayoutAndroidColorBlackColorConstraintLayoutAndroidColorTransparentColor));
        }
        if ((dirtyFlags & 0x90200L) != 0) {
            // api target 1

            this.creationPendingLayout.setVisibility(conferenceViewModelConferenceCreationPendingGetValue);
        }
        if ((dirtyFlags & 0xc0040L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.extraButtonsLayout.getRoot().setTranslationY(androidxDatabindingViewDataBindingSafeUnboxControlsViewModelExtraButtonsMenuTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x88000L) != 0) {
            // api target 1

            this.extraButtonsLayout.setCallsViewModel(callsViewModel);
            this.primaryButtons.setCallsViewModel(callsViewModel);
        }
        if ((dirtyFlags & 0x90000L) != 0) {
            // api target 1

            this.extraButtonsLayout.setConferenceViewModel(conferenceViewModel);
            this.primaryButtons.setConferenceViewModel(conferenceViewModel);
            if (this.stubbedConferenceActiveSpeakerLayout.isInflated()) this.stubbedConferenceActiveSpeakerLayout.getBinding().setVariable(BR.conferenceViewModel, conferenceViewModel);
            if (this.stubbedConferenceAudioOnlyLayout.isInflated()) this.stubbedConferenceAudioOnlyLayout.getBinding().setVariable(BR.conferenceViewModel, conferenceViewModel);
            if (this.stubbedConferenceGridLayout.isInflated()) this.stubbedConferenceGridLayout.getBinding().setVariable(BR.conferenceViewModel, conferenceViewModel);
            if (this.stubbedPausedConference.isInflated()) this.stubbedPausedConference.getBinding().setVariable(BR.conferenceViewModel, conferenceViewModel);
        }
        if ((dirtyFlags & 0xc0000L) != 0) {
            // api target 1

            this.extraButtonsLayout.setControlsViewModel(controlsViewModel);
            this.primaryButtons.setControlsViewModel(controlsViewModel);
            if (this.stubbedAudioRoutes.isInflated()) this.stubbedAudioRoutes.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
            if (this.stubbedCallStats.isInflated()) this.stubbedCallStats.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
            if (this.stubbedConferenceActiveSpeakerLayout.isInflated()) this.stubbedConferenceActiveSpeakerLayout.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
            if (this.stubbedConferenceAudioOnlyLayout.isInflated()) this.stubbedConferenceAudioOnlyLayout.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
            if (this.stubbedConferenceGridLayout.isInflated()) this.stubbedConferenceGridLayout.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
            if (this.stubbedNumpad.isInflated()) this.stubbedNumpad.getBinding().setVariable(BR.controlsViewModel, controlsViewModel);
        }
        if ((dirtyFlags & 0x80000L) != 0) {
            // api target 1

            this.popupBackground.setOnClickListener(mCallback108);
        }
        if ((dirtyFlags & 0xc0002L) != 0) {
            // api target 1

            this.popupBackground.setVisibility(controlsViewModelShowExtrasViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0101L) != 0) {
            // api target 1

            this.primaryButtons.getRoot().setVisibility(controlsViewModelFullScreenModeBooleanTrueControlsViewModelPipModeViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc0020L) != 0) {
            // api target 1

            if (!this.stubbedAudioRoutes.isInflated()) this.stubbedAudioRoutes.getViewStub().setVisibility(controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE);
            if (this.stubbedAudioRoutes.isInflated()) this.stubbedAudioRoutes.getBinding().setVariable(BR.inflatedVisibility, controlsViewModelAudioRoutesEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc0008L) != 0) {
            // api target 1

            if (!this.stubbedCallStats.isInflated()) this.stubbedCallStats.getViewStub().setVisibility(controlsViewModelCallStatsVisibleViewVISIBLEViewGONE);
            if (this.stubbedCallStats.isInflated()) this.stubbedCallStats.getBinding().setVariable(BR.inflatedVisibility, controlsViewModelCallStatsVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa0000L) != 0) {
            // api target 1

            if (this.stubbedCallStats.isInflated()) this.stubbedCallStats.getBinding().setVariable(BR.statsViewModel, statsViewModel);
        }
        if ((dirtyFlags & 0x9d800L) != 0) {
            // api target 1

            if (!this.stubbedConferenceActiveSpeakerLayout.isInflated()) this.stubbedConferenceActiveSpeakerLayout.getViewStub().setVisibility(conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE);
            if (this.stubbedConferenceActiveSpeakerLayout.isInflated()) this.stubbedConferenceActiveSpeakerLayout.getBinding().setVariable(BR.inflatedVisibility, conferenceViewModelConferenceDisplayModeConferenceDisplayModeACTIVESPEAKERConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE);
            if (!this.stubbedConferenceAudioOnlyLayout.isInflated()) this.stubbedConferenceAudioOnlyLayout.getViewStub().setVisibility(conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE);
            if (this.stubbedConferenceAudioOnlyLayout.isInflated()) this.stubbedConferenceAudioOnlyLayout.getBinding().setVariable(BR.inflatedVisibility, conferenceViewModelConferenceDisplayModeConferenceDisplayModeAUDIOONLYConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE);
            if (!this.stubbedConferenceGridLayout.isInflated()) this.stubbedConferenceGridLayout.getViewStub().setVisibility(conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE);
            if (this.stubbedConferenceGridLayout.isInflated()) this.stubbedConferenceGridLayout.getBinding().setVariable(BR.inflatedVisibility, conferenceViewModelConferenceDisplayModeConferenceDisplayModeGRIDConferenceViewModelConferenceExistsBooleanFalseCallsViewModelCurrentCallDataIsActiveAndNotInConferenceBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc2000L) != 0) {
            // api target 1

            if (!this.stubbedNumpad.isInflated()) this.stubbedNumpad.getViewStub().setVisibility(controlsViewModelNumpadVisibleViewVISIBLEViewGONE);
            if (this.stubbedNumpad.isInflated()) this.stubbedNumpad.getBinding().setVariable(BR.inflatedVisibility, controlsViewModelNumpadVisibleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x90004L) != 0) {
            // api target 1

            if (!this.stubbedPausedConference.isInflated()) this.stubbedPausedConference.getViewStub().setVisibility(conferenceViewModelIsConferenceLocallyPausedViewVISIBLEViewGONE);
            if (this.stubbedPausedConference.isInflated()) this.stubbedPausedConference.getBinding().setVariable(BR.inflatedVisibility, conferenceViewModelIsConferenceLocallyPausedViewVISIBLEViewGONE);
        }
        executeBindingsOn(primaryButtons);
        executeBindingsOn(extraButtonsLayout);
        executeBindingsOn(creationPendingLayout);
        if (stubbedAudioRoutes.getBinding() != null) {
            executeBindingsOn(stubbedAudioRoutes.getBinding());
        }
        if (stubbedCallStats.getBinding() != null) {
            executeBindingsOn(stubbedCallStats.getBinding());
        }
        if (stubbedConferenceActiveSpeakerLayout.getBinding() != null) {
            executeBindingsOn(stubbedConferenceActiveSpeakerLayout.getBinding());
        }
        if (stubbedConferenceAudioOnlyLayout.getBinding() != null) {
            executeBindingsOn(stubbedConferenceAudioOnlyLayout.getBinding());
        }
        if (stubbedConferenceGridLayout.getBinding() != null) {
            executeBindingsOn(stubbedConferenceGridLayout.getBinding());
        }
        if (stubbedNumpad.getBinding() != null) {
            executeBindingsOn(stubbedNumpad.getBinding());
        }
        if (stubbedPausedConference.getBinding() != null) {
            executeBindingsOn(stubbedPausedConference.getBinding());
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // controlsViewModel
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        // controlsViewModel != null
        boolean controlsViewModelJavaLangObjectNull = false;



        controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
        if (controlsViewModelJavaLangObjectNull) {



            controlsViewModel.hideExtraButtons(false);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): controlsViewModel.pipMode
        flag 1 (0x2L): controlsViewModel.showExtras
        flag 2 (0x3L): conferenceViewModel.isConferenceLocallyPaused
        flag 3 (0x4L): controlsViewModel.callStatsVisible
        flag 4 (0x5L): extraButtonsLayout
        flag 5 (0x6L): controlsViewModel.audioRoutesEnabled
        flag 6 (0x7L): controlsViewModel.extraButtonsMenuTranslateY
        flag 7 (0x8L): primaryButtons
        flag 8 (0x9L): controlsViewModel.fullScreenMode
        flag 9 (0xaL): conferenceViewModel.conferenceCreationPending
        flag 10 (0xbL): creationPendingLayout
        flag 11 (0xcL): conferenceViewModel.conferenceExists
        flag 12 (0xdL): callsViewModel.currentCallData
        flag 13 (0xeL): controlsViewModel.numpadVisible
        flag 14 (0xfL): conferenceViewModel.conferenceDisplayMode
        flag 15 (0x10L): callsViewModel
        flag 16 (0x11L): conferenceViewModel
        flag 17 (0x12L): statsViewModel
        flag 18 (0x13L): controlsViewModel
        flag 19 (0x14L): null
        flag 20 (0x15L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.numpadVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showExtras.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.showExtras.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false
        flag 29 (0x1eL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.audioRoutesEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false
        flag 33 (0x22L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.isConferenceLocallyPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:color/black_color : @android:color/transparent_color
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? @android:color/black_color : @android:color/transparent_color
        flag 38 (0x27L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false
        flag 39 (0x28L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false
        flag 40 (0x29L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false
        flag 41 (0x2aL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.ACTIVE_SPEAKER ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue()) ? View.GONE : View.VISIBLE
        flag 44 (0x2dL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false
        flag 45 (0x2eL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false
        flag 46 (0x2fL): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false
        flag 47 (0x30L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.AUDIO_ONLY ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false
        flag 48 (0x31L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.fullScreenMode.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.pipMode.getValue())
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.callStatsVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(controlsViewModel.callStatsVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 52 (0x35L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false ? View.VISIBLE : View.GONE
        flag 53 (0x36L): conferenceViewModel.conferenceDisplayMode.getValue() == ConferenceDisplayMode.GRID ? androidx.databinding.ViewDataBinding.safeUnbox(conferenceViewModel.conferenceExists.getValue()) : false ? !callsViewModel.currentCallData.getValue().isActiveAndNotInConference : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}