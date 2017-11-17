
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0336VOutGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0336VOutGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGroupOutGrpParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpAuthIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpAuthTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpAuthTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpAuthTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpDepTrxjustTrnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpDepositOverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpIefSuppliedDescCrDrFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpIefSuppliedDescChequeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpAgreementAgrLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpAgreementAgrUtilisedLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrpCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrpProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrpProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpLnsSuppliedAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpLnsSuppliedIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrpCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrpCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountEncroachTolerance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountTemporaryExcess" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountTempExcStartDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountTempExcEndDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountAccountLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountOverdraftSpread" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpFdValeurBalanceValueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrpDepUnclearTransAvailabilityDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGroupOutGrpJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrpJustificDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpDepTrxRecordingOFinalAccAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepTrxRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGroupOutGrpDepTrxRecordingUUserTotalsAmn" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepTrxRecordingOEnchroachToller" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGroupOutGrpDepTrxRecordingIForecastFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGroupOutGrpChequeBookItemItemSerialNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGroupOutGrpChequeBookItemChequeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0336VOutGroupItem", propOrder = {
    "outGroupOutGrpParVoucherRunVoucherLine",
    "outGroupOutGrpAuthIefSuppliedActionEntryDesc",
    "outGroupOutGrpAuthTeamInformationRequiredProfile1",
    "outGroupOutGrpAuthTeamInformationRequiredProfile2",
    "outGroupOutGrpAuthTeamInformationAuthorizationType",
    "outGroupOutGrpDepTrxjustTrnType",
    "outGroupOutGrpDepositOverdraftLimit",
    "outGroupOutGrpIefSuppliedDescCrDrFlag",
    "outGroupOutGrpIefSuppliedDescChequeStatus",
    "outGroupOutGrpIefSuppliedSelectChar",
    "outGroupOutGrpAgreementAgrLimit",
    "outGroupOutGrpAgreementAgrUtilisedLimit",
    "outGroupOutGrpCurrencyIdCurrency",
    "outGroupOutGrpCurrencyShortDescr",
    "outGroupOutGrpUnitCode",
    "outGroupOutGrpProductIdProduct",
    "outGroupOutGrpProductDescription",
    "outGroupOutGrpLnsSuppliedName",
    "outGroupOutGrpLnsSuppliedAfmNo",
    "outGroupOutGrpLnsSuppliedIdNo",
    "outGroupOutGrpCustomerCustId",
    "outGroupOutGrpCustomerCDigit",
    "outGroupOutGrpCustomerAlertMsg",
    "outGroupOutGrpDepositAccountEntryStatus",
    "outGroupOutGrpDepositAccountSecretAccFlag",
    "outGroupOutGrpDepositAccountBookBalance",
    "outGroupOutGrpDepositAccountAvailableBalance",
    "outGroupOutGrpDepositAccountUnclearBalance",
    "outGroupOutGrpDepositAccountBlockedBalance",
    "outGroupOutGrpDepositAccountForecastBalance",
    "outGroupOutGrpDepositAccountDesignation",
    "outGroupOutGrpDepositAccountEncroachTolerance",
    "outGroupOutGrpDepositAccountTemporaryExcess",
    "outGroupOutGrpDepositAccountTempExcStartDt",
    "outGroupOutGrpDepositAccountTempExcEndDt",
    "outGroupOutGrpDepositAccountAccountLimit",
    "outGroupOutGrpDepositAccountAccountNumber",
    "outGroupOutGrpDepositAccountCDigit",
    "outGroupOutGrpDepositAccountOverdraftSpread",
    "outGroupOutGrpDepositAccountAccountType",
    "outGroupOutGrpFdValeurBalanceValueDate",
    "outGroupOutGrpDepUnclearTransAvailabilityDate",
    "outGroupOutGrpJustificIdJustific",
    "outGroupOutGrpJustificDescription",
    "outGroupOutGrpDepTrxRecordingOFinalAccAmount",
    "outGroupOutGrpDepTrxRecordingTrxUsrSn",
    "outGroupOutGrpDepTrxRecordingUUserTotalsAmn",
    "outGroupOutGrpDepTrxRecordingOEnchroachToller",
    "outGroupOutGrpDepTrxRecordingIForecastFlag",
    "outGroupOutGrpChequeBookItemItemSerialNumber",
    "outGroupOutGrpChequeBookItemChequeStatus"
})
public class D0336VOutGroupItem {

    @XmlElement(name = "OutGroupOutGrpParVoucherRunVoucherLine")
    protected String outGroupOutGrpParVoucherRunVoucherLine;
    @XmlElement(name = "OutGroupOutGrpAuthIefSuppliedActionEntryDesc")
    protected String outGroupOutGrpAuthIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutGroupOutGrpAuthTeamInformationRequiredProfile1")
    protected String outGroupOutGrpAuthTeamInformationRequiredProfile1;
    @XmlElement(name = "OutGroupOutGrpAuthTeamInformationRequiredProfile2")
    protected String outGroupOutGrpAuthTeamInformationRequiredProfile2;
    @XmlElement(name = "OutGroupOutGrpAuthTeamInformationAuthorizationType")
    protected String outGroupOutGrpAuthTeamInformationAuthorizationType;
    @XmlElement(name = "OutGroupOutGrpDepTrxjustTrnType")
    protected String outGroupOutGrpDepTrxjustTrnType;
    @XmlElement(name = "OutGroupOutGrpDepositOverdraftLimit", required = true)
    protected BigDecimal outGroupOutGrpDepositOverdraftLimit;
    @XmlElement(name = "OutGroupOutGrpIefSuppliedDescCrDrFlag")
    protected String outGroupOutGrpIefSuppliedDescCrDrFlag;
    @XmlElement(name = "OutGroupOutGrpIefSuppliedDescChequeStatus")
    protected String outGroupOutGrpIefSuppliedDescChequeStatus;
    @XmlElement(name = "OutGroupOutGrpIefSuppliedSelectChar")
    protected String outGroupOutGrpIefSuppliedSelectChar;
    @XmlElement(name = "OutGroupOutGrpAgreementAgrLimit", required = true)
    protected BigDecimal outGroupOutGrpAgreementAgrLimit;
    @XmlElement(name = "OutGroupOutGrpAgreementAgrUtilisedLimit", required = true)
    protected BigDecimal outGroupOutGrpAgreementAgrUtilisedLimit;
    @XmlElement(name = "OutGroupOutGrpCurrencyIdCurrency")
    protected int outGroupOutGrpCurrencyIdCurrency;
    @XmlElement(name = "OutGroupOutGrpCurrencyShortDescr")
    protected String outGroupOutGrpCurrencyShortDescr;
    @XmlElement(name = "OutGroupOutGrpUnitCode")
    protected int outGroupOutGrpUnitCode;
    @XmlElement(name = "OutGroupOutGrpProductIdProduct")
    protected int outGroupOutGrpProductIdProduct;
    @XmlElement(name = "OutGroupOutGrpProductDescription")
    protected String outGroupOutGrpProductDescription;
    @XmlElement(name = "OutGroupOutGrpLnsSuppliedName")
    protected String outGroupOutGrpLnsSuppliedName;
    @XmlElement(name = "OutGroupOutGrpLnsSuppliedAfmNo")
    protected String outGroupOutGrpLnsSuppliedAfmNo;
    @XmlElement(name = "OutGroupOutGrpLnsSuppliedIdNo")
    protected String outGroupOutGrpLnsSuppliedIdNo;
    @XmlElement(name = "OutGroupOutGrpCustomerCustId")
    protected int outGroupOutGrpCustomerCustId;
    @XmlElement(name = "OutGroupOutGrpCustomerCDigit")
    protected short outGroupOutGrpCustomerCDigit;
    @XmlElement(name = "OutGroupOutGrpCustomerAlertMsg")
    protected String outGroupOutGrpCustomerAlertMsg;
    @XmlElement(name = "OutGroupOutGrpDepositAccountEntryStatus")
    protected String outGroupOutGrpDepositAccountEntryStatus;
    @XmlElement(name = "OutGroupOutGrpDepositAccountSecretAccFlag")
    protected String outGroupOutGrpDepositAccountSecretAccFlag;
    @XmlElement(name = "OutGroupOutGrpDepositAccountBookBalance", required = true)
    protected BigDecimal outGroupOutGrpDepositAccountBookBalance;
    @XmlElement(name = "OutGroupOutGrpDepositAccountAvailableBalance", required = true)
    protected BigDecimal outGroupOutGrpDepositAccountAvailableBalance;
    @XmlElement(name = "OutGroupOutGrpDepositAccountUnclearBalance", required = true)
    protected BigDecimal outGroupOutGrpDepositAccountUnclearBalance;
    @XmlElement(name = "OutGroupOutGrpDepositAccountBlockedBalance", required = true)
    protected BigDecimal outGroupOutGrpDepositAccountBlockedBalance;
    @XmlElement(name = "OutGroupOutGrpDepositAccountForecastBalance", required = true)
    protected BigDecimal outGroupOutGrpDepositAccountForecastBalance;
    @XmlElement(name = "OutGroupOutGrpDepositAccountDesignation")
    protected String outGroupOutGrpDepositAccountDesignation;
    @XmlElement(name = "OutGroupOutGrpDepositAccountEncroachTolerance", required = true)
    protected BigDecimal outGroupOutGrpDepositAccountEncroachTolerance;
    @XmlElement(name = "OutGroupOutGrpDepositAccountTemporaryExcess", required = true)
    protected BigDecimal outGroupOutGrpDepositAccountTemporaryExcess;
    @XmlElement(name = "OutGroupOutGrpDepositAccountTempExcStartDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrpDepositAccountTempExcStartDt;
    @XmlElement(name = "OutGroupOutGrpDepositAccountTempExcEndDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrpDepositAccountTempExcEndDt;
    @XmlElement(name = "OutGroupOutGrpDepositAccountAccountLimit", required = true)
    protected BigDecimal outGroupOutGrpDepositAccountAccountLimit;
    @XmlElement(name = "OutGroupOutGrpDepositAccountAccountNumber")
    protected double outGroupOutGrpDepositAccountAccountNumber;
    @XmlElement(name = "OutGroupOutGrpDepositAccountCDigit")
    protected short outGroupOutGrpDepositAccountCDigit;
    @XmlElement(name = "OutGroupOutGrpDepositAccountOverdraftSpread", required = true)
    protected BigDecimal outGroupOutGrpDepositAccountOverdraftSpread;
    @XmlElement(name = "OutGroupOutGrpDepositAccountAccountType")
    protected String outGroupOutGrpDepositAccountAccountType;
    @XmlElement(name = "OutGroupOutGrpFdValeurBalanceValueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrpFdValeurBalanceValueDate;
    @XmlElement(name = "OutGroupOutGrpDepUnclearTransAvailabilityDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGroupOutGrpDepUnclearTransAvailabilityDate;
    @XmlElement(name = "OutGroupOutGrpJustificIdJustific")
    protected int outGroupOutGrpJustificIdJustific;
    @XmlElement(name = "OutGroupOutGrpJustificDescription")
    protected String outGroupOutGrpJustificDescription;
    @XmlElement(name = "OutGroupOutGrpDepTrxRecordingOFinalAccAmount", required = true)
    protected BigDecimal outGroupOutGrpDepTrxRecordingOFinalAccAmount;
    @XmlElement(name = "OutGroupOutGrpDepTrxRecordingTrxUsrSn")
    protected int outGroupOutGrpDepTrxRecordingTrxUsrSn;
    @XmlElement(name = "OutGroupOutGrpDepTrxRecordingUUserTotalsAmn", required = true)
    protected BigDecimal outGroupOutGrpDepTrxRecordingUUserTotalsAmn;
    @XmlElement(name = "OutGroupOutGrpDepTrxRecordingOEnchroachToller", required = true)
    protected BigDecimal outGroupOutGrpDepTrxRecordingOEnchroachToller;
    @XmlElement(name = "OutGroupOutGrpDepTrxRecordingIForecastFlag")
    protected String outGroupOutGrpDepTrxRecordingIForecastFlag;
    @XmlElement(name = "OutGroupOutGrpChequeBookItemItemSerialNumber")
    protected double outGroupOutGrpChequeBookItemItemSerialNumber;
    @XmlElement(name = "OutGroupOutGrpChequeBookItemChequeStatus")
    protected String outGroupOutGrpChequeBookItemChequeStatus;

    /**
     * Gets the value of the outGroupOutGrpParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpParVoucherRunVoucherLine() {
        return outGroupOutGrpParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outGroupOutGrpParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpParVoucherRunVoucherLine(String value) {
        this.outGroupOutGrpParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outGroupOutGrpAuthIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpAuthIefSuppliedActionEntryDesc() {
        return outGroupOutGrpAuthIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outGroupOutGrpAuthIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpAuthIefSuppliedActionEntryDesc(String value) {
        this.outGroupOutGrpAuthIefSuppliedActionEntryDesc = value;
    }

    /**
     * Gets the value of the outGroupOutGrpAuthTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpAuthTeamInformationRequiredProfile1() {
        return outGroupOutGrpAuthTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outGroupOutGrpAuthTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpAuthTeamInformationRequiredProfile1(String value) {
        this.outGroupOutGrpAuthTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outGroupOutGrpAuthTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpAuthTeamInformationRequiredProfile2() {
        return outGroupOutGrpAuthTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outGroupOutGrpAuthTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpAuthTeamInformationRequiredProfile2(String value) {
        this.outGroupOutGrpAuthTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outGroupOutGrpAuthTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpAuthTeamInformationAuthorizationType() {
        return outGroupOutGrpAuthTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outGroupOutGrpAuthTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpAuthTeamInformationAuthorizationType(String value) {
        this.outGroupOutGrpAuthTeamInformationAuthorizationType = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepTrxjustTrnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpDepTrxjustTrnType() {
        return outGroupOutGrpDepTrxjustTrnType;
    }

    /**
     * Sets the value of the outGroupOutGrpDepTrxjustTrnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpDepTrxjustTrnType(String value) {
        this.outGroupOutGrpDepTrxjustTrnType = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositOverdraftLimit() {
        return outGroupOutGrpDepositOverdraftLimit;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositOverdraftLimit(BigDecimal value) {
        this.outGroupOutGrpDepositOverdraftLimit = value;
    }

    /**
     * Gets the value of the outGroupOutGrpIefSuppliedDescCrDrFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpIefSuppliedDescCrDrFlag() {
        return outGroupOutGrpIefSuppliedDescCrDrFlag;
    }

    /**
     * Sets the value of the outGroupOutGrpIefSuppliedDescCrDrFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpIefSuppliedDescCrDrFlag(String value) {
        this.outGroupOutGrpIefSuppliedDescCrDrFlag = value;
    }

    /**
     * Gets the value of the outGroupOutGrpIefSuppliedDescChequeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpIefSuppliedDescChequeStatus() {
        return outGroupOutGrpIefSuppliedDescChequeStatus;
    }

    /**
     * Sets the value of the outGroupOutGrpIefSuppliedDescChequeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpIefSuppliedDescChequeStatus(String value) {
        this.outGroupOutGrpIefSuppliedDescChequeStatus = value;
    }

    /**
     * Gets the value of the outGroupOutGrpIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpIefSuppliedSelectChar() {
        return outGroupOutGrpIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGroupOutGrpIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpIefSuppliedSelectChar(String value) {
        this.outGroupOutGrpIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGroupOutGrpAgreementAgrLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpAgreementAgrLimit() {
        return outGroupOutGrpAgreementAgrLimit;
    }

    /**
     * Sets the value of the outGroupOutGrpAgreementAgrLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpAgreementAgrLimit(BigDecimal value) {
        this.outGroupOutGrpAgreementAgrLimit = value;
    }

    /**
     * Gets the value of the outGroupOutGrpAgreementAgrUtilisedLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpAgreementAgrUtilisedLimit() {
        return outGroupOutGrpAgreementAgrUtilisedLimit;
    }

    /**
     * Sets the value of the outGroupOutGrpAgreementAgrUtilisedLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpAgreementAgrUtilisedLimit(BigDecimal value) {
        this.outGroupOutGrpAgreementAgrUtilisedLimit = value;
    }

    /**
     * Gets the value of the outGroupOutGrpCurrencyIdCurrency property.
     * 
     */
    public int getOutGroupOutGrpCurrencyIdCurrency() {
        return outGroupOutGrpCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGroupOutGrpCurrencyIdCurrency property.
     * 
     */
    public void setOutGroupOutGrpCurrencyIdCurrency(int value) {
        this.outGroupOutGrpCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGroupOutGrpCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpCurrencyShortDescr() {
        return outGroupOutGrpCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGroupOutGrpCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpCurrencyShortDescr(String value) {
        this.outGroupOutGrpCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGroupOutGrpUnitCode property.
     * 
     */
    public int getOutGroupOutGrpUnitCode() {
        return outGroupOutGrpUnitCode;
    }

    /**
     * Sets the value of the outGroupOutGrpUnitCode property.
     * 
     */
    public void setOutGroupOutGrpUnitCode(int value) {
        this.outGroupOutGrpUnitCode = value;
    }

    /**
     * Gets the value of the outGroupOutGrpProductIdProduct property.
     * 
     */
    public int getOutGroupOutGrpProductIdProduct() {
        return outGroupOutGrpProductIdProduct;
    }

    /**
     * Sets the value of the outGroupOutGrpProductIdProduct property.
     * 
     */
    public void setOutGroupOutGrpProductIdProduct(int value) {
        this.outGroupOutGrpProductIdProduct = value;
    }

    /**
     * Gets the value of the outGroupOutGrpProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpProductDescription() {
        return outGroupOutGrpProductDescription;
    }

    /**
     * Sets the value of the outGroupOutGrpProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpProductDescription(String value) {
        this.outGroupOutGrpProductDescription = value;
    }

    /**
     * Gets the value of the outGroupOutGrpLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpLnsSuppliedName() {
        return outGroupOutGrpLnsSuppliedName;
    }

    /**
     * Sets the value of the outGroupOutGrpLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpLnsSuppliedName(String value) {
        this.outGroupOutGrpLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outGroupOutGrpLnsSuppliedAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpLnsSuppliedAfmNo() {
        return outGroupOutGrpLnsSuppliedAfmNo;
    }

    /**
     * Sets the value of the outGroupOutGrpLnsSuppliedAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpLnsSuppliedAfmNo(String value) {
        this.outGroupOutGrpLnsSuppliedAfmNo = value;
    }

    /**
     * Gets the value of the outGroupOutGrpLnsSuppliedIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpLnsSuppliedIdNo() {
        return outGroupOutGrpLnsSuppliedIdNo;
    }

    /**
     * Sets the value of the outGroupOutGrpLnsSuppliedIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpLnsSuppliedIdNo(String value) {
        this.outGroupOutGrpLnsSuppliedIdNo = value;
    }

    /**
     * Gets the value of the outGroupOutGrpCustomerCustId property.
     * 
     */
    public int getOutGroupOutGrpCustomerCustId() {
        return outGroupOutGrpCustomerCustId;
    }

    /**
     * Sets the value of the outGroupOutGrpCustomerCustId property.
     * 
     */
    public void setOutGroupOutGrpCustomerCustId(int value) {
        this.outGroupOutGrpCustomerCustId = value;
    }

    /**
     * Gets the value of the outGroupOutGrpCustomerCDigit property.
     * 
     */
    public short getOutGroupOutGrpCustomerCDigit() {
        return outGroupOutGrpCustomerCDigit;
    }

    /**
     * Sets the value of the outGroupOutGrpCustomerCDigit property.
     * 
     */
    public void setOutGroupOutGrpCustomerCDigit(short value) {
        this.outGroupOutGrpCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGroupOutGrpCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpCustomerAlertMsg() {
        return outGroupOutGrpCustomerAlertMsg;
    }

    /**
     * Sets the value of the outGroupOutGrpCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpCustomerAlertMsg(String value) {
        this.outGroupOutGrpCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpDepositAccountEntryStatus() {
        return outGroupOutGrpDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpDepositAccountEntryStatus(String value) {
        this.outGroupOutGrpDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpDepositAccountSecretAccFlag() {
        return outGroupOutGrpDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpDepositAccountSecretAccFlag(String value) {
        this.outGroupOutGrpDepositAccountSecretAccFlag = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositAccountBookBalance() {
        return outGroupOutGrpDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositAccountBookBalance(BigDecimal value) {
        this.outGroupOutGrpDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositAccountAvailableBalance() {
        return outGroupOutGrpDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositAccountAvailableBalance(BigDecimal value) {
        this.outGroupOutGrpDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositAccountUnclearBalance() {
        return outGroupOutGrpDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositAccountUnclearBalance(BigDecimal value) {
        this.outGroupOutGrpDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositAccountBlockedBalance() {
        return outGroupOutGrpDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositAccountBlockedBalance(BigDecimal value) {
        this.outGroupOutGrpDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositAccountForecastBalance() {
        return outGroupOutGrpDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositAccountForecastBalance(BigDecimal value) {
        this.outGroupOutGrpDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpDepositAccountDesignation() {
        return outGroupOutGrpDepositAccountDesignation;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpDepositAccountDesignation(String value) {
        this.outGroupOutGrpDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountEncroachTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositAccountEncroachTolerance() {
        return outGroupOutGrpDepositAccountEncroachTolerance;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountEncroachTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositAccountEncroachTolerance(BigDecimal value) {
        this.outGroupOutGrpDepositAccountEncroachTolerance = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountTemporaryExcess property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositAccountTemporaryExcess() {
        return outGroupOutGrpDepositAccountTemporaryExcess;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountTemporaryExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositAccountTemporaryExcess(BigDecimal value) {
        this.outGroupOutGrpDepositAccountTemporaryExcess = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountTempExcStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrpDepositAccountTempExcStartDt() {
        return outGroupOutGrpDepositAccountTempExcStartDt;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountTempExcStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrpDepositAccountTempExcStartDt(XMLGregorianCalendar value) {
        this.outGroupOutGrpDepositAccountTempExcStartDt = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountTempExcEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrpDepositAccountTempExcEndDt() {
        return outGroupOutGrpDepositAccountTempExcEndDt;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountTempExcEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrpDepositAccountTempExcEndDt(XMLGregorianCalendar value) {
        this.outGroupOutGrpDepositAccountTempExcEndDt = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountAccountLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositAccountAccountLimit() {
        return outGroupOutGrpDepositAccountAccountLimit;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountAccountLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositAccountAccountLimit(BigDecimal value) {
        this.outGroupOutGrpDepositAccountAccountLimit = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountAccountNumber property.
     * 
     */
    public double getOutGroupOutGrpDepositAccountAccountNumber() {
        return outGroupOutGrpDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountAccountNumber property.
     * 
     */
    public void setOutGroupOutGrpDepositAccountAccountNumber(double value) {
        this.outGroupOutGrpDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountCDigit property.
     * 
     */
    public short getOutGroupOutGrpDepositAccountCDigit() {
        return outGroupOutGrpDepositAccountCDigit;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountCDigit property.
     * 
     */
    public void setOutGroupOutGrpDepositAccountCDigit(short value) {
        this.outGroupOutGrpDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountOverdraftSpread property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepositAccountOverdraftSpread() {
        return outGroupOutGrpDepositAccountOverdraftSpread;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountOverdraftSpread property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepositAccountOverdraftSpread(BigDecimal value) {
        this.outGroupOutGrpDepositAccountOverdraftSpread = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpDepositAccountAccountType() {
        return outGroupOutGrpDepositAccountAccountType;
    }

    /**
     * Sets the value of the outGroupOutGrpDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpDepositAccountAccountType(String value) {
        this.outGroupOutGrpDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outGroupOutGrpFdValeurBalanceValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrpFdValeurBalanceValueDate() {
        return outGroupOutGrpFdValeurBalanceValueDate;
    }

    /**
     * Sets the value of the outGroupOutGrpFdValeurBalanceValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrpFdValeurBalanceValueDate(XMLGregorianCalendar value) {
        this.outGroupOutGrpFdValeurBalanceValueDate = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepUnclearTransAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGroupOutGrpDepUnclearTransAvailabilityDate() {
        return outGroupOutGrpDepUnclearTransAvailabilityDate;
    }

    /**
     * Sets the value of the outGroupOutGrpDepUnclearTransAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGroupOutGrpDepUnclearTransAvailabilityDate(XMLGregorianCalendar value) {
        this.outGroupOutGrpDepUnclearTransAvailabilityDate = value;
    }

    /**
     * Gets the value of the outGroupOutGrpJustificIdJustific property.
     * 
     */
    public int getOutGroupOutGrpJustificIdJustific() {
        return outGroupOutGrpJustificIdJustific;
    }

    /**
     * Sets the value of the outGroupOutGrpJustificIdJustific property.
     * 
     */
    public void setOutGroupOutGrpJustificIdJustific(int value) {
        this.outGroupOutGrpJustificIdJustific = value;
    }

    /**
     * Gets the value of the outGroupOutGrpJustificDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpJustificDescription() {
        return outGroupOutGrpJustificDescription;
    }

    /**
     * Sets the value of the outGroupOutGrpJustificDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpJustificDescription(String value) {
        this.outGroupOutGrpJustificDescription = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepTrxRecordingOFinalAccAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepTrxRecordingOFinalAccAmount() {
        return outGroupOutGrpDepTrxRecordingOFinalAccAmount;
    }

    /**
     * Sets the value of the outGroupOutGrpDepTrxRecordingOFinalAccAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepTrxRecordingOFinalAccAmount(BigDecimal value) {
        this.outGroupOutGrpDepTrxRecordingOFinalAccAmount = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepTrxRecordingTrxUsrSn property.
     * 
     */
    public int getOutGroupOutGrpDepTrxRecordingTrxUsrSn() {
        return outGroupOutGrpDepTrxRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outGroupOutGrpDepTrxRecordingTrxUsrSn property.
     * 
     */
    public void setOutGroupOutGrpDepTrxRecordingTrxUsrSn(int value) {
        this.outGroupOutGrpDepTrxRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepTrxRecordingUUserTotalsAmn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepTrxRecordingUUserTotalsAmn() {
        return outGroupOutGrpDepTrxRecordingUUserTotalsAmn;
    }

    /**
     * Sets the value of the outGroupOutGrpDepTrxRecordingUUserTotalsAmn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepTrxRecordingUUserTotalsAmn(BigDecimal value) {
        this.outGroupOutGrpDepTrxRecordingUUserTotalsAmn = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepTrxRecordingOEnchroachToller property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGroupOutGrpDepTrxRecordingOEnchroachToller() {
        return outGroupOutGrpDepTrxRecordingOEnchroachToller;
    }

    /**
     * Sets the value of the outGroupOutGrpDepTrxRecordingOEnchroachToller property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGroupOutGrpDepTrxRecordingOEnchroachToller(BigDecimal value) {
        this.outGroupOutGrpDepTrxRecordingOEnchroachToller = value;
    }

    /**
     * Gets the value of the outGroupOutGrpDepTrxRecordingIForecastFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpDepTrxRecordingIForecastFlag() {
        return outGroupOutGrpDepTrxRecordingIForecastFlag;
    }

    /**
     * Sets the value of the outGroupOutGrpDepTrxRecordingIForecastFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpDepTrxRecordingIForecastFlag(String value) {
        this.outGroupOutGrpDepTrxRecordingIForecastFlag = value;
    }

    /**
     * Gets the value of the outGroupOutGrpChequeBookItemItemSerialNumber property.
     * 
     */
    public double getOutGroupOutGrpChequeBookItemItemSerialNumber() {
        return outGroupOutGrpChequeBookItemItemSerialNumber;
    }

    /**
     * Sets the value of the outGroupOutGrpChequeBookItemItemSerialNumber property.
     * 
     */
    public void setOutGroupOutGrpChequeBookItemItemSerialNumber(double value) {
        this.outGroupOutGrpChequeBookItemItemSerialNumber = value;
    }

    /**
     * Gets the value of the outGroupOutGrpChequeBookItemChequeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGroupOutGrpChequeBookItemChequeStatus() {
        return outGroupOutGrpChequeBookItemChequeStatus;
    }

    /**
     * Sets the value of the outGroupOutGrpChequeBookItemChequeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGroupOutGrpChequeBookItemChequeStatus(String value) {
        this.outGroupOutGrpChequeBookItemChequeStatus = value;
    }

}
