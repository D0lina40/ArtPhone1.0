package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecordingListCellBindingImpl extends RecordingListCellBinding implements org.linphone.generated.callback.OnClickListener.Listener, org.linphone.generated.callback.Function1.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.record_description, 7);
        sViewsWithIds.put(R.id.playing_info, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback198;
    @Nullable
    private final kotlin.jvm.functions.Function1 mCallback199;
    @Nullable
    private final android.view.View.OnClickListener mCallback197;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecordingListCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private RecordingListCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            , (android.widget.CheckBox) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.SeekBar) bindings[6]
            );
        this.delete.setTag(null);
        this.export.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.recordPlayPause.setTag(null);
        this.recordProgressionBar.setTag(null);
        setRootTag(root);
        // listeners
        mCallback198 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback199 = new org.linphone.generated.callback.Function1(this, 3);
        mCallback197 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
        if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else if (BR.selectionListViewModel == variableId) {
            setSelectionListViewModel((org.linphone.activities.main.viewmodels.ListTopBarViewModel) variable);
        }
        else if (BR.data == variableId) {
            setData((org.linphone.activities.main.recordings.data.RecordingData) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.playListener == variableId) {
            setPlayListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }
    public void setSelectionListViewModel(@Nullable org.linphone.activities.main.viewmodels.ListTopBarViewModel SelectionListViewModel) {
        this.mSelectionListViewModel = SelectionListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.selectionListViewModel);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.recordings.data.RecordingData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setPlayListener(@Nullable android.view.View.OnClickListener PlayListener) {
        this.mPlayListener = PlayListener;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.playListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataPosition((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeDataFormattedDate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataIsPlaying((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeDataDuration((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeSelectionListViewModelSelectedItems((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>>) object, fieldId);
            case 5 :
                return onChangeDataFormattedPosition((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeSelectionListViewModelIsEditionEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeDataFormattedDuration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataPosition(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataFormattedDate(androidx.lifecycle.MutableLiveData<java.lang.String> DataFormattedDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsPlaying(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsPlaying, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDuration(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelSelectedItems(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> SelectionListViewModelSelectedItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataFormattedPosition(androidx.lifecycle.MutableLiveData<java.lang.String> DataFormattedPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelIsEditionEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SelectionListViewModelIsEditionEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataFormattedDuration(androidx.lifecycle.MutableLiveData<java.lang.String> DataFormattedDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataPosition = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsPlayingGetValue = false;
        java.lang.Integer position = mPosition;
        org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;
        boolean selectionListViewModelSelectedItemsContainsPosition = false;
        int androidxDatabindingViewDataBindingSafeUnboxDataPositionGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFormattedDate = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsPlaying = null;
        java.lang.Boolean selectionListViewModelIsEditionEnabledGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = false;
        int selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = 0;
        java.lang.Integer dataDurationGetValue = null;
        java.lang.String dataNameJavaLangString = null;
        org.linphone.activities.main.recordings.data.RecordingData data = mData;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataDuration = null;
        java.util.ArrayList<java.lang.Integer> selectionListViewModelSelectedItemsGetValue = null;
        java.lang.Integer dataPositionGetValue = null;
        java.lang.String dataFormattedDurationGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> selectionListViewModelSelectedItems = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFormattedPosition = null;
        java.lang.String dataFormattedPositionGetValue = null;
        java.lang.String dataFormattedPositionJavaLangString = null;
        java.lang.String dataFormattedPositionJavaLangStringDataFormattedDuration = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> selectionListViewModelIsEditionEnabled = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataDurationGetValue = 0;
        java.lang.String dataFormattedDateGetValue = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFormattedDuration = null;
        java.lang.Boolean dataIsPlayingGetValue = null;
        android.view.View.OnClickListener playListener = mPlayListener;
        java.lang.String dataName = null;
        java.lang.String dataNameJavaLangStringDataFormattedDate = null;

        if ((dirtyFlags & 0x2310L) != 0) {
        }
        if ((dirtyFlags & 0x2350L) != 0) {


            if ((dirtyFlags & 0x2310L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.selectedItems
                        selectionListViewModelSelectedItems = selectionListViewModel.getSelectedItems();
                    }
                    updateLiveDataRegistration(4, selectionListViewModelSelectedItems);


                    if (selectionListViewModelSelectedItems != null) {
                        // read selectionListViewModel.selectedItems.getValue()
                        selectionListViewModelSelectedItemsGetValue = selectionListViewModelSelectedItems.getValue();
                    }


                    if (selectionListViewModelSelectedItemsGetValue != null) {
                        // read selectionListViewModel.selectedItems.getValue().contains(position)
                        selectionListViewModelSelectedItemsContainsPosition = selectionListViewModelSelectedItemsGetValue.contains(position);
                    }
            }
            if ((dirtyFlags & 0x2240L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.isEditionEnabled
                        selectionListViewModelIsEditionEnabled = selectionListViewModel.isEditionEnabled();
                    }
                    updateLiveDataRegistration(6, selectionListViewModelIsEditionEnabled);


                    if (selectionListViewModelIsEditionEnabled != null) {
                        // read selectionListViewModel.isEditionEnabled.getValue()
                        selectionListViewModelIsEditionEnabledGetValue = selectionListViewModelIsEditionEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModelIsEditionEnabledGetValue);
                if((dirtyFlags & 0x2240L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
                    selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x24afL) != 0) {


            if ((dirtyFlags & 0x2401L) != 0) {

                    if (data != null) {
                        // read data.position
                        dataPosition = data.getPosition();
                    }
                    updateLiveDataRegistration(0, dataPosition);


                    if (dataPosition != null) {
                        // read data.position.getValue()
                        dataPositionGetValue = dataPosition.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.position.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataPositionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataPositionGetValue);
            }
            if ((dirtyFlags & 0x2402L) != 0) {

                    if (data != null) {
                        // read data.formattedDate
                        dataFormattedDate = data.getFormattedDate();
                        // read data.name
                        dataName = data.getName();
                    }
                    updateLiveDataRegistration(1, dataFormattedDate);


                    if (dataFormattedDate != null) {
                        // read data.formattedDate.getValue()
                        dataFormattedDateGetValue = dataFormattedDate.getValue();
                    }
                    // read (data.name) + ("-")
                    dataNameJavaLangString = (dataName) + ("-");


                    // read ((data.name) + ("-")) + (data.formattedDate.getValue())
                    dataNameJavaLangStringDataFormattedDate = (dataNameJavaLangString) + (dataFormattedDateGetValue);
            }
            if ((dirtyFlags & 0x2404L) != 0) {

                    if (data != null) {
                        // read data.isPlaying
                        dataIsPlaying = data.isPlaying();
                    }
                    updateLiveDataRegistration(2, dataIsPlaying);


                    if (dataIsPlaying != null) {
                        // read data.isPlaying.getValue()
                        dataIsPlayingGetValue = dataIsPlaying.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isPlaying.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsPlayingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsPlayingGetValue);
            }
            if ((dirtyFlags & 0x2408L) != 0) {

                    if (data != null) {
                        // read data.duration
                        dataDuration = data.getDuration();
                    }
                    updateLiveDataRegistration(3, dataDuration);


                    if (dataDuration != null) {
                        // read data.duration.getValue()
                        dataDurationGetValue = dataDuration.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.duration.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataDurationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataDurationGetValue);
            }
            if ((dirtyFlags & 0x24a0L) != 0) {

                    if (data != null) {
                        // read data.formattedPosition
                        dataFormattedPosition = data.getFormattedPosition();
                        // read data.formattedDuration
                        dataFormattedDuration = data.getFormattedDuration();
                    }
                    updateLiveDataRegistration(5, dataFormattedPosition);
                    updateLiveDataRegistration(7, dataFormattedDuration);


                    if (dataFormattedPosition != null) {
                        // read data.formattedPosition.getValue()
                        dataFormattedPositionGetValue = dataFormattedPosition.getValue();
                    }
                    if (dataFormattedDuration != null) {
                        // read data.formattedDuration.getValue()
                        dataFormattedDurationGetValue = dataFormattedDuration.getValue();
                    }


                    // read (data.formattedPosition.getValue()) + ("/")
                    dataFormattedPositionJavaLangString = (dataFormattedPositionGetValue) + ("/");


                    // read ((data.formattedPosition.getValue()) + ("/")) + (data.formattedDuration.getValue())
                    dataFormattedPositionJavaLangStringDataFormattedDuration = (dataFormattedPositionJavaLangString) + (dataFormattedDurationGetValue);
            }
        }
        if ((dirtyFlags & 0x2800L) != 0) {
        }
        if ((dirtyFlags & 0x3000L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback197);
            this.export.setOnClickListener(mCallback198);
            org.linphone.utils.DataBindingUtilsKt.setListener(this.recordProgressionBar, mCallback199);
        }
        if ((dirtyFlags & 0x2240L) != 0) {
            // api target 1

            this.delete.setVisibility(selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2310L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.delete, selectionListViewModelSelectedItemsContainsPosition);
        }
        if ((dirtyFlags & 0x2800L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x2402L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataNameJavaLangStringDataFormattedDate);
        }
        if ((dirtyFlags & 0x24a0L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataFormattedPositionJavaLangStringDataFormattedDuration);
        }
        if ((dirtyFlags & 0x3000L) != 0) {
            // api target 1

            this.recordPlayPause.setOnClickListener(playListener);
        }
        if ((dirtyFlags & 0x2404L) != 0) {
            // api target 1

            this.recordPlayPause.setSelected(androidxDatabindingViewDataBindingSafeUnboxDataIsPlayingGetValue);
        }
        if ((dirtyFlags & 0x2408L) != 0) {
            // api target 1

            this.recordProgressionBar.setMax(androidxDatabindingViewDataBindingSafeUnboxDataDurationGetValue);
        }
        if ((dirtyFlags & 0x2401L) != 0) {
            // api target 1

            androidx.databinding.adapters.SeekBarBindingAdapter.setProgress(this.recordProgressionBar, androidxDatabindingViewDataBindingSafeUnboxDataPositionGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.recordings.data.RecordingData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.export();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // selectionListViewModel != null
                boolean selectionListViewModelJavaLangObjectNull = false;
                // position
                java.lang.Integer position = mPosition;
                // selectionListViewModel
                org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;



                selectionListViewModelJavaLangObjectNull = (selectionListViewModel) != (null);
                if (selectionListViewModelJavaLangObjectNull) {



                    selectionListViewModel.onToggleSelect(position);
                }
                break;
            }
        }
    }
    public final kotlin.Unit _internalCallbackInvoke1(int sourceId , java.lang.Object callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.main.recordings.data.RecordingData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {



            data.onProgressChanged(callbackArg_0);
        }
        return null;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.position
        flag 1 (0x2L): data.formattedDate
        flag 2 (0x3L): data.isPlaying
        flag 3 (0x4L): data.duration
        flag 4 (0x5L): selectionListViewModel.selectedItems
        flag 5 (0x6L): data.formattedPosition
        flag 6 (0x7L): selectionListViewModel.isEditionEnabled
        flag 7 (0x8L): data.formattedDuration
        flag 8 (0x9L): position
        flag 9 (0xaL): selectionListViewModel
        flag 10 (0xbL): data
        flag 11 (0xcL): clickListener
        flag 12 (0xdL): playListener
        flag 13 (0xeL): null
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}