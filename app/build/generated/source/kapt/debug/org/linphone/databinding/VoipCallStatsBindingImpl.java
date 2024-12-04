package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipCallStatsBindingImpl extends VoipCallStatsBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 3);
        sViewsWithIds.put(R.id.stats_scroll_layout, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback78;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipCallStatsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private VoipCallStatsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.view.View) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[2]
            , (androidx.core.widget.NestedScrollView) bindings[4]
            );
        this.hideStats.setTag(null);
        this.statsLayout.setTag(null);
        this.statsListLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback78 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.inflatedVisibility == variableId) {
            setInflatedVisibility((java.lang.Integer) variable);
        }
        else if (BR.statsViewModel == variableId) {
            setStatsViewModel((org.linphone.activities.voip.viewmodels.StatisticsListViewModel) variable);
        }
        else if (BR.controlsViewModel == variableId) {
            setControlsViewModel((org.linphone.activities.voip.viewmodels.ControlsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }
    public void setStatsViewModel(@Nullable org.linphone.activities.voip.viewmodels.StatisticsListViewModel StatsViewModel) {
        this.mStatsViewModel = StatsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.statsViewModel);
        super.requestRebind();
    }
    public void setControlsViewModel(@Nullable org.linphone.activities.voip.viewmodels.ControlsViewModel ControlsViewModel) {
        this.mControlsViewModel = ControlsViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.controlsViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeStatsViewModelCallStatsList((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.CallStatisticsData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeStatsViewModelCallStatsList(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.CallStatisticsData>> StatsViewModelCallStatsList, int fieldId) {
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
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        org.linphone.activities.voip.viewmodels.StatisticsListViewModel statsViewModel = mStatsViewModel;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.CallStatisticsData>> statsViewModelCallStatsList = null;
        java.util.ArrayList<org.linphone.activities.voip.data.CallStatisticsData> statsViewModelCallStatsListGetValue = null;
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;

        if ((dirtyFlags & 0x12L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        if ((dirtyFlags & 0x15L) != 0) {



                if (statsViewModel != null) {
                    // read statsViewModel.callStatsList
                    statsViewModelCallStatsList = statsViewModel.getCallStatsList();
                }
                updateLiveDataRegistration(0, statsViewModelCallStatsList);


                if (statsViewModelCallStatsList != null) {
                    // read statsViewModel.callStatsList.getValue()
                    statsViewModelCallStatsListGetValue = statsViewModelCallStatsList.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.hideStats.setOnClickListener(mCallback78);
            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.statsLayout, true);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.statsLayout.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.statsListLayout, statsViewModelCallStatsListGetValue, R.layout.voip_call_stats_cell);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // controlsViewModel
        org.linphone.activities.voip.viewmodels.ControlsViewModel controlsViewModel = mControlsViewModel;
        // controlsViewModel != null
        boolean controlsViewModelJavaLangObjectNull = false;



        controlsViewModelJavaLangObjectNull = (controlsViewModel) != (null);
        if (controlsViewModelJavaLangObjectNull) {


            controlsViewModel.hideCallStats();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): statsViewModel.callStatsList
        flag 1 (0x2L): inflatedVisibility
        flag 2 (0x3L): statsViewModel
        flag 3 (0x4L): controlsViewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}