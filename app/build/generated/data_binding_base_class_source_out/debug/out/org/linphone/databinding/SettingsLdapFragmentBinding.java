// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.settings.viewmodels.LdapSettingsViewModel;
import org.linphone.activities.main.viewmodels.SharedMainViewModel;

public abstract class SettingsLdapFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView back;

  @NonNull
  public final LinearLayout topBar;

  @Bindable
  protected LdapSettingsViewModel mViewModel;

  @Bindable
  protected SharedMainViewModel mSharedMainViewModel;

  protected SettingsLdapFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView back, LinearLayout topBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.topBar = topBar;
  }

  public abstract void setViewModel(@Nullable LdapSettingsViewModel viewModel);

  @Nullable
  public LdapSettingsViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setSharedMainViewModel(@Nullable SharedMainViewModel sharedMainViewModel);

  @Nullable
  public SharedMainViewModel getSharedMainViewModel() {
    return mSharedMainViewModel;
  }

  @NonNull
  public static SettingsLdapFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_ldap_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static SettingsLdapFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<SettingsLdapFragmentBinding>inflateInternal(inflater, R.layout.settings_ldap_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static SettingsLdapFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.settings_ldap_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static SettingsLdapFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<SettingsLdapFragmentBinding>inflateInternal(inflater, R.layout.settings_ldap_fragment, null, false, component);
  }

  public static SettingsLdapFragmentBinding bind(@NonNull View view) {
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
  public static SettingsLdapFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (SettingsLdapFragmentBinding)bind(component, view, R.layout.settings_ldap_fragment);
  }
}