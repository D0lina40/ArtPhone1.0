package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageImageContentCellBindingImpl extends ChatMessageImageContentCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback203;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageImageContentCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ChatMessageImageContentCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback203 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
        if (BR.longClickListener == variableId) {
            setLongClickListener((android.view.View.OnLongClickListener) variable);
        }
        else if (BR.inflatedVisibility == variableId) {
            setInflatedVisibility((java.lang.Integer) variable);
        }
        else if (BR.data == variableId) {
            setData((org.linphone.activities.main.chat.data.ChatMessageContentData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLongClickListener(@Nullable android.view.View.OnLongClickListener LongClickListener) {
        this.mLongClickListener = LongClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.longClickListener);
        super.requestRebind();
    }
    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageContentData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataFilePath((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataFilePath(androidx.lifecycle.MutableLiveData<java.lang.String> DataFilePath, int fieldId) {
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
        boolean dataAlone = false;
        java.lang.String dataFilePathGetValue = null;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFilePath = null;
        int dataAloneViewGONEViewVISIBLE = 0;
        int dataAloneViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;

        if ((dirtyFlags & 0x12L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        if ((dirtyFlags & 0x19L) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (data != null) {
                        // read data.alone
                        dataAlone = data.isAlone();
                    }
                if((dirtyFlags & 0x18L) != 0) {
                    if(dataAlone) {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read data.alone ? View.GONE : View.VISIBLE
                    dataAloneViewGONEViewVISIBLE = ((dataAlone) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read data.alone ? View.VISIBLE : View.GONE
                    dataAloneViewVISIBLEViewGONE = ((dataAlone) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

                if (data != null) {
                    // read data.filePath
                    dataFilePath = data.getFilePath();
                }
                updateLiveDataRegistration(0, dataFilePath);


                if (dataFilePath != null) {
                    // read data.filePath.getValue()
                    dataFilePathGetValue = dataFilePath.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback203);
            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.mboundView0, true);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.mboundView0.setOnLongClickListener(longClickListener);
        }
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadImageInChatBubbleWithCoil(this.mboundView1, dataFilePathGetValue);
            org.linphone.utils.DataBindingUtilsKt.loadImageInChatGridBubbleWithCoil(this.mboundView2, dataFilePathGetValue);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(dataAloneViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(dataAloneViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.openFile();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.filePath
        flag 1 (0x2L): longClickListener
        flag 2 (0x3L): inflatedVisibility
        flag 3 (0x4L): data
        flag 4 (0x5L): null
        flag 5 (0x6L): data.alone ? View.GONE : View.VISIBLE
        flag 6 (0x7L): data.alone ? View.GONE : View.VISIBLE
        flag 7 (0x8L): data.alone ? View.VISIBLE : View.GONE
        flag 8 (0x9L): data.alone ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}