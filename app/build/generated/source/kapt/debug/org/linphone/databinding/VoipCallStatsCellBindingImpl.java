package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipCallStatsCellBindingImpl extends VoipCallStatsCellBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipCallStatsCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private VoipCallStatsCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
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
        if (BR.data == variableId) {
            setData((org.linphone.activities.voip.data.CallStatisticsData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.voip.data.CallStatisticsData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataIsVideoEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataMediaEncryptionStats((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>>) object, fieldId);
            case 2 :
                return onChangeDataAudioStats((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>>) object, fieldId);
            case 3 :
                return onChangeDataVideoStats((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataIsVideoEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsVideoEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataMediaEncryptionStats(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> DataMediaEncryptionStats, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataAudioStats(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> DataAudioStats, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataVideoStats(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> DataVideoStats, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsVideoEnabled = null;
        java.util.ArrayList<org.linphone.activities.voip.data.StatItemData> dataMediaEncryptionStatsGetValue = null;
        java.util.ArrayList<org.linphone.activities.voip.data.StatItemData> dataAudioStatsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsVideoEnabledGetValue = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> dataMediaEncryptionStats = null;
        int dataIsVideoEnabledViewVISIBLEViewGONE = 0;
        java.util.ArrayList<org.linphone.activities.voip.data.StatItemData> dataVideoStatsGetValue = null;
        java.lang.Boolean dataIsVideoEnabledGetValue = null;
        org.linphone.activities.voip.data.CallStatisticsData data = mData;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> dataAudioStats = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.voip.data.StatItemData>> dataVideoStats = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (data != null) {
                        // read data.isVideoEnabled
                        dataIsVideoEnabled = data.isVideoEnabled();
                    }
                    updateLiveDataRegistration(0, dataIsVideoEnabled);


                    if (dataIsVideoEnabled != null) {
                        // read data.isVideoEnabled.getValue()
                        dataIsVideoEnabledGetValue = dataIsVideoEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isVideoEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsVideoEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsVideoEnabledGetValue);
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsVideoEnabledGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isVideoEnabled.getValue()) ? View.VISIBLE : View.GONE
                    dataIsVideoEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsVideoEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (data != null) {
                        // read data.mediaEncryptionStats
                        dataMediaEncryptionStats = data.getMediaEncryptionStats();
                    }
                    updateLiveDataRegistration(1, dataMediaEncryptionStats);


                    if (dataMediaEncryptionStats != null) {
                        // read data.mediaEncryptionStats.getValue()
                        dataMediaEncryptionStatsGetValue = dataMediaEncryptionStats.getValue();
                    }
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (data != null) {
                        // read data.audioStats
                        dataAudioStats = data.getAudioStats();
                    }
                    updateLiveDataRegistration(2, dataAudioStats);


                    if (dataAudioStats != null) {
                        // read data.audioStats.getValue()
                        dataAudioStatsGetValue = dataAudioStats.getValue();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (data != null) {
                        // read data.videoStats
                        dataVideoStats = data.getVideoStats();
                    }
                    updateLiveDataRegistration(3, dataVideoStats);


                    if (dataVideoStats != null) {
                        // read data.videoStats.getValue()
                        dataVideoStatsGetValue = dataVideoStats.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView1, dataMediaEncryptionStatsGetValue, R.layout.voip_call_stat_cell);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView2, dataAudioStatsGetValue, R.layout.voip_call_stat_cell);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(dataIsVideoEnabledViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(dataIsVideoEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView4, dataVideoStatsGetValue, R.layout.voip_call_stat_cell);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.isVideoEnabled
        flag 1 (0x2L): data.mediaEncryptionStats
        flag 2 (0x3L): data.audioStats
        flag 3 (0x4L): data.videoStats
        flag 4 (0x5L): data
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(data.isVideoEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(data.isVideoEnabled.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}