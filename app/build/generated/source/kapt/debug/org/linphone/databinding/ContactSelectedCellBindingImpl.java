package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContactSelectedCellBindingImpl extends ContactSelectedCellBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContactSelectedCellBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ContactSelectedCellBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
        if (BR.parent == variableId) {
            setParent((org.linphone.contact.ContactsSelectionViewModel) variable);
        }
        else if (BR.data == variableId) {
            setData((org.linphone.core.Address) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setParent(@Nullable org.linphone.contact.ContactsSelectionViewModel Parent) {
        this.mParent = Parent;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.parent);
        super.requestRebind();
    }
    public void setData(@Nullable org.linphone.core.Address Data) {
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
        java.lang.String dataDisplayName = null;
        java.lang.String dataUsername = null;
        java.lang.String dataDisplayNameJavaLangObjectNullDataUsernameDataDisplayName = null;
        org.linphone.contact.ContactsSelectionViewModel parent = mParent;
        org.linphone.core.Address data = mData;
        boolean dataDisplayNameJavaLangObjectNull = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (data != null) {
                    // read data.displayName
                    dataDisplayName = data.getDisplayName();
                }


                // read data.displayName == null
                dataDisplayNameJavaLangObjectNull = (dataDisplayName) == (null);
            if((dirtyFlags & 0x6L) != 0) {
                if(dataDisplayNameJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x10L) != 0) {

                if (data != null) {
                    // read data.username
                    dataUsername = data.getUsername();
                }
        }

        if ((dirtyFlags & 0x6L) != 0) {

                // read data.displayName == null ? data.username : data.displayName
                dataDisplayNameJavaLangObjectNullDataUsernameDataDisplayName = ((dataDisplayNameJavaLangObjectNull) ? (dataUsername) : (dataDisplayName));
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView1.setOnClickListener(mCallback4);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, dataDisplayNameJavaLangObjectNullDataUsernameDataDisplayName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // parent != null
        boolean parentJavaLangObjectNull = false;
        // parent
        org.linphone.contact.ContactsSelectionViewModel parent = mParent;
        // data
        org.linphone.core.Address data = mData;



        parentJavaLangObjectNull = (parent) != (null);
        if (parentJavaLangObjectNull) {



            parent.toggleSelectionForAddress(data);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): parent
        flag 1 (0x2L): data
        flag 2 (0x3L): null
        flag 3 (0x4L): data.displayName == null ? data.username : data.displayName
        flag 4 (0x5L): data.displayName == null ? data.username : data.displayName
    flag mapping end*/
    //end
}