package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageAttachmentCellBindingImpl extends ChatMessageAttachmentCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback212;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageAttachmentCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ChatMessageAttachmentCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback212 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
            setData((org.linphone.activities.main.chat.data.ChatMessageAttachmentData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageAttachmentData Data) {
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
        boolean dataImage = false;
        java.lang.String dataFileName = null;
        int dataImageBooleanTrueDataVideoViewGONEViewVISIBLE = 0;
        boolean dataVideo = false;
        boolean dataAudio = false;
        boolean dataPdf = false;
        boolean dataImageBooleanTrueDataVideo = false;
        android.graphics.drawable.Drawable dataAudioMboundView4AndroidDrawableFileAudioMboundView4AndroidDrawableFile = null;
        int dataVideoViewVISIBLEViewGONE = 0;
        java.lang.String dataPath = null;
        org.linphone.activities.main.chat.data.ChatMessageAttachmentData data = mData;
        android.graphics.drawable.Drawable dataPdfMboundView4AndroidDrawableFilePdfDataAudioMboundView4AndroidDrawableFileAudioMboundView4AndroidDrawableFile = null;
        int dataImageViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.image
                    dataImage = data.isImage();
                    // read data.fileName
                    dataFileName = data.getFileName();
                    // read data.video
                    dataVideo = data.isVideo();
                    // read data.pdf
                    dataPdf = data.isPdf();
                    // read data.path
                    dataPath = data.getPath();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataImage) {
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataVideo) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataPdf) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read data.image ? View.VISIBLE : View.GONE
                dataImageViewVISIBLEViewGONE = ((dataImage) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read data.video ? View.VISIBLE : View.GONE
                dataVideoViewVISIBLEViewGONE = ((dataVideo) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                if (data != null) {
                    // read data.audio
                    dataAudio = data.isAudio();
                }
            if((dirtyFlags & 0x400L) != 0) {
                if(dataAudio) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read data.audio ? @android:drawable/file_audio : @android:drawable/file
                dataAudioMboundView4AndroidDrawableFileAudioMboundView4AndroidDrawableFile = ((dataAudio) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.file_audio)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.file)));
        }
        if ((dirtyFlags & 0x3L) != 0) {

                // read data.image ? true : data.video
                dataImageBooleanTrueDataVideo = ((dataImage) ? (true) : (dataVideo));
            if((dirtyFlags & 0x3L) != 0) {
                if(dataImageBooleanTrueDataVideo) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read data.image ? true : data.video ? View.GONE : View.VISIBLE
                dataImageBooleanTrueDataVideoViewGONEViewVISIBLE = ((dataImageBooleanTrueDataVideo) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read data.pdf ? @android:drawable/file_pdf : data.audio ? @android:drawable/file_audio : @android:drawable/file
                dataPdfMboundView4AndroidDrawableFilePdfDataAudioMboundView4AndroidDrawableFileAudioMboundView4AndroidDrawableFile = ((dataPdf) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView4.getContext(), R.drawable.file_pdf)) : (dataAudioMboundView4AndroidDrawableFileAudioMboundView4AndroidDrawableFile));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(dataImageViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.loadImageWithCoil(this.mboundView1, dataPath);
            this.mboundView2.setVisibility(dataVideoViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataFileName);
            this.mboundView3.setVisibility(dataVideoViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.loadVideoPreview(this.mboundView3, dataPath);
            this.mboundView4.setVisibility(dataImageBooleanTrueDataVideoViewGONEViewVISIBLE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataFileName);
            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableTop(this.mboundView4, dataPdfMboundView4AndroidDrawableFilePdfDataAudioMboundView4AndroidDrawableFileAudioMboundView4AndroidDrawableFile);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(mCallback212);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.main.chat.data.ChatMessageAttachmentData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.delete();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): data.image ? true : data.video ? View.GONE : View.VISIBLE
        flag 3 (0x4L): data.image ? true : data.video ? View.GONE : View.VISIBLE
        flag 4 (0x5L): data.image ? true : data.video
        flag 5 (0x6L): data.image ? true : data.video
        flag 6 (0x7L): data.audio ? @android:drawable/file_audio : @android:drawable/file
        flag 7 (0x8L): data.audio ? @android:drawable/file_audio : @android:drawable/file
        flag 8 (0x9L): data.video ? View.VISIBLE : View.GONE
        flag 9 (0xaL): data.video ? View.VISIBLE : View.GONE
        flag 10 (0xbL): data.pdf ? @android:drawable/file_pdf : data.audio ? @android:drawable/file_audio : @android:drawable/file
        flag 11 (0xcL): data.pdf ? @android:drawable/file_pdf : data.audio ? @android:drawable/file_audio : @android:drawable/file
        flag 12 (0xdL): data.image ? View.VISIBLE : View.GONE
        flag 13 (0xeL): data.image ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}