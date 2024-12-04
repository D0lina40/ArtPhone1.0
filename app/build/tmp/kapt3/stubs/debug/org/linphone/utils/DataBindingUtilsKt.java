package org.linphone.utils;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\u00f6\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0007\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001e\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007\u001a\u001e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0010H\u0007\u001a\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u001a\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u001a\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007\u001a\u001a\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007\u001a_\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u001e2\b\b\u0002\u0010!\u001a\u00020\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#\u001a\u001a\u0010$\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u001a\u0010%\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u001a\u0010&\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007\u001a(\u0010&\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020(\u001a\u001a\u0010*\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u001a\u0010+\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007\u001a\u001a\u0010,\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u001a\u0010-\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007\u001a\u001a\u0010.\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007\u001a\u0018\u0010/\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007\u001a\u0018\u00103\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007\u001a\u0018\u00104\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007\u001a\u0018\u00105\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u00101\u001a\u000202H\u0007\u001a\u001a\u00106\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u00010\u0013H\u0007\u001a\u0018\u00108\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00109\u001a\u00020:H\u0007\u001a\u0018\u0010;\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u000200H\u0007\u001a.\u0010<\u001a\u00020\u0001\"\u0004\b\u0000\u0010=2\u0006\u0010>\u001a\u00020?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u0002H=\u0018\u00010A2\u0006\u0010B\u001a\u00020\u001eH\u0007\u001a8\u0010<\u001a\u00020\u0001\"\u0004\b\u0000\u0010=2\u0006\u0010>\u001a\u00020?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u0002H=\u0018\u00010A2\u0006\u0010B\u001a\u00020\u001e2\b\u0010C\u001a\u0004\u0018\u00010DH\u0007\u001aB\u0010<\u001a\u00020\u0001\"\u0004\b\u0000\u0010=2\u0006\u0010>\u001a\u00020?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u0002H=\u0018\u00010A2\u0006\u0010B\u001a\u00020\u001e2\b\u0010C\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010FH\u0002\u001a8\u0010<\u001a\u00020\u0001\"\u0004\b\u0000\u0010=2\u0006\u0010>\u001a\u00020?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u0002H=\u0018\u00010A2\u0006\u0010B\u001a\u00020\u001e2\b\u0010E\u001a\u0004\u0018\u00010FH\u0007\u001a \u0010<\u001a\u00020\u00012\u0006\u0010>\u001a\u00020?2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010AH\u0007\u001a\u0018\u0010H\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010I\u001a\u00020JH\u0007\u001a\u0018\u0010K\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u0010L\u001a\u00020\u0005H\u0007\u001a\u0018\u0010M\u001a\u00020\u00012\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u000202H\u0007\u001a\u0018\u0010Q\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u0010R\u001a\u00020\u001eH\u0007\u001a \u0010S\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u0010T\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020\u001eH\u0007\u001a \u0010V\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u0010T\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020\u001eH\u0007\u001a \u0010W\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u0010T\u001a\u00020\u001e2\u0006\u0010U\u001a\u00020\u001eH\u0007\u001a\u0018\u0010X\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u0010Y\u001a\u000202H\u0007\u001a$\u0010Z\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020[2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020F\u0012\u0004\u0012\u00020\u00010\\H\u0007\u001a\u0018\u0010]\u001a\u00020\u00012\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aH\u0007\u001a\u0018\u0010b\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u0010Y\u001a\u000202H\u0007\u001a\"\u0010c\u001a\u00020\u00012\u0006\u0010d\u001a\u00020e2\u0006\u0010f\u001a\u00020\u001e2\b\u0010g\u001a\u0004\u0018\u00010hH\u0007\u001a\u0018\u0010i\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u0002002\u0006\u0010j\u001a\u00020\u001eH\u0007\u001a\u000e\u0010k\u001a\u0004\u0018\u00010F*\u00020eH\u0007\u001a\n\u0010l\u001a\u00020\u0001*\u000200\u001a\u0014\u0010m\u001a\u00020\u0001*\u00020n2\u0006\u0010o\u001a\u00020\u001eH\u0007\u001a\u0014\u0010p\u001a\u00020\u0001*\u00020\u00162\u0006\u0010o\u001a\u00020\u001eH\u0007\u001a\u0014\u0010q\u001a\u00020\u0001*\u00020r2\u0006\u0010g\u001a\u00020sH\u0007\u001a\u001c\u0010<\u001a\u00020\u0001*\u00020e2\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020F\u0018\u00010AH\u0007\u001a\u0014\u0010t\u001a\u00020\u0001*\u00020e2\u0006\u0010g\u001a\u00020:H\u0007\u001a\u0014\u0010u\u001a\u00020\u0001*\u00020v2\u0006\u0010w\u001a\u00020\u001eH\u0007\u001a-\u0010x\u001a\u00020\u0001*\u0002002!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\by\u0012\b\bz\u0012\u0004\b\b({\u0012\u0004\u0012\u00020\u00010\\\u001a\u0014\u0010|\u001a\u00020\u0001*\u0002002\u0006\u0010}\u001a\u000202H\u0007\u001a\u0017\u0010~\u001a\u00020\u0001*\u00020\u00162\t\u0010\u007f\u001a\u0005\u0018\u00010\u0080\u0001H\u0007\u001a\u0017\u0010\u0081\u0001\u001a\u00020\u0001*\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u001eH\u0007\u001a\u0017\u0010\u0084\u0001\u001a\u00020\u0001*\u00030\u0082\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u001eH\u0007\u001a\u0017\u0010\u0086\u0001\u001a\u00020\u0001*\u00030\u0082\u00012\u0007\u0010\u0083\u0001\u001a\u00020\u001eH\u0007\u001a\u0016\u0010\u0087\u0001\u001a\u00020\u0001*\u00030\u0082\u00012\u0006\u0010 \u001a\u00020\u001eH\u0007\u001a\u0016\u0010\u0088\u0001\u001a\u00020\u0001*\u00020v2\u0007\u0010\u0089\u0001\u001a\u00020\u001eH\u0007\u001a\u0018\u0010\u008a\u0001\u001a\u00020\u0001*\u00020e2\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010FH\u0007\u001a\u0015\u0010\u008c\u0001\u001a\u00020\u0001*\u00020\u00162\u0006\u0010o\u001a\u00020\u001eH\u0007\u001a\u0016\u0010\u008d\u0001\u001a\u00020\u0001*\u00030\u008e\u00012\u0006\u0010o\u001a\u00020\u001eH\u0007\u001a\u0018\u0010\u008f\u0001\u001a\u00020\u0001*\u0002002\t\u0010g\u001a\u0005\u0018\u00010\u0090\u0001H\u0007\u001a\u0017\u0010\u0091\u0001\u001a\u00020\u0001*\u00030\u008e\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u001eH\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0093\u0001"}, d2 = {"addEmailEditTextValidation", "", "editText", "Landroid/widget/EditText;", "enabled", "", "addPasswordConfirmationEditTextValidation", "password", "passwordConfirmation", "addPhoneNumberEditTextValidation", "addPrefixEditTextValidation", "addUrlEditTextValidation", "addUsernameEditTextValidation", "editTextImeDone", "view", "lambda", "Lkotlin/Function0;", "editTextSetting", "getEditTextError", "", "loadAvatarWithCoil", "imageView", "Landroid/widget/ImageView;", "path", "loadBigContactPictureWithCoil", "contact", "Lorg/linphone/contact/ContactDataInterface;", "loadContactPictureWithCoil", "useThumbnail", "size", "", "textSize", "color", "textColor", "defaultAvatar", "(Landroid/widget/ImageView;Lorg/linphone/contact/ContactDataInterface;ZIIIILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadImageInChatBubbleWithCoil", "loadImageInChatGridBubbleWithCoil", "loadImageWithCoil", "width", "Lcoil/size/Dimension;", "height", "loadRoundImageWithCoil", "loadSelfAvatarWithCoil", "loadVideoPreview", "loadVoipContactPictureWithCoil", "loadVoipContactPictureWithCoilAlt", "setConstraintLayoutBottomMargin", "Landroid/view/View;", "margins", "", "setConstraintLayoutEndMargin", "setConstraintLayoutMargins", "setConstraintLayoutTopMargin", "setEditTextError", "error", "setEditTextErrorListener", "attrChange", "Landroidx/databinding/InverseBindingListener;", "setEditTextOnFocusChangeVisibilityOf", "setEntries", "T", "viewGroup", "Landroid/view/ViewGroup;", "entries", "", "layoutId", "onLongClick", "Landroid/view/View$OnLongClickListener;", "parent", "", "Landroidx/databinding/ViewDataBinding;", "setImageViewScaleType", "scaleType", "Landroid/widget/ImageView$ScaleType;", "setInflatedViewStubLifecycleOwner", "enable", "setLayoutConstraintGuidePercent", "guideline", "Landroidx/constraintlayout/widget/Guideline;", "percent", "setLayoutGravity", "gravity", "setLayoutLeftAlign", "oldTargetId", "newTargetId", "setLayoutRightAlign", "setLayoutToLeftOf", "setLeftMargin", "margin", "setListener", "Landroid/widget/SeekBar;", "Lkotlin/Function1;", "setParticipantTextureView", "textureView", "Landroid/view/TextureView;", "conferenceParticipantData", "Lorg/linphone/activities/voip/data/ConferenceParticipantDeviceData;", "setRightMargin", "spinnerSetting", "spinner", "Landroid/widget/Spinner;", "selectedIndex", "listener", "Lorg/linphone/activities/main/settings/SettingListener;", "switchSetting", "switchId", "getSelectedValue", "hideKeyboard", "setBackgroundImage", "Landroid/widget/LinearLayout;", "resource", "setContentDescription", "setEmojiPickedListener", "Landroidx/emoji2/emojipicker/EmojiPickerView;", "Lorg/linphone/utils/EmojiPickedListener;", "setInverseBindingListener", "setItems", "Lorg/linphone/activities/voip/views/ScrollDotsView;", "count", "setKeyboardInsetListener", "Lkotlin/ParameterName;", "name", "visible", "setLayoutSize", "dimension", "setPresenceIcon", "presence", "Lorg/linphone/core/ConsolidatedPresence;", "setPrimaryProgress", "Lorg/linphone/views/VoiceRecordProgressBar;", "progress", "setProgressMax", "max", "setSecProgress", "setSecProgressTint", "setSelectedIndex", "index", "setSelectedValue", "value", "setSourceImageResource", "setStyle", "Landroid/widget/TextView;", "setTouchListener", "Landroid/view/View$OnTouchListener;", "setTypeface", "typeface", "app_debug"})
public final class DataBindingUtilsKt {
    
    /**
     * This file contains all the data binding necessary for the app
     */
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.view.View $this$hideKeyboard) {
    }
    
    public static final void setKeyboardInsetListener(@org.jetbrains.annotations.NotNull
    android.view.View $this$setKeyboardInsetListener, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> lambda) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:src"})
    public static final void setSourceImageResource(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$setSourceImageResource, int resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:contentDescription"})
    public static final void setContentDescription(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$setContentDescription, int resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:textStyle"})
    public static final void setTypeface(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setTypeface, int typeface) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_size"})
    public static final void setLayoutSize(@org.jetbrains.annotations.NotNull
    android.view.View $this$setLayoutSize, float dimension) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"backgroundImage"})
    public static final void setBackgroundImage(@org.jetbrains.annotations.NotNull
    android.widget.LinearLayout $this$setBackgroundImage, int resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"style"})
    @kotlin.Suppress(names = {"DEPRECATION"})
    public static final void setStyle(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setStyle, int resource) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_marginLeft"})
    public static final void setLeftMargin(@org.jetbrains.annotations.NotNull
    android.view.View view, float margin) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_marginRight"})
    public static final void setRightMargin(@org.jetbrains.annotations.NotNull
    android.view.View view, float margin) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_alignLeft"})
    public static final void setLayoutLeftAlign(@org.jetbrains.annotations.NotNull
    android.view.View view, int oldTargetId, int newTargetId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_alignRight"})
    public static final void setLayoutRightAlign(@org.jetbrains.annotations.NotNull
    android.view.View view, int oldTargetId, int newTargetId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_toLeftOf"})
    public static final void setLayoutToLeftOf(@org.jetbrains.annotations.NotNull
    android.view.View view, int oldTargetId, int newTargetId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_gravity"})
    public static final void setLayoutGravity(@org.jetbrains.annotations.NotNull
    android.view.View view, int gravity) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"layout_constraintGuide_percent"})
    public static final void setLayoutConstraintGuidePercent(@org.jetbrains.annotations.NotNull
    androidx.constraintlayout.widget.Guideline guideline, float percent) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onClickToggleSwitch"})
    public static final void switchSetting(@org.jetbrains.annotations.NotNull
    android.view.View view, int switchId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onValueChanged"})
    public static final void editTextSetting(@org.jetbrains.annotations.NotNull
    android.widget.EditText view, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> lambda) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onSettingImeDone"})
    public static final void editTextImeDone(@org.jetbrains.annotations.NotNull
    android.widget.EditText view, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> lambda) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onFocusChangeVisibilityOf"})
    public static final void setEditTextOnFocusChangeVisibilityOf(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"selectedIndex", "settingListener"})
    public static final void spinnerSetting(@org.jetbrains.annotations.NotNull
    android.widget.Spinner spinner, int selectedIndex, @org.jetbrains.annotations.Nullable
    org.linphone.activities.main.settings.SettingListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"onProgressChanged"})
    public static final void setListener(@org.jetbrains.annotations.NotNull
    android.widget.SeekBar view, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit> lambda) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"inflatedLifecycleOwner"})
    public static final void setInflatedViewStubLifecycleOwner(@org.jetbrains.annotations.NotNull
    android.view.View view, boolean enable) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"entries"})
    public static final void setEntries(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup viewGroup, @org.jetbrains.annotations.Nullable
    java.util.List<? extends androidx.databinding.ViewDataBinding> entries) {
    }
    
    private static final <T extends java.lang.Object>void setEntries(android.view.ViewGroup viewGroup, java.util.List<? extends T> entries, int layoutId, android.view.View.OnLongClickListener onLongClick, java.lang.Object parent) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"entries", "layout"})
    public static final <T extends java.lang.Object>void setEntries(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup viewGroup, @org.jetbrains.annotations.Nullable
    java.util.List<? extends T> entries, int layoutId) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"entries", "layout", "onLongClick"})
    public static final <T extends java.lang.Object>void setEntries(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup viewGroup, @org.jetbrains.annotations.Nullable
    java.util.List<? extends T> entries, int layoutId, @org.jetbrains.annotations.Nullable
    android.view.View.OnLongClickListener onLongClick) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"entries", "layout", "parent"})
    public static final <T extends java.lang.Object>void setEntries(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup viewGroup, @org.jetbrains.annotations.Nullable
    java.util.List<? extends T> entries, int layoutId, @org.jetbrains.annotations.Nullable
    java.lang.Object parent) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:scaleType"})
    public static final void setImageViewScaleType(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull
    android.widget.ImageView.ScaleType scaleType) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilRounded"})
    public static final void loadRoundImageWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String path) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilBubble"})
    public static final void loadImageInChatBubbleWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String path) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilGrid"})
    public static final void loadImageInChatGridBubbleWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String path) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coil"})
    public static final void loadImageWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String path) {
    }
    
    public static final void loadImageWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String path, @org.jetbrains.annotations.NotNull
    coil.size.Dimension width, @org.jetbrains.annotations.NotNull
    coil.size.Dimension height) {
    }
    
    private static final java.lang.Object loadContactPictureWithCoil(android.widget.ImageView imageView, org.linphone.contact.ContactDataInterface contact, boolean useThumbnail, int size, int textSize, int color, int textColor, java.lang.String defaultAvatar, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilContact"})
    public static final void loadContactPictureWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    org.linphone.contact.ContactDataInterface contact) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilContactBig"})
    public static final void loadBigContactPictureWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    org.linphone.contact.ContactDataInterface contact) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilVoipContactAlt"})
    public static final void loadVoipContactPictureWithCoilAlt(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    org.linphone.contact.ContactDataInterface contact) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilVoipContact"})
    public static final void loadVoipContactPictureWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    org.linphone.contact.ContactDataInterface contact) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilSelfAvatar"})
    public static final void loadSelfAvatarWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    org.linphone.contact.ContactDataInterface contact) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilGoneIfError"})
    public static final void loadAvatarWithCoil(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String path) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"coilVideoPreview"})
    public static final void loadVideoPreview(@org.jetbrains.annotations.NotNull
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable
    java.lang.String path) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"assistantPhoneNumberValidation"})
    public static final void addPhoneNumberEditTextValidation(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, boolean enabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"assistantPhoneNumberPrefixValidation"})
    public static final void addPrefixEditTextValidation(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, boolean enabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"assistantUsernameValidation"})
    public static final void addUsernameEditTextValidation(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, boolean enabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"emailConfirmationValidation"})
    public static final void addEmailEditTextValidation(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, boolean enabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"urlConfirmationValidation"})
    public static final void addUrlEditTextValidation(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, boolean enabled) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"passwordConfirmationValidation"})
    public static final void addPasswordConfirmationEditTextValidation(@org.jetbrains.annotations.NotNull
    android.widget.EditText password, @org.jetbrains.annotations.NotNull
    android.widget.EditText passwordConfirmation) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"errorMessage"})
    public static final void setEditTextError(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, @org.jetbrains.annotations.Nullable
    java.lang.String error) {
    }
    
    @androidx.databinding.InverseBindingAdapter(attribute = "errorMessage")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getEditTextError(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"errorMessageAttrChanged"})
    public static final void setEditTextErrorListener(@org.jetbrains.annotations.NotNull
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull
    androidx.databinding.InverseBindingListener attrChange) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"max"})
    public static final void setProgressMax(@org.jetbrains.annotations.NotNull
    org.linphone.views.VoiceRecordProgressBar $this$setProgressMax, int max) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:progress"})
    public static final void setPrimaryProgress(@org.jetbrains.annotations.NotNull
    org.linphone.views.VoiceRecordProgressBar $this$setPrimaryProgress, int progress) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:secondaryProgress"})
    public static final void setSecProgress(@org.jetbrains.annotations.NotNull
    org.linphone.views.VoiceRecordProgressBar $this$setSecProgress, int progress) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"secondaryProgressTint"})
    public static final void setSecProgressTint(@org.jetbrains.annotations.NotNull
    org.linphone.views.VoiceRecordProgressBar $this$setSecProgressTint, int color) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_margin"})
    public static final void setConstraintLayoutMargins(@org.jetbrains.annotations.NotNull
    android.view.View view, float margins) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_marginTop"})
    public static final void setConstraintLayoutTopMargin(@org.jetbrains.annotations.NotNull
    android.view.View view, float margins) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_marginBottom"})
    public static final void setConstraintLayoutBottomMargin(@org.jetbrains.annotations.NotNull
    android.view.View view, float margins) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:layout_marginEnd"})
    public static final void setConstraintLayoutEndMargin(@org.jetbrains.annotations.NotNull
    android.view.View view, float margins) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"android:onTouch"})
    public static final void setTouchListener(@org.jetbrains.annotations.NotNull
    android.view.View $this$setTouchListener, @org.jetbrains.annotations.Nullable
    android.view.View.OnTouchListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"entries"})
    public static final void setEntries(@org.jetbrains.annotations.NotNull
    android.widget.Spinner $this$setEntries, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> entries) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"selectedValueAttrChanged"})
    public static final void setInverseBindingListener(@org.jetbrains.annotations.NotNull
    android.widget.Spinner $this$setInverseBindingListener, @org.jetbrains.annotations.NotNull
    androidx.databinding.InverseBindingListener listener) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"selectedValue"})
    public static final void setSelectedValue(@org.jetbrains.annotations.NotNull
    android.widget.Spinner $this$setSelectedValue, @org.jetbrains.annotations.Nullable
    java.lang.Object value) {
    }
    
    @androidx.databinding.InverseBindingAdapter(attribute = "selectedValue", event = "selectedValueAttrChanged")
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object getSelectedValue(@org.jetbrains.annotations.NotNull
    android.widget.Spinner $this$getSelectedValue) {
        return null;
    }
    
    @androidx.databinding.BindingAdapter(value = {"participantTextureView"})
    public static final void setParticipantTextureView(@org.jetbrains.annotations.NotNull
    android.view.TextureView textureView, @org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.data.ConferenceParticipantDeviceData conferenceParticipantData) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"itemCount"})
    public static final void setItems(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.views.ScrollDotsView $this$setItems, int count) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"selectedDot"})
    public static final void setSelectedIndex(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.views.ScrollDotsView $this$setSelectedIndex, int index) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"presenceIcon"})
    public static final void setPresenceIcon(@org.jetbrains.annotations.NotNull
    android.widget.ImageView $this$setPresenceIcon, @org.jetbrains.annotations.Nullable
    org.linphone.core.ConsolidatedPresence presence) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"emojiPickedListener"})
    public static final void setEmojiPickedListener(@org.jetbrains.annotations.NotNull
    androidx.emoji2.emojipicker.EmojiPickerView $this$setEmojiPickedListener, @org.jetbrains.annotations.NotNull
    org.linphone.utils.EmojiPickedListener listener) {
    }
}