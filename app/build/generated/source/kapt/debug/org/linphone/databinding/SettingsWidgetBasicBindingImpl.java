package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsWidgetBasicBindingImpl extends SettingsWidgetBasicBinding implements org.linphone.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback92;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SettingsWidgetBasicBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SettingsWidgetBasicBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.icon.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.settingsSubtitle.setTag(null);
        this.settingsTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback92 = new org.linphone.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        if (BR.listener == variableId) {
            setListener((org.linphone.activities.main.settings.SettingListener) variable);
        }
        else if (BR.subtitle == variableId) {
            setSubtitle((java.lang.String) variable);
        }
        else if (BR.icon == variableId) {
            setIcon((android.graphics.drawable.Drawable) variable);
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

    public void setListener(@Nullable org.linphone.activities.main.settings.SettingListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setSubtitle(@Nullable java.lang.String Subtitle) {
        this.mSubtitle = Subtitle;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.subtitle);
        super.requestRebind();
    }
    public void setIcon(@Nullable android.graphics.drawable.Drawable Icon) {
        this.mIcon = Icon;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.icon);
        super.requestRebind();
    }
    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setEnabled(@Nullable java.lang.Boolean Enabled) {
        this.mEnabled = Enabled;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
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
        boolean iconJavaLangObjectNull = false;
        boolean subtitleLengthInt0 = false;
        boolean enabledJavaLangObjectNullBooleanTrueEnabled = false;
        int titleLengthInt0ViewVISIBLEViewGONE = 0;
        org.linphone.activities.main.settings.SettingListener listener = mListener;
        int subtitleLengthInt0ViewVISIBLEViewGONE = 0;
        java.lang.String subtitle = mSubtitle;
        boolean enabledJavaLangObjectNull = false;
        android.graphics.drawable.Drawable Icon1 = mIcon;
        int titleLength = 0;
        int iconJavaLangObjectNullViewVISIBLEViewGONE = 0;
        boolean titleLengthInt0 = false;
        int subtitleLength = 0;
        java.lang.String title = mTitle;
        java.lang.Boolean enabled = mEnabled;

        if ((dirtyFlags & 0x22L) != 0) {



                if (subtitle != null) {
                    // read subtitle.length()
                    subtitleLength = subtitle.length();
                }


                // read subtitle.length() > 0
                subtitleLengthInt0 = (subtitleLength) > (0);
            if((dirtyFlags & 0x22L) != 0) {
                if(subtitleLengthInt0) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }


                // read subtitle.length() > 0 ? View.VISIBLE : View.GONE
                subtitleLengthInt0ViewVISIBLEViewGONE = ((subtitleLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x24L) != 0) {



                // read icon != null
                iconJavaLangObjectNull = (Icon1) != (null);
            if((dirtyFlags & 0x24L) != 0) {
                if(iconJavaLangObjectNull) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read icon != null ? View.VISIBLE : View.GONE
                iconJavaLangObjectNullViewVISIBLEViewGONE = ((iconJavaLangObjectNull) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x28L) != 0) {



                if (title != null) {
                    // read title.length()
                    titleLength = title.length();
                }


                // read title.length() > 0
                titleLengthInt0 = (titleLength) > (0);
            if((dirtyFlags & 0x28L) != 0) {
                if(titleLengthInt0) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read title.length() > 0 ? View.VISIBLE : View.GONE
                titleLengthInt0ViewVISIBLEViewGONE = ((titleLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x30L) != 0) {



                // read enabled == null
                enabledJavaLangObjectNull = (enabled) == (null);
            if((dirtyFlags & 0x30L) != 0) {
                if(enabledJavaLangObjectNull) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x30L) != 0) {

                // read enabled == null ? true : enabled
                enabledJavaLangObjectNullBooleanTrueEnabled = ((enabledJavaLangObjectNull) ? (true) : (enabled));
        }
        // batch finished
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            this.icon.setVisibility(iconJavaLangObjectNullViewVISIBLEViewGONE);
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(this.icon, Icon1);
        }
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback92);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            this.mboundView0.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
            this.settingsSubtitle.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
            this.settingsTitle.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
        }
        if ((dirtyFlags & 0x22L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsSubtitle, subtitle);
            this.settingsSubtitle.setVisibility(subtitleLengthInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x28L) != 0) {
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
        flag 0 (0x1L): listener
        flag 1 (0x2L): subtitle
        flag 2 (0x3L): icon
        flag 3 (0x4L): title
        flag 4 (0x5L): enabled
        flag 5 (0x6L): null
        flag 6 (0x7L): enabled == null ? true : enabled
        flag 7 (0x8L): enabled == null ? true : enabled
        flag 8 (0x9L): title.length() > 0 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): title.length() > 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): subtitle.length() > 0 ? View.VISIBLE : View.GONE
        flag 11 (0xcL): subtitle.length() > 0 ? View.VISIBLE : View.GONE
        flag 12 (0xdL): icon != null ? View.VISIBLE : View.GONE
        flag 13 (0xeL): icon != null ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}