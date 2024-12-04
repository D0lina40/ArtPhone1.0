package org.linphone.activities.main.contact.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0017J-\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0017\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\fH\u0002J\b\u0010!\u001a\u00020\fH\u0002J\b\u0010\"\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lorg/linphone/activities/main/contact/fragments/ContactEditorFragment;", "Lorg/linphone/activities/GenericFragment;", "Lorg/linphone/databinding/ContactEditorFragmentBinding;", "Lorg/linphone/activities/main/contact/fragments/SyncAccountPickerFragment$SyncAccountPickedListener;", "()V", "data", "Lorg/linphone/activities/main/contact/data/ContactEditorData;", "temporaryPicturePath", "Ljava/io/File;", "getLayoutId", "", "onActivityResult", "", "requestCode", "resultCode", "intent", "Landroid/content/Intent;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onSyncAccountClicked", "name", "type", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "pickFile", "saveContact", "showInvisibleContactWarningDialog", "app_debug"})
public final class ContactEditorFragment extends org.linphone.activities.GenericFragment<org.linphone.databinding.ContactEditorFragmentBinding> implements org.linphone.activities.main.contact.fragments.SyncAccountPickerFragment.SyncAccountPickedListener {
    private org.linphone.activities.main.contact.data.ContactEditorData data;
    @org.jetbrains.annotations.Nullable
    private java.io.File temporaryPicturePath;
    
    public ContactEditorFragment() {
        super();
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
    public void onSyncAccountClicked(@org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String type) {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent intent) {
    }
    
    private final void saveContact() {
    }
    
    private final void pickFile() {
    }
    
    private final void showInvisibleContactWarningDialog() {
    }
}