
package com.intrasoft_internatinal.gatewayservice.profitsext;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Mc2032VOutGrpValuersItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mc2032VOutGrpValuersItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpValuersOutGrmCountyGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmCountyGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmCountyGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpValuersOutGrmDescrIefSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmSelchrIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerInternalFlg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerValuerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerValuerEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerValuerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerValuerMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerValuerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerValuerPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerAmount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="OutGrpValuersOutGrmValuerValuerContactPerson" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmAmnCurrCurrencyIdCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpValuersOutGrmAmnCurrCurrencyShortDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValUnderwriterGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpValuersOutGrmValUnderwriterGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmValUnderwriterGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmStatusDescIefSuppliedChar20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpValuersOutGrmAccOfficerBankemployeeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mc2032VOutGrpValuersItem", propOrder = {
    "outGrpValuersOutGrmCountyGenericDetailDescription",
    "outGrpValuersOutGrmCountyGenericDetailParameterType",
    "outGrpValuersOutGrmCountyGenericDetailSerialNum",
    "outGrpValuersOutGrmDescrIefSuppliedChar20",
    "outGrpValuersOutGrmSelchrIefSuppliedSelectChar",
    "outGrpValuersOutGrmValuerValuerEntryStatus",
    "outGrpValuersOutGrmValuerValuerInternalFlg",
    "outGrpValuersOutGrmValuerValuerValuerAddress",
    "outGrpValuersOutGrmValuerValuerValuerEmail",
    "outGrpValuersOutGrmValuerValuerValuerId",
    "outGrpValuersOutGrmValuerValuerValuerMobile",
    "outGrpValuersOutGrmValuerValuerValuerName",
    "outGrpValuersOutGrmValuerValuerValuerPhone",
    "outGrpValuersOutGrmValuerValuerTmstamp",
    "outGrpValuersOutGrmValuerValuerAmount",
    "outGrpValuersOutGrmValuerValuerContactPerson",
    "outGrpValuersOutGrmAmnCurrCurrencyIdCurrency",
    "outGrpValuersOutGrmAmnCurrCurrencyShortDescr",
    "outGrpValuersOutGrmValUnderwriterGenericDetailSerialNum",
    "outGrpValuersOutGrmValUnderwriterGenericDetailParameterType",
    "outGrpValuersOutGrmValUnderwriterGenericDetailDescription",
    "outGrpValuersOutGrmStatusDescIefSuppliedChar20",
    "outGrpValuersOutGrmAccOfficerBankemployeeId"
})
public class Mc2032VOutGrpValuersItem {

    @XmlElement(name = "OutGrpValuersOutGrmCountyGenericDetailDescription")
    protected String outGrpValuersOutGrmCountyGenericDetailDescription;
    @XmlElement(name = "OutGrpValuersOutGrmCountyGenericDetailParameterType")
    protected String outGrpValuersOutGrmCountyGenericDetailParameterType;
    @XmlElement(name = "OutGrpValuersOutGrmCountyGenericDetailSerialNum")
    protected int outGrpValuersOutGrmCountyGenericDetailSerialNum;
    @XmlElement(name = "OutGrpValuersOutGrmDescrIefSuppliedChar20")
    protected String outGrpValuersOutGrmDescrIefSuppliedChar20;
    @XmlElement(name = "OutGrpValuersOutGrmSelchrIefSuppliedSelectChar")
    protected String outGrpValuersOutGrmSelchrIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerEntryStatus")
    protected String outGrpValuersOutGrmValuerValuerEntryStatus;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerInternalFlg")
    protected String outGrpValuersOutGrmValuerValuerInternalFlg;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerValuerAddress")
    protected String outGrpValuersOutGrmValuerValuerValuerAddress;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerValuerEmail")
    protected String outGrpValuersOutGrmValuerValuerValuerEmail;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerValuerId")
    protected int outGrpValuersOutGrmValuerValuerValuerId;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerValuerMobile")
    protected String outGrpValuersOutGrmValuerValuerValuerMobile;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerValuerName")
    protected String outGrpValuersOutGrmValuerValuerValuerName;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerValuerPhone")
    protected String outGrpValuersOutGrmValuerValuerValuerPhone;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpValuersOutGrmValuerValuerTmstamp;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerAmount", required = true)
    protected BigDecimal outGrpValuersOutGrmValuerValuerAmount;
    @XmlElement(name = "OutGrpValuersOutGrmValuerValuerContactPerson")
    protected String outGrpValuersOutGrmValuerValuerContactPerson;
    @XmlElement(name = "OutGrpValuersOutGrmAmnCurrCurrencyIdCurrency")
    protected int outGrpValuersOutGrmAmnCurrCurrencyIdCurrency;
    @XmlElement(name = "OutGrpValuersOutGrmAmnCurrCurrencyShortDescr")
    protected String outGrpValuersOutGrmAmnCurrCurrencyShortDescr;
    @XmlElement(name = "OutGrpValuersOutGrmValUnderwriterGenericDetailSerialNum")
    protected int outGrpValuersOutGrmValUnderwriterGenericDetailSerialNum;
    @XmlElement(name = "OutGrpValuersOutGrmValUnderwriterGenericDetailParameterType")
    protected String outGrpValuersOutGrmValUnderwriterGenericDetailParameterType;
    @XmlElement(name = "OutGrpValuersOutGrmValUnderwriterGenericDetailDescription")
    protected String outGrpValuersOutGrmValUnderwriterGenericDetailDescription;
    @XmlElement(name = "OutGrpValuersOutGrmStatusDescIefSuppliedChar20")
    protected String outGrpValuersOutGrmStatusDescIefSuppliedChar20;
    @XmlElement(name = "OutGrpValuersOutGrmAccOfficerBankemployeeId")
    protected String outGrpValuersOutGrmAccOfficerBankemployeeId;

    /**
     * Gets the value of the outGrpValuersOutGrmCountyGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmCountyGenericDetailDescription() {
        return outGrpValuersOutGrmCountyGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmCountyGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmCountyGenericDetailDescription(String value) {
        this.outGrpValuersOutGrmCountyGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmCountyGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmCountyGenericDetailParameterType() {
        return outGrpValuersOutGrmCountyGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmCountyGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmCountyGenericDetailParameterType(String value) {
        this.outGrpValuersOutGrmCountyGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmCountyGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpValuersOutGrmCountyGenericDetailSerialNum() {
        return outGrpValuersOutGrmCountyGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmCountyGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpValuersOutGrmCountyGenericDetailSerialNum(int value) {
        this.outGrpValuersOutGrmCountyGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmDescrIefSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmDescrIefSuppliedChar20() {
        return outGrpValuersOutGrmDescrIefSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmDescrIefSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmDescrIefSuppliedChar20(String value) {
        this.outGrpValuersOutGrmDescrIefSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmSelchrIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmSelchrIefSuppliedSelectChar() {
        return outGrpValuersOutGrmSelchrIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmSelchrIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmSelchrIefSuppliedSelectChar(String value) {
        this.outGrpValuersOutGrmSelchrIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValuerValuerEntryStatus() {
        return outGrpValuersOutGrmValuerValuerEntryStatus;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerEntryStatus(String value) {
        this.outGrpValuersOutGrmValuerValuerEntryStatus = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerInternalFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValuerValuerInternalFlg() {
        return outGrpValuersOutGrmValuerValuerInternalFlg;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerInternalFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerInternalFlg(String value) {
        this.outGrpValuersOutGrmValuerValuerInternalFlg = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerValuerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValuerValuerValuerAddress() {
        return outGrpValuersOutGrmValuerValuerValuerAddress;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerValuerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerValuerAddress(String value) {
        this.outGrpValuersOutGrmValuerValuerValuerAddress = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerValuerEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValuerValuerValuerEmail() {
        return outGrpValuersOutGrmValuerValuerValuerEmail;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerValuerEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerValuerEmail(String value) {
        this.outGrpValuersOutGrmValuerValuerValuerEmail = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerValuerId property.
     * 
     */
    public int getOutGrpValuersOutGrmValuerValuerValuerId() {
        return outGrpValuersOutGrmValuerValuerValuerId;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerValuerId property.
     * 
     */
    public void setOutGrpValuersOutGrmValuerValuerValuerId(int value) {
        this.outGrpValuersOutGrmValuerValuerValuerId = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerValuerMobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValuerValuerValuerMobile() {
        return outGrpValuersOutGrmValuerValuerValuerMobile;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerValuerMobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerValuerMobile(String value) {
        this.outGrpValuersOutGrmValuerValuerValuerMobile = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerValuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValuerValuerValuerName() {
        return outGrpValuersOutGrmValuerValuerValuerName;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerValuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerValuerName(String value) {
        this.outGrpValuersOutGrmValuerValuerValuerName = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerValuerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValuerValuerValuerPhone() {
        return outGrpValuersOutGrmValuerValuerValuerPhone;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerValuerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerValuerPhone(String value) {
        this.outGrpValuersOutGrmValuerValuerValuerPhone = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpValuersOutGrmValuerValuerTmstamp() {
        return outGrpValuersOutGrmValuerValuerTmstamp;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerTmstamp(XMLGregorianCalendar value) {
        this.outGrpValuersOutGrmValuerValuerTmstamp = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOutGrpValuersOutGrmValuerValuerAmount() {
        return outGrpValuersOutGrmValuerValuerAmount;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerAmount(BigDecimal value) {
        this.outGrpValuersOutGrmValuerValuerAmount = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValuerValuerContactPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValuerValuerContactPerson() {
        return outGrpValuersOutGrmValuerValuerContactPerson;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValuerValuerContactPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValuerValuerContactPerson(String value) {
        this.outGrpValuersOutGrmValuerValuerContactPerson = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmAmnCurrCurrencyIdCurrency property.
     * 
     */
    public int getOutGrpValuersOutGrmAmnCurrCurrencyIdCurrency() {
        return outGrpValuersOutGrmAmnCurrCurrencyIdCurrency;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmAmnCurrCurrencyIdCurrency property.
     * 
     */
    public void setOutGrpValuersOutGrmAmnCurrCurrencyIdCurrency(int value) {
        this.outGrpValuersOutGrmAmnCurrCurrencyIdCurrency = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmAmnCurrCurrencyShortDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmAmnCurrCurrencyShortDescr() {
        return outGrpValuersOutGrmAmnCurrCurrencyShortDescr;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmAmnCurrCurrencyShortDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmAmnCurrCurrencyShortDescr(String value) {
        this.outGrpValuersOutGrmAmnCurrCurrencyShortDescr = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValUnderwriterGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpValuersOutGrmValUnderwriterGenericDetailSerialNum() {
        return outGrpValuersOutGrmValUnderwriterGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValUnderwriterGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpValuersOutGrmValUnderwriterGenericDetailSerialNum(int value) {
        this.outGrpValuersOutGrmValUnderwriterGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValUnderwriterGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValUnderwriterGenericDetailParameterType() {
        return outGrpValuersOutGrmValUnderwriterGenericDetailParameterType;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValUnderwriterGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValUnderwriterGenericDetailParameterType(String value) {
        this.outGrpValuersOutGrmValUnderwriterGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmValUnderwriterGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmValUnderwriterGenericDetailDescription() {
        return outGrpValuersOutGrmValUnderwriterGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmValUnderwriterGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmValUnderwriterGenericDetailDescription(String value) {
        this.outGrpValuersOutGrmValUnderwriterGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmStatusDescIefSuppliedChar20 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmStatusDescIefSuppliedChar20() {
        return outGrpValuersOutGrmStatusDescIefSuppliedChar20;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmStatusDescIefSuppliedChar20 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmStatusDescIefSuppliedChar20(String value) {
        this.outGrpValuersOutGrmStatusDescIefSuppliedChar20 = value;
    }

    /**
     * Gets the value of the outGrpValuersOutGrmAccOfficerBankemployeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpValuersOutGrmAccOfficerBankemployeeId() {
        return outGrpValuersOutGrmAccOfficerBankemployeeId;
    }

    /**
     * Sets the value of the outGrpValuersOutGrmAccOfficerBankemployeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpValuersOutGrmAccOfficerBankemployeeId(String value) {
        this.outGrpValuersOutGrmAccOfficerBankemployeeId = value;
    }

}
