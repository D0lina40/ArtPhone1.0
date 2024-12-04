package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageContentCellBindingImpl extends ChatMessageContentCellBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_content, 1);
        sViewsWithIds.put(R.id.video_content, 2);
        sViewsWithIds.put(R.id.voice_recording_content, 3);
        sViewsWithIds.put(R.id.conference_invitation_content, 4);
        sViewsWithIds.put(R.id.generic_file_content, 5);
        sViewsWithIds.put(R.id.downloadable_file_content, 6);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final com.google.android.material.progressindicator.CircularProgressIndicator mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageContentCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ChatMessageContentCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[4])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[6])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[5])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[1])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[2])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[3])
            );
        this.conferenceInvitationContent.setContainingBinding(this);
        this.downloadableFileContent.setContainingBinding(this);
        this.genericFileContent.setContainingBinding(this);
        this.imageContent.setContainingBinding(this);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView7 = (com.google.android.material.progressindicator.CircularProgressIndicator) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.videoContent.setContainingBinding(this);
        this.voiceRecordingContent.setContainingBinding(this);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
        else if (BR.longClickListener == variableId) {
            setLongClickListener((android.view.View.OnLongClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageContentData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setLongClickListener(@Nullable android.view.View.OnLongClickListener LongClickListener) {
        this.mLongClickListener = LongClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.longClickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataPdf((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataDownloadable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeDataVideo((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeDataAudio((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeDataConferenceSchedule((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeDataFileTransferProgressInt((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 6 :
                return onChangeDataImage((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeDataVoiceRecording((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeDataFileTransferProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeDataGenericFile((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataPdf(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataPdf, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDownloadable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataDownloadable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataVideo(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataAudio(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataAudio, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataConferenceSchedule(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataConferenceSchedule, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataFileTransferProgressInt(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataFileTransferProgressInt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataImage(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataImage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataVoiceRecording(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataVoiceRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataFileTransferProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataFileTransferProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataGenericFile(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataGenericFile, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        int dataDownloadableViewVISIBLEViewGONE = 0;
        java.lang.Boolean dataConferenceScheduleGetValue = null;
        java.lang.Boolean dataAudioGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue = false;
        java.lang.Boolean dataDownloadableGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataPdf = null;
        java.lang.Boolean dataImageGetValue = null;
        boolean dataDownloadableDataImageBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue = false;
        org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;
        java.lang.Boolean dataGenericFileGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue = false;
        boolean dataDownloadableDataConferenceScheduleBooleanFalse = false;
        java.lang.Integer dataFileTransferProgressIntGetValue = null;
        boolean dataDownloadableDataVideoBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataDownloadable = null;
        int dataAudioBooleanTrueDataPdfBooleanTrueDataGenericFileViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataConferenceScheduleGetValue = false;
        int dataDownloadableDataVoiceRecordingBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue = false;
        int dataDownloadableDataImageBooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordingGetValue = false;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        java.lang.Boolean dataFileTransferProgressGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataVideo = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataAudio = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataConferenceSchedule = null;
        boolean dataDownloadableDataVoiceRecordingBooleanFalse = false;
        int androidxDatabindingViewDataBindingSafeUnboxDataFileTransferProgressIntGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataFileTransferProgressInt = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataImage = null;
        int dataDownloadableDataConferenceScheduleBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.Boolean dataPdfGetValue = null;
        boolean DataDownloadable1 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataVoiceRecording = null;
        boolean dataAudioBooleanTrueDataPdfBooleanTrueDataGenericFile = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataFileTransferProgress = null;
        java.lang.Boolean dataVoiceRecordingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataGenericFile = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataGenericFileGetValue = false;
        int dataFileTransferProgressViewVISIBLEViewGONE = 0;
        java.lang.Boolean dataVideoGetValue = null;
        java.lang.String dataFileTransferProgressIntJavaLangString = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataFileTransferProgressGetValue = false;
        int dataDownloadableDataVideoBooleanFalseViewVISIBLEViewGONE = 0;
        boolean dataAudioBooleanTrueDataPdf = false;

        if ((dirtyFlags & 0x17ffL) != 0) {


            if ((dirtyFlags & 0x14d6L) != 0) {

                    if (data != null) {
                        // read data.downloadable
                        dataDownloadable = data.getDownloadable();
                    }
                    updateLiveDataRegistration(1, dataDownloadable);


                    if (dataDownloadable != null) {
                        // read data.downloadable.getValue()
                        dataDownloadableGetValue = dataDownloadable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataDownloadableGetValue);
                if((dirtyFlags & 0x1402L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }

                if ((dirtyFlags & 0x1402L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? View.VISIBLE : View.GONE
                        dataDownloadableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }

                    // read !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue())
                    DataDownloadable1 = !androidxDatabindingViewDataBindingSafeUnboxDataDownloadableGetValue;
                if((dirtyFlags & 0x1442L) != 0) {
                    if(DataDownloadable1) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }
                if((dirtyFlags & 0x1412L) != 0) {
                    if(DataDownloadable1) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x1406L) != 0) {
                    if(DataDownloadable1) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }
                if((dirtyFlags & 0x1482L) != 0) {
                    if(DataDownloadable1) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1609L) != 0) {

                    if (data != null) {
                        // read data.audio
                        dataAudio = data.isAudio();
                    }
                    updateLiveDataRegistration(3, dataAudio);


                    if (dataAudio != null) {
                        // read data.audio.getValue()
                        dataAudioGetValue = dataAudio.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataAudioGetValue);
                if((dirtyFlags & 0x1609L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x1420L) != 0) {

                    if (data != null) {
                        // read data.fileTransferProgressInt
                        dataFileTransferProgressInt = data.getFileTransferProgressInt();
                    }
                    updateLiveDataRegistration(5, dataFileTransferProgressInt);


                    if (dataFileTransferProgressInt != null) {
                        // read data.fileTransferProgressInt.getValue()
                        dataFileTransferProgressIntGetValue = dataFileTransferProgressInt.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.fileTransferProgressInt.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataFileTransferProgressIntGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataFileTransferProgressIntGetValue);
                    // read (data.fileTransferProgressInt.getValue()) + ("%")
                    dataFileTransferProgressIntJavaLangString = (dataFileTransferProgressIntGetValue) + ("%");
            }
            if ((dirtyFlags & 0x1500L) != 0) {

                    if (data != null) {
                        // read data.fileTransferProgress
                        dataFileTransferProgress = data.getFileTransferProgress();
                    }
                    updateLiveDataRegistration(8, dataFileTransferProgress);


                    if (dataFileTransferProgress != null) {
                        // read data.fileTransferProgress.getValue()
                        dataFileTransferProgressGetValue = dataFileTransferProgress.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.fileTransferProgress.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataFileTransferProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataFileTransferProgressGetValue);
                if((dirtyFlags & 0x1500L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataFileTransferProgressGetValue) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.fileTransferProgress.getValue()) ? View.VISIBLE : View.GONE
                    dataFileTransferProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataFileTransferProgressGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x1800L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x2000000000L) != 0) {

                if (data != null) {
                    // read data.pdf
                    dataPdf = data.isPdf();
                }
                updateLiveDataRegistration(0, dataPdf);


                if (dataPdf != null) {
                    // read data.pdf.getValue()
                    dataPdfGetValue = dataPdf.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataPdfGetValue);
        }
        if ((dirtyFlags & 0x100000L) != 0) {

                if (data != null) {
                    // read data.video
                    dataVideo = data.isVideo();
                }
                updateLiveDataRegistration(2, dataVideo);


                if (dataVideo != null) {
                    // read data.video.getValue()
                    dataVideoGetValue = dataVideo.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataVideoGetValue);
        }
        if ((dirtyFlags & 0x40000L) != 0) {

                if (data != null) {
                    // read data.conferenceSchedule
                    dataConferenceSchedule = data.isConferenceSchedule();
                }
                updateLiveDataRegistration(4, dataConferenceSchedule);


                if (dataConferenceSchedule != null) {
                    // read data.conferenceSchedule.getValue()
                    dataConferenceScheduleGetValue = dataConferenceSchedule.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.conferenceSchedule.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataConferenceScheduleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataConferenceScheduleGetValue);
        }
        if ((dirtyFlags & 0x10000L) != 0) {

                if (data != null) {
                    // read data.image
                    dataImage = data.isImage();
                }
                updateLiveDataRegistration(6, dataImage);


                if (dataImage != null) {
                    // read data.image.getValue()
                    dataImageGetValue = dataImage.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataImageGetValue);
        }
        if ((dirtyFlags & 0x10000000L) != 0) {

                if (data != null) {
                    // read data.voiceRecording
                    dataVoiceRecording = data.isVoiceRecording();
                }
                updateLiveDataRegistration(7, dataVoiceRecording);


                if (dataVoiceRecording != null) {
                    // read data.voiceRecording.getValue()
                    dataVoiceRecordingGetValue = dataVoiceRecording.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataVoiceRecordingGetValue);
        }

        if ((dirtyFlags & 0x1442L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) : false
                dataDownloadableDataImageBooleanFalse = ((DataDownloadable1) ? (androidxDatabindingViewDataBindingSafeUnboxDataImageGetValue) : (false));
            if((dirtyFlags & 0x1442L) != 0) {
                if(dataDownloadableDataImageBooleanFalse) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) : false ? View.VISIBLE : View.GONE
                dataDownloadableDataImageBooleanFalseViewVISIBLEViewGONE = ((dataDownloadableDataImageBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1412L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.conferenceSchedule.getValue()) : false
                dataDownloadableDataConferenceScheduleBooleanFalse = ((DataDownloadable1) ? (androidxDatabindingViewDataBindingSafeUnboxDataConferenceScheduleGetValue) : (false));
            if((dirtyFlags & 0x1412L) != 0) {
                if(dataDownloadableDataConferenceScheduleBooleanFalse) {
                        dirtyFlags |= 0x40000000L;
                }
                else {
                        dirtyFlags |= 0x20000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.conferenceSchedule.getValue()) : false ? View.VISIBLE : View.GONE
                dataDownloadableDataConferenceScheduleBooleanFalseViewVISIBLEViewGONE = ((dataDownloadableDataConferenceScheduleBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1406L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) : false
                dataDownloadableDataVideoBooleanFalse = ((DataDownloadable1) ? (androidxDatabindingViewDataBindingSafeUnboxDataVideoGetValue) : (false));
            if((dirtyFlags & 0x1406L) != 0) {
                if(dataDownloadableDataVideoBooleanFalse) {
                        dirtyFlags |= 0x1000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) : false ? View.VISIBLE : View.GONE
                dataDownloadableDataVideoBooleanFalseViewVISIBLEViewGONE = ((dataDownloadableDataVideoBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1482L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) : false
                dataDownloadableDataVoiceRecordingBooleanFalse = ((DataDownloadable1) ? (androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordingGetValue) : (false));
            if((dirtyFlags & 0x1482L) != 0) {
                if(dataDownloadableDataVoiceRecordingBooleanFalse) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) : false ? View.VISIBLE : View.GONE
                dataDownloadableDataVoiceRecordingBooleanFalseViewVISIBLEViewGONE = ((dataDownloadableDataVoiceRecordingBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x1609L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
                dataAudioBooleanTrueDataPdf = ((androidxDatabindingViewDataBindingSafeUnboxDataAudioGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataPdfGetValue));
            if((dirtyFlags & 0x1609L) != 0) {
                if(dataAudioBooleanTrueDataPdf) {
                        dirtyFlags |= 0x100000000L;
                }
                else {
                        dirtyFlags |= 0x80000000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80000000L) != 0) {

                if (data != null) {
                    // read data.genericFile
                    dataGenericFile = data.isGenericFile();
                }
                updateLiveDataRegistration(9, dataGenericFile);


                if (dataGenericFile != null) {
                    // read data.genericFile.getValue()
                    dataGenericFileGetValue = dataGenericFile.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataGenericFileGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataGenericFileGetValue);
        }

        if ((dirtyFlags & 0x1609L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue())
                dataAudioBooleanTrueDataPdfBooleanTrueDataGenericFile = ((dataAudioBooleanTrueDataPdf) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataGenericFileGetValue));
            if((dirtyFlags & 0x1609L) != 0) {
                if(dataAudioBooleanTrueDataPdfBooleanTrueDataGenericFile) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue()) ? View.VISIBLE : View.GONE
                dataAudioBooleanTrueDataPdfBooleanTrueDataGenericFileViewVISIBLEViewGONE = ((dataAudioBooleanTrueDataPdfBooleanTrueDataGenericFile) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x1412L) != 0) {
            // api target 1

            if (!this.conferenceInvitationContent.isInflated()) this.conferenceInvitationContent.getViewStub().setVisibility(dataDownloadableDataConferenceScheduleBooleanFalseViewVISIBLEViewGONE);
            if (this.conferenceInvitationContent.isInflated()) this.conferenceInvitationContent.getBinding().setVariable(BR.inflatedVisibility, dataDownloadableDataConferenceScheduleBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1400L) != 0) {
            // api target 1

            if (this.conferenceInvitationContent.isInflated()) this.conferenceInvitationContent.getBinding().setVariable(BR.data, data);
            if (this.downloadableFileContent.isInflated()) this.downloadableFileContent.getBinding().setVariable(BR.data, data);
            if (this.genericFileContent.isInflated()) this.genericFileContent.getBinding().setVariable(BR.data, data);
            if (this.imageContent.isInflated()) this.imageContent.getBinding().setVariable(BR.data, data);
            if (this.videoContent.isInflated()) this.videoContent.getBinding().setVariable(BR.data, data);
            if (this.voiceRecordingContent.isInflated()) this.voiceRecordingContent.getBinding().setVariable(BR.data, data);
        }
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            if (this.conferenceInvitationContent.isInflated()) this.conferenceInvitationContent.getBinding().setVariable(BR.longClickListener, longClickListener);
            if (this.downloadableFileContent.isInflated()) this.downloadableFileContent.getBinding().setVariable(BR.longClickListener, longClickListener);
            if (this.genericFileContent.isInflated()) this.genericFileContent.getBinding().setVariable(BR.longClickListener, longClickListener);
            if (this.imageContent.isInflated()) this.imageContent.getBinding().setVariable(BR.longClickListener, longClickListener);
            if (this.videoContent.isInflated()) this.videoContent.getBinding().setVariable(BR.longClickListener, longClickListener);
            if (this.voiceRecordingContent.isInflated()) this.voiceRecordingContent.getBinding().setVariable(BR.longClickListener, longClickListener);
        }
        if ((dirtyFlags & 0x1402L) != 0) {
            // api target 1

            if (!this.downloadableFileContent.isInflated()) this.downloadableFileContent.getViewStub().setVisibility(dataDownloadableViewVISIBLEViewGONE);
            if (this.downloadableFileContent.isInflated()) this.downloadableFileContent.getBinding().setVariable(BR.inflatedVisibility, dataDownloadableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1609L) != 0) {
            // api target 1

            if (!this.genericFileContent.isInflated()) this.genericFileContent.getViewStub().setVisibility(dataAudioBooleanTrueDataPdfBooleanTrueDataGenericFileViewVISIBLEViewGONE);
            if (this.genericFileContent.isInflated()) this.genericFileContent.getBinding().setVariable(BR.inflatedVisibility, dataAudioBooleanTrueDataPdfBooleanTrueDataGenericFileViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1442L) != 0) {
            // api target 1

            if (!this.imageContent.isInflated()) this.imageContent.getViewStub().setVisibility(dataDownloadableDataImageBooleanFalseViewVISIBLEViewGONE);
            if (this.imageContent.isInflated()) this.imageContent.getBinding().setVariable(BR.inflatedVisibility, dataDownloadableDataImageBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1500L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(dataFileTransferProgressViewVISIBLEViewGONE);
            this.mboundView8.setVisibility(dataFileTransferProgressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1420L) != 0) {
            // api target 1

            this.mboundView7.setProgress(androidxDatabindingViewDataBindingSafeUnboxDataFileTransferProgressIntGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, dataFileTransferProgressIntJavaLangString);
        }
        if ((dirtyFlags & 0x1406L) != 0) {
            // api target 1

            if (!this.videoContent.isInflated()) this.videoContent.getViewStub().setVisibility(dataDownloadableDataVideoBooleanFalseViewVISIBLEViewGONE);
            if (this.videoContent.isInflated()) this.videoContent.getBinding().setVariable(BR.inflatedVisibility, dataDownloadableDataVideoBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1482L) != 0) {
            // api target 1

            if (!this.voiceRecordingContent.isInflated()) this.voiceRecordingContent.getViewStub().setVisibility(dataDownloadableDataVoiceRecordingBooleanFalseViewVISIBLEViewGONE);
            if (this.voiceRecordingContent.isInflated()) this.voiceRecordingContent.getBinding().setVariable(BR.inflatedVisibility, dataDownloadableDataVoiceRecordingBooleanFalseViewVISIBLEViewGONE);
        }
        if (conferenceInvitationContent.getBinding() != null) {
            executeBindingsOn(conferenceInvitationContent.getBinding());
        }
        if (downloadableFileContent.getBinding() != null) {
            executeBindingsOn(downloadableFileContent.getBinding());
        }
        if (genericFileContent.getBinding() != null) {
            executeBindingsOn(genericFileContent.getBinding());
        }
        if (imageContent.getBinding() != null) {
            executeBindingsOn(imageContent.getBinding());
        }
        if (videoContent.getBinding() != null) {
            executeBindingsOn(videoContent.getBinding());
        }
        if (voiceRecordingContent.getBinding() != null) {
            executeBindingsOn(voiceRecordingContent.getBinding());
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.pdf
        flag 1 (0x2L): data.downloadable
        flag 2 (0x3L): data.video
        flag 3 (0x4L): data.audio
        flag 4 (0x5L): data.conferenceSchedule
        flag 5 (0x6L): data.fileTransferProgressInt
        flag 6 (0x7L): data.image
        flag 7 (0x8L): data.voiceRecording
        flag 8 (0x9L): data.fileTransferProgress
        flag 9 (0xaL): data.genericFile
        flag 10 (0xbL): data
        flag 11 (0xcL): longClickListener
        flag 12 (0xdL): null
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) : false
        flag 16 (0x11L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) : false
        flag 17 (0x12L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.conferenceSchedule.getValue()) : false
        flag 18 (0x13L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.conferenceSchedule.getValue()) : false
        flag 19 (0x14L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) : false
        flag 20 (0x15L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) : false
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) : false ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) : false ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.image.getValue()) : false ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) : false
        flag 28 (0x1dL): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecording.getValue()) : false
        flag 29 (0x1eL): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.conferenceSchedule.getValue()) : false ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.conferenceSchedule.getValue()) : false ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue())
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.genericFile.getValue())
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(data.fileTransferProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(data.fileTransferProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) : false ? View.VISIBLE : View.GONE
        flag 36 (0x25L): !androidx.databinding.ViewDataBinding.safeUnbox(data.downloadable.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.video.getValue()) : false ? View.VISIBLE : View.GONE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(data.audio.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.pdf.getValue())
    flag mapping end*/
    //end
}