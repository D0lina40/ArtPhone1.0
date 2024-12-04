// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData;

public abstract class ConferenceSchedulingParticipantCellBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout avatar;

  @Bindable
  protected ConferenceSchedulingParticipantData mData;

  protected ConferenceSchedulingParticipantCellBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout avatar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
  }

  public abstract void setData(@Nullable ConferenceSchedulingParticipantData data);

  @Nullable
  public ConferenceSchedulingParticipantData getData() {
    return mData;
  }

  @NonNull
  public static ConferenceSchedulingParticipantCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.conference_scheduling_participant_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ConferenceSchedulingParticipantCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ConferenceSchedulingParticipantCellBinding>inflateInternal(inflater, R.layout.conference_scheduling_participant_cell, root, attachToRoot, component);
  }

  @NonNull
  public static ConferenceSchedulingParticipantCellBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.conference_scheduling_participant_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ConferenceSchedulingParticipantCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ConferenceSchedulingParticipantCellBinding>inflateInternal(inflater, R.layout.conference_scheduling_participant_cell, null, false, component);
  }

  public static ConferenceSchedulingParticipantCellBinding bind(@NonNull View view) {
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
  public static ConferenceSchedulingParticipantCellBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ConferenceSchedulingParticipantCellBinding)bind(component, view, R.layout.conference_scheduling_participant_cell);
  }
}
