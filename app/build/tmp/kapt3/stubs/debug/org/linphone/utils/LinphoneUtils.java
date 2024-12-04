package org.linphone.utils;

/**
 * Various utility methods for Linphone SDK
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/utils/LinphoneUtils;", "", "()V", "Companion", "app_debug"})
public final class LinphoneUtils {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String RECORDING_DATE_PATTERN = "dd-MM-yyyy-HH-mm-ss";
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.LinphoneUtils.Companion Companion = null;
    
    public LinphoneUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0015J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0016\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000bJ\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\rJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010%\u001a\u00020&J\u0010\u0010\'\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\rJ\u0010\u0010(\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\rJ\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0004J\u000e\u0010,\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\rJ\u0010\u0010-\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010\u0004J\u000e\u0010/\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u0012J*\u00101\u001a\u0004\u0018\u00010\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\b\b\u0002\u00105\u001a\u00020\u0004J\u000e\u00106\u001a\u00020\u00062\u0006\u00107\u001a\u000208J\u0006\u00109\u001a\u00020\u0006J\u0006\u0010:\u001a\u00020\u0006J\u0006\u0010;\u001a\u00020\u0006J\u0006\u0010<\u001a\u00020\u0006J\u0006\u0010=\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lorg/linphone/utils/LinphoneUtils$Companion;", "", "()V", "RECORDING_DATE_PATTERN", "", "applyInternationalPrefix", "", "checkIfNetworkHasLowBandwidth", "context", "Landroid/content/Context;", "createOneToOneChatRoom", "Lorg/linphone/core/ChatRoom;", "participant", "Lorg/linphone/core/Address;", "isSecured", "deleteFilesAttachedToChatMessage", "", "chatMessage", "Lorg/linphone/core/ChatMessage;", "deleteFilesAttachedToEventLog", "eventLog", "Lorg/linphone/core/EventLog;", "getAccountsNotHidden", "", "Lorg/linphone/core/Account;", "getChatRoomId", "localAddress", "remoteAddress", "room", "getCleanedAddress", "address", "getConferenceAddress", "call", "Lorg/linphone/core/Call;", "getConferenceInvitationsChatRoomParams", "Lorg/linphone/core/ChatRoomParams;", "getConferenceSubject", "conference", "Lorg/linphone/core/Conference;", "getDisplayName", "getDisplayableAddress", "getRecordingDateFromFileName", "Ljava/util/Date;", "name", "getRecordingFilePathForAddress", "getRecordingFilePathForConference", "subject", "getTextDescribingMessage", "message", "hashPassword", "userId", "password", "realm", "algorithm", "isCallLogMissed", "callLog", "Lorg/linphone/core/CallLog;", "isEndToEndEncryptedChatAvailable", "isFileTransferAvailable", "isGroupChatAvailable", "isPushNotificationAvailable", "isRemoteConferencingAvailable", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDisplayName(@org.jetbrains.annotations.Nullable
        org.linphone.core.Address address) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getDisplayableAddress(@org.jetbrains.annotations.Nullable
        org.linphone.core.Address address) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.core.Address getCleanedAddress(@org.jetbrains.annotations.NotNull
        org.linphone.core.Address address) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.linphone.core.Address getConferenceAddress(@org.jetbrains.annotations.NotNull
        org.linphone.core.Call call) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getConferenceSubject(@org.jetbrains.annotations.NotNull
        org.linphone.core.Conference conference) {
            return null;
        }
        
        public final boolean isEndToEndEncryptedChatAvailable() {
            return false;
        }
        
        public final boolean isGroupChatAvailable() {
            return false;
        }
        
        public final boolean isRemoteConferencingAvailable() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.linphone.core.ChatRoom createOneToOneChatRoom(@org.jetbrains.annotations.NotNull
        org.linphone.core.Address participant, boolean isSecured) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.core.ChatRoomParams getConferenceInvitationsChatRoomParams() {
            return null;
        }
        
        public final void deleteFilesAttachedToEventLog(@org.jetbrains.annotations.NotNull
        org.linphone.core.EventLog eventLog) {
        }
        
        public final void deleteFilesAttachedToChatMessage(@org.jetbrains.annotations.NotNull
        org.linphone.core.ChatMessage chatMessage) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getRecordingFilePathForAddress(@org.jetbrains.annotations.NotNull
        org.linphone.core.Address address) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getRecordingFilePathForConference(@org.jetbrains.annotations.Nullable
        java.lang.String subject) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.Date getRecordingDateFromFileName(@org.jetbrains.annotations.NotNull
        java.lang.String name) {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"MissingPermission"})
        public final boolean checkIfNetworkHasLowBandwidth(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return false;
        }
        
        public final boolean isCallLogMissed(@org.jetbrains.annotations.NotNull
        org.linphone.core.CallLog callLog) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getChatRoomId(@org.jetbrains.annotations.NotNull
        org.linphone.core.ChatRoom room) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getChatRoomId(@org.jetbrains.annotations.NotNull
        org.linphone.core.Address localAddress, @org.jetbrains.annotations.NotNull
        org.linphone.core.Address remoteAddress) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.util.List<org.linphone.core.Account> getAccountsNotHidden() {
            return null;
        }
        
        public final boolean applyInternationalPrefix() {
            return false;
        }
        
        public final boolean isPushNotificationAvailable() {
            return false;
        }
        
        public final boolean isFileTransferAvailable() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String hashPassword(@org.jetbrains.annotations.NotNull
        java.lang.String userId, @org.jetbrains.annotations.NotNull
        java.lang.String password, @org.jetbrains.annotations.NotNull
        java.lang.String realm, @org.jetbrains.annotations.NotNull
        java.lang.String algorithm) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTextDescribingMessage(@org.jetbrains.annotations.NotNull
        org.linphone.core.ChatMessage message) {
            return null;
        }
    }
}