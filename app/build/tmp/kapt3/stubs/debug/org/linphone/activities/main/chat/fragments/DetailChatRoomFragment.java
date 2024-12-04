package org.linphone.activities.main.chat.fragments;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J \u0010\u0019\u001a\u00020\u00142\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u001bj\b\u0012\u0004\u0012\u00020\u0018`\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\"\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J\b\u0010$\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020\u0014H\u0016J-\u0010&\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00182\u000e\u0010\'\u001a\n\u0012\u0006\b\u0001\u0012\u00020)0(2\u0006\u0010*\u001a\u00020+H\u0017\u00a2\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u0014H\u0016J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000100H\u0016J\b\u00105\u001a\u00020\u0014H\u0002J\u0010\u00106\u001a\u00020\u00142\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020\u00142\u0006\u0010:\u001a\u00020;H\u0002J\u001a\u0010<\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020>2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010@\u001a\u00020\u00142\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020\u0014H\u0002J\b\u0010D\u001a\u00020\u0014H\u0002J\u0010\u0010E\u001a\u00020\u00142\u0006\u00107\u001a\u000208H\u0002J\b\u0010F\u001a\u00020\u0014H\u0002J\u0010\u0010G\u001a\u00020\u00142\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010H\u001a\u00020\u0014H\u0002J\u0010\u0010I\u001a\u00020\u00142\u0006\u0010:\u001a\u00020;H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Lorg/linphone/activities/main/chat/fragments/DetailChatRoomFragment;", "Lorg/linphone/activities/main/fragments/MasterFragment;", "Lorg/linphone/databinding/ChatRoomDetailFragmentBinding;", "Lorg/linphone/activities/main/chat/adapters/ChatMessagesListAdapter;", "()V", "chatScrollListener", "Lorg/linphone/activities/main/chat/ChatScrollListener;", "chatSendingViewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatMessageSendingViewModel;", "globalLayoutLayout", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "keyboardVisibilityListener", "Lorg/linphone/utils/AppUtils$KeyboardVisibilityListener;", "listViewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatMessagesListViewModel;", "observer", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "viewModel", "Lorg/linphone/activities/main/chat/viewmodels/ChatRoomViewModel;", "addDeleteMessageTaskToQueue", "", "eventLog", "Lorg/linphone/activities/main/chat/data/EventLogData;", "position", "", "deleteItems", "indexesOfItemToDelete", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "enterEditionMode", "getLayoutId", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroyView", "onPause", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onSaveInstanceState", "outState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "pickFile", "replyToChatMessage", "chatMessage", "Lorg/linphone/core/ChatMessage;", "scheduleMeeting", "chatRoom", "Lorg/linphone/core/ChatRoom;", "scrollTo", "smooth", "", "scrollToFirstUnreadMessageOrBottom", "showDialogForUserConsentBeforeExportingFileInThirdPartyApp", "content", "Lorg/linphone/core/Content;", "showDialogToSuggestOpeningFileAsText", "showEphemeralMessages", "showForwardConfirmationDialog", "showGroupCallDialog", "showGroupInfo", "showParticipantsDevices", "showPopupMenu", "app_debug"})
public final class DetailChatRoomFragment extends org.linphone.activities.main.fragments.MasterFragment<org.linphone.databinding.ChatRoomDetailFragmentBinding, org.linphone.activities.main.chat.adapters.ChatMessagesListAdapter> {
    private org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel viewModel;
    private org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel;
    private org.linphone.activities.main.chat.viewmodels.ChatMessagesListViewModel listViewModel;
    @org.jetbrains.annotations.NotNull
    private final androidx.recyclerview.widget.RecyclerView.AdapterDataObserver observer = null;
    @org.jetbrains.annotations.NotNull
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener globalLayoutLayout = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.utils.AppUtils.KeyboardVisibilityListener keyboardVisibilityListener = null;
    private org.linphone.activities.main.chat.ChatScrollListener chatScrollListener;
    
    public DetailChatRoomFragment() {
        super();
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @java.lang.Override
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull
    android.os.Bundle outState) {
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
    @java.lang.Deprecated
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    public void onResume() {
    }
    
    @java.lang.Override
    public void onPause() {
    }
    
    @java.lang.Override
    @java.lang.Deprecated
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    private final void enterEditionMode() {
    }
    
    private final void showParticipantsDevices() {
    }
    
    private final void showGroupInfo(org.linphone.core.ChatRoom chatRoom) {
    }
    
    private final void showEphemeralMessages() {
    }
    
    private final void scheduleMeeting(org.linphone.core.ChatRoom chatRoom) {
    }
    
    private final void showForwardConfirmationDialog(org.linphone.core.ChatMessage chatMessage) {
    }
    
    private final void showPopupMenu(org.linphone.core.ChatRoom chatRoom) {
    }
    
    private final void addDeleteMessageTaskToQueue(org.linphone.activities.main.chat.data.EventLogData eventLog, int position) {
    }
    
    private final boolean scrollToFirstUnreadMessageOrBottom(boolean smooth) {
        return false;
    }
    
    private final void pickFile() {
    }
    
    private final void showDialogToSuggestOpeningFileAsText() {
    }
    
    private final void showDialogForUserConsentBeforeExportingFileInThirdPartyApp(org.linphone.core.Content content) {
    }
    
    private final void showGroupCallDialog() {
    }
    
    private final void scrollTo(int position, boolean smooth) {
    }
    
    private final void replyToChatMessage(org.linphone.core.ChatMessage chatMessage) {
    }
}