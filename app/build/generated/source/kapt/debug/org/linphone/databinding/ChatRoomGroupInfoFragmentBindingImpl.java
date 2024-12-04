package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomGroupInfoFragmentBindingImpl extends ChatRoomGroupInfoFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(10);
        sIncludes.setIncludes(0, 
            new String[] {"wait_layout"},
            new int[] {6},
            new int[] {org.linphone.R.layout.wait_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 7);
        sViewsWithIds.put(R.id.back, 8);
        sViewsWithIds.put(R.id.participants, 9);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @Nullable
    private final org.linphone.databinding.WaitLayoutBinding mboundView01;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    @NonNull
    private final android.widget.RelativeLayout mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.subject.getValue()
            //         is viewModel.subject.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // viewModel.subject.getValue()
            java.lang.String viewModelSubjectGetValue = null;
            // viewModel.subject
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSubject = null;
            // viewModel
            org.linphone.activities.main.chat.viewmodels.GroupInfoViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.subject != null
            boolean viewModelSubjectJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelSubject = viewModel.getSubject();

                viewModelSubjectJavaLangObjectNull = (viewModelSubject) != (null);
                if (viewModelSubjectJavaLangObjectNull) {




                    viewModelSubject.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ChatRoomGroupInfoFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ChatRoomGroupInfoFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (android.widget.LinearLayout) bindings[7]
            );
        this.leaveGroup.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (org.linphone.databinding.WaitLayoutBinding) bindings[6];
        setContainedBinding(this.mboundView01);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.RelativeLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.participantsClickListener == variableId) {
            setParticipantsClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.nextClickListener == variableId) {
            setNextClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.leaveClickListener == variableId) {
            setLeaveClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.chat.viewmodels.GroupInfoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setParticipantsClickListener(@Nullable android.view.View.OnClickListener ParticipantsClickListener) {
        this.mParticipantsClickListener = ParticipantsClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.participantsClickListener);
        super.requestRebind();
    }
    public void setNextClickListener(@Nullable android.view.View.OnClickListener NextClickListener) {
        this.mNextClickListener = NextClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.nextClickListener);
        super.requestRebind();
    }
    public void setLeaveClickListener(@Nullable android.view.View.OnClickListener LeaveClickListener) {
        this.mLeaveClickListener = LeaveClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.leaveClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.chat.viewmodels.GroupInfoViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelParticipants((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.GroupInfoParticipantData>>) object, fieldId);
            case 1 :
                return onChangeViewModelSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelIsMeAdmin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelWaitForChatRoomCreation((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelCanLeaveGroup((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelMeAdmin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelParticipants(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.GroupInfoParticipantData>> ViewModelParticipants, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSubject(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsMeAdmin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsMeAdmin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelWaitForChatRoomCreation(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelWaitForChatRoomCreation, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCanLeaveGroup(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelCanLeaveGroup, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMeAdmin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelMeAdmin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        java.lang.Boolean viewModelMeAdminGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.GroupInfoParticipantData>> viewModelParticipants = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsMeAdminGetValue = false;
        java.util.ArrayList<org.linphone.activities.main.chat.data.GroupInfoParticipantData> viewModelParticipantsGetValue = null;
        java.lang.Boolean viewModelIsMeAdminGetValue = null;
        boolean viewModelSubjectLengthInt0 = false;
        android.view.View.OnClickListener participantsClickListener = mParticipantsClickListener;
        java.lang.String viewModelSubjectGetValue = null;
        int viewModelCanLeaveGroupViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelCanLeaveGroupGetValue = false;
        android.view.View.OnClickListener nextClickListener = mNextClickListener;
        int viewModelSubjectLength = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelSubject = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsMeAdmin = null;
        boolean viewModelParticipantsSizeInt0 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelMeAdminGetValue = false;
        android.view.View.OnClickListener leaveClickListener = mLeaveClickListener;
        int viewModelMeAdminViewVISIBLEViewINVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelWaitForChatRoomCreation = null;
        int viewModelMeAdminViewVISIBLEViewGONE = 0;
        boolean viewModelIsMeAdminViewModelParticipantsSizeInt0BooleanFalse = false;
        int viewModelParticipantsSize = 0;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelCanLeaveGroup = null;
        java.lang.Boolean viewModelCanLeaveGroupGetValue = null;
        org.linphone.activities.main.chat.viewmodels.GroupInfoViewModel viewModel = mViewModel;
        boolean viewModelIsMeAdminViewModelParticipantsSizeInt0BooleanFalseViewModelSubjectLengthInt0BooleanFalse = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelMeAdmin = null;
        java.lang.Boolean viewModelWaitForChatRoomCreationGetValue = null;

        if ((dirtyFlags & 0x440L) != 0) {
        }
        if ((dirtyFlags & 0x480L) != 0) {
        }
        if ((dirtyFlags & 0x500L) != 0) {
        }
        if ((dirtyFlags & 0x63fL) != 0) {


            if ((dirtyFlags & 0x602L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.subject
                        viewModelSubject = viewModel.getSubject();
                    }
                    updateLiveDataRegistration(1, viewModelSubject);


                    if (viewModelSubject != null) {
                        // read viewModel.subject.getValue()
                        viewModelSubjectGetValue = viewModelSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0x607L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isMeAdmin
                        viewModelIsMeAdmin = viewModel.isMeAdmin();
                    }
                    updateLiveDataRegistration(2, viewModelIsMeAdmin);


                    if (viewModelIsMeAdmin != null) {
                        // read viewModel.isMeAdmin.getValue()
                        viewModelIsMeAdminGetValue = viewModelIsMeAdmin.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMeAdmin.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsMeAdminGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsMeAdminGetValue);
                if((dirtyFlags & 0x607L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsMeAdminGetValue) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
            }
            if ((dirtyFlags & 0x608L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.waitForChatRoomCreation
                        viewModelWaitForChatRoomCreation = viewModel.getWaitForChatRoomCreation();
                    }
                    updateLiveDataRegistration(3, viewModelWaitForChatRoomCreation);


                    if (viewModelWaitForChatRoomCreation != null) {
                        // read viewModel.waitForChatRoomCreation.getValue()
                        viewModelWaitForChatRoomCreationGetValue = viewModelWaitForChatRoomCreation.getValue();
                    }
            }
            if ((dirtyFlags & 0x610L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.canLeaveGroup
                        viewModelCanLeaveGroup = viewModel.getCanLeaveGroup();
                    }
                    updateLiveDataRegistration(4, viewModelCanLeaveGroup);


                    if (viewModelCanLeaveGroup != null) {
                        // read viewModel.canLeaveGroup.getValue()
                        viewModelCanLeaveGroupGetValue = viewModelCanLeaveGroup.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canLeaveGroup.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelCanLeaveGroupGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelCanLeaveGroupGetValue);
                if((dirtyFlags & 0x610L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelCanLeaveGroupGetValue) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canLeaveGroup.getValue()) ? View.VISIBLE : View.GONE
                    viewModelCanLeaveGroupViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelCanLeaveGroupGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x620L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.meAdmin
                        viewModelMeAdmin = viewModel.isMeAdmin();
                    }
                    updateLiveDataRegistration(5, viewModelMeAdmin);


                    if (viewModelMeAdmin != null) {
                        // read viewModel.meAdmin.getValue()
                        viewModelMeAdminGetValue = viewModelMeAdmin.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.meAdmin.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelMeAdminGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelMeAdminGetValue);
                if((dirtyFlags & 0x620L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelMeAdminGetValue) {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.meAdmin.getValue()) ? View.VISIBLE : View.INVISIBLE
                    viewModelMeAdminViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelMeAdminGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.meAdmin.getValue()) ? View.VISIBLE : View.GONE
                    viewModelMeAdminViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelMeAdminGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.participants
                    viewModelParticipants = viewModel.getParticipants();
                }
                updateLiveDataRegistration(0, viewModelParticipants);


                if (viewModelParticipants != null) {
                    // read viewModel.participants.getValue()
                    viewModelParticipantsGetValue = viewModelParticipants.getValue();
                }


                if (viewModelParticipantsGetValue != null) {
                    // read viewModel.participants.getValue().size()
                    viewModelParticipantsSize = viewModelParticipantsGetValue.size();
                }


                // read viewModel.participants.getValue().size() > 0
                viewModelParticipantsSizeInt0 = (viewModelParticipantsSize) > (0);
        }

        if ((dirtyFlags & 0x607L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMeAdmin.getValue()) ? viewModel.participants.getValue().size() > 0 : false
                viewModelIsMeAdminViewModelParticipantsSizeInt0BooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsMeAdminGetValue) ? (viewModelParticipantsSizeInt0) : (false));
            if((dirtyFlags & 0x607L) != 0) {
                if(viewModelIsMeAdminViewModelParticipantsSizeInt0BooleanFalse) {
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x80000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.subject
                    viewModelSubject = viewModel.getSubject();
                }
                updateLiveDataRegistration(1, viewModelSubject);


                if (viewModelSubject != null) {
                    // read viewModel.subject.getValue()
                    viewModelSubjectGetValue = viewModelSubject.getValue();
                }


                if (viewModelSubjectGetValue != null) {
                    // read viewModel.subject.getValue().length()
                    viewModelSubjectLength = viewModelSubjectGetValue.length();
                }


                // read viewModel.subject.getValue().length() > 0
                viewModelSubjectLengthInt0 = (viewModelSubjectLength) > (0);
        }

        if ((dirtyFlags & 0x607L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMeAdmin.getValue()) ? viewModel.participants.getValue().size() > 0 : false ? viewModel.subject.getValue().length() > 0 : false
                viewModelIsMeAdminViewModelParticipantsSizeInt0BooleanFalseViewModelSubjectLengthInt0BooleanFalse = ((viewModelIsMeAdminViewModelParticipantsSizeInt0BooleanFalse) ? (viewModelSubjectLengthInt0) : (false));
        }
        // batch finished
        if ((dirtyFlags & 0x500L) != 0) {
            // api target 1

            this.leaveGroup.setOnClickListener(leaveClickListener);
        }
        if ((dirtyFlags & 0x610L) != 0) {
            // api target 1

            this.leaveGroup.setVisibility(viewModelCanLeaveGroupViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x608L) != 0) {
            // api target 1

            this.mboundView01.setVisibility(viewModelWaitForChatRoomCreationGetValue);
        }
        if ((dirtyFlags & 0x480L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(nextClickListener);
        }
        if ((dirtyFlags & 0x607L) != 0) {
            // api target 1

            this.mboundView1.setEnabled(viewModelIsMeAdminViewModelParticipantsSizeInt0BooleanFalseViewModelSubjectLengthInt0BooleanFalse);
        }
        if ((dirtyFlags & 0x620L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelMeAdminViewVISIBLEViewINVISIBLE);
            this.mboundView2.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelMeAdminGetValue);
            this.mboundView3.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelMeAdminGetValue);
            this.mboundView4.setVisibility(viewModelMeAdminViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x602L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelSubjectGetValue);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
        }
        if ((dirtyFlags & 0x440L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(participantsClickListener);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.participants
        flag 1 (0x2L): viewModel.subject
        flag 2 (0x3L): viewModel.isMeAdmin
        flag 3 (0x4L): viewModel.waitForChatRoomCreation
        flag 4 (0x5L): viewModel.canLeaveGroup
        flag 5 (0x6L): viewModel.meAdmin
        flag 6 (0x7L): participantsClickListener
        flag 7 (0x8L): nextClickListener
        flag 8 (0x9L): leaveClickListener
        flag 9 (0xaL): viewModel
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canLeaveGroup.getValue()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.canLeaveGroup.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.meAdmin.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.meAdmin.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.meAdmin.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.meAdmin.getValue()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMeAdmin.getValue()) ? viewModel.participants.getValue().size() > 0 : false
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMeAdmin.getValue()) ? viewModel.participants.getValue().size() > 0 : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMeAdmin.getValue()) ? viewModel.participants.getValue().size() > 0 : false ? viewModel.subject.getValue().length() > 0 : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isMeAdmin.getValue()) ? viewModel.participants.getValue().size() > 0 : false ? viewModel.subject.getValue().length() > 0 : false
    flag mapping end*/
    //end
}