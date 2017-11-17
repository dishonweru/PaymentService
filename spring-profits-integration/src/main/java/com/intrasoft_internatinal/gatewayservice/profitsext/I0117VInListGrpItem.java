
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0117VInListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0117VInListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InListGrpInGrmCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InListGrpInGrmCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmCustomerIncompleteUComnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrpInGrmOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrpInGrmOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmOtherIdSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InListGrpInGrmOtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InListGrpInGrmToBeDeletedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InListGrpInGrmTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="InListGrpInGrmTypeGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0117VInListGrpItem", propOrder = {
    "inListGrpInGrmCountryGenericDetailDescription",
    "inListGrpInGrmCountryGenericDetailSerialNum",
    "inListGrpInGrmCountryGenericDetailShortDescription",
    "inListGrpInGrmCustomerIncompleteUComnt",
    "inListGrpInGrmIefSuppliedChar1",
    "inListGrpInGrmIefSuppliedFlag",
    "inListGrpInGrmIefSuppliedSelectChar",
    "inListGrpInGrmOtherIdExpiryDate",
    "inListGrpInGrmOtherIdIdNo",
    "inListGrpInGrmOtherIdIssueAuthority",
    "inListGrpInGrmOtherIdIssueDate",
    "inListGrpInGrmOtherIdMainFlag",
    "inListGrpInGrmOtherIdSerialNo",
    "inListGrpInGrmOtherIdTmstamp",
    "inListGrpInGrmToBeDeletedIefSuppliedFlag",
    "inListGrpInGrmTypeGenericDetailDescription",
    "inListGrpInGrmTypeGenericDetailSerialNum",
    "inListGrpInGrmTypeGenericDetailShortDescription"
})
public class I0117VInListGrpItem {

    @XmlElement(name = "InListGrpInGrmCountryGenericDetailDescription")
    protected String inListGrpInGrmCountryGenericDetailDescription;
    @XmlElement(name = "InListGrpInGrmCountryGenericDetailSerialNum")
    protected int inListGrpInGrmCountryGenericDetailSerialNum;
    @XmlElement(name = "InListGrpInGrmCountryGenericDetailShortDescription")
    protected String inListGrpInGrmCountryGenericDetailShortDescription;
    @XmlElement(name = "InListGrpInGrmCustomerIncompleteUComnt")
    protected String inListGrpInGrmCustomerIncompleteUComnt;
    @XmlElement(name = "InListGrpInGrmIefSuppliedChar1")
    protected String inListGrpInGrmIefSuppliedChar1;
    @XmlElement(name = "InListGrpInGrmIefSuppliedFlag")
    protected String inListGrpInGrmIefSuppliedFlag;
    @XmlElement(name = "InListGrpInGrmIefSuppliedSelectChar")
    protected String inListGrpInGrmIefSuppliedSelectChar;
    @XmlElement(name = "InListGrpInGrmOtherIdExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrpInGrmOtherIdExpiryDate;
    @XmlElement(name = "InListGrpInGrmOtherIdIdNo")
    protected String inListGrpInGrmOtherIdIdNo;
    @XmlElement(name = "InListGrpInGrmOtherIdIssueAuthority")
    protected String inListGrpInGrmOtherIdIssueAuthority;
    @XmlElement(name = "InListGrpInGrmOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrpInGrmOtherIdIssueDate;
    @XmlElement(name = "InListGrpInGrmOtherIdMainFlag")
    protected String inListGrpInGrmOtherIdMainFlag;
    @XmlElement(name = "InListGrpInGrmOtherIdSerialNo")
    protected short inListGrpInGrmOtherIdSerialNo;
    @XmlElement(name = "InListGrpInGrmOtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inListGrpInGrmOtherIdTmstamp;
    @XmlElement(name = "InListGrpInGrmToBeDeletedIefSuppliedFlag")
    protected String inListGrpInGrmToBeDeletedIefSuppliedFlag;
    @XmlElement(name = "InListGrpInGrmTypeGenericDetailDescription")
    protected String inListGrpInGrmTypeGenericDetailDescription;
    @XmlElement(name = "InListGrpInGrmTypeGenericDetailSerialNum")
    protected int inListGrpInGrmTypeGenericDetailSerialNum;
    @XmlElement(name = "InListGrpInGrmTypeGenericDetailShortDescription")
    protected String inListGrpInGrmTypeGenericDetailShortDescription;

    /**
     * Gets the value of the inListGrpInGrmCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmCountryGenericDetailDescription() {
        return inListGrpInGrmCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the inListGrpInGrmCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmCountryGenericDetailDescription(String value) {
        this.inListGrpInGrmCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inListGrpInGrmCountryGenericDetailSerialNum property.
     * 
     */
    public int getInListGrpInGrmCountryGenericDetailSerialNum() {
        return inListGrpInGrmCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inListGrpInGrmCountryGenericDetailSerialNum property.
     * 
     */
    public void setInListGrpInGrmCountryGenericDetailSerialNum(int value) {
        this.inListGrpInGrmCountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inListGrpInGrmCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmCountryGenericDetailShortDescription() {
        return inListGrpInGrmCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inListGrpInGrmCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmCountryGenericDetailShortDescription(String value) {
        this.inListGrpInGrmCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the inListGrpInGrmCustomerIncompleteUComnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmCustomerIncompleteUComnt() {
        return inListGrpInGrmCustomerIncompleteUComnt;
    }

    /**
     * Sets the value of the inListGrpInGrmCustomerIncompleteUComnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmCustomerIncompleteUComnt(String value) {
        this.inListGrpInGrmCustomerIncompleteUComnt = value;
    }

    /**
     * Gets the value of the inListGrpInGrmIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmIefSuppliedChar1() {
        return inListGrpInGrmIefSuppliedChar1;
    }

    /**
     * Sets the value of the inListGrpInGrmIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmIefSuppliedChar1(String value) {
        this.inListGrpInGrmIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the inListGrpInGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmIefSuppliedFlag() {
        return inListGrpInGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the inListGrpInGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmIefSuppliedFlag(String value) {
        this.inListGrpInGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inListGrpInGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmIefSuppliedSelectChar() {
        return inListGrpInGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inListGrpInGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmIefSuppliedSelectChar(String value) {
        this.inListGrpInGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the inListGrpInGrmOtherIdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrpInGrmOtherIdExpiryDate() {
        return inListGrpInGrmOtherIdExpiryDate;
    }

    /**
     * Sets the value of the inListGrpInGrmOtherIdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrpInGrmOtherIdExpiryDate(XMLGregorianCalendar value) {
        this.inListGrpInGrmOtherIdExpiryDate = value;
    }

    /**
     * Gets the value of the inListGrpInGrmOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmOtherIdIdNo() {
        return inListGrpInGrmOtherIdIdNo;
    }

    /**
     * Sets the value of the inListGrpInGrmOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmOtherIdIdNo(String value) {
        this.inListGrpInGrmOtherIdIdNo = value;
    }

    /**
     * Gets the value of the inListGrpInGrmOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmOtherIdIssueAuthority() {
        return inListGrpInGrmOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the inListGrpInGrmOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmOtherIdIssueAuthority(String value) {
        this.inListGrpInGrmOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the inListGrpInGrmOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrpInGrmOtherIdIssueDate() {
        return inListGrpInGrmOtherIdIssueDate;
    }

    /**
     * Sets the value of the inListGrpInGrmOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrpInGrmOtherIdIssueDate(XMLGregorianCalendar value) {
        this.inListGrpInGrmOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the inListGrpInGrmOtherIdMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmOtherIdMainFlag() {
        return inListGrpInGrmOtherIdMainFlag;
    }

    /**
     * Sets the value of the inListGrpInGrmOtherIdMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmOtherIdMainFlag(String value) {
        this.inListGrpInGrmOtherIdMainFlag = value;
    }

    /**
     * Gets the value of the inListGrpInGrmOtherIdSerialNo property.
     * 
     */
    public short getInListGrpInGrmOtherIdSerialNo() {
        return inListGrpInGrmOtherIdSerialNo;
    }

    /**
     * Sets the value of the inListGrpInGrmOtherIdSerialNo property.
     * 
     */
    public void setInListGrpInGrmOtherIdSerialNo(short value) {
        this.inListGrpInGrmOtherIdSerialNo = value;
    }

    /**
     * Gets the value of the inListGrpInGrmOtherIdTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInListGrpInGrmOtherIdTmstamp() {
        return inListGrpInGrmOtherIdTmstamp;
    }

    /**
     * Sets the value of the inListGrpInGrmOtherIdTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInListGrpInGrmOtherIdTmstamp(XMLGregorianCalendar value) {
        this.inListGrpInGrmOtherIdTmstamp = value;
    }

    /**
     * Gets the value of the inListGrpInGrmToBeDeletedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmToBeDeletedIefSuppliedFlag() {
        return inListGrpInGrmToBeDeletedIefSuppliedFlag;
    }

    /**
     * Sets the value of the inListGrpInGrmToBeDeletedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmToBeDeletedIefSuppliedFlag(String value) {
        this.inListGrpInGrmToBeDeletedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inListGrpInGrmTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmTypeGenericDetailDescription() {
        return inListGrpInGrmTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the inListGrpInGrmTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmTypeGenericDetailDescription(String value) {
        this.inListGrpInGrmTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the inListGrpInGrmTypeGenericDetailSerialNum property.
     * 
     */
    public int getInListGrpInGrmTypeGenericDetailSerialNum() {
        return inListGrpInGrmTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the inListGrpInGrmTypeGenericDetailSerialNum property.
     * 
     */
    public void setInListGrpInGrmTypeGenericDetailSerialNum(int value) {
        this.inListGrpInGrmTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the inListGrpInGrmTypeGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInListGrpInGrmTypeGenericDetailShortDescription() {
        return inListGrpInGrmTypeGenericDetailShortDescription;
    }

    /**
     * Sets the value of the inListGrpInGrmTypeGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInListGrpInGrmTypeGenericDetailShortDescription(String value) {
        this.inListGrpInGrmTypeGenericDetailShortDescription = value;
    }

}
