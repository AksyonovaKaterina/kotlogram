package com.github.badoualy.telegram.tl.api

import com.github.badoualy.telegram.tl.api.account.TLAbsChatThemes
import com.github.badoualy.telegram.tl.api.account.TLAbsResetPasswordResult
import com.github.badoualy.telegram.tl.api.account.TLAbsThemes
import com.github.badoualy.telegram.tl.api.account.TLAbsWallPapers
import com.github.badoualy.telegram.tl.api.account.TLAuthorizationForm
import com.github.badoualy.telegram.tl.api.account.TLAuthorizations
import com.github.badoualy.telegram.tl.api.account.TLContentSettings
import com.github.badoualy.telegram.tl.api.account.TLPassword
import com.github.badoualy.telegram.tl.api.account.TLPasswordInputSettings
import com.github.badoualy.telegram.tl.api.account.TLPasswordSettings
import com.github.badoualy.telegram.tl.api.account.TLPrivacyRules
import com.github.badoualy.telegram.tl.api.account.TLSentEmailCode
import com.github.badoualy.telegram.tl.api.account.TLTakeout
import com.github.badoualy.telegram.tl.api.account.TLTmpPassword
import com.github.badoualy.telegram.tl.api.account.TLWebAuthorizations
import com.github.badoualy.telegram.tl.api.auth.TLAbsAuthorization
import com.github.badoualy.telegram.tl.api.auth.TLAbsLoginToken
import com.github.badoualy.telegram.tl.api.auth.TLExportedAuthorization
import com.github.badoualy.telegram.tl.api.auth.TLPasswordRecovery
import com.github.badoualy.telegram.tl.api.auth.TLSentCode
import com.github.badoualy.telegram.tl.api.channels.TLAbsChannelParticipants
import com.github.badoualy.telegram.tl.api.channels.TLAdminLogResults
import com.github.badoualy.telegram.tl.api.channels.TLChannelParticipant
import com.github.badoualy.telegram.tl.api.contacts.TLAbsBlocked
import com.github.badoualy.telegram.tl.api.contacts.TLAbsContacts
import com.github.badoualy.telegram.tl.api.contacts.TLAbsTopPeers
import com.github.badoualy.telegram.tl.api.contacts.TLFound
import com.github.badoualy.telegram.tl.api.contacts.TLImportedContacts
import com.github.badoualy.telegram.tl.api.contacts.TLResolvedPeer
import com.github.badoualy.telegram.tl.api.help.TLAbsAppUpdate
import com.github.badoualy.telegram.tl.api.help.TLAbsCountriesList
import com.github.badoualy.telegram.tl.api.help.TLAbsDeepLinkInfo
import com.github.badoualy.telegram.tl.api.help.TLAbsPassportConfig
import com.github.badoualy.telegram.tl.api.help.TLAbsPromoData
import com.github.badoualy.telegram.tl.api.help.TLAbsTermsOfServiceUpdate
import com.github.badoualy.telegram.tl.api.help.TLAbsUserInfo
import com.github.badoualy.telegram.tl.api.help.TLInviteText
import com.github.badoualy.telegram.tl.api.help.TLRecentMeUrls
import com.github.badoualy.telegram.tl.api.help.TLSupport
import com.github.badoualy.telegram.tl.api.help.TLSupportName
import com.github.badoualy.telegram.tl.api.messages.TLAbsAllStickers
import com.github.badoualy.telegram.tl.api.messages.TLAbsChats
import com.github.badoualy.telegram.tl.api.messages.TLAbsDhConfig
import com.github.badoualy.telegram.tl.api.messages.TLAbsDialogs
import com.github.badoualy.telegram.tl.api.messages.TLAbsExportedChatInvite
import com.github.badoualy.telegram.tl.api.messages.TLAbsFavedStickers
import com.github.badoualy.telegram.tl.api.messages.TLAbsFeaturedStickers
import com.github.badoualy.telegram.tl.api.messages.TLAbsFoundStickerSets
import com.github.badoualy.telegram.tl.api.messages.TLAbsMessages
import com.github.badoualy.telegram.tl.api.messages.TLAbsRecentStickers
import com.github.badoualy.telegram.tl.api.messages.TLAbsSavedGifs
import com.github.badoualy.telegram.tl.api.messages.TLAbsSentEncryptedMessage
import com.github.badoualy.telegram.tl.api.messages.TLAbsStickerSetInstallResult
import com.github.badoualy.telegram.tl.api.messages.TLAbsStickers
import com.github.badoualy.telegram.tl.api.messages.TLAffectedFoundMessages
import com.github.badoualy.telegram.tl.api.messages.TLAffectedHistory
import com.github.badoualy.telegram.tl.api.messages.TLAffectedMessages
import com.github.badoualy.telegram.tl.api.messages.TLArchivedStickers
import com.github.badoualy.telegram.tl.api.messages.TLBotCallbackAnswer
import com.github.badoualy.telegram.tl.api.messages.TLBotResults
import com.github.badoualy.telegram.tl.api.messages.TLChatAdminsWithInvites
import com.github.badoualy.telegram.tl.api.messages.TLChatFull
import com.github.badoualy.telegram.tl.api.messages.TLChatInviteImporters
import com.github.badoualy.telegram.tl.api.messages.TLCheckedHistoryImportPeer
import com.github.badoualy.telegram.tl.api.messages.TLDiscussionMessage
import com.github.badoualy.telegram.tl.api.messages.TLExportedChatInvites
import com.github.badoualy.telegram.tl.api.messages.TLHighScores
import com.github.badoualy.telegram.tl.api.messages.TLHistoryImport
import com.github.badoualy.telegram.tl.api.messages.TLHistoryImportParsed
import com.github.badoualy.telegram.tl.api.messages.TLInactiveChats
import com.github.badoualy.telegram.tl.api.messages.TLMessageEditData
import com.github.badoualy.telegram.tl.api.messages.TLMessageViews
import com.github.badoualy.telegram.tl.api.messages.TLPeerDialogs
import com.github.badoualy.telegram.tl.api.messages.TLSearchCounter
import com.github.badoualy.telegram.tl.api.messages.TLSponsoredMessages
import com.github.badoualy.telegram.tl.api.messages.TLStickerSet
import com.github.badoualy.telegram.tl.api.messages.TLVotesList
import com.github.badoualy.telegram.tl.api.payments.TLAbsPaymentResult
import com.github.badoualy.telegram.tl.api.payments.TLBankCardData
import com.github.badoualy.telegram.tl.api.payments.TLPaymentForm
import com.github.badoualy.telegram.tl.api.payments.TLPaymentReceipt
import com.github.badoualy.telegram.tl.api.payments.TLSavedInfo
import com.github.badoualy.telegram.tl.api.payments.TLValidatedRequestedInfo
import com.github.badoualy.telegram.tl.api.phone.TLExportedGroupCallInvite
import com.github.badoualy.telegram.tl.api.phone.TLGroupCall
import com.github.badoualy.telegram.tl.api.phone.TLGroupParticipants
import com.github.badoualy.telegram.tl.api.phone.TLJoinAsPeers
import com.github.badoualy.telegram.tl.api.phone.TLPhoneCall
import com.github.badoualy.telegram.tl.api.photos.TLAbsPhotos
import com.github.badoualy.telegram.tl.api.photos.TLPhoto
import com.github.badoualy.telegram.tl.api.stats.TLBroadcastStats
import com.github.badoualy.telegram.tl.api.stats.TLMegagroupStats
import com.github.badoualy.telegram.tl.api.stats.TLMessageStats
import com.github.badoualy.telegram.tl.api.stickers.TLSuggestedShortName
import com.github.badoualy.telegram.tl.api.updates.TLAbsChannelDifference
import com.github.badoualy.telegram.tl.api.updates.TLAbsDifference
import com.github.badoualy.telegram.tl.api.updates.TLState
import com.github.badoualy.telegram.tl.api.upload.TLAbsCdnFile
import com.github.badoualy.telegram.tl.api.upload.TLAbsFile
import com.github.badoualy.telegram.tl.api.upload.TLWebFile
import com.github.badoualy.telegram.tl.core.TLBool
import com.github.badoualy.telegram.tl.core.TLBytes
import com.github.badoualy.telegram.tl.core.TLBytesVector
import com.github.badoualy.telegram.tl.core.TLIntVector
import com.github.badoualy.telegram.tl.core.TLLongVector
import com.github.badoualy.telegram.tl.core.TLMethod
import com.github.badoualy.telegram.tl.core.TLObject
import com.github.badoualy.telegram.tl.core.TLObjectVector
import com.github.badoualy.telegram.tl.core.TLStringVector
import com.github.badoualy.telegram.tl.exception.RpcErrorException
import java.io.IOException

interface TelegramSyncApi {
    @Throws(RpcErrorException::class, IOException::class)
    fun accountAcceptAuthorization(
            botId: Long,
            scope: String,
            publicKey: String,
            valueHashes: TLObjectVector<TLSecureValueHash>,
            credentials: TLSecureCredentialsEncrypted
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountCancelPasswordEmail(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountChangePhone(
            phoneNumber: String,
            phoneCodeHash: String,
            phoneCode: String
    ): TLAbsUser

    @Throws(RpcErrorException::class, IOException::class)
    fun accountCheckUsername(username: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountConfirmPasswordEmail(code: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountConfirmPhone(phoneCodeHash: String, phoneCode: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountCreateTheme(
            slug: String,
            title: String,
            document: TLAbsInputDocument?,
            settings: TLInputThemeSettings?
    ): TLTheme

    @Throws(RpcErrorException::class, IOException::class)
    fun accountDeclinePasswordReset(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountDeleteAccount(reason: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountDeleteSecureValue(types: TLObjectVector<TLAbsSecureValueType>): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountFinishTakeoutSession(success: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetAccountTTL(): TLAccountDaysTTL

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetAllSecureValues(): TLObjectVector<TLSecureValue>

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetAuthorizationForm(
            botId: Long,
            scope: String,
            publicKey: String
    ): TLAuthorizationForm

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetAuthorizations(): TLAuthorizations

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetAutoDownloadSettings(): com.github.badoualy.telegram.tl.api.account.TLAutoDownloadSettings

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetChatThemes(hash: Int): TLAbsChatThemes

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetContactSignUpNotification(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetContentSettings(): TLContentSettings

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetGlobalPrivacySettings(): TLGlobalPrivacySettings

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetMultiWallPapers(wallpapers: TLObjectVector<TLAbsInputWallPaper>): TLObjectVector<TLAbsWallPaper>

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetNotifyExceptions(compareSound: Boolean, peer: TLAbsInputNotifyPeer?): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetNotifySettings(peer: TLAbsInputNotifyPeer): TLPeerNotifySettings

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetPassword(): TLPassword

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetPasswordSettings(password: TLAbsInputCheckPasswordSRP): TLPasswordSettings

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetPrivacy(key: TLAbsInputPrivacyKey): TLPrivacyRules

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetSecureValue(types: TLObjectVector<TLAbsSecureValueType>): TLObjectVector<TLSecureValue>

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetTheme(
            format: String,
            theme: TLAbsInputTheme,
            documentId: Long
    ): TLTheme

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetThemes(format: String, hash: Long): TLAbsThemes

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetTmpPassword(password: TLAbsInputCheckPasswordSRP, period: Int): TLTmpPassword

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetWallPaper(wallpaper: TLAbsInputWallPaper): TLAbsWallPaper

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetWallPapers(hash: Long): TLAbsWallPapers

    @Throws(RpcErrorException::class, IOException::class)
    fun accountGetWebAuthorizations(): TLWebAuthorizations

    @Throws(RpcErrorException::class, IOException::class)
    fun accountInitTakeoutSession(
            contacts: Boolean,
            messageUsers: Boolean,
            messageChats: Boolean,
            messageMegagroups: Boolean,
            messageChannels: Boolean,
            files: Boolean,
            fileMaxSize: Int?
    ): TLTakeout

    @Throws(RpcErrorException::class, IOException::class)
    fun accountInstallTheme(
            dark: Boolean,
            format: String?,
            theme: TLAbsInputTheme?
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountInstallWallPaper(wallpaper: TLAbsInputWallPaper, settings: TLWallPaperSettings): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountRegisterDevice(
            noMuted: Boolean,
            tokenType: Int,
            token: String,
            appSandbox: Boolean,
            secret: TLBytes,
            otherUids: TLLongVector
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountReportPeer(
            peer: TLAbsInputPeer,
            reason: TLAbsReportReason,
            message: String
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountReportProfilePhoto(
            peer: TLAbsInputPeer,
            photoId: TLAbsInputPhoto,
            reason: TLAbsReportReason,
            message: String
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountResendPasswordEmail(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountResetAuthorization(hash: Long): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountResetNotifySettings(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountResetPassword(): TLAbsResetPasswordResult

    @Throws(RpcErrorException::class, IOException::class)
    fun accountResetWallPapers(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountResetWebAuthorization(hash: Long): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountResetWebAuthorizations(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSaveAutoDownloadSettings(
            low: Boolean,
            high: Boolean,
            settings: TLAutoDownloadSettings
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSaveSecureValue(value: TLInputSecureValue, secureSecretId: Long): TLSecureValue

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSaveTheme(theme: TLAbsInputTheme, unsave: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSaveWallPaper(
            wallpaper: TLAbsInputWallPaper,
            unsave: Boolean,
            settings: TLWallPaperSettings
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSendChangePhoneCode(phoneNumber: String, settings: TLCodeSettings): TLSentCode

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSendConfirmPhoneCode(hash: String, settings: TLCodeSettings): TLSentCode

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSendVerifyEmailCode(email: String): TLSentEmailCode

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSendVerifyPhoneCode(phoneNumber: String, settings: TLCodeSettings): TLSentCode

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSetAccountTTL(ttl: TLAccountDaysTTL): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSetContactSignUpNotification(silent: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSetContentSettings(sensitiveEnabled: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSetGlobalPrivacySettings(settings: TLGlobalPrivacySettings): TLGlobalPrivacySettings

    @Throws(RpcErrorException::class, IOException::class)
    fun accountSetPrivacy(key: TLAbsInputPrivacyKey, rules: TLObjectVector<TLAbsInputPrivacyRule>): TLPrivacyRules

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUnregisterDevice(
            tokenType: Int,
            token: String,
            otherUids: TLLongVector
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUpdateDeviceLocked(period: Int): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUpdateNotifySettings(peer: TLAbsInputNotifyPeer, settings: TLInputPeerNotifySettings): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUpdatePasswordSettings(password: TLAbsInputCheckPasswordSRP, newSettings: TLPasswordInputSettings): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUpdateProfile(
            firstName: String?,
            lastName: String?,
            about: String?
    ): TLAbsUser

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUpdateStatus(offline: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUpdateTheme(
            format: String,
            theme: TLAbsInputTheme,
            slug: String?,
            title: String?,
            document: TLAbsInputDocument?,
            settings: TLInputThemeSettings?
    ): TLTheme

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUpdateUsername(username: String): TLAbsUser

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUploadTheme(
            file: TLAbsInputFile,
            thumb: TLAbsInputFile?,
            fileName: String,
            mimeType: String
    ): TLAbsDocument

    @Throws(RpcErrorException::class, IOException::class)
    fun accountUploadWallPaper(
            file: TLAbsInputFile,
            mimeType: String,
            settings: TLWallPaperSettings
    ): TLAbsWallPaper

    @Throws(RpcErrorException::class, IOException::class)
    fun accountVerifyEmail(email: String, code: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun accountVerifyPhone(
            phoneNumber: String,
            phoneCodeHash: String,
            phoneCode: String
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun authAcceptLoginToken(token: TLBytes): TLAuthorization

    @Throws(RpcErrorException::class, IOException::class)
    fun authBindTempAuthKey(
            permAuthKeyId: Long,
            nonce: Long,
            expiresAt: Int,
            encryptedMessage: TLBytes
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun authCancelCode(phoneNumber: String, phoneCodeHash: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun authCheckPassword(password: TLAbsInputCheckPasswordSRP): TLAbsAuthorization

    @Throws(RpcErrorException::class, IOException::class)
    fun authCheckRecoveryPassword(code: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun authDropTempAuthKeys(exceptAuthKeys: TLLongVector): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun authExportAuthorization(dcId: Int): TLExportedAuthorization

    @Throws(RpcErrorException::class, IOException::class)
    fun authExportLoginToken(
            apiId: Int,
            apiHash: String,
            exceptIds: TLLongVector
    ): TLAbsLoginToken

    @Throws(RpcErrorException::class, IOException::class)
    fun authImportAuthorization(id: Long, bytes: TLBytes): TLAbsAuthorization

    @Throws(RpcErrorException::class, IOException::class)
    fun authImportBotAuthorization(
            flags: Int,
            apiId: Int,
            apiHash: String,
            botAuthToken: String
    ): TLAbsAuthorization

    @Throws(RpcErrorException::class, IOException::class)
    fun authImportLoginToken(token: TLBytes): TLAbsLoginToken

    @Throws(RpcErrorException::class, IOException::class)
    fun authLogOut(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun authRecoverPassword(code: String, newSettings: TLPasswordInputSettings?): TLAbsAuthorization

    @Throws(RpcErrorException::class, IOException::class)
    fun authRequestPasswordRecovery(): TLPasswordRecovery

    @Throws(RpcErrorException::class, IOException::class)
    fun authResendCode(phoneNumber: String, phoneCodeHash: String): TLSentCode

    @Throws(RpcErrorException::class, IOException::class)
    fun authResetAuthorizations(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun authSendCode(
            phoneNumber: String,
            apiId: Int,
            apiHash: String,
            settings: TLCodeSettings
    ): TLSentCode

    @Throws(RpcErrorException::class, IOException::class)
    fun authSignIn(
            phoneNumber: String,
            phoneCodeHash: String,
            phoneCode: String
    ): TLAbsAuthorization

    @Throws(RpcErrorException::class, IOException::class)
    fun authSignUp(
            phoneNumber: String,
            phoneCodeHash: String,
            firstName: String,
            lastName: String
    ): TLAbsAuthorization

    @Throws(RpcErrorException::class, IOException::class)
    fun botsAnswerWebhookJSONQuery(queryId: Long, data: TLDataJSON): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun botsGetBotCommands(scope: TLAbsBotCommandScope, langCode: String): TLObjectVector<TLBotCommand>

    @Throws(RpcErrorException::class, IOException::class)
    fun botsResetBotCommands(scope: TLAbsBotCommandScope, langCode: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun botsSendCustomRequest(customMethod: String, params: TLDataJSON): TLDataJSON

    @Throws(RpcErrorException::class, IOException::class)
    fun botsSetBotCommands(
            scope: TLAbsBotCommandScope,
            langCode: String,
            commands: TLObjectVector<TLBotCommand>
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsCheckUsername(channel: TLAbsInputChannel, username: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsConvertToGigagroup(channel: TLAbsInputChannel): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsCreateChannel(
            broadcast: Boolean,
            megagroup: Boolean,
            forImport: Boolean,
            title: String,
            about: String,
            geoPoint: TLAbsInputGeoPoint?,
            address: String?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsDeleteChannel(channel: TLAbsInputChannel): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsDeleteHistory(channel: TLAbsInputChannel, maxId: Int): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsDeleteMessages(channel: TLAbsInputChannel, id: TLIntVector): TLAffectedMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsDeleteUserHistory(channel: TLAbsInputChannel, userId: TLAbsInputUser): TLAffectedHistory

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsEditAdmin(
            channel: TLAbsInputChannel,
            userId: TLAbsInputUser,
            adminRights: TLChatAdminRights,
            rank: String
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsEditBanned(
            channel: TLAbsInputChannel,
            participant: TLAbsInputPeer,
            bannedRights: TLChatBannedRights
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsEditCreator(
            channel: TLAbsInputChannel,
            userId: TLAbsInputUser,
            password: TLAbsInputCheckPasswordSRP
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsEditLocation(
            channel: TLAbsInputChannel,
            geoPoint: TLAbsInputGeoPoint,
            address: String
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsEditPhoto(channel: TLAbsInputChannel, photo: TLAbsInputChatPhoto): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsEditTitle(channel: TLAbsInputChannel, title: String): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsExportMessageLink(
            grouped: Boolean,
            thread: Boolean,
            channel: TLAbsInputChannel,
            id: Int
    ): TLExportedMessageLink

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetAdminLog(
            channel: TLAbsInputChannel,
            q: String,
            eventsFilter: TLChannelAdminLogEventsFilter?,
            admins: TLObjectVector<TLAbsInputUser>?,
            maxId: Long,
            minId: Long,
            limit: Int
    ): TLAdminLogResults

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetAdminedPublicChannels(byLocation: Boolean, checkLimit: Boolean): TLAbsChats

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetChannels(id: TLObjectVector<TLAbsInputChannel>): TLAbsChats

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetFullChannel(channel: TLAbsInputChannel): TLChatFull

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetGroupsForDiscussion(): TLAbsChats

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetInactiveChannels(): TLInactiveChats

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetLeftChannels(offset: Int): TLAbsChats

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetMessages(channel: TLAbsInputChannel, id: TLObjectVector<TLAbsInputMessage>): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetParticipant(channel: TLAbsInputChannel, participant: TLAbsInputPeer): TLChannelParticipant

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetParticipants(
            channel: TLAbsInputChannel,
            filter: TLAbsChannelParticipantsFilter,
            offset: Int,
            limit: Int,
            hash: Long
    ): TLAbsChannelParticipants

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsGetSponsoredMessages(channel: TLAbsInputChannel): TLSponsoredMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsInviteToChannel(channel: TLAbsInputChannel, users: TLObjectVector<TLAbsInputUser>): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsJoinChannel(channel: TLAbsInputChannel): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsLeaveChannel(channel: TLAbsInputChannel): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsReadHistory(channel: TLAbsInputChannel, maxId: Int): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsReadMessageContents(channel: TLAbsInputChannel, id: TLIntVector): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsReportSpam(
            channel: TLAbsInputChannel,
            userId: TLAbsInputUser,
            id: TLIntVector
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsSetDiscussionGroup(broadcast: TLAbsInputChannel, group: TLAbsInputChannel): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsSetStickers(channel: TLAbsInputChannel, stickerset: TLAbsInputStickerSet): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsTogglePreHistoryHidden(channel: TLAbsInputChannel, enabled: Boolean): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsToggleSignatures(channel: TLAbsInputChannel, enabled: Boolean): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsToggleSlowMode(channel: TLAbsInputChannel, seconds: Int): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsUpdateUsername(channel: TLAbsInputChannel, username: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun channelsViewSponsoredMessage(channel: TLAbsInputChannel, randomId: TLBytes): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsAcceptContact(id: TLAbsInputUser): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsAddContact(
            addPhonePrivacyException: Boolean,
            id: TLAbsInputUser,
            firstName: String,
            lastName: String,
            phone: String
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsBlock(id: TLAbsInputPeer): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsBlockFromReplies(
            deleteMessage: Boolean,
            deleteHistory: Boolean,
            reportSpam: Boolean,
            msgId: Int
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsDeleteByPhones(phones: TLStringVector): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsDeleteContacts(id: TLObjectVector<TLAbsInputUser>): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsGetBlocked(offset: Int, limit: Int): TLAbsBlocked

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsGetContactIDs(hash: Long): TLIntVector

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsGetContacts(hash: Long): TLAbsContacts

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsGetLocated(
            background: Boolean,
            geoPoint: TLAbsInputGeoPoint,
            selfExpires: Int?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsGetSaved(): TLObjectVector<TLSavedPhoneContact>

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsGetStatuses(): TLObjectVector<TLContactStatus>

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsGetTopPeers(
            correspondents: Boolean,
            botsPm: Boolean,
            botsInline: Boolean,
            phoneCalls: Boolean,
            forwardUsers: Boolean,
            forwardChats: Boolean,
            groups: Boolean,
            channels: Boolean,
            offset: Int,
            limit: Int,
            hash: Long
    ): TLAbsTopPeers

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsImportContacts(contacts: TLObjectVector<TLInputPhoneContact>): TLImportedContacts

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsResetSaved(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsResetTopPeerRating(category: TLAbsTopPeerCategory, peer: TLAbsInputPeer): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsResolveUsername(username: String): TLResolvedPeer

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsSearch(q: String, limit: Int): TLFound

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsToggleTopPeers(enabled: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun contactsUnblock(id: TLAbsInputPeer): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun foldersDeleteFolder(folderId: Int): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun foldersEditPeerFolders(folderPeers: TLObjectVector<TLInputFolderPeer>): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun helpAcceptTermsOfService(id: TLDataJSON): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun helpDismissSuggestion(peer: TLAbsInputPeer, suggestion: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun helpEditUserInfo(
            userId: TLAbsInputUser,
            message: String,
            entities: TLObjectVector<TLAbsMessageEntity>
    ): TLAbsUserInfo

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetAppChangelog(prevAppVersion: String): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetAppConfig(): TLAbsJSONValue

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetAppUpdate(source: String): TLAbsAppUpdate

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetCdnConfig(): TLCdnConfig

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetConfig(): TLConfig

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetCountriesList(langCode: String, hash: Int): TLAbsCountriesList

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetDeepLinkInfo(path: String): TLAbsDeepLinkInfo

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetInviteText(): TLInviteText

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetNearestDc(): TLNearestDc

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetPassportConfig(hash: Int): TLAbsPassportConfig

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetPromoData(): TLAbsPromoData

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetRecentMeUrls(referer: String): TLRecentMeUrls

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetSupport(): TLSupport

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetSupportName(): TLSupportName

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetTermsOfServiceUpdate(): TLAbsTermsOfServiceUpdate

    @Throws(RpcErrorException::class, IOException::class)
    fun helpGetUserInfo(userId: TLAbsInputUser): TLAbsUserInfo

    @Throws(RpcErrorException::class, IOException::class)
    fun helpHidePromoData(peer: TLAbsInputPeer): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun helpSaveAppLog(events: TLObjectVector<TLInputAppEvent>): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun helpSetBotUpdatesStatus(pendingUpdatesCount: Int, message: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun <T : TLObject> initConnection(
            apiId: Int,
            deviceModel: String,
            systemVersion: String,
            appVersion: String,
            systemLangCode: String,
            langPack: String,
            langCode: String,
            proxy: TLInputClientProxy?,
            params: TLAbsJSONValue?,
            query: TLMethod<T>?
    ): T

    @Throws(RpcErrorException::class, IOException::class)
    fun <T : TLObject> invokeAfterMsg(msgId: Long, query: TLMethod<T>?): T

    @Throws(RpcErrorException::class, IOException::class)
    fun <T : TLObject> invokeAfterMsgs(msgIds: TLLongVector, query: TLMethod<T>?): T

    @Throws(RpcErrorException::class, IOException::class)
    fun <T : TLObject> invokeWithLayer(layer: Int, query: TLMethod<T>?): T

    @Throws(RpcErrorException::class, IOException::class)
    fun <T : TLObject> invokeWithMessagesRange(range: TLMessageRange, query: TLMethod<T>?): T

    @Throws(RpcErrorException::class, IOException::class)
    fun <T : TLObject> invokeWithTakeout(takeoutId: Long, query: TLMethod<T>?): T

    @Throws(RpcErrorException::class, IOException::class)
    fun <T : TLObject> invokeWithoutUpdates(query: TLMethod<T>?): T

    @Throws(RpcErrorException::class, IOException::class)
    fun langpackGetDifference(
            langPack: String,
            langCode: String,
            fromVersion: Int
    ): TLLangPackDifference

    @Throws(RpcErrorException::class, IOException::class)
    fun langpackGetLangPack(langPack: String, langCode: String): TLLangPackDifference

    @Throws(RpcErrorException::class, IOException::class)
    fun langpackGetLanguage(langPack: String, langCode: String): TLLangPackLanguage

    @Throws(RpcErrorException::class, IOException::class)
    fun langpackGetLanguages(langPack: String): TLObjectVector<TLLangPackLanguage>

    @Throws(RpcErrorException::class, IOException::class)
    fun langpackGetStrings(
            langPack: String,
            langCode: String,
            keys: TLStringVector
    ): TLObjectVector<TLAbsLangPackString>

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesAcceptEncryption(
            peer: TLInputEncryptedChat,
            gB: TLBytes,
            keyFingerprint: Long
    ): TLAbsEncryptedChat

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesAcceptUrlAuth(
            writeAllowed: Boolean,
            peer: TLAbsInputPeer?,
            msgId: Int?,
            buttonId: Int?,
            url: String?
    ): TLAbsUrlAuthResult

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesAddChatUser(
            chatId: Long,
            userId: TLAbsInputUser,
            fwdLimit: Int
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesCheckChatInvite(hash: String): TLAbsChatInvite

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesCheckHistoryImport(importHead: String): TLHistoryImportParsed

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesCheckHistoryImportPeer(peer: TLAbsInputPeer): TLCheckedHistoryImportPeer

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesClearAllDrafts(): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesClearRecentStickers(attached: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesCreateChat(users: TLObjectVector<TLAbsInputUser>, title: String): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesDeleteChat(chatId: Long): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesDeleteChatUser(
            revokeHistory: Boolean,
            chatId: Long,
            userId: TLAbsInputUser
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesDeleteExportedChatInvite(peer: TLAbsInputPeer, link: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesDeleteHistory(
            justClear: Boolean,
            revoke: Boolean,
            peer: TLAbsInputPeer,
            maxId: Int
    ): TLAffectedHistory

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesDeleteMessages(revoke: Boolean, id: TLIntVector): TLAffectedMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesDeletePhoneCallHistory(revoke: Boolean): TLAffectedFoundMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesDeleteRevokedExportedChatInvites(peer: TLAbsInputPeer, adminId: TLAbsInputUser): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesDeleteScheduledMessages(peer: TLAbsInputPeer, id: TLIntVector): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesDiscardEncryption(deleteHistory: Boolean, chatId: Int): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesEditChatAbout(peer: TLAbsInputPeer, about: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesEditChatAdmin(
            chatId: Long,
            userId: TLAbsInputUser,
            isAdmin: Boolean
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesEditChatDefaultBannedRights(peer: TLAbsInputPeer, bannedRights: TLChatBannedRights): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesEditChatPhoto(chatId: Long, photo: TLAbsInputChatPhoto): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesEditChatTitle(chatId: Long, title: String): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesEditExportedChatInvite(
            revoked: Boolean,
            peer: TLAbsInputPeer,
            link: String,
            expireDate: Int?,
            usageLimit: Int?
    ): TLAbsExportedChatInvite

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesEditInlineBotMessage(
            noWebpage: Boolean,
            id: TLAbsInputBotInlineMessageID,
            message: String?,
            media: TLAbsInputMedia?,
            replyMarkup: TLAbsReplyMarkup?,
            entities: TLObjectVector<TLAbsMessageEntity>?
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesEditMessage(
            noWebpage: Boolean,
            peer: TLAbsInputPeer,
            id: Int,
            message: String?,
            media: TLAbsInputMedia?,
            replyMarkup: TLAbsReplyMarkup?,
            entities: TLObjectVector<TLAbsMessageEntity>?,
            scheduleDate: Int?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesExportChatInvite(
            legacyRevokePermanent: Boolean,
            peer: TLAbsInputPeer,
            expireDate: Int?,
            usageLimit: Int?
    ): TLChatInviteExported

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesFaveSticker(id: TLAbsInputDocument, unfave: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesForwardMessages(
            silent: Boolean,
            background: Boolean,
            withMyScore: Boolean,
            dropAuthor: Boolean,
            dropMediaCaptions: Boolean,
            fromPeer: TLAbsInputPeer,
            id: TLIntVector,
            randomId: TLLongVector,
            toPeer: TLAbsInputPeer,
            scheduleDate: Int?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetAdminsWithInvites(peer: TLAbsInputPeer): TLChatAdminsWithInvites

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetAllChats(exceptIds: TLLongVector): TLAbsChats

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetAllDrafts(): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetAllStickers(hash: Long): TLAbsAllStickers

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetArchivedStickers(
            masks: Boolean,
            offsetId: Long,
            limit: Int
    ): TLArchivedStickers

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetAttachedStickers(media: TLAbsInputStickeredMedia): TLObjectVector<TLAbsStickerSetCovered>

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetBotCallbackAnswer(
            game: Boolean,
            peer: TLAbsInputPeer,
            msgId: Int,
            data: TLBytes?,
            password: TLAbsInputCheckPasswordSRP?
    ): TLBotCallbackAnswer

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetChatInviteImporters(
            peer: TLAbsInputPeer,
            link: String,
            offsetDate: Int,
            offsetUser: TLAbsInputUser,
            limit: Int
    ): TLChatInviteImporters

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetChats(id: TLLongVector): TLAbsChats

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetCommonChats(
            userId: TLAbsInputUser,
            maxId: Long,
            limit: Int
    ): TLAbsChats

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetDhConfig(version: Int, randomLength: Int): TLAbsDhConfig

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetDialogFilters(): TLObjectVector<TLDialogFilter>

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetDialogUnreadMarks(): TLObjectVector<TLAbsDialogPeer>

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetDialogs(
            excludePinned: Boolean,
            folderId: Int?,
            offsetDate: Int,
            offsetId: Int,
            offsetPeer: TLAbsInputPeer,
            limit: Int,
            hash: Long
    ): TLAbsDialogs

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetDiscussionMessage(peer: TLAbsInputPeer, msgId: Int): TLDiscussionMessage

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetDocumentByHash(
            sha256: TLBytes,
            size: Int,
            mimeType: String
    ): TLAbsDocument

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetEmojiKeywords(langCode: String): TLEmojiKeywordsDifference

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetEmojiKeywordsDifference(langCode: String, fromVersion: Int): TLEmojiKeywordsDifference

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetEmojiKeywordsLanguages(langCodes: TLStringVector): TLObjectVector<TLEmojiLanguage>

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetEmojiURL(langCode: String): TLEmojiURL

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetExportedChatInvite(peer: TLAbsInputPeer, link: String): TLAbsExportedChatInvite

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetExportedChatInvites(
            revoked: Boolean,
            peer: TLAbsInputPeer,
            adminId: TLAbsInputUser,
            offsetDate: Int?,
            offsetLink: String?,
            limit: Int
    ): TLExportedChatInvites

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetFavedStickers(hash: Long): TLAbsFavedStickers

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetFeaturedStickers(hash: Long): TLAbsFeaturedStickers

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetFullChat(chatId: Long): TLChatFull

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetGameHighScores(
            peer: TLAbsInputPeer,
            id: Int,
            userId: TLAbsInputUser
    ): TLHighScores

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetHistory(
            peer: TLAbsInputPeer,
            offsetId: Int,
            offsetDate: Int,
            addOffset: Int,
            limit: Int,
            maxId: Int,
            minId: Int,
            hash: Long
    ): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetInlineBotResults(
            bot: TLAbsInputUser,
            peer: TLAbsInputPeer,
            geoPoint: TLAbsInputGeoPoint?,
            query: String,
            offset: String
    ): TLBotResults

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetInlineGameHighScores(id: TLAbsInputBotInlineMessageID, userId: TLAbsInputUser): TLHighScores

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetMaskStickers(hash: Long): TLAbsAllStickers

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetMessageEditData(peer: TLAbsInputPeer, id: Int): TLMessageEditData

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetMessageReadParticipants(peer: TLAbsInputPeer, msgId: Int): TLLongVector

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetMessages(id: TLObjectVector<TLAbsInputMessage>): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetMessagesViews(
            peer: TLAbsInputPeer,
            id: TLIntVector,
            increment: Boolean
    ): TLMessageViews

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetOldFeaturedStickers(
            offset: Int,
            limit: Int,
            hash: Long
    ): TLAbsFeaturedStickers

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetOnlines(peer: TLAbsInputPeer): TLChatOnlines

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetPeerDialogs(peers: TLObjectVector<TLAbsInputDialogPeer>): TLPeerDialogs

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetPeerSettings(peer: TLAbsInputPeer): TLPeerSettings

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetPinnedDialogs(folderId: Int): TLPeerDialogs

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetPollResults(peer: TLAbsInputPeer, msgId: Int): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetPollVotes(
            peer: TLAbsInputPeer,
            id: Int,
            option: TLBytes?,
            offset: String?,
            limit: Int
    ): TLVotesList

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetRecentLocations(
            peer: TLAbsInputPeer,
            limit: Int,
            hash: Long
    ): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetRecentStickers(attached: Boolean, hash: Long): TLAbsRecentStickers

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetReplies(
            peer: TLAbsInputPeer,
            msgId: Int,
            offsetId: Int,
            offsetDate: Int,
            addOffset: Int,
            limit: Int,
            maxId: Int,
            minId: Int,
            hash: Long
    ): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetSavedGifs(hash: Long): TLAbsSavedGifs

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetScheduledHistory(peer: TLAbsInputPeer, hash: Long): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetScheduledMessages(peer: TLAbsInputPeer, id: TLIntVector): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetSearchCounters(peer: TLAbsInputPeer, filters: TLObjectVector<TLAbsMessagesFilter>): TLObjectVector<TLSearchCounter>

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetSplitRanges(): TLObjectVector<TLMessageRange>

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetStickerSet(stickerset: TLAbsInputStickerSet): TLStickerSet

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetStickers(emoticon: String, hash: Long): TLAbsStickers

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetSuggestedDialogFilters(): TLObjectVector<TLDialogFilterSuggested>

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetUnreadMentions(
            peer: TLAbsInputPeer,
            offsetId: Int,
            addOffset: Int,
            limit: Int,
            maxId: Int,
            minId: Int
    ): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetWebPage(url: String, hash: Int): TLAbsWebPage

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesGetWebPagePreview(message: String, entities: TLObjectVector<TLAbsMessageEntity>?): TLAbsMessageMedia

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesHidePeerSettingsBar(peer: TLAbsInputPeer): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesImportChatInvite(hash: String): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesInitHistoryImport(
            peer: TLAbsInputPeer,
            file: TLAbsInputFile,
            mediaCount: Int
    ): TLHistoryImport

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesInstallStickerSet(stickerset: TLAbsInputStickerSet, archived: Boolean): TLAbsStickerSetInstallResult

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesMarkDialogUnread(unread: Boolean, peer: TLAbsInputDialogPeer): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesMigrateChat(chatId: Long): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReadDiscussion(
            peer: TLAbsInputPeer,
            msgId: Int,
            readMaxId: Int
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReadEncryptedHistory(peer: TLInputEncryptedChat, maxDate: Int): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReadFeaturedStickers(id: TLLongVector): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReadHistory(peer: TLAbsInputPeer, maxId: Int): TLAffectedMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReadMentions(peer: TLAbsInputPeer): TLAffectedHistory

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReadMessageContents(id: TLIntVector): TLAffectedMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReceivedMessages(maxId: Int): TLObjectVector<TLReceivedNotifyMessage>

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReceivedQueue(maxQts: Int): TLLongVector

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReorderPinnedDialogs(
            force: Boolean,
            folderId: Int,
            order: TLObjectVector<TLAbsInputDialogPeer>
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReorderStickerSets(masks: Boolean, order: TLLongVector): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReport(
            peer: TLAbsInputPeer,
            id: TLIntVector,
            reason: TLAbsReportReason,
            message: String
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReportEncryptedSpam(peer: TLInputEncryptedChat): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesReportSpam(peer: TLAbsInputPeer): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesRequestEncryption(
            userId: TLAbsInputUser,
            randomId: Int,
            gA: TLBytes
    ): TLAbsEncryptedChat

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesRequestUrlAuth(
            peer: TLAbsInputPeer?,
            msgId: Int?,
            buttonId: Int?,
            url: String?
    ): TLAbsUrlAuthResult

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSaveDraft(
            noWebpage: Boolean,
            replyToMsgId: Int?,
            peer: TLAbsInputPeer,
            message: String,
            entities: TLObjectVector<TLAbsMessageEntity>?
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSaveGif(id: TLAbsInputDocument, unsave: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSaveRecentSticker(
            attached: Boolean,
            id: TLAbsInputDocument,
            unsave: Boolean
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSearch(
            peer: TLAbsInputPeer,
            q: String,
            fromId: TLAbsInputPeer?,
            topMsgId: Int?,
            filter: TLAbsMessagesFilter,
            minDate: Int,
            maxDate: Int,
            offsetId: Int,
            addOffset: Int,
            limit: Int,
            maxId: Int,
            minId: Int,
            hash: Long
    ): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSearchGlobal(
            folderId: Int?,
            q: String,
            filter: TLAbsMessagesFilter,
            minDate: Int,
            maxDate: Int,
            offsetRate: Int,
            offsetPeer: TLAbsInputPeer,
            offsetId: Int,
            limit: Int
    ): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSearchStickerSets(
            excludeFeatured: Boolean,
            q: String,
            hash: Long
    ): TLAbsFoundStickerSets

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendEncrypted(
            silent: Boolean,
            peer: TLInputEncryptedChat,
            randomId: Long,
            data: TLBytes
    ): TLAbsSentEncryptedMessage

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendEncryptedFile(
            silent: Boolean,
            peer: TLInputEncryptedChat,
            randomId: Long,
            data: TLBytes,
            file: TLAbsInputEncryptedFile
    ): TLAbsSentEncryptedMessage

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendEncryptedService(
            peer: TLInputEncryptedChat,
            randomId: Long,
            data: TLBytes
    ): TLAbsSentEncryptedMessage

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendInlineBotResult(
            silent: Boolean,
            background: Boolean,
            clearDraft: Boolean,
            hideVia: Boolean,
            peer: TLAbsInputPeer,
            replyToMsgId: Int?,
            randomId: Long,
            queryId: Long,
            id: String,
            scheduleDate: Int?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendMedia(
            silent: Boolean,
            background: Boolean,
            clearDraft: Boolean,
            peer: TLAbsInputPeer,
            replyToMsgId: Int?,
            media: TLAbsInputMedia,
            message: String,
            randomId: Long,
            replyMarkup: TLAbsReplyMarkup?,
            entities: TLObjectVector<TLAbsMessageEntity>?,
            scheduleDate: Int?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendMessage(
            noWebpage: Boolean,
            silent: Boolean,
            background: Boolean,
            clearDraft: Boolean,
            peer: TLAbsInputPeer,
            replyToMsgId: Int?,
            message: String,
            randomId: Long,
            replyMarkup: TLAbsReplyMarkup?,
            entities: TLObjectVector<TLAbsMessageEntity>?,
            scheduleDate: Int?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendMultiMedia(
            silent: Boolean,
            background: Boolean,
            clearDraft: Boolean,
            peer: TLAbsInputPeer,
            replyToMsgId: Int?,
            multiMedia: TLObjectVector<TLInputSingleMedia>,
            scheduleDate: Int?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendScheduledMessages(peer: TLAbsInputPeer, id: TLIntVector): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendScreenshotNotification(
            peer: TLAbsInputPeer,
            replyToMsgId: Int,
            randomId: Long
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSendVote(
            peer: TLAbsInputPeer,
            msgId: Int,
            options: TLBytesVector
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetBotCallbackAnswer(
            alert: Boolean,
            queryId: Long,
            message: String?,
            url: String?,
            cacheTime: Int
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetBotPrecheckoutResults(
            success: Boolean,
            queryId: Long,
            error: String?
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetBotShippingResults(
            queryId: Long,
            error: String?,
            shippingOptions: TLObjectVector<TLShippingOption>?
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetChatTheme(peer: TLAbsInputPeer, emoticon: String): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetEncryptedTyping(peer: TLInputEncryptedChat, typing: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetGameScore(
            editMessage: Boolean,
            force: Boolean,
            peer: TLAbsInputPeer,
            id: Int,
            userId: TLAbsInputUser,
            score: Int
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetHistoryTTL(peer: TLAbsInputPeer, period: Int): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetInlineBotResults(
            gallery: Boolean,
            _private: Boolean,
            queryId: Long,
            results: TLObjectVector<TLAbsInputBotInlineResult>,
            cacheTime: Int,
            nextOffset: String?,
            switchPm: TLInlineBotSwitchPM?
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetInlineGameScore(
            editMessage: Boolean,
            force: Boolean,
            id: TLAbsInputBotInlineMessageID,
            userId: TLAbsInputUser,
            score: Int
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesSetTyping(
            peer: TLAbsInputPeer,
            topMsgId: Int?,
            action: TLAbsSendMessageAction
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesStartBot(
            bot: TLAbsInputUser,
            peer: TLAbsInputPeer,
            randomId: Long,
            startParam: String
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesStartHistoryImport(peer: TLAbsInputPeer, importId: Long): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesToggleDialogPin(pinned: Boolean, peer: TLAbsInputDialogPeer): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesToggleStickerSets(
            uninstall: Boolean,
            archive: Boolean,
            unarchive: Boolean,
            stickersets: TLObjectVector<TLAbsInputStickerSet>
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesUninstallStickerSet(stickerset: TLAbsInputStickerSet): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesUnpinAllMessages(peer: TLAbsInputPeer): TLAffectedHistory

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesUpdateDialogFilter(id: Int, filter: TLDialogFilter?): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesUpdateDialogFiltersOrder(order: TLIntVector): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesUpdatePinnedMessage(
            silent: Boolean,
            unpin: Boolean,
            pmOneside: Boolean,
            peer: TLAbsInputPeer,
            id: Int
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesUploadEncryptedFile(peer: TLInputEncryptedChat, file: TLAbsInputEncryptedFile): TLAbsEncryptedFile

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesUploadImportedMedia(
            peer: TLAbsInputPeer,
            importId: Long,
            fileName: String,
            media: TLAbsInputMedia
    ): TLAbsMessageMedia

    @Throws(RpcErrorException::class, IOException::class)
    fun messagesUploadMedia(peer: TLAbsInputPeer, media: TLAbsInputMedia): TLAbsMessageMedia

    @Throws(RpcErrorException::class, IOException::class)
    fun paymentsClearSavedInfo(credentials: Boolean, info: Boolean): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun paymentsGetBankCardData(number: String): TLBankCardData

    @Throws(RpcErrorException::class, IOException::class)
    fun paymentsGetPaymentForm(
            peer: TLAbsInputPeer,
            msgId: Int,
            themeParams: TLDataJSON?
    ): TLPaymentForm

    @Throws(RpcErrorException::class, IOException::class)
    fun paymentsGetPaymentReceipt(peer: TLAbsInputPeer, msgId: Int): TLPaymentReceipt

    @Throws(RpcErrorException::class, IOException::class)
    fun paymentsGetSavedInfo(): TLSavedInfo

    @Throws(RpcErrorException::class, IOException::class)
    fun paymentsSendPaymentForm(
            formId: Long,
            peer: TLAbsInputPeer,
            msgId: Int,
            requestedInfoId: String?,
            shippingOptionId: String?,
            credentials: TLAbsInputPaymentCredentials,
            tipAmount: Long?
    ): TLAbsPaymentResult

    @Throws(RpcErrorException::class, IOException::class)
    fun paymentsValidateRequestedInfo(
            save: Boolean,
            peer: TLAbsInputPeer,
            msgId: Int,
            info: TLPaymentRequestedInfo
    ): TLValidatedRequestedInfo

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneAcceptCall(
            peer: TLInputPhoneCall,
            gB: TLBytes,
            protocol: TLPhoneCallProtocol
    ): TLPhoneCall

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneCheckGroupCall(call: TLInputGroupCall, sources: TLIntVector): TLIntVector

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneConfirmCall(
            peer: TLInputPhoneCall,
            gA: TLBytes,
            keyFingerprint: Long,
            protocol: TLPhoneCallProtocol
    ): TLPhoneCall

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneCreateGroupCall(
            peer: TLAbsInputPeer,
            randomId: Int,
            title: String?,
            scheduleDate: Int?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneDiscardCall(
            video: Boolean,
            peer: TLInputPhoneCall,
            duration: Int,
            reason: TLAbsPhoneCallDiscardReason,
            connectionId: Long
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneDiscardGroupCall(call: TLInputGroupCall): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneEditGroupCallParticipant(
            call: TLInputGroupCall,
            participant: TLAbsInputPeer,
            muted: Boolean?,
            volume: Int?,
            raiseHand: Boolean?,
            videoStopped: Boolean?,
            videoPaused: Boolean?,
            presentationPaused: Boolean?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneEditGroupCallTitle(call: TLInputGroupCall, title: String): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneExportGroupCallInvite(canSelfUnmute: Boolean, call: TLInputGroupCall): TLExportedGroupCallInvite

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneGetCallConfig(): TLDataJSON

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneGetGroupCall(call: TLInputGroupCall, limit: Int): TLGroupCall

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneGetGroupCallJoinAs(peer: TLAbsInputPeer): TLJoinAsPeers

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneGetGroupParticipants(
            call: TLInputGroupCall,
            ids: TLObjectVector<TLAbsInputPeer>,
            sources: TLIntVector,
            offset: String,
            limit: Int
    ): TLGroupParticipants

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneInviteToGroupCall(call: TLInputGroupCall, users: TLObjectVector<TLAbsInputUser>): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneJoinGroupCall(
            muted: Boolean,
            videoStopped: Boolean,
            call: TLInputGroupCall,
            joinAs: TLAbsInputPeer,
            inviteHash: String?,
            params: TLDataJSON
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneJoinGroupCallPresentation(call: TLInputGroupCall, params: TLDataJSON): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneLeaveGroupCall(call: TLInputGroupCall, source: Int): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneLeaveGroupCallPresentation(call: TLInputGroupCall): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneReceivedCall(peer: TLInputPhoneCall): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneRequestCall(
            video: Boolean,
            userId: TLAbsInputUser,
            randomId: Int,
            gAHash: TLBytes,
            protocol: TLPhoneCallProtocol
    ): TLPhoneCall

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneSaveCallDebug(peer: TLInputPhoneCall, debug: TLDataJSON): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneSaveDefaultGroupCallJoinAs(peer: TLAbsInputPeer, joinAs: TLAbsInputPeer): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneSendSignalingData(peer: TLInputPhoneCall, data: TLBytes): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneSetCallRating(
            userInitiative: Boolean,
            peer: TLInputPhoneCall,
            rating: Int,
            comment: String
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneStartScheduledGroupCall(call: TLInputGroupCall): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneToggleGroupCallRecord(
            start: Boolean,
            video: Boolean,
            call: TLInputGroupCall,
            title: String?,
            videoPortrait: Boolean?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneToggleGroupCallSettings(
            resetInviteHash: Boolean,
            call: TLInputGroupCall,
            joinMuted: Boolean?
    ): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun phoneToggleGroupCallStartSubscription(call: TLInputGroupCall, subscribed: Boolean): TLAbsUpdates

    @Throws(RpcErrorException::class, IOException::class)
    fun photosDeletePhotos(id: TLObjectVector<TLAbsInputPhoto>): TLLongVector

    @Throws(RpcErrorException::class, IOException::class)
    fun photosGetUserPhotos(
            userId: TLAbsInputUser,
            offset: Int,
            maxId: Long,
            limit: Int
    ): TLAbsPhotos

    @Throws(RpcErrorException::class, IOException::class)
    fun photosUpdateProfilePhoto(id: TLAbsInputPhoto): TLPhoto

    @Throws(RpcErrorException::class, IOException::class)
    fun photosUploadProfilePhoto(
            file: TLAbsInputFile?,
            video: TLAbsInputFile?,
            videoStartTs: Double?
    ): TLPhoto

    @Throws(RpcErrorException::class, IOException::class)
    fun statsGetBroadcastStats(dark: Boolean, channel: TLAbsInputChannel): TLBroadcastStats

    @Throws(RpcErrorException::class, IOException::class)
    fun statsGetMegagroupStats(dark: Boolean, channel: TLAbsInputChannel): TLMegagroupStats

    @Throws(RpcErrorException::class, IOException::class)
    fun statsGetMessagePublicForwards(
            channel: TLAbsInputChannel,
            msgId: Int,
            offsetRate: Int,
            offsetPeer: TLAbsInputPeer,
            offsetId: Int,
            limit: Int
    ): TLAbsMessages

    @Throws(RpcErrorException::class, IOException::class)
    fun statsGetMessageStats(
            dark: Boolean,
            channel: TLAbsInputChannel,
            msgId: Int
    ): TLMessageStats

    @Throws(RpcErrorException::class, IOException::class)
    fun statsLoadAsyncGraph(token: String, x: Long?): TLAbsStatsGraph

    @Throws(RpcErrorException::class, IOException::class)
    fun stickersAddStickerToSet(stickerset: TLAbsInputStickerSet, sticker: TLInputStickerSetItem): TLStickerSet

    @Throws(RpcErrorException::class, IOException::class)
    fun stickersChangeStickerPosition(sticker: TLAbsInputDocument, position: Int): TLStickerSet

    @Throws(RpcErrorException::class, IOException::class)
    fun stickersCheckShortName(shortName: String): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun stickersCreateStickerSet(
            masks: Boolean,
            animated: Boolean,
            userId: TLAbsInputUser,
            title: String,
            shortName: String,
            thumb: TLAbsInputDocument?,
            stickers: TLObjectVector<TLInputStickerSetItem>,
            software: String?
    ): TLStickerSet

    @Throws(RpcErrorException::class, IOException::class)
    fun stickersRemoveStickerFromSet(sticker: TLAbsInputDocument): TLStickerSet

    @Throws(RpcErrorException::class, IOException::class)
    fun stickersSetStickerSetThumb(stickerset: TLAbsInputStickerSet, thumb: TLAbsInputDocument): TLStickerSet

    @Throws(RpcErrorException::class, IOException::class)
    fun stickersSuggestShortName(title: String): TLSuggestedShortName

    @Throws(RpcErrorException::class, IOException::class)
    fun updatesGetChannelDifference(
            force: Boolean,
            channel: TLAbsInputChannel,
            filter: TLAbsChannelMessagesFilter,
            pts: Int,
            limit: Int
    ): TLAbsChannelDifference

    @Throws(RpcErrorException::class, IOException::class)
    fun updatesGetDifference(
            pts: Int,
            ptsTotalLimit: Int?,
            date: Int,
            qts: Int
    ): TLAbsDifference

    @Throws(RpcErrorException::class, IOException::class)
    fun updatesGetState(): TLState

    @Throws(RpcErrorException::class, IOException::class)
    fun uploadGetCdnFile(
            fileToken: TLBytes,
            offset: Int,
            limit: Int
    ): TLAbsCdnFile

    @Throws(RpcErrorException::class, IOException::class)
    fun uploadGetCdnFileHashes(fileToken: TLBytes, offset: Int): TLObjectVector<TLFileHash>

    @Throws(RpcErrorException::class, IOException::class)
    fun uploadGetFile(
            precise: Boolean,
            cdnSupported: Boolean,
            location: TLAbsInputFileLocation,
            offset: Int,
            limit: Int
    ): TLAbsFile

    @Throws(RpcErrorException::class, IOException::class)
    fun uploadGetFileHashes(location: TLAbsInputFileLocation, offset: Int): TLObjectVector<TLFileHash>

    @Throws(RpcErrorException::class, IOException::class)
    fun uploadGetWebFile(
            location: TLAbsInputWebFileLocation,
            offset: Int,
            limit: Int
    ): TLWebFile

    @Throws(RpcErrorException::class, IOException::class)
    fun uploadReuploadCdnFile(fileToken: TLBytes, requestToken: TLBytes): TLObjectVector<TLFileHash>

    @Throws(RpcErrorException::class, IOException::class)
    fun uploadSaveBigFilePart(
            fileId: Long,
            filePart: Int,
            fileTotalParts: Int,
            bytes: TLBytes
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun uploadSaveFilePart(
            fileId: Long,
            filePart: Int,
            bytes: TLBytes
    ): TLBool

    @Throws(RpcErrorException::class, IOException::class)
    fun usersGetFullUser(id: TLAbsInputUser): TLUserFull

    @Throws(RpcErrorException::class, IOException::class)
    fun usersGetUsers(id: TLObjectVector<TLAbsInputUser>): TLObjectVector<TLAbsUser>

    @Throws(RpcErrorException::class, IOException::class)
    fun usersSetSecureValueErrors(id: TLAbsInputUser, errors: TLObjectVector<TLAbsSecureValueError>): TLBool
}
