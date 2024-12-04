package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageReplyContentCellBindingImpl extends ChatMessageReplyContentCellBinding  {

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
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageReplyContentCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ChatMessageReplyContentCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 12
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.data == variableId) {
            setData((org.linphone.activities.main.chat.data.ChatMessageContentData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageContentData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
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
                return onChangeDataPdf((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeDataDownloadable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeDataIsVoiceRecording((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeDataVideo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeDataIsConferenceSchedule((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeDataAudio((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeDataFilePath((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeDataConferenceSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeDataImage((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeDataGenericFile((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeDataFormattedDuration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
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
    private boolean onChangeDataPdf(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataPdf, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDownloadable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataDownloadable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsVoiceRecording(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsVoiceRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataVideo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsConferenceSchedule(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsConferenceSchedule, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataAudio(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataAudio, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataFilePath(androidx.lifecycle.MutableLiveData<java.lang.String> DataFilePath, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataConferenceSubject(androidx.lifecycle.MutableLiveData<java.lang.String> DataConferenceSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataImage(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataImage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataGenericFile(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataGenericFile, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataFormattedDuration(androidx.lifecycle.MutableLiveData<java.lang.String> DataFormattedDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFileName = null;
        java.lang.Boolean dataAudioGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue = false;
        float dataAloneFloat0fMboundView3AndroidDimenChatMessageSmallBubbleFileSize = 0f;
        java.lang.Boolean dataDownloadableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataPdf = null;
        java.lang.Boolean dataImageGetValue = null;
        android.graphics.drawable.Drawable dataVideoMboundView6AndroidDrawableFileVideoDataImageMboundView6AndroidDrawableFilePictureDataPdfMboundView6AndroidDrawableFilePdfDataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile = null;
        int dataVideoViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable dataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue = false;
        org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;
        java.lang.Boolean dataGenericFileGetValue = null;
        java.lang.String dataFormattedDurationGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue = false;
        java.lang.String dataFilePathGetValue = null;
        boolean dataDownloadableBooleanTrueDataPdf = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue = false;
        int dataIsVoiceRecordingViewVISIBLEViewGONE = 0;
        android.graphics.drawable.Drawable dataImageMboundView6AndroidDrawableFilePictureDataPdfMboundView6AndroidDrawableFilePdfDataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataDownloadable = null;
        java.lang.Boolean dataIsConferenceScheduleGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue = false;
        boolean dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudio = false;
        java.lang.String dataConferenceSubjectGetValue = null;
        boolean dataAlone = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsVoiceRecording = null;
        java.lang.String dataFileNameGetValue = null;
        float dataAloneFloat0fMboundView6AndroidDimenChatMessageSmallBubbleFileSize = 0f;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceScheduleGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataVideo = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsConferenceSchedule = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataAudio = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFilePath = null;
        java.lang.Boolean dataIsVoiceRecordingGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsVoiceRecordingGetValue = false;
        int dataIsConferenceScheduleViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataConferenceSubject = null;
        int dataImageViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataImage = null;
        float dataAloneFloat0fMboundView1AndroidDimenChatMessageSmallBubbleFileSize = 0f;
        java.lang.Boolean dataPdfGetValue = null;
        boolean dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudioBooleanTrueDataGenericFile = false;
        int dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudioBooleanTrueDataGenericFileViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataGenericFile = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFormattedDuration = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataGenericFileGetValue = false;
        java.lang.Boolean dataVideoGetValue = null;
        android.graphics.drawable.Drawable dataPdfMboundView6AndroidDrawableFilePdfDataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile = null;

        if ((dirtyFlags & 0x3fffL) != 0) {


            if ((dirtyFlags & 0x3001L) != 0) {

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
            if ((dirtyFlags & 0x3446L) != 0) {

                    if (data != null) {
                        // read data.downloadable
                        dataDownloadable = data.getDownloadable();
                    }
                    updateLiveDataRegistration(2, dataDownloadable);


                    if (dataDownloadable != null) {
                        // read data.downloadable.getValue()
                        dataDownloadableGetValue = dataDownloadable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataDownloadableGetValue);
                if((dirtyFlags & 0x3446L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
            }
            if ((dirtyFlags & 0x3000L) != 0) {

                    if (data != null) {
                        // read data.alone
                        dataAlone = data.isAlone();
                    }
                if((dirtyFlags & 0x3000L) != 0) {
                    if(dataAlone) {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x1000000000L;
                    }
                }


                    // read data.alone ? 0f : @android:dimen/chat_message_small_bubble_file_size
                    dataAloneFloat0fMboundView3AndroidDimenChatMessageSmallBubbleFileSize = ((dataAlone) ? (0f) : (mboundView3.getResources().getDimension(R.dimen.chat_message_small_bubble_file_size)));
                    // read data.alone ? 0f : @android:dimen/chat_message_small_bubble_file_size
                    dataAloneFloat0fMboundView6AndroidDimenChatMessageSmallBubbleFileSize = ((dataAlone) ? (0f) : (mboundView6.getResources().getDimension(R.dimen.chat_message_small_bubble_file_size)));
                    // read data.alone ? 0f : @android:dimen/chat_message_small_bubble_file_size
                    dataAloneFloat0fMboundView1AndroidDimenChatMessageSmallBubbleFileSize = ((dataAlone) ? (0f) : (mboundView1.getResources().getDimension(R.dimen.chat_message_small_bubble_file_size)));
            }
            if ((dirtyFlags & 0x3008L) != 0) {

                    if (data != null) {
                        // read data.isVoiceRecording
                        dataIsVoiceRecording = data.isVoiceRecording();
                    }
                    updateLiveDataRegistration(3, dataIsVoiceRecording);


                    if (dataIsVoiceRecording != null) {
                        // read data.isVoiceRecording.getValue()
                        dataIsVoiceRecordingGetValue = dataIsVoiceRecording.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isVoiceRecording.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsVoiceRecordingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsVoiceRecordingGetValue);
                if((dirtyFlags & 0x3008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsVoiceRecordingGetValue) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isVoiceRecording.getValue()) ? View.VISIBLE : View.GONE
                    dataIsVoiceRecordingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsVoiceRecordingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3252L) != 0) {

                    if (data != null) {
                        // read data.video
                        dataVideo = data.isVideo();
                    }
                    updateLiveDataRegistration(4, dataVideo);


                    if (dataVideo != null) {
                        // read data.video.getValue()
                        dataVideoGetValue = dataVideo.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataVideoGetValue);
                if((dirtyFlags & 0x3252L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0x3010L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }

                if ((dirtyFlags & 0x3010L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) ? View.VISIBLE : View.GONE
                        dataVideoViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x3020L) != 0) {

                    if (data != null) {
                        // read data.isConferenceSchedule
                        dataIsConferenceSchedule = data.isConferenceSchedule();
                    }
                    updateLiveDataRegistration(5, dataIsConferenceSchedule);


                    if (dataIsConferenceSchedule != null) {
                        // read data.isConferenceSchedule.getValue()
                        dataIsConferenceScheduleGetValue = dataIsConferenceSchedule.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceSchedule.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceScheduleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsConferenceScheduleGetValue);
                if((dirtyFlags & 0x3020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceScheduleGetValue) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceSchedule.getValue()) ? View.VISIBLE : View.GONE
                    dataIsConferenceScheduleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsConferenceScheduleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3080L) != 0) {

                    if (data != null) {
                        // read data.filePath
                        dataFilePath = data.getFilePath();
                    }
                    updateLiveDataRegistration(7, dataFilePath);


                    if (dataFilePath != null) {
                        // read data.filePath.getValue()
                        dataFilePathGetValue = dataFilePath.getValue();
                    }
            }
            if ((dirtyFlags & 0x3100L) != 0) {

                    if (data != null) {
                        // read data.conferenceSubject
                        dataConferenceSubject = data.getConferenceSubject();
                    }
                    updateLiveDataRegistration(8, dataConferenceSubject);


                    if (dataConferenceSubject != null) {
                        // read data.conferenceSubject.getValue()
                        dataConferenceSubjectGetValue = dataConferenceSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x3200L) != 0) {

                    if (data != null) {
                        // read data.image
                        dataImage = data.isImage();
                    }
                    updateLiveDataRegistration(9, dataImage);


                    if (dataImage != null) {
                        // read data.image.getValue()
                        dataImageGetValue = dataImage.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataImageGetValue);
                if((dirtyFlags & 0x10000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }
                if((dirtyFlags & 0x3200L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? View.VISIBLE : View.GONE
                    dataImageViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x3800L) != 0) {

                    if (data != null) {
                        // read data.formattedDuration
                        dataFormattedDuration = data.getFormattedDuration();
                    }
                    updateLiveDataRegistration(11, dataFormattedDuration);


                    if (dataFormattedDuration != null) {
                        // read data.formattedDuration.getValue()
                        dataFormattedDurationGetValue = dataFormattedDuration.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x410000L) != 0) {


            if ((dirtyFlags & 0x400000L) != 0) {

                    if (data != null) {
                        // read data.pdf
                        dataPdf = data.isPdf();
                    }
                    updateLiveDataRegistration(1, dataPdf);


                    if (dataPdf != null) {
                        // read data.pdf.getValue()
                        dataPdfGetValue = dataPdf.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataPdfGetValue);
                if((dirtyFlags & 0x4000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue) {
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x10000L) != 0) {

                    if (data != null) {
                        // read data.image
                        dataImage = data.isImage();
                    }
                    updateLiveDataRegistration(9, dataImage);


                    if (dataImage != null) {
                        // read data.image.getValue()
                        dataImageGetValue = dataImage.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataImageGetValue);
                if((dirtyFlags & 0x10000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }
                if((dirtyFlags & 0x3200L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }
            }
        }

        if ((dirtyFlags & 0x3446L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
                dataDownloadableBooleanTrueDataPdf = ((androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue));
            if((dirtyFlags & 0x3446L) != 0) {
                if(dataDownloadableBooleanTrueDataPdf) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x14000000L) != 0) {


            if ((dirtyFlags & 0x4000000L) != 0) {

                    if (data != null) {
                        // read data.pdf
                        dataPdf = data.isPdf();
                    }
                    updateLiveDataRegistration(1, dataPdf);


                    if (dataPdf != null) {
                        // read data.pdf.getValue()
                        dataPdfGetValue = dataPdf.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataPdfGetValue);
                if((dirtyFlags & 0x4000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue) {
                            dirtyFlags |= 0x80000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x10000000L) != 0) {

                    if (data != null) {
                        // read data.audio
                        dataAudio = data.isAudio();
                    }
                    updateLiveDataRegistration(6, dataAudio);


                    if (dataAudio != null) {
                        // read data.audio.getValue()
                        dataAudioGetValue = dataAudio.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataAudioGetValue);
                if((dirtyFlags & 0x40000000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
            }
        }

        if ((dirtyFlags & 0x3446L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue())
                dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudio = ((dataDownloadableBooleanTrueDataPdf) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue));
            if((dirtyFlags & 0x3446L) != 0) {
                if(dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudio) {
                        dirtyFlags |= 0x8000000000L;
                }
                else {
                        dirtyFlags |= 0x4000000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40000000000L) != 0) {

                if (data != null) {
                    // read data.audio
                    dataAudio = data.isAudio();
                }
                updateLiveDataRegistration(6, dataAudio);


                if (dataAudio != null) {
                    // read data.audio.getValue()
                    dataAudioGetValue = dataAudio.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataAudioGetValue);
            if((dirtyFlags & 0x40000000000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
                dataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile = ((androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.file_audio)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.file)));
        }
        if ((dirtyFlags & 0x4000000000L) != 0) {

                if (data != null) {
                    // read data.genericFile
                    dataGenericFile = data.isGenericFile();
                }
                updateLiveDataRegistration(10, dataGenericFile);


                if (dataGenericFile != null) {
                    // read data.genericFile.getValue()
                    dataGenericFileGetValue = dataGenericFile.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataGenericFileGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataGenericFileGetValue);
        }

        if ((dirtyFlags & 0x3446L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue())
                dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudioBooleanTrueDataGenericFile = ((dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudio) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataGenericFileGetValue));
            if((dirtyFlags & 0x3446L) != 0) {
                if(dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudioBooleanTrueDataGenericFile) {
                        dirtyFlags |= 0x20000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue()) ? View.VISIBLE : View.GONE
                dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudioBooleanTrueDataGenericFileViewVISIBLEViewGONE = ((dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudioBooleanTrueDataGenericFile) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x4000000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
                dataPdfMboundView6AndroidDrawableFilePdfDataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile = ((androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.file_pdf)) : (dataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile));
        }

        if ((dirtyFlags & 0x10000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
                dataImageMboundView6AndroidDrawableFilePictureDataPdfMboundView6AndroidDrawableFilePdfDataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile = ((androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.file_picture)) : (dataPdfMboundView6AndroidDrawableFilePdfDataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile));
        }

        if ((dirtyFlags & 0x3252L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) ? @android:drawable/file_video : androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
                dataVideoMboundView6AndroidDrawableFileVideoDataImageMboundView6AndroidDrawableFilePictureDataPdfMboundView6AndroidDrawableFilePdfDataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile = ((androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView6.getContext(), R.drawable.file_video)) : (dataImageMboundView6AndroidDrawableFilePictureDataPdfMboundView6AndroidDrawableFilePdfDataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile));
        }
        // batch finished
        if ((dirtyFlags & 0x3000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutSize(this.mboundView1, dataAloneFloat0fMboundView1AndroidDimenChatMessageSmallBubbleFileSize);
            org.linphone.utils.DataBindingUtilsKt.setLayoutSize(this.mboundView3, dataAloneFloat0fMboundView3AndroidDimenChatMessageSmallBubbleFileSize);
            org.linphone.utils.DataBindingUtilsKt.setLayoutSize(this.mboundView6, dataAloneFloat0fMboundView6AndroidDimenChatMessageSmallBubbleFileSize);
        }
        if ((dirtyFlags & 0x3080L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadImageWithCoil(this.mboundView1, dataFilePathGetValue);
            org.linphone.utils.DataBindingUtilsKt.loadVideoPreview(this.mboundView3, dataFilePathGetValue);
        }
        if ((dirtyFlags & 0x3200L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(dataImageViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setImageViewScaleType(this.mboundView1, android.widget.ImageView.ScaleType.CENTER_CROP);
            org.linphone.utils.DataBindingUtilsKt.setImageViewScaleType(this.mboundView3, android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        if ((dirtyFlags & 0x3001L) != 0) {
            // api target 4
            if(getBuildSdkInt() >= 4) {

                this.mboundView2.setContentDescription(dataFileNameGetValue);
                this.mboundView6.setContentDescription(dataFileNameGetValue);
            }
        }
        if ((dirtyFlags & 0x3010L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(dataVideoViewVISIBLEViewGONE);
            this.mboundView3.setVisibility(dataVideoViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3008L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(dataIsVoiceRecordingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3800L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataFormattedDurationGetValue);
        }
        if ((dirtyFlags & 0x3020L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(dataIsConferenceScheduleViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x3100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataConferenceSubjectGetValue);
        }
        if ((dirtyFlags & 0x3252L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView6, dataVideoMboundView6AndroidDrawableFileVideoDataImageMboundView6AndroidDrawableFilePictureDataPdfMboundView6AndroidDrawableFilePdfDataAudioMboundView6AndroidDrawableFileAudioMboundView6AndroidDrawableFile);
        }
        if ((dirtyFlags & 0x3446L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(dataDownloadableBooleanTrueDataPdfBooleanTrueDataAudioBooleanTrueDataGenericFileViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.fileName
        flag 1 (0x2L): data.pdf
        flag 2 (0x3L): data.downloadable
        flag 3 (0x4L): data.isVoiceRecording
        flag 4 (0x5L): data.video
        flag 5 (0x6L): data.isConferenceSchedule
        flag 6 (0x7L): data.audio
        flag 7 (0x8L): data.filePath
        flag 8 (0x9L): data.conferenceSubject
        flag 9 (0xaL): data.image
        flag 10 (0xbL): data.genericFile
        flag 11 (0xcL): data.formattedDuration
        flag 12 (0xdL): data
        flag 13 (0xeL): null
        flag 14 (0xfL): data.alone ? 0f : @android:dimen/chat_message_small_bubble_file_size
        flag 15 (0x10L): data.alone ? 0f : @android:dimen/chat_message_small_bubble_file_size
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) ? @android:drawable/file_video : androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) ? @android:drawable/file_video : androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) ? View.VISIBLE : View.GONE
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(data.isVoiceRecording.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(data.isVoiceRecording.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? @android:drawable/file_picture : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue())
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue())
        flag 30 (0x1fL): data.alone ? 0f : @android:dimen/chat_message_small_bubble_file_size
        flag 31 (0x20L): data.alone ? 0f : @android:dimen/chat_message_small_bubble_file_size
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceSchedule.getValue()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(data.isConferenceSchedule.getValue()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) ? View.VISIBLE : View.GONE
        flag 36 (0x25L): data.alone ? 0f : @android:dimen/chat_message_small_bubble_file_size
        flag 37 (0x26L): data.alone ? 0f : @android:dimen/chat_message_small_bubble_file_size
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue())
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue())
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue()) ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue()) ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? @android:drawable/file_pdf : androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? @android:drawable/file_audio : @android:drawable/file
    flag mapping end*/
    //end
}