package org.linphone.activities.assistant;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0012\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0016J(\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/linphone/activities/assistant/AssistantActivity;", "Lorg/linphone/activities/GenericActivity;", "Lorg/linphone/activities/SnackBarActivity;", "()V", "coordinator", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "sharedViewModel", "Lorg/linphone/activities/assistant/viewmodels/SharedAssistantViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showSnackBar", "resourceId", "", "action", "listener", "Lkotlin/Function0;", "message", "", "app_debug"})
public final class AssistantActivity extends org.linphone.activities.GenericActivity implements org.linphone.activities.SnackBarActivity {
    private org.linphone.activities.assistant.viewmodels.SharedAssistantViewModel sharedViewModel;
    private androidx.coordinatorlayout.widget.CoordinatorLayout coordinator;
    
    public AssistantActivity() {
        super();
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void showSnackBar(@androidx.annotation.StringRes
    int resourceId) {
    }
    
    @java.lang.Override
    public void showSnackBar(@androidx.annotation.StringRes
    int resourceId, int action, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> listener) {
    }
    
    @java.lang.Override
    public void showSnackBar(@org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
}