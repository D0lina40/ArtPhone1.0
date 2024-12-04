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
import org.linphone.activities.voip.viewmodels.CallsViewModel;
import org.linphone.activities.voip.viewmodels.ControlsViewModel;

public abstract class VoipButtonsOutgoingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView hangup;

  @NonNull
  public final ImageView microphone;

  @NonNull
  public final ImageView numpad;

  @NonNull
  public final ImageView speaker;

  @Bindable
  protected CallsViewModel mCallsViewModel;

  @Bindable
  protected ControlsViewModel mControlsViewModel;

  protected VoipButtonsOutgoingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView hangup, ImageView microphone, ImageView numpad, ImageView speaker) {
    super(_bindingComponent, _root, _localFieldCount);
    this.hangup = hangup;
    this.microphone = microphone;
    this.numpad = numpad;
    this.speaker = speaker;
  }

  public abstract void setCallsViewModel(@Nullable CallsViewModel callsViewModel);

  @Nullable
  public CallsViewModel getCallsViewModel() {
    return mCallsViewModel;
  }

  public abstract void setControlsViewModel(@Nullable ControlsViewModel controlsViewModel);

  @Nullable
  public ControlsViewModel getControlsViewModel() {
    return mControlsViewModel;
  }

  @NonNull
  public static VoipButtonsOutgoingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_buttons_outgoing, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipButtonsOutgoingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VoipButtonsOutgoingBinding>inflateInternal(inflater, R.layout.voip_buttons_outgoing, root, attachToRoot, component);
  }

  @NonNull
  public static VoipButtonsOutgoingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_buttons_outgoing, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipButtonsOutgoingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VoipButtonsOutgoingBinding>inflateInternal(inflater, R.layout.voip_buttons_outgoing, null, false, component);
  }

  public static VoipButtonsOutgoingBinding bind(@NonNull View view) {
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
  public static VoipButtonsOutgoingBinding bind(@NonNull View view, @Nullable Object component) {
    return (VoipButtonsOutgoingBinding)bind(component, view, R.layout.voip_buttons_outgoing);
  }
}