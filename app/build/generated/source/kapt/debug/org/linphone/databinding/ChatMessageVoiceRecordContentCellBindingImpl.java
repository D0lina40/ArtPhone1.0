package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageVoiceRecordContentCellBindingImpl extends ChatMessageVoiceRecordContentCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final org.linphone.views.VoiceRecordProgressBar mboundView1;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback234;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageVoiceRecordContentCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ChatMessageVoiceRecordContentCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (org.linphone.views.VoiceRecordProgressBar) bindings[1];
        this.mboundView1.setTag(null);
        this.playVoiceRecord.setTag(null);
        this.recordingDuration.setTag(null);
        setRootTag(root);
        // listeners
        mCallback234 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.longClickListener);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageContentData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setInflatedVisibility(@Nullable java.lang.Integer InflatedVisibility) {
        this.mInflatedVisibility = InflatedVisibility;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.inflatedVisibility);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataIsVoiceRecordPlaying((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataVoiceRecordPlayingPosition((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeDataFormattedDuration((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeDataVoiceRecordDuration((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataIsVoiceRecordPlaying(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsVoiceRecordPlaying, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataVoiceRecordPlayingPosition(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataVoiceRecordPlayingPosition, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataFormattedDuration(androidx.lifecycle.MutableLiveData<java.lang.String> DataFormattedDuration, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataVoiceRecordDuration(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataVoiceRecordDuration, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsVoiceRecordPlayingGetValue = false;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsVoiceRecordPlaying = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordDurationGetValue = 0;
        int androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordPlayingPositionGetValue = 0;
        org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataVoiceRecordPlayingPosition = null;
        java.lang.String dataFormattedDurationGetValue = null;
        java.lang.Integer inflatedVisibility = mInflatedVisibility;
        java.lang.Integer dataVoiceRecordDurationGetValue = null;
        android.graphics.drawable.Drawable dataIsVoiceRecordPlayingPlayVoiceRecordAndroidDrawableRecordPauseDarkPlayVoiceRecordAndroidDrawableRecordPlayDark = null;
        int androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = 0;
        java.lang.Integer dataVoiceRecordPlayingPositionGetValue = null;
        int dataOutgoingMboundView1AndroidColorChatBubbleOutgoingColorDarkMboundView1AndroidColorChatBubbleIncomingColorDark = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataFormattedDuration = null;
        java.lang.Boolean dataIsVoiceRecordPlayingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataVoiceRecordDuration = null;
        boolean dataOutgoing = false;

        if ((dirtyFlags & 0x90L) != 0) {
        }
        if ((dirtyFlags & 0xafL) != 0) {


            if ((dirtyFlags & 0xa1L) != 0) {

                    if (data != null) {
                        // read data.isVoiceRecordPlaying()
                        dataIsVoiceRecordPlaying = data.isVoiceRecordPlaying();
                    }
                    updateLiveDataRegistration(0, dataIsVoiceRecordPlaying);


                    if (dataIsVoiceRecordPlaying != null) {
                        // read data.isVoiceRecordPlaying().getValue()
                        dataIsVoiceRecordPlayingGetValue = dataIsVoiceRecordPlaying.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isVoiceRecordPlaying().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsVoiceRecordPlayingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsVoiceRecordPlayingGetValue);
                if((dirtyFlags & 0xa1L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsVoiceRecordPlayingGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isVoiceRecordPlaying().getValue()) ? @android:drawable/record_pause_dark : @android:drawable/record_play_dark
                    dataIsVoiceRecordPlayingPlayVoiceRecordAndroidDrawableRecordPauseDarkPlayVoiceRecordAndroidDrawableRecordPlayDark = ((androidxDatabindingViewDataBindingSafeUnboxDataIsVoiceRecordPlayingGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(playVoiceRecord.getContext(), R.drawable.record_pause_dark)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(playVoiceRecord.getContext(), R.drawable.record_play_dark)));
            }
            if ((dirtyFlags & 0xa2L) != 0) {

                    if (data != null) {
                        // read data.voiceRecordPlayingPosition
                        dataVoiceRecordPlayingPosition = data.getVoiceRecordPlayingPosition();
                    }
                    updateLiveDataRegistration(1, dataVoiceRecordPlayingPosition);


                    if (dataVoiceRecordPlayingPosition != null) {
                        // read data.voiceRecordPlayingPosition.getValue()
                        dataVoiceRecordPlayingPositionGetValue = dataVoiceRecordPlayingPosition.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecordPlayingPosition.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordPlayingPositionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataVoiceRecordPlayingPositionGetValue);
            }
            if ((dirtyFlags & 0xa4L) != 0) {

                    if (data != null) {
                        // read data.formattedDuration
                        dataFormattedDuration = data.getFormattedDuration();
                    }
                    updateLiveDataRegistration(2, dataFormattedDuration);


                    if (dataFormattedDuration != null) {
                        // read data.formattedDuration.getValue()
                        dataFormattedDurationGetValue = dataFormattedDuration.getValue();
                    }
            }
            if ((dirtyFlags & 0xa8L) != 0) {

                    if (data != null) {
                        // read data.voiceRecordDuration
                        dataVoiceRecordDuration = data.getVoiceRecordDuration();
                    }
                    updateLiveDataRegistration(3, dataVoiceRecordDuration);


                    if (dataVoiceRecordDuration != null) {
                        // read data.voiceRecordDuration.getValue()
                        dataVoiceRecordDurationGetValue = dataVoiceRecordDuration.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.voiceRecordDuration.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordDurationGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataVoiceRecordDurationGetValue);
            }
            if ((dirtyFlags & 0xa0L) != 0) {

                    if (data != null) {
                        // read data.outgoing
                        dataOutgoing = data.isOutgoing();
                    }
                if((dirtyFlags & 0xa0L) != 0) {
                    if(dataOutgoing) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read data.outgoing ? @android:color/chat_bubble_outgoing_color_dark : @android:color/chat_bubble_incoming_color_dark
                    dataOutgoingMboundView1AndroidColorChatBubbleOutgoingColorDarkMboundView1AndroidColorChatBubbleIncomingColorDark = ((dataOutgoing) ? (getColorFromResource(mboundView1, R.color.chat_bubble_outgoing_color_dark)) : (getColorFromResource(mboundView1, R.color.chat_bubble_incoming_color_dark)));
            }
        }
        if ((dirtyFlags & 0xc0L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility)
                androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility = androidx.databinding.ViewDataBinding.safeUnbox(inflatedVisibility);
        }
        // batch finished
        if ((dirtyFlags & 0x90L) != 0) {
            // api target 1

            this.mboundView0.setOnLongClickListener(longClickListener);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.mboundView0.setVisibility(androidxDatabindingViewDataBindingSafeUnboxInflatedVisibility);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setInflatedViewStubLifecycleOwner(this.mboundView0, true);
            this.playVoiceRecord.setOnClickListener(mCallback234);
        }
        if ((dirtyFlags & 0xa2L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPrimaryProgress(this.mboundView1, androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordPlayingPositionGetValue);
            org.linphone.utils.DataBindingUtilsKt.setSecProgress(this.mboundView1, androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordPlayingPositionGetValue);
        }
        if ((dirtyFlags & 0xa8L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setProgressMax(this.mboundView1, androidxDatabindingViewDataBindingSafeUnboxDataVoiceRecordDurationGetValue);
        }
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSecProgressTint(this.mboundView1, dataOutgoingMboundView1AndroidColorChatBubbleOutgoingColorDarkMboundView1AndroidColorChatBubbleIncomingColorDark);
        }
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.playVoiceRecord, dataIsVoiceRecordPlayingPlayVoiceRecordAndroidDrawableRecordPauseDarkPlayVoiceRecordAndroidDrawableRecordPlayDark);
        }
        if ((dirtyFlags & 0xa4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.recordingDuration, dataFormattedDurationGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data.isVoiceRecordPlaying() != null
        boolean dataIsVoiceRecordPlayingJavaLangObjectNull = false;
        // data.isVoiceRecordPlaying()
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsVoiceRecordPlaying = null;
        // data.isVoiceRecordPlaying().getValue()
        java.lang.Boolean dataIsVoiceRecordPlayingGetValue = null;
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.main.chat.data.ChatMessageContentData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            dataIsVoiceRecordPlaying = data.isVoiceRecordPlaying();

            dataIsVoiceRecordPlayingJavaLangObjectNull = (dataIsVoiceRecordPlaying) != (null);
            if (dataIsVoiceRecordPlayingJavaLangObjectNull) {


                dataIsVoiceRecordPlayingGetValue = dataIsVoiceRecordPlaying.getValue();
                if (dataIsVoiceRecordPlayingGetValue) {




                    data.pauseVoiceRecording();
                }
                else {




                    data.playVoiceRecording();
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.isVoiceRecordPlaying()
        flag 1 (0x2L): data.voiceRecordPlayingPosition
        flag 2 (0x3L): data.formattedDuration
        flag 3 (0x4L): data.voiceRecordDuration
        flag 4 (0x5L): longClickListener
        flag 5 (0x6L): data
        flag 6 (0x7L): inflatedVisibility
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(data.isVoiceRecordPlaying().getValue()) ? @android:drawable/record_pause_dark : @android:drawable/record_play_dark
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(data.isVoiceRecordPlaying().getValue()) ? @android:drawable/record_pause_dark : @android:drawable/record_play_dark
        flag 10 (0xbL): data.outgoing ? @android:color/chat_bubble_outgoing_color_dark : @android:color/chat_bubble_incoming_color_dark
        flag 11 (0xcL): data.outgoing ? @android:color/chat_bubble_outgoing_color_dark : @android:color/chat_bubble_incoming_color_dark
    flag mapping end*/
    //end
}