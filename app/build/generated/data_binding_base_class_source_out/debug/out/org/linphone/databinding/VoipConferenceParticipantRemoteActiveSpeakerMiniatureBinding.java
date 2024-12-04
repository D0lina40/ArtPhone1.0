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
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.voip.data.ConferenceParticipantDeviceData;
import org.linphone.activities.voip.views.RoundCornersTextureView;

public abstract class VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding extends ViewDataBinding {
  @NonNull
  public final ProgressBar joining;

  @NonNull
  public final ImageView participantAvatar;

  @NonNull
  public final TextView participantName;

  @NonNull
  public final RoundCornersTextureView participantVideoSurface;

  @NonNull
  public final ImageView paused;

  @Bindable
  protected ConferenceParticipantDeviceData mData;

  protected VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding(Object _bindingComponent,
      View _root, int _localFieldCount, ProgressBar joining, ImageView participantAvatar,
      TextView participantName, RoundCornersTextureView participantVideoSurface, ImageView paused) {
    super(_bindingComponent, _root, _localFieldCount);
    this.joining = joining;
    this.participantAvatar = participantAvatar;
    this.participantName = participantName;
    this.participantVideoSurface = participantVideoSurface;
    this.paused = paused;
  }

  public abstract void setData(@Nullable ConferenceParticipantDeviceData data);

  @Nullable
  public ConferenceParticipantDeviceData getData() {
    return mData;
  }

  @NonNull
  public static VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_conference_participant_remote_active_speaker_miniature, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding>inflateInternal(inflater, R.layout.voip_conference_participant_remote_active_speaker_miniature, root, attachToRoot, component);
  }

  @NonNull
  public static VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_conference_participant_remote_active_speaker_miniature, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding>inflateInternal(inflater, R.layout.voip_conference_participant_remote_active_speaker_miniature, null, false, component);
  }

  public static VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding bind(
      @NonNull View view) {
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
  public static VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding bind(
      @NonNull View view, @Nullable Object component) {
    return (VoipConferenceParticipantRemoteActiveSpeakerMiniatureBinding)bind(component, view, R.layout.voip_conference_participant_remote_active_speaker_miniature);
  }
}