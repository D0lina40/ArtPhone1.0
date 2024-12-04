package org.linphone.telecom;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0019H\u0007J\u0006\u0010\u001b\u001a\u00020\u0019J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010\"\u001a\u00020\u0012J\u0010\u0010#\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lorg/linphone/telecom/TelecomHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "account", "Landroid/telecom/PhoneAccount;", "connections", "Ljava/util/ArrayList;", "Lorg/linphone/telecom/NativeCallWrapper;", "getConnections", "()Ljava/util/ArrayList;", "listener", "Lorg/linphone/core/CoreListenerStub;", "telecomManager", "Landroid/telecom/TelecomManager;", "createAccount", "destroy", "", "findConnectionForCallId", "callId", "", "findExistingAccount", "initPhoneAccount", "isAccountEnabled", "", "isInManagedCall", "isIncomingCallPermitted", "onIncomingCall", "call", "Lorg/linphone/core/Call;", "onOutgoingCall", "prepareBundle", "Landroid/os/Bundle;", "removeAccount", "updateAccount", "newAccount", "Companion", "app_debug"})
@android.annotation.TargetApi(value = 29)
public final class TelecomHelper {
    @org.jetbrains.annotations.NotNull
    private final android.telecom.TelecomManager telecomManager = null;
    @org.jetbrains.annotations.NotNull
    private android.telecom.PhoneAccount account;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<org.linphone.telecom.NativeCallWrapper> connections = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.telecom.TelecomHelper.Companion Companion = null;
    
    private TelecomHelper(android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<org.linphone.telecom.NativeCallWrapper> getConnections() {
        return null;
    }
    
    public final void destroy() {
    }
    
    public final boolean isIncomingCallPermitted() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final boolean isInManagedCall() {
        return false;
    }
    
    public final boolean isAccountEnabled() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @org.jetbrains.annotations.Nullable
    public final android.telecom.PhoneAccount findExistingAccount(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    public final void updateAccount(@org.jetbrains.annotations.Nullable
    android.telecom.PhoneAccount newAccount) {
    }
    
    public final void removeAccount() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final org.linphone.telecom.NativeCallWrapper findConnectionForCallId(@org.jetbrains.annotations.NotNull
    java.lang.String callId) {
        return null;
    }
    
    private final android.telecom.PhoneAccount initPhoneAccount(android.content.Context context) {
        return null;
    }
    
    private final android.telecom.PhoneAccount createAccount(android.content.Context context) {
        return null;
    }
    
    private final void onIncomingCall(org.linphone.core.Call call) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void onOutgoingCall(org.linphone.core.Call call) {
    }
    
    private final android.os.Bundle prepareBundle(org.linphone.core.Call call) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/linphone/telecom/TelecomHelper$Companion;", "Lorg/linphone/utils/SingletonHolder;", "Lorg/linphone/telecom/TelecomHelper;", "Landroid/content/Context;", "()V", "app_debug"})
    public static final class Companion extends org.linphone.utils.SingletonHolder<org.linphone.telecom.TelecomHelper, android.content.Context> {
        
        private Companion() {
            super(null);
        }
    }
}