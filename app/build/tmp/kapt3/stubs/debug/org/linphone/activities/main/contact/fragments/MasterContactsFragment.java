package org.linphone.activities.main.contact.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J \u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0013j\b\u0012\u0004\u0012\u00020\b`\u0014H\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J-\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\b2\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0017\u00a2\u0006\u0002\u0010\u001dJ\b\u0010\u001e\u001a\u00020\u0011H\u0016J\u001a\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/linphone/activities/main/contact/fragments/MasterContactsFragment;", "Lorg/linphone/activities/main/fragments/MasterFragment;", "Lorg/linphone/databinding/ContactMasterFragmentBinding;", "Lorg/linphone/activities/main/contact/adapters/ContactsListAdapter;", "()V", "contactIdToDisplay", "", "dialogConfirmationMessageBeforeRemoval", "", "getDialogConfirmationMessageBeforeRemoval", "()I", "editOnClick", "", "listViewModel", "Lorg/linphone/activities/main/contact/viewmodels/ContactsListViewModel;", "sipUriToAdd", "deleteItems", "", "indexesOfItemToDelete", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getLayoutId", "onDestroyView", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MasterContactsFragment extends org.linphone.activities.main.fragments.MasterFragment<org.linphone.databinding.ContactMasterFragmentBinding, org.linphone.activities.main.contact.adapters.ContactsListAdapter> {
    private final int dialogConfirmationMessageBeforeRemoval = 0;
    private org.linphone.activities.main.contact.viewmodels.ContactsListViewModel listViewModel;
    @org.jetbrains.annotations.Nullable
    private java.lang.String sipUriToAdd;
    private boolean editOnClick = false;
    @org.jetbrains.annotations.Nullable
    private java.lang.String contactIdToDisplay;
    
    public MasterContactsFragment() {
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
    public void onDestroyView() {
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
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
}