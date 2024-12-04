package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class HistoryDetailCellBindingImpl extends HistoryDetailCellBinding  {

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
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public HistoryDetailCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private HistoryDetailCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (org.linphone.views.MarqueeTextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setData((org.linphone.activities.main.history.viewmodels.CallLogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.history.viewmodels.CallLogViewModel Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        int dataIconContentDescription = 0;
        int dataDirectionIconResource = 0;
        java.lang.String dataDate = null;
        java.lang.String dataDateJavaLangStringDataDuration = null;
        org.linphone.activities.main.history.viewmodels.CallLogViewModel data = mData;
        java.lang.String dataDuration = null;
        java.lang.String dataDateJavaLangString = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.iconContentDescription
                    dataIconContentDescription = data.getIconContentDescription();
                    // read data.directionIconResource
                    dataDirectionIconResource = data.getDirectionIconResource();
                    // read data.date
                    dataDate = data.getDate();
                    // read data.duration
                    dataDuration = data.getDuration();
                }


                // read (data.date) + (" - ")
                dataDateJavaLangString = (dataDate) + (" - ");


                // read ((data.date) + (" - ")) + (data.duration)
                dataDateJavaLangStringDataDuration = (dataDateJavaLangString) + (dataDuration);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView1, dataDirectionIconResource);
            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView1, dataIconContentDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataDateJavaLangStringDataDuration);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}