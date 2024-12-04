// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.assistant.viewmodels.PhoneAccountValidationViewModel;

public abstract class AssistantPhoneAccountValidationFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextView titleAccountCreation;

  @NonNull
  public final TextView titleAccountLinking;

  @NonNull
  public final TextView titleAccountLogin;

  @NonNull
  public final FragmentContainerView topBarFragment;

  @Bindable
  protected PhoneAccountValidationViewModel mViewModel;

  protected AssistantPhoneAccountValidationFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView titleAccountCreation, TextView titleAccountLinking,
      TextView titleAccountLogin, FragmentContainerView topBarFragment) {
    super(_bindingComponent, _root, _localFieldCount);
    this.titleAccountCreation = titleAccountCreation;
    this.titleAccountLinking = titleAccountLinking;
    this.titleAccountLogin = titleAccountLogin;
    this.topBarFragment = topBarFragment;
  }

  public abstract void setViewModel(@Nullable PhoneAccountValidationViewModel viewModel);

  @Nullable
  public PhoneAccountValidationViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static AssistantPhoneAccountValidationFragmentBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.assistant_phone_account_validation_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AssistantPhoneAccountValidationFragmentBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<AssistantPhoneAccountValidationFragmentBinding>inflateInternal(inflater, R.layout.assistant_phone_account_validation_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static AssistantPhoneAccountValidationFragmentBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.assistant_phone_account_validation_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AssistantPhoneAccountValidationFragmentBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<AssistantPhoneAccountValidationFragmentBinding>inflateInternal(inflater, R.layout.assistant_phone_account_validation_fragment, null, false, component);
  }

  public static AssistantPhoneAccountValidationFragmentBinding bind(@NonNull View view) {
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
  public static AssistantPhoneAccountValidationFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AssistantPhoneAccountValidationFragmentBinding)bind(component, view, R.layout.assistant_phone_account_validation_fragment);
  }
}
