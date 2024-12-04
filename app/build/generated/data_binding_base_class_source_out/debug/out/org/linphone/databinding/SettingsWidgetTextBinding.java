// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.settings.SettingListener;
import org.linphone.views.SettingTextInputEditText;

public abstract class SettingsWidgetTextBinding extends ViewDataBinding {
  @NonNull
  public final ImageView settingsCommitInput;

  @NonNull
  public final SettingTextInputEditText settingsInput;

  @NonNull
  public final TextInputLayout settingsInputLayout;

  @Bindable
  protected String mTitle;

  @Bindable
  protected String mSubtitle;

  @Bindable
  protected String mDefaultValue;

  @Bindable
  protected Integer mInputType;

  @Bindable
  protected Boolean mEnabled;

  @Bindable
  protected SettingListener mListener;

  protected SettingsWidgetTextBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView settingsCommitInput, SettingTextInputEditText settingsInput,
      TextInputLayout settingsInputLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.settingsCommitInput = settingsCommitInput;
    this.settingsInput = settingsInput;
    this.settingsInputLayout = settingsInputLayout;
  }

  public abstract void setTitle(@Nullable String title);

  @Nullable
  public String getTitle() {
    return mTitle;
  }

  public abstract void setSubtitle(@Nullable String subtitle);

  @Nullable
  public String getSubtitle() {
    return mSubtitle;
  }

  public abstract void setDefaultValue(@Nullable String defaultValue);

  @Nullable
  public String getDefaultValue() {
    return mDefaultValue;
  }

  public abstract void setInputType(@Nullable Integer inputType);

  @Nullable
  public Integer getInputType() {
    return mInputType;
  }

  public abstract void setEnabled(@Nullable Boolean enabled);

  @Nullable
  public Boolean getEnabled() {
    return mEnabled;
  }

  public abstract void setListener(@Nullable SettingListener listener);

  @Nullable
  public SettingListener getListener() {
    return mListener;
  }

  @NonNull
  public static SettingsWidgetTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_widget_text, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SettingsWidgetTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SettingsWidgetTextBinding>inflateInternal(inflater, R.layout.settings_widget_text, root, attachToRoot, component);
  }

  @NonNull
  public static SettingsWidgetTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_widget_text, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SettingsWidgetTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SettingsWidgetTextBinding>inflateInternal(inflater, R.layout.settings_widget_text, null, false, component);
  }

  public static SettingsWidgetTextBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static SettingsWidgetTextBinding bind(@NonNull View view, @Nullable Object component) {
    return (SettingsWidgetTextBinding)bind(component, view, R.layout.settings_widget_text);
  }
}