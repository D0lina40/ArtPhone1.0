package org.linphone.activities.main.dialer.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0004J\u0006\u0010,\u001a\u00020\u0007J\u0006\u0010-\u001a\u00020*J\u0018\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102J\u001e\u00103\u001a\u00020*2\u0006\u0010/\u001a\u0002002\u0006\u00104\u001a\u00020\u000f2\u0006\u00105\u001a\u00020\u000fJ\b\u00106\u001a\u00020*H\u0014J\b\u00107\u001a\u00020*H\u0002J\u0006\u00108\u001a\u00020*J\u0006\u00109\u001a\u00020*J\u0006\u0010:\u001a\u00020\u0007J\u000e\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020\u0004J\u0006\u0010=\u001a\u00020*R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\tR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\tR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\tR\'\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010\tR\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lorg/linphone/activities/main/dialer/viewmodels/DialerViewModel;", "Lorg/linphone/activities/main/viewmodels/LogsUploadViewModel;", "()V", "addressWaitingNetworkToBeCalled", "", "atLeastOneCall", "Landroidx/lifecycle/MutableLiveData;", "", "getAtLeastOneCall", "()Landroidx/lifecycle/MutableLiveData;", "autoInitiateVideoCalls", "getAutoInitiateVideoCalls", "enteredUri", "getEnteredUri", "enteredUriCursorPosition", "", "hideAddContactButton", "getHideAddContactButton", "listener", "Lorg/linphone/core/CoreListenerStub;", "onKeyClick", "Lorg/linphone/activities/main/dialer/NumpadDigitListener;", "getOnKeyClick", "()Lorg/linphone/activities/main/dialer/NumpadDigitListener;", "scheduleConferenceAvailable", "getScheduleConferenceAvailable", "showPreview", "getShowPreview", "showSwitchCamera", "getShowSwitchCamera", "timeAtWitchWeTriedToCall", "", "transferVisibility", "getTransferVisibility", "updateAvailableEvent", "Lorg/linphone/utils/Event;", "getUpdateAvailableEvent", "updateAvailableEvent$delegate", "Lkotlin/Lazy;", "vibrator", "Landroid/os/Vibrator;", "directCall", "", "to", "eraseAll", "eraseLastChar", "onAfterUriChanged", "editText", "Landroid/widget/EditText;", "editable", "Landroid/text/Editable;", "onBeforeUriChanged", "count", "after", "onCleared", "setLastOutgoingCallAddress", "startCall", "switchCamera", "transferCall", "transferCallTo", "addressToCall", "updateShowVideoPreview", "app_debug"})
public final class DialerViewModel extends org.linphone.activities.main.viewmodels.LogsUploadViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> enteredUri = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> atLeastOneCall = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> transferVisibility = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showPreview = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> showSwitchCamera = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> autoInitiateVideoCalls = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> scheduleConferenceAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideAddContactButton = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy updateAvailableEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final android.os.Vibrator vibrator = null;
    @org.jetbrains.annotations.Nullable
    private java.lang.String addressWaitingNetworkToBeCalled;
    private long timeAtWitchWeTriedToCall = 0L;
    private int enteredUriCursorPosition = 0;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.dialer.NumpadDigitListener onKeyClick = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    
    public DialerViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getEnteredUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAtLeastOneCall() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getTransferVisibility() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowPreview() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getShowSwitchCamera() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAutoInitiateVideoCalls() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getScheduleConferenceAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideAddContactButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getUpdateAvailableEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.dialer.NumpadDigitListener getOnKeyClick() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void onBeforeUriChanged(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, int count, int after) {
    }
    
    public final void onAfterUriChanged(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, @org.jetbrains.annotations.Nullable
    android.text.Editable editable) {
    }
    
    public final void updateShowVideoPreview() {
    }
    
    public final void eraseLastChar() {
    }
    
    public final boolean eraseAll() {
        return false;
    }
    
    public final void directCall(@org.jetbrains.annotations.NotNull
    java.lang.String to) {
    }
    
    public final void startCall() {
    }
    
    public final boolean transferCall() {
        return false;
    }
    
    public final void transferCallTo(@org.jetbrains.annotations.NotNull
    java.lang.String addressToCall) {
    }
    
    public final void switchCamera() {
    }
    
    private final void setLastOutgoingCallAddress() {
    }
}