package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lorg/linphone/utils/PhoneNumberUtils;", "", "()V", "Companion", "app_debug"})
public final class PhoneNumberUtils {
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.utils.PhoneNumberUtils.Companion Companion = null;
    
    public PhoneNumberUtils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0002J\u0016\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0004\u00a8\u0006\u001b"}, d2 = {"Lorg/linphone/utils/PhoneNumberUtils$Companion;", "", "()V", "addressBookLabelTypeToVcardParamString", "", "type", "", "default", "arePhoneNumberWeakEqual", "", "number1", "number2", "getDevicePhoneNumber", "context", "Landroid/content/Context;", "getDialPlanForCurrentCountry", "Lorg/linphone/core/DialPlan;", "getDialPlanFromCountryCallingPrefix", "countryCode", "getDialPlanFromCountryCode", "labelToType", "label", "trimPhoneNumber", "phoneNumber", "vcardParamStringToAddressBookLabel", "resources", "Landroid/content/res/Resources;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.linphone.core.DialPlan getDialPlanForCurrentCountry(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"MissingPermission", "HardwareIds"})
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getDevicePhoneNumber(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final org.linphone.core.DialPlan getDialPlanFromCountryCallingPrefix(@org.jetbrains.annotations.NotNull
        java.lang.String countryCode) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String addressBookLabelTypeToVcardParamString(int type, @org.jetbrains.annotations.Nullable
        java.lang.String p1_772401952) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String vcardParamStringToAddressBookLabel(@org.jetbrains.annotations.NotNull
        android.content.res.Resources resources, @org.jetbrains.annotations.NotNull
        java.lang.String label) {
            return null;
        }
        
        private final int labelToType(java.lang.String label) {
            return 0;
        }
        
        private final org.linphone.core.DialPlan getDialPlanFromCountryCode(java.lang.String countryCode) {
            return null;
        }
        
        public final boolean arePhoneNumberWeakEqual(@org.jetbrains.annotations.NotNull
        java.lang.String number1, @org.jetbrains.annotations.NotNull
        java.lang.String number2) {
            return false;
        }
        
        private final java.lang.String trimPhoneNumber(java.lang.String phoneNumber) {
            return null;
        }
    }
}