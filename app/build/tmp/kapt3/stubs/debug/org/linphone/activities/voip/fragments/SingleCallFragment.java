package org.linphone.activities.voip.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020\u001eH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\u001a\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010\'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020,H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\t\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006-"}, d2 = {"Lorg/linphone/activities/voip/fragments/SingleCallFragment;", "Lorg/linphone/activities/voip/fragments/GenericVideoPreviewFragment;", "Lorg/linphone/databinding/VoipSingleCallFragmentBinding;", "()V", "callsViewModel", "Lorg/linphone/activities/voip/viewmodels/CallsViewModel;", "getCallsViewModel", "()Lorg/linphone/activities/voip/viewmodels/CallsViewModel;", "callsViewModel$delegate", "Lkotlin/Lazy;", "conferenceViewModel", "Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "getConferenceViewModel", "()Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "conferenceViewModel$delegate", "controlsViewModel", "Lorg/linphone/activities/voip/viewmodels/ControlsViewModel;", "getControlsViewModel", "()Lorg/linphone/activities/voip/viewmodels/ControlsViewModel;", "controlsViewModel$delegate", "dialog", "Landroid/app/Dialog;", "statsViewModel", "Lorg/linphone/activities/voip/viewmodels/StatisticsListViewModel;", "getStatsViewModel", "()Lorg/linphone/activities/voip/viewmodels/StatisticsListViewModel;", "statsViewModel$delegate", "getLayoutId", "", "goToChat", "", "onPause", "onResume", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showCallVideoUpdateDialog", "call", "Lorg/linphone/core/Call;", "updateHingeRelatedConstraints", "feature", "Landroidx/window/layout/FoldingFeature;", "app_debug"})
public final class SingleCallFragment extends org.linphone.activities.voip.fragments.GenericVideoPreviewFragment<org.linphone.databinding.VoipSingleCallFragmentBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy controlsViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy callsViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy conferenceViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy statsViewModel$delegate = null;
    @org.jetbrains.annotations.Nullable
    private android.app.Dialog dialog;
    
    public SingleCallFragment() {
        super();
    }
    
    private final org.linphone.activities.voip.viewmodels.ControlsViewModel getControlsViewModel() {
        return null;
    }
    
    private final org.linphone.activities.voip.viewmodels.CallsViewModel getCallsViewModel() {
        return null;
    }
    
    private final org.linphone.activities.voip.viewmodels.ConferenceViewModel getConferenceViewModel() {
        return null;
    }
    
    private final org.linphone.activities.voip.viewmodels.StatisticsListViewModel getStatsViewModel() {
        return null;
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    private final void showCallVideoUpdateDialog(org.linphone.core.Call call) {
    }
    
    private final void goToChat() {
    }
    
    private final void updateHingeRelatedConstraints(androidx.window.layout.FoldingFeature feature) {
    }
}