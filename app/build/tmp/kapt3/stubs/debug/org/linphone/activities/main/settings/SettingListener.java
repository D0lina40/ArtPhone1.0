package org.linphone.activities.main.settings;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lorg/linphone/activities/main/settings/SettingListener;", "", "onAccountClicked", "", "identity", "", "onBoolValueChanged", "newValue", "", "onClicked", "onListValueChanged", "position", "", "onTextValueChanged", "app_debug"})
public abstract interface SettingListener {
    
    public abstract void onClicked();
    
    public abstract void onAccountClicked(@org.jetbrains.annotations.NotNull
    java.lang.String identity);
    
    public abstract void onTextValueChanged(@org.jetbrains.annotations.NotNull
    java.lang.String newValue);
    
    public abstract void onBoolValueChanged(boolean newValue);
    
    public abstract void onListValueChanged(int position);
}