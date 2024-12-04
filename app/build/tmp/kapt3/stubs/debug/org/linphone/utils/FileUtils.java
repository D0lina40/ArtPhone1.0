package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lorg/linphone/utils/FileUtils;", "", "()V", "Companion", "MimeType", "app_debug"})
public final class FileUtils {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.FileUtils.Companion Companion = null;
    
    public FileUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J#\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001d\u0010\u0015\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\bJ\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\bJ#\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\'\u0010$\u001a\u0004\u0018\u00010\b2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\bH\u0002J\u0010\u0010*\u001a\u00020\u00132\b\b\u0002\u0010+\u001a\u00020\u0006J\u000e\u0010,\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\bJ+\u0010-\u001a\b\u0012\u0004\u0012\u00020\b0.2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\'\u001a\u0004\u0018\u00010\u0013H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(J\u0010\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\bJ\u000e\u00102\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u00103\u001a\u00020\b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u00104\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\bJ\b\u00105\u001a\u00020\bH\u0002J\u000e\u00106\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bJ\u000e\u00107\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\bJ \u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\b2\b\b\u0002\u0010<\u001a\u00020\u0006J \u0010=\u001a\u00020\u00062\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\b2\b\b\u0002\u0010<\u001a\u00020\u0006J\u0016\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00020@2\u0006\u0010\u001a\u001a\u00020\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lorg/linphone/utils/FileUtils$Companion;", "", "()V", "clearExistingPlainFiles", "", "copyFileTo", "", "filePath", "", "outputStream", "Ljava/io/OutputStream;", "(Ljava/lang/String;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyFileToCache", "plainFilePath", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyToFile", "inputStream", "Ljava/io/InputStream;", "destFile", "Ljava/io/File;", "(Ljava/io/InputStream;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyToLocalStorage", "countFilesInDirectory", "", "path", "createFile", "file", "deleteFile", "getExtensionFromFileName", "fileName", "getFilePath", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFilePathFromPickerIntent", "data", "Landroid/content/Intent;", "temporaryImageFilePath", "(Landroid/content/Intent;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileStorageCacheDir", "getFileStorageDir", "isPicture", "getFileStoragePath", "getFilesPathFromPickerIntent", "", "getMimeType", "Lorg/linphone/utils/FileUtils$MimeType;", "type", "getNameFromFilePath", "getNameFromUri", "getPublicFilePath", "getStartDate", "isExtensionImage", "isExtensionVideo", "openFileInThirdPartyApp", "activity", "Landroid/app/Activity;", "contentFilePath", "newTask", "openMediaStoreFile", "writeIntoFile", "bytes", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getNameFromFilePath(@org.jetbrains.annotations.NotNull
        java.lang.String filePath) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getExtensionFromFileName(@org.jetbrains.annotations.NotNull
        java.lang.String fileName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.linphone.utils.FileUtils.MimeType getMimeType(@org.jetbrains.annotations.Nullable
        java.lang.String type) {
            return null;
        }
        
        public final boolean isExtensionImage(@org.jetbrains.annotations.NotNull
        java.lang.String path) {
            return false;
        }
        
        public final boolean isExtensionVideo(@org.jetbrains.annotations.NotNull
        java.lang.String path) {
            return false;
        }
        
        public final void clearExistingPlainFiles() {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.io.File getFileStorageDir(boolean isPicture) {
            return null;
        }
        
        private final java.io.File getFileStorageCacheDir(java.lang.String fileName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.io.File getFileStoragePath(@org.jetbrains.annotations.NotNull
        java.lang.String fileName) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getFilesPathFromPickerIntent(@org.jetbrains.annotations.Nullable
        android.content.Intent data, @org.jetbrains.annotations.Nullable
        java.io.File temporaryImageFilePath, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.util.List<java.lang.String>> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getFilePathFromPickerIntent(@org.jetbrains.annotations.Nullable
        android.content.Intent data, @org.jetbrains.annotations.Nullable
        java.io.File temporaryImageFilePath, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object copyToLocalStorage(@org.jetbrains.annotations.Nullable
        java.lang.String filePath, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
            return null;
        }
        
        public final void deleteFile(@org.jetbrains.annotations.NotNull
        java.lang.String filePath) {
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object getFilePath(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        android.net.Uri uri, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
            return null;
        }
        
        private final java.lang.String getNameFromUri(android.net.Uri uri, android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object copyFileTo(@org.jetbrains.annotations.NotNull
        java.lang.String filePath, @org.jetbrains.annotations.Nullable
        java.io.OutputStream outputStream, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
            return null;
        }
        
        private final java.lang.Object copyToFile(java.io.InputStream inputStream, java.io.File destFile, kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object copyFileToCache(@org.jetbrains.annotations.NotNull
        java.lang.String plainFilePath, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
            return null;
        }
        
        private final java.io.File createFile(java.lang.String file) {
            return null;
        }
        
        private final java.lang.String getStartDate() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.net.Uri getPublicFilePath(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String path) {
            return null;
        }
        
        public final boolean openFileInThirdPartyApp(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, @org.jetbrains.annotations.NotNull
        java.lang.String contentFilePath, boolean newTask) {
            return false;
        }
        
        public final boolean openMediaStoreFile(@org.jetbrains.annotations.NotNull
        android.app.Activity activity, @org.jetbrains.annotations.NotNull
        java.lang.String contentFilePath, boolean newTask) {
            return false;
        }
        
        public final void writeIntoFile(@org.jetbrains.annotations.NotNull
        byte[] bytes, @org.jetbrains.annotations.NotNull
        java.io.File file) {
        }
        
        public final int countFilesInDirectory(@org.jetbrains.annotations.NotNull
        java.lang.String path) {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b\u00a8\u0006\t"}, d2 = {"Lorg/linphone/utils/FileUtils$MimeType;", "", "(Ljava/lang/String;I)V", "PlainText", "Pdf", "Image", "Video", "Audio", "Unknown", "app_debug"})
    public static enum MimeType {
        /*public static final*/ PlainText /* = new PlainText() */,
        /*public static final*/ Pdf /* = new Pdf() */,
        /*public static final*/ Image /* = new Image() */,
        /*public static final*/ Video /* = new Video() */,
        /*public static final*/ Audio /* = new Audio() */,
        /*public static final*/ Unknown /* = new Unknown() */;
        
        MimeType() {
        }
    }
}