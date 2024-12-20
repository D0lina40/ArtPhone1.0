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

public abstract class AssistantGenericAccountWarningFragmentBinding extends ViewDataBinding {
  @NonNull
  public final FragmentContainerView topBarFragment;

  @NonNull
  public final TextView warningText;

  @Bindable
  protected View.OnClickListener mUnderstoodClickListener;

  protected AssistantGenericAccountWarningFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, FragmentContainerView topBarFragment, TextView warningText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.topBarFragment = topBarFragment;
    this.warningText = warningText;
  }

  public abstract void setUnderstoodClickListener(
      @Nullable View.OnClickListener understoodClickListener);

  @Nullable
  public View.OnClickListener getUnderstoodClickListener() {
    return mUnderstoodClickListener;
  }

  @NonNull
  public static AssistantGenericAccountWarningFragmentBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.assistant_generic_account_warning_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static AssistantGenericAccountWarningFragmentBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<AssistantGenericAccountWarningFragmentBinding>inflateInternal(inflater, R.layout.assistant_generic_account_warning_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static AssistantGenericAccountWarningFragmentBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.assistant_generic_account_warning_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static AssistantGenericAccountWarningFragmentBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<AssistantGenericAccountWarningFragmentBinding>inflateInternal(inflater, R.layout.assistant_generic_account_warning_fragment, null, false, component);
  }

  public static AssistantGenericAccountWarningFragmentBinding bind(@NonNull View view) {
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
  public static AssistantGenericAccountWarningFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (AssistantGenericAccountWarningFragmentBinding)bind(component, view, R.layout.assistant_generic_account_warning_fragment);
  }
}
