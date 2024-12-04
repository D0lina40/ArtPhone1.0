package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceParticipantCellBindingImpl extends VoipConferenceParticipantCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.adminLayout, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback118;
    @Nullable
    private final android.view.View.OnClickListener mCallback120;
    @Nullable
    private final android.view.View.OnClickListener mCallback119;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceParticipantCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private VoipConferenceParticipantCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[4]
            , (org.linphone.views.MarqueeTextView) bindings[6]
            );
        this.avatar.setTag(null);
        this.delete.setTag(null);
        this.isAdminLayout.setTag(null);
        this.isNotAdminLayout.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (org.linphone.views.MarqueeTextView) bindings[5];
        this.mboundView5.setTag(null);
        this.sipUri.setTag(null);
        setRootTag(root);
        // listeners
        mCallback118 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback120 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback119 = new org.linphone.generated.callback.OnClickListener(this, 2);
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
                return onChangeDataIsAdmin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 3 :
                return onChangeDataIsMeAdmin((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataIsAdmin(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsAdmin, int fieldId) {
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
        java.lang.Boolean dataIsAdminGetValue = null;
        java.lang.String dataDisplayNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsAdmin = null;
        boolean dataIsMeAdmin = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        int dataIsMeAdminViewVISIBLEViewINVISIBLE = 0;
        int dataIsAdminViewVISIBLEViewGONE = 0;
        java.lang.String dataContactName = null;
        org.linphone.activities.voip.data.ConferenceParticipantData data = mData;
        int dataIsAdminBooleanTrueDataIsMeAdminViewGONEViewVISIBLE = 0;
        boolean dataIsAdminBooleanTrueDataIsMeAdmin = false;
        java.lang.Boolean dataIsMeAdminGetValue = null;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsAdminGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsMeAdminGetValue = false;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        java.lang.String dataSipUri = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsMeAdmin1 = null;
        org.linphone.core.Friend dataContactGetValue = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x39L) != 0) {

                    if (data != null) {
                        // read data.isAdmin
                        dataIsAdmin = data.isAdmin();
                    }
                    updateLiveDataRegistration(0, dataIsAdmin);


                    if (dataIsAdmin != null) {
                        // read data.isAdmin.getValue()
                        dataIsAdminGetValue = dataIsAdmin.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsAdminGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsAdminGetValue);
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsAdminGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0x39L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsAdminGetValue) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }

                if ((dirtyFlags & 0x31L) != 0) {

                        // read androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue()) ? View.VISIBLE : View.GONE
                        dataIsAdminViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsAdminGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }
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
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
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
                        DataIsMeAdmin1 = data.isMeAdmin();
                    }
                    updateLiveDataRegistration(3, DataIsMeAdmin1);


                    if (DataIsMeAdmin1 != null) {
                        // read data.isMeAdmin.getValue()
                        dataIsMeAdminGetValue = DataIsMeAdmin1.getValue();
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

        if ((dirtyFlags & 0x8000L) != 0) {

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
        if ((dirtyFlags & 0x1000L) != 0) {

                if (data != null) {
                    // read data.isMeAdmin
                    DataIsMeAdmin1 = data.isMeAdmin();
                }
                updateLiveDataRegistration(3, DataIsMeAdmin1);


                if (DataIsMeAdmin1 != null) {
                    // read data.isMeAdmin.getValue()
                    dataIsMeAdminGetValue = DataIsMeAdmin1.getValue();
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


                // read !androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue())
                dataIsMeAdmin = !androidxDatabindingViewDataBindingSafeUnboxDataIsMeAdminGetValue;
        }

        if ((dirtyFlags & 0x39L) != 0) {

                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue())
                dataIsAdminBooleanTrueDataIsMeAdmin = ((androidxDatabindingViewDataBindingSafeUnboxDataIsAdminGetValue) ? (true) : (dataIsMeAdmin));
            if((dirtyFlags & 0x39L) != 0) {
                if(dataIsAdminBooleanTrueDataIsMeAdmin) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue()) ? View.GONE : View.VISIBLE
                dataIsAdminBooleanTrueDataIsMeAdminViewGONEViewVISIBLE = ((dataIsAdminBooleanTrueDataIsMeAdmin) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
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

            this.delete.setOnClickListener(mCallback118);
            this.isAdminLayout.setOnClickListener(mCallback119);
            this.isNotAdminLayout.setOnClickListener(mCallback120);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.delete.setVisibility(dataIsMeAdminViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.isAdminLayout.setVisibility(dataIsAdminViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x39L) != 0) {
            // api target 1

            this.isNotAdminLayout.setVisibility(dataIsAdminBooleanTrueDataIsMeAdminViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x36L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.voip.data.ConferenceParticipantData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.removeParticipantFromConference();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.voip.data.ConferenceParticipantData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.setAdmin();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.voip.data.ConferenceParticipantData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.unsetAdmin();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.isAdmin
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.contact
        flag 3 (0x4L): data.isMeAdmin
        flag 4 (0x5L): data
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue()) ? View.VISIBLE : View.INVISIBLE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue()) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue())
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(data.isAdmin.getValue()) ? true : !androidx.databinding.ViewDataBinding.safeUnbox(data.isMeAdmin.getValue())
        flag 14 (0xfL): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 15 (0x10L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
    flag mapping end*/
    //end
}