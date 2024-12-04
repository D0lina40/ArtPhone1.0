package org.linphone.activities.main.recordings.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0015\u001a\u00020\u00162\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012j\b\u0012\u0004\u0012\u00020\u0013`\u0018J\b\u0010\u0019\u001a\u00020\u0016H\u0014J\u0006\u0010\u001a\u001a\u00020\u0016R\'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\b\u00a8\u0006\u001b"}, d2 = {"Lorg/linphone/activities/main/recordings/viewmodels/RecordingsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "exportRecordingEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getExportRecordingEvent", "()Landroidx/lifecycle/MutableLiveData;", "exportRecordingEvent$delegate", "Lkotlin/Lazy;", "isVideoVisible", "", "recordingListener", "Lorg/linphone/activities/main/recordings/data/RecordingData$RecordingListener;", "recordingPlayingAudioFocusRequest", "Landroidx/media/AudioFocusRequestCompat;", "recordingsList", "Ljava/util/ArrayList;", "Lorg/linphone/activities/main/recordings/data/RecordingData;", "getRecordingsList", "deleteRecordings", "", "list", "Lkotlin/collections/ArrayList;", "onCleared", "updateRecordingsList", "app_debug"})
public final class RecordingsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.recordings.data.RecordingData>> recordingsList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoVisible = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy exportRecordingEvent$delegate = null;
    @org.jetbrains.annotations.Nullable
    private androidx.media.AudioFocusRequestCompat recordingPlayingAudioFocusRequest;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.activities.main.recordings.data.RecordingData.RecordingListener recordingListener = null;
    
    public RecordingsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.recordings.data.RecordingData>> getRecordingsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isVideoVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.String>> getExportRecordingEvent() {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
    
    public final void deleteRecordings(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<org.linphone.activities.main.recordings.data.RecordingData> list) {
    }
    
    public final void updateRecordingsList() {
    }
}