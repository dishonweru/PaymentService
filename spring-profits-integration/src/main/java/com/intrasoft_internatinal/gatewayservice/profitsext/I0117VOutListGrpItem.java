
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0117VOutListGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0117VOutListGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutListGrpOutGrmCountryGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmCountryGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListGrpOutGrmCountryGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmCustomerIncompleteUComnt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmOtherIdExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrpOutGrmOtherIdIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmOtherIdIssueAuthority" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmOtherIdIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrpOutGrmOtherIdMainFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmOtherIdSerialNo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutListGrpOutGrmOtherIdTmstamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutListGrpOutGrmToBeDeletedIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmTypeGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutListGrpOutGrmTypeGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutListGrpOutGrmTypeGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0117VOutListGrpItem", propOrder = {
    "outListGrpOutGrmCountryGenericDetailDescription",
    "outListGrpOutGrmCountryGenericDetailSerialNum",
    "outListGrpOutGrmCountryGenericDetailShortDescription",
    "outListGrpOutGrmCustomerIncompleteUComnt",
    "outListGrpOutGrmIefSuppliedChar1",
    "outListGrpOutGrmIefSuppliedFlag",
    "outListGrpOutGrmIefSuppliedSelectChar",
    "outListGrpOutGrmOtherIdExpiryDate",
    "outListGrpOutGrmOtherIdIdNo",
    "outListGrpOutGrmOtherIdIssueAuthority",
    "outListGrpOutGrmOtherIdIssueDate",
    "outListGrpOutGrmOtherIdMainFlag",
    "outListGrpOutGrmOtherIdSerialNo",
    "outListGrpOutGrmOtherIdTmstamp",
    "outListGrpOutGrmToBeDeletedIefSuppliedFlag",
    "outListGrpOutGrmTypeGenericDetailDescription",
    "outListGrpOutGrmTypeGenericDetailSerialNum",
    "outListGrpOutGrmTypeGenericDetailShortDescription"
})
public class I0117VOutListGrpItem {

    @XmlElement(name = "OutListGrpOutGrmCountryGenericDetailDescription")
    protected String outListGrpOutGrmCountryGenericDetailDescription;
    @XmlElement(name = "OutListGrpOutGrmCountryGenericDetailSerialNum")
    protected int outListGrpOutGrmCountryGenericDetailSerialNum;
    @XmlElement(name = "OutListGrpOutGrmCountryGenericDetailShortDescription")
    protected String outListGrpOutGrmCountryGenericDetailShortDescription;
    @XmlElement(name = "OutListGrpOutGrmCustomerIncompleteUComnt")
    protected String outListGrpOutGrmCustomerIncompleteUComnt;
    @XmlElement(name = "OutListGrpOutGrmIefSuppliedChar1")
    protected String outListGrpOutGrmIefSuppliedChar1;
    @XmlElement(name = "OutListGrpOutGrmIefSuppliedFlag")
    protected String outListGrpOutGrmIefSuppliedFlag;
    @XmlElement(name = "OutListGrpOutGrmIefSuppliedSelectChar")
    protected String outListGrpOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutListGrpOutGrmOtherIdExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrpOutGrmOtherIdExpiryDate;
    @XmlElement(name = "OutListGrpOutGrmOtherIdIdNo")
    protected String outListGrpOutGrmOtherIdIdNo;
    @XmlElement(name = "OutListGrpOutGrmOtherIdIssueAuthority")
    protected String outListGrpOutGrmOtherIdIssueAuthority;
    @XmlElement(name = "OutListGrpOutGrmOtherIdIssueDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrpOutGrmOtherIdIssueDate;
    @XmlElement(name = "OutListGrpOutGrmOtherIdMainFlag")
    protected String outListGrpOutGrmOtherIdMainFlag;
    @XmlElement(name = "OutListGrpOutGrmOtherIdSerialNo")
    protected short outListGrpOutGrmOtherIdSerialNo;
    @XmlElement(name = "OutListGrpOutGrmOtherIdTmstamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outListGrpOutGrmOtherIdTmstamp;
    @XmlElement(name = "OutListGrpOutGrmToBeDeletedIefSuppliedFlag")
    protected String outListGrpOutGrmToBeDeletedIefSuppliedFlag;
    @XmlElement(name = "OutListGrpOutGrmTypeGenericDetailDescription")
    protected String outListGrpOutGrmTypeGenericDetailDescription;
    @XmlElement(name = "OutListGrpOutGrmTypeGenericDetailSerialNum")
    protected int outListGrpOutGrmTypeGenericDetailSerialNum;
    @XmlElement(name = "OutListGrpOutGrmTypeGenericDetailShortDescription")
    protected String outListGrpOutGrmTypeGenericDetailShortDescription;

    /**
     * Gets the value of the outListGrpOutGrmCountryGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmCountryGenericDetailDescription() {
        return outListGrpOutGrmCountryGenericDetailDescription;
    }

    /**
     * Sets the value of the outListGrpOutGrmCountryGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmCountryGenericDetailDescription(String value) {
        this.outListGrpOutGrmCountryGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmCountryGenericDetailSerialNum property.
     * 
     */
    public int getOutListGrpOutGrmCountryGenericDetailSerialNum() {
        return outListGrpOutGrmCountryGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outListGrpOutGrmCountryGenericDetailSerialNum property.
     * 
     */
    public void setOutListGrpOutGrmCountryGenericDetailSerialNum(int value) {
        this.outListGrpOutGrmCountryGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmCountryGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmCountryGenericDetailShortDescription() {
        return outListGrpOutGrmCountryGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outListGrpOutGrmCountryGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmCountryGenericDetailShortDescription(String value) {
        this.outListGrpOutGrmCountryGenericDetailShortDescription = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmCustomerIncompleteUComnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmCustomerIncompleteUComnt() {
        return outListGrpOutGrmCustomerIncompleteUComnt;
    }

    /**
     * Sets the value of the outListGrpOutGrmCustomerIncompleteUComnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmCustomerIncompleteUComnt(String value) {
        this.outListGrpOutGrmCustomerIncompleteUComnt = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmIefSuppliedChar1() {
        return outListGrpOutGrmIefSuppliedChar1;
    }

    /**
     * Sets the value of the outListGrpOutGrmIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmIefSuppliedChar1(String value) {
        this.outListGrpOutGrmIefSuppliedChar1 = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmIefSuppliedFlag() {
        return outListGrpOutGrmIefSuppliedFlag;
    }

    /**
     * Sets the value of the outListGrpOutGrmIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmIefSuppliedFlag(String value) {
        this.outListGrpOutGrmIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmIefSuppliedSelectChar() {
        return outListGrpOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outListGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmIefSuppliedSelectChar(String value) {
        this.outListGrpOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmOtherIdExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrpOutGrmOtherIdExpiryDate() {
        return outListGrpOutGrmOtherIdExpiryDate;
    }

    /**
     * Sets the value of the outListGrpOutGrmOtherIdExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrpOutGrmOtherIdExpiryDate(XMLGregorianCalendar value) {
        this.outListGrpOutGrmOtherIdExpiryDate = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmOtherIdIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmOtherIdIdNo() {
        return outListGrpOutGrmOtherIdIdNo;
    }

    /**
     * Sets the value of the outListGrpOutGrmOtherIdIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmOtherIdIdNo(String value) {
        this.outListGrpOutGrmOtherIdIdNo = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmOtherIdIssueAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmOtherIdIssueAuthority() {
        return outListGrpOutGrmOtherIdIssueAuthority;
    }

    /**
     * Sets the value of the outListGrpOutGrmOtherIdIssueAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmOtherIdIssueAuthority(String value) {
        this.outListGrpOutGrmOtherIdIssueAuthority = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmOtherIdIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrpOutGrmOtherIdIssueDate() {
        return outListGrpOutGrmOtherIdIssueDate;
    }

    /**
     * Sets the value of the outListGrpOutGrmOtherIdIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrpOutGrmOtherIdIssueDate(XMLGregorianCalendar value) {
        this.outListGrpOutGrmOtherIdIssueDate = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmOtherIdMainFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmOtherIdMainFlag() {
        return outListGrpOutGrmOtherIdMainFlag;
    }

    /**
     * Sets the value of the outListGrpOutGrmOtherIdMainFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmOtherIdMainFlag(String value) {
        this.outListGrpOutGrmOtherIdMainFlag = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmOtherIdSerialNo property.
     * 
     */
    public short getOutListGrpOutGrmOtherIdSerialNo() {
        return outListGrpOutGrmOtherIdSerialNo;
    }

    /**
     * Sets the value of the outListGrpOutGrmOtherIdSerialNo property.
     * 
     */
    public void setOutListGrpOutGrmOtherIdSerialNo(short value) {
        this.outListGrpOutGrmOtherIdSerialNo = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmOtherIdTmstamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutListGrpOutGrmOtherIdTmstamp() {
        return outListGrpOutGrmOtherIdTmstamp;
    }

    /**
     * Sets the value of the outListGrpOutGrmOtherIdTmstamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutListGrpOutGrmOtherIdTmstamp(XMLGregorianCalendar value) {
        this.outListGrpOutGrmOtherIdTmstamp = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmToBeDeletedIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmToBeDeletedIefSuppliedFlag() {
        return outListGrpOutGrmToBeDeletedIefSuppliedFlag;
    }

    /**
     * Sets the value of the outListGrpOutGrmToBeDeletedIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmToBeDeletedIefSuppliedFlag(String value) {
        this.outListGrpOutGrmToBeDeletedIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmTypeGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmTypeGenericDetailDescription() {
        return outListGrpOutGrmTypeGenericDetailDescription;
    }

    /**
     * Sets the value of the outListGrpOutGrmTypeGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmTypeGenericDetailDescription(String value) {
        this.outListGrpOutGrmTypeGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmTypeGenericDetailSerialNum property.
     * 
     */
    public int getOutListGrpOutGrmTypeGenericDetailSerialNum() {
        return outListGrpOutGrmTypeGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outListGrpOutGrmTypeGenericDetailSerialNum property.
     * 
     */
    public void setOutListGrpOutGrmTypeGenericDetailSerialNum(int value) {
        this.outListGrpOutGrmTypeGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outListGrpOutGrmTypeGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutListGrpOutGrmTypeGenericDetailShortDescription() {
        return outListGrpOutGrmTypeGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outListGrpOutGrmTypeGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutListGrpOutGrmTypeGenericDetailShortDescription(String value) {
        this.outListGrpOutGrmTypeGenericDetailShortDescription = value;
    }

}
