package org.linphone.activities.voip.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0006\u0010\u001e\u001a\u00020\u0005J\b\u0010\u001f\u001a\u00020\u0005H\u0002J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0015J\u0006\u0010\"\u001a\u00020\u001dJ\u0012\u0010#\u001a\u00020\u001d2\b\u0010$\u001a\u0004\u0018\u00010%H\u0002R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006&"}, d2 = {"Lorg/linphone/activities/voip/data/ConferenceParticipantDeviceData;", "Lorg/linphone/contact/GenericContactData;", "participantDevice", "Lorg/linphone/core/ParticipantDevice;", "isMe", "", "(Lorg/linphone/core/ParticipantDevice;Z)V", "isActiveSpeaker", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "isInConference", "isJoining", "()Z", "isMuted", "isSendingVideo", "isSpeaking", "listener", "Lorg/linphone/core/ParticipantDeviceListenerStub;", "getParticipantDevice", "()Lorg/linphone/core/ParticipantDevice;", "textureView", "Landroid/view/TextureView;", "videoAvailable", "getVideoAvailable", "videoEnabled", "Landroidx/lifecycle/MediatorLiveData;", "getVideoEnabled", "()Landroidx/lifecycle/MediatorLiveData;", "destroy", "", "isSwitchCameraAvailable", "isVideoAvailableAndSendReceive", "setTextureView", "tv", "switchCamera", "updateWindowId", "windowId", "", "app_debug"})
public final class ConferenceParticipantDeviceData extends org.linphone.contact.GenericContactData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ParticipantDevice participantDevice = null;
    private final boolean isMe = false;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> videoEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> videoAvailable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSendingVideo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSpeaking = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMuted = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isInConference = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isJoining = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isActiveSpeaker = null;
    @org.jetbrains.annotations.Nullable
    private android.view.TextureView textureView;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.ParticipantDeviceListenerStub listener = null;
    
    public ConferenceParticipantDeviceData(@org.jetbrains.annotations.NotNull
    org.linphone.core.ParticipantDevice participantDevice, boolean isMe) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.ParticipantDevice getParticipantDevice() {
        return null;
    }
    
    public final boolean isMe() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getVideoEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getVideoAvailable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSendingVideo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSpeaking() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMuted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isInConference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isJoining() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isActiveSpeaker() {
        return null;
    }
    
    @java.lang.Override
    public void destroy() {
    }
    
    public final void switchCamera() {
    }
    
    public final boolean isSwitchCameraAvailable() {
        return false;
    }
    
    public final void setTextureView(@org.jetbrains.annotations.NotNull
    android.view.TextureView tv) {
    }
    
    private final void updateWindowId(java.lang.Object windowId) {
    }
    
    private final boolean isVideoAvailableAndSendReceive() {
        return false;
    }
}