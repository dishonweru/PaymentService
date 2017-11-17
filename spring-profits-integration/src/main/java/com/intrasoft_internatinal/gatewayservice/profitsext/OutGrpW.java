
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpW complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpW">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutAuthorizeIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrpAuthTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpAuthTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpAuthTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrpDetAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetAccProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrpDetAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrpDetaDepositOverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetailsChequeBookItemChequeCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrpDetailsChequeBookItemChequeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetailsChequeBookItemDepOnUsFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetailsChequeBookItemIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrpDetailsChequeBookItemItemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrpDetailsIefSuppliedDescChequeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetailsIefSuppliedDescCrDrFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetailsIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetailsIefSuppliedSelectionCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetCustCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetCustCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrpDetCustCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrpDetCustLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountTempExcEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountTempExcStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountTemporaryExcess" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepTrxjustTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetDepTrxRecordingOEnchroachToller" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepTrxRecordingOFinalAccAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepTrxRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrpDetDepTrxRecordingTunInternalSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrpDetDepTrxRecordingUUserTotalsAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrpDetDepUnclearTransAvailabilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrpDetDpTrxSpecialAgrValueDateSpread" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrpDetFdValeurBalanceValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrpDetIefSuppliedDescAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetIefSuppliedDescStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetInsufIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrpDetProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpW", propOrder = {
    "outGrpOutAuthorizeIefSuppliedActionEntryDesc",
    "outGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter",
    "outGrpOutGrpAuthTeamInformationAuthorizationType",
    "outGrpOutGrpAuthTeamInformationRequiredProfile1",
    "outGrpOutGrpAuthTeamInformationRequiredProfile2",
    "outGrpOutGrpDetAccCurrencyIdCurrency",
    "outGrpOutGrpDetAccCurrencyShortDescr",
    "outGrpOutGrpDetAccProductDescription",
    "outGrpOutGrpDetAccProductIdProduct",
    "outGrpOutGrpDetAccUnitCode",
    "outGrpOutGrpDetaDepositOverdraftLimit",
    "outGrpOutGrpDetAgreementAgrLimit",
    "outGrpOutGrpDetAgreementAgrUtilisedLimit",
    "outGrpOutGrpDetailsChequeBookItemChequeCd",
    "outGrpOutGrpDetailsChequeBookItemChequeStatus",
    "outGrpOutGrpDetailsChequeBookItemDepOnUsFlag",
    "outGrpOutGrpDetailsChequeBookItemIssueDate",
    "outGrpOutGrpDetailsChequeBookItemItemSerialNumber",
    "outGrpOutGrpDetailsIefSuppliedDescChequeStatus",
    "outGrpOutGrpDetailsIefSuppliedDescCrDrFlag",
    "outGrpOutGrpDetailsIefSuppliedSelectChar",
    "outGrpOutGrpDetailsIefSuppliedSelectionCriteria",
    "outGrpOutGrpDetCustCustomerAlertMsg",
    "outGrpOutGrpDetCustCustomerCDigit",
    "outGrpOutGrpDetCustCustomerCustId",
    "outGrpOutGrpDetCustLnsSuppliedName",
    "outGrpOutGrpDetDepositAccountAccountLimit",
    "outGrpOutGrpDetDepositAccountAccountNumber",
    "outGrpOutGrpDetDepositAccountAccountType",
    "outGrpOutGrpDetDepositAccountAvailableBalance",
    "outGrpOutGrpDetDepositAccountBlockedBalance",
    "outGrpOutGrpDetDepositAccountBookBalance",
    "outGrpOutGrpDetDepositAccountCDigit",
    "outGrpOutGrpDetDepositAccountDesignation",
    "outGrpOutGrpDetDepositAccountEncroachTolerance",
    "outGrpOutGrpDetDepositAccountEntryStatus",
    "outGrpOutGrpDetDepositAccountForecastBalance",
    "outGrpOutGrpDetDepositAccountOverdraftSpread",
    "outGrpOutGrpDetDepositAccountSecretAccFlag",
    "outGrpOutGrpDetDepositAccountTempExcEndDt",
    "outGrpOutGrpDetDepositAccountTempExcStartDt",
    "outGrpOutGrpDetDepositAccountTemporaryExcess",
    "outGrpOutGrpDetDepositAccountUnclearBalance",
    "outGrpOutGrpDetDepTrxjustTrnType",
    "outGrpOutGrpDetDepTrxRecordingOEnchroachToller",
    "outGrpOutGrpDetDepTrxRecordingOFinalAccAmount",
    "outGrpOutGrpDetDepTrxRecordingTrxUsrSn",
    "outGrpOutGrpDetDepTrxRecordingTunInternalSn",
    "outGrpOutGrpDetDepTrxRecordingUUserTotalsAmn",
    "outGrpOutGrpDetDepUnclearTransAvailabilityDate",
    "outGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread",
    "outGrpOutGrpDetDpTrxSpecialAgrValueDateSpread",
    "outGrpOutGrpDetFdValeurBalanceValueDate",
    "outGrpOutGrpDetIefSuppliedDescAccountType",
    "outGrpOutGrpDetIefSuppliedDescStatus",
    "outGrpOutGrpDetInsufIefSuppliedFlag",
    "outGrpOutGrpDetParVoucherRunVoucherLine",
    "outGrpOutGrpDetProfitsAccountAccountNumber"
})
public class OutGrpW {

    @XmlElement(name = "OutGrpOutAuthorizeIefSuppliedActionEntryDesc")
    protected String outGrpOutAuthorizeIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter")
    protected int outGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter;
    @XmlElement(name = "OutGrpOutGrpAuthTeamInformationAuthorizationType")
    protected String outGrpOutGrpAuthTeamInformationAuthorizationType;
    @XmlElement(name = "OutGrpOutGrpAuthTeamInformationRequiredProfile1")
    protected String outGrpOutGrpAuthTeamInformationRequiredProfile1;
    @XmlElement(name = "OutGrpOutGrpAuthTeamInformationRequiredProfile2")
    protected String outGrpOutGrpAuthTeamInformationRequiredProfile2;
    @XmlElement(name = "OutGrpOutGrpDetAccCurrencyIdCurrency")
    protected int outGrpOutGrpDetAccCurrencyIdCurrency;
    @XmlElement(name = "OutGrpOutGrpDetAccCurrencyShortDescr")
    protected String outGrpOutGrpDetAccCurrencyShortDescr;
    @XmlElement(name = "OutGrpOutGrpDetAccProductDescription")
    protected String outGrpOutGrpDetAccProductDescription;
    @XmlElement(name = "OutGrpOutGrpDetAccProductIdProduct")
    protected int outGrpOutGrpDetAccProductIdProduct;
    @XmlElement(name = "OutGrpOutGrpDetAccUnitCode")
    protected int outGrpOutGrpDetAccUnitCode;
    @XmlElement(name = "OutGrpOutGrpDetaDepositOverdraftLimit", required = true)
    protected BigDecimal outGrpOutGrpDetaDepositOverdraftLimit;
    @XmlElement(name = "OutGrpOutGrpDetAgreementAgrLimit", required = true)
    protected BigDecimal outGrpOutGrpDetAgreementAgrLimit;
    @XmlElement(name = "OutGrpOutGrpDetAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal outGrpOutGrpDetAgreementAgrUtilisedLimit;
    @XmlElement(name = "OutGrpOutGrpDetailsChequeBookItemChequeCd")
    protected short outGrpOutGrpDetailsChequeBookItemChequeCd;
    @XmlElement(name = "OutGrpOutGrpDetailsChequeBookItemChequeStatus")
    protected String outGrpOutGrpDetailsChequeBookItemChequeStatus;
    @XmlElement(name = "OutGrpOutGrpDetailsChequeBookItemDepOnUsFlag")
    protected String outGrpOutGrpDetailsChequeBookItemDepOnUsFlag;
    @XmlElement(name = "OutGrpOutGrpDetailsChequeBookItemIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrpDetailsChequeBookItemIssueDate;
    @XmlElement(name = "OutGrpOutGrpDetailsChequeBookItemItemSerialNumber")
    protected double outGrpOutGrpDetailsChequeBookItemItemSerialNumber;
    @XmlElement(name = "OutGrpOutGrpDetailsIefSuppliedDescChequeStatus")
    protected String outGrpOutGrpDetailsIefSuppliedDescChequeStatus;
    @XmlElement(name = "OutGrpOutGrpDetailsIefSuppliedDescCrDrFlag")
    protected String outGrpOutGrpDetailsIefSuppliedDescCrDrFlag;
    @XmlElement(name = "OutGrpOutGrpDetailsIefSuppliedSelectChar")
    protected String outGrpOutGrpDetailsIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpOutGrpDetailsIefSuppliedSelectionCriteria")
    protected String outGrpOutGrpDetailsIefSuppliedSelectionCriteria;
    @XmlElement(name = "OutGrpOutGrpDetCustCustomerAlertMsg")
    protected String outGrpOutGrpDetCustCustomerAlertMsg;
    @XmlElement(name = "OutGrpOutGrpDetCustCustomerCDigit")
    protected short outGrpOutGrpDetCustCustomerCDigit;
    @XmlElement(name = "OutGrpOutGrpDetCustCustomerCustId")
    protected int outGrpOutGrpDetCustCustomerCustId;
    @XmlElement(name = "OutGrpOutGrpDetCustLnsSuppliedName")
    protected String outGrpOutGrpDetCustLnsSuppliedName;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountAccountLimit", required = true)
    protected BigDecimal outGrpOutGrpDetDepositAccountAccountLimit;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountAccountNumber")
    protected double outGrpOutGrpDetDepositAccountAccountNumber;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountAccountType")
    protected String outGrpOutGrpDetDepositAccountAccountType;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountAvailableBalance", required = true)
    protected BigDecimal outGrpOutGrpDetDepositAccountAvailableBalance;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountBlockedBalance", required = true)
    protected BigDecimal outGrpOutGrpDetDepositAccountBlockedBalance;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountBookBalance", required = true)
    protected BigDecimal outGrpOutGrpDetDepositAccountBookBalance;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountCDigit")
    protected short outGrpOutGrpDetDepositAccountCDigit;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountDesignation")
    protected String outGrpOutGrpDetDepositAccountDesignation;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountEncroachTolerance", required = true)
    protected BigDecimal outGrpOutGrpDetDepositAccountEncroachTolerance;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountEntryStatus")
    protected String outGrpOutGrpDetDepositAccountEntryStatus;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountForecastBalance", required = true)
    protected BigDecimal outGrpOutGrpDetDepositAccountForecastBalance;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountOverdraftSpread", required = true)
    protected BigDecimal outGrpOutGrpDetDepositAccountOverdraftSpread;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountSecretAccFlag")
    protected String outGrpOutGrpDetDepositAccountSecretAccFlag;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountTempExcEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrpDetDepositAccountTempExcEndDt;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountTempExcStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrpDetDepositAccountTempExcStartDt;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountTemporaryExcess", required = true)
    protected BigDecimal outGrpOutGrpDetDepositAccountTemporaryExcess;
    @XmlElement(name = "OutGrpOutGrpDetDepositAccountUnclearBalance", required = true)
    protected BigDecimal outGrpOutGrpDetDepositAccountUnclearBalance;
    @XmlElement(name = "OutGrpOutGrpDetDepTrxjustTrnType")
    protected String outGrpOutGrpDetDepTrxjustTrnType;
    @XmlElement(name = "OutGrpOutGrpDetDepTrxRecordingOEnchroachToller", required = true)
    protected BigDecimal outGrpOutGrpDetDepTrxRecordingOEnchroachToller;
    @XmlElement(name = "OutGrpOutGrpDetDepTrxRecordingOFinalAccAmount", required = true)
    protected BigDecimal outGrpOutGrpDetDepTrxRecordingOFinalAccAmount;
    @XmlElement(name = "OutGrpOutGrpDetDepTrxRecordingTrxUsrSn")
    protected int outGrpOutGrpDetDepTrxRecordingTrxUsrSn;
    @XmlElement(name = "OutGrpOutGrpDetDepTrxRecordingTunInternalSn")
    protected short outGrpOutGrpDetDepTrxRecordingTunInternalSn;
    @XmlElement(name = "OutGrpOutGrpDetDepTrxRecordingUUserTotalsAmn", required = true)
    protected BigDecimal outGrpOutGrpDetDepTrxRecordingUUserTotalsAmn;
    @XmlElement(name = "OutGrpOutGrpDetDepUnclearTransAvailabilityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrpDetDepUnclearTransAvailabilityDate;
    @XmlElement(name = "OutGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread")
    protected short outGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread;
    @XmlElement(name = "OutGrpOutGrpDetDpTrxSpecialAgrValueDateSpread")
    protected short outGrpOutGrpDetDpTrxSpecialAgrValueDateSpread;
    @XmlElement(name = "OutGrpOutGrpDetFdValeurBalanceValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrpDetFdValeurBalanceValueDate;
    @XmlElement(name = "OutGrpOutGrpDetIefSuppliedDescAccountType")
    protected String outGrpOutGrpDetIefSuppliedDescAccountType;
    @XmlElement(name = "OutGrpOutGrpDetIefSuppliedDescStatus")
    protected String outGrpOutGrpDetIefSuppliedDescStatus;
    @XmlElement(name = "OutGrpOutGrpDetInsufIefSuppliedFlag")
    protected String outGrpOutGrpDetInsufIefSuppliedFlag;
    @XmlElement(name = "OutGrpOutGrpDetParVoucherRunVoucherLine")
    protected String outGrpOutGrpDetParVoucherRunVoucherLine;
    @XmlElement(name = "OutGrpOutGrpDetProfitsAccountAccountNumber")
    protected String outGrpOutGrpDetProfitsAccountAccountNumber;

    /**
     * Gets the value of the outGrpOutAuthorizeIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutAuthorizeIefSuppliedActionEntryDesc() {
        return outGrpOutAuthorizeIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outGrpOutAuthorizeIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutAuthorizeIefSuppliedActionEntryDesc(String value) {
        this.outGrpOutAuthorizeIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public int getOutGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter() {
        return outGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter;
    }

    /**
     * Sets the value of the outGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public void setOutGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter(int value) {
        this.outGrpOutGrpAdvCounterSuccessfulTransactionWorkAdviceCounter = value;
    }

    /**
     * Gets the value of the outGrpOutGrpAuthTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpAuthTeamInformationAuthorizationType() {
        return outGrpOutGrpAuthTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outGrpOutGrpAuthTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpAuthTeamInformationAuthorizationType(String value) {
        this.outGrpOutGrpAuthTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outGrpOutGrpAuthTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpAuthTeamInformationRequiredProfile1() {
        return outGrpOutGrpAuthTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outGrpOutGrpAuthTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpAuthTeamInformationRequiredProfile1(String value) {
        this.outGrpOutGrpAuthTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outGrpOutGrpAuthTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpAuthTeamInformationRequiredProfile2() {
        return outGrpOutGrpAuthTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outGrpOutGrpAuthTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpAuthTeamInformationRequiredProfile2(String value) {
        this.outGrpOutGrpAuthTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetAccCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpOutGrpDetAccCurrencyIdCurrency() {
        return outGrpOutGrpDetAccCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrpDetAccCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpOutGrpDetAccCurrencyIdCurrency(int value) {
        this.outGrpOutGrpDetAccCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetAccCurrencyShortDescr() {
        return outGrpOutGrpDetAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutGrpDetAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetAccCurrencyShortDescr(String value) {
        this.outGrpOutGrpDetAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetAccProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetAccProductDescription() {
        return outGrpOutGrpDetAccProductDescription;
    }

    /**
     * Sets the value of the outGrpOutGrpDetAccProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetAccProductDescription(String value) {
        this.outGrpOutGrpDetAccProductDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetAccProductIdProduct property.
     * 
     */
    public int getOutGrpOutGrpDetAccProductIdProduct() {
        return outGrpOutGrpDetAccProductIdProduct;
    }

    /**
     * Sets the value of the outGrpOutGrpDetAccProductIdProduct property.
     * 
     */
    public void setOutGrpOutGrpDetAccProductIdProduct(int value) {
        this.outGrpOutGrpDetAccProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetAccUnitCode property.
     * 
     */
    public int getOutGrpOutGrpDetAccUnitCode() {
        return outGrpOutGrpDetAccUnitCode;
    }

    /**
     * Sets the value of the outGrpOutGrpDetAccUnitCode property.
     * 
     */
    public void setOutGrpOutGrpDetAccUnitCode(int value) {
        this.outGrpOutGrpDetAccUnitCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetaDepositOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetaDepositOverdraftLimit() {
        return outGrpOutGrpDetaDepositOverdraftLimit;
    }

    /**
     * Sets the value of the outGrpOutGrpDetaDepositOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetaDepositOverdraftLimit(BigDecimal value) {
        this.outGrpOutGrpDetaDepositOverdraftLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetAgreementAgrLimit() {
        return outGrpOutGrpDetAgreementAgrLimit;
    }

    /**
     * Sets the value of the outGrpOutGrpDetAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetAgreementAgrLimit(BigDecimal value) {
        this.outGrpOutGrpDetAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetAgreementAgrUtilisedLimit() {
        return outGrpOutGrpDetAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the outGrpOutGrpDetAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetAgreementAgrUtilisedLimit(BigDecimal value) {
        this.outGrpOutGrpDetAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetailsChequeBookItemChequeCd property.
     * 
     */
    public short getOutGrpOutGrpDetailsChequeBookItemChequeCd() {
        return outGrpOutGrpDetailsChequeBookItemChequeCd;
    }

    /**
     * Sets the value of the outGrpOutGrpDetailsChequeBookItemChequeCd property.
     * 
     */
    public void setOutGrpOutGrpDetailsChequeBookItemChequeCd(short value) {
        this.outGrpOutGrpDetailsChequeBookItemChequeCd = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetailsChequeBookItemChequeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetailsChequeBookItemChequeStatus() {
        return outGrpOutGrpDetailsChequeBookItemChequeStatus;
    }

    /**
     * Sets the value of the outGrpOutGrpDetailsChequeBookItemChequeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetailsChequeBookItemChequeStatus(String value) {
        this.outGrpOutGrpDetailsChequeBookItemChequeStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetailsChequeBookItemDepOnUsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetailsChequeBookItemDepOnUsFlag() {
        return outGrpOutGrpDetailsChequeBookItemDepOnUsFlag;
    }

    /**
     * Sets the value of the outGrpOutGrpDetailsChequeBookItemDepOnUsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetailsChequeBookItemDepOnUsFlag(String value) {
        this.outGrpOutGrpDetailsChequeBookItemDepOnUsFlag = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetailsChequeBookItemIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrpDetailsChequeBookItemIssueDate() {
        return outGrpOutGrpDetailsChequeBookItemIssueDate;
    }

    /**
     * Sets the value of the outGrpOutGrpDetailsChequeBookItemIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrpDetailsChequeBookItemIssueDate(XMLGregorianCalendar value) {
        this.outGrpOutGrpDetailsChequeBookItemIssueDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetailsChequeBookItemItemSerialNumber property.
     * 
     */
    public double getOutGrpOutGrpDetailsChequeBookItemItemSerialNumber() {
        return outGrpOutGrpDetailsChequeBookItemItemSerialNumber;
    }

    /**
     * Sets the value of the outGrpOutGrpDetailsChequeBookItemItemSerialNumber property.
     * 
     */
    public void setOutGrpOutGrpDetailsChequeBookItemItemSerialNumber(double value) {
        this.outGrpOutGrpDetailsChequeBookItemItemSerialNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetailsIefSuppliedDescChequeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetailsIefSuppliedDescChequeStatus() {
        return outGrpOutGrpDetailsIefSuppliedDescChequeStatus;
    }

    /**
     * Sets the value of the outGrpOutGrpDetailsIefSuppliedDescChequeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetailsIefSuppliedDescChequeStatus(String value) {
        this.outGrpOutGrpDetailsIefSuppliedDescChequeStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetailsIefSuppliedDescCrDrFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetailsIefSuppliedDescCrDrFlag() {
        return outGrpOutGrpDetailsIefSuppliedDescCrDrFlag;
    }

    /**
     * Sets the value of the outGrpOutGrpDetailsIefSuppliedDescCrDrFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetailsIefSuppliedDescCrDrFlag(String value) {
        this.outGrpOutGrpDetailsIefSuppliedDescCrDrFlag = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetailsIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetailsIefSuppliedSelectChar() {
        return outGrpOutGrpDetailsIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpOutGrpDetailsIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetailsIefSuppliedSelectChar(String value) {
        this.outGrpOutGrpDetailsIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetailsIefSuppliedSelectionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetailsIefSuppliedSelectionCriteria() {
        return outGrpOutGrpDetailsIefSuppliedSelectionCriteria;
    }

    /**
     * Sets the value of the outGrpOutGrpDetailsIefSuppliedSelectionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetailsIefSuppliedSelectionCriteria(String value) {
        this.outGrpOutGrpDetailsIefSuppliedSelectionCriteria = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetCustCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetCustCustomerAlertMsg() {
        return outGrpOutGrpDetCustCustomerAlertMsg;
    }

    /**
     * Sets the value of the outGrpOutGrpDetCustCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetCustCustomerAlertMsg(String value) {
        this.outGrpOutGrpDetCustCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetCustCustomerCDigit property.
     * 
     */
    public short getOutGrpOutGrpDetCustCustomerCDigit() {
        return outGrpOutGrpDetCustCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpOutGrpDetCustCustomerCDigit property.
     * 
     */
    public void setOutGrpOutGrpDetCustCustomerCDigit(short value) {
        this.outGrpOutGrpDetCustCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetCustCustomerCustId property.
     * 
     */
    public int getOutGrpOutGrpDetCustCustomerCustId() {
        return outGrpOutGrpDetCustCustomerCustId;
    }

    /**
     * Sets the value of the outGrpOutGrpDetCustCustomerCustId property.
     * 
     */
    public void setOutGrpOutGrpDetCustCustomerCustId(int value) {
        this.outGrpOutGrpDetCustCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetCustLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetCustLnsSuppliedName() {
        return outGrpOutGrpDetCustLnsSuppliedName;
    }

    /**
     * Sets the value of the outGrpOutGrpDetCustLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetCustLnsSuppliedName(String value) {
        this.outGrpOutGrpDetCustLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountAccountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepositAccountAccountLimit() {
        return outGrpOutGrpDetDepositAccountAccountLimit;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountAccountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountAccountLimit(BigDecimal value) {
        this.outGrpOutGrpDetDepositAccountAccountLimit = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountAccountNumber property.
     * 
     */
    public double getOutGrpOutGrpDetDepositAccountAccountNumber() {
        return outGrpOutGrpDetDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountAccountNumber property.
     * 
     */
    public void setOutGrpOutGrpDetDepositAccountAccountNumber(double value) {
        this.outGrpOutGrpDetDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetDepositAccountAccountType() {
        return outGrpOutGrpDetDepositAccountAccountType;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountAccountType(String value) {
        this.outGrpOutGrpDetDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepositAccountAvailableBalance() {
        return outGrpOutGrpDetDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountAvailableBalance(BigDecimal value) {
        this.outGrpOutGrpDetDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepositAccountBlockedBalance() {
        return outGrpOutGrpDetDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountBlockedBalance(BigDecimal value) {
        this.outGrpOutGrpDetDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepositAccountBookBalance() {
        return outGrpOutGrpDetDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountBookBalance(BigDecimal value) {
        this.outGrpOutGrpDetDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountCDigit property.
     * 
     */
    public short getOutGrpOutGrpDetDepositAccountCDigit() {
        return outGrpOutGrpDetDepositAccountCDigit;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountCDigit property.
     * 
     */
    public void setOutGrpOutGrpDetDepositAccountCDigit(short value) {
        this.outGrpOutGrpDetDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetDepositAccountDesignation() {
        return outGrpOutGrpDetDepositAccountDesignation;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountDesignation(String value) {
        this.outGrpOutGrpDetDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepositAccountEncroachTolerance() {
        return outGrpOutGrpDetDepositAccountEncroachTolerance;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountEncroachTolerance(BigDecimal value) {
        this.outGrpOutGrpDetDepositAccountEncroachTolerance = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetDepositAccountEntryStatus() {
        return outGrpOutGrpDetDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountEntryStatus(String value) {
        this.outGrpOutGrpDetDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepositAccountForecastBalance() {
        return outGrpOutGrpDetDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountForecastBalance(BigDecimal value) {
        this.outGrpOutGrpDetDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepositAccountOverdraftSpread() {
        return outGrpOutGrpDetDepositAccountOverdraftSpread;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountOverdraftSpread(BigDecimal value) {
        this.outGrpOutGrpDetDepositAccountOverdraftSpread = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetDepositAccountSecretAccFlag() {
        return outGrpOutGrpDetDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountSecretAccFlag(String value) {
        this.outGrpOutGrpDetDepositAccountSecretAccFlag = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountTempExcEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrpDetDepositAccountTempExcEndDt() {
        return outGrpOutGrpDetDepositAccountTempExcEndDt;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountTempExcEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountTempExcEndDt(XMLGregorianCalendar value) {
        this.outGrpOutGrpDetDepositAccountTempExcEndDt = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountTempExcStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrpDetDepositAccountTempExcStartDt() {
        return outGrpOutGrpDetDepositAccountTempExcStartDt;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountTempExcStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountTempExcStartDt(XMLGregorianCalendar value) {
        this.outGrpOutGrpDetDepositAccountTempExcStartDt = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountTemporaryExcess property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepositAccountTemporaryExcess() {
        return outGrpOutGrpDetDepositAccountTemporaryExcess;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountTemporaryExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountTemporaryExcess(BigDecimal value) {
        this.outGrpOutGrpDetDepositAccountTemporaryExcess = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepositAccountUnclearBalance() {
        return outGrpOutGrpDetDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepositAccountUnclearBalance(BigDecimal value) {
        this.outGrpOutGrpDetDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepTrxjustTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetDepTrxjustTrnType() {
        return outGrpOutGrpDetDepTrxjustTrnType;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepTrxjustTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetDepTrxjustTrnType(String value) {
        this.outGrpOutGrpDetDepTrxjustTrnType = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepTrxRecordingOEnchroachToller property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepTrxRecordingOEnchroachToller() {
        return outGrpOutGrpDetDepTrxRecordingOEnchroachToller;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepTrxRecordingOEnchroachToller property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepTrxRecordingOEnchroachToller(BigDecimal value) {
        this.outGrpOutGrpDetDepTrxRecordingOEnchroachToller = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepTrxRecordingOFinalAccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepTrxRecordingOFinalAccAmount() {
        return outGrpOutGrpDetDepTrxRecordingOFinalAccAmount;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepTrxRecordingOFinalAccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepTrxRecordingOFinalAccAmount(BigDecimal value) {
        this.outGrpOutGrpDetDepTrxRecordingOFinalAccAmount = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepTrxRecordingTrxUsrSn property.
     * 
     */
    public int getOutGrpOutGrpDetDepTrxRecordingTrxUsrSn() {
        return outGrpOutGrpDetDepTrxRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepTrxRecordingTrxUsrSn property.
     * 
     */
    public void setOutGrpOutGrpDetDepTrxRecordingTrxUsrSn(int value) {
        this.outGrpOutGrpDetDepTrxRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepTrxRecordingTunInternalSn property.
     * 
     */
    public short getOutGrpOutGrpDetDepTrxRecordingTunInternalSn() {
        return outGrpOutGrpDetDepTrxRecordingTunInternalSn;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepTrxRecordingTunInternalSn property.
     * 
     */
    public void setOutGrpOutGrpDetDepTrxRecordingTunInternalSn(short value) {
        this.outGrpOutGrpDetDepTrxRecordingTunInternalSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepTrxRecordingUUserTotalsAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrpDetDepTrxRecordingUUserTotalsAmn() {
        return outGrpOutGrpDetDepTrxRecordingUUserTotalsAmn;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepTrxRecordingUUserTotalsAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrpDetDepTrxRecordingUUserTotalsAmn(BigDecimal value) {
        this.outGrpOutGrpDetDepTrxRecordingUUserTotalsAmn = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDepUnclearTransAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrpDetDepUnclearTransAvailabilityDate() {
        return outGrpOutGrpDetDepUnclearTransAvailabilityDate;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDepUnclearTransAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrpDetDepUnclearTransAvailabilityDate(XMLGregorianCalendar value) {
        this.outGrpOutGrpDetDepUnclearTransAvailabilityDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread property.
     * 
     */
    public short getOutGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread() {
        return outGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread property.
     * 
     */
    public void setOutGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread(short value) {
        this.outGrpOutGrpDetDpTrxSpecialAgrAvailDateSpread = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetDpTrxSpecialAgrValueDateSpread property.
     * 
     */
    public short getOutGrpOutGrpDetDpTrxSpecialAgrValueDateSpread() {
        return outGrpOutGrpDetDpTrxSpecialAgrValueDateSpread;
    }

    /**
     * Sets the value of the outGrpOutGrpDetDpTrxSpecialAgrValueDateSpread property.
     * 
     */
    public void setOutGrpOutGrpDetDpTrxSpecialAgrValueDateSpread(short value) {
        this.outGrpOutGrpDetDpTrxSpecialAgrValueDateSpread = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetFdValeurBalanceValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrpDetFdValeurBalanceValueDate() {
        return outGrpOutGrpDetFdValeurBalanceValueDate;
    }

    /**
     * Sets the value of the outGrpOutGrpDetFdValeurBalanceValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrpDetFdValeurBalanceValueDate(XMLGregorianCalendar value) {
        this.outGrpOutGrpDetFdValeurBalanceValueDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetIefSuppliedDescAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetIefSuppliedDescAccountType() {
        return outGrpOutGrpDetIefSuppliedDescAccountType;
    }

    /**
     * Sets the value of the outGrpOutGrpDetIefSuppliedDescAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetIefSuppliedDescAccountType(String value) {
        this.outGrpOutGrpDetIefSuppliedDescAccountType = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetIefSuppliedDescStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetIefSuppliedDescStatus() {
        return outGrpOutGrpDetIefSuppliedDescStatus;
    }

    /**
     * Sets the value of the outGrpOutGrpDetIefSuppliedDescStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetIefSuppliedDescStatus(String value) {
        this.outGrpOutGrpDetIefSuppliedDescStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetInsufIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetInsufIefSuppliedFlag() {
        return outGrpOutGrpDetInsufIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpOutGrpDetInsufIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetInsufIefSuppliedFlag(String value) {
        this.outGrpOutGrpDetInsufIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetParVoucherRunVoucherLine() {
        return outGrpOutGrpDetParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outGrpOutGrpDetParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetParVoucherRunVoucherLine(String value) {
        this.outGrpOutGrpDetParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outGrpOutGrpDetProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrpDetProfitsAccountAccountNumber() {
        return outGrpOutGrpDetProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the outGrpOutGrpDetProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrpDetProfitsAccountAccountNumber(String value) {
        this.outGrpOutGrpDetProfitsAccountAccountNumber = value;
    }

}
