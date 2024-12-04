package org.linphone;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.linphone.databinding.AboutFragmentBindingImpl;
import org.linphone.databinding.AboutFragmentBindingLandImpl;
import org.linphone.databinding.AssistantAccountLoginFragmentBindingImpl;
import org.linphone.databinding.AssistantCountryPickerFragmentBindingImpl;
import org.linphone.databinding.AssistantEchoCancellerCalibrationFragmentBindingImpl;
import org.linphone.databinding.AssistantEmailAccountCreationFragmentBindingImpl;
import org.linphone.databinding.AssistantEmailAccountValidationFragmentBindingImpl;
import org.linphone.databinding.AssistantGenericAccountLoginFragmentBindingImpl;
import org.linphone.databinding.AssistantGenericAccountWarningFragmentBindingImpl;
import org.linphone.databinding.AssistantNoPushWarningFragmentBindingImpl;
import org.linphone.databinding.AssistantPhoneAccountCreationFragmentBindingImpl;
import org.linphone.databinding.AssistantPhoneAccountLinkingFragmentBindingImpl;
import org.linphone.databinding.AssistantPhoneAccountValidationFragmentBindingImpl;
import org.linphone.databinding.AssistantQrCodeFragmentBindingImpl;
import org.linphone.databinding.AssistantRemoteProvisioningFragmentBindingImpl;
import org.linphone.databinding.AssistantTopBarFragmentBindingImpl;
import org.linphone.databinding.AssistantWelcomeFragmentBindingImpl;
import org.linphone.databinding.AssistantWelcomeFragmentBindingLandImpl;
import org.linphone.databinding.CallOverlayBindingImpl;
import org.linphone.databinding.ChatBubbleActivityBindingImpl;
import org.linphone.databinding.ChatEventListCellBindingImpl;
import org.linphone.databinding.ChatMessageAttachmentCellBindingImpl;
import org.linphone.databinding.ChatMessageConferenceInvitationContentCellBindingImpl;
import org.linphone.databinding.ChatMessageContentCellBindingImpl;
import org.linphone.databinding.ChatMessageDownloadableFileContentCellBindingImpl;
import org.linphone.databinding.ChatMessageGenericFileContentCellBindingImpl;
import org.linphone.databinding.ChatMessageImageContentCellBindingImpl;
import org.linphone.databinding.ChatMessageListCellBindingImpl;
import org.linphone.databinding.ChatMessageLongPressMenuBindingImpl;
import org.linphone.databinding.ChatMessageReactionBindingImpl;
import org.linphone.databinding.ChatMessageReactionsListCellBindingImpl;
import org.linphone.databinding.ChatMessageReactionsListDialogBindingImpl;
import org.linphone.databinding.ChatMessageReplyBindingImpl;
import org.linphone.databinding.ChatMessageReplyBubbleBindingImpl;
import org.linphone.databinding.ChatMessageReplyContentCellBindingImpl;
import org.linphone.databinding.ChatMessageReplyPreviewContentCellBindingImpl;
import org.linphone.databinding.ChatMessageVideoContentCellBindingImpl;
import org.linphone.databinding.ChatMessageVoiceRecordContentCellBindingImpl;
import org.linphone.databinding.ChatMessageVoiceRecordingBindingImpl;
import org.linphone.databinding.ChatRoomCreationFragmentBindingImpl;
import org.linphone.databinding.ChatRoomDetailFragmentBindingImpl;
import org.linphone.databinding.ChatRoomDevicesChildCellBindingImpl;
import org.linphone.databinding.ChatRoomDevicesFragmentBindingImpl;
import org.linphone.databinding.ChatRoomDevicesGroupCellBindingImpl;
import org.linphone.databinding.ChatRoomEphemeralDurationCellBindingImpl;
import org.linphone.databinding.ChatRoomEphemeralFragmentBindingImpl;
import org.linphone.databinding.ChatRoomGroupInfoFragmentBindingImpl;
import org.linphone.databinding.ChatRoomGroupInfoParticipantCellBindingImpl;
import org.linphone.databinding.ChatRoomImdnFragmentBindingImpl;
import org.linphone.databinding.ChatRoomImdnParticipantCellBindingImpl;
import org.linphone.databinding.ChatRoomListCellBindingImpl;
import org.linphone.databinding.ChatRoomMasterFragmentBindingImpl;
import org.linphone.databinding.ChatRoomMenuBindingImpl;
import org.linphone.databinding.ChatRoomSendingBindingImpl;
import org.linphone.databinding.ChatUnreadMessagesListHeaderBindingImpl;
import org.linphone.databinding.ConferenceScheduleCellBindingImpl;
import org.linphone.databinding.ConferenceScheduleListHeaderBindingImpl;
import org.linphone.databinding.ConferenceSchedulingFragmentBindingImpl;
import org.linphone.databinding.ConferenceSchedulingParticipantCellBindingImpl;
import org.linphone.databinding.ConferenceSchedulingParticipantsListFragmentBindingImpl;
import org.linphone.databinding.ConferenceSchedulingSummaryFragmentBindingImpl;
import org.linphone.databinding.ConferenceWaitingRoomFragmentBindingImpl;
import org.linphone.databinding.ConferenceWaitingRoomFragmentBindingLandImpl;
import org.linphone.databinding.ConferencesScheduledFragmentBindingImpl;
import org.linphone.databinding.ContactDetailCellBindingImpl;
import org.linphone.databinding.ContactDetailFragmentBindingImpl;
import org.linphone.databinding.ContactEditorFragmentBindingImpl;
import org.linphone.databinding.ContactListCellBindingImpl;
import org.linphone.databinding.ContactMasterFragmentBindingImpl;
import org.linphone.databinding.ContactNumberAddressEditorCellBindingImpl;
import org.linphone.databinding.ContactSelectedCellBindingImpl;
import org.linphone.databinding.ContactSelectionCellBindingImpl;
import org.linphone.databinding.ContactSyncAccountPickerFragmentBindingImpl;
import org.linphone.databinding.DialerFragmentBindingImpl;
import org.linphone.databinding.DialerFragmentBindingLandImpl;
import org.linphone.databinding.DialerFragmentBindingSw533dpLandImpl;
import org.linphone.databinding.DialerFragmentBindingSw600dpImpl;
import org.linphone.databinding.DialogBindingImpl;
import org.linphone.databinding.FileAudioViewerFragmentBindingImpl;
import org.linphone.databinding.FileConfigViewerFragmentBindingImpl;
import org.linphone.databinding.FileImageViewerFragmentBindingImpl;
import org.linphone.databinding.FilePdfViewerFragmentBindingImpl;
import org.linphone.databinding.FileTextViewerFragmentBindingImpl;
import org.linphone.databinding.FileVideoViewerFragmentBindingImpl;
import org.linphone.databinding.FileViewerTopBarFragmentBindingImpl;
import org.linphone.databinding.GenericListHeaderBindingImpl;
import org.linphone.databinding.HistoryConfDetailFragmentBindingImpl;
import org.linphone.databinding.HistoryDetailCellBindingImpl;
import org.linphone.databinding.HistoryDetailFragmentBindingImpl;
import org.linphone.databinding.HistoryListCellBindingImpl;
import org.linphone.databinding.HistoryMasterFragmentBindingImpl;
import org.linphone.databinding.ImdnListHeaderBindingImpl;
import org.linphone.databinding.ListEditTopBarFragmentBindingImpl;
import org.linphone.databinding.MainActivityBindingImpl;
import org.linphone.databinding.NumpadBindingImpl;
import org.linphone.databinding.RecordingListCellBindingImpl;
import org.linphone.databinding.RecordingsFragmentBindingImpl;
import org.linphone.databinding.SettingsAccountCellBindingImpl;
import org.linphone.databinding.SettingsAccountFragmentBindingImpl;
import org.linphone.databinding.SettingsAdvancedFragmentBindingImpl;
import org.linphone.databinding.SettingsAudioFragmentBindingImpl;
import org.linphone.databinding.SettingsCallFragmentBindingImpl;
import org.linphone.databinding.SettingsChatFragmentBindingImpl;
import org.linphone.databinding.SettingsConferencesFragmentBindingImpl;
import org.linphone.databinding.SettingsContactsFragmentBindingImpl;
import org.linphone.databinding.SettingsFragmentBindingImpl;
import org.linphone.databinding.SettingsLdapCellBindingImpl;
import org.linphone.databinding.SettingsLdapFragmentBindingImpl;
import org.linphone.databinding.SettingsNetworkFragmentBindingImpl;
import org.linphone.databinding.SettingsTunnelFragmentBindingImpl;
import org.linphone.databinding.SettingsVideoFragmentBindingImpl;
import org.linphone.databinding.SettingsWidgetBasicBindingImpl;
import org.linphone.databinding.SettingsWidgetListBindingImpl;
import org.linphone.databinding.SettingsWidgetSwitchAndTextBindingImpl;
import org.linphone.databinding.SettingsWidgetSwitchBindingImpl;
import org.linphone.databinding.SettingsWidgetTextBindingImpl;
import org.linphone.databinding.SideMenuAccountCellBindingImpl;
import org.linphone.databinding.SideMenuFragmentBindingImpl;
import org.linphone.databinding.StatusFragmentBindingImpl;
import org.linphone.databinding.TabsFragmentBindingImpl;
import org.linphone.databinding.TabsFragmentBindingLandImpl;
import org.linphone.databinding.VoipActivityBindingImpl;
import org.linphone.databinding.VoipButtonsAudioRoutesBindingImpl;
import org.linphone.databinding.VoipButtonsBindingImpl;
import org.linphone.databinding.VoipButtonsExtraBindingImpl;
import org.linphone.databinding.VoipButtonsIncomingBindingImpl;
import org.linphone.databinding.VoipButtonsOutgoingBindingImpl;
import org.linphone.databinding.VoipCallContextMenuBindingImpl;
import org.linphone.databinding.VoipCallIncomingFragmentBindingImpl;
import org.linphone.databinding.VoipCallOutgoingFragmentBindingImpl;
import org.linphone.databinding.VoipCallPausedBindingImpl;
import org.linphone.databinding.VoipCallPausedByRemoteBindingImpl;
import org.linphone.databinding.VoipCallStatCellBindingImpl;
import org.linphone.databinding.VoipCallStatsBindingImpl;
import org.linphone.databinding.VoipCallStatsCellBindingImpl;
import org.linphone.databinding.VoipCallsCellBindingImpl;
import org.linphone.databinding.VoipCallsListFragmentBindingImpl;
import org.linphone.databinding.VoipChatFragmentBindingImpl;
import org.linphone.databinding.VoipConferenceActiveSpeakerBindingImpl;
import org.linphone.databinding.VoipConferenceActiveSpeakerBindingLandImpl;
import org.linphone.databinding.VoipConferenceAudioOnlyBindingImpl;
import org.linphone.databinding.VoipConferenceCallFragmentBindingImpl;
import org.linphone.databinding.VoipConferenceCreationPendingWaitLayoutBindingImpl;
import org.linphone.databinding.VoipConferenceGridBindingImpl;
import org.linphone.databinding.VoipConferenceGridBindingLandImpl;
import org.linphone.databinding.VoipConferenceIncomingParticipantCellBindingImpl;
import org.linphone.databinding.VoipConferenceLayoutFragmentBindingImpl;
import org.linphone.databinding.VoipConferenceParticipantBroadcastCellBindingImpl;
import org.linphone.databinding.VoipConferenceParticipantCellBindingImpl;
import org.linphone.databinding.VoipConferenceParticipantRemoteActiveSpeakerMiniatureBindingImpl;
import org.linphone.databinding.VoipConferenceParticipantRemoteAudioOnlyBindingImpl;
import org.linphone.databinding.VoipConferenceParticipantRemoteGridBindingImpl;
import org.linphone.databinding.VoipConferenceParticipantsAddFragmentBindingImpl;
import org.linphone.databinding.VoipConferenceParticipantsFragmentBindingImpl;
import org.linphone.databinding.VoipConferencePausedBindingImpl;
import org.linphone.databinding.VoipDialogBindingImpl;
import org.linphone.databinding.VoipDialogInfoBindingImpl;
import org.linphone.databinding.VoipNumpadBindingImpl;
import org.linphone.databinding.VoipNumpadBindingLandImpl;
import org.linphone.databinding.VoipRemoteRecordingBindingImpl;
import org.linphone.databinding.VoipSingleCallFragmentBindingImpl;
import org.linphone.databinding.VoipStatusFragmentBindingImpl;
import org.linphone.databinding.WaitLayoutBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ABOUTFRAGMENT = 1;

  private static final int LAYOUT_ASSISTANTACCOUNTLOGINFRAGMENT = 2;

  private static final int LAYOUT_ASSISTANTCOUNTRYPICKERFRAGMENT = 3;

  private static final int LAYOUT_ASSISTANTECHOCANCELLERCALIBRATIONFRAGMENT = 4;

  private static final int LAYOUT_ASSISTANTEMAILACCOUNTCREATIONFRAGMENT = 5;

  private static final int LAYOUT_ASSISTANTEMAILACCOUNTVALIDATIONFRAGMENT = 6;

  private static final int LAYOUT_ASSISTANTGENERICACCOUNTLOGINFRAGMENT = 7;

  private static final int LAYOUT_ASSISTANTGENERICACCOUNTWARNINGFRAGMENT = 8;

  private static final int LAYOUT_ASSISTANTNOPUSHWARNINGFRAGMENT = 9;

  private static final int LAYOUT_ASSISTANTPHONEACCOUNTCREATIONFRAGMENT = 10;

  private static final int LAYOUT_ASSISTANTPHONEACCOUNTLINKINGFRAGMENT = 11;

  private static final int LAYOUT_ASSISTANTPHONEACCOUNTVALIDATIONFRAGMENT = 12;

  private static final int LAYOUT_ASSISTANTQRCODEFRAGMENT = 13;

  private static final int LAYOUT_ASSISTANTREMOTEPROVISIONINGFRAGMENT = 14;

  private static final int LAYOUT_ASSISTANTTOPBARFRAGMENT = 15;

  private static final int LAYOUT_ASSISTANTWELCOMEFRAGMENT = 16;

  private static final int LAYOUT_CALLOVERLAY = 17;

  private static final int LAYOUT_CHATBUBBLEACTIVITY = 18;

  private static final int LAYOUT_CHATEVENTLISTCELL = 19;

  private static final int LAYOUT_CHATMESSAGEATTACHMENTCELL = 20;

  private static final int LAYOUT_CHATMESSAGECONFERENCEINVITATIONCONTENTCELL = 21;

  private static final int LAYOUT_CHATMESSAGECONTENTCELL = 22;

  private static final int LAYOUT_CHATMESSAGEDOWNLOADABLEFILECONTENTCELL = 23;

  private static final int LAYOUT_CHATMESSAGEGENERICFILECONTENTCELL = 24;

  private static final int LAYOUT_CHATMESSAGEIMAGECONTENTCELL = 25;

  private static final int LAYOUT_CHATMESSAGELISTCELL = 26;

  private static final int LAYOUT_CHATMESSAGELONGPRESSMENU = 27;

  private static final int LAYOUT_CHATMESSAGEREACTION = 28;

  private static final int LAYOUT_CHATMESSAGEREACTIONSLISTCELL = 29;

  private static final int LAYOUT_CHATMESSAGEREACTIONSLISTDIALOG = 30;

  private static final int LAYOUT_CHATMESSAGEREPLY = 31;

  private static final int LAYOUT_CHATMESSAGEREPLYBUBBLE = 32;

  private static final int LAYOUT_CHATMESSAGEREPLYCONTENTCELL = 33;

  private static final int LAYOUT_CHATMESSAGEREPLYPREVIEWCONTENTCELL = 34;

  private static final int LAYOUT_CHATMESSAGEVIDEOCONTENTCELL = 35;

  private static final int LAYOUT_CHATMESSAGEVOICERECORDCONTENTCELL = 36;

  private static final int LAYOUT_CHATMESSAGEVOICERECORDING = 37;

  private static final int LAYOUT_CHATROOMCREATIONFRAGMENT = 38;

  private static final int LAYOUT_CHATROOMDETAILFRAGMENT = 39;

  private static final int LAYOUT_CHATROOMDEVICESCHILDCELL = 40;

  private static final int LAYOUT_CHATROOMDEVICESFRAGMENT = 41;

  private static final int LAYOUT_CHATROOMDEVICESGROUPCELL = 42;

  private static final int LAYOUT_CHATROOMEPHEMERALDURATIONCELL = 43;

  private static final int LAYOUT_CHATROOMEPHEMERALFRAGMENT = 44;

  private static final int LAYOUT_CHATROOMGROUPINFOFRAGMENT = 45;

  private static final int LAYOUT_CHATROOMGROUPINFOPARTICIPANTCELL = 46;

  private static final int LAYOUT_CHATROOMIMDNFRAGMENT = 47;

  private static final int LAYOUT_CHATROOMIMDNPARTICIPANTCELL = 48;

  private static final int LAYOUT_CHATROOMLISTCELL = 49;

  private static final int LAYOUT_CHATROOMMASTERFRAGMENT = 50;

  private static final int LAYOUT_CHATROOMMENU = 51;

  private static final int LAYOUT_CHATROOMSENDING = 52;

  private static final int LAYOUT_CHATUNREADMESSAGESLISTHEADER = 53;

  private static final int LAYOUT_CONFERENCESCHEDULECELL = 54;

  private static final int LAYOUT_CONFERENCESCHEDULELISTHEADER = 55;

  private static final int LAYOUT_CONFERENCESCHEDULINGFRAGMENT = 56;

  private static final int LAYOUT_CONFERENCESCHEDULINGPARTICIPANTCELL = 57;

  private static final int LAYOUT_CONFERENCESCHEDULINGPARTICIPANTSLISTFRAGMENT = 58;

  private static final int LAYOUT_CONFERENCESCHEDULINGSUMMARYFRAGMENT = 59;

  private static final int LAYOUT_CONFERENCEWAITINGROOMFRAGMENT = 60;

  private static final int LAYOUT_CONFERENCESSCHEDULEDFRAGMENT = 61;

  private static final int LAYOUT_CONTACTDETAILCELL = 62;

  private static final int LAYOUT_CONTACTDETAILFRAGMENT = 63;

  private static final int LAYOUT_CONTACTEDITORFRAGMENT = 64;

  private static final int LAYOUT_CONTACTLISTCELL = 65;

  private static final int LAYOUT_CONTACTMASTERFRAGMENT = 66;

  private static final int LAYOUT_CONTACTNUMBERADDRESSEDITORCELL = 67;

  private static final int LAYOUT_CONTACTSELECTEDCELL = 68;

  private static final int LAYOUT_CONTACTSELECTIONCELL = 69;

  private static final int LAYOUT_CONTACTSYNCACCOUNTPICKERFRAGMENT = 70;

  private static final int LAYOUT_DIALERFRAGMENT = 71;

  private static final int LAYOUT_DIALOG = 72;

  private static final int LAYOUT_FILEAUDIOVIEWERFRAGMENT = 73;

  private static final int LAYOUT_FILECONFIGVIEWERFRAGMENT = 74;

  private static final int LAYOUT_FILEIMAGEVIEWERFRAGMENT = 75;

  private static final int LAYOUT_FILEPDFVIEWERFRAGMENT = 76;

  private static final int LAYOUT_FILETEXTVIEWERFRAGMENT = 77;

  private static final int LAYOUT_FILEVIDEOVIEWERFRAGMENT = 78;

  private static final int LAYOUT_FILEVIEWERTOPBARFRAGMENT = 79;

  private static final int LAYOUT_GENERICLISTHEADER = 80;

  private static final int LAYOUT_HISTORYCONFDETAILFRAGMENT = 81;

  private static final int LAYOUT_HISTORYDETAILCELL = 82;

  private static final int LAYOUT_HISTORYDETAILFRAGMENT = 83;

  private static final int LAYOUT_HISTORYLISTCELL = 84;

  private static final int LAYOUT_HISTORYMASTERFRAGMENT = 85;

  private static final int LAYOUT_IMDNLISTHEADER = 86;

  private static final int LAYOUT_LISTEDITTOPBARFRAGMENT = 87;

  private static final int LAYOUT_MAINACTIVITY = 88;

  private static final int LAYOUT_NUMPAD = 89;

  private static final int LAYOUT_RECORDINGLISTCELL = 90;

  private static final int LAYOUT_RECORDINGSFRAGMENT = 91;

  private static final int LAYOUT_SETTINGSACCOUNTCELL = 92;

  private static final int LAYOUT_SETTINGSACCOUNTFRAGMENT = 93;

  private static final int LAYOUT_SETTINGSADVANCEDFRAGMENT = 94;

  private static final int LAYOUT_SETTINGSAUDIOFRAGMENT = 95;

  private static final int LAYOUT_SETTINGSCALLFRAGMENT = 96;

  private static final int LAYOUT_SETTINGSCHATFRAGMENT = 97;

  private static final int LAYOUT_SETTINGSCONFERENCESFRAGMENT = 98;

  private static final int LAYOUT_SETTINGSCONTACTSFRAGMENT = 99;

  private static final int LAYOUT_SETTINGSFRAGMENT = 100;

  private static final int LAYOUT_SETTINGSLDAPCELL = 101;

  private static final int LAYOUT_SETTINGSLDAPFRAGMENT = 102;

  private static final int LAYOUT_SETTINGSNETWORKFRAGMENT = 103;

  private static final int LAYOUT_SETTINGSTUNNELFRAGMENT = 104;

  private static final int LAYOUT_SETTINGSVIDEOFRAGMENT = 105;

  private static final int LAYOUT_SETTINGSWIDGETBASIC = 106;

  private static final int LAYOUT_SETTINGSWIDGETLIST = 107;

  private static final int LAYOUT_SETTINGSWIDGETSWITCH = 108;

  private static final int LAYOUT_SETTINGSWIDGETSWITCHANDTEXT = 109;

  private static final int LAYOUT_SETTINGSWIDGETTEXT = 110;

  private static final int LAYOUT_SIDEMENUACCOUNTCELL = 111;

  private static final int LAYOUT_SIDEMENUFRAGMENT = 112;

  private static final int LAYOUT_STATUSFRAGMENT = 113;

  private static final int LAYOUT_TABSFRAGMENT = 114;

  private static final int LAYOUT_VOIPACTIVITY = 115;

  private static final int LAYOUT_VOIPBUTTONS = 116;

  private static final int LAYOUT_VOIPBUTTONSAUDIOROUTES = 117;

  private static final int LAYOUT_VOIPBUTTONSEXTRA = 118;

  private static final int LAYOUT_VOIPBUTTONSINCOMING = 119;

  private static final int LAYOUT_VOIPBUTTONSOUTGOING = 120;

  private static final int LAYOUT_VOIPCALLCONTEXTMENU = 121;

  private static final int LAYOUT_VOIPCALLINCOMINGFRAGMENT = 122;

  private static final int LAYOUT_VOIPCALLOUTGOINGFRAGMENT = 123;

  private static final int LAYOUT_VOIPCALLPAUSED = 124;

  private static final int LAYOUT_VOIPCALLPAUSEDBYREMOTE = 125;

  private static final int LAYOUT_VOIPCALLSTATCELL = 126;

  private static final int LAYOUT_VOIPCALLSTATS = 127;

  private static final int LAYOUT_VOIPCALLSTATSCELL = 128;

  private static final int LAYOUT_VOIPCALLSCELL = 129;

  private static final int LAYOUT_VOIPCALLSLISTFRAGMENT = 130;

  private static final int LAYOUT_VOIPCHATFRAGMENT = 131;

  private static final int LAYOUT_VOIPCONFERENCEACTIVESPEAKER = 132;

  private static final int LAYOUT_VOIPCONFERENCEAUDIOONLY = 133;

  private static final int LAYOUT_VOIPCONFERENCECALLFRAGMENT = 134;

  private static final int LAYOUT_VOIPCONFERENCECREATIONPENDINGWAITLAYOUT = 135;

  private static final int LAYOUT_VOIPCONFERENCEGRID = 136;

  private static final int LAYOUT_VOIPCONFERENCEINCOMINGPARTICIPANTCELL = 137;

  private static final int LAYOUT_VOIPCONFERENCELAYOUTFRAGMENT = 138;

  private static final int LAYOUT_VOIPCONFERENCEPARTICIPANTBROADCASTCELL = 139;

  private static final int LAYOUT_VOIPCONFERENCEPARTICIPANTCELL = 140;

  private static final int LAYOUT_VOIPCONFERENCEPARTICIPANTREMOTEACTIVESPEAKERMINIATURE = 141;

  private static final int LAYOUT_VOIPCONFERENCEPARTICIPANTREMOTEAUDIOONLY = 142;

  private static final int LAYOUT_VOIPCONFERENCEPARTICIPANTREMOTEGRID = 143;

  private static final int LAYOUT_VOIPCONFERENCEPARTICIPANTSADDFRAGMENT = 144;

  private static final int LAYOUT_VOIPCONFERENCEPARTICIPANTSFRAGMENT = 145;

  private static final int LAYOUT_VOIPCONFERENCEPAUSED = 146;

  private static final int LAYOUT_VOIPDIALOG = 147;

  private static final int LAYOUT_VOIPDIALOGINFO = 148;

  private static final int LAYOUT_VOIPNUMPAD = 149;

  private static final int LAYOUT_VOIPREMOTERECORDING = 150;

  private static final int LAYOUT_VOIPSINGLECALLFRAGMENT = 151;

  private static final int LAYOUT_VOIPSTATUSFRAGMENT = 152;

  private static final int LAYOUT_WAITLAYOUT = 153;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(153);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.about_fragment, LAYOUT_ABOUTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_account_login_fragment, LAYOUT_ASSISTANTACCOUNTLOGINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_country_picker_fragment, LAYOUT_ASSISTANTCOUNTRYPICKERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_echo_canceller_calibration_fragment, LAYOUT_ASSISTANTECHOCANCELLERCALIBRATIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_email_account_creation_fragment, LAYOUT_ASSISTANTEMAILACCOUNTCREATIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_email_account_validation_fragment, LAYOUT_ASSISTANTEMAILACCOUNTVALIDATIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_generic_account_login_fragment, LAYOUT_ASSISTANTGENERICACCOUNTLOGINFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_generic_account_warning_fragment, LAYOUT_ASSISTANTGENERICACCOUNTWARNINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_no_push_warning_fragment, LAYOUT_ASSISTANTNOPUSHWARNINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_phone_account_creation_fragment, LAYOUT_ASSISTANTPHONEACCOUNTCREATIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_phone_account_linking_fragment, LAYOUT_ASSISTANTPHONEACCOUNTLINKINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_phone_account_validation_fragment, LAYOUT_ASSISTANTPHONEACCOUNTVALIDATIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_qr_code_fragment, LAYOUT_ASSISTANTQRCODEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_remote_provisioning_fragment, LAYOUT_ASSISTANTREMOTEPROVISIONINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_top_bar_fragment, LAYOUT_ASSISTANTTOPBARFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.assistant_welcome_fragment, LAYOUT_ASSISTANTWELCOMEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.call_overlay, LAYOUT_CALLOVERLAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_bubble_activity, LAYOUT_CHATBUBBLEACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_event_list_cell, LAYOUT_CHATEVENTLISTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_attachment_cell, LAYOUT_CHATMESSAGEATTACHMENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_conference_invitation_content_cell, LAYOUT_CHATMESSAGECONFERENCEINVITATIONCONTENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_content_cell, LAYOUT_CHATMESSAGECONTENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_downloadable_file_content_cell, LAYOUT_CHATMESSAGEDOWNLOADABLEFILECONTENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_generic_file_content_cell, LAYOUT_CHATMESSAGEGENERICFILECONTENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_image_content_cell, LAYOUT_CHATMESSAGEIMAGECONTENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_list_cell, LAYOUT_CHATMESSAGELISTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_long_press_menu, LAYOUT_CHATMESSAGELONGPRESSMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_reaction, LAYOUT_CHATMESSAGEREACTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_reactions_list_cell, LAYOUT_CHATMESSAGEREACTIONSLISTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_reactions_list_dialog, LAYOUT_CHATMESSAGEREACTIONSLISTDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_reply, LAYOUT_CHATMESSAGEREPLY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_reply_bubble, LAYOUT_CHATMESSAGEREPLYBUBBLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_reply_content_cell, LAYOUT_CHATMESSAGEREPLYCONTENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_reply_preview_content_cell, LAYOUT_CHATMESSAGEREPLYPREVIEWCONTENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_video_content_cell, LAYOUT_CHATMESSAGEVIDEOCONTENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_voice_record_content_cell, LAYOUT_CHATMESSAGEVOICERECORDCONTENTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_message_voice_recording, LAYOUT_CHATMESSAGEVOICERECORDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_creation_fragment, LAYOUT_CHATROOMCREATIONFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_detail_fragment, LAYOUT_CHATROOMDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_devices_child_cell, LAYOUT_CHATROOMDEVICESCHILDCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_devices_fragment, LAYOUT_CHATROOMDEVICESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_devices_group_cell, LAYOUT_CHATROOMDEVICESGROUPCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_ephemeral_duration_cell, LAYOUT_CHATROOMEPHEMERALDURATIONCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_ephemeral_fragment, LAYOUT_CHATROOMEPHEMERALFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_group_info_fragment, LAYOUT_CHATROOMGROUPINFOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_group_info_participant_cell, LAYOUT_CHATROOMGROUPINFOPARTICIPANTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_imdn_fragment, LAYOUT_CHATROOMIMDNFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_imdn_participant_cell, LAYOUT_CHATROOMIMDNPARTICIPANTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_list_cell, LAYOUT_CHATROOMLISTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_master_fragment, LAYOUT_CHATROOMMASTERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_menu, LAYOUT_CHATROOMMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_room_sending, LAYOUT_CHATROOMSENDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.chat_unread_messages_list_header, LAYOUT_CHATUNREADMESSAGESLISTHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.conference_schedule_cell, LAYOUT_CONFERENCESCHEDULECELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.conference_schedule_list_header, LAYOUT_CONFERENCESCHEDULELISTHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.conference_scheduling_fragment, LAYOUT_CONFERENCESCHEDULINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.conference_scheduling_participant_cell, LAYOUT_CONFERENCESCHEDULINGPARTICIPANTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.conference_scheduling_participants_list_fragment, LAYOUT_CONFERENCESCHEDULINGPARTICIPANTSLISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.conference_scheduling_summary_fragment, LAYOUT_CONFERENCESCHEDULINGSUMMARYFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.conference_waiting_room_fragment, LAYOUT_CONFERENCEWAITINGROOMFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.conferences_scheduled_fragment, LAYOUT_CONFERENCESSCHEDULEDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.contact_detail_cell, LAYOUT_CONTACTDETAILCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.contact_detail_fragment, LAYOUT_CONTACTDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.contact_editor_fragment, LAYOUT_CONTACTEDITORFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.contact_list_cell, LAYOUT_CONTACTLISTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.contact_master_fragment, LAYOUT_CONTACTMASTERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.contact_number_address_editor_cell, LAYOUT_CONTACTNUMBERADDRESSEDITORCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.contact_selected_cell, LAYOUT_CONTACTSELECTEDCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.contact_selection_cell, LAYOUT_CONTACTSELECTIONCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.contact_sync_account_picker_fragment, LAYOUT_CONTACTSYNCACCOUNTPICKERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.dialer_fragment, LAYOUT_DIALERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.dialog, LAYOUT_DIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.file_audio_viewer_fragment, LAYOUT_FILEAUDIOVIEWERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.file_config_viewer_fragment, LAYOUT_FILECONFIGVIEWERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.file_image_viewer_fragment, LAYOUT_FILEIMAGEVIEWERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.file_pdf_viewer_fragment, LAYOUT_FILEPDFVIEWERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.file_text_viewer_fragment, LAYOUT_FILETEXTVIEWERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.file_video_viewer_fragment, LAYOUT_FILEVIDEOVIEWERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.file_viewer_top_bar_fragment, LAYOUT_FILEVIEWERTOPBARFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.generic_list_header, LAYOUT_GENERICLISTHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.history_conf_detail_fragment, LAYOUT_HISTORYCONFDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.history_detail_cell, LAYOUT_HISTORYDETAILCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.history_detail_fragment, LAYOUT_HISTORYDETAILFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.history_list_cell, LAYOUT_HISTORYLISTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.history_master_fragment, LAYOUT_HISTORYMASTERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.imdn_list_header, LAYOUT_IMDNLISTHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.list_edit_top_bar_fragment, LAYOUT_LISTEDITTOPBARFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.main_activity, LAYOUT_MAINACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.numpad, LAYOUT_NUMPAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.recording_list_cell, LAYOUT_RECORDINGLISTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.recordings_fragment, LAYOUT_RECORDINGSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_account_cell, LAYOUT_SETTINGSACCOUNTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_account_fragment, LAYOUT_SETTINGSACCOUNTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_advanced_fragment, LAYOUT_SETTINGSADVANCEDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_audio_fragment, LAYOUT_SETTINGSAUDIOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_call_fragment, LAYOUT_SETTINGSCALLFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_chat_fragment, LAYOUT_SETTINGSCHATFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_conferences_fragment, LAYOUT_SETTINGSCONFERENCESFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_contacts_fragment, LAYOUT_SETTINGSCONTACTSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_fragment, LAYOUT_SETTINGSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_ldap_cell, LAYOUT_SETTINGSLDAPCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_ldap_fragment, LAYOUT_SETTINGSLDAPFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_network_fragment, LAYOUT_SETTINGSNETWORKFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_tunnel_fragment, LAYOUT_SETTINGSTUNNELFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_video_fragment, LAYOUT_SETTINGSVIDEOFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_widget_basic, LAYOUT_SETTINGSWIDGETBASIC);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_widget_list, LAYOUT_SETTINGSWIDGETLIST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_widget_switch, LAYOUT_SETTINGSWIDGETSWITCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_widget_switch_and_text, LAYOUT_SETTINGSWIDGETSWITCHANDTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.settings_widget_text, LAYOUT_SETTINGSWIDGETTEXT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.side_menu_account_cell, LAYOUT_SIDEMENUACCOUNTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.side_menu_fragment, LAYOUT_SIDEMENUFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.status_fragment, LAYOUT_STATUSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.tabs_fragment, LAYOUT_TABSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_activity, LAYOUT_VOIPACTIVITY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_buttons, LAYOUT_VOIPBUTTONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_buttons_audio_routes, LAYOUT_VOIPBUTTONSAUDIOROUTES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_buttons_extra, LAYOUT_VOIPBUTTONSEXTRA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_buttons_incoming, LAYOUT_VOIPBUTTONSINCOMING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_buttons_outgoing, LAYOUT_VOIPBUTTONSOUTGOING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_call_context_menu, LAYOUT_VOIPCALLCONTEXTMENU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_call_incoming_fragment, LAYOUT_VOIPCALLINCOMINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_call_outgoing_fragment, LAYOUT_VOIPCALLOUTGOINGFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_call_paused, LAYOUT_VOIPCALLPAUSED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_call_paused_by_remote, LAYOUT_VOIPCALLPAUSEDBYREMOTE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_call_stat_cell, LAYOUT_VOIPCALLSTATCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_call_stats, LAYOUT_VOIPCALLSTATS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_call_stats_cell, LAYOUT_VOIPCALLSTATSCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_calls_cell, LAYOUT_VOIPCALLSCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_calls_list_fragment, LAYOUT_VOIPCALLSLISTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_chat_fragment, LAYOUT_VOIPCHATFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_active_speaker, LAYOUT_VOIPCONFERENCEACTIVESPEAKER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_audio_only, LAYOUT_VOIPCONFERENCEAUDIOONLY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_call_fragment, LAYOUT_VOIPCONFERENCECALLFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_creation_pending_wait_layout, LAYOUT_VOIPCONFERENCECREATIONPENDINGWAITLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_grid, LAYOUT_VOIPCONFERENCEGRID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_incoming_participant_cell, LAYOUT_VOIPCONFERENCEINCOMINGPARTICIPANTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_layout_fragment, LAYOUT_VOIPCONFERENCELAYOUTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_participant_broadcast_cell, LAYOUT_VOIPCONFERENCEPARTICIPANTBROADCASTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_participant_cell, LAYOUT_VOIPCONFERENCEPARTICIPANTCELL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_participant_remote_active_speaker_miniature, LAYOUT_VOIPCONFERENCEPARTICIPANTREMOTEACTIVESPEAKERMINIATURE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_participant_remote_audio_only, LAYOUT_VOIPCONFERENCEPARTICIPANTREMOTEAUDIOONLY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_participant_remote_grid, LAYOUT_VOIPCONFERENCEPARTICIPANTREMOTEGRID);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_participants_add_fragment, LAYOUT_VOIPCONFERENCEPARTICIPANTSADDFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_participants_fragment, LAYOUT_VOIPCONFERENCEPARTICIPANTSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_conference_paused, LAYOUT_VOIPCONFERENCEPAUSED);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_dialog, LAYOUT_VOIPDIALOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_dialog_info, LAYOUT_VOIPDIALOGINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_numpad, LAYOUT_VOIPNUMPAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_remote_recording, LAYOUT_VOIPREMOTERECORDING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_single_call_fragment, LAYOUT_VOIPSINGLECALLFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.voip_status_fragment, LAYOUT_VOIPSTATUSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(org.linphone.R.layout.wait_layout, LAYOUT_WAITLAYOUT);
  }

  private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_ABOUTFRAGMENT: {
        if ("layout-land/about_fragment_0".equals(tag)) {
          return new AboutFragmentBindingLandImpl(component, view);
        }
        if ("layout/about_fragment_0".equals(tag)) {
          return new AboutFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for about_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTACCOUNTLOGINFRAGMENT: {
        if ("layout/assistant_account_login_fragment_0".equals(tag)) {
          return new AssistantAccountLoginFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_account_login_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTCOUNTRYPICKERFRAGMENT: {
        if ("layout/assistant_country_picker_fragment_0".equals(tag)) {
          return new AssistantCountryPickerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_country_picker_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTECHOCANCELLERCALIBRATIONFRAGMENT: {
        if ("layout/assistant_echo_canceller_calibration_fragment_0".equals(tag)) {
          return new AssistantEchoCancellerCalibrationFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_echo_canceller_calibration_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTEMAILACCOUNTCREATIONFRAGMENT: {
        if ("layout/assistant_email_account_creation_fragment_0".equals(tag)) {
          return new AssistantEmailAccountCreationFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_email_account_creation_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTEMAILACCOUNTVALIDATIONFRAGMENT: {
        if ("layout/assistant_email_account_validation_fragment_0".equals(tag)) {
          return new AssistantEmailAccountValidationFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_email_account_validation_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTGENERICACCOUNTLOGINFRAGMENT: {
        if ("layout/assistant_generic_account_login_fragment_0".equals(tag)) {
          return new AssistantGenericAccountLoginFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_generic_account_login_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTGENERICACCOUNTWARNINGFRAGMENT: {
        if ("layout/assistant_generic_account_warning_fragment_0".equals(tag)) {
          return new AssistantGenericAccountWarningFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_generic_account_warning_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTNOPUSHWARNINGFRAGMENT: {
        if ("layout/assistant_no_push_warning_fragment_0".equals(tag)) {
          return new AssistantNoPushWarningFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_no_push_warning_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTPHONEACCOUNTCREATIONFRAGMENT: {
        if ("layout/assistant_phone_account_creation_fragment_0".equals(tag)) {
          return new AssistantPhoneAccountCreationFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_phone_account_creation_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTPHONEACCOUNTLINKINGFRAGMENT: {
        if ("layout/assistant_phone_account_linking_fragment_0".equals(tag)) {
          return new AssistantPhoneAccountLinkingFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_phone_account_linking_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTPHONEACCOUNTVALIDATIONFRAGMENT: {
        if ("layout/assistant_phone_account_validation_fragment_0".equals(tag)) {
          return new AssistantPhoneAccountValidationFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_phone_account_validation_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTQRCODEFRAGMENT: {
        if ("layout/assistant_qr_code_fragment_0".equals(tag)) {
          return new AssistantQrCodeFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_qr_code_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTREMOTEPROVISIONINGFRAGMENT: {
        if ("layout/assistant_remote_provisioning_fragment_0".equals(tag)) {
          return new AssistantRemoteProvisioningFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_remote_provisioning_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTTOPBARFRAGMENT: {
        if ("layout/assistant_top_bar_fragment_0".equals(tag)) {
          return new AssistantTopBarFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_top_bar_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_ASSISTANTWELCOMEFRAGMENT: {
        if ("layout/assistant_welcome_fragment_0".equals(tag)) {
          return new AssistantWelcomeFragmentBindingImpl(component, view);
        }
        if ("layout-land/assistant_welcome_fragment_0".equals(tag)) {
          return new AssistantWelcomeFragmentBindingLandImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for assistant_welcome_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CALLOVERLAY: {
        if ("layout/call_overlay_0".equals(tag)) {
          return new CallOverlayBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for call_overlay is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATBUBBLEACTIVITY: {
        if ("layout/chat_bubble_activity_0".equals(tag)) {
          return new ChatBubbleActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_bubble_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATEVENTLISTCELL: {
        if ("layout/chat_event_list_cell_0".equals(tag)) {
          return new ChatEventListCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_event_list_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEATTACHMENTCELL: {
        if ("layout/chat_message_attachment_cell_0".equals(tag)) {
          return new ChatMessageAttachmentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_attachment_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGECONFERENCEINVITATIONCONTENTCELL: {
        if ("layout/chat_message_conference_invitation_content_cell_0".equals(tag)) {
          return new ChatMessageConferenceInvitationContentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_conference_invitation_content_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGECONTENTCELL: {
        if ("layout/chat_message_content_cell_0".equals(tag)) {
          return new ChatMessageContentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_content_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEDOWNLOADABLEFILECONTENTCELL: {
        if ("layout/chat_message_downloadable_file_content_cell_0".equals(tag)) {
          return new ChatMessageDownloadableFileContentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_downloadable_file_content_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEGENERICFILECONTENTCELL: {
        if ("layout/chat_message_generic_file_content_cell_0".equals(tag)) {
          return new ChatMessageGenericFileContentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_generic_file_content_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEIMAGECONTENTCELL: {
        if ("layout/chat_message_image_content_cell_0".equals(tag)) {
          return new ChatMessageImageContentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_image_content_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGELISTCELL: {
        if ("layout/chat_message_list_cell_0".equals(tag)) {
          return new ChatMessageListCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_list_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGELONGPRESSMENU: {
        if ("layout/chat_message_long_press_menu_0".equals(tag)) {
          return new ChatMessageLongPressMenuBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_long_press_menu is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEREACTION: {
        if ("layout/chat_message_reaction_0".equals(tag)) {
          return new ChatMessageReactionBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_reaction is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEREACTIONSLISTCELL: {
        if ("layout/chat_message_reactions_list_cell_0".equals(tag)) {
          return new ChatMessageReactionsListCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_reactions_list_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEREACTIONSLISTDIALOG: {
        if ("layout/chat_message_reactions_list_dialog_0".equals(tag)) {
          return new ChatMessageReactionsListDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_reactions_list_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEREPLY: {
        if ("layout/chat_message_reply_0".equals(tag)) {
          return new ChatMessageReplyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_reply is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEREPLYBUBBLE: {
        if ("layout/chat_message_reply_bubble_0".equals(tag)) {
          return new ChatMessageReplyBubbleBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_reply_bubble is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEREPLYCONTENTCELL: {
        if ("layout/chat_message_reply_content_cell_0".equals(tag)) {
          return new ChatMessageReplyContentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_reply_content_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEREPLYPREVIEWCONTENTCELL: {
        if ("layout/chat_message_reply_preview_content_cell_0".equals(tag)) {
          return new ChatMessageReplyPreviewContentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_reply_preview_content_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEVIDEOCONTENTCELL: {
        if ("layout/chat_message_video_content_cell_0".equals(tag)) {
          return new ChatMessageVideoContentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_video_content_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEVOICERECORDCONTENTCELL: {
        if ("layout/chat_message_voice_record_content_cell_0".equals(tag)) {
          return new ChatMessageVoiceRecordContentCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_voice_record_content_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATMESSAGEVOICERECORDING: {
        if ("layout/chat_message_voice_recording_0".equals(tag)) {
          return new ChatMessageVoiceRecordingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_message_voice_recording is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMCREATIONFRAGMENT: {
        if ("layout/chat_room_creation_fragment_0".equals(tag)) {
          return new ChatRoomCreationFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_creation_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMDETAILFRAGMENT: {
        if ("layout/chat_room_detail_fragment_0".equals(tag)) {
          return new ChatRoomDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMDEVICESCHILDCELL: {
        if ("layout/chat_room_devices_child_cell_0".equals(tag)) {
          return new ChatRoomDevicesChildCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_devices_child_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMDEVICESFRAGMENT: {
        if ("layout/chat_room_devices_fragment_0".equals(tag)) {
          return new ChatRoomDevicesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_devices_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMDEVICESGROUPCELL: {
        if ("layout/chat_room_devices_group_cell_0".equals(tag)) {
          return new ChatRoomDevicesGroupCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_devices_group_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMEPHEMERALDURATIONCELL: {
        if ("layout/chat_room_ephemeral_duration_cell_0".equals(tag)) {
          return new ChatRoomEphemeralDurationCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_ephemeral_duration_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMEPHEMERALFRAGMENT: {
        if ("layout/chat_room_ephemeral_fragment_0".equals(tag)) {
          return new ChatRoomEphemeralFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_ephemeral_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMGROUPINFOFRAGMENT: {
        if ("layout/chat_room_group_info_fragment_0".equals(tag)) {
          return new ChatRoomGroupInfoFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_group_info_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMGROUPINFOPARTICIPANTCELL: {
        if ("layout/chat_room_group_info_participant_cell_0".equals(tag)) {
          return new ChatRoomGroupInfoParticipantCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_group_info_participant_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMIMDNFRAGMENT: {
        if ("layout/chat_room_imdn_fragment_0".equals(tag)) {
          return new ChatRoomImdnFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_imdn_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMIMDNPARTICIPANTCELL: {
        if ("layout/chat_room_imdn_participant_cell_0".equals(tag)) {
          return new ChatRoomImdnParticipantCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_imdn_participant_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMLISTCELL: {
        if ("layout/chat_room_list_cell_0".equals(tag)) {
          return new ChatRoomListCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_list_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMMASTERFRAGMENT: {
        if ("layout/chat_room_master_fragment_0".equals(tag)) {
          return new ChatRoomMasterFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_master_fragment is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_CHATROOMMENU: {
        if ("layout/chat_room_menu_0".equals(tag)) {
          return new ChatRoomMenuBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_menu is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATROOMSENDING: {
        if ("layout/chat_room_sending_0".equals(tag)) {
          return new ChatRoomSendingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_room_sending is invalid. Received: " + tag);
      }
      case  LAYOUT_CHATUNREADMESSAGESLISTHEADER: {
        if ("layout/chat_unread_messages_list_header_0".equals(tag)) {
          return new ChatUnreadMessagesListHeaderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for chat_unread_messages_list_header is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFERENCESCHEDULECELL: {
        if ("layout/conference_schedule_cell_0".equals(tag)) {
          return new ConferenceScheduleCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for conference_schedule_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFERENCESCHEDULELISTHEADER: {
        if ("layout/conference_schedule_list_header_0".equals(tag)) {
          return new ConferenceScheduleListHeaderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for conference_schedule_list_header is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFERENCESCHEDULINGFRAGMENT: {
        if ("layout/conference_scheduling_fragment_0".equals(tag)) {
          return new ConferenceSchedulingFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for conference_scheduling_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFERENCESCHEDULINGPARTICIPANTCELL: {
        if ("layout/conference_scheduling_participant_cell_0".equals(tag)) {
          return new ConferenceSchedulingParticipantCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for conference_scheduling_participant_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFERENCESCHEDULINGPARTICIPANTSLISTFRAGMENT: {
        if ("layout/conference_scheduling_participants_list_fragment_0".equals(tag)) {
          return new ConferenceSchedulingParticipantsListFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for conference_scheduling_participants_list_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFERENCESCHEDULINGSUMMARYFRAGMENT: {
        if ("layout/conference_scheduling_summary_fragment_0".equals(tag)) {
          return new ConferenceSchedulingSummaryFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for conference_scheduling_summary_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFERENCEWAITINGROOMFRAGMENT: {
        if ("layout-land/conference_waiting_room_fragment_0".equals(tag)) {
          return new ConferenceWaitingRoomFragmentBindingLandImpl(component, view);
        }
        if ("layout/conference_waiting_room_fragment_0".equals(tag)) {
          return new ConferenceWaitingRoomFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for conference_waiting_room_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CONFERENCESSCHEDULEDFRAGMENT: {
        if ("layout/conferences_scheduled_fragment_0".equals(tag)) {
          return new ConferencesScheduledFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for conferences_scheduled_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTDETAILCELL: {
        if ("layout/contact_detail_cell_0".equals(tag)) {
          return new ContactDetailCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_detail_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTDETAILFRAGMENT: {
        if ("layout/contact_detail_fragment_0".equals(tag)) {
          return new ContactDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTEDITORFRAGMENT: {
        if ("layout/contact_editor_fragment_0".equals(tag)) {
          return new ContactEditorFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_editor_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTLISTCELL: {
        if ("layout/contact_list_cell_0".equals(tag)) {
          return new ContactListCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_list_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTMASTERFRAGMENT: {
        if ("layout/contact_master_fragment_0".equals(tag)) {
          return new ContactMasterFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_master_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTNUMBERADDRESSEDITORCELL: {
        if ("layout/contact_number_address_editor_cell_0".equals(tag)) {
          return new ContactNumberAddressEditorCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_number_address_editor_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTSELECTEDCELL: {
        if ("layout/contact_selected_cell_0".equals(tag)) {
          return new ContactSelectedCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_selected_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTSELECTIONCELL: {
        if ("layout/contact_selection_cell_0".equals(tag)) {
          return new ContactSelectionCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_selection_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_CONTACTSYNCACCOUNTPICKERFRAGMENT: {
        if ("layout/contact_sync_account_picker_fragment_0".equals(tag)) {
          return new ContactSyncAccountPickerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for contact_sync_account_picker_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALERFRAGMENT: {
        if ("layout-sw600dp/dialer_fragment_0".equals(tag)) {
          return new DialerFragmentBindingSw600dpImpl(component, view);
        }
        if ("layout-land/dialer_fragment_0".equals(tag)) {
          return new DialerFragmentBindingLandImpl(component, view);
        }
        if ("layout-sw533dp-land/dialer_fragment_0".equals(tag)) {
          return new DialerFragmentBindingSw533dpLandImpl(component, view);
        }
        if ("layout/dialer_fragment_0".equals(tag)) {
          return new DialerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialer_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_DIALOG: {
        if ("layout/dialog_0".equals(tag)) {
          return new DialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_FILEAUDIOVIEWERFRAGMENT: {
        if ("layout/file_audio_viewer_fragment_0".equals(tag)) {
          return new FileAudioViewerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for file_audio_viewer_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FILECONFIGVIEWERFRAGMENT: {
        if ("layout/file_config_viewer_fragment_0".equals(tag)) {
          return new FileConfigViewerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for file_config_viewer_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FILEIMAGEVIEWERFRAGMENT: {
        if ("layout/file_image_viewer_fragment_0".equals(tag)) {
          return new FileImageViewerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for file_image_viewer_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FILEPDFVIEWERFRAGMENT: {
        if ("layout/file_pdf_viewer_fragment_0".equals(tag)) {
          return new FilePdfViewerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for file_pdf_viewer_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FILETEXTVIEWERFRAGMENT: {
        if ("layout/file_text_viewer_fragment_0".equals(tag)) {
          return new FileTextViewerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for file_text_viewer_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FILEVIDEOVIEWERFRAGMENT: {
        if ("layout/file_video_viewer_fragment_0".equals(tag)) {
          return new FileVideoViewerFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for file_video_viewer_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_FILEVIEWERTOPBARFRAGMENT: {
        if ("layout/file_viewer_top_bar_fragment_0".equals(tag)) {
          return new FileViewerTopBarFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for file_viewer_top_bar_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_GENERICLISTHEADER: {
        if ("layout/generic_list_header_0".equals(tag)) {
          return new GenericListHeaderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for generic_list_header is invalid. Received: " + tag);
      }
      case  LAYOUT_HISTORYCONFDETAILFRAGMENT: {
        if ("layout/history_conf_detail_fragment_0".equals(tag)) {
          return new HistoryConfDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for history_conf_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_HISTORYDETAILCELL: {
        if ("layout/history_detail_cell_0".equals(tag)) {
          return new HistoryDetailCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for history_detail_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_HISTORYDETAILFRAGMENT: {
        if ("layout/history_detail_fragment_0".equals(tag)) {
          return new HistoryDetailFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for history_detail_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_HISTORYLISTCELL: {
        if ("layout/history_list_cell_0".equals(tag)) {
          return new HistoryListCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for history_list_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_HISTORYMASTERFRAGMENT: {
        if ("layout/history_master_fragment_0".equals(tag)) {
          return new HistoryMasterFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for history_master_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_IMDNLISTHEADER: {
        if ("layout/imdn_list_header_0".equals(tag)) {
          return new ImdnListHeaderBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for imdn_list_header is invalid. Received: " + tag);
      }
      case  LAYOUT_LISTEDITTOPBARFRAGMENT: {
        if ("layout/list_edit_top_bar_fragment_0".equals(tag)) {
          return new ListEditTopBarFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for list_edit_top_bar_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_MAINACTIVITY: {
        if ("layout/main_activity_0".equals(tag)) {
          return new MainActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for main_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_NUMPAD: {
        if ("layout/numpad_0".equals(tag)) {
          return new NumpadBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for numpad is invalid. Received: " + tag);
      }
      case  LAYOUT_RECORDINGLISTCELL: {
        if ("layout/recording_list_cell_0".equals(tag)) {
          return new RecordingListCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recording_list_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_RECORDINGSFRAGMENT: {
        if ("layout/recordings_fragment_0".equals(tag)) {
          return new RecordingsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for recordings_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSACCOUNTCELL: {
        if ("layout/settings_account_cell_0".equals(tag)) {
          return new SettingsAccountCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_account_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSACCOUNTFRAGMENT: {
        if ("layout/settings_account_fragment_0".equals(tag)) {
          return new SettingsAccountFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_account_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSADVANCEDFRAGMENT: {
        if ("layout/settings_advanced_fragment_0".equals(tag)) {
          return new SettingsAdvancedFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_advanced_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSAUDIOFRAGMENT: {
        if ("layout/settings_audio_fragment_0".equals(tag)) {
          return new SettingsAudioFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_audio_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSCALLFRAGMENT: {
        if ("layout/settings_call_fragment_0".equals(tag)) {
          return new SettingsCallFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_call_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSCHATFRAGMENT: {
        if ("layout/settings_chat_fragment_0".equals(tag)) {
          return new SettingsChatFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_chat_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSCONFERENCESFRAGMENT: {
        if ("layout/settings_conferences_fragment_0".equals(tag)) {
          return new SettingsConferencesFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_conferences_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSCONTACTSFRAGMENT: {
        if ("layout/settings_contacts_fragment_0".equals(tag)) {
          return new SettingsContactsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_contacts_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSFRAGMENT: {
        if ("layout/settings_fragment_0".equals(tag)) {
          return new SettingsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_fragment is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding2(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_SETTINGSLDAPCELL: {
        if ("layout/settings_ldap_cell_0".equals(tag)) {
          return new SettingsLdapCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_ldap_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSLDAPFRAGMENT: {
        if ("layout/settings_ldap_fragment_0".equals(tag)) {
          return new SettingsLdapFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_ldap_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSNETWORKFRAGMENT: {
        if ("layout/settings_network_fragment_0".equals(tag)) {
          return new SettingsNetworkFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_network_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSTUNNELFRAGMENT: {
        if ("layout/settings_tunnel_fragment_0".equals(tag)) {
          return new SettingsTunnelFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_tunnel_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSVIDEOFRAGMENT: {
        if ("layout/settings_video_fragment_0".equals(tag)) {
          return new SettingsVideoFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_video_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSWIDGETBASIC: {
        if ("layout/settings_widget_basic_0".equals(tag)) {
          return new SettingsWidgetBasicBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_widget_basic is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSWIDGETLIST: {
        if ("layout/settings_widget_list_0".equals(tag)) {
          return new SettingsWidgetListBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_widget_list is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSWIDGETSWITCH: {
        if ("layout/settings_widget_switch_0".equals(tag)) {
          return new SettingsWidgetSwitchBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_widget_switch is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSWIDGETSWITCHANDTEXT: {
        if ("layout/settings_widget_switch_and_text_0".equals(tag)) {
          return new SettingsWidgetSwitchAndTextBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_widget_switch_and_text is invalid. Received: " + tag);
      }
      case  LAYOUT_SETTINGSWIDGETTEXT: {
        if ("layout/settings_widget_text_0".equals(tag)) {
          return new SettingsWidgetTextBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for settings_widget_text is invalid. Received: " + tag);
      }
      case  LAYOUT_SIDEMENUACCOUNTCELL: {
        if ("layout/side_menu_account_cell_0".equals(tag)) {
          return new SideMenuAccountCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for side_menu_account_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_SIDEMENUFRAGMENT: {
        if ("layout/side_menu_fragment_0".equals(tag)) {
          return new SideMenuFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for side_menu_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_STATUSFRAGMENT: {
        if ("layout/status_fragment_0".equals(tag)) {
          return new StatusFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for status_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_TABSFRAGMENT: {
        if ("layout-land/tabs_fragment_0".equals(tag)) {
          return new TabsFragmentBindingLandImpl(component, view);
        }
        if ("layout/tabs_fragment_0".equals(tag)) {
          return new TabsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for tabs_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPACTIVITY: {
        if ("layout/voip_activity_0".equals(tag)) {
          return new VoipActivityBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_activity is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPBUTTONS: {
        if ("layout/voip_buttons_0".equals(tag)) {
          return new VoipButtonsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_buttons is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPBUTTONSAUDIOROUTES: {
        if ("layout/voip_buttons_audio_routes_0".equals(tag)) {
          return new VoipButtonsAudioRoutesBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_buttons_audio_routes is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPBUTTONSEXTRA: {
        if ("layout/voip_buttons_extra_0".equals(tag)) {
          return new VoipButtonsExtraBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_buttons_extra is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPBUTTONSINCOMING: {
        if ("layout/voip_buttons_incoming_0".equals(tag)) {
          return new VoipButtonsIncomingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_buttons_incoming is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPBUTTONSOUTGOING: {
        if ("layout/voip_buttons_outgoing_0".equals(tag)) {
          return new VoipButtonsOutgoingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_buttons_outgoing is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLCONTEXTMENU: {
        if ("layout/voip_call_context_menu_0".equals(tag)) {
          return new VoipCallContextMenuBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_call_context_menu is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLINCOMINGFRAGMENT: {
        if ("layout/voip_call_incoming_fragment_0".equals(tag)) {
          return new VoipCallIncomingFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_call_incoming_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLOUTGOINGFRAGMENT: {
        if ("layout/voip_call_outgoing_fragment_0".equals(tag)) {
          return new VoipCallOutgoingFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_call_outgoing_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLPAUSED: {
        if ("layout/voip_call_paused_0".equals(tag)) {
          return new VoipCallPausedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_call_paused is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLPAUSEDBYREMOTE: {
        if ("layout/voip_call_paused_by_remote_0".equals(tag)) {
          return new VoipCallPausedByRemoteBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_call_paused_by_remote is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLSTATCELL: {
        if ("layout/voip_call_stat_cell_0".equals(tag)) {
          return new VoipCallStatCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_call_stat_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLSTATS: {
        if ("layout/voip_call_stats_0".equals(tag)) {
          return new VoipCallStatsBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_call_stats is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLSTATSCELL: {
        if ("layout/voip_call_stats_cell_0".equals(tag)) {
          return new VoipCallStatsCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_call_stats_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLSCELL: {
        if ("layout/voip_calls_cell_0".equals(tag)) {
          return new VoipCallsCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_calls_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCALLSLISTFRAGMENT: {
        if ("layout/voip_calls_list_fragment_0".equals(tag)) {
          return new VoipCallsListFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_calls_list_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCHATFRAGMENT: {
        if ("layout/voip_chat_fragment_0".equals(tag)) {
          return new VoipChatFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_chat_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEACTIVESPEAKER: {
        if ("layout/voip_conference_active_speaker_0".equals(tag)) {
          return new VoipConferenceActiveSpeakerBindingImpl(component, view);
        }
        if ("layout-land/voip_conference_active_speaker_0".equals(tag)) {
          return new VoipConferenceActiveSpeakerBindingLandImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_active_speaker is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEAUDIOONLY: {
        if ("layout/voip_conference_audio_only_0".equals(tag)) {
          return new VoipConferenceAudioOnlyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_audio_only is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCECALLFRAGMENT: {
        if ("layout/voip_conference_call_fragment_0".equals(tag)) {
          return new VoipConferenceCallFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_call_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCECREATIONPENDINGWAITLAYOUT: {
        if ("layout/voip_conference_creation_pending_wait_layout_0".equals(tag)) {
          return new VoipConferenceCreationPendingWaitLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_creation_pending_wait_layout is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEGRID: {
        if ("layout-land/voip_conference_grid_0".equals(tag)) {
          return new VoipConferenceGridBindingLandImpl(component, view);
        }
        if ("layout/voip_conference_grid_0".equals(tag)) {
          return new VoipConferenceGridBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_grid is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEINCOMINGPARTICIPANTCELL: {
        if ("layout/voip_conference_incoming_participant_cell_0".equals(tag)) {
          return new VoipConferenceIncomingParticipantCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_incoming_participant_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCELAYOUTFRAGMENT: {
        if ("layout/voip_conference_layout_fragment_0".equals(tag)) {
          return new VoipConferenceLayoutFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_layout_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEPARTICIPANTBROADCASTCELL: {
        if ("layout/voip_conference_participant_broadcast_cell_0".equals(tag)) {
          return new VoipConferenceParticipantBroadcastCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_participant_broadcast_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEPARTICIPANTCELL: {
        if ("layout/voip_conference_participant_cell_0".equals(tag)) {
          return new VoipConferenceParticipantCellBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_participant_cell is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEPARTICIPANTREMOTEACTIVESPEAKERMINIATURE: {
        if ("layout/voip_conference_participant_remote_active_speaker_miniature_0".equals(tag)) {
          return new VoipConferenceParticipantRemoteActiveSpeakerMiniatureBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_participant_remote_active_speaker_miniature is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEPARTICIPANTREMOTEAUDIOONLY: {
        if ("layout/voip_conference_participant_remote_audio_only_0".equals(tag)) {
          return new VoipConferenceParticipantRemoteAudioOnlyBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_participant_remote_audio_only is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEPARTICIPANTREMOTEGRID: {
        if ("layout/voip_conference_participant_remote_grid_0".equals(tag)) {
          return new VoipConferenceParticipantRemoteGridBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_participant_remote_grid is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEPARTICIPANTSADDFRAGMENT: {
        if ("layout/voip_conference_participants_add_fragment_0".equals(tag)) {
          return new VoipConferenceParticipantsAddFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_participants_add_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEPARTICIPANTSFRAGMENT: {
        if ("layout/voip_conference_participants_fragment_0".equals(tag)) {
          return new VoipConferenceParticipantsFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_participants_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPCONFERENCEPAUSED: {
        if ("layout/voip_conference_paused_0".equals(tag)) {
          return new VoipConferencePausedBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_conference_paused is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPDIALOG: {
        if ("layout/voip_dialog_0".equals(tag)) {
          return new VoipDialogBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_dialog is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPDIALOGINFO: {
        if ("layout/voip_dialog_info_0".equals(tag)) {
          return new VoipDialogInfoBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_dialog_info is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPNUMPAD: {
        if ("layout/voip_numpad_0".equals(tag)) {
          return new VoipNumpadBindingImpl(component, view);
        }
        if ("layout-land/voip_numpad_0".equals(tag)) {
          return new VoipNumpadBindingLandImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_numpad is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPREMOTERECORDING: {
        if ("layout/voip_remote_recording_0".equals(tag)) {
          return new VoipRemoteRecordingBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_remote_recording is invalid. Received: " + tag);
      }
    }
    return null;
  }

  private final ViewDataBinding internalGetViewDataBinding3(DataBindingComponent component,
      View view, int internalId, Object tag) {
    switch(internalId) {
      case  LAYOUT_VOIPSINGLECALLFRAGMENT: {
        if ("layout/voip_single_call_fragment_0".equals(tag)) {
          return new VoipSingleCallFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_single_call_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_VOIPSTATUSFRAGMENT: {
        if ("layout/voip_status_fragment_0".equals(tag)) {
          return new VoipStatusFragmentBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for voip_status_fragment is invalid. Received: " + tag);
      }
      case  LAYOUT_WAITLAYOUT: {
        if ("layout/wait_layout_0".equals(tag)) {
          return new WaitLayoutBindingImpl(component, view);
        }
        throw new IllegalArgumentException("The tag for wait_layout is invalid. Received: " + tag);
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      // find which method will have it. -1 is necessary becausefirst id starts with 1;
      int methodIndex = (localizedLayoutId - 1) / 50;
      switch(methodIndex) {
        case 0: {
          return internalGetViewDataBinding0(component, view, localizedLayoutId, tag);
        }
        case 1: {
          return internalGetViewDataBinding1(component, view, localizedLayoutId, tag);
        }
        case 2: {
          return internalGetViewDataBinding2(component, view, localizedLayoutId, tag);
        }
        case 3: {
          return internalGetViewDataBinding3(component, view, localizedLayoutId, tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(157);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "aboutClickListener");
      sKeys.put(2, "accountLoginClickListener");
      sKeys.put(3, "addCallClickListener");
      sKeys.put(4, "addToContactsClickListener");
      sKeys.put(5, "addToContactsHidden");
      sKeys.put(6, "addToContactsListener");
      sKeys.put(7, "allContactsToggleClickListener");
      sKeys.put(8, "answerClickListener");
      sKeys.put(9, "applyClickListener");
      sKeys.put(10, "assistantClickListener");
      sKeys.put(11, "attachFileClickListener");
      sKeys.put(12, "avatarClickListener");
      sKeys.put(13, "callOverlayViewModel");
      sKeys.put(14, "callsViewModel");
      sKeys.put(15, "cancelClickListener");
      sKeys.put(16, "cancelForwardClickListener");
      sKeys.put(17, "cancelReplyToClickListener");
      sKeys.put(18, "cancelSharingClickListener");
      sKeys.put(19, "chatClickListener");
      sKeys.put(20, "chatRoomsListClickListener");
      sKeys.put(21, "chatSendingViewModel");
      sKeys.put(22, "checked");
      sKeys.put(23, "clickListener");
      sKeys.put(24, "closeBubbleClickListener");
      sKeys.put(25, "conferenceViewModel");
      sKeys.put(26, "conferencesClickListener");
      sKeys.put(27, "contactClickListener");
      sKeys.put(28, "contactsClickListener");
      sKeys.put(29, "contextMenuClickListener");
      sKeys.put(30, "controlsViewModel");
      sKeys.put(31, "copyAddressClickListener");
      sKeys.put(32, "copyTextClickListener");
      sKeys.put(33, "copyTextHidden");
      sKeys.put(34, "createAccountClickListener");
      sKeys.put(35, "cryingSelected");
      sKeys.put(36, "data");
      sKeys.put(37, "datePickerClickListener");
      sKeys.put(38, "defaultValue");
      sKeys.put(39, "deleteClickListener");
      sKeys.put(40, "deleteConferenceClickListener");
      sKeys.put(41, "detailsClickListener");
      sKeys.put(42, "devicesEnabled");
      sKeys.put(43, "devicesHidden");
      sKeys.put(44, "devicesListener");
      sKeys.put(45, "dialerClickListener");
      sKeys.put(46, "dialogMessage");
      sKeys.put(47, "dismissClickListener");
      sKeys.put(48, "dismissDialogClickListener");
      sKeys.put(49, "editClickListener");
      sKeys.put(50, "editConferenceClickListener");
      sKeys.put(51, "editionModeListener");
      sKeys.put(52, "emojiClickListener");
      sKeys.put(53, "enabled");
      sKeys.put(54, "ephemeralEnabled");
      sKeys.put(55, "ephemeralHidden");
      sKeys.put(56, "ephemeralListener");
      sKeys.put(57, "exportClickListener");
      sKeys.put(58, "forgotPasswordClickListener");
      sKeys.put(59, "forwardClickListener");
      sKeys.put(60, "forwardHidden");
      sKeys.put(61, "forwardPending");
      sKeys.put(62, "genericAccountLoginClickListener");
      sKeys.put(63, "goToContactHidden");
      sKeys.put(64, "goToContactListener");
      sKeys.put(65, "groupCallListener");
      sKeys.put(66, "groupCount");
      sKeys.put(67, "groupInfoHidden");
      sKeys.put(68, "groupInfoListener");
      sKeys.put(69, "hangupClickListener");
      sKeys.put(70, "heartSelected");
      sKeys.put(71, "hideAccept");
      sKeys.put(72, "hidePause");
      sKeys.put(73, "hideResume");
      sKeys.put(74, "hideTransfer");
      sKeys.put(75, "historyClickListener");
      sKeys.put(76, "icon");
      sKeys.put(77, "imdnClickListener");
      sKeys.put(78, "imdnHidden");
      sKeys.put(79, "inflatedVisibility");
      sKeys.put(80, "infoClickListener");
      sKeys.put(81, "inputType");
      sKeys.put(82, "isEncrypted");
      sKeys.put(83, "joinConferenceClickListener");
      sKeys.put(84, "keyListener");
      sKeys.put(85, "labels");
      sKeys.put(86, "laughingSelected");
      sKeys.put(87, "leaveClickListener");
      sKeys.put(88, "licenseClickListener");
      sKeys.put(89, "listener");
      sKeys.put(90, "localSyncAccountClickListener");
      sKeys.put(91, "longClickListener");
      sKeys.put(92, "meetingEnabled");
      sKeys.put(93, "meetingHidden");
      sKeys.put(94, "meetingListener");
      sKeys.put(95, "menuClickListener");
      sKeys.put(96, "menuLongClickListener");
      sKeys.put(97, "muteHidden");
      sKeys.put(98, "muteListener");
      sKeys.put(99, "newConferenceClickListener");
      sKeys.put(100, "newContactClickListener");
      sKeys.put(101, "newGroupChatRoomClickListener");
      sKeys.put(102, "newOneToOneChatRoomClickListener");
      sKeys.put(103, "nextClickListener");
      sKeys.put(104, "openAppClickListener");
      sKeys.put(105, "parent");
      sKeys.put(106, "participantsClickListener");
      sKeys.put(107, "pauseClickListener");
      sKeys.put(108, "playListener");
      sKeys.put(109, "position");
      sKeys.put(110, "privacyPolicyClickListener");
      sKeys.put(111, "qrCodeClickListener");
      sKeys.put(112, "quitClickListener");
      sKeys.put(113, "recordingsClickListener");
      sKeys.put(114, "refreshClickListener");
      sKeys.put(115, "remoteProvisioningClickListener");
      sKeys.put(116, "removeClickListener");
      sKeys.put(117, "replyClickListener");
      sKeys.put(118, "replyHidden");
      sKeys.put(119, "resendClickListener");
      sKeys.put(120, "resendHidden");
      sKeys.put(121, "resumeClickListener");
      sKeys.put(122, "saveChangesClickListener");
      sKeys.put(123, "scrollToBottomClickListener");
      sKeys.put(124, "securityIconClickListener");
      sKeys.put(125, "selectAllClickListener");
      sKeys.put(126, "selectCountryClickListener");
      sKeys.put(127, "selectedIndex");
      sKeys.put(128, "selectionListViewModel");
      sKeys.put(129, "selfPictureClickListener");
      sKeys.put(130, "sendMessageClickListener");
      sKeys.put(131, "settingsClickListener");
      sKeys.put(132, "sharedMainViewModel");
      sKeys.put(133, "sipContactsToggleClickListener");
      sKeys.put(134, "statsViewModel");
      sKeys.put(135, "subtitle");
      sKeys.put(136, "surprisedSelected");
      sKeys.put(137, "switch_subtitle");
      sKeys.put(138, "switch_title");
      sKeys.put(139, "textColor");
      sKeys.put(140, "text_subtitle");
      sKeys.put(141, "text_title");
      sKeys.put(142, "thumbsUpSelected");
      sKeys.put(143, "timePickerClickListener");
      sKeys.put(144, "title");
      sKeys.put(145, "transferCallClickListener");
      sKeys.put(146, "transferClickListener");
      sKeys.put(147, "unSelectAllClickListener");
      sKeys.put(148, "understoodClickListener");
      sKeys.put(149, "unmuteHidden");
      sKeys.put(150, "unmuteListener");
      sKeys.put(151, "validClickListener");
      sKeys.put(152, "videoTouchListener");
      sKeys.put(153, "viewModel");
      sKeys.put(154, "visibility");
      sKeys.put(155, "voiceRecordingTouchListener");
      sKeys.put(156, "weblateClickListener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(163);

    static {
      sKeys.put("layout-land/about_fragment_0", org.linphone.R.layout.about_fragment);
      sKeys.put("layout/about_fragment_0", org.linphone.R.layout.about_fragment);
      sKeys.put("layout/assistant_account_login_fragment_0", org.linphone.R.layout.assistant_account_login_fragment);
      sKeys.put("layout/assistant_country_picker_fragment_0", org.linphone.R.layout.assistant_country_picker_fragment);
      sKeys.put("layout/assistant_echo_canceller_calibration_fragment_0", org.linphone.R.layout.assistant_echo_canceller_calibration_fragment);
      sKeys.put("layout/assistant_email_account_creation_fragment_0", org.linphone.R.layout.assistant_email_account_creation_fragment);
      sKeys.put("layout/assistant_email_account_validation_fragment_0", org.linphone.R.layout.assistant_email_account_validation_fragment);
      sKeys.put("layout/assistant_generic_account_login_fragment_0", org.linphone.R.layout.assistant_generic_account_login_fragment);
      sKeys.put("layout/assistant_generic_account_warning_fragment_0", org.linphone.R.layout.assistant_generic_account_warning_fragment);
      sKeys.put("layout/assistant_no_push_warning_fragment_0", org.linphone.R.layout.assistant_no_push_warning_fragment);
      sKeys.put("layout/assistant_phone_account_creation_fragment_0", org.linphone.R.layout.assistant_phone_account_creation_fragment);
      sKeys.put("layout/assistant_phone_account_linking_fragment_0", org.linphone.R.layout.assistant_phone_account_linking_fragment);
      sKeys.put("layout/assistant_phone_account_validation_fragment_0", org.linphone.R.layout.assistant_phone_account_validation_fragment);
      sKeys.put("layout/assistant_qr_code_fragment_0", org.linphone.R.layout.assistant_qr_code_fragment);
      sKeys.put("layout/assistant_remote_provisioning_fragment_0", org.linphone.R.layout.assistant_remote_provisioning_fragment);
      sKeys.put("layout/assistant_top_bar_fragment_0", org.linphone.R.layout.assistant_top_bar_fragment);
      sKeys.put("layout/assistant_welcome_fragment_0", org.linphone.R.layout.assistant_welcome_fragment);
      sKeys.put("layout-land/assistant_welcome_fragment_0", org.linphone.R.layout.assistant_welcome_fragment);
      sKeys.put("layout/call_overlay_0", org.linphone.R.layout.call_overlay);
      sKeys.put("layout/chat_bubble_activity_0", org.linphone.R.layout.chat_bubble_activity);
      sKeys.put("layout/chat_event_list_cell_0", org.linphone.R.layout.chat_event_list_cell);
      sKeys.put("layout/chat_message_attachment_cell_0", org.linphone.R.layout.chat_message_attachment_cell);
      sKeys.put("layout/chat_message_conference_invitation_content_cell_0", org.linphone.R.layout.chat_message_conference_invitation_content_cell);
      sKeys.put("layout/chat_message_content_cell_0", org.linphone.R.layout.chat_message_content_cell);
      sKeys.put("layout/chat_message_downloadable_file_content_cell_0", org.linphone.R.layout.chat_message_downloadable_file_content_cell);
      sKeys.put("layout/chat_message_generic_file_content_cell_0", org.linphone.R.layout.chat_message_generic_file_content_cell);
      sKeys.put("layout/chat_message_image_content_cell_0", org.linphone.R.layout.chat_message_image_content_cell);
      sKeys.put("layout/chat_message_list_cell_0", org.linphone.R.layout.chat_message_list_cell);
      sKeys.put("layout/chat_message_long_press_menu_0", org.linphone.R.layout.chat_message_long_press_menu);
      sKeys.put("layout/chat_message_reaction_0", org.linphone.R.layout.chat_message_reaction);
      sKeys.put("layout/chat_message_reactions_list_cell_0", org.linphone.R.layout.chat_message_reactions_list_cell);
      sKeys.put("layout/chat_message_reactions_list_dialog_0", org.linphone.R.layout.chat_message_reactions_list_dialog);
      sKeys.put("layout/chat_message_reply_0", org.linphone.R.layout.chat_message_reply);
      sKeys.put("layout/chat_message_reply_bubble_0", org.linphone.R.layout.chat_message_reply_bubble);
      sKeys.put("layout/chat_message_reply_content_cell_0", org.linphone.R.layout.chat_message_reply_content_cell);
      sKeys.put("layout/chat_message_reply_preview_content_cell_0", org.linphone.R.layout.chat_message_reply_preview_content_cell);
      sKeys.put("layout/chat_message_video_content_cell_0", org.linphone.R.layout.chat_message_video_content_cell);
      sKeys.put("layout/chat_message_voice_record_content_cell_0", org.linphone.R.layout.chat_message_voice_record_content_cell);
      sKeys.put("layout/chat_message_voice_recording_0", org.linphone.R.layout.chat_message_voice_recording);
      sKeys.put("layout/chat_room_creation_fragment_0", org.linphone.R.layout.chat_room_creation_fragment);
      sKeys.put("layout/chat_room_detail_fragment_0", org.linphone.R.layout.chat_room_detail_fragment);
      sKeys.put("layout/chat_room_devices_child_cell_0", org.linphone.R.layout.chat_room_devices_child_cell);
      sKeys.put("layout/chat_room_devices_fragment_0", org.linphone.R.layout.chat_room_devices_fragment);
      sKeys.put("layout/chat_room_devices_group_cell_0", org.linphone.R.layout.chat_room_devices_group_cell);
      sKeys.put("layout/chat_room_ephemeral_duration_cell_0", org.linphone.R.layout.chat_room_ephemeral_duration_cell);
      sKeys.put("layout/chat_room_ephemeral_fragment_0", org.linphone.R.layout.chat_room_ephemeral_fragment);
      sKeys.put("layout/chat_room_group_info_fragment_0", org.linphone.R.layout.chat_room_group_info_fragment);
      sKeys.put("layout/chat_room_group_info_participant_cell_0", org.linphone.R.layout.chat_room_group_info_participant_cell);
      sKeys.put("layout/chat_room_imdn_fragment_0", org.linphone.R.layout.chat_room_imdn_fragment);
      sKeys.put("layout/chat_room_imdn_participant_cell_0", org.linphone.R.layout.chat_room_imdn_participant_cell);
      sKeys.put("layout/chat_room_list_cell_0", org.linphone.R.layout.chat_room_list_cell);
      sKeys.put("layout/chat_room_master_fragment_0", org.linphone.R.layout.chat_room_master_fragment);
      sKeys.put("layout/chat_room_menu_0", org.linphone.R.layout.chat_room_menu);
      sKeys.put("layout/chat_room_sending_0", org.linphone.R.layout.chat_room_sending);
      sKeys.put("layout/chat_unread_messages_list_header_0", org.linphone.R.layout.chat_unread_messages_list_header);
      sKeys.put("layout/conference_schedule_cell_0", org.linphone.R.layout.conference_schedule_cell);
      sKeys.put("layout/conference_schedule_list_header_0", org.linphone.R.layout.conference_schedule_list_header);
      sKeys.put("layout/conference_scheduling_fragment_0", org.linphone.R.layout.conference_scheduling_fragment);
      sKeys.put("layout/conference_scheduling_participant_cell_0", org.linphone.R.layout.conference_scheduling_participant_cell);
      sKeys.put("layout/conference_scheduling_participants_list_fragment_0", org.linphone.R.layout.conference_scheduling_participants_list_fragment);
      sKeys.put("layout/conference_scheduling_summary_fragment_0", org.linphone.R.layout.conference_scheduling_summary_fragment);
      sKeys.put("layout-land/conference_waiting_room_fragment_0", org.linphone.R.layout.conference_waiting_room_fragment);
      sKeys.put("layout/conference_waiting_room_fragment_0", org.linphone.R.layout.conference_waiting_room_fragment);
      sKeys.put("layout/conferences_scheduled_fragment_0", org.linphone.R.layout.conferences_scheduled_fragment);
      sKeys.put("layout/contact_detail_cell_0", org.linphone.R.layout.contact_detail_cell);
      sKeys.put("layout/contact_detail_fragment_0", org.linphone.R.layout.contact_detail_fragment);
      sKeys.put("layout/contact_editor_fragment_0", org.linphone.R.layout.contact_editor_fragment);
      sKeys.put("layout/contact_list_cell_0", org.linphone.R.layout.contact_list_cell);
      sKeys.put("layout/contact_master_fragment_0", org.linphone.R.layout.contact_master_fragment);
      sKeys.put("layout/contact_number_address_editor_cell_0", org.linphone.R.layout.contact_number_address_editor_cell);
      sKeys.put("layout/contact_selected_cell_0", org.linphone.R.layout.contact_selected_cell);
      sKeys.put("layout/contact_selection_cell_0", org.linphone.R.layout.contact_selection_cell);
      sKeys.put("layout/contact_sync_account_picker_fragment_0", org.linphone.R.layout.contact_sync_account_picker_fragment);
      sKeys.put("layout-sw600dp/dialer_fragment_0", org.linphone.R.layout.dialer_fragment);
      sKeys.put("layout-land/dialer_fragment_0", org.linphone.R.layout.dialer_fragment);
      sKeys.put("layout-sw533dp-land/dialer_fragment_0", org.linphone.R.layout.dialer_fragment);
      sKeys.put("layout/dialer_fragment_0", org.linphone.R.layout.dialer_fragment);
      sKeys.put("layout/dialog_0", org.linphone.R.layout.dialog);
      sKeys.put("layout/file_audio_viewer_fragment_0", org.linphone.R.layout.file_audio_viewer_fragment);
      sKeys.put("layout/file_config_viewer_fragment_0", org.linphone.R.layout.file_config_viewer_fragment);
      sKeys.put("layout/file_image_viewer_fragment_0", org.linphone.R.layout.file_image_viewer_fragment);
      sKeys.put("layout/file_pdf_viewer_fragment_0", org.linphone.R.layout.file_pdf_viewer_fragment);
      sKeys.put("layout/file_text_viewer_fragment_0", org.linphone.R.layout.file_text_viewer_fragment);
      sKeys.put("layout/file_video_viewer_fragment_0", org.linphone.R.layout.file_video_viewer_fragment);
      sKeys.put("layout/file_viewer_top_bar_fragment_0", org.linphone.R.layout.file_viewer_top_bar_fragment);
      sKeys.put("layout/generic_list_header_0", org.linphone.R.layout.generic_list_header);
      sKeys.put("layout/history_conf_detail_fragment_0", org.linphone.R.layout.history_conf_detail_fragment);
      sKeys.put("layout/history_detail_cell_0", org.linphone.R.layout.history_detail_cell);
      sKeys.put("layout/history_detail_fragment_0", org.linphone.R.layout.history_detail_fragment);
      sKeys.put("layout/history_list_cell_0", org.linphone.R.layout.history_list_cell);
      sKeys.put("layout/history_master_fragment_0", org.linphone.R.layout.history_master_fragment);
      sKeys.put("layout/imdn_list_header_0", org.linphone.R.layout.imdn_list_header);
      sKeys.put("layout/list_edit_top_bar_fragment_0", org.linphone.R.layout.list_edit_top_bar_fragment);
      sKeys.put("layout/main_activity_0", org.linphone.R.layout.main_activity);
      sKeys.put("layout/numpad_0", org.linphone.R.layout.numpad);
      sKeys.put("layout/recording_list_cell_0", org.linphone.R.layout.recording_list_cell);
      sKeys.put("layout/recordings_fragment_0", org.linphone.R.layout.recordings_fragment);
      sKeys.put("layout/settings_account_cell_0", org.linphone.R.layout.settings_account_cell);
      sKeys.put("layout/settings_account_fragment_0", org.linphone.R.layout.settings_account_fragment);
      sKeys.put("layout/settings_advanced_fragment_0", org.linphone.R.layout.settings_advanced_fragment);
      sKeys.put("layout/settings_audio_fragment_0", org.linphone.R.layout.settings_audio_fragment);
      sKeys.put("layout/settings_call_fragment_0", org.linphone.R.layout.settings_call_fragment);
      sKeys.put("layout/settings_chat_fragment_0", org.linphone.R.layout.settings_chat_fragment);
      sKeys.put("layout/settings_conferences_fragment_0", org.linphone.R.layout.settings_conferences_fragment);
      sKeys.put("layout/settings_contacts_fragment_0", org.linphone.R.layout.settings_contacts_fragment);
      sKeys.put("layout/settings_fragment_0", org.linphone.R.layout.settings_fragment);
      sKeys.put("layout/settings_ldap_cell_0", org.linphone.R.layout.settings_ldap_cell);
      sKeys.put("layout/settings_ldap_fragment_0", org.linphone.R.layout.settings_ldap_fragment);
      sKeys.put("layout/settings_network_fragment_0", org.linphone.R.layout.settings_network_fragment);
      sKeys.put("layout/settings_tunnel_fragment_0", org.linphone.R.layout.settings_tunnel_fragment);
      sKeys.put("layout/settings_video_fragment_0", org.linphone.R.layout.settings_video_fragment);
      sKeys.put("layout/settings_widget_basic_0", org.linphone.R.layout.settings_widget_basic);
      sKeys.put("layout/settings_widget_list_0", org.linphone.R.layout.settings_widget_list);
      sKeys.put("layout/settings_widget_switch_0", org.linphone.R.layout.settings_widget_switch);
      sKeys.put("layout/settings_widget_switch_and_text_0", org.linphone.R.layout.settings_widget_switch_and_text);
      sKeys.put("layout/settings_widget_text_0", org.linphone.R.layout.settings_widget_text);
      sKeys.put("layout/side_menu_account_cell_0", org.linphone.R.layout.side_menu_account_cell);
      sKeys.put("layout/side_menu_fragment_0", org.linphone.R.layout.side_menu_fragment);
      sKeys.put("layout/status_fragment_0", org.linphone.R.layout.status_fragment);
      sKeys.put("layout-land/tabs_fragment_0", org.linphone.R.layout.tabs_fragment);
      sKeys.put("layout/tabs_fragment_0", org.linphone.R.layout.tabs_fragment);
      sKeys.put("layout/voip_activity_0", org.linphone.R.layout.voip_activity);
      sKeys.put("layout/voip_buttons_0", org.linphone.R.layout.voip_buttons);
      sKeys.put("layout/voip_buttons_audio_routes_0", org.linphone.R.layout.voip_buttons_audio_routes);
      sKeys.put("layout/voip_buttons_extra_0", org.linphone.R.layout.voip_buttons_extra);
      sKeys.put("layout/voip_buttons_incoming_0", org.linphone.R.layout.voip_buttons_incoming);
      sKeys.put("layout/voip_buttons_outgoing_0", org.linphone.R.layout.voip_buttons_outgoing);
      sKeys.put("layout/voip_call_context_menu_0", org.linphone.R.layout.voip_call_context_menu);
      sKeys.put("layout/voip_call_incoming_fragment_0", org.linphone.R.layout.voip_call_incoming_fragment);
      sKeys.put("layout/voip_call_outgoing_fragment_0", org.linphone.R.layout.voip_call_outgoing_fragment);
      sKeys.put("layout/voip_call_paused_0", org.linphone.R.layout.voip_call_paused);
      sKeys.put("layout/voip_call_paused_by_remote_0", org.linphone.R.layout.voip_call_paused_by_remote);
      sKeys.put("layout/voip_call_stat_cell_0", org.linphone.R.layout.voip_call_stat_cell);
      sKeys.put("layout/voip_call_stats_0", org.linphone.R.layout.voip_call_stats);
      sKeys.put("layout/voip_call_stats_cell_0", org.linphone.R.layout.voip_call_stats_cell);
      sKeys.put("layout/voip_calls_cell_0", org.linphone.R.layout.voip_calls_cell);
      sKeys.put("layout/voip_calls_list_fragment_0", org.linphone.R.layout.voip_calls_list_fragment);
      sKeys.put("layout/voip_chat_fragment_0", org.linphone.R.layout.voip_chat_fragment);
      sKeys.put("layout/voip_conference_active_speaker_0", org.linphone.R.layout.voip_conference_active_speaker);
      sKeys.put("layout-land/voip_conference_active_speaker_0", org.linphone.R.layout.voip_conference_active_speaker);
      sKeys.put("layout/voip_conference_audio_only_0", org.linphone.R.layout.voip_conference_audio_only);
      sKeys.put("layout/voip_conference_call_fragment_0", org.linphone.R.layout.voip_conference_call_fragment);
      sKeys.put("layout/voip_conference_creation_pending_wait_layout_0", org.linphone.R.layout.voip_conference_creation_pending_wait_layout);
      sKeys.put("layout-land/voip_conference_grid_0", org.linphone.R.layout.voip_conference_grid);
      sKeys.put("layout/voip_conference_grid_0", org.linphone.R.layout.voip_conference_grid);
      sKeys.put("layout/voip_conference_incoming_participant_cell_0", org.linphone.R.layout.voip_conference_incoming_participant_cell);
      sKeys.put("layout/voip_conference_layout_fragment_0", org.linphone.R.layout.voip_conference_layout_fragment);
      sKeys.put("layout/voip_conference_participant_broadcast_cell_0", org.linphone.R.layout.voip_conference_participant_broadcast_cell);
      sKeys.put("layout/voip_conference_participant_cell_0", org.linphone.R.layout.voip_conference_participant_cell);
      sKeys.put("layout/voip_conference_participant_remote_active_speaker_miniature_0", org.linphone.R.layout.voip_conference_participant_remote_active_speaker_miniature);
      sKeys.put("layout/voip_conference_participant_remote_audio_only_0", org.linphone.R.layout.voip_conference_participant_remote_audio_only);
      sKeys.put("layout/voip_conference_participant_remote_grid_0", org.linphone.R.layout.voip_conference_participant_remote_grid);
      sKeys.put("layout/voip_conference_participants_add_fragment_0", org.linphone.R.layout.voip_conference_participants_add_fragment);
      sKeys.put("layout/voip_conference_participants_fragment_0", org.linphone.R.layout.voip_conference_participants_fragment);
      sKeys.put("layout/voip_conference_paused_0", org.linphone.R.layout.voip_conference_paused);
      sKeys.put("layout/voip_dialog_0", org.linphone.R.layout.voip_dialog);
      sKeys.put("layout/voip_dialog_info_0", org.linphone.R.layout.voip_dialog_info);
      sKeys.put("layout/voip_numpad_0", org.linphone.R.layout.voip_numpad);
      sKeys.put("layout-land/voip_numpad_0", org.linphone.R.layout.voip_numpad);
      sKeys.put("layout/voip_remote_recording_0", org.linphone.R.layout.voip_remote_recording);
      sKeys.put("layout/voip_single_call_fragment_0", org.linphone.R.layout.voip_single_call_fragment);
      sKeys.put("layout/voip_status_fragment_0", org.linphone.R.layout.voip_status_fragment);
      sKeys.put("layout/wait_layout_0", org.linphone.R.layout.wait_layout);
    }
  }
}
