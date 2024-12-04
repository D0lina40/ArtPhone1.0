package org.linphone.activities.voip.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u001a\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/linphone/activities/voip/fragments/ConferenceParticipantsFragment;", "Lorg/linphone/activities/voip/fragments/GenericVideoPreviewFragment;", "Lorg/linphone/databinding/VoipConferenceParticipantsFragmentBinding;", "()V", "conferenceViewModel", "Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "getConferenceViewModel", "()Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "conferenceViewModel$delegate", "Lkotlin/Lazy;", "controlsViewModel", "Lorg/linphone/activities/voip/viewmodels/ControlsViewModel;", "getControlsViewModel", "()Lorg/linphone/activities/voip/viewmodels/ControlsViewModel;", "controlsViewModel$delegate", "skipEvents", "", "getLayoutId", "", "onPause", "", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ConferenceParticipantsFragment extends org.linphone.activities.voip.fragments.GenericVideoPreviewFragment<org.linphone.databinding.VoipConferenceParticipantsFragmentBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy conferenceViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy controlsViewModel$delegate = null;
    private boolean skipEvents = true;
    
    public ConferenceParticipantsFragment() {
        super();
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
}