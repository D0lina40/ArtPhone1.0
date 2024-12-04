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
import org.linphone.activities.main.history.viewmodels.CallLogViewModel;
import org.linphone.activities.main.viewmodels.SharedMainViewModel;

public abstract class HistoryDetailFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView avatar;

  @NonNull
  public final ImageView back;

  @NonNull
  public final LinearLayout topBar;

  @Bindable
  protected View.OnClickListener mNewContactClickListener;

  @Bindable
  protected View.OnClickListener mContactClickListener;

  @Bindable
  protected CallLogViewModel mViewModel;

  @Bindable
  protected SharedMainViewModel mSharedMainViewModel;

  protected HistoryDetailFragmentBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView avatar, ImageView back, LinearLayout topBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
    this.back = back;
    this.topBar = topBar;
  }

  public abstract void setNewContactClickListener(
      @Nullable View.OnClickListener newContactClickListener);

  @Nullable
  public View.OnClickListener getNewContactClickListener() {
    return mNewContactClickListener;
  }

  public abstract void setContactClickListener(@Nullable View.OnClickListener contactClickListener);

  @Nullable
  public View.OnClickListener getContactClickListener() {
    return mContactClickListener;
  }

  public abstract void setViewModel(@Nullable CallLogViewModel viewModel);

  @Nullable
  public CallLogViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setSharedMainViewModel(@Nullable SharedMainViewModel sharedMainViewModel);

  @Nullable
  public SharedMainViewModel getSharedMainViewModel() {
    return mSharedMainViewModel;
  }

  @NonNull
  public static HistoryDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.history_detail_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HistoryDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HistoryDetailFragmentBinding>inflateInternal(inflater, R.layout.history_detail_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static HistoryDetailFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.history_detail_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HistoryDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HistoryDetailFragmentBinding>inflateInternal(inflater, R.layout.history_detail_fragment, null, false, component);
  }

  public static HistoryDetailFragmentBinding bind(@NonNull View view) {
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
  public static HistoryDetailFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (HistoryDetailFragmentBinding)bind(component, view, R.layout.history_detail_fragment);
  }
}