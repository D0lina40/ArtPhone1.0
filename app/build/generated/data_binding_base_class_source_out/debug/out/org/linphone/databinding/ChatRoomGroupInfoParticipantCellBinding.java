// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
import org.linphone.activities.main.chat.data.GroupInfoParticipantData;
import org.linphone.views.MarqueeTextView;

public abstract class ChatRoomGroupInfoParticipantCellBinding extends ViewDataBinding {
  @NonNull
  public final Barrier adminBarrier;

  @NonNull
  public final RelativeLayout avatar;

  @NonNull
  public final ImageView avatarIcon;

  @NonNull
  public final ImageView delete;

  @NonNull
  public final MarqueeTextView displayName;

  @NonNull
  public final TextView isAdmin;

  @NonNull
  public final TextView isNotAdmin;

  @NonNull
  public final MarqueeTextView sipUri;

  @Bindable
  protected View.OnClickListener mRemoveClickListener;

  @Bindable
  protected GroupInfoParticipantData mData;

  @Bindable
  protected Boolean mIsEncrypted;

  protected ChatRoomGroupInfoParticipantCellBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Barrier adminBarrier, RelativeLayout avatar, ImageView avatarIcon,
      ImageView delete, MarqueeTextView displayName, TextView isAdmin, TextView isNotAdmin,
      MarqueeTextView sipUri) {
    super(_bindingComponent, _root, _localFieldCount);
    this.adminBarrier = adminBarrier;
    this.avatar = avatar;
    this.avatarIcon = avatarIcon;
    this.delete = delete;
    this.displayName = displayName;
    this.isAdmin = isAdmin;
    this.isNotAdmin = isNotAdmin;
    this.sipUri = sipUri;
  }

  public abstract void setRemoveClickListener(@Nullable View.OnClickListener removeClickListener);

  @Nullable
  public View.OnClickListener getRemoveClickListener() {
    return mRemoveClickListener;
  }

  public abstract void setData(@Nullable GroupInfoParticipantData data);

  @Nullable
  public GroupInfoParticipantData getData() {
    return mData;
  }

  public abstract void setIsEncrypted(@Nullable Boolean isEncrypted);

  @Nullable
  public Boolean getIsEncrypted() {
    return mIsEncrypted;
  }

  @NonNull
  public static ChatRoomGroupInfoParticipantCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_group_info_participant_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomGroupInfoParticipantCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChatRoomGroupInfoParticipantCellBinding>inflateInternal(inflater, R.layout.chat_room_group_info_participant_cell, root, attachToRoot, component);
  }

  @NonNull
  public static ChatRoomGroupInfoParticipantCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_group_info_participant_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomGroupInfoParticipantCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChatRoomGroupInfoParticipantCellBinding>inflateInternal(inflater, R.layout.chat_room_group_info_participant_cell, null, false, component);
  }

  public static ChatRoomGroupInfoParticipantCellBinding bind(@NonNull View view) {
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
  public static ChatRoomGroupInfoParticipantCellBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ChatRoomGroupInfoParticipantCellBinding)bind(component, view, R.layout.chat_room_group_info_participant_cell);
  }
}