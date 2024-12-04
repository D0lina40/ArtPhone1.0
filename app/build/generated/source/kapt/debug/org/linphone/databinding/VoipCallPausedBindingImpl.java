package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipCallPausedBindingImpl extends VoipCallPausedBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.paused_title, 2);
        sViewsWithIds.put(R.id.paused_subtitle, 3);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipCallPausedBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private VoipCallPausedBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            );
        this.locallyPausedCallLayout.setTag(null);
        this.resumeCall.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        else if (BR.data == variableId) {
            setData((org.linphone.activities.voip.data.CallData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.voip.data.CallData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
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
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        org.linphone.activities.voip.data.CallData data = mData;

        if ((dirtyFlags & 0x5L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.locallyPausedCallLayout.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.locallyPausedCallLayout, true);
            this.resumeCall.setOnClickListener(mCallback39);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.voip.data.CallData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.resume();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): inflatedVisibility
        flag 1 (0x2L): data
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}