package org.linphone.ui.login;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\u0012\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/linphone/ui/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lorg/linphone/databinding/ActivityLoginBinding;", "loginViewModel", "Lorg/linphone/ui/login/LoginViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showLoginFailed", "errorString", "", "updateUiWithUser", "model", "Lorg/linphone/ui/login/LoggedInUserView;", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private org.linphone.ui.login.LoginViewModel loginViewModel;
    private org.linphone.databinding.ActivityLoginBinding binding;
    
    public LoginActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateUiWithUser(org.linphone.ui.login.LoggedInUserView model) {
    }
    
    private final void showLoginFailed(@androidx.annotation.StringRes
    int errorString) {
    }
}