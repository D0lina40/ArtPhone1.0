package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageDownloadableFileContentCellBindingImpl extends ChatMessageDownloadableFileContentCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageDownloadableFileContentCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ChatMessageDownloadableFileContentCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 8
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback43 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback44 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
        else if (BR.data == variableId) {
            setData((org.linphone.activities.main.chat.data.ChatMessageContentData) variable);
        }
        else if (BR.inflatedVisibility == variableId) {
            setInflatedVisibility((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLongClickListener(@Nullable android.view.View.OnLongClickListener LongClickListener) {
        this.mLongClickListener = LongClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.longClickListener);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageContentData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataFileName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDataVideo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeDataAudio((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeDataPdf((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeDataDownloadLabel((androidx.lifecycle.MutableLiveData<android.text.Spannable>) object, fieldId);
            case 5 :
                return onChangeDataImage((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeDataVoiceRecording((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeDataDownloadable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeDataVideo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataAudio(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataAudio, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataPdf(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataPdf, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDownloadLabel(androidx.lifecycle.MutableLiveData<android.text.Spannable> DataDownloadLabel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataImage(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataImage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataVoiceRecording(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataVoiceRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDownloadable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataDownloadable, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordingGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFileName = null;
        android.graphics.drawable.Drawable dataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = null;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        int dataDownloadableViewVISIBLEViewGONE = 0;
        java.lang.String dataFileNameGetValue = null;
        java.lang.Boolean dataAudioGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataVideo = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataAudio = null;
        java.lang.Boolean dataDownloadableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataPdf = null;
        java.lang.Boolean dataImageGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue = false;
        androidx.lifecycle.MutableLiveData<android.text.Spannable> dataDownloadLabel = null;
        org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataImage = null;
        java.lang.Boolean dataPdfGetValue = null;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataVoiceRecording = null;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataDownloadable = null;
        android.graphics.drawable.Drawable dataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = null;
        java.lang.Boolean dataVoiceRecordingGetValue = null;
        java.lang.Boolean dataVideoGetValue = null;
        android.text.Spannable dataDownloadLabelGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue = false;
        android.graphics.drawable.Drawable dataPdfMboundView1AndroidDrawableFilePdfDataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = null;
        android.graphics.drawable.Drawable dataImageMboundView1AndroidDrawableFilePictureDataPdfMboundView1AndroidDrawableFilePdfDataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = null;
        android.graphics.drawable.Drawable dataVideoMboundView1AndroidDrawableFileVideoDataImageMboundView1AndroidDrawableFilePictureDataPdfMboundView1AndroidDrawableFilePdfDataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = null;

        if ((dirtyFlags & 0x900L) != 0) {
        }
        if ((dirtyFlags & 0xaffL) != 0) {


            if ((dirtyFlags & 0xa01L) != 0) {

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
            if ((dirtyFlags & 0xa6eL) != 0) {

                    if (data != null) {
                        // read data.video
                        dataVideo = data.isVideo();
                    }
                    updateLiveDataRegistration(1, dataVideo);


                    if (dataVideo != null) {
                        // read data.video.getValue()
                        dataVideoGetValue = dataVideo.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataVideoGetValue);
                if((dirtyFlags & 0xa6eL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
            }
            if ((dirtyFlags & 0xa10L) != 0) {

                    if (data != null) {
                        // read data.downloadLabel
                        dataDownloadLabel = data.getDownloadLabel();
                    }
                    updateLiveDataRegistration(4, dataDownloadLabel);


                    if (dataDownloadLabel != null) {
                        // read data.downloadLabel.getValue()
                        dataDownloadLabelGetValue = dataDownloadLabel.getValue();
                    }
            }
            if ((dirtyFlags & 0xa80L) != 0) {

                    if (data != null) {
                        // read data.downloadable
                        dataDownloadable = data.getDownloadable();
                    }
                    updateLiveDataRegistration(7, dataDownloadable);


                    if (dataDownloadable != null) {
                        // read data.downloadable.getValue()
                        dataDownloadableGetValue = dataDownloadable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataDownloadableGetValue);
                if((dirtyFlags & 0xa80L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? View.VISIBLE : View.GONE
                    dataDownloadableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0xc00L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        // batch finished

        if ((dirtyFlags & 0x400000L) != 0) {



                if (data != null) {
                    // read data.image
                    dataImage = data.isImage();
                }
                updateLiveDataRegistration(5, dataImage);


                if (dataImage != null) {
                    // read data.image.getValue()
                    dataImageGetValue = dataImage.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataImageGetValue);
            if((dirtyFlags & 0x400000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000L) != 0) {



                if (data != null) {
                    // read data.pdf
                    dataPdf = data.isPdf();
                }
                updateLiveDataRegistration(3, dataPdf);


                if (dataPdf != null) {
                    // read data.pdf.getValue()
                    dataPdfGetValue = dataPdf.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataPdfGetValue);
            if((dirtyFlags & 0x100000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40000L) != 0) {



                if (data != null) {
                    // read data.audio
                    dataAudio = data.isAudio();
                }
                updateLiveDataRegistration(2, dataAudio);


                if (dataAudio != null) {
                    // read data.audio.getValue()
                    dataAudioGetValue = dataAudio.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataAudioGetValue);
            if((dirtyFlags & 0x40000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10000L) != 0) {

                if (data != null) {
                    // read data.voiceRecording
                    dataVoiceRecording = data.isVoiceRecording();
                }
                updateLiveDataRegistration(6, dataVoiceRecording);


                if (dataVoiceRecording != null) {
                    // read data.voiceRecording.getValue()
                    dataVoiceRecordingGetValue = dataVoiceRecording.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataVoiceRecordingGetValue);
            if((dirtyFlags & 0x10000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordingGetValue) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
                dataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = ((androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordingGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.audio_recording_reply_preview_default)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.file)));
        }

        if ((dirtyFlags & 0x40000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
                dataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = ((androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.file_audio)) : (dataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile));
        }

        if ((dirtyFlags & 0x100000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
                dataPdfMboundView1AndroidDrawableFilePdfDataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = ((androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.file_pdf)) : (dataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile));
        }

        if ((dirtyFlags & 0x400000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
                dataImageMboundView1AndroidDrawableFilePictureDataPdfMboundView1AndroidDrawableFilePdfDataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = ((androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.file_picture)) : (dataPdfMboundView1AndroidDrawableFilePdfDataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile));
        }

        if ((dirtyFlags & 0xa6eL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) ? @android:drawable/file_video : androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
                dataVideoMboundView1AndroidDrawableFileVideoDataImageMboundView1AndroidDrawableFilePictureDataPdfMboundView1AndroidDrawableFilePdfDataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile = ((androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView1.getContext(), R.drawable.file_video)) : (dataImageMboundView1AndroidDrawableFilePictureDataPdfMboundView1AndroidDrawableFilePdfDataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile));
        }
        // batch finished
        if ((dirtyFlags & 0xc00L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.mboundView0, true);
            this.mboundView1.setOnClickListener(mCallback43);
            this.mboundView2.setOnClickListener(mCallback44);
        }
        if ((dirtyFlags & 0x900L) != 0) {
            // api target 1

            this.mboundView1.setOnLongClickListener(longClickListener);
        }
        if ((dirtyFlags & 0xa01L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataFileNameGetValue);
        }
        if ((dirtyFlags & 0xa6eL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setDrawableTop(this.mboundView1, dataVideoMboundView1AndroidDrawableFileVideoDataImageMboundView1AndroidDrawableFilePictureDataPdfMboundView1AndroidDrawableFilePdfDataAudioMboundView1AndroidDrawableFileAudioDataVoiceRecordingMboundView1AndroidDrawableAudioRecordingReplyPreviewDefaultMboundView1AndroidDrawableFile);
        }
        if ((dirtyFlags & 0xa10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataDownloadLabelGetValue);
        }
        if ((dirtyFlags & 0xa80L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(dataDownloadableViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.download();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.download();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.fileName
        flag 1 (0x2L): data.video
        flag 2 (0x3L): data.audio
        flag 3 (0x4L): data.pdf
        flag 4 (0x5L): data.downloadLabel
        flag 5 (0x6L): data.image
        flag 6 (0x7L): data.voiceRecording
        flag 7 (0x8L): data.downloadable
        flag 8 (0x9L): longClickListener
        flag 9 (0xaL): data
        flag 10 (0xbL): inflatedVisibility
        flag 11 (0xcL): null
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) ? @android:drawable/file_video : androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) ? @android:drawable/file_video : androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) ? @android:drawable/audio_recording_reply_preview_default : @android:drawable/file
    flag mapping end*/
    //end
}