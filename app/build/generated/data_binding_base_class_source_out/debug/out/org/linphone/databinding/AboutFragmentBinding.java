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
import org.linphone.activities.main.about.AboutViewModel;

public abstract class AboutFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView back;

  @NonNull
  public final LinearLayout topBar;

  @Bindable
  protected View.OnClickListener mPrivacyPolicyClickListener;

  @Bindable
  protected View.OnClickListener mLicenseClickListener;

  @Bindable
  protected View.OnClickListener mWeblateClickListener;

  @Bindable
  protected AboutViewModel mViewModel;

  protected AboutFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView back, LinearLayout topBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.topBar = topBar;
  }

  public abstract void setPrivacyPolicyClickListener(
      @Nullable View.OnClickListener privacyPolicyClickListener);

  @Nullable
  public View.OnClickListener getPrivacyPolicyClickListener() {
    return mPrivacyPolicyClickListener;
  }

  public abstract void setLicenseClickListener(@Nullable View.OnClickListener licenseClickListener);

  @Nullable
  public View.OnClickListener getLicenseClickListener() {
    return mLicenseClickListener;
  }

  public abstract void setWeblateClickListener(@Nullable View.OnClickListener weblateClickListener);

  @Nullable
  public View.OnClickListener getWeblateClickListener() {
    return mWeblateClickListener;
  }

  public abstract void setViewModel(@Nullable AboutViewModel viewModel);

  @Nullable
  public AboutViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static AboutFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.about_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AboutFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<AboutFragmentBinding>inflateInternal(inflater, R.layout.about_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static AboutFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.about_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AboutFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<AboutFragmentBinding>inflateInternal(inflater, R.layout.about_fragment, null, false, component);
  }

  public static AboutFragmentBinding bind(@NonNull View view) {
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
  public static AboutFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (AboutFragmentBinding)bind(component, view, R.layout.about_fragment);
  }
}
