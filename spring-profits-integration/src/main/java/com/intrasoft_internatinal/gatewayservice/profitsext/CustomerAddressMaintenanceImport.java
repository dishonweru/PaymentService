
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerAddressMaintenanceImport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAddressMaintenanceImport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseImport">
 *       &lt;sequence>
 *         &lt;element name="InCountryKeyGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InDistrictKeyGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InIefSuppliedCommand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InJustificIdJustific" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InKeyCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InMntRecordingTerminalNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InMntRecordingTrxCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InMntRecordingReversalFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InProductIdProduct" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InTimestampCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCountryKeyGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAccomodationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InCustAddressInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAddressMaintenanceImport", propOrder = {
    "inCountryKeyGenericDetailSerialNum",
    "inCustAddressAddress1",
    "inCustAddressAddress2",
    "inCustAddressAddressType",
    "inCustAddressCity",
    "inCustAddressCommunicationAddress",
    "inCustAddressEntryComments",
    "inCustAddressFaxNo",
    "inCustAddressLatinInd",
    "inCustAddressMailBox",
    "inCustAddressPtsInd",
    "inCustAddressRegion",
    "inCustAddressSegmFlags",
    "inCustAddressSerialNum",
    "inCustAddressTelephone",
    "inCustAddressTmstamp",
    "inCustAddressZipCode",
    "inCustomerCustId",
    "inCustomerCDigit",
    "inDistrictKeyGenericDetailSerialNum",
    "inIefSuppliedCommand",
    "inJustificIdJustific",
    "inKeyCustAddressSerialNum",
    "inMntRecordingTerminalNumber",
    "inMntRecordingTrxCode",
    "inMntRecordingReversalFlag",
    "inProductIdProduct",
    "inTimestampCustAddressTmstamp",
    "inCountryKeyGenericDetailShortDescription",
    "inCustAddressAccomodationDate",
    "inCustAddressInternetAddress",
    "inCustAddressEMail",
    "inCustAddressTelephone3",
    "inCustAddressTelephone2",
    "inCustAddressAddress6",
    "inCustAddressAddress5",
    "inCustAddressAddress4",
    "inCustAddressAddress3",
    "inCustAddressEntryStatus",
    "inCustAddrParrelDCode",
    "inCustAddrParrelDSn"
})
public class CustomerAddressMaintenanceImport
    extends BaseImport
{

    @XmlElement(name = "InCountryKeyGenericDetailSerialNum")
    protected int inCountryKeyGenericDetailSerialNum;
    @XmlElement(name = "InCustAddressAddress1")
    protected String inCustAddressAddress1;
    @XmlElement(name = "InCustAddressAddress2")
    protected String inCustAddressAddress2;
    @XmlElement(name = "InCustAddressAddressType")
    protected String inCustAddressAddressType;
    @XmlElement(name = "InCustAddressCity")
    protected String inCustAddressCity;
    @XmlElement(name = "InCustAddressCommunicationAddress")
    protected String inCustAddressCommunicationAddress;
    @XmlElement(name = "InCustAddressEntryComments")
    protected String inCustAddressEntryComments;
    @XmlElement(name = "InCustAddressFaxNo")
    protected String inCustAddressFaxNo;
    @XmlElement(name = "InCustAddressLatinInd")
    protected String inCustAddressLatinInd;
    @XmlElement(name = "InCustAddressMailBox")
    protected String inCustAddressMailBox;
    @XmlElement(name = "InCustAddressPtsInd")
    protected String inCustAddressPtsInd;
    @XmlElement(name = "InCustAddressRegion")
    protected String inCustAddressRegion;
    @XmlElement(name = "InCustAddressSegmFlags")
    protected String inCustAddressSegmFlags;
    @XmlElement(name = "InCustAddressSerialNum")
    protected short inCustAddressSerialNum;
    @XmlElement(name = "InCustAddressTelephone")
    protected String inCustAddressTelephone;
    @XmlElement(name = "InCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustAddressTmstamp;
    @XmlElement(name = "InCustAddressZipCode")
    protected String inCustAddressZipCode;
    @XmlElement(name = "InCustomerCustId")
    protected int inCustomerCustId;
    @XmlElement(name = "InCustomerCDigit")
    protected short inCustomerCDigit;
    @XmlElement(name = "InDistrictKeyGenericDetailSerialNum")
    protected int inDistrictKeyGenericDetailSerialNum;
    @XmlElement(name = "InIefSuppliedCommand")
    protected String inIefSuppliedCommand;
    @XmlElement(name = "InJustificIdJustific")
    protected int inJustificIdJustific;
    @XmlElement(name = "InKeyCustAddressSerialNum")
    protected short inKeyCustAddressSerialNum;
    @XmlElement(name = "InMntRecordingTerminalNumber")
    protected String inMntRecordingTerminalNumber;
    @XmlElement(name = "InMntRecordingTrxCode")
    protected int inMntRecordingTrxCode;
    @XmlElement(name = "InMntRecordingReversalFlag")
    protected String inMntRecordingReversalFlag;
    @XmlElement(name = "InProductIdProduct")
    protected int inProductIdProduct;
    @XmlElement(name = "InTimestampCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inTimestampCustAddressTmstamp;
    @XmlElement(name = "InCountryKeyGenericDetailShortDescription")
    protected String inCountryKeyGenericDetailShortDescription;
    @XmlElement(name = "InCustAddressAccomodationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inCustAddressAccomodationDate;
    @XmlElement(name = "InCustAddressInternetAddress")
    protected String inCustAddressInternetAddress;
    @XmlElement(name = "InCustAddressEMail")
    protected String inCustAddressEMail;
    @XmlElement(name = "InCustAddressTelephone3")
    protected String inCustAddressTelephone3;
    @XmlElement(name = "InCustAddressTelephone2")
    protected String inCustAddressTelephone2;
    @XmlElement(name = "InCustAddressAddress6")
    protected String inCustAddressAddress6;
    @XmlElement(name = "InCustAddressAddress5")
    protected String inCustAddressAddress5;
    @XmlElement(name = "InCustAddressAddress4")
    protected String inCustAddressAddress4;
    @XmlElement(name = "InCustAddressAddress3")
    protected String inCustAddressAddress3;
    @XmlElement(name = "InCustAddressEntryStatus")
    protected String inCustAddressEntryStatus;
    @XmlElement(name = "InCustAddrParrelDCode")
    protected String inCustAddrParrelDCode;
    @XmlElement(name = "InCustAddrParrelDSn")
    protected int inCustAddrParrelDSn;

    /**
     * Gets the value of the inCountryKeyGenericDetailSerialNum property.
     * 
     */
    public int getInCountryKeyGenericDetailSerialNum() {
        return inCountryKeyGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inCountryKeyGenericDetailSerialNum property.
     * 
     */
    public void setInCountryKeyGenericDetailSerialNum(int value) {
        this.inCountryKeyGenericDetailSerialNum = value;
    }

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
     * Gets the value of the inCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddressType() {
        return inCustAddressAddressType;
    }

    /**
     * Sets the value of the inCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddressType(String value) {
        this.inCustAddressAddressType = value;
    }

    /**
     * Gets the value of the inCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressCity() {
        return inCustAddressCity;
    }

    /**
     * Sets the value of the inCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressCity(String value) {
        this.inCustAddressCity = value;
    }

    /**
     * Gets the value of the inCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressCommunicationAddress() {
        return inCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the inCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressCommunicationAddress(String value) {
        this.inCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the inCustAddressEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressEntryComments() {
        return inCustAddressEntryComments;
    }

    /**
     * Sets the value of the inCustAddressEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressEntryComments(String value) {
        this.inCustAddressEntryComments = value;
    }

    /**
     * Gets the value of the inCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressFaxNo() {
        return inCustAddressFaxNo;
    }

    /**
     * Sets the value of the inCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressFaxNo(String value) {
        this.inCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the inCustAddressLatinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressLatinInd() {
        return inCustAddressLatinInd;
    }

    /**
     * Sets the value of the inCustAddressLatinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressLatinInd(String value) {
        this.inCustAddressLatinInd = value;
    }

    /**
     * Gets the value of the inCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressMailBox() {
        return inCustAddressMailBox;
    }

    /**
     * Sets the value of the inCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressMailBox(String value) {
        this.inCustAddressMailBox = value;
    }

    /**
     * Gets the value of the inCustAddressPtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressPtsInd() {
        return inCustAddressPtsInd;
    }

    /**
     * Sets the value of the inCustAddressPtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressPtsInd(String value) {
        this.inCustAddressPtsInd = value;
    }

    /**
     * Gets the value of the inCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressRegion() {
        return inCustAddressRegion;
    }

    /**
     * Sets the value of the inCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressRegion(String value) {
        this.inCustAddressRegion = value;
    }

    /**
     * Gets the value of the inCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressSegmFlags() {
        return inCustAddressSegmFlags;
    }

    /**
     * Sets the value of the inCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressSegmFlags(String value) {
        this.inCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the inCustAddressSerialNum property.
     * 
     */
    public short getInCustAddressSerialNum() {
        return inCustAddressSerialNum;
    }

    /**
     * Sets the value of the inCustAddressSerialNum property.
     * 
     */
    public void setInCustAddressSerialNum(short value) {
        this.inCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the inCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressTelephone() {
        return inCustAddressTelephone;
    }

    /**
     * Sets the value of the inCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressTelephone(String value) {
        this.inCustAddressTelephone = value;
    }

    /**
     * Gets the value of the inCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustAddressTmstamp() {
        return inCustAddressTmstamp;
    }

    /**
     * Sets the value of the inCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustAddressTmstamp(XMLGregorianCalendar value) {
        this.inCustAddressTmstamp = value;
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
     * Gets the value of the inDistrictKeyGenericDetailSerialNum property.
     * 
     */
    public int getInDistrictKeyGenericDetailSerialNum() {
        return inDistrictKeyGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inDistrictKeyGenericDetailSerialNum property.
     * 
     */
    public void setInDistrictKeyGenericDetailSerialNum(int value) {
        this.inDistrictKeyGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inIefSuppliedCommand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInIefSuppliedCommand() {
        return inIefSuppliedCommand;
    }

    /**
     * Sets the value of the inIefSuppliedCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInIefSuppliedCommand(String value) {
        this.inIefSuppliedCommand = value;
    }

    /**
     * Gets the value of the inJustificIdJustific property.
     * 
     */
    public int getInJustificIdJustific() {
        return inJustificIdJustific;
    }

    /**
     * Sets the value of the inJustificIdJustific property.
     * 
     */
    public void setInJustificIdJustific(int value) {
        this.inJustificIdJustific = value;
    }

    /**
     * Gets the value of the inKeyCustAddressSerialNum property.
     * 
     */
    public short getInKeyCustAddressSerialNum() {
        return inKeyCustAddressSerialNum;
    }

    /**
     * Sets the value of the inKeyCustAddressSerialNum property.
     * 
     */
    public void setInKeyCustAddressSerialNum(short value) {
        this.inKeyCustAddressSerialNum = value;
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
     * Gets the value of the inProductIdProduct property.
     * 
     */
    public int getInProductIdProduct() {
        return inProductIdProduct;
    }

    /**
     * Sets the value of the inProductIdProduct property.
     * 
     */
    public void setInProductIdProduct(int value) {
        this.inProductIdProduct = value;
    }

    /**
     * Gets the value of the inTimestampCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInTimestampCustAddressTmstamp() {
        return inTimestampCustAddressTmstamp;
    }

    /**
     * Sets the value of the inTimestampCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInTimestampCustAddressTmstamp(XMLGregorianCalendar value) {
        this.inTimestampCustAddressTmstamp = value;
    }

    /**
     * Gets the value of the inCountryKeyGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCountryKeyGenericDetailShortDescription() {
        return inCountryKeyGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inCountryKeyGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCountryKeyGenericDetailShortDescription(String value) {
        this.inCountryKeyGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inCustAddressAccomodationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInCustAddressAccomodationDate() {
        return inCustAddressAccomodationDate;
    }

    /**
     * Sets the value of the inCustAddressAccomodationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInCustAddressAccomodationDate(XMLGregorianCalendar value) {
        this.inCustAddressAccomodationDate = value;
    }

    /**
     * Gets the value of the inCustAddressInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressInternetAddress() {
        return inCustAddressInternetAddress;
    }

    /**
     * Sets the value of the inCustAddressInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressInternetAddress(String value) {
        this.inCustAddressInternetAddress = value;
    }

    /**
     * Gets the value of the inCustAddressEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressEMail() {
        return inCustAddressEMail;
    }

    /**
     * Sets the value of the inCustAddressEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressEMail(String value) {
        this.inCustAddressEMail = value;
    }

    /**
     * Gets the value of the inCustAddressTelephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressTelephone3() {
        return inCustAddressTelephone3;
    }

    /**
     * Sets the value of the inCustAddressTelephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressTelephone3(String value) {
        this.inCustAddressTelephone3 = value;
    }

    /**
     * Gets the value of the inCustAddressTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressTelephone2() {
        return inCustAddressTelephone2;
    }

    /**
     * Sets the value of the inCustAddressTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressTelephone2(String value) {
        this.inCustAddressTelephone2 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress6() {
        return inCustAddressAddress6;
    }

    /**
     * Sets the value of the inCustAddressAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress6(String value) {
        this.inCustAddressAddress6 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress5() {
        return inCustAddressAddress5;
    }

    /**
     * Sets the value of the inCustAddressAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress5(String value) {
        this.inCustAddressAddress5 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress4() {
        return inCustAddressAddress4;
    }

    /**
     * Sets the value of the inCustAddressAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress4(String value) {
        this.inCustAddressAddress4 = value;
    }

    /**
     * Gets the value of the inCustAddressAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressAddress3() {
        return inCustAddressAddress3;
    }

    /**
     * Sets the value of the inCustAddressAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressAddress3(String value) {
        this.inCustAddressAddress3 = value;
    }

    /**
     * Gets the value of the inCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddressEntryStatus() {
        return inCustAddressEntryStatus;
    }

    /**
     * Sets the value of the inCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddressEntryStatus(String value) {
        this.inCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the inCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInCustAddrParrelDCode() {
        return inCustAddrParrelDCode;
    }

    /**
     * Sets the value of the inCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInCustAddrParrelDCode(String value) {
        this.inCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the inCustAddrParrelDSn property.
     * 
     */
    public int getInCustAddrParrelDSn() {
        return inCustAddrParrelDSn;
    }

    /**
     * Sets the value of the inCustAddrParrelDSn property.
     * 
     */
    public void setInCustAddrParrelDSn(int value) {
        this.inCustAddrParrelDSn = value;
    }

}
