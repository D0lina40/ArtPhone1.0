// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.chat.data.DevicesListChildData;

public abstract class ChatRoomDevicesChildCellBinding extends ViewDataBinding {
  @NonNull
  public final ImageView securityLevel;

  @Bindable
  protected DevicesListChildData mData;

  protected ChatRoomDevicesChildCellBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView securityLevel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.securityLevel = securityLevel;
  }

  public abstract void setData(@Nullable DevicesListChildData data);

  @Nullable
  public DevicesListChildData getData() {
    return mData;
  }

  @NonNull
  public static ChatRoomDevicesChildCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_devices_child_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomDevicesChildCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChatRoomDevicesChildCellBinding>inflateInternal(inflater, R.layout.chat_room_devices_child_cell, root, attachToRoot, component);
  }

  @NonNull
  public static ChatRoomDevicesChildCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_devices_child_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomDevicesChildCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChatRoomDevicesChildCellBinding>inflateInternal(inflater, R.layout.chat_room_devices_child_cell, null, false, component);
  }

  public static ChatRoomDevicesChildCellBinding bind(@NonNull View view) {
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
  public static ChatRoomDevicesChildCellBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ChatRoomDevicesChildCellBinding)bind(component, view, R.layout.chat_room_devices_child_cell);
  }
}
