package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContactDetailCellBindingImpl extends ContactDetailCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.ImageView mboundView6;
    @NonNull
    private final android.widget.ImageView mboundView7;
    @NonNull
    private final android.widget.RelativeLayout mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback194;
    @Nullable
    private final android.view.View.OnClickListener mCallback192;
    @Nullable
    private final android.view.View.OnClickListener mCallback193;
    @Nullable
    private final android.view.View.OnClickListener mCallback191;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContactDetailCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ContactDetailCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.ImageView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.ImageView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.RelativeLayout) bindings[8];
        this.mboundView8.setTag(null);
        setRootTag(root);
        // listeners
        mCallback194 = new org.linphone.generated.callback.OnClickListener(this, 4);
        mCallback192 = new org.linphone.generated.callback.OnClickListener(this, 2);
        mCallback193 = new org.linphone.generated.callback.OnClickListener(this, 3);
        mCallback191 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
            setData((org.linphone.activities.main.contact.data.ContactNumberOrAddressData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.contact.data.ContactNumberOrAddressData Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        int dataHasPresenceViewVISIBLEViewGONE = 0;
        boolean dataShowSecureChat = false;
        int dataChatAllowedDataShowSecureChatBooleanFalseViewVISIBLEViewGONE = 0;
        java.lang.String dataTypeLabel = null;
        boolean dataChatAllowedDataHidePlainChatBooleanFalse = false;
        int dataShowInviteViewVISIBLEViewGONE = 0;
        java.lang.String dataSipMboundView1AndroidStringSipAddressMboundView1AndroidStringPhoneNumber = null;
        org.linphone.activities.main.contact.data.ContactNumberOrAddressData data = mData;
        boolean dataHidePlainChat = false;
        int dataTypeLabelLengthInt0ViewVISIBLEViewGONE = 0;
        int dataChatAllowedDataHidePlainChatBooleanFalseViewVISIBLEViewGONE = 0;
        boolean dataHasPresence = false;
        boolean dataShowInvite = false;
        boolean DataHidePlainChat1 = false;
        boolean dataAddressJavaLangObjectNull = false;
        boolean dataTypeLabelLengthInt0 = false;
        boolean dataSip = false;
        org.linphone.core.Address dataAddress = null;
        boolean dataChatAllowed = false;
        boolean dataChatAllowedDataShowSecureChatBooleanFalse = false;
        int dataTypeLabelLength = 0;
        java.lang.String dataDisplayedValue = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (data != null) {
                    // read data.typeLabel
                    dataTypeLabel = data.getTypeLabel();
                    // read data.hasPresence
                    dataHasPresence = data.getHasPresence();
                    // read data.showInvite
                    dataShowInvite = data.getShowInvite();
                    // read data.sip
                    dataSip = data.isSip();
                    // read data.address
                    dataAddress = data.getAddress();
                    // read data.chatAllowed
                    dataChatAllowed = data.getChatAllowed();
                    // read data.displayedValue
                    dataDisplayedValue = data.getDisplayedValue();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataHasPresence) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataShowInvite) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataSip) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataChatAllowed) {
                        dirtyFlags |= 0x80L;
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x10000L;
                }
            }


                if (dataTypeLabel != null) {
                    // read data.typeLabel.length()
                    dataTypeLabelLength = dataTypeLabel.length();
                }
                // read data.hasPresence ? View.VISIBLE : View.GONE
                dataHasPresenceViewVISIBLEViewGONE = ((dataHasPresence) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read data.showInvite ? View.VISIBLE : View.GONE
                dataShowInviteViewVISIBLEViewGONE = ((dataShowInvite) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read data.sip ? @android:string/sip_address : @android:string/phone_number
                dataSipMboundView1AndroidStringSipAddressMboundView1AndroidStringPhoneNumber = ((dataSip) ? (mboundView1.getResources().getString(R.string.sip_address)) : (mboundView1.getResources().getString(R.string.phone_number)));
                // read data.address != null
                dataAddressJavaLangObjectNull = (dataAddress) != (null);


                // read data.typeLabel.length() > 0
                dataTypeLabelLengthInt0 = (dataTypeLabelLength) > (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(dataTypeLabelLengthInt0) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read data.typeLabel.length() > 0 ? View.VISIBLE : View.GONE
                dataTypeLabelLengthInt0ViewVISIBLEViewGONE = ((dataTypeLabelLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished

        if ((dirtyFlags & 0x20000L) != 0) {

                if (data != null) {
                    // read data.showSecureChat
                    dataShowSecureChat = data.getShowSecureChat();
                }
        }
        if ((dirtyFlags & 0x80L) != 0) {

                if (data != null) {
                    // read data.hidePlainChat
                    DataHidePlainChat1 = data.getHidePlainChat();
                }


                // read !data.hidePlainChat
                dataHidePlainChat = !DataHidePlainChat1;
        }

        if ((dirtyFlags & 0x3L) != 0) {

                // read data.chatAllowed ? !data.hidePlainChat : false
                dataChatAllowedDataHidePlainChatBooleanFalse = ((dataChatAllowed) ? (dataHidePlainChat) : (false));
                // read data.chatAllowed ? data.showSecureChat : false
                dataChatAllowedDataShowSecureChatBooleanFalse = ((dataChatAllowed) ? (dataShowSecureChat) : (false));
            if((dirtyFlags & 0x3L) != 0) {
                if(dataChatAllowedDataHidePlainChatBooleanFalse) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(dataChatAllowedDataShowSecureChatBooleanFalse) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read data.chatAllowed ? !data.hidePlainChat : false ? View.VISIBLE : View.GONE
                dataChatAllowedDataHidePlainChatBooleanFalseViewVISIBLEViewGONE = ((dataChatAllowedDataHidePlainChatBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read data.chatAllowed ? data.showSecureChat : false ? View.VISIBLE : View.GONE
                dataChatAllowedDataShowSecureChatBooleanFalseViewVISIBLEViewGONE = ((dataChatAllowedDataShowSecureChatBooleanFalse) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataSipMboundView1AndroidStringSipAddressMboundView1AndroidStringPhoneNumber);
            this.mboundView2.setVisibility(dataHasPresenceViewVISIBLEViewGONE);
            this.mboundView3.setVisibility(dataShowInviteViewVISIBLEViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, dataDisplayedValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, dataTypeLabel);
            this.mboundView5.setVisibility(dataTypeLabelLengthInt0ViewVISIBLEViewGONE);
            this.mboundView6.setEnabled(dataAddressJavaLangObjectNull);
            this.mboundView7.setEnabled(dataAddressJavaLangObjectNull);
            this.mboundView7.setVisibility(dataChatAllowedDataHidePlainChatBooleanFalseViewVISIBLEViewGONE);
            this.mboundView8.setEnabled(dataAddressJavaLangObjectNull);
            this.mboundView8.setVisibility(dataChatAllowedDataShowSecureChatBooleanFalseViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(mCallback191);
            this.mboundView6.setOnClickListener(mCallback192);
            this.mboundView7.setOnClickListener(mCallback193);
            this.mboundView8.setOnClickListener(mCallback194);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.contact.data.ContactNumberOrAddressData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {



                    data.startChat(true);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.contact.data.ContactNumberOrAddressData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.startCall();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.contact.data.ContactNumberOrAddressData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {



                    data.startChat(false);
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // data != null
                boolean dataJavaLangObjectNull = false;
                // data
                org.linphone.activities.main.contact.data.ContactNumberOrAddressData data = mData;



                dataJavaLangObjectNull = (data) != (null);
                if (dataJavaLangObjectNull) {


                    data.smsInvite();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data
        flag 1 (0x2L): null
        flag 2 (0x3L): data.hasPresence ? View.VISIBLE : View.GONE
        flag 3 (0x4L): data.hasPresence ? View.VISIBLE : View.GONE
        flag 4 (0x5L): data.chatAllowed ? data.showSecureChat : false ? View.VISIBLE : View.GONE
        flag 5 (0x6L): data.chatAllowed ? data.showSecureChat : false ? View.VISIBLE : View.GONE
        flag 6 (0x7L): data.chatAllowed ? !data.hidePlainChat : false
        flag 7 (0x8L): data.chatAllowed ? !data.hidePlainChat : false
        flag 8 (0x9L): data.showInvite ? View.VISIBLE : View.GONE
        flag 9 (0xaL): data.showInvite ? View.VISIBLE : View.GONE
        flag 10 (0xbL): data.sip ? @android:string/sip_address : @android:string/phone_number
        flag 11 (0xcL): data.sip ? @android:string/sip_address : @android:string/phone_number
        flag 12 (0xdL): data.typeLabel.length() > 0 ? View.VISIBLE : View.GONE
        flag 13 (0xeL): data.typeLabel.length() > 0 ? View.VISIBLE : View.GONE
        flag 14 (0xfL): data.chatAllowed ? !data.hidePlainChat : false ? View.VISIBLE : View.GONE
        flag 15 (0x10L): data.chatAllowed ? !data.hidePlainChat : false ? View.VISIBLE : View.GONE
        flag 16 (0x11L): data.chatAllowed ? data.showSecureChat : false
        flag 17 (0x12L): data.chatAllowed ? data.showSecureChat : false
    flag mapping end*/
    //end
}