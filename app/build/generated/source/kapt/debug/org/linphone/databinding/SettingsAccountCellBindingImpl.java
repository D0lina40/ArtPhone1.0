package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsAccountCellBindingImpl extends SettingsAccountCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SettingsAccountCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SettingsAccountCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageView) bindings[1]
            , (org.linphone.views.MarqueeTextView) bindings[3]
            , (org.linphone.views.MarqueeTextView) bindings[2]
            );
        this.led.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.settingsSubtitle.setTag(null);
        this.settingsTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback57 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
            setData((org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel Data) {
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
                return onChangeDataUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDataIconResource((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 2 :
                return onChangeDataIsDefault((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeDataIdentity((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeDataIconContentDescription((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataUserName(androidx.lifecycle.MutableLiveData<java.lang.String> DataUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIconResource(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataIconResource, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIsDefault(androidx.lifecycle.MutableLiveData<java.lang.Boolean> DataIsDefault, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIdentity(androidx.lifecycle.MutableLiveData<java.lang.String> DataIdentity, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIconContentDescription(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataIconContentDescription, int fieldId) {
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
        int androidxDatabindingViewDataBindingSafeUnboxDataIconResourceGetValue = 0;
        java.lang.String dataDisplayUsernameInsteadOfIdentityDataUserNameDataIdentity = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataUserName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataIconResource = null;
        boolean dataDisplayUsernameInsteadOfIdentity = false;
        int dataIsDefaultViewVISIBLEViewGONE = 0;
        java.lang.String dataUserNameGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataIconContentDescriptionGetValue = 0;
        org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel data = mData;
        java.lang.String dataIdentityGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> dataIsDefault = null;
        java.lang.Boolean dataIsDefaultGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataIdentity = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxDataIsDefaultGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataIconContentDescription = null;
        java.lang.Integer dataIconContentDescriptionGetValue = null;
        java.lang.Integer dataIconResourceGetValue = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x62L) != 0) {

                    if (data != null) {
                        // read data.iconResource
                        dataIconResource = data.getIconResource();
                    }
                    updateLiveDataRegistration(1, dataIconResource);


                    if (dataIconResource != null) {
                        // read data.iconResource.getValue()
                        dataIconResourceGetValue = dataIconResource.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.iconResource.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIconResourceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIconResourceGetValue);
            }
            if ((dirtyFlags & 0x69L) != 0) {

                    if (data != null) {
                        // read data.displayUsernameInsteadOfIdentity
                        dataDisplayUsernameInsteadOfIdentity = data.getDisplayUsernameInsteadOfIdentity();
                    }
                if((dirtyFlags & 0x69L) != 0) {
                    if(dataDisplayUsernameInsteadOfIdentity) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (data != null) {
                        // read data.isDefault()
                        dataIsDefault = data.isDefault();
                    }
                    updateLiveDataRegistration(2, dataIsDefault);


                    if (dataIsDefault != null) {
                        // read data.isDefault().getValue()
                        dataIsDefaultGetValue = dataIsDefault.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isDefault().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIsDefaultGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIsDefaultGetValue);
                if((dirtyFlags & 0x64L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxDataIsDefaultGetValue) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.isDefault().getValue()) ? View.VISIBLE : View.GONE
                    dataIsDefaultViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxDataIsDefaultGetValue) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (data != null) {
                        // read data.iconContentDescription
                        dataIconContentDescription = data.getIconContentDescription();
                    }
                    updateLiveDataRegistration(4, dataIconContentDescription);


                    if (dataIconContentDescription != null) {
                        // read data.iconContentDescription.getValue()
                        dataIconContentDescriptionGetValue = dataIconContentDescription.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.iconContentDescription.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIconContentDescriptionGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIconContentDescriptionGetValue);
            }
        }
        // batch finished

        if ((dirtyFlags & 0x100L) != 0) {

                if (data != null) {
                    // read data.userName
                    dataUserName = data.getUserName();
                }
                updateLiveDataRegistration(0, dataUserName);


                if (dataUserName != null) {
                    // read data.userName.getValue()
                    dataUserNameGetValue = dataUserName.getValue();
                }
        }
        if ((dirtyFlags & 0x80L) != 0) {

                if (data != null) {
                    // read data.identity
                    dataIdentity = data.getIdentity();
                }
                updateLiveDataRegistration(3, dataIdentity);


                if (dataIdentity != null) {
                    // read data.identity.getValue()
                    dataIdentityGetValue = dataIdentity.getValue();
                }
        }

        if ((dirtyFlags & 0x69L) != 0) {

                // read data.displayUsernameInsteadOfIdentity ? data.userName.getValue() : data.identity.getValue()
                dataDisplayUsernameInsteadOfIdentityDataUserNameDataIdentity = ((dataDisplayUsernameInsteadOfIdentity) ? (dataUserNameGetValue) : (dataIdentityGetValue));
        }
        // batch finished
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.led, androidxDatabindingViewDataBindingSafeUnboxDataIconResourceGetValue);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.led, androidxDatabindingViewDataBindingSafeUnboxDataIconContentDescriptionGetValue);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback57);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.settingsSubtitle.setVisibility(dataIsDefaultViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x69L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsTitle, dataDisplayUsernameInsteadOfIdentityDataUserNameDataIdentity);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data.identity
        androidx.lifecycle.MutableLiveData<java.lang.String> dataIdentity = null;
        // data.accountsSettingsListener != null
        boolean dataAccountsSettingsListenerJavaLangObjectNull = false;
        // data.identity != null
        boolean dataIdentityJavaLangObjectNull = false;
        // data
        org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel data = mData;
        // data.identity.getValue()
        java.lang.String dataIdentityGetValue = null;
        // data.accountsSettingsListener
        org.linphone.activities.main.settings.SettingListenerStub dataAccountsSettingsListener = null;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            dataAccountsSettingsListener = data.getAccountsSettingsListener();

            dataAccountsSettingsListenerJavaLangObjectNull = (dataAccountsSettingsListener) != (null);
            if (dataAccountsSettingsListenerJavaLangObjectNull) {




                dataIdentity = data.getIdentity();

                dataIdentityJavaLangObjectNull = (dataIdentity) != (null);
                if (dataIdentityJavaLangObjectNull) {


                    dataIdentityGetValue = dataIdentity.getValue();

                    dataAccountsSettingsListener.onAccountClicked(dataIdentityGetValue);
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.userName
        flag 1 (0x2L): data.iconResource
        flag 2 (0x3L): data.isDefault()
        flag 3 (0x4L): data.identity
        flag 4 (0x5L): data.iconContentDescription
        flag 5 (0x6L): data
        flag 6 (0x7L): null
        flag 7 (0x8L): data.displayUsernameInsteadOfIdentity ? data.userName.getValue() : data.identity.getValue()
        flag 8 (0x9L): data.displayUsernameInsteadOfIdentity ? data.userName.getValue() : data.identity.getValue()
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(data.isDefault().getValue()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(data.isDefault().getValue()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}