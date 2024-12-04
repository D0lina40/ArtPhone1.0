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
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;

public abstract class VoipRemoteRecordingBinding extends ViewDataBinding {
  @NonNull
  public final View remoteRecordingBackground;

  @NonNull
  public final ImageView remoteRecordingIcon;

  @NonNull
  public final ConstraintLayout remoteRecordingLayout;

  @NonNull
  public final TextView remoteRecordingText;

  protected VoipRemoteRecordingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      View remoteRecordingBackground, ImageView remoteRecordingIcon,
      ConstraintLayout remoteRecordingLayout, TextView remoteRecordingText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.remoteRecordingBackground = remoteRecordingBackground;
    this.remoteRecordingIcon = remoteRecordingIcon;
    this.remoteRecordingLayout = remoteRecordingLayout;
    this.remoteRecordingText = remoteRecordingText;
  }

  @NonNull
  public static VoipRemoteRecordingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_remote_recording, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipRemoteRecordingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VoipRemoteRecordingBinding>inflateInternal(inflater, R.layout.voip_remote_recording, root, attachToRoot, component);
  }

  @NonNull
  public static VoipRemoteRecordingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_remote_recording, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipRemoteRecordingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VoipRemoteRecordingBinding>inflateInternal(inflater, R.layout.voip_remote_recording, null, false, component);
  }

  public static VoipRemoteRecordingBinding bind(@NonNull View view) {
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
  public static VoipRemoteRecordingBinding bind(@NonNull View view, @Nullable Object component) {
    return (VoipRemoteRecordingBinding)bind(component, view, R.layout.voip_remote_recording);
  }
}
