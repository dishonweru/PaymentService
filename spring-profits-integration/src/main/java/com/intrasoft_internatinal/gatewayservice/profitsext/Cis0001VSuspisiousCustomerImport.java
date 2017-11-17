
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Cis0001VSuspisiousCustomerImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cis0001VSuspisiousCustomerImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerMotherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerLatinFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerLatinSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFatherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMotherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddressCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddressCountryGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAddressCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBirthCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBirthCountryGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InBirthCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdCountryGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingAuthorizer1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingAuthorizer2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cis0001VSuspisiousCustomerImport", propOrder = {
    "inCustomerCustId",
    "inCustomerCDigit",
    "inCustomerShortName",
    "inCustomerSurname",
    "inCustomerAlertMsg",
    "inCustomerCustStatus",
    "inCustomerCustType",
    "inCustomerEntryStatus",
    "inCustomerFirstName",
    "inCustomerFatherName",
    "inCustomerExpireDate",
    "inCustomerMotherName",
    "inCustomerDateOfBirth",
    "inCustomerSwiftAddress",
    "inCustomerLatinFirstname",
    "inCustomerLatinSurname",
    "inCustomerFatherSurname",
    "inCustomerMotherSurname",
    "inCustomerSex",
    "inAddressCountryGenericDetailShortDescription",
    "inAddressCountryGenericDetailParameterType",
    "inAddressCountryGenericDetailDescription",
    "inBirthCountryGenericDetailShortDescription",
    "inBirthCountryGenericDetailParameterType",
    "inBirthCountryGenericDetailDescription",
    "inOtherAfmAfmNo",
    "inOtherIdTypeGenericDetailSerialNum",
    "inOtherIdIdNo",
    "inOtherIdCountryGenericDetailShortDescription",
    "inOtherIdCountryGenericDetailParameterType",
    "inOtherIdCountryGenericDetailDescription",
    "inMntRecordingAuthorizer1",
    "inMntRecordingAuthorizer2",
    "inMntRecordingPrftSystem",
    "inMntRecordingReversalFlag",
    "inMntRecordingTerminalNumber",
    "inMntRecordingTrxCode"
})
public class Cis0001VSuspisiousCustomerImport
    extends BaseImport
{

    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerShortName")
    protected String inCustomerShortName;
    @XmlElement(name = "InCustomerSurname")
    protected String inCustomerSurname;
    @XmlElement(name = "InCustomerAlertMsg")
    protected String inCustomerAlertMsg;
    @XmlElement(name = "InCustomerCustStatus")
    protected String inCustomerCustStatus;
    @XmlElement(name = "InCustomerCustType")
    protected String inCustomerCustType;
    @XmlElement(name = "InCustomerEntryStatus")
    protected String inCustomerEntryStatus;
    @XmlElement(name = "InCustomerFirstName")
    protected String inCustomerFirstName;
    @XmlElement(name = "InCustomerFatherName")
    protected String inCustomerFatherName;
    @XmlElement(name = "InCustomerExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerExpireDate;
    @XmlElement(name = "InCustomerMotherName")
    protected String inCustomerMotherName;
    @XmlElement(name = "InCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDateOfBirth;
    @XmlElement(name = "InCustomerSwiftAddress")
    protected String inCustomerSwiftAddress;
    @XmlElement(name = "InCustomerLatinFirstname")
    protected String inCustomerLatinFirstname;
    @XmlElement(name = "InCustomerLatinSurname")
    protected String inCustomerLatinSurname;
    @XmlElement(name = "InCustomerFatherSurname")
    protected String inCustomerFatherSurname;
    @XmlElement(name = "InCustomerMotherSurname")
    protected String inCustomerMotherSurname;
    @XmlElement(name = "InCustomerSex")
    protected String inCustomerSex;
    @XmlElement(name = "InAddressCountryGenericDetailShortDescription")
    protected String inAddressCountryGenericDetailShortDescription;
    @XmlElement(name = "InAddressCountryGenericDetailParameterType")
    protected String inAddressCountryGenericDetailParameterType;
    @XmlElement(name = "InAddressCountryGenericDetailDescription")
    protected String inAddressCountryGenericDetailDescription;
    @XmlElement(name = "InBirthCountryGenericDetailShortDescription")
    protected String inBirthCountryGenericDetailShortDescription;
    @XmlElement(name = "InBirthCountryGenericDetailParameterType")
    protected String inBirthCountryGenericDetailParameterType;
    @XmlElement(name = "InBirthCountryGenericDetailDescription")
    protected String inBirthCountryGenericDetailDescription;
    @XmlElement(name = "InOtherAfmAfmNo")
    protected String inOtherAfmAfmNo;
    @XmlElement(name = "InOtherIdTypeGenericDetailSerialNum")
    protected int inOtherIdTypeGenericDetailSerialNum;
    @XmlElement(name = "InOtherIdIdNo")
    protected String inOtherIdIdNo;
    @XmlElement(name = "InOtherIdCountryGenericDetailShortDescription")
    protected String inOtherIdCountryGenericDetailShortDescription;
    @XmlElement(name = "InOtherIdCountryGenericDetailParameterType")
    protected String inOtherIdCountryGenericDetailParameterType;
    @XmlElement(name = "InOtherIdCountryGenericDetailDescription")
    protected String inOtherIdCountryGenericDetailDescription;
    @XmlElement(name = "InMntRecordingAuthorizer1")
    protected String inMntRecordingAuthorizer1;
    @XmlElement(name = "InMntRecordingAuthorizer2")
    protected String inMntRecordingAuthorizer2;
    @XmlElement(name = "InMntRecordingPrftSystem")
    protected short inMntRecordingPrftSystem;
    @XmlElement(name = "InMntRecordingReversalFlag")
    protected String inMntRecordingReversalFlag;
    @XmlElement(name = "InMntRecordingTerminalNumber")
    protected String inMntRecordingTerminalNumber;
    @XmlElement(name = "InMntRecordingTrxCode")
    protected int inMntRecordingTrxCode;

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
     * Gets the value of the inCustomerCDigit property.
     * 
     */
    public short getInCustomerCDigit() {
        return inCustomerCDigit;
    }

    /**
     * Sets the value of the inCustomerCDigit property.
     * 
     */
    public void setInCustomerCDigit(short value) {
        this.inCustomerCDigit = value;
    }

    /**
     * Gets the value of the inCustomerShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerShortName() {
        return inCustomerShortName;
    }

    /**
     * Sets the value of the inCustomerShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerShortName(String value) {
        this.inCustomerShortName = value;
    }

    /**
     * Gets the value of the inCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSurname() {
        return inCustomerSurname;
    }

    /**
     * Sets the value of the inCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSurname(String value) {
        this.inCustomerSurname = value;
    }

    /**
     * Gets the value of the inCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerAlertMsg() {
        return inCustomerAlertMsg;
    }

    /**
     * Sets the value of the inCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerAlertMsg(String value) {
        this.inCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the inCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCustStatus() {
        return inCustomerCustStatus;
    }

    /**
     * Sets the value of the inCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCustStatus(String value) {
        this.inCustomerCustStatus = value;
    }

    /**
     * Gets the value of the inCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerCustType() {
        return inCustomerCustType;
    }

    /**
     * Sets the value of the inCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerCustType(String value) {
        this.inCustomerCustType = value;
    }

    /**
     * Gets the value of the inCustomerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEntryStatus() {
        return inCustomerEntryStatus;
    }

    /**
     * Sets the value of the inCustomerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEntryStatus(String value) {
        this.inCustomerEntryStatus = value;
    }

    /**
     * Gets the value of the inCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFirstName() {
        return inCustomerFirstName;
    }

    /**
     * Sets the value of the inCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFirstName(String value) {
        this.inCustomerFirstName = value;
    }

    /**
     * Gets the value of the inCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFatherName() {
        return inCustomerFatherName;
    }

    /**
     * Sets the value of the inCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFatherName(String value) {
        this.inCustomerFatherName = value;
    }

    /**
     * Gets the value of the inCustomerExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerExpireDate() {
        return inCustomerExpireDate;
    }

    /**
     * Sets the value of the inCustomerExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerExpireDate(XMLGregorianCalendar value) {
        this.inCustomerExpireDate = value;
    }

    /**
     * Gets the value of the inCustomerMotherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMotherName() {
        return inCustomerMotherName;
    }

    /**
     * Sets the value of the inCustomerMotherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMotherName(String value) {
        this.inCustomerMotherName = value;
    }

    /**
     * Gets the value of the inCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerDateOfBirth() {
        return inCustomerDateOfBirth;
    }

    /**
     * Sets the value of the inCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.inCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the inCustomerSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSwiftAddress() {
        return inCustomerSwiftAddress;
    }

    /**
     * Sets the value of the inCustomerSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSwiftAddress(String value) {
        this.inCustomerSwiftAddress = value;
    }

    /**
     * Gets the value of the inCustomerLatinFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerLatinFirstname() {
        return inCustomerLatinFirstname;
    }

    /**
     * Sets the value of the inCustomerLatinFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerLatinFirstname(String value) {
        this.inCustomerLatinFirstname = value;
    }

    /**
     * Gets the value of the inCustomerLatinSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerLatinSurname() {
        return inCustomerLatinSurname;
    }

    /**
     * Sets the value of the inCustomerLatinSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerLatinSurname(String value) {
        this.inCustomerLatinSurname = value;
    }

    /**
     * Gets the value of the inCustomerFatherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerFatherSurname() {
        return inCustomerFatherSurname;
    }

    /**
     * Sets the value of the inCustomerFatherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerFatherSurname(String value) {
        this.inCustomerFatherSurname = value;
    }

    /**
     * Gets the value of the inCustomerMotherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMotherSurname() {
        return inCustomerMotherSurname;
    }

    /**
     * Sets the value of the inCustomerMotherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMotherSurname(String value) {
        this.inCustomerMotherSurname = value;
    }

    /**
     * Gets the value of the inCustomerSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerSex() {
        return inCustomerSex;
    }

    /**
     * Sets the value of the inCustomerSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerSex(String value) {
        this.inCustomerSex = value;
    }

    /**
     * Gets the value of the inAddressCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAddressCountryGenericDetailShortDescription() {
        return inAddressCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inAddressCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAddressCountryGenericDetailShortDescription(String value) {
        this.inAddressCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inAddressCountryGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAddressCountryGenericDetailParameterType() {
        return inAddressCountryGenericDetailParameterType;
    }

    /**
     * Sets the value of the inAddressCountryGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAddressCountryGenericDetailParameterType(String value) {
        this.inAddressCountryGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inAddressCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAddressCountryGenericDetailDescription() {
        return inAddressCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inAddressCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAddressCountryGenericDetailDescription(String value) {
        this.inAddressCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inBirthCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBirthCountryGenericDetailShortDescription() {
        return inBirthCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inBirthCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBirthCountryGenericDetailShortDescription(String value) {
        this.inBirthCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inBirthCountryGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBirthCountryGenericDetailParameterType() {
        return inBirthCountryGenericDetailParameterType;
    }

    /**
     * Sets the value of the inBirthCountryGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBirthCountryGenericDetailParameterType(String value) {
        this.inBirthCountryGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inBirthCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInBirthCountryGenericDetailDescription() {
        return inBirthCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inBirthCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInBirthCountryGenericDetailDescription(String value) {
        this.inBirthCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherAfmAfmNo() {
        return inOtherAfmAfmNo;
    }

    /**
     * Sets the value of the inOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherAfmAfmNo(String value) {
        this.inOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the inOtherIdTypeGenericDetailSerialNum property.
     * 
     */
    public int getInOtherIdTypeGenericDetailSerialNum() {
        return inOtherIdTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inOtherIdTypeGenericDetailSerialNum property.
     * 
     */
    public void setInOtherIdTypeGenericDetailSerialNum(int value) {
        this.inOtherIdTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherIdIdNo() {
        return inOtherIdIdNo;
    }

    /**
     * Sets the value of the inOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherIdIdNo(String value) {
        this.inOtherIdIdNo = value;
    }

    /**
     * Gets the value of the inOtherIdCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherIdCountryGenericDetailShortDescription() {
        return inOtherIdCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inOtherIdCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherIdCountryGenericDetailShortDescription(String value) {
        this.inOtherIdCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inOtherIdCountryGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherIdCountryGenericDetailParameterType() {
        return inOtherIdCountryGenericDetailParameterType;
    }

    /**
     * Sets the value of the inOtherIdCountryGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherIdCountryGenericDetailParameterType(String value) {
        this.inOtherIdCountryGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inOtherIdCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInOtherIdCountryGenericDetailDescription() {
        return inOtherIdCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inOtherIdCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInOtherIdCountryGenericDetailDescription(String value) {
        this.inOtherIdCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inMntRecordingAuthorizer1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingAuthorizer1() {
        return inMntRecordingAuthorizer1;
    }

    /**
     * Sets the value of the inMntRecordingAuthorizer1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingAuthorizer1(String value) {
        this.inMntRecordingAuthorizer1 = value;
    }

    /**
     * Gets the value of the inMntRecordingAuthorizer2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingAuthorizer2() {
        return inMntRecordingAuthorizer2;
    }

    /**
     * Sets the value of the inMntRecordingAuthorizer2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingAuthorizer2(String value) {
        this.inMntRecordingAuthorizer2 = value;
    }

    /**
     * Gets the value of the inMntRecordingPrftSystem property.
     * 
     */
    public short getInMntRecordingPrftSystem() {
        return inMntRecordingPrftSystem;
    }

    /**
     * Sets the value of the inMntRecordingPrftSystem property.
     * 
     */
    public void setInMntRecordingPrftSystem(short value) {
        this.inMntRecordingPrftSystem = value;
    }

    /**
     * Gets the value of the inMntRecordingReversalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingReversalFlag() {
        return inMntRecordingReversalFlag;
    }

    /**
     * Sets the value of the inMntRecordingReversalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingReversalFlag(String value) {
        this.inMntRecordingReversalFlag = value;
    }

    /**
     * Gets the value of the inMntRecordingTerminalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInMntRecordingTerminalNumber() {
        return inMntRecordingTerminalNumber;
    }

    /**
     * Sets the value of the inMntRecordingTerminalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInMntRecordingTerminalNumber(String value) {
        this.inMntRecordingTerminalNumber = value;
    }

    /**
     * Gets the value of the inMntRecordingTrxCode property.
     * 
     */
    public int getInMntRecordingTrxCode() {
        return inMntRecordingTrxCode;
    }

    /**
     * Sets the value of the inMntRecordingTrxCode property.
     * 
     */
    public void setInMntRecordingTrxCode(int value) {
        this.inMntRecordingTrxCode = value;
    }

}
