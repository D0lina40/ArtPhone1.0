package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class VoipCallsCellBindingImpl extends VoipCallsCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.LinearLayout mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback202;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public VoipCallsCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private VoipCallsCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.ImageView) bindings[12]
            );
        this.contextMenu.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.LinearLayout) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback202 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
            setData((org.linphone.activities.voip.data.CallData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.voip.data.CallData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataDisplayableAddress((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataRemoteConferenceSubject((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
            case 4 :
                return onChangeDataIsPaused((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeDataIsInRemoteConference((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataDisplayableAddress(androidx.lifecycle.MutableLiveData<java.lang.String> DataDisplayableAddress, int fieldId) {
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
    private boolean onChangeDataRemoteConferenceSubject(androidx.lifecycle.MutableLiveData<java.lang.String> DataRemoteConferenceSubject, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataContact(androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> DataContact, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsPaused(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsPaused, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsInRemoteConference(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsInRemoteConference, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayableAddress = null;
        int dataIsPausedMboundView1AndroidColorVoipCallsListInactiveBackgroundMboundView1AndroidColorVoipDarkGray = 0;
        int dataIsInRemoteConferenceViewGONEViewVISIBLE = 0;
        int dataIsPausedViewVISIBLEViewGONE = 0;
        java.lang.String dataDisplayNameGetValue = null;
        java.lang.Boolean dataIsPausedGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsPausedGetValue = false;
        int dataIsPausedViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataRemoteConferenceSubject = null;
        java.lang.String dataContactName = null;
        org.linphone.activities.voip.data.CallData data = mData;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsInRemoteConferenceGetValue = false;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        java.lang.String dataDisplayableAddressGetValue = null;
        int dataIsInRemoteConferenceViewVISIBLEViewGONE = 0;
        java.lang.Boolean dataIsInRemoteConferenceGetValue = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        java.lang.String dataRemoteConferenceSubjectGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsPaused = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsInRemoteConference = null;
        org.linphone.core.Friend dataContactGetValue = null;

        if ((dirtyFlags & 0xffL) != 0) {


            if ((dirtyFlags & 0xc1L) != 0) {

                    if (data != null) {
                        // read data.displayableAddress
                        dataDisplayableAddress = data.getDisplayableAddress();
                    }
                    updateLiveDataRegistration(0, dataDisplayableAddress);


                    if (dataDisplayableAddress != null) {
                        // read data.displayableAddress.getValue()
                        dataDisplayableAddressGetValue = dataDisplayableAddress.getValue();
                    }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (data != null) {
                        // read data.remoteConferenceSubject
                        dataRemoteConferenceSubject = data.getRemoteConferenceSubject();
                    }
                    updateLiveDataRegistration(2, dataRemoteConferenceSubject);


                    if (dataRemoteConferenceSubject != null) {
                        // read data.remoteConferenceSubject.getValue()
                        dataRemoteConferenceSubjectGetValue = dataRemoteConferenceSubject.getValue();
                    }
            }
            if ((dirtyFlags & 0xcaL) != 0) {

                    if (data != null) {
                        // read data.contact
                        dataContact = data.getContact();
                    }
                    updateLiveDataRegistration(3, dataContact);


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
                if((dirtyFlags & 0xcaL) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }
            }
            if ((dirtyFlags & 0xd0L) != 0) {

                    if (data != null) {
                        // read data.isPaused
                        dataIsPaused = data.isPaused();
                    }
                    updateLiveDataRegistration(4, dataIsPaused);


                    if (dataIsPaused != null) {
                        // read data.isPaused.getValue()
                        dataIsPausedGetValue = dataIsPaused.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsPausedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsPausedGetValue);
                if((dirtyFlags & 0xd0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsPausedGetValue) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue()) ? @android:color/voip_calls_list_inactive_background : @android:color/voip_dark_gray
                    dataIsPausedMboundView1AndroidColorVoipCallsListInactiveBackgroundMboundView1AndroidColorVoipDarkGray = ((androidxDatabindingViewDataBindingSafeUnboxDataIsPausedGetValue) ? (getColorFromResource(mboundView1, R.color.voip_calls_list_inactive_background)) : (getColorFromResource(mboundView1, R.color.voip_dark_gray)));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue()) ? View.VISIBLE : View.GONE
                    dataIsPausedViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsPausedGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue()) ? View.GONE : View.VISIBLE
                    dataIsPausedViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsPausedGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xe0L) != 0) {

                    if (data != null) {
                        // read data.isInRemoteConference
                        dataIsInRemoteConference = data.isInRemoteConference();
                    }
                    updateLiveDataRegistration(5, dataIsInRemoteConference);


                    if (dataIsInRemoteConference != null) {
                        // read data.isInRemoteConference.getValue()
                        dataIsInRemoteConferenceGetValue = dataIsInRemoteConference.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInRemoteConference.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsInRemoteConferenceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsInRemoteConferenceGetValue);
                if((dirtyFlags & 0xe0L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsInRemoteConferenceGetValue) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInRemoteConference.getValue()) ? View.GONE : View.VISIBLE
                    dataIsInRemoteConferenceViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsInRemoteConferenceGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isInRemoteConference.getValue()) ? View.VISIBLE : View.GONE
                    dataIsInRemoteConferenceViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsInRemoteConferenceGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
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

        if ((dirtyFlags & 0xcaL) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        // batch finished
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.contextMenu.setOnClickListener(mCallback202);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.mboundView1, androidx.databinding.adapters.Converters.convertColorToDrawable(dataIsPausedMboundView1AndroidColorVoipCallsListInactiveBackgroundMboundView1AndroidColorVoipDarkGray));
            this.mboundView4.setVisibility(dataIsPausedViewGONEViewVISIBLE);
            this.mboundView8.setVisibility(dataIsPausedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xe0L) != 0) {
            // api target 1

            this.mboundView10.setVisibility(dataIsInRemoteConferenceViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(dataIsInRemoteConferenceViewGONEViewVISIBLE);
            this.mboundView3.setVisibility(dataIsInRemoteConferenceViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(dataIsInRemoteConferenceViewGONEViewVISIBLE);
            this.mboundView6.setVisibility(dataIsInRemoteConferenceViewVISIBLEViewGONE);
            this.mboundView9.setVisibility(dataIsInRemoteConferenceViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, dataRemoteConferenceSubjectGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, dataRemoteConferenceSubjectGetValue);
        }
        if ((dirtyFlags & 0xc1L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, dataDisplayableAddressGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, dataDisplayableAddressGetValue);
        }
        if ((dirtyFlags & 0xc0L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.mboundView2, data);
        }
        if ((dirtyFlags & 0xcaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.voip.data.CallData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {



            data.showContextMenu(contextMenu);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.displayableAddress
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.remoteConferenceSubject
        flag 3 (0x4L): data.contact
        flag 4 (0x5L): data.isPaused
        flag 5 (0x6L): data.isInRemoteConference
        flag 6 (0x7L): data
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue()) ? @android:color/voip_calls_list_inactive_background : @android:color/voip_dark_gray
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue()) ? @android:color/voip_calls_list_inactive_background : @android:color/voip_dark_gray
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInRemoteConference.getValue()) ? View.GONE : View.VISIBLE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(data.isInRemoteConference.getValue()) ? View.GONE : View.VISIBLE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue()) ? View.VISIBLE : View.GONE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue()) ? View.GONE : View.VISIBLE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(data.isPaused.getValue()) ? View.GONE : View.VISIBLE
        flag 16 (0x11L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 17 (0x12L): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInRemoteConference.getValue()) ? View.VISIBLE : View.GONE
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(data.isInRemoteConference.getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}