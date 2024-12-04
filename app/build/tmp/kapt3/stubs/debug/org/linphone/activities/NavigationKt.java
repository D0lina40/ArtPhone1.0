package org.linphone.activities;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, xi = 48, d1 = {"\u0000\u009a\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a$\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t\u001a\f\u0010\u000b\u001a\u00020\u0001*\u00020\fH\u0000\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u000eH\u0000\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0010H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0003*\u00020\u0012H\u0000\u001a\f\u0010\u0013\u001a\u00020\u0001*\u00020\u0014H\u0000\u001a\u0016\u0010\u0015\u001a\u00020\u0001*\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\f\u0010\u0019\u001a\u00020\u0001*\u00020\u001aH\u0000\u001a\u0016\u0010\u001b\u001a\u00020\u0001*\u00020\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0014\u0010\u001b\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000\u001a\u0014\u0010\u001b\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fH\u0000\u001a\f\u0010 \u001a\u00020\u0001*\u00020!H\u0000\u001a\f\u0010 \u001a\u00020\u0001*\u00020\"H\u0000\u001a\f\u0010 \u001a\u00020\u0001*\u00020#H\u0000\u001a\f\u0010$\u001a\u00020\u0001*\u00020%H\u0000\u001a\u0014\u0010&\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\u0014\u0010)\u001a\u00020\u0001*\u00020*2\u0006\u0010+\u001a\u00020\tH\u0000\u001a\u0014\u0010,\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\f\u0010-\u001a\u00020\u0001*\u00020.H\u0000\u001a\u0014\u0010-\u001a\u00020\u0001*\u00020\f2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\u0014\u0010/\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\f\u00100\u001a\u00020\u0001*\u000201H\u0000\u001a\f\u00100\u001a\u00020\u0001*\u000202H\u0000\u001a \u00103\u001a\u00020\u0001*\u0002042\b\u00105\u001a\u0004\u0018\u00010\u001f2\b\u00106\u001a\u0004\u0018\u00010\u001fH\u0000\u001a\u0014\u00103\u001a\u00020\u0001*\u0002072\u0006\u0010\u0017\u001a\u00020\u0018H\u0000\u001a\u001e\u00103\u001a\u00020\u0001*\u0002082\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u00109\u001a\u00020\tH\u0000\u001a\u0014\u00103\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0018H\u0000\u001a\u0016\u00103\u001a\u00020\u0001*\u00020:2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0016\u00103\u001a\u00020\u0001*\u00020;2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0016\u0010<\u001a\u00020\u0001*\u0002082\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u001e\u0010<\u001a\u00020\u0001*\u00020\u000e2\b\b\u0002\u0010=\u001a\u00020\t2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\u0018\u0010>\u001a\u00020\u0001*\u0002042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\f\u0010>\u001a\u00020\u0001*\u00020.H\u0000\u001a\u0014\u0010?\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\f\u0010@\u001a\u00020\u0001*\u00020!H\u0000\u001a\u0014\u0010A\u001a\u00020\u0001*\u00020\f2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\f\u0010B\u001a\u00020\u0001*\u000201H\u0000\u001a\f\u0010B\u001a\u00020\u0001*\u000202H\u0000\u001a\f\u0010C\u001a\u00020\u0001*\u000201H\u0000\u001a\f\u0010C\u001a\u00020\u0001*\u000202H\u0000\u001a\f\u0010D\u001a\u00020\u0001*\u00020*H\u0000\u001a\f\u0010D\u001a\u00020\u0001*\u00020EH\u0000\u001a\f\u0010D\u001a\u00020\u0001*\u00020FH\u0000\u001a\u001e\u0010G\u001a\u00020\u0001*\u00020*2\u0006\u0010H\u001a\u00020\u001f2\b\u0010I\u001a\u0004\u0018\u00010\u001fH\u0000\u001a\u001e\u0010G\u001a\u00020\u0001*\u00020E2\u0006\u0010H\u001a\u00020\u001f2\b\u0010I\u001a\u0004\u0018\u00010\u001fH\u0000\u001a\u001e\u0010G\u001a\u00020\u0001*\u00020\f2\u0006\u0010H\u001a\u00020\u001f2\b\u0010I\u001a\u0004\u0018\u00010\u001fH\u0000\u001a\u0014\u0010J\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\f\u0010K\u001a\u00020\u0001*\u00020FH\u0000\u001a\u0016\u0010L\u001a\u00020\u0001*\u0002042\b\u0010M\u001a\u0004\u0018\u00010\u001fH\u0000\u001a\u0014\u0010L\u001a\u00020\u0001*\u00020N2\u0006\u0010O\u001a\u00020\u001fH\u0000\u001a\f\u0010L\u001a\u00020\u0001*\u00020\u0010H\u0000\u001a\f\u0010P\u001a\u00020\u0001*\u00020:H\u0000\u001a \u0010P\u001a\u00020\u0001*\u00020\u00102\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\f\u0010R\u001a\u00020\u0001*\u000204H\u0000\u001a\u0014\u0010R\u001a\u00020\u0001*\u00020*2\u0006\u0010Q\u001a\u00020\u001fH\u0000\u001a\u0016\u0010R\u001a\u00020\u0001*\u00020F2\b\u0010S\u001a\u0004\u0018\u00010\u001fH\u0000\u001a\f\u0010R\u001a\u00020\u0001*\u00020.H\u0000\u001a\u0014\u0010R\u001a\u00020\u0001*\u00020;2\u0006\u0010Q\u001a\u00020\u001fH\u0000\u001a\u0014\u0010T\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\f\u0010U\u001a\u00020\u0001*\u00020*H\u0000\u001a\u0018\u0010V\u001a\u00020\u0001*\u0002042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0016\u0010V\u001a\u00020\u0001*\u00020*2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\f\u0010V\u001a\u00020\u0001*\u00020WH\u0000\u001a\u0016\u0010V\u001a\u00020\u0001*\u00020:2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\f\u0010V\u001a\u00020\u0001*\u00020.H\u0000\u001a\u0016\u0010V\u001a\u00020\u0001*\u00020;2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0016\u0010V\u001a\u00020\u0001*\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\f\u0010X\u001a\u00020\u0001*\u00020YH\u0000\u001a\f\u0010X\u001a\u00020\u0001*\u00020ZH\u0000\u001a\f\u0010X\u001a\u00020\u0001*\u00020[H\u0000\u001a\f\u0010X\u001a\u00020\u0001*\u00020\u001cH\u0000\u001a\f\u0010X\u001a\u00020\u0001*\u00020\\H\u0000\u001a\f\u0010]\u001a\u00020\u0001*\u00020\u001aH\u0000\u001a\f\u0010^\u001a\u00020\u0001*\u00020_H\u0000\u001a\f\u0010`\u001a\u00020\u0001*\u00020*H\u0000\u001a\f\u0010a\u001a\u00020\u0001*\u00020*H\u0000\u001a\u0014\u0010b\u001a\u00020\u0001*\u00020*2\u0006\u0010H\u001a\u00020\u001fH\u0000\u001a\u0014\u0010b\u001a\u00020\u0001*\u00020;2\u0006\u0010H\u001a\u00020\u001fH\u0000\u001a\f\u0010c\u001a\u00020\u0001*\u00020dH\u0000\u001a\f\u0010e\u001a\u00020\u0001*\u00020\u001aH\u0000\u001a\f\u0010f\u001a\u00020\u0001*\u000207H\u0000\u001a\f\u0010f\u001a\u00020\u0001*\u00020*H\u0000\u001a\u0014\u0010g\u001a\u00020\u0001*\u00020*2\u0006\u0010+\u001a\u00020\tH\u0000\u001a\u0016\u0010h\u001a\u00020\u0001*\u00020*2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0014\u0010i\u001a\u00020\u0001*\u00020!2\u0006\u0010j\u001a\u00020\tH\u0000\u001a\f\u0010i\u001a\u00020\u0001*\u000202H\u0000\u001a\u0014\u0010k\u001a\u00020\u0001*\u00020l2\u0006\u0010m\u001a\u00020\u0007H\u0000\u001a\u0014\u0010n\u001a\u00020\u0001*\u00020*2\u0006\u0010O\u001a\u00020\u001fH\u0000\u001a\u0014\u0010n\u001a\u00020\u0001*\u00020;2\u0006\u0010O\u001a\u00020\u001fH\u0000\u001a\u0014\u0010o\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\f\u0010p\u001a\u00020\u0001*\u00020\u001aH\u0000\u001a\f\u0010q\u001a\u00020\u0001*\u00020!H\u0000\u001a\f\u0010q\u001a\u00020\u0001*\u000202H\u0000\u001a\f\u0010r\u001a\u00020\u0001*\u00020sH\u0000\u001a\u0014\u0010t\u001a\u00020\u0001*\u00020*2\u0006\u0010+\u001a\u00020\tH\u0000\u001a\f\u0010u\u001a\u00020\u0001*\u00020\u001aH\u0000\u001a\u0016\u0010v\u001a\u00020\u0001*\u00020Y2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0016\u0010v\u001a\u00020\u0001*\u00020w2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0016\u0010v\u001a\u00020\u0001*\u00020[2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\u0016\u0010x\u001a\u00020\u0001*\u00020y2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000\u001a\f\u0010z\u001a\u00020\u0001*\u00020\\H\u0000\u001a\f\u0010{\u001a\u00020\u0001*\u00020\u0014H\u0000\u001a\f\u0010|\u001a\u00020\u0001*\u00020\u001aH\u0000\u001a\f\u0010}\u001a\u00020\u0001*\u00020WH\u0000\u001a\f\u0010}\u001a\u00020\u0001*\u00020\u0014H\u0000\u001a\f\u0010~\u001a\u00020\u0001*\u00020\u0014H\u0000\u001a\r\u0010\u007f\u001a\u00020\u0001*\u00030\u0080\u0001H\u0000\u001a\u0015\u0010\u0081\u0001\u001a\u00020\u0001*\u00020*2\u0006\u0010+\u001a\u00020\tH\u0000\u001a\u0015\u0010\u0082\u0001\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\u0015\u0010\u0083\u0001\u001a\u00020\u0001*\u00020*2\u0006\u0010+\u001a\u00020\tH\u0000\u001a\u0015\u0010\u0084\u0001\u001a\u00020\u0001*\u00020\u001d2\u0006\u0010\'\u001a\u00020(H\u0000\u001a\r\u0010\u0085\u0001\u001a\u00020\u0001*\u000201H\u0000\u00a8\u0006\u0086\u0001"}, d2 = {"navigateToEmptySetting", "", "navController", "Landroidx/navigation/NavController;", "popupTo", "Landroidx/navigation/NavOptions;", "popUpTo", "", "popUpInclusive", "", "singleTop", "clearDisplayedCallHistory", "Lorg/linphone/activities/main/history/fragments/MasterCallLogsFragment;", "clearDisplayedChatRoom", "Lorg/linphone/activities/main/chat/fragments/MasterChatRoomsFragment;", "clearDisplayedContact", "Lorg/linphone/activities/main/contact/fragments/MasterContactsFragment;", "findMasterNavController", "Landroidx/fragment/app/Fragment;", "navigateToAbout", "Lorg/linphone/activities/main/sidemenu/fragments/SideMenuFragment;", "navigateToAccountLinking", "Lorg/linphone/activities/assistant/fragments/EmailAccountValidationFragment;", "args", "Landroid/os/Bundle;", "navigateToAccountLogin", "Lorg/linphone/activities/assistant/fragments/WelcomeFragment;", "navigateToAccountSettings", "Lorg/linphone/activities/assistant/fragments/PhoneAccountValidationFragment;", "Lorg/linphone/activities/main/settings/fragments/SettingsFragment;", "identity", "", "navigateToActiveCall", "Lorg/linphone/activities/voip/CallActivity;", "Lorg/linphone/activities/voip/fragments/IncomingCallFragment;", "Lorg/linphone/activities/voip/fragments/OutgoingCallFragment;", "navigateToAddParticipants", "Lorg/linphone/activities/voip/fragments/ConferenceParticipantsFragment;", "navigateToAdvancedSettings", "slidingPane", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "navigateToAudioFileViewer", "Lorg/linphone/activities/main/chat/fragments/DetailChatRoomFragment;", "secure", "navigateToAudioSettings", "navigateToCallHistory", "Lorg/linphone/activities/main/fragments/TabsFragment;", "navigateToCallSettings", "navigateToCallsList", "Lorg/linphone/activities/voip/fragments/ConferenceCallFragment;", "Lorg/linphone/activities/voip/fragments/SingleCallFragment;", "navigateToChatRoom", "Lorg/linphone/activities/main/MainActivity;", "localAddress", "peerAddress", "Lorg/linphone/activities/main/chat/fragments/ChatRoomCreationFragment;", "Lorg/linphone/activities/main/chat/fragments/GroupInfoFragment;", "created", "Lorg/linphone/activities/main/contact/fragments/DetailContactFragment;", "Lorg/linphone/activities/main/history/fragments/DetailCallLogFragment;", "navigateToChatRoomCreation", "createGroupChatRoom", "navigateToChatRooms", "navigateToChatSettings", "navigateToConferenceCall", "navigateToConferenceCallHistory", "navigateToConferenceLayout", "navigateToConferenceParticipants", "navigateToConferenceScheduling", "Lorg/linphone/activities/main/conference/fragments/ScheduledConferencesFragment;", "Lorg/linphone/activities/main/dialer/fragments/DialerFragment;", "navigateToConferenceWaitingRoom", "address", "subject", "navigateToConferencesSettings", "navigateToConfigFileViewer", "navigateToContact", "contactId", "Lorg/linphone/activities/main/contact/fragments/ContactEditorFragment;", "id", "navigateToContactEditor", "sipUriToAdd", "navigateToContacts", "uriToAdd", "navigateToContactsSettings", "navigateToDevices", "navigateToDialer", "Lorg/linphone/activities/main/conference/fragments/ConferenceSchedulingSummaryFragment;", "navigateToEchoCancellerCalibration", "Lorg/linphone/activities/assistant/fragments/AccountLoginFragment;", "Lorg/linphone/activities/assistant/fragments/GenericAccountLoginFragment;", "Lorg/linphone/activities/assistant/fragments/PhoneAccountLinkingFragment;", "Lorg/linphone/activities/assistant/fragments/RemoteProvisioningFragment;", "navigateToEmailAccountCreation", "navigateToEmailAccountValidation", "Lorg/linphone/activities/assistant/fragments/EmailAccountCreationFragment;", "navigateToEmptyChatRoom", "navigateToEphemeralInfo", "navigateToFriend", "navigateToGenericLogin", "Lorg/linphone/activities/assistant/fragments/GenericAccountWarningFragment;", "navigateToGenericLoginWarning", "navigateToGroupInfo", "navigateToImageFileViewer", "navigateToImdn", "navigateToIncomingCall", "earlyMediaVideoEnabled", "navigateToLdapSettings", "Lorg/linphone/activities/main/settings/fragments/ContactsSettingsFragment;", "configIndex", "navigateToNativeContact", "navigateToNetworkSettings", "navigateToNoPushWarning", "navigateToOutgoingCall", "navigateToParticipantsList", "Lorg/linphone/activities/main/conference/fragments/ConferenceSchedulingFragment;", "navigateToPdfFileViewer", "navigateToPhoneAccountCreation", "navigateToPhoneAccountValidation", "Lorg/linphone/activities/assistant/fragments/PhoneAccountCreationFragment;", "navigateToPhoneLinking", "Lorg/linphone/activities/main/settings/fragments/AccountSettingsFragment;", "navigateToQrCode", "navigateToRecordings", "navigateToRemoteProvisioning", "navigateToScheduledConferences", "navigateToSettings", "navigateToSummary", "Lorg/linphone/activities/main/conference/fragments/ConferenceSchedulingParticipantsListFragment;", "navigateToTextFileViewer", "navigateToTunnelSettings", "navigateToVideoFileViewer", "navigateToVideoSettings", "refreshConferenceFragment", "app_debug"})
public final class NavigationKt {
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.NavController findMasterNavController(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment $this$findMasterNavController) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final androidx.navigation.NavOptions popupTo(int popUpTo, boolean popUpInclusive, boolean singleTop) {
        return null;
    }
    
    public static final void navigateToDialer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.MainActivity $this$navigateToDialer, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToChatRooms(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.MainActivity $this$navigateToChatRooms, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToChatRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.MainActivity $this$navigateToChatRoom, @org.jetbrains.annotations.Nullable
    java.lang.String localAddress, @org.jetbrains.annotations.Nullable
    java.lang.String peerAddress) {
    }
    
    public static final void navigateToContacts(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.MainActivity $this$navigateToContacts) {
    }
    
    public static final void navigateToContact(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.MainActivity $this$navigateToContact, @org.jetbrains.annotations.Nullable
    java.lang.String contactId) {
    }
    
    public static final void navigateToCallHistory(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.fragments.TabsFragment $this$navigateToCallHistory) {
    }
    
    public static final void navigateToContacts(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.fragments.TabsFragment $this$navigateToContacts) {
    }
    
    public static final void navigateToDialer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.fragments.TabsFragment $this$navigateToDialer) {
    }
    
    public static final void navigateToChatRooms(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.fragments.TabsFragment $this$navigateToChatRooms) {
    }
    
    public static final void navigateToContacts(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.dialer.fragments.DialerFragment $this$navigateToContacts, @org.jetbrains.annotations.Nullable
    java.lang.String uriToAdd) {
    }
    
    public static final void navigateToConfigFileViewer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.dialer.fragments.DialerFragment $this$navigateToConfigFileViewer) {
    }
    
    public static final void navigateToConferenceScheduling(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.dialer.fragments.DialerFragment $this$navigateToConferenceScheduling) {
    }
    
    public static final void navigateToParticipantsList(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.conference.fragments.ConferenceSchedulingFragment $this$navigateToParticipantsList) {
    }
    
    public static final void navigateToSummary(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.conference.fragments.ConferenceSchedulingParticipantsListFragment $this$navigateToSummary) {
    }
    
    public static final void navigateToScheduledConferences(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.conference.fragments.ConferenceSchedulingSummaryFragment $this$navigateToScheduledConferences) {
    }
    
    public static final void navigateToDialer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.conference.fragments.ConferenceSchedulingSummaryFragment $this$navigateToDialer) {
    }
    
    public static final void navigateToConferenceWaitingRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToConferenceWaitingRoom, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.Nullable
    java.lang.String subject) {
    }
    
    public static final void navigateToConferenceWaitingRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.conference.fragments.ScheduledConferencesFragment $this$navigateToConferenceWaitingRoom, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.Nullable
    java.lang.String subject) {
    }
    
    public static final void navigateToConferenceScheduling(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.conference.fragments.ScheduledConferencesFragment $this$navigateToConferenceScheduling) {
    }
    
    public static final void navigateToChatRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.MasterChatRoomsFragment $this$navigateToChatRoom, @org.jetbrains.annotations.NotNull
    android.os.Bundle args) {
    }
    
    public static final void navigateToChatRoomCreation(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.MasterChatRoomsFragment $this$navigateToChatRoomCreation, boolean createGroupChatRoom, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void clearDisplayedChatRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.MasterChatRoomsFragment $this$clearDisplayedChatRoom) {
    }
    
    public static final void navigateToContacts(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToContacts, @org.jetbrains.annotations.NotNull
    java.lang.String sipUriToAdd) {
    }
    
    public static final void navigateToNativeContact(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToNativeContact, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    public static final void navigateToFriend(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToFriend, @org.jetbrains.annotations.NotNull
    java.lang.String address) {
    }
    
    public static final void navigateToImdn(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToImdn, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToDevices(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToDevices) {
    }
    
    public static final void navigateToGroupInfo(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToGroupInfo) {
    }
    
    public static final void navigateToEphemeralInfo(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToEphemeralInfo) {
    }
    
    public static final void navigateToTextFileViewer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToTextFileViewer, boolean secure) {
    }
    
    public static final void navigateToPdfFileViewer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToPdfFileViewer, boolean secure) {
    }
    
    public static final void navigateToImageFileViewer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToImageFileViewer, boolean secure) {
    }
    
    public static final void navigateToVideoFileViewer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToVideoFileViewer, boolean secure) {
    }
    
    public static final void navigateToAudioFileViewer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToAudioFileViewer, boolean secure) {
    }
    
    public static final void navigateToEmptyChatRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToEmptyChatRoom) {
    }
    
    public static final void navigateToDialer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToDialer, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToConferenceScheduling(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.DetailChatRoomFragment $this$navigateToConferenceScheduling) {
    }
    
    public static final void navigateToGroupInfo(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.ChatRoomCreationFragment $this$navigateToGroupInfo) {
    }
    
    public static final void navigateToChatRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.ChatRoomCreationFragment $this$navigateToChatRoom, @org.jetbrains.annotations.NotNull
    android.os.Bundle args) {
    }
    
    public static final void navigateToChatRoomCreation(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.GroupInfoFragment $this$navigateToChatRoomCreation, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToChatRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.chat.fragments.GroupInfoFragment $this$navigateToChatRoom, @org.jetbrains.annotations.Nullable
    android.os.Bundle args, boolean created) {
    }
    
    public static final void navigateToContact(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.contact.fragments.MasterContactsFragment $this$navigateToContact) {
    }
    
    public static final void navigateToContactEditor(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.contact.fragments.MasterContactsFragment $this$navigateToContactEditor, @org.jetbrains.annotations.Nullable
    java.lang.String sipUriToAdd, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void clearDisplayedContact(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.contact.fragments.MasterContactsFragment $this$clearDisplayedContact) {
    }
    
    public static final void navigateToContact(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.contact.fragments.ContactEditorFragment $this$navigateToContact, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    public static final void navigateToChatRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.contact.fragments.DetailContactFragment $this$navigateToChatRoom, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToDialer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.contact.fragments.DetailContactFragment $this$navigateToDialer, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToContactEditor(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.contact.fragments.DetailContactFragment $this$navigateToContactEditor) {
    }
    
    public static final void navigateToCallHistory(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.MasterCallLogsFragment $this$navigateToCallHistory, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToConferenceCallHistory(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.MasterCallLogsFragment $this$navigateToConferenceCallHistory, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void clearDisplayedCallHistory(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.MasterCallLogsFragment $this$clearDisplayedCallHistory) {
    }
    
    public static final void navigateToDialer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.MasterCallLogsFragment $this$navigateToDialer, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToConferenceWaitingRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.MasterCallLogsFragment $this$navigateToConferenceWaitingRoom, @org.jetbrains.annotations.NotNull
    java.lang.String address, @org.jetbrains.annotations.Nullable
    java.lang.String subject) {
    }
    
    public static final void navigateToContacts(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.DetailCallLogFragment $this$navigateToContacts, @org.jetbrains.annotations.NotNull
    java.lang.String sipUriToAdd) {
    }
    
    public static final void navigateToNativeContact(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.DetailCallLogFragment $this$navigateToNativeContact, @org.jetbrains.annotations.NotNull
    java.lang.String id) {
    }
    
    public static final void navigateToFriend(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.DetailCallLogFragment $this$navigateToFriend, @org.jetbrains.annotations.NotNull
    java.lang.String address) {
    }
    
    public static final void navigateToChatRoom(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.DetailCallLogFragment $this$navigateToChatRoom, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToDialer(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.history.fragments.DetailCallLogFragment $this$navigateToDialer, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToAccountSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToAccountSettings, @org.jetbrains.annotations.NotNull
    java.lang.String identity) {
    }
    
    public static final void navigateToTunnelSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToTunnelSettings, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToAudioSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToAudioSettings, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToVideoSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToVideoSettings, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToCallSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToCallSettings, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToChatSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToChatSettings, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToNetworkSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToNetworkSettings, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToContactsSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToContactsSettings, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToAdvancedSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToAdvancedSettings, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToConferencesSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.SettingsFragment $this$navigateToConferencesSettings, @org.jetbrains.annotations.NotNull
    androidx.slidingpanelayout.widget.SlidingPaneLayout slidingPane) {
    }
    
    public static final void navigateToPhoneLinking(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.AccountSettingsFragment $this$navigateToPhoneLinking, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToPhoneAccountValidation(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.PhoneAccountLinkingFragment $this$navigateToPhoneAccountValidation, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToEmptySetting(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    public static final void navigateToLdapSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.settings.fragments.ContactsSettingsFragment $this$navigateToLdapSettings, int configIndex) {
    }
    
    public static final void navigateToAccountSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.sidemenu.fragments.SideMenuFragment $this$navigateToAccountSettings, @org.jetbrains.annotations.NotNull
    java.lang.String identity) {
    }
    
    public static final void navigateToSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.sidemenu.fragments.SideMenuFragment $this$navigateToSettings) {
    }
    
    public static final void navigateToAbout(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.sidemenu.fragments.SideMenuFragment $this$navigateToAbout) {
    }
    
    public static final void navigateToRecordings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.sidemenu.fragments.SideMenuFragment $this$navigateToRecordings) {
    }
    
    public static final void navigateToScheduledConferences(@org.jetbrains.annotations.NotNull
    org.linphone.activities.main.sidemenu.fragments.SideMenuFragment $this$navigateToScheduledConferences) {
    }
    
    public static final void navigateToActiveCall(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.CallActivity $this$navigateToActiveCall) {
    }
    
    public static final void navigateToConferenceCall(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.CallActivity $this$navigateToConferenceCall) {
    }
    
    public static final void navigateToOutgoingCall(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.CallActivity $this$navigateToOutgoingCall) {
    }
    
    public static final void navigateToIncomingCall(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.CallActivity $this$navigateToIncomingCall, boolean earlyMediaVideoEnabled) {
    }
    
    public static final void navigateToActiveCall(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.OutgoingCallFragment $this$navigateToActiveCall) {
    }
    
    public static final void navigateToActiveCall(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.IncomingCallFragment $this$navigateToActiveCall) {
    }
    
    public static final void navigateToCallsList(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.SingleCallFragment $this$navigateToCallsList) {
    }
    
    public static final void navigateToConferenceParticipants(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.SingleCallFragment $this$navigateToConferenceParticipants) {
    }
    
    public static final void navigateToConferenceLayout(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.SingleCallFragment $this$navigateToConferenceLayout) {
    }
    
    public static final void navigateToIncomingCall(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.SingleCallFragment $this$navigateToIncomingCall) {
    }
    
    public static final void navigateToOutgoingCall(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.SingleCallFragment $this$navigateToOutgoingCall) {
    }
    
    public static final void navigateToCallsList(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.ConferenceCallFragment $this$navigateToCallsList) {
    }
    
    public static final void navigateToConferenceParticipants(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.ConferenceCallFragment $this$navigateToConferenceParticipants) {
    }
    
    public static final void navigateToConferenceLayout(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.ConferenceCallFragment $this$navigateToConferenceLayout) {
    }
    
    public static final void refreshConferenceFragment(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.ConferenceCallFragment $this$refreshConferenceFragment) {
    }
    
    public static final void navigateToAddParticipants(@org.jetbrains.annotations.NotNull
    org.linphone.activities.voip.fragments.ConferenceParticipantsFragment $this$navigateToAddParticipants) {
    }
    
    public static final void navigateToEmailAccountCreation(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.WelcomeFragment $this$navigateToEmailAccountCreation) {
    }
    
    public static final void navigateToPhoneAccountCreation(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.WelcomeFragment $this$navigateToPhoneAccountCreation) {
    }
    
    public static final void navigateToNoPushWarning(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.WelcomeFragment $this$navigateToNoPushWarning) {
    }
    
    public static final void navigateToAccountLogin(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.WelcomeFragment $this$navigateToAccountLogin) {
    }
    
    public static final void navigateToGenericLoginWarning(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.WelcomeFragment $this$navigateToGenericLoginWarning) {
    }
    
    public static final void navigateToRemoteProvisioning(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.WelcomeFragment $this$navigateToRemoteProvisioning) {
    }
    
    public static final void navigateToEchoCancellerCalibration(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.AccountLoginFragment $this$navigateToEchoCancellerCalibration) {
    }
    
    public static final void navigateToPhoneAccountValidation(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.AccountLoginFragment $this$navigateToPhoneAccountValidation, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToGenericLogin(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.GenericAccountWarningFragment $this$navigateToGenericLogin) {
    }
    
    public static final void navigateToEchoCancellerCalibration(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.GenericAccountLoginFragment $this$navigateToEchoCancellerCalibration) {
    }
    
    public static final void navigateToQrCode(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.RemoteProvisioningFragment $this$navigateToQrCode) {
    }
    
    public static final void navigateToEchoCancellerCalibration(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.RemoteProvisioningFragment $this$navigateToEchoCancellerCalibration) {
    }
    
    public static final void navigateToEmailAccountValidation(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.EmailAccountCreationFragment $this$navigateToEmailAccountValidation) {
    }
    
    public static final void navigateToAccountLinking(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.EmailAccountValidationFragment $this$navigateToAccountLinking, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToPhoneAccountValidation(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.PhoneAccountCreationFragment $this$navigateToPhoneAccountValidation, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToAccountSettings(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.PhoneAccountValidationFragment $this$navigateToAccountSettings, @org.jetbrains.annotations.Nullable
    android.os.Bundle args) {
    }
    
    public static final void navigateToEchoCancellerCalibration(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.PhoneAccountValidationFragment $this$navigateToEchoCancellerCalibration) {
    }
    
    public static final void navigateToEchoCancellerCalibration(@org.jetbrains.annotations.NotNull
    org.linphone.activities.assistant.fragments.PhoneAccountLinkingFragment $this$navigateToEchoCancellerCalibration) {
    }
}