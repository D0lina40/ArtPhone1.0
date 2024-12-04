package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContactSelectionCellBindingImpl extends ContactSelectionCellBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.avatar, 10);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.view.View mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContactSelectionCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private ContactSelectionCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[7]
            );
        this.avatarIcon.setTag(null);
        this.contactIsSelect.setTag(null);
        this.linphoneUser.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView9 = (android.view.View) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
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
        if (BR.data == variableId) {
            setData((org.linphone.contact.ContactSelectionData) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.contact.ContactSelectionData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataIsSelected((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 3 :
                return onChangeDataIsDisabled((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataIsSelected(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsSelected, int fieldId) {
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
    private boolean onChangeDataIsDisabled(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsDisabled, int fieldId) {
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsSelected = null;
        java.lang.Boolean dataIsDisabledGetValue = null;
        java.lang.String dataDisplayNameGetValue = null;
        int dataLinphoneUserViewVISIBLEViewINVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> dataPresenceStatus = null;
        int dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        org.linphone.core.ConsolidatedPresence dataPresenceStatusGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsDisabled = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsDisabled = null;
        boolean DataIsDisabled1 = false;
        int dataHasLimeX3DHCapabilityViewVISIBLEViewGONE = 0;
        java.lang.String dataContactName = null;
        org.linphone.contact.ContactSelectionData data = mData;
        boolean dataHasLimeX3DHCapability = false;
        java.lang.Boolean dataIsSelectedGetValue = null;
        int dataIsDisabledViewVISIBLEViewGONE = 0;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        boolean dataLinphoneUser = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsDisabledGetValue = false;
        boolean dataPresenceStatusConsolidatedPresenceOffline = false;
        android.view.View.OnClickListener clickListener = mClickListener;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        java.lang.String dataSipUri = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsSelectedGetValue = false;
        int dataIsSelectedViewVISIBLEViewINVISIBLE = 0;
        org.linphone.core.Friend dataContactGetValue = null;

        if ((dirtyFlags & 0xbfL) != 0) {


            if ((dirtyFlags & 0xa1L) != 0) {

                    if (data != null) {
                        // read data.isSelected
                        dataIsSelected = data.isSelected();
                    }
                    updateLiveDataRegistration(0, dataIsSelected);


                    if (dataIsSelected != null) {
                        // read data.isSelected.getValue()
                        dataIsSelectedGetValue = dataIsSelected.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSelected.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsSelectedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsSelectedGetValue);
                if((dirtyFlags & 0xa1L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsSelectedGetValue) {
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSelected.getValue()) ? View.VISIBLE : View.INVISIBLE
                    dataIsSelectedViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsSelectedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0xa4L) != 0) {

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
                if((dirtyFlags & 0xa4L) != 0) {
                    if(dataPresenceStatusConsolidatedPresenceOffline) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
                    dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = ((dataPresenceStatusConsolidatedPresenceOffline) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xa8L) != 0) {

                    if (data != null) {
                        // read data.isDisabled
                        dataIsDisabled = data.isDisabled();
                    }
                    updateLiveDataRegistration(3, dataIsDisabled);


                    if (dataIsDisabled != null) {
                        // read data.isDisabled.getValue()
                        dataIsDisabledGetValue = dataIsDisabled.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isDisabled.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsDisabledGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsDisabledGetValue);
                if((dirtyFlags & 0xa8L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsDisabledGetValue) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isDisabled.getValue())
                    DataIsDisabled1 = !androidxDatabindingViewDataBindingSafeUnboxDataIsDisabledGetValue;
                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isDisabled.getValue()) ? View.VISIBLE : View.GONE
                    dataIsDisabledViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsDisabledGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(data.isDisabled.getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxDataIsDisabled = androidx.databinding.ViewDataBinding.safeUnbox(DataIsDisabled1);
            }
            if ((dirtyFlags & 0xa0L) != 0) {

                    if (data != null) {
                        // read data.hasLimeX3DHCapability
                        dataHasLimeX3DHCapability = data.getHasLimeX3DHCapability();
                        // read data.linphoneUser
                        dataLinphoneUser = data.isLinphoneUser();
                        // read data.sipUri
                        dataSipUri = data.getSipUri();
                    }
                if((dirtyFlags & 0xa0L) != 0) {
                    if(dataHasLimeX3DHCapability) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0xa0L) != 0) {
                    if(dataLinphoneUser) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read data.hasLimeX3DHCapability ? View.VISIBLE : View.GONE
                    dataHasLimeX3DHCapabilityViewVISIBLEViewGONE = ((dataHasLimeX3DHCapability) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read data.linphoneUser ? View.VISIBLE : View.INVISIBLE
                    dataLinphoneUserViewVISIBLEViewINVISIBLE = ((dataLinphoneUser) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0xb2L) != 0) {

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
                if((dirtyFlags & 0xb2L) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
            }
        }
        if ((dirtyFlags & 0xc0L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x20000L) != 0) {

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

        if ((dirtyFlags & 0xb2L) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        // batch finished
        if ((dirtyFlags & 0xa0L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.avatarIcon, data);
            this.linphoneUser.setVisibility(dataLinphoneUserViewVISIBLEViewINVISIBLE);
            this.mboundView4.setVisibility(dataHasLimeX3DHCapabilityViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, dataSipUri);
        }
        if ((dirtyFlags & 0xa1L) != 0) {
            // api target 1

            this.contactIsSelect.setVisibility(dataIsSelectedViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0xa8L) != 0) {
            // api target 1

            this.mboundView1.setEnabled(androidxDatabindingViewDataBindingSafeUnboxDataIsDisabled);
            this.mboundView9.setVisibility(dataIsDisabledViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xa4L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView3, dataPresenceStatusGetValue);
            this.mboundView3.setVisibility(dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xb2L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.isSelected
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.presenceStatus
        flag 3 (0x4L): data.isDisabled
        flag 4 (0x5L): data.contact
        flag 5 (0x6L): data
        flag 6 (0x7L): clickListener
        flag 7 (0x8L): null
        flag 8 (0x9L): data.linphoneUser ? View.VISIBLE : View.INVISIBLE
        flag 9 (0xaL): data.linphoneUser ? View.VISIBLE : View.INVISIBLE
        flag 10 (0xbL): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 11 (0xcL): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 12 (0xdL): data.hasLimeX3DHCapability ? View.VISIBLE : View.GONE
        flag 13 (0xeL): data.hasLimeX3DHCapability ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(data.isDisabled.getValue()) ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(data.isDisabled.getValue()) ? View.VISIBLE : View.GONE
        flag 16 (0x11L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 17 (0x12L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(data.isSelected.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(data.isSelected.getValue()) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}