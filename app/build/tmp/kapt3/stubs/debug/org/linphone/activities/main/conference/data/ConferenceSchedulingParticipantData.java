package org.linphone.activities.main.conference.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012%\b\u0002\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u0012%\b\u0002\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u001f\u001a\u00020\u000eR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0013R+\u0010\t\u001a\u001f\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\u0000\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015\u00a8\u0006 "}, d2 = {"Lorg/linphone/activities/main/conference/data/ConferenceSchedulingParticipantData;", "Lorg/linphone/contact/GenericContactData;", "sipAddress", "Lorg/linphone/core/Address;", "showLimeBadge", "", "showDivider", "showBroadcastControls", "speaker", "onAddedToSpeakers", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "data", "", "onRemovedFromSpeakers", "(Lorg/linphone/core/Address;ZZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "isSpeaker", "Landroidx/lifecycle/MutableLiveData;", "()Landroidx/lifecycle/MutableLiveData;", "getShowBroadcastControls", "()Z", "getShowDivider", "getShowLimeBadge", "getSipAddress", "()Lorg/linphone/core/Address;", "sipUri", "", "getSipUri", "()Ljava/lang/String;", "getSpeaker", "changeIsSpeaker", "app_debug"})
public final class ConferenceSchedulingParticipantData extends org.linphone.contact.GenericContactData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Address sipAddress = null;
    private final boolean showLimeBadge = false;
    private final boolean showDivider = false;
    private final boolean showBroadcastControls = false;
    private final boolean speaker = false;
    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function1<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData, kotlin.Unit> onAddedToSpeakers = null;
    @org.jetbrains.annotations.Nullable
    private final kotlin.jvm.functions.Function1<org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData, kotlin.Unit> onRemovedFromSpeakers = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSpeaker = null;
    
    public ConferenceSchedulingParticipantData(@org.jetbrains.annotations.NotNull
    org.linphone.core.Address sipAddress, boolean showLimeBadge, boolean showDivider, boolean showBroadcastControls, boolean speaker, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData, kotlin.Unit> onAddedToSpeakers, @org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super org.linphone.activities.main.conference.data.ConferenceSchedulingParticipantData, kotlin.Unit> onRemovedFromSpeakers) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Address getSipAddress() {
        return null;
    }
    
    public final boolean getShowLimeBadge() {
        return false;
    }
    
    public final boolean getShowDivider() {
        return false;
    }
    
    public final boolean getShowBroadcastControls() {
        return false;
    }
    
    public final boolean getSpeaker() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSpeaker() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSipUri() {
        return null;
    }
    
    public final void changeIsSpeaker() {
    }
}