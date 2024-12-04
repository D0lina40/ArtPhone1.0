package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageVideoContentCellBindingImpl extends ChatMessageVideoContentCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback70;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageVideoContentCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ChatMessageVideoContentCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback70 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.longClickListener);
        super.requestRebind();
    }
    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageContentData Data) {
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
                return onChangeDataFileName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDataFilePath((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataFileName(androidx.lifecycle.MutableLiveData<java.lang.String> DataFileName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataFilePath(androidx.lifecycle.MutableLiveData<java.lang.String> DataFilePath, int fieldId) {
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
        boolean dataAlone = false;
        java.lang.String dataFilePathGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFileName = null;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        java.lang.String dataFileNameGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFilePath = null;
        float dataAloneFloat0fMboundView2AndroidDimenChatMessageBubbleFileSize = 0f;
        android.widget.ImageView.ScaleType dataAloneScaleTypeFITCENTERScaleTypeCENTERCROP = null;
        org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;

        if ((dirtyFlags & 0x24L) != 0) {
        }
        if ((dirtyFlags & 0x28L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        if ((dirtyFlags & 0x33L) != 0) {


            if ((dirtyFlags & 0x30L) != 0) {

                    if (data != null) {
                        // read data.alone
                        dataAlone = data.isAlone();
                    }
                if((dirtyFlags & 0x30L) != 0) {
                    if(dataAlone) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read data.alone ? 0f : @android:dimen/chat_message_bubble_file_size
                    dataAloneFloat0fMboundView2AndroidDimenChatMessageBubbleFileSize = ((dataAlone) ? (0f) : (mboundView2.getResources().getDimension(R.dimen.chat_message_bubble_file_size)));
                    // read data.alone ? ScaleType.FIT_CENTER : ScaleType.CENTER_CROP
                    dataAloneScaleTypeFITCENTERScaleTypeCENTERCROP = ((dataAlone) ? (android.widget.ImageView.ScaleType.FIT_CENTER) : (android.widget.ImageView.ScaleType.CENTER_CROP));
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (data != null) {
                        // read data.fileName
                        dataFileName = data.getFileName();
                    }
                    updateLiveDataRegistration(0, dataFileName);


                    if (dataFileName != null) {
                        // read data.fileName.getValue()
                        dataFileNameGetValue = dataFileName.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (data != null) {
                        // read data.filePath
                        dataFilePath = data.getFilePath();
                    }
                    updateLiveDataRegistration(1, dataFilePath);


                    if (dataFilePath != null) {
                        // read data.filePath.getValue()
                        dataFilePathGetValue = dataFilePath.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback70);
            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.mboundView0, true);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.mboundView0.setOnLongClickListener(longClickListener);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataFileNameGetValue);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutSize(this.mboundView2, dataAloneFloat0fMboundView2AndroidDimenChatMessageBubbleFileSize);
            org.linphone.utils.DataBindingUtilsKt.setImageViewScaleType(this.mboundView2, dataAloneScaleTypeFITCENTERScaleTypeCENTERCROP);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadVideoPreview(this.mboundView2, dataFilePathGetValue);
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
        flag 0 (0x1L): data.fileName
        flag 1 (0x2L): data.filePath
        flag 2 (0x3L): longClickListener
        flag 3 (0x4L): inflatedVisibility
        flag 4 (0x5L): data
        flag 5 (0x6L): null
        flag 6 (0x7L): data.alone ? 0f : @android:dimen/chat_message_bubble_file_size
        flag 7 (0x8L): data.alone ? 0f : @android:dimen/chat_message_bubble_file_size
        flag 8 (0x9L): data.alone ? ScaleType.FIT_CENTER : ScaleType.CENTER_CROP
        flag 9 (0xaL): data.alone ? ScaleType.FIT_CENTER : ScaleType.CENTER_CROP
    flag mapping end*/
    //end
}