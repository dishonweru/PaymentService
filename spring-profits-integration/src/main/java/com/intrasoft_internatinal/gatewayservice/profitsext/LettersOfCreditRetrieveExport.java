
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LettersOfCreditRetrieveExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LettersOfCreditRetrieveExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAdvisingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAdvisingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAccKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrBlockedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgrLimitInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSigningDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBeneficiaryCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBeneficiaryCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutBeneficiaryProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutBeneficiaryProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutBeneficiaryProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutChargingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutChargingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkActualMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkLanguage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutClientProfitsExitStateWorkMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutClientProfitsExitStateWorkRoutineSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkTerminationAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutClientProfitsExitStateWorkValruleSnum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCommLangGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCommLangGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutConfirmingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutConfirmingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespondentProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCorrespondentProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCorrespondentProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDocumentTemplateCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDocumentTemplateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDocumentTemplatePrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGenericCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGenericCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpTfDestinationLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpTfShipmentLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutInvoiceTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutInvoiceTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIssuingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIssuingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLcAccountAssignOfProceed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountCommChrgFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLcAccountCommChrgFrqt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountConfirmFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLcAccountExpiryPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountIncomingLcRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountInvoicePerc" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLcAccountIrrevocableFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLcAccountLcAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLcAccountLcAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountLcAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountLcAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLcAccountLcFirstIssueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLcAccountLcTotalIssueAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLcAccountLcType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLcAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLcAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLcAccountLnsUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLcAccountOpeningDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLcAccountPartialShipmntFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountRedClause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountReprAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountReprAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountReprCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountReprName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountReprRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountReprResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountReprTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountReprZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountRevolvingInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountSettlementMode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLcAccountTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLcAccountTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLcAccountTransferLcAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountTranshipmntFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLcAccountTransmission" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutMonitoringUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMonitoringUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMovingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNegotiatingSwiftAllnceBicsBankDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutNegotiatingSwiftAllnceBicsBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOpeningUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOpeningUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOurCustomerIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrincipalCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrincipalCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrincipalProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrincipalProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrincipalProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutPrintoutValidationInputVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTfTypeIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceBenefAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceBenefAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceBenefAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceBenefCommAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceBeneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceCorrBankAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceCorrBankAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceCorreAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceCorrespondentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinancePrincAccPrftSys" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinancePrincipalAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinancePrincipalAccNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinancePrincipalCommAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinancePrinicipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceRefNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceTfAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTradeFinanceTfCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTradeFinanceTfConfirmDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTradeFinanceTfNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceTfOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTradeFinanceTfType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTradeFinanceTmpstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTrxCountAdvCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTrxCountTrxCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpTfDestination" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpTfDestination" minOccurs="0"/>
 *         &lt;element name="OutGrpTfShipment" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpTfShipment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LettersOfCreditRetrieveExport", propOrder = {
    "outAdvisingSwiftAllnceBicsBankDescr",
    "outAdvisingSwiftAllnceBicsBic",
    "outAgrCurrencyIdCurrency",
    "outAgrCurrencyShortDescr",
    "outAgreementAccKind",
    "outAgreementAgrBlockedLimit",
    "outAgreementAgrLimit",
    "outAgreementAgrLimitInd",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSigningDt",
    "outAgreementAgrSn",
    "outAgreementAgrStatus",
    "outAgreementAgrUtilisedLimit",
    "outAgreementAgrYear",
    "outAgrProfitsAccountAccountCd",
    "outAgrProfitsAccountAccountNumber",
    "outAgrUnitCode",
    "outBeneficiaryCustomerCDigit",
    "outBeneficiaryCustomerCustId",
    "outBeneficiaryProfitsAccountAccountCd",
    "outBeneficiaryProfitsAccountAccountNumber",
    "outBeneficiaryProfitsAccountPrftSystem",
    "outChargingCurrencyIdCurrency",
    "outChargingCurrencyShortDescr",
    "outClientProfitsExitStateWorkActualMessage",
    "outClientProfitsExitStateWorkId",
    "outClientProfitsExitStateWorkLanguage",
    "outClientProfitsExitStateWorkMessageType",
    "outClientProfitsExitStateWorkPrftSystem",
    "outClientProfitsExitStateWorkRoutineSn",
    "outClientProfitsExitStateWorkTerminationAction",
    "outClientProfitsExitStateWorkValruleId",
    "outClientProfitsExitStateWorkValruleSnum",
    "outCommandIefSuppliedCommand",
    "outCommLangGenericDetailDescription",
    "outCommLangGenericDetailSerialNum",
    "outConfirmingSwiftAllnceBicsBankDescr",
    "outConfirmingSwiftAllnceBicsBic",
    "outCorrespondentProfitsAccountAccountCd",
    "outCorrespondentProfitsAccountAccountNumber",
    "outCorrespondentProfitsAccountPrftSystem",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCustAddressAddress1",
    "outCustAddressAddressType",
    "outDocumentTemplateCode",
    "outDocumentTemplateDescription",
    "outDocumentTemplatePrftSystem",
    "outGenericCurrencyIdCurrency",
    "outGenericCurrencyShortDescr",
    "outGrpTfDestinationLength",
    "outGrpTfShipmentLength",
    "outInvoiceTypeGenericDetailDescription",
    "outInvoiceTypeGenericDetailSerialNum",
    "outIssuingSwiftAllnceBicsBankDescr",
    "outIssuingSwiftAllnceBicsBic",
    "outJustificDescription",
    "outJustificIdJustific",
    "outLcAccountAssignOfProceed",
    "outLcAccountCommChrgFrq",
    "outLcAccountCommChrgFrqt",
    "outLcAccountComments",
    "outLcAccountConfirmFlg",
    "outLcAccountExpiryDate",
    "outLcAccountExpiryPlace",
    "outLcAccountIncomingLcRefNo",
    "outLcAccountInvoicePerc",
    "outLcAccountIrrevocableFlag",
    "outLcAccountIssueDate",
    "outLcAccountLcAccCd",
    "outLcAccountLcAccountNumber",
    "outLcAccountLcAccStatus",
    "outLcAccountLcAmount",
    "outLcAccountLcFirstIssueAmn",
    "outLcAccountLcTotalIssueAmn",
    "outLcAccountLcType",
    "outLcAccountLnsSn",
    "outLcAccountLnsType",
    "outLcAccountLnsUnit",
    "outLcAccountOpeningDate",
    "outLcAccountPartialShipmntFlag",
    "outLcAccountRedClause",
    "outLcAccountReprAddress1",
    "outLcAccountReprAddress2",
    "outLcAccountReprCountry",
    "outLcAccountReprName",
    "outLcAccountReprRegion",
    "outLcAccountReprResident",
    "outLcAccountReprTel",
    "outLcAccountReprZipCode",
    "outLcAccountRevolvingInd",
    "outLcAccountSettlementMode",
    "outLcAccountTmstamp",
    "outLcAccountTolerance",
    "outLcAccountTransferLcAcc",
    "outLcAccountTranshipmntFlag",
    "outLcAccountTransmission",
    "outMonitoringUnitCode",
    "outMonitoringUnitUnitName",
    "outMovingCurrencyIdCurrency",
    "outMovingCurrencyShortDescr",
    "outNegotiatingSwiftAllnceBicsBankDescr",
    "outNegotiatingSwiftAllnceBicsBic",
    "outOpeningUnitCode",
    "outOpeningUnitUnitName",
    "outOurCustomerIefSuppliedFlag",
    "outPrftTransactionIdTransact",
    "outPrincipalCustomerCDigit",
    "outPrincipalCustomerCustId",
    "outPrincipalProfitsAccountAccountCd",
    "outPrincipalProfitsAccountAccountNumber",
    "outPrincipalProfitsAccountPrftSystem",
    "outPrintoutValidationInputVoucherLine",
    "outProductDescription",
    "outProductIdProduct",
    "outTfTypeIefSuppliedFlag",
    "outTradeFinanceBenefAccCd",
    "outTradeFinanceBenefAccNum",
    "outTradeFinanceBenefAccPrftSys",
    "outTradeFinanceBenefCommAddr",
    "outTradeFinanceBeneficiaryName",
    "outTradeFinanceComments",
    "outTradeFinanceCorrBankAccCd",
    "outTradeFinanceCorrBankAccNum",
    "outTradeFinanceCorreAccPrftSys",
    "outTradeFinanceCorrespondentName",
    "outTradeFinancePrincAccPrftSys",
    "outTradeFinancePrincipalAccCd",
    "outTradeFinancePrincipalAccNum",
    "outTradeFinancePrincipalCommAddr",
    "outTradeFinancePrinicipalName",
    "outTradeFinanceRefNo",
    "outTradeFinanceStatus",
    "outTradeFinanceTfAmount",
    "outTradeFinanceTfCd",
    "outTradeFinanceTfConfirmDate",
    "outTradeFinanceTfNumber",
    "outTradeFinanceTfOpenDate",
    "outTradeFinanceTfType",
    "outTradeFinanceTmpstamp",
    "outTrxCountAdvCounter",
    "outTrxCountTrxCounter",
    "outGrpTfDestination",
    "outGrpTfShipment"
})
public class LettersOfCreditRetrieveExport
    extends BaseExport
{

    @XmlElement(name = "OutAdvisingSwiftAllnceBicsBankDescr")
    protected String outAdvisingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "OutAdvisingSwiftAllnceBicsBic")
    protected String outAdvisingSwiftAllnceBicsBic;
    @XmlElement(name = "OutAgrCurrencyIdCurrency")
    protected int outAgrCurrencyIdCurrency;
    @XmlElement(name = "OutAgrCurrencyShortDescr")
    protected String outAgrCurrencyShortDescr;
    @XmlElement(name = "OutAgreementAccKind")
    protected String outAgreementAccKind;
    @XmlElement(name = "OutAgreementAgrBlockedLimit", required = true)
    protected BigDecimal outAgreementAgrBlockedLimit;
    @XmlElement(name = "OutAgreementAgrLimit", required = true)
    protected BigDecimal outAgreementAgrLimit;
    @XmlElement(name = "OutAgreementAgrLimitInd")
    protected String outAgreementAgrLimitInd;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSigningDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outAgreementAgrSigningDt;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrStatus")
    protected String outAgreementAgrStatus;
    @XmlElement(name = "OutAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal outAgreementAgrUtilisedLimit;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAgrProfitsAccountAccountCd")
    protected short outAgrProfitsAccountAccountCd;
    @XmlElement(name = "OutAgrProfitsAccountAccountNumber")
    protected String outAgrProfitsAccountAccountNumber;
    @XmlElement(name = "OutAgrUnitCode")
    protected int outAgrUnitCode;
    @XmlElement(name = "OutBeneficiaryCustomerCDigit")
    protected short outBeneficiaryCustomerCDigit;
    @XmlElement(name = "OutBeneficiaryCustomerCustId")
    protected int outBeneficiaryCustomerCustId;
    @XmlElement(name = "OutBeneficiaryProfitsAccountAccountCd")
    protected short outBeneficiaryProfitsAccountAccountCd;
    @XmlElement(name = "OutBeneficiaryProfitsAccountAccountNumber")
    protected String outBeneficiaryProfitsAccountAccountNumber;
    @XmlElement(name = "OutBeneficiaryProfitsAccountPrftSystem")
    protected short outBeneficiaryProfitsAccountPrftSystem;
    @XmlElement(name = "OutChargingCurrencyIdCurrency")
    protected int outChargingCurrencyIdCurrency;
    @XmlElement(name = "OutChargingCurrencyShortDescr")
    protected String outChargingCurrencyShortDescr;
    @XmlElement(name = "OutClientProfitsExitStateWorkActualMessage")
    protected String outClientProfitsExitStateWorkActualMessage;
    @XmlElement(name = "OutClientProfitsExitStateWorkId")
    protected double outClientProfitsExitStateWorkId;
    @XmlElement(name = "OutClientProfitsExitStateWorkLanguage")
    protected int outClientProfitsExitStateWorkLanguage;
    @XmlElement(name = "OutClientProfitsExitStateWorkMessageType")
    protected String outClientProfitsExitStateWorkMessageType;
    @XmlElement(name = "OutClientProfitsExitStateWorkPrftSystem")
    protected short outClientProfitsExitStateWorkPrftSystem;
    @XmlElement(name = "OutClientProfitsExitStateWorkRoutineSn")
    protected double outClientProfitsExitStateWorkRoutineSn;
    @XmlElement(name = "OutClientProfitsExitStateWorkTerminationAction")
    protected String outClientProfitsExitStateWorkTerminationAction;
    @XmlElement(name = "OutClientProfitsExitStateWorkValruleId")
    protected double outClientProfitsExitStateWorkValruleId;
    @XmlElement(name = "OutClientProfitsExitStateWorkValruleSnum")
    protected int outClientProfitsExitStateWorkValruleSnum;
    @XmlElement(name = "OutCommandIefSuppliedCommand")
    protected String outCommandIefSuppliedCommand;
    @XmlElement(name = "OutCommLangGenericDetailDescription")
    protected String outCommLangGenericDetailDescription;
    @XmlElement(name = "OutCommLangGenericDetailSerialNum")
    protected int outCommLangGenericDetailSerialNum;
    @XmlElement(name = "OutConfirmingSwiftAllnceBicsBankDescr")
    protected String outConfirmingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "OutConfirmingSwiftAllnceBicsBic")
    protected String outConfirmingSwiftAllnceBicsBic;
    @XmlElement(name = "OutCorrespondentProfitsAccountAccountCd")
    protected short outCorrespondentProfitsAccountAccountCd;
    @XmlElement(name = "OutCorrespondentProfitsAccountAccountNumber")
    protected String outCorrespondentProfitsAccountAccountNumber;
    @XmlElement(name = "OutCorrespondentProfitsAccountPrftSystem")
    protected short outCorrespondentProfitsAccountPrftSystem;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCustAddressAddress1")
    protected String outCustAddressAddress1;
    @XmlElement(name = "OutCustAddressAddressType")
    protected String outCustAddressAddressType;
    @XmlElement(name = "OutDocumentTemplateCode")
    protected int outDocumentTemplateCode;
    @XmlElement(name = "OutDocumentTemplateDescription")
    protected String outDocumentTemplateDescription;
    @XmlElement(name = "OutDocumentTemplatePrftSystem")
    protected short outDocumentTemplatePrftSystem;
    @XmlElement(name = "OutGenericCurrencyIdCurrency")
    protected int outGenericCurrencyIdCurrency;
    @XmlElement(name = "OutGenericCurrencyShortDescr")
    protected String outGenericCurrencyShortDescr;
    @XmlElement(name = "OutGrpTfDestinationLength")
    protected int outGrpTfDestinationLength;
    @XmlElement(name = "OutGrpTfShipmentLength")
    protected int outGrpTfShipmentLength;
    @XmlElement(name = "OutInvoiceTypeGenericDetailDescription")
    protected String outInvoiceTypeGenericDetailDescription;
    @XmlElement(name = "OutInvoiceTypeGenericDetailSerialNum")
    protected int outInvoiceTypeGenericDetailSerialNum;
    @XmlElement(name = "OutIssuingSwiftAllnceBicsBankDescr")
    protected String outIssuingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "OutIssuingSwiftAllnceBicsBic")
    protected String outIssuingSwiftAllnceBicsBic;
    @XmlElement(name = "OutJustificDescription")
    protected String outJustificDescription;
    @XmlElement(name = "OutJustificIdJustific")
    protected int outJustificIdJustific;
    @XmlElement(name = "OutLcAccountAssignOfProceed")
    protected String outLcAccountAssignOfProceed;
    @XmlElement(name = "OutLcAccountCommChrgFrq")
    protected short outLcAccountCommChrgFrq;
    @XmlElement(name = "OutLcAccountCommChrgFrqt")
    protected String outLcAccountCommChrgFrqt;
    @XmlElement(name = "OutLcAccountComments")
    protected String outLcAccountComments;
    @XmlElement(name = "OutLcAccountConfirmFlg")
    protected String outLcAccountConfirmFlg;
    @XmlElement(name = "OutLcAccountExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLcAccountExpiryDate;
    @XmlElement(name = "OutLcAccountExpiryPlace")
    protected String outLcAccountExpiryPlace;
    @XmlElement(name = "OutLcAccountIncomingLcRefNo")
    protected String outLcAccountIncomingLcRefNo;
    @XmlElement(name = "OutLcAccountInvoicePerc", required = true)
    protected BigDecimal outLcAccountInvoicePerc;
    @XmlElement(name = "OutLcAccountIrrevocableFlag")
    protected String outLcAccountIrrevocableFlag;
    @XmlElement(name = "OutLcAccountIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLcAccountIssueDate;
    @XmlElement(name = "OutLcAccountLcAccCd")
    protected short outLcAccountLcAccCd;
    @XmlElement(name = "OutLcAccountLcAccountNumber")
    protected String outLcAccountLcAccountNumber;
    @XmlElement(name = "OutLcAccountLcAccStatus")
    protected String outLcAccountLcAccStatus;
    @XmlElement(name = "OutLcAccountLcAmount", required = true)
    protected BigDecimal outLcAccountLcAmount;
    @XmlElement(name = "OutLcAccountLcFirstIssueAmn", required = true)
    protected BigDecimal outLcAccountLcFirstIssueAmn;
    @XmlElement(name = "OutLcAccountLcTotalIssueAmn", required = true)
    protected BigDecimal outLcAccountLcTotalIssueAmn;
    @XmlElement(name = "OutLcAccountLcType")
    protected short outLcAccountLcType;
    @XmlElement(name = "OutLcAccountLnsSn")
    protected int outLcAccountLnsSn;
    @XmlElement(name = "OutLcAccountLnsType")
    protected short outLcAccountLnsType;
    @XmlElement(name = "OutLcAccountLnsUnit")
    protected int outLcAccountLnsUnit;
    @XmlElement(name = "OutLcAccountOpeningDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLcAccountOpeningDate;
    @XmlElement(name = "OutLcAccountPartialShipmntFlag")
    protected String outLcAccountPartialShipmntFlag;
    @XmlElement(name = "OutLcAccountRedClause")
    protected String outLcAccountRedClause;
    @XmlElement(name = "OutLcAccountReprAddress1")
    protected String outLcAccountReprAddress1;
    @XmlElement(name = "OutLcAccountReprAddress2")
    protected String outLcAccountReprAddress2;
    @XmlElement(name = "OutLcAccountReprCountry")
    protected String outLcAccountReprCountry;
    @XmlElement(name = "OutLcAccountReprName")
    protected String outLcAccountReprName;
    @XmlElement(name = "OutLcAccountReprRegion")
    protected String outLcAccountReprRegion;
    @XmlElement(name = "OutLcAccountReprResident")
    protected String outLcAccountReprResident;
    @XmlElement(name = "OutLcAccountReprTel")
    protected String outLcAccountReprTel;
    @XmlElement(name = "OutLcAccountReprZipCode")
    protected String outLcAccountReprZipCode;
    @XmlElement(name = "OutLcAccountRevolvingInd")
    protected String outLcAccountRevolvingInd;
    @XmlElement(name = "OutLcAccountSettlementMode")
    protected short outLcAccountSettlementMode;
    @XmlElement(name = "OutLcAccountTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLcAccountTmstamp;
    @XmlElement(name = "OutLcAccountTolerance", required = true)
    protected BigDecimal outLcAccountTolerance;
    @XmlElement(name = "OutLcAccountTransferLcAcc")
    protected String outLcAccountTransferLcAcc;
    @XmlElement(name = "OutLcAccountTranshipmntFlag")
    protected String outLcAccountTranshipmntFlag;
    @XmlElement(name = "OutLcAccountTransmission")
    protected short outLcAccountTransmission;
    @XmlElement(name = "OutMonitoringUnitCode")
    protected int outMonitoringUnitCode;
    @XmlElement(name = "OutMonitoringUnitUnitName")
    protected String outMonitoringUnitUnitName;
    @XmlElement(name = "OutMovingCurrencyIdCurrency")
    protected int outMovingCurrencyIdCurrency;
    @XmlElement(name = "OutMovingCurrencyShortDescr")
    protected String outMovingCurrencyShortDescr;
    @XmlElement(name = "OutNegotiatingSwiftAllnceBicsBankDescr")
    protected String outNegotiatingSwiftAllnceBicsBankDescr;
    @XmlElement(name = "OutNegotiatingSwiftAllnceBicsBic")
    protected String outNegotiatingSwiftAllnceBicsBic;
    @XmlElement(name = "OutOpeningUnitCode")
    protected int outOpeningUnitCode;
    @XmlElement(name = "OutOpeningUnitUnitName")
    protected String outOpeningUnitUnitName;
    @XmlElement(name = "OutOurCustomerIefSuppliedFlag")
    protected String outOurCustomerIefSuppliedFlag;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutPrincipalCustomerCDigit")
    protected short outPrincipalCustomerCDigit;
    @XmlElement(name = "OutPrincipalCustomerCustId")
    protected int outPrincipalCustomerCustId;
    @XmlElement(name = "OutPrincipalProfitsAccountAccountCd")
    protected short outPrincipalProfitsAccountAccountCd;
    @XmlElement(name = "OutPrincipalProfitsAccountAccountNumber")
    protected String outPrincipalProfitsAccountAccountNumber;
    @XmlElement(name = "OutPrincipalProfitsAccountPrftSystem")
    protected short outPrincipalProfitsAccountPrftSystem;
    @XmlElement(name = "OutPrintoutValidationInputVoucherLine")
    protected String outPrintoutValidationInputVoucherLine;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutTfTypeIefSuppliedFlag")
    protected String outTfTypeIefSuppliedFlag;
    @XmlElement(name = "OutTradeFinanceBenefAccCd")
    protected short outTradeFinanceBenefAccCd;
    @XmlElement(name = "OutTradeFinanceBenefAccNum")
    protected String outTradeFinanceBenefAccNum;
    @XmlElement(name = "OutTradeFinanceBenefAccPrftSys")
    protected short outTradeFinanceBenefAccPrftSys;
    @XmlElement(name = "OutTradeFinanceBenefCommAddr")
    protected String outTradeFinanceBenefCommAddr;
    @XmlElement(name = "OutTradeFinanceBeneficiaryName")
    protected String outTradeFinanceBeneficiaryName;
    @XmlElement(name = "OutTradeFinanceComments")
    protected String outTradeFinanceComments;
    @XmlElement(name = "OutTradeFinanceCorrBankAccCd")
    protected short outTradeFinanceCorrBankAccCd;
    @XmlElement(name = "OutTradeFinanceCorrBankAccNum")
    protected String outTradeFinanceCorrBankAccNum;
    @XmlElement(name = "OutTradeFinanceCorreAccPrftSys")
    protected short outTradeFinanceCorreAccPrftSys;
    @XmlElement(name = "OutTradeFinanceCorrespondentName")
    protected String outTradeFinanceCorrespondentName;
    @XmlElement(name = "OutTradeFinancePrincAccPrftSys")
    protected short outTradeFinancePrincAccPrftSys;
    @XmlElement(name = "OutTradeFinancePrincipalAccCd")
    protected short outTradeFinancePrincipalAccCd;
    @XmlElement(name = "OutTradeFinancePrincipalAccNum")
    protected String outTradeFinancePrincipalAccNum;
    @XmlElement(name = "OutTradeFinancePrincipalCommAddr")
    protected String outTradeFinancePrincipalCommAddr;
    @XmlElement(name = "OutTradeFinancePrinicipalName")
    protected String outTradeFinancePrinicipalName;
    @XmlElement(name = "OutTradeFinanceRefNo")
    protected String outTradeFinanceRefNo;
    @XmlElement(name = "OutTradeFinanceStatus")
    protected String outTradeFinanceStatus;
    @XmlElement(name = "OutTradeFinanceTfAmount", required = true)
    protected BigDecimal outTradeFinanceTfAmount;
    @XmlElement(name = "OutTradeFinanceTfCd")
    protected short outTradeFinanceTfCd;
    @XmlElement(name = "OutTradeFinanceTfConfirmDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTradeFinanceTfConfirmDate;
    @XmlElement(name = "OutTradeFinanceTfNumber")
    protected String outTradeFinanceTfNumber;
    @XmlElement(name = "OutTradeFinanceTfOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTradeFinanceTfOpenDate;
    @XmlElement(name = "OutTradeFinanceTfType")
    protected String outTradeFinanceTfType;
    @XmlElement(name = "OutTradeFinanceTmpstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTradeFinanceTmpstamp;
    @XmlElement(name = "OutTrxCountAdvCounter")
    protected int outTrxCountAdvCounter;
    @XmlElement(name = "OutTrxCountTrxCounter")
    protected int outTrxCountTrxCounter;
    @XmlElement(name = "OutGrpTfDestination")
    protected ArrayOfOutGrpTfDestination outGrpTfDestination;
    @XmlElement(name = "OutGrpTfShipment")
    protected ArrayOfOutGrpTfShipment outGrpTfShipment;

    /**
     * Gets the value of the outAdvisingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdvisingSwiftAllnceBicsBankDescr() {
        return outAdvisingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the outAdvisingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdvisingSwiftAllnceBicsBankDescr(String value) {
        this.outAdvisingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the outAdvisingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAdvisingSwiftAllnceBicsBic() {
        return outAdvisingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the outAdvisingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAdvisingSwiftAllnceBicsBic(String value) {
        this.outAdvisingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the outAgrCurrencyIdCurrency property.
     * 
     */
    public int getOutAgrCurrencyIdCurrency() {
        return outAgrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outAgrCurrencyIdCurrency property.
     * 
     */
    public void setOutAgrCurrencyIdCurrency(int value) {
        this.outAgrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outAgrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrCurrencyShortDescr() {
        return outAgrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outAgrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrCurrencyShortDescr(String value) {
        this.outAgrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outAgreementAccKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAccKind() {
        return outAgreementAccKind;
    }

    /**
     * Sets the value of the outAgreementAccKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAccKind(String value) {
        this.outAgreementAccKind = value;
    }

    /**
     * Gets the value of the outAgreementAgrBlockedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgrBlockedLimit() {
        return outAgreementAgrBlockedLimit;
    }

    /**
     * Sets the value of the outAgreementAgrBlockedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgrBlockedLimit(BigDecimal value) {
        this.outAgreementAgrBlockedLimit = value;
    }

    /**
     * Gets the value of the outAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgrLimit() {
        return outAgreementAgrLimit;
    }

    /**
     * Sets the value of the outAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgrLimit(BigDecimal value) {
        this.outAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the outAgreementAgrLimitInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrLimitInd() {
        return outAgreementAgrLimitInd;
    }

    /**
     * Sets the value of the outAgreementAgrLimitInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrLimitInd(String value) {
        this.outAgreementAgrLimitInd = value;
    }

    /**
     * Gets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public int getOutAgreementAgrMembershipSn() {
        return outAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the outAgreementAgrMembershipSn property.
     * 
     */
    public void setOutAgreementAgrMembershipSn(int value) {
        this.outAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrSigningDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutAgreementAgrSigningDt() {
        return outAgreementAgrSigningDt;
    }

    /**
     * Sets the value of the outAgreementAgrSigningDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutAgreementAgrSigningDt(XMLGregorianCalendar value) {
        this.outAgreementAgrSigningDt = value;
    }

    /**
     * Gets the value of the outAgreementAgrSn property.
     * 
     */
    public int getOutAgreementAgrSn() {
        return outAgreementAgrSn;
    }

    /**
     * Sets the value of the outAgreementAgrSn property.
     * 
     */
    public void setOutAgreementAgrSn(int value) {
        this.outAgreementAgrSn = value;
    }

    /**
     * Gets the value of the outAgreementAgrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgreementAgrStatus() {
        return outAgreementAgrStatus;
    }

    /**
     * Sets the value of the outAgreementAgrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgreementAgrStatus(String value) {
        this.outAgreementAgrStatus = value;
    }

    /**
     * Gets the value of the outAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutAgreementAgrUtilisedLimit() {
        return outAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the outAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutAgreementAgrUtilisedLimit(BigDecimal value) {
        this.outAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the outAgreementAgrYear property.
     * 
     */
    public short getOutAgreementAgrYear() {
        return outAgreementAgrYear;
    }

    /**
     * Sets the value of the outAgreementAgrYear property.
     * 
     */
    public void setOutAgreementAgrYear(short value) {
        this.outAgreementAgrYear = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountAccountCd property.
     * 
     */
    public short getOutAgrProfitsAccountAccountCd() {
        return outAgrProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outAgrProfitsAccountAccountCd property.
     * 
     */
    public void setOutAgrProfitsAccountAccountCd(short value) {
        this.outAgrProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrProfitsAccountAccountNumber() {
        return outAgrProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outAgrProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrProfitsAccountAccountNumber(String value) {
        this.outAgrProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outAgrUnitCode property.
     * 
     */
    public int getOutAgrUnitCode() {
        return outAgrUnitCode;
    }

    /**
     * Sets the value of the outAgrUnitCode property.
     * 
     */
    public void setOutAgrUnitCode(int value) {
        this.outAgrUnitCode = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustomerCDigit property.
     * 
     */
    public short getOutBeneficiaryCustomerCDigit() {
        return outBeneficiaryCustomerCDigit;
    }

    /**
     * Sets the value of the outBeneficiaryCustomerCDigit property.
     * 
     */
    public void setOutBeneficiaryCustomerCDigit(short value) {
        this.outBeneficiaryCustomerCDigit = value;
    }

    /**
     * Gets the value of the outBeneficiaryCustomerCustId property.
     * 
     */
    public int getOutBeneficiaryCustomerCustId() {
        return outBeneficiaryCustomerCustId;
    }

    /**
     * Sets the value of the outBeneficiaryCustomerCustId property.
     * 
     */
    public void setOutBeneficiaryCustomerCustId(int value) {
        this.outBeneficiaryCustomerCustId = value;
    }

    /**
     * Gets the value of the outBeneficiaryProfitsAccountAccountCd property.
     * 
     */
    public short getOutBeneficiaryProfitsAccountAccountCd() {
        return outBeneficiaryProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outBeneficiaryProfitsAccountAccountCd property.
     * 
     */
    public void setOutBeneficiaryProfitsAccountAccountCd(short value) {
        this.outBeneficiaryProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outBeneficiaryProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutBeneficiaryProfitsAccountAccountNumber() {
        return outBeneficiaryProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outBeneficiaryProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutBeneficiaryProfitsAccountAccountNumber(String value) {
        this.outBeneficiaryProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outBeneficiaryProfitsAccountPrftSystem property.
     * 
     */
    public short getOutBeneficiaryProfitsAccountPrftSystem() {
        return outBeneficiaryProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outBeneficiaryProfitsAccountPrftSystem property.
     * 
     */
    public void setOutBeneficiaryProfitsAccountPrftSystem(short value) {
        this.outBeneficiaryProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outChargingCurrencyIdCurrency property.
     * 
     */
    public int getOutChargingCurrencyIdCurrency() {
        return outChargingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outChargingCurrencyIdCurrency property.
     * 
     */
    public void setOutChargingCurrencyIdCurrency(int value) {
        this.outChargingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outChargingCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutChargingCurrencyShortDescr() {
        return outChargingCurrencyShortDescr;
    }

    /**
     * Sets the value of the outChargingCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutChargingCurrencyShortDescr(String value) {
        this.outChargingCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkActualMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClientProfitsExitStateWorkActualMessage() {
        return outClientProfitsExitStateWorkActualMessage;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkActualMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClientProfitsExitStateWorkActualMessage(String value) {
        this.outClientProfitsExitStateWorkActualMessage = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkId property.
     * 
     */
    public double getOutClientProfitsExitStateWorkId() {
        return outClientProfitsExitStateWorkId;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkId property.
     * 
     */
    public void setOutClientProfitsExitStateWorkId(double value) {
        this.outClientProfitsExitStateWorkId = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkLanguage property.
     * 
     */
    public int getOutClientProfitsExitStateWorkLanguage() {
        return outClientProfitsExitStateWorkLanguage;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkLanguage property.
     * 
     */
    public void setOutClientProfitsExitStateWorkLanguage(int value) {
        this.outClientProfitsExitStateWorkLanguage = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkMessageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClientProfitsExitStateWorkMessageType() {
        return outClientProfitsExitStateWorkMessageType;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkMessageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClientProfitsExitStateWorkMessageType(String value) {
        this.outClientProfitsExitStateWorkMessageType = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public short getOutClientProfitsExitStateWorkPrftSystem() {
        return outClientProfitsExitStateWorkPrftSystem;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkPrftSystem property.
     * 
     */
    public void setOutClientProfitsExitStateWorkPrftSystem(short value) {
        this.outClientProfitsExitStateWorkPrftSystem = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public double getOutClientProfitsExitStateWorkRoutineSn() {
        return outClientProfitsExitStateWorkRoutineSn;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkRoutineSn property.
     * 
     */
    public void setOutClientProfitsExitStateWorkRoutineSn(double value) {
        this.outClientProfitsExitStateWorkRoutineSn = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkTerminationAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutClientProfitsExitStateWorkTerminationAction() {
        return outClientProfitsExitStateWorkTerminationAction;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkTerminationAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutClientProfitsExitStateWorkTerminationAction(String value) {
        this.outClientProfitsExitStateWorkTerminationAction = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkValruleId property.
     * 
     */
    public double getOutClientProfitsExitStateWorkValruleId() {
        return outClientProfitsExitStateWorkValruleId;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkValruleId property.
     * 
     */
    public void setOutClientProfitsExitStateWorkValruleId(double value) {
        this.outClientProfitsExitStateWorkValruleId = value;
    }

    /**
     * Gets the value of the outClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public int getOutClientProfitsExitStateWorkValruleSnum() {
        return outClientProfitsExitStateWorkValruleSnum;
    }

    /**
     * Sets the value of the outClientProfitsExitStateWorkValruleSnum property.
     * 
     */
    public void setOutClientProfitsExitStateWorkValruleSnum(int value) {
        this.outClientProfitsExitStateWorkValruleSnum = value;
    }

    /**
     * Gets the value of the outCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCommandIefSuppliedCommand() {
        return outCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the outCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCommandIefSuppliedCommand(String value) {
        this.outCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the outCommLangGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCommLangGenericDetailDescription() {
        return outCommLangGenericDetailDescription;
    }

    /**
     * Sets the value of the outCommLangGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCommLangGenericDetailDescription(String value) {
        this.outCommLangGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCommLangGenericDetailSerialNum property.
     * 
     */
    public int getOutCommLangGenericDetailSerialNum() {
        return outCommLangGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCommLangGenericDetailSerialNum property.
     * 
     */
    public void setOutCommLangGenericDetailSerialNum(int value) {
        this.outCommLangGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outConfirmingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutConfirmingSwiftAllnceBicsBankDescr() {
        return outConfirmingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the outConfirmingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutConfirmingSwiftAllnceBicsBankDescr(String value) {
        this.outConfirmingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the outConfirmingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutConfirmingSwiftAllnceBicsBic() {
        return outConfirmingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the outConfirmingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutConfirmingSwiftAllnceBicsBic(String value) {
        this.outConfirmingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the outCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public short getOutCorrespondentProfitsAccountAccountCd() {
        return outCorrespondentProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outCorrespondentProfitsAccountAccountCd property.
     * 
     */
    public void setOutCorrespondentProfitsAccountAccountCd(short value) {
        this.outCorrespondentProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outCorrespondentProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCorrespondentProfitsAccountAccountNumber() {
        return outCorrespondentProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outCorrespondentProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCorrespondentProfitsAccountAccountNumber(String value) {
        this.outCorrespondentProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outCorrespondentProfitsAccountPrftSystem property.
     * 
     */
    public short getOutCorrespondentProfitsAccountPrftSystem() {
        return outCorrespondentProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outCorrespondentProfitsAccountPrftSystem property.
     * 
     */
    public void setOutCorrespondentProfitsAccountPrftSystem(short value) {
        this.outCorrespondentProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outCurrencyIdCurrency property.
     * 
     */
    public int getOutCurrencyIdCurrency() {
        return outCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outCurrencyIdCurrency property.
     * 
     */
    public void setOutCurrencyIdCurrency(int value) {
        this.outCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCurrencyShortDescr() {
        return outCurrencyShortDescr;
    }

    /**
     * Sets the value of the outCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCurrencyShortDescr(String value) {
        this.outCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress1() {
        return outCustAddressAddress1;
    }

    /**
     * Sets the value of the outCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress1(String value) {
        this.outCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddressType() {
        return outCustAddressAddressType;
    }

    /**
     * Sets the value of the outCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddressType(String value) {
        this.outCustAddressAddressType = value;
    }

    /**
     * Gets the value of the outDocumentTemplateCode property.
     * 
     */
    public int getOutDocumentTemplateCode() {
        return outDocumentTemplateCode;
    }

    /**
     * Sets the value of the outDocumentTemplateCode property.
     * 
     */
    public void setOutDocumentTemplateCode(int value) {
        this.outDocumentTemplateCode = value;
    }

    /**
     * Gets the value of the outDocumentTemplateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDocumentTemplateDescription() {
        return outDocumentTemplateDescription;
    }

    /**
     * Sets the value of the outDocumentTemplateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDocumentTemplateDescription(String value) {
        this.outDocumentTemplateDescription = value;
    }

    /**
     * Gets the value of the outDocumentTemplatePrftSystem property.
     * 
     */
    public short getOutDocumentTemplatePrftSystem() {
        return outDocumentTemplatePrftSystem;
    }

    /**
     * Sets the value of the outDocumentTemplatePrftSystem property.
     * 
     */
    public void setOutDocumentTemplatePrftSystem(short value) {
        this.outDocumentTemplatePrftSystem = value;
    }

    /**
     * Gets the value of the outGenericCurrencyIdCurrency property.
     * 
     */
    public int getOutGenericCurrencyIdCurrency() {
        return outGenericCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGenericCurrencyIdCurrency property.
     * 
     */
    public void setOutGenericCurrencyIdCurrency(int value) {
        this.outGenericCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGenericCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGenericCurrencyShortDescr() {
        return outGenericCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGenericCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGenericCurrencyShortDescr(String value) {
        this.outGenericCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpTfDestinationLength property.
     * 
     */
    public int getOutGrpTfDestinationLength() {
        return outGrpTfDestinationLength;
    }

    /**
     * Sets the value of the outGrpTfDestinationLength property.
     * 
     */
    public void setOutGrpTfDestinationLength(int value) {
        this.outGrpTfDestinationLength = value;
    }

    /**
     * Gets the value of the outGrpTfShipmentLength property.
     * 
     */
    public int getOutGrpTfShipmentLength() {
        return outGrpTfShipmentLength;
    }

    /**
     * Sets the value of the outGrpTfShipmentLength property.
     * 
     */
    public void setOutGrpTfShipmentLength(int value) {
        this.outGrpTfShipmentLength = value;
    }

    /**
     * Gets the value of the outInvoiceTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutInvoiceTypeGenericDetailDescription() {
        return outInvoiceTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outInvoiceTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutInvoiceTypeGenericDetailDescription(String value) {
        this.outInvoiceTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outInvoiceTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutInvoiceTypeGenericDetailSerialNum() {
        return outInvoiceTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outInvoiceTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutInvoiceTypeGenericDetailSerialNum(int value) {
        this.outInvoiceTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outIssuingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuingSwiftAllnceBicsBankDescr() {
        return outIssuingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the outIssuingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuingSwiftAllnceBicsBankDescr(String value) {
        this.outIssuingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the outIssuingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIssuingSwiftAllnceBicsBic() {
        return outIssuingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the outIssuingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIssuingSwiftAllnceBicsBic(String value) {
        this.outIssuingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the outJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutJustificDescription() {
        return outJustificDescription;
    }

    /**
     * Sets the value of the outJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutJustificDescription(String value) {
        this.outJustificDescription = value;
    }

    /**
     * Gets the value of the outJustificIdJustific property.
     * 
     */
    public int getOutJustificIdJustific() {
        return outJustificIdJustific;
    }

    /**
     * Sets the value of the outJustificIdJustific property.
     * 
     */
    public void setOutJustificIdJustific(int value) {
        this.outJustificIdJustific = value;
    }

    /**
     * Gets the value of the outLcAccountAssignOfProceed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountAssignOfProceed() {
        return outLcAccountAssignOfProceed;
    }

    /**
     * Sets the value of the outLcAccountAssignOfProceed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountAssignOfProceed(String value) {
        this.outLcAccountAssignOfProceed = value;
    }

    /**
     * Gets the value of the outLcAccountCommChrgFrq property.
     * 
     */
    public short getOutLcAccountCommChrgFrq() {
        return outLcAccountCommChrgFrq;
    }

    /**
     * Sets the value of the outLcAccountCommChrgFrq property.
     * 
     */
    public void setOutLcAccountCommChrgFrq(short value) {
        this.outLcAccountCommChrgFrq = value;
    }

    /**
     * Gets the value of the outLcAccountCommChrgFrqt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountCommChrgFrqt() {
        return outLcAccountCommChrgFrqt;
    }

    /**
     * Sets the value of the outLcAccountCommChrgFrqt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountCommChrgFrqt(String value) {
        this.outLcAccountCommChrgFrqt = value;
    }

    /**
     * Gets the value of the outLcAccountComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountComments() {
        return outLcAccountComments;
    }

    /**
     * Sets the value of the outLcAccountComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountComments(String value) {
        this.outLcAccountComments = value;
    }

    /**
     * Gets the value of the outLcAccountConfirmFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountConfirmFlg() {
        return outLcAccountConfirmFlg;
    }

    /**
     * Sets the value of the outLcAccountConfirmFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountConfirmFlg(String value) {
        this.outLcAccountConfirmFlg = value;
    }

    /**
     * Gets the value of the outLcAccountExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLcAccountExpiryDate() {
        return outLcAccountExpiryDate;
    }

    /**
     * Sets the value of the outLcAccountExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLcAccountExpiryDate(XMLGregorianCalendar value) {
        this.outLcAccountExpiryDate = value;
    }

    /**
     * Gets the value of the outLcAccountExpiryPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountExpiryPlace() {
        return outLcAccountExpiryPlace;
    }

    /**
     * Sets the value of the outLcAccountExpiryPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountExpiryPlace(String value) {
        this.outLcAccountExpiryPlace = value;
    }

    /**
     * Gets the value of the outLcAccountIncomingLcRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountIncomingLcRefNo() {
        return outLcAccountIncomingLcRefNo;
    }

    /**
     * Sets the value of the outLcAccountIncomingLcRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountIncomingLcRefNo(String value) {
        this.outLcAccountIncomingLcRefNo = value;
    }

    /**
     * Gets the value of the outLcAccountInvoicePerc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLcAccountInvoicePerc() {
        return outLcAccountInvoicePerc;
    }

    /**
     * Sets the value of the outLcAccountInvoicePerc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLcAccountInvoicePerc(BigDecimal value) {
        this.outLcAccountInvoicePerc = value;
    }

    /**
     * Gets the value of the outLcAccountIrrevocableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountIrrevocableFlag() {
        return outLcAccountIrrevocableFlag;
    }

    /**
     * Sets the value of the outLcAccountIrrevocableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountIrrevocableFlag(String value) {
        this.outLcAccountIrrevocableFlag = value;
    }

    /**
     * Gets the value of the outLcAccountIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLcAccountIssueDate() {
        return outLcAccountIssueDate;
    }

    /**
     * Sets the value of the outLcAccountIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLcAccountIssueDate(XMLGregorianCalendar value) {
        this.outLcAccountIssueDate = value;
    }

    /**
     * Gets the value of the outLcAccountLcAccCd property.
     * 
     */
    public short getOutLcAccountLcAccCd() {
        return outLcAccountLcAccCd;
    }

    /**
     * Sets the value of the outLcAccountLcAccCd property.
     * 
     */
    public void setOutLcAccountLcAccCd(short value) {
        this.outLcAccountLcAccCd = value;
    }

    /**
     * Gets the value of the outLcAccountLcAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountLcAccountNumber() {
        return outLcAccountLcAccountNumber;
    }

    /**
     * Sets the value of the outLcAccountLcAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountLcAccountNumber(String value) {
        this.outLcAccountLcAccountNumber = value;
    }

    /**
     * Gets the value of the outLcAccountLcAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountLcAccStatus() {
        return outLcAccountLcAccStatus;
    }

    /**
     * Sets the value of the outLcAccountLcAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountLcAccStatus(String value) {
        this.outLcAccountLcAccStatus = value;
    }

    /**
     * Gets the value of the outLcAccountLcAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLcAccountLcAmount() {
        return outLcAccountLcAmount;
    }

    /**
     * Sets the value of the outLcAccountLcAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLcAccountLcAmount(BigDecimal value) {
        this.outLcAccountLcAmount = value;
    }

    /**
     * Gets the value of the outLcAccountLcFirstIssueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLcAccountLcFirstIssueAmn() {
        return outLcAccountLcFirstIssueAmn;
    }

    /**
     * Sets the value of the outLcAccountLcFirstIssueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLcAccountLcFirstIssueAmn(BigDecimal value) {
        this.outLcAccountLcFirstIssueAmn = value;
    }

    /**
     * Gets the value of the outLcAccountLcTotalIssueAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLcAccountLcTotalIssueAmn() {
        return outLcAccountLcTotalIssueAmn;
    }

    /**
     * Sets the value of the outLcAccountLcTotalIssueAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLcAccountLcTotalIssueAmn(BigDecimal value) {
        this.outLcAccountLcTotalIssueAmn = value;
    }

    /**
     * Gets the value of the outLcAccountLcType property.
     * 
     */
    public short getOutLcAccountLcType() {
        return outLcAccountLcType;
    }

    /**
     * Sets the value of the outLcAccountLcType property.
     * 
     */
    public void setOutLcAccountLcType(short value) {
        this.outLcAccountLcType = value;
    }

    /**
     * Gets the value of the outLcAccountLnsSn property.
     * 
     */
    public int getOutLcAccountLnsSn() {
        return outLcAccountLnsSn;
    }

    /**
     * Sets the value of the outLcAccountLnsSn property.
     * 
     */
    public void setOutLcAccountLnsSn(int value) {
        this.outLcAccountLnsSn = value;
    }

    /**
     * Gets the value of the outLcAccountLnsType property.
     * 
     */
    public short getOutLcAccountLnsType() {
        return outLcAccountLnsType;
    }

    /**
     * Sets the value of the outLcAccountLnsType property.
     * 
     */
    public void setOutLcAccountLnsType(short value) {
        this.outLcAccountLnsType = value;
    }

    /**
     * Gets the value of the outLcAccountLnsUnit property.
     * 
     */
    public int getOutLcAccountLnsUnit() {
        return outLcAccountLnsUnit;
    }

    /**
     * Sets the value of the outLcAccountLnsUnit property.
     * 
     */
    public void setOutLcAccountLnsUnit(int value) {
        this.outLcAccountLnsUnit = value;
    }

    /**
     * Gets the value of the outLcAccountOpeningDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLcAccountOpeningDate() {
        return outLcAccountOpeningDate;
    }

    /**
     * Sets the value of the outLcAccountOpeningDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLcAccountOpeningDate(XMLGregorianCalendar value) {
        this.outLcAccountOpeningDate = value;
    }

    /**
     * Gets the value of the outLcAccountPartialShipmntFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountPartialShipmntFlag() {
        return outLcAccountPartialShipmntFlag;
    }

    /**
     * Sets the value of the outLcAccountPartialShipmntFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountPartialShipmntFlag(String value) {
        this.outLcAccountPartialShipmntFlag = value;
    }

    /**
     * Gets the value of the outLcAccountRedClause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountRedClause() {
        return outLcAccountRedClause;
    }

    /**
     * Sets the value of the outLcAccountRedClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountRedClause(String value) {
        this.outLcAccountRedClause = value;
    }

    /**
     * Gets the value of the outLcAccountReprAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountReprAddress1() {
        return outLcAccountReprAddress1;
    }

    /**
     * Sets the value of the outLcAccountReprAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountReprAddress1(String value) {
        this.outLcAccountReprAddress1 = value;
    }

    /**
     * Gets the value of the outLcAccountReprAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountReprAddress2() {
        return outLcAccountReprAddress2;
    }

    /**
     * Sets the value of the outLcAccountReprAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountReprAddress2(String value) {
        this.outLcAccountReprAddress2 = value;
    }

    /**
     * Gets the value of the outLcAccountReprCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountReprCountry() {
        return outLcAccountReprCountry;
    }

    /**
     * Sets the value of the outLcAccountReprCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountReprCountry(String value) {
        this.outLcAccountReprCountry = value;
    }

    /**
     * Gets the value of the outLcAccountReprName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountReprName() {
        return outLcAccountReprName;
    }

    /**
     * Sets the value of the outLcAccountReprName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountReprName(String value) {
        this.outLcAccountReprName = value;
    }

    /**
     * Gets the value of the outLcAccountReprRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountReprRegion() {
        return outLcAccountReprRegion;
    }

    /**
     * Sets the value of the outLcAccountReprRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountReprRegion(String value) {
        this.outLcAccountReprRegion = value;
    }

    /**
     * Gets the value of the outLcAccountReprResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountReprResident() {
        return outLcAccountReprResident;
    }

    /**
     * Sets the value of the outLcAccountReprResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountReprResident(String value) {
        this.outLcAccountReprResident = value;
    }

    /**
     * Gets the value of the outLcAccountReprTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountReprTel() {
        return outLcAccountReprTel;
    }

    /**
     * Sets the value of the outLcAccountReprTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountReprTel(String value) {
        this.outLcAccountReprTel = value;
    }

    /**
     * Gets the value of the outLcAccountReprZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountReprZipCode() {
        return outLcAccountReprZipCode;
    }

    /**
     * Sets the value of the outLcAccountReprZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountReprZipCode(String value) {
        this.outLcAccountReprZipCode = value;
    }

    /**
     * Gets the value of the outLcAccountRevolvingInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountRevolvingInd() {
        return outLcAccountRevolvingInd;
    }

    /**
     * Sets the value of the outLcAccountRevolvingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountRevolvingInd(String value) {
        this.outLcAccountRevolvingInd = value;
    }

    /**
     * Gets the value of the outLcAccountSettlementMode property.
     * 
     */
    public short getOutLcAccountSettlementMode() {
        return outLcAccountSettlementMode;
    }

    /**
     * Sets the value of the outLcAccountSettlementMode property.
     * 
     */
    public void setOutLcAccountSettlementMode(short value) {
        this.outLcAccountSettlementMode = value;
    }

    /**
     * Gets the value of the outLcAccountTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLcAccountTmstamp() {
        return outLcAccountTmstamp;
    }

    /**
     * Sets the value of the outLcAccountTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLcAccountTmstamp(XMLGregorianCalendar value) {
        this.outLcAccountTmstamp = value;
    }

    /**
     * Gets the value of the outLcAccountTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLcAccountTolerance() {
        return outLcAccountTolerance;
    }

    /**
     * Sets the value of the outLcAccountTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLcAccountTolerance(BigDecimal value) {
        this.outLcAccountTolerance = value;
    }

    /**
     * Gets the value of the outLcAccountTransferLcAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountTransferLcAcc() {
        return outLcAccountTransferLcAcc;
    }

    /**
     * Sets the value of the outLcAccountTransferLcAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountTransferLcAcc(String value) {
        this.outLcAccountTransferLcAcc = value;
    }

    /**
     * Gets the value of the outLcAccountTranshipmntFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLcAccountTranshipmntFlag() {
        return outLcAccountTranshipmntFlag;
    }

    /**
     * Sets the value of the outLcAccountTranshipmntFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLcAccountTranshipmntFlag(String value) {
        this.outLcAccountTranshipmntFlag = value;
    }

    /**
     * Gets the value of the outLcAccountTransmission property.
     * 
     */
    public short getOutLcAccountTransmission() {
        return outLcAccountTransmission;
    }

    /**
     * Sets the value of the outLcAccountTransmission property.
     * 
     */
    public void setOutLcAccountTransmission(short value) {
        this.outLcAccountTransmission = value;
    }

    /**
     * Gets the value of the outMonitoringUnitCode property.
     * 
     */
    public int getOutMonitoringUnitCode() {
        return outMonitoringUnitCode;
    }

    /**
     * Sets the value of the outMonitoringUnitCode property.
     * 
     */
    public void setOutMonitoringUnitCode(int value) {
        this.outMonitoringUnitCode = value;
    }

    /**
     * Gets the value of the outMonitoringUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMonitoringUnitUnitName() {
        return outMonitoringUnitUnitName;
    }

    /**
     * Sets the value of the outMonitoringUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMonitoringUnitUnitName(String value) {
        this.outMonitoringUnitUnitName = value;
    }

    /**
     * Gets the value of the outMovingCurrencyIdCurrency property.
     * 
     */
    public int getOutMovingCurrencyIdCurrency() {
        return outMovingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outMovingCurrencyIdCurrency property.
     * 
     */
    public void setOutMovingCurrencyIdCurrency(int value) {
        this.outMovingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outMovingCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovingCurrencyShortDescr() {
        return outMovingCurrencyShortDescr;
    }

    /**
     * Sets the value of the outMovingCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovingCurrencyShortDescr(String value) {
        this.outMovingCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outNegotiatingSwiftAllnceBicsBankDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNegotiatingSwiftAllnceBicsBankDescr() {
        return outNegotiatingSwiftAllnceBicsBankDescr;
    }

    /**
     * Sets the value of the outNegotiatingSwiftAllnceBicsBankDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNegotiatingSwiftAllnceBicsBankDescr(String value) {
        this.outNegotiatingSwiftAllnceBicsBankDescr = value;
    }

    /**
     * Gets the value of the outNegotiatingSwiftAllnceBicsBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutNegotiatingSwiftAllnceBicsBic() {
        return outNegotiatingSwiftAllnceBicsBic;
    }

    /**
     * Sets the value of the outNegotiatingSwiftAllnceBicsBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutNegotiatingSwiftAllnceBicsBic(String value) {
        this.outNegotiatingSwiftAllnceBicsBic = value;
    }

    /**
     * Gets the value of the outOpeningUnitCode property.
     * 
     */
    public int getOutOpeningUnitCode() {
        return outOpeningUnitCode;
    }

    /**
     * Sets the value of the outOpeningUnitCode property.
     * 
     */
    public void setOutOpeningUnitCode(int value) {
        this.outOpeningUnitCode = value;
    }

    /**
     * Gets the value of the outOpeningUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOpeningUnitUnitName() {
        return outOpeningUnitUnitName;
    }

    /**
     * Sets the value of the outOpeningUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOpeningUnitUnitName(String value) {
        this.outOpeningUnitUnitName = value;
    }

    /**
     * Gets the value of the outOurCustomerIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOurCustomerIefSuppliedFlag() {
        return outOurCustomerIefSuppliedFlag;
    }

    /**
     * Sets the value of the outOurCustomerIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOurCustomerIefSuppliedFlag(String value) {
        this.outOurCustomerIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outPrftTransactionIdTransact property.
     * 
     */
    public int getOutPrftTransactionIdTransact() {
        return outPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the outPrftTransactionIdTransact property.
     * 
     */
    public void setOutPrftTransactionIdTransact(int value) {
        this.outPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the outPrincipalCustomerCDigit property.
     * 
     */
    public short getOutPrincipalCustomerCDigit() {
        return outPrincipalCustomerCDigit;
    }

    /**
     * Sets the value of the outPrincipalCustomerCDigit property.
     * 
     */
    public void setOutPrincipalCustomerCDigit(short value) {
        this.outPrincipalCustomerCDigit = value;
    }

    /**
     * Gets the value of the outPrincipalCustomerCustId property.
     * 
     */
    public int getOutPrincipalCustomerCustId() {
        return outPrincipalCustomerCustId;
    }

    /**
     * Sets the value of the outPrincipalCustomerCustId property.
     * 
     */
    public void setOutPrincipalCustomerCustId(int value) {
        this.outPrincipalCustomerCustId = value;
    }

    /**
     * Gets the value of the outPrincipalProfitsAccountAccountCd property.
     * 
     */
    public short getOutPrincipalProfitsAccountAccountCd() {
        return outPrincipalProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outPrincipalProfitsAccountAccountCd property.
     * 
     */
    public void setOutPrincipalProfitsAccountAccountCd(short value) {
        this.outPrincipalProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outPrincipalProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrincipalProfitsAccountAccountNumber() {
        return outPrincipalProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outPrincipalProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrincipalProfitsAccountAccountNumber(String value) {
        this.outPrincipalProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outPrincipalProfitsAccountPrftSystem property.
     * 
     */
    public short getOutPrincipalProfitsAccountPrftSystem() {
        return outPrincipalProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outPrincipalProfitsAccountPrftSystem property.
     * 
     */
    public void setOutPrincipalProfitsAccountPrftSystem(short value) {
        this.outPrincipalProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outPrintoutValidationInputVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintoutValidationInputVoucherLine() {
        return outPrintoutValidationInputVoucherLine;
    }

    /**
     * Sets the value of the outPrintoutValidationInputVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintoutValidationInputVoucherLine(String value) {
        this.outPrintoutValidationInputVoucherLine = value;
    }

    /**
     * Gets the value of the outProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProductDescription() {
        return outProductDescription;
    }

    /**
     * Sets the value of the outProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProductDescription(String value) {
        this.outProductDescription = value;
    }

    /**
     * Gets the value of the outProductIdProduct property.
     * 
     */
    public int getOutProductIdProduct() {
        return outProductIdProduct;
    }

    /**
     * Sets the value of the outProductIdProduct property.
     * 
     */
    public void setOutProductIdProduct(int value) {
        this.outProductIdProduct = value;
    }

    /**
     * Gets the value of the outTfTypeIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTfTypeIefSuppliedFlag() {
        return outTfTypeIefSuppliedFlag;
    }

    /**
     * Sets the value of the outTfTypeIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTfTypeIefSuppliedFlag(String value) {
        this.outTfTypeIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outTradeFinanceBenefAccCd property.
     * 
     */
    public short getOutTradeFinanceBenefAccCd() {
        return outTradeFinanceBenefAccCd;
    }

    /**
     * Sets the value of the outTradeFinanceBenefAccCd property.
     * 
     */
    public void setOutTradeFinanceBenefAccCd(short value) {
        this.outTradeFinanceBenefAccCd = value;
    }

    /**
     * Gets the value of the outTradeFinanceBenefAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceBenefAccNum() {
        return outTradeFinanceBenefAccNum;
    }

    /**
     * Sets the value of the outTradeFinanceBenefAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceBenefAccNum(String value) {
        this.outTradeFinanceBenefAccNum = value;
    }

    /**
     * Gets the value of the outTradeFinanceBenefAccPrftSys property.
     * 
     */
    public short getOutTradeFinanceBenefAccPrftSys() {
        return outTradeFinanceBenefAccPrftSys;
    }

    /**
     * Sets the value of the outTradeFinanceBenefAccPrftSys property.
     * 
     */
    public void setOutTradeFinanceBenefAccPrftSys(short value) {
        this.outTradeFinanceBenefAccPrftSys = value;
    }

    /**
     * Gets the value of the outTradeFinanceBenefCommAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceBenefCommAddr() {
        return outTradeFinanceBenefCommAddr;
    }

    /**
     * Sets the value of the outTradeFinanceBenefCommAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceBenefCommAddr(String value) {
        this.outTradeFinanceBenefCommAddr = value;
    }

    /**
     * Gets the value of the outTradeFinanceBeneficiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceBeneficiaryName() {
        return outTradeFinanceBeneficiaryName;
    }

    /**
     * Sets the value of the outTradeFinanceBeneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceBeneficiaryName(String value) {
        this.outTradeFinanceBeneficiaryName = value;
    }

    /**
     * Gets the value of the outTradeFinanceComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceComments() {
        return outTradeFinanceComments;
    }

    /**
     * Sets the value of the outTradeFinanceComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceComments(String value) {
        this.outTradeFinanceComments = value;
    }

    /**
     * Gets the value of the outTradeFinanceCorrBankAccCd property.
     * 
     */
    public short getOutTradeFinanceCorrBankAccCd() {
        return outTradeFinanceCorrBankAccCd;
    }

    /**
     * Sets the value of the outTradeFinanceCorrBankAccCd property.
     * 
     */
    public void setOutTradeFinanceCorrBankAccCd(short value) {
        this.outTradeFinanceCorrBankAccCd = value;
    }

    /**
     * Gets the value of the outTradeFinanceCorrBankAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceCorrBankAccNum() {
        return outTradeFinanceCorrBankAccNum;
    }

    /**
     * Sets the value of the outTradeFinanceCorrBankAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceCorrBankAccNum(String value) {
        this.outTradeFinanceCorrBankAccNum = value;
    }

    /**
     * Gets the value of the outTradeFinanceCorreAccPrftSys property.
     * 
     */
    public short getOutTradeFinanceCorreAccPrftSys() {
        return outTradeFinanceCorreAccPrftSys;
    }

    /**
     * Sets the value of the outTradeFinanceCorreAccPrftSys property.
     * 
     */
    public void setOutTradeFinanceCorreAccPrftSys(short value) {
        this.outTradeFinanceCorreAccPrftSys = value;
    }

    /**
     * Gets the value of the outTradeFinanceCorrespondentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceCorrespondentName() {
        return outTradeFinanceCorrespondentName;
    }

    /**
     * Sets the value of the outTradeFinanceCorrespondentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceCorrespondentName(String value) {
        this.outTradeFinanceCorrespondentName = value;
    }

    /**
     * Gets the value of the outTradeFinancePrincAccPrftSys property.
     * 
     */
    public short getOutTradeFinancePrincAccPrftSys() {
        return outTradeFinancePrincAccPrftSys;
    }

    /**
     * Sets the value of the outTradeFinancePrincAccPrftSys property.
     * 
     */
    public void setOutTradeFinancePrincAccPrftSys(short value) {
        this.outTradeFinancePrincAccPrftSys = value;
    }

    /**
     * Gets the value of the outTradeFinancePrincipalAccCd property.
     * 
     */
    public short getOutTradeFinancePrincipalAccCd() {
        return outTradeFinancePrincipalAccCd;
    }

    /**
     * Sets the value of the outTradeFinancePrincipalAccCd property.
     * 
     */
    public void setOutTradeFinancePrincipalAccCd(short value) {
        this.outTradeFinancePrincipalAccCd = value;
    }

    /**
     * Gets the value of the outTradeFinancePrincipalAccNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinancePrincipalAccNum() {
        return outTradeFinancePrincipalAccNum;
    }

    /**
     * Sets the value of the outTradeFinancePrincipalAccNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinancePrincipalAccNum(String value) {
        this.outTradeFinancePrincipalAccNum = value;
    }

    /**
     * Gets the value of the outTradeFinancePrincipalCommAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinancePrincipalCommAddr() {
        return outTradeFinancePrincipalCommAddr;
    }

    /**
     * Sets the value of the outTradeFinancePrincipalCommAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinancePrincipalCommAddr(String value) {
        this.outTradeFinancePrincipalCommAddr = value;
    }

    /**
     * Gets the value of the outTradeFinancePrinicipalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinancePrinicipalName() {
        return outTradeFinancePrinicipalName;
    }

    /**
     * Sets the value of the outTradeFinancePrinicipalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinancePrinicipalName(String value) {
        this.outTradeFinancePrinicipalName = value;
    }

    /**
     * Gets the value of the outTradeFinanceRefNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceRefNo() {
        return outTradeFinanceRefNo;
    }

    /**
     * Sets the value of the outTradeFinanceRefNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceRefNo(String value) {
        this.outTradeFinanceRefNo = value;
    }

    /**
     * Gets the value of the outTradeFinanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceStatus() {
        return outTradeFinanceStatus;
    }

    /**
     * Sets the value of the outTradeFinanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceStatus(String value) {
        this.outTradeFinanceStatus = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTradeFinanceTfAmount() {
        return outTradeFinanceTfAmount;
    }

    /**
     * Sets the value of the outTradeFinanceTfAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTradeFinanceTfAmount(BigDecimal value) {
        this.outTradeFinanceTfAmount = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfCd property.
     * 
     */
    public short getOutTradeFinanceTfCd() {
        return outTradeFinanceTfCd;
    }

    /**
     * Sets the value of the outTradeFinanceTfCd property.
     * 
     */
    public void setOutTradeFinanceTfCd(short value) {
        this.outTradeFinanceTfCd = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfConfirmDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTradeFinanceTfConfirmDate() {
        return outTradeFinanceTfConfirmDate;
    }

    /**
     * Sets the value of the outTradeFinanceTfConfirmDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTradeFinanceTfConfirmDate(XMLGregorianCalendar value) {
        this.outTradeFinanceTfConfirmDate = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceTfNumber() {
        return outTradeFinanceTfNumber;
    }

    /**
     * Sets the value of the outTradeFinanceTfNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceTfNumber(String value) {
        this.outTradeFinanceTfNumber = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTradeFinanceTfOpenDate() {
        return outTradeFinanceTfOpenDate;
    }

    /**
     * Sets the value of the outTradeFinanceTfOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTradeFinanceTfOpenDate(XMLGregorianCalendar value) {
        this.outTradeFinanceTfOpenDate = value;
    }

    /**
     * Gets the value of the outTradeFinanceTfType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTradeFinanceTfType() {
        return outTradeFinanceTfType;
    }

    /**
     * Sets the value of the outTradeFinanceTfType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTradeFinanceTfType(String value) {
        this.outTradeFinanceTfType = value;
    }

    /**
     * Gets the value of the outTradeFinanceTmpstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTradeFinanceTmpstamp() {
        return outTradeFinanceTmpstamp;
    }

    /**
     * Sets the value of the outTradeFinanceTmpstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTradeFinanceTmpstamp(XMLGregorianCalendar value) {
        this.outTradeFinanceTmpstamp = value;
    }

    /**
     * Gets the value of the outTrxCountAdvCounter property.
     * 
     */
    public int getOutTrxCountAdvCounter() {
        return outTrxCountAdvCounter;
    }

    /**
     * Sets the value of the outTrxCountAdvCounter property.
     * 
     */
    public void setOutTrxCountAdvCounter(int value) {
        this.outTrxCountAdvCounter = value;
    }

    /**
     * Gets the value of the outTrxCountTrxCounter property.
     * 
     */
    public int getOutTrxCountTrxCounter() {
        return outTrxCountTrxCounter;
    }

    /**
     * Sets the value of the outTrxCountTrxCounter property.
     * 
     */
    public void setOutTrxCountTrxCounter(int value) {
        this.outTrxCountTrxCounter = value;
    }

    /**
     * Gets the value of the outGrpTfDestination property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpTfDestination }
     *     
     */
    public ArrayOfOutGrpTfDestination getOutGrpTfDestination() {
        return outGrpTfDestination;
    }

    /**
     * Sets the value of the outGrpTfDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpTfDestination }
     *     
     */
    public void setOutGrpTfDestination(ArrayOfOutGrpTfDestination value) {
        this.outGrpTfDestination = value;
    }

    /**
     * Gets the value of the outGrpTfShipment property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpTfShipment }
     *     
     */
    public ArrayOfOutGrpTfShipment getOutGrpTfShipment() {
        return outGrpTfShipment;
    }

    /**
     * Sets the value of the outGrpTfShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpTfShipment }
     *     
     */
    public void setOutGrpTfShipment(ArrayOfOutGrpTfShipment value) {
        this.outGrpTfShipment = value;
    }

}
