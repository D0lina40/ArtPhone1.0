package org.linphone.utils;

/**
 * This class allows to limit the number of notification for an event.
 * The first one to consume the event will stop the dispatch.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u000bJ\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/linphone/utils/Event;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "handled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "consume", "", "handleContent", "Lkotlin/Function1;", "consumed", "", "app_debug"})
public class Event<T extends java.lang.Object> {
    private final T content = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicBoolean handled = null;
    
    public Event(T content) {
        super();
    }
    
    public final boolean consumed() {
        return false;
    }
    
    public final void consume(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> handleContent) {
    }
}