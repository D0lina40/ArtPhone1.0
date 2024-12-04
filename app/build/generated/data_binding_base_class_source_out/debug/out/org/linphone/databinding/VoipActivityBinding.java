// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.voip.viewmodels.ControlsViewModel;

public abstract class VoipActivityBinding extends ViewDataBinding {
  @NonNull
  public final FragmentContainerView navHostFragment;

  @NonNull
  public final FragmentContainerView statusFragment;

  @Bindable
  protected ControlsViewModel mControlsViewModel;

  protected VoipActivityBinding(Object _bindingComponent, View _root, int _localFieldCount,
      FragmentContainerView navHostFragment, FragmentContainerView statusFragment) {
    super(_bindingComponent, _root, _localFieldCount);
    this.navHostFragment = navHostFragment;
    this.statusFragment = statusFragment;
  }

  public abstract void setControlsViewModel(@Nullable ControlsViewModel controlsViewModel);

  @Nullable
  public ControlsViewModel getControlsViewModel() {
    return mControlsViewModel;
  }

  @NonNull
  public static VoipActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_activity, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VoipActivityBinding>inflateInternal(inflater, R.layout.voip_activity, root, attachToRoot, component);
  }

  @NonNull
  public static VoipActivityBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_activity, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipActivityBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VoipActivityBinding>inflateInternal(inflater, R.layout.voip_activity, null, false, component);
  }

  public static VoipActivityBinding bind(@NonNull View view) {
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
  public static VoipActivityBinding bind(@NonNull View view, @Nullable Object component) {
    return (VoipActivityBinding)bind(component, view, R.layout.voip_activity);
  }
}
