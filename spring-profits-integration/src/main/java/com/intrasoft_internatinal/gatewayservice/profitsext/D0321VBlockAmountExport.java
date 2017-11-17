
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for D0321VBlockAmountExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="D0321VBlockAmountExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAccProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrTimePrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositOverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepTrxRecordingOEnchroachToller" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutEvaluationTeamInformationRequiredProfile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationTeamInformationRequiredProfile2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutEvaluationTeamInformationAuthorizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutParVoucherRunVoucherLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrnDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrnPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServAccCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServAccCustomerLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccDepositOverdraftLimit" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutServAccDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServAccDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServAccProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutUsedInputCharSuppliedChar37" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "D0321VBlockAmountExport", propOrder = {
    "outAccProductIdProduct",
    "outAccProductDescription",
    "outAccUnitCode",
    "outCurrTimePrintLineTime",
    "outCurrTimePrintLineDate",
    "outCustomerCustId",
    "outCustomerCDigit",
    "outCustomerLnsSuppliedName",
    "outDepositOverdraftLimit",
    "outDepositAccountBookBalance",
    "outDepositAccountAvailableBalance",
    "outDepositAccountUnclearBalance",
    "outDepositAccountBlockedBalance",
    "outDepositAccountForecastBalance",
    "outDepositAccountEntryStatus",
    "outDepositAccountSecretAccFlag",
    "outDepositAccountDesignation",
    "outDepositAccountAccountType",
    "outDepTrxRecordingOEnchroachToller",
    "outEvaluationTeamInformationRequiredProfile1",
    "outEvaluationTeamInformationRequiredProfile2",
    "outEvaluationTeamInformationAuthorizationType",
    "outIefSuppliedSrvStatus",
    "outIefSuppliedActionEntryDesc",
    "outParVoucherRunVoucherLine",
    "outPrnDepMntRecordingTrxUsrSn",
    "outPrnPrftTransactionDescription",
    "outServAccCurrencyIdCurrency",
    "outServAccCurrencyShortDescr",
    "outServAccCustomerCustId",
    "outServAccCustomerCDigit",
    "outServAccCustomerLnsSuppliedName",
    "outServAccDepositOverdraftLimit",
    "outServAccDepositAccountAccountNumber",
    "outServAccDepositAccountCDigit",
    "outServAccDepositAccountBookBalance",
    "outServAccDepositAccountAvailableBalance",
    "outServAccDepositAccountUnclearBalance",
    "outServAccDepositAccountBlockedBalance",
    "outServAccDepositAccountForecastBalance",
    "outServAccDepositAccountEntryStatus",
    "outServAccDepositAccountDesignation",
    "outServAccDepositAccountAccountType",
    "outServAccProductIdProduct",
    "outServAccProductDescription",
    "outServAccUnitCode",
    "outUsedInputCharSuppliedChar37"
})
public class D0321VBlockAmountExport
    extends BaseExport
{

    @XmlElement(name = "OutAccProductIdProduct")
    protected int outAccProductIdProduct;
    @XmlElement(name = "OutAccProductDescription")
    protected String outAccProductDescription;
    @XmlElement(name = "OutAccUnitCode")
    protected int outAccUnitCode;
    @XmlElement(name = "OutCurrTimePrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineTime;
    @XmlElement(name = "OutCurrTimePrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineDate;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerLnsSuppliedName")
    protected String outCustomerLnsSuppliedName;
    @XmlElement(name = "OutDepositOverdraftLimit", required = true)
    protected BigDecimal outDepositOverdraftLimit;
    @XmlElement(name = "OutDepositAccountBookBalance", required = true)
    protected BigDecimal outDepositAccountBookBalance;
    @XmlElement(name = "OutDepositAccountAvailableBalance", required = true)
    protected BigDecimal outDepositAccountAvailableBalance;
    @XmlElement(name = "OutDepositAccountUnclearBalance", required = true)
    protected BigDecimal outDepositAccountUnclearBalance;
    @XmlElement(name = "OutDepositAccountBlockedBalance", required = true)
    protected BigDecimal outDepositAccountBlockedBalance;
    @XmlElement(name = "OutDepositAccountForecastBalance", required = true)
    protected BigDecimal outDepositAccountForecastBalance;
    @XmlElement(name = "OutDepositAccountEntryStatus")
    protected String outDepositAccountEntryStatus;
    @XmlElement(name = "OutDepositAccountSecretAccFlag")
    protected String outDepositAccountSecretAccFlag;
    @XmlElement(name = "OutDepositAccountDesignation")
    protected String outDepositAccountDesignation;
    @XmlElement(name = "OutDepositAccountAccountType")
    protected String outDepositAccountAccountType;
    @XmlElement(name = "OutDepTrxRecordingOEnchroachToller", required = true)
    protected BigDecimal outDepTrxRecordingOEnchroachToller;
    @XmlElement(name = "OutEvaluationTeamInformationRequiredProfile1")
    protected String outEvaluationTeamInformationRequiredProfile1;
    @XmlElement(name = "OutEvaluationTeamInformationRequiredProfile2")
    protected String outEvaluationTeamInformationRequiredProfile2;
    @XmlElement(name = "OutEvaluationTeamInformationAuthorizationType")
    protected String outEvaluationTeamInformationAuthorizationType;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutParVoucherRunVoucherLine")
    protected String outParVoucherRunVoucherLine;
    @XmlElement(name = "OutPrnDepMntRecordingTrxUsrSn")
    protected int outPrnDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutPrnPrftTransactionDescription")
    protected String outPrnPrftTransactionDescription;
    @XmlElement(name = "OutServAccCurrencyIdCurrency")
    protected int outServAccCurrencyIdCurrency;
    @XmlElement(name = "OutServAccCurrencyShortDescr")
    protected String outServAccCurrencyShortDescr;
    @XmlElement(name = "OutServAccCustomerCustId")
    protected int outServAccCustomerCustId;
    @XmlElement(name = "OutServAccCustomerCDigit")
    protected short outServAccCustomerCDigit;
    @XmlElement(name = "OutServAccCustomerLnsSuppliedName")
    protected String outServAccCustomerLnsSuppliedName;
    @XmlElement(name = "OutServAccDepositOverdraftLimit", required = true)
    protected BigDecimal outServAccDepositOverdraftLimit;
    @XmlElement(name = "OutServAccDepositAccountAccountNumber")
    protected double outServAccDepositAccountAccountNumber;
    @XmlElement(name = "OutServAccDepositAccountCDigit")
    protected short outServAccDepositAccountCDigit;
    @XmlElement(name = "OutServAccDepositAccountBookBalance", required = true)
    protected BigDecimal outServAccDepositAccountBookBalance;
    @XmlElement(name = "OutServAccDepositAccountAvailableBalance", required = true)
    protected BigDecimal outServAccDepositAccountAvailableBalance;
    @XmlElement(name = "OutServAccDepositAccountUnclearBalance", required = true)
    protected BigDecimal outServAccDepositAccountUnclearBalance;
    @XmlElement(name = "OutServAccDepositAccountBlockedBalance", required = true)
    protected BigDecimal outServAccDepositAccountBlockedBalance;
    @XmlElement(name = "OutServAccDepositAccountForecastBalance", required = true)
    protected BigDecimal outServAccDepositAccountForecastBalance;
    @XmlElement(name = "OutServAccDepositAccountEntryStatus")
    protected String outServAccDepositAccountEntryStatus;
    @XmlElement(name = "OutServAccDepositAccountDesignation")
    protected String outServAccDepositAccountDesignation;
    @XmlElement(name = "OutServAccDepositAccountAccountType")
    protected String outServAccDepositAccountAccountType;
    @XmlElement(name = "OutServAccProductIdProduct")
    protected int outServAccProductIdProduct;
    @XmlElement(name = "OutServAccProductDescription")
    protected String outServAccProductDescription;
    @XmlElement(name = "OutServAccUnitCode")
    protected int outServAccUnitCode;
    @XmlElement(name = "OutUsedInputCharSuppliedChar37")
    protected String outUsedInputCharSuppliedChar37;

    /**
     * Gets the value of the outAccProductIdProduct property.
     * 
     */
    public int getOutAccProductIdProduct() {
        return outAccProductIdProduct;
    }

    /**
     * Sets the value of the outAccProductIdProduct property.
     * 
     */
    public void setOutAccProductIdProduct(int value) {
        this.outAccProductIdProduct = value;
    }

    /**
     * Gets the value of the outAccProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutAccProductDescription() {
        return outAccProductDescription;
    }

    /**
     * Sets the value of the outAccProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutAccProductDescription(String value) {
        this.outAccProductDescription = value;
    }

    /**
     * Gets the value of the outAccUnitCode property.
     * 
     */
    public int getOutAccUnitCode() {
        return outAccUnitCode;
    }

    /**
     * Sets the value of the outAccUnitCode property.
     * 
     */
    public void setOutAccUnitCode(int value) {
        this.outAccUnitCode = value;
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
     * Gets the value of the outCurrTimePrintLineDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCurrTimePrintLineDate() {
        return outCurrTimePrintLineDate;
    }

    /**
     * Sets the value of the outCurrTimePrintLineDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCurrTimePrintLineDate(XMLGregorianCalendar value) {
        this.outCurrTimePrintLineDate = value;
    }

    /**
     * Gets the value of the outCustomerCustId property.
     * 
     */
    public int getOutCustomerCustId() {
        return outCustomerCustId;
    }

    /**
     * Sets the value of the outCustomerCustId property.
     * 
     */
    public void setOutCustomerCustId(int value) {
        this.outCustomerCustId = value;
    }

    /**
     * Gets the value of the outCustomerCDigit property.
     * 
     */
    public short getOutCustomerCDigit() {
        return outCustomerCDigit;
    }

    /**
     * Sets the value of the outCustomerCDigit property.
     * 
     */
    public void setOutCustomerCDigit(short value) {
        this.outCustomerCDigit = value;
    }

    /**
     * Gets the value of the outCustomerLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerLnsSuppliedName() {
        return outCustomerLnsSuppliedName;
    }

    /**
     * Sets the value of the outCustomerLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerLnsSuppliedName(String value) {
        this.outCustomerLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outDepositOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositOverdraftLimit() {
        return outDepositOverdraftLimit;
    }

    /**
     * Sets the value of the outDepositOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositOverdraftLimit(BigDecimal value) {
        this.outDepositOverdraftLimit = value;
    }

    /**
     * Gets the value of the outDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountBookBalance() {
        return outDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountBookBalance(BigDecimal value) {
        this.outDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountAvailableBalance() {
        return outDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountAvailableBalance(BigDecimal value) {
        this.outDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountUnclearBalance() {
        return outDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the outDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountUnclearBalance(BigDecimal value) {
        this.outDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountBlockedBalance() {
        return outDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the outDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountBlockedBalance(BigDecimal value) {
        this.outDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepositAccountForecastBalance() {
        return outDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the outDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepositAccountForecastBalance(BigDecimal value) {
        this.outDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the outDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountEntryStatus() {
        return outDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountEntryStatus(String value) {
        this.outDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountSecretAccFlag() {
        return outDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountSecretAccFlag(String value) {
        this.outDepositAccountSecretAccFlag = value;
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
     * Gets the value of the outDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDepositAccountAccountType() {
        return outDepositAccountAccountType;
    }

    /**
     * Sets the value of the outDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDepositAccountAccountType(String value) {
        this.outDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outDepTrxRecordingOEnchroachToller property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutDepTrxRecordingOEnchroachToller() {
        return outDepTrxRecordingOEnchroachToller;
    }

    /**
     * Sets the value of the outDepTrxRecordingOEnchroachToller property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutDepTrxRecordingOEnchroachToller(BigDecimal value) {
        this.outDepTrxRecordingOEnchroachToller = value;
    }

    /**
     * Gets the value of the outEvaluationTeamInformationRequiredProfile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationTeamInformationRequiredProfile1() {
        return outEvaluationTeamInformationRequiredProfile1;
    }

    /**
     * Sets the value of the outEvaluationTeamInformationRequiredProfile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationTeamInformationRequiredProfile1(String value) {
        this.outEvaluationTeamInformationRequiredProfile1 = value;
    }

    /**
     * Gets the value of the outEvaluationTeamInformationRequiredProfile2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationTeamInformationRequiredProfile2() {
        return outEvaluationTeamInformationRequiredProfile2;
    }

    /**
     * Sets the value of the outEvaluationTeamInformationRequiredProfile2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationTeamInformationRequiredProfile2(String value) {
        this.outEvaluationTeamInformationRequiredProfile2 = value;
    }

    /**
     * Gets the value of the outEvaluationTeamInformationAuthorizationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutEvaluationTeamInformationAuthorizationType() {
        return outEvaluationTeamInformationAuthorizationType;
    }

    /**
     * Sets the value of the outEvaluationTeamInformationAuthorizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutEvaluationTeamInformationAuthorizationType(String value) {
        this.outEvaluationTeamInformationAuthorizationType = value;
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
     * Gets the value of the outParVoucherRunVoucherLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutParVoucherRunVoucherLine() {
        return outParVoucherRunVoucherLine;
    }

    /**
     * Sets the value of the outParVoucherRunVoucherLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutParVoucherRunVoucherLine(String value) {
        this.outParVoucherRunVoucherLine = value;
    }

    /**
     * Gets the value of the outPrnDepMntRecordingTrxUsrSn property.
     * 
     */
    public int getOutPrnDepMntRecordingTrxUsrSn() {
        return outPrnDepMntRecordingTrxUsrSn;
    }

    /**
     * Sets the value of the outPrnDepMntRecordingTrxUsrSn property.
     * 
     */
    public void setOutPrnDepMntRecordingTrxUsrSn(int value) {
        this.outPrnDepMntRecordingTrxUsrSn = value;
    }

    /**
     * Gets the value of the outPrnPrftTransactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutPrnPrftTransactionDescription() {
        return outPrnPrftTransactionDescription;
    }

    /**
     * Sets the value of the outPrnPrftTransactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutPrnPrftTransactionDescription(String value) {
        this.outPrnPrftTransactionDescription = value;
    }

    /**
     * Gets the value of the outServAccCurrencyIdCurrency property.
     * 
     */
    public int getOutServAccCurrencyIdCurrency() {
        return outServAccCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outServAccCurrencyIdCurrency property.
     * 
     */
    public void setOutServAccCurrencyIdCurrency(int value) {
        this.outServAccCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outServAccCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServAccCurrencyShortDescr() {
        return outServAccCurrencyShortDescr;
    }

    /**
     * Sets the value of the outServAccCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServAccCurrencyShortDescr(String value) {
        this.outServAccCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outServAccCustomerCustId property.
     * 
     */
    public int getOutServAccCustomerCustId() {
        return outServAccCustomerCustId;
    }

    /**
     * Sets the value of the outServAccCustomerCustId property.
     * 
     */
    public void setOutServAccCustomerCustId(int value) {
        this.outServAccCustomerCustId = value;
    }

    /**
     * Gets the value of the outServAccCustomerCDigit property.
     * 
     */
    public short getOutServAccCustomerCDigit() {
        return outServAccCustomerCDigit;
    }

    /**
     * Sets the value of the outServAccCustomerCDigit property.
     * 
     */
    public void setOutServAccCustomerCDigit(short value) {
        this.outServAccCustomerCDigit = value;
    }

    /**
     * Gets the value of the outServAccCustomerLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServAccCustomerLnsSuppliedName() {
        return outServAccCustomerLnsSuppliedName;
    }

    /**
     * Sets the value of the outServAccCustomerLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServAccCustomerLnsSuppliedName(String value) {
        this.outServAccCustomerLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outServAccDepositOverdraftLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServAccDepositOverdraftLimit() {
        return outServAccDepositOverdraftLimit;
    }

    /**
     * Sets the value of the outServAccDepositOverdraftLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServAccDepositOverdraftLimit(BigDecimal value) {
        this.outServAccDepositOverdraftLimit = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountAccountNumber property.
     * 
     */
    public double getOutServAccDepositAccountAccountNumber() {
        return outServAccDepositAccountAccountNumber;
    }

    /**
     * Sets the value of the outServAccDepositAccountAccountNumber property.
     * 
     */
    public void setOutServAccDepositAccountAccountNumber(double value) {
        this.outServAccDepositAccountAccountNumber = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountCDigit property.
     * 
     */
    public short getOutServAccDepositAccountCDigit() {
        return outServAccDepositAccountCDigit;
    }

    /**
     * Sets the value of the outServAccDepositAccountCDigit property.
     * 
     */
    public void setOutServAccDepositAccountCDigit(short value) {
        this.outServAccDepositAccountCDigit = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountBookBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServAccDepositAccountBookBalance() {
        return outServAccDepositAccountBookBalance;
    }

    /**
     * Sets the value of the outServAccDepositAccountBookBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServAccDepositAccountBookBalance(BigDecimal value) {
        this.outServAccDepositAccountBookBalance = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServAccDepositAccountAvailableBalance() {
        return outServAccDepositAccountAvailableBalance;
    }

    /**
     * Sets the value of the outServAccDepositAccountAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServAccDepositAccountAvailableBalance(BigDecimal value) {
        this.outServAccDepositAccountAvailableBalance = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountUnclearBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServAccDepositAccountUnclearBalance() {
        return outServAccDepositAccountUnclearBalance;
    }

    /**
     * Sets the value of the outServAccDepositAccountUnclearBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServAccDepositAccountUnclearBalance(BigDecimal value) {
        this.outServAccDepositAccountUnclearBalance = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountBlockedBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServAccDepositAccountBlockedBalance() {
        return outServAccDepositAccountBlockedBalance;
    }

    /**
     * Sets the value of the outServAccDepositAccountBlockedBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServAccDepositAccountBlockedBalance(BigDecimal value) {
        this.outServAccDepositAccountBlockedBalance = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountForecastBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutServAccDepositAccountForecastBalance() {
        return outServAccDepositAccountForecastBalance;
    }

    /**
     * Sets the value of the outServAccDepositAccountForecastBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutServAccDepositAccountForecastBalance(BigDecimal value) {
        this.outServAccDepositAccountForecastBalance = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServAccDepositAccountEntryStatus() {
        return outServAccDepositAccountEntryStatus;
    }

    /**
     * Sets the value of the outServAccDepositAccountEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServAccDepositAccountEntryStatus(String value) {
        this.outServAccDepositAccountEntryStatus = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountDesignation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServAccDepositAccountDesignation() {
        return outServAccDepositAccountDesignation;
    }

    /**
     * Sets the value of the outServAccDepositAccountDesignation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServAccDepositAccountDesignation(String value) {
        this.outServAccDepositAccountDesignation = value;
    }

    /**
     * Gets the value of the outServAccDepositAccountAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServAccDepositAccountAccountType() {
        return outServAccDepositAccountAccountType;
    }

    /**
     * Sets the value of the outServAccDepositAccountAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServAccDepositAccountAccountType(String value) {
        this.outServAccDepositAccountAccountType = value;
    }

    /**
     * Gets the value of the outServAccProductIdProduct property.
     * 
     */
    public int getOutServAccProductIdProduct() {
        return outServAccProductIdProduct;
    }

    /**
     * Sets the value of the outServAccProductIdProduct property.
     * 
     */
    public void setOutServAccProductIdProduct(int value) {
        this.outServAccProductIdProduct = value;
    }

    /**
     * Gets the value of the outServAccProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServAccProductDescription() {
        return outServAccProductDescription;
    }

    /**
     * Sets the value of the outServAccProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServAccProductDescription(String value) {
        this.outServAccProductDescription = value;
    }

    /**
     * Gets the value of the outServAccUnitCode property.
     * 
     */
    public int getOutServAccUnitCode() {
        return outServAccUnitCode;
    }

    /**
     * Sets the value of the outServAccUnitCode property.
     * 
     */
    public void setOutServAccUnitCode(int value) {
        this.outServAccUnitCode = value;
    }

    /**
     * Gets the value of the outUsedInputCharSuppliedChar37 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutUsedInputCharSuppliedChar37() {
        return outUsedInputCharSuppliedChar37;
    }

    /**
     * Sets the value of the outUsedInputCharSuppliedChar37 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutUsedInputCharSuppliedChar37(String value) {
        this.outUsedInputCharSuppliedChar37 = value;
    }

}
