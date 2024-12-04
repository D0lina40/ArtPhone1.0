// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.settings.SettingListener;

public abstract class SettingsWidgetBasicBinding extends ViewDataBinding {
  @NonNull
  public final ImageView icon;

  @NonNull
  public final TextView settingsSubtitle;

  @NonNull
  public final TextView settingsTitle;

  @Bindable
  protected String mTitle;

  @Bindable
  protected String mSubtitle;

  @Bindable
  protected Boolean mEnabled;

  @Bindable
  protected Drawable mIcon;

  @Bindable
  protected SettingListener mListener;

  protected SettingsWidgetBasicBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView icon, TextView settingsSubtitle, TextView settingsTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.icon = icon;
    this.settingsSubtitle = settingsSubtitle;
    this.settingsTitle = settingsTitle;
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

  public abstract void setEnabled(@Nullable Boolean enabled);

  @Nullable
  public Boolean getEnabled() {
    return mEnabled;
  }

  public abstract void setIcon(@Nullable Drawable icon);

  @Nullable
  public Drawable getIcon() {
    return mIcon;
  }

  public abstract void setListener(@Nullable SettingListener listener);

  @Nullable
  public SettingListener getListener() {
    return mListener;
  }

  @NonNull
  public static SettingsWidgetBasicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_widget_basic, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SettingsWidgetBasicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SettingsWidgetBasicBinding>inflateInternal(inflater, R.layout.settings_widget_basic, root, attachToRoot, component);
  }

  @NonNull
  public static SettingsWidgetBasicBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_widget_basic, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SettingsWidgetBasicBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SettingsWidgetBasicBinding>inflateInternal(inflater, R.layout.settings_widget_basic, null, false, component);
  }

  public static SettingsWidgetBasicBinding bind(@NonNull View view) {
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
  public static SettingsWidgetBasicBinding bind(@NonNull View view, @Nullable Object component) {
    return (SettingsWidgetBasicBinding)bind(component, view, R.layout.settings_widget_basic);
  }
}