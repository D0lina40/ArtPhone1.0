// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.chat.data.DevicesListGroupData;

public abstract class ChatRoomDevicesGroupCellBinding extends ViewDataBinding {
  @NonNull
  public final RelativeLayout avatar;

  @NonNull
  public final ImageView avatarIcon;

  @NonNull
  public final LinearLayout right;

  @Bindable
  protected DevicesListGroupData mData;

  protected ChatRoomDevicesGroupCellBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RelativeLayout avatar, ImageView avatarIcon, LinearLayout right) {
    super(_bindingComponent, _root, _localFieldCount);
    this.avatar = avatar;
    this.avatarIcon = avatarIcon;
    this.right = right;
  }

  public abstract void setData(@Nullable DevicesListGroupData data);

  @Nullable
  public DevicesListGroupData getData() {
    return mData;
  }

  @NonNull
  public static ChatRoomDevicesGroupCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_devices_group_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomDevicesGroupCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChatRoomDevicesGroupCellBinding>inflateInternal(inflater, R.layout.chat_room_devices_group_cell, root, attachToRoot, component);
  }

  @NonNull
  public static ChatRoomDevicesGroupCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_devices_group_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomDevicesGroupCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChatRoomDevicesGroupCellBinding>inflateInternal(inflater, R.layout.chat_room_devices_group_cell, null, false, component);
  }

  public static ChatRoomDevicesGroupCellBinding bind(@NonNull View view) {
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
  public static ChatRoomDevicesGroupCellBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ChatRoomDevicesGroupCellBinding)bind(component, view, R.layout.chat_room_devices_group_cell);
  }
}
