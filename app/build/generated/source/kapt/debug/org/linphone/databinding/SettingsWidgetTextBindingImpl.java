package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsWidgetTextBindingImpl extends SettingsWidgetTextBinding implements org.linphone.generated.callback.OnClickListener.Listener, org.linphone.generated.callback.Function0.Listener {

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
    private final android.view.View.OnClickListener mCallback177;
    @Nullable
    private final kotlin.jvm.functions.Function0 mCallback178;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public SettingsWidgetTextBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private SettingsWidgetTextBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (org.linphone.views.SettingTextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.settingsCommitInput.setTag(null);
        this.settingsInput.setTag(null);
        this.settingsInputLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback177 = new org.linphone.generated.callback.OnClickListener(this, 1);
        mCallback178 = new org.linphone.generated.callback.Function0(this, 2);
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
        if (BR.inputType == variableId) {
            setInputType((java.lang.Integer) variable);
        }
        else if (BR.title == variableId) {
            setTitle((java.lang.String) variable);
        }
        else if (BR.listener == variableId) {
            setListener((org.linphone.activities.main.settings.SettingListener) variable);
        }
        else if (BR.subtitle == variableId) {
            setSubtitle((java.lang.String) variable);
        }
        else if (BR.defaultValue == variableId) {
            setDefaultValue((java.lang.String) variable);
        }
        else if (BR.enabled == variableId) {
            setEnabled((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setInputType(@Nullable java.lang.Integer InputType) {
        this.mInputType = InputType;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.inputType);
        super.requestRebind();
    }
    public void setTitle(@Nullable java.lang.String Title) {
        this.mTitle = Title;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.title);
        super.requestRebind();
    }
    public void setListener(@Nullable org.linphone.activities.main.settings.SettingListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.listener);
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
    public void setDefaultValue(@Nullable java.lang.String DefaultValue) {
        this.mDefaultValue = DefaultValue;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.defaultValue);
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
        boolean inputTypeJavaLangObjectNull = false;
        boolean enabledJavaLangObjectNull = false;
        java.lang.Integer inputType = mInputType;
        boolean subtitleLengthInt0 = false;
        int subtitleLength = 0;
        boolean enabledJavaLangObjectNullBooleanTrueEnabled = false;
        int inputTypeJavaLangObjectNullInputTypeTYPETEXTFLAGNOSUGGESTIONSInputType = 0;
        java.lang.String title = mTitle;
        org.linphone.activities.main.settings.SettingListener listener = mListener;
        java.lang.String subtitle = mSubtitle;
        java.lang.String defaultValue = mDefaultValue;
        java.lang.Boolean enabled = mEnabled;

        if ((dirtyFlags & 0x41L) != 0) {



                // read inputType == null
                inputTypeJavaLangObjectNull = (inputType) == (null);
            if((dirtyFlags & 0x41L) != 0) {
                if(inputTypeJavaLangObjectNull) {
                        dirtyFlags |= 0x400L;
                }
                else {
                        dirtyFlags |= 0x200L;
                }
            }
        }
        if ((dirtyFlags & 0x42L) != 0) {
        }
        if ((dirtyFlags & 0x48L) != 0) {



                if (subtitle != null) {
                    // read subtitle.length()
                    subtitleLength = subtitle.length();
                }


                // read subtitle.length() > 0
                subtitleLengthInt0 = (subtitleLength) > (0);
        }
        if ((dirtyFlags & 0x50L) != 0) {
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
        if ((dirtyFlags & 0x41L) != 0) {

                // read inputType == null ? InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS : inputType
                inputTypeJavaLangObjectNullInputTypeTYPETEXTFLAGNOSUGGESTIONSInputType = ((inputTypeJavaLangObjectNull) ? (android.text.InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS) : (inputType));
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.settingsCommitInput.setOnClickListener(mCallback177);
            org.linphone.utils.DataBindingUtilsKt.setEditTextOnFocusChangeVisibilityOf(this.settingsInput, settingsCommitInput);
            org.linphone.utils.DataBindingUtilsKt.editTextImeDone(this.settingsInput, mCallback178);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsInput, defaultValue);
        }
        if ((dirtyFlags & 0x41L) != 0) {
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.settingsInput.setInputType(inputTypeJavaLangObjectNullInputTypeTYPETEXTFLAGNOSUGGESTIONSInputType);
            }
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.settingsInputLayout.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
        }
        if ((dirtyFlags & 0x42L) != 0) {
            // api target 1

            this.settingsInputLayout.setHint(title);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            this.settingsInputLayout.setHelperText(subtitle);
            this.settingsInputLayout.setHelperTextEnabled(subtitleLengthInt0);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // listener
        org.linphone.activities.main.settings.SettingListener listener = mListener;


        if ((settingsInput) != (null)) {



            settingsInput.fakeImeDone(listener);
        }
    }
    public final kotlin.Unit _internalCallbackInvoke(int sourceId ) {
        // localize variables for thread safety
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        org.linphone.activities.main.settings.SettingListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {


            if ((settingsInput) != (null)) {


                settingsInput.getText();
                if ((settingsInput.getText()) != (null)) {


                    settingsInput.getText().toString();

                    listener.onTextValueChanged(settingsInput.getText().toString());
                }
            }
        }
        return null;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): inputType
        flag 1 (0x2L): title
        flag 2 (0x3L): listener
        flag 3 (0x4L): subtitle
        flag 4 (0x5L): defaultValue
        flag 5 (0x6L): enabled
        flag 6 (0x7L): null
        flag 7 (0x8L): enabled == null ? true : enabled
        flag 8 (0x9L): enabled == null ? true : enabled
        flag 9 (0xaL): inputType == null ? InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS : inputType
        flag 10 (0xbL): inputType == null ? InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS : inputType
    flag mapping end*/
    //end
}