package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ConferenceSchedulingParticipantCellBindingImpl extends ConferenceSchedulingParticipantCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.avatar, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.ImageView mboundView5;
    @NonNull
    private final android.view.View mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback66;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ConferenceSchedulingParticipantCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ConferenceSchedulingParticipantCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.RelativeLayout) bindings[7]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.ImageView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.view.View) bindings[6];
        this.mboundView6.setTag(null);
        setRootTag(root);
        // listeners
        mCallback66 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
            setData((org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData Data) {
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
        int dataShowBroadcastControlsViewVISIBLEViewGONE = 0;
        boolean dataShowLimeBadge = false;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        int dataShowLimeBadgeViewVISIBLEViewGONE = 0;
        boolean dataShowBroadcastControls = false;
        java.lang.String dataDisplayNameGetValue = null;
        int dataShowDividerViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        java.lang.String dataSipUri = null;
        java.lang.String dataContactName = null;
        org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData data = mData;
        boolean dataShowDivider = false;
        org.linphone.core.Friend dataContactGetValue = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xcL) != 0) {

                    if (data != null) {
                        // read data.showLimeBadge
                        dataShowLimeBadge = data.getShowLimeBadge();
                        // read data.showBroadcastControls
                        dataShowBroadcastControls = data.getShowBroadcastControls();
                        // read data.sipUri
                        dataSipUri = data.getSipUri();
                        // read data.showDivider
                        dataShowDivider = data.getShowDivider();
                    }
                if((dirtyFlags & 0xcL) != 0) {
                    if(dataShowLimeBadge) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }
                if((dirtyFlags & 0xcL) != 0) {
                    if(dataShowBroadcastControls) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }
                if((dirtyFlags & 0xcL) != 0) {
                    if(dataShowDivider) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read data.showLimeBadge ? View.VISIBLE : View.GONE
                    dataShowLimeBadgeViewVISIBLEViewGONE = ((dataShowLimeBadge) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read data.showBroadcastControls ? View.VISIBLE : View.GONE
                    dataShowBroadcastControlsViewVISIBLEViewGONE = ((dataShowBroadcastControls) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read data.showDivider ? View.VISIBLE : View.GONE
                    dataShowDividerViewVISIBLEViewGONE = ((dataShowDivider) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }

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
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x80L) != 0) {

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
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.mboundView1, data);
            this.mboundView2.setVisibility(dataShowLimeBadgeViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataSipUri);
            this.mboundView5.setVisibility(dataShowBroadcastControlsViewVISIBLEViewGONE);
            this.mboundView6.setVisibility(dataShowDividerViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(mCallback66);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.changeIsSpeaker();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.displayName
        flag 1 (0x2L): data.contact
        flag 2 (0x3L): data
        flag 3 (0x4L): null
        flag 4 (0x5L): data.showBroadcastControls ? View.VISIBLE : View.GONE
        flag 5 (0x6L): data.showBroadcastControls ? View.VISIBLE : View.GONE
        flag 6 (0x7L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 7 (0x8L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 8 (0x9L): data.showLimeBadge ? View.VISIBLE : View.GONE
        flag 9 (0xaL): data.showLimeBadge ? View.VISIBLE : View.GONE
        flag 10 (0xbL): data.showDivider ? View.VISIBLE : View.GONE
        flag 11 (0xcL): data.showDivider ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}