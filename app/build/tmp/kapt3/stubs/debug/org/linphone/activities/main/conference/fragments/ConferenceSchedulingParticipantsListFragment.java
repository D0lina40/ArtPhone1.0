package org.linphone.activities.main.conference.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J-\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0017\u00a2\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001c"}, d2 = {"Lorg/linphone/activities/main/conference/fragments/ConferenceSchedulingParticipantsListFragment;", "Lorg/linphone/activities/GenericFragment;", "Lorg/linphone/databinding/ConferenceSchedulingParticipantsListFragmentBinding;", "()V", "adapter", "Lorg/linphone/contact/ContactsSelectionAdapter;", "viewModel", "Lorg/linphone/activities/main/conference/viewmodels/ConferenceSchedulingViewModel;", "getViewModel", "()Lorg/linphone/activities/main/conference/viewmodels/ConferenceSchedulingViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getLayoutId", "", "onRequestPermissionsResult", "", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class ConferenceSchedulingParticipantsListFragment extends org.linphone.activities.GenericFragment<org.linphone.databinding.ConferenceSchedulingParticipantsListFragmentBinding> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    private org.linphone.contact.ContactsSelectionAdapter adapter;
    
    public ConferenceSchedulingParticipantsListFragment() {
        super();
    }
    
    private final org.linphone.activities.main.conference.viewmodels.ConferenceSchedulingViewModel getViewModel() {
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