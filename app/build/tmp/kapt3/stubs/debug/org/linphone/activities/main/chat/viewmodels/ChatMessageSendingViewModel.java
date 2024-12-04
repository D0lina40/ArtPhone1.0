package org.linphone.activities.main.chat.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0015J\u0006\u0010Q\u001a\u00020OJ\u0006\u0010R\u001a\u00020OJ\b\u0010S\u001a\u00020TH\u0002J\b\u0010U\u001a\u00020OH\u0002J\b\u0010V\u001a\u00020OH\u0002J\b\u0010W\u001a\u00020\u0007H\u0002J\b\u0010X\u001a\u00020OH\u0014J\u000e\u0010Y\u001a\u00020O2\u0006\u0010Z\u001a\u00020\u0015J\u0006\u0010[\u001a\u00020OJ\u0006\u0010\\\u001a\u00020OJ\u0010\u0010]\u001a\u00020O2\u0006\u0010^\u001a\u00020\u0010H\u0002J\u0006\u0010_\u001a\u00020OJ\u0006\u0010`\u001a\u00020OJ\b\u0010a\u001a\u00020OH\u0002J\b\u0010b\u001a\u00020OH\u0002J\u0006\u0010c\u001a\u00020OJ\u000e\u0010d\u001a\b\u0012\u0004\u0012\u00020O0eH\u0002J\u000e\u0010f\u001a\b\u0012\u0004\u0012\u00020O0eH\u0002J\u0006\u0010g\u001a\u00020OJ\u0006\u0010h\u001a\u00020OJ\u000e\u0010i\u001a\u00020O2\u0006\u0010j\u001a\u00020TJ\b\u0010k\u001a\u00020OH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\tR\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\tR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\tR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\tR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\tR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\tR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\tR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\tR\'\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070$0\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\'\u001a\u0004\b%\u0010\tR \u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082.\u00a2\u0006\u0002\n\u0000R\'\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070$0\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b3\u0010\'\u001a\u0004\b2\u0010\tR\'\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070$0\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b6\u0010\'\u001a\u0004\b5\u0010\tR\u000e\u00107\u001a\u000208X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\tR\u001c\u0010;\u001a\u0004\u0018\u00010<X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\t\"\u0004\bC\u0010,R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\tR\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00180\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\tR\u000e\u0010J\u001a\u00020KX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010L\u001a\u00020\u0018X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010\u001a\u00a8\u0006l"}, d2 = {"Lorg/linphone/activities/main/chat/viewmodels/ChatMessageSendingViewModel;", "Landroidx/lifecycle/ViewModel;", "chatRoom", "Lorg/linphone/core/ChatRoom;", "(Lorg/linphone/core/ChatRoom;)V", "attachFileEnabled", "Landroidx/lifecycle/MutableLiveData;", "", "getAttachFileEnabled", "()Landroidx/lifecycle/MutableLiveData;", "attachFilePending", "getAttachFilePending", "attachingFileInProgress", "getAttachingFileInProgress", "attachments", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/chat/data/ChatMessageAttachmentData;", "getAttachments", "chatRoomListener", "Lorg/linphone/core/ChatRoomListenerStub;", "formattedDuration", "", "getFormattedDuration", "imeFlags", "", "getImeFlags", "()I", "isEmojiPickerOpen", "isEmojiPickerVisible", "isFileTransferAvailable", "isPendingAnswer", "isPendingVoiceRecord", "isPlayingVoiceRecording", "isReadOnly", "isVoiceRecording", "messageSentEvent", "Lorg/linphone/utils/Event;", "getMessageSentEvent", "messageSentEvent$delegate", "Lkotlin/Lazy;", "pendingChatMessageToReplyTo", "Lorg/linphone/activities/main/chat/data/ChatMessageData;", "getPendingChatMessageToReplyTo", "setPendingChatMessageToReplyTo", "(Landroidx/lifecycle/MutableLiveData;)V", "playerListener", "Lorg/linphone/core/PlayerListener;", "recorder", "Lorg/linphone/core/Recorder;", "requestKeyboardHidingEvent", "getRequestKeyboardHidingEvent", "requestKeyboardHidingEvent$delegate", "requestRecordAudioPermissionEvent", "getRequestRecordAudioPermissionEvent", "requestRecordAudioPermissionEvent$delegate", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sendMessageEnabled", "getSendMessageEnabled", "temporaryFileUploadPath", "Ljava/io/File;", "getTemporaryFileUploadPath", "()Ljava/io/File;", "setTemporaryFileUploadPath", "(Ljava/io/File;)V", "textToSend", "getTextToSend", "setTextToSend", "voiceRecordAudioFocusRequest", "Landroidx/media/AudioFocusRequestCompat;", "voiceRecordPlayingPosition", "getVoiceRecordPlayingPosition", "voiceRecordingDuration", "getVoiceRecordingDuration", "voiceRecordingPlayer", "Lorg/linphone/core/Player;", "voiceRecordingProgressBarMax", "getVoiceRecordingProgressBarMax", "addAttachment", "", "path", "cancelReply", "cancelVoiceRecording", "createChatMessage", "Lorg/linphone/core/ChatMessage;", "initVoiceMessageRecorder", "initVoiceRecordPlayer", "isPlayerClosed", "onCleared", "onTextToSendChanged", "value", "pauseRecordedMessage", "playRecordedMessage", "removeAttachment", "attachment", "sendMessage", "startVoiceRecording", "stopVoiceRecordPlayer", "stopVoiceRecorder", "stopVoiceRecording", "tickerFlowPlaying", "Lkotlinx/coroutines/flow/Flow;", "tickerFlowRecording", "toggleEmojiPicker", "toggleVoiceRecording", "transferMessage", "chatMessage", "updateChatRoomReadOnlyState", "app_debug"})
public final class ChatMessageSendingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoom chatRoom = null;
    @org.jetbrains.annotations.Nullable
    private java.io.File temporaryFileUploadPath;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData>> attachments = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> attachFileEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> attachFilePending = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> sendMessageEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> attachingFileInProgress = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isReadOnly = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> textToSend;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPendingAnswer = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData> pendingChatMessageToReplyTo;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy requestRecordAudioPermissionEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy messageSentEvent$delegate = null;
    private final int voiceRecordingProgressBarMax = 10000;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPendingVoiceRecord = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVoiceRecording = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> voiceRecordingDuration = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> formattedDuration = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPlayingVoiceRecording = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> voiceRecordPlayingPosition = null;
    private final int imeFlags = 0;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmojiPickerOpen = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmojiPickerVisible = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFileTransferAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy requestKeyboardHidingEvent$delegate = null;
    private org.linphone.core.Recorder recorder;
    @org.jetbrains.annotations.Nullable
    private androidx.media.AudioFocusRequestCompat voiceRecordAudioFocusRequest;
    private org.linphone.core.Player voiceRecordingPlayer;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.PlayerListener playerListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatRoomListenerStub chatRoomListener = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public ChatMessageSendingViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatRoom chatRoom) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.io.File getTemporaryFileUploadPath() {
        return null;
    }
    
    public final void setTemporaryFileUploadPath(@org.jetbrains.annotations.Nullable
    java.io.File p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData>> getAttachments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAttachFileEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAttachFilePending() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSendMessageEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAttachingFileInProgress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isReadOnly() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTextToSend() {
        return null;
    }
    
    public final void setTextToSend(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPendingAnswer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData> getPendingChatMessageToReplyTo() {
        return null;
    }
    
    public final void setPendingChatMessageToReplyTo(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getRequestRecordAudioPermissionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getMessageSentEvent() {
        return null;
    }
    
    public final int getVoiceRecordingProgressBarMax() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPendingVoiceRecord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVoiceRecording() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getVoiceRecordingDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFormattedDuration() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPlayingVoiceRecording() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getVoiceRecordPlayingPosition() {
        return null;
    }
    
    public final int getImeFlags() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmojiPickerOpen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEmojiPickerVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isFileTransferAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getRequestKeyboardHidingEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void onTextToSendChanged(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final void addAttachment(@org.jetbrains.annotations.NotNull
    java.lang.String path) {
    }
    
    private final void removeAttachment(org.linphone.activities.main.chat.data.ChatMessageAttachmentData attachment) {
    }
    
    public final void toggleEmojiPicker() {
    }
    
    private final org.linphone.core.ChatMessage createChatMessage() {
        return null;
    }
    
    public final void sendMessage() {
    }
    
    public final void transferMessage(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatMessage chatMessage) {
    }
    
    public final void cancelReply() {
    }
    
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> tickerFlowRecording() {
        return null;
    }
    
    private final kotlinx.coroutines.flow.Flow<kotlin.Unit> tickerFlowPlaying() {
        return null;
    }
    
    public final void toggleVoiceRecording() {
    }
    
    public final void startVoiceRecording() {
    }
    
    public final void cancelVoiceRecording() {
    }
    
    private final void stopVoiceRecorder() {
    }
    
    public final void stopVoiceRecording() {
    }
    
    public final void playRecordedMessage() {
    }
    
    public final void pauseRecordedMessage() {
    }
    
    private final void initVoiceMessageRecorder() {
    }
    
    private final void initVoiceRecordPlayer() {
    }
    
    private final void stopVoiceRecordPlayer() {
    }
    
    private final boolean isPlayerClosed() {
        return false;
    }
    
    private final void updateChatRoomReadOnlyState() {
    }
}