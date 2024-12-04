package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomImdnParticipantCellBindingImpl extends ChatRoomImdnParticipantCellBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView4;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatRoomImdnParticipantCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ChatRoomImdnParticipantCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.avatar.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (org.linphone.views.MarqueeTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (org.linphone.views.MarqueeTextView) bindings[5];
        this.mboundView5.setTag(null);
        this.time.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setData((org.linphone.activities.main.chat.data.ImdnParticipantData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.chat.data.ImdnParticipantData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDataPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 2 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataDisplayName(androidx.lifecycle.MutableLiveData<java.lang.String> DataDisplayName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataPresenceStatus(androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> DataPresenceStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        java.lang.String dataDisplayNameGetValue = null;
        boolean dataPresenceStatusConsolidatedPresenceOffline = false;
        java.lang.String dataTime = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> dataPresenceStatus = null;
        int dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        org.linphone.core.ConsolidatedPresence dataPresenceStatusGetValue = null;
        java.lang.String dataSipUri = null;
        java.lang.String dataContactName = null;
        org.linphone.activities.main.chat.data.ImdnParticipantData data = mData;
        org.linphone.core.Friend dataContactGetValue = null;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (data != null) {
                        // read data.time
                        dataTime = data.getTime();
                        // read data.sipUri
                        dataSipUri = data.getSipUri();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (data != null) {
                        // read data.presenceStatus
                        dataPresenceStatus = data.getPresenceStatus();
                    }
                    updateLiveDataRegistration(1, dataPresenceStatus);


                    if (dataPresenceStatus != null) {
                        // read data.presenceStatus.getValue()
                        dataPresenceStatusGetValue = dataPresenceStatus.getValue();
                    }


                    // read data.presenceStatus.getValue() == ConsolidatedPresence.Offline
                    dataPresenceStatusConsolidatedPresenceOffline = (dataPresenceStatusGetValue) == (org.linphone.core.ConsolidatedPresence.Offline);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(dataPresenceStatusConsolidatedPresenceOffline) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
                    dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = ((dataPresenceStatusConsolidatedPresenceOffline) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1dL) != 0) {

                    if (data != null) {
                        // read data.contact
                        dataContact = data.getContact();
                    }
                    updateLiveDataRegistration(2, dataContact);


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
                if((dirtyFlags & 0x1dL) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40L) != 0) {

                if (data != null) {
                    // read data.displayName
                    dataDisplayName = data.getDisplayName();
                }
                updateLiveDataRegistration(0, dataDisplayName);


                if (dataDisplayName != null) {
                    // read data.displayName.getValue()
                    dataDisplayNameGetValue = dataDisplayName.getValue();
                }
        }

        if ((dirtyFlags & 0x1dL) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.avatar, data);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataSipUri);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.time, dataTime);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView2, dataPresenceStatusGetValue);
            this.mboundView2.setVisibility(dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1dL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.displayName
        flag 1 (0x2L): data.presenceStatus
        flag 2 (0x3L): data.contact
        flag 3 (0x4L): data
        flag 4 (0x5L): null
        flag 5 (0x6L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 6 (0x7L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 7 (0x8L): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 8 (0x9L): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}