package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\bB\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0094\u0001\u001a\u00030\u0095\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\u0096\u0001\u001a\u00030\u0095\u0001J\n\u0010\u0097\u0001\u001a\u00030\u0095\u0001H\u0002J\n\u0010\u0098\u0001\u001a\u00030\u0095\u0001H\u0014J\b\u0010\u0099\u0001\u001a\u00030\u0095\u0001J\n\u0010\u009a\u0001\u001a\u00030\u0095\u0001H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\'\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\'\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\fR\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\fR\u0011\u0010\u001c\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\fR\u0011\u0010 \u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010%\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\fR\u0011\u0010)\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0016R\'\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b-\u0010\u000e\u001a\u0004\b,\u0010\fR\u0011\u0010.\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0016R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\fR\u0011\u00102\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0016R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\fR\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\fR\u0011\u00108\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0016R\u0011\u0010:\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0016R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\fR\u0011\u0010>\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\u0016R\u0011\u0010@\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\fR\u0011\u0010E\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0016R\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\fR\u0011\u0010I\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0016R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020#0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\fR\u0011\u0010M\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0016R\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\fR\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\fR\u0011\u0010S\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\u0016R\u0017\u0010U\u001a\b\u0012\u0004\u0012\u00020#0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010\fR\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020#0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010\fR\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010\fR\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010\fR\u0011\u0010\\\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010\u0016R\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010\fR\u0011\u0010_\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010\u0016R\u001d\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010\fR\u0011\u0010c\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010\u0016R\u0011\u0010e\u001a\u00020f\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010\fR\u0011\u0010k\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010\u0016R\u0017\u0010m\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010\fR\u0011\u0010o\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010\u0016R\u0017\u0010q\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010\fR\u0011\u0010s\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010\u0016R\u0017\u0010u\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010\fR\u0011\u0010w\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010\u0016R\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010\fR\u0011\u0010{\u001a\u00020\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010\u0016R\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010\fR\u0018\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010\fR\u0013\u0010\u0081\u0001\u001a\u00020\u0014\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0016R\u0019\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020#0\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010\fR \u0010\u0085\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u001a0\u0086\u00010\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010\fR\u0013\u0010\u0088\u0001\u001a\u00020\u0014\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010\u0016R\u0019\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010\fR\u0013\u0010\u008c\u0001\u001a\u00020\u0014\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010\u0016R\u0019\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010\fR\u0013\u0010\u0090\u0001\u001a\u00020\u0014\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0016R\u0019\u0010\u0092\u0001\u001a\b\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010\f\u00a8\u0006\u009b\u0001"}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/AccountSettingsViewModel;", "Lorg/linphone/activities/main/settings/viewmodels/GenericSettingsViewModel;", "account", "Lorg/linphone/core/Account;", "(Lorg/linphone/core/Account;)V", "getAccount", "()Lorg/linphone/core/Account;", "accountDefaultEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getAccountDefaultEvent", "()Landroidx/lifecycle/MutableLiveData;", "accountDefaultEvent$delegate", "Lkotlin/Lazy;", "accountRemovedEvent", "getAccountRemovedEvent", "accountRemovedEvent$delegate", "accountToDelete", "accountsSettingsListener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "getAccountsSettingsListener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "setAccountsSettingsListener", "(Lorg/linphone/activities/main/settings/SettingListenerStub;)V", "audioVideoConferenceFactoryUri", "", "getAudioVideoConferenceFactoryUri", "audioVideoConferenceFactoryUriListener", "getAudioVideoConferenceFactoryUriListener", "avpf", "getAvpf", "avpfListener", "getAvpfListener", "avpfRrInterval", "", "getAvpfRrInterval", "avpfRrIntervalListener", "getAvpfRrIntervalListener", "conferenceFactoryUri", "getConferenceFactoryUri", "conferenceFactoryUriListener", "getConferenceFactoryUriListener", "deleteAccountRequiredEvent", "getDeleteAccountRequiredEvent", "deleteAccountRequiredEvent$delegate", "deleteListener", "getDeleteListener", "dialPrefix", "getDialPrefix", "dialPrefixListener", "getDialPrefixListener", "disable", "getDisable", "disableBundleMode", "getDisableBundleMode", "disableBundleModeListener", "getDisableBundleModeListener", "disableListener", "getDisableListener", "displayName", "getDisplayName", "displayNameListener", "getDisplayNameListener", "displayUsernameInsteadOfIdentity", "getDisplayUsernameInsteadOfIdentity", "()Z", "domain", "getDomain", "domainListener", "getDomainListener", "escapePlus", "getEscapePlus", "escapePlusListener", "getEscapePlusListener", "expires", "getExpires", "expiresListener", "getExpiresListener", "hideLinkPhoneNumber", "getHideLinkPhoneNumber", "ice", "getIce", "iceListener", "getIceListener", "iconContentDescription", "getIconContentDescription", "iconResource", "getIconResource", "identity", "getIdentity", "isDefault", "isDefaultListener", "limeServerUrl", "getLimeServerUrl", "limeServerUrlListener", "getLimeServerUrlListener", "linkPhoneNumberEvent", "getLinkPhoneNumberEvent", "linkPhoneNumberListener", "getLinkPhoneNumberListener", "listener", "Lorg/linphone/core/AccountListenerStub;", "getListener", "()Lorg/linphone/core/AccountListenerStub;", "outboundProxy", "getOutboundProxy", "outboundProxyListener", "getOutboundProxyListener", "password", "getPassword", "passwordListener", "getPasswordListener", "prefix", "getPrefix", "prefixListener", "getPrefixListener", "proxy", "getProxy", "proxyListener", "getProxyListener", "pushNotification", "getPushNotification", "pushNotificationListener", "getPushNotificationListener", "pushNotificationsAvailable", "getPushNotificationsAvailable", "stunServer", "getStunServer", "stunServerListener", "getStunServerListener", "transportIndex", "getTransportIndex", "transportLabels", "Ljava/util/ArrayList;", "getTransportLabels", "transportListener", "getTransportListener", "userId", "getUserId", "userIdListener", "getUserIdListener", "userName", "getUserName", "userNameListener", "getUserNameListener", "waitForUnregister", "getWaitForUnregister", "deleteAccount", "", "destroy", "initTransportList", "onCleared", "startDeleteAccount", "update", "app_debug"})
public final class AccountSettingsViewModel extends org.linphone.activities.main.settings.viewmodels.GenericSettingsViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Account account = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isDefault = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> displayName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> identity = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> iconResource = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> iconContentDescription = null;
    public org.linphone.activities.main.settings.SettingListenerStub accountsSettingsListener;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> waitForUnregister = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy accountRemovedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy accountDefaultEvent$delegate = null;
    private final boolean displayUsernameInsteadOfIdentity = false;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.Account accountToDelete;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.AccountListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub userNameListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> userName = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub userIdListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> userId = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub passwordListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> password = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub domainListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> domain = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub displayNameListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub disableListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> disable = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub isDefaultListener = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy deleteAccountRequiredEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub deleteListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub pushNotificationListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> pushNotification = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> pushNotificationsAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub transportListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> transportIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> transportLabels = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub proxyListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> proxy = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub outboundProxyListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> outboundProxy = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub stunServerListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> stunServer = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub iceListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> ice = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub avpfListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> avpf = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub avpfRrIntervalListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> avpfRrInterval = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub expiresListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> expires = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub prefixListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> prefix = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub dialPrefixListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> dialPrefix = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub escapePlusListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> escapePlus = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub linkPhoneNumberListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> linkPhoneNumberEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideLinkPhoneNumber = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub conferenceFactoryUriListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> conferenceFactoryUri = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub audioVideoConferenceFactoryUriListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> audioVideoConferenceFactoryUri = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub limeServerUrlListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> limeServerUrl = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub disableBundleModeListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> disableBundleMode = null;
    
    public AccountSettingsViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.Account account) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Account getAccount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isDefault() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getIdentity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getIconResource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getIconContentDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAccountsSettingsListener() {
        return null;
    }
    
    public final void setAccountsSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getWaitForUnregister() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getAccountRemovedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getAccountDefaultEvent() {
        return null;
    }
    
    public final boolean getDisplayUsernameInsteadOfIdentity() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.AccountListenerStub getListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getUserNameListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getUserIdListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUserId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getPasswordListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDomainListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDisplayNameListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDisableListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDisable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub isDefaultListener() {
        return null;
    }
    
    private final void deleteAccount(org.linphone.core.Account account) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getDeleteAccountRequiredEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDeleteListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getPushNotificationListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPushNotification() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getPushNotificationsAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getTransportListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTransportIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getTransportLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getProxyListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getProxy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getOutboundProxyListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getOutboundProxy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getStunServerListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getStunServer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getIceListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getIce() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAvpfListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAvpf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAvpfRrIntervalListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getAvpfRrInterval() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getExpiresListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getExpires() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getPrefixListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDialPrefixListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDialPrefix() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getEscapePlusListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getEscapePlus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLinkPhoneNumberListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getLinkPhoneNumberEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideLinkPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getConferenceFactoryUriListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getConferenceFactoryUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAudioVideoConferenceFactoryUriListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getAudioVideoConferenceFactoryUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLimeServerUrlListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLimeServerUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDisableBundleModeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDisableBundleMode() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void destroy() {
    }
    
    private final void update() {
    }
    
    private final void initTransportList() {
    }
    
    public final void startDeleteAccount() {
    }
}