package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatMessageListCellBindingImpl extends ChatMessageListCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(16);
        sIncludes.setIncludes(5, 
            new String[] {"chat_message_reply_bubble"},
            new int[] {14},
            new int[] {org.linphone.R.layout.chat_message_reply_bubble});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rightMark, 15);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.ProgressBar mboundView13;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @Nullable
    private final org.linphone.databinding.ChatMessageReplyBubbleBinding mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final com.google.android.flexbox.FlexboxLayout mboundView8;
    @NonNull
    private final org.linphone.activities.main.chat.views.MultiLineWrapContentWidthTextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback106;
    @Nullable
    private final android.view.View.OnClickListener mCallback107;
    // values
    private int mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdImdnInt0;
    private int mOldSelectionListViewModelIsEditionEnabledAndroidIdSelectAndroidIdRightMark;
    private int mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledInt0AndroidIdBackground;
    private int mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdBackgroundInt0;
    // listeners
    // Inverse Binding Event Handlers

    public ChatMessageListCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ChatMessageListCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 18
            , (android.widget.ImageView) bindings[3]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[11]
            , (android.view.View) bindings[15]
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.TextView) bindings[12]
            );
        this.avatar.setTag(null);
        this.background.setTag(null);
        this.imdn.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView13 = (android.widget.ProgressBar) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (org.linphone.databinding.ChatMessageReplyBubbleBinding) bindings[14];
        setContainedBinding(this.mboundView5);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (com.google.android.flexbox.FlexboxLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (org.linphone.activities.main.chat.views.MultiLineWrapContentWidthTextView) bindings[9];
        this.mboundView9.setTag(null);
        this.reactions.setTag(null);
        this.select.setTag(null);
        this.time.setTag(null);
        setRootTag(root);
        // listeners
        mCallback106 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback107 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000000L;
                mDirtyFlags_1 = 0x0L;
        }
        mboundView5.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0 || mDirtyFlags_1 != 0) {
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
        if (BR.replyClickListener == variableId) {
            setReplyClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.selectionListViewModel == variableId) {
            setSelectionListViewModel((org.linphone.activities.main.viewmodels.ListTopBarViewModel) variable);
        }
        else if (BR.data == variableId) {
            setData((org.linphone.activities.main.chat.data.ChatMessageData) variable);
        }
        else if (BR.contextMenuClickListener == variableId) {
            setContextMenuClickListener((android.view.View.OnLongClickListener) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setReplyClickListener(@Nullable android.view.View.OnClickListener ReplyClickListener) {
        this.mReplyClickListener = ReplyClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.replyClickListener);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setSelectionListViewModel(@Nullable org.linphone.activities.main.viewmodels.ListTopBarViewModel SelectionListViewModel) {
        this.mSelectionListViewModel = SelectionListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100000L;
        }
        notifyPropertyChanged(BR.selectionListViewModel);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatMessageData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x200000L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setContextMenuClickListener(@Nullable android.view.View.OnLongClickListener ContextMenuClickListener) {
        this.mContextMenuClickListener = ContextMenuClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x400000L;
        }
        notifyPropertyChanged(BR.contextMenuClickListener);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x800000L;
        }
        notifyPropertyChanged(BR.position);
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
                return onChangeDataTime((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeSelectionListViewModelSelectedItems((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>>) object, fieldId);
            case 3 :
                return onChangeDataImdnIcon((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeDataHideAvatar((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeDataShowImdn((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeDataContents((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageContentData>>) object, fieldId);
            case 7 :
                return onChangeDataSendInProgress((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeDataHideTime((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeDataReactions((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>>) object, fieldId);
            case 10 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 11 :
                return onChangeDataReplyData((androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData>) object, fieldId);
            case 12 :
                return onChangeDataText((androidx.lifecycle.MutableLiveData<android.text.Spannable>) object, fieldId);
            case 13 :
                return onChangeDataPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 14 :
                return onChangeDataBackgroundRes((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 15 :
                return onChangeSelectionListViewModelIsEditionEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 16 :
                return onChangeDataIsTextEmoji((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 17 :
                return onChangeDataEphemeralLifetime((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataTime(androidx.lifecycle.MutableLiveData<java.lang.String> DataTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> DataDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelSelectedItems(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> SelectionListViewModelSelectedItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataImdnIcon(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataImdnIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataHideAvatar(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataHideAvatar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataShowImdn(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataShowImdn, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataContents(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageContentData>> DataContents, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataSendInProgress(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataSendInProgress, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataHideTime(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataHideTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataReactions(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> DataReactions, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataReplyData(androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData> DataReplyData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataText(androidx.lifecycle.MutableLiveData<android.text.Spannable> DataText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataPresenceStatus(androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> DataPresenceStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataBackgroundRes(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataBackgroundRes, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelIsEditionEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SelectionListViewModelIsEditionEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsTextEmoji(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsTextEmoji, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataEphemeralLifetime(androidx.lifecycle.MutableLiveData<java.lang.String> DataEphemeralLifetime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20000L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        long dirtyFlags_1 = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
            dirtyFlags_1 = mDirtyFlags_1;
            mDirtyFlags_1 = 0;
        }
        java.lang.Integer dataBackgroundResGetValue = null;
        android.view.View.OnClickListener replyClickListener = mReplyClickListener;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataSendInProgressGetValue = false;
        java.lang.Boolean dataShowImdnGetValue = null;
        java.lang.String dataDisplayNameGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataBackgroundResGetValue = 0;
        int dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledViewGONEDataHideAvatarViewINVISIBLEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataTime = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        java.lang.Boolean selectionListViewModelIsEditionEnabledGetValue = null;
        int dataChatMessageOutgoingDataShowImdnViewVISIBLEViewINVISIBLEViewINVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataHideTimeGetValue = false;
        int dataSendInProgressViewVISIBLEViewGONE = 0;
        int selectionListViewModelIsEditionEnabledAndroidIdSelectAndroidIdRightMark = 0;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> selectionListViewModelSelectedItems = null;
        int dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdBackgroundInt0 = 0;
        int dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatarBooleanTrueDataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        float dataChatMessageOutgoingBackgroundAndroidDimenIncomingChatMessageBubbleLeftMarginBackgroundAndroidDimenOutgoingChatMessageBubbleLeftMargin = 0f;
        java.lang.Boolean dataHideAvatarGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataImdnIcon = null;
        int dataReplyDataJavaLangObjectNullViewVISIBLEViewGONE = 0;
        android.view.View.OnClickListener clickListener = mClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataHideAvatar = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataShowImdn = null;
        int dataHideTimeViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageContentData>> dataContents = null;
        int dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledInt0AndroidIdBackground = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataSendInProgress = null;
        boolean dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled = false;
        boolean dataChatMessageOutgoing = false;
        boolean dataTextLengthInt0 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataHideTime = null;
        org.linphone.activities.main.chat.data.ChatMessageData dataReplyDataGetValue = null;
        java.lang.String dataContactName = null;
        java.lang.Boolean dataHideTimeGetValue = null;
        boolean dataPresenceStatusConsolidatedPresenceOffline = false;
        float dataChatMessageOutgoingBackgroundAndroidDimenOutgoingChatMessageBubbleRightMarginBackgroundAndroidDimenIncomingChatMessageBubbleRightMargin = 0f;
        float selectionListViewModelIsEditionEnabledBackgroundAndroidDimenEditChatMessageBubbleLeftMarginDataChatMessageOutgoingBackgroundAndroidDimenIncomingChatMessageBubbleLeftMarginBackgroundAndroidDimenOutgoingChatMessageBubbleLeftMargin = 0f;
        int dataTextLengthInt0ViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.String>> dataReactions = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        java.lang.String dataEphemeralLifetimeGetValue = null;
        java.lang.String dataChatMessageOutgoingDataTimeDataTimeJavaLangStringDataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;
        boolean selectionListViewModelSelectedItemsContainsPosition = false;
        androidx.lifecycle.MutableLiveData<org.linphone.activities.main.chat.data.ChatMessageData> dataReplyData = null;
        int dataChatMessageEphemeralViewVISIBLEViewGONE = 0;
        int dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdImdnInt0 = 0;
        int dataChatMessageOutgoingGravityRIGHTGravityLEFT = 0;
        androidx.lifecycle.MutableLiveData<android.text.Spannable> dataText = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = false;
        int selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> dataPresenceStatus = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataHideAvatarGetValue = false;
        boolean dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatarBooleanTrueDataPresenceStatusConsolidatedPresenceOffline = false;
        java.lang.Boolean dataSendInProgressGetValue = null;
        int dataChatMessageOutgoingJustifyContentFLEXENDJustifyContentFLEXSTART = 0;
        int androidxDatabindingViewDataBindingSafeUnboxDataImdnIconGetValue = 0;
        boolean dataChatMessageForward = false;
        org.linphone.activities.main.chat.data.ChatMessageData data = mData;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataBackgroundRes = null;
        java.lang.Integer dataImdnIconGetValue = null;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        android.view.View.OnLongClickListener contextMenuClickListener = mContextMenuClickListener;
        boolean DataChatMessageOutgoing1 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> selectionListViewModelIsEditionEnabled = null;
        int dataShowImdnViewVISIBLEViewINVISIBLE = 0;
        java.lang.String dataTimeJavaLangStringDataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        boolean dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatar = false;
        java.lang.Boolean dataIsTextEmojiGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsTextEmoji = null;
        org.linphone.core.Friend dataContactGetValue = null;
        int dataHideAvatarViewINVISIBLEViewVISIBLE = 0;
        int dataChatMessageForwardViewVISIBLEViewGONE = 0;
        boolean dataChatMessageReply = false;
        java.lang.Integer position = mPosition;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataEphemeralLifetime = null;
        org.linphone.core.ConsolidatedPresence dataPresenceStatusGetValue = null;
        int dataTextLength = 0;
        java.util.ArrayList<java.lang.Integer> selectionListViewModelSelectedItemsGetValue = null;
        boolean dataReplyDataJavaLangObjectNull = false;
        int dataReactionsSizeInt0ViewVISIBLEViewGONE = 0;
        org.linphone.core.ChatMessage dataChatMessage = null;
        java.lang.String dataTimeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataShowImdnGetValue = false;
        java.lang.String dataTimeJavaLangString = null;
        java.util.ArrayList<org.linphone.activities.main.chat.data.ChatMessageContentData> dataContentsGetValue = null;
        boolean dataReactionsSizeInt0 = false;
        java.util.ArrayList<java.lang.String> dataReactionsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsTextEmojiGetValue = false;
        android.text.Spannable dataTextGetValue = null;
        int dataReactionsSize = 0;
        int dataChatMessageReplyViewVISIBLEViewGONE = 0;
        boolean dataChatMessageEphemeral = false;
        android.graphics.drawable.Drawable dataChatMessageOutgoingReactionsAndroidDrawableChatBubbleOutgoingReactionsReactionsAndroidDrawableChatBubbleIncomingReactions = null;
        float dataIsTextEmojiMboundView9AndroidDimenChatMessageEmojiFontSizeMboundView9AndroidDimenChatMessageTextFontSize = 0f;

        if ((dirtyFlags & 0x1040000L) != 0) {
        }
        if ((dirtyFlags & 0x1080000L) != 0) {
        }
        if ((dirtyFlags & 0x1b08004L) != 0) {


            if ((dirtyFlags & 0x1900004L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.selectedItems
                        selectionListViewModelSelectedItems = selectionListViewModel.getSelectedItems();
                    }
                    updateLiveDataRegistration(2, selectionListViewModelSelectedItems);


                    if (selectionListViewModelSelectedItems != null) {
                        // read selectionListViewModel.selectedItems.getValue()
                        selectionListViewModelSelectedItemsGetValue = selectionListViewModelSelectedItems.getValue();
                    }
            }
            if ((dirtyFlags & 0x1308000L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.isEditionEnabled
                        selectionListViewModelIsEditionEnabled = selectionListViewModel.isEditionEnabled();
                    }
                    updateLiveDataRegistration(15, selectionListViewModelIsEditionEnabled);


                    if (selectionListViewModelIsEditionEnabled != null) {
                        // read selectionListViewModel.isEditionEnabled.getValue()
                        selectionListViewModelIsEditionEnabledGetValue = selectionListViewModelIsEditionEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModelIsEditionEnabledGetValue);
                if((dirtyFlags & 0x1108000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                            dirtyFlags |= 0x100000000L;
                            dirtyFlags |= 0x4000000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                            dirtyFlags |= 0x2000000000000000L;
                    }
                }
                if((dirtyFlags & 0x1308000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                            dirtyFlags |= 0x4000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000000L;
                    }
                }

                if ((dirtyFlags & 0x1108000L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:id/select : @android:id/rightMark
                        selectionListViewModelIsEditionEnabledAndroidIdSelectAndroidIdRightMark = ((androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) ? (R.id.select) : (R.id.rightMark));
                        // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
                        selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
        }
        if ((dirtyFlags & 0x173fffbL) != 0) {


            if ((dirtyFlags & 0x1200008L) != 0) {

                    if (data != null) {
                        // read data.imdnIcon
                        dataImdnIcon = data.getImdnIcon();
                    }
                    updateLiveDataRegistration(3, dataImdnIcon);


                    if (dataImdnIcon != null) {
                        // read data.imdnIcon.getValue()
                        dataImdnIconGetValue = dataImdnIcon.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.imdnIcon.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataImdnIconGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataImdnIconGetValue);
            }
            if ((dirtyFlags & 0x1600040L) != 0) {

                    if (data != null) {
                        // read data.contents
                        dataContents = data.getContents();
                    }
                    updateLiveDataRegistration(6, dataContents);


                    if (dataContents != null) {
                        // read data.contents.getValue()
                        dataContentsGetValue = dataContents.getValue();
                    }
            }
            if ((dirtyFlags & 0x1200080L) != 0) {

                    if (data != null) {
                        // read data.sendInProgress
                        dataSendInProgress = data.getSendInProgress();
                    }
                    updateLiveDataRegistration(7, dataSendInProgress);


                    if (dataSendInProgress != null) {
                        // read data.sendInProgress.getValue()
                        dataSendInProgressGetValue = dataSendInProgress.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.sendInProgress.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataSendInProgressGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataSendInProgressGetValue);
                if((dirtyFlags & 0x1200080L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataSendInProgressGetValue) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.sendInProgress.getValue()) ? View.VISIBLE : View.GONE
                    dataSendInProgressViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataSendInProgressGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1200100L) != 0) {

                    if (data != null) {
                        // read data.hideTime
                        dataHideTime = data.getHideTime();
                    }
                    updateLiveDataRegistration(8, dataHideTime);


                    if (dataHideTime != null) {
                        // read data.hideTime.getValue()
                        dataHideTimeGetValue = dataHideTime.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.hideTime.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataHideTimeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataHideTimeGetValue);
                if((dirtyFlags & 0x1200100L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataHideTimeGetValue) {
                            dirtyFlags |= 0x40000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.hideTime.getValue()) ? View.GONE : View.VISIBLE
                    dataHideTimeViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataHideTimeGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1200200L) != 0) {

                    if (data != null) {
                        // read data.reactions
                        dataReactions = data.getReactions();
                    }
                    updateLiveDataRegistration(9, dataReactions);


                    if (dataReactions != null) {
                        // read data.reactions.getValue()
                        dataReactionsGetValue = dataReactions.getValue();
                    }


                    if (dataReactionsGetValue != null) {
                        // read data.reactions.getValue().size()
                        dataReactionsSize = dataReactionsGetValue.size();
                    }


                    // read data.reactions.getValue().size() > 0
                    dataReactionsSizeInt0 = (dataReactionsSize) > (0);
                if((dirtyFlags & 0x1200200L) != 0) {
                    if(dataReactionsSizeInt0) {
                            dirtyFlags_1 |= 0x4000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x2000L;
                    }
                }


                    // read data.reactions.getValue().size() > 0 ? View.VISIBLE : View.GONE
                    dataReactionsSizeInt0ViewVISIBLEViewGONE = ((dataReactionsSizeInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1200800L) != 0) {

                    if (data != null) {
                        // read data.replyData
                        dataReplyData = data.getReplyData();
                    }
                    updateLiveDataRegistration(11, dataReplyData);


                    if (dataReplyData != null) {
                        // read data.replyData.getValue()
                        dataReplyDataGetValue = dataReplyData.getValue();
                    }


                    // read data.replyData.getValue() != null
                    dataReplyDataJavaLangObjectNull = (dataReplyDataGetValue) != (null);
                if((dirtyFlags & 0x1200800L) != 0) {
                    if(dataReplyDataJavaLangObjectNull) {
                            dirtyFlags |= 0x10000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000L;
                    }
                }


                    // read data.replyData.getValue() != null ? View.VISIBLE : View.GONE
                    dataReplyDataJavaLangObjectNullViewVISIBLEViewGONE = ((dataReplyDataJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1201000L) != 0) {

                    if (data != null) {
                        // read data.text
                        dataText = data.getText();
                    }
                    updateLiveDataRegistration(12, dataText);


                    if (dataText != null) {
                        // read data.text.getValue()
                        dataTextGetValue = dataText.getValue();
                    }


                    if (dataTextGetValue != null) {
                        // read data.text.getValue().length
                        dataTextLength = dataTextGetValue.length();
                    }


                    // read data.text.getValue().length > 0
                    dataTextLengthInt0 = (dataTextLength) > (0);
                if((dirtyFlags & 0x1201000L) != 0) {
                    if(dataTextLengthInt0) {
                            dirtyFlags |= 0x10000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000000000L;
                    }
                }


                    // read data.text.getValue().length > 0 ? View.VISIBLE : View.GONE
                    dataTextLengthInt0ViewVISIBLEViewGONE = ((dataTextLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1202000L) != 0) {

                    if (data != null) {
                        // read data.presenceStatus
                        dataPresenceStatus = data.getPresenceStatus();
                    }
                    updateLiveDataRegistration(13, dataPresenceStatus);


                    if (dataPresenceStatus != null) {
                        // read data.presenceStatus.getValue()
                        dataPresenceStatusGetValue = dataPresenceStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0x1204000L) != 0) {

                    if (data != null) {
                        // read data.backgroundRes
                        dataBackgroundRes = data.getBackgroundRes();
                    }
                    updateLiveDataRegistration(14, dataBackgroundRes);


                    if (dataBackgroundRes != null) {
                        // read data.backgroundRes.getValue()
                        dataBackgroundResGetValue = dataBackgroundRes.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.backgroundRes.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataBackgroundResGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataBackgroundResGetValue);
            }
            if ((dirtyFlags & 0x1210000L) != 0) {

                    if (data != null) {
                        // read data.isTextEmoji
                        dataIsTextEmoji = data.isTextEmoji();
                    }
                    updateLiveDataRegistration(16, dataIsTextEmoji);


                    if (dataIsTextEmoji != null) {
                        // read data.isTextEmoji.getValue()
                        dataIsTextEmojiGetValue = dataIsTextEmoji.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isTextEmoji.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsTextEmojiGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsTextEmojiGetValue);
                if((dirtyFlags & 0x1210000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsTextEmojiGetValue) {
                            dirtyFlags_1 |= 0x100000L;
                    }
                    else {
                            dirtyFlags_1 |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isTextEmoji.getValue()) ? @android:dimen/chat_message_emoji_font_size : @android:dimen/chat_message_text_font_size
                    dataIsTextEmojiMboundView9AndroidDimenChatMessageEmojiFontSizeMboundView9AndroidDimenChatMessageTextFontSize = ((androidxDatabindingViewDataBindingSafeUnboxDataIsTextEmojiGetValue) ? (mboundView9.getResources().getDimension(R.dimen.chat_message_emoji_font_size)) : (mboundView9.getResources().getDimension(R.dimen.chat_message_text_font_size)));
            }
            if ((dirtyFlags & 0x1220000L) != 0) {

                    if (data != null) {
                        // read data.ephemeralLifetime
                        dataEphemeralLifetime = data.getEphemeralLifetime();
                    }
                    updateLiveDataRegistration(17, dataEphemeralLifetime);


                    if (dataEphemeralLifetime != null) {
                        // read data.ephemeralLifetime.getValue()
                        dataEphemeralLifetimeGetValue = dataEphemeralLifetime.getValue();
                    }
            }
            if ((dirtyFlags & 0x130a433L) != 0) {

                    if (data != null) {
                        // read data.chatMessage
                        dataChatMessage = data.getChatMessage();
                    }

                if ((dirtyFlags & 0x1200000L) != 0) {

                        if (dataChatMessage != null) {
                            // read data.chatMessage.forward
                            dataChatMessageForward = dataChatMessage.isForward();
                            // read data.chatMessage.reply
                            dataChatMessageReply = dataChatMessage.isReply();
                            // read data.chatMessage.ephemeral
                            dataChatMessageEphemeral = dataChatMessage.isEphemeral();
                        }
                    if((dirtyFlags & 0x1200000L) != 0) {
                        if(dataChatMessageForward) {
                                dirtyFlags_1 |= 0x1000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x800L;
                        }
                    }
                    if((dirtyFlags & 0x1200000L) != 0) {
                        if(dataChatMessageReply) {
                                dirtyFlags_1 |= 0x10000L;
                        }
                        else {
                                dirtyFlags_1 |= 0x8000L;
                        }
                    }
                    if((dirtyFlags & 0x1200000L) != 0) {
                        if(dataChatMessageEphemeral) {
                                dirtyFlags |= 0x100000000000000L;
                        }
                        else {
                                dirtyFlags |= 0x80000000000000L;
                        }
                    }


                        // read data.chatMessage.forward ? View.VISIBLE : View.GONE
                        dataChatMessageForwardViewVISIBLEViewGONE = ((dataChatMessageForward) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read data.chatMessage.reply ? View.VISIBLE : View.GONE
                        dataChatMessageReplyViewVISIBLEViewGONE = ((dataChatMessageReply) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read data.chatMessage.ephemeral ? View.VISIBLE : View.GONE
                        dataChatMessageEphemeralViewVISIBLEViewGONE = ((dataChatMessageEphemeral) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }

                    if (dataChatMessage != null) {
                        // read data.chatMessage.outgoing
                        DataChatMessageOutgoing1 = dataChatMessage.isOutgoing();
                    }
                if((dirtyFlags & 0x1200020L) != 0) {
                    if(DataChatMessageOutgoing1) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
                if((dirtyFlags & 0x130a010L) != 0) {
                    if(DataChatMessageOutgoing1) {
                            dirtyFlags |= 0x400000000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000000L;
                    }
                }
                if((dirtyFlags & 0x1200000L) != 0) {
                    if(DataChatMessageOutgoing1) {
                            dirtyFlags |= 0x1000000000000L;
                            dirtyFlags |= 0x1000000000000000L;
                            dirtyFlags_1 |= 0x4L;
                            dirtyFlags_1 |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000000L;
                            dirtyFlags |= 0x800000000000000L;
                            dirtyFlags_1 |= 0x2L;
                            dirtyFlags_1 |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x1200403L) != 0) {
                    if(DataChatMessageOutgoing1) {
                            dirtyFlags |= 0x40000000000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000000000L;
                    }
                }

                if ((dirtyFlags & 0x1200000L) != 0) {

                        // read data.chatMessage.outgoing ? @android:dimen/outgoing_chat_message_bubble_right_margin : @android:dimen/incoming_chat_message_bubble_right_margin
                        dataChatMessageOutgoingBackgroundAndroidDimenOutgoingChatMessageBubbleRightMarginBackgroundAndroidDimenIncomingChatMessageBubbleRightMargin = ((DataChatMessageOutgoing1) ? (background.getResources().getDimension(R.dimen.outgoing_chat_message_bubble_right_margin)) : (background.getResources().getDimension(R.dimen.incoming_chat_message_bubble_right_margin)));
                        // read data.chatMessage.outgoing ? Gravity.RIGHT : Gravity.LEFT
                        dataChatMessageOutgoingGravityRIGHTGravityLEFT = ((DataChatMessageOutgoing1) ? (android.view.Gravity.RIGHT) : (android.view.Gravity.LEFT));
                        // read data.chatMessage.outgoing ? JustifyContent.FLEX_END : JustifyContent.FLEX_START
                        dataChatMessageOutgoingJustifyContentFLEXENDJustifyContentFLEXSTART = ((DataChatMessageOutgoing1) ? (com.google.android.flexbox.JustifyContent.FLEX_END) : (com.google.android.flexbox.JustifyContent.FLEX_START));
                        // read data.chatMessage.outgoing ? @android:drawable/chat_bubble_outgoing_reactions : @android:drawable/chat_bubble_incoming_reactions
                        dataChatMessageOutgoingReactionsAndroidDrawableChatBubbleOutgoingReactionsReactionsAndroidDrawableChatBubbleIncomingReactions = ((DataChatMessageOutgoing1) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(reactions.getContext(), R.drawable.chat_bubble_outgoing_reactions)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(reactions.getContext(), R.drawable.chat_bubble_incoming_reactions)));
                }
            }
        }
        if ((dirtyFlags & 0x1600040L) != 0) {
        }
        if ((dirtyFlags & 0x1900004L) != 0) {



                if (selectionListViewModelSelectedItemsGetValue != null) {
                    // read selectionListViewModel.selectedItems.getValue().contains(position)
                    selectionListViewModelSelectedItemsContainsPosition = selectionListViewModelSelectedItemsGetValue.contains(position);
                }
        }
        // batch finished

        if ((dirtyFlags & 0x200000000000L) != 0) {



                if (selectionListViewModel != null) {
                    // read selectionListViewModel.isEditionEnabled
                    selectionListViewModelIsEditionEnabled = selectionListViewModel.isEditionEnabled();
                }
                updateLiveDataRegistration(15, selectionListViewModelIsEditionEnabled);


                if (selectionListViewModelIsEditionEnabled != null) {
                    // read selectionListViewModel.isEditionEnabled.getValue()
                    selectionListViewModelIsEditionEnabledGetValue = selectionListViewModelIsEditionEnabled.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
                androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModelIsEditionEnabledGetValue);
            if((dirtyFlags & 0x1108000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                        dirtyFlags |= 0x100000000L;
                        dirtyFlags |= 0x4000000000000000L;
                }
                else {
                        dirtyFlags |= 0x80000000L;
                        dirtyFlags |= 0x2000000000000000L;
                }
            }
            if((dirtyFlags & 0x1308000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                        dirtyFlags |= 0x4000000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000000L;
                }
            }
        }
        if ((dirtyFlags & 0x60000010000000L) != 0) {


            if ((dirtyFlags & 0x60000000000000L) != 0) {

                    if (data != null) {
                        // read data.time
                        dataTime = data.getTime();
                    }
                    updateLiveDataRegistration(0, dataTime);


                    if (dataTime != null) {
                        // read data.time.getValue()
                        dataTimeGetValue = dataTime.getValue();
                    }

                if ((dirtyFlags & 0x20000000000000L) != 0) {

                        // read (data.time.getValue()) + (" - ")
                        dataTimeJavaLangString = (dataTimeGetValue) + (" - ");
                }
            }
            if ((dirtyFlags & 0x10000000L) != 0) {

                    if (data != null) {
                        // read data.showImdn
                        dataShowImdn = data.getShowImdn();
                    }
                    updateLiveDataRegistration(5, dataShowImdn);


                    if (dataShowImdn != null) {
                        // read data.showImdn.getValue()
                        dataShowImdnGetValue = dataShowImdn.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showImdn.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataShowImdnGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataShowImdnGetValue);
                if((dirtyFlags & 0x10000000L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataShowImdnGetValue) {
                            dirtyFlags_1 |= 0x40L;
                    }
                    else {
                            dirtyFlags_1 |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showImdn.getValue()) ? View.VISIBLE : View.INVISIBLE
                    dataShowImdnViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataShowImdnGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x20000000000000L) != 0) {

                    if (data != null) {
                        // read data.contact
                        dataContact = data.getContact();
                    }
                    updateLiveDataRegistration(10, dataContact);


                    if (dataContact != null) {
                        // read data.contact.getValue()
                        dataContactGetValue = dataContact.getValue();
                    }


                    if (dataContactGetValue != null) {
                        // read data.contact.getValue().name
                        dataContactName = dataContactGetValue.getName();
                    }


                    // read data.contact.getValue().name == null
                    dataContactNameJavaLangObjectNull = (dataContactName) == (null);
                if((dirtyFlags & 0x20000000000000L) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags_1 |= 0x10L;
                    }
                    else {
                            dirtyFlags_1 |= 0x8L;
                    }
                }
            }
        }

        if ((dirtyFlags & 0x1200020L) != 0) {

                // read data.chatMessage.outgoing ? androidx.databinding.ViewDataBinding.safeUnbox(data.showImdn.getValue()) ? View.VISIBLE : View.INVISIBLE : View.INVISIBLE
                dataChatMessageOutgoingDataShowImdnViewVISIBLEViewINVISIBLEViewINVISIBLE = ((DataChatMessageOutgoing1) ? (dataShowImdnViewVISIBLEViewINVISIBLE) : (android.view.View.INVISIBLE));
        }
        if ((dirtyFlags & 0x130a010L) != 0) {

                // read data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
                dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled = ((DataChatMessageOutgoing1) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue));
            if((dirtyFlags & 0x1308010L) != 0) {
                if(dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled) {
                        dirtyFlags |= 0x4000000L;
                }
                else {
                        dirtyFlags |= 0x2000000L;
                }
            }
            if((dirtyFlags & 0x1308000L) != 0) {
                if(dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled) {
                        dirtyFlags |= 0x400000000L;
                        dirtyFlags |= 0x100000000000L;
                        dirtyFlags |= 0x400000000000000L;
                }
                else {
                        dirtyFlags |= 0x200000000L;
                        dirtyFlags |= 0x80000000000L;
                        dirtyFlags |= 0x200000000000000L;
                }
            }
            if((dirtyFlags & 0x130a010L) != 0) {
                if(dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled) {
                        dirtyFlags_1 |= 0x100L;
                }
                else {
                        dirtyFlags_1 |= 0x80L;
                }
            }

            if ((dirtyFlags & 0x1308000L) != 0) {

                    // read data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:id/background : 0
                    dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdBackgroundInt0 = ((dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled) ? (R.id.background) : (0));
                    // read data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? 0 : @android:id/background
                    dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledInt0AndroidIdBackground = ((dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled) ? (0) : (R.id.background));
                    // read data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:id/imdn : 0
                    dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdImdnInt0 = ((dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled) ? (R.id.imdn) : (0));
            }
        }
        // batch finished

        if ((dirtyFlags_1 & 0x10L) != 0) {

                if (data != null) {
                    // read data.displayName
                    dataDisplayName = data.getDisplayName();
                }
                updateLiveDataRegistration(1, dataDisplayName);


                if (dataDisplayName != null) {
                    // read data.displayName.getValue()
                    dataDisplayNameGetValue = dataDisplayName.getValue();
                }
        }
        if ((dirtyFlags & 0x2000000L) != 0 || (dirtyFlags_1 & 0x80L) != 0) {

                if (data != null) {
                    // read data.hideAvatar
                    dataHideAvatar = data.getHideAvatar();
                }
                updateLiveDataRegistration(4, dataHideAvatar);


                if (dataHideAvatar != null) {
                    // read data.hideAvatar.getValue()
                    dataHideAvatarGetValue = dataHideAvatar.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataHideAvatarGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataHideAvatarGetValue);
            if((dirtyFlags & 0x2000000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataHideAvatarGetValue) {
                        dirtyFlags_1 |= 0x400L;
                }
                else {
                        dirtyFlags_1 |= 0x200L;
                }
            }

            if ((dirtyFlags & 0x2000000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? View.INVISIBLE : View.VISIBLE
                    dataHideAvatarViewINVISIBLEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataHideAvatarGetValue) ? (android.view.View.INVISIBLE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0x2000000000000L) != 0) {

                // read !data.chatMessage.outgoing
                dataChatMessageOutgoing = !DataChatMessageOutgoing1;
            if((dirtyFlags & 0x2000000000000L) != 0) {
                if(dataChatMessageOutgoing) {
                        dirtyFlags |= 0x4000000000L;
                }
                else {
                        dirtyFlags |= 0x2000000000L;
                }
            }


                // read !data.chatMessage.outgoing ? @android:dimen/incoming_chat_message_bubble_left_margin : @android:dimen/outgoing_chat_message_bubble_left_margin
                dataChatMessageOutgoingBackgroundAndroidDimenIncomingChatMessageBubbleLeftMarginBackgroundAndroidDimenOutgoingChatMessageBubbleLeftMargin = ((dataChatMessageOutgoing) ? (background.getResources().getDimension(R.dimen.incoming_chat_message_bubble_left_margin)) : (background.getResources().getDimension(R.dimen.outgoing_chat_message_bubble_left_margin)));
        }

        if ((dirtyFlags & 0x1308010L) != 0) {

                // read data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.GONE : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? View.INVISIBLE : View.VISIBLE
                dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledViewGONEDataHideAvatarViewINVISIBLEViewVISIBLE = ((dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled) ? (android.view.View.GONE) : (dataHideAvatarViewINVISIBLEViewVISIBLE));
        }
        if ((dirtyFlags & 0x1308000L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:dimen/edit_chat_message_bubble_left_margin : !data.chatMessage.outgoing ? @android:dimen/incoming_chat_message_bubble_left_margin : @android:dimen/outgoing_chat_message_bubble_left_margin
                selectionListViewModelIsEditionEnabledBackgroundAndroidDimenEditChatMessageBubbleLeftMarginDataChatMessageOutgoingBackgroundAndroidDimenIncomingChatMessageBubbleLeftMarginBackgroundAndroidDimenOutgoingChatMessageBubbleLeftMargin = ((androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) ? (background.getResources().getDimension(R.dimen.edit_chat_message_bubble_left_margin)) : (dataChatMessageOutgoingBackgroundAndroidDimenIncomingChatMessageBubbleLeftMarginBackgroundAndroidDimenOutgoingChatMessageBubbleLeftMargin));
        }
        if ((dirtyFlags & 0x20000000000000L) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));


                // read ((data.time.getValue()) + (" - ")) + (data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name)
                dataTimeJavaLangStringDataContactNameJavaLangObjectNullDataDisplayNameDataContactName = (dataTimeJavaLangString) + (dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
        if ((dirtyFlags & 0x130a010L) != 0) {

                // read data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue())
                dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatar = ((dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabled) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxDataHideAvatarGetValue));
            if((dirtyFlags & 0x130a010L) != 0) {
                if(dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatar) {
                        dirtyFlags_1 |= 0x1L;
                }
                else {
                        dirtyFlags |= 0x8000000000000000L;
                }
            }
        }

        if ((dirtyFlags & 0x1200403L) != 0) {

                // read data.chatMessage.outgoing ? data.time.getValue() : ((data.time.getValue()) + (" - ")) + (data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name)
                dataChatMessageOutgoingDataTimeDataTimeJavaLangStringDataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((DataChatMessageOutgoing1) ? (dataTimeGetValue) : (dataTimeJavaLangStringDataContactNameJavaLangObjectNullDataDisplayNameDataContactName));
        }
        // batch finished

        if ((dirtyFlags & 0x8000000000000000L) != 0) {

                if (data != null) {
                    // read data.presenceStatus
                    dataPresenceStatus = data.getPresenceStatus();
                }
                updateLiveDataRegistration(13, dataPresenceStatus);


                if (dataPresenceStatus != null) {
                    // read data.presenceStatus.getValue()
                    dataPresenceStatusGetValue = dataPresenceStatus.getValue();
                }


                // read data.presenceStatus.getValue() == ConsolidatedPresence.Offline
                dataPresenceStatusConsolidatedPresenceOffline = (dataPresenceStatusGetValue) == (org.linphone.core.ConsolidatedPresence.Offline);
        }

        if ((dirtyFlags & 0x130a010L) != 0) {

                // read data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? true : data.presenceStatus.getValue() == ConsolidatedPresence.Offline
                dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatarBooleanTrueDataPresenceStatusConsolidatedPresenceOffline = ((dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatar) ? (true) : (dataPresenceStatusConsolidatedPresenceOffline));
            if((dirtyFlags & 0x130a010L) != 0) {
                if(dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatarBooleanTrueDataPresenceStatusConsolidatedPresenceOffline) {
                        dirtyFlags |= 0x1000000000L;
                }
                else {
                        dirtyFlags |= 0x800000000L;
                }
            }


                // read data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? true : data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
                dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatarBooleanTrueDataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = ((dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatarBooleanTrueDataPresenceStatusConsolidatedPresenceOffline) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x1200000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.avatar, data);
            org.linphone.utils.DataBindingUtilsKt.setRightMargin(this.background, dataChatMessageOutgoingBackgroundAndroidDimenOutgoingChatMessageBubbleRightMarginBackgroundAndroidDimenIncomingChatMessageBubbleRightMargin);
            this.mboundView10.setVisibility(dataChatMessageEphemeralViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.setLayoutGravity(this.mboundView5.getRoot(), dataChatMessageOutgoingGravityRIGHTGravityLEFT);
            this.mboundView6.setVisibility(dataChatMessageForwardViewVISIBLEViewGONE);
            this.mboundView7.setVisibility(dataChatMessageReplyViewVISIBLEViewGONE);
            this.mboundView8.setJustifyContent(dataChatMessageOutgoingJustifyContentFLEXENDJustifyContentFLEXSTART);
            org.linphone.utils.DataBindingUtilsKt.setLayoutGravity(this.mboundView9, dataChatMessageOutgoingGravityRIGHTGravityLEFT);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.reactions, dataChatMessageOutgoingReactionsAndroidDrawableChatBubbleOutgoingReactionsReactionsAndroidDrawableChatBubbleIncomingReactions);
        }
        if ((dirtyFlags & 0x1308010L) != 0) {
            // api target 1

            this.avatar.setVisibility(dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledViewGONEDataHideAvatarViewINVISIBLEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1204000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setBackgroundImage(this.background, androidxDatabindingViewDataBindingSafeUnboxDataBackgroundResGetValue);
        }
        if ((dirtyFlags & 0x1308000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLeftMargin(this.background, selectionListViewModelIsEditionEnabledBackgroundAndroidDimenEditChatMessageBubbleLeftMarginDataChatMessageOutgoingBackgroundAndroidDimenIncomingChatMessageBubbleLeftMarginBackgroundAndroidDimenOutgoingChatMessageBubbleLeftMargin);
            org.linphone.utils.DataBindingUtilsKt.setLayoutToLeftOf(this.background, this.mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdImdnInt0, dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdImdnInt0);
            org.linphone.utils.DataBindingUtilsKt.setLayoutLeftAlign(this.reactions, this.mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledInt0AndroidIdBackground, dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledInt0AndroidIdBackground);
            org.linphone.utils.DataBindingUtilsKt.setLayoutRightAlign(this.reactions, this.mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdBackgroundInt0, dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdBackgroundInt0);
            org.linphone.utils.DataBindingUtilsKt.setLayoutLeftAlign(this.time, this.mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledInt0AndroidIdBackground, dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledInt0AndroidIdBackground);
            org.linphone.utils.DataBindingUtilsKt.setLayoutRightAlign(this.time, this.mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdBackgroundInt0, dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdBackgroundInt0);
        }
        if ((dirtyFlags & 0x1080000L) != 0) {
            // api target 1

            this.background.setOnClickListener(clickListener);
            this.mboundView0.setOnClickListener(clickListener);
            this.mboundView9.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x1400000L) != 0) {
            // api target 1

            this.background.setOnLongClickListener(contextMenuClickListener);
            this.mboundView9.setOnLongClickListener(contextMenuClickListener);
        }
        if ((dirtyFlags & 0x1108000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutToLeftOf(this.imdn, this.mOldSelectionListViewModelIsEditionEnabledAndroidIdSelectAndroidIdRightMark, selectionListViewModelIsEditionEnabledAndroidIdSelectAndroidIdRightMark);
            this.select.setVisibility(selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1200008L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.imdn, androidxDatabindingViewDataBindingSafeUnboxDataImdnIconGetValue);
        }
        if ((dirtyFlags & 0x1200020L) != 0) {
            // api target 1

            this.imdn.setVisibility(dataChatMessageOutgoingDataShowImdnViewVISIBLEViewINVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x1220000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, dataEphemeralLifetimeGetValue);
        }
        if ((dirtyFlags & 0x1200080L) != 0) {
            // api target 1

            this.mboundView13.setVisibility(dataSendInProgressViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1202000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView4, dataPresenceStatusGetValue);
        }
        if ((dirtyFlags & 0x130a010L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledBooleanTrueDataHideAvatarBooleanTrueDataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1200800L) != 0) {
            // api target 1

            this.mboundView5.getRoot().setVisibility(dataReplyDataJavaLangObjectNullViewVISIBLEViewGONE);
            this.mboundView5.setData(dataReplyDataGetValue);
        }
        if ((dirtyFlags & 0x1040000L) != 0) {
            // api target 1

            this.mboundView5.setClickListener(replyClickListener);
        }
        if ((dirtyFlags & 0x1600040L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView8, dataContentsGetValue, R.layout.chat_message_content_cell, contextMenuClickListener);
        }
        if ((dirtyFlags & 0x1201000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, dataTextGetValue);
            this.mboundView9.setVisibility(dataTextLengthInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1210000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextSize(this.mboundView9, dataIsTextEmojiMboundView9AndroidDimenChatMessageEmojiFontSizeMboundView9AndroidDimenChatMessageTextFontSize);
        }
        if ((dirtyFlags & 0x1000000L) != 0) {
            // api target 1

            this.reactions.setOnClickListener(mCallback107);
            this.select.setOnClickListener(mCallback106);
        }
        if ((dirtyFlags & 0x1200200L) != 0) {
            // api target 1

            this.reactions.setVisibility(dataReactionsSizeInt0ViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.setEntries(this.reactions, dataReactionsGetValue, R.layout.chat_message_reaction);
        }
        if ((dirtyFlags & 0x1900004L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.select, selectionListViewModelSelectedItemsContainsPosition);
        }
        if ((dirtyFlags & 0x1200403L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.time, dataChatMessageOutgoingDataTimeDataTimeJavaLangStringDataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
        if ((dirtyFlags & 0x1200100L) != 0) {
            // api target 1

            this.time.setVisibility(dataHideTimeViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1308000L) != 0) {
            this.mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdImdnInt0 = dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdImdnInt0;
            this.mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledInt0AndroidIdBackground = dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledInt0AndroidIdBackground;
            this.mOldDataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdBackgroundInt0 = dataChatMessageOutgoingBooleanTrueSelectionListViewModelIsEditionEnabledAndroidIdBackgroundInt0;
        }
        if ((dirtyFlags & 0x1108000L) != 0) {
            this.mOldSelectionListViewModelIsEditionEnabledAndroidIdSelectAndroidIdRightMark = selectionListViewModelIsEditionEnabledAndroidIdSelectAndroidIdRightMark;
        }
        executeBindingsOn(mboundView5);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // selectionListViewModel != null
                boolean selectionListViewModelJavaLangObjectNull = false;
                // position
                java.lang.Integer position = mPosition;
                // selectionListViewModel
                org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;



                selectionListViewModelJavaLangObjectNull = (selectionListViewModel) != (null);
                if (selectionListViewModelJavaLangObjectNull) {



                    selectionListViewModel.onToggleSelect(position);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.chat.data.ChatMessageData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.showReactionsList();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    private  long mDirtyFlags_1 = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.time
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): selectionListViewModel.selectedItems
        flag 3 (0x4L): data.imdnIcon
        flag 4 (0x5L): data.hideAvatar
        flag 5 (0x6L): data.showImdn
        flag 6 (0x7L): data.contents
        flag 7 (0x8L): data.sendInProgress
        flag 8 (0x9L): data.hideTime
        flag 9 (0xaL): data.reactions
        flag 10 (0xbL): data.contact
        flag 11 (0xcL): data.replyData
        flag 12 (0xdL): data.text
        flag 13 (0xeL): data.presenceStatus
        flag 14 (0xfL): data.backgroundRes
        flag 15 (0x10L): selectionListViewModel.isEditionEnabled
        flag 16 (0x11L): data.isTextEmoji
        flag 17 (0x12L): data.ephemeralLifetime
        flag 18 (0x13L): replyClickListener
        flag 19 (0x14L): clickListener
        flag 20 (0x15L): selectionListViewModel
        flag 21 (0x16L): data
        flag 22 (0x17L): contextMenuClickListener
        flag 23 (0x18L): position
        flag 24 (0x19L): null
        flag 25 (0x1aL): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.GONE : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 26 (0x1bL): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.GONE : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 27 (0x1cL): data.chatMessage.outgoing ? androidx.databinding.ViewDataBinding.safeUnbox(data.showImdn.getValue()) ? View.VISIBLE : View.INVISIBLE : View.INVISIBLE
        flag 28 (0x1dL): data.chatMessage.outgoing ? androidx.databinding.ViewDataBinding.safeUnbox(data.showImdn.getValue()) ? View.VISIBLE : View.INVISIBLE : View.INVISIBLE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(data.sendInProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(data.sendInProgress.getValue()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:id/select : @android:id/rightMark
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:id/select : @android:id/rightMark
        flag 33 (0x22L): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:id/background : 0
        flag 34 (0x23L): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:id/background : 0
        flag 35 (0x24L): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? true : data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 36 (0x25L): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? true : data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 37 (0x26L): !data.chatMessage.outgoing ? @android:dimen/incoming_chat_message_bubble_left_margin : @android:dimen/outgoing_chat_message_bubble_left_margin
        flag 38 (0x27L): !data.chatMessage.outgoing ? @android:dimen/incoming_chat_message_bubble_left_margin : @android:dimen/outgoing_chat_message_bubble_left_margin
        flag 39 (0x28L): data.replyData.getValue() != null ? View.VISIBLE : View.GONE
        flag 40 (0x29L): data.replyData.getValue() != null ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(data.hideTime.getValue()) ? View.GONE : View.VISIBLE
        flag 42 (0x2bL): androidx.databinding.ViewDataBinding.safeUnbox(data.hideTime.getValue()) ? View.GONE : View.VISIBLE
        flag 43 (0x2cL): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? 0 : @android:id/background
        flag 44 (0x2dL): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? 0 : @android:id/background
        flag 45 (0x2eL): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
        flag 46 (0x2fL): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
        flag 47 (0x30L): data.chatMessage.outgoing ? @android:dimen/outgoing_chat_message_bubble_right_margin : @android:dimen/incoming_chat_message_bubble_right_margin
        flag 48 (0x31L): data.chatMessage.outgoing ? @android:dimen/outgoing_chat_message_bubble_right_margin : @android:dimen/incoming_chat_message_bubble_right_margin
        flag 49 (0x32L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:dimen/edit_chat_message_bubble_left_margin : !data.chatMessage.outgoing ? @android:dimen/incoming_chat_message_bubble_left_margin : @android:dimen/outgoing_chat_message_bubble_left_margin
        flag 50 (0x33L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:dimen/edit_chat_message_bubble_left_margin : !data.chatMessage.outgoing ? @android:dimen/incoming_chat_message_bubble_left_margin : @android:dimen/outgoing_chat_message_bubble_left_margin
        flag 51 (0x34L): data.text.getValue().length > 0 ? View.VISIBLE : View.GONE
        flag 52 (0x35L): data.text.getValue().length > 0 ? View.VISIBLE : View.GONE
        flag 53 (0x36L): data.chatMessage.outgoing ? data.time.getValue() : ((data.time.getValue()) + (" - ")) + (data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name)
        flag 54 (0x37L): data.chatMessage.outgoing ? data.time.getValue() : ((data.time.getValue()) + (" - ")) + (data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name)
        flag 55 (0x38L): data.chatMessage.ephemeral ? View.VISIBLE : View.GONE
        flag 56 (0x39L): data.chatMessage.ephemeral ? View.VISIBLE : View.GONE
        flag 57 (0x3aL): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:id/imdn : 0
        flag 58 (0x3bL): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? @android:id/imdn : 0
        flag 59 (0x3cL): data.chatMessage.outgoing ? Gravity.RIGHT : Gravity.LEFT
        flag 60 (0x3dL): data.chatMessage.outgoing ? Gravity.RIGHT : Gravity.LEFT
        flag 61 (0x3eL): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 62 (0x3fL): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 63 (0x40L): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? true : data.presenceStatus.getValue() == ConsolidatedPresence.Offline
        flag 64 (0x41L): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? true : data.presenceStatus.getValue() == ConsolidatedPresence.Offline
        flag 65 (0x42L): data.chatMessage.outgoing ? JustifyContent.FLEX_END : JustifyContent.FLEX_START
        flag 66 (0x43L): data.chatMessage.outgoing ? JustifyContent.FLEX_END : JustifyContent.FLEX_START
        flag 67 (0x44L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 68 (0x45L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 69 (0x46L): androidx.databinding.ViewDataBinding.safeUnbox(data.showImdn.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 70 (0x47L): androidx.databinding.ViewDataBinding.safeUnbox(data.showImdn.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 71 (0x48L): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue())
        flag 72 (0x49L): data.chatMessage.outgoing ? true : androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue())
        flag 73 (0x4aL): androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 74 (0x4bL): androidx.databinding.ViewDataBinding.safeUnbox(data.hideAvatar.getValue()) ? View.INVISIBLE : View.VISIBLE
        flag 75 (0x4cL): data.chatMessage.forward ? View.VISIBLE : View.GONE
        flag 76 (0x4dL): data.chatMessage.forward ? View.VISIBLE : View.GONE
        flag 77 (0x4eL): data.reactions.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 78 (0x4fL): data.reactions.getValue().size() > 0 ? View.VISIBLE : View.GONE
        flag 79 (0x50L): data.chatMessage.reply ? View.VISIBLE : View.GONE
        flag 80 (0x51L): data.chatMessage.reply ? View.VISIBLE : View.GONE
        flag 81 (0x52L): data.chatMessage.outgoing ? @android:drawable/chat_bubble_outgoing_reactions : @android:drawable/chat_bubble_incoming_reactions
        flag 82 (0x53L): data.chatMessage.outgoing ? @android:drawable/chat_bubble_outgoing_reactions : @android:drawable/chat_bubble_incoming_reactions
        flag 83 (0x54L): androidx.databinding.ViewDataBinding.safeUnbox(data.isTextEmoji.getValue()) ? @android:dimen/chat_message_emoji_font_size : @android:dimen/chat_message_text_font_size
        flag 84 (0x55L): androidx.databinding.ViewDataBinding.safeUnbox(data.isTextEmoji.getValue()) ? @android:dimen/chat_message_emoji_font_size : @android:dimen/chat_message_text_font_size
    flag mapping end*/
    //end
}