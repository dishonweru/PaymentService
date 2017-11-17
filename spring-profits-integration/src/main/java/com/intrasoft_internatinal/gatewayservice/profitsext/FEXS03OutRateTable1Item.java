
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FEXS03OutRateTable1Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS03OutRateTable1Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutRateTable1ExCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRateTable1ExCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRateTable1ExDescCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRateTable1ExDescCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRateTable1ExDescGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRateTable1ExDescGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRateTable1ExDetailsRateTableBuyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1ExDetailsRateTableBuyRateMt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1ExDetailsRateTableExchNotesFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRateTable1ExDetailsRateTableFixingRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1ExDetailsRateTableMinNegotUnit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutRateTable1ExDetailsRateTableMultiplier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutRateTable1ExDetailsRateTableScaleMaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1ExDetailsRateTableSellRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1ExDetailsRateTableTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutRateTable1ExNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRateTable1OutBuyBankNotesIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1OutBuyIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1OutBuyRateMtIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1OutFixingIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1OutSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutRateTable1OutSellBankNotesIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutRateTable1OutSellIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS03OutRateTable1Item", propOrder = {
    "outRateTable1ExCustomerCDigit",
    "outRateTable1ExCustomerCustId",
    "outRateTable1ExDescCurrencyIdCurrency",
    "outRateTable1ExDescCurrencyShortDescr",
    "outRateTable1ExDescGenericDetailDescription",
    "outRateTable1ExDescGenericDetailSerialNum",
    "outRateTable1ExDetailsRateTableBuyRate",
    "outRateTable1ExDetailsRateTableBuyRateMt",
    "outRateTable1ExDetailsRateTableExchNotesFlag",
    "outRateTable1ExDetailsRateTableFixingRate",
    "outRateTable1ExDetailsRateTableMinNegotUnit",
    "outRateTable1ExDetailsRateTableMultiplier",
    "outRateTable1ExDetailsRateTableScaleMaxAmount",
    "outRateTable1ExDetailsRateTableSellRate",
    "outRateTable1ExDetailsRateTableTmstamp",
    "outRateTable1ExNameListSetDescription",
    "outRateTable1OutBuyBankNotesIefSuppliedRate",
    "outRateTable1OutBuyIefSuppliedRate",
    "outRateTable1OutBuyRateMtIefSuppliedRate",
    "outRateTable1OutFixingIefSuppliedRate",
    "outRateTable1OutSelectIefSuppliedSelectChar",
    "outRateTable1OutSellBankNotesIefSuppliedRate",
    "outRateTable1OutSellIefSuppliedRate"
})
public class FEXS03OutRateTable1Item {

    @XmlElement(name = "OutRateTable1ExCustomerCDigit")
    protected short outRateTable1ExCustomerCDigit;
    @XmlElement(name = "OutRateTable1ExCustomerCustId")
    protected int outRateTable1ExCustomerCustId;
    @XmlElement(name = "OutRateTable1ExDescCurrencyIdCurrency")
    protected int outRateTable1ExDescCurrencyIdCurrency;
    @XmlElement(name = "OutRateTable1ExDescCurrencyShortDescr")
    protected String outRateTable1ExDescCurrencyShortDescr;
    @XmlElement(name = "OutRateTable1ExDescGenericDetailDescription")
    protected String outRateTable1ExDescGenericDetailDescription;
    @XmlElement(name = "OutRateTable1ExDescGenericDetailSerialNum")
    protected int outRateTable1ExDescGenericDetailSerialNum;
    @XmlElement(name = "OutRateTable1ExDetailsRateTableBuyRate", required = true)
    protected BigDecimal outRateTable1ExDetailsRateTableBuyRate;
    @XmlElement(name = "OutRateTable1ExDetailsRateTableBuyRateMt", required = true)
    protected BigDecimal outRateTable1ExDetailsRateTableBuyRateMt;
    @XmlElement(name = "OutRateTable1ExDetailsRateTableExchNotesFlag")
    protected String outRateTable1ExDetailsRateTableExchNotesFlag;
    @XmlElement(name = "OutRateTable1ExDetailsRateTableFixingRate", required = true)
    protected BigDecimal outRateTable1ExDetailsRateTableFixingRate;
    @XmlElement(name = "OutRateTable1ExDetailsRateTableMinNegotUnit")
    protected short outRateTable1ExDetailsRateTableMinNegotUnit;
    @XmlElement(name = "OutRateTable1ExDetailsRateTableMultiplier")
    protected int outRateTable1ExDetailsRateTableMultiplier;
    @XmlElement(name = "OutRateTable1ExDetailsRateTableScaleMaxAmount", required = true)
    protected BigDecimal outRateTable1ExDetailsRateTableScaleMaxAmount;
    @XmlElement(name = "OutRateTable1ExDetailsRateTableSellRate", required = true)
    protected BigDecimal outRateTable1ExDetailsRateTableSellRate;
    @XmlElement(name = "OutRateTable1ExDetailsRateTableTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outRateTable1ExDetailsRateTableTmstamp;
    @XmlElement(name = "OutRateTable1ExNameListSetDescription")
    protected String outRateTable1ExNameListSetDescription;
    @XmlElement(name = "OutRateTable1OutBuyBankNotesIefSuppliedRate", required = true)
    protected BigDecimal outRateTable1OutBuyBankNotesIefSuppliedRate;
    @XmlElement(name = "OutRateTable1OutBuyIefSuppliedRate", required = true)
    protected BigDecimal outRateTable1OutBuyIefSuppliedRate;
    @XmlElement(name = "OutRateTable1OutBuyRateMtIefSuppliedRate", required = true)
    protected BigDecimal outRateTable1OutBuyRateMtIefSuppliedRate;
    @XmlElement(name = "OutRateTable1OutFixingIefSuppliedRate", required = true)
    protected BigDecimal outRateTable1OutFixingIefSuppliedRate;
    @XmlElement(name = "OutRateTable1OutSelectIefSuppliedSelectChar")
    protected String outRateTable1OutSelectIefSuppliedSelectChar;
    @XmlElement(name = "OutRateTable1OutSellBankNotesIefSuppliedRate", required = true)
    protected BigDecimal outRateTable1OutSellBankNotesIefSuppliedRate;
    @XmlElement(name = "OutRateTable1OutSellIefSuppliedRate", required = true)
    protected BigDecimal outRateTable1OutSellIefSuppliedRate;

    /**
     * Gets the value of the outRateTable1ExCustomerCDigit property.
     * 
     */
    public short getOutRateTable1ExCustomerCDigit() {
        return outRateTable1ExCustomerCDigit;
    }

    /**
     * Sets the value of the outRateTable1ExCustomerCDigit property.
     * 
     */
    public void setOutRateTable1ExCustomerCDigit(short value) {
        this.outRateTable1ExCustomerCDigit = value;
    }

    /**
     * Gets the value of the outRateTable1ExCustomerCustId property.
     * 
     */
    public int getOutRateTable1ExCustomerCustId() {
        return outRateTable1ExCustomerCustId;
    }

    /**
     * Sets the value of the outRateTable1ExCustomerCustId property.
     * 
     */
    public void setOutRateTable1ExCustomerCustId(int value) {
        this.outRateTable1ExCustomerCustId = value;
    }

    /**
     * Gets the value of the outRateTable1ExDescCurrencyIdCurrency property.
     * 
     */
    public int getOutRateTable1ExDescCurrencyIdCurrency() {
        return outRateTable1ExDescCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outRateTable1ExDescCurrencyIdCurrency property.
     * 
     */
    public void setOutRateTable1ExDescCurrencyIdCurrency(int value) {
        this.outRateTable1ExDescCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outRateTable1ExDescCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRateTable1ExDescCurrencyShortDescr() {
        return outRateTable1ExDescCurrencyShortDescr;
    }

    /**
     * Sets the value of the outRateTable1ExDescCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRateTable1ExDescCurrencyShortDescr(String value) {
        this.outRateTable1ExDescCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outRateTable1ExDescGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRateTable1ExDescGenericDetailDescription() {
        return outRateTable1ExDescGenericDetailDescription;
    }

    /**
     * Sets the value of the outRateTable1ExDescGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRateTable1ExDescGenericDetailDescription(String value) {
        this.outRateTable1ExDescGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outRateTable1ExDescGenericDetailSerialNum property.
     * 
     */
    public int getOutRateTable1ExDescGenericDetailSerialNum() {
        return outRateTable1ExDescGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outRateTable1ExDescGenericDetailSerialNum property.
     * 
     */
    public void setOutRateTable1ExDescGenericDetailSerialNum(int value) {
        this.outRateTable1ExDescGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outRateTable1ExDetailsRateTableBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1ExDetailsRateTableBuyRate() {
        return outRateTable1ExDetailsRateTableBuyRate;
    }

    /**
     * Sets the value of the outRateTable1ExDetailsRateTableBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1ExDetailsRateTableBuyRate(BigDecimal value) {
        this.outRateTable1ExDetailsRateTableBuyRate = value;
    }

    /**
     * Gets the value of the outRateTable1ExDetailsRateTableBuyRateMt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1ExDetailsRateTableBuyRateMt() {
        return outRateTable1ExDetailsRateTableBuyRateMt;
    }

    /**
     * Sets the value of the outRateTable1ExDetailsRateTableBuyRateMt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1ExDetailsRateTableBuyRateMt(BigDecimal value) {
        this.outRateTable1ExDetailsRateTableBuyRateMt = value;
    }

    /**
     * Gets the value of the outRateTable1ExDetailsRateTableExchNotesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRateTable1ExDetailsRateTableExchNotesFlag() {
        return outRateTable1ExDetailsRateTableExchNotesFlag;
    }

    /**
     * Sets the value of the outRateTable1ExDetailsRateTableExchNotesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRateTable1ExDetailsRateTableExchNotesFlag(String value) {
        this.outRateTable1ExDetailsRateTableExchNotesFlag = value;
    }

    /**
     * Gets the value of the outRateTable1ExDetailsRateTableFixingRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1ExDetailsRateTableFixingRate() {
        return outRateTable1ExDetailsRateTableFixingRate;
    }

    /**
     * Sets the value of the outRateTable1ExDetailsRateTableFixingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1ExDetailsRateTableFixingRate(BigDecimal value) {
        this.outRateTable1ExDetailsRateTableFixingRate = value;
    }

    /**
     * Gets the value of the outRateTable1ExDetailsRateTableMinNegotUnit property.
     * 
     */
    public short getOutRateTable1ExDetailsRateTableMinNegotUnit() {
        return outRateTable1ExDetailsRateTableMinNegotUnit;
    }

    /**
     * Sets the value of the outRateTable1ExDetailsRateTableMinNegotUnit property.
     * 
     */
    public void setOutRateTable1ExDetailsRateTableMinNegotUnit(short value) {
        this.outRateTable1ExDetailsRateTableMinNegotUnit = value;
    }

    /**
     * Gets the value of the outRateTable1ExDetailsRateTableMultiplier property.
     * 
     */
    public int getOutRateTable1ExDetailsRateTableMultiplier() {
        return outRateTable1ExDetailsRateTableMultiplier;
    }

    /**
     * Sets the value of the outRateTable1ExDetailsRateTableMultiplier property.
     * 
     */
    public void setOutRateTable1ExDetailsRateTableMultiplier(int value) {
        this.outRateTable1ExDetailsRateTableMultiplier = value;
    }

    /**
     * Gets the value of the outRateTable1ExDetailsRateTableScaleMaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1ExDetailsRateTableScaleMaxAmount() {
        return outRateTable1ExDetailsRateTableScaleMaxAmount;
    }

    /**
     * Sets the value of the outRateTable1ExDetailsRateTableScaleMaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1ExDetailsRateTableScaleMaxAmount(BigDecimal value) {
        this.outRateTable1ExDetailsRateTableScaleMaxAmount = value;
    }

    /**
     * Gets the value of the outRateTable1ExDetailsRateTableSellRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1ExDetailsRateTableSellRate() {
        return outRateTable1ExDetailsRateTableSellRate;
    }

    /**
     * Sets the value of the outRateTable1ExDetailsRateTableSellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1ExDetailsRateTableSellRate(BigDecimal value) {
        this.outRateTable1ExDetailsRateTableSellRate = value;
    }

    /**
     * Gets the value of the outRateTable1ExDetailsRateTableTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutRateTable1ExDetailsRateTableTmstamp() {
        return outRateTable1ExDetailsRateTableTmstamp;
    }

    /**
     * Sets the value of the outRateTable1ExDetailsRateTableTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutRateTable1ExDetailsRateTableTmstamp(XMLGregorianCalendar value) {
        this.outRateTable1ExDetailsRateTableTmstamp = value;
    }

    /**
     * Gets the value of the outRateTable1ExNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRateTable1ExNameListSetDescription() {
        return outRateTable1ExNameListSetDescription;
    }

    /**
     * Sets the value of the outRateTable1ExNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRateTable1ExNameListSetDescription(String value) {
        this.outRateTable1ExNameListSetDescription = value;
    }

    /**
     * Gets the value of the outRateTable1OutBuyBankNotesIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1OutBuyBankNotesIefSuppliedRate() {
        return outRateTable1OutBuyBankNotesIefSuppliedRate;
    }

    /**
     * Sets the value of the outRateTable1OutBuyBankNotesIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1OutBuyBankNotesIefSuppliedRate(BigDecimal value) {
        this.outRateTable1OutBuyBankNotesIefSuppliedRate = value;
    }

    /**
     * Gets the value of the outRateTable1OutBuyIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1OutBuyIefSuppliedRate() {
        return outRateTable1OutBuyIefSuppliedRate;
    }

    /**
     * Sets the value of the outRateTable1OutBuyIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1OutBuyIefSuppliedRate(BigDecimal value) {
        this.outRateTable1OutBuyIefSuppliedRate = value;
    }

    /**
     * Gets the value of the outRateTable1OutBuyRateMtIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1OutBuyRateMtIefSuppliedRate() {
        return outRateTable1OutBuyRateMtIefSuppliedRate;
    }

    /**
     * Sets the value of the outRateTable1OutBuyRateMtIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1OutBuyRateMtIefSuppliedRate(BigDecimal value) {
        this.outRateTable1OutBuyRateMtIefSuppliedRate = value;
    }

    /**
     * Gets the value of the outRateTable1OutFixingIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1OutFixingIefSuppliedRate() {
        return outRateTable1OutFixingIefSuppliedRate;
    }

    /**
     * Sets the value of the outRateTable1OutFixingIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1OutFixingIefSuppliedRate(BigDecimal value) {
        this.outRateTable1OutFixingIefSuppliedRate = value;
    }

    /**
     * Gets the value of the outRateTable1OutSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutRateTable1OutSelectIefSuppliedSelectChar() {
        return outRateTable1OutSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outRateTable1OutSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutRateTable1OutSelectIefSuppliedSelectChar(String value) {
        this.outRateTable1OutSelectIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outRateTable1OutSellBankNotesIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1OutSellBankNotesIefSuppliedRate() {
        return outRateTable1OutSellBankNotesIefSuppliedRate;
    }

    /**
     * Sets the value of the outRateTable1OutSellBankNotesIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1OutSellBankNotesIefSuppliedRate(BigDecimal value) {
        this.outRateTable1OutSellBankNotesIefSuppliedRate = value;
    }

    /**
     * Gets the value of the outRateTable1OutSellIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutRateTable1OutSellIefSuppliedRate() {
        return outRateTable1OutSellIefSuppliedRate;
    }

    /**
     * Sets the value of the outRateTable1OutSellIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutRateTable1OutSellIefSuppliedRate(BigDecimal value) {
        this.outRateTable1OutSellIefSuppliedRate = value;
    }

}
