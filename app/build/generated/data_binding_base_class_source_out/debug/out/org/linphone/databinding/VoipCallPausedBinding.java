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
import org.linphone.activities.voip.data.CallData;

public abstract class VoipCallPausedBinding extends ViewDataBinding {
  @NonNull
  public final ConstraintLayout locallyPausedCallLayout;

  @NonNull
  public final TextView pausedSubtitle;

  @NonNull
  public final TextView pausedTitle;

  @NonNull
  public final ImageView resumeCall;

  @Bindable
  protected CallData mData;

  @Bindable
  protected Integer mInflatedVisibility;

  protected VoipCallPausedBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ConstraintLayout locallyPausedCallLayout, TextView pausedSubtitle, TextView pausedTitle,
      ImageView resumeCall) {
    super(_bindingComponent, _root, _localFieldCount);
    this.locallyPausedCallLayout = locallyPausedCallLayout;
    this.pausedSubtitle = pausedSubtitle;
    this.pausedTitle = pausedTitle;
    this.resumeCall = resumeCall;
  }

  public abstract void setData(@Nullable CallData data);

  @Nullable
  public CallData getData() {
    return mData;
  }

  public abstract void setInflatedVisibility(@Nullable Integer inflatedVisibility);

  @Nullable
  public Integer getInflatedVisibility() {
    return mInflatedVisibility;
  }

  @NonNull
  public static VoipCallPausedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_call_paused, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipCallPausedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VoipCallPausedBinding>inflateInternal(inflater, R.layout.voip_call_paused, root, attachToRoot, component);
  }

  @NonNull
  public static VoipCallPausedBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_call_paused, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipCallPausedBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VoipCallPausedBinding>inflateInternal(inflater, R.layout.voip_call_paused, null, false, component);
  }

  public static VoipCallPausedBinding bind(@NonNull View view) {
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
  public static VoipCallPausedBinding bind(@NonNull View view, @Nullable Object component) {
    return (VoipCallPausedBinding)bind(component, view, R.layout.voip_call_paused);
  }
}
