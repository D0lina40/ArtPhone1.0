package org.linphone.activities.main.chat.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001a\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lorg/linphone/activities/main/chat/fragments/GroupInfoFragment;", "Lorg/linphone/activities/main/fragments/SecureFragment;", "Lorg/linphone/databinding/ChatRoomGroupInfoFragmentBinding;", "()V", "adapter", "Lorg/linphone/activities/main/chat/adapters/GroupInfoParticipantsAdapter;", "meAdminStatusChangedDialog", "Landroid/app/Dialog;", "viewModel", "Lorg/linphone/activities/main/chat/viewmodels/GroupInfoViewModel;", "addParticipantsFromSharedViewModel", "", "getLayoutId", "", "goToChatRoom", "chatRoom", "Lorg/linphone/core/ChatRoom;", "created", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "showMeAdminStateChanged", "isMeAdmin", "app_debug"})
public final class GroupInfoFragment extends org.linphone.activities.main.fragments.SecureFragment<org.linphone.databinding.ChatRoomGroupInfoFragmentBinding> {
    private org.linphone.activities.main.chat.viewmodels.GroupInfoViewModel viewModel;
    private org.linphone.activities.main.chat.adapters.GroupInfoParticipantsAdapter adapter;
    @org.jetbrains.annotations.Nullable
    private android.app.Dialog meAdminStatusChangedDialog;
    
    public GroupInfoFragment() {
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
    
    private final void addParticipantsFromSharedViewModel() {
    }
    
    private final void showMeAdminStateChanged(boolean isMeAdmin) {
    }
    
    private final void goToChatRoom(org.linphone.core.ChatRoom chatRoom, boolean created) {
    }
}