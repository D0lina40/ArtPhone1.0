package org.linphone.activities.main.adapters;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00020\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00068DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lorg/linphone/activities/main/adapters/SelectionListAdapter;", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/ListAdapter;", "selectionVM", "Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;", "diff", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "_selectionViewModel", "selectionViewModel", "getSelectionViewModel", "()Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;", "onDetachedFromRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "app_debug"})
public abstract class SelectionListAdapter<T extends java.lang.Object, VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> extends androidx.recyclerview.widget.ListAdapter<T, VH> {
    @org.jetbrains.annotations.Nullable
    private org.linphone.activities.main.viewmodels.ListTopBarViewModel _selectionViewModel;
    
    public SelectionListAdapter(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionVM, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.DiffUtil.ItemCallback<T> diff) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    protected final org.linphone.activities.main.viewmodels.ListTopBarViewModel getSelectionViewModel() {
        return null;
    }
    
    @java.lang.Override
    public void onDetachedFromRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView recyclerView) {
    }
}