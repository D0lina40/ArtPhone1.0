// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;

public abstract class VoipConferenceCreationPendingWaitLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout creationPendingLayout;

  @NonNull
  public final ProgressBar progress;

  @NonNull
  public final TextView progressText;

  @Bindable
  protected Boolean mVisibility;

  protected VoipConferenceCreationPendingWaitLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout creationPendingLayout, ProgressBar progress,
      TextView progressText) {
    super(_bindingComponent, _root, _localFieldCount);
    this.creationPendingLayout = creationPendingLayout;
    this.progress = progress;
    this.progressText = progressText;
  }

  public abstract void setVisibility(@Nullable Boolean visibility);

  @Nullable
  public Boolean getVisibility() {
    return mVisibility;
  }

  @NonNull
  public static VoipConferenceCreationPendingWaitLayoutBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_conference_creation_pending_wait_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipConferenceCreationPendingWaitLayoutBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<VoipConferenceCreationPendingWaitLayoutBinding>inflateInternal(inflater, R.layout.voip_conference_creation_pending_wait_layout, root, attachToRoot, component);
  }

  @NonNull
  public static VoipConferenceCreationPendingWaitLayoutBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_conference_creation_pending_wait_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipConferenceCreationPendingWaitLayoutBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<VoipConferenceCreationPendingWaitLayoutBinding>inflateInternal(inflater, R.layout.voip_conference_creation_pending_wait_layout, null, false, component);
  }

  public static VoipConferenceCreationPendingWaitLayoutBinding bind(@NonNull View view) {
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
  public static VoipConferenceCreationPendingWaitLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (VoipConferenceCreationPendingWaitLayoutBinding)bind(component, view, R.layout.voip_conference_creation_pending_wait_layout);
  }
}
