
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for X2231VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X2231VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutCurrencyDescrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutCurrencyDescrCurrencyNationalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutCurrencyDescrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCharSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProductDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSafeDepositBoxSdbSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSafeDepositUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSdbBeneficiaryBenefStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSdbBeneficiaryMainBenefFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSdbBeneficiaryTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalComissionBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalExpenseBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalGuaranteeBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalRental" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalRentalBal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalRentalCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalRentalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalRentalExpiryDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalRentalRenewalDt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalRentalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalTotComission" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalTotExpense" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpOutGrmSdbRentalTotRental" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X2231VOutGrpItem", propOrder = {
    "outGrpOutCurrencyDescrCurrencyIdCurrency",
    "outGrpOutCurrencyDescrCurrencyNationalFlag",
    "outGrpOutCurrencyDescrCurrencyShortDescr",
    "outGrpOutGrmCharSuppliedChar20",
    "outGrpOutGrmIefSuppliedSelectChar",
    "outGrpOutGrmProductDescription",
    "outGrpOutGrmProductIdProduct",
    "outGrpOutGrmSafeDepositBoxSdbSn",
    "outGrpOutGrmSafeDepositUnitCode",
    "outGrpOutGrmSdbBeneficiaryBenefStatus",
    "outGrpOutGrmSdbBeneficiaryMainBenefFlg",
    "outGrpOutGrmSdbBeneficiaryTmstamp",
    "outGrpOutGrmSdbRentalComissionBal",
    "outGrpOutGrmSdbRentalExpenseBal",
    "outGrpOutGrmSdbRentalGuaranteeBal",
    "outGrpOutGrmSdbRentalRental",
    "outGrpOutGrmSdbRentalRentalBal",
    "outGrpOutGrmSdbRentalRentalCurrency",
    "outGrpOutGrmSdbRentalRentalDt",
    "outGrpOutGrmSdbRentalRentalExpiryDt",
    "outGrpOutGrmSdbRentalRentalRenewalDt",
    "outGrpOutGrmSdbRentalRentalStatus",
    "outGrpOutGrmSdbRentalTotComission",
    "outGrpOutGrmSdbRentalTotExpense",
    "outGrpOutGrmSdbRentalTotRental"
})
public class X2231VOutGrpItem {

    @XmlElement(name = "OutGrpOutCurrencyDescrCurrencyIdCurrency")
    protected int outGrpOutCurrencyDescrCurrencyIdCurrency;
    @XmlElement(name = "OutGrpOutCurrencyDescrCurrencyNationalFlag")
    protected String outGrpOutCurrencyDescrCurrencyNationalFlag;
    @XmlElement(name = "OutGrpOutCurrencyDescrCurrencyShortDescr")
    protected String outGrpOutCurrencyDescrCurrencyShortDescr;
    @XmlElement(name = "OutGrpOutGrmCharSuppliedChar20")
    protected String outGrpOutGrmCharSuppliedChar20;
    @XmlElement(name = "OutGrpOutGrmIefSuppliedSelectChar")
    protected String outGrpOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpOutGrmProductDescription")
    protected String outGrpOutGrmProductDescription;
    @XmlElement(name = "OutGrpOutGrmProductIdProduct")
    protected int outGrpOutGrmProductIdProduct;
    @XmlElement(name = "OutGrpOutGrmSafeDepositBoxSdbSn")
    protected int outGrpOutGrmSafeDepositBoxSdbSn;
    @XmlElement(name = "OutGrpOutGrmSafeDepositUnitCode")
    protected int outGrpOutGrmSafeDepositUnitCode;
    @XmlElement(name = "OutGrpOutGrmSdbBeneficiaryBenefStatus")
    protected String outGrpOutGrmSdbBeneficiaryBenefStatus;
    @XmlElement(name = "OutGrpOutGrmSdbBeneficiaryMainBenefFlg")
    protected String outGrpOutGrmSdbBeneficiaryMainBenefFlg;
    @XmlElement(name = "OutGrpOutGrmSdbBeneficiaryTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSdbBeneficiaryTmstamp;
    @XmlElement(name = "OutGrpOutGrmSdbRentalComissionBal", required = true)
    protected BigDecimal outGrpOutGrmSdbRentalComissionBal;
    @XmlElement(name = "OutGrpOutGrmSdbRentalExpenseBal", required = true)
    protected BigDecimal outGrpOutGrmSdbRentalExpenseBal;
    @XmlElement(name = "OutGrpOutGrmSdbRentalGuaranteeBal", required = true)
    protected BigDecimal outGrpOutGrmSdbRentalGuaranteeBal;
    @XmlElement(name = "OutGrpOutGrmSdbRentalRental", required = true)
    protected BigDecimal outGrpOutGrmSdbRentalRental;
    @XmlElement(name = "OutGrpOutGrmSdbRentalRentalBal", required = true)
    protected BigDecimal outGrpOutGrmSdbRentalRentalBal;
    @XmlElement(name = "OutGrpOutGrmSdbRentalRentalCurrency")
    protected int outGrpOutGrmSdbRentalRentalCurrency;
    @XmlElement(name = "OutGrpOutGrmSdbRentalRentalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSdbRentalRentalDt;
    @XmlElement(name = "OutGrpOutGrmSdbRentalRentalExpiryDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSdbRentalRentalExpiryDt;
    @XmlElement(name = "OutGrpOutGrmSdbRentalRentalRenewalDt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmSdbRentalRentalRenewalDt;
    @XmlElement(name = "OutGrpOutGrmSdbRentalRentalStatus")
    protected String outGrpOutGrmSdbRentalRentalStatus;
    @XmlElement(name = "OutGrpOutGrmSdbRentalTotComission", required = true)
    protected BigDecimal outGrpOutGrmSdbRentalTotComission;
    @XmlElement(name = "OutGrpOutGrmSdbRentalTotExpense", required = true)
    protected BigDecimal outGrpOutGrmSdbRentalTotExpense;
    @XmlElement(name = "OutGrpOutGrmSdbRentalTotRental", required = true)
    protected BigDecimal outGrpOutGrmSdbRentalTotRental;

    /**
     * Gets the value of the outGrpOutCurrencyDescrCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpOutCurrencyDescrCurrencyIdCurrency() {
        return outGrpOutCurrencyDescrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpOutCurrencyDescrCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpOutCurrencyDescrCurrencyIdCurrency(int value) {
        this.outGrpOutCurrencyDescrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutCurrencyDescrCurrencyNationalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutCurrencyDescrCurrencyNationalFlag() {
        return outGrpOutCurrencyDescrCurrencyNationalFlag;
    }

    /**
     * Sets the value of the outGrpOutCurrencyDescrCurrencyNationalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutCurrencyDescrCurrencyNationalFlag(String value) {
        this.outGrpOutCurrencyDescrCurrencyNationalFlag = value;
    }

    /**
     * Gets the value of the outGrpOutCurrencyDescrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutCurrencyDescrCurrencyShortDescr() {
        return outGrpOutCurrencyDescrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpOutCurrencyDescrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutCurrencyDescrCurrencyShortDescr(String value) {
        this.outGrpOutCurrencyDescrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCharSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCharSuppliedChar20() {
        return outGrpOutGrmCharSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpOutGrmCharSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCharSuppliedChar20(String value) {
        this.outGrpOutGrmCharSuppliedChar20 = value;
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
     * Gets the value of the outGrpOutGrmSafeDepositBoxSdbSn property.
     * 
     */
    public int getOutGrpOutGrmSafeDepositBoxSdbSn() {
        return outGrpOutGrmSafeDepositBoxSdbSn;
    }

    /**
     * Sets the value of the outGrpOutGrmSafeDepositBoxSdbSn property.
     * 
     */
    public void setOutGrpOutGrmSafeDepositBoxSdbSn(int value) {
        this.outGrpOutGrmSafeDepositBoxSdbSn = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSafeDepositUnitCode property.
     * 
     */
    public int getOutGrpOutGrmSafeDepositUnitCode() {
        return outGrpOutGrmSafeDepositUnitCode;
    }

    /**
     * Sets the value of the outGrpOutGrmSafeDepositUnitCode property.
     * 
     */
    public void setOutGrpOutGrmSafeDepositUnitCode(int value) {
        this.outGrpOutGrmSafeDepositUnitCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbBeneficiaryBenefStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSdbBeneficiaryBenefStatus() {
        return outGrpOutGrmSdbBeneficiaryBenefStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbBeneficiaryBenefStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSdbBeneficiaryBenefStatus(String value) {
        this.outGrpOutGrmSdbBeneficiaryBenefStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbBeneficiaryMainBenefFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSdbBeneficiaryMainBenefFlg() {
        return outGrpOutGrmSdbBeneficiaryMainBenefFlg;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbBeneficiaryMainBenefFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSdbBeneficiaryMainBenefFlg(String value) {
        this.outGrpOutGrmSdbBeneficiaryMainBenefFlg = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbBeneficiaryTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSdbBeneficiaryTmstamp() {
        return outGrpOutGrmSdbBeneficiaryTmstamp;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbBeneficiaryTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSdbBeneficiaryTmstamp(XMLGregorianCalendar value) {
        this.outGrpOutGrmSdbBeneficiaryTmstamp = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalComissionBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbRentalComissionBal() {
        return outGrpOutGrmSdbRentalComissionBal;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalComissionBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbRentalComissionBal(BigDecimal value) {
        this.outGrpOutGrmSdbRentalComissionBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalExpenseBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbRentalExpenseBal() {
        return outGrpOutGrmSdbRentalExpenseBal;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalExpenseBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbRentalExpenseBal(BigDecimal value) {
        this.outGrpOutGrmSdbRentalExpenseBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalGuaranteeBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbRentalGuaranteeBal() {
        return outGrpOutGrmSdbRentalGuaranteeBal;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalGuaranteeBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbRentalGuaranteeBal(BigDecimal value) {
        this.outGrpOutGrmSdbRentalGuaranteeBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalRental property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbRentalRental() {
        return outGrpOutGrmSdbRentalRental;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbRentalRental(BigDecimal value) {
        this.outGrpOutGrmSdbRentalRental = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalRentalBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbRentalRentalBal() {
        return outGrpOutGrmSdbRentalRentalBal;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalRentalBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbRentalRentalBal(BigDecimal value) {
        this.outGrpOutGrmSdbRentalRentalBal = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalRentalCurrency property.
     * 
     */
    public int getOutGrpOutGrmSdbRentalRentalCurrency() {
        return outGrpOutGrmSdbRentalRentalCurrency;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalRentalCurrency property.
     * 
     */
    public void setOutGrpOutGrmSdbRentalRentalCurrency(int value) {
        this.outGrpOutGrmSdbRentalRentalCurrency = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalRentalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSdbRentalRentalDt() {
        return outGrpOutGrmSdbRentalRentalDt;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalRentalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSdbRentalRentalDt(XMLGregorianCalendar value) {
        this.outGrpOutGrmSdbRentalRentalDt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalRentalExpiryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSdbRentalRentalExpiryDt() {
        return outGrpOutGrmSdbRentalRentalExpiryDt;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalRentalExpiryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSdbRentalRentalExpiryDt(XMLGregorianCalendar value) {
        this.outGrpOutGrmSdbRentalRentalExpiryDt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalRentalRenewalDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmSdbRentalRentalRenewalDt() {
        return outGrpOutGrmSdbRentalRentalRenewalDt;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalRentalRenewalDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmSdbRentalRentalRenewalDt(XMLGregorianCalendar value) {
        this.outGrpOutGrmSdbRentalRentalRenewalDt = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalRentalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmSdbRentalRentalStatus() {
        return outGrpOutGrmSdbRentalRentalStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalRentalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmSdbRentalRentalStatus(String value) {
        this.outGrpOutGrmSdbRentalRentalStatus = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalTotComission property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbRentalTotComission() {
        return outGrpOutGrmSdbRentalTotComission;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalTotComission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbRentalTotComission(BigDecimal value) {
        this.outGrpOutGrmSdbRentalTotComission = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalTotExpense property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbRentalTotExpense() {
        return outGrpOutGrmSdbRentalTotExpense;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalTotExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbRentalTotExpense(BigDecimal value) {
        this.outGrpOutGrmSdbRentalTotExpense = value;
    }

    /**
     * Gets the value of the outGrpOutGrmSdbRentalTotRental property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpOutGrmSdbRentalTotRental() {
        return outGrpOutGrmSdbRentalTotRental;
    }

    /**
     * Sets the value of the outGrpOutGrmSdbRentalTotRental property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpOutGrmSdbRentalTotRental(BigDecimal value) {
        this.outGrpOutGrmSdbRentalTotRental = value;
    }

}
