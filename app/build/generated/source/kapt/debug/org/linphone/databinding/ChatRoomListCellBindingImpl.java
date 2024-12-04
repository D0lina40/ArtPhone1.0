package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomListCellBindingImpl extends ChatRoomListCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.endBarrier, 13);
        sViewsWithIds.put(R.id.endBarrier3, 14);
        sViewsWithIds.put(R.id.endBarrier2, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatRoomListCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private ChatRoomListCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 15
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[4]
            , (androidx.constraintlayout.widget.Barrier) bindings[13]
            , (androidx.constraintlayout.widget.Barrier) bindings[15]
            , (androidx.constraintlayout.widget.Barrier) bindings[14]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.CheckBox) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            );
        this.avatar.setTag(null);
        this.date.setTag(null);
        this.ephemeral.setTag(null);
        this.forward.setTag(null);
        this.imdn.setTag(null);
        this.lastMessage.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.muted.setTag(null);
        this.securityLevel.setTag(null);
        this.select.setTag(null);
        this.title.setTag(null);
        this.unread.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200000L;
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
        if (BR.selectionListViewModel == variableId) {
            setSelectionListViewModel((org.linphone.activities.main.viewmodels.ListTopBarViewModel) variable);
        }
        else if (BR.data == variableId) {
            setData((org.linphone.activities.main.chat.data.ChatRoomData) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.forwardPending == variableId) {
            setForwardPending((java.lang.Boolean) variable);
        }
        else if (BR.longClickListener == variableId) {
            setLongClickListener((android.view.View.OnLongClickListener) variable);
        }
        else if (BR.position == variableId) {
            setPosition((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSelectionListViewModel(@Nullable org.linphone.activities.main.viewmodels.ListTopBarViewModel SelectionListViewModel) {
        this.mSelectionListViewModel = SelectionListViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8000L;
        }
        notifyPropertyChanged(BR.selectionListViewModel);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.chat.data.ChatRoomData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x10000L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setForwardPending(@Nullable java.lang.Boolean ForwardPending) {
        this.mForwardPending = ForwardPending;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.forwardPending);
        super.requestRebind();
    }
    public void setLongClickListener(@Nullable android.view.View.OnLongClickListener LongClickListener) {
        this.mLongClickListener = LongClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80000L;
        }
        notifyPropertyChanged(BR.longClickListener);
        super.requestRebind();
    }
    public void setPosition(@Nullable java.lang.Integer Position) {
        this.mPosition = Position;
        synchronized(this) {
            mDirtyFlags |= 0x100000L;
        }
        notifyPropertyChanged(BR.position);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataShowLastMessageImdnIcon((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataLastMessageText((androidx.lifecycle.MutableLiveData<android.text.SpannableStringBuilder>) object, fieldId);
            case 2 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeDataPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 4 :
                return onChangeDataSecurityLevelContentDescription((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 5 :
                return onChangeSelectionListViewModelSelectedItems((androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>>) object, fieldId);
            case 6 :
                return onChangeSelectionListViewModelIsEditionEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeDataLastUpdate((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeDataLastMessageImdnIcon((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 9 :
                return onChangeDataEphemeralEnabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 10 :
                return onChangeDataNotificationsMuted((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 11 :
                return onChangeDataSecurityLevelIcon((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 12 :
                return onChangeDataUnreadMessagesCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 13 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 14 :
                return onChangeDataSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataShowLastMessageImdnIcon(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataShowLastMessageImdnIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataLastMessageText(androidx.lifecycle.MutableLiveData<android.text.SpannableStringBuilder> DataLastMessageText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> DataDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataPresenceStatus(androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> DataPresenceStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataSecurityLevelContentDescription(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataSecurityLevelContentDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelSelectedItems(androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> SelectionListViewModelSelectedItems, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSelectionListViewModelIsEditionEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> SelectionListViewModelIsEditionEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataLastUpdate(androidx.lifecycle.MutableLiveData<java.lang.String> DataLastUpdate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataLastMessageImdnIcon(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataLastMessageImdnIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataEphemeralEnabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataEphemeralEnabled, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataNotificationsMuted(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataNotificationsMuted, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataSecurityLevelIcon(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataSecurityLevelIcon, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataUnreadMessagesCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataUnreadMessagesCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataSubject(androidx.lifecycle.MutableLiveData<java.lang.String> DataSubject, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataShowLastMessageImdnIcon = null;
        androidx.lifecycle.MutableLiveData<android.text.SpannableStringBuilder> dataLastMessageText = null;
        java.lang.String stringValueOfDataUnreadMessagesCount = null;
        java.lang.Boolean dataShowLastMessageImdnIconGetValue = null;
        org.linphone.activities.main.viewmodels.ListTopBarViewModel selectionListViewModel = mSelectionListViewModel;
        boolean selectionListViewModelSelectedItemsContainsPosition = false;
        java.lang.String dataDisplayNameGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataEphemeralEnabledGetValue = false;
        boolean dataOneToOneChatRoom = false;
        java.lang.Integer dataSecurityLevelContentDescriptionGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        java.lang.Boolean selectionListViewModelIsEditionEnabledGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = false;
        int selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> dataPresenceStatus = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataSecurityLevelContentDescription = null;
        int dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        org.linphone.activities.main.chat.data.ChatRoomData data = mData;
        boolean dataUnreadMessagesCountInt0 = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<java.lang.Integer>> selectionListViewModelSelectedItems = null;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        java.lang.String dataOneToOneChatRoomDataContactNameJavaLangObjectNullDataDisplayNameDataContactNameDataSubject = null;
        android.text.SpannableStringBuilder dataLastMessageTextGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataSecurityLevelContentDescriptionGetValue = 0;
        int androidxDatabindingViewDataBindingSafeUnboxDataLastMessageImdnIconGetValue = 0;
        int dataNotificationsMutedViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> selectionListViewModelIsEditionEnabled = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataLastUpdate = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String dataSubjectGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxForwardPending = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataLastMessageImdnIcon = null;
        java.lang.Boolean forwardPending = mForwardPending;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataEphemeralEnabled = null;
        org.linphone.core.Friend dataContactGetValue = null;
        java.lang.Boolean dataNotificationsMutedGetValue = null;
        android.view.View.OnLongClickListener longClickListener = mLongClickListener;
        java.lang.Integer dataLastMessageImdnIconGetValue = null;
        boolean dataEncryptedChatRoom = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataNotificationsMutedGetValue = false;
        java.lang.Integer dataSecurityLevelIconGetValue = null;
        java.lang.Integer position = mPosition;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataNotificationsMuted = null;
        org.linphone.core.ConsolidatedPresence dataPresenceStatusGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataUnreadMessagesCountGetValue = 0;
        java.lang.String dataLastUpdateGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataSecurityLevelIcon = null;
        int dataEphemeralEnabledViewVISIBLEViewGONE = 0;
        int dataShowLastMessageImdnIconViewVISIBLEViewGONE = 0;
        java.lang.String dataContactName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataUnreadMessagesCount = null;
        int dataUnreadMessagesCountInt0ViewGONEViewVISIBLE = 0;
        java.util.ArrayList<java.lang.Integer> selectionListViewModelSelectedItemsGetValue = null;
        java.lang.Integer dataUnreadMessagesCountGetValue = null;
        int dataEncryptedChatRoomViewVISIBLEViewINVISIBLE = 0;
        int androidxDatabindingViewDataBindingSafeUnboxDataSecurityLevelIconGetValue = 0;
        int forwardPendingViewVISIBLEViewGONE = 0;
        boolean dataPresenceStatusConsolidatedPresenceOffline = false;
        java.lang.Boolean dataEphemeralEnabledGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataShowLastMessageImdnIconGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataSubject = null;

        if ((dirtyFlags & 0x308060L) != 0) {


            if ((dirtyFlags & 0x308020L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.selectedItems
                        selectionListViewModelSelectedItems = selectionListViewModel.getSelectedItems();
                    }
                    updateLiveDataRegistration(5, selectionListViewModelSelectedItems);


                    if (selectionListViewModelSelectedItems != null) {
                        // read selectionListViewModel.selectedItems.getValue()
                        selectionListViewModelSelectedItemsGetValue = selectionListViewModelSelectedItems.getValue();
                    }
            }
            if ((dirtyFlags & 0x208040L) != 0) {

                    if (selectionListViewModel != null) {
                        // read selectionListViewModel.isEditionEnabled
                        selectionListViewModelIsEditionEnabled = selectionListViewModel.isEditionEnabled();
                    }
                    updateLiveDataRegistration(6, selectionListViewModelIsEditionEnabled);


                    if (selectionListViewModelIsEditionEnabled != null) {
                        // read selectionListViewModel.isEditionEnabled.getValue()
                        selectionListViewModelIsEditionEnabledGetValue = selectionListViewModelIsEditionEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModelIsEditionEnabledGetValue);
                if((dirtyFlags & 0x208040L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
                    selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxSelectionListViewModelIsEditionEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0x217f9fL) != 0) {


            if ((dirtyFlags & 0x210001L) != 0) {

                    if (data != null) {
                        // read data.showLastMessageImdnIcon
                        dataShowLastMessageImdnIcon = data.getShowLastMessageImdnIcon();
                    }
                    updateLiveDataRegistration(0, dataShowLastMessageImdnIcon);


                    if (dataShowLastMessageImdnIcon != null) {
                        // read data.showLastMessageImdnIcon.getValue()
                        dataShowLastMessageImdnIconGetValue = dataShowLastMessageImdnIcon.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showLastMessageImdnIcon.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataShowLastMessageImdnIconGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataShowLastMessageImdnIconGetValue);
                if((dirtyFlags & 0x210001L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataShowLastMessageImdnIconGetValue) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showLastMessageImdnIcon.getValue()) ? View.VISIBLE : View.GONE
                    dataShowLastMessageImdnIconViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataShowLastMessageImdnIconGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x210002L) != 0) {

                    if (data != null) {
                        // read data.lastMessageText
                        dataLastMessageText = data.getLastMessageText();
                    }
                    updateLiveDataRegistration(1, dataLastMessageText);


                    if (dataLastMessageText != null) {
                        // read data.lastMessageText.getValue()
                        dataLastMessageTextGetValue = dataLastMessageText.getValue();
                    }
            }
            if ((dirtyFlags & 0x216004L) != 0) {

                    if (data != null) {
                        // read data.oneToOneChatRoom
                        dataOneToOneChatRoom = data.getOneToOneChatRoom();
                    }
                if((dirtyFlags & 0x216004L) != 0) {
                    if(dataOneToOneChatRoom) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x210008L) != 0) {

                    if (data != null) {
                        // read data.presenceStatus
                        dataPresenceStatus = data.getPresenceStatus();
                    }
                    updateLiveDataRegistration(3, dataPresenceStatus);


                    if (dataPresenceStatus != null) {
                        // read data.presenceStatus.getValue()
                        dataPresenceStatusGetValue = dataPresenceStatus.getValue();
                    }


                    // read data.presenceStatus.getValue() == ConsolidatedPresence.Offline
                    dataPresenceStatusConsolidatedPresenceOffline = (dataPresenceStatusGetValue) == (org.linphone.core.ConsolidatedPresence.Offline);
                if((dirtyFlags & 0x210008L) != 0) {
                    if(dataPresenceStatusConsolidatedPresenceOffline) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
                    dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = ((dataPresenceStatusConsolidatedPresenceOffline) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x210010L) != 0) {

                    if (data != null) {
                        // read data.securityLevelContentDescription
                        dataSecurityLevelContentDescription = data.getSecurityLevelContentDescription();
                    }
                    updateLiveDataRegistration(4, dataSecurityLevelContentDescription);


                    if (dataSecurityLevelContentDescription != null) {
                        // read data.securityLevelContentDescription.getValue()
                        dataSecurityLevelContentDescriptionGetValue = dataSecurityLevelContentDescription.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.securityLevelContentDescription.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataSecurityLevelContentDescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataSecurityLevelContentDescriptionGetValue);
            }
            if ((dirtyFlags & 0x210080L) != 0) {

                    if (data != null) {
                        // read data.lastUpdate
                        dataLastUpdate = data.getLastUpdate();
                    }
                    updateLiveDataRegistration(7, dataLastUpdate);


                    if (dataLastUpdate != null) {
                        // read data.lastUpdate.getValue()
                        dataLastUpdateGetValue = dataLastUpdate.getValue();
                    }
            }
            if ((dirtyFlags & 0x210100L) != 0) {

                    if (data != null) {
                        // read data.lastMessageImdnIcon
                        dataLastMessageImdnIcon = data.getLastMessageImdnIcon();
                    }
                    updateLiveDataRegistration(8, dataLastMessageImdnIcon);


                    if (dataLastMessageImdnIcon != null) {
                        // read data.lastMessageImdnIcon.getValue()
                        dataLastMessageImdnIconGetValue = dataLastMessageImdnIcon.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.lastMessageImdnIcon.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataLastMessageImdnIconGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataLastMessageImdnIconGetValue);
            }
            if ((dirtyFlags & 0x210200L) != 0) {

                    if (data != null) {
                        // read data.ephemeralEnabled
                        dataEphemeralEnabled = data.getEphemeralEnabled();
                    }
                    updateLiveDataRegistration(9, dataEphemeralEnabled);


                    if (dataEphemeralEnabled != null) {
                        // read data.ephemeralEnabled.getValue()
                        dataEphemeralEnabledGetValue = dataEphemeralEnabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.ephemeralEnabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataEphemeralEnabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataEphemeralEnabledGetValue);
                if((dirtyFlags & 0x210200L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataEphemeralEnabledGetValue) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.ephemeralEnabled.getValue()) ? View.VISIBLE : View.GONE
                    dataEphemeralEnabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataEphemeralEnabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x210000L) != 0) {

                    if (data != null) {
                        // read data.encryptedChatRoom
                        dataEncryptedChatRoom = data.getEncryptedChatRoom();
                    }
                if((dirtyFlags & 0x210000L) != 0) {
                    if(dataEncryptedChatRoom) {
                            dirtyFlags |= 0x8000000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000000L;
                    }
                }


                    // read data.encryptedChatRoom ? View.VISIBLE : View.INVISIBLE
                    dataEncryptedChatRoomViewVISIBLEViewINVISIBLE = ((dataEncryptedChatRoom) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x210400L) != 0) {

                    if (data != null) {
                        // read data.notificationsMuted
                        dataNotificationsMuted = data.getNotificationsMuted();
                    }
                    updateLiveDataRegistration(10, dataNotificationsMuted);


                    if (dataNotificationsMuted != null) {
                        // read data.notificationsMuted.getValue()
                        dataNotificationsMutedGetValue = dataNotificationsMuted.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.notificationsMuted.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataNotificationsMutedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataNotificationsMutedGetValue);
                if((dirtyFlags & 0x210400L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataNotificationsMutedGetValue) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.notificationsMuted.getValue()) ? View.VISIBLE : View.GONE
                    dataNotificationsMutedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataNotificationsMutedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x210800L) != 0) {

                    if (data != null) {
                        // read data.securityLevelIcon
                        dataSecurityLevelIcon = data.getSecurityLevelIcon();
                    }
                    updateLiveDataRegistration(11, dataSecurityLevelIcon);


                    if (dataSecurityLevelIcon != null) {
                        // read data.securityLevelIcon.getValue()
                        dataSecurityLevelIconGetValue = dataSecurityLevelIcon.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.securityLevelIcon.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataSecurityLevelIconGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataSecurityLevelIconGetValue);
            }
            if ((dirtyFlags & 0x211000L) != 0) {

                    if (data != null) {
                        // read data.unreadMessagesCount
                        dataUnreadMessagesCount = data.getUnreadMessagesCount();
                    }
                    updateLiveDataRegistration(12, dataUnreadMessagesCount);


                    if (dataUnreadMessagesCount != null) {
                        // read data.unreadMessagesCount.getValue()
                        dataUnreadMessagesCountGetValue = dataUnreadMessagesCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.unreadMessagesCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataUnreadMessagesCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataUnreadMessagesCountGetValue);


                    // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(data.unreadMessagesCount.getValue()))
                    stringValueOfDataUnreadMessagesCount = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxDataUnreadMessagesCountGetValue);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.unreadMessagesCount.getValue()) == 0
                    dataUnreadMessagesCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxDataUnreadMessagesCountGetValue) == (0);
                if((dirtyFlags & 0x211000L) != 0) {
                    if(dataUnreadMessagesCountInt0) {
                            dirtyFlags |= 0x2000000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.unreadMessagesCount.getValue()) == 0 ? View.GONE : View.VISIBLE
                    dataUnreadMessagesCountInt0ViewGONEViewVISIBLE = ((dataUnreadMessagesCountInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
        }
        if ((dirtyFlags & 0x220000L) != 0) {
        }
        if ((dirtyFlags & 0x240000L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(forwardPending)
                androidxDatabindingViewDataBindingSafeUnboxForwardPending = androidx.databinding.ViewDataBinding.safeUnbox(forwardPending);
            if((dirtyFlags & 0x240000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxForwardPending) {
                        dirtyFlags |= 0x20000000000L;
                }
                else {
                        dirtyFlags |= 0x10000000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(forwardPending) ? View.VISIBLE : View.GONE
                forwardPendingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxForwardPending) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x280000L) != 0) {
        }
        if ((dirtyFlags & 0x308020L) != 0) {



                if (selectionListViewModelSelectedItemsGetValue != null) {
                    // read selectionListViewModel.selectedItems.getValue().contains(position)
                    selectionListViewModelSelectedItemsContainsPosition = selectionListViewModelSelectedItemsGetValue.contains(position);
                }
        }
        // batch finished

        if ((dirtyFlags & 0x30000000L) != 0) {


            if ((dirtyFlags & 0x20000000L) != 0) {

                    if (data != null) {
                        // read data.contact
                        dataContact = data.getContact();
                    }
                    updateLiveDataRegistration(13, dataContact);


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
                if((dirtyFlags & 0x20000000L) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }
            }
            if ((dirtyFlags & 0x10000000L) != 0) {

                    if (data != null) {
                        // read data.subject
                        dataSubject = data.getSubject();
                    }
                    updateLiveDataRegistration(14, dataSubject);


                    if (dataSubject != null) {
                        // read data.subject.getValue()
                        dataSubjectGetValue = dataSubject.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8000000L) != 0) {

                if (data != null) {
                    // read data.displayName
                    dataDisplayName = data.getDisplayName();
                }
                updateLiveDataRegistration(2, dataDisplayName);


                if (dataDisplayName != null) {
                    // read data.displayName.getValue()
                    dataDisplayNameGetValue = dataDisplayName.getValue();
                }
        }

        if ((dirtyFlags & 0x20000000L) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }

        if ((dirtyFlags & 0x216004L) != 0) {

                // read data.oneToOneChatRoom ? data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name : data.subject.getValue()
                dataOneToOneChatRoomDataContactNameJavaLangObjectNullDataDisplayNameDataContactNameDataSubject = ((dataOneToOneChatRoom) ? (dataContactNameJavaLangObjectNullDataDisplayNameDataContactName) : (dataSubjectGetValue));
        }
        // batch finished
        if ((dirtyFlags & 0x210000L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.avatar, data);
            this.securityLevel.setVisibility(dataEncryptedChatRoomViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x210080L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.date, dataLastUpdateGetValue);
        }
        if ((dirtyFlags & 0x210200L) != 0) {
            // api target 1

            this.ephemeral.setVisibility(dataEphemeralEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x240000L) != 0) {
            // api target 1

            this.forward.setVisibility(forwardPendingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x210100L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.imdn, androidxDatabindingViewDataBindingSafeUnboxDataLastMessageImdnIconGetValue);
        }
        if ((dirtyFlags & 0x210001L) != 0) {
            // api target 1

            this.imdn.setVisibility(dataShowLastMessageImdnIconViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x210002L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.lastMessage, dataLastMessageTextGetValue);
        }
        if ((dirtyFlags & 0x220000L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x280000L) != 0) {
            // api target 1

            this.mboundView0.setOnLongClickListener(longClickListener);
        }
        if ((dirtyFlags & 0x210008L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView2, dataPresenceStatusGetValue);
            this.mboundView2.setVisibility(dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x210400L) != 0) {
            // api target 1

            this.muted.setVisibility(dataNotificationsMutedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x210010L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.securityLevel, androidxDatabindingViewDataBindingSafeUnboxDataSecurityLevelContentDescriptionGetValue);
        }
        if ((dirtyFlags & 0x210800L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.securityLevel, androidxDatabindingViewDataBindingSafeUnboxDataSecurityLevelIconGetValue);
        }
        if ((dirtyFlags & 0x308020L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.select, selectionListViewModelSelectedItemsContainsPosition);
        }
        if ((dirtyFlags & 0x200000L) != 0) {
            // api target 1

            this.select.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x208040L) != 0) {
            // api target 1

            this.select.setVisibility(selectionListViewModelIsEditionEnabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x216004L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.title, dataOneToOneChatRoomDataContactNameJavaLangObjectNullDataDisplayNameDataContactNameDataSubject);
        }
        if ((dirtyFlags & 0x211000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.unread, stringValueOfDataUnreadMessagesCount);
            this.unread.setVisibility(dataUnreadMessagesCountInt0ViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
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
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.showLastMessageImdnIcon
        flag 1 (0x2L): data.lastMessageText
        flag 2 (0x3L): data.displayName
        flag 3 (0x4L): data.presenceStatus
        flag 4 (0x5L): data.securityLevelContentDescription
        flag 5 (0x6L): selectionListViewModel.selectedItems
        flag 6 (0x7L): selectionListViewModel.isEditionEnabled
        flag 7 (0x8L): data.lastUpdate
        flag 8 (0x9L): data.lastMessageImdnIcon
        flag 9 (0xaL): data.ephemeralEnabled
        flag 10 (0xbL): data.notificationsMuted
        flag 11 (0xcL): data.securityLevelIcon
        flag 12 (0xdL): data.unreadMessagesCount
        flag 13 (0xeL): data.contact
        flag 14 (0xfL): data.subject
        flag 15 (0x10L): selectionListViewModel
        flag 16 (0x11L): data
        flag 17 (0x12L): clickListener
        flag 18 (0x13L): forwardPending
        flag 19 (0x14L): longClickListener
        flag 20 (0x15L): position
        flag 21 (0x16L): null
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(selectionListViewModel.isEditionEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 25 (0x1aL): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 26 (0x1bL): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 27 (0x1cL): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 28 (0x1dL): data.oneToOneChatRoom ? data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name : data.subject.getValue()
        flag 29 (0x1eL): data.oneToOneChatRoom ? data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name : data.subject.getValue()
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(data.notificationsMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(data.notificationsMuted.getValue()) ? View.VISIBLE : View.GONE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(data.ephemeralEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(data.ephemeralEnabled.getValue()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(data.showLastMessageImdnIcon.getValue()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(data.showLastMessageImdnIcon.getValue()) ? View.VISIBLE : View.GONE
        flag 36 (0x25L): androidx.databinding.ViewDataBinding.safeUnbox(data.unreadMessagesCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 37 (0x26L): androidx.databinding.ViewDataBinding.safeUnbox(data.unreadMessagesCount.getValue()) == 0 ? View.GONE : View.VISIBLE
        flag 38 (0x27L): data.encryptedChatRoom ? View.VISIBLE : View.INVISIBLE
        flag 39 (0x28L): data.encryptedChatRoom ? View.VISIBLE : View.INVISIBLE
        flag 40 (0x29L): androidx.databinding.ViewDataBinding.safeUnbox(forwardPending) ? View.VISIBLE : View.GONE
        flag 41 (0x2aL): androidx.databinding.ViewDataBinding.safeUnbox(forwardPending) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}