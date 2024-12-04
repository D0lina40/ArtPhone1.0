package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatBubbleActivityBindingImpl extends ChatBubbleActivityBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 10);
        sViewsWithIds.put(R.id.footer, 11);
        sViewsWithIds.put(R.id.chat_messages_list, 12);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView2;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
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

    public ChatBubbleActivityBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private ChatBubbleActivityBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.EditText) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.LinearLayout) bindings[10]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (org.linphone.views.MarqueeTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (org.linphone.views.MarqueeTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.message.setTag(null);
        this.remoteComposing.setTag(null);
        this.sendMessage.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10000L;
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
        if (BR.closeBubbleClickListener == variableId) {
            setCloseBubbleClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.chatSendingViewModel == variableId) {
            setChatSendingViewModel((org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel) variable);
        }
        else if (BR.sendMessageClickListener == variableId) {
            setSendMessageClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.openAppClickListener == variableId) {
            setOpenAppClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCloseBubbleClickListener(@Nullable android.view.View.OnClickListener CloseBubbleClickListener) {
        this.mCloseBubbleClickListener = CloseBubbleClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.closeBubbleClickListener);
        super.requestRebind();
    }
    public void setChatSendingViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel ChatSendingViewModel) {
        this.mChatSendingViewModel = ChatSendingViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.chatSendingViewModel);
        super.requestRebind();
    }
    public void setSendMessageClickListener(@Nullable android.view.View.OnClickListener SendMessageClickListener) {
        this.mSendMessageClickListener = SendMessageClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2000L;
        }
        notifyPropertyChanged(BR.sendMessageClickListener);
        super.requestRebind();
    }
    public void setOpenAppClickListener(@Nullable android.view.View.OnClickListener OpenAppClickListener) {
        this.mOpenAppClickListener = OpenAppClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4000L;
        }
        notifyPropertyChanged(BR.openAppClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 1 :
                return onChangeViewModelParticipants((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelRemoteIsComposing((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeChatSendingViewModelTextToSend((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeChatSendingViewModelSendMessageEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelSecurityLevelContentDescription((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 8 :
                return onChangeViewModelComposingList((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeChatSendingViewModelIsReadOnly((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
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
    private boolean onChangeViewModelParticipants(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelParticipants, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRemoteIsComposing(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelRemoteIsComposing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelTextToSend(androidx.lifecycle.MutableLiveData<java.lang.String> ChatSendingViewModelTextToSend, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSubject(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelSendMessageEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelSendMessageEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSecurityLevelContentDescription(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelSecurityLevelContentDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelComposingList(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelComposingList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsReadOnly(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsReadOnly, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSecurityLevelIcon(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelSecurityLevelIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        android.view.View.OnClickListener closeBubbleClickListener = mCloseBubbleClickListener;
        boolean viewModelContactNameJavaLangObjectNull = false;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> viewModelContact = null;
        int viewModelRemoteIsComposingViewVISIBLEViewINVISIBLE = 0;
        int viewModelChatRoomIsEphemeralEnabledViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelParticipants = null;
        java.lang.String viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = null;
        org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel = mChatSendingViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelRemoteIsComposing = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> chatSendingViewModelTextToSend = null;
        java.lang.Boolean chatSendingViewModelSendMessageEnabledGetValue = null;
        boolean viewModelEncryptedChatRoom = false;
        android.view.View.OnClickListener sendMessageClickListener = mSendMessageClickListener;
        boolean chatSendingViewModelSendMessageEnabledChatSendingViewModelIsReadOnlyBooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSubject = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnly = false;
        java.lang.Integer viewModelSecurityLevelIconGetValue = null;
        java.lang.String viewModelContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelSendMessageEnabled = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue = false;
        int chatSendingViewModelImeFlags = 0;
        boolean chatSendingViewModelIsReadOnly = false;
        int viewModelEncryptedChatRoomViewVISIBLEViewGONE = 0;
        java.lang.Boolean chatSendingViewModelIsReadOnlyGetValue = null;
        java.lang.Integer viewModelSecurityLevelContentDescriptionGetValue = null;
        java.lang.String viewModelDisplayNameGetValue = null;
        java.lang.String viewModelParticipantsGetValue = null;
        org.linphone.core.ChatRoom viewModelChatRoom = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelSecurityLevelContentDescription = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelContentDescriptionGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue = false;
        boolean viewModelOneToOneChatRoom = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelComposingList = null;
        java.lang.String viewModelSubjectGetValue = null;
        org.linphone.core.Friend viewModelContactGetValue = null;
        android.view.View.OnClickListener openAppClickListener = mOpenAppClickListener;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelIconGetValue = 0;
        java.lang.String chatSendingViewModelTextToSendGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsReadOnly1 = null;
        java.lang.String viewModelComposingListGetValue = null;
        java.lang.Boolean viewModelRemoteIsComposingGetValue = null;
        boolean viewModelChatRoomIsEphemeralEnabled = false;
        org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel viewModel = mViewModel;
        java.lang.String viewModelOneToOneChatRoomViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactNameViewModelSubject = null;
        int viewModelOneToOneChatRoomViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelSecurityLevelIcon = null;

        if ((dirtyFlags & 0x10800L) != 0) {
        }
        if ((dirtyFlags & 0x11248L) != 0) {


            if ((dirtyFlags & 0x11008L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.textToSend
                        chatSendingViewModelTextToSend = chatSendingViewModel.getTextToSend();
                    }
                    updateLiveDataRegistration(3, chatSendingViewModelTextToSend);


                    if (chatSendingViewModelTextToSend != null) {
                        // read chatSendingViewModel.textToSend.getValue()
                        chatSendingViewModelTextToSendGetValue = chatSendingViewModelTextToSend.getValue();
                    }
            }
            if ((dirtyFlags & 0x11240L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.sendMessageEnabled
                        chatSendingViewModelSendMessageEnabled = chatSendingViewModel.getSendMessageEnabled();
                    }
                    updateLiveDataRegistration(6, chatSendingViewModelSendMessageEnabled);


                    if (chatSendingViewModelSendMessageEnabled != null) {
                        // read chatSendingViewModel.sendMessageEnabled.getValue()
                        chatSendingViewModelSendMessageEnabledGetValue = chatSendingViewModelSendMessageEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.sendMessageEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelSendMessageEnabledGetValue);
                if((dirtyFlags & 0x11240L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }
            }
            if ((dirtyFlags & 0x11000L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.imeFlags
                        chatSendingViewModelImeFlags = chatSendingViewModel.getImeFlags();
                    }
            }
            if ((dirtyFlags & 0x11200L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isReadOnly
                        ChatSendingViewModelIsReadOnly1 = chatSendingViewModel.isReadOnly();
                    }
                    updateLiveDataRegistration(9, ChatSendingViewModelIsReadOnly1);


                    if (ChatSendingViewModelIsReadOnly1 != null) {
                        // read chatSendingViewModel.isReadOnly.getValue()
                        chatSendingViewModelIsReadOnlyGetValue = ChatSendingViewModelIsReadOnly1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsReadOnlyGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue())
                    chatSendingViewModelIsReadOnly = !androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue;


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnly = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsReadOnly);
            }
        }
        if ((dirtyFlags & 0x12000L) != 0) {
        }
        if ((dirtyFlags & 0x14000L) != 0) {
        }
        if ((dirtyFlags & 0x185b7L) != 0) {


            if ((dirtyFlags & 0x18002L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.participants
                        viewModelParticipants = viewModel.getParticipants();
                    }
                    updateLiveDataRegistration(1, viewModelParticipants);


                    if (viewModelParticipants != null) {
                        // read viewModel.participants.getValue()
                        viewModelParticipantsGetValue = viewModelParticipants.getValue();
                    }
            }
            if ((dirtyFlags & 0x18004L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.remoteIsComposing
                        viewModelRemoteIsComposing = viewModel.getRemoteIsComposing();
                    }
                    updateLiveDataRegistration(2, viewModelRemoteIsComposing);


                    if (viewModelRemoteIsComposing != null) {
                        // read viewModel.remoteIsComposing.getValue()
                        viewModelRemoteIsComposingGetValue = viewModelRemoteIsComposing.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRemoteIsComposingGetValue);
                if((dirtyFlags & 0x18004L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue()) ? View.VISIBLE : View.INVISIBLE
                    viewModelRemoteIsComposingViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x18000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.encryptedChatRoom
                        viewModelEncryptedChatRoom = viewModel.getEncryptedChatRoom();
                        // read viewModel.chatRoom
                        viewModelChatRoom = viewModel.getChatRoom();
                    }
                if((dirtyFlags & 0x18000L) != 0) {
                    if(viewModelEncryptedChatRoom) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read viewModel.encryptedChatRoom ? View.VISIBLE : View.GONE
                    viewModelEncryptedChatRoomViewVISIBLEViewGONE = ((viewModelEncryptedChatRoom) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    if (viewModelChatRoom != null) {
                        // read viewModel.chatRoom.isEphemeralEnabled()
                        viewModelChatRoomIsEphemeralEnabled = viewModelChatRoom.isEphemeralEnabled();
                    }
                if((dirtyFlags & 0x18000L) != 0) {
                    if(viewModelChatRoomIsEphemeralEnabled) {
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read viewModel.chatRoom.isEphemeralEnabled() ? View.VISIBLE : View.GONE
                    viewModelChatRoomIsEphemeralEnabledViewVISIBLEViewGONE = ((viewModelChatRoomIsEphemeralEnabled) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18080L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.securityLevelContentDescription
                        viewModelSecurityLevelContentDescription = viewModel.getSecurityLevelContentDescription();
                    }
                    updateLiveDataRegistration(7, viewModelSecurityLevelContentDescription);


                    if (viewModelSecurityLevelContentDescription != null) {
                        // read viewModel.securityLevelContentDescription.getValue()
                        viewModelSecurityLevelContentDescriptionGetValue = viewModelSecurityLevelContentDescription.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.securityLevelContentDescription.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelContentDescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSecurityLevelContentDescriptionGetValue);
            }
            if ((dirtyFlags & 0x18031L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.oneToOneChatRoom
                        viewModelOneToOneChatRoom = viewModel.getOneToOneChatRoom();
                    }
                if((dirtyFlags & 0x18031L) != 0) {
                    if(viewModelOneToOneChatRoom) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
                if((dirtyFlags & 0x18000L) != 0) {
                    if(viewModelOneToOneChatRoom) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }

                if ((dirtyFlags & 0x18000L) != 0) {

                        // read viewModel.oneToOneChatRoom ? View.GONE : View.VISIBLE
                        viewModelOneToOneChatRoomViewGONEViewVISIBLE = ((viewModelOneToOneChatRoom) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x18100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.composingList
                        viewModelComposingList = viewModel.getComposingList();
                    }
                    updateLiveDataRegistration(8, viewModelComposingList);


                    if (viewModelComposingList != null) {
                        // read viewModel.composingList.getValue()
                        viewModelComposingListGetValue = viewModelComposingList.getValue();
                    }
            }
            if ((dirtyFlags & 0x18400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.securityLevelIcon
                        viewModelSecurityLevelIcon = viewModel.getSecurityLevelIcon();
                    }
                    updateLiveDataRegistration(10, viewModelSecurityLevelIcon);


                    if (viewModelSecurityLevelIcon != null) {
                        // read viewModel.securityLevelIcon.getValue()
                        viewModelSecurityLevelIconGetValue = viewModelSecurityLevelIcon.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.securityLevelIcon.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelIconGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSecurityLevelIconGetValue);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x1000000L) != 0) {

                if (chatSendingViewModel != null) {
                    // read chatSendingViewModel.isReadOnly
                    ChatSendingViewModelIsReadOnly1 = chatSendingViewModel.isReadOnly();
                }
                updateLiveDataRegistration(9, ChatSendingViewModelIsReadOnly1);


                if (ChatSendingViewModelIsReadOnly1 != null) {
                    // read chatSendingViewModel.isReadOnly.getValue()
                    chatSendingViewModelIsReadOnlyGetValue = ChatSendingViewModelIsReadOnly1.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue())
                androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsReadOnlyGetValue);


                // read !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue())
                chatSendingViewModelIsReadOnly = !androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue;
        }
        if ((dirtyFlags & 0x18000000L) != 0) {


            if ((dirtyFlags & 0x10000000L) != 0) {

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
                if((dirtyFlags & 0x10000000L) != 0) {
                    if(viewModelContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
            }
            if ((dirtyFlags & 0x8000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subject
                        viewModelSubject = viewModel.getSubject();
                    }
                    updateLiveDataRegistration(4, viewModelSubject);


                    if (viewModelSubject != null) {
                        // read viewModel.subject.getValue()
                        viewModelSubjectGetValue = viewModelSubject.getValue();
                    }
            }
        }

        if ((dirtyFlags & 0x11240L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.sendMessageEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) : false
                chatSendingViewModelSendMessageEnabledChatSendingViewModelIsReadOnlyBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelSendMessageEnabledGetValue) ? (chatSendingViewModelIsReadOnly) : (false));
        }
        // batch finished

        if ((dirtyFlags & 0x400000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.displayName
                    viewModelDisplayName = viewModel.getDisplayName();
                }
                updateLiveDataRegistration(5, viewModelDisplayName);


                if (viewModelDisplayName != null) {
                    // read viewModel.displayName.getValue()
                    viewModelDisplayNameGetValue = viewModelDisplayName.getValue();
                }
        }

        if ((dirtyFlags & 0x10000000L) != 0) {

                // read viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
                viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = ((viewModelContactNameJavaLangObjectNull) ? (viewModelDisplayNameGetValue) : (viewModelContactName));
        }

        if ((dirtyFlags & 0x18031L) != 0) {

                // read viewModel.oneToOneChatRoom ? viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name : viewModel.subject.getValue()
                viewModelOneToOneChatRoomViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactNameViewModelSubject = ((viewModelOneToOneChatRoom) ? (viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName) : (viewModelSubjectGetValue));
        }
        // batch finished
        if ((dirtyFlags & 0x10800L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(closeBubbleClickListener);
        }
        if ((dirtyFlags & 0x18031L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelOneToOneChatRoomViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactNameViewModelSubject);
        }
        if ((dirtyFlags & 0x18002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelParticipantsGetValue);
        }
        if ((dirtyFlags & 0x18000L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelOneToOneChatRoomViewGONEViewVISIBLE);
            this.mboundView7.setVisibility(viewModelChatRoomIsEphemeralEnabledViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(viewModelEncryptedChatRoomViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x14000L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(openAppClickListener);
        }
        if ((dirtyFlags & 0x11240L) != 0) {
            // api target 1

            this.mboundView7.setEnabled(chatSendingViewModelSendMessageEnabledChatSendingViewModelIsReadOnlyBooleanFalse);
            this.sendMessage.setEnabled(chatSendingViewModelSendMessageEnabledChatSendingViewModelIsReadOnlyBooleanFalse);
        }
        if ((dirtyFlags & 0x18400L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView9, androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelIconGetValue);
        }
        if ((dirtyFlags & 0x18080L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView9, androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelContentDescriptionGetValue);
        }
        if ((dirtyFlags & 0x11200L) != 0) {
            // api target 1

            this.message.setEnabled(androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnly);
        }
        if ((dirtyFlags & 0x11008L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.message, chatSendingViewModelTextToSendGetValue);
        }
        if ((dirtyFlags & 0x11000L) != 0) {
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.message.setImeOptions(chatSendingViewModelImeFlags);
            }
        }
        if ((dirtyFlags & 0x10000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.message, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, messageandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x18100L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.remoteComposing, viewModelComposingListGetValue);
        }
        if ((dirtyFlags & 0x18004L) != 0) {
            // api target 1

            this.remoteComposing.setVisibility(viewModelRemoteIsComposingViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x12000L) != 0) {
            // api target 1

            this.sendMessage.setOnClickListener(sendMessageClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.contact
        flag 1 (0x2L): viewModel.participants
        flag 2 (0x3L): viewModel.remoteIsComposing
        flag 3 (0x4L): chatSendingViewModel.textToSend
        flag 4 (0x5L): viewModel.subject
        flag 5 (0x6L): viewModel.displayName
        flag 6 (0x7L): chatSendingViewModel.sendMessageEnabled
        flag 7 (0x8L): viewModel.securityLevelContentDescription
        flag 8 (0x9L): viewModel.composingList
        flag 9 (0xaL): chatSendingViewModel.isReadOnly
        flag 10 (0xbL): viewModel.securityLevelIcon
        flag 11 (0xcL): closeBubbleClickListener
        flag 12 (0xdL): chatSendingViewModel
        flag 13 (0xeL): sendMessageClickListener
        flag 14 (0xfL): openAppClickListener
        flag 15 (0x10L): viewModel
        flag 16 (0x11L): null
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 19 (0x14L): viewModel.chatRoom.isEphemeralEnabled() ? View.VISIBLE : View.GONE
        flag 20 (0x15L): viewModel.chatRoom.isEphemeralEnabled() ? View.VISIBLE : View.GONE
        flag 21 (0x16L): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 22 (0x17L): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.sendMessageEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) : false
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.sendMessageEnabled.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) : false
        flag 25 (0x1aL): viewModel.encryptedChatRoom ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewModel.encryptedChatRoom ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): viewModel.oneToOneChatRoom ? viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name : viewModel.subject.getValue()
        flag 28 (0x1dL): viewModel.oneToOneChatRoom ? viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name : viewModel.subject.getValue()
        flag 29 (0x1eL): viewModel.oneToOneChatRoom ? View.GONE : View.VISIBLE
        flag 30 (0x1fL): viewModel.oneToOneChatRoom ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}