
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0160VCustomerDocumentManagementImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0160VCustomerDocumentManagementImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="Command" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAllowedGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAllowedGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InAllowedGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDocumentsCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerDocumentsEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDocumentsFkGdRqtp1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerDocumentsFkGdRqtp2" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerDocumentsFkGdRqtp3" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerDocumentsFkGhRqtp1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDocumentsFkGhRqtp2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDocumentsFkGhRqtp3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDocumentsGivenFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDocumentsInsertDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerDocumentsInsertUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerDocumentsInsertUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDocumentsLinkedFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDocumentsLinkedFileSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCustomerDocumentsScannedFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerDocumentsScannedImageId" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InCustomerDocumentsTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerDocumentsUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustomerDocumentsUpdateUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerDocumentsUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocsGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocsGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InDocsGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InPrftTransactionIdTransact" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountAccStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountAccountCd" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InSelectedProfitsAccountAgrMembershipSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountAgrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountAgrUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountAgrYear" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountDepAccNumber" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedProfitsAccountDepOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountLgAccSn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="InSelectedProfitsAccountLgOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountLimitCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountLnsOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountLnsSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountLnsType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountMonotoringUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountMovementCurrency" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountPrftSystem" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InSelectedProfitsAccountProductId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountTrOpenUnit" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountTrSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InSelectedProfitsAccountTrType" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTypeGenericDetailParameterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InUnitClearingHouseFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0160VCustomerDocumentManagementImport", propOrder = {
    "command",
    "inAllowedGenericDetailDescription",
    "inAllowedGenericDetailParameterType",
    "inAllowedGenericDetailSerialNum",
    "inCustomerCDigit",
    "inCustomerCustId",
    "inCustomerCustType",
    "inCustomerDocumentsCustId",
    "inCustomerDocumentsEntryComments",
    "inCustomerDocumentsFkGdRqtp1",
    "inCustomerDocumentsFkGdRqtp2",
    "inCustomerDocumentsFkGdRqtp3",
    "inCustomerDocumentsFkGhRqtp1",
    "inCustomerDocumentsFkGhRqtp2",
    "inCustomerDocumentsFkGhRqtp3",
    "inCustomerDocumentsGivenFlag",
    "inCustomerDocumentsInsertDate",
    "inCustomerDocumentsInsertUnit",
    "inCustomerDocumentsInsertUser",
    "inCustomerDocumentsLinkedFile",
    "inCustomerDocumentsLinkedFileSn",
    "inCustomerDocumentsScannedFile",
    "inCustomerDocumentsScannedImageId",
    "inCustomerDocumentsTmstamp",
    "inCustomerDocumentsUpdateDate",
    "inCustomerDocumentsUpdateUnit",
    "inCustomerDocumentsUpdateUser",
    "inDocsGenericDetailDescription",
    "inDocsGenericDetailParameterType",
    "inDocsGenericDetailSerialNum",
    "inPrftTransactionIdTransact",
    "inSelectedProfitsAccountAccStatus",
    "inSelectedProfitsAccountAccountCd",
    "inSelectedProfitsAccountAccountNumber",
    "inSelectedProfitsAccountAgrMembershipSn",
    "inSelectedProfitsAccountAgrSn",
    "inSelectedProfitsAccountAgrUnit",
    "inSelectedProfitsAccountAgrYear",
    "inSelectedProfitsAccountCDigit",
    "inSelectedProfitsAccountCustId",
    "inSelectedProfitsAccountDepAccNumber",
    "inSelectedProfitsAccountDepOpenUnit",
    "inSelectedProfitsAccountLgAccSn",
    "inSelectedProfitsAccountLgOpenUnit",
    "inSelectedProfitsAccountLimitCurrency",
    "inSelectedProfitsAccountLnsOpenUnit",
    "inSelectedProfitsAccountLnsSn",
    "inSelectedProfitsAccountLnsType",
    "inSelectedProfitsAccountMonotoringUnit",
    "inSelectedProfitsAccountMovementCurrency",
    "inSelectedProfitsAccountPrftSystem",
    "inSelectedProfitsAccountProductId",
    "inSelectedProfitsAccountTrOpenUnit",
    "inSelectedProfitsAccountTrSn",
    "inSelectedProfitsAccountTrType",
    "inTypeGenericDetailDescription",
    "inTypeGenericDetailParameterType",
    "inTypeGenericDetailSerialNum",
    "inUnitClearingHouseFlag"
})
public class I0160VCustomerDocumentManagementImport
    extends BaseImport
{

    @XmlElement(name = "Command")
    protected String command;
    @XmlElement(name = "InAllowedGenericDetailDescription")
    protected String inAllowedGenericDetailDescription;
    @XmlElement(name = "InAllowedGenericDetailParameterType")
    protected String inAllowedGenericDetailParameterType;
    @XmlElement(name = "InAllowedGenericDetailSerialNum")
    protected int inAllowedGenericDetailSerialNum;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerCustType")
    protected String inCustomerCustType;
    @XmlElement(name = "InCustomerDocumentsCustId")
    protected int inCustomerDocumentsCustId;
    @XmlElement(name = "InCustomerDocumentsEntryComments")
    protected String inCustomerDocumentsEntryComments;
    @XmlElement(name = "InCustomerDocumentsFkGdRqtp1")
    protected int inCustomerDocumentsFkGdRqtp1;
    @XmlElement(name = "InCustomerDocumentsFkGdRqtp2")
    protected int inCustomerDocumentsFkGdRqtp2;
    @XmlElement(name = "InCustomerDocumentsFkGdRqtp3")
    protected int inCustomerDocumentsFkGdRqtp3;
    @XmlElement(name = "InCustomerDocumentsFkGhRqtp1")
    protected String inCustomerDocumentsFkGhRqtp1;
    @XmlElement(name = "InCustomerDocumentsFkGhRqtp2")
    protected String inCustomerDocumentsFkGhRqtp2;
    @XmlElement(name = "InCustomerDocumentsFkGhRqtp3")
    protected String inCustomerDocumentsFkGhRqtp3;
    @XmlElement(name = "InCustomerDocumentsGivenFlag")
    protected String inCustomerDocumentsGivenFlag;
    @XmlElement(name = "InCustomerDocumentsInsertDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDocumentsInsertDate;
    @XmlElement(name = "InCustomerDocumentsInsertUnit")
    protected int inCustomerDocumentsInsertUnit;
    @XmlElement(name = "InCustomerDocumentsInsertUser")
    protected String inCustomerDocumentsInsertUser;
    @XmlElement(name = "InCustomerDocumentsLinkedFile")
    protected String inCustomerDocumentsLinkedFile;
    @XmlElement(name = "InCustomerDocumentsLinkedFileSn")
    protected double inCustomerDocumentsLinkedFileSn;
    @XmlElement(name = "InCustomerDocumentsScannedFile")
    protected String inCustomerDocumentsScannedFile;
    @XmlElement(name = "InCustomerDocumentsScannedImageId")
    protected double inCustomerDocumentsScannedImageId;
    @XmlElement(name = "InCustomerDocumentsTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDocumentsTmstamp;
    @XmlElement(name = "InCustomerDocumentsUpdateDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustomerDocumentsUpdateDate;
    @XmlElement(name = "InCustomerDocumentsUpdateUnit")
    protected int inCustomerDocumentsUpdateUnit;
    @XmlElement(name = "InCustomerDocumentsUpdateUser")
    protected String inCustomerDocumentsUpdateUser;
    @XmlElement(name = "InDocsGenericDetailDescription")
    protected String inDocsGenericDetailDescription;
    @XmlElement(name = "InDocsGenericDetailParameterType")
    protected String inDocsGenericDetailParameterType;
    @XmlElement(name = "InDocsGenericDetailSerialNum")
    protected int inDocsGenericDetailSerialNum;
    @XmlElement(name = "InPrftTransactionIdTransact")
    protected int inPrftTransactionIdTransact;
    @XmlElement(name = "InSelectedProfitsAccountAccStatus")
    protected String inSelectedProfitsAccountAccStatus;
    @XmlElement(name = "InSelectedProfitsAccountAccountCd")
    protected short inSelectedProfitsAccountAccountCd;
    @XmlElement(name = "InSelectedProfitsAccountAccountNumber")
    protected String inSelectedProfitsAccountAccountNumber;
    @XmlElement(name = "InSelectedProfitsAccountAgrMembershipSn")
    protected int inSelectedProfitsAccountAgrMembershipSn;
    @XmlElement(name = "InSelectedProfitsAccountAgrSn")
    protected int inSelectedProfitsAccountAgrSn;
    @XmlElement(name = "InSelectedProfitsAccountAgrUnit")
    protected int inSelectedProfitsAccountAgrUnit;
    @XmlElement(name = "InSelectedProfitsAccountAgrYear")
    protected short inSelectedProfitsAccountAgrYear;
    @XmlElement(name = "InSelectedProfitsAccountCDigit")
    protected short inSelectedProfitsAccountCDigit;
    @XmlElement(name = "InSelectedProfitsAccountCustId")
    protected int inSelectedProfitsAccountCustId;
    @XmlElement(name = "InSelectedProfitsAccountDepAccNumber")
    protected double inSelectedProfitsAccountDepAccNumber;
    @XmlElement(name = "InSelectedProfitsAccountDepOpenUnit")
    protected int inSelectedProfitsAccountDepOpenUnit;
    @XmlElement(name = "InSelectedProfitsAccountLgAccSn")
    protected double inSelectedProfitsAccountLgAccSn;
    @XmlElement(name = "InSelectedProfitsAccountLgOpenUnit")
    protected int inSelectedProfitsAccountLgOpenUnit;
    @XmlElement(name = "InSelectedProfitsAccountLimitCurrency")
    protected int inSelectedProfitsAccountLimitCurrency;
    @XmlElement(name = "InSelectedProfitsAccountLnsOpenUnit")
    protected int inSelectedProfitsAccountLnsOpenUnit;
    @XmlElement(name = "InSelectedProfitsAccountLnsSn")
    protected int inSelectedProfitsAccountLnsSn;
    @XmlElement(name = "InSelectedProfitsAccountLnsType")
    protected short inSelectedProfitsAccountLnsType;
    @XmlElement(name = "InSelectedProfitsAccountMonotoringUnit")
    protected int inSelectedProfitsAccountMonotoringUnit;
    @XmlElement(name = "InSelectedProfitsAccountMovementCurrency")
    protected int inSelectedProfitsAccountMovementCurrency;
    @XmlElement(name = "InSelectedProfitsAccountPrftSystem")
    protected short inSelectedProfitsAccountPrftSystem;
    @XmlElement(name = "InSelectedProfitsAccountProductId")
    protected int inSelectedProfitsAccountProductId;
    @XmlElement(name = "InSelectedProfitsAccountTrOpenUnit")
    protected int inSelectedProfitsAccountTrOpenUnit;
    @XmlElement(name = "InSelectedProfitsAccountTrSn")
    protected int inSelectedProfitsAccountTrSn;
    @XmlElement(name = "InSelectedProfitsAccountTrType")
    protected short inSelectedProfitsAccountTrType;
    @XmlElement(name = "InTypeGenericDetailDescription")
    protected String inTypeGenericDetailDescription;
    @XmlElement(name = "InTypeGenericDetailParameterType")
    protected String inTypeGenericDetailParameterType;
    @XmlElement(name = "InTypeGenericDetailSerialNum")
    protected int inTypeGenericDetailSerialNum;
    @XmlElement(name = "InUnitClearingHouseFlag")
    protected String inUnitClearingHouseFlag;

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
     * Gets the value of the inAllowedGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAllowedGenericDetailDescription() {
        return inAllowedGenericDetailDescription;
    }

    /**
     * Sets the value of the inAllowedGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAllowedGenericDetailDescription(String value) {
        this.inAllowedGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inAllowedGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInAllowedGenericDetailParameterType() {
        return inAllowedGenericDetailParameterType;
    }

    /**
     * Sets the value of the inAllowedGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInAllowedGenericDetailParameterType(String value) {
        this.inAllowedGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inAllowedGenericDetailSerialNum property.
     * 
     */
    public int getInAllowedGenericDetailSerialNum() {
        return inAllowedGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inAllowedGenericDetailSerialNum property.
     * 
     */
    public void setInAllowedGenericDetailSerialNum(int value) {
        this.inAllowedGenericDetailSerialNum = value;
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
     * Gets the value of the inCustomerDocumentsCustId property.
     * 
     */
    public int getInCustomerDocumentsCustId() {
        return inCustomerDocumentsCustId;
    }

    /**
     * Sets the value of the inCustomerDocumentsCustId property.
     * 
     */
    public void setInCustomerDocumentsCustId(int value) {
        this.inCustomerDocumentsCustId = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDocumentsEntryComments() {
        return inCustomerDocumentsEntryComments;
    }

    /**
     * Sets the value of the inCustomerDocumentsEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDocumentsEntryComments(String value) {
        this.inCustomerDocumentsEntryComments = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsFkGdRqtp1 property.
     * 
     */
    public int getInCustomerDocumentsFkGdRqtp1() {
        return inCustomerDocumentsFkGdRqtp1;
    }

    /**
     * Sets the value of the inCustomerDocumentsFkGdRqtp1 property.
     * 
     */
    public void setInCustomerDocumentsFkGdRqtp1(int value) {
        this.inCustomerDocumentsFkGdRqtp1 = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsFkGdRqtp2 property.
     * 
     */
    public int getInCustomerDocumentsFkGdRqtp2() {
        return inCustomerDocumentsFkGdRqtp2;
    }

    /**
     * Sets the value of the inCustomerDocumentsFkGdRqtp2 property.
     * 
     */
    public void setInCustomerDocumentsFkGdRqtp2(int value) {
        this.inCustomerDocumentsFkGdRqtp2 = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsFkGdRqtp3 property.
     * 
     */
    public int getInCustomerDocumentsFkGdRqtp3() {
        return inCustomerDocumentsFkGdRqtp3;
    }

    /**
     * Sets the value of the inCustomerDocumentsFkGdRqtp3 property.
     * 
     */
    public void setInCustomerDocumentsFkGdRqtp3(int value) {
        this.inCustomerDocumentsFkGdRqtp3 = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsFkGhRqtp1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDocumentsFkGhRqtp1() {
        return inCustomerDocumentsFkGhRqtp1;
    }

    /**
     * Sets the value of the inCustomerDocumentsFkGhRqtp1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDocumentsFkGhRqtp1(String value) {
        this.inCustomerDocumentsFkGhRqtp1 = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsFkGhRqtp2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDocumentsFkGhRqtp2() {
        return inCustomerDocumentsFkGhRqtp2;
    }

    /**
     * Sets the value of the inCustomerDocumentsFkGhRqtp2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDocumentsFkGhRqtp2(String value) {
        this.inCustomerDocumentsFkGhRqtp2 = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsFkGhRqtp3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDocumentsFkGhRqtp3() {
        return inCustomerDocumentsFkGhRqtp3;
    }

    /**
     * Sets the value of the inCustomerDocumentsFkGhRqtp3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDocumentsFkGhRqtp3(String value) {
        this.inCustomerDocumentsFkGhRqtp3 = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsGivenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDocumentsGivenFlag() {
        return inCustomerDocumentsGivenFlag;
    }

    /**
     * Sets the value of the inCustomerDocumentsGivenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDocumentsGivenFlag(String value) {
        this.inCustomerDocumentsGivenFlag = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsInsertDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerDocumentsInsertDate() {
        return inCustomerDocumentsInsertDate;
    }

    /**
     * Sets the value of the inCustomerDocumentsInsertDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerDocumentsInsertDate(XMLGregorianCalendar value) {
        this.inCustomerDocumentsInsertDate = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsInsertUnit property.
     * 
     */
    public int getInCustomerDocumentsInsertUnit() {
        return inCustomerDocumentsInsertUnit;
    }

    /**
     * Sets the value of the inCustomerDocumentsInsertUnit property.
     * 
     */
    public void setInCustomerDocumentsInsertUnit(int value) {
        this.inCustomerDocumentsInsertUnit = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsInsertUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDocumentsInsertUser() {
        return inCustomerDocumentsInsertUser;
    }

    /**
     * Sets the value of the inCustomerDocumentsInsertUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDocumentsInsertUser(String value) {
        this.inCustomerDocumentsInsertUser = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsLinkedFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDocumentsLinkedFile() {
        return inCustomerDocumentsLinkedFile;
    }

    /**
     * Sets the value of the inCustomerDocumentsLinkedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDocumentsLinkedFile(String value) {
        this.inCustomerDocumentsLinkedFile = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsLinkedFileSn property.
     * 
     */
    public double getInCustomerDocumentsLinkedFileSn() {
        return inCustomerDocumentsLinkedFileSn;
    }

    /**
     * Sets the value of the inCustomerDocumentsLinkedFileSn property.
     * 
     */
    public void setInCustomerDocumentsLinkedFileSn(double value) {
        this.inCustomerDocumentsLinkedFileSn = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsScannedFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDocumentsScannedFile() {
        return inCustomerDocumentsScannedFile;
    }

    /**
     * Sets the value of the inCustomerDocumentsScannedFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDocumentsScannedFile(String value) {
        this.inCustomerDocumentsScannedFile = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsScannedImageId property.
     * 
     */
    public double getInCustomerDocumentsScannedImageId() {
        return inCustomerDocumentsScannedImageId;
    }

    /**
     * Sets the value of the inCustomerDocumentsScannedImageId property.
     * 
     */
    public void setInCustomerDocumentsScannedImageId(double value) {
        this.inCustomerDocumentsScannedImageId = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerDocumentsTmstamp() {
        return inCustomerDocumentsTmstamp;
    }

    /**
     * Sets the value of the inCustomerDocumentsTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerDocumentsTmstamp(XMLGregorianCalendar value) {
        this.inCustomerDocumentsTmstamp = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustomerDocumentsUpdateDate() {
        return inCustomerDocumentsUpdateDate;
    }

    /**
     * Sets the value of the inCustomerDocumentsUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustomerDocumentsUpdateDate(XMLGregorianCalendar value) {
        this.inCustomerDocumentsUpdateDate = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsUpdateUnit property.
     * 
     */
    public int getInCustomerDocumentsUpdateUnit() {
        return inCustomerDocumentsUpdateUnit;
    }

    /**
     * Sets the value of the inCustomerDocumentsUpdateUnit property.
     * 
     */
    public void setInCustomerDocumentsUpdateUnit(int value) {
        this.inCustomerDocumentsUpdateUnit = value;
    }

    /**
     * Gets the value of the inCustomerDocumentsUpdateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustomerDocumentsUpdateUser() {
        return inCustomerDocumentsUpdateUser;
    }

    /**
     * Sets the value of the inCustomerDocumentsUpdateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustomerDocumentsUpdateUser(String value) {
        this.inCustomerDocumentsUpdateUser = value;
    }

    /**
     * Gets the value of the inDocsGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocsGenericDetailDescription() {
        return inDocsGenericDetailDescription;
    }

    /**
     * Sets the value of the inDocsGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocsGenericDetailDescription(String value) {
        this.inDocsGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inDocsGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDocsGenericDetailParameterType() {
        return inDocsGenericDetailParameterType;
    }

    /**
     * Sets the value of the inDocsGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDocsGenericDetailParameterType(String value) {
        this.inDocsGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inDocsGenericDetailSerialNum property.
     * 
     */
    public int getInDocsGenericDetailSerialNum() {
        return inDocsGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inDocsGenericDetailSerialNum property.
     * 
     */
    public void setInDocsGenericDetailSerialNum(int value) {
        this.inDocsGenericDetailSerialNum = value;
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
     * Gets the value of the inSelectedProfitsAccountAccStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedProfitsAccountAccStatus() {
        return inSelectedProfitsAccountAccStatus;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedProfitsAccountAccStatus(String value) {
        this.inSelectedProfitsAccountAccStatus = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public short getInSelectedProfitsAccountAccountCd() {
        return inSelectedProfitsAccountAccountCd;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountCd property.
     * 
     */
    public void setInSelectedProfitsAccountAccountCd(short value) {
        this.inSelectedProfitsAccountAccountCd = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInSelectedProfitsAccountAccountNumber() {
        return inSelectedProfitsAccountAccountNumber;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInSelectedProfitsAccountAccountNumber(String value) {
        this.inSelectedProfitsAccountAccountNumber = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAgrMembershipSn property.
     * 
     */
    public int getInSelectedProfitsAccountAgrMembershipSn() {
        return inSelectedProfitsAccountAgrMembershipSn;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAgrMembershipSn property.
     * 
     */
    public void setInSelectedProfitsAccountAgrMembershipSn(int value) {
        this.inSelectedProfitsAccountAgrMembershipSn = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAgrSn property.
     * 
     */
    public int getInSelectedProfitsAccountAgrSn() {
        return inSelectedProfitsAccountAgrSn;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAgrSn property.
     * 
     */
    public void setInSelectedProfitsAccountAgrSn(int value) {
        this.inSelectedProfitsAccountAgrSn = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAgrUnit property.
     * 
     */
    public int getInSelectedProfitsAccountAgrUnit() {
        return inSelectedProfitsAccountAgrUnit;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAgrUnit property.
     * 
     */
    public void setInSelectedProfitsAccountAgrUnit(int value) {
        this.inSelectedProfitsAccountAgrUnit = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountAgrYear property.
     * 
     */
    public short getInSelectedProfitsAccountAgrYear() {
        return inSelectedProfitsAccountAgrYear;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountAgrYear property.
     * 
     */
    public void setInSelectedProfitsAccountAgrYear(short value) {
        this.inSelectedProfitsAccountAgrYear = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountCDigit property.
     * 
     */
    public short getInSelectedProfitsAccountCDigit() {
        return inSelectedProfitsAccountCDigit;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountCDigit property.
     * 
     */
    public void setInSelectedProfitsAccountCDigit(short value) {
        this.inSelectedProfitsAccountCDigit = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountCustId property.
     * 
     */
    public int getInSelectedProfitsAccountCustId() {
        return inSelectedProfitsAccountCustId;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountCustId property.
     * 
     */
    public void setInSelectedProfitsAccountCustId(int value) {
        this.inSelectedProfitsAccountCustId = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountDepAccNumber property.
     * 
     */
    public double getInSelectedProfitsAccountDepAccNumber() {
        return inSelectedProfitsAccountDepAccNumber;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountDepAccNumber property.
     * 
     */
    public void setInSelectedProfitsAccountDepAccNumber(double value) {
        this.inSelectedProfitsAccountDepAccNumber = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountDepOpenUnit property.
     * 
     */
    public int getInSelectedProfitsAccountDepOpenUnit() {
        return inSelectedProfitsAccountDepOpenUnit;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountDepOpenUnit property.
     * 
     */
    public void setInSelectedProfitsAccountDepOpenUnit(int value) {
        this.inSelectedProfitsAccountDepOpenUnit = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountLgAccSn property.
     * 
     */
    public double getInSelectedProfitsAccountLgAccSn() {
        return inSelectedProfitsAccountLgAccSn;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountLgAccSn property.
     * 
     */
    public void setInSelectedProfitsAccountLgAccSn(double value) {
        this.inSelectedProfitsAccountLgAccSn = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountLgOpenUnit property.
     * 
     */
    public int getInSelectedProfitsAccountLgOpenUnit() {
        return inSelectedProfitsAccountLgOpenUnit;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountLgOpenUnit property.
     * 
     */
    public void setInSelectedProfitsAccountLgOpenUnit(int value) {
        this.inSelectedProfitsAccountLgOpenUnit = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountLimitCurrency property.
     * 
     */
    public int getInSelectedProfitsAccountLimitCurrency() {
        return inSelectedProfitsAccountLimitCurrency;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountLimitCurrency property.
     * 
     */
    public void setInSelectedProfitsAccountLimitCurrency(int value) {
        this.inSelectedProfitsAccountLimitCurrency = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountLnsOpenUnit property.
     * 
     */
    public int getInSelectedProfitsAccountLnsOpenUnit() {
        return inSelectedProfitsAccountLnsOpenUnit;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountLnsOpenUnit property.
     * 
     */
    public void setInSelectedProfitsAccountLnsOpenUnit(int value) {
        this.inSelectedProfitsAccountLnsOpenUnit = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountLnsSn property.
     * 
     */
    public int getInSelectedProfitsAccountLnsSn() {
        return inSelectedProfitsAccountLnsSn;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountLnsSn property.
     * 
     */
    public void setInSelectedProfitsAccountLnsSn(int value) {
        this.inSelectedProfitsAccountLnsSn = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountLnsType property.
     * 
     */
    public short getInSelectedProfitsAccountLnsType() {
        return inSelectedProfitsAccountLnsType;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountLnsType property.
     * 
     */
    public void setInSelectedProfitsAccountLnsType(short value) {
        this.inSelectedProfitsAccountLnsType = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public int getInSelectedProfitsAccountMonotoringUnit() {
        return inSelectedProfitsAccountMonotoringUnit;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountMonotoringUnit property.
     * 
     */
    public void setInSelectedProfitsAccountMonotoringUnit(int value) {
        this.inSelectedProfitsAccountMonotoringUnit = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public int getInSelectedProfitsAccountMovementCurrency() {
        return inSelectedProfitsAccountMovementCurrency;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountMovementCurrency property.
     * 
     */
    public void setInSelectedProfitsAccountMovementCurrency(int value) {
        this.inSelectedProfitsAccountMovementCurrency = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public short getInSelectedProfitsAccountPrftSystem() {
        return inSelectedProfitsAccountPrftSystem;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountPrftSystem property.
     * 
     */
    public void setInSelectedProfitsAccountPrftSystem(short value) {
        this.inSelectedProfitsAccountPrftSystem = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountProductId property.
     * 
     */
    public int getInSelectedProfitsAccountProductId() {
        return inSelectedProfitsAccountProductId;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountProductId property.
     * 
     */
    public void setInSelectedProfitsAccountProductId(int value) {
        this.inSelectedProfitsAccountProductId = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountTrOpenUnit property.
     * 
     */
    public int getInSelectedProfitsAccountTrOpenUnit() {
        return inSelectedProfitsAccountTrOpenUnit;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountTrOpenUnit property.
     * 
     */
    public void setInSelectedProfitsAccountTrOpenUnit(int value) {
        this.inSelectedProfitsAccountTrOpenUnit = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountTrSn property.
     * 
     */
    public int getInSelectedProfitsAccountTrSn() {
        return inSelectedProfitsAccountTrSn;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountTrSn property.
     * 
     */
    public void setInSelectedProfitsAccountTrSn(int value) {
        this.inSelectedProfitsAccountTrSn = value;
    }

    /**
     * Gets the value of the inSelectedProfitsAccountTrType property.
     * 
     */
    public short getInSelectedProfitsAccountTrType() {
        return inSelectedProfitsAccountTrType;
    }

    /**
     * Sets the value of the inSelectedProfitsAccountTrType property.
     * 
     */
    public void setInSelectedProfitsAccountTrType(short value) {
        this.inSelectedProfitsAccountTrType = value;
    }

    /**
     * Gets the value of the inTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTypeGenericDetailDescription() {
        return inTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the inTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTypeGenericDetailDescription(String value) {
        this.inTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inTypeGenericDetailParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTypeGenericDetailParameterType() {
        return inTypeGenericDetailParameterType;
    }

    /**
     * Sets the value of the inTypeGenericDetailParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTypeGenericDetailParameterType(String value) {
        this.inTypeGenericDetailParameterType = value;
    }

    /**
     * Gets the value of the inTypeGenericDetailSerialNum property.
     * 
     */
    public int getInTypeGenericDetailSerialNum() {
        return inTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inTypeGenericDetailSerialNum property.
     * 
     */
    public void setInTypeGenericDetailSerialNum(int value) {
        this.inTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inUnitClearingHouseFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInUnitClearingHouseFlag() {
        return inUnitClearingHouseFlag;
    }

    /**
     * Sets the value of the inUnitClearingHouseFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInUnitClearingHouseFlag(String value) {
        this.inUnitClearingHouseFlag = value;
    }

}
