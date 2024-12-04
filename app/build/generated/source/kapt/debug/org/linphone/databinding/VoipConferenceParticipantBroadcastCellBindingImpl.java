package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceParticipantBroadcastCellBindingImpl extends VoipConferenceParticipantBroadcastCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final org.linphone.views.MarqueeTextView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback69;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceParticipantBroadcastCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private VoipConferenceParticipantBroadcastCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (org.linphone.views.MarqueeTextView) bindings[5]
            , (android.widget.LinearLayout) bindings[3]
            );
        this.avatar.setTag(null);
        this.delete.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView4 = (org.linphone.views.MarqueeTextView) bindings[4];
        this.mboundView4.setTag(null);
        this.sipUri.setTag(null);
        this.speakerLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback69 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setData((org.linphone.activities.voip.data.ConferenceParticipantData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.voip.data.ConferenceParticipantData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataIsSpeaker((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 3 :
                return onChangeDataIsMeAdmin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataIsSpeaker(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsSpeaker, int fieldId) {
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
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsMeAdmin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsMeAdmin, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakerGetValue = false;
        java.lang.String dataDisplayNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsSpeaker = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        int dataIsMeAdminViewVISIBLEViewINVISIBLE = 0;
        java.lang.String dataContactName = null;
        org.linphone.activities.voip.data.ConferenceParticipantData data = mData;
        java.lang.Boolean dataIsMeAdminGetValue = null;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsMeAdminGetValue = false;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        java.lang.String dataSipUri = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsMeAdmin = null;
        java.lang.Boolean dataIsSpeakerGetValue = null;
        int dataIsSpeakerViewVISIBLEViewINVISIBLE = 0;
        org.linphone.core.Friend dataContactGetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (data != null) {
                        // read data.isSpeaker
                        dataIsSpeaker = data.isSpeaker();
                    }
                    updateLiveDataRegistration(0, dataIsSpeaker);


                    if (dataIsSpeaker != null) {
                        // read data.isSpeaker.getValue()
                        dataIsSpeakerGetValue = dataIsSpeaker.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakerGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsSpeakerGetValue);
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakerGetValue) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue()) ? View.VISIBLE : View.INVISIBLE
                    dataIsSpeakerViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsSpeakerGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x36L) != 0) {

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
                if((dirtyFlags & 0x36L) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
            }
            if ((dirtyFlags & 0x30L) != 0) {

                    if (data != null) {
                        // read data.sipUri
                        dataSipUri = data.getSipUri();
                    }
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (data != null) {
                        // read data.isMeAdmin
                        dataIsMeAdmin = data.isMeAdmin();
                    }
                    updateLiveDataRegistration(3, dataIsMeAdmin);


                    if (dataIsMeAdmin != null) {
                        // read data.isMeAdmin.getValue()
                        dataIsMeAdminGetValue = dataIsMeAdmin.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsMeAdminGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsMeAdminGetValue);
                if((dirtyFlags & 0x38L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsMeAdminGetValue) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue()) ? View.VISIBLE : View.INVISIBLE
                    dataIsMeAdminViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsMeAdminGetValue) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200L) != 0) {

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

        if ((dirtyFlags & 0x36L) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        // batch finished
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.avatar, data);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.sipUri, dataSipUri);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback69);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.delete.setVisibility(dataIsMeAdminViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x36L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.speakerLayout.setVisibility(dataIsSpeakerViewVISIBLEViewINVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.voip.data.ConferenceParticipantData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.removeParticipantFromConference();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.isSpeaker
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.contact
        flag 3 (0x4L): data.isMeAdmin
        flag 4 (0x5L): data
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 8 (0x9L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 9 (0xaL): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(data.isSpeaker.getValue()) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}