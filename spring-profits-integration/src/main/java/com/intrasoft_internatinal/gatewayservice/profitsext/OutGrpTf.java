
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpTf complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpTf">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmClearingSystemSystemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmIssuerCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmIssuerCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmIssuerListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmTrbondBondCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTrbondBondDenomination" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmTrbondBondDescGr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTrbondBondDurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTrbondBondDurationVal" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmTrbondBondFmtEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmTrbondBondFmtStart" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmTrbondBondIsin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTrbondDisposalAdminFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTrbondDistrEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmTrbondDistrStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmTrbondEndOfOrdersTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmTrbondEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTrbondInitDistrValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmTrbondMinTradingQty" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmTrbondRegisterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmTrbondTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpTf", propOrder = {
    "outGrpOutGrmClearingSystemSystemCode",
    "outGrpOutGrmCurrencyIdCurrency",
    "outGrpOutGrmCurrencyShortDescr",
    "outGrpOutGrmIefSuppliedSelectChar",
    "outGrpOutGrmIssuerCustomerCDigit",
    "outGrpOutGrmIssuerCustomerCustId",
    "outGrpOutGrmIssuerListSetDescription",
    "outGrpOutGrmProductDescription",
    "outGrpOutGrmProductIdProduct",
    "outGrpOutGrmTrbondBondCode",
    "outGrpOutGrmTrbondBondDenomination",
    "outGrpOutGrmTrbondBondDescGr",
    "outGrpOutGrmTrbondBondDurationUnit",
    "outGrpOutGrmTrbondBondDurationVal",
    "outGrpOutGrmTrbondBondFmtEnd",
    "outGrpOutGrmTrbondBondFmtStart",
    "outGrpOutGrmTrbondBondIsin",
    "outGrpOutGrmTrbondDisposalAdminFlg",
    "outGrpOutGrmTrbondDistrEndDate",
    "outGrpOutGrmTrbondDistrStartDate",
    "outGrpOutGrmTrbondEndOfOrdersTime",
    "outGrpOutGrmTrbondEntryStatus",
    "outGrpOutGrmTrbondInitDistrValue",
    "outGrpOutGrmTrbondMinTradingQty",
    "outGrpOutGrmTrbondRegisterFlag",
    "outGrpOutGrmTrbondTmstamp"
})
public class OutGrpTf {

    @XmlElement(name = "OutGrpOutGrmClearingSystemSystemCode")
    protected String outGrpOutGrmClearingSystemSystemCode;
    @XmlElement(name = "OutGrpOutGrmCurrencyIdCurrency")
    protected int outGrpOutGrmCurrencyIdCurrency;
    @XmlElement(name = "OutGrpOutGrmCurrencyShortDescr")
    protected String outGrpOutGrmCurrencyShortDescr;
    @XmlElement(name = "OutGrpOutGrmIefSuppliedSelectChar")
    protected String outGrpOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpOutGrmIssuerCustomerCDigit")
    protected short outGrpOutGrmIssuerCustomerCDigit;
    @XmlElement(name = "OutGrpOutGrmIssuerCustomerCustId")
    protected int outGrpOutGrmIssuerCustomerCustId;
    @XmlElement(name = "OutGrpOutGrmIssuerListSetDescription")
    protected String outGrpOutGrmIssuerListSetDescription;
    @XmlElement(name = "OutGrpOutGrmProductDescription")
    protected String outGrpOutGrmProductDescription;
    @XmlElement(name = "OutGrpOutGrmProductIdProduct")
    protected int outGrpOutGrmProductIdProduct;
    @XmlElement(name = "OutGrpOutGrmTrbondBondCode")
    protected String outGrpOutGrmTrbondBondCode;
    @XmlElement(name = "OutGrpOutGrmTrbondBondDenomination", required = true)
    protected BigDecimal outGrpOutGrmTrbondBondDenomination;
    @XmlElement(name = "OutGrpOutGrmTrbondBondDescGr")
    protected String outGrpOutGrmTrbondBondDescGr;
    @XmlElement(name = "OutGrpOutGrmTrbondBondDurationUnit")
    protected String outGrpOutGrmTrbondBondDurationUnit;
    @XmlElement(name = "OutGrpOutGrmTrbondBondDurationVal")
    protected short outGrpOutGrmTrbondBondDurationVal;
    @XmlElement(name = "OutGrpOutGrmTrbondBondFmtEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmTrbondBondFmtEnd;
    @XmlElement(name = "OutGrpOutGrmTrbondBondFmtStart", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmTrbondBondFmtStart;
    @XmlElement(name = "OutGrpOutGrmTrbondBondIsin")
    protected String outGrpOutGrmTrbondBondIsin;
    @XmlElement(name = "OutGrpOutGrmTrbondDisposalAdminFlg")
    protected String outGrpOutGrmTrbondDisposalAdminFlg;
    @XmlElement(name = "OutGrpOutGrmTrbondDistrEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmTrbondDistrEndDate;
    @XmlElement(name = "OutGrpOutGrmTrbondDistrStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmTrbondDistrStartDate;
    @XmlElement(name = "OutGrpOutGrmTrbondEndOfOrdersTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmTrbondEndOfOrdersTime;
    @XmlElement(name = "OutGrpOutGrmTrbondEntryStatus")
    protected String outGrpOutGrmTrbondEntryStatus;
    @XmlElement(name = "OutGrpOutGrmTrbondInitDistrValue", required = true)
    protected BigDecimal outGrpOutGrmTrbondInitDistrValue;
    @XmlElement(name = "OutGrpOutGrmTrbondMinTradingQty", required = true)
    protected BigDecimal outGrpOutGrmTrbondMinTradingQty;
    @XmlElement(name = "OutGrpOutGrmTrbondRegisterFlag")
    protected String outGrpOutGrmTrbondRegisterFlag;
    @XmlElement(name = "OutGrpOutGrmTrbondTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmTrbondTmstamp;

    /**
     * Gets the value of the outGrpOutGrmClearingSystemSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmClearingSystemSystemCode() {
        return outGrpOutGrmClearingSystemSystemCode;
    }

    /**
     * Sets the value of the outGrpOutGrmClearingSystemSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmClearingSystemSystemCode(String value) {
        this.outGrpOutGrmClearingSystemSystemCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpOutGrmCurrencyIdCurrency() {
        return outGrpOutGrmCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpOutGrmCurrencyIdCurrency(int value) {
        this.outGrpOutGrmCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCurrencyShortDescr() {
        return outGrpOutGrmCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutGrmCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCurrencyShortDescr(String value) {
        this.outGrpOutGrmCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmIefSuppliedSelectChar() {
        return outGrpOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssuerCustomerCDigit property.
     * 
     */
    public short getOutGrpOutGrmIssuerCustomerCDigit() {
        return outGrpOutGrmIssuerCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpOutGrmIssuerCustomerCDigit property.
     * 
     */
    public void setOutGrpOutGrmIssuerCustomerCDigit(short value) {
        this.outGrpOutGrmIssuerCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssuerCustomerCustId property.
     * 
     */
    public int getOutGrpOutGrmIssuerCustomerCustId() {
        return outGrpOutGrmIssuerCustomerCustId;
    }

    /**
     * Sets the value of the outGrpOutGrmIssuerCustomerCustId property.
     * 
     */
    public void setOutGrpOutGrmIssuerCustomerCustId(int value) {
        this.outGrpOutGrmIssuerCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIssuerListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmIssuerListSetDescription() {
        return outGrpOutGrmIssuerListSetDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmIssuerListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmIssuerListSetDescription(String value) {
        this.outGrpOutGrmIssuerListSetDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProductDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmProductDescription() {
        return outGrpOutGrmProductDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmProductDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmProductDescription(String value) {
        this.outGrpOutGrmProductDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmProductIdProduct property.
     * 
     */
    public int getOutGrpOutGrmProductIdProduct() {
        return outGrpOutGrmProductIdProduct;
    }

    /**
     * Sets the value of the outGrpOutGrmProductIdProduct property.
     * 
     */
    public void setOutGrpOutGrmProductIdProduct(int value) {
        this.outGrpOutGrmProductIdProduct = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondBondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTrbondBondCode() {
        return outGrpOutGrmTrbondBondCode;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondBondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTrbondBondCode(String value) {
        this.outGrpOutGrmTrbondBondCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondBondDenomination property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmTrbondBondDenomination() {
        return outGrpOutGrmTrbondBondDenomination;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondBondDenomination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmTrbondBondDenomination(BigDecimal value) {
        this.outGrpOutGrmTrbondBondDenomination = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondBondDescGr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTrbondBondDescGr() {
        return outGrpOutGrmTrbondBondDescGr;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondBondDescGr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTrbondBondDescGr(String value) {
        this.outGrpOutGrmTrbondBondDescGr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondBondDurationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTrbondBondDurationUnit() {
        return outGrpOutGrmTrbondBondDurationUnit;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondBondDurationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTrbondBondDurationUnit(String value) {
        this.outGrpOutGrmTrbondBondDurationUnit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondBondDurationVal property.
     * 
     */
    public short getOutGrpOutGrmTrbondBondDurationVal() {
        return outGrpOutGrmTrbondBondDurationVal;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondBondDurationVal property.
     * 
     */
    public void setOutGrpOutGrmTrbondBondDurationVal(short value) {
        this.outGrpOutGrmTrbondBondDurationVal = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondBondFmtEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmTrbondBondFmtEnd() {
        return outGrpOutGrmTrbondBondFmtEnd;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondBondFmtEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmTrbondBondFmtEnd(XMLGregorianCalendar value) {
        this.outGrpOutGrmTrbondBondFmtEnd = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondBondFmtStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmTrbondBondFmtStart() {
        return outGrpOutGrmTrbondBondFmtStart;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondBondFmtStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmTrbondBondFmtStart(XMLGregorianCalendar value) {
        this.outGrpOutGrmTrbondBondFmtStart = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondBondIsin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTrbondBondIsin() {
        return outGrpOutGrmTrbondBondIsin;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondBondIsin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTrbondBondIsin(String value) {
        this.outGrpOutGrmTrbondBondIsin = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondDisposalAdminFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTrbondDisposalAdminFlg() {
        return outGrpOutGrmTrbondDisposalAdminFlg;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondDisposalAdminFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTrbondDisposalAdminFlg(String value) {
        this.outGrpOutGrmTrbondDisposalAdminFlg = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondDistrEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmTrbondDistrEndDate() {
        return outGrpOutGrmTrbondDistrEndDate;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondDistrEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmTrbondDistrEndDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmTrbondDistrEndDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondDistrStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmTrbondDistrStartDate() {
        return outGrpOutGrmTrbondDistrStartDate;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondDistrStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmTrbondDistrStartDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmTrbondDistrStartDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondEndOfOrdersTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmTrbondEndOfOrdersTime() {
        return outGrpOutGrmTrbondEndOfOrdersTime;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondEndOfOrdersTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmTrbondEndOfOrdersTime(XMLGregorianCalendar value) {
        this.outGrpOutGrmTrbondEndOfOrdersTime = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTrbondEntryStatus() {
        return outGrpOutGrmTrbondEntryStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTrbondEntryStatus(String value) {
        this.outGrpOutGrmTrbondEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondInitDistrValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmTrbondInitDistrValue() {
        return outGrpOutGrmTrbondInitDistrValue;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondInitDistrValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmTrbondInitDistrValue(BigDecimal value) {
        this.outGrpOutGrmTrbondInitDistrValue = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondMinTradingQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmTrbondMinTradingQty() {
        return outGrpOutGrmTrbondMinTradingQty;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondMinTradingQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmTrbondMinTradingQty(BigDecimal value) {
        this.outGrpOutGrmTrbondMinTradingQty = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondRegisterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmTrbondRegisterFlag() {
        return outGrpOutGrmTrbondRegisterFlag;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondRegisterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmTrbondRegisterFlag(String value) {
        this.outGrpOutGrmTrbondRegisterFlag = value;
    }

    /**
     * Gets the value of the outGrpOutGrmTrbondTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmTrbondTmstamp() {
        return outGrpOutGrmTrbondTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmTrbondTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmTrbondTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmTrbondTmstamp = value;
    }

}
