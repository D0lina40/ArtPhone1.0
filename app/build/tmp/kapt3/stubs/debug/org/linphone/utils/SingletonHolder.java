package org.linphone.utils;

/**
 * Helper class to create singletons like CoreContext.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\u0006\b\u0001\u0010\u0003 \u00002\u00020\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011J\u000b\u0010\u0012\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\rR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00018\u0000X\u0088\u000e\u00a2\u0006\u0004\n\u0002\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lorg/linphone/utils/SingletonHolder;", "T", "", "A", "creator", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)V", "getCreator", "()Lkotlin/jvm/functions/Function1;", "instance", "Ljava/lang/Object;", "create", "arg", "(Ljava/lang/Object;)Ljava/lang/Object;", "destroy", "", "exists", "", "get", "()Ljava/lang/Object;", "required", "app_debug"})
public class SingletonHolder<T extends java.lang.Object, A extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function1<A, T> creator = null;
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile T instance;
    
    public SingletonHolder(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super A, ? extends T> creator) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<A, T> getCreator() {
        return null;
    }
    
    public final boolean exists() {
        return false;
    }
    
    public final void destroy() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final T get() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final T create(A arg) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final T required(A arg) {
        return null;
    }
}