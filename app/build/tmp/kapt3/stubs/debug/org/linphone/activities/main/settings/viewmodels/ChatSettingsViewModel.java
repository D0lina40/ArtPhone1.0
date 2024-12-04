package org.linphone.activities.main.settings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010F\u001a\u00020GH\u0002J\u0010\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u0005H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0007R\u0011\u0010\u0017\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u001b\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0007R\u0011\u0010\u001f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000fR\u001d\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\"0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0007R\u0011\u0010$\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000fR\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0007R\u0011\u0010(\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u000fR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0007R\u0011\u0010,\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u000fR\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0007R\u0011\u00100\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000fR\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u0007R\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\"0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u0007R\u0011\u00106\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u000fR\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0007R\u0011\u0010:\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000fR\'\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\"0\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b=\u0010\u0007R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\u0007R\u0011\u0010B\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u0010\u000fR\u0017\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\u0007\u00a8\u0006J"}, d2 = {"Lorg/linphone/activities/main/settings/viewmodels/ChatSettingsViewModel;", "Lorg/linphone/activities/main/settings/viewmodels/GenericSettingsViewModel;", "()V", "autoDownloadIndex", "Landroidx/lifecycle/MutableLiveData;", "", "getAutoDownloadIndex", "()Landroidx/lifecycle/MutableLiveData;", "autoDownloadLabels", "Ljava/util/ArrayList;", "", "getAutoDownloadLabels", "autoDownloadListener", "Lorg/linphone/activities/main/settings/SettingListenerStub;", "getAutoDownloadListener", "()Lorg/linphone/activities/main/settings/SettingListenerStub;", "autoDownloadMaxSize", "getAutoDownloadMaxSize", "autoDownloadMaxSizeListener", "getAutoDownloadMaxSizeListener", "autoDownloadVoiceRecordings", "", "getAutoDownloadVoiceRecordings", "autoDownloadVoiceRecordingsListener", "getAutoDownloadVoiceRecordingsListener", "downloadedMediaPublic", "getDownloadedMediaPublic", "downloadedMediaPublicListener", "getDownloadedMediaPublicListener", "fileSharingUrl", "getFileSharingUrl", "fileSharingUrlListener", "getFileSharingUrlListener", "goToAndroidNotificationSettingsEvent", "Lorg/linphone/utils/Event;", "getGoToAndroidNotificationSettingsEvent", "goToAndroidNotificationSettingsListener", "getGoToAndroidNotificationSettingsListener", "hideEmptyRooms", "getHideEmptyRooms", "hideEmptyRoomsListener", "getHideEmptyRoomsListener", "hideNotificationContent", "getHideNotificationContent", "hideNotificationContentListener", "getHideNotificationContentListener", "hideRoomsRemovedProxies", "getHideRoomsRemovedProxies", "hideRoomsRemovedProxiesListener", "getHideRoomsRemovedProxiesListener", "launcherShortcuts", "getLauncherShortcuts", "launcherShortcutsEvent", "getLauncherShortcutsEvent", "launcherShortcutsListener", "getLauncherShortcutsListener", "markAsReadNotifDismissal", "getMarkAsReadNotifDismissal", "markAsReadNotifDismissalListener", "getMarkAsReadNotifDismissalListener", "reloadChatRoomsEvent", "getReloadChatRoomsEvent", "reloadChatRoomsEvent$delegate", "Lkotlin/Lazy;", "useInAppFileViewer", "getUseInAppFileViewer", "useInAppFileViewerListener", "getUseInAppFileViewerListener", "vfs", "getVfs", "initAutoDownloadList", "", "updateAutoDownloadIndexFromMaxSize", "maxSize", "app_debug"})
public final class ChatSettingsViewModel extends org.linphone.activities.main.settings.viewmodels.GenericSettingsViewModel {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub markAsReadNotifDismissalListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> markAsReadNotifDismissal = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub fileSharingUrlListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> fileSharingUrl = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub autoDownloadListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> autoDownloadIndex = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> autoDownloadLabels = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub autoDownloadMaxSizeListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> autoDownloadMaxSize = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub autoDownloadVoiceRecordingsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> autoDownloadVoiceRecordings = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub downloadedMediaPublicListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> downloadedMediaPublic = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub hideNotificationContentListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideNotificationContent = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub useInAppFileViewerListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> useInAppFileViewer = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub launcherShortcutsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> launcherShortcuts = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> launcherShortcutsEvent = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub hideEmptyRoomsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideEmptyRooms = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub hideRoomsRemovedProxiesListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> hideRoomsRemovedProxies = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.settings.SettingListenerStub goToAndroidNotificationSettingsListener = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> goToAndroidNotificationSettingsEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> vfs = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy reloadChatRoomsEvent$delegate = null;
    
    public ChatSettingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getMarkAsReadNotifDismissalListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getMarkAsReadNotifDismissal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getFileSharingUrlListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getFileSharingUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAutoDownloadListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getAutoDownloadIndex() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> getAutoDownloadLabels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAutoDownloadMaxSizeListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getAutoDownloadMaxSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getAutoDownloadVoiceRecordingsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getAutoDownloadVoiceRecordings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getDownloadedMediaPublicListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getDownloadedMediaPublic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getHideNotificationContentListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideNotificationContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getUseInAppFileViewerListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getUseInAppFileViewer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getLauncherShortcutsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLauncherShortcuts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getLauncherShortcutsEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getHideEmptyRoomsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideEmptyRooms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getHideRoomsRemovedProxiesListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getHideRoomsRemovedProxies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.activities.main.settings.SettingListenerStub getGoToAndroidNotificationSettingsListener() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getGoToAndroidNotificationSettingsEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getVfs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getReloadChatRoomsEvent() {
        return null;
    }
    
    private final void initAutoDownloadList() {
    }
    
    private final void updateAutoDownloadIndexFromMaxSize(int maxSize) {
    }
}