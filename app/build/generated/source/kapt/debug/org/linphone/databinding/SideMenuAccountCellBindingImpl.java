package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SideMenuAccountCellBindingImpl extends SideMenuAccountCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback200;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SideMenuAccountCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private SideMenuAccountCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback200 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
                return onChangeDataIdentity((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeDataDisplayName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeDataUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeDataIconResource((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 4 :
                return onChangeDataIconContentDescription((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataIdentity(androidx.lifecycle.MutableLiveData<java.lang.String> DataIdentity, int fieldId) {
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
    private boolean onChangeDataUserName(androidx.lifecycle.MutableLiveData<java.lang.String> DataUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataIconResource(androidx.lifecycle.MutableLiveData<java.lang.Integer> DataIconResource, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.String> dataIdentity = null;
        java.lang.String dataDisplayNameGetValue = null;
        java.lang.String dataDisplayUsernameInsteadOfIdentityDataUserNameDataIdentity = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataDisplayName = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataUserName = null;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataIconResource = null;
        java.lang.String dataDisplayNameJavaLangString = null;
        boolean dataDisplayUsernameInsteadOfIdentity = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> dataIconContentDescription = null;
        java.lang.String dataUserNameGetValue = null;
        java.lang.Integer dataIconContentDescriptionGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxDataIconContentDescriptionGetValue = 0;
        org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel data = mData;
        java.lang.String dataIdentityGetValue = null;
        java.lang.Integer dataIconResourceGetValue = null;
        java.lang.String dataDisplayNameJavaLangStringDataDisplayUsernameInsteadOfIdentityDataUserNameDataIdentity = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x67L) != 0) {

                    if (data != null) {
                        // read data.displayName
                        dataDisplayName = data.getDisplayName();
                        // read data.displayUsernameInsteadOfIdentity
                        dataDisplayUsernameInsteadOfIdentity = data.getDisplayUsernameInsteadOfIdentity();
                    }
                    updateLiveDataRegistration(1, dataDisplayName);
                if((dirtyFlags & 0x67L) != 0) {
                    if(dataDisplayUsernameInsteadOfIdentity) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    if (dataDisplayName != null) {
                        // read data.displayName.getValue()
                        dataDisplayNameGetValue = dataDisplayName.getValue();
                    }


                    // read (data.displayName.getValue()) + (" ")
                    dataDisplayNameJavaLangString = (dataDisplayNameGetValue) + (" ");
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (data != null) {
                        // read data.iconResource
                        dataIconResource = data.getIconResource();
                    }
                    updateLiveDataRegistration(3, dataIconResource);


                    if (dataIconResource != null) {
                        // read data.iconResource.getValue()
                        dataIconResourceGetValue = dataIconResource.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(data.iconResource.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxDataIconResourceGetValue = androidx.databinding.ViewDataBinding.safeUnbox(dataIconResourceGetValue);
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

        if ((dirtyFlags & 0x80L) != 0) {

                if (data != null) {
                    // read data.identity
                    dataIdentity = data.getIdentity();
                }
                updateLiveDataRegistration(0, dataIdentity);


                if (dataIdentity != null) {
                    // read data.identity.getValue()
                    dataIdentityGetValue = dataIdentity.getValue();
                }
        }
        if ((dirtyFlags & 0x100L) != 0) {

                if (data != null) {
                    // read data.userName
                    dataUserName = data.getUserName();
                }
                updateLiveDataRegistration(2, dataUserName);


                if (dataUserName != null) {
                    // read data.userName.getValue()
                    dataUserNameGetValue = dataUserName.getValue();
                }
        }

        if ((dirtyFlags & 0x67L) != 0) {

                // read data.displayUsernameInsteadOfIdentity ? data.userName.getValue() : data.identity.getValue()
                dataDisplayUsernameInsteadOfIdentityDataUserNameDataIdentity = ((dataDisplayUsernameInsteadOfIdentity) ? (dataUserNameGetValue) : (dataIdentityGetValue));


                // read ((data.displayName.getValue()) + (" ")) + (data.displayUsernameInsteadOfIdentity ? data.userName.getValue() : data.identity.getValue())
                dataDisplayNameJavaLangStringDataDisplayUsernameInsteadOfIdentityDataUserNameDataIdentity = (dataDisplayNameJavaLangString) + (dataDisplayUsernameInsteadOfIdentityDataUserNameDataIdentity);
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback200);
        }
        if ((dirtyFlags & 0x67L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, dataDisplayNameJavaLangStringDataDisplayUsernameInsteadOfIdentityDataUserNameDataIdentity);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setSourceImageResource(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxDataIconResourceGetValue);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setContentDescription(this.mboundView2, androidxDatabindingViewDataBindingSafeUnboxDataIconContentDescriptionGetValue);
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
        flag 0 (0x1L): data.identity
        flag 1 (0x2L): data.displayName
        flag 2 (0x3L): data.userName
        flag 3 (0x4L): data.iconResource
        flag 4 (0x5L): data.iconContentDescription
        flag 5 (0x6L): data
        flag 6 (0x7L): null
        flag 7 (0x8L): data.displayUsernameInsteadOfIdentity ? data.userName.getValue() : data.identity.getValue()
        flag 8 (0x9L): data.displayUsernameInsteadOfIdentity ? data.userName.getValue() : data.identity.getValue()
    flag mapping end*/
    //end
}