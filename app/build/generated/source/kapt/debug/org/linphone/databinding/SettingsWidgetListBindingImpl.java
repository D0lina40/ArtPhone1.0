package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsWidgetListBindingImpl extends SettingsWidgetListBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback79;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SettingsWidgetListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SettingsWidgetListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Spinner) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.settingsSpinner.setTag(null);
        this.settingsSubtitle.setTag(null);
        this.settingsTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback79 = new org.linphone.generated.callback.OnClickListener(this, 1);
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
        if (BR.labels == variableId) {
            setLabels((java.util.ArrayList<java.lang.String>) variable);
        }
        else if (BR.listener == variableId) {
            setListener((org.linphone.activities.main.settings.SettingListener) variable);
        }
        else if (BR.selectedIndex == variableId) {
            setSelectedIndex((java.lang.Integer) variable);
        }
        else if (BR.subtitle == variableId) {
            setSubtitle((java.lang.String) variable);
        }
        else if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.enabled == variableId) {
            setEnabled((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLabels(@Nullable java.util.ArrayList<java.lang.String> Labels) {
        this.mLabels = Labels;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.labels);
        super.requestRebind();
    }
    public void setListener(@Nullable org.linphone.activities.main.settings.SettingListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setSelectedIndex(@Nullable java.lang.Integer SelectedIndex) {
        this.mSelectedIndex = SelectedIndex;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.selectedIndex);
        super.requestRebind();
    }
    public void setSubtitle(@Nullable java.lang.String Subtitle) {
        this.mSubtitle = Subtitle;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.subtitle);
        super.requestRebind();
    }
    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setEnabled(@Nullable java.lang.Boolean Enabled) {
        this.mEnabled = Enabled;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.enabled);
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
        java.util.ArrayList<java.lang.String> labels = mLabels;
        boolean subtitleLengthInt0 = false;
        boolean enabledJavaLangObjectNullBooleanTrueEnabled = false;
        int titleLengthInt0ViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.settings.SettingListener listener = mListener;
        int subtitleLengthInt0ViewVISIBLEViewGONE = 0;
        java.lang.Integer selectedIndex = mSelectedIndex;
        java.lang.String subtitle = mSubtitle;
        boolean enabledJavaLangObjectNull = false;
        int titleLength = 0;
        boolean titleLengthInt0 = false;
        int subtitleLength = 0;
        int androidxDatabindingViewDataBindingSafeUnboxSelectedIndex = 0;
        java.lang.String title = mTitle;
        java.lang.Boolean enabled = mEnabled;

        if ((dirtyFlags & 0x41L) != 0) {
        }
        if ((dirtyFlags & 0x46L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(selectedIndex)
                androidxDatabindingViewDataBindingSafeUnboxSelectedIndex = androidx.databinding.ViewDataBinding.safeUnbox(selectedIndex);
        }
        if ((dirtyFlags & 0x48L) != 0) {



                if (subtitle != null) {
                    // read subtitle.length()
                    subtitleLength = subtitle.length();
                }


                // read subtitle.length() > 0
                subtitleLengthInt0 = (subtitleLength) > (0);
            if((dirtyFlags & 0x48L) != 0) {
                if(subtitleLengthInt0) {
                        dirtyFlags |= 0x1000L;
                }
                else {
                        dirtyFlags |= 0x800L;
                }
            }


                // read subtitle.length() > 0 ? View.VISIBLE : View.GONE
                subtitleLengthInt0ViewVISIBLEViewGONE = ((subtitleLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x50L) != 0) {



                if (title != null) {
                    // read title.length()
                    titleLength = title.length();
                }


                // read title.length() > 0
                titleLengthInt0 = (titleLength) > (0);
            if((dirtyFlags & 0x50L) != 0) {
                if(titleLengthInt0) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }


                // read title.length() > 0 ? View.VISIBLE : View.GONE
                titleLengthInt0ViewVISIBLEViewGONE = ((titleLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x60L) != 0) {



                // read enabled == null
                enabledJavaLangObjectNull = (enabled) == (null);
            if((dirtyFlags & 0x60L) != 0) {
                if(enabledJavaLangObjectNull) {
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x80L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x60L) != 0) {

                // read enabled == null ? true : enabled
                enabledJavaLangObjectNullBooleanTrueEnabled = ((enabledJavaLangObjectNull) ? (true) : (enabled));
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback79);
        }
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 1

            androidx.databinding.adapters.AbsSpinnerBindingAdapter.setEntries(this.settingsSpinner, labels);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.settingsSpinner.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
            this.settingsSubtitle.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
            this.settingsTitle.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
        }
        if ((dirtyFlags & 0x46L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.spinnerSetting(this.settingsSpinner, androidxDatabindingViewDataBindingSafeUnboxSelectedIndex, listener);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsSubtitle, subtitle);
            this.settingsSubtitle.setVisibility(subtitleLengthInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsTitle, title);
            this.settingsTitle.setVisibility(titleLengthInt0ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        org.linphone.activities.main.settings.SettingListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {


            listener.onClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): labels
        flag 1 (0x2L): listener
        flag 2 (0x3L): selectedIndex
        flag 3 (0x4L): subtitle
        flag 4 (0x5L): title
        flag 5 (0x6L): enabled
        flag 6 (0x7L): null
        flag 7 (0x8L): enabled == null ? true : enabled
        flag 8 (0x9L): enabled == null ? true : enabled
        flag 9 (0xaL): title.length() > 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): title.length() > 0 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): subtitle.length() > 0 ? View.VISIBLE : View.GONE
        flag 12 (0xdL): subtitle.length() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}