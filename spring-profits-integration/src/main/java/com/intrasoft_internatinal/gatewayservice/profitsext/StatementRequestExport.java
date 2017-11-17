
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StatementRequestExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatementRequestExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCurrTimePrintLineTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutIefSuppliedEnableControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedDescStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedSrvStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepMntRecordingTrxUsrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutAccUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutDepositAccountDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutDepositAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutDepositAccountSecretAccFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDepositAccountEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutPrftTransactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCurrTimePrintLineDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatementRequestExport", propOrder = {
    "outCurrTimePrintLineTime",
    "outIefSuppliedCount",
    "outIefSuppliedEnableControl",
    "outIefSuppliedDescStatus",
    "outIefSuppliedSrvStatus",
    "outIefSuppliedActionEntryDesc",
    "outDepMntRecordingTrxUsrSn",
    "outProductDescription",
    "outProductIdProduct",
    "outCurrencyShortDescr",
    "outCurrencyIdCurrency",
    "outAccUnitCode",
    "outCustomerFatherName",
    "outCustomerMiddleName",
    "outCustomerSurname",
    "outCustomerFirstName",
    "outCustomerCDigit",
    "outCustomerCustId",
    "outDepositAccountDesignation",
    "outDepositAccountCDigit",
    "outDepositAccountAccountNumber",
    "outDepositAccountSecretAccFlag",
    "outDepositAccountEntryStatus",
    "outJustificIdJustific",
    "outPrftTransactionDescription",
    "outPrftTransactionIdTransact",
    "outCurrTimePrintLineDate"
})
public class StatementRequestExport
    extends BaseExport
{

    @XmlElement(name = "OutCurrTimePrintLineTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineTime;
    @XmlElement(name = "OutIefSuppliedCount")
    protected int outIefSuppliedCount;
    @XmlElement(name = "OutIefSuppliedEnableControl")
    protected String outIefSuppliedEnableControl;
    @XmlElement(name = "OutIefSuppliedDescStatus")
    protected String outIefSuppliedDescStatus;
    @XmlElement(name = "OutIefSuppliedSrvStatus")
    protected String outIefSuppliedSrvStatus;
    @XmlElement(name = "OutIefSuppliedActionEntryDesc")
    protected String outIefSuppliedActionEntryDesc;
    @XmlElement(name = "OutDepMntRecordingTrxUsrSn")
    protected int outDepMntRecordingTrxUsrSn;
    @XmlElement(name = "OutProductDescription")
    protected String outProductDescription;
    @XmlElement(name = "OutProductIdProduct")
    protected int outProductIdProduct;
    @XmlElement(name = "OutCurrencyShortDescr")
    protected String outCurrencyShortDescr;
    @XmlElement(name = "OutCurrencyIdCurrency")
    protected int outCurrencyIdCurrency;
    @XmlElement(name = "OutAccUnitCode")
    protected int outAccUnitCode;
    @XmlElement(name = "OutCustomerFatherName")
    protected String outCustomerFatherName;
    @XmlElement(name = "OutCustomerMiddleName")
    protected String outCustomerMiddleName;
    @XmlElement(name = "OutCustomerSurname")
    protected String outCustomerSurname;
    @XmlElement(name = "OutCustomerFirstName")
    protected String outCustomerFirstName;
    @XmlElement(name = "OutCustomerCDigit")
    protected short outCustomerCDigit;
    @XmlElement(name = "OutCustomerCustId")
    protected int outCustomerCustId;
    @XmlElement(name = "OutDepositAccountDesignation")
    protected String outDepositAccountDesignation;
    @XmlElement(name = "OutDepositAccountCDigit")
    protected short outDepositAccountCDigit;
    @XmlElement(name = "OutDepositAccountAccountNumber")
    protected double outDepositAccountAccountNumber;
    @XmlElement(name = "OutDepositAccountSecretAccFlag")
    protected String outDepositAccountSecretAccFlag;
    @XmlElement(name = "OutDepositAccountEntryStatus")
    protected String outDepositAccountEntryStatus;
    @XmlElement(name = "OutJustificIdJustific")
    protected int outJustificIdJustific;
    @XmlElement(name = "OutPrftTransactionDescription")
    protected String outPrftTransactionDescription;
    @XmlElement(name = "OutPrftTransactionIdTransact")
    protected int outPrftTransactionIdTransact;
    @XmlElement(name = "OutCurrTimePrintLineDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCurrTimePrintLineDate;

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
     * Gets the value of the outIefSuppliedCount property.
     * 
     */
    public int getOutIefSuppliedCount() {
        return outIefSuppliedCount;
    }

    /**
     * Sets the value of the outIefSuppliedCount property.
     * 
     */
    public void setOutIefSuppliedCount(int value) {
        this.outIefSuppliedCount = value;
    }

    /**
     * Gets the value of the outIefSuppliedEnableControl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedEnableControl() {
        return outIefSuppliedEnableControl;
    }

    /**
     * Sets the value of the outIefSuppliedEnableControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedEnableControl(String value) {
        this.outIefSuppliedEnableControl = value;
    }

    /**
     * Gets the value of the outIefSuppliedDescStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutIefSuppliedDescStatus() {
        return outIefSuppliedDescStatus;
    }

    /**
     * Sets the value of the outIefSuppliedDescStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutIefSuppliedDescStatus(String value) {
        this.outIefSuppliedDescStatus = value;
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
     * Gets the value of the outCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFatherName() {
        return outCustomerFatherName;
    }

    /**
     * Sets the value of the outCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFatherName(String value) {
        this.outCustomerFatherName = value;
    }

    /**
     * Gets the value of the outCustomerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerMiddleName() {
        return outCustomerMiddleName;
    }

    /**
     * Sets the value of the outCustomerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerMiddleName(String value) {
        this.outCustomerMiddleName = value;
    }

    /**
     * Gets the value of the outCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerSurname() {
        return outCustomerSurname;
    }

    /**
     * Sets the value of the outCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerSurname(String value) {
        this.outCustomerSurname = value;
    }

    /**
     * Gets the value of the outCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustomerFirstName() {
        return outCustomerFirstName;
    }

    /**
     * Sets the value of the outCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustomerFirstName(String value) {
        this.outCustomerFirstName = value;
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

}
