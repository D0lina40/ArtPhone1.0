package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsLdapCellBindingImpl extends SettingsLdapCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback67;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SettingsLdapCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private SettingsLdapCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (org.linphone.views.MarqueeTextView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.settingsTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback67 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setData((org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setData(@Nullable org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel Data) {
        this.mData = Data;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.data);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataLdapServer((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataLdapServer(androidx.lifecycle.MutableLiveData<java.lang.String> DataLdapServer, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.lang.String dataLdapServerGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> dataLdapServer = null;
        org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel data = mData;

        if ((dirtyFlags & 0x7L) != 0) {



                if (data != null) {
                    // read data.ldapServer
                    dataLdapServer = data.getLdapServer();
                }
                updateLiveDataRegistration(0, dataLdapServer);


                if (dataLdapServer != null) {
                    // read data.ldapServer.getValue()
                    dataLdapServerGetValue = dataLdapServer.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback67);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsTitle, dataLdapServerGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // data.ldapSettingsListener
        org.linphone.activities.main.settings.SettingListenerStub dataLdapSettingsListener = null;
        // data != null
        boolean dataJavaLangObjectNull = false;
        // data.index
        java.lang.String dataIndex = null;
        // data.ldapSettingsListener != null
        boolean dataLdapSettingsListenerJavaLangObjectNull = false;
        // data
        org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel data = mData;



        dataJavaLangObjectNull = (data) != (null);
        if (dataJavaLangObjectNull) {


            dataLdapSettingsListener = data.getLdapSettingsListener();

            dataLdapSettingsListenerJavaLangObjectNull = (dataLdapSettingsListener) != (null);
            if (dataLdapSettingsListenerJavaLangObjectNull) {




                dataIndex = data.getIndex();

                dataLdapSettingsListener.onAccountClicked(dataIndex);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): data.ldapServer
        flag 1 (0x2L): data
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}