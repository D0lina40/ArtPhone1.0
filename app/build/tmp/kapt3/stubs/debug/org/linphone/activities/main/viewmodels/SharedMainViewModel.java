package org.linphone.activities.main.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\f\u0010\u0007R\'\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000b0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0010\u0010\u0007R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R!\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010\t\u001a\u0004\b$\u0010\u0007R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00130\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0007R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0007R \u00102\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u00104R\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0007R\'\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080\u000b0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b:\u0010\t\u001a\u0004\b9\u0010\u0007R7\u0010;\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`<0\u000b0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010\t\u001a\u0004\b=\u0010\u0007R\u001a\u0010?\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010 \"\u0004\bA\u0010\"R!\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bD\u0010\t\u001a\u0004\bC\u0010\u0007R\'\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bG\u0010\t\u001a\u0004\bF\u0010\u0007R\u001d\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0007R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020L0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010\u0007R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\'0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010\u0007R\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0007R\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\'0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0007R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\u0007R\u001d\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010\u0007R\'\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u000b0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\\\u0010\t\u001a\u0004\b[\u0010\u0007R\'\u0010]\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u000b0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b_\u0010\t\u001a\u0004\b^\u0010\u0007\u00a8\u0006`"}, d2 = {"Lorg/linphone/activities/main/viewmodels/SharedMainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "accountRemoved", "Landroidx/lifecycle/MutableLiveData;", "", "getAccountRemoved", "()Landroidx/lifecycle/MutableLiveData;", "accountRemoved$delegate", "Lkotlin/Lazy;", "accountSettingsFragmentOpenedEvent", "Lorg/linphone/utils/Event;", "getAccountSettingsFragmentOpenedEvent", "accountSettingsFragmentOpenedEvent$delegate", "addressOfConferenceInfoToEdit", "", "getAddressOfConferenceInfoToEdit", "addressOfConferenceInfoToEdit$delegate", "chatRoomParticipants", "Ljava/util/ArrayList;", "Lorg/linphone/core/Address;", "getChatRoomParticipants", "chatRoomSubject", "getChatRoomSubject", "()Ljava/lang/String;", "setChatRoomSubject", "(Ljava/lang/String;)V", "contentToOpen", "Lorg/linphone/core/Content;", "getContentToOpen", "createEncryptedChatRoom", "getCreateEncryptedChatRoom", "()Z", "setCreateEncryptedChatRoom", "(Z)V", "defaultAccountChanged", "getDefaultAccountChanged", "defaultAccountChanged$delegate", "destructionPendingChatRoom", "Lorg/linphone/core/ChatRoom;", "getDestructionPendingChatRoom", "()Lorg/linphone/core/ChatRoom;", "setDestructionPendingChatRoom", "(Lorg/linphone/core/ChatRoom;)V", "dialerUri", "getDialerUri", "setDialerUri", "filesToShare", "getFilesToShare", "isPendingMessageForward", "isSlidingPaneSlideable", "setSlidingPaneSlideable", "(Landroidx/lifecycle/MutableLiveData;)V", "layoutChangedEvent", "getLayoutChangedEvent", "messageToForwardEvent", "Lorg/linphone/core/ChatMessage;", "getMessageToForwardEvent", "messageToForwardEvent$delegate", "participantsListForNextScheduledMeeting", "Lkotlin/collections/ArrayList;", "getParticipantsListForNextScheduledMeeting", "participantsListForNextScheduledMeeting$delegate", "pendingCallTransfer", "getPendingCallTransfer", "setPendingCallTransfer", "publishPresenceToggled", "getPublishPresenceToggled", "publishPresenceToggled$delegate", "refreshChatRoomInListEvent", "getRefreshChatRoomInListEvent", "refreshChatRoomInListEvent$delegate", "richContentUri", "Landroid/net/Uri;", "getRichContentUri", "selectedCallLogGroup", "Lorg/linphone/activities/main/history/data/GroupedCallLogData;", "getSelectedCallLogGroup", "selectedChatRoom", "getSelectedChatRoom", "selectedContact", "Lorg/linphone/core/Friend;", "getSelectedContact", "selectedGroupChatRoom", "getSelectedGroupChatRoom", "textToShare", "getTextToShare", "toggleDrawerEvent", "getToggleDrawerEvent", "updateContactsAnimationsBasedOnDestination", "", "getUpdateContactsAnimationsBasedOnDestination", "updateContactsAnimationsBasedOnDestination$delegate", "updateDialerAnimationsBasedOnDestination", "getUpdateDialerAnimationsBasedOnDestination", "updateDialerAnimationsBasedOnDestination$delegate", "app_debug"})
public final class SharedMainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> toggleDrawerEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> layoutChangedEvent = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSlidingPaneSlideable;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.history.data.GroupedCallLogData> selectedCallLogGroup = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom> selectedChatRoom = null;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.ChatRoom destructionPendingChatRoom;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom> selectedGroupChatRoom = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> filesToShare = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> textToShare = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy messageToForwardEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPendingMessageForward = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.Content> contentToOpen = null;
    private boolean createEncryptedChatRoom;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>> chatRoomParticipants = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String chatRoomSubject = "";
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<android.net.Uri>> richContentUri = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy refreshChatRoomInListEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> selectedContact = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy updateContactsAnimationsBasedOnDestination$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy defaultAccountChanged$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy accountRemoved$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy publishPresenceToggled$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy accountSettingsFragmentOpenedEvent$delegate = null;
    private boolean pendingCallTransfer = false;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy addressOfConferenceInfoToEdit$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy participantsListForNextScheduledMeeting$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String dialerUri = "";
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy updateDialerAnimationsBasedOnDestination$delegate = null;
    
    public SharedMainViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getToggleDrawerEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getLayoutChangedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSlidingPaneSlideable() {
        return null;
    }
    
    public final void setSlidingPaneSlideable(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.history.data.GroupedCallLogData> getSelectedCallLogGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom> getSelectedChatRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.core.ChatRoom getDestructionPendingChatRoom() {
        return null;
    }
    
    public final void setDestructionPendingChatRoom(@org.jetbrains.annotations.Nullable
    org.linphone.core.ChatRoom p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom> getSelectedGroupChatRoom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getFilesToShare() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTextToShare() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<org.linphone.core.ChatMessage>> getMessageToForwardEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPendingMessageForward() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.Content> getContentToOpen() {
        return null;
    }
    
    public final boolean getCreateEncryptedChatRoom() {
        return false;
    }
    
    public final void setCreateEncryptedChatRoom(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.core.Address>> getChatRoomParticipants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getChatRoomSubject() {
        return null;
    }
    
    public final void setChatRoomSubject(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<android.net.Uri>> getRichContentUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getRefreshChatRoomInListEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> getSelectedContact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Integer>> getUpdateContactsAnimationsBasedOnDestination() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDefaultAccountChanged() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAccountRemoved() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPublishPresenceToggled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getAccountSettingsFragmentOpenedEvent() {
        return null;
    }
    
    public final boolean getPendingCallTransfer() {
        return false;
    }
    
    public final void setPendingCallTransfer(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getAddressOfConferenceInfoToEdit() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.util.ArrayList<org.linphone.core.Address>>> getParticipantsListForNextScheduledMeeting() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDialerUri() {
        return null;
    }
    
    public final void setDialerUri(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Integer>> getUpdateDialerAnimationsBasedOnDestination() {
        return null;
    }
}