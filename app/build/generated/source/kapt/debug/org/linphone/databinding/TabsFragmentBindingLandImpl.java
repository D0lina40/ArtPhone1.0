package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class TabsFragmentBindingLandImpl extends TabsFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.selector, 10);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public TabsFragmentBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private TabsFragmentBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.RelativeLayout) bindings[7]
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , null
            , (androidx.constraintlayout.widget.Guideline) bindings[2]
            , null
            , (androidx.constraintlayout.widget.Guideline) bindings[1]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (androidx.constraintlayout.motion.widget.MotionLayout) bindings[0]
            , (android.view.View) bindings[10]
            );
        this.chat.setTag(null);
        this.chatUnreadCount.setTag(null);
        this.contacts.setTag(null);
        this.dialer.setTag(null);
        this.guidelineBottom.setTag(null);
        this.guidelineMiddle.setTag(null);
        this.guidelineTop.setTag(null);
        this.history.setTag(null);
        this.historyUnreadCount.setTag(null);
        this.motionLayout.setTag(null);
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
        if (BR.chatClickListener == variableId) {
            setChatClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.dialerClickListener == variableId) {
            setDialerClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.historyClickListener == variableId) {
            setHistoryClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.contactsClickListener == variableId) {
            setContactsClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.viewmodels.TabsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setChatClickListener(@Nullable android.view.View.OnClickListener ChatClickListener) {
        this.mChatClickListener = ChatClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.chatClickListener);
        super.requestRebind();
    }
    public void setDialerClickListener(@Nullable android.view.View.OnClickListener DialerClickListener) {
        this.mDialerClickListener = DialerClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.dialerClickListener);
        super.requestRebind();
    }
    public void setHistoryClickListener(@Nullable android.view.View.OnClickListener HistoryClickListener) {
        this.mHistoryClickListener = HistoryClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.historyClickListener);
        super.requestRebind();
    }
    public void setContactsClickListener(@Nullable android.view.View.OnClickListener ContactsClickListener) {
        this.mContactsClickListener = ContactsClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.contactsClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.viewmodels.TabsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMissedCallsCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeViewModelMiddleAnchor((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 2 :
                return onChangeViewModelUnreadMessagesCount((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeViewModelChatUnreadCountTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 4 :
                return onChangeViewModelHistoryMissedCountTranslateY((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 5 :
                return onChangeViewModelRightAnchor((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
            case 6 :
                return onChangeViewModelLeftAnchor((androidx.lifecycle.MutableLiveData<java.lang.Float>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMissedCallsCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelMissedCallsCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMiddleAnchor(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelMiddleAnchor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUnreadMessagesCount(androidx.lifecycle.MutableLiveData<java.lang.Integer> ViewModelUnreadMessagesCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelChatUnreadCountTranslateY(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelChatUnreadCountTranslateY, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHistoryMissedCountTranslateY(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelHistoryMissedCountTranslateY, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelRightAnchor(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelRightAnchor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLeftAnchor(androidx.lifecycle.MutableLiveData<java.lang.Float> ViewModelLeftAnchor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        java.lang.Float viewModelMiddleAnchorGetValue = null;
        java.lang.Integer viewModelMissedCallsCountGetValue = null;
        float androidxDatabindingViewDataBindingSafeUnboxViewModelRightAnchorGetValue = 0f;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelUnreadMessagesCountGetValue = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelMissedCallsCount = null;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelMiddleAnchor = null;
        float androidxDatabindingViewDataBindingSafeUnboxViewModelMiddleAnchorGetValue = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> viewModelUnreadMessagesCount = null;
        java.lang.String stringValueOfViewModelUnreadMessagesCount = null;
        java.lang.String viewModelMissedCallsCountInt0JavaLangStringStringValueOfViewModelMissedCallsCount = null;
        java.lang.String stringValueOfViewModelMissedCallsCount = null;
        android.view.View.OnClickListener chatClickListener = mChatClickListener;
        android.view.View.OnClickListener dialerClickListener = mDialerClickListener;
        java.lang.Float viewModelLeftAnchorGetValue = null;
        android.view.View.OnClickListener historyClickListener = mHistoryClickListener;
        java.lang.Float viewModelRightAnchorGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelChatUnreadCountTranslateY = null;
        float androidxDatabindingViewDataBindingSafeUnboxViewModelLeftAnchorGetValue = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelHistoryMissedCountTranslateY = null;
        boolean viewModelUnreadMessagesCountInt0 = false;
        float androidxDatabindingViewDataBindingSafeUnboxViewModelHistoryMissedCountTranslateYGetValue = 0f;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelRightAnchor = null;
        android.graphics.drawable.Drawable viewModelUnreadMessagesCountInt0ChatUnreadCountAndroidDrawableHiddenUnreadMessageCountBgChatUnreadCountAndroidDrawableUnreadMessageCountBg = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelMissedCallsCountGetValue = 0;
        android.view.View.OnClickListener contactsClickListener = mContactsClickListener;
        android.graphics.drawable.Drawable viewModelMissedCallsCountInt0HistoryUnreadCountAndroidDrawableHiddenUnreadMessageCountBgHistoryUnreadCountAndroidDrawableUnreadMessageCountBg = null;
        java.lang.Float viewModelHistoryMissedCountTranslateYGetValue = null;
        java.lang.Integer viewModelUnreadMessagesCountGetValue = null;
        boolean viewModelMissedCallsCountInt0 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Float> viewModelLeftAnchor = null;
        org.linphone.activities.main.viewmodels.TabsViewModel viewModel = mViewModel;
        java.lang.String viewModelUnreadMessagesCountInt0JavaLangStringStringValueOfViewModelUnreadMessagesCount = null;
        java.lang.Float viewModelChatUnreadCountTranslateYGetValue = null;
        float androidxDatabindingViewDataBindingSafeUnboxViewModelChatUnreadCountTranslateYGetValue = 0f;

        if ((dirtyFlags & 0x1080L) != 0) {
        }
        if ((dirtyFlags & 0x1100L) != 0) {
        }
        if ((dirtyFlags & 0x1200L) != 0) {
        }
        if ((dirtyFlags & 0x1400L) != 0) {
        }
        if ((dirtyFlags & 0x187fL) != 0) {


            if ((dirtyFlags & 0x1801L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.missedCallsCount
                        viewModelMissedCallsCount = viewModel.getMissedCallsCount();
                    }
                    updateLiveDataRegistration(0, viewModelMissedCallsCount);


                    if (viewModelMissedCallsCount != null) {
                        // read viewModel.missedCallsCount.getValue()
                        viewModelMissedCallsCountGetValue = viewModelMissedCallsCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelMissedCallsCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelMissedCallsCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()) == 0
                    viewModelMissedCallsCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelMissedCallsCountGetValue) == (0);
                if((dirtyFlags & 0x1801L) != 0) {
                    if(viewModelMissedCallsCountInt0) {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x20000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()) == 0 ? @android:drawable/hidden_unread_message_count_bg : @android:drawable/unread_message_count_bg
                    viewModelMissedCallsCountInt0HistoryUnreadCountAndroidDrawableHiddenUnreadMessageCountBgHistoryUnreadCountAndroidDrawableUnreadMessageCountBg = ((viewModelMissedCallsCountInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(historyUnreadCount.getContext(), R.drawable.hidden_unread_message_count_bg)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(historyUnreadCount.getContext(), R.drawable.unread_message_count_bg)));
            }
            if ((dirtyFlags & 0x1802L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.middleAnchor
                        viewModelMiddleAnchor = viewModel.getMiddleAnchor();
                    }
                    updateLiveDataRegistration(1, viewModelMiddleAnchor);


                    if (viewModelMiddleAnchor != null) {
                        // read viewModel.middleAnchor.getValue()
                        viewModelMiddleAnchorGetValue = viewModelMiddleAnchor.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.middleAnchor.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelMiddleAnchorGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelMiddleAnchorGetValue);
            }
            if ((dirtyFlags & 0x1804L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.unreadMessagesCount
                        viewModelUnreadMessagesCount = viewModel.getUnreadMessagesCount();
                    }
                    updateLiveDataRegistration(2, viewModelUnreadMessagesCount);


                    if (viewModelUnreadMessagesCount != null) {
                        // read viewModel.unreadMessagesCount.getValue()
                        viewModelUnreadMessagesCountGetValue = viewModelUnreadMessagesCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelUnreadMessagesCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelUnreadMessagesCountGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0
                    viewModelUnreadMessagesCountInt0 = (androidxDatabindingViewDataBindingSafeUnboxViewModelUnreadMessagesCountGetValue) == (0);
                if((dirtyFlags & 0x1804L) != 0) {
                    if(viewModelUnreadMessagesCountInt0) {
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x100000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x80000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? @android:drawable/hidden_unread_message_count_bg : @android:drawable/unread_message_count_bg
                    viewModelUnreadMessagesCountInt0ChatUnreadCountAndroidDrawableHiddenUnreadMessageCountBgChatUnreadCountAndroidDrawableUnreadMessageCountBg = ((viewModelUnreadMessagesCountInt0) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(chatUnreadCount.getContext(), R.drawable.hidden_unread_message_count_bg)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(chatUnreadCount.getContext(), R.drawable.unread_message_count_bg)));
            }
            if ((dirtyFlags & 0x1808L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.chatUnreadCountTranslateY
                        viewModelChatUnreadCountTranslateY = viewModel.getChatUnreadCountTranslateY();
                    }
                    updateLiveDataRegistration(3, viewModelChatUnreadCountTranslateY);


                    if (viewModelChatUnreadCountTranslateY != null) {
                        // read viewModel.chatUnreadCountTranslateY.getValue()
                        viewModelChatUnreadCountTranslateYGetValue = viewModelChatUnreadCountTranslateY.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.chatUnreadCountTranslateY.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelChatUnreadCountTranslateYGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelChatUnreadCountTranslateYGetValue);
            }
            if ((dirtyFlags & 0x1810L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.historyMissedCountTranslateY
                        viewModelHistoryMissedCountTranslateY = viewModel.getHistoryMissedCountTranslateY();
                    }
                    updateLiveDataRegistration(4, viewModelHistoryMissedCountTranslateY);


                    if (viewModelHistoryMissedCountTranslateY != null) {
                        // read viewModel.historyMissedCountTranslateY.getValue()
                        viewModelHistoryMissedCountTranslateYGetValue = viewModelHistoryMissedCountTranslateY.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.historyMissedCountTranslateY.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelHistoryMissedCountTranslateYGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelHistoryMissedCountTranslateYGetValue);
            }
            if ((dirtyFlags & 0x1820L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.rightAnchor
                        viewModelRightAnchor = viewModel.getRightAnchor();
                    }
                    updateLiveDataRegistration(5, viewModelRightAnchor);


                    if (viewModelRightAnchor != null) {
                        // read viewModel.rightAnchor.getValue()
                        viewModelRightAnchorGetValue = viewModelRightAnchor.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.rightAnchor.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelRightAnchorGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelRightAnchorGetValue);
            }
            if ((dirtyFlags & 0x1840L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.leftAnchor
                        viewModelLeftAnchor = viewModel.getLeftAnchor();
                    }
                    updateLiveDataRegistration(6, viewModelLeftAnchor);


                    if (viewModelLeftAnchor != null) {
                        // read viewModel.leftAnchor.getValue()
                        viewModelLeftAnchorGetValue = viewModelLeftAnchor.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.leftAnchor.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelLeftAnchorGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelLeftAnchorGetValue);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80000L) != 0) {

                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()))
                stringValueOfViewModelUnreadMessagesCount = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxViewModelUnreadMessagesCountGetValue);
        }
        if ((dirtyFlags & 0x2000L) != 0) {

                // read String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()))
                stringValueOfViewModelMissedCallsCount = java.lang.String.valueOf(androidxDatabindingViewDataBindingSafeUnboxViewModelMissedCallsCountGetValue);
        }

        if ((dirtyFlags & 0x1801L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()) == 0 ? "" : String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()))
                viewModelMissedCallsCountInt0JavaLangStringStringValueOfViewModelMissedCallsCount = ((viewModelMissedCallsCountInt0) ? ("") : (stringValueOfViewModelMissedCallsCount));
        }
        if ((dirtyFlags & 0x1804L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? "" : String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()))
                viewModelUnreadMessagesCountInt0JavaLangStringStringValueOfViewModelUnreadMessagesCount = ((viewModelUnreadMessagesCountInt0) ? ("") : (stringValueOfViewModelUnreadMessagesCount));
        }
        // batch finished
        if ((dirtyFlags & 0x1080L) != 0) {
            // api target 1

            this.chat.setOnClickListener(chatClickListener);
        }
        if ((dirtyFlags & 0x1808L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.chatUnreadCount.setTranslationY(androidxDatabindingViewDataBindingSafeUnboxViewModelChatUnreadCountTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x1804L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.chatUnreadCount, viewModelUnreadMessagesCountInt0ChatUnreadCountAndroidDrawableHiddenUnreadMessageCountBgChatUnreadCountAndroidDrawableUnreadMessageCountBg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.chatUnreadCount, viewModelUnreadMessagesCountInt0JavaLangStringStringValueOfViewModelUnreadMessagesCount);
        }
        if ((dirtyFlags & 0x1400L) != 0) {
            // api target 1

            this.contacts.setOnClickListener(contactsClickListener);
        }
        if ((dirtyFlags & 0x1100L) != 0) {
            // api target 1

            this.dialer.setOnClickListener(dialerClickListener);
        }
        if ((dirtyFlags & 0x1820L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutConstraintGuidePercent(this.guidelineBottom, androidxDatabindingViewDataBindingSafeUnboxViewModelRightAnchorGetValue);
        }
        if ((dirtyFlags & 0x1802L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutConstraintGuidePercent(this.guidelineMiddle, androidxDatabindingViewDataBindingSafeUnboxViewModelMiddleAnchorGetValue);
        }
        if ((dirtyFlags & 0x1840L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setLayoutConstraintGuidePercent(this.guidelineTop, androidxDatabindingViewDataBindingSafeUnboxViewModelLeftAnchorGetValue);
        }
        if ((dirtyFlags & 0x1200L) != 0) {
            // api target 1

            this.history.setOnClickListener(historyClickListener);
        }
        if ((dirtyFlags & 0x1810L) != 0) {
            // api target 11
            if(getBuildSdkInt() >= 11) {

                this.historyUnreadCount.setTranslationY(androidxDatabindingViewDataBindingSafeUnboxViewModelHistoryMissedCountTranslateYGetValue);
            }
        }
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.historyUnreadCount, viewModelMissedCallsCountInt0HistoryUnreadCountAndroidDrawableHiddenUnreadMessageCountBgHistoryUnreadCountAndroidDrawableUnreadMessageCountBg);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.historyUnreadCount, viewModelMissedCallsCountInt0JavaLangStringStringValueOfViewModelMissedCallsCount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.missedCallsCount
        flag 1 (0x2L): viewModel.middleAnchor
        flag 2 (0x3L): viewModel.unreadMessagesCount
        flag 3 (0x4L): viewModel.chatUnreadCountTranslateY
        flag 4 (0x5L): viewModel.historyMissedCountTranslateY
        flag 5 (0x6L): viewModel.rightAnchor
        flag 6 (0x7L): viewModel.leftAnchor
        flag 7 (0x8L): chatClickListener
        flag 8 (0x9L): dialerClickListener
        flag 9 (0xaL): historyClickListener
        flag 10 (0xbL): contactsClickListener
        flag 11 (0xcL): viewModel
        flag 12 (0xdL): null
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()) == 0 ? "" : String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()))
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()) == 0 ? "" : String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()))
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? @android:drawable/hidden_unread_message_count_bg : @android:drawable/unread_message_count_bg
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? @android:drawable/hidden_unread_message_count_bg : @android:drawable/unread_message_count_bg
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()) == 0 ? @android:drawable/hidden_unread_message_count_bg : @android:drawable/unread_message_count_bg
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.missedCallsCount.getValue()) == 0 ? @android:drawable/hidden_unread_message_count_bg : @android:drawable/unread_message_count_bg
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? "" : String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()))
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()) == 0 ? "" : String.valueOf(androidx.databinding.ViewDataBinding.safeUnbox(viewModel.unreadMessagesCount.getValue()))
    flag mapping end*/
    //end
}