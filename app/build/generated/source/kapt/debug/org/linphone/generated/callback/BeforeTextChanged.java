package org.linphone.generated.callback;
public final class BeforeTextChanged implements androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged {
    final Listener mListener;
    final int mSourceId;
    public BeforeTextChanged(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public void beforeTextChanged(java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3) {
        mListener._internalCallbackBeforeTextChanged(mSourceId , callbackArg_0, callbackArg_1, callbackArg_2, callbackArg_3);
    }
    public interface Listener {
        void _internalCallbackBeforeTextChanged(int sourceId , java.lang.CharSequence callbackArg_0, int callbackArg_1, int callbackArg_2, int callbackArg_3);
    }
}