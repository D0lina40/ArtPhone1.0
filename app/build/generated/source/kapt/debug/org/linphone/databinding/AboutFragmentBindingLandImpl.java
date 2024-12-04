package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AboutFragmentBindingLandImpl extends AboutFragmentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.top_bar, 6);
        sViewsWithIds.put(R.id.back, 7);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AboutFragmentBindingLandImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private AboutFragmentBindingLandImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[7]
            , (android.widget.LinearLayout) bindings[6]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.weblateClickListener == variableId) {
            setWeblateClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.licenseClickListener == variableId) {
            setLicenseClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((org.linphone.activities.main.about.AboutViewModel) variable);
        }
        else if (BR.privacyPolicyClickListener == variableId) {
            setPrivacyPolicyClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setWeblateClickListener(@Nullable android.view.View.OnClickListener WeblateClickListener) {
        this.mWeblateClickListener = WeblateClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.weblateClickListener);
        super.requestRebind();
    }
    public void setLicenseClickListener(@Nullable android.view.View.OnClickListener LicenseClickListener) {
        this.mLicenseClickListener = LicenseClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.licenseClickListener);
        super.requestRebind();
    }
    public void setViewModel(@Nullable org.linphone.activities.main.about.AboutViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }
    public void setPrivacyPolicyClickListener(@Nullable android.view.View.OnClickListener PrivacyPolicyClickListener) {
        this.mPrivacyPolicyClickListener = PrivacyPolicyClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.privacyPolicyClickListener);
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
        java.lang.String stringFormatMboundView1AndroidStringAboutVersionViewModelAppVersion = null;
        java.lang.String stringFormatMboundView2AndroidStringAboutLiblinphoneSdkVersionViewModelSdkVersion = null;
        java.lang.String viewModelSdkVersion = null;
        android.view.View.OnClickListener weblateClickListener = mWeblateClickListener;
        android.view.View.OnClickListener licenseClickListener = mLicenseClickListener;
        java.lang.String viewModelAppVersion = null;
        org.linphone.activities.main.about.AboutViewModel viewModel = mViewModel;
        android.view.View.OnClickListener privacyPolicyClickListener = mPrivacyPolicyClickListener;

        if ((dirtyFlags & 0x11L) != 0) {
        }
        if ((dirtyFlags & 0x12L) != 0) {
        }
        if ((dirtyFlags & 0x14L) != 0) {



                if (viewModel != null) {
                    // read viewModel.sdkVersion
                    viewModelSdkVersion = viewModel.getSdkVersion();
                    // read viewModel.appVersion
                    viewModelAppVersion = viewModel.getAppVersion();
                }


                // read String.format(@android:string/about_liblinphone_sdk_version, viewModel.sdkVersion)
                stringFormatMboundView2AndroidStringAboutLiblinphoneSdkVersionViewModelSdkVersion = java.lang.String.format(mboundView2.getResources().getString(R.string.about_liblinphone_sdk_version), viewModelSdkVersion);
                // read String.format(@android:string/about_version, viewModel.appVersion)
                stringFormatMboundView1AndroidStringAboutVersionViewModelAppVersion = java.lang.String.format(mboundView1.getResources().getString(R.string.about_version), viewModelAppVersion);
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, stringFormatMboundView1AndroidStringAboutVersionViewModelAppVersion);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, stringFormatMboundView2AndroidStringAboutLiblinphoneSdkVersionViewModelSdkVersion);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.mboundView3.setOnClickListener(privacyPolicyClickListener);
        }
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(licenseClickListener);
        }
        if ((dirtyFlags & 0x11L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(weblateClickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): weblateClickListener
        flag 1 (0x2L): licenseClickListener
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): privacyPolicyClickListener
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}