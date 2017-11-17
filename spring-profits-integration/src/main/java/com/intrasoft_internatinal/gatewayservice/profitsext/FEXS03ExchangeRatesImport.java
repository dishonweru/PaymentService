
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FEXS03_ExchangeRatesImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS03_ExchangeRatesImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImKeyRateTableRateTableNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ImUpdateRateTableActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ImUpdateRateTableActivationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ImUpdateRateTableRateTableNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InAuthorGrantedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCommIefSuppliedChar6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCurrencyIefSuppliedCharCode5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomer0FlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InDefaultRateTableExchNotesFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDefaultRateTableScaleMaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InParametersInTerminalTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InRateGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRateTableActivationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRateTableActivationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InRateTableBuyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRateTableBuyRateMt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRateTableExchNotesFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InRateTableRateTableNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InRateTableScaleMaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRateTableSellRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InRateTableTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGroup" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfFEXS03InGroupItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS03_ExchangeRatesImport", propOrder = {
    "command",
    "imKeyRateTableRateTableNumber",
    "imUpdateRateTableActivationDate",
    "imUpdateRateTableActivationTime",
    "imUpdateRateTableRateTableNumber",
    "inAuthorGrantedIefSuppliedFlag",
    "inCommIefSuppliedChar6",
    "inCurrencyIdCurrency",
    "inCurrencyShortDescr",
    "inCurrencyIefSuppliedCharCode5",
    "inCustomerCustId",
    "inCustomer0FlagIefSuppliedFlag",
    "inDefaultCurrencyIdCurrency",
    "inDefaultCustomerCustId",
    "inDefaultGenericDetailSerialNum",
    "inDefaultRateTableExchNotesFlag",
    "inDefaultRateTableScaleMaxAmount",
    "inGenericDetailSerialNum",
    "inJustificIdJustific",
    "inParametersInTerminalTerminalNumber",
    "inPrftTransactionIdTransact",
    "inProductIdProduct",
    "inRateGenericDetailDescription",
    "inRateTableActivationDate",
    "inRateTableActivationTime",
    "inRateTableBuyRate",
    "inRateTableBuyRateMt",
    "inRateTableExchNotesFlag",
    "inRateTableRateTableNumber",
    "inRateTableScaleMaxAmount",
    "inRateTableSellRate",
    "inRateTableTmstamp",
    "inGroup"
})
public class FEXS03ExchangeRatesImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "ImKeyRateTableRateTableNumber")
    protected double imKeyRateTableRateTableNumber;
    @XmlElement(name = "ImUpdateRateTableActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar imUpdateRateTableActivationDate;
    @XmlElement(name = "ImUpdateRateTableActivationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar imUpdateRateTableActivationTime;
    @XmlElement(name = "ImUpdateRateTableRateTableNumber")
    protected double imUpdateRateTableRateTableNumber;
    @XmlElement(name = "InAuthorGrantedIefSuppliedFlag")
    protected String inAuthorGrantedIefSuppliedFlag;
    @XmlElement(name = "InCommIefSuppliedChar6")
    protected String inCommIefSuppliedChar6;
    @XmlElement(name = "InCurrencyIdCurrency")
    protected int inCurrencyIdCurrency;
    @XmlElement(name = "InCurrencyShortDescr")
    protected String inCurrencyShortDescr;
    @XmlElement(name = "InCurrencyIefSuppliedCharCode5")
    protected String inCurrencyIefSuppliedCharCode5;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomer0FlagIefSuppliedFlag")
    protected String inCustomer0FlagIefSuppliedFlag;
    @XmlElement(name = "InDefaultCurrencyIdCurrency")
    protected int inDefaultCurrencyIdCurrency;
    @XmlElement(name = "InDefaultCustomerCustId")
    protected int inDefaultCustomerCustId;
    @XmlElement(name = "InDefaultGenericDetailSerialNum")
    protected int inDefaultGenericDetailSerialNum;
    @XmlElement(name = "InDefaultRateTableExchNotesFlag")
    protected String inDefaultRateTableExchNotesFlag;
    @XmlElement(name = "InDefaultRateTableScaleMaxAmount", required = true)
    protected BigDecimal inDefaultRateTableScaleMaxAmount;
    @XmlElement(name = "InGenericDetailSerialNum")
    protected int inGenericDetailSerialNum;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InParametersInTerminalTerminalNumber")
    protected String inParametersInTerminalTerminalNumber;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InRateGenericDetailDescription")
    protected String inRateGenericDetailDescription;
    @XmlElement(name = "InRateTableActivationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRateTableActivationDate;
    @XmlElement(name = "InRateTableActivationTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRateTableActivationTime;
    @XmlElement(name = "InRateTableBuyRate", required = true)
    protected BigDecimal inRateTableBuyRate;
    @XmlElement(name = "InRateTableBuyRateMt", required = true)
    protected BigDecimal inRateTableBuyRateMt;
    @XmlElement(name = "InRateTableExchNotesFlag")
    protected String inRateTableExchNotesFlag;
    @XmlElement(name = "InRateTableRateTableNumber")
    protected double inRateTableRateTableNumber;
    @XmlElement(name = "InRateTableScaleMaxAmount", required = true)
    protected BigDecimal inRateTableScaleMaxAmount;
    @XmlElement(name = "InRateTableSellRate", required = true)
    protected BigDecimal inRateTableSellRate;
    @XmlElement(name = "InRateTableTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inRateTableTmstamp;
    @XmlElement(name = "InGroup")
    protected ArrayOfFEXS03InGroupItem inGroup;

    /**
     * Gets the value of the command property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommand() {
        return command;
    }

    /**
     * Sets the value of the command property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommand(String value) {
        this.command = value;
    }

    /**
     * Gets the value of the imKeyRateTableRateTableNumber property.
     * 
     */
    public double getImKeyRateTableRateTableNumber() {
        return imKeyRateTableRateTableNumber;
    }

    /**
     * Sets the value of the imKeyRateTableRateTableNumber property.
     * 
     */
    public void setImKeyRateTableRateTableNumber(double value) {
        this.imKeyRateTableRateTableNumber = value;
    }

    /**
     * Gets the value of the imUpdateRateTableActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImUpdateRateTableActivationDate() {
        return imUpdateRateTableActivationDate;
    }

    /**
     * Sets the value of the imUpdateRateTableActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImUpdateRateTableActivationDate(XMLGregorianCalendar value) {
        this.imUpdateRateTableActivationDate = value;
    }

    /**
     * Gets the value of the imUpdateRateTableActivationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImUpdateRateTableActivationTime() {
        return imUpdateRateTableActivationTime;
    }

    /**
     * Sets the value of the imUpdateRateTableActivationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImUpdateRateTableActivationTime(XMLGregorianCalendar value) {
        this.imUpdateRateTableActivationTime = value;
    }

    /**
     * Gets the value of the imUpdateRateTableRateTableNumber property.
     * 
     */
    public double getImUpdateRateTableRateTableNumber() {
        return imUpdateRateTableRateTableNumber;
    }

    /**
     * Sets the value of the imUpdateRateTableRateTableNumber property.
     * 
     */
    public void setImUpdateRateTableRateTableNumber(double value) {
        this.imUpdateRateTableRateTableNumber = value;
    }

    /**
     * Gets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAuthorGrantedIefSuppliedFlag() {
        return inAuthorGrantedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inAuthorGrantedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAuthorGrantedIefSuppliedFlag(String value) {
        this.inAuthorGrantedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inCommIefSuppliedChar6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCommIefSuppliedChar6() {
        return inCommIefSuppliedChar6;
    }

    /**
     * Sets the value of the inCommIefSuppliedChar6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCommIefSuppliedChar6(String value) {
        this.inCommIefSuppliedChar6 = value;
    }

    /**
     * Gets the value of the inCurrencyIdCurrency property.
     * 
     */
    public int getInCurrencyIdCurrency() {
        return inCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inCurrencyIdCurrency property.
     * 
     */
    public void setInCurrencyIdCurrency(int value) {
        this.inCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrencyShortDescr() {
        return inCurrencyShortDescr;
    }

    /**
     * Sets the value of the inCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrencyShortDescr(String value) {
        this.inCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inCurrencyIefSuppliedCharCode5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCurrencyIefSuppliedCharCode5() {
        return inCurrencyIefSuppliedCharCode5;
    }

    /**
     * Sets the value of the inCurrencyIefSuppliedCharCode5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCurrencyIefSuppliedCharCode5(String value) {
        this.inCurrencyIefSuppliedCharCode5 = value;
    }

    /**
     * Gets the value of the inCustomerCustId property.
     * 
     */
    public int getInCustomerCustId() {
        return inCustomerCustId;
    }

    /**
     * Sets the value of the inCustomerCustId property.
     * 
     */
    public void setInCustomerCustId(int value) {
        this.inCustomerCustId = value;
    }

    /**
     * Gets the value of the inCustomer0FlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomer0FlagIefSuppliedFlag() {
        return inCustomer0FlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the inCustomer0FlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomer0FlagIefSuppliedFlag(String value) {
        this.inCustomer0FlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inDefaultCurrencyIdCurrency property.
     * 
     */
    public int getInDefaultCurrencyIdCurrency() {
        return inDefaultCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inDefaultCurrencyIdCurrency property.
     * 
     */
    public void setInDefaultCurrencyIdCurrency(int value) {
        this.inDefaultCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inDefaultCustomerCustId property.
     * 
     */
    public int getInDefaultCustomerCustId() {
        return inDefaultCustomerCustId;
    }

    /**
     * Sets the value of the inDefaultCustomerCustId property.
     * 
     */
    public void setInDefaultCustomerCustId(int value) {
        this.inDefaultCustomerCustId = value;
    }

    /**
     * Gets the value of the inDefaultGenericDetailSerialNum property.
     * 
     */
    public int getInDefaultGenericDetailSerialNum() {
        return inDefaultGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inDefaultGenericDetailSerialNum property.
     * 
     */
    public void setInDefaultGenericDetailSerialNum(int value) {
        this.inDefaultGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inDefaultRateTableExchNotesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDefaultRateTableExchNotesFlag() {
        return inDefaultRateTableExchNotesFlag;
    }

    /**
     * Sets the value of the inDefaultRateTableExchNotesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDefaultRateTableExchNotesFlag(String value) {
        this.inDefaultRateTableExchNotesFlag = value;
    }

    /**
     * Gets the value of the inDefaultRateTableScaleMaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInDefaultRateTableScaleMaxAmount() {
        return inDefaultRateTableScaleMaxAmount;
    }

    /**
     * Sets the value of the inDefaultRateTableScaleMaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInDefaultRateTableScaleMaxAmount(BigDecimal value) {
        this.inDefaultRateTableScaleMaxAmount = value;
    }

    /**
     * Gets the value of the inGenericDetailSerialNum property.
     * 
     */
    public int getInGenericDetailSerialNum() {
        return inGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGenericDetailSerialNum property.
     * 
     */
    public void setInGenericDetailSerialNum(int value) {
        this.inGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInParametersInTerminalTerminalNumber() {
        return inParametersInTerminalTerminalNumber;
    }

    /**
     * Sets the value of the inParametersInTerminalTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInParametersInTerminalTerminalNumber(String value) {
        this.inParametersInTerminalTerminalNumber = value;
    }

    /**
     * Gets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public int getInPrftTransactionIdTransact() {
        return inPrftTransactionIdTransact;
    }

    /**
     * Sets the value of the inPrftTransactionIdTransact property.
     * 
     */
    public void setInPrftTransactionIdTransact(int value) {
        this.inPrftTransactionIdTransact = value;
    }

    /**
     * Gets the value of the inProductIdProduct property.
     * 
     */
    public int getInProductIdProduct() {
        return inProductIdProduct;
    }

    /**
     * Sets the value of the inProductIdProduct property.
     * 
     */
    public void setInProductIdProduct(int value) {
        this.inProductIdProduct = value;
    }

    /**
     * Gets the value of the inRateGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRateGenericDetailDescription() {
        return inRateGenericDetailDescription;
    }

    /**
     * Sets the value of the inRateGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRateGenericDetailDescription(String value) {
        this.inRateGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inRateTableActivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRateTableActivationDate() {
        return inRateTableActivationDate;
    }

    /**
     * Sets the value of the inRateTableActivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRateTableActivationDate(XMLGregorianCalendar value) {
        this.inRateTableActivationDate = value;
    }

    /**
     * Gets the value of the inRateTableActivationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRateTableActivationTime() {
        return inRateTableActivationTime;
    }

    /**
     * Sets the value of the inRateTableActivationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRateTableActivationTime(XMLGregorianCalendar value) {
        this.inRateTableActivationTime = value;
    }

    /**
     * Gets the value of the inRateTableBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRateTableBuyRate() {
        return inRateTableBuyRate;
    }

    /**
     * Sets the value of the inRateTableBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRateTableBuyRate(BigDecimal value) {
        this.inRateTableBuyRate = value;
    }

    /**
     * Gets the value of the inRateTableBuyRateMt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRateTableBuyRateMt() {
        return inRateTableBuyRateMt;
    }

    /**
     * Sets the value of the inRateTableBuyRateMt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRateTableBuyRateMt(BigDecimal value) {
        this.inRateTableBuyRateMt = value;
    }

    /**
     * Gets the value of the inRateTableExchNotesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRateTableExchNotesFlag() {
        return inRateTableExchNotesFlag;
    }

    /**
     * Sets the value of the inRateTableExchNotesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRateTableExchNotesFlag(String value) {
        this.inRateTableExchNotesFlag = value;
    }

    /**
     * Gets the value of the inRateTableRateTableNumber property.
     * 
     */
    public double getInRateTableRateTableNumber() {
        return inRateTableRateTableNumber;
    }

    /**
     * Sets the value of the inRateTableRateTableNumber property.
     * 
     */
    public void setInRateTableRateTableNumber(double value) {
        this.inRateTableRateTableNumber = value;
    }

    /**
     * Gets the value of the inRateTableScaleMaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRateTableScaleMaxAmount() {
        return inRateTableScaleMaxAmount;
    }

    /**
     * Sets the value of the inRateTableScaleMaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRateTableScaleMaxAmount(BigDecimal value) {
        this.inRateTableScaleMaxAmount = value;
    }

    /**
     * Gets the value of the inRateTableSellRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInRateTableSellRate() {
        return inRateTableSellRate;
    }

    /**
     * Sets the value of the inRateTableSellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInRateTableSellRate(BigDecimal value) {
        this.inRateTableSellRate = value;
    }

    /**
     * Gets the value of the inRateTableTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInRateTableTmstamp() {
        return inRateTableTmstamp;
    }

    /**
     * Sets the value of the inRateTableTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInRateTableTmstamp(XMLGregorianCalendar value) {
        this.inRateTableTmstamp = value;
    }

    /**
     * Gets the value of the inGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfFEXS03InGroupItem }
     *     
     */
    public ArrayOfFEXS03InGroupItem getInGroup() {
        return inGroup;
    }

    /**
     * Sets the value of the inGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfFEXS03InGroupItem }
     *     
     */
    public void setInGroup(ArrayOfFEXS03InGroupItem value) {
        this.inGroup = value;
    }

}
