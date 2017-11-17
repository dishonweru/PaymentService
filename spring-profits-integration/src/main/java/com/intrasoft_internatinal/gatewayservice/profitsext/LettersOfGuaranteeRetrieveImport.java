
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LettersOfGuaranteeRetrieveImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LettersOfGuaranteeRetrieveImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="ProfitsAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfitsAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpCollatElements" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfInGrpCollatElements" minOccurs="0"/>
 *         &lt;element name="InTrxJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTrxPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLogMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLogMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLogMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAgreementAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InAgrUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InAuthorIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBenef2CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBenef3CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBenef4CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBenef5CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InBenefCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InChargingCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCifCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCmdIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCollaborationBanksBankId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDepositAccountCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDocumentTemplateCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDocumentTemplateDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InFxtypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIssuerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLanguageGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLanguageGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgAccountAccLimitAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountAccOpenDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountAccSpcAgrFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountCancellationDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountCifAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountCifCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountComChargeFrq" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLgAccountComChargeFrqTyp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountComInAcBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountComInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountComment1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountComment2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountCommissionBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountDefaultDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountDefaultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountDepAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLgAccountDepAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InLgAccountDepAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLgAccountDepAccUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgAccountExpenseBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountExpInAcBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountExpirationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountGuaranteeDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountIssuanceJustific" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountLanguageCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgAccountLastUpdDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountLgAmnTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountLgAmountBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountLgBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountLgDocCount" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLgAccountLgExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountLgFinalDocCnt" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InLgAccountLgInitialAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountLgOverdue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountMigrateDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountNextCommissDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountObligationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountOldAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountOtherBankLgAcc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountPostCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountPurchaseAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountPurchaseAmtPcg" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountPurchaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountPurchaseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountReleaseDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountReplacementReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountRqDefaultAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountRqDefaultDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountRqDefaultType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountStampCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountStopCommissionDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountTelegraphCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountTelephoneCharges" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountTenderDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountTenderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountThirdAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountThirdAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountThirdCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountThirdCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountThirdPartyNam" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountThirdTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountThirdZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccountTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLgAccountTotalTax" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountTotComInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountTotCommissionAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountTotExpenseAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountTotExpInCcAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InLgAccountUrlComFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgIssuer2CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgIssuer3CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgIssuer4CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgIssuer5CustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgParameterLgAccsnAuto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLgProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLgProductValidityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InLimitCurrencyEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLimitCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InLimitCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InLimitCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMonitoringBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMovedCurrencyEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMovedCurrencyFixedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InMovedCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMovedCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMovedCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOpenUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrintUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPurchCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InReplacedAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InReplacedLgAccountAccCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InReplacedLgAccountAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InReplacedLgAccountAccType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LettersOfGuaranteeRetrieveImport", propOrder = {
    "profitsAccountNumber",
    "profitsAccountCd",
    "inGrpCollatElements",
    "inTrxJustificIdJustific",
    "inTrxPrftTransactionIdTransact",
    "inLogMntRecordingAuthorizer1",
    "inLogMntRecordingAuthorizer2",
    "inLogMntRecordingPrftSystem",
    "inLogMntRecordingReversalFlag",
    "inLogMntRecordingTerminalNumber",
    "inLogMntRecordingTrxCode",
    "inAgreementAgrMembershipSn",
    "inAgreementAgrSn",
    "inAgreementAgrYear",
    "inAgrUnitCode",
    "inAuthorIefSuppliedFlag",
    "inBenef2CustomerCustId",
    "inBenef3CustomerCustId",
    "inBenef4CustomerCustId",
    "inBenef5CustomerCustId",
    "inBenefCustomerCustId",
    "inChargingCurrencyIdCurrency",
    "inCifCurrencyIdCurrency",
    "inCmdIefSuppliedCommand",
    "inCollaborationBanksBankId",
    "inDepositAccountCurrencyIdCurrency",
    "inDocumentTemplateCode",
    "inDocumentTemplateDescription",
    "inFxtypeGenericDetailSerialNum",
    "inIssuerCustomerCustId",
    "inLanguageGenericDetailParameterType",
    "inLanguageGenericDetailSerialNum",
    "inLgAccountAccLimitAmn",
    "inLgAccountAccOpenDt",
    "inLgAccountAccSpcAgrFlg",
    "inLgAccountAccStatus",
    "inLgAccountCancellationDt",
    "inLgAccountCifAmount",
    "inLgAccountCifCurrency",
    "inLgAccountComChargeFrq",
    "inLgAccountComChargeFrqTyp",
    "inLgAccountComInAcBal",
    "inLgAccountComInd",
    "inLgAccountComment1",
    "inLgAccountComment2",
    "inLgAccountCommissionBal",
    "inLgAccountDefaultDate",
    "inLgAccountDefaultType",
    "inLgAccountDepAccCd",
    "inLgAccountDepAccSn",
    "inLgAccountDepAccType",
    "inLgAccountDepAccUnit",
    "inLgAccountExpenseBal",
    "inLgAccountExpInAcBal",
    "inLgAccountExpirationType",
    "inLgAccountExpiryDt",
    "inLgAccountGuaranteeDt",
    "inLgAccountIssuanceJustific",
    "inLgAccountLanguageCode",
    "inLgAccountLastUpdDt",
    "inLgAccountLgAmnTolerance",
    "inLgAccountLgAmountBal",
    "inLgAccountLgBody",
    "inLgAccountLgDocCount",
    "inLgAccountLgExtension",
    "inLgAccountLgFinalDocCnt",
    "inLgAccountLgInitialAmn",
    "inLgAccountLgOverdue",
    "inLgAccountMigrateDt",
    "inLgAccountNextCommissDt",
    "inLgAccountObligationStatus",
    "inLgAccountOldAccount",
    "inLgAccountOtherBankLgAcc",
    "inLgAccountPostCharges",
    "inLgAccountPurchaseAmount",
    "inLgAccountPurchaseAmtPcg",
    "inLgAccountPurchaseCurrency",
    "inLgAccountPurchaseNo",
    "inLgAccountReleaseDt",
    "inLgAccountReplacementReason",
    "inLgAccountRqDefaultAmn",
    "inLgAccountRqDefaultDt",
    "inLgAccountRqDefaultType",
    "inLgAccountStampCharges",
    "inLgAccountStopCommissionDt",
    "inLgAccountTelegraphCharges",
    "inLgAccountTelephoneCharges",
    "inLgAccountTenderDate",
    "inLgAccountTenderNo",
    "inLgAccountThirdAddress1",
    "inLgAccountThirdAddress2",
    "inLgAccountThirdCity",
    "inLgAccountThirdCountry",
    "inLgAccountThirdPartyNam",
    "inLgAccountThirdTelephone1",
    "inLgAccountThirdZipCode",
    "inLgAccountTmstamp",
    "inLgAccountTotalTax",
    "inLgAccountTotComInCcAmn",
    "inLgAccountTotCommissionAmn",
    "inLgAccountTotExpenseAmn",
    "inLgAccountTotExpInCcAmn",
    "inLgAccountUrlComFlg",
    "inLgAccUnitCode",
    "inLgIssuer2CustomerCustId",
    "inLgIssuer3CustomerCustId",
    "inLgIssuer4CustomerCustId",
    "inLgIssuer5CustomerCustId",
    "inLgParameterLgAccsnAuto",
    "inLgProductIdProduct",
    "inLgProductValidityDate",
    "inLimitCurrencyEntryStatus",
    "inLimitCurrencyIdCurrency",
    "inLimitCurrencyNationalFlag",
    "inLimitCurrencyShortDescr",
    "inMonitoringBankemployeeId",
    "inMovedCurrencyEntryStatus",
    "inMovedCurrencyFixedRate",
    "inMovedCurrencyIdCurrency",
    "inMovedCurrencyNationalFlag",
    "inMovedCurrencyShortDescr",
    "inOpenUnitCode",
    "inPrintUnitCode",
    "inPurchCurrencyIdCurrency",
    "inReplacedAccUnitCode",
    "inReplacedLgAccountAccCd",
    "inReplacedLgAccountAccSn",
    "inReplacedLgAccountAccType",
    "inSsSecurityCmcbTranCode"
})
public class LettersOfGuaranteeRetrieveImport
    extends BaseImport
{

    @XmlElement(name = "ProfitsAccountNumber")
    protected String profitsAccountNumber;
    @XmlElement(name = "ProfitsAccountCd")
    protected short profitsAccountCd;
    @XmlElement(name = "InGrpCollatElements")
    protected ArrayOfInGrpCollatElements inGrpCollatElements;
    @XmlElement(name = "InTrxJustificIdJustific")
    protected int inTrxJustificIdJustific;
    @XmlElement(name = "InTrxPrftTransactionIdTransact")
    protected int inTrxPrftTransactionIdTransact;
    @XmlElement(name = "InLogMntRecordingAuthorizer1")
    protected String inLogMntRecordingAuthorizer1;
    @XmlElement(name = "InLogMntRecordingAuthorizer2")
    protected String inLogMntRecordingAuthorizer2;
    @XmlElement(name = "InLogMntRecordingPrftSystem")
    protected short inLogMntRecordingPrftSystem;
    @XmlElement(name = "InLogMntRecordingReversalFlag")
    protected String inLogMntRecordingReversalFlag;
    @XmlElement(name = "InLogMntRecordingTerminalNumber")
    protected String inLogMntRecordingTerminalNumber;
    @XmlElement(name = "InLogMntRecordingTrxCode")
    protected int inLogMntRecordingTrxCode;
    @XmlElement(name = "InAgreementAgrMembershipSn")
    protected int inAgreementAgrMembershipSn;
    @XmlElement(name = "InAgreementAgrSn")
    protected int inAgreementAgrSn;
    @XmlElement(name = "InAgreementAgrYear")
    protected short inAgreementAgrYear;
    @XmlElement(name = "InAgrUnitCode")
    protected int inAgrUnitCode;
    @XmlElement(name = "InAuthorIefSuppliedFlag")
    protected String inAuthorIefSuppliedFlag;
    @XmlElement(name = "InBenef2CustomerCustId")
    protected int inBenef2CustomerCustId;
    @XmlElement(name = "InBenef3CustomerCustId")
    protected int inBenef3CustomerCustId;
    @XmlElement(name = "InBenef4CustomerCustId")
    protected int inBenef4CustomerCustId;
    @XmlElement(name = "InBenef5CustomerCustId")
    protected int inBenef5CustomerCustId;
    @XmlElement(name = "InBenefCustomerCustId")
    protected int inBenefCustomerCustId;
    @XmlElement(name = "InChargingCurrencyIdCurrency")
    protected int inChargingCurrencyIdCurrency;
    @XmlElement(name = "InCifCurrencyIdCurrency")
    protected int inCifCurrencyIdCurrency;
    @XmlElement(name = "InCmdIefSuppliedCommand")
    protected String inCmdIefSuppliedCommand;
    @XmlElement(name = "InCollaborationBanksBankId")
    protected int inCollaborationBanksBankId;
    @XmlElement(name = "InDepositAccountCurrencyIdCurrency")
    protected int inDepositAccountCurrencyIdCurrency;
    @XmlElement(name = "InDocumentTemplateCode")
    protected int inDocumentTemplateCode;
    @XmlElement(name = "InDocumentTemplateDescription")
    protected String inDocumentTemplateDescription;
    @XmlElement(name = "InFxtypeGenericDetailSerialNum")
    protected int inFxtypeGenericDetailSerialNum;
    @XmlElement(name = "InIssuerCustomerCustId")
    protected int inIssuerCustomerCustId;
    @XmlElement(name = "InLanguageGenericDetailParameterType")
    protected String inLanguageGenericDetailParameterType;
    @XmlElement(name = "InLanguageGenericDetailSerialNum")
    protected int inLanguageGenericDetailSerialNum;
    @XmlElement(name = "InLgAccountAccLimitAmn", required = true)
    protected BigDecimal inLgAccountAccLimitAmn;
    @XmlElement(name = "InLgAccountAccOpenDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountAccOpenDt;
    @XmlElement(name = "InLgAccountAccSpcAgrFlg")
    protected String inLgAccountAccSpcAgrFlg;
    @XmlElement(name = "InLgAccountAccStatus")
    protected String inLgAccountAccStatus;
    @XmlElement(name = "InLgAccountCancellationDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountCancellationDt;
    @XmlElement(name = "InLgAccountCifAmount", required = true)
    protected BigDecimal inLgAccountCifAmount;
    @XmlElement(name = "InLgAccountCifCurrency")
    protected String inLgAccountCifCurrency;
    @XmlElement(name = "InLgAccountComChargeFrq")
    protected short inLgAccountComChargeFrq;
    @XmlElement(name = "InLgAccountComChargeFrqTyp")
    protected String inLgAccountComChargeFrqTyp;
    @XmlElement(name = "InLgAccountComInAcBal", required = true)
    protected BigDecimal inLgAccountComInAcBal;
    @XmlElement(name = "InLgAccountComInd")
    protected String inLgAccountComInd;
    @XmlElement(name = "InLgAccountComment1")
    protected String inLgAccountComment1;
    @XmlElement(name = "InLgAccountComment2")
    protected String inLgAccountComment2;
    @XmlElement(name = "InLgAccountCommissionBal", required = true)
    protected BigDecimal inLgAccountCommissionBal;
    @XmlElement(name = "InLgAccountDefaultDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountDefaultDate;
    @XmlElement(name = "InLgAccountDefaultType")
    protected String inLgAccountDefaultType;
    @XmlElement(name = "InLgAccountDepAccCd")
    protected short inLgAccountDepAccCd;
    @XmlElement(name = "InLgAccountDepAccSn")
    protected double inLgAccountDepAccSn;
    @XmlElement(name = "InLgAccountDepAccType")
    protected short inLgAccountDepAccType;
    @XmlElement(name = "InLgAccountDepAccUnit")
    protected int inLgAccountDepAccUnit;
    @XmlElement(name = "InLgAccountExpenseBal", required = true)
    protected BigDecimal inLgAccountExpenseBal;
    @XmlElement(name = "InLgAccountExpInAcBal", required = true)
    protected BigDecimal inLgAccountExpInAcBal;
    @XmlElement(name = "InLgAccountExpirationType")
    protected String inLgAccountExpirationType;
    @XmlElement(name = "InLgAccountExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountExpiryDt;
    @XmlElement(name = "InLgAccountGuaranteeDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountGuaranteeDt;
    @XmlElement(name = "InLgAccountIssuanceJustific")
    protected String inLgAccountIssuanceJustific;
    @XmlElement(name = "InLgAccountLanguageCode")
    protected int inLgAccountLanguageCode;
    @XmlElement(name = "InLgAccountLastUpdDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountLastUpdDt;
    @XmlElement(name = "InLgAccountLgAmnTolerance", required = true)
    protected BigDecimal inLgAccountLgAmnTolerance;
    @XmlElement(name = "InLgAccountLgAmountBal", required = true)
    protected BigDecimal inLgAccountLgAmountBal;
    @XmlElement(name = "InLgAccountLgBody")
    protected String inLgAccountLgBody;
    @XmlElement(name = "InLgAccountLgDocCount")
    protected short inLgAccountLgDocCount;
    @XmlElement(name = "InLgAccountLgExtension")
    protected String inLgAccountLgExtension;
    @XmlElement(name = "InLgAccountLgFinalDocCnt")
    protected short inLgAccountLgFinalDocCnt;
    @XmlElement(name = "InLgAccountLgInitialAmn", required = true)
    protected BigDecimal inLgAccountLgInitialAmn;
    @XmlElement(name = "InLgAccountLgOverdue")
    protected String inLgAccountLgOverdue;
    @XmlElement(name = "InLgAccountMigrateDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountMigrateDt;
    @XmlElement(name = "InLgAccountNextCommissDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountNextCommissDt;
    @XmlElement(name = "InLgAccountObligationStatus")
    protected String inLgAccountObligationStatus;
    @XmlElement(name = "InLgAccountOldAccount")
    protected String inLgAccountOldAccount;
    @XmlElement(name = "InLgAccountOtherBankLgAcc")
    protected String inLgAccountOtherBankLgAcc;
    @XmlElement(name = "InLgAccountPostCharges", required = true)
    protected BigDecimal inLgAccountPostCharges;
    @XmlElement(name = "InLgAccountPurchaseAmount", required = true)
    protected BigDecimal inLgAccountPurchaseAmount;
    @XmlElement(name = "InLgAccountPurchaseAmtPcg", required = true)
    protected BigDecimal inLgAccountPurchaseAmtPcg;
    @XmlElement(name = "InLgAccountPurchaseCurrency")
    protected String inLgAccountPurchaseCurrency;
    @XmlElement(name = "InLgAccountPurchaseNo")
    protected String inLgAccountPurchaseNo;
    @XmlElement(name = "InLgAccountReleaseDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountReleaseDt;
    @XmlElement(name = "InLgAccountReplacementReason")
    protected String inLgAccountReplacementReason;
    @XmlElement(name = "InLgAccountRqDefaultAmn", required = true)
    protected BigDecimal inLgAccountRqDefaultAmn;
    @XmlElement(name = "InLgAccountRqDefaultDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountRqDefaultDt;
    @XmlElement(name = "InLgAccountRqDefaultType")
    protected String inLgAccountRqDefaultType;
    @XmlElement(name = "InLgAccountStampCharges", required = true)
    protected BigDecimal inLgAccountStampCharges;
    @XmlElement(name = "InLgAccountStopCommissionDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountStopCommissionDt;
    @XmlElement(name = "InLgAccountTelegraphCharges", required = true)
    protected BigDecimal inLgAccountTelegraphCharges;
    @XmlElement(name = "InLgAccountTelephoneCharges", required = true)
    protected BigDecimal inLgAccountTelephoneCharges;
    @XmlElement(name = "InLgAccountTenderDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountTenderDate;
    @XmlElement(name = "InLgAccountTenderNo")
    protected String inLgAccountTenderNo;
    @XmlElement(name = "InLgAccountThirdAddress1")
    protected String inLgAccountThirdAddress1;
    @XmlElement(name = "InLgAccountThirdAddress2")
    protected String inLgAccountThirdAddress2;
    @XmlElement(name = "InLgAccountThirdCity")
    protected String inLgAccountThirdCity;
    @XmlElement(name = "InLgAccountThirdCountry")
    protected String inLgAccountThirdCountry;
    @XmlElement(name = "InLgAccountThirdPartyNam")
    protected String inLgAccountThirdPartyNam;
    @XmlElement(name = "InLgAccountThirdTelephone1")
    protected String inLgAccountThirdTelephone1;
    @XmlElement(name = "InLgAccountThirdZipCode")
    protected String inLgAccountThirdZipCode;
    @XmlElement(name = "InLgAccountTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgAccountTmstamp;
    @XmlElement(name = "InLgAccountTotalTax", required = true)
    protected BigDecimal inLgAccountTotalTax;
    @XmlElement(name = "InLgAccountTotComInCcAmn", required = true)
    protected BigDecimal inLgAccountTotComInCcAmn;
    @XmlElement(name = "InLgAccountTotCommissionAmn", required = true)
    protected BigDecimal inLgAccountTotCommissionAmn;
    @XmlElement(name = "InLgAccountTotExpenseAmn", required = true)
    protected BigDecimal inLgAccountTotExpenseAmn;
    @XmlElement(name = "InLgAccountTotExpInCcAmn", required = true)
    protected BigDecimal inLgAccountTotExpInCcAmn;
    @XmlElement(name = "InLgAccountUrlComFlg")
    protected String inLgAccountUrlComFlg;
    @XmlElement(name = "InLgAccUnitCode")
    protected int inLgAccUnitCode;
    @XmlElement(name = "InLgIssuer2CustomerCustId")
    protected int inLgIssuer2CustomerCustId;
    @XmlElement(name = "InLgIssuer3CustomerCustId")
    protected int inLgIssuer3CustomerCustId;
    @XmlElement(name = "InLgIssuer4CustomerCustId")
    protected int inLgIssuer4CustomerCustId;
    @XmlElement(name = "InLgIssuer5CustomerCustId")
    protected int inLgIssuer5CustomerCustId;
    @XmlElement(name = "InLgParameterLgAccsnAuto")
    protected String inLgParameterLgAccsnAuto;
    @XmlElement(name = "InLgProductIdProduct")
    protected int inLgProductIdProduct;
    @XmlElement(name = "InLgProductValidityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inLgProductValidityDate;
    @XmlElement(name = "InLimitCurrencyEntryStatus")
    protected String inLimitCurrencyEntryStatus;
    @XmlElement(name = "InLimitCurrencyIdCurrency")
    protected int inLimitCurrencyIdCurrency;
    @XmlElement(name = "InLimitCurrencyNationalFlag")
    protected String inLimitCurrencyNationalFlag;
    @XmlElement(name = "InLimitCurrencyShortDescr")
    protected String inLimitCurrencyShortDescr;
    @XmlElement(name = "InMonitoringBankemployeeId")
    protected String inMonitoringBankemployeeId;
    @XmlElement(name = "InMovedCurrencyEntryStatus")
    protected String inMovedCurrencyEntryStatus;
    @XmlElement(name = "InMovedCurrencyFixedRate", required = true)
    protected BigDecimal inMovedCurrencyFixedRate;
    @XmlElement(name = "InMovedCurrencyIdCurrency")
    protected int inMovedCurrencyIdCurrency;
    @XmlElement(name = "InMovedCurrencyNationalFlag")
    protected String inMovedCurrencyNationalFlag;
    @XmlElement(name = "InMovedCurrencyShortDescr")
    protected String inMovedCurrencyShortDescr;
    @XmlElement(name = "InOpenUnitCode")
    protected int inOpenUnitCode;
    @XmlElement(name = "InPrintUnitCode")
    protected int inPrintUnitCode;
    @XmlElement(name = "InPurchCurrencyIdCurrency")
    protected int inPurchCurrencyIdCurrency;
    @XmlElement(name = "InReplacedAccUnitCode")
    protected int inReplacedAccUnitCode;
    @XmlElement(name = "InReplacedLgAccountAccCd")
    protected short inReplacedLgAccountAccCd;
    @XmlElement(name = "InReplacedLgAccountAccSn")
    protected double inReplacedLgAccountAccSn;
    @XmlElement(name = "InReplacedLgAccountAccType")
    protected short inReplacedLgAccountAccType;
    @XmlElement(name = "InSsSecurityCmcbTranCode")
    protected String inSsSecurityCmcbTranCode;

    /**
     * Gets the value of the profitsAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfitsAccountNumber() {
        return profitsAccountNumber;
    }

    /**
     * Sets the value of the profitsAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfitsAccountNumber(String value) {
        this.profitsAccountNumber = value;
    }

    /**
     * Gets the value of the profitsAccountCd property.
     * 
     */
    public short getProfitsAccountCd() {
        return profitsAccountCd;
    }

    /**
     * Sets the value of the profitsAccountCd property.
     * 
     */
    public void setProfitsAccountCd(short value) {
        this.profitsAccountCd = value;
    }

    /**
     * Gets the value of the inGrpCollatElements property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfInGrpCollatElements }
     *     
     */
    public ArrayOfInGrpCollatElements getInGrpCollatElements() {
        return inGrpCollatElements;
    }

    /**
     * Sets the value of the inGrpCollatElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfInGrpCollatElements }
     *     
     */
    public void setInGrpCollatElements(ArrayOfInGrpCollatElements value) {
        this.inGrpCollatElements = value;
    }

    /**
     * Gets the value of the inTrxJustificIdJustific property.
     * 
     */
    public int getInTrxJustificIdJustific() {
        return inTrxJustificIdJustific;
    }

    /**
     * Sets the value of the inTrxJustificIdJustific property.
     * 
     */
    public void setInTrxJustificIdJustific(int value) {
        this.inTrxJustificIdJustific = value;
    }

    /**
     * Gets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public int getInTrxPrftTransactionIdTransact() {
        return inTrxPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inTrxPrftTransactionIdTransact property.
     * 
     */
    public void setInTrxPrftTransactionIdTransact(int value) {
        this.inTrxPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer1() {
        return inLogMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer1(String value) {
        this.inLogMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingAuthorizer2() {
        return inLogMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inLogMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingAuthorizer2(String value) {
        this.inLogMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public short getInLogMntRecordingPrftSystem() {
        return inLogMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inLogMntRecordingPrftSystem property.
     * 
     */
    public void setInLogMntRecordingPrftSystem(short value) {
        this.inLogMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingReversalFlag() {
        return inLogMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inLogMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingReversalFlag(String value) {
        this.inLogMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLogMntRecordingTerminalNumber() {
        return inLogMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inLogMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLogMntRecordingTerminalNumber(String value) {
        this.inLogMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public int getInLogMntRecordingTrxCode() {
        return inLogMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inLogMntRecordingTrxCode property.
     * 
     */
    public void setInLogMntRecordingTrxCode(int value) {
        this.inLogMntRecordingTrxCode = value;
    }

    /**
     * Gets the value of the inAgreementAgrMembershipSn property.
     * 
     */
    public int getInAgreementAgrMembershipSn() {
        return inAgreementAgrMembershipSn;
    }

    /**
     * Sets the value of the inAgreementAgrMembershipSn property.
     * 
     */
    public void setInAgreementAgrMembershipSn(int value) {
        this.inAgreementAgrMembershipSn = value;
    }

    /**
     * Gets the value of the inAgreementAgrSn property.
     * 
     */
    public int getInAgreementAgrSn() {
        return inAgreementAgrSn;
    }

    /**
     * Sets the value of the inAgreementAgrSn property.
     * 
     */
    public void setInAgreementAgrSn(int value) {
        this.inAgreementAgrSn = value;
    }

    /**
     * Gets the value of the inAgreementAgrYear property.
     * 
     */
    public short getInAgreementAgrYear() {
        return inAgreementAgrYear;
    }

    /**
     * Sets the value of the inAgreementAgrYear property.
     * 
     */
    public void setInAgreementAgrYear(short value) {
        this.inAgreementAgrYear = value;
    }

    /**
     * Gets the value of the inAgrUnitCode property.
     * 
     */
    public int getInAgrUnitCode() {
        return inAgrUnitCode;
    }

    /**
     * Sets the value of the inAgrUnitCode property.
     * 
     */
    public void setInAgrUnitCode(int value) {
        this.inAgrUnitCode = value;
    }

    /**
     * Gets the value of the inAuthorIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorIefSuppliedFlag() {
        return inAuthorIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorIefSuppliedFlag(String value) {
        this.inAuthorIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inBenef2CustomerCustId property.
     * 
     */
    public int getInBenef2CustomerCustId() {
        return inBenef2CustomerCustId;
    }

    /**
     * Sets the value of the inBenef2CustomerCustId property.
     * 
     */
    public void setInBenef2CustomerCustId(int value) {
        this.inBenef2CustomerCustId = value;
    }

    /**
     * Gets the value of the inBenef3CustomerCustId property.
     * 
     */
    public int getInBenef3CustomerCustId() {
        return inBenef3CustomerCustId;
    }

    /**
     * Sets the value of the inBenef3CustomerCustId property.
     * 
     */
    public void setInBenef3CustomerCustId(int value) {
        this.inBenef3CustomerCustId = value;
    }

    /**
     * Gets the value of the inBenef4CustomerCustId property.
     * 
     */
    public int getInBenef4CustomerCustId() {
        return inBenef4CustomerCustId;
    }

    /**
     * Sets the value of the inBenef4CustomerCustId property.
     * 
     */
    public void setInBenef4CustomerCustId(int value) {
        this.inBenef4CustomerCustId = value;
    }

    /**
     * Gets the value of the inBenef5CustomerCustId property.
     * 
     */
    public int getInBenef5CustomerCustId() {
        return inBenef5CustomerCustId;
    }

    /**
     * Sets the value of the inBenef5CustomerCustId property.
     * 
     */
    public void setInBenef5CustomerCustId(int value) {
        this.inBenef5CustomerCustId = value;
    }

    /**
     * Gets the value of the inBenefCustomerCustId property.
     * 
     */
    public int getInBenefCustomerCustId() {
        return inBenefCustomerCustId;
    }

    /**
     * Sets the value of the inBenefCustomerCustId property.
     * 
     */
    public void setInBenefCustomerCustId(int value) {
        this.inBenefCustomerCustId = value;
    }

    /**
     * Gets the value of the inChargingCurrencyIdCurrency property.
     * 
     */
    public int getInChargingCurrencyIdCurrency() {
        return inChargingCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inChargingCurrencyIdCurrency property.
     * 
     */
    public void setInChargingCurrencyIdCurrency(int value) {
        this.inChargingCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCifCurrencyIdCurrency property.
     * 
     */
    public int getInCifCurrencyIdCurrency() {
        return inCifCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCifCurrencyIdCurrency property.
     * 
     */
    public void setInCifCurrencyIdCurrency(int value) {
        this.inCifCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCmdIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCmdIefSuppliedCommand() {
        return inCmdIefSuppliedCommand;
    }

    /**
     * Sets the value of the inCmdIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCmdIefSuppliedCommand(String value) {
        this.inCmdIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inCollaborationBanksBankId property.
     * 
     */
    public int getInCollaborationBanksBankId() {
        return inCollaborationBanksBankId;
    }

    /**
     * Sets the value of the inCollaborationBanksBankId property.
     * 
     */
    public void setInCollaborationBanksBankId(int value) {
        this.inCollaborationBanksBankId = value;
    }

    /**
     * Gets the value of the inDepositAccountCurrencyIdCurrency property.
     * 
     */
    public int getInDepositAccountCurrencyIdCurrency() {
        return inDepositAccountCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inDepositAccountCurrencyIdCurrency property.
     * 
     */
    public void setInDepositAccountCurrencyIdCurrency(int value) {
        this.inDepositAccountCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inDocumentTemplateCode property.
     * 
     */
    public int getInDocumentTemplateCode() {
        return inDocumentTemplateCode;
    }

    /**
     * Sets the value of the inDocumentTemplateCode property.
     * 
     */
    public void setInDocumentTemplateCode(int value) {
        this.inDocumentTemplateCode = value;
    }

    /**
     * Gets the value of the inDocumentTemplateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocumentTemplateDescription() {
        return inDocumentTemplateDescription;
    }

    /**
     * Sets the value of the inDocumentTemplateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocumentTemplateDescription(String value) {
        this.inDocumentTemplateDescription = value;
    }

    /**
     * Gets the value of the inFxtypeGenericDetailSerialNum property.
     * 
     */
    public int getInFxtypeGenericDetailSerialNum() {
        return inFxtypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inFxtypeGenericDetailSerialNum property.
     * 
     */
    public void setInFxtypeGenericDetailSerialNum(int value) {
        this.inFxtypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inIssuerCustomerCustId property.
     * 
     */
    public int getInIssuerCustomerCustId() {
        return inIssuerCustomerCustId;
    }

    /**
     * Sets the value of the inIssuerCustomerCustId property.
     * 
     */
    public void setInIssuerCustomerCustId(int value) {
        this.inIssuerCustomerCustId = value;
    }

    /**
     * Gets the value of the inLanguageGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLanguageGenericDetailParameterType() {
        return inLanguageGenericDetailParameterType;
    }

    /**
     * Sets the value of the inLanguageGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLanguageGenericDetailParameterType(String value) {
        this.inLanguageGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inLanguageGenericDetailSerialNum property.
     * 
     */
    public int getInLanguageGenericDetailSerialNum() {
        return inLanguageGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inLanguageGenericDetailSerialNum property.
     * 
     */
    public void setInLanguageGenericDetailSerialNum(int value) {
        this.inLanguageGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inLgAccountAccLimitAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountAccLimitAmn() {
        return inLgAccountAccLimitAmn;
    }

    /**
     * Sets the value of the inLgAccountAccLimitAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountAccLimitAmn(BigDecimal value) {
        this.inLgAccountAccLimitAmn = value;
    }

    /**
     * Gets the value of the inLgAccountAccOpenDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountAccOpenDt() {
        return inLgAccountAccOpenDt;
    }

    /**
     * Sets the value of the inLgAccountAccOpenDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountAccOpenDt(XMLGregorianCalendar value) {
        this.inLgAccountAccOpenDt = value;
    }

    /**
     * Gets the value of the inLgAccountAccSpcAgrFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountAccSpcAgrFlg() {
        return inLgAccountAccSpcAgrFlg;
    }

    /**
     * Sets the value of the inLgAccountAccSpcAgrFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountAccSpcAgrFlg(String value) {
        this.inLgAccountAccSpcAgrFlg = value;
    }

    /**
     * Gets the value of the inLgAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountAccStatus() {
        return inLgAccountAccStatus;
    }

    /**
     * Sets the value of the inLgAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountAccStatus(String value) {
        this.inLgAccountAccStatus = value;
    }

    /**
     * Gets the value of the inLgAccountCancellationDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountCancellationDt() {
        return inLgAccountCancellationDt;
    }

    /**
     * Sets the value of the inLgAccountCancellationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountCancellationDt(XMLGregorianCalendar value) {
        this.inLgAccountCancellationDt = value;
    }

    /**
     * Gets the value of the inLgAccountCifAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountCifAmount() {
        return inLgAccountCifAmount;
    }

    /**
     * Sets the value of the inLgAccountCifAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountCifAmount(BigDecimal value) {
        this.inLgAccountCifAmount = value;
    }

    /**
     * Gets the value of the inLgAccountCifCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountCifCurrency() {
        return inLgAccountCifCurrency;
    }

    /**
     * Sets the value of the inLgAccountCifCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountCifCurrency(String value) {
        this.inLgAccountCifCurrency = value;
    }

    /**
     * Gets the value of the inLgAccountComChargeFrq property.
     * 
     */
    public short getInLgAccountComChargeFrq() {
        return inLgAccountComChargeFrq;
    }

    /**
     * Sets the value of the inLgAccountComChargeFrq property.
     * 
     */
    public void setInLgAccountComChargeFrq(short value) {
        this.inLgAccountComChargeFrq = value;
    }

    /**
     * Gets the value of the inLgAccountComChargeFrqTyp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountComChargeFrqTyp() {
        return inLgAccountComChargeFrqTyp;
    }

    /**
     * Sets the value of the inLgAccountComChargeFrqTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountComChargeFrqTyp(String value) {
        this.inLgAccountComChargeFrqTyp = value;
    }

    /**
     * Gets the value of the inLgAccountComInAcBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountComInAcBal() {
        return inLgAccountComInAcBal;
    }

    /**
     * Sets the value of the inLgAccountComInAcBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountComInAcBal(BigDecimal value) {
        this.inLgAccountComInAcBal = value;
    }

    /**
     * Gets the value of the inLgAccountComInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountComInd() {
        return inLgAccountComInd;
    }

    /**
     * Sets the value of the inLgAccountComInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountComInd(String value) {
        this.inLgAccountComInd = value;
    }

    /**
     * Gets the value of the inLgAccountComment1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountComment1() {
        return inLgAccountComment1;
    }

    /**
     * Sets the value of the inLgAccountComment1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountComment1(String value) {
        this.inLgAccountComment1 = value;
    }

    /**
     * Gets the value of the inLgAccountComment2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountComment2() {
        return inLgAccountComment2;
    }

    /**
     * Sets the value of the inLgAccountComment2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountComment2(String value) {
        this.inLgAccountComment2 = value;
    }

    /**
     * Gets the value of the inLgAccountCommissionBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountCommissionBal() {
        return inLgAccountCommissionBal;
    }

    /**
     * Sets the value of the inLgAccountCommissionBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountCommissionBal(BigDecimal value) {
        this.inLgAccountCommissionBal = value;
    }

    /**
     * Gets the value of the inLgAccountDefaultDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountDefaultDate() {
        return inLgAccountDefaultDate;
    }

    /**
     * Sets the value of the inLgAccountDefaultDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountDefaultDate(XMLGregorianCalendar value) {
        this.inLgAccountDefaultDate = value;
    }

    /**
     * Gets the value of the inLgAccountDefaultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountDefaultType() {
        return inLgAccountDefaultType;
    }

    /**
     * Sets the value of the inLgAccountDefaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountDefaultType(String value) {
        this.inLgAccountDefaultType = value;
    }

    /**
     * Gets the value of the inLgAccountDepAccCd property.
     * 
     */
    public short getInLgAccountDepAccCd() {
        return inLgAccountDepAccCd;
    }

    /**
     * Sets the value of the inLgAccountDepAccCd property.
     * 
     */
    public void setInLgAccountDepAccCd(short value) {
        this.inLgAccountDepAccCd = value;
    }

    /**
     * Gets the value of the inLgAccountDepAccSn property.
     * 
     */
    public double getInLgAccountDepAccSn() {
        return inLgAccountDepAccSn;
    }

    /**
     * Sets the value of the inLgAccountDepAccSn property.
     * 
     */
    public void setInLgAccountDepAccSn(double value) {
        this.inLgAccountDepAccSn = value;
    }

    /**
     * Gets the value of the inLgAccountDepAccType property.
     * 
     */
    public short getInLgAccountDepAccType() {
        return inLgAccountDepAccType;
    }

    /**
     * Sets the value of the inLgAccountDepAccType property.
     * 
     */
    public void setInLgAccountDepAccType(short value) {
        this.inLgAccountDepAccType = value;
    }

    /**
     * Gets the value of the inLgAccountDepAccUnit property.
     * 
     */
    public int getInLgAccountDepAccUnit() {
        return inLgAccountDepAccUnit;
    }

    /**
     * Sets the value of the inLgAccountDepAccUnit property.
     * 
     */
    public void setInLgAccountDepAccUnit(int value) {
        this.inLgAccountDepAccUnit = value;
    }

    /**
     * Gets the value of the inLgAccountExpenseBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountExpenseBal() {
        return inLgAccountExpenseBal;
    }

    /**
     * Sets the value of the inLgAccountExpenseBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountExpenseBal(BigDecimal value) {
        this.inLgAccountExpenseBal = value;
    }

    /**
     * Gets the value of the inLgAccountExpInAcBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountExpInAcBal() {
        return inLgAccountExpInAcBal;
    }

    /**
     * Sets the value of the inLgAccountExpInAcBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountExpInAcBal(BigDecimal value) {
        this.inLgAccountExpInAcBal = value;
    }

    /**
     * Gets the value of the inLgAccountExpirationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountExpirationType() {
        return inLgAccountExpirationType;
    }

    /**
     * Sets the value of the inLgAccountExpirationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountExpirationType(String value) {
        this.inLgAccountExpirationType = value;
    }

    /**
     * Gets the value of the inLgAccountExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountExpiryDt() {
        return inLgAccountExpiryDt;
    }

    /**
     * Sets the value of the inLgAccountExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountExpiryDt(XMLGregorianCalendar value) {
        this.inLgAccountExpiryDt = value;
    }

    /**
     * Gets the value of the inLgAccountGuaranteeDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountGuaranteeDt() {
        return inLgAccountGuaranteeDt;
    }

    /**
     * Sets the value of the inLgAccountGuaranteeDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountGuaranteeDt(XMLGregorianCalendar value) {
        this.inLgAccountGuaranteeDt = value;
    }

    /**
     * Gets the value of the inLgAccountIssuanceJustific property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountIssuanceJustific() {
        return inLgAccountIssuanceJustific;
    }

    /**
     * Sets the value of the inLgAccountIssuanceJustific property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountIssuanceJustific(String value) {
        this.inLgAccountIssuanceJustific = value;
    }

    /**
     * Gets the value of the inLgAccountLanguageCode property.
     * 
     */
    public int getInLgAccountLanguageCode() {
        return inLgAccountLanguageCode;
    }

    /**
     * Sets the value of the inLgAccountLanguageCode property.
     * 
     */
    public void setInLgAccountLanguageCode(int value) {
        this.inLgAccountLanguageCode = value;
    }

    /**
     * Gets the value of the inLgAccountLastUpdDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountLastUpdDt() {
        return inLgAccountLastUpdDt;
    }

    /**
     * Sets the value of the inLgAccountLastUpdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountLastUpdDt(XMLGregorianCalendar value) {
        this.inLgAccountLastUpdDt = value;
    }

    /**
     * Gets the value of the inLgAccountLgAmnTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountLgAmnTolerance() {
        return inLgAccountLgAmnTolerance;
    }

    /**
     * Sets the value of the inLgAccountLgAmnTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountLgAmnTolerance(BigDecimal value) {
        this.inLgAccountLgAmnTolerance = value;
    }

    /**
     * Gets the value of the inLgAccountLgAmountBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountLgAmountBal() {
        return inLgAccountLgAmountBal;
    }

    /**
     * Sets the value of the inLgAccountLgAmountBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountLgAmountBal(BigDecimal value) {
        this.inLgAccountLgAmountBal = value;
    }

    /**
     * Gets the value of the inLgAccountLgBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountLgBody() {
        return inLgAccountLgBody;
    }

    /**
     * Sets the value of the inLgAccountLgBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountLgBody(String value) {
        this.inLgAccountLgBody = value;
    }

    /**
     * Gets the value of the inLgAccountLgDocCount property.
     * 
     */
    public short getInLgAccountLgDocCount() {
        return inLgAccountLgDocCount;
    }

    /**
     * Sets the value of the inLgAccountLgDocCount property.
     * 
     */
    public void setInLgAccountLgDocCount(short value) {
        this.inLgAccountLgDocCount = value;
    }

    /**
     * Gets the value of the inLgAccountLgExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountLgExtension() {
        return inLgAccountLgExtension;
    }

    /**
     * Sets the value of the inLgAccountLgExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountLgExtension(String value) {
        this.inLgAccountLgExtension = value;
    }

    /**
     * Gets the value of the inLgAccountLgFinalDocCnt property.
     * 
     */
    public short getInLgAccountLgFinalDocCnt() {
        return inLgAccountLgFinalDocCnt;
    }

    /**
     * Sets the value of the inLgAccountLgFinalDocCnt property.
     * 
     */
    public void setInLgAccountLgFinalDocCnt(short value) {
        this.inLgAccountLgFinalDocCnt = value;
    }

    /**
     * Gets the value of the inLgAccountLgInitialAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountLgInitialAmn() {
        return inLgAccountLgInitialAmn;
    }

    /**
     * Sets the value of the inLgAccountLgInitialAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountLgInitialAmn(BigDecimal value) {
        this.inLgAccountLgInitialAmn = value;
    }

    /**
     * Gets the value of the inLgAccountLgOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountLgOverdue() {
        return inLgAccountLgOverdue;
    }

    /**
     * Sets the value of the inLgAccountLgOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountLgOverdue(String value) {
        this.inLgAccountLgOverdue = value;
    }

    /**
     * Gets the value of the inLgAccountMigrateDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountMigrateDt() {
        return inLgAccountMigrateDt;
    }

    /**
     * Sets the value of the inLgAccountMigrateDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountMigrateDt(XMLGregorianCalendar value) {
        this.inLgAccountMigrateDt = value;
    }

    /**
     * Gets the value of the inLgAccountNextCommissDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountNextCommissDt() {
        return inLgAccountNextCommissDt;
    }

    /**
     * Sets the value of the inLgAccountNextCommissDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountNextCommissDt(XMLGregorianCalendar value) {
        this.inLgAccountNextCommissDt = value;
    }

    /**
     * Gets the value of the inLgAccountObligationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountObligationStatus() {
        return inLgAccountObligationStatus;
    }

    /**
     * Sets the value of the inLgAccountObligationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountObligationStatus(String value) {
        this.inLgAccountObligationStatus = value;
    }

    /**
     * Gets the value of the inLgAccountOldAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountOldAccount() {
        return inLgAccountOldAccount;
    }

    /**
     * Sets the value of the inLgAccountOldAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountOldAccount(String value) {
        this.inLgAccountOldAccount = value;
    }

    /**
     * Gets the value of the inLgAccountOtherBankLgAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountOtherBankLgAcc() {
        return inLgAccountOtherBankLgAcc;
    }

    /**
     * Sets the value of the inLgAccountOtherBankLgAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountOtherBankLgAcc(String value) {
        this.inLgAccountOtherBankLgAcc = value;
    }

    /**
     * Gets the value of the inLgAccountPostCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountPostCharges() {
        return inLgAccountPostCharges;
    }

    /**
     * Sets the value of the inLgAccountPostCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountPostCharges(BigDecimal value) {
        this.inLgAccountPostCharges = value;
    }

    /**
     * Gets the value of the inLgAccountPurchaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountPurchaseAmount() {
        return inLgAccountPurchaseAmount;
    }

    /**
     * Sets the value of the inLgAccountPurchaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountPurchaseAmount(BigDecimal value) {
        this.inLgAccountPurchaseAmount = value;
    }

    /**
     * Gets the value of the inLgAccountPurchaseAmtPcg property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountPurchaseAmtPcg() {
        return inLgAccountPurchaseAmtPcg;
    }

    /**
     * Sets the value of the inLgAccountPurchaseAmtPcg property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountPurchaseAmtPcg(BigDecimal value) {
        this.inLgAccountPurchaseAmtPcg = value;
    }

    /**
     * Gets the value of the inLgAccountPurchaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountPurchaseCurrency() {
        return inLgAccountPurchaseCurrency;
    }

    /**
     * Sets the value of the inLgAccountPurchaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountPurchaseCurrency(String value) {
        this.inLgAccountPurchaseCurrency = value;
    }

    /**
     * Gets the value of the inLgAccountPurchaseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountPurchaseNo() {
        return inLgAccountPurchaseNo;
    }

    /**
     * Sets the value of the inLgAccountPurchaseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountPurchaseNo(String value) {
        this.inLgAccountPurchaseNo = value;
    }

    /**
     * Gets the value of the inLgAccountReleaseDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountReleaseDt() {
        return inLgAccountReleaseDt;
    }

    /**
     * Sets the value of the inLgAccountReleaseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountReleaseDt(XMLGregorianCalendar value) {
        this.inLgAccountReleaseDt = value;
    }

    /**
     * Gets the value of the inLgAccountReplacementReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountReplacementReason() {
        return inLgAccountReplacementReason;
    }

    /**
     * Sets the value of the inLgAccountReplacementReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountReplacementReason(String value) {
        this.inLgAccountReplacementReason = value;
    }

    /**
     * Gets the value of the inLgAccountRqDefaultAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountRqDefaultAmn() {
        return inLgAccountRqDefaultAmn;
    }

    /**
     * Sets the value of the inLgAccountRqDefaultAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountRqDefaultAmn(BigDecimal value) {
        this.inLgAccountRqDefaultAmn = value;
    }

    /**
     * Gets the value of the inLgAccountRqDefaultDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountRqDefaultDt() {
        return inLgAccountRqDefaultDt;
    }

    /**
     * Sets the value of the inLgAccountRqDefaultDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountRqDefaultDt(XMLGregorianCalendar value) {
        this.inLgAccountRqDefaultDt = value;
    }

    /**
     * Gets the value of the inLgAccountRqDefaultType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountRqDefaultType() {
        return inLgAccountRqDefaultType;
    }

    /**
     * Sets the value of the inLgAccountRqDefaultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountRqDefaultType(String value) {
        this.inLgAccountRqDefaultType = value;
    }

    /**
     * Gets the value of the inLgAccountStampCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountStampCharges() {
        return inLgAccountStampCharges;
    }

    /**
     * Sets the value of the inLgAccountStampCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountStampCharges(BigDecimal value) {
        this.inLgAccountStampCharges = value;
    }

    /**
     * Gets the value of the inLgAccountStopCommissionDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountStopCommissionDt() {
        return inLgAccountStopCommissionDt;
    }

    /**
     * Sets the value of the inLgAccountStopCommissionDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountStopCommissionDt(XMLGregorianCalendar value) {
        this.inLgAccountStopCommissionDt = value;
    }

    /**
     * Gets the value of the inLgAccountTelegraphCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountTelegraphCharges() {
        return inLgAccountTelegraphCharges;
    }

    /**
     * Sets the value of the inLgAccountTelegraphCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountTelegraphCharges(BigDecimal value) {
        this.inLgAccountTelegraphCharges = value;
    }

    /**
     * Gets the value of the inLgAccountTelephoneCharges property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountTelephoneCharges() {
        return inLgAccountTelephoneCharges;
    }

    /**
     * Sets the value of the inLgAccountTelephoneCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountTelephoneCharges(BigDecimal value) {
        this.inLgAccountTelephoneCharges = value;
    }

    /**
     * Gets the value of the inLgAccountTenderDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountTenderDate() {
        return inLgAccountTenderDate;
    }

    /**
     * Sets the value of the inLgAccountTenderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountTenderDate(XMLGregorianCalendar value) {
        this.inLgAccountTenderDate = value;
    }

    /**
     * Gets the value of the inLgAccountTenderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountTenderNo() {
        return inLgAccountTenderNo;
    }

    /**
     * Sets the value of the inLgAccountTenderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountTenderNo(String value) {
        this.inLgAccountTenderNo = value;
    }

    /**
     * Gets the value of the inLgAccountThirdAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountThirdAddress1() {
        return inLgAccountThirdAddress1;
    }

    /**
     * Sets the value of the inLgAccountThirdAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountThirdAddress1(String value) {
        this.inLgAccountThirdAddress1 = value;
    }

    /**
     * Gets the value of the inLgAccountThirdAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountThirdAddress2() {
        return inLgAccountThirdAddress2;
    }

    /**
     * Sets the value of the inLgAccountThirdAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountThirdAddress2(String value) {
        this.inLgAccountThirdAddress2 = value;
    }

    /**
     * Gets the value of the inLgAccountThirdCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountThirdCity() {
        return inLgAccountThirdCity;
    }

    /**
     * Sets the value of the inLgAccountThirdCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountThirdCity(String value) {
        this.inLgAccountThirdCity = value;
    }

    /**
     * Gets the value of the inLgAccountThirdCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountThirdCountry() {
        return inLgAccountThirdCountry;
    }

    /**
     * Sets the value of the inLgAccountThirdCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountThirdCountry(String value) {
        this.inLgAccountThirdCountry = value;
    }

    /**
     * Gets the value of the inLgAccountThirdPartyNam property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountThirdPartyNam() {
        return inLgAccountThirdPartyNam;
    }

    /**
     * Sets the value of the inLgAccountThirdPartyNam property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountThirdPartyNam(String value) {
        this.inLgAccountThirdPartyNam = value;
    }

    /**
     * Gets the value of the inLgAccountThirdTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountThirdTelephone1() {
        return inLgAccountThirdTelephone1;
    }

    /**
     * Sets the value of the inLgAccountThirdTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountThirdTelephone1(String value) {
        this.inLgAccountThirdTelephone1 = value;
    }

    /**
     * Gets the value of the inLgAccountThirdZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountThirdZipCode() {
        return inLgAccountThirdZipCode;
    }

    /**
     * Sets the value of the inLgAccountThirdZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountThirdZipCode(String value) {
        this.inLgAccountThirdZipCode = value;
    }

    /**
     * Gets the value of the inLgAccountTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgAccountTmstamp() {
        return inLgAccountTmstamp;
    }

    /**
     * Sets the value of the inLgAccountTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgAccountTmstamp(XMLGregorianCalendar value) {
        this.inLgAccountTmstamp = value;
    }

    /**
     * Gets the value of the inLgAccountTotalTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountTotalTax() {
        return inLgAccountTotalTax;
    }

    /**
     * Sets the value of the inLgAccountTotalTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountTotalTax(BigDecimal value) {
        this.inLgAccountTotalTax = value;
    }

    /**
     * Gets the value of the inLgAccountTotComInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountTotComInCcAmn() {
        return inLgAccountTotComInCcAmn;
    }

    /**
     * Sets the value of the inLgAccountTotComInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountTotComInCcAmn(BigDecimal value) {
        this.inLgAccountTotComInCcAmn = value;
    }

    /**
     * Gets the value of the inLgAccountTotCommissionAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountTotCommissionAmn() {
        return inLgAccountTotCommissionAmn;
    }

    /**
     * Sets the value of the inLgAccountTotCommissionAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountTotCommissionAmn(BigDecimal value) {
        this.inLgAccountTotCommissionAmn = value;
    }

    /**
     * Gets the value of the inLgAccountTotExpenseAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountTotExpenseAmn() {
        return inLgAccountTotExpenseAmn;
    }

    /**
     * Sets the value of the inLgAccountTotExpenseAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountTotExpenseAmn(BigDecimal value) {
        this.inLgAccountTotExpenseAmn = value;
    }

    /**
     * Gets the value of the inLgAccountTotExpInCcAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInLgAccountTotExpInCcAmn() {
        return inLgAccountTotExpInCcAmn;
    }

    /**
     * Sets the value of the inLgAccountTotExpInCcAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInLgAccountTotExpInCcAmn(BigDecimal value) {
        this.inLgAccountTotExpInCcAmn = value;
    }

    /**
     * Gets the value of the inLgAccountUrlComFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgAccountUrlComFlg() {
        return inLgAccountUrlComFlg;
    }

    /**
     * Sets the value of the inLgAccountUrlComFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgAccountUrlComFlg(String value) {
        this.inLgAccountUrlComFlg = value;
    }

    /**
     * Gets the value of the inLgAccUnitCode property.
     * 
     */
    public int getInLgAccUnitCode() {
        return inLgAccUnitCode;
    }

    /**
     * Sets the value of the inLgAccUnitCode property.
     * 
     */
    public void setInLgAccUnitCode(int value) {
        this.inLgAccUnitCode = value;
    }

    /**
     * Gets the value of the inLgIssuer2CustomerCustId property.
     * 
     */
    public int getInLgIssuer2CustomerCustId() {
        return inLgIssuer2CustomerCustId;
    }

    /**
     * Sets the value of the inLgIssuer2CustomerCustId property.
     * 
     */
    public void setInLgIssuer2CustomerCustId(int value) {
        this.inLgIssuer2CustomerCustId = value;
    }

    /**
     * Gets the value of the inLgIssuer3CustomerCustId property.
     * 
     */
    public int getInLgIssuer3CustomerCustId() {
        return inLgIssuer3CustomerCustId;
    }

    /**
     * Sets the value of the inLgIssuer3CustomerCustId property.
     * 
     */
    public void setInLgIssuer3CustomerCustId(int value) {
        this.inLgIssuer3CustomerCustId = value;
    }

    /**
     * Gets the value of the inLgIssuer4CustomerCustId property.
     * 
     */
    public int getInLgIssuer4CustomerCustId() {
        return inLgIssuer4CustomerCustId;
    }

    /**
     * Sets the value of the inLgIssuer4CustomerCustId property.
     * 
     */
    public void setInLgIssuer4CustomerCustId(int value) {
        this.inLgIssuer4CustomerCustId = value;
    }

    /**
     * Gets the value of the inLgIssuer5CustomerCustId property.
     * 
     */
    public int getInLgIssuer5CustomerCustId() {
        return inLgIssuer5CustomerCustId;
    }

    /**
     * Sets the value of the inLgIssuer5CustomerCustId property.
     * 
     */
    public void setInLgIssuer5CustomerCustId(int value) {
        this.inLgIssuer5CustomerCustId = value;
    }

    /**
     * Gets the value of the inLgParameterLgAccsnAuto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLgParameterLgAccsnAuto() {
        return inLgParameterLgAccsnAuto;
    }

    /**
     * Sets the value of the inLgParameterLgAccsnAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLgParameterLgAccsnAuto(String value) {
        this.inLgParameterLgAccsnAuto = value;
    }

    /**
     * Gets the value of the inLgProductIdProduct property.
     * 
     */
    public int getInLgProductIdProduct() {
        return inLgProductIdProduct;
    }

    /**
     * Sets the value of the inLgProductIdProduct property.
     * 
     */
    public void setInLgProductIdProduct(int value) {
        this.inLgProductIdProduct = value;
    }

    /**
     * Gets the value of the inLgProductValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInLgProductValidityDate() {
        return inLgProductValidityDate;
    }

    /**
     * Sets the value of the inLgProductValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInLgProductValidityDate(XMLGregorianCalendar value) {
        this.inLgProductValidityDate = value;
    }

    /**
     * Gets the value of the inLimitCurrencyEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLimitCurrencyEntryStatus() {
        return inLimitCurrencyEntryStatus;
    }

    /**
     * Sets the value of the inLimitCurrencyEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLimitCurrencyEntryStatus(String value) {
        this.inLimitCurrencyEntryStatus = value;
    }

    /**
     * Gets the value of the inLimitCurrencyIdCurrency property.
     * 
     */
    public int getInLimitCurrencyIdCurrency() {
        return inLimitCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inLimitCurrencyIdCurrency property.
     * 
     */
    public void setInLimitCurrencyIdCurrency(int value) {
        this.inLimitCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inLimitCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLimitCurrencyNationalFlag() {
        return inLimitCurrencyNationalFlag;
    }

    /**
     * Sets the value of the inLimitCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLimitCurrencyNationalFlag(String value) {
        this.inLimitCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the inLimitCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInLimitCurrencyShortDescr() {
        return inLimitCurrencyShortDescr;
    }

    /**
     * Sets the value of the inLimitCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInLimitCurrencyShortDescr(String value) {
        this.inLimitCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inMonitoringBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMonitoringBankemployeeId() {
        return inMonitoringBankemployeeId;
    }

    /**
     * Sets the value of the inMonitoringBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMonitoringBankemployeeId(String value) {
        this.inMonitoringBankemployeeId = value;
    }

    /**
     * Gets the value of the inMovedCurrencyEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMovedCurrencyEntryStatus() {
        return inMovedCurrencyEntryStatus;
    }

    /**
     * Sets the value of the inMovedCurrencyEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMovedCurrencyEntryStatus(String value) {
        this.inMovedCurrencyEntryStatus = value;
    }

    /**
     * Gets the value of the inMovedCurrencyFixedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInMovedCurrencyFixedRate() {
        return inMovedCurrencyFixedRate;
    }

    /**
     * Sets the value of the inMovedCurrencyFixedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInMovedCurrencyFixedRate(BigDecimal value) {
        this.inMovedCurrencyFixedRate = value;
    }

    /**
     * Gets the value of the inMovedCurrencyIdCurrency property.
     * 
     */
    public int getInMovedCurrencyIdCurrency() {
        return inMovedCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inMovedCurrencyIdCurrency property.
     * 
     */
    public void setInMovedCurrencyIdCurrency(int value) {
        this.inMovedCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inMovedCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMovedCurrencyNationalFlag() {
        return inMovedCurrencyNationalFlag;
    }

    /**
     * Sets the value of the inMovedCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMovedCurrencyNationalFlag(String value) {
        this.inMovedCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the inMovedCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMovedCurrencyShortDescr() {
        return inMovedCurrencyShortDescr;
    }

    /**
     * Sets the value of the inMovedCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMovedCurrencyShortDescr(String value) {
        this.inMovedCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inOpenUnitCode property.
     * 
     */
    public int getInOpenUnitCode() {
        return inOpenUnitCode;
    }

    /**
     * Sets the value of the inOpenUnitCode property.
     * 
     */
    public void setInOpenUnitCode(int value) {
        this.inOpenUnitCode = value;
    }

    /**
     * Gets the value of the inPrintUnitCode property.
     * 
     */
    public int getInPrintUnitCode() {
        return inPrintUnitCode;
    }

    /**
     * Sets the value of the inPrintUnitCode property.
     * 
     */
    public void setInPrintUnitCode(int value) {
        this.inPrintUnitCode = value;
    }

    /**
     * Gets the value of the inPurchCurrencyIdCurrency property.
     * 
     */
    public int getInPurchCurrencyIdCurrency() {
        return inPurchCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inPurchCurrencyIdCurrency property.
     * 
     */
    public void setInPurchCurrencyIdCurrency(int value) {
        this.inPurchCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inReplacedAccUnitCode property.
     * 
     */
    public int getInReplacedAccUnitCode() {
        return inReplacedAccUnitCode;
    }

    /**
     * Sets the value of the inReplacedAccUnitCode property.
     * 
     */
    public void setInReplacedAccUnitCode(int value) {
        this.inReplacedAccUnitCode = value;
    }

    /**
     * Gets the value of the inReplacedLgAccountAccCd property.
     * 
     */
    public short getInReplacedLgAccountAccCd() {
        return inReplacedLgAccountAccCd;
    }

    /**
     * Sets the value of the inReplacedLgAccountAccCd property.
     * 
     */
    public void setInReplacedLgAccountAccCd(short value) {
        this.inReplacedLgAccountAccCd = value;
    }

    /**
     * Gets the value of the inReplacedLgAccountAccSn property.
     * 
     */
    public double getInReplacedLgAccountAccSn() {
        return inReplacedLgAccountAccSn;
    }

    /**
     * Sets the value of the inReplacedLgAccountAccSn property.
     * 
     */
    public void setInReplacedLgAccountAccSn(double value) {
        this.inReplacedLgAccountAccSn = value;
    }

    /**
     * Gets the value of the inReplacedLgAccountAccType property.
     * 
     */
    public short getInReplacedLgAccountAccType() {
        return inReplacedLgAccountAccType;
    }

    /**
     * Sets the value of the inReplacedLgAccountAccType property.
     * 
     */
    public void setInReplacedLgAccountAccType(short value) {
        this.inReplacedLgAccountAccType = value;
    }

    /**
     * Gets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSsSecurityCmcbTranCode() {
        return inSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the inSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSsSecurityCmcbTranCode(String value) {
        this.inSsSecurityCmcbTranCode = value;
    }

}
