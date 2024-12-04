// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.chat.viewmodels.GroupInfoViewModel;

public abstract class ChatRoomGroupInfoFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView back;

  @NonNull
  public final TextView leaveGroup;

  @NonNull
  public final RecyclerView participants;

  @NonNull
  public final LinearLayout topBar;

  @Bindable
  protected View.OnClickListener mNextClickListener;

  @Bindable
  protected View.OnClickListener mParticipantsClickListener;

  @Bindable
  protected View.OnClickListener mLeaveClickListener;

  @Bindable
  protected GroupInfoViewModel mViewModel;

  protected ChatRoomGroupInfoFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView back, TextView leaveGroup, RecyclerView participants,
      LinearLayout topBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.leaveGroup = leaveGroup;
    this.participants = participants;
    this.topBar = topBar;
  }

  public abstract void setNextClickListener(@Nullable View.OnClickListener nextClickListener);

  @Nullable
  public View.OnClickListener getNextClickListener() {
    return mNextClickListener;
  }

  public abstract void setParticipantsClickListener(
      @Nullable View.OnClickListener participantsClickListener);

  @Nullable
  public View.OnClickListener getParticipantsClickListener() {
    return mParticipantsClickListener;
  }

  public abstract void setLeaveClickListener(@Nullable View.OnClickListener leaveClickListener);

  @Nullable
  public View.OnClickListener getLeaveClickListener() {
    return mLeaveClickListener;
  }

  public abstract void setViewModel(@Nullable GroupInfoViewModel viewModel);

  @Nullable
  public GroupInfoViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ChatRoomGroupInfoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_group_info_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomGroupInfoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChatRoomGroupInfoFragmentBinding>inflateInternal(inflater, R.layout.chat_room_group_info_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ChatRoomGroupInfoFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_group_info_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomGroupInfoFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChatRoomGroupInfoFragmentBinding>inflateInternal(inflater, R.layout.chat_room_group_info_fragment, null, false, component);
  }

  public static ChatRoomGroupInfoFragmentBinding bind(@NonNull View view) {
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
  public static ChatRoomGroupInfoFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ChatRoomGroupInfoFragmentBinding)bind(component, view, R.layout.chat_room_group_info_fragment);
  }
}
