
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DepositFirstDemandWithdrawExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositFirstDemandWithdrawExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCurrTimePrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCurrTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustomerServAccLnsSuppliedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServAccCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServAccCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServAccDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutServAccDepositAccountAccountType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccDepositAccountAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountBlockedBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountBookBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutServAccDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccDepositAccountForecastBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccDepositAccountUnclearBalance" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutServAccProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutServAccProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutServAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuccessfulTransactionWorkAdviceCounter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutGrpW" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositFirstDemandWithdrawExport", propOrder = {
    "outCurrTimePrintLineDate",
    "outCurrTimePrintLineTime",
    "outCustomerServAccLnsSuppliedName",
    "outGrpLength",
    "outIefSuppliedActionEntryDesc",
    "outIefSuppliedActionEntryMsg",
    "outIefSuppliedSrvStatus",
    "outPrftTransactionDescription",
    "outServAccCurrencyIdCurrency",
    "outServAccCurrencyShortDescr",
    "outServAccCustomerCDigit",
    "outServAccCustomerCustId",
    "outServAccDepositAccountAccountNumber",
    "outServAccDepositAccountAccountType",
    "outServAccDepositAccountAvailableBalance",
    "outServAccDepositAccountBlockedBalance",
    "outServAccDepositAccountBookBalance",
    "outServAccDepositAccountCDigit",
    "outServAccDepositAccountDesignation",
    "outServAccDepositAccountEntryStatus",
    "outServAccDepositAccountForecastBalance",
    "outServAccDepositAccountSecretAccFlag",
    "outServAccDepositAccountUnclearBalance",
    "outServAccProductDescription",
    "outServAccProductIdProduct",
    "outServAccUnitCode",
    "outSuccessfulTransactionWorkAdviceCounter",
    "outGrp"
})
public class DepositFirstDemandWithdrawExport
    extends BaseExport
{

    @XmlElement(name = "OutCurrTimePrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineDate;
    @XmlElement(name = "OutCurrTimePrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineTime;
    @XmlElement(name = "OutCustomerServAccLnsSuppliedName")
    protected String outCustomerServAccLnsSuppliedName;
    @XmlElement(name = "OutGrpLength")
    protected int outGrpLength;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutIefSuppliedActionEntryMsg")
    protected String outIefSuppliedActionEntryMsg;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutServAccCurrencyIdCurrency")
    protected int outServAccCurrencyIdCurrency;
    @XmlElement(name = "OutServAccCurrencyShortDescr")
    protected String outServAccCurrencyShortDescr;
    @XmlElement(name = "OutServAccCustomerCDigit")
    protected short outServAccCustomerCDigit;
    @XmlElement(name = "OutServAccCustomerCustId")
    protected int outServAccCustomerCustId;
    @XmlElement(name = "OutServAccDepositAccountAccountNumber")
    protected double outServAccDepositAccountAccountNumber;
    @XmlElement(name = "OutServAccDepositAccountAccountType")
    protected String outServAccDepositAccountAccountType;
    @XmlElement(name = "OutServAccDepositAccountAvailableBalance", required = true)
    protected BigDecimal outServAccDepositAccountAvailableBalance;
    @XmlElement(name = "OutServAccDepositAccountBlockedBalance", required = true)
    protected BigDecimal outServAccDepositAccountBlockedBalance;
    @XmlElement(name = "OutServAccDepositAccountBookBalance", required = true)
    protected BigDecimal outServAccDepositAccountBookBalance;
    @XmlElement(name = "OutServAccDepositAccountCDigit")
    protected short outServAccDepositAccountCDigit;
    @XmlElement(name = "OutServAccDepositAccountDesignation")
    protected String outServAccDepositAccountDesignation;
    @XmlElement(name = "OutServAccDepositAccountEntryStatus")
    protected String outServAccDepositAccountEntryStatus;
    @XmlElement(name = "OutServAccDepositAccountForecastBalance", required = true)
    protected BigDecimal outServAccDepositAccountForecastBalance;
    @XmlElement(name = "OutServAccDepositAccountSecretAccFlag")
    protected String outServAccDepositAccountSecretAccFlag;
    @XmlElement(name = "OutServAccDepositAccountUnclearBalance", required = true)
    protected BigDecimal outServAccDepositAccountUnclearBalance;
    @XmlElement(name = "OutServAccProductDescription")
    protected String outServAccProductDescription;
    @XmlElement(name = "OutServAccProductIdProduct")
    protected int outServAccProductIdProduct;
    @XmlElement(name = "OutServAccUnitCode")
    protected int outServAccUnitCode;
    @XmlElement(name = "OutSuccessfulTransactionWorkAdviceCounter")
    protected int outSuccessfulTransactionWorkAdviceCounter;
    @XmlElement(name = "OutGrp")
    protected ArrayOfOutGrpW outGrp;

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
     * Gets the value of the outCustomerServAccLnsSuppliedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerServAccLnsSuppliedName() {
        return outCustomerServAccLnsSuppliedName;
    }

    /**
     * Sets the value of the outCustomerServAccLnsSuppliedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerServAccLnsSuppliedName(String value) {
        this.outCustomerServAccLnsSuppliedName = value;
    }

    /**
     * Gets the value of the outGrpLength property.
     * 
     */
    public int getOutGrpLength() {
        return outGrpLength;
    }

    /**
     * Sets the value of the outGrpLength property.
     * 
     */
    public void setOutGrpLength(int value) {
        this.outGrpLength = value;
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
     * Gets the value of the outIefSuppliedActionEntryMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedActionEntryMsg() {
        return outIefSuppliedActionEntryMsg;
    }

    /**
     * Sets the value of the outIefSuppliedActionEntryMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedActionEntryMsg(String value) {
        this.outIefSuppliedActionEntryMsg = value;
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
     * Gets the value of the outServAccDepositAccountSecretAccFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutServAccDepositAccountSecretAccFlag() {
        return outServAccDepositAccountSecretAccFlag;
    }

    /**
     * Sets the value of the outServAccDepositAccountSecretAccFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutServAccDepositAccountSecretAccFlag(String value) {
        this.outServAccDepositAccountSecretAccFlag = value;
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
     * Gets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public int getOutSuccessfulTransactionWorkAdviceCounter() {
        return outSuccessfulTransactionWorkAdviceCounter;
    }

    /**
     * Sets the value of the outSuccessfulTransactionWorkAdviceCounter property.
     * 
     */
    public void setOutSuccessfulTransactionWorkAdviceCounter(int value) {
        this.outSuccessfulTransactionWorkAdviceCounter = value;
    }

    /**
     * Gets the value of the outGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutGrpW }
     *     
     */
    public ArrayOfOutGrpW getOutGrp() {
        return outGrp;
    }

    /**
     * Sets the value of the outGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutGrpW }
     *     
     */
    public void setOutGrp(ArrayOfOutGrpW value) {
        this.outGrp = value;
    }

}
