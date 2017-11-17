
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpListCustomer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpListCustomer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpListOutGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpListOutGrmCustomerCheckDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpListOutGrmListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrmCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrmCustomerMotherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrmCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpListOutGrmOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutTypeGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpListOutTypeGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrmOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrpCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrpOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrmCustomerSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrmCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrpCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrpCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrpCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrpCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpListOutGrpCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpListCustomer", propOrder = {
    "outGrpListOutGrmCustomerCustId",
    "outGrpListOutGrmCustomerCheckDigit",
    "outGrpListOutGrmListSetDescription",
    "outGrpListOutGrmCustomerFatherName",
    "outGrpListOutGrmCustomerMotherName",
    "outGrpListOutGrmCustomerDateOfBirth",
    "outGrpListOutGrmOtherIdIdNo",
    "outGrpListOutTypeGrmGenericDetailSerialNum",
    "outGrpListOutTypeGrmGenericDetailDescription",
    "outGrpListOutGrmOtherIdIssueAuthority",
    "outGrpListOutGrpCustAddressTelephone",
    "outGrpListOutGrpOtherAfmAfmNo",
    "outGrpListOutGrmCustomerSwiftAddress",
    "outGrpListOutGrmCustomerNonResident",
    "outGrpListOutGrmIefSuppliedSelectChar",
    "outGrpListOutGrpCustAddressAddress1",
    "outGrpListOutGrpCustAddressAddress2",
    "outGrpListOutGrpCustAddressZipCode",
    "outGrpListOutGrpCustAddressCity",
    "outGrpListOutGrpCountryGenericDetailDescription"
})
public class OutGrpListCustomer {

    @XmlElement(name = "OutGrpListOutGrmCustomerCustId")
    protected int outGrpListOutGrmCustomerCustId;
    @XmlElement(name = "OutGrpListOutGrmCustomerCheckDigit")
    protected short outGrpListOutGrmCustomerCheckDigit;
    @XmlElement(name = "OutGrpListOutGrmListSetDescription")
    protected String outGrpListOutGrmListSetDescription;
    @XmlElement(name = "OutGrpListOutGrmCustomerFatherName")
    protected String outGrpListOutGrmCustomerFatherName;
    @XmlElement(name = "OutGrpListOutGrmCustomerMotherName")
    protected String outGrpListOutGrmCustomerMotherName;
    @XmlElement(name = "OutGrpListOutGrmCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpListOutGrmCustomerDateOfBirth;
    @XmlElement(name = "OutGrpListOutGrmOtherIdIdNo")
    protected String outGrpListOutGrmOtherIdIdNo;
    @XmlElement(name = "OutGrpListOutTypeGrmGenericDetailSerialNum")
    protected int outGrpListOutTypeGrmGenericDetailSerialNum;
    @XmlElement(name = "OutGrpListOutTypeGrmGenericDetailDescription")
    protected String outGrpListOutTypeGrmGenericDetailDescription;
    @XmlElement(name = "OutGrpListOutGrmOtherIdIssueAuthority")
    protected String outGrpListOutGrmOtherIdIssueAuthority;
    @XmlElement(name = "OutGrpListOutGrpCustAddressTelephone")
    protected String outGrpListOutGrpCustAddressTelephone;
    @XmlElement(name = "OutGrpListOutGrpOtherAfmAfmNo")
    protected String outGrpListOutGrpOtherAfmAfmNo;
    @XmlElement(name = "OutGrpListOutGrmCustomerSwiftAddress")
    protected String outGrpListOutGrmCustomerSwiftAddress;
    @XmlElement(name = "OutGrpListOutGrmCustomerNonResident")
    protected String outGrpListOutGrmCustomerNonResident;
    @XmlElement(name = "OutGrpListOutGrmIefSuppliedSelectChar")
    protected String outGrpListOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpListOutGrpCustAddressAddress1")
    protected String outGrpListOutGrpCustAddressAddress1;
    @XmlElement(name = "OutGrpListOutGrpCustAddressAddress2")
    protected String outGrpListOutGrpCustAddressAddress2;
    @XmlElement(name = "OutGrpListOutGrpCustAddressZipCode")
    protected String outGrpListOutGrpCustAddressZipCode;
    @XmlElement(name = "OutGrpListOutGrpCustAddressCity")
    protected String outGrpListOutGrpCustAddressCity;
    @XmlElement(name = "OutGrpListOutGrpCountryGenericDetailDescription")
    protected String outGrpListOutGrpCountryGenericDetailDescription;

    /**
     * Gets the value of the outGrpListOutGrmCustomerCustId property.
     * 
     */
    public int getOutGrpListOutGrmCustomerCustId() {
        return outGrpListOutGrmCustomerCustId;
    }

    /**
     * Sets the value of the outGrpListOutGrmCustomerCustId property.
     * 
     */
    public void setOutGrpListOutGrmCustomerCustId(int value) {
        this.outGrpListOutGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmCustomerCheckDigit property.
     * 
     */
    public short getOutGrpListOutGrmCustomerCheckDigit() {
        return outGrpListOutGrmCustomerCheckDigit;
    }

    /**
     * Sets the value of the outGrpListOutGrmCustomerCheckDigit property.
     * 
     */
    public void setOutGrpListOutGrmCustomerCheckDigit(short value) {
        this.outGrpListOutGrmCustomerCheckDigit = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrmListSetDescription() {
        return outGrpListOutGrmListSetDescription;
    }

    /**
     * Sets the value of the outGrpListOutGrmListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrmListSetDescription(String value) {
        this.outGrpListOutGrmListSetDescription = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrmCustomerFatherName() {
        return outGrpListOutGrmCustomerFatherName;
    }

    /**
     * Sets the value of the outGrpListOutGrmCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrmCustomerFatherName(String value) {
        this.outGrpListOutGrmCustomerFatherName = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmCustomerMotherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrmCustomerMotherName() {
        return outGrpListOutGrmCustomerMotherName;
    }

    /**
     * Sets the value of the outGrpListOutGrmCustomerMotherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrmCustomerMotherName(String value) {
        this.outGrpListOutGrmCustomerMotherName = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpListOutGrmCustomerDateOfBirth() {
        return outGrpListOutGrmCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outGrpListOutGrmCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpListOutGrmCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outGrpListOutGrmCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrmOtherIdIdNo() {
        return outGrpListOutGrmOtherIdIdNo;
    }

    /**
     * Sets the value of the outGrpListOutGrmOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrmOtherIdIdNo(String value) {
        this.outGrpListOutGrmOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outGrpListOutTypeGrmGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpListOutTypeGrmGenericDetailSerialNum() {
        return outGrpListOutTypeGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpListOutTypeGrmGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpListOutTypeGrmGenericDetailSerialNum(int value) {
        this.outGrpListOutTypeGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpListOutTypeGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutTypeGrmGenericDetailDescription() {
        return outGrpListOutTypeGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpListOutTypeGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutTypeGrmGenericDetailDescription(String value) {
        this.outGrpListOutTypeGrmGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrmOtherIdIssueAuthority() {
        return outGrpListOutGrmOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the outGrpListOutGrmOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrmOtherIdIssueAuthority(String value) {
        this.outGrpListOutGrmOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the outGrpListOutGrpCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrpCustAddressTelephone() {
        return outGrpListOutGrpCustAddressTelephone;
    }

    /**
     * Sets the value of the outGrpListOutGrpCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrpCustAddressTelephone(String value) {
        this.outGrpListOutGrpCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outGrpListOutGrpOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrpOtherAfmAfmNo() {
        return outGrpListOutGrpOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outGrpListOutGrpOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrpOtherAfmAfmNo(String value) {
        this.outGrpListOutGrpOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmCustomerSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrmCustomerSwiftAddress() {
        return outGrpListOutGrmCustomerSwiftAddress;
    }

    /**
     * Sets the value of the outGrpListOutGrmCustomerSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrmCustomerSwiftAddress(String value) {
        this.outGrpListOutGrmCustomerSwiftAddress = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmCustomerNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrmCustomerNonResident() {
        return outGrpListOutGrmCustomerNonResident;
    }

    /**
     * Sets the value of the outGrpListOutGrmCustomerNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrmCustomerNonResident(String value) {
        this.outGrpListOutGrmCustomerNonResident = value;
    }

    /**
     * Gets the value of the outGrpListOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrmIefSuppliedSelectChar() {
        return outGrpListOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpListOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpListOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpListOutGrpCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrpCustAddressAddress1() {
        return outGrpListOutGrpCustAddressAddress1;
    }

    /**
     * Sets the value of the outGrpListOutGrpCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrpCustAddressAddress1(String value) {
        this.outGrpListOutGrpCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outGrpListOutGrpCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrpCustAddressAddress2() {
        return outGrpListOutGrpCustAddressAddress2;
    }

    /**
     * Sets the value of the outGrpListOutGrpCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrpCustAddressAddress2(String value) {
        this.outGrpListOutGrpCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outGrpListOutGrpCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrpCustAddressZipCode() {
        return outGrpListOutGrpCustAddressZipCode;
    }

    /**
     * Sets the value of the outGrpListOutGrpCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrpCustAddressZipCode(String value) {
        this.outGrpListOutGrpCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outGrpListOutGrpCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrpCustAddressCity() {
        return outGrpListOutGrpCustAddressCity;
    }

    /**
     * Sets the value of the outGrpListOutGrpCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrpCustAddressCity(String value) {
        this.outGrpListOutGrpCustAddressCity = value;
    }

    /**
     * Gets the value of the outGrpListOutGrpCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpListOutGrpCountryGenericDetailDescription() {
        return outGrpListOutGrpCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpListOutGrpCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpListOutGrpCountryGenericDetailDescription(String value) {
        this.outGrpListOutGrpCountryGenericDetailDescription = value;
    }

}
