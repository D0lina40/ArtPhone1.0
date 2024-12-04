package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J:\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016\u00a8\u0006\u0013"}, d2 = {"Lorg/linphone/contact/DummySyncAdapter;", "Landroid/content/AbstractThreadedSyncAdapter;", "context", "Landroid/content/Context;", "autoInit", "", "(Landroid/content/Context;Z)V", "onPerformSync", "", "account", "Landroid/accounts/Account;", "extras", "Landroid/os/Bundle;", "authority", "", "provider", "Landroid/content/ContentProviderClient;", "syncResult", "Landroid/content/SyncResult;", "app_debug"})
public final class DummySyncAdapter extends android.content.AbstractThreadedSyncAdapter {
    
    public DummySyncAdapter(@org.jetbrains.annotations.NotNull
    android.content.Context context, boolean autoInit) {
        super(null, false);
    }
    
    @java.lang.Override
    public void onPerformSync(@org.jetbrains.annotations.Nullable
    android.accounts.Account account, @org.jetbrains.annotations.Nullable
    android.os.Bundle extras, @org.jetbrains.annotations.Nullable
    java.lang.String authority, @org.jetbrains.annotations.Nullable
    android.content.ContentProviderClient provider, @org.jetbrains.annotations.Nullable
    android.content.SyncResult syncResult) {
    }
}