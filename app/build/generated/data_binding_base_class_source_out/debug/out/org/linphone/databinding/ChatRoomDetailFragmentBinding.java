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
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;
import org.linphone.activities.main.chat.viewmodels.ChatMessageSendingViewModel;
import org.linphone.activities.main.chat.viewmodels.ChatRoomViewModel;
import org.linphone.activities.main.viewmodels.SharedMainViewModel;
import org.linphone.views.MarqueeTextView;

public abstract class ChatRoomDetailFragmentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView back;

  @NonNull
  public final RecyclerView chatMessagesList;

  @NonNull
  public final ChatRoomSendingBinding footer;

  @NonNull
  public final MarqueeTextView lastSeenAt;

  @NonNull
  public final FragmentContainerView listEditTopBarFragment;

  @NonNull
  public final ImageView menu;

  @NonNull
  public final TextView remoteComposing;

  @NonNull
  public final LinearLayout topBar;

  @Bindable
  protected View.OnClickListener mMenuClickListener;

  @Bindable
  protected View.OnLongClickListener mMenuLongClickListener;

  @Bindable
  protected View.OnClickListener mSecurityIconClickListener;

  @Bindable
  protected View.OnClickListener mAttachFileClickListener;

  @Bindable
  protected View.OnTouchListener mVoiceRecordingTouchListener;

  @Bindable
  protected View.OnClickListener mCancelReplyToClickListener;

  @Bindable
  protected View.OnClickListener mScrollToBottomClickListener;

  @Bindable
  protected View.OnClickListener mGroupCallListener;

  @Bindable
  protected ChatRoomViewModel mViewModel;

  @Bindable
  protected ChatMessageSendingViewModel mChatSendingViewModel;

  @Bindable
  protected SharedMainViewModel mSharedMainViewModel;

  protected ChatRoomDetailFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView back, RecyclerView chatMessagesList,
      ChatRoomSendingBinding footer, MarqueeTextView lastSeenAt,
      FragmentContainerView listEditTopBarFragment, ImageView menu, TextView remoteComposing,
      LinearLayout topBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.back = back;
    this.chatMessagesList = chatMessagesList;
    this.footer = footer;
    this.lastSeenAt = lastSeenAt;
    this.listEditTopBarFragment = listEditTopBarFragment;
    this.menu = menu;
    this.remoteComposing = remoteComposing;
    this.topBar = topBar;
  }

  public abstract void setMenuClickListener(@Nullable View.OnClickListener menuClickListener);

  @Nullable
  public View.OnClickListener getMenuClickListener() {
    return mMenuClickListener;
  }

  public abstract void setMenuLongClickListener(
      @Nullable View.OnLongClickListener menuLongClickListener);

  @Nullable
  public View.OnLongClickListener getMenuLongClickListener() {
    return mMenuLongClickListener;
  }

  public abstract void setSecurityIconClickListener(
      @Nullable View.OnClickListener securityIconClickListener);

  @Nullable
  public View.OnClickListener getSecurityIconClickListener() {
    return mSecurityIconClickListener;
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

  public abstract void setScrollToBottomClickListener(
      @Nullable View.OnClickListener scrollToBottomClickListener);

  @Nullable
  public View.OnClickListener getScrollToBottomClickListener() {
    return mScrollToBottomClickListener;
  }

  public abstract void setGroupCallListener(@Nullable View.OnClickListener groupCallListener);

  @Nullable
  public View.OnClickListener getGroupCallListener() {
    return mGroupCallListener;
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

  public abstract void setSharedMainViewModel(@Nullable SharedMainViewModel sharedMainViewModel);

  @Nullable
  public SharedMainViewModel getSharedMainViewModel() {
    return mSharedMainViewModel;
  }

  @NonNull
  public static ChatRoomDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_detail_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChatRoomDetailFragmentBinding>inflateInternal(inflater, R.layout.chat_room_detail_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static ChatRoomDetailFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_room_detail_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatRoomDetailFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChatRoomDetailFragmentBinding>inflateInternal(inflater, R.layout.chat_room_detail_fragment, null, false, component);
  }

  public static ChatRoomDetailFragmentBinding bind(@NonNull View view) {
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
  public static ChatRoomDetailFragmentBinding bind(@NonNull View view, @Nullable Object component) {
    return (ChatRoomDetailFragmentBinding)bind(component, view, R.layout.chat_room_detail_fragment);
  }
}