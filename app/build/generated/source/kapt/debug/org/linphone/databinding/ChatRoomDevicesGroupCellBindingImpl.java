package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ChatRoomDevicesGroupCellBindingImpl extends ChatRoomDevicesGroupCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.avatar, 10);
        sViewsWithIds.put(R.id.right, 11);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final android.widget.ImageView mboundView4;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView5;
    @NonNull
    private final org.linphone.views.MarqueeTextView mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback127;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ChatRoomDevicesGroupCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ChatRoomDevicesGroupCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[11]
            );
        this.avatarIcon.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.ImageView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (org.linphone.views.MarqueeTextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (org.linphone.views.MarqueeTextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback127 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setData((org.linphone.activities.main.chat.data.DevicesListGroupData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.chat.data.DevicesListGroupData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataIsExpanded((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataPresenceStatus((androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence>) object, fieldId);
            case 3 :
                return onChangeDataDevices((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListChildData>>) object, fieldId);
            case 4 :
                return onChangeDataContact((androidx.lifecycle.MutableLiveData<org.linphone.core.Friend>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataIsExpanded(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsExpanded, int fieldId) {
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
    private boolean onChangeDataDevices(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListChildData>> DataDevices, int fieldId) {
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
        boolean dataDevicesSizeInt1 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsExpanded = null;
        java.lang.String dataDisplayNameGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        androidx.lifecycle.MutableLiveData<org.linphone.core.ConsolidatedPresence> dataPresenceStatus = null;
        int dataSecurityLevelContentDescription = 0;
        int dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE = 0;
        java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListChildData> dataDevicesGetValue = null;
        org.linphone.core.ConsolidatedPresence dataPresenceStatusGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsExpandedGetValue = false;
        int dataDevicesSize = 0;
        int dataSecurityLevelIcon = 0;
        java.lang.String dataContactName = null;
        android.graphics.drawable.Drawable dataIsExpandedMboundView7AndroidDrawableChevronListOpenMboundView7AndroidDrawableChevronListClose = null;
        org.linphone.activities.main.chat.data.DevicesListGroupData data = mData;
        boolean DataDevicesSizeInt11 = false;
        boolean dataContactNameJavaLangObjectNull = false;
        java.lang.String dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = null;
        int dataDevicesSizeInt1ViewGONEViewVISIBLE = 0;
        int dataDevicesSizeInt1DataIsExpandedBooleanFalseViewVISIBLEViewGONE = 0;
        boolean dataPresenceStatusConsolidatedPresenceOffline = false;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListChildData>> dataDevices = null;
        boolean dataDevicesSizeInt1DataIsExpandedBooleanFalse = false;
        int dataDevicesSizeInt1ViewVISIBLEViewGONE = 0;
        androidx.lifecycle.MutableLiveData<org.linphone.core.Friend> dataContact = null;
        java.lang.String dataSipUri = null;
        java.lang.Boolean dataIsExpandedGetValue = null;
        org.linphone.core.Friend dataContactGetValue = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (data != null) {
                        // read data.isExpanded
                        dataIsExpanded = data.isExpanded();
                    }
                    updateLiveDataRegistration(0, dataIsExpanded);


                    if (dataIsExpanded != null) {
                        // read data.isExpanded.getValue()
                        dataIsExpandedGetValue = dataIsExpanded.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsExpandedGetValue);
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsExpandedGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue()) ? @android:drawable/chevron_list_open : @android:drawable/chevron_list_close
                    dataIsExpandedMboundView7AndroidDrawableChevronListOpenMboundView7AndroidDrawableChevronListClose = ((androidxDatabindingViewDataBindingSafeUnboxDataIsExpandedGetValue) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.chevron_list_open)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(mboundView7.getContext(), R.drawable.chevron_list_close)));
            }
            if ((dirtyFlags & 0x64L) != 0) {

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
                if((dirtyFlags & 0x64L) != 0) {
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
            if ((dirtyFlags & 0x60L) != 0) {

                    if (data != null) {
                        // read data.securityLevelContentDescription
                        dataSecurityLevelContentDescription = data.getSecurityLevelContentDescription();
                        // read data.securityLevelIcon
                        dataSecurityLevelIcon = data.getSecurityLevelIcon();
                        // read data.sipUri
                        dataSipUri = data.getSipUri();
                    }
            }
            if ((dirtyFlags & 0x69L) != 0) {

                    if (data != null) {
                        // read data.devices
                        dataDevices = data.getDevices();
                    }
                    updateLiveDataRegistration(3, dataDevices);


                    if (dataDevices != null) {
                        // read data.devices.getValue()
                        dataDevicesGetValue = dataDevices.getValue();
                    }


                    if (dataDevicesGetValue != null) {
                        // read data.devices.getValue().size()
                        dataDevicesSize = dataDevicesGetValue.size();
                    }

                if ((dirtyFlags & 0x68L) != 0) {

                        // read data.devices.getValue().size() == 1
                        dataDevicesSizeInt1 = (dataDevicesSize) == (1);
                    if((dirtyFlags & 0x68L) != 0) {
                        if(dataDevicesSizeInt1) {
                                dirtyFlags |= 0x4000L;
                                dirtyFlags |= 0x100000L;
                        }
                        else {
                                dirtyFlags |= 0x2000L;
                                dirtyFlags |= 0x80000L;
                        }
                    }


                        // read data.devices.getValue().size() == 1 ? View.GONE : View.VISIBLE
                        dataDevicesSizeInt1ViewGONEViewVISIBLE = ((dataDevicesSizeInt1) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                        // read data.devices.getValue().size() == 1 ? View.VISIBLE : View.GONE
                        dataDevicesSizeInt1ViewVISIBLEViewGONE = ((dataDevicesSizeInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                }

                    // read data.devices.getValue().size() > 1
                    DataDevicesSizeInt11 = (dataDevicesSize) > (1);
                if((dirtyFlags & 0x69L) != 0) {
                    if(DataDevicesSizeInt11) {
                            dirtyFlags |= 0x40000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                    }
                }
                if ((dirtyFlags & 0x68L) != 0) {
                }
            }
            if ((dirtyFlags & 0x72L) != 0) {

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
                if((dirtyFlags & 0x72L) != 0) {
                    if(dataContactNameJavaLangObjectNull) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x40000L) != 0) {

                if (data != null) {
                    // read data.isExpanded
                    dataIsExpanded = data.isExpanded();
                }
                updateLiveDataRegistration(0, dataIsExpanded);


                if (dataIsExpanded != null) {
                    // read data.isExpanded.getValue()
                    dataIsExpandedGetValue = dataIsExpanded.getValue();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue())
                androidxDatabindingViewDataBindingSafeUnboxDataIsExpandedGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsExpandedGetValue);
            if((dirtyFlags & 0x61L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxDataIsExpandedGetValue) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
        }
        if ((dirtyFlags & 0x1000L) != 0) {

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

        if ((dirtyFlags & 0x72L) != 0) {

                // read data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
                dataContactNameJavaLangObjectNullDataDisplayNameDataContactName = ((dataContactNameJavaLangObjectNull) ? (dataDisplayNameGetValue) : (dataContactName));
        }
        if ((dirtyFlags & 0x69L) != 0) {

                // read data.devices.getValue().size() > 1 ? androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue()) : false
                dataDevicesSizeInt1DataIsExpandedBooleanFalse = ((DataDevicesSizeInt11) ? (androidxDatabindingViewDataBindingSafeUnboxDataIsExpandedGetValue) : (false));
            if((dirtyFlags & 0x69L) != 0) {
                if(dataDevicesSizeInt1DataIsExpandedBooleanFalse) {
                        dirtyFlags |= 0x10000L;
                }
                else {
                        dirtyFlags |= 0x8000L;
                }
            }


                // read data.devices.getValue().size() > 1 ? androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue()) : false ? View.VISIBLE : View.GONE
                dataDevicesSizeInt1DataIsExpandedBooleanFalseViewVISIBLEViewGONE = ((dataDevicesSizeInt1DataIsExpandedBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadContactPictureWithCoil(this.avatarIcon, data);
            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView4, dataSecurityLevelContentDescription);
            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView4, dataSecurityLevelIcon);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, dataSipUri);
            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView8, dataSecurityLevelIcon);
            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView8, dataSecurityLevelContentDescription);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback127);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setPresenceIcon(this.mboundView3, dataPresenceStatusGetValue);
            this.mboundView3.setVisibility(dataPresenceStatusConsolidatedPresenceOfflineViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x72L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataContactNameJavaLangObjectNullDataDisplayNameDataContactName);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(dataDevicesSizeInt1ViewGONEViewVISIBLE);
            this.mboundView8.setVisibility(dataDevicesSizeInt1ViewVISIBLEViewGONE);
            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView9, dataDevicesGetValue, R.layout.chat_room_devices_child_cell);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.mboundView7, dataIsExpandedMboundView7AndroidDrawableChevronListOpenMboundView7AndroidDrawableChevronListClose);
        }
        if ((dirtyFlags & 0x69L) != 0) {
            // api target 1

            this.mboundView9.setVisibility(dataDevicesSizeInt1DataIsExpandedBooleanFalseViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data.devices != null
        boolean dataDevicesJavaLangObjectNull = false;
        // data.devices.getValue().size() == 1
        boolean dataDevicesSizeInt1 = false;
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data.devices
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListChildData>> dataDevices = null;
        // data.devices.getValue()
        java.util.ArrayList<org.linphone.activities.main.chat.data.DevicesListChildData> dataDevicesGetValue = null;
        // data.devices.getValue().size()
        int dataDevicesSize = 0;
        // data
        org.linphone.activities.main.chat.data.DevicesListGroupData data = mData;
        // data.devices.getValue() != null
        boolean dataDevicesGetValueJavaLangObjectNull = false;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            dataDevices = data.getDevices();

            dataDevicesJavaLangObjectNull = (dataDevices) != (null);
            if (dataDevicesJavaLangObjectNull) {


                dataDevicesGetValue = dataDevices.getValue();

                dataDevicesGetValueJavaLangObjectNull = (dataDevicesGetValue) != (null);
                if (dataDevicesGetValueJavaLangObjectNull) {


                    dataDevicesSize = dataDevicesGetValue.size();


                    dataDevicesSizeInt1 = (dataDevicesSize) == (1);
                    if (dataDevicesSizeInt1) {




                        data.onClick();
                    }
                    else {




                        data.toggleExpanded();
                    }
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.isExpanded
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.presenceStatus
        flag 3 (0x4L): data.devices
        flag 4 (0x5L): data.contact
        flag 5 (0x6L): data
        flag 6 (0x7L): null
        flag 7 (0x8L): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 8 (0x9L): data.presenceStatus.getValue() == ConsolidatedPresence.Offline ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue()) ? @android:drawable/chevron_list_open : @android:drawable/chevron_list_close
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue()) ? @android:drawable/chevron_list_open : @android:drawable/chevron_list_close
        flag 11 (0xcL): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 12 (0xdL): data.contact.getValue().name == null ? data.displayName.getValue() : data.contact.getValue().name
        flag 13 (0xeL): data.devices.getValue().size() == 1 ? View.GONE : View.VISIBLE
        flag 14 (0xfL): data.devices.getValue().size() == 1 ? View.GONE : View.VISIBLE
        flag 15 (0x10L): data.devices.getValue().size() > 1 ? androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue()) : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): data.devices.getValue().size() > 1 ? androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue()) : false ? View.VISIBLE : View.GONE
        flag 17 (0x12L): data.devices.getValue().size() > 1 ? androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue()) : false
        flag 18 (0x13L): data.devices.getValue().size() > 1 ? androidx.databinding.ViewDataBinding.safeUnbox(data.isExpanded.getValue()) : false
        flag 19 (0x14L): data.devices.getValue().size() == 1 ? View.VISIBLE : View.GONE
        flag 20 (0x15L): data.devices.getValue().size() == 1 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}