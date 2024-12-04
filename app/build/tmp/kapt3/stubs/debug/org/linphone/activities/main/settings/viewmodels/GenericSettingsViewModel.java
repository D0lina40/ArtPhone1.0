package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/GenericSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "core", "Lorg/linphone/core/Core;", "getCore", "()Lorg/linphone/core/Core;", "prefs", "Lorg/linphone/core/CorePreferences;", "getPrefs", "()Lorg/linphone/core/CorePreferences;", "app_debug"})
public abstract class GenericSettingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CorePreferences prefs = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Core core = null;
    
    public GenericSettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.linphone.core.CorePreferences getPrefs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.linphone.core.Core getCore() {
        return null;
    }
}