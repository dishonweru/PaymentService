
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LettersOfGuaranteeRetrieveExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LettersOfGuaranteeRetrieveExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutActualDocumentFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutActualDocumentMswordFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutActualDocumentMswordPathname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgrGuarantorCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrGuarantorCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrGuarantorCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrGuarantorCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrGuarantorCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrGuarantorCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrGuarantorOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgrProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAgrProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgrProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutAgrProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutAgrProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutAgrProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
 *         &lt;element name="OutCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCollaborationBanksBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCounterCounterTableCntr" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepCurrencyCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepCurrencyCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDepProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDepProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDocumentTemplateCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDocumentTemplateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationResultTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationResultTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationResultTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationResultTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFilenameIefSuppliedString255" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFxtypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutFxtypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGenericDetailInfoLatinDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJournalComCollectedIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutJournalExpCollectedIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLanguageGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLanguageGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgLgType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgWithinLimitFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLgAccountAccSpcAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountCancellationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountCifAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountCifCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountComChargeFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountComChargeFrqTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountComInAcBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountComInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountComment1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountComment2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountCommissionBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountCusStmLstTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountCusStmNxtTrnDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountDefaultDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountDefaultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountDepAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountDepAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutLgAccountDepAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountDepAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgAccountExpenseBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountExpInAcBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountExpirationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountGuaranteeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountIssuanceJustific" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountLanguageCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgAccountLastUpdDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountLgAmnTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountLgAmountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountLgBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountLgDocCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountLgExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountLgFinalDocCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountLgInitialAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountLgOverdue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountLnsCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountLnsUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgAccountMigrateDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountNextCommissDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountObligationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountOldAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountOtherBankLgAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountPendingModifCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgAccountPostCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountPurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountPurchaseAmtPcg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountPurchaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountPurchaseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountReleaseDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountReplacementReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountRqDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountRqDefaultDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountRqDefaultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountStampCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountStopCommissionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountTelegraphCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTelephoneCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTenderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountTenderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdPartyNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountThirdZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccountTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutLgAccountTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTotComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTotCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutLgAccountUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgAccountUrlComFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgAccUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenef2CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgBenef2CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgBenef2ListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenef3CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgBenef3CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgBenef3ListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenef4CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgBenef4CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgBenef4ListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenef5CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgBenef5CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgBenef5ListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenefCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenefCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenefCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenefCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenefCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenefCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgBenefCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgBenefCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgBenefListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuer2CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgIssuer2CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgIssuer2ListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuer3CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgIssuer3CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgIssuer3ListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuer4CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgIssuer4CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgIssuer4ListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuer5CustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgIssuer5CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgIssuer5ListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuerCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuerCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuerCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuerCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuerCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuerCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuerCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutLgIssuerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLgIssuerListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLgIssuerOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMoniringBankemployeeFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMoniringBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMoniringBankemployeeLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovingCurrencyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutMovingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutMovingCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOpenUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutOpenUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrintUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutReplacedLgAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutReplacedLgAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutReplacedLgAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutReplacedUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServerLgAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServerLgAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutServerLgAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServerLgAccountComInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServerLgAccountCommissionBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServerLgAccountDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServerLgAccountExpenseBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServerLgAccountExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutServerLgAccountLgAmountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServerLgAccountLgDocCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServerLgAccountLgFinalDocCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServerLgAccountMigrateDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutServerLgAccountOtherBankLgAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServerLgAccountPendingModifCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServerLgAccountReleaseDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutServerLgAccountRqDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServerLgAccountTotComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServerLgAccountTotCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServerLgAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServerLgAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutSnActualDocumentSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTemplateMswordFilename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTemplateMswordPathname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTotalComCollectedIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTotalExpCollectedIefSuppliedNumber152" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpAgrBenef" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpAgrBenef" minOccurs="0"/>
 *         &lt;element name="OutGrpAgrGuarantor" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpAgrGuarantor" minOccurs="0"/>
 *         &lt;element name="OutGrpCollatElements" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpCollatElements" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LettersOfGuaranteeRetrieveExport", propOrder = {
    "outActualDocumentFileName",
    "outActualDocumentMswordFilename",
    "outActualDocumentMswordPathname",
    "outAgrCharSuppliedChar20",
    "outAgreementAgrMembershipSn",
    "outAgreementAgrSn",
    "outAgreementAgrYear",
    "outAgrGuarantorCustAddressAddress1",
    "outAgrGuarantorCustAddressAddress2",
    "outAgrGuarantorCustAddressCity",
    "outAgrGuarantorCustAddressRegion",
    "outAgrGuarantorCustAddressTelephone",
    "outAgrGuarantorCustAddressZipCode",
    "outAgrGuarantorOtherIdIdNo",
    "outAgrProfitsAccountAccountCd",
    "outAgrProfitsAccountAccountNumber",
    "outAgrProfitsAccountAgrMembershipSn",
    "outAgrProfitsAccountAgrSn",
    "outAgrProfitsAccountAgrUnit",
    "outAgrProfitsAccountAgrYear",
    "outAgrProfitsAccountCustId",
    "outAgrProfitsAccountDepAccNumber",
    "outAgrProfitsAccountLgAccSn",
    "outAgrProfitsAccountLgOpenUnit",
    "outAgrProfitsAccountPrftSystem",
    "outAgrProfitsAccountProductId",
    "outAgrUnitCode",
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
    "outCollaborationBanksBankId",
    "outCollaborationBanksBankName",
    "outCounterCounterTableCntr",
    "outDepCurrencyCurrencyIdCurrency",
    "outDepCurrencyCurrencyShortDescr",
    "outDepositAccountDesignation",
    "outDepProfitsAccountAccountCd",
    "outDepProfitsAccountAccountNumber",
    "outDepProfitsAccountCustId",
    "outDepProfitsAccountDepAccNumber",
    "outDepProfitsAccountLgAccSn",
    "outDepProfitsAccountLgOpenUnit",
    "outDepProfitsAccountPrftSystem",
    "outDepProfitsAccountProductId",
    "outDocumentTemplateCode",
    "outDocumentTemplateDescription",
    "outEvaluationResultTeamInformationAuthorizationType",
    "outEvaluationResultTeamInformationEvaluationResult",
    "outEvaluationResultTeamInformationRequiredProfile1",
    "outEvaluationResultTeamInformationRequiredProfile2",
    "outFilenameIefSuppliedString255",
    "outFxtypeGenericDetailDescription",
    "outFxtypeGenericDetailSerialNum",
    "outGenericDetailInfoLatinDescription",
    "outJournalComCollectedIefSuppliedNumber152",
    "outJournalExpCollectedIefSuppliedNumber152",
    "outJustificDescription",
    "outJustificIdJustific",
    "outLanguageGenericDetailDescription",
    "outLanguageGenericDetailSerialNum",
    "outLgLgType",
    "outLgWithinLimitFlg",
    "outLgAccountAccCd",
    "outLgAccountAccLimitAmn",
    "outLgAccountAccOpenDt",
    "outLgAccountAccSn",
    "outLgAccountAccSpcAgrFlg",
    "outLgAccountAccStatus",
    "outLgAccountAccType",
    "outLgAccountCancellationDt",
    "outLgAccountCifAmount",
    "outLgAccountCifCurrency",
    "outLgAccountComChargeFrq",
    "outLgAccountComChargeFrqTyp",
    "outLgAccountComInAcBal",
    "outLgAccountComInd",
    "outLgAccountComment1",
    "outLgAccountComment2",
    "outLgAccountCommissionBal",
    "outLgAccountCusStmLstTrnDt",
    "outLgAccountCusStmNxtTrnDt",
    "outLgAccountDefaultAmn",
    "outLgAccountDefaultDate",
    "outLgAccountDefaultType",
    "outLgAccountDepAccCd",
    "outLgAccountDepAccSn",
    "outLgAccountDepAccType",
    "outLgAccountDepAccUnit",
    "outLgAccountExpenseBal",
    "outLgAccountExpInAcBal",
    "outLgAccountExpirationType",
    "outLgAccountExpiryDt",
    "outLgAccountGuaranteeDt",
    "outLgAccountIssuanceJustific",
    "outLgAccountLanguageCode",
    "outLgAccountLastUpdDt",
    "outLgAccountLgAmnTolerance",
    "outLgAccountLgAmountBal",
    "outLgAccountLgBody",
    "outLgAccountLgDocCount",
    "outLgAccountLgExtension",
    "outLgAccountLgFinalDocCnt",
    "outLgAccountLgInitialAmn",
    "outLgAccountLgOverdue",
    "outLgAccountLnsCd",
    "outLgAccountLnsSn",
    "outLgAccountLnsType",
    "outLgAccountLnsUnit",
    "outLgAccountMigrateDt",
    "outLgAccountNextCommissDt",
    "outLgAccountObligationStatus",
    "outLgAccountOldAccount",
    "outLgAccountOtherBankLgAcc",
    "outLgAccountPendingModifCnt",
    "outLgAccountPostCharges",
    "outLgAccountPurchaseAmount",
    "outLgAccountPurchaseAmtPcg",
    "outLgAccountPurchaseCurrency",
    "outLgAccountPurchaseNo",
    "outLgAccountReleaseDt",
    "outLgAccountReplacementReason",
    "outLgAccountRqDefaultAmn",
    "outLgAccountRqDefaultDt",
    "outLgAccountRqDefaultType",
    "outLgAccountStampCharges",
    "outLgAccountStopCommissionDt",
    "outLgAccountTelegraphCharges",
    "outLgAccountTelephoneCharges",
    "outLgAccountTenderDate",
    "outLgAccountTenderNo",
    "outLgAccountThirdAddress1",
    "outLgAccountThirdAddress2",
    "outLgAccountThirdCity",
    "outLgAccountThirdCountry",
    "outLgAccountThirdPartyNam",
    "outLgAccountThirdTelephone1",
    "outLgAccountThirdZipCode",
    "outLgAccountTmstamp",
    "outLgAccountTotalTax",
    "outLgAccountTotComInCcAmn",
    "outLgAccountTotCommissionAmn",
    "outLgAccountTotExpenseAmn",
    "outLgAccountTotExpInCcAmn",
    "outLgAccountUnit",
    "outLgAccountUrlComFlg",
    "outLgAccUnitCode",
    "outLgAccUnitUnitName",
    "outLgBenef2CustomerCDigit",
    "outLgBenef2CustomerCustId",
    "outLgBenef2ListSetDescription",
    "outLgBenef3CustomerCDigit",
    "outLgBenef3CustomerCustId",
    "outLgBenef3ListSetDescription",
    "outLgBenef4CustomerCDigit",
    "outLgBenef4CustomerCustId",
    "outLgBenef4ListSetDescription",
    "outLgBenef5CustomerCDigit",
    "outLgBenef5CustomerCustId",
    "outLgBenef5ListSetDescription",
    "outLgBenefCustAddressAddress1",
    "outLgBenefCustAddressAddress2",
    "outLgBenefCustAddressCity",
    "outLgBenefCustAddressRegion",
    "outLgBenefCustAddressTelephone",
    "outLgBenefCustAddressZipCode",
    "outLgBenefCustomerCDigit",
    "outLgBenefCustomerCustId",
    "outLgBenefListSetDescription",
    "outLgIssuer2CustomerCDigit",
    "outLgIssuer2CustomerCustId",
    "outLgIssuer2ListSetDescription",
    "outLgIssuer3CustomerCDigit",
    "outLgIssuer3CustomerCustId",
    "outLgIssuer3ListSetDescription",
    "outLgIssuer4CustomerCDigit",
    "outLgIssuer4CustomerCustId",
    "outLgIssuer4ListSetDescription",
    "outLgIssuer5CustomerCDigit",
    "outLgIssuer5CustomerCustId",
    "outLgIssuer5ListSetDescription",
    "outLgIssuerCustAddressAddress1",
    "outLgIssuerCustAddressAddress2",
    "outLgIssuerCustAddressCity",
    "outLgIssuerCustAddressRegion",
    "outLgIssuerCustAddressTelephone",
    "outLgIssuerCustAddressZipCode",
    "outLgIssuerCustomerCDigit",
    "outLgIssuerCustomerCustId",
    "outLgIssuerListSetDescription",
    "outLgIssuerOtherIdIdNo",
    "outLimitCurrencyIdCurrency",
    "outLimitCurrencyShortDescr",
    "outMoniringBankemployeeFirstName",
    "outMoniringBankemployeeId",
    "outMoniringBankemployeeLastName",
    "outMovingCurrencyDescription",
    "outMovingCurrencyIdCurrency",
    "outMovingCurrencyShortDescr",
    "outOpenUnitCode",
    "outOpenUnitUnitName",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outPrintUnitCode",
    "outPrintUnitUnitName",
    "outProductDescription",
    "outProductIdProduct",
    "outProfitsAccountAccountNumber",
    "outReplacedLgAccountAccCd",
    "outReplacedLgAccountAccSn",
    "outReplacedLgAccountAccType",
    "outReplacedUnitCode",
    "outServerLgAccountAccCd",
    "outServerLgAccountAccSn",
    "outServerLgAccountAccType",
    "outServerLgAccountComInd",
    "outServerLgAccountCommissionBal",
    "outServerLgAccountDefaultAmn",
    "outServerLgAccountExpenseBal",
    "outServerLgAccountExpiryDt",
    "outServerLgAccountLgAmountBal",
    "outServerLgAccountLgDocCount",
    "outServerLgAccountLgFinalDocCnt",
    "outServerLgAccountMigrateDt",
    "outServerLgAccountOtherBankLgAcc",
    "outServerLgAccountPendingModifCnt",
    "outServerLgAccountReleaseDt",
    "outServerLgAccountRqDefaultAmn",
    "outServerLgAccountTotComInCcAmn",
    "outServerLgAccountTotCommissionAmn",
    "outServerLgAccountTotExpenseAmn",
    "outServerLgAccountTotExpInCcAmn",
    "outSnActualDocumentSerialNo",
    "outTemplateMswordFilename",
    "outTemplateMswordPathname",
    "outTotalComCollectedIefSuppliedNumber152",
    "outTotalExpCollectedIefSuppliedNumber152",
    "outGrpAgrBenef",
    "outGrpAgrGuarantor",
    "outGrpCollatElements"
})
public class LettersOfGuaranteeRetrieveExport
    extends BaseExport
{

    @XmlElement(name = "OutActualDocumentFileName")
    protected String outActualDocumentFileName;
    @XmlElement(name = "OutActualDocumentMswordFilename")
    protected String outActualDocumentMswordFilename;
    @XmlElement(name = "OutActualDocumentMswordPathname")
    protected String outActualDocumentMswordPathname;
    @XmlElement(name = "OutAgrCharSuppliedChar20")
    protected String outAgrCharSuppliedChar20;
    @XmlElement(name = "OutAgreementAgrMembershipSn")
    protected int outAgreementAgrMembershipSn;
    @XmlElement(name = "OutAgreementAgrSn")
    protected int outAgreementAgrSn;
    @XmlElement(name = "OutAgreementAgrYear")
    protected short outAgreementAgrYear;
    @XmlElement(name = "OutAgrGuarantorCustAddressAddress1")
    protected String outAgrGuarantorCustAddressAddress1;
    @XmlElement(name = "OutAgrGuarantorCustAddressAddress2")
    protected String outAgrGuarantorCustAddressAddress2;
    @XmlElement(name = "OutAgrGuarantorCustAddressCity")
    protected String outAgrGuarantorCustAddressCity;
    @XmlElement(name = "OutAgrGuarantorCustAddressRegion")
    protected String outAgrGuarantorCustAddressRegion;
    @XmlElement(name = "OutAgrGuarantorCustAddressTelephone")
    protected String outAgrGuarantorCustAddressTelephone;
    @XmlElement(name = "OutAgrGuarantorCustAddressZipCode")
    protected String outAgrGuarantorCustAddressZipCode;
    @XmlElement(name = "OutAgrGuarantorOtherIdIdNo")
    protected String outAgrGuarantorOtherIdIdNo;
    @XmlElement(name = "OutAgrProfitsAccountAccountCd")
    protected short outAgrProfitsAccountAccountCd;
    @XmlElement(name = "OutAgrProfitsAccountAccountNumber")
    protected String outAgrProfitsAccountAccountNumber;
    @XmlElement(name = "OutAgrProfitsAccountAgrMembershipSn")
    protected int outAgrProfitsAccountAgrMembershipSn;
    @XmlElement(name = "OutAgrProfitsAccountAgrSn")
    protected int outAgrProfitsAccountAgrSn;
    @XmlElement(name = "OutAgrProfitsAccountAgrUnit")
    protected int outAgrProfitsAccountAgrUnit;
    @XmlElement(name = "OutAgrProfitsAccountAgrYear")
    protected short outAgrProfitsAccountAgrYear;
    @XmlElement(name = "OutAgrProfitsAccountCustId")
    protected int outAgrProfitsAccountCustId;
    @XmlElement(name = "OutAgrProfitsAccountDepAccNumber")
    protected double outAgrProfitsAccountDepAccNumber;
    @XmlElement(name = "OutAgrProfitsAccountLgAccSn")
    protected double outAgrProfitsAccountLgAccSn;
    @XmlElement(name = "OutAgrProfitsAccountLgOpenUnit")
    protected int outAgrProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutAgrProfitsAccountPrftSystem")
    protected short outAgrProfitsAccountPrftSystem;
    @XmlElement(name = "OutAgrProfitsAccountProductId")
    protected int outAgrProfitsAccountProductId;
    @XmlElement(name = "OutAgrUnitCode")
    protected int outAgrUnitCode;
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
    @XmlElement(name = "OutCollaborationBanksBankId")
    protected int outCollaborationBanksBankId;
    @XmlElement(name = "OutCollaborationBanksBankName")
    protected String outCollaborationBanksBankName;
    @XmlElement(name = "OutCounterCounterTableCntr")
    protected short outCounterCounterTableCntr;
    @XmlElement(name = "OutDepCurrencyCurrencyIdCurrency")
    protected int outDepCurrencyCurrencyIdCurrency;
    @XmlElement(name = "OutDepCurrencyCurrencyShortDescr")
    protected String outDepCurrencyCurrencyShortDescr;
    @XmlElement(name = "OutDepositAccountDesignation")
    protected String outDepositAccountDesignation;
    @XmlElement(name = "OutDepProfitsAccountAccountCd")
    protected short outDepProfitsAccountAccountCd;
    @XmlElement(name = "OutDepProfitsAccountAccountNumber")
    protected String outDepProfitsAccountAccountNumber;
    @XmlElement(name = "OutDepProfitsAccountCustId")
    protected int outDepProfitsAccountCustId;
    @XmlElement(name = "OutDepProfitsAccountDepAccNumber")
    protected double outDepProfitsAccountDepAccNumber;
    @XmlElement(name = "OutDepProfitsAccountLgAccSn")
    protected double outDepProfitsAccountLgAccSn;
    @XmlElement(name = "OutDepProfitsAccountLgOpenUnit")
    protected int outDepProfitsAccountLgOpenUnit;
    @XmlElement(name = "OutDepProfitsAccountPrftSystem")
    protected short outDepProfitsAccountPrftSystem;
    @XmlElement(name = "OutDepProfitsAccountProductId")
    protected int outDepProfitsAccountProductId;
    @XmlElement(name = "OutDocumentTemplateCode")
    protected int outDocumentTemplateCode;
    @XmlElement(name = "OutDocumentTemplateDescription")
    protected String outDocumentTemplateDescription;
    @XmlElement(name = "OutEvaluationResultTeamInformationAuthorizationType")
    protected String outEvaluationResultTeamInformationAuthorizationType;
    @XmlElement(name = "OutEvaluationResultTeamInformationEvaluationResult")
    protected String outEvaluationResultTeamInformationEvaluationResult;
    @XmlElement(name = "OutEvaluationResultTeamInformationRequiredProfile1")
    protected String outEvaluationResultTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvaluationResultTeamInformationRequiredProfile2")
    protected String outEvaluationResultTeamInformationRequiredProfile2;
    @XmlElement(name = "OutFilenameIefSuppliedString255")
    protected String outFilenameIefSuppliedString255;
    @XmlElement(name = "OutFxtypeGenericDetailDescription")
    protected String outFxtypeGenericDetailDescription;
    @XmlElement(name = "OutFxtypeGenericDetailSerialNum")
    protected int outFxtypeGenericDetailSerialNum;
    @XmlElement(name = "OutGenericDetailInfoLatinDescription")
    protected String outGenericDetailInfoLatinDescription;
    @XmlElement(name = "OutJournalComCollectedIefSuppliedNumber152", required = true)
    protected BigDecimal outJournalComCollectedIefSuppliedNumber152;
    @XmlElement(name = "OutJournalExpCollectedIefSuppliedNumber152", required = true)
    protected BigDecimal outJournalExpCollectedIefSuppliedNumber152;
    @XmlElement(name = "OutJustificDescription")
    protected String outJustificDescription;
    @XmlElement(name = "OutJustificIdJustific")
    protected int outJustificIdJustific;
    @XmlElement(name = "OutLanguageGenericDetailDescription")
    protected String outLanguageGenericDetailDescription;
    @XmlElement(name = "OutLanguageGenericDetailSerialNum")
    protected int outLanguageGenericDetailSerialNum;
    @XmlElement(name = "OutLgLgType")
    protected String outLgLgType;
    @XmlElement(name = "OutLgWithinLimitFlg")
    protected String outLgWithinLimitFlg;
    @XmlElement(name = "OutLgAccountAccCd")
    protected short outLgAccountAccCd;
    @XmlElement(name = "OutLgAccountAccLimitAmn", required = true)
    protected BigDecimal outLgAccountAccLimitAmn;
    @XmlElement(name = "OutLgAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountAccOpenDt;
    @XmlElement(name = "OutLgAccountAccSn")
    protected double outLgAccountAccSn;
    @XmlElement(name = "OutLgAccountAccSpcAgrFlg")
    protected String outLgAccountAccSpcAgrFlg;
    @XmlElement(name = "OutLgAccountAccStatus")
    protected String outLgAccountAccStatus;
    @XmlElement(name = "OutLgAccountAccType")
    protected short outLgAccountAccType;
    @XmlElement(name = "OutLgAccountCancellationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountCancellationDt;
    @XmlElement(name = "OutLgAccountCifAmount", required = true)
    protected BigDecimal outLgAccountCifAmount;
    @XmlElement(name = "OutLgAccountCifCurrency")
    protected String outLgAccountCifCurrency;
    @XmlElement(name = "OutLgAccountComChargeFrq")
    protected short outLgAccountComChargeFrq;
    @XmlElement(name = "OutLgAccountComChargeFrqTyp")
    protected String outLgAccountComChargeFrqTyp;
    @XmlElement(name = "OutLgAccountComInAcBal", required = true)
    protected BigDecimal outLgAccountComInAcBal;
    @XmlElement(name = "OutLgAccountComInd")
    protected String outLgAccountComInd;
    @XmlElement(name = "OutLgAccountComment1")
    protected String outLgAccountComment1;
    @XmlElement(name = "OutLgAccountComment2")
    protected String outLgAccountComment2;
    @XmlElement(name = "OutLgAccountCommissionBal", required = true)
    protected BigDecimal outLgAccountCommissionBal;
    @XmlElement(name = "OutLgAccountCusStmLstTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountCusStmLstTrnDt;
    @XmlElement(name = "OutLgAccountCusStmNxtTrnDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountCusStmNxtTrnDt;
    @XmlElement(name = "OutLgAccountDefaultAmn", required = true)
    protected BigDecimal outLgAccountDefaultAmn;
    @XmlElement(name = "OutLgAccountDefaultDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountDefaultDate;
    @XmlElement(name = "OutLgAccountDefaultType")
    protected String outLgAccountDefaultType;
    @XmlElement(name = "OutLgAccountDepAccCd")
    protected short outLgAccountDepAccCd;
    @XmlElement(name = "OutLgAccountDepAccSn")
    protected double outLgAccountDepAccSn;
    @XmlElement(name = "OutLgAccountDepAccType")
    protected short outLgAccountDepAccType;
    @XmlElement(name = "OutLgAccountDepAccUnit")
    protected int outLgAccountDepAccUnit;
    @XmlElement(name = "OutLgAccountExpenseBal", required = true)
    protected BigDecimal outLgAccountExpenseBal;
    @XmlElement(name = "OutLgAccountExpInAcBal", required = true)
    protected BigDecimal outLgAccountExpInAcBal;
    @XmlElement(name = "OutLgAccountExpirationType")
    protected String outLgAccountExpirationType;
    @XmlElement(name = "OutLgAccountExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountExpiryDt;
    @XmlElement(name = "OutLgAccountGuaranteeDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountGuaranteeDt;
    @XmlElement(name = "OutLgAccountIssuanceJustific")
    protected String outLgAccountIssuanceJustific;
    @XmlElement(name = "OutLgAccountLanguageCode")
    protected int outLgAccountLanguageCode;
    @XmlElement(name = "OutLgAccountLastUpdDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountLastUpdDt;
    @XmlElement(name = "OutLgAccountLgAmnTolerance", required = true)
    protected BigDecimal outLgAccountLgAmnTolerance;
    @XmlElement(name = "OutLgAccountLgAmountBal", required = true)
    protected BigDecimal outLgAccountLgAmountBal;
    @XmlElement(name = "OutLgAccountLgBody")
    protected String outLgAccountLgBody;
    @XmlElement(name = "OutLgAccountLgDocCount")
    protected short outLgAccountLgDocCount;
    @XmlElement(name = "OutLgAccountLgExtension")
    protected String outLgAccountLgExtension;
    @XmlElement(name = "OutLgAccountLgFinalDocCnt")
    protected short outLgAccountLgFinalDocCnt;
    @XmlElement(name = "OutLgAccountLgInitialAmn", required = true)
    protected BigDecimal outLgAccountLgInitialAmn;
    @XmlElement(name = "OutLgAccountLgOverdue")
    protected String outLgAccountLgOverdue;
    @XmlElement(name = "OutLgAccountLnsCd")
    protected short outLgAccountLnsCd;
    @XmlElement(name = "OutLgAccountLnsSn")
    protected int outLgAccountLnsSn;
    @XmlElement(name = "OutLgAccountLnsType")
    protected short outLgAccountLnsType;
    @XmlElement(name = "OutLgAccountLnsUnit")
    protected int outLgAccountLnsUnit;
    @XmlElement(name = "OutLgAccountMigrateDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountMigrateDt;
    @XmlElement(name = "OutLgAccountNextCommissDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountNextCommissDt;
    @XmlElement(name = "OutLgAccountObligationStatus")
    protected String outLgAccountObligationStatus;
    @XmlElement(name = "OutLgAccountOldAccount")
    protected String outLgAccountOldAccount;
    @XmlElement(name = "OutLgAccountOtherBankLgAcc")
    protected String outLgAccountOtherBankLgAcc;
    @XmlElement(name = "OutLgAccountPendingModifCnt")
    protected short outLgAccountPendingModifCnt;
    @XmlElement(name = "OutLgAccountPostCharges", required = true)
    protected BigDecimal outLgAccountPostCharges;
    @XmlElement(name = "OutLgAccountPurchaseAmount", required = true)
    protected BigDecimal outLgAccountPurchaseAmount;
    @XmlElement(name = "OutLgAccountPurchaseAmtPcg", required = true)
    protected BigDecimal outLgAccountPurchaseAmtPcg;
    @XmlElement(name = "OutLgAccountPurchaseCurrency")
    protected String outLgAccountPurchaseCurrency;
    @XmlElement(name = "OutLgAccountPurchaseNo")
    protected String outLgAccountPurchaseNo;
    @XmlElement(name = "OutLgAccountReleaseDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountReleaseDt;
    @XmlElement(name = "OutLgAccountReplacementReason")
    protected String outLgAccountReplacementReason;
    @XmlElement(name = "OutLgAccountRqDefaultAmn", required = true)
    protected BigDecimal outLgAccountRqDefaultAmn;
    @XmlElement(name = "OutLgAccountRqDefaultDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountRqDefaultDt;
    @XmlElement(name = "OutLgAccountRqDefaultType")
    protected String outLgAccountRqDefaultType;
    @XmlElement(name = "OutLgAccountStampCharges", required = true)
    protected BigDecimal outLgAccountStampCharges;
    @XmlElement(name = "OutLgAccountStopCommissionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountStopCommissionDt;
    @XmlElement(name = "OutLgAccountTelegraphCharges", required = true)
    protected BigDecimal outLgAccountTelegraphCharges;
    @XmlElement(name = "OutLgAccountTelephoneCharges", required = true)
    protected BigDecimal outLgAccountTelephoneCharges;
    @XmlElement(name = "OutLgAccountTenderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountTenderDate;
    @XmlElement(name = "OutLgAccountTenderNo")
    protected String outLgAccountTenderNo;
    @XmlElement(name = "OutLgAccountThirdAddress1")
    protected String outLgAccountThirdAddress1;
    @XmlElement(name = "OutLgAccountThirdAddress2")
    protected String outLgAccountThirdAddress2;
    @XmlElement(name = "OutLgAccountThirdCity")
    protected String outLgAccountThirdCity;
    @XmlElement(name = "OutLgAccountThirdCountry")
    protected String outLgAccountThirdCountry;
    @XmlElement(name = "OutLgAccountThirdPartyNam")
    protected String outLgAccountThirdPartyNam;
    @XmlElement(name = "OutLgAccountThirdTelephone1")
    protected String outLgAccountThirdTelephone1;
    @XmlElement(name = "OutLgAccountThirdZipCode")
    protected String outLgAccountThirdZipCode;
    @XmlElement(name = "OutLgAccountTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outLgAccountTmstamp;
    @XmlElement(name = "OutLgAccountTotalTax", required = true)
    protected BigDecimal outLgAccountTotalTax;
    @XmlElement(name = "OutLgAccountTotComInCcAmn", required = true)
    protected BigDecimal outLgAccountTotComInCcAmn;
    @XmlElement(name = "OutLgAccountTotCommissionAmn", required = true)
    protected BigDecimal outLgAccountTotCommissionAmn;
    @XmlElement(name = "OutLgAccountTotExpenseAmn", required = true)
    protected BigDecimal outLgAccountTotExpenseAmn;
    @XmlElement(name = "OutLgAccountTotExpInCcAmn", required = true)
    protected BigDecimal outLgAccountTotExpInCcAmn;
    @XmlElement(name = "OutLgAccountUnit")
    protected int outLgAccountUnit;
    @XmlElement(name = "OutLgAccountUrlComFlg")
    protected String outLgAccountUrlComFlg;
    @XmlElement(name = "OutLgAccUnitCode")
    protected int outLgAccUnitCode;
    @XmlElement(name = "OutLgAccUnitUnitName")
    protected String outLgAccUnitUnitName;
    @XmlElement(name = "OutLgBenef2CustomerCDigit")
    protected short outLgBenef2CustomerCDigit;
    @XmlElement(name = "OutLgBenef2CustomerCustId")
    protected int outLgBenef2CustomerCustId;
    @XmlElement(name = "OutLgBenef2ListSetDescription")
    protected String outLgBenef2ListSetDescription;
    @XmlElement(name = "OutLgBenef3CustomerCDigit")
    protected short outLgBenef3CustomerCDigit;
    @XmlElement(name = "OutLgBenef3CustomerCustId")
    protected int outLgBenef3CustomerCustId;
    @XmlElement(name = "OutLgBenef3ListSetDescription")
    protected String outLgBenef3ListSetDescription;
    @XmlElement(name = "OutLgBenef4CustomerCDigit")
    protected short outLgBenef4CustomerCDigit;
    @XmlElement(name = "OutLgBenef4CustomerCustId")
    protected int outLgBenef4CustomerCustId;
    @XmlElement(name = "OutLgBenef4ListSetDescription")
    protected String outLgBenef4ListSetDescription;
    @XmlElement(name = "OutLgBenef5CustomerCDigit")
    protected short outLgBenef5CustomerCDigit;
    @XmlElement(name = "OutLgBenef5CustomerCustId")
    protected int outLgBenef5CustomerCustId;
    @XmlElement(name = "OutLgBenef5ListSetDescription")
    protected String outLgBenef5ListSetDescription;
    @XmlElement(name = "OutLgBenefCustAddressAddress1")
    protected String outLgBenefCustAddressAddress1;
    @XmlElement(name = "OutLgBenefCustAddressAddress2")
    protected String outLgBenefCustAddressAddress2;
    @XmlElement(name = "OutLgBenefCustAddressCity")
    protected String outLgBenefCustAddressCity;
    @XmlElement(name = "OutLgBenefCustAddressRegion")
    protected String outLgBenefCustAddressRegion;
    @XmlElement(name = "OutLgBenefCustAddressTelephone")
    protected String outLgBenefCustAddressTelephone;
    @XmlElement(name = "OutLgBenefCustAddressZipCode")
    protected String outLgBenefCustAddressZipCode;
    @XmlElement(name = "OutLgBenefCustomerCDigit")
    protected short outLgBenefCustomerCDigit;
    @XmlElement(name = "OutLgBenefCustomerCustId")
    protected int outLgBenefCustomerCustId;
    @XmlElement(name = "OutLgBenefListSetDescription")
    protected String outLgBenefListSetDescription;
    @XmlElement(name = "OutLgIssuer2CustomerCDigit")
    protected short outLgIssuer2CustomerCDigit;
    @XmlElement(name = "OutLgIssuer2CustomerCustId")
    protected int outLgIssuer2CustomerCustId;
    @XmlElement(name = "OutLgIssuer2ListSetDescription")
    protected String outLgIssuer2ListSetDescription;
    @XmlElement(name = "OutLgIssuer3CustomerCDigit")
    protected short outLgIssuer3CustomerCDigit;
    @XmlElement(name = "OutLgIssuer3CustomerCustId")
    protected int outLgIssuer3CustomerCustId;
    @XmlElement(name = "OutLgIssuer3ListSetDescription")
    protected String outLgIssuer3ListSetDescription;
    @XmlElement(name = "OutLgIssuer4CustomerCDigit")
    protected short outLgIssuer4CustomerCDigit;
    @XmlElement(name = "OutLgIssuer4CustomerCustId")
    protected int outLgIssuer4CustomerCustId;
    @XmlElement(name = "OutLgIssuer4ListSetDescription")
    protected String outLgIssuer4ListSetDescription;
    @XmlElement(name = "OutLgIssuer5CustomerCDigit")
    protected short outLgIssuer5CustomerCDigit;
    @XmlElement(name = "OutLgIssuer5CustomerCustId")
    protected int outLgIssuer5CustomerCustId;
    @XmlElement(name = "OutLgIssuer5ListSetDescription")
    protected String outLgIssuer5ListSetDescription;
    @XmlElement(name = "OutLgIssuerCustAddressAddress1")
    protected String outLgIssuerCustAddressAddress1;
    @XmlElement(name = "OutLgIssuerCustAddressAddress2")
    protected String outLgIssuerCustAddressAddress2;
    @XmlElement(name = "OutLgIssuerCustAddressCity")
    protected String outLgIssuerCustAddressCity;
    @XmlElement(name = "OutLgIssuerCustAddressRegion")
    protected String outLgIssuerCustAddressRegion;
    @XmlElement(name = "OutLgIssuerCustAddressTelephone")
    protected String outLgIssuerCustAddressTelephone;
    @XmlElement(name = "OutLgIssuerCustAddressZipCode")
    protected String outLgIssuerCustAddressZipCode;
    @XmlElement(name = "OutLgIssuerCustomerCDigit")
    protected short outLgIssuerCustomerCDigit;
    @XmlElement(name = "OutLgIssuerCustomerCustId")
    protected int outLgIssuerCustomerCustId;
    @XmlElement(name = "OutLgIssuerListSetDescription")
    protected String outLgIssuerListSetDescription;
    @XmlElement(name = "OutLgIssuerOtherIdIdNo")
    protected String outLgIssuerOtherIdIdNo;
    @XmlElement(name = "OutLimitCurrencyIdCurrency")
    protected int outLimitCurrencyIdCurrency;
    @XmlElement(name = "OutLimitCurrencyShortDescr")
    protected String outLimitCurrencyShortDescr;
    @XmlElement(name = "OutMoniringBankemployeeFirstName")
    protected String outMoniringBankemployeeFirstName;
    @XmlElement(name = "OutMoniringBankemployeeId")
    protected String outMoniringBankemployeeId;
    @XmlElement(name = "OutMoniringBankemployeeLastName")
    protected String outMoniringBankemployeeLastName;
    @XmlElement(name = "OutMovingCurrencyDescription")
    protected String outMovingCurrencyDescription;
    @XmlElement(name = "OutMovingCurrencyIdCurrency")
    protected int outMovingCurrencyIdCurrency;
    @XmlElement(name = "OutMovingCurrencyShortDescr")
    protected String outMovingCurrencyShortDescr;
    @XmlElement(name = "OutOpenUnitCode")
    protected int outOpenUnitCode;
    @XmlElement(name = "OutOpenUnitUnitName")
    protected String outOpenUnitUnitName;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutPrintUnitCode")
    protected int outPrintUnitCode;
    @XmlElement(name = "OutPrintUnitUnitName")
    protected String outPrintUnitUnitName;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutProfitsAccountAccountNumber")
    protected String outProfitsAccountAccountNumber;
    @XmlElement(name = "OutReplacedLgAccountAccCd")
    protected short outReplacedLgAccountAccCd;
    @XmlElement(name = "OutReplacedLgAccountAccSn")
    protected double outReplacedLgAccountAccSn;
    @XmlElement(name = "OutReplacedLgAccountAccType")
    protected short outReplacedLgAccountAccType;
    @XmlElement(name = "OutReplacedUnitCode")
    protected int outReplacedUnitCode;
    @XmlElement(name = "OutServerLgAccountAccCd")
    protected short outServerLgAccountAccCd;
    @XmlElement(name = "OutServerLgAccountAccSn")
    protected double outServerLgAccountAccSn;
    @XmlElement(name = "OutServerLgAccountAccType")
    protected short outServerLgAccountAccType;
    @XmlElement(name = "OutServerLgAccountComInd")
    protected String outServerLgAccountComInd;
    @XmlElement(name = "OutServerLgAccountCommissionBal", required = true)
    protected BigDecimal outServerLgAccountCommissionBal;
    @XmlElement(name = "OutServerLgAccountDefaultAmn", required = true)
    protected BigDecimal outServerLgAccountDefaultAmn;
    @XmlElement(name = "OutServerLgAccountExpenseBal", required = true)
    protected BigDecimal outServerLgAccountExpenseBal;
    @XmlElement(name = "OutServerLgAccountExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outServerLgAccountExpiryDt;
    @XmlElement(name = "OutServerLgAccountLgAmountBal", required = true)
    protected BigDecimal outServerLgAccountLgAmountBal;
    @XmlElement(name = "OutServerLgAccountLgDocCount")
    protected short outServerLgAccountLgDocCount;
    @XmlElement(name = "OutServerLgAccountLgFinalDocCnt")
    protected short outServerLgAccountLgFinalDocCnt;
    @XmlElement(name = "OutServerLgAccountMigrateDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outServerLgAccountMigrateDt;
    @XmlElement(name = "OutServerLgAccountOtherBankLgAcc")
    protected String outServerLgAccountOtherBankLgAcc;
    @XmlElement(name = "OutServerLgAccountPendingModifCnt")
    protected short outServerLgAccountPendingModifCnt;
    @XmlElement(name = "OutServerLgAccountReleaseDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outServerLgAccountReleaseDt;
    @XmlElement(name = "OutServerLgAccountRqDefaultAmn", required = true)
    protected BigDecimal outServerLgAccountRqDefaultAmn;
    @XmlElement(name = "OutServerLgAccountTotComInCcAmn", required = true)
    protected BigDecimal outServerLgAccountTotComInCcAmn;
    @XmlElement(name = "OutServerLgAccountTotCommissionAmn", required = true)
    protected BigDecimal outServerLgAccountTotCommissionAmn;
    @XmlElement(name = "OutServerLgAccountTotExpenseAmn", required = true)
    protected BigDecimal outServerLgAccountTotExpenseAmn;
    @XmlElement(name = "OutServerLgAccountTotExpInCcAmn", required = true)
    protected BigDecimal outServerLgAccountTotExpInCcAmn;
    @XmlElement(name = "OutSnActualDocumentSerialNo")
    protected short outSnActualDocumentSerialNo;
    @XmlElement(name = "OutTemplateMswordFilename")
    protected String outTemplateMswordFilename;
    @XmlElement(name = "OutTemplateMswordPathname")
    protected String outTemplateMswordPathname;
    @XmlElement(name = "OutTotalComCollectedIefSuppliedNumber152", required = true)
    protected BigDecimal outTotalComCollectedIefSuppliedNumber152;
    @XmlElement(name = "OutTotalExpCollectedIefSuppliedNumber152", required = true)
    protected BigDecimal outTotalExpCollectedIefSuppliedNumber152;
    @XmlElement(name = "OutGrpAgrBenef")
    protected ArrayOfOutGrpAgrBenef outGrpAgrBenef;
    @XmlElement(name = "OutGrpAgrGuarantor")
    protected ArrayOfOutGrpAgrGuarantor outGrpAgrGuarantor;
    @XmlElement(name = "OutGrpCollatElements")
    protected ArrayOfOutGrpCollatElements outGrpCollatElements;

    /**
     * Gets the value of the outActualDocumentFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutActualDocumentFileName() {
        return outActualDocumentFileName;
    }

    /**
     * Sets the value of the outActualDocumentFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutActualDocumentFileName(String value) {
        this.outActualDocumentFileName = value;
    }

    /**
     * Gets the value of the outActualDocumentMswordFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutActualDocumentMswordFilename() {
        return outActualDocumentMswordFilename;
    }

    /**
     * Sets the value of the outActualDocumentMswordFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutActualDocumentMswordFilename(String value) {
        this.outActualDocumentMswordFilename = value;
    }

    /**
     * Gets the value of the outActualDocumentMswordPathname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutActualDocumentMswordPathname() {
        return outActualDocumentMswordPathname;
    }

    /**
     * Sets the value of the outActualDocumentMswordPathname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutActualDocumentMswordPathname(String value) {
        this.outActualDocumentMswordPathname = value;
    }

    /**
     * Gets the value of the outAgrCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrCharSuppliedChar20() {
        return outAgrCharSuppliedChar20;
    }

    /**
     * Sets the value of the outAgrCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrCharSuppliedChar20(String value) {
        this.outAgrCharSuppliedChar20 = value;
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
     * Gets the value of the outAgrGuarantorCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrGuarantorCustAddressAddress1() {
        return outAgrGuarantorCustAddressAddress1;
    }

    /**
     * Sets the value of the outAgrGuarantorCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrGuarantorCustAddressAddress1(String value) {
        this.outAgrGuarantorCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outAgrGuarantorCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrGuarantorCustAddressAddress2() {
        return outAgrGuarantorCustAddressAddress2;
    }

    /**
     * Sets the value of the outAgrGuarantorCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrGuarantorCustAddressAddress2(String value) {
        this.outAgrGuarantorCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outAgrGuarantorCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrGuarantorCustAddressCity() {
        return outAgrGuarantorCustAddressCity;
    }

    /**
     * Sets the value of the outAgrGuarantorCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrGuarantorCustAddressCity(String value) {
        this.outAgrGuarantorCustAddressCity = value;
    }

    /**
     * Gets the value of the outAgrGuarantorCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrGuarantorCustAddressRegion() {
        return outAgrGuarantorCustAddressRegion;
    }

    /**
     * Sets the value of the outAgrGuarantorCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrGuarantorCustAddressRegion(String value) {
        this.outAgrGuarantorCustAddressRegion = value;
    }

    /**
     * Gets the value of the outAgrGuarantorCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrGuarantorCustAddressTelephone() {
        return outAgrGuarantorCustAddressTelephone;
    }

    /**
     * Sets the value of the outAgrGuarantorCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrGuarantorCustAddressTelephone(String value) {
        this.outAgrGuarantorCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outAgrGuarantorCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrGuarantorCustAddressZipCode() {
        return outAgrGuarantorCustAddressZipCode;
    }

    /**
     * Sets the value of the outAgrGuarantorCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrGuarantorCustAddressZipCode(String value) {
        this.outAgrGuarantorCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outAgrGuarantorOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAgrGuarantorOtherIdIdNo() {
        return outAgrGuarantorOtherIdIdNo;
    }

    /**
     * Sets the value of the outAgrGuarantorOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAgrGuarantorOtherIdIdNo(String value) {
        this.outAgrGuarantorOtherIdIdNo = value;
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
     * Gets the value of the outAgrProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getOutAgrProfitsAccountAgrMembershipSn() {
        return outAgrProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the outAgrProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setOutAgrProfitsAccountAgrMembershipSn(int value) {
        this.outAgrProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountAgrSn property.
     * 
     */
    public int getOutAgrProfitsAccountAgrSn() {
        return outAgrProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the outAgrProfitsAccountAgrSn property.
     * 
     */
    public void setOutAgrProfitsAccountAgrSn(int value) {
        this.outAgrProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountAgrUnit property.
     * 
     */
    public int getOutAgrProfitsAccountAgrUnit() {
        return outAgrProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the outAgrProfitsAccountAgrUnit property.
     * 
     */
    public void setOutAgrProfitsAccountAgrUnit(int value) {
        this.outAgrProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountAgrYear property.
     * 
     */
    public short getOutAgrProfitsAccountAgrYear() {
        return outAgrProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the outAgrProfitsAccountAgrYear property.
     * 
     */
    public void setOutAgrProfitsAccountAgrYear(short value) {
        this.outAgrProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountCustId property.
     * 
     */
    public int getOutAgrProfitsAccountCustId() {
        return outAgrProfitsAccountCustId;
    }

    /**
     * Sets the value of the outAgrProfitsAccountCustId property.
     * 
     */
    public void setOutAgrProfitsAccountCustId(int value) {
        this.outAgrProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutAgrProfitsAccountDepAccNumber() {
        return outAgrProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outAgrProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutAgrProfitsAccountDepAccNumber(double value) {
        this.outAgrProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountLgAccSn property.
     * 
     */
    public double getOutAgrProfitsAccountLgAccSn() {
        return outAgrProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outAgrProfitsAccountLgAccSn property.
     * 
     */
    public void setOutAgrProfitsAccountLgAccSn(double value) {
        this.outAgrProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutAgrProfitsAccountLgOpenUnit() {
        return outAgrProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outAgrProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutAgrProfitsAccountLgOpenUnit(int value) {
        this.outAgrProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountPrftSystem property.
     * 
     */
    public short getOutAgrProfitsAccountPrftSystem() {
        return outAgrProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outAgrProfitsAccountPrftSystem property.
     * 
     */
    public void setOutAgrProfitsAccountPrftSystem(short value) {
        this.outAgrProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outAgrProfitsAccountProductId property.
     * 
     */
    public int getOutAgrProfitsAccountProductId() {
        return outAgrProfitsAccountProductId;
    }

    /**
     * Sets the value of the outAgrProfitsAccountProductId property.
     * 
     */
    public void setOutAgrProfitsAccountProductId(int value) {
        this.outAgrProfitsAccountProductId = value;
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
     * Gets the value of the outCollaborationBanksBankId property.
     * 
     */
    public int getOutCollaborationBanksBankId() {
        return outCollaborationBanksBankId;
    }

    /**
     * Sets the value of the outCollaborationBanksBankId property.
     * 
     */
    public void setOutCollaborationBanksBankId(int value) {
        this.outCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the outCollaborationBanksBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCollaborationBanksBankName() {
        return outCollaborationBanksBankName;
    }

    /**
     * Sets the value of the outCollaborationBanksBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCollaborationBanksBankName(String value) {
        this.outCollaborationBanksBankName = value;
    }

    /**
     * Gets the value of the outCounterCounterTableCntr property.
     * 
     */
    public short getOutCounterCounterTableCntr() {
        return outCounterCounterTableCntr;
    }

    /**
     * Sets the value of the outCounterCounterTableCntr property.
     * 
     */
    public void setOutCounterCounterTableCntr(short value) {
        this.outCounterCounterTableCntr = value;
    }

    /**
     * Gets the value of the outDepCurrencyCurrencyIdCurrency property.
     * 
     */
    public int getOutDepCurrencyCurrencyIdCurrency() {
        return outDepCurrencyCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outDepCurrencyCurrencyIdCurrency property.
     * 
     */
    public void setOutDepCurrencyCurrencyIdCurrency(int value) {
        this.outDepCurrencyCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outDepCurrencyCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepCurrencyCurrencyShortDescr() {
        return outDepCurrencyCurrencyShortDescr;
    }

    /**
     * Sets the value of the outDepCurrencyCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepCurrencyCurrencyShortDescr(String value) {
        this.outDepCurrencyCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountDesignation() {
        return outDepositAccountDesignation;
    }

    /**
     * Sets the value of the outDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountDesignation(String value) {
        this.outDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountAccountCd property.
     * 
     */
    public short getOutDepProfitsAccountAccountCd() {
        return outDepProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the outDepProfitsAccountAccountCd property.
     * 
     */
    public void setOutDepProfitsAccountAccountCd(short value) {
        this.outDepProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepProfitsAccountAccountNumber() {
        return outDepProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outDepProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepProfitsAccountAccountNumber(String value) {
        this.outDepProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountCustId property.
     * 
     */
    public int getOutDepProfitsAccountCustId() {
        return outDepProfitsAccountCustId;
    }

    /**
     * Sets the value of the outDepProfitsAccountCustId property.
     * 
     */
    public void setOutDepProfitsAccountCustId(int value) {
        this.outDepProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountDepAccNumber property.
     * 
     */
    public double getOutDepProfitsAccountDepAccNumber() {
        return outDepProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the outDepProfitsAccountDepAccNumber property.
     * 
     */
    public void setOutDepProfitsAccountDepAccNumber(double value) {
        this.outDepProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountLgAccSn property.
     * 
     */
    public double getOutDepProfitsAccountLgAccSn() {
        return outDepProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the outDepProfitsAccountLgAccSn property.
     * 
     */
    public void setOutDepProfitsAccountLgAccSn(double value) {
        this.outDepProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountLgOpenUnit property.
     * 
     */
    public int getOutDepProfitsAccountLgOpenUnit() {
        return outDepProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the outDepProfitsAccountLgOpenUnit property.
     * 
     */
    public void setOutDepProfitsAccountLgOpenUnit(int value) {
        this.outDepProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountPrftSystem property.
     * 
     */
    public short getOutDepProfitsAccountPrftSystem() {
        return outDepProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the outDepProfitsAccountPrftSystem property.
     * 
     */
    public void setOutDepProfitsAccountPrftSystem(short value) {
        this.outDepProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the outDepProfitsAccountProductId property.
     * 
     */
    public int getOutDepProfitsAccountProductId() {
        return outDepProfitsAccountProductId;
    }

    /**
     * Sets the value of the outDepProfitsAccountProductId property.
     * 
     */
    public void setOutDepProfitsAccountProductId(int value) {
        this.outDepProfitsAccountProductId = value;
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
     * Gets the value of the outEvaluationResultTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationResultTeamInformationAuthorizationType() {
        return outEvaluationResultTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvaluationResultTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationResultTeamInformationAuthorizationType(String value) {
        this.outEvaluationResultTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outEvaluationResultTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationResultTeamInformationEvaluationResult() {
        return outEvaluationResultTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outEvaluationResultTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationResultTeamInformationEvaluationResult(String value) {
        this.outEvaluationResultTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outEvaluationResultTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationResultTeamInformationRequiredProfile1() {
        return outEvaluationResultTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvaluationResultTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationResultTeamInformationRequiredProfile1(String value) {
        this.outEvaluationResultTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvaluationResultTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationResultTeamInformationRequiredProfile2() {
        return outEvaluationResultTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvaluationResultTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationResultTeamInformationRequiredProfile2(String value) {
        this.outEvaluationResultTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outFilenameIefSuppliedString255 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFilenameIefSuppliedString255() {
        return outFilenameIefSuppliedString255;
    }

    /**
     * Sets the value of the outFilenameIefSuppliedString255 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFilenameIefSuppliedString255(String value) {
        this.outFilenameIefSuppliedString255 = value;
    }

    /**
     * Gets the value of the outFxtypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutFxtypeGenericDetailDescription() {
        return outFxtypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outFxtypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutFxtypeGenericDetailDescription(String value) {
        this.outFxtypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outFxtypeGenericDetailSerialNum property.
     * 
     */
    public int getOutFxtypeGenericDetailSerialNum() {
        return outFxtypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outFxtypeGenericDetailSerialNum property.
     * 
     */
    public void setOutFxtypeGenericDetailSerialNum(int value) {
        this.outFxtypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGenericDetailInfoLatinDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGenericDetailInfoLatinDescription() {
        return outGenericDetailInfoLatinDescription;
    }

    /**
     * Sets the value of the outGenericDetailInfoLatinDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGenericDetailInfoLatinDescription(String value) {
        this.outGenericDetailInfoLatinDescription = value;
    }

    /**
     * Gets the value of the outJournalComCollectedIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutJournalComCollectedIefSuppliedNumber152() {
        return outJournalComCollectedIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outJournalComCollectedIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutJournalComCollectedIefSuppliedNumber152(BigDecimal value) {
        this.outJournalComCollectedIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outJournalExpCollectedIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutJournalExpCollectedIefSuppliedNumber152() {
        return outJournalExpCollectedIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outJournalExpCollectedIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutJournalExpCollectedIefSuppliedNumber152(BigDecimal value) {
        this.outJournalExpCollectedIefSuppliedNumber152 = value;
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
     * Gets the value of the outLanguageGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLanguageGenericDetailDescription() {
        return outLanguageGenericDetailDescription;
    }

    /**
     * Sets the value of the outLanguageGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLanguageGenericDetailDescription(String value) {
        this.outLanguageGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outLanguageGenericDetailSerialNum property.
     * 
     */
    public int getOutLanguageGenericDetailSerialNum() {
        return outLanguageGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outLanguageGenericDetailSerialNum property.
     * 
     */
    public void setOutLanguageGenericDetailSerialNum(int value) {
        this.outLanguageGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outLgLgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgLgType() {
        return outLgLgType;
    }

    /**
     * Sets the value of the outLgLgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgLgType(String value) {
        this.outLgLgType = value;
    }

    /**
     * Gets the value of the outLgWithinLimitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgWithinLimitFlg() {
        return outLgWithinLimitFlg;
    }

    /**
     * Sets the value of the outLgWithinLimitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgWithinLimitFlg(String value) {
        this.outLgWithinLimitFlg = value;
    }

    /**
     * Gets the value of the outLgAccountAccCd property.
     * 
     */
    public short getOutLgAccountAccCd() {
        return outLgAccountAccCd;
    }

    /**
     * Sets the value of the outLgAccountAccCd property.
     * 
     */
    public void setOutLgAccountAccCd(short value) {
        this.outLgAccountAccCd = value;
    }

    /**
     * Gets the value of the outLgAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountAccLimitAmn() {
        return outLgAccountAccLimitAmn;
    }

    /**
     * Sets the value of the outLgAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountAccLimitAmn(BigDecimal value) {
        this.outLgAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the outLgAccountAccOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountAccOpenDt() {
        return outLgAccountAccOpenDt;
    }

    /**
     * Sets the value of the outLgAccountAccOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountAccOpenDt(XMLGregorianCalendar value) {
        this.outLgAccountAccOpenDt = value;
    }

    /**
     * Gets the value of the outLgAccountAccSn property.
     * 
     */
    public double getOutLgAccountAccSn() {
        return outLgAccountAccSn;
    }

    /**
     * Sets the value of the outLgAccountAccSn property.
     * 
     */
    public void setOutLgAccountAccSn(double value) {
        this.outLgAccountAccSn = value;
    }

    /**
     * Gets the value of the outLgAccountAccSpcAgrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountAccSpcAgrFlg() {
        return outLgAccountAccSpcAgrFlg;
    }

    /**
     * Sets the value of the outLgAccountAccSpcAgrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountAccSpcAgrFlg(String value) {
        this.outLgAccountAccSpcAgrFlg = value;
    }

    /**
     * Gets the value of the outLgAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountAccStatus() {
        return outLgAccountAccStatus;
    }

    /**
     * Sets the value of the outLgAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountAccStatus(String value) {
        this.outLgAccountAccStatus = value;
    }

    /**
     * Gets the value of the outLgAccountAccType property.
     * 
     */
    public short getOutLgAccountAccType() {
        return outLgAccountAccType;
    }

    /**
     * Sets the value of the outLgAccountAccType property.
     * 
     */
    public void setOutLgAccountAccType(short value) {
        this.outLgAccountAccType = value;
    }

    /**
     * Gets the value of the outLgAccountCancellationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountCancellationDt() {
        return outLgAccountCancellationDt;
    }

    /**
     * Sets the value of the outLgAccountCancellationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountCancellationDt(XMLGregorianCalendar value) {
        this.outLgAccountCancellationDt = value;
    }

    /**
     * Gets the value of the outLgAccountCifAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountCifAmount() {
        return outLgAccountCifAmount;
    }

    /**
     * Sets the value of the outLgAccountCifAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountCifAmount(BigDecimal value) {
        this.outLgAccountCifAmount = value;
    }

    /**
     * Gets the value of the outLgAccountCifCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountCifCurrency() {
        return outLgAccountCifCurrency;
    }

    /**
     * Sets the value of the outLgAccountCifCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountCifCurrency(String value) {
        this.outLgAccountCifCurrency = value;
    }

    /**
     * Gets the value of the outLgAccountComChargeFrq property.
     * 
     */
    public short getOutLgAccountComChargeFrq() {
        return outLgAccountComChargeFrq;
    }

    /**
     * Sets the value of the outLgAccountComChargeFrq property.
     * 
     */
    public void setOutLgAccountComChargeFrq(short value) {
        this.outLgAccountComChargeFrq = value;
    }

    /**
     * Gets the value of the outLgAccountComChargeFrqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountComChargeFrqTyp() {
        return outLgAccountComChargeFrqTyp;
    }

    /**
     * Sets the value of the outLgAccountComChargeFrqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountComChargeFrqTyp(String value) {
        this.outLgAccountComChargeFrqTyp = value;
    }

    /**
     * Gets the value of the outLgAccountComInAcBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountComInAcBal() {
        return outLgAccountComInAcBal;
    }

    /**
     * Sets the value of the outLgAccountComInAcBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountComInAcBal(BigDecimal value) {
        this.outLgAccountComInAcBal = value;
    }

    /**
     * Gets the value of the outLgAccountComInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountComInd() {
        return outLgAccountComInd;
    }

    /**
     * Sets the value of the outLgAccountComInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountComInd(String value) {
        this.outLgAccountComInd = value;
    }

    /**
     * Gets the value of the outLgAccountComment1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountComment1() {
        return outLgAccountComment1;
    }

    /**
     * Sets the value of the outLgAccountComment1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountComment1(String value) {
        this.outLgAccountComment1 = value;
    }

    /**
     * Gets the value of the outLgAccountComment2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountComment2() {
        return outLgAccountComment2;
    }

    /**
     * Sets the value of the outLgAccountComment2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountComment2(String value) {
        this.outLgAccountComment2 = value;
    }

    /**
     * Gets the value of the outLgAccountCommissionBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountCommissionBal() {
        return outLgAccountCommissionBal;
    }

    /**
     * Sets the value of the outLgAccountCommissionBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountCommissionBal(BigDecimal value) {
        this.outLgAccountCommissionBal = value;
    }

    /**
     * Gets the value of the outLgAccountCusStmLstTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountCusStmLstTrnDt() {
        return outLgAccountCusStmLstTrnDt;
    }

    /**
     * Sets the value of the outLgAccountCusStmLstTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountCusStmLstTrnDt(XMLGregorianCalendar value) {
        this.outLgAccountCusStmLstTrnDt = value;
    }

    /**
     * Gets the value of the outLgAccountCusStmNxtTrnDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountCusStmNxtTrnDt() {
        return outLgAccountCusStmNxtTrnDt;
    }

    /**
     * Sets the value of the outLgAccountCusStmNxtTrnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountCusStmNxtTrnDt(XMLGregorianCalendar value) {
        this.outLgAccountCusStmNxtTrnDt = value;
    }

    /**
     * Gets the value of the outLgAccountDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountDefaultAmn() {
        return outLgAccountDefaultAmn;
    }

    /**
     * Sets the value of the outLgAccountDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountDefaultAmn(BigDecimal value) {
        this.outLgAccountDefaultAmn = value;
    }

    /**
     * Gets the value of the outLgAccountDefaultDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountDefaultDate() {
        return outLgAccountDefaultDate;
    }

    /**
     * Sets the value of the outLgAccountDefaultDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountDefaultDate(XMLGregorianCalendar value) {
        this.outLgAccountDefaultDate = value;
    }

    /**
     * Gets the value of the outLgAccountDefaultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountDefaultType() {
        return outLgAccountDefaultType;
    }

    /**
     * Sets the value of the outLgAccountDefaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountDefaultType(String value) {
        this.outLgAccountDefaultType = value;
    }

    /**
     * Gets the value of the outLgAccountDepAccCd property.
     * 
     */
    public short getOutLgAccountDepAccCd() {
        return outLgAccountDepAccCd;
    }

    /**
     * Sets the value of the outLgAccountDepAccCd property.
     * 
     */
    public void setOutLgAccountDepAccCd(short value) {
        this.outLgAccountDepAccCd = value;
    }

    /**
     * Gets the value of the outLgAccountDepAccSn property.
     * 
     */
    public double getOutLgAccountDepAccSn() {
        return outLgAccountDepAccSn;
    }

    /**
     * Sets the value of the outLgAccountDepAccSn property.
     * 
     */
    public void setOutLgAccountDepAccSn(double value) {
        this.outLgAccountDepAccSn = value;
    }

    /**
     * Gets the value of the outLgAccountDepAccType property.
     * 
     */
    public short getOutLgAccountDepAccType() {
        return outLgAccountDepAccType;
    }

    /**
     * Sets the value of the outLgAccountDepAccType property.
     * 
     */
    public void setOutLgAccountDepAccType(short value) {
        this.outLgAccountDepAccType = value;
    }

    /**
     * Gets the value of the outLgAccountDepAccUnit property.
     * 
     */
    public int getOutLgAccountDepAccUnit() {
        return outLgAccountDepAccUnit;
    }

    /**
     * Sets the value of the outLgAccountDepAccUnit property.
     * 
     */
    public void setOutLgAccountDepAccUnit(int value) {
        this.outLgAccountDepAccUnit = value;
    }

    /**
     * Gets the value of the outLgAccountExpenseBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountExpenseBal() {
        return outLgAccountExpenseBal;
    }

    /**
     * Sets the value of the outLgAccountExpenseBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountExpenseBal(BigDecimal value) {
        this.outLgAccountExpenseBal = value;
    }

    /**
     * Gets the value of the outLgAccountExpInAcBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountExpInAcBal() {
        return outLgAccountExpInAcBal;
    }

    /**
     * Sets the value of the outLgAccountExpInAcBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountExpInAcBal(BigDecimal value) {
        this.outLgAccountExpInAcBal = value;
    }

    /**
     * Gets the value of the outLgAccountExpirationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountExpirationType() {
        return outLgAccountExpirationType;
    }

    /**
     * Sets the value of the outLgAccountExpirationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountExpirationType(String value) {
        this.outLgAccountExpirationType = value;
    }

    /**
     * Gets the value of the outLgAccountExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountExpiryDt() {
        return outLgAccountExpiryDt;
    }

    /**
     * Sets the value of the outLgAccountExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountExpiryDt(XMLGregorianCalendar value) {
        this.outLgAccountExpiryDt = value;
    }

    /**
     * Gets the value of the outLgAccountGuaranteeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountGuaranteeDt() {
        return outLgAccountGuaranteeDt;
    }

    /**
     * Sets the value of the outLgAccountGuaranteeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountGuaranteeDt(XMLGregorianCalendar value) {
        this.outLgAccountGuaranteeDt = value;
    }

    /**
     * Gets the value of the outLgAccountIssuanceJustific property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountIssuanceJustific() {
        return outLgAccountIssuanceJustific;
    }

    /**
     * Sets the value of the outLgAccountIssuanceJustific property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountIssuanceJustific(String value) {
        this.outLgAccountIssuanceJustific = value;
    }

    /**
     * Gets the value of the outLgAccountLanguageCode property.
     * 
     */
    public int getOutLgAccountLanguageCode() {
        return outLgAccountLanguageCode;
    }

    /**
     * Sets the value of the outLgAccountLanguageCode property.
     * 
     */
    public void setOutLgAccountLanguageCode(int value) {
        this.outLgAccountLanguageCode = value;
    }

    /**
     * Gets the value of the outLgAccountLastUpdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountLastUpdDt() {
        return outLgAccountLastUpdDt;
    }

    /**
     * Sets the value of the outLgAccountLastUpdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountLastUpdDt(XMLGregorianCalendar value) {
        this.outLgAccountLastUpdDt = value;
    }

    /**
     * Gets the value of the outLgAccountLgAmnTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountLgAmnTolerance() {
        return outLgAccountLgAmnTolerance;
    }

    /**
     * Sets the value of the outLgAccountLgAmnTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountLgAmnTolerance(BigDecimal value) {
        this.outLgAccountLgAmnTolerance = value;
    }

    /**
     * Gets the value of the outLgAccountLgAmountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountLgAmountBal() {
        return outLgAccountLgAmountBal;
    }

    /**
     * Sets the value of the outLgAccountLgAmountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountLgAmountBal(BigDecimal value) {
        this.outLgAccountLgAmountBal = value;
    }

    /**
     * Gets the value of the outLgAccountLgBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountLgBody() {
        return outLgAccountLgBody;
    }

    /**
     * Sets the value of the outLgAccountLgBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountLgBody(String value) {
        this.outLgAccountLgBody = value;
    }

    /**
     * Gets the value of the outLgAccountLgDocCount property.
     * 
     */
    public short getOutLgAccountLgDocCount() {
        return outLgAccountLgDocCount;
    }

    /**
     * Sets the value of the outLgAccountLgDocCount property.
     * 
     */
    public void setOutLgAccountLgDocCount(short value) {
        this.outLgAccountLgDocCount = value;
    }

    /**
     * Gets the value of the outLgAccountLgExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountLgExtension() {
        return outLgAccountLgExtension;
    }

    /**
     * Sets the value of the outLgAccountLgExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountLgExtension(String value) {
        this.outLgAccountLgExtension = value;
    }

    /**
     * Gets the value of the outLgAccountLgFinalDocCnt property.
     * 
     */
    public short getOutLgAccountLgFinalDocCnt() {
        return outLgAccountLgFinalDocCnt;
    }

    /**
     * Sets the value of the outLgAccountLgFinalDocCnt property.
     * 
     */
    public void setOutLgAccountLgFinalDocCnt(short value) {
        this.outLgAccountLgFinalDocCnt = value;
    }

    /**
     * Gets the value of the outLgAccountLgInitialAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountLgInitialAmn() {
        return outLgAccountLgInitialAmn;
    }

    /**
     * Sets the value of the outLgAccountLgInitialAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountLgInitialAmn(BigDecimal value) {
        this.outLgAccountLgInitialAmn = value;
    }

    /**
     * Gets the value of the outLgAccountLgOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountLgOverdue() {
        return outLgAccountLgOverdue;
    }

    /**
     * Sets the value of the outLgAccountLgOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountLgOverdue(String value) {
        this.outLgAccountLgOverdue = value;
    }

    /**
     * Gets the value of the outLgAccountLnsCd property.
     * 
     */
    public short getOutLgAccountLnsCd() {
        return outLgAccountLnsCd;
    }

    /**
     * Sets the value of the outLgAccountLnsCd property.
     * 
     */
    public void setOutLgAccountLnsCd(short value) {
        this.outLgAccountLnsCd = value;
    }

    /**
     * Gets the value of the outLgAccountLnsSn property.
     * 
     */
    public int getOutLgAccountLnsSn() {
        return outLgAccountLnsSn;
    }

    /**
     * Sets the value of the outLgAccountLnsSn property.
     * 
     */
    public void setOutLgAccountLnsSn(int value) {
        this.outLgAccountLnsSn = value;
    }

    /**
     * Gets the value of the outLgAccountLnsType property.
     * 
     */
    public short getOutLgAccountLnsType() {
        return outLgAccountLnsType;
    }

    /**
     * Sets the value of the outLgAccountLnsType property.
     * 
     */
    public void setOutLgAccountLnsType(short value) {
        this.outLgAccountLnsType = value;
    }

    /**
     * Gets the value of the outLgAccountLnsUnit property.
     * 
     */
    public int getOutLgAccountLnsUnit() {
        return outLgAccountLnsUnit;
    }

    /**
     * Sets the value of the outLgAccountLnsUnit property.
     * 
     */
    public void setOutLgAccountLnsUnit(int value) {
        this.outLgAccountLnsUnit = value;
    }

    /**
     * Gets the value of the outLgAccountMigrateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountMigrateDt() {
        return outLgAccountMigrateDt;
    }

    /**
     * Sets the value of the outLgAccountMigrateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountMigrateDt(XMLGregorianCalendar value) {
        this.outLgAccountMigrateDt = value;
    }

    /**
     * Gets the value of the outLgAccountNextCommissDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountNextCommissDt() {
        return outLgAccountNextCommissDt;
    }

    /**
     * Sets the value of the outLgAccountNextCommissDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountNextCommissDt(XMLGregorianCalendar value) {
        this.outLgAccountNextCommissDt = value;
    }

    /**
     * Gets the value of the outLgAccountObligationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountObligationStatus() {
        return outLgAccountObligationStatus;
    }

    /**
     * Sets the value of the outLgAccountObligationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountObligationStatus(String value) {
        this.outLgAccountObligationStatus = value;
    }

    /**
     * Gets the value of the outLgAccountOldAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountOldAccount() {
        return outLgAccountOldAccount;
    }

    /**
     * Sets the value of the outLgAccountOldAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountOldAccount(String value) {
        this.outLgAccountOldAccount = value;
    }

    /**
     * Gets the value of the outLgAccountOtherBankLgAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountOtherBankLgAcc() {
        return outLgAccountOtherBankLgAcc;
    }

    /**
     * Sets the value of the outLgAccountOtherBankLgAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountOtherBankLgAcc(String value) {
        this.outLgAccountOtherBankLgAcc = value;
    }

    /**
     * Gets the value of the outLgAccountPendingModifCnt property.
     * 
     */
    public short getOutLgAccountPendingModifCnt() {
        return outLgAccountPendingModifCnt;
    }

    /**
     * Sets the value of the outLgAccountPendingModifCnt property.
     * 
     */
    public void setOutLgAccountPendingModifCnt(short value) {
        this.outLgAccountPendingModifCnt = value;
    }

    /**
     * Gets the value of the outLgAccountPostCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountPostCharges() {
        return outLgAccountPostCharges;
    }

    /**
     * Sets the value of the outLgAccountPostCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountPostCharges(BigDecimal value) {
        this.outLgAccountPostCharges = value;
    }

    /**
     * Gets the value of the outLgAccountPurchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountPurchaseAmount() {
        return outLgAccountPurchaseAmount;
    }

    /**
     * Sets the value of the outLgAccountPurchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountPurchaseAmount(BigDecimal value) {
        this.outLgAccountPurchaseAmount = value;
    }

    /**
     * Gets the value of the outLgAccountPurchaseAmtPcg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountPurchaseAmtPcg() {
        return outLgAccountPurchaseAmtPcg;
    }

    /**
     * Sets the value of the outLgAccountPurchaseAmtPcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountPurchaseAmtPcg(BigDecimal value) {
        this.outLgAccountPurchaseAmtPcg = value;
    }

    /**
     * Gets the value of the outLgAccountPurchaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountPurchaseCurrency() {
        return outLgAccountPurchaseCurrency;
    }

    /**
     * Sets the value of the outLgAccountPurchaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountPurchaseCurrency(String value) {
        this.outLgAccountPurchaseCurrency = value;
    }

    /**
     * Gets the value of the outLgAccountPurchaseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountPurchaseNo() {
        return outLgAccountPurchaseNo;
    }

    /**
     * Sets the value of the outLgAccountPurchaseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountPurchaseNo(String value) {
        this.outLgAccountPurchaseNo = value;
    }

    /**
     * Gets the value of the outLgAccountReleaseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountReleaseDt() {
        return outLgAccountReleaseDt;
    }

    /**
     * Sets the value of the outLgAccountReleaseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountReleaseDt(XMLGregorianCalendar value) {
        this.outLgAccountReleaseDt = value;
    }

    /**
     * Gets the value of the outLgAccountReplacementReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountReplacementReason() {
        return outLgAccountReplacementReason;
    }

    /**
     * Sets the value of the outLgAccountReplacementReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountReplacementReason(String value) {
        this.outLgAccountReplacementReason = value;
    }

    /**
     * Gets the value of the outLgAccountRqDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountRqDefaultAmn() {
        return outLgAccountRqDefaultAmn;
    }

    /**
     * Sets the value of the outLgAccountRqDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountRqDefaultAmn(BigDecimal value) {
        this.outLgAccountRqDefaultAmn = value;
    }

    /**
     * Gets the value of the outLgAccountRqDefaultDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountRqDefaultDt() {
        return outLgAccountRqDefaultDt;
    }

    /**
     * Sets the value of the outLgAccountRqDefaultDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountRqDefaultDt(XMLGregorianCalendar value) {
        this.outLgAccountRqDefaultDt = value;
    }

    /**
     * Gets the value of the outLgAccountRqDefaultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountRqDefaultType() {
        return outLgAccountRqDefaultType;
    }

    /**
     * Sets the value of the outLgAccountRqDefaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountRqDefaultType(String value) {
        this.outLgAccountRqDefaultType = value;
    }

    /**
     * Gets the value of the outLgAccountStampCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountStampCharges() {
        return outLgAccountStampCharges;
    }

    /**
     * Sets the value of the outLgAccountStampCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountStampCharges(BigDecimal value) {
        this.outLgAccountStampCharges = value;
    }

    /**
     * Gets the value of the outLgAccountStopCommissionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountStopCommissionDt() {
        return outLgAccountStopCommissionDt;
    }

    /**
     * Sets the value of the outLgAccountStopCommissionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountStopCommissionDt(XMLGregorianCalendar value) {
        this.outLgAccountStopCommissionDt = value;
    }

    /**
     * Gets the value of the outLgAccountTelegraphCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTelegraphCharges() {
        return outLgAccountTelegraphCharges;
    }

    /**
     * Sets the value of the outLgAccountTelegraphCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTelegraphCharges(BigDecimal value) {
        this.outLgAccountTelegraphCharges = value;
    }

    /**
     * Gets the value of the outLgAccountTelephoneCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTelephoneCharges() {
        return outLgAccountTelephoneCharges;
    }

    /**
     * Sets the value of the outLgAccountTelephoneCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTelephoneCharges(BigDecimal value) {
        this.outLgAccountTelephoneCharges = value;
    }

    /**
     * Gets the value of the outLgAccountTenderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountTenderDate() {
        return outLgAccountTenderDate;
    }

    /**
     * Sets the value of the outLgAccountTenderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountTenderDate(XMLGregorianCalendar value) {
        this.outLgAccountTenderDate = value;
    }

    /**
     * Gets the value of the outLgAccountTenderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountTenderNo() {
        return outLgAccountTenderNo;
    }

    /**
     * Sets the value of the outLgAccountTenderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountTenderNo(String value) {
        this.outLgAccountTenderNo = value;
    }

    /**
     * Gets the value of the outLgAccountThirdAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdAddress1() {
        return outLgAccountThirdAddress1;
    }

    /**
     * Sets the value of the outLgAccountThirdAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdAddress1(String value) {
        this.outLgAccountThirdAddress1 = value;
    }

    /**
     * Gets the value of the outLgAccountThirdAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdAddress2() {
        return outLgAccountThirdAddress2;
    }

    /**
     * Sets the value of the outLgAccountThirdAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdAddress2(String value) {
        this.outLgAccountThirdAddress2 = value;
    }

    /**
     * Gets the value of the outLgAccountThirdCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdCity() {
        return outLgAccountThirdCity;
    }

    /**
     * Sets the value of the outLgAccountThirdCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdCity(String value) {
        this.outLgAccountThirdCity = value;
    }

    /**
     * Gets the value of the outLgAccountThirdCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdCountry() {
        return outLgAccountThirdCountry;
    }

    /**
     * Sets the value of the outLgAccountThirdCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdCountry(String value) {
        this.outLgAccountThirdCountry = value;
    }

    /**
     * Gets the value of the outLgAccountThirdPartyNam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdPartyNam() {
        return outLgAccountThirdPartyNam;
    }

    /**
     * Sets the value of the outLgAccountThirdPartyNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdPartyNam(String value) {
        this.outLgAccountThirdPartyNam = value;
    }

    /**
     * Gets the value of the outLgAccountThirdTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdTelephone1() {
        return outLgAccountThirdTelephone1;
    }

    /**
     * Sets the value of the outLgAccountThirdTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdTelephone1(String value) {
        this.outLgAccountThirdTelephone1 = value;
    }

    /**
     * Gets the value of the outLgAccountThirdZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountThirdZipCode() {
        return outLgAccountThirdZipCode;
    }

    /**
     * Sets the value of the outLgAccountThirdZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountThirdZipCode(String value) {
        this.outLgAccountThirdZipCode = value;
    }

    /**
     * Gets the value of the outLgAccountTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutLgAccountTmstamp() {
        return outLgAccountTmstamp;
    }

    /**
     * Sets the value of the outLgAccountTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutLgAccountTmstamp(XMLGregorianCalendar value) {
        this.outLgAccountTmstamp = value;
    }

    /**
     * Gets the value of the outLgAccountTotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotalTax() {
        return outLgAccountTotalTax;
    }

    /**
     * Sets the value of the outLgAccountTotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotalTax(BigDecimal value) {
        this.outLgAccountTotalTax = value;
    }

    /**
     * Gets the value of the outLgAccountTotComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotComInCcAmn() {
        return outLgAccountTotComInCcAmn;
    }

    /**
     * Sets the value of the outLgAccountTotComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotComInCcAmn(BigDecimal value) {
        this.outLgAccountTotComInCcAmn = value;
    }

    /**
     * Gets the value of the outLgAccountTotCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotCommissionAmn() {
        return outLgAccountTotCommissionAmn;
    }

    /**
     * Sets the value of the outLgAccountTotCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotCommissionAmn(BigDecimal value) {
        this.outLgAccountTotCommissionAmn = value;
    }

    /**
     * Gets the value of the outLgAccountTotExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotExpenseAmn() {
        return outLgAccountTotExpenseAmn;
    }

    /**
     * Sets the value of the outLgAccountTotExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotExpenseAmn(BigDecimal value) {
        this.outLgAccountTotExpenseAmn = value;
    }

    /**
     * Gets the value of the outLgAccountTotExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutLgAccountTotExpInCcAmn() {
        return outLgAccountTotExpInCcAmn;
    }

    /**
     * Sets the value of the outLgAccountTotExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutLgAccountTotExpInCcAmn(BigDecimal value) {
        this.outLgAccountTotExpInCcAmn = value;
    }

    /**
     * Gets the value of the outLgAccountUnit property.
     * 
     */
    public int getOutLgAccountUnit() {
        return outLgAccountUnit;
    }

    /**
     * Sets the value of the outLgAccountUnit property.
     * 
     */
    public void setOutLgAccountUnit(int value) {
        this.outLgAccountUnit = value;
    }

    /**
     * Gets the value of the outLgAccountUrlComFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccountUrlComFlg() {
        return outLgAccountUrlComFlg;
    }

    /**
     * Sets the value of the outLgAccountUrlComFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccountUrlComFlg(String value) {
        this.outLgAccountUrlComFlg = value;
    }

    /**
     * Gets the value of the outLgAccUnitCode property.
     * 
     */
    public int getOutLgAccUnitCode() {
        return outLgAccUnitCode;
    }

    /**
     * Sets the value of the outLgAccUnitCode property.
     * 
     */
    public void setOutLgAccUnitCode(int value) {
        this.outLgAccUnitCode = value;
    }

    /**
     * Gets the value of the outLgAccUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgAccUnitUnitName() {
        return outLgAccUnitUnitName;
    }

    /**
     * Sets the value of the outLgAccUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgAccUnitUnitName(String value) {
        this.outLgAccUnitUnitName = value;
    }

    /**
     * Gets the value of the outLgBenef2CustomerCDigit property.
     * 
     */
    public short getOutLgBenef2CustomerCDigit() {
        return outLgBenef2CustomerCDigit;
    }

    /**
     * Sets the value of the outLgBenef2CustomerCDigit property.
     * 
     */
    public void setOutLgBenef2CustomerCDigit(short value) {
        this.outLgBenef2CustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgBenef2CustomerCustId property.
     * 
     */
    public int getOutLgBenef2CustomerCustId() {
        return outLgBenef2CustomerCustId;
    }

    /**
     * Sets the value of the outLgBenef2CustomerCustId property.
     * 
     */
    public void setOutLgBenef2CustomerCustId(int value) {
        this.outLgBenef2CustomerCustId = value;
    }

    /**
     * Gets the value of the outLgBenef2ListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenef2ListSetDescription() {
        return outLgBenef2ListSetDescription;
    }

    /**
     * Sets the value of the outLgBenef2ListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenef2ListSetDescription(String value) {
        this.outLgBenef2ListSetDescription = value;
    }

    /**
     * Gets the value of the outLgBenef3CustomerCDigit property.
     * 
     */
    public short getOutLgBenef3CustomerCDigit() {
        return outLgBenef3CustomerCDigit;
    }

    /**
     * Sets the value of the outLgBenef3CustomerCDigit property.
     * 
     */
    public void setOutLgBenef3CustomerCDigit(short value) {
        this.outLgBenef3CustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgBenef3CustomerCustId property.
     * 
     */
    public int getOutLgBenef3CustomerCustId() {
        return outLgBenef3CustomerCustId;
    }

    /**
     * Sets the value of the outLgBenef3CustomerCustId property.
     * 
     */
    public void setOutLgBenef3CustomerCustId(int value) {
        this.outLgBenef3CustomerCustId = value;
    }

    /**
     * Gets the value of the outLgBenef3ListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenef3ListSetDescription() {
        return outLgBenef3ListSetDescription;
    }

    /**
     * Sets the value of the outLgBenef3ListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenef3ListSetDescription(String value) {
        this.outLgBenef3ListSetDescription = value;
    }

    /**
     * Gets the value of the outLgBenef4CustomerCDigit property.
     * 
     */
    public short getOutLgBenef4CustomerCDigit() {
        return outLgBenef4CustomerCDigit;
    }

    /**
     * Sets the value of the outLgBenef4CustomerCDigit property.
     * 
     */
    public void setOutLgBenef4CustomerCDigit(short value) {
        this.outLgBenef4CustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgBenef4CustomerCustId property.
     * 
     */
    public int getOutLgBenef4CustomerCustId() {
        return outLgBenef4CustomerCustId;
    }

    /**
     * Sets the value of the outLgBenef4CustomerCustId property.
     * 
     */
    public void setOutLgBenef4CustomerCustId(int value) {
        this.outLgBenef4CustomerCustId = value;
    }

    /**
     * Gets the value of the outLgBenef4ListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenef4ListSetDescription() {
        return outLgBenef4ListSetDescription;
    }

    /**
     * Sets the value of the outLgBenef4ListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenef4ListSetDescription(String value) {
        this.outLgBenef4ListSetDescription = value;
    }

    /**
     * Gets the value of the outLgBenef5CustomerCDigit property.
     * 
     */
    public short getOutLgBenef5CustomerCDigit() {
        return outLgBenef5CustomerCDigit;
    }

    /**
     * Sets the value of the outLgBenef5CustomerCDigit property.
     * 
     */
    public void setOutLgBenef5CustomerCDigit(short value) {
        this.outLgBenef5CustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgBenef5CustomerCustId property.
     * 
     */
    public int getOutLgBenef5CustomerCustId() {
        return outLgBenef5CustomerCustId;
    }

    /**
     * Sets the value of the outLgBenef5CustomerCustId property.
     * 
     */
    public void setOutLgBenef5CustomerCustId(int value) {
        this.outLgBenef5CustomerCustId = value;
    }

    /**
     * Gets the value of the outLgBenef5ListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenef5ListSetDescription() {
        return outLgBenef5ListSetDescription;
    }

    /**
     * Sets the value of the outLgBenef5ListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenef5ListSetDescription(String value) {
        this.outLgBenef5ListSetDescription = value;
    }

    /**
     * Gets the value of the outLgBenefCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenefCustAddressAddress1() {
        return outLgBenefCustAddressAddress1;
    }

    /**
     * Sets the value of the outLgBenefCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenefCustAddressAddress1(String value) {
        this.outLgBenefCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outLgBenefCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenefCustAddressAddress2() {
        return outLgBenefCustAddressAddress2;
    }

    /**
     * Sets the value of the outLgBenefCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenefCustAddressAddress2(String value) {
        this.outLgBenefCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outLgBenefCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenefCustAddressCity() {
        return outLgBenefCustAddressCity;
    }

    /**
     * Sets the value of the outLgBenefCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenefCustAddressCity(String value) {
        this.outLgBenefCustAddressCity = value;
    }

    /**
     * Gets the value of the outLgBenefCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenefCustAddressRegion() {
        return outLgBenefCustAddressRegion;
    }

    /**
     * Sets the value of the outLgBenefCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenefCustAddressRegion(String value) {
        this.outLgBenefCustAddressRegion = value;
    }

    /**
     * Gets the value of the outLgBenefCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenefCustAddressTelephone() {
        return outLgBenefCustAddressTelephone;
    }

    /**
     * Sets the value of the outLgBenefCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenefCustAddressTelephone(String value) {
        this.outLgBenefCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outLgBenefCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenefCustAddressZipCode() {
        return outLgBenefCustAddressZipCode;
    }

    /**
     * Sets the value of the outLgBenefCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenefCustAddressZipCode(String value) {
        this.outLgBenefCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outLgBenefCustomerCDigit property.
     * 
     */
    public short getOutLgBenefCustomerCDigit() {
        return outLgBenefCustomerCDigit;
    }

    /**
     * Sets the value of the outLgBenefCustomerCDigit property.
     * 
     */
    public void setOutLgBenefCustomerCDigit(short value) {
        this.outLgBenefCustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgBenefCustomerCustId property.
     * 
     */
    public int getOutLgBenefCustomerCustId() {
        return outLgBenefCustomerCustId;
    }

    /**
     * Sets the value of the outLgBenefCustomerCustId property.
     * 
     */
    public void setOutLgBenefCustomerCustId(int value) {
        this.outLgBenefCustomerCustId = value;
    }

    /**
     * Gets the value of the outLgBenefListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgBenefListSetDescription() {
        return outLgBenefListSetDescription;
    }

    /**
     * Sets the value of the outLgBenefListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgBenefListSetDescription(String value) {
        this.outLgBenefListSetDescription = value;
    }

    /**
     * Gets the value of the outLgIssuer2CustomerCDigit property.
     * 
     */
    public short getOutLgIssuer2CustomerCDigit() {
        return outLgIssuer2CustomerCDigit;
    }

    /**
     * Sets the value of the outLgIssuer2CustomerCDigit property.
     * 
     */
    public void setOutLgIssuer2CustomerCDigit(short value) {
        this.outLgIssuer2CustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgIssuer2CustomerCustId property.
     * 
     */
    public int getOutLgIssuer2CustomerCustId() {
        return outLgIssuer2CustomerCustId;
    }

    /**
     * Sets the value of the outLgIssuer2CustomerCustId property.
     * 
     */
    public void setOutLgIssuer2CustomerCustId(int value) {
        this.outLgIssuer2CustomerCustId = value;
    }

    /**
     * Gets the value of the outLgIssuer2ListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuer2ListSetDescription() {
        return outLgIssuer2ListSetDescription;
    }

    /**
     * Sets the value of the outLgIssuer2ListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuer2ListSetDescription(String value) {
        this.outLgIssuer2ListSetDescription = value;
    }

    /**
     * Gets the value of the outLgIssuer3CustomerCDigit property.
     * 
     */
    public short getOutLgIssuer3CustomerCDigit() {
        return outLgIssuer3CustomerCDigit;
    }

    /**
     * Sets the value of the outLgIssuer3CustomerCDigit property.
     * 
     */
    public void setOutLgIssuer3CustomerCDigit(short value) {
        this.outLgIssuer3CustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgIssuer3CustomerCustId property.
     * 
     */
    public int getOutLgIssuer3CustomerCustId() {
        return outLgIssuer3CustomerCustId;
    }

    /**
     * Sets the value of the outLgIssuer3CustomerCustId property.
     * 
     */
    public void setOutLgIssuer3CustomerCustId(int value) {
        this.outLgIssuer3CustomerCustId = value;
    }

    /**
     * Gets the value of the outLgIssuer3ListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuer3ListSetDescription() {
        return outLgIssuer3ListSetDescription;
    }

    /**
     * Sets the value of the outLgIssuer3ListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuer3ListSetDescription(String value) {
        this.outLgIssuer3ListSetDescription = value;
    }

    /**
     * Gets the value of the outLgIssuer4CustomerCDigit property.
     * 
     */
    public short getOutLgIssuer4CustomerCDigit() {
        return outLgIssuer4CustomerCDigit;
    }

    /**
     * Sets the value of the outLgIssuer4CustomerCDigit property.
     * 
     */
    public void setOutLgIssuer4CustomerCDigit(short value) {
        this.outLgIssuer4CustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgIssuer4CustomerCustId property.
     * 
     */
    public int getOutLgIssuer4CustomerCustId() {
        return outLgIssuer4CustomerCustId;
    }

    /**
     * Sets the value of the outLgIssuer4CustomerCustId property.
     * 
     */
    public void setOutLgIssuer4CustomerCustId(int value) {
        this.outLgIssuer4CustomerCustId = value;
    }

    /**
     * Gets the value of the outLgIssuer4ListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuer4ListSetDescription() {
        return outLgIssuer4ListSetDescription;
    }

    /**
     * Sets the value of the outLgIssuer4ListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuer4ListSetDescription(String value) {
        this.outLgIssuer4ListSetDescription = value;
    }

    /**
     * Gets the value of the outLgIssuer5CustomerCDigit property.
     * 
     */
    public short getOutLgIssuer5CustomerCDigit() {
        return outLgIssuer5CustomerCDigit;
    }

    /**
     * Sets the value of the outLgIssuer5CustomerCDigit property.
     * 
     */
    public void setOutLgIssuer5CustomerCDigit(short value) {
        this.outLgIssuer5CustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgIssuer5CustomerCustId property.
     * 
     */
    public int getOutLgIssuer5CustomerCustId() {
        return outLgIssuer5CustomerCustId;
    }

    /**
     * Sets the value of the outLgIssuer5CustomerCustId property.
     * 
     */
    public void setOutLgIssuer5CustomerCustId(int value) {
        this.outLgIssuer5CustomerCustId = value;
    }

    /**
     * Gets the value of the outLgIssuer5ListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuer5ListSetDescription() {
        return outLgIssuer5ListSetDescription;
    }

    /**
     * Sets the value of the outLgIssuer5ListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuer5ListSetDescription(String value) {
        this.outLgIssuer5ListSetDescription = value;
    }

    /**
     * Gets the value of the outLgIssuerCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuerCustAddressAddress1() {
        return outLgIssuerCustAddressAddress1;
    }

    /**
     * Sets the value of the outLgIssuerCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuerCustAddressAddress1(String value) {
        this.outLgIssuerCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outLgIssuerCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuerCustAddressAddress2() {
        return outLgIssuerCustAddressAddress2;
    }

    /**
     * Sets the value of the outLgIssuerCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuerCustAddressAddress2(String value) {
        this.outLgIssuerCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outLgIssuerCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuerCustAddressCity() {
        return outLgIssuerCustAddressCity;
    }

    /**
     * Sets the value of the outLgIssuerCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuerCustAddressCity(String value) {
        this.outLgIssuerCustAddressCity = value;
    }

    /**
     * Gets the value of the outLgIssuerCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuerCustAddressRegion() {
        return outLgIssuerCustAddressRegion;
    }

    /**
     * Sets the value of the outLgIssuerCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuerCustAddressRegion(String value) {
        this.outLgIssuerCustAddressRegion = value;
    }

    /**
     * Gets the value of the outLgIssuerCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuerCustAddressTelephone() {
        return outLgIssuerCustAddressTelephone;
    }

    /**
     * Sets the value of the outLgIssuerCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuerCustAddressTelephone(String value) {
        this.outLgIssuerCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outLgIssuerCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuerCustAddressZipCode() {
        return outLgIssuerCustAddressZipCode;
    }

    /**
     * Sets the value of the outLgIssuerCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuerCustAddressZipCode(String value) {
        this.outLgIssuerCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outLgIssuerCustomerCDigit property.
     * 
     */
    public short getOutLgIssuerCustomerCDigit() {
        return outLgIssuerCustomerCDigit;
    }

    /**
     * Sets the value of the outLgIssuerCustomerCDigit property.
     * 
     */
    public void setOutLgIssuerCustomerCDigit(short value) {
        this.outLgIssuerCustomerCDigit = value;
    }

    /**
     * Gets the value of the outLgIssuerCustomerCustId property.
     * 
     */
    public int getOutLgIssuerCustomerCustId() {
        return outLgIssuerCustomerCustId;
    }

    /**
     * Sets the value of the outLgIssuerCustomerCustId property.
     * 
     */
    public void setOutLgIssuerCustomerCustId(int value) {
        this.outLgIssuerCustomerCustId = value;
    }

    /**
     * Gets the value of the outLgIssuerListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuerListSetDescription() {
        return outLgIssuerListSetDescription;
    }

    /**
     * Sets the value of the outLgIssuerListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuerListSetDescription(String value) {
        this.outLgIssuerListSetDescription = value;
    }

    /**
     * Gets the value of the outLgIssuerOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLgIssuerOtherIdIdNo() {
        return outLgIssuerOtherIdIdNo;
    }

    /**
     * Sets the value of the outLgIssuerOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLgIssuerOtherIdIdNo(String value) {
        this.outLgIssuerOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outLimitCurrencyIdCurrency property.
     * 
     */
    public int getOutLimitCurrencyIdCurrency() {
        return outLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outLimitCurrencyIdCurrency property.
     * 
     */
    public void setOutLimitCurrencyIdCurrency(int value) {
        this.outLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutLimitCurrencyShortDescr() {
        return outLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the outLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutLimitCurrencyShortDescr(String value) {
        this.outLimitCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outMoniringBankemployeeFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMoniringBankemployeeFirstName() {
        return outMoniringBankemployeeFirstName;
    }

    /**
     * Sets the value of the outMoniringBankemployeeFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMoniringBankemployeeFirstName(String value) {
        this.outMoniringBankemployeeFirstName = value;
    }

    /**
     * Gets the value of the outMoniringBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMoniringBankemployeeId() {
        return outMoniringBankemployeeId;
    }

    /**
     * Sets the value of the outMoniringBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMoniringBankemployeeId(String value) {
        this.outMoniringBankemployeeId = value;
    }

    /**
     * Gets the value of the outMoniringBankemployeeLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMoniringBankemployeeLastName() {
        return outMoniringBankemployeeLastName;
    }

    /**
     * Sets the value of the outMoniringBankemployeeLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMoniringBankemployeeLastName(String value) {
        this.outMoniringBankemployeeLastName = value;
    }

    /**
     * Gets the value of the outMovingCurrencyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutMovingCurrencyDescription() {
        return outMovingCurrencyDescription;
    }

    /**
     * Sets the value of the outMovingCurrencyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutMovingCurrencyDescription(String value) {
        this.outMovingCurrencyDescription = value;
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
     * Gets the value of the outOpenUnitCode property.
     * 
     */
    public int getOutOpenUnitCode() {
        return outOpenUnitCode;
    }

    /**
     * Sets the value of the outOpenUnitCode property.
     * 
     */
    public void setOutOpenUnitCode(int value) {
        this.outOpenUnitCode = value;
    }

    /**
     * Gets the value of the outOpenUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOpenUnitUnitName() {
        return outOpenUnitUnitName;
    }

    /**
     * Sets the value of the outOpenUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOpenUnitUnitName(String value) {
        this.outOpenUnitUnitName = value;
    }

    /**
     * Gets the value of the outPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrftTransactionDescription() {
        return outPrftTransactionDescription;
    }

    /**
     * Sets the value of the outPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrftTransactionDescription(String value) {
        this.outPrftTransactionDescription = value;
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
     * Gets the value of the outPrintUnitCode property.
     * 
     */
    public int getOutPrintUnitCode() {
        return outPrintUnitCode;
    }

    /**
     * Sets the value of the outPrintUnitCode property.
     * 
     */
    public void setOutPrintUnitCode(int value) {
        this.outPrintUnitCode = value;
    }

    /**
     * Gets the value of the outPrintUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrintUnitUnitName() {
        return outPrintUnitUnitName;
    }

    /**
     * Sets the value of the outPrintUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrintUnitUnitName(String value) {
        this.outPrintUnitUnitName = value;
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
     * Gets the value of the outProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutProfitsAccountAccountNumber() {
        return outProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutProfitsAccountAccountNumber(String value) {
        this.outProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outReplacedLgAccountAccCd property.
     * 
     */
    public short getOutReplacedLgAccountAccCd() {
        return outReplacedLgAccountAccCd;
    }

    /**
     * Sets the value of the outReplacedLgAccountAccCd property.
     * 
     */
    public void setOutReplacedLgAccountAccCd(short value) {
        this.outReplacedLgAccountAccCd = value;
    }

    /**
     * Gets the value of the outReplacedLgAccountAccSn property.
     * 
     */
    public double getOutReplacedLgAccountAccSn() {
        return outReplacedLgAccountAccSn;
    }

    /**
     * Sets the value of the outReplacedLgAccountAccSn property.
     * 
     */
    public void setOutReplacedLgAccountAccSn(double value) {
        this.outReplacedLgAccountAccSn = value;
    }

    /**
     * Gets the value of the outReplacedLgAccountAccType property.
     * 
     */
    public short getOutReplacedLgAccountAccType() {
        return outReplacedLgAccountAccType;
    }

    /**
     * Sets the value of the outReplacedLgAccountAccType property.
     * 
     */
    public void setOutReplacedLgAccountAccType(short value) {
        this.outReplacedLgAccountAccType = value;
    }

    /**
     * Gets the value of the outReplacedUnitCode property.
     * 
     */
    public int getOutReplacedUnitCode() {
        return outReplacedUnitCode;
    }

    /**
     * Sets the value of the outReplacedUnitCode property.
     * 
     */
    public void setOutReplacedUnitCode(int value) {
        this.outReplacedUnitCode = value;
    }

    /**
     * Gets the value of the outServerLgAccountAccCd property.
     * 
     */
    public short getOutServerLgAccountAccCd() {
        return outServerLgAccountAccCd;
    }

    /**
     * Sets the value of the outServerLgAccountAccCd property.
     * 
     */
    public void setOutServerLgAccountAccCd(short value) {
        this.outServerLgAccountAccCd = value;
    }

    /**
     * Gets the value of the outServerLgAccountAccSn property.
     * 
     */
    public double getOutServerLgAccountAccSn() {
        return outServerLgAccountAccSn;
    }

    /**
     * Sets the value of the outServerLgAccountAccSn property.
     * 
     */
    public void setOutServerLgAccountAccSn(double value) {
        this.outServerLgAccountAccSn = value;
    }

    /**
     * Gets the value of the outServerLgAccountAccType property.
     * 
     */
    public short getOutServerLgAccountAccType() {
        return outServerLgAccountAccType;
    }

    /**
     * Sets the value of the outServerLgAccountAccType property.
     * 
     */
    public void setOutServerLgAccountAccType(short value) {
        this.outServerLgAccountAccType = value;
    }

    /**
     * Gets the value of the outServerLgAccountComInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServerLgAccountComInd() {
        return outServerLgAccountComInd;
    }

    /**
     * Sets the value of the outServerLgAccountComInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServerLgAccountComInd(String value) {
        this.outServerLgAccountComInd = value;
    }

    /**
     * Gets the value of the outServerLgAccountCommissionBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServerLgAccountCommissionBal() {
        return outServerLgAccountCommissionBal;
    }

    /**
     * Sets the value of the outServerLgAccountCommissionBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServerLgAccountCommissionBal(BigDecimal value) {
        this.outServerLgAccountCommissionBal = value;
    }

    /**
     * Gets the value of the outServerLgAccountDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServerLgAccountDefaultAmn() {
        return outServerLgAccountDefaultAmn;
    }

    /**
     * Sets the value of the outServerLgAccountDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServerLgAccountDefaultAmn(BigDecimal value) {
        this.outServerLgAccountDefaultAmn = value;
    }

    /**
     * Gets the value of the outServerLgAccountExpenseBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServerLgAccountExpenseBal() {
        return outServerLgAccountExpenseBal;
    }

    /**
     * Sets the value of the outServerLgAccountExpenseBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServerLgAccountExpenseBal(BigDecimal value) {
        this.outServerLgAccountExpenseBal = value;
    }

    /**
     * Gets the value of the outServerLgAccountExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutServerLgAccountExpiryDt() {
        return outServerLgAccountExpiryDt;
    }

    /**
     * Sets the value of the outServerLgAccountExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutServerLgAccountExpiryDt(XMLGregorianCalendar value) {
        this.outServerLgAccountExpiryDt = value;
    }

    /**
     * Gets the value of the outServerLgAccountLgAmountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServerLgAccountLgAmountBal() {
        return outServerLgAccountLgAmountBal;
    }

    /**
     * Sets the value of the outServerLgAccountLgAmountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServerLgAccountLgAmountBal(BigDecimal value) {
        this.outServerLgAccountLgAmountBal = value;
    }

    /**
     * Gets the value of the outServerLgAccountLgDocCount property.
     * 
     */
    public short getOutServerLgAccountLgDocCount() {
        return outServerLgAccountLgDocCount;
    }

    /**
     * Sets the value of the outServerLgAccountLgDocCount property.
     * 
     */
    public void setOutServerLgAccountLgDocCount(short value) {
        this.outServerLgAccountLgDocCount = value;
    }

    /**
     * Gets the value of the outServerLgAccountLgFinalDocCnt property.
     * 
     */
    public short getOutServerLgAccountLgFinalDocCnt() {
        return outServerLgAccountLgFinalDocCnt;
    }

    /**
     * Sets the value of the outServerLgAccountLgFinalDocCnt property.
     * 
     */
    public void setOutServerLgAccountLgFinalDocCnt(short value) {
        this.outServerLgAccountLgFinalDocCnt = value;
    }

    /**
     * Gets the value of the outServerLgAccountMigrateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutServerLgAccountMigrateDt() {
        return outServerLgAccountMigrateDt;
    }

    /**
     * Sets the value of the outServerLgAccountMigrateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutServerLgAccountMigrateDt(XMLGregorianCalendar value) {
        this.outServerLgAccountMigrateDt = value;
    }

    /**
     * Gets the value of the outServerLgAccountOtherBankLgAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServerLgAccountOtherBankLgAcc() {
        return outServerLgAccountOtherBankLgAcc;
    }

    /**
     * Sets the value of the outServerLgAccountOtherBankLgAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServerLgAccountOtherBankLgAcc(String value) {
        this.outServerLgAccountOtherBankLgAcc = value;
    }

    /**
     * Gets the value of the outServerLgAccountPendingModifCnt property.
     * 
     */
    public short getOutServerLgAccountPendingModifCnt() {
        return outServerLgAccountPendingModifCnt;
    }

    /**
     * Sets the value of the outServerLgAccountPendingModifCnt property.
     * 
     */
    public void setOutServerLgAccountPendingModifCnt(short value) {
        this.outServerLgAccountPendingModifCnt = value;
    }

    /**
     * Gets the value of the outServerLgAccountReleaseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutServerLgAccountReleaseDt() {
        return outServerLgAccountReleaseDt;
    }

    /**
     * Sets the value of the outServerLgAccountReleaseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutServerLgAccountReleaseDt(XMLGregorianCalendar value) {
        this.outServerLgAccountReleaseDt = value;
    }

    /**
     * Gets the value of the outServerLgAccountRqDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServerLgAccountRqDefaultAmn() {
        return outServerLgAccountRqDefaultAmn;
    }

    /**
     * Sets the value of the outServerLgAccountRqDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServerLgAccountRqDefaultAmn(BigDecimal value) {
        this.outServerLgAccountRqDefaultAmn = value;
    }

    /**
     * Gets the value of the outServerLgAccountTotComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServerLgAccountTotComInCcAmn() {
        return outServerLgAccountTotComInCcAmn;
    }

    /**
     * Sets the value of the outServerLgAccountTotComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServerLgAccountTotComInCcAmn(BigDecimal value) {
        this.outServerLgAccountTotComInCcAmn = value;
    }

    /**
     * Gets the value of the outServerLgAccountTotCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServerLgAccountTotCommissionAmn() {
        return outServerLgAccountTotCommissionAmn;
    }

    /**
     * Sets the value of the outServerLgAccountTotCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServerLgAccountTotCommissionAmn(BigDecimal value) {
        this.outServerLgAccountTotCommissionAmn = value;
    }

    /**
     * Gets the value of the outServerLgAccountTotExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServerLgAccountTotExpenseAmn() {
        return outServerLgAccountTotExpenseAmn;
    }

    /**
     * Sets the value of the outServerLgAccountTotExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServerLgAccountTotExpenseAmn(BigDecimal value) {
        this.outServerLgAccountTotExpenseAmn = value;
    }

    /**
     * Gets the value of the outServerLgAccountTotExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServerLgAccountTotExpInCcAmn() {
        return outServerLgAccountTotExpInCcAmn;
    }

    /**
     * Sets the value of the outServerLgAccountTotExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServerLgAccountTotExpInCcAmn(BigDecimal value) {
        this.outServerLgAccountTotExpInCcAmn = value;
    }

    /**
     * Gets the value of the outSnActualDocumentSerialNo property.
     * 
     */
    public short getOutSnActualDocumentSerialNo() {
        return outSnActualDocumentSerialNo;
    }

    /**
     * Sets the value of the outSnActualDocumentSerialNo property.
     * 
     */
    public void setOutSnActualDocumentSerialNo(short value) {
        this.outSnActualDocumentSerialNo = value;
    }

    /**
     * Gets the value of the outTemplateMswordFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTemplateMswordFilename() {
        return outTemplateMswordFilename;
    }

    /**
     * Sets the value of the outTemplateMswordFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTemplateMswordFilename(String value) {
        this.outTemplateMswordFilename = value;
    }

    /**
     * Gets the value of the outTemplateMswordPathname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTemplateMswordPathname() {
        return outTemplateMswordPathname;
    }

    /**
     * Sets the value of the outTemplateMswordPathname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTemplateMswordPathname(String value) {
        this.outTemplateMswordPathname = value;
    }

    /**
     * Gets the value of the outTotalComCollectedIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalComCollectedIefSuppliedNumber152() {
        return outTotalComCollectedIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotalComCollectedIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalComCollectedIefSuppliedNumber152(BigDecimal value) {
        this.outTotalComCollectedIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outTotalExpCollectedIefSuppliedNumber152 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTotalExpCollectedIefSuppliedNumber152() {
        return outTotalExpCollectedIefSuppliedNumber152;
    }

    /**
     * Sets the value of the outTotalExpCollectedIefSuppliedNumber152 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTotalExpCollectedIefSuppliedNumber152(BigDecimal value) {
        this.outTotalExpCollectedIefSuppliedNumber152 = value;
    }

    /**
     * Gets the value of the outGrpAgrBenef property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpAgrBenef }
     *     
     */
    public ArrayOfOutGrpAgrBenef getOutGrpAgrBenef() {
        return outGrpAgrBenef;
    }

    /**
     * Sets the value of the outGrpAgrBenef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpAgrBenef }
     *     
     */
    public void setOutGrpAgrBenef(ArrayOfOutGrpAgrBenef value) {
        this.outGrpAgrBenef = value;
    }

    /**
     * Gets the value of the outGrpAgrGuarantor property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpAgrGuarantor }
     *     
     */
    public ArrayOfOutGrpAgrGuarantor getOutGrpAgrGuarantor() {
        return outGrpAgrGuarantor;
    }

    /**
     * Sets the value of the outGrpAgrGuarantor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpAgrGuarantor }
     *     
     */
    public void setOutGrpAgrGuarantor(ArrayOfOutGrpAgrGuarantor value) {
        this.outGrpAgrGuarantor = value;
    }

    /**
     * Gets the value of the outGrpCollatElements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpCollatElements }
     *     
     */
    public ArrayOfOutGrpCollatElements getOutGrpCollatElements() {
        return outGrpCollatElements;
    }

    /**
     * Sets the value of the outGrpCollatElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpCollatElements }
     *     
     */
    public void setOutGrpCollatElements(ArrayOfOutGrpCollatElements value) {
        this.outGrpCollatElements = value;
    }

}
