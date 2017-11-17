
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0133VOutListGrp1Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0133VOutListGrp1Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutListGrp1OutGrmAfmIssueCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrp1OutGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrp1OutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrp1OutGrmOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrp1OutGrmOtherAfmExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrp1OutGrmOtherAfmIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrp1OutGrmOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrp1OutGrmOtherAfmSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutListGrp1OutGrmOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrp1OutGrmTaxOfficeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutListGrp1OutGrmTaxOfficeTaxOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0133VOutListGrp1Item", propOrder = {
    "outListGrp1OutGrmAfmIssueCountryGenericDetailDescription",
    "outListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription",
    "outListGrp1OutGrmIefSuppliedFlag",
    "outListGrp1OutGrmIefSuppliedSelectChar",
    "outListGrp1OutGrmOtherAfmAfmNo",
    "outListGrp1OutGrmOtherAfmExpiryDate",
    "outListGrp1OutGrmOtherAfmIssueDate",
    "outListGrp1OutGrmOtherAfmMainFlag",
    "outListGrp1OutGrmOtherAfmSerialNo",
    "outListGrp1OutGrmOtherAfmTmstamp",
    "outListGrp1OutGrmTaxOfficeId",
    "outListGrp1OutGrmTaxOfficeTaxOfficeName"
})
public class I0133VOutListGrp1Item {

    @XmlElement(name = "OutListGrp1OutGrmAfmIssueCountryGenericDetailDescription")
    protected String outListGrp1OutGrmAfmIssueCountryGenericDetailDescription;
    @XmlElement(name = "OutListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription")
    protected String outListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription;
    @XmlElement(name = "OutListGrp1OutGrmIefSuppliedFlag")
    protected String outListGrp1OutGrmIefSuppliedFlag;
    @XmlElement(name = "OutListGrp1OutGrmIefSuppliedSelectChar")
    protected String outListGrp1OutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutListGrp1OutGrmOtherAfmAfmNo")
    protected String outListGrp1OutGrmOtherAfmAfmNo;
    @XmlElement(name = "OutListGrp1OutGrmOtherAfmExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrp1OutGrmOtherAfmExpiryDate;
    @XmlElement(name = "OutListGrp1OutGrmOtherAfmIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrp1OutGrmOtherAfmIssueDate;
    @XmlElement(name = "OutListGrp1OutGrmOtherAfmMainFlag")
    protected String outListGrp1OutGrmOtherAfmMainFlag;
    @XmlElement(name = "OutListGrp1OutGrmOtherAfmSerialNo")
    protected short outListGrp1OutGrmOtherAfmSerialNo;
    @XmlElement(name = "OutListGrp1OutGrmOtherAfmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrp1OutGrmOtherAfmTmstamp;
    @XmlElement(name = "OutListGrp1OutGrmTaxOfficeId")
    protected short outListGrp1OutGrmTaxOfficeId;
    @XmlElement(name = "OutListGrp1OutGrmTaxOfficeTaxOfficeName")
    protected String outListGrp1OutGrmTaxOfficeTaxOfficeName;

    /**
     * Gets the value of the outListGrp1OutGrmAfmIssueCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrp1OutGrmAfmIssueCountryGenericDetailDescription() {
        return outListGrp1OutGrmAfmIssueCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outListGrp1OutGrmAfmIssueCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrp1OutGrmAfmIssueCountryGenericDetailDescription(String value) {
        this.outListGrp1OutGrmAfmIssueCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription() {
        return outListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription(String value) {
        this.outListGrp1OutGrmAfmIssueCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrp1OutGrmIefSuppliedFlag() {
        return outListGrp1OutGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the outListGrp1OutGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrp1OutGrmIefSuppliedFlag(String value) {
        this.outListGrp1OutGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrp1OutGrmIefSuppliedSelectChar() {
        return outListGrp1OutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outListGrp1OutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrp1OutGrmIefSuppliedSelectChar(String value) {
        this.outListGrp1OutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrp1OutGrmOtherAfmAfmNo() {
        return outListGrp1OutGrmOtherAfmAfmNo;
    }

    /**
     * Sets the value of the outListGrp1OutGrmOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrp1OutGrmOtherAfmAfmNo(String value) {
        this.outListGrp1OutGrmOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmOtherAfmExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrp1OutGrmOtherAfmExpiryDate() {
        return outListGrp1OutGrmOtherAfmExpiryDate;
    }

    /**
     * Sets the value of the outListGrp1OutGrmOtherAfmExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrp1OutGrmOtherAfmExpiryDate(XMLGregorianCalendar value) {
        this.outListGrp1OutGrmOtherAfmExpiryDate = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmOtherAfmIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrp1OutGrmOtherAfmIssueDate() {
        return outListGrp1OutGrmOtherAfmIssueDate;
    }

    /**
     * Sets the value of the outListGrp1OutGrmOtherAfmIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrp1OutGrmOtherAfmIssueDate(XMLGregorianCalendar value) {
        this.outListGrp1OutGrmOtherAfmIssueDate = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrp1OutGrmOtherAfmMainFlag() {
        return outListGrp1OutGrmOtherAfmMainFlag;
    }

    /**
     * Sets the value of the outListGrp1OutGrmOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrp1OutGrmOtherAfmMainFlag(String value) {
        this.outListGrp1OutGrmOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmOtherAfmSerialNo property.
     * 
     */
    public short getOutListGrp1OutGrmOtherAfmSerialNo() {
        return outListGrp1OutGrmOtherAfmSerialNo;
    }

    /**
     * Sets the value of the outListGrp1OutGrmOtherAfmSerialNo property.
     * 
     */
    public void setOutListGrp1OutGrmOtherAfmSerialNo(short value) {
        this.outListGrp1OutGrmOtherAfmSerialNo = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmOtherAfmTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrp1OutGrmOtherAfmTmstamp() {
        return outListGrp1OutGrmOtherAfmTmstamp;
    }

    /**
     * Sets the value of the outListGrp1OutGrmOtherAfmTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrp1OutGrmOtherAfmTmstamp(XMLGregorianCalendar value) {
        this.outListGrp1OutGrmOtherAfmTmstamp = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmTaxOfficeId property.
     * 
     */
    public short getOutListGrp1OutGrmTaxOfficeId() {
        return outListGrp1OutGrmTaxOfficeId;
    }

    /**
     * Sets the value of the outListGrp1OutGrmTaxOfficeId property.
     * 
     */
    public void setOutListGrp1OutGrmTaxOfficeId(short value) {
        this.outListGrp1OutGrmTaxOfficeId = value;
    }

    /**
     * Gets the value of the outListGrp1OutGrmTaxOfficeTaxOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrp1OutGrmTaxOfficeTaxOfficeName() {
        return outListGrp1OutGrmTaxOfficeTaxOfficeName;
    }

    /**
     * Sets the value of the outListGrp1OutGrmTaxOfficeTaxOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrp1OutGrmTaxOfficeTaxOfficeName(String value) {
        this.outListGrp1OutGrmTaxOfficeTaxOfficeName = value;
    }

}
