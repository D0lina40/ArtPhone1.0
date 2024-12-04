package org.linphone.activities.voip.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J-\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0017\u00a2\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lorg/linphone/activities/voip/fragments/ConferenceAddParticipantsFragment;", "Lorg/linphone/activities/GenericFragment;", "Lorg/linphone/databinding/VoipConferenceParticipantsAddFragmentBinding;", "()V", "adapter", "Lorg/linphone/contact/ContactsSelectionAdapter;", "conferenceViewModel", "Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "getConferenceViewModel", "()Lorg/linphone/activities/voip/viewmodels/ConferenceViewModel;", "conferenceViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lorg/linphone/activities/voip/viewmodels/ConferenceParticipantsViewModel;", "getLayoutId", "", "onRequestPermissionsResult", "", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ConferenceAddParticipantsFragment extends org.linphone.activities.GenericFragment<org.linphone.databinding.VoipConferenceParticipantsAddFragmentBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy conferenceViewModel$delegate = null;
    private org.linphone.activities.voip.viewmodels.ConferenceParticipantsViewModel viewModel;
    private org.linphone.contact.ContactsSelectionAdapter adapter;
    
    public ConferenceAddParticipantsFragment() {
        super();
    }
    
    private final org.linphone.activities.voip.viewmodels.ConferenceViewModel getConferenceViewModel() {
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
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
}