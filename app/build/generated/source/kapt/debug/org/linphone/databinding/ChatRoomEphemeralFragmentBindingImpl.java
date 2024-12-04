package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomEphemeralFragmentBindingImpl extends ChatRoomEphemeralFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 3);
        sViewsWithIds.put(R.id.back, 4);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatRoomEphemeralFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ChatRoomEphemeralFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[4]
            , (android.widget.LinearLayout) bindings[3]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.validClickListener == variableId) {
            setValidClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.chat.viewmodels.EphemeralViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setValidClickListener(@Nullable android.view.View.OnClickListener ValidClickListener) {
        this.mValidClickListener = ValidClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.validClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.EphemeralViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelDurationsList((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.EphemeralDurationData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelDurationsList(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.EphemeralDurationData>> ViewModelDurationsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.EphemeralDurationData>> viewModelDurationsList = null;
        android.view.View.OnClickListener validClickListener = mValidClickListener;
        org.linphone.activities.main.chat.viewmodels.EphemeralViewModel viewModel = mViewModel;
        java.util.ArrayList<org.linphone.activities.main.chat.data.EphemeralDurationData> viewModelDurationsListGetValue = null;

        if ((dirtyFlags & 0xaL) != 0) {
        }
        if ((dirtyFlags & 0xdL) != 0) {



                if (viewModel != null) {
                    // read viewModel.durationsList
                    viewModelDurationsList = viewModel.getDurationsList();
                }
                updateLiveDataRegistration(0, viewModelDurationsList);


                if (viewModelDurationsList != null) {
                    // read viewModel.durationsList.getValue()
                    viewModelDurationsListGetValue = viewModelDurationsList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(validClickListener);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView2, viewModelDurationsListGetValue, R.layout.chat_room_ephemeral_duration_cell);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.durationsList
        flag 1 (0x2L): validClickListener
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}