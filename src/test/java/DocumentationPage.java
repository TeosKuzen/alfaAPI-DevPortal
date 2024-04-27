import org.openqa.selenium.By;

class DocumentationPage extends BasePage {

    /**
     * Предполагаемые URLs открытия карточек продуктов на главной странице
     * */
    String alfaApiSectionUrl = baseUrl + "products/alfa-api";
    String alfaIDSectionUrl = baseUrl + "products/alfa-id";
    String alfaPaySectionUrl = baseUrl + "products/alfa-pay";
    By detailsAlfaAPI = By.xpath("(//*[contains(text(),'Подробнее')])[1]");
    By detailsAlfaID = By.xpath("(//*[contains(text(),'Подробнее')])[2]");
    By detailsAlfaPay = By.xpath("(//*[contains(text(),'Подробнее')])[3]");
    By allSection = By.xpath("(//*[contains(text(),'Все статьи раздела')])[1]");
    //Общая информация
    String specificationIntroUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/intro/intro";
    String checkListUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/check-list/check-list";
    String scopesUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/scopes/scopes";
    String channelProtectionUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/channel-protection/channel-protection";
    String paginationUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/pagination/pagination";
    String termsUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/terms/terms";

    //Общая информация/Сертификаты Минцифры
    String certIntro = baseUrl + "products/alfa-api/documentation/articles/specification/articles/certificate/articles/intro/intro";
    String androidUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/certificate/articles/android/android";
    String iosUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/certificate/articles/ios/ios";
    String windowsUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/certificate/articles/windows/windows";
    String macosUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/certificate/articles/macos/macos";
    String linuxUrl = baseUrl + "products/alfa-api/documentation/articles/specification/articles/certificate/articles/linux/linux";

    //Подключение к Alfa API
    String connectionInstructionUrl = baseUrl + "products/alfa-api/documentation/articles/connection/articles/instruction/instruction";
    String onboardingUrl = baseUrl + "products/alfa-api/documentation/articles/connection/articles/onboarding/onboarding";
    String revokeUrl = baseUrl + "products/alfa-api/documentation/articles/connection/articles/revoke/revoke";
    String clientIdUrl = baseUrl + "products/alfa-api/documentation/articles/connection/articles/clientid/clientid";
    String tlsUrl = baseUrl + "products/alfa-api/documentation/articles/connection/articles/tls/tls";
    String clientSecretUrl = baseUrl + "products/alfa-api/documentation/articles/connection/articles/clientsecret/clientsecret";

    //Alfa ID
    String authenticationUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/authentication/authentication";
    String buttonUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/button/button";

    //Alfa ID/Authorization Code Flow
    String authCodeFlIntroUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf/articles/intro/intro";
    String getAuthCodeUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf/articles/get-auth-code/v1/get-auth-code";
    String getAccessTokenUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf/articles/get-access-token/v1/get-access-token";
    String getProfileInfoUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf/articles/get-profile-info/v1/get-profile-info";
    String tokenUpdateUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf/articles/token-update/v1/token-update";

    //Alfa ID/Authorization Code Flow для H2H интеграций
    String h2hFlowintroUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf-h2h/articles/intro/intro";
    String getAuthCodeH2HUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf-h2h/articles/get-auth-code/v1/get-auth-code";
    String getAccessTokenH2HUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf-h2h/articles/get-access-token/v1/get-access-token";
    String tokenUpdateH2HUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf-h2h/articles/token-update/v1/token-update";

    //Alfa ID/Authorization Code Flow для холдингов
    String acfHoldingIntroUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf-holding/articles/intro/intro";
    String getAuthCodeHoldingUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf-holding/articles/get-auth-code/v1/get-auth-code";
    String getAccessTokenHoldingUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf-holding/articles/get-access-token/v1/get-access-token";
    String tokenUpdateHoldingUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/acf-holding/articles/token-update/v1/token-update";

    //Alfa ID/Client Credentials Flow
    String cliCreFloIntroUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/ccf/articles/intro/intro";
    String cliCreFloGetTokenUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/ccf/articles/get-access-token/v1/get-access-token";

    //Alfa ID/Расширение сценариев
    String signatureCheckingUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/expansion/articles/signature-checking/signature-checking";
    String revokeTokenUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/expansion/articles/revoke-token/v1/revoke-token";
    String clientConsentsUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/expansion/articles/client-consents/v1/client-consents";

    //...
    String screeningUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/screening/screening";

    //Песочница/Тестирование вебхуков
    String checkWebIntroUrl = baseUrl + "products/alfa-api/documentation/articles/sandbox/articles/check-webhook/articles/intro/intro";
    String checkWebTransactionsUrl = baseUrl + "products/alfa-api/documentation/articles/sandbox/articles/check-webhook/articles/transactions/v1/transactions";

    //...
    String managingCertificatesUrl = baseUrl + "products/alfa-api/documentation/articles/sandbox/articles/managing-certificates/managing-certificates";

    //Песочница/Тестирование транспортной подписи и шифрования
    String jwsUrl = baseUrl + "products/alfa-api/documentation/articles/sandbox/articles/signature/articles/jws/v1/jws";
    String xmlDsigUrl = baseUrl + "products/alfa-api/documentation/articles/sandbox/articles/signature/articles/xmldsig/v1/xmldsig";

    //JavaSDK
    String sdkConnectionUrl = baseUrl + "products/alfa-api/documentation/articles/sdk/articles/connection/connection";
    String sdkInitUrl = baseUrl + "products/alfa-api/documentation/articles/sdk/articles/initialization/initialization";
    String sdkTransactUrl = baseUrl + "products/alfa-api/documentation/articles/sdk/articles/transactions/v1/transactions";

    //Обмен файлами
    String fileDownloadUrl = baseUrl + "products/alfa-api/documentation/articles/secure-file-transfer/articles/download/v1/download";
    String fileUploadUrl = baseUrl + "products/alfa-api/documentation/articles/secure-file-transfer/articles/upload/v1/upload";

    //Транспортная подпись и шифрование/Управление сертификатами для подписи и шифрования
    String postCertUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/managing-certificates/articles/post-certificates/post-certificates";
    String getCertUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/managing-certificates/articles/get-certificates/get-certificates";
    String patchCertUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/managing-certificates/articles/patch-certificates/patch-certificates";

    //Транспортная подпись и шифрование/Транспортная подпись
    String jsonRsaUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/signature/articles/json-rsa/json-rsa";
    String jsonGostUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/signature/articles/json-gost/json-gost";
    String xmlRSAUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/signature/articles/xml-rsa/xml-rsa";

    //Транспортная подпись и шифрование/Шифрование
    String encJsonRSAUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/encryption/articles/json-rsa/json-rsa";
    String encJsonGostUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/encryption/articles/json-gost/json-gost";
    String encXmlRSAUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/encryption/articles/xml-rsa/xml-rsa";

    //Вебхуки
    String createWebhUrl = baseUrl + "products/alfa-api/documentation/articles/webhooks/articles/create-webhook/v1/create-webhook";
    String editWebhUrl = baseUrl + "products/alfa-api/documentation/articles/webhooks/articles/edit-webhook/v2/edit-webhook";
    String deleteWebhUrl = baseUrl + "products/alfa-api/documentation/articles/webhooks/articles/delete-webhook/v1/delete-webhook";
    String getWebhUrl = baseUrl + "products/alfa-api/documentation/articles/webhooks/articles/get-webhook/v2/get-webhook";
    String getListWebhUrl = baseUrl + "products/alfa-api/documentation/articles/webhooks/articles/get-lists-webhooks/v2/get-lists-webhooks";
    String partnerWebhUrl = baseUrl + "products/alfa-api/documentation/articles/webhooks/articles/partner-webhook/v1/partner-webhook";

    //Выписки по счетам юр. лиц
    String statement1cUrl = baseUrl + "products/alfa-api/documentation/articles/transactions/articles/statement1c/v1/statement1c";
    String statementMT940Url = baseUrl + "products/alfa-api/documentation/articles/transactions/articles/statement-mt940/v1/statement-mt940";
    String getTurnoverUrl = baseUrl + "products/alfa-api/documentation/articles/transactions/articles/turnover/v1/turnover";
    String corespondentUrl = baseUrl + "products/alfa-api/documentation/articles/transactions/articles/correspondent/v1/correspondent";

    //Выписки по счетам юр. лиц/получение файла выписки
    String instrGetFileUrl = baseUrl + "products/alfa-api/documentation/articles/transactions/articles/statement-file/articles/intro/intro";
    String statementFileUrl = baseUrl + "products/alfa-api/documentation/articles/transactions/articles/statement-file/articles/file/v1/file";
    String getStatFileUrl = baseUrl + "products/alfa-api/documentation/articles/transactions/articles/statement-file/articles/get-file/v1/get-file";

    //Информация по счетам физ.лиц
    String getDetailsUrl = baseUrl + "products/alfa-api/documentation/articles/accounts/articles/details/v1/details";
    String requisitesUrl = baseUrl + "products/alfa-api/documentation/articles/accounts/articles/requisites/v1/requisites";

    //Эскроу счета 214-ФЗ
    String postOrdersUrl = baseUrl + "products/alfa-api/documentation/articles/escrow/articles/post-orders/v1/post-orders";
    String getOrdersUrl = baseUrl + "products/alfa-api/documentation/articles/escrow/articles/orders/v1/orders";
    String getListOrdersUrl = baseUrl + "products/alfa-api/documentation/articles/escrow/articles/list-orders/v1/list-orders";
    String patchOrdersUrl = baseUrl + "products/alfa-api/documentation/articles/escrow/articles/patch-orders/v1/patch-orders";
    String deleteOrdersUrl = baseUrl + "products/alfa-api/documentation/articles/escrow/articles/delete-orders/v1/delete-orders";
    String cancelEscUrl = baseUrl + "products/alfa-api/documentation/articles/escrow/articles/cancel/v1/cancel";
    String postFullOrdUrl = baseUrl + "products/alfa-api/documentation/articles/escrow/articles/orders-full/v1/orders-full";

    //Платежные поручения
    String payStatusUrl = baseUrl + "products/alfa-api/documentation/articles/payments/articles/status/v2/status";
    String payDetailsUrl = baseUrl + "products/alfa-api/documentation/articles/payments/articles/details/v1/details";
    String payPrintUrl = baseUrl + "products/alfa-api/documentation/articles/payments/articles/print/v1/print";
    String payPDFUrl = baseUrl + "products/alfa-api/documentation/articles/payments/articles/download/v1/download";

    //Переводы с карты на карту
    String agreemPageUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/agreement-page/v1/agreement-page";
    String selfEmplUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/selfemployed-list/v1/selfemployed-list";
    String listStateUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/list-state/v1/list-state";
    String vatinPurUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/vatin-put/v1/vatin-put";
    String ftsStatusUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/fts-status/v1/fts-status";
    String taxStatusUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/taxpayer-status/v1/taxpayer-status";
    String accDebtsUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/accrual-and-debts/v1/accrual-and-debts";
    String accDebtFtsUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/accrual-and-debts-front-fts-status/v1/accrual-and-debts-front-fts-status";
    String payDocUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/payment-documents/v1/payment-documents";
    String payDocFtsUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/payment-document-from-fts/v1/payment-document-from-fts";
    String reicAndPayUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/receipt-and-payout-list/v1/receipt-and-payout-list";
    String reicListUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/receipt-list/v1/receipt-list";
    String payListWithCheckUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/payout-list-with-check-selfemployed-status/v1/payout-list-with-check-selfemployed-status";
    String payoutListUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/payout-list/v1/payout-list";
    String payListStateUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/payout-list-state/v1/payout-list-state";
    String getPayListUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/payout-list-get/v1/payout-list-get";
    String vatinPayUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/payout-vatin/v1/payout-vatin";
    String selfListUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/lists/v1/lists";
    String selfVatinUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/vatin/v1/vatin";
    String incomeForPerUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/income-for-period/v1/income-for-period";
    String inForPerReqUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/income-for-period-requesid/v1/income-for-period-requesid";
    String selfIncomeUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/income/v1/income";
    String incReqUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/income-requesid/v1/income-requesid";
    String taxAccInfoUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/taxpayer-account-info/v1/taxpayer-account-info";
    String taxAccInfReqUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/taxpayer-account-info-requestid/v1/taxpayer-account-info-requestid";
    String cancRecListUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/cancel-receipt-list/v1/cancel-receipt-list";
    String cancResListStUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/cancel-receipt-list-state/v1/cancel-receipt-list-state";
    String selfActUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/activities/v1/activities";
    String regionsUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/regions/v1/regions";
    String sbpBankUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/sbp-banks/v1/sbp-banks";

    //Прием оплаты через СБП
    String mercUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-merchants/articles/merchant/v1/merchant";
    String termUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-merchants/articles/terminal/v1/terminal";

    //Кредиты
    String scorTempUrl = baseUrl + "products/alfa-api/documentation/articles/scoring/articles/scoring_temporary/v1/scoring";

    //Электронная подпись
    String getDNUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/get-dn/v1/get-dn";
    String dnFileUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/get-dn-file/v1/get-dn-file";
    String issueRSAUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/issue-rsa/v1/issue-rsa";
    String sendReqUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/send-request/v1/send-request";
    String sigWithSMSUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/sign-with-sms/v1/sign-with-sms";
    String getReqUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/get-request/v1/get-request";
    String getRSAUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/get-rsa/v1/get-rsa";
    String ActRSAUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/activation-rsa/v1/activation-rsa";
    String chaSigMetUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/change-sign-method/v1/change-sign-method";

    //Карты
    String actListUrl = baseUrl + "products/alfa-api/documentation/articles/cards/articles/actions-list/v1/actions-list";
    String tariffUrl = baseUrl + "products/alfa-api/documentation/articles/cards/articles/tariff/v1/tariff";
    String sbuscrUrl = baseUrl + "products/alfa-api/documentation/articles/cards/articles/subscriptions/v1/subscriptions";
    String actionUrl = baseUrl + "products/alfa-api/documentation/articles/cards/articles/create-action/v1/create-action";
    String confActUrl = baseUrl + "products/alfa-api/documentation/articles/cards/articles/confirm-action/v1/confirm-action";

    //История операций и выписки
    String opDetailsUrl = baseUrl + "products/alfa-api/documentation/articles/operations-history/articles/operation-details/v1/operation-details";
    String accRepUrl = baseUrl + "products/alfa-api/documentation/articles/operations-history/articles/account-report/v1/account-report";
    String credStUrl = baseUrl + "products/alfa-api/documentation/articles/operations-history/articles/credit-statement/v1/credit-statement";

    //Справки
    String balRusUrl = baseUrl + "products/alfa-api/documentation/articles/reports/articles/balance-rus/v1/balance-rus";
    String creCloseUrl = baseUrl + "products/alfa-api/documentation/articles/reports/articles/credit-closed/v1/credit-closed";
    String credUrl = baseUrl + "products/alfa-api/documentation/articles/reports/articles/credit/v1/credit";
    String depoUrl = baseUrl + "products/alfa-api/documentation/articles/reports/articles/deposit/v1/deposit";

    //Получение документов
    String repFileUrl = baseUrl + "products/alfa-api/documentation/articles/reports-receiving/articles/reports-body/v1/reports-body";

    //Переводы с карты на карту
    String storeCardUrl = baseUrl + "products/alfa-api/documentation/articles/transfers/articles/store-card/v1/store-card";
    String getCardUrl = baseUrl + "products/alfa-api/documentation/articles/transfers/articles/get-cards/v1/get-cards";
    String feeCalcUrl = baseUrl + "products/alfa-api/documentation/articles/transfers/articles/fee-calculate/v1/fee-calculate";
    String executeUrl = baseUrl + "products/alfa-api/documentation/articles/transfers/articles/execute/v1/execute";
    String getOpUrl = baseUrl + "products/alfa-api/documentation/articles/transfers/articles/get-operation/v1/get-operation";

    //Лимиты по операциям
    String clientUrl = baseUrl + "products/alfa-api/documentation/articles/limits/articles/client/v1/client";
    String createClUrl = baseUrl + "products/alfa-api/documentation/articles/limits/articles/create-client/v1/create-client";
    String delClUrl = baseUrl + "products/alfa-api/documentation/articles/limits/articles/delete-client/v1/delete-client";

    //Программа лояльности
    String loyTransUrl = baseUrl + "products/alfa-api/documentation/articles/loyalty/articles/transactions/v1/transactions";
    String loyCashUrl = baseUrl + "products/alfa-api/documentation/articles/loyalty/articles/cashback/v1/cashback";

    //Платежи через СПБ
    String phonePayUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2c/articles/phonepayment/v1/phonepayment";
    String getPhonePayUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2c/articles/get-phonepayment/v1/get-phonepayment";
    String phonePayByPacUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2c/articles/phonepayment-by-package/v1/phonepayment-by-package";
    String checkPayUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2c/articles/checkpayment/v1/checkpayment";
    String checkPayStUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2c/articles/checkpaymentstatus/v1/checkpaymentstatus";
    String clInfoUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2c/articles/clientinfo/v1/clientinfo";
    String banksUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2c/articles/banks/v1/banks";

    //Оплата покупок через СПБ
    String genSubUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-c2b/articles/generate-subscription/v1/generate-subscription";
    String qrcStUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-c2b/articles/qrc-status/v1/qrc-status";
    String petitionUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-c2b/articles/petition/v1/petition";
    String cashQRCUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-c2b/articles/cash-qrc-registration/v1/cash-qrc-registration";
    String qrcActUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-c2b/articles/cash-qrc-activation/v1/cash-qrc-activation";
    String qrcDeactUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-c2b/articles/cash-qrc-deactivation/v1/cash-qrc-deactivation";
    String refundUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-c2b/articles/refund/v1/refund";
    String refStUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-c2b/articles/refund-status/v1/refund-status";

    //Операции СПБ для юр. лиц
    String oneTimeUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/one-time-use/v1/one-time-use";
    String reusUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/reusable/v1/reusable";
    String payUrlsUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/payment-urls/v1/payment-urls";
    String payDataUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/payment-url-data/v1/payment-url-data";
    String incPayUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/incoming-payments/v1/incoming-payments";
    String regOutPayUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/register-outgoing-payment/v1/register-outgoing-payment";
    String exOutPayUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/execute-outgoing-payment/v1/execute-outgoing-payment";
    String outPayUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/outgoing-payments/v1/outgoing-payments";
    String outPayStUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/outgoing-payment-status/v1/outgoing-payment-status";
    String alfaIDIntroUrl = baseUrl + "products/alfa-api/documentation/articles/alfa-id/articles/intro/intro";
    String sandboxIntroUrl = baseUrl + "products/alfa-api/documentation/articles/sandbox/articles/intro/intro";
    String sdkIntroUrl = baseUrl + "products/alfa-api/documentation/articles/sdk/articles/intro/intro";
    String fileTransferIntroUrl = baseUrl + "products/alfa-api/documentation/articles/secure-file-transfer/articles/intro/intro";
    String signatureEncryptionIntroUrl = baseUrl + "products/alfa-api/documentation/articles/signature-encryption/articles/intro/intro";
    String webhooksIntroUrl = baseUrl + "products/alfa-api/documentation/articles/webhooks/articles/intro/intro";
    String transactionsStatementUrl = baseUrl + "products/alfa-api/documentation/articles/transactions/articles/statement/v1/statement";
    String accountsListUrl = baseUrl + "products/alfa-api/documentation/articles/accounts/articles/list/v1/list";
    String escrowBuildProjectsUrl = baseUrl + "products/alfa-api/documentation/articles/escrow/articles/build-projects/v1/build-projects";
    String customerInfoUrl = baseUrl + "products/alfa-api/documentation/articles/customer-info/articles/customer-info/v1/customer-info";
    String paymentsCreateUrl = baseUrl + "products/alfa-api/documentation/articles/payments/articles/create/v2/create";
    String employedIntroUrl = baseUrl + "products/alfa-api/documentation/articles/selfemployed/articles/intro/intro";
    String sbpMerchantsLegalUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-merchants/articles/legal/v1/legal";
    String scoringFirstUrl = baseUrl + "products/alfa-api/documentation/articles/scoring/articles/scoring/v1/scoring";
    String signatureIntroUrl = baseUrl + "products/alfa-api/documentation/articles/signature/articles/intro/intro";
    String cardsListUrl = baseUrl + "products/alfa-api/documentation/articles/cards/articles/list/v1/list";
    String operationsListUrl = baseUrl + "products/alfa-api/documentation/articles/operations-history/articles/operations-list/v1/operations-list";
    String balanceEngUrl = baseUrl + "products/alfa-api/documentation/articles/reports/articles/balance-eng/v1/balance-eng";
    String getRecordsUrl = baseUrl + "products/alfa-api/documentation/articles/reports-receiving/articles/reports/v1/reports";
    String createTransferUrl = baseUrl + "products/alfa-api/documentation/articles/transfers/articles/create/v1/create";
    String limitsGeneralUrl = baseUrl + "products/alfa-api/documentation/articles/limits/articles/general/v1/general";

    String loyaltyBonusUrl = baseUrl + "products/alfa-api/documentation/articles/loyalty/articles/bonus/v1/bonus";
    String phonePaymentUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2c/articles/intro/intro";
    String creditsUrl = baseUrl + "products/alfa-api/documentation/articles/credits/articles/credits/v1/credits";
    String postReportPaymentsSbpUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-reports/articles/report-payments-sbp/v1/report-payments-sbp";
    String generateQrcUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-c2b/articles/generate-qrc/v1/generate-qrc";
    String sbpB2bIntroUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/intro/intro";
    String outPaymentStatusUrl = baseUrl + "products/alfa-api/documentation/articles/sbp-b2b/articles/outgoing-payment-status/v1/outgoing-payment-status";


    String[] redirectFirstProductCardUrls = {
            specificationIntroUrl,
            connectionInstructionUrl,
            alfaIDIntroUrl,
            sandboxIntroUrl,
            sdkIntroUrl,
            fileTransferIntroUrl,
            signatureEncryptionIntroUrl,
            webhooksIntroUrl,
            transactionsStatementUrl,
            accountsListUrl,
            escrowBuildProjectsUrl,
            customerInfoUrl,
            paymentsCreateUrl,
            employedIntroUrl,
            sbpMerchantsLegalUrl,
            scoringFirstUrl,
            signatureIntroUrl,
            cardsListUrl,
            operationsListUrl,
            balanceEngUrl,
            getRecordsUrl,
            createTransferUrl,
            limitsGeneralUrl,
            loyaltyBonusUrl,
            phonePaymentUrl,
            creditsUrl,
            postReportPaymentsSbpUrl,
            generateQrcUrl,
            sbpB2bIntroUrl
    };

    String[] docPointsUrls = {
    specificationIntroUrl,
    checkListUrl,
    scopesUrl,
    channelProtectionUrl,
    paginationUrl,
    termsUrl,
    certIntro,
    androidUrl,
    iosUrl,
    windowsUrl,
    macosUrl,
    linuxUrl,
    connectionInstructionUrl,
    onboardingUrl,
    revokeUrl,
    clientIdUrl,
    tlsUrl,
    clientSecretUrl,
    authenticationUrl,
    buttonUrl,
    authCodeFlIntroUrl,
    getAuthCodeUrl,
    getAccessTokenUrl,
    getProfileInfoUrl,
    tokenUpdateUrl,
    h2hFlowintroUrl,
    getAuthCodeH2HUrl,
    getAccessTokenH2HUrl,
    tokenUpdateH2HUrl,
    acfHoldingIntroUrl,
    getAuthCodeHoldingUrl,
    getAccessTokenHoldingUrl,
    tokenUpdateHoldingUrl,
    cliCreFloIntroUrl,
    cliCreFloGetTokenUrl,
    signatureCheckingUrl,
    revokeTokenUrl,
    clientConsentsUrl,
    screeningUrl,
    checkWebIntroUrl,
    checkWebTransactionsUrl,
    managingCertificatesUrl,
    jwsUrl,
    xmlDsigUrl,
    sdkConnectionUrl,
    sdkInitUrl,
    sdkTransactUrl,
    fileDownloadUrl,
    fileUploadUrl,
    postCertUrl,
    getCertUrl,
    patchCertUrl,
    jsonRsaUrl,
    jsonGostUrl,
    xmlRSAUrl,
    encJsonRSAUrl,
    encJsonGostUrl,
    encXmlRSAUrl,
    createWebhUrl,
    editWebhUrl,
    deleteWebhUrl,
    getWebhUrl,
    getListWebhUrl,
    partnerWebhUrl,
    statement1cUrl,
    statementMT940Url,
    getTurnoverUrl,
    corespondentUrl,
    instrGetFileUrl,
    statementFileUrl,
    getStatFileUrl,
    getDetailsUrl,
    requisitesUrl,
    postOrdersUrl,
    getOrdersUrl,
    getListOrdersUrl,
    patchOrdersUrl,
    deleteOrdersUrl,
    cancelEscUrl,
    postFullOrdUrl,
    payStatusUrl,
    payDetailsUrl,
    payPrintUrl,
    payPDFUrl,
    agreemPageUrl,
    selfEmplUrl,
    listStateUrl,
    vatinPurUrl,
    ftsStatusUrl,
    taxStatusUrl,
    accDebtsUrl,
    accDebtFtsUrl,
    payDocUrl,
    payDocFtsUrl,
    reicAndPayUrl,
    reicListUrl,
    payListWithCheckUrl,
    payoutListUrl,
    payListStateUrl,
    getPayListUrl,
    vatinPayUrl,
    selfListUrl,
    selfVatinUrl,
    incomeForPerUrl,
    inForPerReqUrl,
    selfIncomeUrl,
    incReqUrl,
    taxAccInfoUrl,
    taxAccInfReqUrl,
    cancRecListUrl,
    cancResListStUrl,
    selfActUrl,
    regionsUrl,
    sbpBankUrl,
    mercUrl,
    termUrl,
    scorTempUrl,
    getDNUrl,
    dnFileUrl,
    issueRSAUrl,
    sendReqUrl,
    sigWithSMSUrl,
    getReqUrl,
    getRSAUrl,
    ActRSAUrl,
    chaSigMetUrl,
    actListUrl,
    tariffUrl,
    sbuscrUrl,
    actionUrl,
    confActUrl,
    opDetailsUrl,
    accRepUrl,
    credStUrl,
    balRusUrl,
    creCloseUrl,
    credUrl,
    depoUrl,
    repFileUrl,
    storeCardUrl,
    getCardUrl,
    feeCalcUrl,
    executeUrl,
    getOpUrl,
    clientUrl,
    createClUrl,
    delClUrl,
    loyTransUrl,
    loyCashUrl,
    phonePayUrl,
    getPhonePayUrl,
    phonePayByPacUrl,
    checkPayUrl,
    checkPayStUrl,
    clInfoUrl,
    banksUrl,
    genSubUrl,
    qrcStUrl,
    petitionUrl,
    cashQRCUrl,
    qrcActUrl,
    qrcDeactUrl,
    refundUrl,
    refStUrl,
    oneTimeUrl,
    reusUrl,
    payUrlsUrl,
    payDataUrl,
    incPayUrl,
    regOutPayUrl,
    exOutPayUrl,
    outPayUrl,
    outPayStUrl,
    };

    /**
     * Элементры открытых страниц документации
     * */
    By headerLocator = By.xpath("(//h4[@class='typography__component_1ve0s content-header__title typography__styrene-medium_rdy6f typography__medium_1ve0s typography__primary_1dy99'])");
    By contentNavigationRight = By.xpath("//*[@class='content-navigation-link content-navigation-link_right']");
    By footer = By.xpath("//footer[@class='footer']");
    By level0PointsListLocator = By.xpath("//div[@class='navigation-left__item-block navigation-left__item-block_level_0']");
    By level1PointsListLocator = By.xpath("//div[@class='navigation-left__item-block navigation-left__item-block_level_1']");
    By fileUrl = By.xpath("//a[contains(@href, '/s3/')]");
    By commonPointsLocator = By.xpath("//span[@class='navigation-left__text typography__primary-small_1fmfd typography__regular_1fmfd']");
    By level2PointLocator = By.xpath("//div[@class='navigation-left__item-block navigation-left__item-block_level_2']");
    By fileLink = By.xpath("//a[contains(@href, '/s3/')]");
}