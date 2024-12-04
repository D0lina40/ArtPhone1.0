package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipChatFragmentBindingImpl extends VoipChatFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(5, 
            new String[] {"chat_message_reply"},
            new int[] {13},
            new int[] {org.linphone.R.layout.chat_message_reply});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 14);
        sViewsWithIds.put(R.id.chat_messages_list, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView12;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @Nullable
    private final org.linphone.databinding.ChatMessageReplyBinding mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView6;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback90;
    @Nullable
    private final android.view.View.OnClickListener mCallback91;
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

    public VoipChatFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private VoipChatFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 15
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.EditText) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.LinearLayout) bindings[14]
            );
        this.footer.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (org.linphone.views.MarqueeTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView12 = (android.widget.ImageView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView2 = (org.linphone.views.MarqueeTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (org.linphone.databinding.ChatMessageReplyBinding) bindings[13];
        setContainedBinding(this.mboundView5);
        this.mboundView6 = (android.widget.LinearLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.message.setTag(null);
        this.remoteComposing.setTag(null);
        this.sendMessage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback90 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback91 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100000L;
        }
        mboundView5.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView5.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.attachFileClickListener == variableId) {
            setAttachFileClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.chatSendingViewModel == variableId) {
            setChatSendingViewModel((org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel) variable);
        }
        else if (BR.cancelClickListener == variableId) {
            setCancelClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel) variable);
        }
        else if (BR.chatRoomsListClickListener == variableId) {
            setChatRoomsListClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAttachFileClickListener(@Nullable android.view.View.OnClickListener AttachFileClickListener) {
        this.mAttachFileClickListener = AttachFileClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.attachFileClickListener);
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
    public void setCancelClickListener(@Nullable android.view.View.OnClickListener CancelClickListener) {
        this.mCancelClickListener = CancelClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.cancelClickListener);
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
    public void setChatRoomsListClickListener(@Nullable android.view.View.OnClickListener ChatRoomsListClickListener) {
        this.mChatRoomsListClickListener = ChatRoomsListClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.chatRoomsListClickListener);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView5.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 1 :
                return onChangeChatSendingViewModelAttachFileEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelParticipants((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelRemoteIsComposing((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeChatSendingViewModelIsPendingAnswer((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeChatSendingViewModelTextToSend((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeChatSendingViewModelAttachments((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData>>) object, fieldId);
            case 7 :
                return onChangeViewModelSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeChatSendingViewModelSendMessageEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeChatSendingViewModelPendingChatMessageToReplyTo((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData>) object, fieldId);
            case 11 :
                return onChangeViewModelSecurityLevelContentDescription((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 12 :
                return onChangeViewModelComposingList((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeChatSendingViewModelIsReadOnly((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 14 :
                return onChangeViewModelSecurityLevelIcon((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> ViewModelContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelAttachFileEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelAttachFileEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelParticipants(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelParticipants, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRemoteIsComposing(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelRemoteIsComposing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsPendingAnswer(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsPendingAnswer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelTextToSend(androidx.lifecycle.MutableLiveData<java.lang.String> ChatSendingViewModelTextToSend, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelAttachments(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData>> ChatSendingViewModelAttachments, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSubject(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelSendMessageEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelSendMessageEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelPendingChatMessageToReplyTo(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData> ChatSendingViewModelPendingChatMessageToReplyTo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSecurityLevelContentDescription(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelSecurityLevelContentDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelComposingList(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelComposingList, int fieldId) {
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
    private boolean onChangeViewModelSecurityLevelIcon(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelSecurityLevelIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
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
        boolean viewModelContactNameJavaLangObjectNull = false;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> viewModelContact = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelAttachFileEnabled = null;
        int viewModelRemoteIsComposingViewVISIBLEViewINVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelParticipants = null;
        java.lang.String viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = null;
        org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel = mChatSendingViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelRemoteIsComposing = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelIsPendingAnswer = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> chatSendingViewModelTextToSend = null;
        java.lang.Boolean chatSendingViewModelSendMessageEnabledGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue = false;
        boolean viewModelEncryptedChatRoom = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData>> chatSendingViewModelAttachments = null;
        android.view.View.OnClickListener cancelClickListener = mCancelClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSubject = null;
        java.lang.Boolean chatSendingViewModelIsPendingAnswerGetValue = null;
        java.lang.Integer viewModelSecurityLevelIconGetValue = null;
        java.lang.String viewModelContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelSendMessageEnabled = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue = false;
        org.linphone.activities.main.chat.data.ChatMessageData chatSendingViewModelPendingChatMessageToReplyToGetValue = null;
        int viewModelEncryptedChatRoomViewVISIBLEViewGONE = 0;
        java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageAttachmentData> chatSendingViewModelAttachmentsGetValue = null;
        java.lang.Boolean chatSendingViewModelIsReadOnlyGetValue = null;
        java.lang.Integer viewModelSecurityLevelContentDescriptionGetValue = null;
        java.lang.String viewModelDisplayNameGetValue = null;
        java.lang.String chatSendingViewModelIsPendingAnswerMessageAndroidStringChatRoomSendingReplyHintMessageAndroidStringChatRoomSendingMessageHint = null;
        java.lang.String viewModelParticipantsGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData> chatSendingViewModelPendingChatMessageToReplyTo = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelSecurityLevelContentDescription = null;
        int chatSendingViewModelIsPendingAnswerViewVISIBLEViewGONE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelContentDescriptionGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue = false;
        boolean viewModelOneToOneChatRoom = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelComposingList = null;
        java.lang.String viewModelSubjectGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFileEnabledGetValue = false;
        org.linphone.core.Friend viewModelContactGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelIconGetValue = 0;
        java.lang.String chatSendingViewModelTextToSendGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelIsReadOnly = null;
        java.lang.String viewModelComposingListGetValue = null;
        int chatSendingViewModelIsReadOnlyViewGONEViewVISIBLE = 0;
        java.lang.Boolean viewModelRemoteIsComposingGetValue = null;
        java.lang.Boolean chatSendingViewModelAttachFileEnabledGetValue = null;
        org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel viewModel = mViewModel;
        android.view.View.OnClickListener chatRoomsListClickListener = mChatRoomsListClickListener;
        java.lang.String viewModelOneToOneChatRoomViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactNameViewModelSubject = null;
        int viewModelOneToOneChatRoomViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelSecurityLevelIcon = null;

        if ((dirtyFlags & 0x108000L) != 0) {
        }
        if ((dirtyFlags & 0x112672L) != 0) {


            if ((dirtyFlags & 0x110002L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.attachFileEnabled
                        chatSendingViewModelAttachFileEnabled = chatSendingViewModel.getAttachFileEnabled();
                    }
                    updateLiveDataRegistration(1, chatSendingViewModelAttachFileEnabled);


                    if (chatSendingViewModelAttachFileEnabled != null) {
                        // read chatSendingViewModel.attachFileEnabled.getValue()
                        chatSendingViewModelAttachFileEnabledGetValue = chatSendingViewModelAttachFileEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.attachFileEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFileEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelAttachFileEnabledGetValue);
            }
            if ((dirtyFlags & 0x110010L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isPendingAnswer
                        chatSendingViewModelIsPendingAnswer = chatSendingViewModel.isPendingAnswer();
                    }
                    updateLiveDataRegistration(4, chatSendingViewModelIsPendingAnswer);


                    if (chatSendingViewModelIsPendingAnswer != null) {
                        // read chatSendingViewModel.isPendingAnswer.getValue()
                        chatSendingViewModelIsPendingAnswerGetValue = chatSendingViewModelIsPendingAnswer.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsPendingAnswerGetValue);
                if((dirtyFlags & 0x110010L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue) {
                            dirtyFlags |= 0x10000000L;
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                            dirtyFlags |= 0x20000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? @android:string/chat_room_sending_reply_hint : @android:string/chat_room_sending_message_hint
                    chatSendingViewModelIsPendingAnswerMessageAndroidStringChatRoomSendingReplyHintMessageAndroidStringChatRoomSendingMessageHint = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue) ? (message.getResources().getString(R.string.chat_room_sending_reply_hint)) : (message.getResources().getString(R.string.chat_room_sending_message_hint)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? View.VISIBLE : View.GONE
                    chatSendingViewModelIsPendingAnswerViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsPendingAnswerGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x110020L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.textToSend
                        chatSendingViewModelTextToSend = chatSendingViewModel.getTextToSend();
                    }
                    updateLiveDataRegistration(5, chatSendingViewModelTextToSend);


                    if (chatSendingViewModelTextToSend != null) {
                        // read chatSendingViewModel.textToSend.getValue()
                        chatSendingViewModelTextToSendGetValue = chatSendingViewModelTextToSend.getValue();
                    }
            }
            if ((dirtyFlags & 0x110040L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.attachments
                        chatSendingViewModelAttachments = chatSendingViewModel.getAttachments();
                    }
                    updateLiveDataRegistration(6, chatSendingViewModelAttachments);


                    if (chatSendingViewModelAttachments != null) {
                        // read chatSendingViewModel.attachments.getValue()
                        chatSendingViewModelAttachmentsGetValue = chatSendingViewModelAttachments.getValue();
                    }
            }
            if ((dirtyFlags & 0x110200L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.sendMessageEnabled
                        chatSendingViewModelSendMessageEnabled = chatSendingViewModel.getSendMessageEnabled();
                    }
                    updateLiveDataRegistration(9, chatSendingViewModelSendMessageEnabled);


                    if (chatSendingViewModelSendMessageEnabled != null) {
                        // read chatSendingViewModel.sendMessageEnabled.getValue()
                        chatSendingViewModelSendMessageEnabledGetValue = chatSendingViewModelSendMessageEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.sendMessageEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelSendMessageEnabledGetValue);
            }
            if ((dirtyFlags & 0x110400L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.pendingChatMessageToReplyTo
                        chatSendingViewModelPendingChatMessageToReplyTo = chatSendingViewModel.getPendingChatMessageToReplyTo();
                    }
                    updateLiveDataRegistration(10, chatSendingViewModelPendingChatMessageToReplyTo);


                    if (chatSendingViewModelPendingChatMessageToReplyTo != null) {
                        // read chatSendingViewModel.pendingChatMessageToReplyTo.getValue()
                        chatSendingViewModelPendingChatMessageToReplyToGetValue = chatSendingViewModelPendingChatMessageToReplyTo.getValue();
                    }
            }
            if ((dirtyFlags & 0x112000L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isReadOnly
                        chatSendingViewModelIsReadOnly = chatSendingViewModel.isReadOnly();
                    }
                    updateLiveDataRegistration(13, chatSendingViewModelIsReadOnly);


                    if (chatSendingViewModelIsReadOnly != null) {
                        // read chatSendingViewModel.isReadOnly.getValue()
                        chatSendingViewModelIsReadOnlyGetValue = chatSendingViewModelIsReadOnly.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsReadOnlyGetValue);
                if((dirtyFlags & 0x112000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? View.GONE : View.VISIBLE
                    chatSendingViewModelIsReadOnlyViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0x120000L) != 0) {
        }
        if ((dirtyFlags & 0x14598dL) != 0) {


            if ((dirtyFlags & 0x140004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.participants
                        viewModelParticipants = viewModel.getParticipants();
                    }
                    updateLiveDataRegistration(2, viewModelParticipants);


                    if (viewModelParticipants != null) {
                        // read viewModel.participants.getValue()
                        viewModelParticipantsGetValue = viewModelParticipants.getValue();
                    }
            }
            if ((dirtyFlags & 0x140008L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.remoteIsComposing
                        viewModelRemoteIsComposing = viewModel.getRemoteIsComposing();
                    }
                    updateLiveDataRegistration(3, viewModelRemoteIsComposing);


                    if (viewModelRemoteIsComposing != null) {
                        // read viewModel.remoteIsComposing.getValue()
                        viewModelRemoteIsComposingGetValue = viewModelRemoteIsComposing.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRemoteIsComposingGetValue);
                if((dirtyFlags & 0x140008L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue()) ? View.VISIBLE : View.INVISIBLE
                    viewModelRemoteIsComposingViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x140000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.encryptedChatRoom
                        viewModelEncryptedChatRoom = viewModel.getEncryptedChatRoom();
                    }
                if((dirtyFlags & 0x140000L) != 0) {
                    if(viewModelEncryptedChatRoom) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read viewModel.encryptedChatRoom ? View.VISIBLE : View.GONE
                    viewModelEncryptedChatRoomViewVISIBLEViewGONE = ((viewModelEncryptedChatRoom) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x140800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.securityLevelContentDescription
                        viewModelSecurityLevelContentDescription = viewModel.getSecurityLevelContentDescription();
                    }
                    updateLiveDataRegistration(11, viewModelSecurityLevelContentDescription);


                    if (viewModelSecurityLevelContentDescription != null) {
                        // read viewModel.securityLevelContentDescription.getValue()
                        viewModelSecurityLevelContentDescriptionGetValue = viewModelSecurityLevelContentDescription.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.securityLevelContentDescription.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelContentDescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSecurityLevelContentDescriptionGetValue);
            }
            if ((dirtyFlags & 0x140181L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.oneToOneChatRoom
                        viewModelOneToOneChatRoom = viewModel.getOneToOneChatRoom();
                    }
                if((dirtyFlags & 0x140181L) != 0) {
                    if(viewModelOneToOneChatRoom) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }
                if((dirtyFlags & 0x140000L) != 0) {
                    if(viewModelOneToOneChatRoom) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }

                if ((dirtyFlags & 0x140000L) != 0) {

                        // read viewModel.oneToOneChatRoom ? View.GONE : View.VISIBLE
                        viewModelOneToOneChatRoomViewGONEViewVISIBLE = ((viewModelOneToOneChatRoom) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x141000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.composingList
                        viewModelComposingList = viewModel.getComposingList();
                    }
                    updateLiveDataRegistration(12, viewModelComposingList);


                    if (viewModelComposingList != null) {
                        // read viewModel.composingList.getValue()
                        viewModelComposingListGetValue = viewModelComposingList.getValue();
                    }
            }
            if ((dirtyFlags & 0x144000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.securityLevelIcon
                        viewModelSecurityLevelIcon = viewModel.getSecurityLevelIcon();
                    }
                    updateLiveDataRegistration(14, viewModelSecurityLevelIcon);


                    if (viewModelSecurityLevelIcon != null) {
                        // read viewModel.securityLevelIcon.getValue()
                        viewModelSecurityLevelIconGetValue = viewModelSecurityLevelIcon.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.securityLevelIcon.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelIconGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSecurityLevelIconGetValue);
            }
        }
        if ((dirtyFlags & 0x180000L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x600000000L) != 0) {


            if ((dirtyFlags & 0x400000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.contact
                        viewModelContact = viewModel.getContact();
                    }
                    updateLiveDataRegistration(0, viewModelContact);


                    if (viewModelContact != null) {
                        // read viewModel.contact.getValue()
                        viewModelContactGetValue = viewModelContact.getValue();
                    }


                    if (viewModelContactGetValue != null) {
                        // read viewModel.contact.getValue().name
                        viewModelContactName = viewModelContactGetValue.getName();
                    }


                    // read viewModel.contact.getValue().name == null
                    viewModelContactNameJavaLangObjectNull = (viewModelContactName) == (null);
                if((dirtyFlags & 0x400000000L) != 0) {
                    if(viewModelContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }
            }
            if ((dirtyFlags & 0x200000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subject
                        viewModelSubject = viewModel.getSubject();
                    }
                    updateLiveDataRegistration(7, viewModelSubject);


                    if (viewModelSubject != null) {
                        // read viewModel.subject.getValue()
                        viewModelSubjectGetValue = viewModelSubject.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.displayName
                    viewModelDisplayName = viewModel.getDisplayName();
                }
                updateLiveDataRegistration(8, viewModelDisplayName);


                if (viewModelDisplayName != null) {
                    // read viewModel.displayName.getValue()
                    viewModelDisplayNameGetValue = viewModelDisplayName.getValue();
                }
        }

        if ((dirtyFlags & 0x400000000L) != 0) {

                // read viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
                viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = ((viewModelContactNameJavaLangObjectNull) ? (viewModelDisplayNameGetValue) : (viewModelContactName));
        }

        if ((dirtyFlags & 0x140181L) != 0) {

                // read viewModel.oneToOneChatRoom ? viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name : viewModel.subject.getValue()
                viewModelOneToOneChatRoomViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactNameViewModelSubject = ((viewModelOneToOneChatRoom) ? (viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName) : (viewModelSubjectGetValue));
        }
        // batch finished
        if ((dirtyFlags & 0x140181L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, viewModelOneToOneChatRoomViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactNameViewModelSubject);
        }
        if ((dirtyFlags & 0x144000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView12, androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelIconGetValue);
        }
        if ((dirtyFlags & 0x140000L) != 0) {
            // api target 1

            this.mboundView12.setVisibility(viewModelEncryptedChatRoomViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(viewModelOneToOneChatRoomViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x140800L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView12, androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelContentDescriptionGetValue);
        }
        if ((dirtyFlags & 0x140004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelParticipantsGetValue);
        }
        if ((dirtyFlags & 0x180000L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(chatRoomsListClickListener);
        }
        if ((dirtyFlags & 0x120000L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(cancelClickListener);
        }
        if ((dirtyFlags & 0x110010L) != 0) {
            // api target 1

            this.mboundView5.getRoot().setVisibility(chatSendingViewModelIsPendingAnswerViewVISIBLEViewGONE);
            this.message.setHint(chatSendingViewModelIsPendingAnswerMessageAndroidStringChatRoomSendingReplyHintMessageAndroidStringChatRoomSendingMessageHint);
        }
        if ((dirtyFlags & 0x110400L) != 0) {
            // api target 1

            this.mboundView5.setData(chatSendingViewModelPendingChatMessageToReplyToGetValue);
        }
        if ((dirtyFlags & 0x100000L) != 0) {
            // api target 1

            this.mboundView5.setCancelClickListener(mCallback90);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.message, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, messageandroidTextAttrChanged);
            this.sendMessage.setOnClickListener(mCallback91);
        }
        if ((dirtyFlags & 0x110040L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView6, chatSendingViewModelAttachmentsGetValue, R.layout.chat_message_attachment_cell);
        }
        if ((dirtyFlags & 0x112000L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(chatSendingViewModelIsReadOnlyViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x110002L) != 0) {
            // api target 1

            this.mboundView8.setEnabled(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelAttachFileEnabledGetValue);
        }
        if ((dirtyFlags & 0x108000L) != 0) {
            // api target 1

            this.mboundView8.setOnClickListener(attachFileClickListener);
        }
        if ((dirtyFlags & 0x110020L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.message, chatSendingViewModelTextToSendGetValue);
        }
        if ((dirtyFlags & 0x141000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.remoteComposing, viewModelComposingListGetValue);
        }
        if ((dirtyFlags & 0x140008L) != 0) {
            // api target 1

            this.remoteComposing.setVisibility(viewModelRemoteIsComposingViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x110200L) != 0) {
            // api target 1

            this.sendMessage.setEnabled(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue);
        }
        executeBindingsOn(mboundView5);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // chatSendingViewModel
                org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel = mChatSendingViewModel;
                // chatSendingViewModel != null
                boolean chatSendingViewModelJavaLangObjectNull = false;



                chatSendingViewModelJavaLangObjectNull = (chatSendingViewModel) != (null);
                if (chatSendingViewModelJavaLangObjectNull) {


                    chatSendingViewModel.cancelReply();
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


                    chatSendingViewModel.sendMessage();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.contact
        flag 1 (0x2L): chatSendingViewModel.attachFileEnabled
        flag 2 (0x3L): viewModel.participants
        flag 3 (0x4L): viewModel.remoteIsComposing
        flag 4 (0x5L): chatSendingViewModel.isPendingAnswer
        flag 5 (0x6L): chatSendingViewModel.textToSend
        flag 6 (0x7L): chatSendingViewModel.attachments
        flag 7 (0x8L): viewModel.subject
        flag 8 (0x9L): viewModel.displayName
        flag 9 (0xaL): chatSendingViewModel.sendMessageEnabled
        flag 10 (0xbL): chatSendingViewModel.pendingChatMessageToReplyTo
        flag 11 (0xcL): viewModel.securityLevelContentDescription
        flag 12 (0xdL): viewModel.composingList
        flag 13 (0xeL): chatSendingViewModel.isReadOnly
        flag 14 (0xfL): viewModel.securityLevelIcon
        flag 15 (0x10L): attachFileClickListener
        flag 16 (0x11L): chatSendingViewModel
        flag 17 (0x12L): cancelClickListener
        flag 18 (0x13L): viewModel
        flag 19 (0x14L): chatRoomsListClickListener
        flag 20 (0x15L): null
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 23 (0x18L): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 24 (0x19L): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 25 (0x1aL): viewModel.encryptedChatRoom ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewModel.encryptedChatRoom ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? @android:string/chat_room_sending_reply_hint : @android:string/chat_room_sending_message_hint
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? @android:string/chat_room_sending_reply_hint : @android:string/chat_room_sending_message_hint
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isPendingAnswer.getValue()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? View.GONE : View.VISIBLE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) ? View.GONE : View.VISIBLE
        flag 33 (0x22L): viewModel.oneToOneChatRoom ? viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name : viewModel.subject.getValue()
        flag 34 (0x23L): viewModel.oneToOneChatRoom ? viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name : viewModel.subject.getValue()
        flag 35 (0x24L): viewModel.oneToOneChatRoom ? View.GONE : View.VISIBLE
        flag 36 (0x25L): viewModel.oneToOneChatRoom ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}