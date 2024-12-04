package org.linphone.generated.callback;
public final class EmojiPickedListener implements org.linphone.utils.EmojiPickedListener {
    final Listener mListener;
    final int mSourceId;
    public EmojiPickedListener(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void onEmojiPicked(androidx.emoji2.emojipicker.EmojiViewItem callbackArg_0) {
        mListener._internalCallbackOnEmojiPicked(mSourceId , callbackArg_0);
    }
    public interface Listener {
        void _internalCallbackOnEmojiPicked(int sourceId , androidx.emoji2.emojipicker.EmojiViewItem callbackArg_0);
    }
}