package org.linphone.databinding;
import org.linphone.R;
import org.linphone.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class SettingsWidgetSwitchAndTextBindingImpl extends SettingsWidgetSwitchAndTextBinding implements org.linphone.generated.callback.Function0.Listener, org.linphone.generated.callback.OnCheckedChangeListener.Listener {

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
    private final kotlin.jvm.functions.Function0 mCallback196;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback195;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener settingSwitchandroidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            synchronized(SettingsWidgetSwitchAndTextBindingImpl.this) {
                    mDirtyFlags |= 0x100L;
            }
            requestRebind();
        }
    };

    public SettingsWidgetSwitchAndTextBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private SettingsWidgetSwitchAndTextBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.switchmaterial.SwitchMaterial) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.settingSwitch.setTag(null);
        this.settingsInput.setTag(null);
        this.settingsInputLayout.setTag(null);
        this.settingsSubtitle.setTag(null);
        this.settingsTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback196 = new org.linphone.generated.callback.Function0(this, 2);
        mCallback195 = new org.linphone.generated.callback.OnCheckedChangeListener(this, 1);
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
        if (BR.text_subtitle == variableId) {
            setTextSubtitle((java.lang.String) variable);
        }
        else if (BR.listener == variableId) {
            setListener((org.linphone.activities.main.settings.SettingListener) variable);
        }
        else if (BR.text_title == variableId) {
            setTextTitle((java.lang.String) variable);
        }
        else if (BR.switch_subtitle == variableId) {
            setSwitchSubtitle((java.lang.String) variable);
        }
        else if (BR.checked == variableId) {
            setChecked((java.lang.Boolean) variable);
        }
        else if (BR.switch_title == variableId) {
            setSwitchTitle((java.lang.String) variable);
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

    public void setTextSubtitle(@Nullable java.lang.String TextSubtitle) {
        this.mTextSubtitle = TextSubtitle;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.text_subtitle);
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
    public void setTextTitle(@Nullable java.lang.String TextTitle) {
        this.mTextTitle = TextTitle;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.text_title);
        super.requestRebind();
    }
    public void setSwitchSubtitle(@Nullable java.lang.String SwitchSubtitle) {
        this.mSwitchSubtitle = SwitchSubtitle;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.switch_subtitle);
        super.requestRebind();
    }
    public void setChecked(@Nullable java.lang.Boolean Checked) {
        this.mChecked = Checked;
    }
    public void setSwitchTitle(@Nullable java.lang.String SwitchTitle) {
        this.mSwitchTitle = SwitchTitle;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.switch_title);
        super.requestRebind();
    }
    public void setDefaultValue(@Nullable java.lang.String DefaultValue) {
        this.mDefaultValue = DefaultValue;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.defaultValue);
        super.requestRebind();
    }
    public void setEnabled(@Nullable java.lang.Boolean Enabled) {
        this.mEnabled = Enabled;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
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
        boolean enabledJavaLangObjectNullBooleanTrueEnabled = false;
        boolean settingSwitchChecked = false;
        int settingSwitchCheckedViewVISIBLEViewGONE = 0;
        java.lang.String textSubtitle = mTextSubtitle;
        org.linphone.activities.main.settings.SettingListener listener = mListener;
        java.lang.String textTitle = mTextTitle;
        boolean switchSubtitleLengthInt0 = false;
        int textSubtitleLength = 0;
        boolean enabledJavaLangObjectNull = false;
        boolean switchTitleLengthInt0 = false;
        int switchSubtitleLengthInt0ViewVISIBLEViewGONE = 0;
        java.lang.String switchSubtitle = mSwitchSubtitle;
        boolean textSubtitleLengthInt0 = false;
        int switchSubtitleLength = 0;
        int switchTitleLength = 0;
        java.lang.String switchTitle = mSwitchTitle;
        java.lang.String defaultValue = mDefaultValue;
        java.lang.Boolean enabled = mEnabled;
        int switchTitleLengthInt0ViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x300L) != 0) {

                // read settingSwitch.checked
                settingSwitchChecked = settingSwitch.isChecked();
            if((dirtyFlags & 0x300L) != 0) {
                if(settingSwitchChecked) {
                        dirtyFlags |= 0x2000L;
                }
                else {
                        dirtyFlags |= 0x1000L;
                }
            }


                // read settingSwitch.checked ? View.VISIBLE : View.GONE
                settingSwitchCheckedViewVISIBLEViewGONE = ((settingSwitchChecked) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x201L) != 0) {



                if (textSubtitle != null) {
                    // read text_subtitle.length()
                    textSubtitleLength = textSubtitle.length();
                }


                // read text_subtitle.length() > 0
                textSubtitleLengthInt0 = (textSubtitleLength) > (0);
        }
        if ((dirtyFlags & 0x204L) != 0) {
        }
        if ((dirtyFlags & 0x208L) != 0) {



                if (switchSubtitle != null) {
                    // read switch_subtitle.length()
                    switchSubtitleLength = switchSubtitle.length();
                }


                // read switch_subtitle.length() > 0
                switchSubtitleLengthInt0 = (switchSubtitleLength) > (0);
            if((dirtyFlags & 0x208L) != 0) {
                if(switchSubtitleLengthInt0) {
                        dirtyFlags |= 0x8000L;
                }
                else {
                        dirtyFlags |= 0x4000L;
                }
            }


                // read switch_subtitle.length() > 0 ? View.VISIBLE : View.GONE
                switchSubtitleLengthInt0ViewVISIBLEViewGONE = ((switchSubtitleLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x220L) != 0) {



                if (switchTitle != null) {
                    // read switch_title.length()
                    switchTitleLength = switchTitle.length();
                }


                // read switch_title.length() > 0
                switchTitleLengthInt0 = (switchTitleLength) > (0);
            if((dirtyFlags & 0x220L) != 0) {
                if(switchTitleLengthInt0) {
                        dirtyFlags |= 0x20000L;
                }
                else {
                        dirtyFlags |= 0x10000L;
                }
            }


                // read switch_title.length() > 0 ? View.VISIBLE : View.GONE
                switchTitleLengthInt0ViewVISIBLEViewGONE = ((switchTitleLengthInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0x240L) != 0) {
        }
        if ((dirtyFlags & 0x280L) != 0) {



                // read enabled == null
                enabledJavaLangObjectNull = (enabled) == (null);
            if((dirtyFlags & 0x280L) != 0) {
                if(enabledJavaLangObjectNull) {
                        dirtyFlags |= 0x800L;
                }
                else {
                        dirtyFlags |= 0x400L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x280L) != 0) {

                // read enabled == null ? true : enabled
                enabledJavaLangObjectNullBooleanTrueEnabled = ((enabledJavaLangObjectNull) ? (true) : (enabled));
        }
        // batch finished
        if ((dirtyFlags & 0x280L) != 0) {
            // api target 1

            this.mboundView0.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
            this.settingSwitch.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
            this.settingsInputLayout.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
            this.settingsSubtitle.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
            this.settingsTitle.setEnabled(enabledJavaLangObjectNullBooleanTrueEnabled);
        }
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            org.linphone.utils.DataBindingUtilsKt.switchSetting(this.mboundView0, R.id.setting_switch);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.settingSwitch, mCallback195, settingSwitchandroidCheckedAttrChanged);
            org.linphone.utils.DataBindingUtilsKt.editTextSetting(this.settingsInput, mCallback196);
            // api target 3
            if(getBuildSdkInt() >= 3) {

                this.settingsInput.setInputType(android.text.InputType.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
            }
        }
        if ((dirtyFlags & 0x240L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsInput, defaultValue);
        }
        if ((dirtyFlags & 0x300L) != 0) {
            // api target 1

            this.settingsInputLayout.setVisibility(settingSwitchCheckedViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x204L) != 0) {
            // api target 1

            this.settingsInputLayout.setHint(textTitle);
        }
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            this.settingsInputLayout.setHelperText(textSubtitle);
            this.settingsInputLayout.setHelperTextEnabled(textSubtitleLengthInt0);
        }
        if ((dirtyFlags & 0x208L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsSubtitle, switchSubtitle);
            this.settingsSubtitle.setVisibility(switchSubtitleLengthInt0ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x220L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.settingsTitle, switchTitle);
            this.settingsTitle.setVisibility(switchTitleLengthInt0ViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
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
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        org.linphone.activities.main.settings.SettingListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            listener.onBoolValueChanged(callbackArg_1);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): text_subtitle
        flag 1 (0x2L): listener
        flag 2 (0x3L): text_title
        flag 3 (0x4L): switch_subtitle
        flag 4 (0x5L): checked
        flag 5 (0x6L): switch_title
        flag 6 (0x7L): defaultValue
        flag 7 (0x8L): enabled
        flag 8 (0x9L): settingSwitch.checked
        flag 9 (0xaL): null
        flag 10 (0xbL): enabled == null ? true : enabled
        flag 11 (0xcL): enabled == null ? true : enabled
        flag 12 (0xdL): settingSwitch.checked ? View.VISIBLE : View.GONE
        flag 13 (0xeL): settingSwitch.checked ? View.VISIBLE : View.GONE
        flag 14 (0xfL): switch_subtitle.length() > 0 ? View.VISIBLE : View.GONE
        flag 15 (0x10L): switch_subtitle.length() > 0 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): switch_title.length() > 0 ? View.VISIBLE : View.GONE
        flag 17 (0x12L): switch_title.length() > 0 ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}