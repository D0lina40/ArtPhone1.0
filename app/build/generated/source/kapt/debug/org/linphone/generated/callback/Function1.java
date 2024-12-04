package org.linphone.generated.callback;
public final class Function1 implements kotlin.jvm.functions.Function1 {
    final Listener mListener;
    final int mSourceId;
    public Function1(Listener listener, int sourceId) {
        mListener = listener;
        mSourceId = sourceId;
    }
    @Override
    public kotlin.Unit invoke(java.lang.Object callbackArg_0) {
        return mListener._internalCallbackInvoke1(mSourceId , callbackArg_0);
    }
    public interface Listener {
        kotlin.Unit _internalCallbackInvoke1(int sourceId , java.lang.Object callbackArg_0);
    }
}