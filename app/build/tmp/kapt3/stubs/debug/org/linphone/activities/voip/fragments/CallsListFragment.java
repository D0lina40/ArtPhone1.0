package org.linphone.activities.voip.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\u001a\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006$"}, d2 = {"Lorg/linphone/activities/voip/fragments/CallsListFragment;", "Lorg/linphone/activities/voip/fragments/GenericVideoPreviewFragment;", "Lorg/linphone/databinding/VoipCallsListFragmentBinding;", "()V", "callContextMenuClickListener", "Lorg/linphone/activities/voip/data/CallData$CallContextMenuClickListener;", "callsViewModel", "Lorg/linphone/activities/voip/viewmodels/CallsViewModel;", "getCallsViewModel", "()Lorg/linphone/activities/voip/viewmodels/CallsViewModel;", "callsViewModel$delegate", "Lkotlin/Lazy;", "conferenceViewModel", "Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "getConferenceViewModel", "()Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "conferenceViewModel$delegate", "controlsViewModel", "Lorg/linphone/activities/voip/viewmodels/ControlsViewModel;", "getControlsViewModel", "()Lorg/linphone/activities/voip/viewmodels/ControlsViewModel;", "controlsViewModel$delegate", "getLayoutId", "", "onPause", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showCallMenu", "anchor", "callData", "Lorg/linphone/activities/voip/data/CallData;", "app_debug"})
public final class CallsListFragment extends org.linphone.activities.voip.fragments.GenericVideoPreviewFragment<org.linphone.databinding.VoipCallsListFragmentBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy callsViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy conferenceViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy controlsViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.voip.data.CallData.CallContextMenuClickListener callContextMenuClickListener = null;
    
    public CallsListFragment() {
        super();
    }
    
    private final org.linphone.activities.voip.viewmodels.CallsViewModel getCallsViewModel() {
        return null;
    }
    
    private final org.linphone.activities.voip.viewmodels.ConferenceViewModel getConferenceViewModel() {
        return null;
    }
    
    private final org.linphone.activities.voip.viewmodels.ControlsViewModel getControlsViewModel() {
        return null;
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
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
    
    private final void showCallMenu(android.view.View anchor, org.linphone.activities.voip.data.CallData callData) {
    }
}