
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FEXS03InGroupItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEXS03InGroupItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGroupInBuyBankNotesIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInBuyIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInBuyRateMtIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInDescGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInDescGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGroupInDetailsRateTableBuyRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInDetailsRateTableBuyRateMt" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInDetailsRateTableExchNotesFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInDetailsRateTableFixingRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInDetailsRateTableMinNegotUnit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGroupInDetailsRateTableMultiplier" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGroupInDetailsRateTableScaleMaxAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInDetailsRateTableSellRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInDetailsRateTableTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGroupInFixingIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInGrpCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGroupInGrpCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInGrpCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGroupInGrpCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InGroupInNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInSelectIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGroupInSellBankNotesIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="InGroupInSellIefSuppliedRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEXS03InGroupItem", propOrder = {
    "inGroupInBuyBankNotesIefSuppliedRate",
    "inGroupInBuyIefSuppliedRate",
    "inGroupInBuyRateMtIefSuppliedRate",
    "inGroupInDescGenericDetailDescription",
    "inGroupInDescGenericDetailSerialNum",
    "inGroupInDetailsRateTableBuyRate",
    "inGroupInDetailsRateTableBuyRateMt",
    "inGroupInDetailsRateTableExchNotesFlag",
    "inGroupInDetailsRateTableFixingRate",
    "inGroupInDetailsRateTableMinNegotUnit",
    "inGroupInDetailsRateTableMultiplier",
    "inGroupInDetailsRateTableScaleMaxAmount",
    "inGroupInDetailsRateTableSellRate",
    "inGroupInDetailsRateTableTmstamp",
    "inGroupInFixingIefSuppliedRate",
    "inGroupInGrpCurrencyIdCurrency",
    "inGroupInGrpCurrencyShortDescr",
    "inGroupInGrpCustomerCDigit",
    "inGroupInGrpCustomerCustId",
    "inGroupInNameListSetDescription",
    "inGroupInSelectIefSuppliedSelectChar",
    "inGroupInSellBankNotesIefSuppliedRate",
    "inGroupInSellIefSuppliedRate"
})
public class FEXS03InGroupItem {

    @XmlElement(name = "InGroupInBuyBankNotesIefSuppliedRate", required = true)
    protected BigDecimal inGroupInBuyBankNotesIefSuppliedRate;
    @XmlElement(name = "InGroupInBuyIefSuppliedRate", required = true)
    protected BigDecimal inGroupInBuyIefSuppliedRate;
    @XmlElement(name = "InGroupInBuyRateMtIefSuppliedRate", required = true)
    protected BigDecimal inGroupInBuyRateMtIefSuppliedRate;
    @XmlElement(name = "InGroupInDescGenericDetailDescription")
    protected String inGroupInDescGenericDetailDescription;
    @XmlElement(name = "InGroupInDescGenericDetailSerialNum")
    protected int inGroupInDescGenericDetailSerialNum;
    @XmlElement(name = "InGroupInDetailsRateTableBuyRate", required = true)
    protected BigDecimal inGroupInDetailsRateTableBuyRate;
    @XmlElement(name = "InGroupInDetailsRateTableBuyRateMt", required = true)
    protected BigDecimal inGroupInDetailsRateTableBuyRateMt;
    @XmlElement(name = "InGroupInDetailsRateTableExchNotesFlag")
    protected String inGroupInDetailsRateTableExchNotesFlag;
    @XmlElement(name = "InGroupInDetailsRateTableFixingRate", required = true)
    protected BigDecimal inGroupInDetailsRateTableFixingRate;
    @XmlElement(name = "InGroupInDetailsRateTableMinNegotUnit")
    protected short inGroupInDetailsRateTableMinNegotUnit;
    @XmlElement(name = "InGroupInDetailsRateTableMultiplier")
    protected int inGroupInDetailsRateTableMultiplier;
    @XmlElement(name = "InGroupInDetailsRateTableScaleMaxAmount", required = true)
    protected BigDecimal inGroupInDetailsRateTableScaleMaxAmount;
    @XmlElement(name = "InGroupInDetailsRateTableSellRate", required = true)
    protected BigDecimal inGroupInDetailsRateTableSellRate;
    @XmlElement(name = "InGroupInDetailsRateTableTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGroupInDetailsRateTableTmstamp;
    @XmlElement(name = "InGroupInFixingIefSuppliedRate", required = true)
    protected BigDecimal inGroupInFixingIefSuppliedRate;
    @XmlElement(name = "InGroupInGrpCurrencyIdCurrency")
    protected int inGroupInGrpCurrencyIdCurrency;
    @XmlElement(name = "InGroupInGrpCurrencyShortDescr")
    protected String inGroupInGrpCurrencyShortDescr;
    @XmlElement(name = "InGroupInGrpCustomerCDigit")
    protected short inGroupInGrpCustomerCDigit;
    @XmlElement(name = "InGroupInGrpCustomerCustId")
    protected int inGroupInGrpCustomerCustId;
    @XmlElement(name = "InGroupInNameListSetDescription")
    protected String inGroupInNameListSetDescription;
    @XmlElement(name = "InGroupInSelectIefSuppliedSelectChar")
    protected String inGroupInSelectIefSuppliedSelectChar;
    @XmlElement(name = "InGroupInSellBankNotesIefSuppliedRate", required = true)
    protected BigDecimal inGroupInSellBankNotesIefSuppliedRate;
    @XmlElement(name = "InGroupInSellIefSuppliedRate", required = true)
    protected BigDecimal inGroupInSellIefSuppliedRate;

    /**
     * Gets the value of the inGroupInBuyBankNotesIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInBuyBankNotesIefSuppliedRate() {
        return inGroupInBuyBankNotesIefSuppliedRate;
    }

    /**
     * Sets the value of the inGroupInBuyBankNotesIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInBuyBankNotesIefSuppliedRate(BigDecimal value) {
        this.inGroupInBuyBankNotesIefSuppliedRate = value;
    }

    /**
     * Gets the value of the inGroupInBuyIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInBuyIefSuppliedRate() {
        return inGroupInBuyIefSuppliedRate;
    }

    /**
     * Sets the value of the inGroupInBuyIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInBuyIefSuppliedRate(BigDecimal value) {
        this.inGroupInBuyIefSuppliedRate = value;
    }

    /**
     * Gets the value of the inGroupInBuyRateMtIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInBuyRateMtIefSuppliedRate() {
        return inGroupInBuyRateMtIefSuppliedRate;
    }

    /**
     * Sets the value of the inGroupInBuyRateMtIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInBuyRateMtIefSuppliedRate(BigDecimal value) {
        this.inGroupInBuyRateMtIefSuppliedRate = value;
    }

    /**
     * Gets the value of the inGroupInDescGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInDescGenericDetailDescription() {
        return inGroupInDescGenericDetailDescription;
    }

    /**
     * Sets the value of the inGroupInDescGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInDescGenericDetailDescription(String value) {
        this.inGroupInDescGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inGroupInDescGenericDetailSerialNum property.
     * 
     */
    public int getInGroupInDescGenericDetailSerialNum() {
        return inGroupInDescGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inGroupInDescGenericDetailSerialNum property.
     * 
     */
    public void setInGroupInDescGenericDetailSerialNum(int value) {
        this.inGroupInDescGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inGroupInDetailsRateTableBuyRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInDetailsRateTableBuyRate() {
        return inGroupInDetailsRateTableBuyRate;
    }

    /**
     * Sets the value of the inGroupInDetailsRateTableBuyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInDetailsRateTableBuyRate(BigDecimal value) {
        this.inGroupInDetailsRateTableBuyRate = value;
    }

    /**
     * Gets the value of the inGroupInDetailsRateTableBuyRateMt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInDetailsRateTableBuyRateMt() {
        return inGroupInDetailsRateTableBuyRateMt;
    }

    /**
     * Sets the value of the inGroupInDetailsRateTableBuyRateMt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInDetailsRateTableBuyRateMt(BigDecimal value) {
        this.inGroupInDetailsRateTableBuyRateMt = value;
    }

    /**
     * Gets the value of the inGroupInDetailsRateTableExchNotesFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInDetailsRateTableExchNotesFlag() {
        return inGroupInDetailsRateTableExchNotesFlag;
    }

    /**
     * Sets the value of the inGroupInDetailsRateTableExchNotesFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInDetailsRateTableExchNotesFlag(String value) {
        this.inGroupInDetailsRateTableExchNotesFlag = value;
    }

    /**
     * Gets the value of the inGroupInDetailsRateTableFixingRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInDetailsRateTableFixingRate() {
        return inGroupInDetailsRateTableFixingRate;
    }

    /**
     * Sets the value of the inGroupInDetailsRateTableFixingRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInDetailsRateTableFixingRate(BigDecimal value) {
        this.inGroupInDetailsRateTableFixingRate = value;
    }

    /**
     * Gets the value of the inGroupInDetailsRateTableMinNegotUnit property.
     * 
     */
    public short getInGroupInDetailsRateTableMinNegotUnit() {
        return inGroupInDetailsRateTableMinNegotUnit;
    }

    /**
     * Sets the value of the inGroupInDetailsRateTableMinNegotUnit property.
     * 
     */
    public void setInGroupInDetailsRateTableMinNegotUnit(short value) {
        this.inGroupInDetailsRateTableMinNegotUnit = value;
    }

    /**
     * Gets the value of the inGroupInDetailsRateTableMultiplier property.
     * 
     */
    public int getInGroupInDetailsRateTableMultiplier() {
        return inGroupInDetailsRateTableMultiplier;
    }

    /**
     * Sets the value of the inGroupInDetailsRateTableMultiplier property.
     * 
     */
    public void setInGroupInDetailsRateTableMultiplier(int value) {
        this.inGroupInDetailsRateTableMultiplier = value;
    }

    /**
     * Gets the value of the inGroupInDetailsRateTableScaleMaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInDetailsRateTableScaleMaxAmount() {
        return inGroupInDetailsRateTableScaleMaxAmount;
    }

    /**
     * Sets the value of the inGroupInDetailsRateTableScaleMaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInDetailsRateTableScaleMaxAmount(BigDecimal value) {
        this.inGroupInDetailsRateTableScaleMaxAmount = value;
    }

    /**
     * Gets the value of the inGroupInDetailsRateTableSellRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInDetailsRateTableSellRate() {
        return inGroupInDetailsRateTableSellRate;
    }

    /**
     * Sets the value of the inGroupInDetailsRateTableSellRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInDetailsRateTableSellRate(BigDecimal value) {
        this.inGroupInDetailsRateTableSellRate = value;
    }

    /**
     * Gets the value of the inGroupInDetailsRateTableTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGroupInDetailsRateTableTmstamp() {
        return inGroupInDetailsRateTableTmstamp;
    }

    /**
     * Sets the value of the inGroupInDetailsRateTableTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGroupInDetailsRateTableTmstamp(XMLGregorianCalendar value) {
        this.inGroupInDetailsRateTableTmstamp = value;
    }

    /**
     * Gets the value of the inGroupInFixingIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInFixingIefSuppliedRate() {
        return inGroupInFixingIefSuppliedRate;
    }

    /**
     * Sets the value of the inGroupInFixingIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInFixingIefSuppliedRate(BigDecimal value) {
        this.inGroupInFixingIefSuppliedRate = value;
    }

    /**
     * Gets the value of the inGroupInGrpCurrencyIdCurrency property.
     * 
     */
    public int getInGroupInGrpCurrencyIdCurrency() {
        return inGroupInGrpCurrencyIdCurrency;
    }

    /**
     * Sets the value of the inGroupInGrpCurrencyIdCurrency property.
     * 
     */
    public void setInGroupInGrpCurrencyIdCurrency(int value) {
        this.inGroupInGrpCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the inGroupInGrpCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInGrpCurrencyShortDescr() {
        return inGroupInGrpCurrencyShortDescr;
    }

    /**
     * Sets the value of the inGroupInGrpCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInGrpCurrencyShortDescr(String value) {
        this.inGroupInGrpCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the inGroupInGrpCustomerCDigit property.
     * 
     */
    public short getInGroupInGrpCustomerCDigit() {
        return inGroupInGrpCustomerCDigit;
    }

    /**
     * Sets the value of the inGroupInGrpCustomerCDigit property.
     * 
     */
    public void setInGroupInGrpCustomerCDigit(short value) {
        this.inGroupInGrpCustomerCDigit = value;
    }

    /**
     * Gets the value of the inGroupInGrpCustomerCustId property.
     * 
     */
    public int getInGroupInGrpCustomerCustId() {
        return inGroupInGrpCustomerCustId;
    }

    /**
     * Sets the value of the inGroupInGrpCustomerCustId property.
     * 
     */
    public void setInGroupInGrpCustomerCustId(int value) {
        this.inGroupInGrpCustomerCustId = value;
    }

    /**
     * Gets the value of the inGroupInNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInNameListSetDescription() {
        return inGroupInNameListSetDescription;
    }

    /**
     * Sets the value of the inGroupInNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInNameListSetDescription(String value) {
        this.inGroupInNameListSetDescription = value;
    }

    /**
     * Gets the value of the inGroupInSelectIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGroupInSelectIefSuppliedSelectChar() {
        return inGroupInSelectIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGroupInSelectIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGroupInSelectIefSuppliedSelectChar(String value) {
        this.inGroupInSelectIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inGroupInSellBankNotesIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInSellBankNotesIefSuppliedRate() {
        return inGroupInSellBankNotesIefSuppliedRate;
    }

    /**
     * Sets the value of the inGroupInSellBankNotesIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInSellBankNotesIefSuppliedRate(BigDecimal value) {
        this.inGroupInSellBankNotesIefSuppliedRate = value;
    }

    /**
     * Gets the value of the inGroupInSellIefSuppliedRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInGroupInSellIefSuppliedRate() {
        return inGroupInSellIefSuppliedRate;
    }

    /**
     * Sets the value of the inGroupInSellIefSuppliedRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInGroupInSellIefSuppliedRate(BigDecimal value) {
        this.inGroupInSellIefSuppliedRate = value;
    }

}
