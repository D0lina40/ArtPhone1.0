package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b@\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010e\u001a\u00020fH\u0002J\b\u0010g\u001a\u00020fH\u0002R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001a\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011R\u001d\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00130\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u0011\u0010 \u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\nR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0$0\u000e8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b&\u0010\u0011R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020%0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0011R\u0011\u0010+\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\nR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0011R\u0011\u0010/\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\nR\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0011R\u0011\u00103\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\nR\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u0011R\u0011\u00107\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010\nR\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0011R\u0011\u0010;\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010\nR\u0017\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010\u0011R\u0011\u0010?\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010\nR\u0017\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u0011R\u0011\u0010C\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\nR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u0011R\u0011\u0010G\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010\nR\u0017\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010\u0011R\u0011\u0010K\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010\nR\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010\u0011R\u0011\u0010O\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010\nR\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010\u0011R\u0011\u0010S\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010\nR\u001a\u0010U\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\n\"\u0004\bW\u0010XR\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010\u0011R\u0011\u0010[\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010\nR\u0017\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010\u0011R\u0011\u0010_\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010\nR\u0017\u0010a\u001a\b\u0012\u0004\u0012\u00020%0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010\u0011R\u0011\u0010c\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010\n\u00a8\u0006h"}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/LdapSettingsViewModel;", "Lorg/linphone/activities/main/settings/viewmodels/GenericSettingsViewModel;", "ldap", "Lorg/linphone/core/Ldap;", "index", "", "(Lorg/linphone/core/Ldap;Ljava/lang/String;)V", "deleteListener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "getDeleteListener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "getIndex", "()Ljava/lang/String;", "ldapAuthMethodIndex", "Landroidx/lifecycle/MutableLiveData;", "", "getLdapAuthMethodIndex", "()Landroidx/lifecycle/MutableLiveData;", "ldapAuthMethodLabels", "Ljava/util/ArrayList;", "getLdapAuthMethodLabels", "ldapAuthMethodListener", "getLdapAuthMethodListener", "ldapAuthMethodValues", "ldapBindDn", "getLdapBindDn", "ldapBindDnListener", "getLdapBindDnListener", "ldapCertCheckIndex", "getLdapCertCheckIndex", "ldapCertCheckLabels", "getLdapCertCheckLabels", "ldapCertCheckListener", "getLdapCertCheckListener", "ldapCertCheckValues", "ldapConfigDeletedEvent", "Lorg/linphone/utils/Event;", "", "getLdapConfigDeletedEvent", "ldapConfigDeletedEvent$delegate", "Lkotlin/Lazy;", "ldapDebug", "getLdapDebug", "ldapDebugListener", "getLdapDebugListener", "ldapEnable", "getLdapEnable", "ldapEnableListener", "getLdapEnableListener", "ldapMinimumCharacters", "getLdapMinimumCharacters", "ldapMinimumCharactersListener", "getLdapMinimumCharactersListener", "ldapNameAttribute", "getLdapNameAttribute", "ldapNameAttributeListener", "getLdapNameAttributeListener", "ldapPassword", "getLdapPassword", "ldapPasswordListener", "getLdapPasswordListener", "ldapRequestDelay", "getLdapRequestDelay", "ldapRequestDelayListener", "getLdapRequestDelayListener", "ldapSearchBase", "getLdapSearchBase", "ldapSearchBaseListener", "getLdapSearchBaseListener", "ldapSearchFilter", "getLdapSearchFilter", "ldapSearchFilterListener", "getLdapSearchFilterListener", "ldapSearchMaxResults", "getLdapSearchMaxResults", "ldapSearchMaxResultsListener", "getLdapSearchMaxResultsListener", "ldapSearchTimeout", "getLdapSearchTimeout", "ldapSearchTimeoutListener", "getLdapSearchTimeoutListener", "ldapServer", "getLdapServer", "ldapServerListener", "getLdapServerListener", "ldapSettingsListener", "getLdapSettingsListener", "setLdapSettingsListener", "(Lorg/linphone/activities/main/settings/SettingListenerStub;)V", "ldapSipAttribute", "getLdapSipAttribute", "ldapSipAttributeListener", "getLdapSipAttributeListener", "ldapSipDomain", "getLdapSipDomain", "ldapSipDomainListener", "getLdapSipDomainListener", "ldapTls", "getLdapTls", "ldapTlsListener", "getLdapTlsListener", "initAuthMethodList", "", "initTlsCertCheckList", "app_debug"})
public final class LdapSettingsViewModel extends org.linphone.activities.main.settings.viewmodels.GenericSettingsViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Ldap ldap = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String index = null;
    public org.linphone.activities.main.settings.SettingListenerStub ldapSettingsListener;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy ldapConfigDeletedEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapEnableListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> ldapEnable = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub deleteListener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapServerListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> ldapServer = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapBindDnListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> ldapBindDn = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapPasswordListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> ldapPassword = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapAuthMethodListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> ldapAuthMethodIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ldapAuthMethodLabels = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.Integer> ldapAuthMethodValues = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapTlsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> ldapTls = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapCertCheckListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> ldapCertCheckIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> ldapCertCheckLabels = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.Integer> ldapCertCheckValues = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapSearchBaseListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> ldapSearchBase = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapSearchFilterListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> ldapSearchFilter = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapSearchMaxResultsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> ldapSearchMaxResults = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapSearchTimeoutListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> ldapSearchTimeout = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapRequestDelayListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> ldapRequestDelay = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapMinimumCharactersListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> ldapMinimumCharacters = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapNameAttributeListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> ldapNameAttribute = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapSipAttributeListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> ldapSipAttribute = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapSipDomainListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> ldapSipDomain = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub ldapDebugListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> ldapDebug = null;
    
    public LdapSettingsViewModel(@org.jetbrains.annotations.NotNull
    org.linphone.core.Ldap ldap, @org.jetbrains.annotations.NotNull
    java.lang.String index) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapSettingsListener() {
        return null;
    }
    
    public final void setLdapSettingsListener(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.SettingListenerStub p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getLdapConfigDeletedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapEnableListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLdapEnable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDeleteListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapServerListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLdapServer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapBindDnListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLdapBindDn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapPasswordListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLdapPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapAuthMethodListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLdapAuthMethodIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getLdapAuthMethodLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapTlsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLdapTls() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapCertCheckListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLdapCertCheckIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getLdapCertCheckLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapSearchBaseListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLdapSearchBase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapSearchFilterListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLdapSearchFilter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapSearchMaxResultsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLdapSearchMaxResults() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapSearchTimeoutListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLdapSearchTimeout() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapRequestDelayListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLdapRequestDelay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapMinimumCharactersListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLdapMinimumCharacters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapNameAttributeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLdapNameAttribute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapSipAttributeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLdapSipAttribute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapSipDomainListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getLdapSipDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLdapDebugListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLdapDebug() {
        return null;
    }
    
    private final void initAuthMethodList() {
    }
    
    private final void initTlsCertCheckList() {
    }
}