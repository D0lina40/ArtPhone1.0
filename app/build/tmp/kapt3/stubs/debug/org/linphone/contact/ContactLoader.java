package org.linphone.contact;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J \u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016J\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/linphone/contact/ContactLoader;", "Landroidx/loader/app/LoaderManager$LoaderCallbacks;", "Landroid/database/Cursor;", "()V", "onCreateLoader", "Landroidx/loader/content/Loader;", "id", "", "args", "Landroid/os/Bundle;", "onLoadFinished", "", "loader", "cursor", "onLoaderReset", "Companion", "app_debug"})
public final class ContactLoader implements androidx.loader.app.LoaderManager.LoaderCallbacks<android.database.Cursor> {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String[] projection = {"contact_id", "display_name", "mimetype", "starred", "lookup", "data1", "data2", "data3", "data4"};
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.contact.ContactLoader.Companion Companion = null;
    
    public ContactLoader() {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.loader.content.Loader<android.database.Cursor> onCreateLoader(int id, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
        return null;
    }
    
    @java.lang.Override
    public void onLoadFinished(@org.jetbrains.annotations.NotNull
    androidx.loader.content.Loader<android.database.Cursor> loader, @org.jetbrains.annotations.Nullable
    android.database.Cursor cursor) {
    }
    
    @java.lang.Override
    public void onLoaderReset(@org.jetbrains.annotations.NotNull
    androidx.loader.content.Loader<android.database.Cursor> loader) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lorg/linphone/contact/ContactLoader$Companion;", "", "()V", "projection", "", "", "getProjection", "()[Ljava/lang/String;", "[Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String[] getProjection() {
            return null;
        }
    }
}