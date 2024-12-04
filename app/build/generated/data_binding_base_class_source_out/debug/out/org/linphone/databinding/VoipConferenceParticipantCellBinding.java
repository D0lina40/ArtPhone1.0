// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.voip.data.ConferenceParticipantData;
import org.linphone.views.MarqueeTextView;

public abstract class VoipConferenceParticipantCellBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout adminLayout;

  @NonNull
  public final ImageView avatar;

  @NonNull
  public final ImageView delete;

  @NonNull
  public final LinearLayout isAdminLayout;

  @NonNull
  public final LinearLayout isNotAdminLayout;

  @NonNull
  public final MarqueeTextView sipUri;

  @Bindable
  protected ConferenceParticipantData mData;

  protected VoipConferenceParticipantCellBinding(Object _bindingComponent, View _root,
      int _localFieldCount, LinearLayout adminLayout, ImageView avatar, ImageView delete,
      LinearLayout isAdminLayout, LinearLayout isNotAdminLayout, MarqueeTextView sipUri) {
    super(_bindingComponent, _root, _localFieldCount);
    this.adminLayout = adminLayout;
    this.avatar = avatar;
    this.delete = delete;
    this.isAdminLayout = isAdminLayout;
    this.isNotAdminLayout = isNotAdminLayout;
    this.sipUri = sipUri;
  }

  public abstract void setData(@Nullable ConferenceParticipantData data);

  @Nullable
  public ConferenceParticipantData getData() {
    return mData;
  }

  @NonNull
  public static VoipConferenceParticipantCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_conference_participant_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static VoipConferenceParticipantCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<VoipConferenceParticipantCellBinding>inflateInternal(inflater, R.layout.voip_conference_participant_cell, root, attachToRoot, component);
  }

  @NonNull
  public static VoipConferenceParticipantCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.voip_conference_participant_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static VoipConferenceParticipantCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<VoipConferenceParticipantCellBinding>inflateInternal(inflater, R.layout.voip_conference_participant_cell, null, false, component);
  }

  public static VoipConferenceParticipantCellBinding bind(@NonNull View view) {
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
  public static VoipConferenceParticipantCellBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (VoipConferenceParticipantCellBinding)bind(component, view, R.layout.voip_conference_participant_cell);
  }
}
