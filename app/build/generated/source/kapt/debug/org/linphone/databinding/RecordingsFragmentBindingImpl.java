package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecordingsFragmentBindingImpl extends RecordingsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 4);
        sViewsWithIds.put(R.id.back, 5);
        sViewsWithIds.put(R.id.list_edit_top_bar_fragment, 6);
        sViewsWithIds.put(R.id.recordings_list, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecordingsFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private RecordingsFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[5]
            , (androidx.fragment.app.FragmentContainerView) bindings[6]
            , (android.view.TextureView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (android.widget.LinearLayout) bindings[4]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.recordingVideoSurface.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.videoTouchListener == variableId) {
            setVideoTouchListener((android.view.View.OnTouchListener) variable);
        }
        else if (BR.editClickListener == variableId) {
            setEditClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.recordings.viewmodels.RecordingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVideoTouchListener(@Nullable android.view.View.OnTouchListener VideoTouchListener) {
        this.mVideoTouchListener = VideoTouchListener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.videoTouchListener);
        super.requestRebind();
    }
    public void setEditClickListener(@Nullable android.view.View.OnClickListener EditClickListener) {
        this.mEditClickListener = EditClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.editClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.recordings.viewmodels.RecordingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRecordingsList((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.recordings.data.RecordingData>>) object, fieldId);
            case 1 :
                return onChangeViewModelIsVideoVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRecordingsList(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.recordings.data.RecordingData>> ViewModelRecordingsList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsVideoVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsVideoVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        int viewModelIsVideoVisibleViewVISIBLEViewGONE = 0;
        boolean viewModelRecordingsListEmpty = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.recordings.data.RecordingData>> viewModelRecordingsList = null;
        int viewModelRecordingsListEmptyViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsVideoVisible = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoVisibleGetValue = false;
        android.view.View.OnTouchListener videoTouchListener = mVideoTouchListener;
        android.view.View.OnClickListener editClickListener = mEditClickListener;
        boolean ViewModelRecordingsListEmpty1 = false;
        java.util.ArrayList<org.linphone.activities.main.recordings.data.RecordingData> viewModelRecordingsListGetValue = null;
        org.linphone.activities.main.recordings.viewmodels.RecordingsViewModel viewModel = mViewModel;
        java.lang.Boolean viewModelIsVideoVisibleGetValue = null;

        if ((dirtyFlags & 0x24L) != 0) {
        }
        if ((dirtyFlags & 0x28L) != 0) {
        }
        if ((dirtyFlags & 0x33L) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.recordingsList
                        viewModelRecordingsList = viewModel.getRecordingsList();
                    }
                    updateLiveDataRegistration(0, viewModelRecordingsList);


                    if (viewModelRecordingsList != null) {
                        // read viewModel.recordingsList.getValue()
                        viewModelRecordingsListGetValue = viewModelRecordingsList.getValue();
                    }


                    if (viewModelRecordingsListGetValue != null) {
                        // read viewModel.recordingsList.getValue().empty
                        ViewModelRecordingsListEmpty1 = viewModelRecordingsListGetValue.isEmpty();
                    }
                if((dirtyFlags & 0x31L) != 0) {
                    if(ViewModelRecordingsListEmpty1) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read !viewModel.recordingsList.getValue().empty
                    viewModelRecordingsListEmpty = !ViewModelRecordingsListEmpty1;
                    // read viewModel.recordingsList.getValue().empty ? View.VISIBLE : View.GONE
                    viewModelRecordingsListEmptyViewVISIBLEViewGONE = ((ViewModelRecordingsListEmpty1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isVideoVisible
                        viewModelIsVideoVisible = viewModel.isVideoVisible();
                    }
                    updateLiveDataRegistration(1, viewModelIsVideoVisible);


                    if (viewModelIsVideoVisible != null) {
                        // read viewModel.isVideoVisible.getValue()
                        viewModelIsVideoVisibleGetValue = viewModelIsVideoVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsVideoVisibleGetValue);
                if((dirtyFlags & 0x32L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoVisibleGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoVisible.getValue()) ? View.VISIBLE : View.GONE
                    viewModelIsVideoVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsVideoVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(editClickListener);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.mboundView1.setEnabled(viewModelRecordingsListEmpty);
            this.mboundView2.setVisibility(viewModelRecordingsListEmptyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setTouchListener(this.recordingVideoSurface, videoTouchListener);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.recordingVideoSurface.setVisibility(viewModelIsVideoVisibleViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.recordingsList
        flag 1 (0x2L): viewModel.isVideoVisible
        flag 2 (0x3L): videoTouchListener
        flag 3 (0x4L): editClickListener
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isVideoVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.recordingsList.getValue().empty ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.recordingsList.getValue().empty ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}