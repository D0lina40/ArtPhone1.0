package org.linphone.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u00f4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u0002:\u0002\u0094\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fJ\u000e\u0010g\u001a\u00020d2\u0006\u0010h\u001a\u00020iJ\u0016\u0010j\u001a\u00020d2\u0006\u0010h\u001a\u00020i2\u0006\u0010k\u001a\u00020\nJ\u000e\u0010l\u001a\u00020d2\u0006\u0010m\u001a\u00020nJ\b\u0010o\u001a\u00020dH\u0002J\b\u0010p\u001a\u00020dH\u0002J\u0006\u0010q\u001a\u00020dJ\u000e\u0010r\u001a\u00020d2\u0006\u0010h\u001a\u00020iJ\u0006\u0010s\u001a\u00020\nJ\u0010\u0010t\u001a\u00020d2\u0006\u0010u\u001a\u00020vH\u0002J\u0010\u0010w\u001a\u00020d2\u0006\u0010u\u001a\u00020vH\u0002J\u0006\u0010x\u001a\u00020dJ\u0006\u0010y\u001a\u00020dJ\b\u0010z\u001a\u00020dH\u0002J\u000e\u0010{\u001a\u00020d2\u0006\u0010|\u001a\u00020\nJ\u0006\u0010}\u001a\u00020dJ\u0006\u0010~\u001a\u00020dJ\u0006\u0010\u007f\u001a\u00020dJ\u0007\u0010\u0080\u0001\u001a\u00020dJ\t\u0010\u0081\u0001\u001a\u00020dH\u0002J\t\u0010\u0082\u0001\u001a\u00020dH\u0002J\u0007\u0010\u0083\u0001\u001a\u00020dJ\u0007\u0010\u0084\u0001\u001a\u00020\nJ\u0007\u0010\u0085\u0001\u001a\u00020dJ\u0010\u0010\u0086\u0001\u001a\u00020d2\u0007\u0010\u0087\u0001\u001a\u00020\u0013J8\u0010\u0086\u0001\u001a\u00020d2\b\u0010\u0088\u0001\u001a\u00030\u0089\u00012\f\b\u0002\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u008b\u00012\t\b\u0002\u0010\u008c\u0001\u001a\u00020\n2\f\b\u0002\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u0089\u0001J\u0007\u0010\u008e\u0001\u001a\u00020dJ\u0007\u0010\u008f\u0001\u001a\u00020dJ\u000f\u0010\u0090\u0001\u001a\u00020d2\u0006\u0010h\u001a\u00020iJ\u0010\u0010\u0091\u0001\u001a\u00020\n2\u0007\u0010\u0092\u0001\u001a\u00020\u0013J\u000f\u0010\u0093\u0001\u001a\u00020d2\u0006\u0010h\u001a\u00020iR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\'\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001c0\u001b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010&\u001a\u00020\'8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b(\u0010)R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u00101\u001a\u000202\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u00105\u001a\u000206\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0014\u00109\u001a\u00020:8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b;\u0010<R\u000e\u0010=\u001a\u00020>X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010?\u001a\n A*\u0004\u0018\u00010@0@X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010D\u001a\u00020E8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bH\u0010\u0017\u001a\u0004\bF\u0010GR\u000e\u0010I\u001a\u00020JX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020JX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010P\u001a\u00020JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020JX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010R\"\u0004\bW\u0010TR\u001b\u0010X\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\bZ\u0010\u0017\u001a\u0004\bY\u0010\u0015R\u001a\u0010[\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020\u000f8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\ba\u0010b\u00a8\u0006\u0095\u0001"}, d2 = {"Lorg/linphone/core/CoreContext;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "context", "Landroid/content/Context;", "coreConfig", "Lorg/linphone/core/Config;", "service", "Lorg/linphone/core/CoreService;", "useAutoStartDescription", "", "(Landroid/content/Context;Lorg/linphone/core/Config;Lorg/linphone/core/CoreService;Z)V", "_lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "_viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "activityMonitor", "Lorg/linphone/utils/ActivityMonitor;", "appVersion", "", "getAppVersion", "()Ljava/lang/String;", "appVersion$delegate", "Lkotlin/Lazy;", "audioDeviceCallback", "Landroid/media/AudioDeviceCallback;", "callErrorMessageResourceId", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "getCallErrorMessageResourceId", "()Landroidx/lifecycle/MutableLiveData;", "callErrorMessageResourceId$delegate", "callOverlay", "Landroid/view/View;", "collator", "Ljava/text/Collator;", "contactLoader", "Lorg/linphone/contact/ContactLoader;", "contactsManager", "Lorg/linphone/contact/ContactsManager;", "getContactsManager", "()Lorg/linphone/contact/ContactsManager;", "contactsManager$delegate", "getContext", "()Landroid/content/Context;", "core", "Lorg/linphone/core/Core;", "getCore", "()Lorg/linphone/core/Core;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "listener", "Lorg/linphone/core/CoreListenerStub;", "loggingService", "Lorg/linphone/core/LoggingService;", "kotlin.jvm.PlatformType", "loggingServiceListener", "Lorg/linphone/core/LoggingServiceListenerStub;", "notificationsManager", "Lorg/linphone/notifications/NotificationsManager;", "getNotificationsManager", "()Lorg/linphone/notifications/NotificationsManager;", "notificationsManager$delegate", "overlayX", "", "overlayY", "phoneStateListener", "Lorg/linphone/compatibility/PhoneStateInterface;", "previousCallState", "Lorg/linphone/core/Call$State;", "screenHeight", "getScreenHeight", "()F", "setScreenHeight", "(F)V", "screenWidth", "getScreenWidth", "setScreenWidth", "sdkVersion", "getSdkVersion", "sdkVersion$delegate", "stopped", "getStopped", "()Z", "setStopped", "(Z)V", "viewModelStore", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "addContentToMediaStore", "", "content", "Lorg/linphone/core/Content;", "answerCall", "call", "Lorg/linphone/core/Call;", "answerCallVideoUpdateRequest", "accept", "checkIfForegroundServiceNotificationCanBeRemovedAfterDelay", "delayInMs", "", "computeUserAgent", "configureCore", "createCallOverlay", "declineCall", "declineCallDueToGsmActiveCall", "exportFileInMessage", "message", "Lorg/linphone/core/ChatMessage;", "exportFilesInMessageToMediaStore", "fetchContacts", "initPhoneStateListener", "initUserCertificates", "newAccountConfigured", "isLinphoneAccount", "onBackground", "onCallOverlayClick", "onCallStarted", "onForeground", "onIncomingReceived", "onOutgoingStarted", "removeCallOverlay", "showSwitchCameraButton", "start", "startCall", "to", "address", "Lorg/linphone/core/Address;", "callParams", "Lorg/linphone/core/CallParams;", "forceZRTP", "localAddress", "stop", "switchCamera", "terminateCall", "transferCallTo", "addressToCall", "videoUpdateRequestTimedOut", "Companion", "app_debug"})
public final class CoreContext implements androidx.lifecycle.LifecycleOwner, androidx.lifecycle.ViewModelStoreOwner {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleRegistry _lifecycleRegistry = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.ViewModelStore _viewModelStore = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.contact.ContactLoader contactLoader = null;
    @org.jetbrains.annotations.NotNull
    private final java.text.Collator collator = null;
    private boolean stopped = false;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Core core = null;
    @org.jetbrains.annotations.NotNull
    private final android.os.Handler handler = null;
    private float screenWidth = 0.0F;
    private float screenHeight = 0.0F;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy appVersion$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy sdkVersion$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy contactsManager$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy notificationsManager$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy callErrorMessageResourceId$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private final org.linphone.core.LoggingService loggingService = null;
    private float overlayX = 0.0F;
    private float overlayY = 0.0F;
    @org.jetbrains.annotations.Nullable
    private android.view.View callOverlay;
    @org.jetbrains.annotations.NotNull
    private org.linphone.core.Call.State previousCallState = org.linphone.core.Call.State.Idle;
    private org.linphone.compatibility.PhoneStateInterface phoneStateListener;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.utils.ActivityMonitor activityMonitor = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.LoggingServiceListenerStub loggingServiceListener = null;
    @org.jetbrains.annotations.NotNull
    private final android.media.AudioDeviceCallback audioDeviceCallback = null;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TRANSFORMATION = "AES/GCM/NoPadding";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ANDROID_KEY_STORE = "AndroidKeyStore";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String ALIAS = "vfs";
    private static final int LINPHONE_VFS_ENCRYPTION_AES256GCM128_SHA256 = 2;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String VFS_IV = "vfsiv";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String VFS_KEY = "vfskey";
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.core.CoreContext.Companion Companion = null;
    
    public CoreContext(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    org.linphone.core.Config coreConfig, @org.jetbrains.annotations.Nullable
    org.linphone.core.CoreService service, boolean useAutoStartDescription) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context getContext() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.Lifecycle getLifecycle() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.lifecycle.ViewModelStore getViewModelStore() {
        return null;
    }
    
    public final boolean getStopped() {
        return false;
    }
    
    public final void setStopped(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Core getCore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.os.Handler getHandler() {
        return null;
    }
    
    public final float getScreenWidth() {
        return 0.0F;
    }
    
    public final void setScreenWidth(float p0) {
    }
    
    public final float getScreenHeight() {
        return 0.0F;
    }
    
    public final void setScreenHeight(float p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAppVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSdkVersion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.contact.ContactsManager getContactsManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.notifications.NotificationsManager getNotificationsManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getCallErrorMessageResourceId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CoroutineScope getCoroutineScope() {
        return null;
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final void onForeground() {
    }
    
    public final void onBackground() {
    }
    
    private final void configureCore() {
    }
    
    private final void computeUserAgent() {
    }
    
    private final void initUserCertificates() {
    }
    
    public final void fetchContacts() {
    }
    
    public final void newAccountConfigured(boolean isLinphoneAccount) {
    }
    
    public final void initPhoneStateListener() {
    }
    
    public final boolean declineCallDueToGsmActiveCall() {
        return false;
    }
    
    public final void videoUpdateRequestTimedOut(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call) {
    }
    
    public final void answerCallVideoUpdateRequest(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call, boolean accept) {
    }
    
    public final void answerCall(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call) {
    }
    
    public final void declineCall(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call) {
    }
    
    public final void terminateCall(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call) {
    }
    
    public final boolean transferCallTo(@org.jetbrains.annotations.NotNull
    java.lang.String addressToCall) {
        return false;
    }
    
    public final void startCall(@org.jetbrains.annotations.NotNull
    java.lang.String to) {
    }
    
    public final void startCall(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address address, @org.jetbrains.annotations.Nullable
    org.linphone.core.CallParams callParams, boolean forceZRTP, @org.jetbrains.annotations.Nullable
    org.linphone.core.Address localAddress) {
    }
    
    public final void switchCamera() {
    }
    
    public final boolean showSwitchCameraButton() {
        return false;
    }
    
    public final void createCallOverlay() {
    }
    
    public final void onCallOverlayClick() {
    }
    
    public final void removeCallOverlay() {
    }
    
    private final void exportFileInMessage(org.linphone.core.ChatMessage message) {
    }
    
    private final void exportFilesInMessageToMediaStore(org.linphone.core.ChatMessage message) {
    }
    
    public final void addContentToMediaStore(@org.jetbrains.annotations.NotNull
    org.linphone.core.Content content) {
    }
    
    public final void checkIfForegroundServiceNotificationCanBeRemovedAfterDelay(long delayInMs) {
    }
    
    private final void onIncomingReceived() {
    }
    
    private final void onOutgoingStarted() {
    }
    
    public final void onCallStarted() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\u001e\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00122\u0006\u0010\u0015\u001a\u00020\u0004J\b\u0010\u0016\u001a\u00020\fH\u0002J\u0006\u0010\u0017\u001a\u00020\u0004J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/linphone/core/CoreContext$Companion;", "", "()V", "ALIAS", "", "ANDROID_KEY_STORE", "LINPHONE_VFS_ENCRYPTION_AES256GCM128_SHA256", "", "TRANSFORMATION", "VFS_IV", "VFS_KEY", "activateVFS", "", "decryptData", "encrypted", "encryptionIv", "", "encryptData", "Landroid/util/Pair;", "textToEncrypt", "encryptToken", "string_to_encrypt", "generateSecretKey", "generateToken", "getSecretKey", "Ljavax/crypto/SecretKey;", "getVfsKey", "sharedPreferences", "Landroid/content/SharedPreferences;", "sha512", "input", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        private final void generateSecretKey() throws java.lang.Exception {
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        private final javax.crypto.SecretKey getSecretKey() throws java.lang.Exception {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.NotNull
        public final java.lang.String generateToken() throws java.lang.Exception {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        private final android.util.Pair<byte[], byte[]> encryptData(java.lang.String textToEncrypt) {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        private final java.lang.String decryptData(java.lang.String encrypted, byte[] encryptionIv) throws java.lang.Exception {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.NotNull
        public final android.util.Pair<java.lang.String, java.lang.String> encryptToken(@org.jetbrains.annotations.NotNull
        java.lang.String string_to_encrypt) {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.NotNull
        public final java.lang.String sha512(@org.jetbrains.annotations.NotNull
        java.lang.String input) throws java.lang.Exception {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getVfsKey(@org.jetbrains.annotations.NotNull
        android.content.SharedPreferences sharedPreferences) throws java.lang.Exception {
            return null;
        }
        
        public final void activateVFS() {
        }
    }
}