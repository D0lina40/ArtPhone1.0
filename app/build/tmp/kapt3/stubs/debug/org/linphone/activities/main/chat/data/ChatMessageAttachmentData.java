package org.linphone.activities.main.chat.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B0\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0015\u001a\u00020\tR)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r\u00a8\u0006\u0016"}, d2 = {"Lorg/linphone/activities/main/chat/data/ChatMessageAttachmentData;", "", "path", "", "deleteCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "attachment", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "fileName", "getFileName", "()Ljava/lang/String;", "isAudio", "", "()Z", "isImage", "isPdf", "isVideo", "getPath", "delete", "app_debug"})
public final class ChatMessageAttachmentData {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String path = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<org.linphone.activities.main.chat.data.ChatMessageAttachmentData, kotlin.Unit> deleteCallback = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String fileName = null;
    private final boolean isImage = false;
    private final boolean isVideo = false;
    private final boolean isAudio = false;
    private final boolean isPdf = false;
    
    public ChatMessageAttachmentData(@org.jetbrains.annotations.NotNull
    java.lang.String path, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super org.linphone.activities.main.chat.data.ChatMessageAttachmentData, kotlin.Unit> deleteCallback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFileName() {
        return null;
    }
    
    public final boolean isImage() {
        return false;
    }
    
    public final boolean isVideo() {
        return false;
    }
    
    public final boolean isAudio() {
        return false;
    }
    
    public final boolean isPdf() {
        return false;
    }
    
    public final void delete() {
    }
}