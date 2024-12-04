package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomDetailFragmentBindingImpl extends ChatRoomDetailFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(0, 
            new String[] {"chat_room_sending"},
            new int[] {12},
            new int[] {org.linphone.R.layout.chat_room_sending});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 13);
        sViewsWithIds.put(R.id.list_edit_top_bar_fragment, 14);
        sViewsWithIds.put(R.id.chat_messages_list, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView2;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback213;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatRoomDetailFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ChatRoomDetailFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 17
            , (android.widget.ImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[15]
            , (org.linphone.databinding.ChatRoomSendingBinding) bindings[12]
            , (org.linphone.views.MarqueeTextView) bindings[4]
            , (androidx.fragment.app.FragmentContainerView) bindings[14]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.LinearLayout) bindings[13]
            );
        this.back.setTag(null);
        setContainedBinding(this.footer);
        this.lastSeenAt.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.RelativeLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (org.linphone.views.MarqueeTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (org.linphone.views.MarqueeTextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView9 = (android.widget.ImageView) bindings[9];
        this.mboundView9.setTag(null);
        this.menu.setTag(null);
        this.remoteComposing.setTag(null);
        setRootTag(root);
        // listeners
        mCallback213 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10000000L;
        }
        footer.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (footer.hasPendingBindings()) {
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
        else if (BR.menuClickListener == variableId) {
            setMenuClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.voiceRecordingTouchListener == variableId) {
            setVoiceRecordingTouchListener((android.view.View.OnTouchListener) variable);
        }
        else if (BR.groupCallListener == variableId) {
            setGroupCallListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.chatSendingViewModel == variableId) {
            setChatSendingViewModel((org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel) variable);
        }
        else if (BR.securityIconClickListener == variableId) {
            setSecurityIconClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.sharedMainViewModel == variableId) {
            setSharedMainViewModel((org.linphone.activities.main.viewmodels.SharedMainViewModel) variable);
        }
        else if (BR.cancelReplyToClickListener == variableId) {
            setCancelReplyToClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.menuLongClickListener == variableId) {
            setMenuLongClickListener((android.view.View.OnLongClickListener) variable);
        }
        else if (BR.scrollToBottomClickListener == variableId) {
            setScrollToBottomClickListener((android.view.View.OnClickListener) variable);
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
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.attachFileClickListener);
        super.requestRebind();
    }
    public void setMenuClickListener(@Nullable android.view.View.OnClickListener MenuClickListener) {
        this.mMenuClickListener = MenuClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.menuClickListener);
        super.requestRebind();
    }
    public void setVoiceRecordingTouchListener(@Nullable android.view.View.OnTouchListener VoiceRecordingTouchListener) {
        this.mVoiceRecordingTouchListener = VoiceRecordingTouchListener;
        synchronized(this) {
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.voiceRecordingTouchListener);
        super.requestRebind();
    }
    public void setGroupCallListener(@Nullable android.view.View.OnClickListener GroupCallListener) {
        this.mGroupCallListener = GroupCallListener;
        synchronized(this) {
            mDirtyFlags |= 0x100000L;
        }
        notifyPropertyChanged(BR.groupCallListener);
        super.requestRebind();
    }
    public void setChatSendingViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel ChatSendingViewModel) {
        this.mChatSendingViewModel = ChatSendingViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200000L;
        }
        notifyPropertyChanged(BR.chatSendingViewModel);
        super.requestRebind();
    }
    public void setSecurityIconClickListener(@Nullable android.view.View.OnClickListener SecurityIconClickListener) {
        this.mSecurityIconClickListener = SecurityIconClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x400000L;
        }
        notifyPropertyChanged(BR.securityIconClickListener);
        super.requestRebind();
    }
    public void setSharedMainViewModel(@Nullable org.linphone.activities.main.viewmodels.SharedMainViewModel SharedMainViewModel) {
        this.mSharedMainViewModel = SharedMainViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800000L;
        }
        notifyPropertyChanged(BR.sharedMainViewModel);
        super.requestRebind();
    }
    public void setCancelReplyToClickListener(@Nullable android.view.View.OnClickListener CancelReplyToClickListener) {
        this.mCancelReplyToClickListener = CancelReplyToClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1000000L;
        }
        notifyPropertyChanged(BR.cancelReplyToClickListener);
        super.requestRebind();
    }
    public void setMenuLongClickListener(@Nullable android.view.View.OnLongClickListener MenuLongClickListener) {
        this.mMenuLongClickListener = MenuLongClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2000000L;
        }
        notifyPropertyChanged(BR.menuLongClickListener);
        super.requestRebind();
    }
    public void setScrollToBottomClickListener(@Nullable android.view.View.OnClickListener ScrollToBottomClickListener) {
        this.mScrollToBottomClickListener = ScrollToBottomClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x4000000L;
        }
        notifyPropertyChanged(BR.scrollToBottomClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8000000L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        footer.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 1 :
                return onChangeViewModelIsUserScrollingUp((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeChatSendingViewModelIsEmojiPickerOpen((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 6 :
                return onChangeViewModelSecurityLevelContentDescription((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 7 :
                return onChangeFooter((org.linphone.databinding.ChatRoomSendingBinding) object, fieldId);
            case 8 :
                return onChangeViewModelSecurityLevelIcon((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 9 :
                return onChangeViewModelParticipants((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeViewModelRemoteIsComposing((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeViewModelUnreadMessagesCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 12 :
                return onChangeViewModelLastPresenceInfo((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeViewModelChatUnreadCountTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 14 :
                return onChangeViewModelComposingList((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 15 :
                return onChangeChatSendingViewModelIsReadOnly((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 16 :
                return onChangeSharedMainViewModelIsSlidingPaneSlideable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
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
    private boolean onChangeViewModelIsUserScrollingUp(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsUserScrollingUp, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSubject(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsEmojiPickerOpen(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsEmojiPickerOpen, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelPresenceStatus(androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> ViewModelPresenceStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSecurityLevelContentDescription(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelSecurityLevelContentDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeFooter(org.linphone.databinding.ChatRoomSendingBinding Footer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSecurityLevelIcon(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelSecurityLevelIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelParticipants(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelParticipants, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRemoteIsComposing(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelRemoteIsComposing, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUnreadMessagesCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelUnreadMessagesCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLastPresenceInfo(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLastPresenceInfo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelChatUnreadCountTranslateY(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelChatUnreadCountTranslateY, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelComposingList(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelComposingList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeChatSendingViewModelIsReadOnly(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsReadOnly, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSharedMainViewModelIsSlidingPaneSlideable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SharedMainViewModelIsSlidingPaneSlideable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
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
        java.lang.String viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = null;
        java.lang.Boolean sharedMainViewModelIsSlidingPaneSlideableGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsUserScrollingUpGetValue = false;
        android.view.View.OnClickListener menuClickListener = mMenuClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsUserScrollingUp = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelUnreadMessagesCountGetValue = 0;
        java.lang.String stringValueOfViewModelUnreadMessagesCount = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSubject = null;
        int viewModelOneToOneChatRoomViewModelPresenceStatusConsolidatedPresenceOfflineBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> chatSendingViewModelIsEmojiPickerOpen = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> viewModelPresenceStatus = null;
        boolean chatSendingViewModelIsReadOnly = false;
        int viewModelEncryptedChatRoomViewVISIBLEViewGONE = 0;
        java.lang.String viewModelDisplayNameGetValue = null;
        java.lang.String viewModelParticipantsGetValue = null;
        java.lang.Boolean viewModelIsUserScrollingUpGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelSecurityLevelContentDescription = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelContentDescriptionGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue = false;
        org.linphone.core.Friend viewModelContactGetValue = null;
        android.view.View.OnTouchListener voiceRecordingTouchListener = mVoiceRecordingTouchListener;
        java.lang.String viewModelLastPresenceInfoGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue = false;
        java.lang.Integer viewModelUnreadMessagesCountGetValue = null;
        java.lang.Boolean viewModelRemoteIsComposingGetValue = null;
        boolean ChatSendingViewModelIsEmojiPickerOpen1 = false;
        org.linphone.core.ConsolidatedPresence viewModelPresenceStatusGetValue = null;
        android.view.View.OnClickListener groupCallListener = mGroupCallListener;
        java.lang.String viewModelOneToOneChatRoomViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactNameViewModelSubject = null;
        java.lang.Float viewModelChatUnreadCountTranslateYGetValue = null;
        int viewModelOneToOneChatRoomViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelSecurityLevelIcon = null;
        boolean viewModelPresenceStatusConsolidatedPresenceOffline = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelParticipants = null;
        org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel chatSendingViewModel = mChatSendingViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelRemoteIsComposing = null;
        boolean viewModelIsUserScrollingUpChatSendingViewModelIsEmojiPickerOpenBooleanFalse = false;
        android.view.View.OnClickListener securityIconClickListener = mSecurityIconClickListener;
        boolean viewModelEncryptedChatRoom = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelUnreadMessagesCount = null;
        org.linphone.activities.main.viewmodels.SharedMainViewModel sharedMainViewModel = mSharedMainViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLastPresenceInfo = null;
        java.lang.Integer viewModelSecurityLevelIconGetValue = null;
        java.lang.String viewModelContactName = null;
        boolean viewModelGroupCallAvailable = false;
        android.view.View.OnClickListener cancelReplyToClickListener = mCancelReplyToClickListener;
        java.lang.Boolean chatSendingViewModelIsReadOnlyGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelChatUnreadCountTranslateY = null;
        java.lang.Integer viewModelSecurityLevelContentDescriptionGetValue = null;
        boolean viewModelUnreadMessagesCountInt0 = false;
        android.view.View.OnLongClickListener menuLongClickListener = mMenuLongClickListener;
        int viewModelIsUserScrollingUpChatSendingViewModelIsEmojiPickerOpenBooleanFalseViewVISIBLEViewGONE = 0;
        int sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = 0;
        int viewModelRemoteIsComposingViewVISIBLEViewGONE = 0;
        boolean viewModelOneToOneChatRoom = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelComposingList = null;
        java.lang.String viewModelSubjectGetValue = null;
        boolean viewModelGroupCallAvailableChatSendingViewModelIsReadOnlyBooleanFalse = false;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelIconGetValue = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerOpenGetValue = false;
        int viewModelOneToOneChatRoomViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> ChatSendingViewModelIsReadOnly1 = null;
        java.lang.String viewModelComposingListGetValue = null;
        java.lang.Boolean chatSendingViewModelIsEmojiPickerOpenGetValue = null;
        android.view.View.OnClickListener scrollToBottomClickListener = mScrollToBottomClickListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = false;
        android.graphics.drawable.Drawable viewModelUnreadMessagesCountInt0MboundView11AndroidDrawableHiddenUnreadMessageCountBgMboundView11AndroidDrawableUnreadMessageCountBg = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> sharedMainViewModelIsSlidingPaneSlideable = null;
        org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel viewModel = mViewModel;
        java.lang.String viewModelUnreadMessagesCountInt0JavaLangStringStringValueOfViewModelUnreadMessagesCount = null;
        boolean viewModelOneToOneChatRoomViewModelPresenceStatusConsolidatedPresenceOfflineBooleanFalse = false;
        float androidxDatabindingViewDataBindingSafeUnboxViewModelChatUnreadCountTranslateYGetValue = 0f;

        if ((dirtyFlags & 0x10020000L) != 0) {
        }
        if ((dirtyFlags & 0x10040000L) != 0) {
        }
        if ((dirtyFlags & 0x10080000L) != 0) {
        }
        if ((dirtyFlags & 0x10100000L) != 0) {
        }
        if ((dirtyFlags & 0x10200000L) != 0) {
        }
        if ((dirtyFlags & 0x10400000L) != 0) {
        }
        if ((dirtyFlags & 0x10810000L) != 0) {



                if (sharedMainViewModel != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable
                    sharedMainViewModelIsSlidingPaneSlideable = sharedMainViewModel.isSlidingPaneSlideable();
                }
                updateLiveDataRegistration(16, sharedMainViewModelIsSlidingPaneSlideable);


                if (sharedMainViewModelIsSlidingPaneSlideable != null) {
                    // read sharedMainViewModel.isSlidingPaneSlideable.getValue()
                    sharedMainViewModelIsSlidingPaneSlideableGetValue = sharedMainViewModelIsSlidingPaneSlideable.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModelIsSlidingPaneSlideableGetValue);
            if((dirtyFlags & 0x10810000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) {
                        dirtyFlags |= 0x100000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
                sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSharedMainViewModelIsSlidingPaneSlideableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x11000000L) != 0) {
        }
        if ((dirtyFlags & 0x12000000L) != 0) {
        }
        if ((dirtyFlags & 0x14000000L) != 0) {
        }
        if ((dirtyFlags & 0x1820ff7fL) != 0) {


            if ((dirtyFlags & 0x1820000aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isUserScrollingUp
                        viewModelIsUserScrollingUp = viewModel.isUserScrollingUp();
                    }
                    updateLiveDataRegistration(1, viewModelIsUserScrollingUp);


                    if (viewModelIsUserScrollingUp != null) {
                        // read viewModel.isUserScrollingUp.getValue()
                        viewModelIsUserScrollingUpGetValue = viewModelIsUserScrollingUp.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUserScrollingUp.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsUserScrollingUpGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsUserScrollingUpGetValue);
                if((dirtyFlags & 0x1820000aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsUserScrollingUpGetValue) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x18000040L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.securityLevelContentDescription
                        viewModelSecurityLevelContentDescription = viewModel.getSecurityLevelContentDescription();
                    }
                    updateLiveDataRegistration(6, viewModelSecurityLevelContentDescription);


                    if (viewModelSecurityLevelContentDescription != null) {
                        // read viewModel.securityLevelContentDescription.getValue()
                        viewModelSecurityLevelContentDescriptionGetValue = viewModelSecurityLevelContentDescription.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.securityLevelContentDescription.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelContentDescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSecurityLevelContentDescriptionGetValue);
            }
            if ((dirtyFlags & 0x18000100L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.securityLevelIcon
                        viewModelSecurityLevelIcon = viewModel.getSecurityLevelIcon();
                    }
                    updateLiveDataRegistration(8, viewModelSecurityLevelIcon);


                    if (viewModelSecurityLevelIcon != null) {
                        // read viewModel.securityLevelIcon.getValue()
                        viewModelSecurityLevelIconGetValue = viewModelSecurityLevelIcon.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.securityLevelIcon.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelIconGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelSecurityLevelIconGetValue);
            }
            if ((dirtyFlags & 0x18000200L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.participants
                        viewModelParticipants = viewModel.getParticipants();
                    }
                    updateLiveDataRegistration(9, viewModelParticipants);


                    if (viewModelParticipants != null) {
                        // read viewModel.participants.getValue()
                        viewModelParticipantsGetValue = viewModelParticipants.getValue();
                    }
            }
            if ((dirtyFlags & 0x18000400L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.remoteIsComposing
                        viewModelRemoteIsComposing = viewModel.getRemoteIsComposing();
                    }
                    updateLiveDataRegistration(10, viewModelRemoteIsComposing);


                    if (viewModelRemoteIsComposing != null) {
                        // read viewModel.remoteIsComposing.getValue()
                        viewModelRemoteIsComposingGetValue = viewModelRemoteIsComposing.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRemoteIsComposingGetValue);
                if((dirtyFlags & 0x18000400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue()) ? View.VISIBLE : View.GONE
                    viewModelRemoteIsComposingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelRemoteIsComposingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.encryptedChatRoom
                        viewModelEncryptedChatRoom = viewModel.getEncryptedChatRoom();
                    }
                if((dirtyFlags & 0x18000000L) != 0) {
                    if(viewModelEncryptedChatRoom) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }


                    // read viewModel.encryptedChatRoom ? View.VISIBLE : View.GONE
                    viewModelEncryptedChatRoomViewVISIBLEViewGONE = ((viewModelEncryptedChatRoom) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x18000800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.unreadMessagesCount
                        viewModelUnreadMessagesCount = viewModel.getUnreadMessagesCount();
                    }
                    updateLiveDataRegistration(11, viewModelUnreadMessagesCount);


                    if (viewModelUnreadMessagesCount != null) {
                        // read viewModel.unreadMessagesCount.getValue()
                        viewModelUnreadMessagesCountGetValue = viewModelUnreadMessagesCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelUnreadMessagesCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelUnreadMessagesCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0
                    viewModelUnreadMessagesCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelUnreadMessagesCountGetValue) == (0);
                if((dirtyFlags & 0x18000800L) != 0) {
                    if(viewModelUnreadMessagesCountInt0) {
                            dirtyFlags |= 0x10000000000000L;
                            dirtyFlags |= 0x40000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000000L;
                            dirtyFlags |= 0x20000000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? @android:drawable/hidden_unread_message_count_bg : @android:drawable/unread_message_count_bg
                    viewModelUnreadMessagesCountInt0MboundView11AndroidDrawableHiddenUnreadMessageCountBgMboundView11AndroidDrawableUnreadMessageCountBg = ((viewModelUnreadMessagesCountInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView11.getContext(), R.drawable.hidden_unread_message_count_bg)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView11.getContext(), R.drawable.unread_message_count_bg)));
            }
            if ((dirtyFlags & 0x18001000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.lastPresenceInfo
                        viewModelLastPresenceInfo = viewModel.getLastPresenceInfo();
                    }
                    updateLiveDataRegistration(12, viewModelLastPresenceInfo);


                    if (viewModelLastPresenceInfo != null) {
                        // read viewModel.lastPresenceInfo.getValue()
                        viewModelLastPresenceInfoGetValue = viewModelLastPresenceInfo.getValue();
                    }
            }
            if ((dirtyFlags & 0x18208000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.groupCallAvailable
                        viewModelGroupCallAvailable = viewModel.getGroupCallAvailable();
                    }
                if((dirtyFlags & 0x18208000L) != 0) {
                    if(viewModelGroupCallAvailable) {
                            dirtyFlags |= 0x1000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x18002000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.chatUnreadCountTranslateY
                        viewModelChatUnreadCountTranslateY = viewModel.getChatUnreadCountTranslateY();
                    }
                    updateLiveDataRegistration(13, viewModelChatUnreadCountTranslateY);


                    if (viewModelChatUnreadCountTranslateY != null) {
                        // read viewModel.chatUnreadCountTranslateY.getValue()
                        viewModelChatUnreadCountTranslateYGetValue = viewModelChatUnreadCountTranslateY.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.chatUnreadCountTranslateY.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelChatUnreadCountTranslateYGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelChatUnreadCountTranslateYGetValue);
            }
            if ((dirtyFlags & 0x18000035L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.oneToOneChatRoom
                        viewModelOneToOneChatRoom = viewModel.getOneToOneChatRoom();
                    }
                if((dirtyFlags & 0x18000015L) != 0) {
                    if(viewModelOneToOneChatRoom) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }
                if((dirtyFlags & 0x18000000L) != 0) {
                    if(viewModelOneToOneChatRoom) {
                            dirtyFlags |= 0x4000000000L;
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                            dirtyFlags |= 0x2000000000000L;
                    }
                }
                if((dirtyFlags & 0x18000020L) != 0) {
                    if(viewModelOneToOneChatRoom) {
                            dirtyFlags |= 0x100000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000000000L;
                    }
                }

                if ((dirtyFlags & 0x18000000L) != 0) {

                        // read viewModel.oneToOneChatRoom ? View.GONE : View.VISIBLE
                        viewModelOneToOneChatRoomViewGONEViewVISIBLE = ((viewModelOneToOneChatRoom) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read viewModel.oneToOneChatRoom ? View.VISIBLE : View.GONE
                        viewModelOneToOneChatRoomViewVISIBLEViewGONE = ((viewModelOneToOneChatRoom) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x18004000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.composingList
                        viewModelComposingList = viewModel.getComposingList();
                    }
                    updateLiveDataRegistration(14, viewModelComposingList);


                    if (viewModelComposingList != null) {
                        // read viewModel.composingList.getValue()
                        viewModelComposingListGetValue = viewModelComposingList.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20000000000000L) != 0) {

                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()))
                stringValueOfViewModelUnreadMessagesCount = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxViewModelUnreadMessagesCountGetValue);
        }
        if ((dirtyFlags & 0x1010000000000L) != 0) {


            if ((dirtyFlags & 0x10000000000L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isEmojiPickerOpen
                        chatSendingViewModelIsEmojiPickerOpen = chatSendingViewModel.isEmojiPickerOpen();
                    }
                    updateLiveDataRegistration(3, chatSendingViewModelIsEmojiPickerOpen);


                    if (chatSendingViewModelIsEmojiPickerOpen != null) {
                        // read chatSendingViewModel.isEmojiPickerOpen.getValue()
                        chatSendingViewModelIsEmojiPickerOpenGetValue = chatSendingViewModelIsEmojiPickerOpen.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerOpenGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsEmojiPickerOpenGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue())
                    ChatSendingViewModelIsEmojiPickerOpen1 = !androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsEmojiPickerOpenGetValue;
            }
            if ((dirtyFlags & 0x1000000000000L) != 0) {

                    if (chatSendingViewModel != null) {
                        // read chatSendingViewModel.isReadOnly
                        ChatSendingViewModelIsReadOnly1 = chatSendingViewModel.isReadOnly();
                    }
                    updateLiveDataRegistration(15, ChatSendingViewModelIsReadOnly1);


                    if (ChatSendingViewModelIsReadOnly1 != null) {
                        // read chatSendingViewModel.isReadOnly.getValue()
                        chatSendingViewModelIsReadOnlyGetValue = ChatSendingViewModelIsReadOnly1.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue = androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModelIsReadOnlyGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue())
                    chatSendingViewModelIsReadOnly = !androidxDatabindingViewDataBindingSafeUnboxChatSendingViewModelIsReadOnlyGetValue;
            }
        }
        if ((dirtyFlags & 0x100001800000000L) != 0) {


            if ((dirtyFlags & 0x1000000000L) != 0) {

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
                if((dirtyFlags & 0x1000000000L) != 0) {
                    if(viewModelContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x800000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subject
                        viewModelSubject = viewModel.getSubject();
                    }
                    updateLiveDataRegistration(2, viewModelSubject);


                    if (viewModelSubject != null) {
                        // read viewModel.subject.getValue()
                        viewModelSubjectGetValue = viewModelSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x100000000000000L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.presenceStatus
                        viewModelPresenceStatus = viewModel.getPresenceStatus();
                    }
                    updateLiveDataRegistration(5, viewModelPresenceStatus);


                    if (viewModelPresenceStatus != null) {
                        // read viewModel.presenceStatus.getValue()
                        viewModelPresenceStatusGetValue = viewModelPresenceStatus.getValue();
                    }


                    // read viewModel.presenceStatus.getValue() != ConsolidatedPresence.Offline
                    viewModelPresenceStatusConsolidatedPresenceOffline = (viewModelPresenceStatusGetValue) != (org.linphone.core.ConsolidatedPresence.Offline);
            }
        }

        if ((dirtyFlags & 0x1820000aL) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUserScrollingUp.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue()) : false
                viewModelIsUserScrollingUpChatSendingViewModelIsEmojiPickerOpenBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsUserScrollingUpGetValue) ? (ChatSendingViewModelIsEmojiPickerOpen1) : (false));
            if((dirtyFlags & 0x1820000aL) != 0) {
                if(viewModelIsUserScrollingUpChatSendingViewModelIsEmojiPickerOpenBooleanFalse) {
                        dirtyFlags |= 0x40000000000L;
                }
                else {
                        dirtyFlags |= 0x20000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUserScrollingUp.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue()) : false ? View.VISIBLE : View.GONE
                viewModelIsUserScrollingUpChatSendingViewModelIsEmojiPickerOpenBooleanFalseViewVISIBLEViewGONE = ((viewModelIsUserScrollingUpChatSendingViewModelIsEmojiPickerOpenBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x18208000L) != 0) {

                // read viewModel.groupCallAvailable ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) : false
                viewModelGroupCallAvailableChatSendingViewModelIsReadOnlyBooleanFalse = ((viewModelGroupCallAvailable) ? (chatSendingViewModelIsReadOnly) : (false));
        }
        if ((dirtyFlags & 0x18000800L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? "" : String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()))
                viewModelUnreadMessagesCountInt0JavaLangStringStringValueOfViewModelUnreadMessagesCount = ((viewModelUnreadMessagesCountInt0) ? ("") : (stringValueOfViewModelUnreadMessagesCount));
        }
        if ((dirtyFlags & 0x18000020L) != 0) {

                // read viewModel.oneToOneChatRoom ? viewModel.presenceStatus.getValue() != ConsolidatedPresence.Offline : false
                viewModelOneToOneChatRoomViewModelPresenceStatusConsolidatedPresenceOfflineBooleanFalse = ((viewModelOneToOneChatRoom) ? (viewModelPresenceStatusConsolidatedPresenceOffline) : (false));
            if((dirtyFlags & 0x18000020L) != 0) {
                if(viewModelOneToOneChatRoomViewModelPresenceStatusConsolidatedPresenceOfflineBooleanFalse) {
                        dirtyFlags |= 0x100000000L;
                }
                else {
                        dirtyFlags |= 0x80000000L;
                }
            }


                // read viewModel.oneToOneChatRoom ? viewModel.presenceStatus.getValue() != ConsolidatedPresence.Offline : false ? View.VISIBLE : View.GONE
                viewModelOneToOneChatRoomViewModelPresenceStatusConsolidatedPresenceOfflineBooleanFalseViewVISIBLEViewGONE = ((viewModelOneToOneChatRoomViewModelPresenceStatusConsolidatedPresenceOfflineBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x40000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.displayName
                    viewModelDisplayName = viewModel.getDisplayName();
                }
                updateLiveDataRegistration(4, viewModelDisplayName);


                if (viewModelDisplayName != null) {
                    // read viewModel.displayName.getValue()
                    viewModelDisplayNameGetValue = viewModelDisplayName.getValue();
                }
        }

        if ((dirtyFlags & 0x1000000000L) != 0) {

                // read viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
                viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName = ((viewModelContactNameJavaLangObjectNull) ? (viewModelDisplayNameGetValue) : (viewModelContactName));
        }

        if ((dirtyFlags & 0x18000015L) != 0) {

                // read viewModel.oneToOneChatRoom ? viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name : viewModel.subject.getValue()
                viewModelOneToOneChatRoomViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactNameViewModelSubject = ((viewModelOneToOneChatRoom) ? (viewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactName) : (viewModelSubjectGetValue));
        }
        // batch finished
        if ((dirtyFlags & 0x10810000L) != 0) {
            // api target 1

            this.back.setVisibility(sharedMainViewModelIsSlidingPaneSlideableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18000000L) != 0) {
            // api target 1

            this.footer.setViewModel(viewModel);
            this.mboundView3.setVisibility(viewModelOneToOneChatRoomViewGONEViewVISIBLE);
            this.mboundView5.setVisibility(viewModelOneToOneChatRoomViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(viewModelOneToOneChatRoomViewGONEViewVISIBLE);
            this.mboundView9.setVisibility(viewModelEncryptedChatRoomViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x10200000L) != 0) {
            // api target 1

            this.footer.setChatSendingViewModel(chatSendingViewModel);
        }
        if ((dirtyFlags & 0x10020000L) != 0) {
            // api target 1

            this.footer.setAttachFileClickListener(attachFileClickListener);
        }
        if ((dirtyFlags & 0x10080000L) != 0) {
            // api target 1

            this.footer.setVoiceRecordingTouchListener(voiceRecordingTouchListener);
        }
        if ((dirtyFlags & 0x11000000L) != 0) {
            // api target 1

            this.footer.setCancelReplyToClickListener(cancelReplyToClickListener);
        }
        if ((dirtyFlags & 0x18001000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lastSeenAt, viewModelLastPresenceInfoGetValue);
        }
        if ((dirtyFlags & 0x18000020L) != 0) {
            // api target 1

            this.lastSeenAt.setVisibility(viewModelOneToOneChatRoomViewModelPresenceStatusConsolidatedPresenceOfflineBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x14000000L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(scrollToBottomClickListener);
        }
        if ((dirtyFlags & 0x1820000aL) != 0) {
            // api target 1

            this.mboundView10.setVisibility(viewModelIsUserScrollingUpChatSendingViewModelIsEmojiPickerOpenBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18000800L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView11, viewModelUnreadMessagesCountInt0MboundView11AndroidDrawableHiddenUnreadMessageCountBgMboundView11AndroidDrawableUnreadMessageCountBg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewModelUnreadMessagesCountInt0JavaLangStringStringValueOfViewModelUnreadMessagesCount);
        }
        if ((dirtyFlags & 0x18002000L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.mboundView11.setTranslationY(androidxDatabindingViewDataBindingSafeUnboxViewModelChatUnreadCountTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x18000015L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelOneToOneChatRoomViewModelContactNameJavaLangObjectNullViewModelDisplayNameViewModelContactNameViewModelSubject);
        }
        if ((dirtyFlags & 0x18000200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelParticipantsGetValue);
        }
        if ((dirtyFlags & 0x10000000L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(mCallback213);
        }
        if ((dirtyFlags & 0x10100000L) != 0) {
            // api target 1

            this.mboundView6.setOnClickListener(groupCallListener);
        }
        if ((dirtyFlags & 0x18208000L) != 0) {
            // api target 1

            this.mboundView6.setEnabled(viewModelGroupCallAvailableChatSendingViewModelIsReadOnlyBooleanFalse);
        }
        if ((dirtyFlags & 0x18000040L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView9, androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelContentDescriptionGetValue);
        }
        if ((dirtyFlags & 0x10400000L) != 0) {
            // api target 1

            this.mboundView9.setOnClickListener(securityIconClickListener);
        }
        if ((dirtyFlags & 0x18000100L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView9, androidxDatabindingViewDataBindingSafeUnboxViewModelSecurityLevelIconGetValue);
        }
        if ((dirtyFlags & 0x10040000L) != 0) {
            // api target 1

            this.menu.setOnClickListener(menuClickListener);
        }
        if ((dirtyFlags & 0x12000000L) != 0) {
            // api target 1

            this.menu.setOnLongClickListener(menuLongClickListener);
        }
        if ((dirtyFlags & 0x18004000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.remoteComposing, viewModelComposingListGetValue);
        }
        if ((dirtyFlags & 0x18000400L) != 0) {
            // api target 1

            this.remoteComposing.setVisibility(viewModelRemoteIsComposingViewVISIBLEViewGONE);
        }
        executeBindingsOn(footer);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.startCall();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.contact
        flag 1 (0x2L): viewModel.isUserScrollingUp
        flag 2 (0x3L): viewModel.subject
        flag 3 (0x4L): chatSendingViewModel.isEmojiPickerOpen
        flag 4 (0x5L): viewModel.displayName
        flag 5 (0x6L): viewModel.presenceStatus
        flag 6 (0x7L): viewModel.securityLevelContentDescription
        flag 7 (0x8L): footer
        flag 8 (0x9L): viewModel.securityLevelIcon
        flag 9 (0xaL): viewModel.participants
        flag 10 (0xbL): viewModel.remoteIsComposing
        flag 11 (0xcL): viewModel.unreadMessagesCount
        flag 12 (0xdL): viewModel.lastPresenceInfo
        flag 13 (0xeL): viewModel.chatUnreadCountTranslateY
        flag 14 (0xfL): viewModel.composingList
        flag 15 (0x10L): chatSendingViewModel.isReadOnly
        flag 16 (0x11L): sharedMainViewModel.isSlidingPaneSlideable
        flag 17 (0x12L): attachFileClickListener
        flag 18 (0x13L): menuClickListener
        flag 19 (0x14L): voiceRecordingTouchListener
        flag 20 (0x15L): groupCallListener
        flag 21 (0x16L): chatSendingViewModel
        flag 22 (0x17L): securityIconClickListener
        flag 23 (0x18L): sharedMainViewModel
        flag 24 (0x19L): cancelReplyToClickListener
        flag 25 (0x1aL): menuLongClickListener
        flag 26 (0x1bL): scrollToBottomClickListener
        flag 27 (0x1cL): viewModel
        flag 28 (0x1dL): null
        flag 29 (0x1eL): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 30 (0x1fL): viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name
        flag 31 (0x20L): viewModel.oneToOneChatRoom ? viewModel.presenceStatus.getValue() != ConsolidatedPresence.Offline : false ? View.VISIBLE : View.GONE
        flag 32 (0x21L): viewModel.oneToOneChatRoom ? viewModel.presenceStatus.getValue() != ConsolidatedPresence.Offline : false ? View.VISIBLE : View.GONE
        flag 33 (0x22L): viewModel.encryptedChatRoom ? View.VISIBLE : View.GONE
        flag 34 (0x23L): viewModel.encryptedChatRoom ? View.VISIBLE : View.GONE
        flag 35 (0x24L): viewModel.oneToOneChatRoom ? viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name : viewModel.subject.getValue()
        flag 36 (0x25L): viewModel.oneToOneChatRoom ? viewModel.contact.getValue().name == null ? viewModel.displayName.getValue() : viewModel.contact.getValue().name : viewModel.subject.getValue()
        flag 37 (0x26L): viewModel.oneToOneChatRoom ? View.GONE : View.VISIBLE
        flag 38 (0x27L): viewModel.oneToOneChatRoom ? View.GONE : View.VISIBLE
        flag 39 (0x28L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUserScrollingUp.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue()) : false
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUserScrollingUp.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue()) : false
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUserScrollingUp.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue()) : false ? View.VISIBLE : View.GONE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isUserScrollingUp.getValue()) ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isEmojiPickerOpen.getValue()) : false ? View.VISIBLE : View.GONE
        flag 43 (0x2cL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 44 (0x2dL): androidx.databinding.ViewDataBinding.safeUnbox(sharedMainViewModel.isSlidingPaneSlideable.getValue()) ? View.VISIBLE : View.GONE
        flag 45 (0x2eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue()) ? View.VISIBLE : View.GONE
        flag 46 (0x2fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.remoteIsComposing.getValue()) ? View.VISIBLE : View.GONE
        flag 47 (0x30L): viewModel.groupCallAvailable ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) : false
        flag 48 (0x31L): viewModel.groupCallAvailable ? !androidx.databinding.ViewDataBinding.safeUnbox(chatSendingViewModel.isReadOnly.getValue()) : false
        flag 49 (0x32L): viewModel.oneToOneChatRoom ? View.VISIBLE : View.GONE
        flag 50 (0x33L): viewModel.oneToOneChatRoom ? View.VISIBLE : View.GONE
        flag 51 (0x34L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? @android:drawable/hidden_unread_message_count_bg : @android:drawable/unread_message_count_bg
        flag 52 (0x35L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? @android:drawable/hidden_unread_message_count_bg : @android:drawable/unread_message_count_bg
        flag 53 (0x36L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? "" : String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()))
        flag 54 (0x37L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? "" : String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()))
        flag 55 (0x38L): viewModel.oneToOneChatRoom ? viewModel.presenceStatus.getValue() != ConsolidatedPresence.Offline : false
        flag 56 (0x39L): viewModel.oneToOneChatRoom ? viewModel.presenceStatus.getValue() != ConsolidatedPresence.Offline : false
    flag mapping end*/
    //end
}