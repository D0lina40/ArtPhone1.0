package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/utils/TimestampUtils;", "", "()V", "Companion", "app_debug"})
public final class TimestampUtils {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.TimestampUtils.Companion Companion = null;
    
    public TimestampUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0016\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\r\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0016\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u0018\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ6\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b\u00a8\u0006\u001f"}, d2 = {"Lorg/linphone/utils/TimestampUtils$Companion;", "", "()V", "dateToString", "", "date", "", "timestampInSecs", "", "durationToString", "hours", "", "minutes", "isSameDay", "cal1", "Ljava/util/Calendar;", "cal2", "Ljava/util/Date;", "timestamp1", "timestamp2", "isSameYear", "timestamp", "isToday", "isYesterday", "timeToString", "hour", "time", "toString", "onlyDate", "shortDate", "hideYear", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final boolean isToday(long timestamp, boolean timestampInSecs) {
            return false;
        }
        
        public final boolean isYesterday(long timestamp, boolean timestampInSecs) {
            return false;
        }
        
        public final boolean isSameDay(long timestamp1, long timestamp2, boolean timestampInSecs) {
            return false;
        }
        
        public final boolean isSameDay(@org.jetbrains.annotations.NotNull
        java.util.Date cal1, @org.jetbrains.annotations.NotNull
        java.util.Date cal2) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String dateToString(long date, boolean timestampInSecs) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String timeToString(int hour, int minutes) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String timeToString(long time, boolean timestampInSecs) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String durationToString(int hours, int minutes) {
            return null;
        }
        
        private final boolean isSameYear(long timestamp, boolean timestampInSecs) {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String toString(long timestamp, boolean onlyDate, boolean timestampInSecs, boolean shortDate, boolean hideYear) {
            return null;
        }
        
        private final boolean isSameDay(java.util.Calendar cal1, java.util.Calendar cal2) {
            return false;
        }
        
        private final boolean isSameYear(java.util.Calendar cal1, java.util.Calendar cal2) {
            return false;
        }
    }
}