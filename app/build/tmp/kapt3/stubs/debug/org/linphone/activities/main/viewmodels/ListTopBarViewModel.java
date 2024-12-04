package org.linphone.activities.main.viewmodels;

/**
 * This view model is dedicated to the top bar while in edition mode for item(s) selection in list
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0018R\'\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\'\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0015\u0010\b\u00a8\u0006\u001d"}, d2 = {"Lorg/linphone/activities/main/viewmodels/ListTopBarViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "deleteSelectionEvent", "Landroidx/lifecycle/MutableLiveData;", "Lorg/linphone/utils/Event;", "", "getDeleteSelectionEvent", "()Landroidx/lifecycle/MutableLiveData;", "deleteSelectionEvent$delegate", "Lkotlin/Lazy;", "isEditionEnabled", "isSelectionNotEmpty", "selectAllEvent", "getSelectAllEvent", "selectAllEvent$delegate", "selectedItems", "Ljava/util/ArrayList;", "", "getSelectedItems", "unSelectAllEvent", "getUnSelectAllEvent", "unSelectAllEvent$delegate", "onSelectAll", "", "lastIndex", "onToggleSelect", "position", "onUnSelectAll", "app_debug"})
public final class ListTopBarViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEditionEnabled = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelectionNotEmpty = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy selectAllEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy unSelectAllEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy deleteSelectionEvent$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> selectedItems = null;
    
    public ListTopBarViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isEditionEnabled() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSelectionNotEmpty() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getSelectAllEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getUnSelectAllEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<org.linphone.utils.Event<java.lang.Boolean>> getDeleteSelectionEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> getSelectedItems() {
        return null;
    }
    
    public final void onSelectAll(int lastIndex) {
    }
    
    public final void onUnSelectAll() {
    }
    
    public final void onToggleSelect(int position) {
    }
}