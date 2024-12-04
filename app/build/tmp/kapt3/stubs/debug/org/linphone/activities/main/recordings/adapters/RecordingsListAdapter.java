package org.linphone.activities.main.recordings.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001!B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u000bR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/linphone/activities/main/recordings/adapters/RecordingsListAdapter;", "Lorg/linphone/activities/main/adapters/SelectionListAdapter;", "Lorg/linphone/activities/main/recordings/data/RecordingData;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lorg/linphone/utils/HeaderAdapter;", "selectionVM", "Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;", "viewLifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "videoSurface", "Landroid/view/TextureView;", "displayHeaderForPosition", "", "position", "", "formatDate", "", "context", "Landroid/content/Context;", "date", "", "getHeaderViewForPosition", "Landroid/view/View;", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setVideoTextureView", "textureView", "ViewHolder", "app_debug"})
public final class RecordingsListAdapter extends org.linphone.activities.main.adapters.SelectionListAdapter<org.linphone.activities.main.recordings.data.RecordingData, androidx.recyclerview.widget.RecyclerView.ViewHolder> implements org.linphone.utils.HeaderAdapter {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LifecycleOwner viewLifecycleOwner = null;
    private android.view.TextureView videoSurface;
    
    public RecordingsListAdapter(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionVM, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner viewLifecycleOwner) {
        super(null, null);
    }
    
    public final void setVideoTextureView(@org.jetbrains.annotations.NotNull
    android.view.TextureView textureView) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public boolean displayHeaderForPosition(int position) {
        return false;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View getHeaderViewForPosition(@org.jetbrains.annotations.NotNull
    android.content.Context context, int position) {
        return null;
    }
    
    private final java.lang.String formatDate(android.content.Context context, long date) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lorg/linphone/activities/main/recordings/adapters/RecordingsListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/linphone/databinding/RecordingListCellBinding;", "(Lorg/linphone/activities/main/recordings/adapters/RecordingsListAdapter;Lorg/linphone/databinding/RecordingListCellBinding;)V", "getBinding", "()Lorg/linphone/databinding/RecordingListCellBinding;", "bind", "", "recording", "Lorg/linphone/activities/main/recordings/data/RecordingData;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final org.linphone.databinding.RecordingListCellBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        org.linphone.databinding.RecordingListCellBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.databinding.RecordingListCellBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        org.linphone.activities.main.recordings.data.RecordingData recording) {
        }
    }
}