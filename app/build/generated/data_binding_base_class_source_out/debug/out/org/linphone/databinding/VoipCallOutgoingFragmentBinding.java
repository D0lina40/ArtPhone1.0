// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.voip.viewmodels.CallsViewModel;
import org.linphone.activities.voip.viewmodels.ControlsViewModel;
import org.linphone.activities.voip.views.RoundCornersTextureView;

public abstract class VoipCallOutgoingFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView avatar;

  @NonNull
  public final VoipButtonsOutgoingBinding buttons;

  @NonNull
  public final TextView calleeName;

  @NonNull
  public final ImageView conferenceAvatar;

  @NonNull
  public final RoundCornersTextureView localPreviewVideoSurface;

  @NonNull
  public final Chronometer outgoingCallTimer;

  @NonNull
  public final TextView outgoingCallTitle;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final ViewStubProxy stubNumpad;

  @NonNull
  public final ImageView switchCamera;

  @Bindable
  protected CallsViewModel mCallsViewModel;

  @Bindable
  protected ControlsViewModel mControlsViewModel;

  protected VoipCallOutgoingFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView avatar, VoipButtonsOutgoingBinding buttons,
      TextView calleeName, ImageView conferenceAvatar,
      RoundCornersTextureView localPreviewVideoSurface, Chronometer outgoingCallTimer,
      TextView outgoingCallTitle, ProgressBar progress, ViewStubProxy stubNumpad,
      ImageView switchCamera) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
    this.buttons = buttons;
    this.calleeName = calleeName;
    this.conferenceAvatar = conferenceAvatar;
    this.localPreviewVideoSurface = localPreviewVideoSurface;
    this.outgoingCallTimer = outgoingCallTimer;
    this.outgoingCallTitle = outgoingCallTitle;
    this.progress = progress;
    this.stubNumpad = stubNumpad;
    this.switchCamera = switchCamera;
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
  public static VoipCallOutgoingFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_call_outgoing_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipCallOutgoingFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VoipCallOutgoingFragmentBinding>inflateInternal(inflater, R.layout.voip_call_outgoing_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static VoipCallOutgoingFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_call_outgoing_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipCallOutgoingFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VoipCallOutgoingFragmentBinding>inflateInternal(inflater, R.layout.voip_call_outgoing_fragment, null, false, component);
  }

  public static VoipCallOutgoingFragmentBinding bind(@NonNull View view) {
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
  public static VoipCallOutgoingFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (VoipCallOutgoingFragmentBinding)bind(component, view, R.layout.voip_call_outgoing_fragment);
  }
}
