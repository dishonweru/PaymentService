
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EXT8103V_RegistrationValidationImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EXT8103V_RegistrationValidationImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIdTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIdTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InIdTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTrxCommandIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpAccounts" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfEXT8103VInGrpAccountsItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EXT8103V_RegistrationValidationImport", propOrder = {
    "inCustAddressAddress1",
    "inCustAddressAddress2",
    "inCustAddressZipCode",
    "inCustomerDateOfBirth",
    "inCustomerEMail",
    "inCustomerFirstName",
    "inCustomerMiddleName",
    "inCustomerMobileTel",
    "inCustomerSurname",
    "inIdTypeGenericDetailDescription",
    "inIdTypeGenericDetailParameterType",
    "inIdTypeGenericDetailSerialNum",
    "inOtherAfmAfmNo",
    "inOtherIdIdNo",
    "inTrxCommandIefSuppliedCommand",
    "inGrpAccounts"
})
public class EXT8103VRegistrationValidationImport
    extends BaseImport
{

    @XmlElement(name = "InCustAddressAddress1")
    protected String inCustAddressAddress1;
    @XmlElement(name = "InCustAddressAddress2")
    protected String inCustAddressAddress2;
    @XmlElement(name = "InCustAddressZipCode")
    protected String inCustAddressZipCode;
    @XmlElement(name = "InCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDateOfBirth;
    @XmlElement(name = "InCustomerEMail")
    protected String inCustomerEMail;
    @XmlElement(name = "InCustomerFirstName")
    protected String inCustomerFirstName;
    @XmlElement(name = "InCustomerMiddleName")
    protected String inCustomerMiddleName;
    @XmlElement(name = "InCustomerMobileTel")
    protected String inCustomerMobileTel;
    @XmlElement(name = "InCustomerSurname")
    protected String inCustomerSurname;
    @XmlElement(name = "InIdTypeGenericDetailDescription")
    protected String inIdTypeGenericDetailDescription;
    @XmlElement(name = "InIdTypeGenericDetailParameterType")
    protected String inIdTypeGenericDetailParameterType;
    @XmlElement(name = "InIdTypeGenericDetailSerialNum")
    protected int inIdTypeGenericDetailSerialNum;
    @XmlElement(name = "InOtherAfmAfmNo")
    protected String inOtherAfmAfmNo;
    @XmlElement(name = "InOtherIdIdNo")
    protected String inOtherIdIdNo;
    @XmlElement(name = "InTrxCommandIefSuppliedCommand")
    protected String inTrxCommandIefSuppliedCommand;
    @XmlElement(name = "InGrpAccounts")
    protected ArrayOfEXT8103VInGrpAccountsItem inGrpAccounts;

    /**
     * Gets the value of the inCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress1() {
        return inCustAddressAddress1;
    }

    /**
     * Sets the value of the inCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress1(String value) {
        this.inCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress2() {
        return inCustAddressAddress2;
    }

    /**
     * Sets the value of the inCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress2(String value) {
        this.inCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the inCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressZipCode() {
        return inCustAddressZipCode;
    }

    /**
     * Sets the value of the inCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressZipCode(String value) {
        this.inCustAddressZipCode = value;
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
     * Gets the value of the inCustomerEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerEMail() {
        return inCustomerEMail;
    }

    /**
     * Sets the value of the inCustomerEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerEMail(String value) {
        this.inCustomerEMail = value;
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
     * Gets the value of the inCustomerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMiddleName() {
        return inCustomerMiddleName;
    }

    /**
     * Sets the value of the inCustomerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMiddleName(String value) {
        this.inCustomerMiddleName = value;
    }

    /**
     * Gets the value of the inCustomerMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerMobileTel() {
        return inCustomerMobileTel;
    }

    /**
     * Sets the value of the inCustomerMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerMobileTel(String value) {
        this.inCustomerMobileTel = value;
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
     * Gets the value of the inIdTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIdTypeGenericDetailDescription() {
        return inIdTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the inIdTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIdTypeGenericDetailDescription(String value) {
        this.inIdTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inIdTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIdTypeGenericDetailParameterType() {
        return inIdTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the inIdTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIdTypeGenericDetailParameterType(String value) {
        this.inIdTypeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inIdTypeGenericDetailSerialNum property.
     * 
     */
    public int getInIdTypeGenericDetailSerialNum() {
        return inIdTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inIdTypeGenericDetailSerialNum property.
     * 
     */
    public void setInIdTypeGenericDetailSerialNum(int value) {
        this.inIdTypeGenericDetailSerialNum = value;
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
     * Gets the value of the inTrxCommandIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTrxCommandIefSuppliedCommand() {
        return inTrxCommandIefSuppliedCommand;
    }

    /**
     * Sets the value of the inTrxCommandIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTrxCommandIefSuppliedCommand(String value) {
        this.inTrxCommandIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inGrpAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEXT8103VInGrpAccountsItem }
     *     
     */
    public ArrayOfEXT8103VInGrpAccountsItem getInGrpAccounts() {
        return inGrpAccounts;
    }

    /**
     * Sets the value of the inGrpAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEXT8103VInGrpAccountsItem }
     *     
     */
    public void setInGrpAccounts(ArrayOfEXT8103VInGrpAccountsItem value) {
        this.inGrpAccounts = value;
    }

}
