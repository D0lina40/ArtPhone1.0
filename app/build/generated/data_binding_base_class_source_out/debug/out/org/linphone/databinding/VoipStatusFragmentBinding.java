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
import org.linphone.activities.voip.viewmodels.StatusViewModel;

public abstract class VoipStatusFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView statsButton;

  @NonNull
  public final ImageView statusLed;

  @Bindable
  protected View.OnClickListener mRefreshClickListener;

  @Bindable
  protected StatusViewModel mViewModel;

  protected VoipStatusFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView statsButton, ImageView statusLed) {
    super(_bindingComponent, _root, _localFieldCount);
    this.statsButton = statsButton;
    this.statusLed = statusLed;
  }

  public abstract void setRefreshClickListener(@Nullable View.OnClickListener refreshClickListener);

  @Nullable
  public View.OnClickListener getRefreshClickListener() {
    return mRefreshClickListener;
  }

  public abstract void setViewModel(@Nullable StatusViewModel viewModel);

  @Nullable
  public StatusViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static VoipStatusFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_status_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipStatusFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VoipStatusFragmentBinding>inflateInternal(inflater, R.layout.voip_status_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static VoipStatusFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_status_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipStatusFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VoipStatusFragmentBinding>inflateInternal(inflater, R.layout.voip_status_fragment, null, false, component);
  }

  public static VoipStatusFragmentBinding bind(@NonNull View view) {
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
  public static VoipStatusFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (VoipStatusFragmentBinding)bind(component, view, R.layout.voip_status_fragment);
  }
}
