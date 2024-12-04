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
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.settings.viewmodels.AccountSettingsViewModel;
import org.linphone.views.MarqueeTextView;

public abstract class SettingsAccountCellBinding extends ViewDataBinding {
  @NonNull
  public final ImageView led;

  @NonNull
  public final MarqueeTextView settingsSubtitle;

  @NonNull
  public final MarqueeTextView settingsTitle;

  @Bindable
  protected AccountSettingsViewModel mData;

  protected SettingsAccountCellBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView led, MarqueeTextView settingsSubtitle, MarqueeTextView settingsTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.led = led;
    this.settingsSubtitle = settingsSubtitle;
    this.settingsTitle = settingsTitle;
  }

  public abstract void setData(@Nullable AccountSettingsViewModel data);

  @Nullable
  public AccountSettingsViewModel getData() {
    return mData;
  }

  @NonNull
  public static SettingsAccountCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_account_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SettingsAccountCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SettingsAccountCellBinding>inflateInternal(inflater, R.layout.settings_account_cell, root, attachToRoot, component);
  }

  @NonNull
  public static SettingsAccountCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_account_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SettingsAccountCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SettingsAccountCellBinding>inflateInternal(inflater, R.layout.settings_account_cell, null, false, component);
  }

  public static SettingsAccountCellBinding bind(@NonNull View view) {
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
  public static SettingsAccountCellBinding bind(@NonNull View view, @Nullable Object component) {
    return (SettingsAccountCellBinding)bind(component, view, R.layout.settings_account_cell);
  }
}