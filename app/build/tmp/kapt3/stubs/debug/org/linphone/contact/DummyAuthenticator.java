package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JI\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0010\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0002\u0010\u000fJ(\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0013\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J0\u0010\u0014\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J3\u0010\u0016\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0010\u0010\u0017\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\rH\u0016\u00a2\u0006\u0002\u0010\u0018J0\u0010\u0019\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u001a"}, d2 = {"Lorg/linphone/contact/DummyAuthenticator;", "Landroid/accounts/AbstractAccountAuthenticator;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "addAccount", "Landroid/os/Bundle;", "response", "Landroid/accounts/AccountAuthenticatorResponse;", "accountType", "", "authTokenType", "requiredFeatures", "", "options", "(Landroid/accounts/AccountAuthenticatorResponse;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;", "confirmCredentials", "account", "Landroid/accounts/Account;", "editProperties", "getAuthToken", "getAuthTokenLabel", "hasFeatures", "features", "(Landroid/accounts/AccountAuthenticatorResponse;Landroid/accounts/Account;[Ljava/lang/String;)Landroid/os/Bundle;", "updateCredentials", "app_debug"})
public final class DummyAuthenticator extends android.accounts.AbstractAccountAuthenticator {
    
    public DummyAuthenticator(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super(null);
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String getAuthTokenLabel(@org.jetbrains.annotations.Nullable
    java.lang.String authTokenType) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.os.Bundle confirmCredentials(@org.jetbrains.annotations.Nullable
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.Nullable
    android.accounts.Account account, @org.jetbrains.annotations.Nullable
    android.os.Bundle options) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.os.Bundle updateCredentials(@org.jetbrains.annotations.Nullable
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.Nullable
    android.accounts.Account account, @org.jetbrains.annotations.Nullable
    java.lang.String authTokenType, @org.jetbrains.annotations.Nullable
    android.os.Bundle options) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.os.Bundle getAuthToken(@org.jetbrains.annotations.Nullable
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.Nullable
    android.accounts.Account account, @org.jetbrains.annotations.Nullable
    java.lang.String authTokenType, @org.jetbrains.annotations.Nullable
    android.os.Bundle options) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.os.Bundle hasFeatures(@org.jetbrains.annotations.Nullable
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.Nullable
    android.accounts.Account account, @org.jetbrains.annotations.Nullable
    java.lang.String[] features) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.os.Bundle editProperties(@org.jetbrains.annotations.Nullable
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.Nullable
    java.lang.String accountType) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.os.Bundle addAccount(@org.jetbrains.annotations.Nullable
    android.accounts.AccountAuthenticatorResponse response, @org.jetbrains.annotations.Nullable
    java.lang.String accountType, @org.jetbrains.annotations.Nullable
    java.lang.String authTokenType, @org.jetbrains.annotations.Nullable
    java.lang.String[] requiredFeatures, @org.jetbrains.annotations.Nullable
    android.os.Bundle options) {
        return null;
    }
}