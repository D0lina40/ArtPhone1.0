package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/utils/AudioRouteUtils;", "", "()V", "Companion", "app_debug"})
public final class AudioRouteUtils {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.AudioRouteUtils.Companion Companion = null;
    
    public AudioRouteUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0012\u0010\u0012\u001a\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0013\u001a\u00020\u000bH\u0002J\u0006\u0010\u0014\u001a\u00020\u000bJ\u0012\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006J*\u0010\u0016\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0017\u001a\u00020\u000bH\u0002J\u001c\u0010\u0018\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000bJ\u001c\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000bJ\u001c\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000bJ\u001c\u0010\u001b\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u00a8\u0006\u001c"}, d2 = {"Lorg/linphone/utils/AudioRouteUtils$Companion;", "", "()V", "applyAudioRouteChange", "", "call", "Lorg/linphone/core/Call;", "types", "", "Lorg/linphone/core/AudioDevice$Type;", "output", "", "getAudioPlaybackDeviceIdForCallRecordingOrVoiceMessage", "", "getAudioRecordingDeviceForVoiceMessage", "Lorg/linphone/core/AudioDevice;", "isBluetoothAudioRecorderAvailable", "isBluetoothAudioRouteAvailable", "isBluetoothAudioRouteCurrentlyUsed", "isHeadsetAudioRecorderAvailable", "isHeadsetAudioRouteAvailable", "isSpeakerAudioRouteCurrentlyUsed", "routeAudioTo", "skipTelecom", "routeAudioToBluetooth", "routeAudioToEarpiece", "routeAudioToHeadset", "routeAudioToSpeaker", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        private final void applyAudioRouteChange(org.linphone.core.Call call, java.util.List<? extends org.linphone.core.AudioDevice.Type> types, boolean output) {
        }
        
        private final void routeAudioTo(org.linphone.core.Call call, java.util.List<? extends org.linphone.core.AudioDevice.Type> types, boolean skipTelecom) {
        }
        
        public final void routeAudioToEarpiece(@org.jetbrains.annotations.Nullable
        org.linphone.core.Call call, boolean skipTelecom) {
        }
        
        public final void routeAudioToSpeaker(@org.jetbrains.annotations.Nullable
        org.linphone.core.Call call, boolean skipTelecom) {
        }
        
        public final void routeAudioToBluetooth(@org.jetbrains.annotations.Nullable
        org.linphone.core.Call call, boolean skipTelecom) {
        }
        
        public final void routeAudioToHeadset(@org.jetbrains.annotations.Nullable
        org.linphone.core.Call call, boolean skipTelecom) {
        }
        
        public final boolean isSpeakerAudioRouteCurrentlyUsed(@org.jetbrains.annotations.Nullable
        org.linphone.core.Call call) {
            return false;
        }
        
        public final boolean isBluetoothAudioRouteCurrentlyUsed(@org.jetbrains.annotations.Nullable
        org.linphone.core.Call call) {
            return false;
        }
        
        public final boolean isBluetoothAudioRouteAvailable() {
            return false;
        }
        
        private final boolean isBluetoothAudioRecorderAvailable() {
            return false;
        }
        
        public final boolean isHeadsetAudioRouteAvailable() {
            return false;
        }
        
        private final boolean isHeadsetAudioRecorderAvailable() {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAudioPlaybackDeviceIdForCallRecordingOrVoiceMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.linphone.core.AudioDevice getAudioRecordingDeviceForVoiceMessage() {
            return null;
        }
    }
}