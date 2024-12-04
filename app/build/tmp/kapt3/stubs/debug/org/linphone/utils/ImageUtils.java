package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/utils/ImageUtils;", "", "()V", "Companion", "app_debug"})
public final class ImageUtils {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String BASE64_REGEX = "^data:image\\/(gif|png|jpeg|bmp|webp|svg\\+xml)(;charset=utf-8)?;base64,[A-Za-z0-9+\\/]+={0,2}$";
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.ImageUtils.Companion Companion = null;
    
    public ImageUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\u0016\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/linphone/utils/ImageUtils$Companion;", "", "()V", "BASE64_REGEX", "", "getBase64ImageFromString", "", "base64", "getRoundBitmap", "Landroid/graphics/Bitmap;", "bitmap", "getRoundBitmapFromUri", "context", "Landroid/content/Context;", "fromPictureUri", "Landroid/net/Uri;", "isBase64", "", "source", "rotateImage", "angle", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isBase64(@org.jetbrains.annotations.NotNull
        java.lang.String source) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable
        public final byte[] getBase64ImageFromString(@org.jetbrains.annotations.NotNull
        java.lang.String base64) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.graphics.Bitmap getRoundBitmapFromUri(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.Nullable
        android.net.Uri fromPictureUri) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.graphics.Bitmap rotateImage(@org.jetbrains.annotations.NotNull
        android.graphics.Bitmap source, float angle) {
            return null;
        }
        
        private final android.graphics.Bitmap getRoundBitmap(android.graphics.Bitmap bitmap) {
            return null;
        }
    }
}