
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0133VInListGrp1Item complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0133VInListGrp1Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InListGrp1InGrmAfmIssueCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrp1InGrmAfmIssueCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrp1InGrmIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrp1InGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrp1InGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrp1InGrmOtherAfmAfmNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrp1InGrmOtherAfmExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrp1InGrmOtherAfmIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrp1InGrmOtherAfmMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrp1InGrmOtherAfmSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InListGrp1InGrmOtherAfmTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrp1InGrmTaxOfficeId" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InListGrp1InGrmTaxOfficeTaxOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0133VInListGrp1Item", propOrder = {
    "inListGrp1InGrmAfmIssueCountryGenericDetailDescription",
    "inListGrp1InGrmAfmIssueCountryGenericDetailShortDescription",
    "inListGrp1InGrmIefSuppliedChar1",
    "inListGrp1InGrmIefSuppliedFlag",
    "inListGrp1InGrmIefSuppliedSelectChar",
    "inListGrp1InGrmOtherAfmAfmNo",
    "inListGrp1InGrmOtherAfmExpiryDate",
    "inListGrp1InGrmOtherAfmIssueDate",
    "inListGrp1InGrmOtherAfmMainFlag",
    "inListGrp1InGrmOtherAfmSerialNo",
    "inListGrp1InGrmOtherAfmTmstamp",
    "inListGrp1InGrmTaxOfficeId",
    "inListGrp1InGrmTaxOfficeTaxOfficeName"
})
public class I0133VInListGrp1Item {

    @XmlElement(name = "InListGrp1InGrmAfmIssueCountryGenericDetailDescription")
    protected String inListGrp1InGrmAfmIssueCountryGenericDetailDescription;
    @XmlElement(name = "InListGrp1InGrmAfmIssueCountryGenericDetailShortDescription")
    protected String inListGrp1InGrmAfmIssueCountryGenericDetailShortDescription;
    @XmlElement(name = "InListGrp1InGrmIefSuppliedChar1")
    protected String inListGrp1InGrmIefSuppliedChar1;
    @XmlElement(name = "InListGrp1InGrmIefSuppliedFlag")
    protected String inListGrp1InGrmIefSuppliedFlag;
    @XmlElement(name = "InListGrp1InGrmIefSuppliedSelectChar")
    protected String inListGrp1InGrmIefSuppliedSelectChar;
    @XmlElement(name = "InListGrp1InGrmOtherAfmAfmNo")
    protected String inListGrp1InGrmOtherAfmAfmNo;
    @XmlElement(name = "InListGrp1InGrmOtherAfmExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrp1InGrmOtherAfmExpiryDate;
    @XmlElement(name = "InListGrp1InGrmOtherAfmIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrp1InGrmOtherAfmIssueDate;
    @XmlElement(name = "InListGrp1InGrmOtherAfmMainFlag")
    protected String inListGrp1InGrmOtherAfmMainFlag;
    @XmlElement(name = "InListGrp1InGrmOtherAfmSerialNo")
    protected short inListGrp1InGrmOtherAfmSerialNo;
    @XmlElement(name = "InListGrp1InGrmOtherAfmTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrp1InGrmOtherAfmTmstamp;
    @XmlElement(name = "InListGrp1InGrmTaxOfficeId")
    protected short inListGrp1InGrmTaxOfficeId;
    @XmlElement(name = "InListGrp1InGrmTaxOfficeTaxOfficeName")
    protected String inListGrp1InGrmTaxOfficeTaxOfficeName;

    /**
     * Gets the value of the inListGrp1InGrmAfmIssueCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrp1InGrmAfmIssueCountryGenericDetailDescription() {
        return inListGrp1InGrmAfmIssueCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inListGrp1InGrmAfmIssueCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrp1InGrmAfmIssueCountryGenericDetailDescription(String value) {
        this.inListGrp1InGrmAfmIssueCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmAfmIssueCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrp1InGrmAfmIssueCountryGenericDetailShortDescription() {
        return inListGrp1InGrmAfmIssueCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inListGrp1InGrmAfmIssueCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrp1InGrmAfmIssueCountryGenericDetailShortDescription(String value) {
        this.inListGrp1InGrmAfmIssueCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrp1InGrmIefSuppliedChar1() {
        return inListGrp1InGrmIefSuppliedChar1;
    }

    /**
     * Sets the value of the inListGrp1InGrmIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrp1InGrmIefSuppliedChar1(String value) {
        this.inListGrp1InGrmIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrp1InGrmIefSuppliedFlag() {
        return inListGrp1InGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the inListGrp1InGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrp1InGrmIefSuppliedFlag(String value) {
        this.inListGrp1InGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrp1InGrmIefSuppliedSelectChar() {
        return inListGrp1InGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inListGrp1InGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrp1InGrmIefSuppliedSelectChar(String value) {
        this.inListGrp1InGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmOtherAfmAfmNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrp1InGrmOtherAfmAfmNo() {
        return inListGrp1InGrmOtherAfmAfmNo;
    }

    /**
     * Sets the value of the inListGrp1InGrmOtherAfmAfmNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrp1InGrmOtherAfmAfmNo(String value) {
        this.inListGrp1InGrmOtherAfmAfmNo = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmOtherAfmExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrp1InGrmOtherAfmExpiryDate() {
        return inListGrp1InGrmOtherAfmExpiryDate;
    }

    /**
     * Sets the value of the inListGrp1InGrmOtherAfmExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrp1InGrmOtherAfmExpiryDate(XMLGregorianCalendar value) {
        this.inListGrp1InGrmOtherAfmExpiryDate = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmOtherAfmIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrp1InGrmOtherAfmIssueDate() {
        return inListGrp1InGrmOtherAfmIssueDate;
    }

    /**
     * Sets the value of the inListGrp1InGrmOtherAfmIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrp1InGrmOtherAfmIssueDate(XMLGregorianCalendar value) {
        this.inListGrp1InGrmOtherAfmIssueDate = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmOtherAfmMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrp1InGrmOtherAfmMainFlag() {
        return inListGrp1InGrmOtherAfmMainFlag;
    }

    /**
     * Sets the value of the inListGrp1InGrmOtherAfmMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrp1InGrmOtherAfmMainFlag(String value) {
        this.inListGrp1InGrmOtherAfmMainFlag = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmOtherAfmSerialNo property.
     * 
     */
    public short getInListGrp1InGrmOtherAfmSerialNo() {
        return inListGrp1InGrmOtherAfmSerialNo;
    }

    /**
     * Sets the value of the inListGrp1InGrmOtherAfmSerialNo property.
     * 
     */
    public void setInListGrp1InGrmOtherAfmSerialNo(short value) {
        this.inListGrp1InGrmOtherAfmSerialNo = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmOtherAfmTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrp1InGrmOtherAfmTmstamp() {
        return inListGrp1InGrmOtherAfmTmstamp;
    }

    /**
     * Sets the value of the inListGrp1InGrmOtherAfmTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrp1InGrmOtherAfmTmstamp(XMLGregorianCalendar value) {
        this.inListGrp1InGrmOtherAfmTmstamp = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmTaxOfficeId property.
     * 
     */
    public short getInListGrp1InGrmTaxOfficeId() {
        return inListGrp1InGrmTaxOfficeId;
    }

    /**
     * Sets the value of the inListGrp1InGrmTaxOfficeId property.
     * 
     */
    public void setInListGrp1InGrmTaxOfficeId(short value) {
        this.inListGrp1InGrmTaxOfficeId = value;
    }

    /**
     * Gets the value of the inListGrp1InGrmTaxOfficeTaxOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrp1InGrmTaxOfficeTaxOfficeName() {
        return inListGrp1InGrmTaxOfficeTaxOfficeName;
    }

    /**
     * Sets the value of the inListGrp1InGrmTaxOfficeTaxOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrp1InGrmTaxOfficeTaxOfficeName(String value) {
        this.inListGrp1InGrmTaxOfficeTaxOfficeName = value;
    }

}
