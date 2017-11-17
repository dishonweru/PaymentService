
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CustomerAddressMaintenanceExport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerAddressMaintenanceExport">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}BaseExport">
 *       &lt;sequence>
 *         &lt;element name="OutCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustAddressAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressCommunicationAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEntryComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressFaxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressLatinInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressMailBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressPtsInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressRegion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSegmFlags" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressSerialNum" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutCustAddressTelephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAddressZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustListSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDistrictGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutDistrictGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListGrp" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ArrayOfOutCustomerAddressMaintenanceItems" minOccurs="0"/>
 *         &lt;element name="OutStatusIefSuppliedCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustAddressAccomodationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutCustAddressInternetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTelephone3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressTelephone2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressAddress3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddressEntryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDSn" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutCustAddrParrelDP01Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP02Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP03Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP04Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP05Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP06Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP07Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP08Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP09Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutCustAddrParrelDP10Desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerAddressMaintenanceExport", propOrder = {
    "outCountryGenericDetailDescription",
    "outCountryGenericDetailSerialNum",
    "outCustAddressAddress1",
    "outCustAddressAddress2",
    "outCustAddressAddressType",
    "outCustAddressCity",
    "outCustAddressCommunicationAddress",
    "outCustAddressEntryComments",
    "outCustAddressFaxNo",
    "outCustAddressLatinInd",
    "outCustAddressMailBox",
    "outCustAddressPtsInd",
    "outCustAddressRegion",
    "outCustAddressSegmFlags",
    "outCustAddressSerialNum",
    "outCustAddressTelephone",
    "outCustAddressTmstamp",
    "outCustAddressZipCode",
    "outCustListSetDescription",
    "outDistrictGenericDetailDescription",
    "outDistrictGenericDetailSerialNum",
    "outListGrp",
    "outStatusIefSuppliedCount",
    "outCustAddressAccomodationDate",
    "outCustAddressInternetAddress",
    "outCustAddressEMail",
    "outCustAddressTelephone3",
    "outCustAddressTelephone2",
    "outCustAddressAddress6",
    "outCustAddressAddress5",
    "outCustAddressAddress4",
    "outCustAddressAddress3",
    "outCustAddressEntryStatus",
    "outCustAddrParrelDCode",
    "outCustAddrParrelDSn",
    "outCustAddrParrelDP01Desc",
    "outCustAddrParrelDP02Desc",
    "outCustAddrParrelDP03Desc",
    "outCustAddrParrelDP04Desc",
    "outCustAddrParrelDP05Desc",
    "outCustAddrParrelDP06Desc",
    "outCustAddrParrelDP07Desc",
    "outCustAddrParrelDP08Desc",
    "outCustAddrParrelDP09Desc",
    "outCustAddrParrelDP10Desc"
})
public class CustomerAddressMaintenanceExport
    extends BaseExport
{

    @XmlElement(name = "OutCountryGenericDetailDescription")
    protected String outCountryGenericDetailDescription;
    @XmlElement(name = "OutCountryGenericDetailSerialNum")
    protected int outCountryGenericDetailSerialNum;
    @XmlElement(name = "OutCustAddressAddress1")
    protected String outCustAddressAddress1;
    @XmlElement(name = "OutCustAddressAddress2")
    protected String outCustAddressAddress2;
    @XmlElement(name = "OutCustAddressAddressType")
    protected String outCustAddressAddressType;
    @XmlElement(name = "OutCustAddressCity")
    protected String outCustAddressCity;
    @XmlElement(name = "OutCustAddressCommunicationAddress")
    protected String outCustAddressCommunicationAddress;
    @XmlElement(name = "OutCustAddressEntryComments")
    protected String outCustAddressEntryComments;
    @XmlElement(name = "OutCustAddressFaxNo")
    protected String outCustAddressFaxNo;
    @XmlElement(name = "OutCustAddressLatinInd")
    protected String outCustAddressLatinInd;
    @XmlElement(name = "OutCustAddressMailBox")
    protected String outCustAddressMailBox;
    @XmlElement(name = "OutCustAddressPtsInd")
    protected String outCustAddressPtsInd;
    @XmlElement(name = "OutCustAddressRegion")
    protected String outCustAddressRegion;
    @XmlElement(name = "OutCustAddressSegmFlags")
    protected String outCustAddressSegmFlags;
    @XmlElement(name = "OutCustAddressSerialNum")
    protected short outCustAddressSerialNum;
    @XmlElement(name = "OutCustAddressTelephone")
    protected String outCustAddressTelephone;
    @XmlElement(name = "OutCustAddressTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAddressTmstamp;
    @XmlElement(name = "OutCustAddressZipCode")
    protected String outCustAddressZipCode;
    @XmlElement(name = "OutCustListSetDescription")
    protected String outCustListSetDescription;
    @XmlElement(name = "OutDistrictGenericDetailDescription")
    protected String outDistrictGenericDetailDescription;
    @XmlElement(name = "OutDistrictGenericDetailSerialNum")
    protected int outDistrictGenericDetailSerialNum;
    @XmlElement(name = "OutListGrp")
    protected ArrayOfOutCustomerAddressMaintenanceItems outListGrp;
    @XmlElement(name = "OutStatusIefSuppliedCount")
    protected int outStatusIefSuppliedCount;
    @XmlElement(name = "OutCustAddressAccomodationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outCustAddressAccomodationDate;
    @XmlElement(name = "OutCustAddressInternetAddress")
    protected String outCustAddressInternetAddress;
    @XmlElement(name = "OutCustAddressEMail")
    protected String outCustAddressEMail;
    @XmlElement(name = "OutCustAddressTelephone3")
    protected String outCustAddressTelephone3;
    @XmlElement(name = "OutCustAddressTelephone2")
    protected String outCustAddressTelephone2;
    @XmlElement(name = "OutCustAddressAddress6")
    protected String outCustAddressAddress6;
    @XmlElement(name = "OutCustAddressAddress5")
    protected String outCustAddressAddress5;
    @XmlElement(name = "OutCustAddressAddress4")
    protected String outCustAddressAddress4;
    @XmlElement(name = "OutCustAddressAddress3")
    protected String outCustAddressAddress3;
    @XmlElement(name = "OutCustAddressEntryStatus")
    protected String outCustAddressEntryStatus;
    @XmlElement(name = "OutCustAddrParrelDCode")
    protected String outCustAddrParrelDCode;
    @XmlElement(name = "OutCustAddrParrelDSn")
    protected int outCustAddrParrelDSn;
    @XmlElement(name = "OutCustAddrParrelDP01Desc")
    protected String outCustAddrParrelDP01Desc;
    @XmlElement(name = "OutCustAddrParrelDP02Desc")
    protected String outCustAddrParrelDP02Desc;
    @XmlElement(name = "OutCustAddrParrelDP03Desc")
    protected String outCustAddrParrelDP03Desc;
    @XmlElement(name = "OutCustAddrParrelDP04Desc")
    protected String outCustAddrParrelDP04Desc;
    @XmlElement(name = "OutCustAddrParrelDP05Desc")
    protected String outCustAddrParrelDP05Desc;
    @XmlElement(name = "OutCustAddrParrelDP06Desc")
    protected String outCustAddrParrelDP06Desc;
    @XmlElement(name = "OutCustAddrParrelDP07Desc")
    protected String outCustAddrParrelDP07Desc;
    @XmlElement(name = "OutCustAddrParrelDP08Desc")
    protected String outCustAddrParrelDP08Desc;
    @XmlElement(name = "OutCustAddrParrelDP09Desc")
    protected String outCustAddrParrelDP09Desc;
    @XmlElement(name = "OutCustAddrParrelDP10Desc")
    protected String outCustAddrParrelDP10Desc;

    /**
     * Gets the value of the outCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCountryGenericDetailDescription() {
        return outCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCountryGenericDetailDescription(String value) {
        this.outCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outCountryGenericDetailSerialNum property.
     * 
     */
    public int getOutCountryGenericDetailSerialNum() {
        return outCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outCountryGenericDetailSerialNum property.
     * 
     */
    public void setOutCountryGenericDetailSerialNum(int value) {
        this.outCountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outCustAddressAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress1() {
        return outCustAddressAddress1;
    }

    /**
     * Sets the value of the outCustAddressAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress1(String value) {
        this.outCustAddressAddress1 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress2() {
        return outCustAddressAddress2;
    }

    /**
     * Sets the value of the outCustAddressAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress2(String value) {
        this.outCustAddressAddress2 = value;
    }

    /**
     * Gets the value of the outCustAddressAddressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddressType() {
        return outCustAddressAddressType;
    }

    /**
     * Sets the value of the outCustAddressAddressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddressType(String value) {
        this.outCustAddressAddressType = value;
    }

    /**
     * Gets the value of the outCustAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressCity() {
        return outCustAddressCity;
    }

    /**
     * Sets the value of the outCustAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressCity(String value) {
        this.outCustAddressCity = value;
    }

    /**
     * Gets the value of the outCustAddressCommunicationAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressCommunicationAddress() {
        return outCustAddressCommunicationAddress;
    }

    /**
     * Sets the value of the outCustAddressCommunicationAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressCommunicationAddress(String value) {
        this.outCustAddressCommunicationAddress = value;
    }

    /**
     * Gets the value of the outCustAddressEntryComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressEntryComments() {
        return outCustAddressEntryComments;
    }

    /**
     * Sets the value of the outCustAddressEntryComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressEntryComments(String value) {
        this.outCustAddressEntryComments = value;
    }

    /**
     * Gets the value of the outCustAddressFaxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressFaxNo() {
        return outCustAddressFaxNo;
    }

    /**
     * Sets the value of the outCustAddressFaxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressFaxNo(String value) {
        this.outCustAddressFaxNo = value;
    }

    /**
     * Gets the value of the outCustAddressLatinInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressLatinInd() {
        return outCustAddressLatinInd;
    }

    /**
     * Sets the value of the outCustAddressLatinInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressLatinInd(String value) {
        this.outCustAddressLatinInd = value;
    }

    /**
     * Gets the value of the outCustAddressMailBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressMailBox() {
        return outCustAddressMailBox;
    }

    /**
     * Sets the value of the outCustAddressMailBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressMailBox(String value) {
        this.outCustAddressMailBox = value;
    }

    /**
     * Gets the value of the outCustAddressPtsInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressPtsInd() {
        return outCustAddressPtsInd;
    }

    /**
     * Sets the value of the outCustAddressPtsInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressPtsInd(String value) {
        this.outCustAddressPtsInd = value;
    }

    /**
     * Gets the value of the outCustAddressRegion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressRegion() {
        return outCustAddressRegion;
    }

    /**
     * Sets the value of the outCustAddressRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressRegion(String value) {
        this.outCustAddressRegion = value;
    }

    /**
     * Gets the value of the outCustAddressSegmFlags property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressSegmFlags() {
        return outCustAddressSegmFlags;
    }

    /**
     * Sets the value of the outCustAddressSegmFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressSegmFlags(String value) {
        this.outCustAddressSegmFlags = value;
    }

    /**
     * Gets the value of the outCustAddressSerialNum property.
     * 
     */
    public short getOutCustAddressSerialNum() {
        return outCustAddressSerialNum;
    }

    /**
     * Sets the value of the outCustAddressSerialNum property.
     * 
     */
    public void setOutCustAddressSerialNum(short value) {
        this.outCustAddressSerialNum = value;
    }

    /**
     * Gets the value of the outCustAddressTelephone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressTelephone() {
        return outCustAddressTelephone;
    }

    /**
     * Sets the value of the outCustAddressTelephone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressTelephone(String value) {
        this.outCustAddressTelephone = value;
    }

    /**
     * Gets the value of the outCustAddressTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustAddressTmstamp() {
        return outCustAddressTmstamp;
    }

    /**
     * Sets the value of the outCustAddressTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustAddressTmstamp(XMLGregorianCalendar value) {
        this.outCustAddressTmstamp = value;
    }

    /**
     * Gets the value of the outCustAddressZipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressZipCode() {
        return outCustAddressZipCode;
    }

    /**
     * Sets the value of the outCustAddressZipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressZipCode(String value) {
        this.outCustAddressZipCode = value;
    }

    /**
     * Gets the value of the outCustListSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustListSetDescription() {
        return outCustListSetDescription;
    }

    /**
     * Sets the value of the outCustListSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustListSetDescription(String value) {
        this.outCustListSetDescription = value;
    }

    /**
     * Gets the value of the outDistrictGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutDistrictGenericDetailDescription() {
        return outDistrictGenericDetailDescription;
    }

    /**
     * Sets the value of the outDistrictGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutDistrictGenericDetailDescription(String value) {
        this.outDistrictGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outDistrictGenericDetailSerialNum property.
     * 
     */
    public int getOutDistrictGenericDetailSerialNum() {
        return outDistrictGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outDistrictGenericDetailSerialNum property.
     * 
     */
    public void setOutDistrictGenericDetailSerialNum(int value) {
        this.outDistrictGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outListGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOutCustomerAddressMaintenanceItems }
     *     
     */
    public ArrayOfOutCustomerAddressMaintenanceItems getOutListGrp() {
        return outListGrp;
    }

    /**
     * Sets the value of the outListGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOutCustomerAddressMaintenanceItems }
     *     
     */
    public void setOutListGrp(ArrayOfOutCustomerAddressMaintenanceItems value) {
        this.outListGrp = value;
    }

    /**
     * Gets the value of the outStatusIefSuppliedCount property.
     * 
     */
    public int getOutStatusIefSuppliedCount() {
        return outStatusIefSuppliedCount;
    }

    /**
     * Sets the value of the outStatusIefSuppliedCount property.
     * 
     */
    public void setOutStatusIefSuppliedCount(int value) {
        this.outStatusIefSuppliedCount = value;
    }

    /**
     * Gets the value of the outCustAddressAccomodationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutCustAddressAccomodationDate() {
        return outCustAddressAccomodationDate;
    }

    /**
     * Sets the value of the outCustAddressAccomodationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutCustAddressAccomodationDate(XMLGregorianCalendar value) {
        this.outCustAddressAccomodationDate = value;
    }

    /**
     * Gets the value of the outCustAddressInternetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressInternetAddress() {
        return outCustAddressInternetAddress;
    }

    /**
     * Sets the value of the outCustAddressInternetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressInternetAddress(String value) {
        this.outCustAddressInternetAddress = value;
    }

    /**
     * Gets the value of the outCustAddressEMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressEMail() {
        return outCustAddressEMail;
    }

    /**
     * Sets the value of the outCustAddressEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressEMail(String value) {
        this.outCustAddressEMail = value;
    }

    /**
     * Gets the value of the outCustAddressTelephone3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressTelephone3() {
        return outCustAddressTelephone3;
    }

    /**
     * Sets the value of the outCustAddressTelephone3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressTelephone3(String value) {
        this.outCustAddressTelephone3 = value;
    }

    /**
     * Gets the value of the outCustAddressTelephone2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressTelephone2() {
        return outCustAddressTelephone2;
    }

    /**
     * Sets the value of the outCustAddressTelephone2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressTelephone2(String value) {
        this.outCustAddressTelephone2 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress6() {
        return outCustAddressAddress6;
    }

    /**
     * Sets the value of the outCustAddressAddress6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress6(String value) {
        this.outCustAddressAddress6 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress5() {
        return outCustAddressAddress5;
    }

    /**
     * Sets the value of the outCustAddressAddress5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress5(String value) {
        this.outCustAddressAddress5 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress4() {
        return outCustAddressAddress4;
    }

    /**
     * Sets the value of the outCustAddressAddress4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress4(String value) {
        this.outCustAddressAddress4 = value;
    }

    /**
     * Gets the value of the outCustAddressAddress3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressAddress3() {
        return outCustAddressAddress3;
    }

    /**
     * Sets the value of the outCustAddressAddress3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressAddress3(String value) {
        this.outCustAddressAddress3 = value;
    }

    /**
     * Gets the value of the outCustAddressEntryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddressEntryStatus() {
        return outCustAddressEntryStatus;
    }

    /**
     * Sets the value of the outCustAddressEntryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddressEntryStatus(String value) {
        this.outCustAddressEntryStatus = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDCode() {
        return outCustAddrParrelDCode;
    }

    /**
     * Sets the value of the outCustAddrParrelDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDCode(String value) {
        this.outCustAddrParrelDCode = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDSn property.
     * 
     */
    public int getOutCustAddrParrelDSn() {
        return outCustAddrParrelDSn;
    }

    /**
     * Sets the value of the outCustAddrParrelDSn property.
     * 
     */
    public void setOutCustAddrParrelDSn(int value) {
        this.outCustAddrParrelDSn = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP01Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP01Desc() {
        return outCustAddrParrelDP01Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP01Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP01Desc(String value) {
        this.outCustAddrParrelDP01Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP02Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP02Desc() {
        return outCustAddrParrelDP02Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP02Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP02Desc(String value) {
        this.outCustAddrParrelDP02Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP03Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP03Desc() {
        return outCustAddrParrelDP03Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP03Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP03Desc(String value) {
        this.outCustAddrParrelDP03Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP04Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP04Desc() {
        return outCustAddrParrelDP04Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP04Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP04Desc(String value) {
        this.outCustAddrParrelDP04Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP05Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP05Desc() {
        return outCustAddrParrelDP05Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP05Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP05Desc(String value) {
        this.outCustAddrParrelDP05Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP06Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP06Desc() {
        return outCustAddrParrelDP06Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP06Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP06Desc(String value) {
        this.outCustAddrParrelDP06Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP07Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP07Desc() {
        return outCustAddrParrelDP07Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP07Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP07Desc(String value) {
        this.outCustAddrParrelDP07Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP08Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP08Desc() {
        return outCustAddrParrelDP08Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP08Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP08Desc(String value) {
        this.outCustAddrParrelDP08Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP09Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP09Desc() {
        return outCustAddrParrelDP09Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP09Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP09Desc(String value) {
        this.outCustAddrParrelDP09Desc = value;
    }

    /**
     * Gets the value of the outCustAddrParrelDP10Desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCustAddrParrelDP10Desc() {
        return outCustAddrParrelDP10Desc;
    }

    /**
     * Sets the value of the outCustAddrParrelDP10Desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCustAddrParrelDP10Desc(String value) {
        this.outCustAddrParrelDP10Desc = value;
    }

}
