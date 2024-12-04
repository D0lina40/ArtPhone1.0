package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomMasterFragmentBindingImpl extends ChatRoomMasterFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 8);
        sViewsWithIds.put(R.id.list_edit_top_bar_fragment, 9);
        sViewsWithIds.put(R.id.chatList, 10);
        sViewsWithIds.put(R.id.chat_nav_container, 11);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatRoomMasterFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ChatRoomMasterFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.fragment.app.FragmentContainerView) bindings[11]
            , (androidx.fragment.app.FragmentContainerView) bindings[9]
            , (androidx.slidingpanelayout.widget.SlidingPaneLayout) bindings[0]
            , (android.widget.LinearLayout) bindings[8]
            );
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.slidingPane.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.cancelSharingClickListener == variableId) {
            setCancelSharingClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.newGroupChatRoomClickListener == variableId) {
            setNewGroupChatRoomClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.editClickListener == variableId) {
            setEditClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.cancelForwardClickListener == variableId) {
            setCancelForwardClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.newOneToOneChatRoomClickListener == variableId) {
            setNewOneToOneChatRoomClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.chat.viewmodels.ChatRoomsListViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCancelSharingClickListener(@Nullable android.view.View.OnClickListener CancelSharingClickListener) {
        this.mCancelSharingClickListener = CancelSharingClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.cancelSharingClickListener);
        super.requestRebind();
    }
    public void setNewGroupChatRoomClickListener(@Nullable android.view.View.OnClickListener NewGroupChatRoomClickListener) {
        this.mNewGroupChatRoomClickListener = NewGroupChatRoomClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.newGroupChatRoomClickListener);
        super.requestRebind();
    }
    public void setEditClickListener(@Nullable android.view.View.OnClickListener EditClickListener) {
        this.mEditClickListener = EditClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.editClickListener);
        super.requestRebind();
    }
    public void setCancelForwardClickListener(@Nullable android.view.View.OnClickListener CancelForwardClickListener) {
        this.mCancelForwardClickListener = CancelForwardClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.cancelForwardClickListener);
        super.requestRebind();
    }
    public void setNewOneToOneChatRoomClickListener(@Nullable android.view.View.OnClickListener NewOneToOneChatRoomClickListener) {
        this.mNewOneToOneChatRoomClickListener = NewOneToOneChatRoomClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.newOneToOneChatRoomClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.ChatRoomsListViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFileSharingPending((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelForwardPending((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelGroupChatAvailable((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelChatRooms((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatRoomData>>) object, fieldId);
            case 4 :
                return onChangeViewModelTextSharingPending((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFileSharingPending(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelFileSharingPending, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelForwardPending(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelForwardPending, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGroupChatAvailable(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelGroupChatAvailable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelChatRooms(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatRoomData>> ViewModelChatRooms, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTextSharingPending(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelTextSharingPending, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        android.view.View.OnClickListener cancelSharingClickListener = mCancelSharingClickListener;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelFileSharingPending = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelForwardPending = null;
        int viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelGroupChatAvailable = null;
        int viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingBooleanTrueViewModelForwardPendingViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelGroupChatAvailableGetValue = null;
        boolean viewModelFileSharingPendingBooleanTrueViewModelTextSharingPending = false;
        android.view.View.OnClickListener newGroupChatRoomClickListener = mNewGroupChatRoomClickListener;
        boolean viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingBooleanTrueViewModelForwardPending = false;
        android.view.View.OnClickListener editClickListener = mEditClickListener;
        int viewModelForwardPendingViewVISIBLEViewGONE = 0;
        boolean viewModelChatRoomsEmpty = false;
        java.lang.String viewModelFileSharingPendingMboundView6AndroidStringChatRoomChooseConversationForFileSharingViewModelTextSharingPendingMboundView6AndroidStringChatRoomChooseConversationForTextSharingMboundView6AndroidStringChatRoomChooseConversationForMessageForward = null;
        int viewModelChatRoomsEmptyViewVISIBLEViewGONE = 0;
        boolean viewModelForwardPendingBooleanTrueViewModelFileSharingPending = false;
        java.lang.String viewModelTextSharingPendingMboundView6AndroidStringChatRoomChooseConversationForTextSharingMboundView6AndroidStringChatRoomChooseConversationForMessageForward = null;
        boolean viewModelForwardPendingBooleanTrueViewModelFileSharingPendingBooleanTrueViewModelTextSharingPending = false;
        java.util.ArrayList<org.linphone.activities.main.chat.data.ChatRoomData> viewModelChatRoomsGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.ChatRoomData>> viewModelChatRooms = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelForwardPendingGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelTextSharingPendingGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelFileSharingPendingGetValue = false;
        android.view.View.OnClickListener cancelForwardClickListener = mCancelForwardClickListener;
        java.lang.Boolean viewModelForwardPendingGetValue = null;
        java.lang.Boolean viewModelFileSharingPendingGetValue = null;
        boolean ViewModelChatRoomsEmpty1 = false;
        android.view.View.OnClickListener newOneToOneChatRoomClickListener = mNewOneToOneChatRoomClickListener;
        int viewModelForwardPendingBooleanTrueViewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelTextSharingPending = null;
        int viewModelGroupChatAvailableViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.chat.viewmodels.ChatRoomsListViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelGroupChatAvailableGetValue = false;
        java.lang.Boolean viewModelTextSharingPendingGetValue = null;

        if ((dirtyFlags & 0x820L) != 0) {
        }
        if ((dirtyFlags & 0x840L) != 0) {
        }
        if ((dirtyFlags & 0x880L) != 0) {
        }
        if ((dirtyFlags & 0x900L) != 0) {
        }
        if ((dirtyFlags & 0xa00L) != 0) {
        }
        if ((dirtyFlags & 0xc1fL) != 0) {


            if ((dirtyFlags & 0xc13L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.fileSharingPending
                        viewModelFileSharingPending = viewModel.getFileSharingPending();
                        // read viewModel.forwardPending
                        viewModelForwardPending = viewModel.getForwardPending();
                    }
                    updateLiveDataRegistration(0, viewModelFileSharingPending);
                    updateLiveDataRegistration(1, viewModelForwardPending);


                    if (viewModelFileSharingPending != null) {
                        // read viewModel.fileSharingPending.getValue()
                        viewModelFileSharingPendingGetValue = viewModelFileSharingPending.getValue();
                    }
                    if (viewModelForwardPending != null) {
                        // read viewModel.forwardPending.getValue()
                        viewModelForwardPendingGetValue = viewModelForwardPending.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelFileSharingPendingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelFileSharingPendingGetValue);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelForwardPendingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelForwardPendingGetValue);
                if((dirtyFlags & 0xc13L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelFileSharingPendingGetValue) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0xc11L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelFileSharingPendingGetValue) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }
                if((dirtyFlags & 0xc02L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelForwardPendingGetValue) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
                if((dirtyFlags & 0xc13L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelForwardPendingGetValue) {
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x4000000L;
                    }
                }

                if ((dirtyFlags & 0xc02L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? View.VISIBLE : View.GONE
                        viewModelForwardPendingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelForwardPendingGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0xc04L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.groupChatAvailable
                        viewModelGroupChatAvailable = viewModel.getGroupChatAvailable();
                    }
                    updateLiveDataRegistration(2, viewModelGroupChatAvailable);


                    if (viewModelGroupChatAvailable != null) {
                        // read viewModel.groupChatAvailable.getValue()
                        viewModelGroupChatAvailableGetValue = viewModelGroupChatAvailable.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.groupChatAvailable.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelGroupChatAvailableGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelGroupChatAvailableGetValue);
                if((dirtyFlags & 0xc04L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelGroupChatAvailableGetValue) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.groupChatAvailable.getValue()) ? View.VISIBLE : View.GONE
                    viewModelGroupChatAvailableViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelGroupChatAvailableGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc08L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.chatRooms
                        viewModelChatRooms = viewModel.getChatRooms();
                    }
                    updateLiveDataRegistration(3, viewModelChatRooms);


                    if (viewModelChatRooms != null) {
                        // read viewModel.chatRooms.getValue()
                        viewModelChatRoomsGetValue = viewModelChatRooms.getValue();
                    }


                    if (viewModelChatRoomsGetValue != null) {
                        // read viewModel.chatRooms.getValue().empty
                        viewModelChatRoomsEmpty = viewModelChatRoomsGetValue.isEmpty();
                    }
                if((dirtyFlags & 0xc08L) != 0) {
                    if(viewModelChatRoomsEmpty) {
                            dirtyFlags |= 0x2000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000000L;
                    }
                }


                    // read viewModel.chatRooms.getValue().empty ? View.VISIBLE : View.GONE
                    viewModelChatRoomsEmptyViewVISIBLEViewGONE = ((viewModelChatRoomsEmpty) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read !viewModel.chatRooms.getValue().empty
                    ViewModelChatRoomsEmpty1 = !viewModelChatRoomsEmpty;
            }
        }
        // batch finished

        if ((dirtyFlags & 0xc13L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue())
                viewModelForwardPendingBooleanTrueViewModelFileSharingPending = ((androidxDatabindingViewDataBindingSafeUnboxViewModelForwardPendingGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelFileSharingPendingGetValue));
            if((dirtyFlags & 0xc13L) != 0) {
                if(viewModelForwardPendingBooleanTrueViewModelFileSharingPending) {
                        dirtyFlags |= 0x80000000L;
                }
                else {
                        dirtyFlags |= 0x40000000L;
                }
            }
        }
        if ((dirtyFlags & 0x410000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.textSharingPending
                    viewModelTextSharingPending = viewModel.getTextSharingPending();
                }
                updateLiveDataRegistration(4, viewModelTextSharingPending);


                if (viewModelTextSharingPending != null) {
                    // read viewModel.textSharingPending.getValue()
                    viewModelTextSharingPendingGetValue = viewModelTextSharingPending.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelTextSharingPendingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelTextSharingPendingGetValue);
            if((dirtyFlags & 0x400000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelTextSharingPendingGetValue) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }

            if ((dirtyFlags & 0x400000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? @android:string/chat_room_choose_conversation_for_text_sharing : @android:string/chat_room_choose_conversation_for_message_forward
                    viewModelTextSharingPendingMboundView6AndroidStringChatRoomChooseConversationForTextSharingMboundView6AndroidStringChatRoomChooseConversationForMessageForward = ((androidxDatabindingViewDataBindingSafeUnboxViewModelTextSharingPendingGetValue) ? (mboundView6.getResources().getString(R.string.chat_room_choose_conversation_for_text_sharing)) : (mboundView6.getResources().getString(R.string.chat_room_choose_conversation_for_message_forward)));
            }
        }

        if ((dirtyFlags & 0xc13L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue())
                viewModelFileSharingPendingBooleanTrueViewModelTextSharingPending = ((androidxDatabindingViewDataBindingSafeUnboxViewModelFileSharingPendingGetValue) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelTextSharingPendingGetValue));
            if((dirtyFlags & 0xc11L) != 0) {
                if(viewModelFileSharingPendingBooleanTrueViewModelTextSharingPending) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }
            if((dirtyFlags & 0xc13L) != 0) {
                if(viewModelFileSharingPendingBooleanTrueViewModelTextSharingPending) {
                        dirtyFlags |= 0x80000L;
                }
                else {
                        dirtyFlags |= 0x40000L;
                }
            }

            if ((dirtyFlags & 0xc11L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? View.VISIBLE : View.GONE
                    viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingViewVISIBLEViewGONE = ((viewModelFileSharingPendingBooleanTrueViewModelTextSharingPending) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        if ((dirtyFlags & 0xc11L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? @android:string/chat_room_choose_conversation_for_file_sharing : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? @android:string/chat_room_choose_conversation_for_text_sharing : @android:string/chat_room_choose_conversation_for_message_forward
                viewModelFileSharingPendingMboundView6AndroidStringChatRoomChooseConversationForFileSharingViewModelTextSharingPendingMboundView6AndroidStringChatRoomChooseConversationForTextSharingMboundView6AndroidStringChatRoomChooseConversationForMessageForward = ((androidxDatabindingViewDataBindingSafeUnboxViewModelFileSharingPendingGetValue) ? (mboundView6.getResources().getString(R.string.chat_room_choose_conversation_for_file_sharing)) : (viewModelTextSharingPendingMboundView6AndroidStringChatRoomChooseConversationForTextSharingMboundView6AndroidStringChatRoomChooseConversationForMessageForward));
        }
        // batch finished

        if ((dirtyFlags & 0xc13L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue())
                viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingBooleanTrueViewModelForwardPending = ((viewModelFileSharingPendingBooleanTrueViewModelTextSharingPending) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelForwardPendingGetValue));
            if((dirtyFlags & 0xc13L) != 0) {
                if(viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingBooleanTrueViewModelForwardPending) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? View.VISIBLE : View.GONE
                viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingBooleanTrueViewModelForwardPendingViewVISIBLEViewGONE = ((viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingBooleanTrueViewModelForwardPending) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x40000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.textSharingPending
                    viewModelTextSharingPending = viewModel.getTextSharingPending();
                }
                updateLiveDataRegistration(4, viewModelTextSharingPending);


                if (viewModelTextSharingPending != null) {
                    // read viewModel.textSharingPending.getValue()
                    viewModelTextSharingPendingGetValue = viewModelTextSharingPending.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue())
                androidxDatabindingViewDataBindingSafeUnboxViewModelTextSharingPendingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelTextSharingPendingGetValue);
            if((dirtyFlags & 0x400000L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxViewModelTextSharingPendingGetValue) {
                        dirtyFlags |= 0x20000000L;
                }
                else {
                        dirtyFlags |= 0x10000000L;
                }
            }
        }

        if ((dirtyFlags & 0xc13L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue())
                viewModelForwardPendingBooleanTrueViewModelFileSharingPendingBooleanTrueViewModelTextSharingPending = ((viewModelForwardPendingBooleanTrueViewModelFileSharingPending) ? (true) : (androidxDatabindingViewDataBindingSafeUnboxViewModelTextSharingPendingGetValue));
            if((dirtyFlags & 0xc13L) != 0) {
                if(viewModelForwardPendingBooleanTrueViewModelFileSharingPendingBooleanTrueViewModelTextSharingPending) {
                        dirtyFlags |= 0x200000000L;
                }
                else {
                        dirtyFlags |= 0x100000000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? View.GONE : View.VISIBLE
                viewModelForwardPendingBooleanTrueViewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingViewGONEViewVISIBLE = ((viewModelForwardPendingBooleanTrueViewModelFileSharingPendingBooleanTrueViewModelTextSharingPending) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x900L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(cancelForwardClickListener);
        }
        if ((dirtyFlags & 0xc02L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelForwardPendingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x820L) != 0) {
            // api target 1

            this.mboundView2.setOnClickListener(cancelSharingClickListener);
        }
        if ((dirtyFlags & 0xc11L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelFileSharingPendingMboundView6AndroidStringChatRoomChooseConversationForFileSharingViewModelTextSharingPendingMboundView6AndroidStringChatRoomChooseConversationForTextSharingMboundView6AndroidStringChatRoomChooseConversationForMessageForward);
        }
        if ((dirtyFlags & 0xa00L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(newOneToOneChatRoomClickListener);
        }
        if ((dirtyFlags & 0xc04L) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelGroupChatAvailableViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x840L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(newGroupChatRoomClickListener);
        }
        if ((dirtyFlags & 0x880L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(editClickListener);
        }
        if ((dirtyFlags & 0xc08L) != 0) {
            // api target 1

            this.mboundView5.setEnabled(ViewModelChatRoomsEmpty1);
            this.mboundView7.setVisibility(viewModelChatRoomsEmptyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc13L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelForwardPendingBooleanTrueViewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(viewModelFileSharingPendingBooleanTrueViewModelTextSharingPendingBooleanTrueViewModelForwardPendingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.fileSharingPending
        flag 1 (0x2L): viewModel.forwardPending
        flag 2 (0x3L): viewModel.groupChatAvailable
        flag 3 (0x4L): viewModel.chatRooms
        flag 4 (0x5L): viewModel.textSharingPending
        flag 5 (0x6L): cancelSharingClickListener
        flag 6 (0x7L): newGroupChatRoomClickListener
        flag 7 (0x8L): editClickListener
        flag 8 (0x9L): cancelForwardClickListener
        flag 9 (0xaL): newOneToOneChatRoomClickListener
        flag 10 (0xbL): viewModel
        flag 11 (0xcL): null
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue())
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue())
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue())
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue())
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? View.VISIBLE : View.GONE
        flag 21 (0x16L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? View.VISIBLE : View.GONE
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? @android:string/chat_room_choose_conversation_for_file_sharing : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? @android:string/chat_room_choose_conversation_for_text_sharing : @android:string/chat_room_choose_conversation_for_message_forward
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? @android:string/chat_room_choose_conversation_for_file_sharing : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? @android:string/chat_room_choose_conversation_for_text_sharing : @android:string/chat_room_choose_conversation_for_message_forward
        flag 24 (0x19L): viewModel.chatRooms.getValue().empty ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.chatRooms.getValue().empty ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue())
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue())
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? @android:string/chat_room_choose_conversation_for_text_sharing : @android:string/chat_room_choose_conversation_for_message_forward
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? @android:string/chat_room_choose_conversation_for_text_sharing : @android:string/chat_room_choose_conversation_for_message_forward
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue())
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue())
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? View.GONE : View.VISIBLE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.forwardPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.fileSharingPending.getValue()) ? true : androidx.databinding.ViewDataBinding.safeUnbox(viewModel.textSharingPending.getValue()) ? View.GONE : View.VISIBLE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.groupChatAvailable.getValue()) ? View.VISIBLE : View.GONE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.groupChatAvailable.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}