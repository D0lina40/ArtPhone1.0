package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomGroupInfoParticipantCellBindingImpl extends ChatRoomGroupInfoParticipantCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.avatar, 10);
        sViewsWithIds.put(R.id.admin_barrier, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatRoomGroupInfoParticipantCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ChatRoomGroupInfoParticipantCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (androidx.constraintlayout.widget.Barrier) bindings[11]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[5]
            , (org.linphone.views.MarqueeTextView) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[7]
            , (org.linphone.views.MarqueeTextView) bindings[9]
            );
        this.avatarIcon.setTag(null);
        this.delete.setTag(null);
        this.displayName.setTag(null);
        this.isAdmin.setTag(null);
        this.isNotAdmin.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.sipUri.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback7 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x400L;
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
        if (BR.removeClickListener == variableId) {
            setRemoveClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.data == variableId) {
            setData((org.linphone.activities.main.chat.data.GroupInfoParticipantData) variable);
        }
        else if (BR.isEncrypted == variableId) {
            setIsEncrypted((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRemoveClickListener(@Nullable android.view.View.OnClickListener RemoveClickListener) {
        this.mRemoveClickListener = RemoveClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.removeClickListener);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.activities.main.chat.data.GroupInfoParticipantData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setIsEncrypted(@Nullable java.lang.Boolean IsEncrypted) {
        this.mIsEncrypted = IsEncrypted;
        synchronized(this) {
            mDirtyFlags |= 0x200L;
        }
        notifyPropertyChanged(BR.isEncrypted);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataSecurityLevel((androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom.SecurityLevel>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 3 :
                return onChangeDataShowAdminControls((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 5 :
                return onChangeDataCanBeSetAdmin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeDataAdmin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataSecurityLevel(androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom.SecurityLevel> DataSecurityLevel, int fieldId) {
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
    private boolean onChangeDataPresenceStatus(androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> DataPresenceStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataShowAdminControls(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataShowAdminControls, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataCanBeSetAdmin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataCanBeSetAdmin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataAdmin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataAdmin, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<org.linphone.core.ChatRoom.SecurityLevel> dataSecurityLevel = null;
        int isEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String dataDisplayNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        android.view.View.OnClickListener removeClickListener = mRemoveClickListener;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> dataPresenceStatus = null;
        boolean isEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalse = false;
        int dataSecurityLevelContentDescription = 0;
        int dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        boolean dataSecurityLevelSecurityLevelClearText = false;
        boolean dataShowAdminControlsDataCanBeSetAdminBooleanFalse = false;
        boolean DataSecurityLevelSecurityLevelClearText1 = false;
        org.linphone.activities.main.chat.data.GroupInfoParticipantData data = mData;
        boolean IsEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalse1 = false;
        java.lang.Boolean dataAdminGetValue = null;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        java.lang.Boolean dataShowAdminControlsGetValue = null;
        int IsEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalseViewVISIBLEViewGONE1 = 0;
        java.lang.String dataSipUri = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxIsEncrypted = false;
        org.linphone.core.Friend dataContactGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataCanBeSetAdminGetValue = false;
        int dataAdminViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataShowAdminControlsGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataAdminGetValue = false;
        org.linphone.core.ConsolidatedPresence dataPresenceStatusGetValue = null;
        int dataShowAdminControlsViewVISIBLEViewGONE = 0;
        int dataSecurityLevelIcon = 0;
        java.lang.String dataContactName = null;
        java.lang.Boolean isEncrypted = mIsEncrypted;
        boolean dataPresenceStatusConsolidatedPresenceOffline = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataShowAdminControls = null;
        int dataAdminViewGONEDataShowAdminControlsDataCanBeSetAdminBooleanFalseViewVISIBLEViewGONE = 0;
        org.linphone.core.ChatRoom.SecurityLevel dataSecurityLevelGetValue = null;
        int dataShowAdminControlsDataCanBeSetAdminBooleanFalseViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataCanBeSetAdmin = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataAdmin = null;
        java.lang.Boolean dataCanBeSetAdminGetValue = null;

        if ((dirtyFlags & 0x480L) != 0) {
        }
        if ((dirtyFlags & 0x57eL) != 0) {


            if ((dirtyFlags & 0x504L) != 0) {

                    if (data != null) {
                        // read data.presenceStatus
                        dataPresenceStatus = data.getPresenceStatus();
                    }
                    updateLiveDataRegistration(2, dataPresenceStatus);


                    if (dataPresenceStatus != null) {
                        // read data.presenceStatus.getValue()
                        dataPresenceStatusGetValue = dataPresenceStatus.getValue();
                    }


                    // read data.presenceStatus.getValue() == ConsolidatedPresence.Offline
                    dataPresenceStatusConsolidatedPresenceOffline = (dataPresenceStatusGetValue) == (org.linphone.core.ConsolidatedPresence.Offline);
                if((dirtyFlags & 0x504L) != 0) {
                    if(dataPresenceStatusConsolidatedPresenceOffline) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
                    dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = ((dataPresenceStatusConsolidatedPresenceOffline) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x500L) != 0) {

                    if (data != null) {
                        // read data.securityLevelContentDescription
                        dataSecurityLevelContentDescription = data.getSecurityLevelContentDescription();
                        // read data.sipUri
                        dataSipUri = data.getSipUri();
                        // read data.securityLevelIcon
                        dataSecurityLevelIcon = data.getSecurityLevelIcon();
                    }
            }
            if ((dirtyFlags & 0x528L) != 0) {

                    if (data != null) {
                        // read data.showAdminControls
                        dataShowAdminControls = data.getShowAdminControls();
                    }
                    updateLiveDataRegistration(3, dataShowAdminControls);


                    if (dataShowAdminControls != null) {
                        // read data.showAdminControls.getValue()
                        dataShowAdminControlsGetValue = dataShowAdminControls.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataShowAdminControlsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataShowAdminControlsGetValue);
                if((dirtyFlags & 0x20000528L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataShowAdminControlsGetValue) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x508L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataShowAdminControlsGetValue) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }

                if ((dirtyFlags & 0x508L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? View.VISIBLE : View.GONE
                        dataShowAdminControlsViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataShowAdminControlsGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
            if ((dirtyFlags & 0x512L) != 0) {

                    if (data != null) {
                        // read data.contact
                        dataContact = data.getContact();
                    }
                    updateLiveDataRegistration(4, dataContact);


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
                if((dirtyFlags & 0x512L) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200000L;
                    }
                }
            }
            if ((dirtyFlags & 0x568L) != 0) {

                    if (data != null) {
                        // read data.admin
                        dataAdmin = data.isAdmin();
                    }
                    updateLiveDataRegistration(6, dataAdmin);


                    if (dataAdmin != null) {
                        // read data.admin.getValue()
                        dataAdminGetValue = dataAdmin.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.admin.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataAdminGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataAdminGetValue);
                if((dirtyFlags & 0x540L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataAdminGetValue) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }
                if((dirtyFlags & 0x568L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataAdminGetValue) {
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000000L;
                    }
                }

                if ((dirtyFlags & 0x540L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.admin.getValue()) ? View.VISIBLE : View.GONE
                        dataAdminViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataAdminGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
            }
        }
        if ((dirtyFlags & 0x701L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted)
                androidxDatabindingViewDataBindingSafeUnboxIsEncrypted = androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted);
            if((dirtyFlags & 0x701L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxIsEncrypted) {
                        dirtyFlags |= 0x4000L;
                        dirtyFlags |= 0x100000L;
                }
                else {
                        dirtyFlags |= 0x2000L;
                        dirtyFlags |= 0x80000L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20504000L) != 0) {


            if ((dirtyFlags & 0x104000L) != 0) {

                    if (data != null) {
                        // read data.securityLevel
                        dataSecurityLevel = data.getSecurityLevel();
                    }
                    updateLiveDataRegistration(0, dataSecurityLevel);


                    if (dataSecurityLevel != null) {
                        // read data.securityLevel.getValue()
                        dataSecurityLevelGetValue = dataSecurityLevel.getValue();
                    }

                if ((dirtyFlags & 0x4000L) != 0) {

                        // read data.securityLevel.getValue() == SecurityLevel.ClearText
                        dataSecurityLevelSecurityLevelClearText = (dataSecurityLevelGetValue) == (org.linphone.core.ChatRoom.SecurityLevel.ClearText);
                }
                if ((dirtyFlags & 0x100000L) != 0) {

                        // read data.securityLevel.getValue() != SecurityLevel.ClearText
                        DataSecurityLevelSecurityLevelClearText1 = (dataSecurityLevelGetValue) != (org.linphone.core.ChatRoom.SecurityLevel.ClearText);
                }
            }
            if ((dirtyFlags & 0x400000L) != 0) {

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
            if ((dirtyFlags & 0x20000000L) != 0) {

                    if (data != null) {
                        // read data.showAdminControls
                        dataShowAdminControls = data.getShowAdminControls();
                    }
                    updateLiveDataRegistration(3, dataShowAdminControls);


                    if (dataShowAdminControls != null) {
                        // read data.showAdminControls.getValue()
                        dataShowAdminControlsGetValue = dataShowAdminControls.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataShowAdminControlsGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataShowAdminControlsGetValue);
                if((dirtyFlags & 0x20000528L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataShowAdminControlsGetValue) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                if((dirtyFlags & 0x508L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataShowAdminControlsGetValue) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }
            }
        }

        if ((dirtyFlags & 0x701L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() == SecurityLevel.ClearText : false
                isEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxIsEncrypted) ? (dataSecurityLevelSecurityLevelClearText) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() != SecurityLevel.ClearText : false
                IsEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalse1 = ((androidxDatabindingViewDataBindingSafeUnboxIsEncrypted) ? (DataSecurityLevelSecurityLevelClearText1) : (false));
            if((dirtyFlags & 0x701L) != 0) {
                if(isEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalse) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }
            if((dirtyFlags & 0x701L) != 0) {
                if(IsEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalse1) {
                        dirtyFlags |= 0x1000000L;
                }
                else {
                        dirtyFlags |= 0x800000L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() == SecurityLevel.ClearText : false ? View.VISIBLE : View.GONE
                isEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalseViewVISIBLEViewGONE = ((isEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() != SecurityLevel.ClearText : false ? View.VISIBLE : View.GONE
                IsEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalseViewVISIBLEViewGONE1 = ((IsEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalse1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x512L) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        // batch finished

        if ((dirtyFlags & 0x40000L) != 0) {

                if (data != null) {
                    // read data.canBeSetAdmin
                    dataCanBeSetAdmin = data.getCanBeSetAdmin();
                }
                updateLiveDataRegistration(5, dataCanBeSetAdmin);


                if (dataCanBeSetAdmin != null) {
                    // read data.canBeSetAdmin.getValue()
                    dataCanBeSetAdminGetValue = dataCanBeSetAdmin.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataCanBeSetAdminGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataCanBeSetAdminGetValue);
        }

        if ((dirtyFlags & 0x20000528L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue()) : false
                dataShowAdminControlsDataCanBeSetAdminBooleanFalse = ((androidxDatabindingViewDataBindingSafeUnboxDataShowAdminControlsGetValue) ? (androidxDatabindingViewDataBindingSafeUnboxDataCanBeSetAdminGetValue) : (false));
            if((dirtyFlags & 0x20000000L) != 0) {
                if(dataShowAdminControlsDataCanBeSetAdminBooleanFalse) {
                        dirtyFlags |= 0x100000000L;
                }
                else {
                        dirtyFlags |= 0x80000000L;
                }
            }

            if ((dirtyFlags & 0x20000000L) != 0) {

                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue()) : false ? View.VISIBLE : View.GONE
                    dataShowAdminControlsDataCanBeSetAdminBooleanFalseViewVISIBLEViewGONE = ((dataShowAdminControlsDataCanBeSetAdminBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }

        if ((dirtyFlags & 0x568L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.admin.getValue()) ? View.GONE : androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue()) : false ? View.VISIBLE : View.GONE
                dataAdminViewGONEDataShowAdminControlsDataCanBeSetAdminBooleanFalseViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataAdminGetValue) ? (android.view.View.GONE) : (dataShowAdminControlsDataCanBeSetAdminBooleanFalseViewVISIBLEViewGONE));
        }
        // batch finished
        if ((dirtyFlags & 0x500L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.avatarIcon, data);
            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView4, dataSecurityLevelContentDescription);
            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView4, dataSecurityLevelIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sipUri, dataSipUri);
        }
        if ((dirtyFlags & 0x480L) != 0) {
            // api target 1

            this.delete.setOnClickListener(removeClickListener);
        }
        if ((dirtyFlags & 0x508L) != 0) {
            // api target 1

            this.delete.setVisibility(dataShowAdminControlsViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x512L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.displayName, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
        if ((dirtyFlags & 0x528L) != 0) {
            // api target 1

            this.isAdmin.setEnabled(dataShowAdminControlsDataCanBeSetAdminBooleanFalse);
            this.isNotAdmin.setEnabled(dataShowAdminControlsDataCanBeSetAdminBooleanFalse);
        }
        if ((dirtyFlags & 0x400L) != 0) {
            // api target 1

            this.isAdmin.setOnClickListener(mCallback7);
            this.isNotAdmin.setOnClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x540L) != 0) {
            // api target 1

            this.isAdmin.setVisibility(dataAdminViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x568L) != 0) {
            // api target 1

            this.isNotAdmin.setVisibility(dataAdminViewGONEDataShowAdminControlsDataCanBeSetAdminBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x504L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView2, dataPresenceStatusGetValue);
        }
        if ((dirtyFlags & 0x701L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(isEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalseViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(IsEncryptedDataSecurityLevelSecurityLevelClearTextBooleanFalseViewVISIBLEViewGONE1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.chat.data.GroupInfoParticipantData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.setAdmin();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.chat.data.GroupInfoParticipantData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.unSetAdmin();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.securityLevel
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.presenceStatus
        flag 3 (0x4L): data.showAdminControls
        flag 4 (0x5L): data.contact
        flag 5 (0x6L): data.canBeSetAdmin
        flag 6 (0x7L): data.admin
        flag 7 (0x8L): removeClickListener
        flag 8 (0x9L): data
        flag 9 (0xaL): isEncrypted
        flag 10 (0xbL): null
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() == SecurityLevel.ClearText : false ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() == SecurityLevel.ClearText : false ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() == SecurityLevel.ClearText : false
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() == SecurityLevel.ClearText : false
        flag 15 (0x10L): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 16 (0x11L): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue()) : false
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue()) : false
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() != SecurityLevel.ClearText : false
        flag 20 (0x15L): androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() != SecurityLevel.ClearText : false
        flag 21 (0x16L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 22 (0x17L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() != SecurityLevel.ClearText : false ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(isEncrypted) ? data.securityLevel.getValue() != SecurityLevel.ClearText : false ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): androidx.databinding.ViewDataBinding.safeUnbox(data.admin.getValue()) ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): androidx.databinding.ViewDataBinding.safeUnbox(data.admin.getValue()) ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(data.admin.getValue()) ? View.GONE : androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue()) : false ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(data.admin.getValue()) ? View.GONE : androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue()) : false ? View.VISIBLE : View.GONE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue()) : false ? View.VISIBLE : View.GONE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(data.showAdminControls.getValue()) ? androidx.databinding.ViewDataBinding.safeUnbox(data.canBeSetAdmin.getValue()) : false ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}