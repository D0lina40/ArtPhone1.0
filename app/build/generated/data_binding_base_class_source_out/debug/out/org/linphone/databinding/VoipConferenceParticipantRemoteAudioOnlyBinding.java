// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.voip.data.ConferenceParticipantDeviceData;

public abstract class VoipConferenceParticipantRemoteAudioOnlyBinding extends ViewDataBinding {
  @NonNull
  public final Barrier endBarrier;

  @NonNull
  public final ProgressBar joining;

  @NonNull
  public final ImageView participantAvatar;

  @NonNull
  public final ImageView participantMicMuted;

  @NonNull
  public final TextView participantName;

  @NonNull
  public final ImageView pausedAvatar;

  @NonNull
  public final View view;

  @Bindable
  protected ConferenceParticipantDeviceData mData;

  protected VoipConferenceParticipantRemoteAudioOnlyBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Barrier endBarrier, ProgressBar joining, ImageView participantAvatar,
      ImageView participantMicMuted, TextView participantName, ImageView pausedAvatar, View view) {
    super(_bindingComponent, _root, _localFieldCount);
    this.endBarrier = endBarrier;
    this.joining = joining;
    this.participantAvatar = participantAvatar;
    this.participantMicMuted = participantMicMuted;
    this.participantName = participantName;
    this.pausedAvatar = pausedAvatar;
    this.view = view;
  }

  public abstract void setData(@Nullable ConferenceParticipantDeviceData data);

  @Nullable
  public ConferenceParticipantDeviceData getData() {
    return mData;
  }

  @NonNull
  public static VoipConferenceParticipantRemoteAudioOnlyBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_conference_participant_remote_audio_only, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipConferenceParticipantRemoteAudioOnlyBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<VoipConferenceParticipantRemoteAudioOnlyBinding>inflateInternal(inflater, R.layout.voip_conference_participant_remote_audio_only, root, attachToRoot, component);
  }

  @NonNull
  public static VoipConferenceParticipantRemoteAudioOnlyBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_conference_participant_remote_audio_only, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipConferenceParticipantRemoteAudioOnlyBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<VoipConferenceParticipantRemoteAudioOnlyBinding>inflateInternal(inflater, R.layout.voip_conference_participant_remote_audio_only, null, false, component);
  }

  public static VoipConferenceParticipantRemoteAudioOnlyBinding bind(@NonNull View view) {
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
  public static VoipConferenceParticipantRemoteAudioOnlyBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (VoipConferenceParticipantRemoteAudioOnlyBinding)bind(component, view, R.layout.voip_conference_participant_remote_audio_only);
  }
}