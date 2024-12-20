package org.linphone.activities;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lorg/linphone/activities/SnackBarActivity;", "", "showSnackBar", "", "resourceId", "", "action", "listener", "Lkotlin/Function0;", "message", "", "app_debug"})
public abstract interface SnackBarActivity {
    
    public abstract void showSnackBar(@androidx.annotation.StringRes
    int resourceId);
    
    public abstract void showSnackBar(@androidx.annotation.StringRes
    int resourceId, int action, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> listener);
    
    public abstract void showSnackBar(@org.jetbrains.annotations.NotNull
    java.lang.String message);
}