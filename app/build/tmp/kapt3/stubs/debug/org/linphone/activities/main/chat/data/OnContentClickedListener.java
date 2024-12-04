package org.linphone.activities.main.chat.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0005H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H&\u00a8\u0006\u0016"}, d2 = {"Lorg/linphone/activities/main/chat/data/OnContentClickedListener;", "", "onCallConference", "", "address", "", "subject", "onContentClicked", "content", "Lorg/linphone/core/Content;", "onEmailAddressClicked", "email", "onError", "messageId", "", "onShowReactionsList", "chatMessage", "Lorg/linphone/core/ChatMessage;", "onSipAddressClicked", "sipUri", "onWebUrlClicked", "url", "app_debug"})
public abstract interface OnContentClickedListener {
    
    public abstract void onContentClicked(@org.jetbrains.annotations.NotNull
    org.linphone.core.Content content);
    
    public abstract void onSipAddressClicked(@org.jetbrains.annotations.NotNull
    java.lang.String sipUri);
    
    public abstract void onEmailAddressClicked(@org.jetbrains.annotations.NotNull
    java.lang.String email);
    
    public abstract void onWebUrlClicked(@org.jetbrains.annotations.NotNull
    java.lang.String url);
    
    public abstract void onCallConference(@org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.Nullable
    java.lang.String subject);
    
    public abstract void onShowReactionsList(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatMessage chatMessage);
    
    public abstract void onError(int messageId);
}