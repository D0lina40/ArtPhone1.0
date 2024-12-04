package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContactNumberAddressEditorCellBindingImpl extends ContactNumberAddressEditorCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final com.google.android.material.textfield.TextInputLayout mboundView1;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback186;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView2androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of data.newValue.getValue()
            //         is data.newValue.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // data != null
            boolean dataJavaLangObjectNull = false;
            // data.newValue
            androidx.lifecycle.MutableLiveData<java.lang.String> dataNewValue = null;
            // data.newValue != null
            boolean dataNewValueJavaLangObjectNull = false;
            // data
            org.linphone.activities.main.contact.data.NumberOrAddressEditorData data = mData;
            // data.newValue.getValue()
            java.lang.String dataNewValueGetValue = null;



            dataJavaLangObjectNull = (data) != (null);
            if (dataJavaLangObjectNull) {


                dataNewValue = data.getNewValue();

                dataNewValueJavaLangObjectNull = (dataNewValue) != (null);
                if (dataNewValueJavaLangObjectNull) {




                    dataNewValue.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ContactNumberAddressEditorCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ContactNumberAddressEditorCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[3]
            );
        this.delete.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.TextInputLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.TextInputEditText) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback186 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
            setData((org.linphone.activities.main.contact.data.NumberOrAddressEditorData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.contact.data.NumberOrAddressEditorData Data) {
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
                return onChangeDataNewValue((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDataToRemove((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataNewValue(androidx.lifecycle.MutableLiveData<java.lang.String> DataNewValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataToRemove(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataToRemove, int fieldId) {
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
        int dataSipAddressInputTypeTYPETEXTVARIATIONEMAILADDRESSInputTypeTYPECLASSPHONE = 0;
        java.lang.Boolean dataToRemoveGetValue = null;
        java.lang.String dataSipAddressMboundView1AndroidStringSipAddressMboundView1AndroidStringPhoneNumber = null;
        int dataToRemoveViewGONEViewVISIBLE = 0;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataNewValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataToRemoveGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataToRemove = null;
        org.linphone.activities.main.contact.data.NumberOrAddressEditorData data = mData;
        java.lang.String dataNewValueGetValue = null;
        boolean dataSipAddress = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (data != null) {
                        // read data.newValue
                        dataNewValue = data.getNewValue();
                    }
                    updateLiveDataRegistration(0, dataNewValue);


                    if (dataNewValue != null) {
                        // read data.newValue.getValue()
                        dataNewValueGetValue = dataNewValue.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (data != null) {
                        // read data.toRemove
                        dataToRemove = data.getToRemove();
                    }
                    updateLiveDataRegistration(1, dataToRemove);


                    if (dataToRemove != null) {
                        // read data.toRemove.getValue()
                        dataToRemoveGetValue = dataToRemove.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.toRemove.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataToRemoveGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataToRemoveGetValue);
                if((dirtyFlags & 0xeL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataToRemoveGetValue) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.toRemove.getValue()) ? View.GONE : View.VISIBLE
                    dataToRemoveViewGONEViewVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxDataToRemoveGetValue) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (data != null) {
                        // read data.sipAddress
                        dataSipAddress = data.isSipAddress();
                    }
                if((dirtyFlags & 0xcL) != 0) {
                    if(dataSipAddress) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read data.sipAddress ? InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS : InputType.TYPE_CLASS_PHONE
                    dataSipAddressInputTypeTYPETEXTVARIATIONEMAILADDRESSInputTypeTYPECLASSPHONE = ((dataSipAddress) ? (android.text.InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS) : (android.text.InputType.TYPE_CLASS_PHONE));
                    // read data.sipAddress ? @android:string/sip_address : @android:string/phone_number
                    dataSipAddressMboundView1AndroidStringSipAddressMboundView1AndroidStringPhoneNumber = ((dataSipAddress) ? (mboundView1.getResources().getString(R.string.sip_address)) : (mboundView1.getResources().getString(R.string.phone_number)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.delete.setOnClickListener(mCallback186);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTextAttrChanged);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView0.setVisibility(dataToRemoveViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.mboundView1.setHint(dataSipAddressMboundView1AndroidStringSipAddressMboundView1AndroidStringPhoneNumber);
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.mboundView2.setInputType(dataSipAddressInputTypeTYPETEXTVARIATIONEMAILADDRESSInputTypeTYPECLASSPHONE);
            }
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataNewValueGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data
        org.linphone.activities.main.contact.data.NumberOrAddressEditorData data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            data.remove();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.newValue
        flag 1 (0x2L): data.toRemove
        flag 2 (0x3L): data
        flag 3 (0x4L): null
        flag 4 (0x5L): data.sipAddress ? InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS : InputType.TYPE_CLASS_PHONE
        flag 5 (0x6L): data.sipAddress ? InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS : InputType.TYPE_CLASS_PHONE
        flag 6 (0x7L): data.sipAddress ? @android:string/sip_address : @android:string/phone_number
        flag 7 (0x8L): data.sipAddress ? @android:string/sip_address : @android:string/phone_number
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(data.toRemove.getValue()) ? View.GONE : View.VISIBLE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(data.toRemove.getValue()) ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}