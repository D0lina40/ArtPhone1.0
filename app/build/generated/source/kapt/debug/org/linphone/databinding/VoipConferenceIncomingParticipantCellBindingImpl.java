package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipConferenceIncomingParticipantCellBindingImpl extends VoipConferenceIncomingParticipantCellBinding  {

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
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView1;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipConferenceIncomingParticipantCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private VoipConferenceIncomingParticipantCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (org.linphone.views.MarqueeTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (org.linphone.views.MarqueeTextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setData((org.linphone.activities.voip.data.ConferenceInfoParticipantData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.voip.data.ConferenceInfoParticipantData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
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
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        java.lang.String dataSipUri = null;
        java.lang.String dataDisplayNameGetValue = null;
        java.lang.String dataContactName = null;
        org.linphone.activities.voip.data.ConferenceInfoParticipantData data = mData;
        org.linphone.core.Friend dataContactGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (data != null) {
                    // read data.contact
                    dataContact = data.getContact();
                }
                updateLiveDataRegistration(1, dataContact);


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
            if((dirtyFlags & 0xfL) != 0) {
                if(dataContactNameJavaLangObjectNull) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (data != null) {
                        // read data.sipUri
                        dataSipUri = data.getSipUri();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x20L) != 0) {

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

        if ((dirtyFlags & 0xfL) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataSipUri);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.displayName
        flag 1 (0x2L): data.contact
        flag 2 (0x3L): data
        flag 3 (0x4L): null
        flag 4 (0x5L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 5 (0x6L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
    flag mapping end*/
    //end
}