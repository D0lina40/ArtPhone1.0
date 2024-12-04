package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomEphemeralDurationCellBindingImpl extends ChatRoomEphemeralDurationCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback128;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatRoomEphemeralDurationCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ChatRoomEphemeralDurationCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.selected.setTag(null);
        setRootTag(root);
        // listeners
        mCallback128 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
            setData((org.linphone.activities.main.chat.data.EphemeralDurationData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.chat.data.EphemeralDurationData Data) {
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
        int dataTextResource = 0;
        int dataSelectedViewVISIBLEViewGONE = 0;
        boolean dataSelected = false;
        int dataSelectedTypefaceBOLDTypefaceNORMAL = 0;
        org.linphone.activities.main.chat.data.EphemeralDurationData data = mData;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.textResource
                    dataTextResource = data.getTextResource();
                    // read data.selected
                    dataSelected = data.getSelected();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataSelected) {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x4L;
                        dirtyFlags |= 0x10L;
                }
            }


                // read data.selected ? View.VISIBLE : View.GONE
                dataSelectedViewVISIBLEViewGONE = ((dataSelected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read data.selected ? Typeface.BOLD : Typeface.NORMAL
                dataSelectedTypefaceBOLDTypefaceNORMAL = ((dataSelected) ? (android.graphics.Typeface.BOLD) : (android.graphics.Typeface.NORMAL));
        }
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback128);
        }
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView1.setText(dataTextResource);
            org.linphone.utils.DataBindingUtilsKt.setTypeface(this.mboundView1, dataSelectedTypefaceBOLDTypefaceNORMAL);
            this.selected.setVisibility(dataSelectedViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.main.chat.data.EphemeralDurationData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.setSelected();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): data.selected ? View.VISIBLE : View.GONE
        flag 3 (0x4L): data.selected ? View.VISIBLE : View.GONE
        flag 4 (0x5L): data.selected ? Typeface.BOLD : Typeface.NORMAL
        flag 5 (0x6L): data.selected ? Typeface.BOLD : Typeface.NORMAL
    flag mapping end*/
    //end
}