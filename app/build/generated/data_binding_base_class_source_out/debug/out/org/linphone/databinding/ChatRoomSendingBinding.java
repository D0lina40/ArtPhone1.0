// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Barrier;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import androidx.emoji2.emojipicker.EmojiPickerView;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel;
import org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel;
import org.linphone.activities.main.chat.views.RichEditText;

public abstract class ChatRoomSendingBinding extends ViewDataBinding {
  @NonNull
  public final ImageView attachFile;

  @NonNull
  public final HorizontalScrollView attachedFiles;

  @NonNull
  public final ProgressBar attachingFilesInProgress;

  @NonNull
  public final View attachingFilesInProgressBackground;

  @NonNull
  public final TextView attachingFilesInProgressLabel;

  @NonNull
  public final Barrier chatMessageReplyVoiceBarrier;

  @NonNull
  public final EmojiPickerView emojiPicker;

  @NonNull
  public final ImageView emojiPickerToggle;

  @NonNull
  public final RichEditText message;

  @NonNull
  public final Barrier replyBarrier;

  @NonNull
  public final ImageView sendEphemeralMessage;

  @NonNull
  public final ImageView sendMessage;

  @NonNull
  public final ViewStubProxy stubbedMessageToReplyTo;

  @NonNull
  public final ViewStubProxy stubbedVoiceRecording;

  @NonNull
  public final Barrier voiceBarrier;

  @NonNull
  public final ImageView voiceRecord;

  @NonNull
  public final View voiceRecordingSeparator;

  @Bindable
  protected View.OnClickListener mAttachFileClickListener;

  @Bindable
  protected View.OnTouchListener mVoiceRecordingTouchListener;

  @Bindable
  protected View.OnClickListener mCancelReplyToClickListener;

  @Bindable
  protected ChatRoomViewModel mViewModel;

  @Bindable
  protected ChatMessageSendingViewModel mChatSendingViewModel;

  protected ChatRoomSendingBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView attachFile, HorizontalScrollView attachedFiles,
      ProgressBar attachingFilesInProgress, View attachingFilesInProgressBackground,
      TextView attachingFilesInProgressLabel, Barrier chatMessageReplyVoiceBarrier,
      EmojiPickerView emojiPicker, ImageView emojiPickerToggle, RichEditText message,
      Barrier replyBarrier, ImageView sendEphemeralMessage, ImageView sendMessage,
      ViewStubProxy stubbedMessageToReplyTo, ViewStubProxy stubbedVoiceRecording,
      Barrier voiceBarrier, ImageView voiceRecord, View voiceRecordingSeparator) {
    super(_bindingComponent, _root, _localFieldCount);
    this.attachFile = attachFile;
    this.attachedFiles = attachedFiles;
    this.attachingFilesInProgress = attachingFilesInProgress;
    this.attachingFilesInProgressBackground = attachingFilesInProgressBackground;
    this.attachingFilesInProgressLabel = attachingFilesInProgressLabel;
    this.chatMessageReplyVoiceBarrier = chatMessageReplyVoiceBarrier;
    this.emojiPicker = emojiPicker;
    this.emojiPickerToggle = emojiPickerToggle;
    this.message = message;
    this.replyBarrier = replyBarrier;
    this.sendEphemeralMessage = sendEphemeralMessage;
    this.sendMessage = sendMessage;
    this.stubbedMessageToReplyTo = stubbedMessageToReplyTo;
    this.stubbedVoiceRecording = stubbedVoiceRecording;
    this.voiceBarrier = voiceBarrier;
    this.voiceRecord = voiceRecord;
    this.voiceRecordingSeparator = voiceRecordingSeparator;
  }

  public abstract void setAttachFileClickListener(
      @Nullable View.OnClickListener attachFileClickListener);

  @Nullable
  public View.OnClickListener getAttachFileClickListener() {
    return mAttachFileClickListener;
  }

  public abstract void setVoiceRecordingTouchListener(
      @Nullable View.OnTouchListener voiceRecordingTouchListener);

  @Nullable
  public View.OnTouchListener getVoiceRecordingTouchListener() {
    return mVoiceRecordingTouchListener;
  }

  public abstract void setCancelReplyToClickListener(
      @Nullable View.OnClickListener cancelReplyToClickListener);

  @Nullable
  public View.OnClickListener getCancelReplyToClickListener() {
    return mCancelReplyToClickListener;
  }

  public abstract void setViewModel(@Nullable ChatRoomViewModel viewModel);

  @Nullable
  public ChatRoomViewModel getViewModel() {
    return mViewModel;
  }

  public abstract void setChatSendingViewModel(
      @Nullable ChatMessageSendingViewModel chatSendingViewModel);

  @Nullable
  public ChatMessageSendingViewModel getChatSendingViewModel() {
    return mChatSendingViewModel;
  }

  @NonNull
  public static ChatRoomSendingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_sending, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomSendingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChatRoomSendingBinding>inflateInternal(inflater, R.layout.chat_room_sending, root, attachToRoot, component);
  }

  @NonNull
  public static ChatRoomSendingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_sending, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomSendingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChatRoomSendingBinding>inflateInternal(inflater, R.layout.chat_room_sending, null, false, component);
  }

  public static ChatRoomSendingBinding bind(@NonNull View view) {
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
  public static ChatRoomSendingBinding bind(@NonNull View view, @Nullable Object component) {
    return (ChatRoomSendingBinding)bind(component, view, R.layout.chat_room_sending);
  }
}
