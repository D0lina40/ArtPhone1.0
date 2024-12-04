// Generated by data binding compiler. Do not edit!
package org.linphone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.linphone.R;

public abstract class ChatMessageLongPressMenuBinding extends ViewDataBinding {
  @NonNull
  public final TextView laughing;

  @NonNull
  public final TextView love;

  @NonNull
  public final TextView surprised;

  @NonNull
  public final TextView tear;

  @NonNull
  public final TextView thumbsUp;

  @Bindable
  protected View.OnClickListener mEmojiClickListener;

  @Bindable
  protected View.OnClickListener mResendClickListener;

  @Bindable
  protected View.OnClickListener mCopyTextClickListener;

  @Bindable
  protected View.OnClickListener mForwardClickListener;

  @Bindable
  protected View.OnClickListener mReplyClickListener;

  @Bindable
  protected View.OnClickListener mImdnClickListener;

  @Bindable
  protected View.OnClickListener mAddToContactsClickListener;

  @Bindable
  protected View.OnClickListener mDeleteClickListener;

  @Bindable
  protected Boolean mResendHidden;

  @Bindable
  protected Boolean mImdnHidden;

  @Bindable
  protected Boolean mCopyTextHidden;

  @Bindable
  protected Boolean mForwardHidden;

  @Bindable
  protected Boolean mAddToContactsHidden;

  @Bindable
  protected Boolean mReplyHidden;

  @Bindable
  protected Boolean mHeartSelected;

  @Bindable
  protected Boolean mThumbsUpSelected;

  @Bindable
  protected Boolean mLaughingSelected;

  @Bindable
  protected Boolean mSurprisedSelected;

  @Bindable
  protected Boolean mCryingSelected;

  protected ChatMessageLongPressMenuBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView laughing, TextView love, TextView surprised, TextView tear,
      TextView thumbsUp) {
    super(_bindingComponent, _root, _localFieldCount);
    this.laughing = laughing;
    this.love = love;
    this.surprised = surprised;
    this.tear = tear;
    this.thumbsUp = thumbsUp;
  }

  public abstract void setEmojiClickListener(@Nullable View.OnClickListener emojiClickListener);

  @Nullable
  public View.OnClickListener getEmojiClickListener() {
    return mEmojiClickListener;
  }

  public abstract void setResendClickListener(@Nullable View.OnClickListener resendClickListener);

  @Nullable
  public View.OnClickListener getResendClickListener() {
    return mResendClickListener;
  }

  public abstract void setCopyTextClickListener(
      @Nullable View.OnClickListener copyTextClickListener);

  @Nullable
  public View.OnClickListener getCopyTextClickListener() {
    return mCopyTextClickListener;
  }

  public abstract void setForwardClickListener(@Nullable View.OnClickListener forwardClickListener);

  @Nullable
  public View.OnClickListener getForwardClickListener() {
    return mForwardClickListener;
  }

  public abstract void setReplyClickListener(@Nullable View.OnClickListener replyClickListener);

  @Nullable
  public View.OnClickListener getReplyClickListener() {
    return mReplyClickListener;
  }

  public abstract void setImdnClickListener(@Nullable View.OnClickListener imdnClickListener);

  @Nullable
  public View.OnClickListener getImdnClickListener() {
    return mImdnClickListener;
  }

  public abstract void setAddToContactsClickListener(
      @Nullable View.OnClickListener addToContactsClickListener);

  @Nullable
  public View.OnClickListener getAddToContactsClickListener() {
    return mAddToContactsClickListener;
  }

  public abstract void setDeleteClickListener(@Nullable View.OnClickListener deleteClickListener);

  @Nullable
  public View.OnClickListener getDeleteClickListener() {
    return mDeleteClickListener;
  }

  public abstract void setResendHidden(@Nullable Boolean resendHidden);

  @Nullable
  public Boolean getResendHidden() {
    return mResendHidden;
  }

  public abstract void setImdnHidden(@Nullable Boolean imdnHidden);

  @Nullable
  public Boolean getImdnHidden() {
    return mImdnHidden;
  }

  public abstract void setCopyTextHidden(@Nullable Boolean copyTextHidden);

  @Nullable
  public Boolean getCopyTextHidden() {
    return mCopyTextHidden;
  }

  public abstract void setForwardHidden(@Nullable Boolean forwardHidden);

  @Nullable
  public Boolean getForwardHidden() {
    return mForwardHidden;
  }

  public abstract void setAddToContactsHidden(@Nullable Boolean addToContactsHidden);

  @Nullable
  public Boolean getAddToContactsHidden() {
    return mAddToContactsHidden;
  }

  public abstract void setReplyHidden(@Nullable Boolean replyHidden);

  @Nullable
  public Boolean getReplyHidden() {
    return mReplyHidden;
  }

  public abstract void setHeartSelected(@Nullable Boolean heartSelected);

  @Nullable
  public Boolean getHeartSelected() {
    return mHeartSelected;
  }

  public abstract void setThumbsUpSelected(@Nullable Boolean thumbsUpSelected);

  @Nullable
  public Boolean getThumbsUpSelected() {
    return mThumbsUpSelected;
  }

  public abstract void setLaughingSelected(@Nullable Boolean laughingSelected);

  @Nullable
  public Boolean getLaughingSelected() {
    return mLaughingSelected;
  }

  public abstract void setSurprisedSelected(@Nullable Boolean surprisedSelected);

  @Nullable
  public Boolean getSurprisedSelected() {
    return mSurprisedSelected;
  }

  public abstract void setCryingSelected(@Nullable Boolean cryingSelected);

  @Nullable
  public Boolean getCryingSelected() {
    return mCryingSelected;
  }

  @NonNull
  public static ChatMessageLongPressMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_message_long_press_menu, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ChatMessageLongPressMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ChatMessageLongPressMenuBinding>inflateInternal(inflater, R.layout.chat_message_long_press_menu, root, attachToRoot, component);
  }

  @NonNull
  public static ChatMessageLongPressMenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.chat_message_long_press_menu, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ChatMessageLongPressMenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ChatMessageLongPressMenuBinding>inflateInternal(inflater, R.layout.chat_message_long_press_menu, null, false, component);
  }

  public static ChatMessageLongPressMenuBinding bind(@NonNull View view) {
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
  public static ChatMessageLongPressMenuBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ChatMessageLongPressMenuBinding)bind(component, view, R.layout.chat_message_long_press_menu);
  }
}