package org.linphone.activities.main.conference.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\r\u001a\u00020\u000e2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0010j\b\u0012\u0004\u0012\u00020\b`\u0011H\u0016J\b\u0010\u0012\u001a\u00020\bH\u0016J\u001a\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/linphone/activities/main/conference/fragments/ScheduledConferencesFragment;", "Lorg/linphone/activities/main/fragments/MasterFragment;", "Lorg/linphone/databinding/ConferencesScheduledFragmentBinding;", "Lorg/linphone/activities/main/conference/adapters/ScheduledConferencesAdapter;", "()V", "deleteConferenceInfoDialog", "Landroid/app/Dialog;", "dialogConfirmationMessageBeforeRemoval", "", "getDialogConfirmationMessageBeforeRemoval", "()I", "listViewModel", "Lorg/linphone/activities/main/conference/viewmodels/ScheduledConferencesViewModel;", "deleteItems", "", "indexesOfItemToDelete", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLayoutId", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showConfInfoDeleteConfirmationDialog", "data", "Lorg/linphone/activities/main/conference/data/ScheduledConferenceData;", "index", "app_debug"})
public final class ScheduledConferencesFragment extends org.linphone.activities.main.fragments.MasterFragment<org.linphone.databinding.ConferencesScheduledFragmentBinding, org.linphone.activities.main.conference.adapters.ScheduledConferencesAdapter> {
    private final int dialogConfirmationMessageBeforeRemoval = 0;
    private org.linphone.activities.main.conference.viewmodels.ScheduledConferencesViewModel listViewModel;
    @org.jetbrains.annotations.Nullable
    private android.app.Dialog deleteConferenceInfoDialog;
    
    public ScheduledConferencesFragment() {
        super();
    }
    
    @java.lang.Override
    protected int getDialogConfirmationMessageBeforeRemoval() {
        return 0;
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
    public void deleteItems(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.Integer> indexesOfItemToDelete) {
    }
    
    private final void showConfInfoDeleteConfirmationDialog(org.linphone.activities.main.conference.data.ScheduledConferenceData data, int index) {
    }
}