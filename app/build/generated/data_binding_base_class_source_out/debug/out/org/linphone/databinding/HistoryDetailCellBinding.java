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
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.history.viewmodels.CallLogViewModel;

public abstract class HistoryDetailCellBinding extends ViewDataBinding {
  @Bindable
  protected CallLogViewModel mData;

  protected HistoryDetailCellBinding(Object _bindingComponent, View _root, int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setData(@Nullable CallLogViewModel data);

  @Nullable
  public CallLogViewModel getData() {
    return mData;
  }

  @NonNull
  public static HistoryDetailCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.history_detail_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static HistoryDetailCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<HistoryDetailCellBinding>inflateInternal(inflater, R.layout.history_detail_cell, root, attachToRoot, component);
  }

  @NonNull
  public static HistoryDetailCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.history_detail_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static HistoryDetailCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<HistoryDetailCellBinding>inflateInternal(inflater, R.layout.history_detail_cell, null, false, component);
  }

  public static HistoryDetailCellBinding bind(@NonNull View view) {
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
  public static HistoryDetailCellBinding bind(@NonNull View view, @Nullable Object component) {
    return (HistoryDetailCellBinding)bind(component, view, R.layout.history_detail_cell);
  }
}