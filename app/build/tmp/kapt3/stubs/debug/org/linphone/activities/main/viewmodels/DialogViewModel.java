package org.linphone.activities.main.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b;\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010R\u001a\u00020\"J\u0006\u0010S\u001a\u00020\"J\u0006\u0010T\u001a\u00020\"J\u0006\u0010U\u001a\u00020\"J\u001a\u0010V\u001a\u00020\"2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0!J$\u0010V\u001a\u00020\"2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0!2\b\b\u0002\u0010X\u001a\u00020\u0003J\"\u0010Y\u001a\u00020\"2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0!2\u0006\u0010X\u001a\u00020\u0003J$\u0010[\u001a\u00020\"2\u0012\u0010\\\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0!2\b\b\u0002\u0010X\u001a\u00020\u0003R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010%\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\b\"\u0004\b\'\u0010\nR\u001a\u0010(\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\b\"\u0004\b*\u0010\nR\u001a\u0010+\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\b\"\u0004\b-\u0010\nR\u001a\u0010.\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\u001a\u00106\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00100\"\u0004\b8\u00102R\u001a\u00109\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00100\"\u0004\b;\u00102R\u001a\u0010<\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00100\"\u0004\b>\u00102R\u001a\u0010?\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u00100\"\u0004\bA\u00102R\u001a\u0010B\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u00100\"\u0004\bD\u00102R\u001a\u0010E\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u00100\"\u0004\bG\u00102R\u001a\u0010H\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u00100\"\u0004\bJ\u00102R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010\bR\u001a\u0010L\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\b\"\u0004\bN\u0010\nR\u001a\u0010O\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\b\"\u0004\bQ\u0010\n\u00a8\u0006]"}, d2 = {"Lorg/linphone/activities/main/viewmodels/DialogViewModel;", "Landroidx/lifecycle/ViewModel;", "message", "", "title", "(Ljava/lang/String;Ljava/lang/String;)V", "cancelLabel", "getCancelLabel", "()Ljava/lang/String;", "setCancelLabel", "(Ljava/lang/String;)V", "deleteLabel", "getDeleteLabel", "setDeleteLabel", "dismissEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getDismissEvent", "()Landroidx/lifecycle/MutableLiveData;", "doNotAskAgain", "getDoNotAskAgain", "iconResource", "", "getIconResource", "()I", "setIconResource", "(I)V", "getMessage", "okLabel", "getOkLabel", "setOkLabel", "onCancel", "Lkotlin/Function1;", "", "onDelete", "onOk", "password", "getPassword", "setPassword", "passwordSubtitle", "getPasswordSubtitle", "setPasswordSubtitle", "passwordTitle", "getPasswordTitle", "setPasswordTitle", "showCancel", "getShowCancel", "()Z", "setShowCancel", "(Z)V", "showDelete", "getShowDelete", "setShowDelete", "showDoNotAskAgain", "getShowDoNotAskAgain", "setShowDoNotAskAgain", "showIcon", "getShowIcon", "setShowIcon", "showOk", "getShowOk", "setShowOk", "showPassword", "getShowPassword", "setShowPassword", "showSubscribeLinphoneOrgLink", "getShowSubscribeLinphoneOrgLink", "setShowSubscribeLinphoneOrgLink", "showTitle", "getShowTitle", "setShowTitle", "showZrtp", "getShowZrtp", "setShowZrtp", "getTitle", "zrtpListenSas", "getZrtpListenSas", "setZrtpListenSas", "zrtpReadSas", "getZrtpReadSas", "setZrtpReadSas", "dismiss", "onCancelClicked", "onDeleteClicked", "onOkClicked", "showCancelButton", "cancel", "label", "showDeleteButton", "delete", "showOkButton", "ok", "app_debug"})
public final class DialogViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    private boolean showDoNotAskAgain = false;
    private boolean showZrtp = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String zrtpReadSas = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String zrtpListenSas = "";
    private boolean showTitle = false;
    private boolean showIcon = false;
    private int iconResource = 0;
    private boolean showSubscribeLinphoneOrgLink = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> doNotAskAgain = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> dismissEvent = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String password = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String passwordTitle = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String passwordSubtitle = "";
    private boolean showPassword = false;
    private boolean showCancel = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String cancelLabel;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onCancel;
    private boolean showDelete = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String deleteLabel;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onDelete;
    private boolean showOk = false;
    @org.jetbrains.annotations.NotNull
    private java.lang.String okLabel;
    @org.jetbrains.annotations.NotNull
    private kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onOk;
    
    public DialogViewModel(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    java.lang.String title) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final boolean getShowDoNotAskAgain() {
        return false;
    }
    
    public final void setShowDoNotAskAgain(boolean p0) {
    }
    
    public final boolean getShowZrtp() {
        return false;
    }
    
    public final void setShowZrtp(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getZrtpReadSas() {
        return null;
    }
    
    public final void setZrtpReadSas(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getZrtpListenSas() {
        return null;
    }
    
    public final void setZrtpListenSas(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getShowTitle() {
        return false;
    }
    
    public final void setShowTitle(boolean p0) {
    }
    
    public final boolean getShowIcon() {
        return false;
    }
    
    public final void setShowIcon(boolean p0) {
    }
    
    public final int getIconResource() {
        return 0;
    }
    
    public final void setIconResource(int p0) {
    }
    
    public final boolean getShowSubscribeLinphoneOrgLink() {
        return false;
    }
    
    public final void setShowSubscribeLinphoneOrgLink(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDoNotAskAgain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getDismissEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPasswordTitle() {
        return null;
    }
    
    public final void setPasswordTitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPasswordSubtitle() {
        return null;
    }
    
    public final void setPasswordSubtitle(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getShowPassword() {
        return false;
    }
    
    public final void setShowPassword(boolean p0) {
    }
    
    public final boolean getShowCancel() {
        return false;
    }
    
    public final void setShowCancel(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCancelLabel() {
        return null;
    }
    
    public final void setCancelLabel(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void showCancelButton(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> cancel) {
    }
    
    public final void showCancelButton(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> cancel, @org.jetbrains.annotations.NotNull
    java.lang.String label) {
    }
    
    public final void onCancelClicked() {
    }
    
    public final boolean getShowDelete() {
        return false;
    }
    
    public final void setShowDelete(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeleteLabel() {
        return null;
    }
    
    public final void setDeleteLabel(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void showDeleteButton(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> delete, @org.jetbrains.annotations.NotNull
    java.lang.String label) {
    }
    
    public final void onDeleteClicked() {
    }
    
    public final boolean getShowOk() {
        return false;
    }
    
    public final void setShowOk(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOkLabel() {
        return null;
    }
    
    public final void setOkLabel(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void showOkButton(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> ok, @org.jetbrains.annotations.NotNull
    java.lang.String label) {
    }
    
    public final void onOkClicked() {
    }
    
    public final void dismiss() {
    }
}