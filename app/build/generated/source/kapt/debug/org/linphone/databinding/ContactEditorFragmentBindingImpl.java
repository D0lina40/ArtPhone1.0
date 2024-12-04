package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ContactEditorFragmentBindingImpl extends ContactEditorFragmentBinding implements org.linphone.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 12);
        sViewsWithIds.put(R.id.back, 13);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView10;
    @NonNull
    private final android.widget.LinearLayout mboundView11;
    @NonNull
    private final android.widget.ImageView mboundView3;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView4;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView5;
    @NonNull
    private final com.google.android.material.textfield.TextInputLayout mboundView6;
    @NonNull
    private final com.google.android.material.textfield.TextInputEditText mboundView7;
    @NonNull
    private final android.widget.ImageView mboundView8;
    @NonNull
    private final android.widget.LinearLayout mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView4androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.lastName.getValue()
            //         is viewModel.lastName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView4);
            // localize variables for thread safety
            // viewModel.lastName.getValue()
            java.lang.String viewModelLastNameGetValue = null;
            // viewModel.lastName != null
            boolean viewModelLastNameJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.contact.data.ContactEditorData viewModel = mViewModel;
            // viewModel.lastName
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLastName = null;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelLastName = viewModel.getLastName();

                viewModelLastNameJavaLangObjectNull = (viewModelLastName) != (null);
                if (viewModelLastNameJavaLangObjectNull) {




                    viewModelLastName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView5androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.firstName.getValue()
            //         is viewModel.firstName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView5);
            // localize variables for thread safety
            // viewModel.firstName
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFirstName = null;
            // viewModel.firstName != null
            boolean viewModelFirstNameJavaLangObjectNull = false;
            // viewModel.firstName.getValue()
            java.lang.String viewModelFirstNameGetValue = null;
            // viewModel
            org.linphone.activities.main.contact.data.ContactEditorData viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelFirstName = viewModel.getFirstName();

                viewModelFirstNameJavaLangObjectNull = (viewModelFirstName) != (null);
                if (viewModelFirstNameJavaLangObjectNull) {




                    viewModelFirstName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener mboundView7androidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.organization.getValue()
            //         is viewModel.organization.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView7);
            // localize variables for thread safety
            // viewModel.organization
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelOrganization = null;
            // viewModel.organization != null
            boolean viewModelOrganizationJavaLangObjectNull = false;
            // viewModel
            org.linphone.activities.main.contact.data.ContactEditorData viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.organization.getValue()
            java.lang.String viewModelOrganizationGetValue = null;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelOrganization = viewModel.getOrganization();

                viewModelOrganizationJavaLangObjectNull = (viewModelOrganization) != (null);
                if (viewModelOrganizationJavaLangObjectNull) {




                    viewModelOrganization.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ContactEditorFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ContactEditorFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.LinearLayout) bindings[12]
            );
        this.avatar.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.ImageView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.LinearLayout) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (com.google.android.material.textfield.TextInputEditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (com.google.android.material.textfield.TextInputEditText) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (com.google.android.material.textfield.TextInputLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (com.google.android.material.textfield.TextInputEditText) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.ImageView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.LinearLayout) bindings[9];
        this.mboundView9.setTag(null);
        this.ok.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback31 = new org.linphone.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
        if (BR.avatarClickListener == variableId) {
            setAvatarClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.saveChangesClickListener == variableId) {
            setSaveChangesClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.contact.data.ContactEditorData) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAvatarClickListener(@Nullable android.view.View.OnClickListener AvatarClickListener) {
        this.mAvatarClickListener = AvatarClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.avatarClickListener);
        super.requestRebind();
    }
    public void setSaveChangesClickListener(@Nullable android.view.View.OnClickListener SaveChangesClickListener) {
        this.mSaveChangesClickListener = SaveChangesClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.saveChangesClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.contact.data.ContactEditorData ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelAddresses((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.NumberOrAddressEditorData>>) object, fieldId);
            case 1 :
                return onChangeViewModelLastName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelFirstName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelTempPicturePath((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelOrganization((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelNumbers((androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.NumberOrAddressEditorData>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAddresses(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.NumberOrAddressEditorData>> ViewModelAddresses, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLastName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelLastName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelFirstName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelFirstName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTempPicturePath(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelTempPicturePath, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelOrganization(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelOrganization, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelNumbers(androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.NumberOrAddressEditorData>> ViewModelNumbers, int fieldId) {
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
        java.util.ArrayList<org.linphone.activities.main.contact.data.NumberOrAddressEditorData> viewModelNumbersGetValue = null;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.NumberOrAddressEditorData>> viewModelAddresses = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelLastName = null;
        boolean viewModelLastNameEmpty = false;
        boolean viewModelFirstNameEmpty = false;
        java.lang.String viewModelOrganizationGetValue = null;
        boolean viewModelDisplayOrganization = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelFirstName = null;
        boolean viewModelFirstNameEmptyBooleanTrueViewModelLastNameEmpty = false;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelTempPicturePath = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelOrganization = null;
        java.lang.String viewModelTempPicturePathGetValue = null;
        java.lang.String viewModelLastNameGetValue = null;
        int viewModelDisplayOrganizationViewVISIBLEViewGONE = 0;
        boolean ViewModelLastNameEmpty1 = false;
        java.util.ArrayList<org.linphone.activities.main.contact.data.NumberOrAddressEditorData> viewModelAddressesGetValue = null;
        boolean ViewModelFirstNameEmpty1 = false;
        android.view.View.OnClickListener avatarClickListener = mAvatarClickListener;
        android.view.View.OnClickListener saveChangesClickListener = mSaveChangesClickListener;
        androidx.lifecycle.MutableLiveData<java.util.ArrayList<org.linphone.activities.main.contact.data.NumberOrAddressEditorData>> viewModelNumbers = null;
        java.lang.String viewModelFirstNameGetValue = null;
        org.linphone.activities.main.contact.data.ContactEditorData viewModel = mViewModel;

        if ((dirtyFlags & 0x240L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {
        }
        if ((dirtyFlags & 0x33fL) != 0) {


            if ((dirtyFlags & 0x301L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.addresses
                        viewModelAddresses = viewModel.getAddresses();
                    }
                    updateLiveDataRegistration(0, viewModelAddresses);


                    if (viewModelAddresses != null) {
                        // read viewModel.addresses.getValue()
                        viewModelAddressesGetValue = viewModelAddresses.getValue();
                    }
            }
            if ((dirtyFlags & 0x302L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.lastName
                        viewModelLastName = viewModel.getLastName();
                    }
                    updateLiveDataRegistration(1, viewModelLastName);


                    if (viewModelLastName != null) {
                        // read viewModel.lastName.getValue()
                        viewModelLastNameGetValue = viewModelLastName.getValue();
                    }
            }
            if ((dirtyFlags & 0x300L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.displayOrganization
                        viewModelDisplayOrganization = viewModel.getDisplayOrganization();
                    }
                if((dirtyFlags & 0x300L) != 0) {
                    if(viewModelDisplayOrganization) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read viewModel.displayOrganization ? View.VISIBLE : View.GONE
                    viewModelDisplayOrganizationViewVISIBLEViewGONE = ((viewModelDisplayOrganization) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x306L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.firstName
                        viewModelFirstName = viewModel.getFirstName();
                    }
                    updateLiveDataRegistration(2, viewModelFirstName);


                    if (viewModelFirstName != null) {
                        // read viewModel.firstName.getValue()
                        viewModelFirstNameGetValue = viewModelFirstName.getValue();
                    }


                    if (viewModelFirstNameGetValue != null) {
                        // read viewModel.firstName.getValue().empty
                        ViewModelFirstNameEmpty1 = viewModelFirstNameGetValue.isEmpty();
                    }


                    // read !viewModel.firstName.getValue().empty
                    viewModelFirstNameEmpty = !ViewModelFirstNameEmpty1;
                if((dirtyFlags & 0x306L) != 0) {
                    if(viewModelFirstNameEmpty) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }
            }
            if ((dirtyFlags & 0x308L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.tempPicturePath
                        viewModelTempPicturePath = viewModel.getTempPicturePath();
                    }
                    updateLiveDataRegistration(3, viewModelTempPicturePath);


                    if (viewModelTempPicturePath != null) {
                        // read viewModel.tempPicturePath.getValue()
                        viewModelTempPicturePathGetValue = viewModelTempPicturePath.getValue();
                    }
            }
            if ((dirtyFlags & 0x310L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.organization
                        viewModelOrganization = viewModel.getOrganization();
                    }
                    updateLiveDataRegistration(4, viewModelOrganization);


                    if (viewModelOrganization != null) {
                        // read viewModel.organization.getValue()
                        viewModelOrganizationGetValue = viewModelOrganization.getValue();
                    }
            }
            if ((dirtyFlags & 0x320L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.numbers
                        viewModelNumbers = viewModel.getNumbers();
                    }
                    updateLiveDataRegistration(5, viewModelNumbers);


                    if (viewModelNumbers != null) {
                        // read viewModel.numbers.getValue()
                        viewModelNumbersGetValue = viewModelNumbers.getValue();
                    }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x400L) != 0) {

                if (viewModel != null) {
                    // read viewModel.lastName
                    viewModelLastName = viewModel.getLastName();
                }
                updateLiveDataRegistration(1, viewModelLastName);


                if (viewModelLastName != null) {
                    // read viewModel.lastName.getValue()
                    viewModelLastNameGetValue = viewModelLastName.getValue();
                }


                if (viewModelLastNameGetValue != null) {
                    // read viewModel.lastName.getValue().empty
                    ViewModelLastNameEmpty1 = viewModelLastNameGetValue.isEmpty();
                }


                // read !viewModel.lastName.getValue().empty
                viewModelLastNameEmpty = !ViewModelLastNameEmpty1;
        }

        if ((dirtyFlags & 0x306L) != 0) {

                // read !viewModel.firstName.getValue().empty ? true : !viewModel.lastName.getValue().empty
                viewModelFirstNameEmptyBooleanTrueViewModelLastNameEmpty = ((viewModelFirstNameEmpty) ? (true) : (viewModelLastNameEmpty));
        }
        // batch finished
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            this.avatar.setOnClickListener(avatarClickListener);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadBigContactPictureWithCoil(this.avatar, viewModel);
            this.mboundView6.setVisibility(viewModelDisplayOrganizationViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            this.mboundView10.setOnClickListener(mCallback31);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView4, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView4androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView5, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView5androidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView7, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView7androidTextAttrChanged);
            this.mboundView8.setOnClickListener(mCallback30);
        }
        if ((dirtyFlags & 0x320L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView11, viewModelNumbersGetValue, R.layout.contact_number_address_editor_cell);
        }
        if ((dirtyFlags & 0x308L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.loadAvatarWithCoil(this.mboundView3, viewModelTempPicturePathGetValue);
        }
        if ((dirtyFlags & 0x302L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelLastNameGetValue);
        }
        if ((dirtyFlags & 0x304L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, viewModelFirstNameGetValue);
        }
        if ((dirtyFlags & 0x310L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, viewModelOrganizationGetValue);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.setEntries(this.mboundView9, viewModelAddressesGetValue, R.layout.contact_number_address_editor_cell);
        }
        if ((dirtyFlags & 0x306L) != 0) {
            // api target 1

            this.ok.setEnabled(viewModelFirstNameEmptyBooleanTrueViewModelLastNameEmpty);
        }
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.ok.setOnClickListener(saveChangesClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.contact.data.ContactEditorData viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.addEmptySipAddress();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                org.linphone.activities.main.contact.data.ContactEditorData viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.addEmptyPhoneNumber();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.addresses
        flag 1 (0x2L): viewModel.lastName
        flag 2 (0x3L): viewModel.firstName
        flag 3 (0x4L): viewModel.tempPicturePath
        flag 4 (0x5L): viewModel.organization
        flag 5 (0x6L): viewModel.numbers
        flag 6 (0x7L): avatarClickListener
        flag 7 (0x8L): saveChangesClickListener
        flag 8 (0x9L): viewModel
        flag 9 (0xaL): null
        flag 10 (0xbL): !viewModel.firstName.getValue().empty ? true : !viewModel.lastName.getValue().empty
        flag 11 (0xcL): !viewModel.firstName.getValue().empty ? true : !viewModel.lastName.getValue().empty
        flag 12 (0xdL): viewModel.displayOrganization ? View.VISIBLE : View.GONE
        flag 13 (0xeL): viewModel.displayOrganization ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}