// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.conference.data.ScheduledConferenceData;
import org.linphone.activities.main.viewmodels.ListTopBarViewModel;

public abstract class ConferenceScheduleCellBinding extends ViewDataBinding {
  @NonNull
  public final TextView meetingType;

  @NonNull
  public final TextView participantsList;

  @NonNull
  public final TextView participantsTitle;

  @NonNull
  public final CheckBox select;

  @NonNull
  public final ImageView selectedInfo;

  @NonNull
  public final TextView speakersList;

  @NonNull
  public final TextView speakersTitle;

  @NonNull
  public final LinearLayout time;

  @Bindable
  protected View.OnClickListener mClickListener;

  @Bindable
  protected View.OnLongClickListener mLongClickListener;

  @Bindable
  protected View.OnClickListener mCopyAddressClickListener;

  @Bindable
  protected View.OnClickListener mJoinConferenceClickListener;

  @Bindable
  protected View.OnClickListener mEditConferenceClickListener;

  @Bindable
  protected View.OnClickListener mDeleteConferenceClickListener;

  @Bindable
  protected Integer mPosition;

  @Bindable
  protected ListTopBarViewModel mSelectionListViewModel;

  @Bindable
  protected ScheduledConferenceData mData;

  protected ConferenceScheduleCellBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView meetingType, TextView participantsList,
      TextView participantsTitle, CheckBox select, ImageView selectedInfo, TextView speakersList,
      TextView speakersTitle, LinearLayout time) {
    super(_bindingComponent, _root, _localFieldCount);
    this.meetingType = meetingType;
    this.participantsList = participantsList;
    this.participantsTitle = participantsTitle;
    this.select = select;
    this.selectedInfo = selectedInfo;
    this.speakersList = speakersList;
    this.speakersTitle = speakersTitle;
    this.time = time;
  }

  public abstract void setClickListener(@Nullable View.OnClickListener clickListener);

  @Nullable
  public View.OnClickListener getClickListener() {
    return mClickListener;
  }

  public abstract void setLongClickListener(@Nullable View.OnLongClickListener longClickListener);

  @Nullable
  public View.OnLongClickListener getLongClickListener() {
    return mLongClickListener;
  }

  public abstract void setCopyAddressClickListener(
      @Nullable View.OnClickListener copyAddressClickListener);

  @Nullable
  public View.OnClickListener getCopyAddressClickListener() {
    return mCopyAddressClickListener;
  }

  public abstract void setJoinConferenceClickListener(
      @Nullable View.OnClickListener joinConferenceClickListener);

  @Nullable
  public View.OnClickListener getJoinConferenceClickListener() {
    return mJoinConferenceClickListener;
  }

  public abstract void setEditConferenceClickListener(
      @Nullable View.OnClickListener editConferenceClickListener);

  @Nullable
  public View.OnClickListener getEditConferenceClickListener() {
    return mEditConferenceClickListener;
  }

  public abstract void setDeleteConferenceClickListener(
      @Nullable View.OnClickListener deleteConferenceClickListener);

  @Nullable
  public View.OnClickListener getDeleteConferenceClickListener() {
    return mDeleteConferenceClickListener;
  }

  public abstract void setPosition(@Nullable Integer position);

  @Nullable
  public Integer getPosition() {
    return mPosition;
  }

  public abstract void setSelectionListViewModel(
      @Nullable ListTopBarViewModel selectionListViewModel);

  @Nullable
  public ListTopBarViewModel getSelectionListViewModel() {
    return mSelectionListViewModel;
  }

  public abstract void setData(@Nullable ScheduledConferenceData data);

  @Nullable
  public ScheduledConferenceData getData() {
    return mData;
  }

  @NonNull
  public static ConferenceScheduleCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.conference_schedule_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ConferenceScheduleCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ConferenceScheduleCellBinding>inflateInternal(inflater, R.layout.conference_schedule_cell, root, attachToRoot, component);
  }

  @NonNull
  public static ConferenceScheduleCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.conference_schedule_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ConferenceScheduleCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ConferenceScheduleCellBinding>inflateInternal(inflater, R.layout.conference_schedule_cell, null, false, component);
  }

  public static ConferenceScheduleCellBinding bind(@NonNull View view) {
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
  public static ConferenceScheduleCellBinding bind(@NonNull View view, @Nullable Object component) {
    return (ConferenceScheduleCellBinding)bind(component, view, R.layout.conference_schedule_cell);
  }
}
