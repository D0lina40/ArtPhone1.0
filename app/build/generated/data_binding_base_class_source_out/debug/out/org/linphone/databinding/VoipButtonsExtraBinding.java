// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
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
import org.linphone.activities.voip.viewmodels.CallsViewModel;
import org.linphone.activities.voip.viewmodels.ConferenceViewModel;
import org.linphone.activities.voip.viewmodels.ControlsViewModel;

public abstract class VoipButtonsExtraBinding extends ViewDataBinding {
  @NonNull
  public final TextView addCall;

  @NonNull
  public final TextView callStats;

  @NonNull
  public final TextView calls;

  @NonNull
  public final TextView chat;

  @NonNull
  public final ProgressBar chatRoomCreationProgress;

  @NonNull
  public final TextView conferenceLayout;

  @NonNull
  public final TextView conferenceParticipants;

  @NonNull
  public final ConstraintLayout extraButtonsLayout;

  @NonNull
  public final TextView numpad;

  @NonNull
  public final TextView pausedCallsCount;

  @NonNull
  public final TextView transferCall;

  @NonNull
  public final TextView unreadChatCount;

  @Bindable
  protected ControlsViewModel mControlsViewModel;

  @Bindable
  protected CallsViewModel mCallsViewModel;

  @Bindable
  protected ConferenceViewModel mConferenceViewModel;

  protected VoipButtonsExtraBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView addCall, TextView callStats, TextView calls, TextView chat,
      ProgressBar chatRoomCreationProgress, TextView conferenceLayout,
      TextView conferenceParticipants, ConstraintLayout extraButtonsLayout, TextView numpad,
      TextView pausedCallsCount, TextView transferCall, TextView unreadChatCount) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addCall = addCall;
    this.callStats = callStats;
    this.calls = calls;
    this.chat = chat;
    this.chatRoomCreationProgress = chatRoomCreationProgress;
    this.conferenceLayout = conferenceLayout;
    this.conferenceParticipants = conferenceParticipants;
    this.extraButtonsLayout = extraButtonsLayout;
    this.numpad = numpad;
    this.pausedCallsCount = pausedCallsCount;
    this.transferCall = transferCall;
    this.unreadChatCount = unreadChatCount;
  }

  public abstract void setControlsViewModel(@Nullable ControlsViewModel controlsViewModel);

  @Nullable
  public ControlsViewModel getControlsViewModel() {
    return mControlsViewModel;
  }

  public abstract void setCallsViewModel(@Nullable CallsViewModel callsViewModel);

  @Nullable
  public CallsViewModel getCallsViewModel() {
    return mCallsViewModel;
  }

  public abstract void setConferenceViewModel(@Nullable ConferenceViewModel conferenceViewModel);

  @Nullable
  public ConferenceViewModel getConferenceViewModel() {
    return mConferenceViewModel;
  }

  @NonNull
  public static VoipButtonsExtraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_buttons_extra, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipButtonsExtraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VoipButtonsExtraBinding>inflateInternal(inflater, R.layout.voip_buttons_extra, root, attachToRoot, component);
  }

  @NonNull
  public static VoipButtonsExtraBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_buttons_extra, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipButtonsExtraBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VoipButtonsExtraBinding>inflateInternal(inflater, R.layout.voip_buttons_extra, null, false, component);
  }

  public static VoipButtonsExtraBinding bind(@NonNull View view) {
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
  public static VoipButtonsExtraBinding bind(@NonNull View view, @Nullable Object component) {
    return (VoipButtonsExtraBinding)bind(component, view, R.layout.voip_buttons_extra);
  }
}
