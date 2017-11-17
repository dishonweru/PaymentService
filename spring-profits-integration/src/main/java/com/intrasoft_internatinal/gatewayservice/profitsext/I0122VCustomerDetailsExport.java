
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0122V_CustomerDetailsExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0122V_CustomerDetailsExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutSelectedCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerAlertMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerAmlStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerAttractionDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerBirthplace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerBlacklistedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCustomerCbsId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerCityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerCrmId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutSelectedCustomerCustOpenDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCustomerCustStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerDateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCustomerEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerEMail2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerEmployerAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCustomerFamilyMembers" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutSelectedCustomerFatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerFatherSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerIapplyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerLastUpdate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutSelectedCustomerLatinFirstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerLatinSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerMailInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerMobileTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerMobileTel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerMotherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerNoAfm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerNonResident" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerSex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerSwiftAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerTelephone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerTelex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedCustomerVipInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedIdIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedIdIefSuppliedCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedIdIefSuppliedIdentificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedIdIefSuppliedIdentityPassportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedIdIefSuppliedIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedNameListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSelectedTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutStatusIefSuppliedActionEntryDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0122V_CustomerDetailsExport", propOrder = {
    "outSelectedCustAddressAddress1",
    "outSelectedCustAddressAddress2",
    "outSelectedCustAddressCity",
    "outSelectedCustAddressTelephone",
    "outSelectedCustAddressZipCode",
    "outSelectedCustomerAlertMsg",
    "outSelectedCustomerAmlStatus",
    "outSelectedCustomerAttractionDetails",
    "outSelectedCustomerBirthplace",
    "outSelectedCustomerBlacklistedInd",
    "outSelectedCustomerCDigit",
    "outSelectedCustomerCbsId",
    "outSelectedCustomerCityOfBirth",
    "outSelectedCustomerCrmId",
    "outSelectedCustomerCustId",
    "outSelectedCustomerCustOpenDate",
    "outSelectedCustomerCustStatus",
    "outSelectedCustomerCustType",
    "outSelectedCustomerDateOfBirth",
    "outSelectedCustomerEMail",
    "outSelectedCustomerEMail2",
    "outSelectedCustomerEmployerAddress",
    "outSelectedCustomerEntryComments",
    "outSelectedCustomerEntryStatus",
    "outSelectedCustomerExpireDate",
    "outSelectedCustomerFamilyMembers",
    "outSelectedCustomerFatherName",
    "outSelectedCustomerFatherSurname",
    "outSelectedCustomerFirstName",
    "outSelectedCustomerIapplyId",
    "outSelectedCustomerInternetAddress",
    "outSelectedCustomerLastUpdate",
    "outSelectedCustomerLatinFirstname",
    "outSelectedCustomerLatinSurname",
    "outSelectedCustomerMailInd",
    "outSelectedCustomerMiddleName",
    "outSelectedCustomerMobileTel",
    "outSelectedCustomerMobileTel2",
    "outSelectedCustomerMotherName",
    "outSelectedCustomerNoAfm",
    "outSelectedCustomerNonResident",
    "outSelectedCustomerSex",
    "outSelectedCustomerSurname",
    "outSelectedCustomerSwiftAddress",
    "outSelectedCustomerTelephone1",
    "outSelectedCustomerTelex",
    "outSelectedCustomerTitle",
    "outSelectedCustomerVipInd",
    "outSelectedIdIefSuppliedChar1",
    "outSelectedIdIefSuppliedCountry",
    "outSelectedIdIefSuppliedIdentificationType",
    "outSelectedIdIefSuppliedIdentityPassportNo",
    "outSelectedIdIefSuppliedIssueAuthority",
    "outSelectedNameListSetDescription",
    "outSelectedOtherAfmAfmNo",
    "outSelectedTypeGenericDetailDescription",
    "outSelectedTypeGenericDetailSerialNum",
    "outStatusIefSuppliedActionEntryDesc"
})
public class I0122VCustomerDetailsExport
    extends BaseExport
{

    @XmlElement(name = "OutSelectedCustAddressAddress1")
    protected String outSelectedCustAddressAddress1;
    @XmlElement(name = "OutSelectedCustAddressAddress2")
    protected String outSelectedCustAddressAddress2;
    @XmlElement(name = "OutSelectedCustAddressCity")
    protected String outSelectedCustAddressCity;
    @XmlElement(name = "OutSelectedCustAddressTelephone")
    protected String outSelectedCustAddressTelephone;
    @XmlElement(name = "OutSelectedCustAddressZipCode")
    protected String outSelectedCustAddressZipCode;
    @XmlElement(name = "OutSelectedCustomerAlertMsg")
    protected String outSelectedCustomerAlertMsg;
    @XmlElement(name = "OutSelectedCustomerAmlStatus")
    protected String outSelectedCustomerAmlStatus;
    @XmlElement(name = "OutSelectedCustomerAttractionDetails")
    protected String outSelectedCustomerAttractionDetails;
    @XmlElement(name = "OutSelectedCustomerBirthplace")
    protected String outSelectedCustomerBirthplace;
    @XmlElement(name = "OutSelectedCustomerBlacklistedInd")
    protected String outSelectedCustomerBlacklistedInd;
    @XmlElement(name = "OutSelectedCustomerCDigit")
    protected short outSelectedCustomerCDigit;
    @XmlElement(name = "OutSelectedCustomerCbsId")
    protected String outSelectedCustomerCbsId;
    @XmlElement(name = "OutSelectedCustomerCityOfBirth")
    protected String outSelectedCustomerCityOfBirth;
    @XmlElement(name = "OutSelectedCustomerCrmId")
    protected String outSelectedCustomerCrmId;
    @XmlElement(name = "OutSelectedCustomerCustId")
    protected int outSelectedCustomerCustId;
    @XmlElement(name = "OutSelectedCustomerCustOpenDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCustomerCustOpenDate;
    @XmlElement(name = "OutSelectedCustomerCustStatus")
    protected String outSelectedCustomerCustStatus;
    @XmlElement(name = "OutSelectedCustomerCustType")
    protected String outSelectedCustomerCustType;
    @XmlElement(name = "OutSelectedCustomerDateOfBirth", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCustomerDateOfBirth;
    @XmlElement(name = "OutSelectedCustomerEMail")
    protected String outSelectedCustomerEMail;
    @XmlElement(name = "OutSelectedCustomerEMail2")
    protected String outSelectedCustomerEMail2;
    @XmlElement(name = "OutSelectedCustomerEmployerAddress")
    protected String outSelectedCustomerEmployerAddress;
    @XmlElement(name = "OutSelectedCustomerEntryComments")
    protected String outSelectedCustomerEntryComments;
    @XmlElement(name = "OutSelectedCustomerEntryStatus")
    protected String outSelectedCustomerEntryStatus;
    @XmlElement(name = "OutSelectedCustomerExpireDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCustomerExpireDate;
    @XmlElement(name = "OutSelectedCustomerFamilyMembers")
    protected short outSelectedCustomerFamilyMembers;
    @XmlElement(name = "OutSelectedCustomerFatherName")
    protected String outSelectedCustomerFatherName;
    @XmlElement(name = "OutSelectedCustomerFatherSurname")
    protected String outSelectedCustomerFatherSurname;
    @XmlElement(name = "OutSelectedCustomerFirstName")
    protected String outSelectedCustomerFirstName;
    @XmlElement(name = "OutSelectedCustomerIapplyId")
    protected String outSelectedCustomerIapplyId;
    @XmlElement(name = "OutSelectedCustomerInternetAddress")
    protected String outSelectedCustomerInternetAddress;
    @XmlElement(name = "OutSelectedCustomerLastUpdate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outSelectedCustomerLastUpdate;
    @XmlElement(name = "OutSelectedCustomerLatinFirstname")
    protected String outSelectedCustomerLatinFirstname;
    @XmlElement(name = "OutSelectedCustomerLatinSurname")
    protected String outSelectedCustomerLatinSurname;
    @XmlElement(name = "OutSelectedCustomerMailInd")
    protected String outSelectedCustomerMailInd;
    @XmlElement(name = "OutSelectedCustomerMiddleName")
    protected String outSelectedCustomerMiddleName;
    @XmlElement(name = "OutSelectedCustomerMobileTel")
    protected String outSelectedCustomerMobileTel;
    @XmlElement(name = "OutSelectedCustomerMobileTel2")
    protected String outSelectedCustomerMobileTel2;
    @XmlElement(name = "OutSelectedCustomerMotherName")
    protected String outSelectedCustomerMotherName;
    @XmlElement(name = "OutSelectedCustomerNoAfm")
    protected String outSelectedCustomerNoAfm;
    @XmlElement(name = "OutSelectedCustomerNonResident")
    protected String outSelectedCustomerNonResident;
    @XmlElement(name = "OutSelectedCustomerSex")
    protected String outSelectedCustomerSex;
    @XmlElement(name = "OutSelectedCustomerSurname")
    protected String outSelectedCustomerSurname;
    @XmlElement(name = "OutSelectedCustomerSwiftAddress")
    protected String outSelectedCustomerSwiftAddress;
    @XmlElement(name = "OutSelectedCustomerTelephone1")
    protected String outSelectedCustomerTelephone1;
    @XmlElement(name = "OutSelectedCustomerTelex")
    protected String outSelectedCustomerTelex;
    @XmlElement(name = "OutSelectedCustomerTitle")
    protected String outSelectedCustomerTitle;
    @XmlElement(name = "OutSelectedCustomerVipInd")
    protected String outSelectedCustomerVipInd;
    @XmlElement(name = "OutSelectedIdIefSuppliedChar1")
    protected String outSelectedIdIefSuppliedChar1;
    @XmlElement(name = "OutSelectedIdIefSuppliedCountry")
    protected String outSelectedIdIefSuppliedCountry;
    @XmlElement(name = "OutSelectedIdIefSuppliedIdentificationType")
    protected String outSelectedIdIefSuppliedIdentificationType;
    @XmlElement(name = "OutSelectedIdIefSuppliedIdentityPassportNo")
    protected String outSelectedIdIefSuppliedIdentityPassportNo;
    @XmlElement(name = "OutSelectedIdIefSuppliedIssueAuthority")
    protected String outSelectedIdIefSuppliedIssueAuthority;
    @XmlElement(name = "OutSelectedNameListSetDescription")
    protected String outSelectedNameListSetDescription;
    @XmlElement(name = "OutSelectedOtherAfmAfmNo")
    protected String outSelectedOtherAfmAfmNo;
    @XmlElement(name = "OutSelectedTypeGenericDetailDescription")
    protected String outSelectedTypeGenericDetailDescription;
    @XmlElement(name = "OutSelectedTypeGenericDetailSerialNum")
    protected int outSelectedTypeGenericDetailSerialNum;
    @XmlElement(name = "OutStatusIefSuppliedActionEntryDesc")
    protected String outStatusIefSuppliedActionEntryDesc;

    /**
     * Gets the value of the outSelectedCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustAddressAddress1() {
        return outSelectedCustAddressAddress1;
    }

    /**
     * Sets the value of the outSelectedCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustAddressAddress1(String value) {
        this.outSelectedCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outSelectedCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustAddressAddress2() {
        return outSelectedCustAddressAddress2;
    }

    /**
     * Sets the value of the outSelectedCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustAddressAddress2(String value) {
        this.outSelectedCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outSelectedCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustAddressCity() {
        return outSelectedCustAddressCity;
    }

    /**
     * Sets the value of the outSelectedCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustAddressCity(String value) {
        this.outSelectedCustAddressCity = value;
    }

    /**
     * Gets the value of the outSelectedCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustAddressTelephone() {
        return outSelectedCustAddressTelephone;
    }

    /**
     * Sets the value of the outSelectedCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustAddressTelephone(String value) {
        this.outSelectedCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outSelectedCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustAddressZipCode() {
        return outSelectedCustAddressZipCode;
    }

    /**
     * Sets the value of the outSelectedCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustAddressZipCode(String value) {
        this.outSelectedCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outSelectedCustomerAlertMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerAlertMsg() {
        return outSelectedCustomerAlertMsg;
    }

    /**
     * Sets the value of the outSelectedCustomerAlertMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerAlertMsg(String value) {
        this.outSelectedCustomerAlertMsg = value;
    }

    /**
     * Gets the value of the outSelectedCustomerAmlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerAmlStatus() {
        return outSelectedCustomerAmlStatus;
    }

    /**
     * Sets the value of the outSelectedCustomerAmlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerAmlStatus(String value) {
        this.outSelectedCustomerAmlStatus = value;
    }

    /**
     * Gets the value of the outSelectedCustomerAttractionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerAttractionDetails() {
        return outSelectedCustomerAttractionDetails;
    }

    /**
     * Sets the value of the outSelectedCustomerAttractionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerAttractionDetails(String value) {
        this.outSelectedCustomerAttractionDetails = value;
    }

    /**
     * Gets the value of the outSelectedCustomerBirthplace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerBirthplace() {
        return outSelectedCustomerBirthplace;
    }

    /**
     * Sets the value of the outSelectedCustomerBirthplace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerBirthplace(String value) {
        this.outSelectedCustomerBirthplace = value;
    }

    /**
     * Gets the value of the outSelectedCustomerBlacklistedInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerBlacklistedInd() {
        return outSelectedCustomerBlacklistedInd;
    }

    /**
     * Sets the value of the outSelectedCustomerBlacklistedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerBlacklistedInd(String value) {
        this.outSelectedCustomerBlacklistedInd = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCDigit property.
     * 
     */
    public short getOutSelectedCustomerCDigit() {
        return outSelectedCustomerCDigit;
    }

    /**
     * Sets the value of the outSelectedCustomerCDigit property.
     * 
     */
    public void setOutSelectedCustomerCDigit(short value) {
        this.outSelectedCustomerCDigit = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCbsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerCbsId() {
        return outSelectedCustomerCbsId;
    }

    /**
     * Sets the value of the outSelectedCustomerCbsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerCbsId(String value) {
        this.outSelectedCustomerCbsId = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCityOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerCityOfBirth() {
        return outSelectedCustomerCityOfBirth;
    }

    /**
     * Sets the value of the outSelectedCustomerCityOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerCityOfBirth(String value) {
        this.outSelectedCustomerCityOfBirth = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCrmId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerCrmId() {
        return outSelectedCustomerCrmId;
    }

    /**
     * Sets the value of the outSelectedCustomerCrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerCrmId(String value) {
        this.outSelectedCustomerCrmId = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCustId property.
     * 
     */
    public int getOutSelectedCustomerCustId() {
        return outSelectedCustomerCustId;
    }

    /**
     * Sets the value of the outSelectedCustomerCustId property.
     * 
     */
    public void setOutSelectedCustomerCustId(int value) {
        this.outSelectedCustomerCustId = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCustOpenDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCustomerCustOpenDate() {
        return outSelectedCustomerCustOpenDate;
    }

    /**
     * Sets the value of the outSelectedCustomerCustOpenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCustomerCustOpenDate(XMLGregorianCalendar value) {
        this.outSelectedCustomerCustOpenDate = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCustStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerCustStatus() {
        return outSelectedCustomerCustStatus;
    }

    /**
     * Sets the value of the outSelectedCustomerCustStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerCustStatus(String value) {
        this.outSelectedCustomerCustStatus = value;
    }

    /**
     * Gets the value of the outSelectedCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerCustType() {
        return outSelectedCustomerCustType;
    }

    /**
     * Sets the value of the outSelectedCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerCustType(String value) {
        this.outSelectedCustomerCustType = value;
    }

    /**
     * Gets the value of the outSelectedCustomerDateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCustomerDateOfBirth() {
        return outSelectedCustomerDateOfBirth;
    }

    /**
     * Sets the value of the outSelectedCustomerDateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCustomerDateOfBirth(XMLGregorianCalendar value) {
        this.outSelectedCustomerDateOfBirth = value;
    }

    /**
     * Gets the value of the outSelectedCustomerEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerEMail() {
        return outSelectedCustomerEMail;
    }

    /**
     * Sets the value of the outSelectedCustomerEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerEMail(String value) {
        this.outSelectedCustomerEMail = value;
    }

    /**
     * Gets the value of the outSelectedCustomerEMail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerEMail2() {
        return outSelectedCustomerEMail2;
    }

    /**
     * Sets the value of the outSelectedCustomerEMail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerEMail2(String value) {
        this.outSelectedCustomerEMail2 = value;
    }

    /**
     * Gets the value of the outSelectedCustomerEmployerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerEmployerAddress() {
        return outSelectedCustomerEmployerAddress;
    }

    /**
     * Sets the value of the outSelectedCustomerEmployerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerEmployerAddress(String value) {
        this.outSelectedCustomerEmployerAddress = value;
    }

    /**
     * Gets the value of the outSelectedCustomerEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerEntryComments() {
        return outSelectedCustomerEntryComments;
    }

    /**
     * Sets the value of the outSelectedCustomerEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerEntryComments(String value) {
        this.outSelectedCustomerEntryComments = value;
    }

    /**
     * Gets the value of the outSelectedCustomerEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerEntryStatus() {
        return outSelectedCustomerEntryStatus;
    }

    /**
     * Sets the value of the outSelectedCustomerEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerEntryStatus(String value) {
        this.outSelectedCustomerEntryStatus = value;
    }

    /**
     * Gets the value of the outSelectedCustomerExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCustomerExpireDate() {
        return outSelectedCustomerExpireDate;
    }

    /**
     * Sets the value of the outSelectedCustomerExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCustomerExpireDate(XMLGregorianCalendar value) {
        this.outSelectedCustomerExpireDate = value;
    }

    /**
     * Gets the value of the outSelectedCustomerFamilyMembers property.
     * 
     */
    public short getOutSelectedCustomerFamilyMembers() {
        return outSelectedCustomerFamilyMembers;
    }

    /**
     * Sets the value of the outSelectedCustomerFamilyMembers property.
     * 
     */
    public void setOutSelectedCustomerFamilyMembers(short value) {
        this.outSelectedCustomerFamilyMembers = value;
    }

    /**
     * Gets the value of the outSelectedCustomerFatherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerFatherName() {
        return outSelectedCustomerFatherName;
    }

    /**
     * Sets the value of the outSelectedCustomerFatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerFatherName(String value) {
        this.outSelectedCustomerFatherName = value;
    }

    /**
     * Gets the value of the outSelectedCustomerFatherSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerFatherSurname() {
        return outSelectedCustomerFatherSurname;
    }

    /**
     * Sets the value of the outSelectedCustomerFatherSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerFatherSurname(String value) {
        this.outSelectedCustomerFatherSurname = value;
    }

    /**
     * Gets the value of the outSelectedCustomerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerFirstName() {
        return outSelectedCustomerFirstName;
    }

    /**
     * Sets the value of the outSelectedCustomerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerFirstName(String value) {
        this.outSelectedCustomerFirstName = value;
    }

    /**
     * Gets the value of the outSelectedCustomerIapplyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerIapplyId() {
        return outSelectedCustomerIapplyId;
    }

    /**
     * Sets the value of the outSelectedCustomerIapplyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerIapplyId(String value) {
        this.outSelectedCustomerIapplyId = value;
    }

    /**
     * Gets the value of the outSelectedCustomerInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerInternetAddress() {
        return outSelectedCustomerInternetAddress;
    }

    /**
     * Sets the value of the outSelectedCustomerInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerInternetAddress(String value) {
        this.outSelectedCustomerInternetAddress = value;
    }

    /**
     * Gets the value of the outSelectedCustomerLastUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutSelectedCustomerLastUpdate() {
        return outSelectedCustomerLastUpdate;
    }

    /**
     * Sets the value of the outSelectedCustomerLastUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutSelectedCustomerLastUpdate(XMLGregorianCalendar value) {
        this.outSelectedCustomerLastUpdate = value;
    }

    /**
     * Gets the value of the outSelectedCustomerLatinFirstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerLatinFirstname() {
        return outSelectedCustomerLatinFirstname;
    }

    /**
     * Sets the value of the outSelectedCustomerLatinFirstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerLatinFirstname(String value) {
        this.outSelectedCustomerLatinFirstname = value;
    }

    /**
     * Gets the value of the outSelectedCustomerLatinSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerLatinSurname() {
        return outSelectedCustomerLatinSurname;
    }

    /**
     * Sets the value of the outSelectedCustomerLatinSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerLatinSurname(String value) {
        this.outSelectedCustomerLatinSurname = value;
    }

    /**
     * Gets the value of the outSelectedCustomerMailInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerMailInd() {
        return outSelectedCustomerMailInd;
    }

    /**
     * Sets the value of the outSelectedCustomerMailInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerMailInd(String value) {
        this.outSelectedCustomerMailInd = value;
    }

    /**
     * Gets the value of the outSelectedCustomerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerMiddleName() {
        return outSelectedCustomerMiddleName;
    }

    /**
     * Sets the value of the outSelectedCustomerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerMiddleName(String value) {
        this.outSelectedCustomerMiddleName = value;
    }

    /**
     * Gets the value of the outSelectedCustomerMobileTel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerMobileTel() {
        return outSelectedCustomerMobileTel;
    }

    /**
     * Sets the value of the outSelectedCustomerMobileTel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerMobileTel(String value) {
        this.outSelectedCustomerMobileTel = value;
    }

    /**
     * Gets the value of the outSelectedCustomerMobileTel2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerMobileTel2() {
        return outSelectedCustomerMobileTel2;
    }

    /**
     * Sets the value of the outSelectedCustomerMobileTel2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerMobileTel2(String value) {
        this.outSelectedCustomerMobileTel2 = value;
    }

    /**
     * Gets the value of the outSelectedCustomerMotherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerMotherName() {
        return outSelectedCustomerMotherName;
    }

    /**
     * Sets the value of the outSelectedCustomerMotherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerMotherName(String value) {
        this.outSelectedCustomerMotherName = value;
    }

    /**
     * Gets the value of the outSelectedCustomerNoAfm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerNoAfm() {
        return outSelectedCustomerNoAfm;
    }

    /**
     * Sets the value of the outSelectedCustomerNoAfm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerNoAfm(String value) {
        this.outSelectedCustomerNoAfm = value;
    }

    /**
     * Gets the value of the outSelectedCustomerNonResident property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerNonResident() {
        return outSelectedCustomerNonResident;
    }

    /**
     * Sets the value of the outSelectedCustomerNonResident property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerNonResident(String value) {
        this.outSelectedCustomerNonResident = value;
    }

    /**
     * Gets the value of the outSelectedCustomerSex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerSex() {
        return outSelectedCustomerSex;
    }

    /**
     * Sets the value of the outSelectedCustomerSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerSex(String value) {
        this.outSelectedCustomerSex = value;
    }

    /**
     * Gets the value of the outSelectedCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerSurname() {
        return outSelectedCustomerSurname;
    }

    /**
     * Sets the value of the outSelectedCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerSurname(String value) {
        this.outSelectedCustomerSurname = value;
    }

    /**
     * Gets the value of the outSelectedCustomerSwiftAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerSwiftAddress() {
        return outSelectedCustomerSwiftAddress;
    }

    /**
     * Sets the value of the outSelectedCustomerSwiftAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerSwiftAddress(String value) {
        this.outSelectedCustomerSwiftAddress = value;
    }

    /**
     * Gets the value of the outSelectedCustomerTelephone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerTelephone1() {
        return outSelectedCustomerTelephone1;
    }

    /**
     * Sets the value of the outSelectedCustomerTelephone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerTelephone1(String value) {
        this.outSelectedCustomerTelephone1 = value;
    }

    /**
     * Gets the value of the outSelectedCustomerTelex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerTelex() {
        return outSelectedCustomerTelex;
    }

    /**
     * Sets the value of the outSelectedCustomerTelex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerTelex(String value) {
        this.outSelectedCustomerTelex = value;
    }

    /**
     * Gets the value of the outSelectedCustomerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerTitle() {
        return outSelectedCustomerTitle;
    }

    /**
     * Sets the value of the outSelectedCustomerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerTitle(String value) {
        this.outSelectedCustomerTitle = value;
    }

    /**
     * Gets the value of the outSelectedCustomerVipInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedCustomerVipInd() {
        return outSelectedCustomerVipInd;
    }

    /**
     * Sets the value of the outSelectedCustomerVipInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedCustomerVipInd(String value) {
        this.outSelectedCustomerVipInd = value;
    }

    /**
     * Gets the value of the outSelectedIdIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedIdIefSuppliedChar1() {
        return outSelectedIdIefSuppliedChar1;
    }

    /**
     * Sets the value of the outSelectedIdIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedIdIefSuppliedChar1(String value) {
        this.outSelectedIdIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the outSelectedIdIefSuppliedCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedIdIefSuppliedCountry() {
        return outSelectedIdIefSuppliedCountry;
    }

    /**
     * Sets the value of the outSelectedIdIefSuppliedCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedIdIefSuppliedCountry(String value) {
        this.outSelectedIdIefSuppliedCountry = value;
    }

    /**
     * Gets the value of the outSelectedIdIefSuppliedIdentificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedIdIefSuppliedIdentificationType() {
        return outSelectedIdIefSuppliedIdentificationType;
    }

    /**
     * Sets the value of the outSelectedIdIefSuppliedIdentificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedIdIefSuppliedIdentificationType(String value) {
        this.outSelectedIdIefSuppliedIdentificationType = value;
    }

    /**
     * Gets the value of the outSelectedIdIefSuppliedIdentityPassportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedIdIefSuppliedIdentityPassportNo() {
        return outSelectedIdIefSuppliedIdentityPassportNo;
    }

    /**
     * Sets the value of the outSelectedIdIefSuppliedIdentityPassportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedIdIefSuppliedIdentityPassportNo(String value) {
        this.outSelectedIdIefSuppliedIdentityPassportNo = value;
    }

    /**
     * Gets the value of the outSelectedIdIefSuppliedIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedIdIefSuppliedIssueAuthority() {
        return outSelectedIdIefSuppliedIssueAuthority;
    }

    /**
     * Sets the value of the outSelectedIdIefSuppliedIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedIdIefSuppliedIssueAuthority(String value) {
        this.outSelectedIdIefSuppliedIssueAuthority = value;
    }

    /**
     * Gets the value of the outSelectedNameListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedNameListSetDescription() {
        return outSelectedNameListSetDescription;
    }

    /**
     * Sets the value of the outSelectedNameListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedNameListSetDescription(String value) {
        this.outSelectedNameListSetDescription = value;
    }

    /**
     * Gets the value of the outSelectedOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedOtherAfmAfmNo() {
        return outSelectedOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outSelectedOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedOtherAfmAfmNo(String value) {
        this.outSelectedOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outSelectedTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSelectedTypeGenericDetailDescription() {
        return outSelectedTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outSelectedTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSelectedTypeGenericDetailDescription(String value) {
        this.outSelectedTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outSelectedTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutSelectedTypeGenericDetailSerialNum() {
        return outSelectedTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outSelectedTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutSelectedTypeGenericDetailSerialNum(int value) {
        this.outSelectedTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutStatusIefSuppliedActionEntryDesc() {
        return outStatusIefSuppliedActionEntryDesc;
    }

    /**
     * Sets the value of the outStatusIefSuppliedActionEntryDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutStatusIefSuppliedActionEntryDesc(String value) {
        this.outStatusIefSuppliedActionEntryDesc = value;
    }

}
