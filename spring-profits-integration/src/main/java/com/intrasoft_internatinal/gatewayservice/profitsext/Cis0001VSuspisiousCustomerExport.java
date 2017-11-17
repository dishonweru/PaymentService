
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Cis0001VSuspisiousCustomerExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cis0001VSuspisiousCustomerExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutSuspectCntryCountryId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuspectCntryDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuspectCntryDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuspectCntryAlertAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCntryAlertReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustSuspectCustId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutSuspectCustSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuspectCustIdType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuspectCustIdNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustPhoneNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSuspectCustDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuspectCustDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSuspectCustAlertAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustAlertReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspectCustAlertReason2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSuspicStatusIefSuppliedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cis0001VSuspisiousCustomerExport", propOrder = {
    "outSuspectCntryCountryId",
    "outSuspectCntryDateFrom",
    "outSuspectCntryDateTo",
    "outSuspectCntryAlertAgency",
    "outSuspectCntryAlertReason",
    "outSuspectCustSuspectCustId",
    "outSuspectCustSurname",
    "outSuspectCustFirstName",
    "outSuspectCustFatherName",
    "outSuspectCustCustType",
    "outSuspectCustDateOfBirth",
    "outSuspectCustIdType",
    "outSuspectCustIdNum",
    "outSuspectCustAfm",
    "outSuspectCustAddress",
    "outSuspectCustZipCode",
    "outSuspectCustCity",
    "outSuspectCustCountry",
    "outSuspectCustPhoneNum",
    "outSuspectCustCustId",
    "outSuspectCustDateFrom",
    "outSuspectCustDateTo",
    "outSuspectCustAlertAgency",
    "outSuspectCustAlertReason",
    "outSuspectCustAlertReason2",
    "outSuspicStatusIefSuppliedDescription"
})
public class Cis0001VSuspisiousCustomerExport
    extends BaseExport
{

    @XmlElement(name = "OutSuspectCntryCountryId")
    protected int outSuspectCntryCountryId;
    @XmlElement(name = "OutSuspectCntryDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuspectCntryDateFrom;
    @XmlElement(name = "OutSuspectCntryDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuspectCntryDateTo;
    @XmlElement(name = "OutSuspectCntryAlertAgency")
    protected String outSuspectCntryAlertAgency;
    @XmlElement(name = "OutSuspectCntryAlertReason")
    protected String outSuspectCntryAlertReason;
    @XmlElement(name = "OutSuspectCustSuspectCustId")
    protected double outSuspectCustSuspectCustId;
    @XmlElement(name = "OutSuspectCustSurname")
    protected String outSuspectCustSurname;
    @XmlElement(name = "OutSuspectCustFirstName")
    protected String outSuspectCustFirstName;
    @XmlElement(name = "OutSuspectCustFatherName")
    protected String outSuspectCustFatherName;
    @XmlElement(name = "OutSuspectCustCustType")
    protected String outSuspectCustCustType;
    @XmlElement(name = "OutSuspectCustDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuspectCustDateOfBirth;
    @XmlElement(name = "OutSuspectCustIdType")
    protected int outSuspectCustIdType;
    @XmlElement(name = "OutSuspectCustIdNum")
    protected String outSuspectCustIdNum;
    @XmlElement(name = "OutSuspectCustAfm")
    protected String outSuspectCustAfm;
    @XmlElement(name = "OutSuspectCustAddress")
    protected String outSuspectCustAddress;
    @XmlElement(name = "OutSuspectCustZipCode")
    protected String outSuspectCustZipCode;
    @XmlElement(name = "OutSuspectCustCity")
    protected String outSuspectCustCity;
    @XmlElement(name = "OutSuspectCustCountry")
    protected String outSuspectCustCountry;
    @XmlElement(name = "OutSuspectCustPhoneNum")
    protected String outSuspectCustPhoneNum;
    @XmlElement(name = "OutSuspectCustCustId")
    protected int outSuspectCustCustId;
    @XmlElement(name = "OutSuspectCustDateFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuspectCustDateFrom;
    @XmlElement(name = "OutSuspectCustDateTo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSuspectCustDateTo;
    @XmlElement(name = "OutSuspectCustAlertAgency")
    protected String outSuspectCustAlertAgency;
    @XmlElement(name = "OutSuspectCustAlertReason")
    protected String outSuspectCustAlertReason;
    @XmlElement(name = "OutSuspectCustAlertReason2")
    protected String outSuspectCustAlertReason2;
    @XmlElement(name = "OutSuspicStatusIefSuppliedDescription")
    protected String outSuspicStatusIefSuppliedDescription;

    /**
     * Gets the value of the outSuspectCntryCountryId property.
     * 
     */
    public int getOutSuspectCntryCountryId() {
        return outSuspectCntryCountryId;
    }

    /**
     * Sets the value of the outSuspectCntryCountryId property.
     * 
     */
    public void setOutSuspectCntryCountryId(int value) {
        this.outSuspectCntryCountryId = value;
    }

    /**
     * Gets the value of the outSuspectCntryDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuspectCntryDateFrom() {
        return outSuspectCntryDateFrom;
    }

    /**
     * Sets the value of the outSuspectCntryDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuspectCntryDateFrom(XMLGregorianCalendar value) {
        this.outSuspectCntryDateFrom = value;
    }

    /**
     * Gets the value of the outSuspectCntryDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuspectCntryDateTo() {
        return outSuspectCntryDateTo;
    }

    /**
     * Sets the value of the outSuspectCntryDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuspectCntryDateTo(XMLGregorianCalendar value) {
        this.outSuspectCntryDateTo = value;
    }

    /**
     * Gets the value of the outSuspectCntryAlertAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCntryAlertAgency() {
        return outSuspectCntryAlertAgency;
    }

    /**
     * Sets the value of the outSuspectCntryAlertAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCntryAlertAgency(String value) {
        this.outSuspectCntryAlertAgency = value;
    }

    /**
     * Gets the value of the outSuspectCntryAlertReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCntryAlertReason() {
        return outSuspectCntryAlertReason;
    }

    /**
     * Sets the value of the outSuspectCntryAlertReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCntryAlertReason(String value) {
        this.outSuspectCntryAlertReason = value;
    }

    /**
     * Gets the value of the outSuspectCustSuspectCustId property.
     * 
     */
    public double getOutSuspectCustSuspectCustId() {
        return outSuspectCustSuspectCustId;
    }

    /**
     * Sets the value of the outSuspectCustSuspectCustId property.
     * 
     */
    public void setOutSuspectCustSuspectCustId(double value) {
        this.outSuspectCustSuspectCustId = value;
    }

    /**
     * Gets the value of the outSuspectCustSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustSurname() {
        return outSuspectCustSurname;
    }

    /**
     * Sets the value of the outSuspectCustSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustSurname(String value) {
        this.outSuspectCustSurname = value;
    }

    /**
     * Gets the value of the outSuspectCustFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustFirstName() {
        return outSuspectCustFirstName;
    }

    /**
     * Sets the value of the outSuspectCustFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustFirstName(String value) {
        this.outSuspectCustFirstName = value;
    }

    /**
     * Gets the value of the outSuspectCustFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustFatherName() {
        return outSuspectCustFatherName;
    }

    /**
     * Sets the value of the outSuspectCustFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustFatherName(String value) {
        this.outSuspectCustFatherName = value;
    }

    /**
     * Gets the value of the outSuspectCustCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustCustType() {
        return outSuspectCustCustType;
    }

    /**
     * Sets the value of the outSuspectCustCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustCustType(String value) {
        this.outSuspectCustCustType = value;
    }

    /**
     * Gets the value of the outSuspectCustDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuspectCustDateOfBirth() {
        return outSuspectCustDateOfBirth;
    }

    /**
     * Sets the value of the outSuspectCustDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuspectCustDateOfBirth(XMLGregorianCalendar value) {
        this.outSuspectCustDateOfBirth = value;
    }

    /**
     * Gets the value of the outSuspectCustIdType property.
     * 
     */
    public int getOutSuspectCustIdType() {
        return outSuspectCustIdType;
    }

    /**
     * Sets the value of the outSuspectCustIdType property.
     * 
     */
    public void setOutSuspectCustIdType(int value) {
        this.outSuspectCustIdType = value;
    }

    /**
     * Gets the value of the outSuspectCustIdNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustIdNum() {
        return outSuspectCustIdNum;
    }

    /**
     * Sets the value of the outSuspectCustIdNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustIdNum(String value) {
        this.outSuspectCustIdNum = value;
    }

    /**
     * Gets the value of the outSuspectCustAfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustAfm() {
        return outSuspectCustAfm;
    }

    /**
     * Sets the value of the outSuspectCustAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustAfm(String value) {
        this.outSuspectCustAfm = value;
    }

    /**
     * Gets the value of the outSuspectCustAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustAddress() {
        return outSuspectCustAddress;
    }

    /**
     * Sets the value of the outSuspectCustAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustAddress(String value) {
        this.outSuspectCustAddress = value;
    }

    /**
     * Gets the value of the outSuspectCustZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustZipCode() {
        return outSuspectCustZipCode;
    }

    /**
     * Sets the value of the outSuspectCustZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustZipCode(String value) {
        this.outSuspectCustZipCode = value;
    }

    /**
     * Gets the value of the outSuspectCustCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustCity() {
        return outSuspectCustCity;
    }

    /**
     * Sets the value of the outSuspectCustCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustCity(String value) {
        this.outSuspectCustCity = value;
    }

    /**
     * Gets the value of the outSuspectCustCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustCountry() {
        return outSuspectCustCountry;
    }

    /**
     * Sets the value of the outSuspectCustCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustCountry(String value) {
        this.outSuspectCustCountry = value;
    }

    /**
     * Gets the value of the outSuspectCustPhoneNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustPhoneNum() {
        return outSuspectCustPhoneNum;
    }

    /**
     * Sets the value of the outSuspectCustPhoneNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustPhoneNum(String value) {
        this.outSuspectCustPhoneNum = value;
    }

    /**
     * Gets the value of the outSuspectCustCustId property.
     * 
     */
    public int getOutSuspectCustCustId() {
        return outSuspectCustCustId;
    }

    /**
     * Sets the value of the outSuspectCustCustId property.
     * 
     */
    public void setOutSuspectCustCustId(int value) {
        this.outSuspectCustCustId = value;
    }

    /**
     * Gets the value of the outSuspectCustDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuspectCustDateFrom() {
        return outSuspectCustDateFrom;
    }

    /**
     * Sets the value of the outSuspectCustDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuspectCustDateFrom(XMLGregorianCalendar value) {
        this.outSuspectCustDateFrom = value;
    }

    /**
     * Gets the value of the outSuspectCustDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSuspectCustDateTo() {
        return outSuspectCustDateTo;
    }

    /**
     * Sets the value of the outSuspectCustDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSuspectCustDateTo(XMLGregorianCalendar value) {
        this.outSuspectCustDateTo = value;
    }

    /**
     * Gets the value of the outSuspectCustAlertAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustAlertAgency() {
        return outSuspectCustAlertAgency;
    }

    /**
     * Sets the value of the outSuspectCustAlertAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustAlertAgency(String value) {
        this.outSuspectCustAlertAgency = value;
    }

    /**
     * Gets the value of the outSuspectCustAlertReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustAlertReason() {
        return outSuspectCustAlertReason;
    }

    /**
     * Sets the value of the outSuspectCustAlertReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustAlertReason(String value) {
        this.outSuspectCustAlertReason = value;
    }

    /**
     * Gets the value of the outSuspectCustAlertReason2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspectCustAlertReason2() {
        return outSuspectCustAlertReason2;
    }

    /**
     * Sets the value of the outSuspectCustAlertReason2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspectCustAlertReason2(String value) {
        this.outSuspectCustAlertReason2 = value;
    }

    /**
     * Gets the value of the outSuspicStatusIefSuppliedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSuspicStatusIefSuppliedDescription() {
        return outSuspicStatusIefSuppliedDescription;
    }

    /**
     * Sets the value of the outSuspicStatusIefSuppliedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSuspicStatusIefSuppliedDescription(String value) {
        this.outSuspicStatusIefSuppliedDescription = value;
    }

}
