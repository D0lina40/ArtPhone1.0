// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.chat.data.ChatMessageContentData;

public abstract class ChatMessageDownloadableFileContentCellBinding extends ViewDataBinding {
  @Bindable
  protected ChatMessageContentData mData;

  @Bindable
  protected View.OnLongClickListener mLongClickListener;

  @Bindable
  protected Integer mInflatedVisibility;

  protected ChatMessageDownloadableFileContentCellBinding(Object _bindingComponent, View _root,
      int _localFieldCount) {
    super(_bindingComponent, _root, _localFieldCount);
  }

  public abstract void setData(@Nullable ChatMessageContentData data);

  @Nullable
  public ChatMessageContentData getData() {
    return mData;
  }

  public abstract void setLongClickListener(@Nullable View.OnLongClickListener longClickListener);

  @Nullable
  public View.OnLongClickListener getLongClickListener() {
    return mLongClickListener;
  }

  public abstract void setInflatedVisibility(@Nullable Integer inflatedVisibility);

  @Nullable
  public Integer getInflatedVisibility() {
    return mInflatedVisibility;
  }

  @NonNull
  public static ChatMessageDownloadableFileContentCellBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_message_downloadable_file_content_cell, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatMessageDownloadableFileContentCellBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable ViewGroup root, boolean attachToRoot,
      @Nullable Object component) {
    return ViewDataBinding.<ChatMessageDownloadableFileContentCellBinding>inflateInternal(inflater, R.layout.chat_message_downloadable_file_content_cell, root, attachToRoot, component);
  }

  @NonNull
  public static ChatMessageDownloadableFileContentCellBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_message_downloadable_file_content_cell, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatMessageDownloadableFileContentCellBinding inflate(
      @NonNull LayoutInflater inflater, @Nullable Object component) {
    return ViewDataBinding.<ChatMessageDownloadableFileContentCellBinding>inflateInternal(inflater, R.layout.chat_message_downloadable_file_content_cell, null, false, component);
  }

  public static ChatMessageDownloadableFileContentCellBinding bind(@NonNull View view) {
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
  public static ChatMessageDownloadableFileContentCellBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ChatMessageDownloadableFileContentCellBinding)bind(component, view, R.layout.chat_message_downloadable_file_content_cell);
  }
}
