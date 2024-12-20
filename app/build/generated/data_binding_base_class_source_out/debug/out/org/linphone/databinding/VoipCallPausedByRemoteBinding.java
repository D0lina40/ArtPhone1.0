// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;

public abstract class VoipCallPausedByRemoteBinding extends ViewDataBinding {
  @NonNull
  public final ImageView pausedCall;

  @NonNull
  public final TextView pausedTitle;

  @NonNull
  public final ConstraintLayout remotelyPausedCallLayout;

  @Bindable
  protected Integer mInflatedVisibility;

  protected VoipCallPausedByRemoteBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView pausedCall, TextView pausedTitle,
      ConstraintLayout remotelyPausedCallLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.pausedCall = pausedCall;
    this.pausedTitle = pausedTitle;
    this.remotelyPausedCallLayout = remotelyPausedCallLayout;
  }

  public abstract void setInflatedVisibility(@Nullable Integer inflatedVisibility);

  @Nullable
  public Integer getInflatedVisibility() {
    return mInflatedVisibility;
  }

  @NonNull
  public static VoipCallPausedByRemoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_call_paused_by_remote, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipCallPausedByRemoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VoipCallPausedByRemoteBinding>inflateInternal(inflater, R.layout.voip_call_paused_by_remote, root, attachToRoot, component);
  }

  @NonNull
  public static VoipCallPausedByRemoteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_call_paused_by_remote, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipCallPausedByRemoteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VoipCallPausedByRemoteBinding>inflateInternal(inflater, R.layout.voip_call_paused_by_remote, null, false, component);
  }

  public static VoipCallPausedByRemoteBinding bind(@NonNull View view) {
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
  public static VoipCallPausedByRemoteBinding bind(@NonNull View view, @Nullable Object component) {
    return (VoipCallPausedByRemoteBinding)bind(component, view, R.layout.voip_call_paused_by_remote);
  }
}
