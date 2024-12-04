package org.linphone.notifications;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u00b6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\b\u0003\u0018\u0000 v2\u00020\u0001:\u0001vB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007J\u0016\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J(\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020,2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002J0\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\b2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010(\u001a\u00020\u00072\u0006\u0010;\u001a\u00020<H\u0002J\u0014\u0010=\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010>\u001a\u00020.H\u0002J\u0006\u0010?\u001a\u00020\'J\u0010\u0010@\u001a\u00020\'2\u0006\u0010A\u001a\u00020BH\u0002J\u000e\u0010C\u001a\u00020.2\u0006\u00100\u001a\u00020,J\u0006\u0010D\u001a\u00020\'J\u0018\u0010E\u001a\u00020\'2\u0006\u0010A\u001a\u00020B2\u0006\u0010F\u001a\u00020.H\u0002J\u0018\u0010G\u001a\u00020\'2\u0006\u00100\u001a\u00020,2\u0006\u00107\u001a\u00020\bH\u0002J\u0016\u0010H\u001a\u00020\'2\u0006\u0010A\u001a\u00020B2\u0006\u0010I\u001a\u00020.J\u0010\u0010J\u001a\u00020\'2\u0006\u0010K\u001a\u000203H\u0002J\u0018\u0010L\u001a\u00020\'2\u0006\u00104\u001a\u0002052\u0006\u00107\u001a\u00020\bH\u0002J\u000e\u0010M\u001a\u00020N2\u0006\u00107\u001a\u00020\bJ\u000e\u0010O\u001a\u0002092\u0006\u00107\u001a\u00020\bJ\u000e\u0010P\u001a\u00020N2\u0006\u00107\u001a\u00020\bJ\u000e\u0010Q\u001a\u0002092\u0006\u00107\u001a\u00020\bJ\u0010\u0010R\u001a\u00020N2\u0006\u00107\u001a\u00020\bH\u0002J\u0010\u0010S\u001a\u0002092\u0006\u00107\u001a\u00020\bH\u0002J\u0010\u0010T\u001a\u00020\b2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010U\u001a\u00020\b2\u0006\u00100\u001a\u00020,H\u0002J\u001a\u0010V\u001a\u00020W2\u0006\u00104\u001a\u0002052\b\u0010X\u001a\u0004\u0018\u00010YH\u0002J\u0010\u0010Z\u001a\u00020\f2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010[\u001a\u00020\f2\u0006\u0010+\u001a\u00020,H\u0002J\"\u0010\\\u001a\u00020<2\b\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010]\u001a\u00020\u00072\b\u0010^\u001a\u0004\u0018\u00010_J\u0010\u0010`\u001a\u00020N2\u0006\u00107\u001a\u00020\bH\u0002J$\u0010a\u001a\u00020\'2\u0006\u0010(\u001a\u00020\f2\u0006\u0010b\u001a\u00020%2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0007H\u0003J\u0006\u0010c\u001a\u00020\'J\u000e\u0010d\u001a\u00020\'2\u0006\u0010e\u001a\u00020\u0007J\u000e\u0010f\u001a\u00020\'2\u0006\u0010g\u001a\u00020#J\u0006\u0010h\u001a\u00020\'J\u000e\u0010i\u001a\u00020\'2\u0006\u0010j\u001a\u00020#J\u0006\u0010k\u001a\u00020\'J \u0010k\u001a\u00020\'2\u0006\u0010l\u001a\u00020\f2\u0006\u0010m\u001a\u00020%2\u0006\u0010F\u001a\u00020.H\u0002J\u0010\u0010k\u001a\u00020\'2\u0006\u0010j\u001a\u00020#H\u0002J\u0018\u0010n\u001a\u00020\'2\u0006\u0010j\u001a\u00020#2\b\b\u0002\u0010>\u001a\u00020.J\u0006\u0010o\u001a\u00020\'J\u0006\u0010p\u001a\u00020\'J\u0006\u0010q\u001a\u00020\'J-\u0010r\u001a\u00020.2\u0006\u00107\u001a\u00020\b2\u0006\u00100\u001a\u00020,2\u000e\u0010s\u001a\n\u0012\u0006\b\u0001\u0012\u0002050tH\u0002\u00a2\u0006\u0002\u0010uR*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006w"}, d2 = {"Lorg/linphone/notifications/NotificationsManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "callNotificationsMap", "Ljava/util/HashMap;", "", "Lorg/linphone/notifications/Notifiable;", "Lkotlin/collections/HashMap;", "chatBubbleNotifications", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "chatListener", "Lorg/linphone/core/ChatMessageListener;", "getChatListener", "()Lorg/linphone/core/ChatMessageListener;", "chatNotificationsMap", "currentForegroundServiceNotificationId", "currentlyDisplayedChatRoomAddress", "getCurrentlyDisplayedChatRoomAddress", "()Ljava/lang/String;", "setCurrentlyDisplayedChatRoomAddress", "(Ljava/lang/String;)V", "listener", "Lorg/linphone/core/CoreListenerStub;", "notificationManager", "Landroidx/core/app/NotificationManagerCompat;", "getNotificationManager", "()Landroidx/core/app/NotificationManagerCompat;", "notificationManager$delegate", "Lkotlin/Lazy;", "previousChatNotifications", "service", "Lorg/linphone/core/CoreService;", "serviceNotification", "Landroid/app/Notification;", "cancel", "", "id", "tag", "changeDismissNotificationUponReadForChatRoom", "chatRoom", "Lorg/linphone/core/ChatRoom;", "dismiss", "", "createChatReactionNotifiable", "room", "reaction", "from", "Lorg/linphone/core/Address;", "message", "Lorg/linphone/core/ChatMessage;", "createMessageNotification", "notifiable", "pendingIntent", "Landroid/app/PendingIntent;", "bubbleIntent", "me", "Landroidx/core/app/Person;", "createServiceNotification", "useAutoStartDescription", "destroy", "dismissCallNotification", "call", "Lorg/linphone/core/Call;", "dismissChatNotification", "dismissMissedCallNotification", "displayCallNotification", "isCallActive", "displayChatNotifiable", "displayIncomingCallNotification", "useAsForeground", "displayMissedCallNotification", "remoteAddress", "displayReplyMessageNotification", "getCallAnswerAction", "Landroidx/core/app/NotificationCompat$Action;", "getCallAnswerPendingIntent", "getCallDeclineAction", "getCallDeclinePendingIntent", "getMarkMessageAsReadAction", "getMarkMessageAsReadPendingIntent", "getNotifiableForCall", "getNotifiableForRoom", "getNotifiableMessage", "Lorg/linphone/notifications/NotifiableMessage;", "friend", "Lorg/linphone/core/Friend;", "getNotificationIdForCall", "getNotificationIdForChat", "getPerson", "displayName", "picture", "Landroid/graphics/Bitmap;", "getReplyMessageAction", "notify", "notification", "onCoreReady", "resetChatNotificationCounterForSipUri", "sipUri", "serviceCreated", "createdService", "serviceDestroyed", "startCallForeground", "coreService", "startForeground", "notificationId", "callNotification", "startForegroundToKeepAppAlive", "stopCallForeground", "stopForegroundNotification", "stopForegroundNotificationIfPossible", "updateChatNotifiableWithMessages", "messages", "", "(Lorg/linphone/notifications/Notifiable;Lorg/linphone/core/ChatRoom;[Lorg/linphone/core/ChatMessage;)Z", "Companion", "app_debug"})
public final class NotificationsManager {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHAT_NOTIFICATIONS_GROUP = "CHAT_NOTIF_GROUP";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String KEY_TEXT_REPLY = "key_text_reply";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_NOTIF_ID = "NOTIFICATION_ID";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_REPLY_NOTIF_ACTION = "org.linphone.REPLY_ACTION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_HANGUP_CALL_NOTIF_ACTION = "org.linphone.HANGUP_CALL_ACTION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_ANSWER_CALL_NOTIF_ACTION = "org.linphone.ANSWER_CALL_ACTION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_MARK_AS_READ_ACTION = "org.linphone.MARK_AS_READ_ACTION";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_LOCAL_IDENTITY = "LOCAL_IDENTITY";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String INTENT_REMOTE_ADDRESS = "REMOTE_ADDRESS";
    private static final int SERVICE_NOTIF_ID = 1;
    private static final int MISSED_CALLS_NOTIF_ID = 10;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String CHAT_TAG = "Chat";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String MISSED_CALL_TAG = "Missed call";
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy notificationManager$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.HashMap<java.lang.String, org.linphone.notifications.Notifiable> chatNotificationsMap = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.HashMap<java.lang.String, org.linphone.notifications.Notifiable> callNotificationsMap = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.Integer> previousChatNotifications = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<java.lang.Integer> chatBubbleNotifications = null;
    private int currentForegroundServiceNotificationId = 0;
    @org.jetbrains.annotations.Nullable
    private android.app.Notification serviceNotification;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.CoreService service;
    @org.jetbrains.annotations.Nullable
    private java.lang.String currentlyDisplayedChatRoomAddress;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.CoreListenerStub listener = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ChatMessageListener chatListener = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.notifications.NotificationsManager.Companion Companion = null;
    
    public NotificationsManager(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    private final androidx.core.app.NotificationManagerCompat getNotificationManager() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCurrentlyDisplayedChatRoomAddress() {
        return null;
    }
    
    public final void setCurrentlyDisplayedChatRoomAddress(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.ChatMessageListener getChatListener() {
        return null;
    }
    
    public final void onCoreReady() {
    }
    
    public final void destroy() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void notify(int id, android.app.Notification notification, java.lang.String tag) {
    }
    
    public final void cancel(int id, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
    }
    
    public final void resetChatNotificationCounterForSipUri(@org.jetbrains.annotations.NotNull
    java.lang.String sipUri) {
    }
    
    public final void startForeground() {
    }
    
    public final void startCallForeground(@org.jetbrains.annotations.NotNull
    org.linphone.core.CoreService coreService) {
    }
    
    private final void startForeground(org.linphone.core.CoreService coreService) {
    }
    
    public final void startForegroundToKeepAppAlive(@org.jetbrains.annotations.NotNull
    org.linphone.core.CoreService coreService, boolean useAutoStartDescription) {
    }
    
    private final void startForeground(int notificationId, android.app.Notification callNotification, boolean isCallActive) {
    }
    
    public final void stopForegroundNotification() {
    }
    
    public final void stopForegroundNotificationIfPossible() {
    }
    
    public final void stopCallForeground() {
    }
    
    public final void serviceCreated(@org.jetbrains.annotations.NotNull
    org.linphone.core.CoreService createdService) {
    }
    
    public final void serviceDestroyed() {
    }
    
    private final android.app.Notification createServiceNotification(boolean useAutoStartDescription) {
        return null;
    }
    
    private final int getNotificationIdForCall(org.linphone.core.Call call) {
        return 0;
    }
    
    private final org.linphone.notifications.Notifiable getNotifiableForCall(org.linphone.core.Call call) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.app.Person getPerson(@org.jetbrains.annotations.Nullable
    org.linphone.core.Friend friend, @org.jetbrains.annotations.NotNull
    java.lang.String displayName, @org.jetbrains.annotations.Nullable
    android.graphics.Bitmap picture) {
        return null;
    }
    
    public final void displayIncomingCallNotification(@org.jetbrains.annotations.NotNull
    org.linphone.core.Call call, boolean useAsForeground) {
    }
    
    private final void displayMissedCallNotification(org.linphone.core.Address remoteAddress) {
    }
    
    public final void dismissMissedCallNotification() {
    }
    
    private final void displayCallNotification(org.linphone.core.Call call, boolean isCallActive) {
    }
    
    private final void dismissCallNotification(org.linphone.core.Call call) {
    }
    
    private final int getNotificationIdForChat(org.linphone.core.ChatRoom chatRoom) {
        return 0;
    }
    
    private final void displayChatNotifiable(org.linphone.core.ChatRoom room, org.linphone.notifications.Notifiable notifiable) {
    }
    
    private final boolean updateChatNotifiableWithMessages(org.linphone.notifications.Notifiable notifiable, org.linphone.core.ChatRoom room, org.linphone.core.ChatMessage[] messages) {
        return false;
    }
    
    private final org.linphone.notifications.Notifiable createChatReactionNotifiable(org.linphone.core.ChatRoom room, java.lang.String reaction, org.linphone.core.Address from, org.linphone.core.ChatMessage message) {
        return null;
    }
    
    private final org.linphone.notifications.Notifiable getNotifiableForRoom(org.linphone.core.ChatRoom room) {
        return null;
    }
    
    private final org.linphone.notifications.NotifiableMessage getNotifiableMessage(org.linphone.core.ChatMessage message, org.linphone.core.Friend friend) {
        return null;
    }
    
    private final void displayReplyMessageNotification(org.linphone.core.ChatMessage message, org.linphone.notifications.Notifiable notifiable) {
    }
    
    public final boolean dismissChatNotification(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatRoom room) {
        return false;
    }
    
    public final void changeDismissNotificationUponReadForChatRoom(@org.jetbrains.annotations.NotNull
    org.linphone.core.ChatRoom chatRoom, boolean dismiss) {
    }
    
    private final android.app.Notification createMessageNotification(org.linphone.notifications.Notifiable notifiable, android.app.PendingIntent pendingIntent, android.app.PendingIntent bubbleIntent, java.lang.String id, androidx.core.app.Person me) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.PendingIntent getCallAnswerPendingIntent(@org.jetbrains.annotations.NotNull
    org.linphone.notifications.Notifiable notifiable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.app.NotificationCompat.Action getCallAnswerAction(@org.jetbrains.annotations.NotNull
    org.linphone.notifications.Notifiable notifiable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.app.PendingIntent getCallDeclinePendingIntent(@org.jetbrains.annotations.NotNull
    org.linphone.notifications.Notifiable notifiable) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.core.app.NotificationCompat.Action getCallDeclineAction(@org.jetbrains.annotations.NotNull
    org.linphone.notifications.Notifiable notifiable) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Action getReplyMessageAction(org.linphone.notifications.Notifiable notifiable) {
        return null;
    }
    
    private final android.app.PendingIntent getMarkMessageAsReadPendingIntent(org.linphone.notifications.Notifiable notifiable) {
        return null;
    }
    
    private final androidx.core.app.NotificationCompat.Action getMarkMessageAsReadAction(org.linphone.notifications.Notifiable notifiable) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/linphone/notifications/NotificationsManager$Companion;", "", "()V", "CHAT_NOTIFICATIONS_GROUP", "", "CHAT_TAG", "INTENT_ANSWER_CALL_NOTIF_ACTION", "INTENT_HANGUP_CALL_NOTIF_ACTION", "INTENT_LOCAL_IDENTITY", "INTENT_MARK_AS_READ_ACTION", "INTENT_NOTIF_ID", "INTENT_REMOTE_ADDRESS", "INTENT_REPLY_NOTIF_ACTION", "KEY_TEXT_REPLY", "MISSED_CALLS_NOTIF_ID", "", "MISSED_CALL_TAG", "SERVICE_NOTIF_ID", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}