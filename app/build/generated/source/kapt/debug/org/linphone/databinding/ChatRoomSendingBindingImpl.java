package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomSendingBindingImpl extends ChatRoomSendingBinding implements org.linphone.generated.callback.OnClickListener.Listener, org.linphone.generated.callback.EmojiPickedListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.stubbed_message_to_reply_to, 2);
        sViewsWithIds.put(R.id.stubbed_voice_recording, 3);
        sViewsWithIds.put(R.id.reply_barrier, 16);
        sViewsWithIds.put(R.id.voice_barrier, 17);
        sViewsWithIds.put(R.id.chat_message_reply_voice_barrier, 18);
        sViewsWithIds.put(R.id.attached_files, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.Group mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback89;
    @Nullable
    private final android.view.View.OnClickListener mCallback87;
    @Nullable
    private final org.linphone.utils.EmojiPickedListener mCallback86;
    @Nullable
    private final android.view.View.OnClickListener mCallback88;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener messageandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of chatSendingViewModel.textToSend.getValue()
            //         is chatSendingViewModel.textToSend.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(message);
            // localize variables for thread safety
            // chatSendingViewModel.textToSend != null
            boolean chatSendingViewModelTextToSendJavaLangObjectNull = false;
            // chatSendingViewModel
            org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel = mChatSendingViewModel;
            // chatSendingViewModel.textToSend.getValue()
            java.lang.String chatSendingViewModelTextToSendGetValue = null;
            // chatSendingViewModel.textToSend
            androidx.lifecycle.MutableLiveData<java.lang.String> chatSendingViewModelTextToSend = null;
            // chatSendingViewModel != null
            boolean chatSendingViewModelJavaLangObjectNull = false;



            chatSendingViewModelJavaLangObjectNull = (chatSendingViewModel) != (null);
            if (chatSendingViewModelJavaLangObjectNull) {


                chatSendingViewModelTextToSend = chatSendingViewModel.getTextToSend();

                chatSendingViewModelTextToSendJavaLangObjectNull = (chatSendingViewModelTextToSend) != (null);
                if (chatSendingViewModelTextToSendJavaLangObjectNull) {




                    chatSendingViewModelTextToSend.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ChatRoomSendingBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private ChatRoomSendingBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 14
            , (android.widget.ImageView) bindings[7]
            , (android.widget.HorizontalScrollView) bindings[19]
            , (android.widget.ProgressBar) bindings[14]
            , (android.view.View) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (androidx.constraintlayout.widget.Barrier) bindings[18]
            , (androidx.emoji2.emojipicker.EmojiPickerView) bindings[6]
            , (android.widget.ImageView) bindings[10]
            , (org.linphone.activities.main.chat.views.RichEditText) bindings[9]
            , (androidx.constraintlayout.widget.Barrier) bindings[16]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[11]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[2])
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[3])
            , (androidx.constraintlayout.widget.Barrier) bindings[17]
            , (android.widget.ImageView) bindings[8]
            , (android.view.View) bindings[4]
            );
        this.attachFile.setTag(null);
        this.attachingFilesInProgress.setTag(null);
        this.attachingFilesInProgressBackground.setTag(null);
        this.attachingFilesInProgressLabel.setTag(null);
        this.emojiPicker.setTag(null);
        this.emojiPickerToggle.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.Group) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.message.setTag(null);
        this.sendEphemeralMessage.setTag(null);
        this.sendMessage.setTag(null);
        this.stubbedMessageToReplyTo.setContainingBinding(this);
        this.stubbedVoiceRecording.setContainingBinding(this);
        this.voiceRecord.setTag(null);
        this.voiceRecordingSeparator.setTag(null);
        setRootTag(root);
        // listeners
        mCallback89 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback87 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback86 = new org.linphone.generated.callback.EmojiPickedListener(this, 1);
        mCallback88 = new org.linphone.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000L;
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
        if (BR.attachFileClickListener == variableId) {
            setAttachFileClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.voiceRecordingTouchListener == variableId) {
            setVoiceRecordingTouchListener((android.view.View.OnTouchListener) variable);
        }
        else if (BR.chatSendingViewModel == variableId) {
            setChatSendingViewModel((org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel) variable);
        }
        else if (BR.cancelReplyToClickListener == variableId) {
            setCancelReplyToClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAttachFileClickListener(@Nullable android.view.View.OnClickListener AttachFileClickListener) {
        this.mAttachFileClickListener = AttachFileClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.attachFileClickListener);
        super.requestRebind();
    }
    public void setVoiceRecordingTouchListener(@Nullable android.view.View.OnTouchListener VoiceRecordingTouchListener) {
        this.mVoiceRecordingTouchListener = VoiceRecordingTouchListener;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.voiceRecordingTouchListener);
        super.requestRebind();
    }
    public void setChatSendingViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel ChatSendingViewModel) {
        this.mChatSendingViewModel = ChatSendingViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.chatSendingViewModel);
        super.requestRebind();
    }
    public void setCancelReplyToClickListener(@Nullable android.view.View.OnClickListener CancelReplyToClickListener) {
        this.mCancelReplyToClickListener = CancelReplyToClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.cancelReplyToClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeChatSendingViewModelIsPendingAnswer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeChatSendingViewModelAttachments((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData>>) object, fieldId);
            case 2 :
                return onChangeChatSendingViewModelIsEmojiPickerOpen((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeChatSendingViewModelSendMessageEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeChatSendingViewModelIsVoiceRecording((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeChatSendingViewModelIsPendingVoiceRecord((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeChatSendingViewModelPendingChatMessageToReplyTo((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData>) object, fieldId);
            case 7 :
                return onChangeChatSendingViewModelAttachingFileInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeChatSendingViewModelIsFileTransferAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeChatSendingViewModelAttachFileEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeChatSendingViewModelTextToSend((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 11 :
                return onChangeChatSendingViewModelAttachFilePending((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 12 :
                return onChangeChatSendingViewModelIsEmojiPickerVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 13 :
                return onChangeChatSendingViewModelIsReadOnly((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsPendingAnswer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsPendingAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelAttachments(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData>> ChatSendingViewModelAttachments, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsEmojiPickerOpen(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsEmojiPickerOpen, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelSendMessageEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelSendMessageEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsVoiceRecording(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsVoiceRecording, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsPendingVoiceRecord(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsPendingVoiceRecord, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelPendingChatMessageToReplyTo(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData> ChatSendingViewModelPendingChatMessageToReplyTo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelAttachingFileInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelAttachingFileInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsFileTransferAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsFileTransferAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelAttachFileEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelAttachFileEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelTextToSend(androidx.lifecycle.MutableLiveData<java.lang.String> ChatSendingViewModelTextToSend, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelAttachFilePending(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelAttachFilePending, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsEmojiPickerVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsEmojiPickerVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsReadOnly(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsReadOnly, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
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
        android.view.View.OnClickListener attachFileClickListener = mAttachFileClickListener;
        boolean chatSendingViewModelAttachmentsSizeInt0 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelIsPendingAnswer = null;
        java.lang.Boolean chatSendingViewModelSendMessageEnabledGetValue = null;
        boolean chatSendingViewModelAttachingFileInProgress = false;
        java.lang.Boolean chatSendingViewModelIsPendingVoiceRecordGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData>> chatSendingViewModelAttachments = null;
        java.lang.Boolean chatSendingViewModelIsPendingAnswerGetValue = null;
        java.lang.Boolean chatSendingViewModelIsEmojiPickerVisibleGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelIsEmojiPickerOpen = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelSendMessageEnabled = null;
        int chatSendingViewModelIsReadOnlyViewModelChatRoomIsEphemeralEnabledBooleanFalseViewVISIBLEViewGONE = 0;
        boolean chatSendingViewModelIsReadOnly = false;
        java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData> chatSendingViewModelAttachmentsGetValue = null;
        int chatSendingViewModelAttachingFileInProgressBooleanTrueChatSendingViewModelAttachmentsSizeInt0ViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsVoiceRecordingGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelIsVoiceRecording = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelIsPendingVoiceRecord = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData> chatSendingViewModelPendingChatMessageToReplyTo = null;
        int chatSendingViewModelIsPendingAnswerViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelAttachingFileInProgress1 = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFileEnabledGetValue = false;
        android.view.View.OnTouchListener voiceRecordingTouchListener = mVoiceRecordingTouchListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFilePendingGetValue = false;
        int chatSendingViewModelIsPendingVoiceRecordChatSendingViewModelAttachmentsSizeInt0BooleanFalseViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue = false;
        int chatSendingViewModelIsPendingVoiceRecordViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelIsFileTransferAvailable = null;
        float chatSendingViewModelIsEmojiPickerVisibleMessageAndroidDimenMargin0dpMessageAndroidDimenChatMessageSendingIconsMargin = 0f;
        boolean viewModelChatRoomIsEphemeralEnabled = false;
        java.lang.Boolean chatSendingViewModelAttachFilePendingGetValue = null;
        java.lang.Boolean chatSendingViewModelAttachFileEnabledGetValue = null;
        java.lang.Boolean chatSendingViewModelAttachingFileInProgressGetValue = null;
        boolean chatSendingViewModelAttachFileEnabledChatSendingViewModelAttachFilePendingBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelAttachFileEnabled = null;
        org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel = mChatSendingViewModel;
        int chatSendingViewModelAttachmentsSize = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> chatSendingViewModelTextToSend = null;
        boolean chatSendingViewModelIsReadOnlyViewModelChatRoomIsEphemeralEnabledBooleanFalse = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsFileTransferAvailableGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue = false;
        int chatSendingViewModelImeFlags = 0;
        org.linphone.activities.main.chat.data.ChatMessageData chatSendingViewModelPendingChatMessageToReplyToGetValue = null;
        boolean chatSendingViewModelAttachFilePending = false;
        android.view.View.OnClickListener cancelReplyToClickListener = mCancelReplyToClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelAttachFilePending1 = null;
        java.lang.Boolean chatSendingViewModelIsReadOnlyGetValue = null;
        int chatSendingViewModelIsEmojiPickerVisibleViewVISIBLEViewGONE = 0;
        java.lang.String chatSendingViewModelIsPendingAnswerMessageAndroidStringChatRoomSendingReplyHintMessageAndroidStringChatRoomSendingMessageHint = null;
        int chatSendingViewModelIsEmojiPickerOpenViewVISIBLEViewGONE = 0;
        boolean chatSendingViewModelAttachFileEnabledChatSendingViewModelAttachFilePendingBooleanFalseChatSendingViewModelIsFileTransferAvailableBooleanFalse = false;
        org.linphone.core.ChatRoom viewModelChatRoom = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerVisibleGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelIsEmojiPickerVisible = null;
        boolean chatSendingViewModelIsPendingVoiceRecordChatSendingViewModelAttachmentsSizeInt0BooleanFalse = false;
        java.lang.String chatSendingViewModelTextToSendGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerOpenGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsReadOnly1 = null;
        java.lang.Boolean chatSendingViewModelIsFileTransferAvailableGetValue = null;
        java.lang.Boolean chatSendingViewModelIsEmojiPickerOpenGetValue = null;
        int chatSendingViewModelIsReadOnlyViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue = false;
        int chatSendingViewModelAttachingFileInProgressViewVISIBLEViewGONE = 0;
        boolean chatSendingViewModelSendMessageEnabledChatSendingViewModelAttachingFileInProgressBooleanFalse = false;
        java.lang.Boolean chatSendingViewModelIsVoiceRecordingGetValue = null;
        boolean chatSendingViewModelAttachingFileInProgressBooleanTrueChatSendingViewModelAttachmentsSizeInt0 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingVoiceRecordGetValue = false;
        org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x84000L) != 0) {
        }
        if ((dirtyFlags & 0x88000L) != 0) {
        }
        if ((dirtyFlags & 0xd3fffL) != 0) {


            if ((dirtyFlags & 0x90001L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isPendingAnswer
                        chatSendingViewModelIsPendingAnswer = chatSendingViewModel.isPendingAnswer();
                    }
                    updateLiveDataRegistration(0, chatSendingViewModelIsPendingAnswer);


                    if (chatSendingViewModelIsPendingAnswer != null) {
                        // read chatSendingViewModel.isPendingAnswer.getValue()
                        chatSendingViewModelIsPendingAnswerGetValue = chatSendingViewModelIsPendingAnswer.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsPendingAnswerGetValue);
                if((dirtyFlags & 0x90001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue) {
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x4000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? View.VISIBLE : View.GONE
                    chatSendingViewModelIsPendingAnswerViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? @android:string/chat_room_sending_reply_hint : @android:string/chat_room_sending_message_hint
                    chatSendingViewModelIsPendingAnswerMessageAndroidStringChatRoomSendingReplyHintMessageAndroidStringChatRoomSendingMessageHint = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue) ? (message.getResources().getString(R.string.chat_room_sending_reply_hint)) : (message.getResources().getString(R.string.chat_room_sending_message_hint)));
            }
            if ((dirtyFlags & 0x90002L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.attachments
                        chatSendingViewModelAttachments = chatSendingViewModel.getAttachments();
                    }
                    updateLiveDataRegistration(1, chatSendingViewModelAttachments);


                    if (chatSendingViewModelAttachments != null) {
                        // read chatSendingViewModel.attachments.getValue()
                        chatSendingViewModelAttachmentsGetValue = chatSendingViewModelAttachments.getValue();
                    }
            }
            if ((dirtyFlags & 0x90004L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isEmojiPickerOpen
                        chatSendingViewModelIsEmojiPickerOpen = chatSendingViewModel.isEmojiPickerOpen();
                    }
                    updateLiveDataRegistration(2, chatSendingViewModelIsEmojiPickerOpen);


                    if (chatSendingViewModelIsEmojiPickerOpen != null) {
                        // read chatSendingViewModel.isEmojiPickerOpen.getValue()
                        chatSendingViewModelIsEmojiPickerOpenGetValue = chatSendingViewModelIsEmojiPickerOpen.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerOpenGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsEmojiPickerOpenGetValue);
                if((dirtyFlags & 0x90004L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerOpenGetValue) {
                            dirtyFlags |= 0x20000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue()) ? View.VISIBLE : View.GONE
                    chatSendingViewModelIsEmojiPickerOpenViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerOpenGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x90088L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.sendMessageEnabled
                        chatSendingViewModelSendMessageEnabled = chatSendingViewModel.getSendMessageEnabled();
                    }
                    updateLiveDataRegistration(3, chatSendingViewModelSendMessageEnabled);


                    if (chatSendingViewModelSendMessageEnabled != null) {
                        // read chatSendingViewModel.sendMessageEnabled.getValue()
                        chatSendingViewModelSendMessageEnabledGetValue = chatSendingViewModelSendMessageEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.sendMessageEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelSendMessageEnabledGetValue);
                if((dirtyFlags & 0x90088L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue) {
                            dirtyFlags |= 0x8000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x90010L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isVoiceRecording
                        chatSendingViewModelIsVoiceRecording = chatSendingViewModel.isVoiceRecording();
                    }
                    updateLiveDataRegistration(4, chatSendingViewModelIsVoiceRecording);


                    if (chatSendingViewModelIsVoiceRecording != null) {
                        // read chatSendingViewModel.isVoiceRecording.getValue()
                        chatSendingViewModelIsVoiceRecordingGetValue = chatSendingViewModelIsVoiceRecording.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isVoiceRecording.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsVoiceRecordingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsVoiceRecordingGetValue);
            }
            if ((dirtyFlags & 0x90022L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isPendingVoiceRecord
                        chatSendingViewModelIsPendingVoiceRecord = chatSendingViewModel.isPendingVoiceRecord();
                    }
                    updateLiveDataRegistration(5, chatSendingViewModelIsPendingVoiceRecord);


                    if (chatSendingViewModelIsPendingVoiceRecord != null) {
                        // read chatSendingViewModel.isPendingVoiceRecord.getValue()
                        chatSendingViewModelIsPendingVoiceRecordGetValue = chatSendingViewModelIsPendingVoiceRecord.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingVoiceRecordGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsPendingVoiceRecordGetValue);
                if((dirtyFlags & 0x90020L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingVoiceRecordGetValue) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }
                if((dirtyFlags & 0x90022L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingVoiceRecordGetValue) {
                            dirtyFlags |= 0x200000000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000000L;
                    }
                }

                if ((dirtyFlags & 0x90020L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue()) ? View.VISIBLE : View.GONE
                        chatSendingViewModelIsPendingVoiceRecordViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingVoiceRecordGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x90040L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.pendingChatMessageToReplyTo
                        chatSendingViewModelPendingChatMessageToReplyTo = chatSendingViewModel.getPendingChatMessageToReplyTo();
                    }
                    updateLiveDataRegistration(6, chatSendingViewModelPendingChatMessageToReplyTo);


                    if (chatSendingViewModelPendingChatMessageToReplyTo != null) {
                        // read chatSendingViewModel.pendingChatMessageToReplyTo.getValue()
                        chatSendingViewModelPendingChatMessageToReplyToGetValue = chatSendingViewModelPendingChatMessageToReplyTo.getValue();
                    }
            }
            if ((dirtyFlags & 0x90082L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.attachingFileInProgress
                        ChatSendingViewModelAttachingFileInProgress1 = chatSendingViewModel.getAttachingFileInProgress();
                    }
                    updateLiveDataRegistration(7, ChatSendingViewModelAttachingFileInProgress1);


                    if (ChatSendingViewModelAttachingFileInProgress1 != null) {
                        // read chatSendingViewModel.attachingFileInProgress.getValue()
                        chatSendingViewModelAttachingFileInProgressGetValue = ChatSendingViewModelAttachingFileInProgress1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelAttachingFileInProgressGetValue);
                if((dirtyFlags & 0x90080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue) {
                            dirtyFlags |= 0x2000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000000L;
                    }
                }
                if((dirtyFlags & 0x90082L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue) {
                            dirtyFlags |= 0x20000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000000000L;
                    }
                }

                if ((dirtyFlags & 0x90080L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) ? View.VISIBLE : View.GONE
                        chatSendingViewModelAttachingFileInProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x90100L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isFileTransferAvailable
                        chatSendingViewModelIsFileTransferAvailable = chatSendingViewModel.isFileTransferAvailable();
                    }
                    updateLiveDataRegistration(8, chatSendingViewModelIsFileTransferAvailable);


                    if (chatSendingViewModelIsFileTransferAvailable != null) {
                        // read chatSendingViewModel.isFileTransferAvailable.getValue()
                        chatSendingViewModelIsFileTransferAvailableGetValue = chatSendingViewModelIsFileTransferAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isFileTransferAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsFileTransferAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsFileTransferAvailableGetValue);
            }
            if ((dirtyFlags & 0x90b00L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.attachFileEnabled
                        chatSendingViewModelAttachFileEnabled = chatSendingViewModel.getAttachFileEnabled();
                    }
                    updateLiveDataRegistration(9, chatSendingViewModelAttachFileEnabled);


                    if (chatSendingViewModelAttachFileEnabled != null) {
                        // read chatSendingViewModel.attachFileEnabled.getValue()
                        chatSendingViewModelAttachFileEnabledGetValue = chatSendingViewModelAttachFileEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFileEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFileEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelAttachFileEnabledGetValue);
                if((dirtyFlags & 0x90b00L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFileEnabledGetValue) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x90400L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.textToSend
                        chatSendingViewModelTextToSend = chatSendingViewModel.getTextToSend();
                    }
                    updateLiveDataRegistration(10, chatSendingViewModelTextToSend);


                    if (chatSendingViewModelTextToSend != null) {
                        // read chatSendingViewModel.textToSend.getValue()
                        chatSendingViewModelTextToSendGetValue = chatSendingViewModelTextToSend.getValue();
                    }
            }
            if ((dirtyFlags & 0x90000L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.imeFlags
                        chatSendingViewModelImeFlags = chatSendingViewModel.getImeFlags();
                    }
            }
            if ((dirtyFlags & 0x91000L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isEmojiPickerVisible
                        chatSendingViewModelIsEmojiPickerVisible = chatSendingViewModel.isEmojiPickerVisible();
                    }
                    updateLiveDataRegistration(12, chatSendingViewModelIsEmojiPickerVisible);


                    if (chatSendingViewModelIsEmojiPickerVisible != null) {
                        // read chatSendingViewModel.isEmojiPickerVisible.getValue()
                        chatSendingViewModelIsEmojiPickerVisibleGetValue = chatSendingViewModelIsEmojiPickerVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsEmojiPickerVisibleGetValue);
                if((dirtyFlags & 0x91000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerVisibleGetValue) {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                            dirtyFlags |= 0x1000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerVisible.getValue()) ? @android:dimen/margin_0dp : @android:dimen/chat_message_sending_icons_margin
                    chatSendingViewModelIsEmojiPickerVisibleMessageAndroidDimenMargin0dpMessageAndroidDimenChatMessageSendingIconsMargin = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerVisibleGetValue) ? (message.getResources().getDimension(R.dimen.margin_0dp)) : (message.getResources().getDimension(R.dimen.chat_message_sending_icons_margin)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerVisible.getValue()) ? View.VISIBLE : View.GONE
                    chatSendingViewModelIsEmojiPickerVisibleViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerVisibleGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xd2000L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isReadOnly
                        ChatSendingViewModelIsReadOnly1 = chatSendingViewModel.isReadOnly();
                    }
                    updateLiveDataRegistration(13, ChatSendingViewModelIsReadOnly1);


                    if (ChatSendingViewModelIsReadOnly1 != null) {
                        // read chatSendingViewModel.isReadOnly.getValue()
                        chatSendingViewModelIsReadOnlyGetValue = ChatSendingViewModelIsReadOnly1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsReadOnlyGetValue);
                if((dirtyFlags & 0x92000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue) {
                            dirtyFlags |= 0x800000000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue())
                    chatSendingViewModelIsReadOnly = !androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue;
                if((dirtyFlags & 0xd2000L) != 0) {
                    if(chatSendingViewModelIsReadOnly) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }
                if ((dirtyFlags & 0x92000L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? View.GONE : View.VISIBLE
                        chatSendingViewModelIsReadOnlyViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
        }
        if ((dirtyFlags & 0xa0000L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x200000000000L) != 0) {

                if (chatSendingViewModel != null) {
                    // read chatSendingViewModel.attachments
                    chatSendingViewModelAttachments = chatSendingViewModel.getAttachments();
                }
                updateLiveDataRegistration(1, chatSendingViewModelAttachments);


                if (chatSendingViewModelAttachments != null) {
                    // read chatSendingViewModel.attachments.getValue()
                    chatSendingViewModelAttachmentsGetValue = chatSendingViewModelAttachments.getValue();
                }


                if (chatSendingViewModelAttachmentsGetValue != null) {
                    // read chatSendingViewModel.attachments.getValue().size()
                    chatSendingViewModelAttachmentsSize = chatSendingViewModelAttachmentsGetValue.size();
                }


                // read chatSendingViewModel.attachments.getValue().size() > 0
                chatSendingViewModelAttachmentsSizeInt0 = (chatSendingViewModelAttachmentsSize) > (0);
        }
        if ((dirtyFlags & 0x8000000000000L) != 0) {

                if (chatSendingViewModel != null) {
                    // read chatSendingViewModel.attachingFileInProgress
                    ChatSendingViewModelAttachingFileInProgress1 = chatSendingViewModel.getAttachingFileInProgress();
                }
                updateLiveDataRegistration(7, ChatSendingViewModelAttachingFileInProgress1);


                if (ChatSendingViewModelAttachingFileInProgress1 != null) {
                    // read chatSendingViewModel.attachingFileInProgress.getValue()
                    chatSendingViewModelAttachingFileInProgressGetValue = ChatSendingViewModelAttachingFileInProgress1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue())
                androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelAttachingFileInProgressGetValue);
            if((dirtyFlags & 0x90080L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue) {
                        dirtyFlags |= 0x2000000000000L;
                }
                else {
                        dirtyFlags |= 0x1000000000000L;
                }
            }
            if((dirtyFlags & 0x90082L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue) {
                        dirtyFlags |= 0x20000000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000000000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue())
                chatSendingViewModelAttachingFileInProgress = !androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue;
        }
        if ((dirtyFlags & 0x200000000L) != 0) {

                if (chatSendingViewModel != null) {
                    // read chatSendingViewModel.attachFilePending
                    ChatSendingViewModelAttachFilePending1 = chatSendingViewModel.getAttachFilePending();
                }
                updateLiveDataRegistration(11, ChatSendingViewModelAttachFilePending1);


                if (ChatSendingViewModelAttachFilePending1 != null) {
                    // read chatSendingViewModel.attachFilePending.getValue()
                    chatSendingViewModelAttachFilePendingGetValue = ChatSendingViewModelAttachFilePending1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFilePending.getValue())
                androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFilePendingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelAttachFilePendingGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFilePending.getValue())
                chatSendingViewModelAttachFilePending = !androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFilePendingGetValue;
        }
        if ((dirtyFlags & 0x800000000L) != 0) {



                if (viewModel != null) {
                    // read viewModel.chatRoom
                    viewModelChatRoom = viewModel.getChatRoom();
                }


                if (viewModelChatRoom != null) {
                    // read viewModel.chatRoom.isEphemeralEnabled()
                    viewModelChatRoomIsEphemeralEnabled = viewModelChatRoom.isEphemeralEnabled();
                }
        }

        if ((dirtyFlags & 0x90b00L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFileEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFilePending.getValue()) : false
                chatSendingViewModelAttachFileEnabledChatSendingViewModelAttachFilePendingBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFileEnabledGetValue) ? (chatSendingViewModelAttachFilePending) : (false));
            if((dirtyFlags & 0x90b00L) != 0) {
                if(chatSendingViewModelAttachFileEnabledChatSendingViewModelAttachFilePendingBooleanFalse) {
                        dirtyFlags |= 0x80000000000L;
                }
                else {
                        dirtyFlags |= 0x40000000000L;
                }
            }
        }
        if ((dirtyFlags & 0xd2000L) != 0) {

                // read !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? viewModel.chatRoom.isEphemeralEnabled() : false
                chatSendingViewModelIsReadOnlyViewModelChatRoomIsEphemeralEnabledBooleanFalse = ((chatSendingViewModelIsReadOnly) ? (viewModelChatRoomIsEphemeralEnabled) : (false));
            if((dirtyFlags & 0xd2000L) != 0) {
                if(chatSendingViewModelIsReadOnlyViewModelChatRoomIsEphemeralEnabledBooleanFalse) {
                        dirtyFlags |= 0x200000L;
                }
                else {
                        dirtyFlags |= 0x100000L;
                }
            }


                // read !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? viewModel.chatRoom.isEphemeralEnabled() : false ? View.VISIBLE : View.GONE
                chatSendingViewModelIsReadOnlyViewModelChatRoomIsEphemeralEnabledBooleanFalseViewVISIBLEViewGONE = ((chatSendingViewModelIsReadOnlyViewModelChatRoomIsEphemeralEnabledBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x90022L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue()) ? chatSendingViewModel.attachments.getValue().size() > 0 : false
                chatSendingViewModelIsPendingVoiceRecordChatSendingViewModelAttachmentsSizeInt0BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingVoiceRecordGetValue) ? (chatSendingViewModelAttachmentsSizeInt0) : (false));
            if((dirtyFlags & 0x90022L) != 0) {
                if(chatSendingViewModelIsPendingVoiceRecordChatSendingViewModelAttachmentsSizeInt0BooleanFalse) {
                        dirtyFlags |= 0x8000000L;
                }
                else {
                        dirtyFlags |= 0x4000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue()) ? chatSendingViewModel.attachments.getValue().size() > 0 : false ? View.VISIBLE : View.GONE
                chatSendingViewModelIsPendingVoiceRecordChatSendingViewModelAttachmentsSizeInt0BooleanFalseViewVISIBLEViewGONE = ((chatSendingViewModelIsPendingVoiceRecordChatSendingViewModelAttachmentsSizeInt0BooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x90088L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.sendMessageEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) : false
                chatSendingViewModelSendMessageEnabledChatSendingViewModelAttachingFileInProgressBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue) ? (chatSendingViewModelAttachingFileInProgress) : (false));
        }
        // batch finished

        if ((dirtyFlags & 0x10000000000000L) != 0) {

                if (chatSendingViewModel != null) {
                    // read chatSendingViewModel.attachments
                    chatSendingViewModelAttachments = chatSendingViewModel.getAttachments();
                }
                updateLiveDataRegistration(1, chatSendingViewModelAttachments);


                if (chatSendingViewModelAttachments != null) {
                    // read chatSendingViewModel.attachments.getValue()
                    chatSendingViewModelAttachmentsGetValue = chatSendingViewModelAttachments.getValue();
                }


                if (chatSendingViewModelAttachmentsGetValue != null) {
                    // read chatSendingViewModel.attachments.getValue().size()
                    chatSendingViewModelAttachmentsSize = chatSendingViewModelAttachmentsGetValue.size();
                }


                // read chatSendingViewModel.attachments.getValue().size() > 0
                chatSendingViewModelAttachmentsSizeInt0 = (chatSendingViewModelAttachmentsSize) > (0);
        }
        if ((dirtyFlags & 0x80000000000L) != 0) {

                if (chatSendingViewModel != null) {
                    // read chatSendingViewModel.isFileTransferAvailable
                    chatSendingViewModelIsFileTransferAvailable = chatSendingViewModel.isFileTransferAvailable();
                }
                updateLiveDataRegistration(8, chatSendingViewModelIsFileTransferAvailable);


                if (chatSendingViewModelIsFileTransferAvailable != null) {
                    // read chatSendingViewModel.isFileTransferAvailable.getValue()
                    chatSendingViewModelIsFileTransferAvailableGetValue = chatSendingViewModelIsFileTransferAvailable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isFileTransferAvailable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsFileTransferAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsFileTransferAvailableGetValue);
        }

        if ((dirtyFlags & 0x90b00L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFileEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFilePending.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isFileTransferAvailable.getValue()) : false
                chatSendingViewModelAttachFileEnabledChatSendingViewModelAttachFilePendingBooleanFalseChatSendingViewModelIsFileTransferAvailableBooleanFalse = ((chatSendingViewModelAttachFileEnabledChatSendingViewModelAttachFilePendingBooleanFalse) ? (androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsFileTransferAvailableGetValue) : (false));
        }
        if ((dirtyFlags & 0x90082L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) ? true : chatSendingViewModel.attachments.getValue().size() > 0
                chatSendingViewModelAttachingFileInProgressBooleanTrueChatSendingViewModelAttachmentsSizeInt0 = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachingFileInProgressGetValue) ? (true) : (chatSendingViewModelAttachmentsSizeInt0));
            if((dirtyFlags & 0x90082L) != 0) {
                if(chatSendingViewModelAttachingFileInProgressBooleanTrueChatSendingViewModelAttachmentsSizeInt0) {
                        dirtyFlags |= 0x800000L;
                }
                else {
                        dirtyFlags |= 0x400000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) ? true : chatSendingViewModel.attachments.getValue().size() > 0 ? View.VISIBLE : View.GONE
                chatSendingViewModelAttachingFileInProgressBooleanTrueChatSendingViewModelAttachmentsSizeInt0ViewVISIBLEViewGONE = ((chatSendingViewModelAttachingFileInProgressBooleanTrueChatSendingViewModelAttachmentsSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x90b00L) != 0) {
            // api target 1

            this.attachFile.setEnabled(chatSendingViewModelAttachFileEnabledChatSendingViewModelAttachFilePendingBooleanFalseChatSendingViewModelIsFileTransferAvailableBooleanFalse);
        }
        if ((dirtyFlags & 0x84000L) != 0) {
            // api target 1

            this.attachFile.setOnClickListener(attachFileClickListener);
        }
        if ((dirtyFlags & 0x90080L) != 0) {
            // api target 1

            this.attachingFilesInProgress.setVisibility(chatSendingViewModelAttachingFileInProgressViewVISIBLEViewGONE);
            this.attachingFilesInProgressBackground.setVisibility(chatSendingViewModelAttachingFileInProgressViewVISIBLEViewGONE);
            this.attachingFilesInProgressLabel.setVisibility(chatSendingViewModelAttachingFileInProgressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x90004L) != 0) {
            // api target 1

            this.emojiPicker.setVisibility(chatSendingViewModelIsEmojiPickerOpenViewVISIBLEViewGONE);
            this.emojiPickerToggle.setSelected(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerOpenGetValue);
        }
        if ((dirtyFlags & 0x80000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEmojiPickedListener(this.emojiPicker, mCallback86);
            this.emojiPickerToggle.setOnClickListener(mCallback88);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.message, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, messageandroidTextAttrChanged);
            this.sendMessage.setOnClickListener(mCallback89);
            this.voiceRecord.setOnClickListener(mCallback87);
        }
        if ((dirtyFlags & 0x91000L) != 0) {
            // api target 1

            this.emojiPickerToggle.setVisibility(chatSendingViewModelIsEmojiPickerVisibleViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.setConstraintLayoutEndMargin(this.message, chatSendingViewModelIsEmojiPickerVisibleMessageAndroidDimenMargin0dpMessageAndroidDimenChatMessageSendingIconsMargin);
        }
        if ((dirtyFlags & 0x92000L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(chatSendingViewModelIsReadOnlyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x90082L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(chatSendingViewModelAttachingFileInProgressBooleanTrueChatSendingViewModelAttachmentsSizeInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x90002L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView5, chatSendingViewModelAttachmentsGetValue, R.layout.chat_message_attachment_cell);
        }
        if ((dirtyFlags & 0x90001L) != 0) {
            // api target 1

            this.message.setHint(chatSendingViewModelIsPendingAnswerMessageAndroidStringChatRoomSendingReplyHintMessageAndroidStringChatRoomSendingMessageHint);
            if (!this.stubbedMessageToReplyTo.isInflated()) this.stubbedMessageToReplyTo.getViewStub().setVisibility(chatSendingViewModelIsPendingAnswerViewVISIBLEViewGONE);
            if (this.stubbedMessageToReplyTo.isInflated()) this.stubbedMessageToReplyTo.getBinding().setVariable(BR.inflatedVisibility, chatSendingViewModelIsPendingAnswerViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x90000L) != 0) {
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.message.setImeOptions(chatSendingViewModelImeFlags);
            }
            // api target 1

            if (this.stubbedVoiceRecording.isInflated()) this.stubbedVoiceRecording.getBinding().setVariable(BR.viewModel, chatSendingViewModel);
        }
        if ((dirtyFlags & 0x90400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.message, chatSendingViewModelTextToSendGetValue);
        }
        if ((dirtyFlags & 0x90008L) != 0) {
            // api target 1

            this.sendEphemeralMessage.setEnabled(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue);
        }
        if ((dirtyFlags & 0xd2000L) != 0) {
            // api target 1

            this.sendEphemeralMessage.setVisibility(chatSendingViewModelIsReadOnlyViewModelChatRoomIsEphemeralEnabledBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x90088L) != 0) {
            // api target 1

            this.sendMessage.setEnabled(chatSendingViewModelSendMessageEnabledChatSendingViewModelAttachingFileInProgressBooleanFalse);
        }
        if ((dirtyFlags & 0xa0000L) != 0) {
            // api target 1

            if (this.stubbedMessageToReplyTo.isInflated()) this.stubbedMessageToReplyTo.getBinding().setVariable(BR.cancelClickListener, cancelReplyToClickListener);
        }
        if ((dirtyFlags & 0x90040L) != 0) {
            // api target 1

            if (this.stubbedMessageToReplyTo.isInflated()) this.stubbedMessageToReplyTo.getBinding().setVariable(BR.data, chatSendingViewModelPendingChatMessageToReplyToGetValue);
        }
        if ((dirtyFlags & 0x90020L) != 0) {
            // api target 1

            if (!this.stubbedVoiceRecording.isInflated()) this.stubbedVoiceRecording.getViewStub().setVisibility(chatSendingViewModelIsPendingVoiceRecordViewVISIBLEViewGONE);
            if (this.stubbedVoiceRecording.isInflated()) this.stubbedVoiceRecording.getBinding().setVariable(BR.inflatedVisibility, chatSendingViewModelIsPendingVoiceRecordViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x88000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setTouchListener(this.voiceRecord, voiceRecordingTouchListener);
        }
        if ((dirtyFlags & 0x90010L) != 0) {
            // api target 1

            this.voiceRecord.setSelected(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsVoiceRecordingGetValue);
        }
        if ((dirtyFlags & 0x90100L) != 0) {
            // api target 1

            this.voiceRecord.setEnabled(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsFileTransferAvailableGetValue);
        }
        if ((dirtyFlags & 0x90022L) != 0) {
            // api target 1

            this.voiceRecordingSeparator.setVisibility(chatSendingViewModelIsPendingVoiceRecordChatSendingViewModelAttachmentsSizeInt0BooleanFalseViewVISIBLEViewGONE);
        }
        if (stubbedMessageToReplyTo.getBinding() != null) {
            executeBindingsOn(stubbedMessageToReplyTo.getBinding());
        }
        if (stubbedVoiceRecording.getBinding() != null) {
            executeBindingsOn(stubbedVoiceRecording.getBinding());
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // chatSendingViewModel
                org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel = mChatSendingViewModel;
                // chatSendingViewModel != null
                boolean chatSendingViewModelJavaLangObjectNull = false;



                chatSendingViewModelJavaLangObjectNull = (chatSendingViewModel) != (null);
                if (chatSendingViewModelJavaLangObjectNull) {


                    chatSendingViewModel.sendMessage();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // chatSendingViewModel
                org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel = mChatSendingViewModel;
                // chatSendingViewModel != null
                boolean chatSendingViewModelJavaLangObjectNull = false;



                chatSendingViewModelJavaLangObjectNull = (chatSendingViewModel) != (null);
                if (chatSendingViewModelJavaLangObjectNull) {


                    chatSendingViewModel.toggleVoiceRecording();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // chatSendingViewModel
                org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel = mChatSendingViewModel;
                // chatSendingViewModel != null
                boolean chatSendingViewModelJavaLangObjectNull = false;



                chatSendingViewModelJavaLangObjectNull = (chatSendingViewModel) != (null);
                if (chatSendingViewModelJavaLangObjectNull) {


                    chatSendingViewModel.toggleEmojiPicker();
                }
                break;
            }
        }
    }
    public final void _internalCallbackOnEmojiPicked(int sourceId , androidx.emoji2.emojipicker.EmojiViewItem callbackArg_0) {
        // localize variables for thread safety
        // emoji.emoji
        java.lang.String callbackArg0Emoji = null;
        // message.getText().insert(message.getSelectionStart(), emoji.emoji)
        android.text.Editable messageGetTextInsertMessageGetSelectionStartCallbackArg0Emoji = null;


        if ((message) != (null)) {


            message.getText();
            if ((message.getText()) != (null)) {




                message.getSelectionStart();

                if ((callbackArg_0) != (null)) {


                    callbackArg0Emoji = callbackArg_0.getEmoji();

                    messageGetTextInsertMessageGetSelectionStartCallbackArg0Emoji = message.getText().insert(message.getSelectionStart(), callbackArg0Emoji);
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): chatSendingViewModel.isPendingAnswer
        flag 1 (0x2L): chatSendingViewModel.attachments
        flag 2 (0x3L): chatSendingViewModel.isEmojiPickerOpen
        flag 3 (0x4L): chatSendingViewModel.sendMessageEnabled
        flag 4 (0x5L): chatSendingViewModel.isVoiceRecording
        flag 5 (0x6L): chatSendingViewModel.isPendingVoiceRecord
        flag 6 (0x7L): chatSendingViewModel.pendingChatMessageToReplyTo
        flag 7 (0x8L): chatSendingViewModel.attachingFileInProgress
        flag 8 (0x9L): chatSendingViewModel.isFileTransferAvailable
        flag 9 (0xaL): chatSendingViewModel.attachFileEnabled
        flag 10 (0xbL): chatSendingViewModel.textToSend
        flag 11 (0xcL): chatSendingViewModel.attachFilePending
        flag 12 (0xdL): chatSendingViewModel.isEmojiPickerVisible
        flag 13 (0xeL): chatSendingViewModel.isReadOnly
        flag 14 (0xfL): attachFileClickListener
        flag 15 (0x10L): voiceRecordingTouchListener
        flag 16 (0x11L): chatSendingViewModel
        flag 17 (0x12L): cancelReplyToClickListener
        flag 18 (0x13L): viewModel
        flag 19 (0x14L): null
        flag 20 (0x15L): !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? viewModel.chatRoom.isEphemeralEnabled() : false ? View.VISIBLE : View.GONE
        flag 21 (0x16L): !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? viewModel.chatRoom.isEphemeralEnabled() : false ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) ? true : chatSendingViewModel.attachments.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) ? true : chatSendingViewModel.attachments.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue()) ? chatSendingViewModel.attachments.getValue().size() > 0 : false ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue()) ? chatSendingViewModel.attachments.getValue().size() > 0 : false ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerVisible.getValue()) ? @android:dimen/margin_0dp : @android:dimen/chat_message_sending_icons_margin
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerVisible.getValue()) ? @android:dimen/margin_0dp : @android:dimen/chat_message_sending_icons_margin
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFileEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFilePending.getValue()) : false
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFileEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFilePending.getValue()) : false
        flag 34 (0x23L): !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? viewModel.chatRoom.isEphemeralEnabled() : false
        flag 35 (0x24L): !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? viewModel.chatRoom.isEphemeralEnabled() : false
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerVisible.getValue()) ? View.VISIBLE : View.GONE
        flag 38 (0x27L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? @android:string/chat_room_sending_reply_hint : @android:string/chat_room_sending_message_hint
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? @android:string/chat_room_sending_reply_hint : @android:string/chat_room_sending_message_hint
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue()) ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue()) ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFileEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFilePending.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isFileTransferAvailable.getValue()) : false
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFileEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFilePending.getValue()) : false ? androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isFileTransferAvailable.getValue()) : false
        flag 44 (0x2dL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue()) ? chatSendingViewModel.attachments.getValue().size() > 0 : false
        flag 45 (0x2eL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingVoiceRecord.getValue()) ? chatSendingViewModel.attachments.getValue().size() > 0 : false
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? View.GONE : View.VISIBLE
        flag 47 (0x30L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? View.GONE : View.VISIBLE
        flag 48 (0x31L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.sendMessageEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) : false
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.sendMessageEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) : false
        flag 52 (0x35L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) ? true : chatSendingViewModel.attachments.getValue().size() > 0
        flag 53 (0x36L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachingFileInProgress.getValue()) ? true : chatSendingViewModel.attachments.getValue().size() > 0
    flag mapping end*/
    //end
}