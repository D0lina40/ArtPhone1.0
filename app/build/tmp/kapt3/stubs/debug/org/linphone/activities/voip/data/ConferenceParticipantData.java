package org.linphone.activities.voip.data;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lorg/linphone/activities/voip/data/ConferenceParticipantData;", "Lorg/linphone/contact/GenericContactData;", "conference", "Lorg/linphone/core/Conference;", "participant", "Lorg/linphone/core/Participant;", "(Lorg/linphone/core/Conference;Lorg/linphone/core/Participant;)V", "getConference", "()Lorg/linphone/core/Conference;", "isAdmin", "Landroidx/lifecycle/MutableLiveData;", "", "()Landroidx/lifecycle/MutableLiveData;", "isMeAdmin", "isSpeaker", "getParticipant", "()Lorg/linphone/core/Participant;", "sipUri", "", "getSipUri", "()Ljava/lang/String;", "removeParticipantFromConference", "", "setAdmin", "unsetAdmin", "app_debug"})
public final class ConferenceParticipantData extends org.linphone.contact.GenericContactData {
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Conference conference = null;
    @org.jetbrains.annotations.NotNull
    private final org.linphone.core.Participant participant = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAdmin = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMeAdmin = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSpeaker = null;
    
    public ConferenceParticipantData(@org.jetbrains.annotations.NotNull
    org.linphone.core.Conference conference, @org.jetbrains.annotations.NotNull
    org.linphone.core.Participant participant) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Conference getConference() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Participant getParticipant() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSipUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isAdmin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isMeAdmin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isSpeaker() {
        return null;
    }
    
    public final void setAdmin() {
    }
    
    public final void unsetAdmin() {
    }
    
    public final void removeParticipantFromConference() {
    }
}