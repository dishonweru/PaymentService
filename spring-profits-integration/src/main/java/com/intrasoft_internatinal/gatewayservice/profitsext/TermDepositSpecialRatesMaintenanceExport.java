
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TermDepositSpecialRatesMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermDepositSpecialRatesMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="Out1stCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out1stCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Out1stCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Out1stCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out1stCustomerExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Out1stCustomerMarketingReminder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out1stCustomerNonProfit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Out1stCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAskingRetUsrCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAskingUserInsRetLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutDealerInsRetLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetApprovInterRateAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutRetApprovInterRateCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRetApprovInterRateCrInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetApprovInterRateDbInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetApprovInterRateEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetApprovInterRateIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRetApprovInterRateInterPayOptions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetApprovInterRateRateAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRetApprovInterRateRenewalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetApprovInterRateStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRetApprovInterRateStatusFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetApprovInterRateTimeDepTransFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRetApprovInterRateTimestmp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTeamInformationAccountBenefAddressSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccountCobenefSnMail" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationAccountCode" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationAccountHomeBranch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAccountPsbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationAuthorizationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationAvailableDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationBeneficiarySn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationBlockTransactExpDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTeamInformationChargeDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCheqAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCheqIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutTeamInformationCheqStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationCommissionDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCreditInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCrInterestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCrInterestPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationCustomerCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationDbInterestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationDbInterestPer" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationDebitInterestRateSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationDepAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationEvaluationResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationFromCheqCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationFromCheqItemSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationInterestRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationJustificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationJustificationId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationNotifSpreadDayB" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationNotifSpreadDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationOverdraftAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyDiscount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationPenaltyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationRepresentativeSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationRestrictAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationServicePenaltySpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationStatementIssFreq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationToCheqCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationToCheqItemSerialNum" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutTeamInformationTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationTransactionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationTrsAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationUnclearWithdrawalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutTeamInformationUserCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserProfile3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationUserTerminalId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutTeamInformationValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutTeamInformationWithdrawAmnt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutTeamInformationWthdrawSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TermDepositSpecialRatesMaintenanceExport", propOrder = {
    "out1StCustomerAlertMsg",
    "out1StCustomerCDigit",
    "out1StCustomerCustId",
    "out1StCustomerCustType",
    "out1StCustomerExpireDate",
    "out1StCustomerMarketingReminder",
    "out1StCustomerNonProfit",
    "out1StCustomerTelephone1",
    "outAskingRetUsrCode",
    "outAskingUserInsRetLnsSuppliedName",
    "outCurrencyIdCurrency",
    "outCurrencyShortDescr",
    "outCurrTimePrintLineTime",
    "outDealerInsRetLnsSuppliedName",
    "outDepMntRecordingTrxUsrSn",
    "outDepositAccountAccountNumber",
    "outDepositAccountCDigit",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedSrvStatus",
    "outJustificDescription",
    "outJustificIdJustific",
    "outPrftTransactionDescription",
    "outProductDescription",
    "outProductIdProduct",
    "outProfitsAccountAccountNumber",
    "outRetApprovInterRateAccountNumber",
    "outRetApprovInterRateCDigit",
    "outRetApprovInterRateCrInterestRate",
    "outRetApprovInterRateDbInterestRate",
    "outRetApprovInterRateEndDate",
    "outRetApprovInterRateIdCurrency",
    "outRetApprovInterRateInterPayOptions",
    "outRetApprovInterRateRateAmount",
    "outRetApprovInterRateRenewalFlag",
    "outRetApprovInterRateStartDate",
    "outRetApprovInterRateStatusFlag",
    "outRetApprovInterRateTimeDepTransFlg",
    "outRetApprovInterRateTimestmp",
    "outTeamInformationAccountBenefAddressSn",
    "outTeamInformationAccountCobenefSnMail",
    "outTeamInformationAccountCode",
    "outTeamInformationAccountHomeBranch",
    "outTeamInformationAccountPsbSn",
    "outTeamInformationAuthorizationResult",
    "outTeamInformationAuthorizationType",
    "outTeamInformationAvailableDateSpread",
    "outTeamInformationBeneficiarySn",
    "outTeamInformationBlockTransactExpDate",
    "outTeamInformationChargeDiscount",
    "outTeamInformationCheqAmount",
    "outTeamInformationCheqIssueDate",
    "outTeamInformationCheqStatus",
    "outTeamInformationCommissionDiscount",
    "outTeamInformationCreditInterestRateSpread",
    "outTeamInformationCrInterestId",
    "outTeamInformationCrInterestPer",
    "outTeamInformationCustomerCode",
    "outTeamInformationCustomerSurname",
    "outTeamInformationDbInterestId",
    "outTeamInformationDbInterestPer",
    "outTeamInformationDebitInterestRateSpread",
    "outTeamInformationDepAccStatus",
    "outTeamInformationEncroachTolerance",
    "outTeamInformationEvaluationResult",
    "outTeamInformationFromCheqCd",
    "outTeamInformationFromCheqItemSerialNum",
    "outTeamInformationInterestRate",
    "outTeamInformationJustificationDescription",
    "outTeamInformationJustificationId",
    "outTeamInformationNotifSpreadDayB",
    "outTeamInformationNotifSpreadDays",
    "outTeamInformationOverdraftAmount",
    "outTeamInformationOverdraftSpread",
    "outTeamInformationPenaltyDiscount",
    "outTeamInformationPenaltyRate",
    "outTeamInformationProductDescription",
    "outTeamInformationProductId",
    "outTeamInformationRepresentativeSn",
    "outTeamInformationRequiredProfile1",
    "outTeamInformationRequiredProfile2",
    "outTeamInformationRestrictAccFlag",
    "outTeamInformationServicePenaltySpread",
    "outTeamInformationStatementIssFreq",
    "outTeamInformationToCheqCd",
    "outTeamInformationToCheqItemSerialNum",
    "outTeamInformationTransactionDescription",
    "outTeamInformationTransactionId",
    "outTeamInformationTrsAmount",
    "outTeamInformationUnclearWithdrawalFlag",
    "outTeamInformationUnitCode",
    "outTeamInformationUserCode",
    "outTeamInformationUserProfile1",
    "outTeamInformationUserProfile2",
    "outTeamInformationUserProfile3",
    "outTeamInformationUserSurname",
    "outTeamInformationUserTerminalId",
    "outTeamInformationValueDateSpread",
    "outTeamInformationWithdrawAmnt",
    "outTeamInformationWthdrawSpread"
})
public class TermDepositSpecialRatesMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "Out1stCustomerAlertMsg")
    protected String out1StCustomerAlertMsg;
    @XmlElement(name = "Out1stCustomerCDigit")
    protected short out1StCustomerCDigit;
    @XmlElement(name = "Out1stCustomerCustId")
    protected int out1StCustomerCustId;
    @XmlElement(name = "Out1stCustomerCustType")
    protected String out1StCustomerCustType;
    @XmlElement(name = "Out1stCustomerExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar out1StCustomerExpireDate;
    @XmlElement(name = "Out1stCustomerMarketingReminder")
    protected String out1StCustomerMarketingReminder;
    @XmlElement(name = "Out1stCustomerNonProfit")
    protected String out1StCustomerNonProfit;
    @XmlElement(name = "Out1stCustomerTelephone1")
    protected String out1StCustomerTelephone1;
    @XmlElement(name = "OutAskingRetUsrCode")
    protected String outAskingRetUsrCode;
    @XmlElement(name = "OutAskingUserInsRetLnsSuppliedName")
    protected String outAskingUserInsRetLnsSuppliedName;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCurrTimePrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineTime;
    @XmlElement(name = "OutDealerInsRetLnsSuppliedName")
    protected String outDealerInsRetLnsSuppliedName;
    @XmlElement(name = "OutDepMntRecordingTrxUsrSn")
    protected int outDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutDepositAccountAccountNumber")
    protected double outDepositAccountAccountNumber;
    @XmlElement(name = "OutDepositAccountCDigit")
    protected short outDepositAccountCDigit;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutJustificDescription")
    protected String outJustificDescription;
    @XmlElement(name = "OutJustificIdJustific")
    protected int outJustificIdJustific;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutProfitsAccountAccountNumber")
    protected String outProfitsAccountAccountNumber;
    @XmlElement(name = "OutRetApprovInterRateAccountNumber")
    protected double outRetApprovInterRateAccountNumber;
    @XmlElement(name = "OutRetApprovInterRateCDigit")
    protected short outRetApprovInterRateCDigit;
    @XmlElement(name = "OutRetApprovInterRateCrInterestRate", required = true)
    protected BigDecimal outRetApprovInterRateCrInterestRate;
    @XmlElement(name = "OutRetApprovInterRateDbInterestRate", required = true)
    protected BigDecimal outRetApprovInterRateDbInterestRate;
    @XmlElement(name = "OutRetApprovInterRateEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetApprovInterRateEndDate;
    @XmlElement(name = "OutRetApprovInterRateIdCurrency")
    protected int outRetApprovInterRateIdCurrency;
    @XmlElement(name = "OutRetApprovInterRateInterPayOptions")
    protected String outRetApprovInterRateInterPayOptions;
    @XmlElement(name = "OutRetApprovInterRateRateAmount", required = true)
    protected BigDecimal outRetApprovInterRateRateAmount;
    @XmlElement(name = "OutRetApprovInterRateRenewalFlag")
    protected String outRetApprovInterRateRenewalFlag;
    @XmlElement(name = "OutRetApprovInterRateStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetApprovInterRateStartDate;
    @XmlElement(name = "OutRetApprovInterRateStatusFlag")
    protected String outRetApprovInterRateStatusFlag;
    @XmlElement(name = "OutRetApprovInterRateTimeDepTransFlg")
    protected String outRetApprovInterRateTimeDepTransFlg;
    @XmlElement(name = "OutRetApprovInterRateTimestmp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRetApprovInterRateTimestmp;
    @XmlElement(name = "OutTeamInformationAccountBenefAddressSn")
    protected short outTeamInformationAccountBenefAddressSn;
    @XmlElement(name = "OutTeamInformationAccountCobenefSnMail")
    protected short outTeamInformationAccountCobenefSnMail;
    @XmlElement(name = "OutTeamInformationAccountCode")
    protected double outTeamInformationAccountCode;
    @XmlElement(name = "OutTeamInformationAccountHomeBranch")
    protected String outTeamInformationAccountHomeBranch;
    @XmlElement(name = "OutTeamInformationAccountPsbSn")
    protected int outTeamInformationAccountPsbSn;
    @XmlElement(name = "OutTeamInformationAuthorizationResult")
    protected String outTeamInformationAuthorizationResult;
    @XmlElement(name = "OutTeamInformationAuthorizationType")
    protected String outTeamInformationAuthorizationType;
    @XmlElement(name = "OutTeamInformationAvailableDateSpread")
    protected short outTeamInformationAvailableDateSpread;
    @XmlElement(name = "OutTeamInformationBeneficiarySn")
    protected short outTeamInformationBeneficiarySn;
    @XmlElement(name = "OutTeamInformationBlockTransactExpDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTeamInformationBlockTransactExpDate;
    @XmlElement(name = "OutTeamInformationChargeDiscount", required = true)
    protected BigDecimal outTeamInformationChargeDiscount;
    @XmlElement(name = "OutTeamInformationCheqAmount", required = true)
    protected BigDecimal outTeamInformationCheqAmount;
    @XmlElement(name = "OutTeamInformationCheqIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outTeamInformationCheqIssueDate;
    @XmlElement(name = "OutTeamInformationCheqStatus")
    protected String outTeamInformationCheqStatus;
    @XmlElement(name = "OutTeamInformationCommissionDiscount", required = true)
    protected BigDecimal outTeamInformationCommissionDiscount;
    @XmlElement(name = "OutTeamInformationCreditInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationCreditInterestRateSpread;
    @XmlElement(name = "OutTeamInformationCrInterestId")
    protected int outTeamInformationCrInterestId;
    @XmlElement(name = "OutTeamInformationCrInterestPer", required = true)
    protected BigDecimal outTeamInformationCrInterestPer;
    @XmlElement(name = "OutTeamInformationCustomerCode")
    protected int outTeamInformationCustomerCode;
    @XmlElement(name = "OutTeamInformationCustomerSurname")
    protected String outTeamInformationCustomerSurname;
    @XmlElement(name = "OutTeamInformationDbInterestId")
    protected int outTeamInformationDbInterestId;
    @XmlElement(name = "OutTeamInformationDbInterestPer", required = true)
    protected BigDecimal outTeamInformationDbInterestPer;
    @XmlElement(name = "OutTeamInformationDebitInterestRateSpread", required = true)
    protected BigDecimal outTeamInformationDebitInterestRateSpread;
    @XmlElement(name = "OutTeamInformationDepAccStatus")
    protected String outTeamInformationDepAccStatus;
    @XmlElement(name = "OutTeamInformationEncroachTolerance", required = true)
    protected BigDecimal outTeamInformationEncroachTolerance;
    @XmlElement(name = "OutTeamInformationEvaluationResult")
    protected String outTeamInformationEvaluationResult;
    @XmlElement(name = "OutTeamInformationFromCheqCd")
    protected short outTeamInformationFromCheqCd;
    @XmlElement(name = "OutTeamInformationFromCheqItemSerialNum")
    protected double outTeamInformationFromCheqItemSerialNum;
    @XmlElement(name = "OutTeamInformationInterestRate", required = true)
    protected BigDecimal outTeamInformationInterestRate;
    @XmlElement(name = "OutTeamInformationJustificationDescription")
    protected String outTeamInformationJustificationDescription;
    @XmlElement(name = "OutTeamInformationJustificationId")
    protected int outTeamInformationJustificationId;
    @XmlElement(name = "OutTeamInformationNotifSpreadDayB")
    protected short outTeamInformationNotifSpreadDayB;
    @XmlElement(name = "OutTeamInformationNotifSpreadDays")
    protected short outTeamInformationNotifSpreadDays;
    @XmlElement(name = "OutTeamInformationOverdraftAmount", required = true)
    protected BigDecimal outTeamInformationOverdraftAmount;
    @XmlElement(name = "OutTeamInformationOverdraftSpread", required = true)
    protected BigDecimal outTeamInformationOverdraftSpread;
    @XmlElement(name = "OutTeamInformationPenaltyDiscount", required = true)
    protected BigDecimal outTeamInformationPenaltyDiscount;
    @XmlElement(name = "OutTeamInformationPenaltyRate", required = true)
    protected BigDecimal outTeamInformationPenaltyRate;
    @XmlElement(name = "OutTeamInformationProductDescription")
    protected String outTeamInformationProductDescription;
    @XmlElement(name = "OutTeamInformationProductId")
    protected int outTeamInformationProductId;
    @XmlElement(name = "OutTeamInformationRepresentativeSn")
    protected short outTeamInformationRepresentativeSn;
    @XmlElement(name = "OutTeamInformationRequiredProfile1")
    protected String outTeamInformationRequiredProfile1;
    @XmlElement(name = "OutTeamInformationRequiredProfile2")
    protected String outTeamInformationRequiredProfile2;
    @XmlElement(name = "OutTeamInformationRestrictAccFlag")
    protected String outTeamInformationRestrictAccFlag;
    @XmlElement(name = "OutTeamInformationServicePenaltySpread", required = true)
    protected BigDecimal outTeamInformationServicePenaltySpread;
    @XmlElement(name = "OutTeamInformationStatementIssFreq")
    protected String outTeamInformationStatementIssFreq;
    @XmlElement(name = "OutTeamInformationToCheqCd")
    protected short outTeamInformationToCheqCd;
    @XmlElement(name = "OutTeamInformationToCheqItemSerialNum")
    protected double outTeamInformationToCheqItemSerialNum;
    @XmlElement(name = "OutTeamInformationTransactionDescription")
    protected String outTeamInformationTransactionDescription;
    @XmlElement(name = "OutTeamInformationTransactionId")
    protected int outTeamInformationTransactionId;
    @XmlElement(name = "OutTeamInformationTrsAmount", required = true)
    protected BigDecimal outTeamInformationTrsAmount;
    @XmlElement(name = "OutTeamInformationUnclearWithdrawalFlag")
    protected String outTeamInformationUnclearWithdrawalFlag;
    @XmlElement(name = "OutTeamInformationUnitCode")
    protected int outTeamInformationUnitCode;
    @XmlElement(name = "OutTeamInformationUserCode")
    protected String outTeamInformationUserCode;
    @XmlElement(name = "OutTeamInformationUserProfile1")
    protected String outTeamInformationUserProfile1;
    @XmlElement(name = "OutTeamInformationUserProfile2")
    protected String outTeamInformationUserProfile2;
    @XmlElement(name = "OutTeamInformationUserProfile3")
    protected String outTeamInformationUserProfile3;
    @XmlElement(name = "OutTeamInformationUserSurname")
    protected String outTeamInformationUserSurname;
    @XmlElement(name = "OutTeamInformationUserTerminalId")
    protected String outTeamInformationUserTerminalId;
    @XmlElement(name = "OutTeamInformationValueDateSpread")
    protected short outTeamInformationValueDateSpread;
    @XmlElement(name = "OutTeamInformationWithdrawAmnt", required = true)
    protected BigDecimal outTeamInformationWithdrawAmnt;
    @XmlElement(name = "OutTeamInformationWthdrawSpread")
    protected short outTeamInformationWthdrawSpread;

    /**
     * Gets the value of the out1StCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut1StCustomerAlertMsg() {
        return out1StCustomerAlertMsg;
    }

    /**
     * Sets the value of the out1StCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut1StCustomerAlertMsg(String value) {
        this.out1StCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the out1StCustomerCDigit property.
     * 
     */
    public short getOut1StCustomerCDigit() {
        return out1StCustomerCDigit;
    }

    /**
     * Sets the value of the out1StCustomerCDigit property.
     * 
     */
    public void setOut1StCustomerCDigit(short value) {
        this.out1StCustomerCDigit = value;
    }

    /**
     * Gets the value of the out1StCustomerCustId property.
     * 
     */
    public int getOut1StCustomerCustId() {
        return out1StCustomerCustId;
    }

    /**
     * Sets the value of the out1StCustomerCustId property.
     * 
     */
    public void setOut1StCustomerCustId(int value) {
        this.out1StCustomerCustId = value;
    }

    /**
     * Gets the value of the out1StCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut1StCustomerCustType() {
        return out1StCustomerCustType;
    }

    /**
     * Sets the value of the out1StCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut1StCustomerCustType(String value) {
        this.out1StCustomerCustType = value;
    }

    /**
     * Gets the value of the out1StCustomerExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOut1StCustomerExpireDate() {
        return out1StCustomerExpireDate;
    }

    /**
     * Sets the value of the out1StCustomerExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOut1StCustomerExpireDate(XMLGregorianCalendar value) {
        this.out1StCustomerExpireDate = value;
    }

    /**
     * Gets the value of the out1StCustomerMarketingReminder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut1StCustomerMarketingReminder() {
        return out1StCustomerMarketingReminder;
    }

    /**
     * Sets the value of the out1StCustomerMarketingReminder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut1StCustomerMarketingReminder(String value) {
        this.out1StCustomerMarketingReminder = value;
    }

    /**
     * Gets the value of the out1StCustomerNonProfit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut1StCustomerNonProfit() {
        return out1StCustomerNonProfit;
    }

    /**
     * Sets the value of the out1StCustomerNonProfit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut1StCustomerNonProfit(String value) {
        this.out1StCustomerNonProfit = value;
    }

    /**
     * Gets the value of the out1StCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOut1StCustomerTelephone1() {
        return out1StCustomerTelephone1;
    }

    /**
     * Sets the value of the out1StCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOut1StCustomerTelephone1(String value) {
        this.out1StCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the outAskingRetUsrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAskingRetUsrCode() {
        return outAskingRetUsrCode;
    }

    /**
     * Sets the value of the outAskingRetUsrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAskingRetUsrCode(String value) {
        this.outAskingRetUsrCode = value;
    }

    /**
     * Gets the value of the outAskingUserInsRetLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAskingUserInsRetLnsSuppliedName() {
        return outAskingUserInsRetLnsSuppliedName;
    }

    /**
     * Sets the value of the outAskingUserInsRetLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAskingUserInsRetLnsSuppliedName(String value) {
        this.outAskingUserInsRetLnsSuppliedName = value;
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
     * Gets the value of the outCurrTimePrintLineTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrTimePrintLineTime() {
        return outCurrTimePrintLineTime;
    }

    /**
     * Sets the value of the outCurrTimePrintLineTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrTimePrintLineTime(XMLGregorianCalendar value) {
        this.outCurrTimePrintLineTime = value;
    }

    /**
     * Gets the value of the outDealerInsRetLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDealerInsRetLnsSuppliedName() {
        return outDealerInsRetLnsSuppliedName;
    }

    /**
     * Sets the value of the outDealerInsRetLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDealerInsRetLnsSuppliedName(String value) {
        this.outDealerInsRetLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outDepMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutDepMntRecordingTrxUsrSn() {
        return outDepMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outDepMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutDepMntRecordingTrxUsrSn(int value) {
        this.outDepMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outDepositAccountAccountNumber property.
     * 
     */
    public double getOutDepositAccountAccountNumber() {
        return outDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outDepositAccountAccountNumber property.
     * 
     */
    public void setOutDepositAccountAccountNumber(double value) {
        this.outDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outDepositAccountCDigit property.
     * 
     */
    public short getOutDepositAccountCDigit() {
        return outDepositAccountCDigit;
    }

    /**
     * Sets the value of the outDepositAccountCDigit property.
     * 
     */
    public void setOutDepositAccountCDigit(short value) {
        this.outDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntryDesc() {
        return outIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntryDesc(String value) {
        this.outIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outIefSuppliedSrvStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedSrvStatus() {
        return outIefSuppliedSrvStatus;
    }

    /**
     * Sets the value of the outIefSuppliedSrvStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedSrvStatus(String value) {
        this.outIefSuppliedSrvStatus = value;
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
     * Gets the value of the outRetApprovInterRateAccountNumber property.
     * 
     */
    public double getOutRetApprovInterRateAccountNumber() {
        return outRetApprovInterRateAccountNumber;
    }

    /**
     * Sets the value of the outRetApprovInterRateAccountNumber property.
     * 
     */
    public void setOutRetApprovInterRateAccountNumber(double value) {
        this.outRetApprovInterRateAccountNumber = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateCDigit property.
     * 
     */
    public short getOutRetApprovInterRateCDigit() {
        return outRetApprovInterRateCDigit;
    }

    /**
     * Sets the value of the outRetApprovInterRateCDigit property.
     * 
     */
    public void setOutRetApprovInterRateCDigit(short value) {
        this.outRetApprovInterRateCDigit = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateCrInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetApprovInterRateCrInterestRate() {
        return outRetApprovInterRateCrInterestRate;
    }

    /**
     * Sets the value of the outRetApprovInterRateCrInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetApprovInterRateCrInterestRate(BigDecimal value) {
        this.outRetApprovInterRateCrInterestRate = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateDbInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetApprovInterRateDbInterestRate() {
        return outRetApprovInterRateDbInterestRate;
    }

    /**
     * Sets the value of the outRetApprovInterRateDbInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetApprovInterRateDbInterestRate(BigDecimal value) {
        this.outRetApprovInterRateDbInterestRate = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetApprovInterRateEndDate() {
        return outRetApprovInterRateEndDate;
    }

    /**
     * Sets the value of the outRetApprovInterRateEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetApprovInterRateEndDate(XMLGregorianCalendar value) {
        this.outRetApprovInterRateEndDate = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateIdCurrency property.
     * 
     */
    public int getOutRetApprovInterRateIdCurrency() {
        return outRetApprovInterRateIdCurrency;
    }

    /**
     * Sets the value of the outRetApprovInterRateIdCurrency property.
     * 
     */
    public void setOutRetApprovInterRateIdCurrency(int value) {
        this.outRetApprovInterRateIdCurrency = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateInterPayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetApprovInterRateInterPayOptions() {
        return outRetApprovInterRateInterPayOptions;
    }

    /**
     * Sets the value of the outRetApprovInterRateInterPayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetApprovInterRateInterPayOptions(String value) {
        this.outRetApprovInterRateInterPayOptions = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateRateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRetApprovInterRateRateAmount() {
        return outRetApprovInterRateRateAmount;
    }

    /**
     * Sets the value of the outRetApprovInterRateRateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRetApprovInterRateRateAmount(BigDecimal value) {
        this.outRetApprovInterRateRateAmount = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateRenewalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetApprovInterRateRenewalFlag() {
        return outRetApprovInterRateRenewalFlag;
    }

    /**
     * Sets the value of the outRetApprovInterRateRenewalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetApprovInterRateRenewalFlag(String value) {
        this.outRetApprovInterRateRenewalFlag = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetApprovInterRateStartDate() {
        return outRetApprovInterRateStartDate;
    }

    /**
     * Sets the value of the outRetApprovInterRateStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetApprovInterRateStartDate(XMLGregorianCalendar value) {
        this.outRetApprovInterRateStartDate = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateStatusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetApprovInterRateStatusFlag() {
        return outRetApprovInterRateStatusFlag;
    }

    /**
     * Sets the value of the outRetApprovInterRateStatusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetApprovInterRateStatusFlag(String value) {
        this.outRetApprovInterRateStatusFlag = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateTimeDepTransFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRetApprovInterRateTimeDepTransFlg() {
        return outRetApprovInterRateTimeDepTransFlg;
    }

    /**
     * Sets the value of the outRetApprovInterRateTimeDepTransFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRetApprovInterRateTimeDepTransFlg(String value) {
        this.outRetApprovInterRateTimeDepTransFlg = value;
    }

    /**
     * Gets the value of the outRetApprovInterRateTimestmp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRetApprovInterRateTimestmp() {
        return outRetApprovInterRateTimestmp;
    }

    /**
     * Sets the value of the outRetApprovInterRateTimestmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRetApprovInterRateTimestmp(XMLGregorianCalendar value) {
        this.outRetApprovInterRateTimestmp = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountBenefAddressSn property.
     * 
     */
    public short getOutTeamInformationAccountBenefAddressSn() {
        return outTeamInformationAccountBenefAddressSn;
    }

    /**
     * Sets the value of the outTeamInformationAccountBenefAddressSn property.
     * 
     */
    public void setOutTeamInformationAccountBenefAddressSn(short value) {
        this.outTeamInformationAccountBenefAddressSn = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountCobenefSnMail property.
     * 
     */
    public short getOutTeamInformationAccountCobenefSnMail() {
        return outTeamInformationAccountCobenefSnMail;
    }

    /**
     * Sets the value of the outTeamInformationAccountCobenefSnMail property.
     * 
     */
    public void setOutTeamInformationAccountCobenefSnMail(short value) {
        this.outTeamInformationAccountCobenefSnMail = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountCode property.
     * 
     */
    public double getOutTeamInformationAccountCode() {
        return outTeamInformationAccountCode;
    }

    /**
     * Sets the value of the outTeamInformationAccountCode property.
     * 
     */
    public void setOutTeamInformationAccountCode(double value) {
        this.outTeamInformationAccountCode = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountHomeBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAccountHomeBranch() {
        return outTeamInformationAccountHomeBranch;
    }

    /**
     * Sets the value of the outTeamInformationAccountHomeBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAccountHomeBranch(String value) {
        this.outTeamInformationAccountHomeBranch = value;
    }

    /**
     * Gets the value of the outTeamInformationAccountPsbSn property.
     * 
     */
    public int getOutTeamInformationAccountPsbSn() {
        return outTeamInformationAccountPsbSn;
    }

    /**
     * Sets the value of the outTeamInformationAccountPsbSn property.
     * 
     */
    public void setOutTeamInformationAccountPsbSn(int value) {
        this.outTeamInformationAccountPsbSn = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationResult() {
        return outTeamInformationAuthorizationResult;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationResult(String value) {
        this.outTeamInformationAuthorizationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationAuthorizationType() {
        return outTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationAuthorizationType(String value) {
        this.outTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outTeamInformationAvailableDateSpread property.
     * 
     */
    public short getOutTeamInformationAvailableDateSpread() {
        return outTeamInformationAvailableDateSpread;
    }

    /**
     * Sets the value of the outTeamInformationAvailableDateSpread property.
     * 
     */
    public void setOutTeamInformationAvailableDateSpread(short value) {
        this.outTeamInformationAvailableDateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationBeneficiarySn property.
     * 
     */
    public short getOutTeamInformationBeneficiarySn() {
        return outTeamInformationBeneficiarySn;
    }

    /**
     * Sets the value of the outTeamInformationBeneficiarySn property.
     * 
     */
    public void setOutTeamInformationBeneficiarySn(short value) {
        this.outTeamInformationBeneficiarySn = value;
    }

    /**
     * Gets the value of the outTeamInformationBlockTransactExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTeamInformationBlockTransactExpDate() {
        return outTeamInformationBlockTransactExpDate;
    }

    /**
     * Sets the value of the outTeamInformationBlockTransactExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTeamInformationBlockTransactExpDate(XMLGregorianCalendar value) {
        this.outTeamInformationBlockTransactExpDate = value;
    }

    /**
     * Gets the value of the outTeamInformationChargeDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationChargeDiscount() {
        return outTeamInformationChargeDiscount;
    }

    /**
     * Sets the value of the outTeamInformationChargeDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationChargeDiscount(BigDecimal value) {
        this.outTeamInformationChargeDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationCheqAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCheqAmount() {
        return outTeamInformationCheqAmount;
    }

    /**
     * Sets the value of the outTeamInformationCheqAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCheqAmount(BigDecimal value) {
        this.outTeamInformationCheqAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationCheqIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutTeamInformationCheqIssueDate() {
        return outTeamInformationCheqIssueDate;
    }

    /**
     * Sets the value of the outTeamInformationCheqIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutTeamInformationCheqIssueDate(XMLGregorianCalendar value) {
        this.outTeamInformationCheqIssueDate = value;
    }

    /**
     * Gets the value of the outTeamInformationCheqStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationCheqStatus() {
        return outTeamInformationCheqStatus;
    }

    /**
     * Sets the value of the outTeamInformationCheqStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationCheqStatus(String value) {
        this.outTeamInformationCheqStatus = value;
    }

    /**
     * Gets the value of the outTeamInformationCommissionDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCommissionDiscount() {
        return outTeamInformationCommissionDiscount;
    }

    /**
     * Sets the value of the outTeamInformationCommissionDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCommissionDiscount(BigDecimal value) {
        this.outTeamInformationCommissionDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationCreditInterestRateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCreditInterestRateSpread() {
        return outTeamInformationCreditInterestRateSpread;
    }

    /**
     * Sets the value of the outTeamInformationCreditInterestRateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCreditInterestRateSpread(BigDecimal value) {
        this.outTeamInformationCreditInterestRateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationCrInterestId property.
     * 
     */
    public int getOutTeamInformationCrInterestId() {
        return outTeamInformationCrInterestId;
    }

    /**
     * Sets the value of the outTeamInformationCrInterestId property.
     * 
     */
    public void setOutTeamInformationCrInterestId(int value) {
        this.outTeamInformationCrInterestId = value;
    }

    /**
     * Gets the value of the outTeamInformationCrInterestPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationCrInterestPer() {
        return outTeamInformationCrInterestPer;
    }

    /**
     * Sets the value of the outTeamInformationCrInterestPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationCrInterestPer(BigDecimal value) {
        this.outTeamInformationCrInterestPer = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public int getOutTeamInformationCustomerCode() {
        return outTeamInformationCustomerCode;
    }

    /**
     * Sets the value of the outTeamInformationCustomerCode property.
     * 
     */
    public void setOutTeamInformationCustomerCode(int value) {
        this.outTeamInformationCustomerCode = value;
    }

    /**
     * Gets the value of the outTeamInformationCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationCustomerSurname() {
        return outTeamInformationCustomerSurname;
    }

    /**
     * Sets the value of the outTeamInformationCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationCustomerSurname(String value) {
        this.outTeamInformationCustomerSurname = value;
    }

    /**
     * Gets the value of the outTeamInformationDbInterestId property.
     * 
     */
    public int getOutTeamInformationDbInterestId() {
        return outTeamInformationDbInterestId;
    }

    /**
     * Sets the value of the outTeamInformationDbInterestId property.
     * 
     */
    public void setOutTeamInformationDbInterestId(int value) {
        this.outTeamInformationDbInterestId = value;
    }

    /**
     * Gets the value of the outTeamInformationDbInterestPer property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationDbInterestPer() {
        return outTeamInformationDbInterestPer;
    }

    /**
     * Sets the value of the outTeamInformationDbInterestPer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationDbInterestPer(BigDecimal value) {
        this.outTeamInformationDbInterestPer = value;
    }

    /**
     * Gets the value of the outTeamInformationDebitInterestRateSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationDebitInterestRateSpread() {
        return outTeamInformationDebitInterestRateSpread;
    }

    /**
     * Sets the value of the outTeamInformationDebitInterestRateSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationDebitInterestRateSpread(BigDecimal value) {
        this.outTeamInformationDebitInterestRateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationDepAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationDepAccStatus() {
        return outTeamInformationDepAccStatus;
    }

    /**
     * Sets the value of the outTeamInformationDepAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationDepAccStatus(String value) {
        this.outTeamInformationDepAccStatus = value;
    }

    /**
     * Gets the value of the outTeamInformationEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationEncroachTolerance() {
        return outTeamInformationEncroachTolerance;
    }

    /**
     * Sets the value of the outTeamInformationEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationEncroachTolerance(BigDecimal value) {
        this.outTeamInformationEncroachTolerance = value;
    }

    /**
     * Gets the value of the outTeamInformationEvaluationResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationEvaluationResult() {
        return outTeamInformationEvaluationResult;
    }

    /**
     * Sets the value of the outTeamInformationEvaluationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationEvaluationResult(String value) {
        this.outTeamInformationEvaluationResult = value;
    }

    /**
     * Gets the value of the outTeamInformationFromCheqCd property.
     * 
     */
    public short getOutTeamInformationFromCheqCd() {
        return outTeamInformationFromCheqCd;
    }

    /**
     * Sets the value of the outTeamInformationFromCheqCd property.
     * 
     */
    public void setOutTeamInformationFromCheqCd(short value) {
        this.outTeamInformationFromCheqCd = value;
    }

    /**
     * Gets the value of the outTeamInformationFromCheqItemSerialNum property.
     * 
     */
    public double getOutTeamInformationFromCheqItemSerialNum() {
        return outTeamInformationFromCheqItemSerialNum;
    }

    /**
     * Sets the value of the outTeamInformationFromCheqItemSerialNum property.
     * 
     */
    public void setOutTeamInformationFromCheqItemSerialNum(double value) {
        this.outTeamInformationFromCheqItemSerialNum = value;
    }

    /**
     * Gets the value of the outTeamInformationInterestRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationInterestRate() {
        return outTeamInformationInterestRate;
    }

    /**
     * Sets the value of the outTeamInformationInterestRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationInterestRate(BigDecimal value) {
        this.outTeamInformationInterestRate = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationJustificationDescription() {
        return outTeamInformationJustificationDescription;
    }

    /**
     * Sets the value of the outTeamInformationJustificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationJustificationDescription(String value) {
        this.outTeamInformationJustificationDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationJustificationId property.
     * 
     */
    public int getOutTeamInformationJustificationId() {
        return outTeamInformationJustificationId;
    }

    /**
     * Sets the value of the outTeamInformationJustificationId property.
     * 
     */
    public void setOutTeamInformationJustificationId(int value) {
        this.outTeamInformationJustificationId = value;
    }

    /**
     * Gets the value of the outTeamInformationNotifSpreadDayB property.
     * 
     */
    public short getOutTeamInformationNotifSpreadDayB() {
        return outTeamInformationNotifSpreadDayB;
    }

    /**
     * Sets the value of the outTeamInformationNotifSpreadDayB property.
     * 
     */
    public void setOutTeamInformationNotifSpreadDayB(short value) {
        this.outTeamInformationNotifSpreadDayB = value;
    }

    /**
     * Gets the value of the outTeamInformationNotifSpreadDays property.
     * 
     */
    public short getOutTeamInformationNotifSpreadDays() {
        return outTeamInformationNotifSpreadDays;
    }

    /**
     * Sets the value of the outTeamInformationNotifSpreadDays property.
     * 
     */
    public void setOutTeamInformationNotifSpreadDays(short value) {
        this.outTeamInformationNotifSpreadDays = value;
    }

    /**
     * Gets the value of the outTeamInformationOverdraftAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationOverdraftAmount() {
        return outTeamInformationOverdraftAmount;
    }

    /**
     * Sets the value of the outTeamInformationOverdraftAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationOverdraftAmount(BigDecimal value) {
        this.outTeamInformationOverdraftAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationOverdraftSpread() {
        return outTeamInformationOverdraftSpread;
    }

    /**
     * Sets the value of the outTeamInformationOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationOverdraftSpread(BigDecimal value) {
        this.outTeamInformationOverdraftSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationPenaltyDiscount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationPenaltyDiscount() {
        return outTeamInformationPenaltyDiscount;
    }

    /**
     * Sets the value of the outTeamInformationPenaltyDiscount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationPenaltyDiscount(BigDecimal value) {
        this.outTeamInformationPenaltyDiscount = value;
    }

    /**
     * Gets the value of the outTeamInformationPenaltyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationPenaltyRate() {
        return outTeamInformationPenaltyRate;
    }

    /**
     * Sets the value of the outTeamInformationPenaltyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationPenaltyRate(BigDecimal value) {
        this.outTeamInformationPenaltyRate = value;
    }

    /**
     * Gets the value of the outTeamInformationProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationProductDescription() {
        return outTeamInformationProductDescription;
    }

    /**
     * Sets the value of the outTeamInformationProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationProductDescription(String value) {
        this.outTeamInformationProductDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationProductId property.
     * 
     */
    public int getOutTeamInformationProductId() {
        return outTeamInformationProductId;
    }

    /**
     * Sets the value of the outTeamInformationProductId property.
     * 
     */
    public void setOutTeamInformationProductId(int value) {
        this.outTeamInformationProductId = value;
    }

    /**
     * Gets the value of the outTeamInformationRepresentativeSn property.
     * 
     */
    public short getOutTeamInformationRepresentativeSn() {
        return outTeamInformationRepresentativeSn;
    }

    /**
     * Sets the value of the outTeamInformationRepresentativeSn property.
     * 
     */
    public void setOutTeamInformationRepresentativeSn(short value) {
        this.outTeamInformationRepresentativeSn = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile1() {
        return outTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile1(String value) {
        this.outTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRequiredProfile2() {
        return outTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRequiredProfile2(String value) {
        this.outTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationRestrictAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationRestrictAccFlag() {
        return outTeamInformationRestrictAccFlag;
    }

    /**
     * Sets the value of the outTeamInformationRestrictAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationRestrictAccFlag(String value) {
        this.outTeamInformationRestrictAccFlag = value;
    }

    /**
     * Gets the value of the outTeamInformationServicePenaltySpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationServicePenaltySpread() {
        return outTeamInformationServicePenaltySpread;
    }

    /**
     * Sets the value of the outTeamInformationServicePenaltySpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationServicePenaltySpread(BigDecimal value) {
        this.outTeamInformationServicePenaltySpread = value;
    }

    /**
     * Gets the value of the outTeamInformationStatementIssFreq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationStatementIssFreq() {
        return outTeamInformationStatementIssFreq;
    }

    /**
     * Sets the value of the outTeamInformationStatementIssFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationStatementIssFreq(String value) {
        this.outTeamInformationStatementIssFreq = value;
    }

    /**
     * Gets the value of the outTeamInformationToCheqCd property.
     * 
     */
    public short getOutTeamInformationToCheqCd() {
        return outTeamInformationToCheqCd;
    }

    /**
     * Sets the value of the outTeamInformationToCheqCd property.
     * 
     */
    public void setOutTeamInformationToCheqCd(short value) {
        this.outTeamInformationToCheqCd = value;
    }

    /**
     * Gets the value of the outTeamInformationToCheqItemSerialNum property.
     * 
     */
    public double getOutTeamInformationToCheqItemSerialNum() {
        return outTeamInformationToCheqItemSerialNum;
    }

    /**
     * Sets the value of the outTeamInformationToCheqItemSerialNum property.
     * 
     */
    public void setOutTeamInformationToCheqItemSerialNum(double value) {
        this.outTeamInformationToCheqItemSerialNum = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationTransactionDescription() {
        return outTeamInformationTransactionDescription;
    }

    /**
     * Sets the value of the outTeamInformationTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationTransactionDescription(String value) {
        this.outTeamInformationTransactionDescription = value;
    }

    /**
     * Gets the value of the outTeamInformationTransactionId property.
     * 
     */
    public int getOutTeamInformationTransactionId() {
        return outTeamInformationTransactionId;
    }

    /**
     * Sets the value of the outTeamInformationTransactionId property.
     * 
     */
    public void setOutTeamInformationTransactionId(int value) {
        this.outTeamInformationTransactionId = value;
    }

    /**
     * Gets the value of the outTeamInformationTrsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationTrsAmount() {
        return outTeamInformationTrsAmount;
    }

    /**
     * Sets the value of the outTeamInformationTrsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationTrsAmount(BigDecimal value) {
        this.outTeamInformationTrsAmount = value;
    }

    /**
     * Gets the value of the outTeamInformationUnclearWithdrawalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUnclearWithdrawalFlag() {
        return outTeamInformationUnclearWithdrawalFlag;
    }

    /**
     * Sets the value of the outTeamInformationUnclearWithdrawalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUnclearWithdrawalFlag(String value) {
        this.outTeamInformationUnclearWithdrawalFlag = value;
    }

    /**
     * Gets the value of the outTeamInformationUnitCode property.
     * 
     */
    public int getOutTeamInformationUnitCode() {
        return outTeamInformationUnitCode;
    }

    /**
     * Sets the value of the outTeamInformationUnitCode property.
     * 
     */
    public void setOutTeamInformationUnitCode(int value) {
        this.outTeamInformationUnitCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserCode() {
        return outTeamInformationUserCode;
    }

    /**
     * Sets the value of the outTeamInformationUserCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserCode(String value) {
        this.outTeamInformationUserCode = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile1() {
        return outTeamInformationUserProfile1;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile1(String value) {
        this.outTeamInformationUserProfile1 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile2() {
        return outTeamInformationUserProfile2;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile2(String value) {
        this.outTeamInformationUserProfile2 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserProfile3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserProfile3() {
        return outTeamInformationUserProfile3;
    }

    /**
     * Sets the value of the outTeamInformationUserProfile3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserProfile3(String value) {
        this.outTeamInformationUserProfile3 = value;
    }

    /**
     * Gets the value of the outTeamInformationUserSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserSurname() {
        return outTeamInformationUserSurname;
    }

    /**
     * Sets the value of the outTeamInformationUserSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserSurname(String value) {
        this.outTeamInformationUserSurname = value;
    }

    /**
     * Gets the value of the outTeamInformationUserTerminalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutTeamInformationUserTerminalId() {
        return outTeamInformationUserTerminalId;
    }

    /**
     * Sets the value of the outTeamInformationUserTerminalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutTeamInformationUserTerminalId(String value) {
        this.outTeamInformationUserTerminalId = value;
    }

    /**
     * Gets the value of the outTeamInformationValueDateSpread property.
     * 
     */
    public short getOutTeamInformationValueDateSpread() {
        return outTeamInformationValueDateSpread;
    }

    /**
     * Sets the value of the outTeamInformationValueDateSpread property.
     * 
     */
    public void setOutTeamInformationValueDateSpread(short value) {
        this.outTeamInformationValueDateSpread = value;
    }

    /**
     * Gets the value of the outTeamInformationWithdrawAmnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutTeamInformationWithdrawAmnt() {
        return outTeamInformationWithdrawAmnt;
    }

    /**
     * Sets the value of the outTeamInformationWithdrawAmnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutTeamInformationWithdrawAmnt(BigDecimal value) {
        this.outTeamInformationWithdrawAmnt = value;
    }

    /**
     * Gets the value of the outTeamInformationWthdrawSpread property.
     * 
     */
    public short getOutTeamInformationWthdrawSpread() {
        return outTeamInformationWthdrawSpread;
    }

    /**
     * Sets the value of the outTeamInformationWthdrawSpread property.
     * 
     */
    public void setOutTeamInformationWthdrawSpread(short value) {
        this.outTeamInformationWthdrawSpread = value;
    }

}
