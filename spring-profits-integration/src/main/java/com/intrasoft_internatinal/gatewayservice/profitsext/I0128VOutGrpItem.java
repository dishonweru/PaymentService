
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for I0128VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I0128VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmCustomerCDigit" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpOutGrmCustomerCustId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmCustomerCustType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmCustomerSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmRelationshipEffectiveFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmRelationshipExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpOutGrmRelationshipTypeRelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmRelationshipTypeTypeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmOppositeIefSuppliedChar1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I0128VOutGrpItem", propOrder = {
    "outGrpOutGrmCustomerCDigit",
    "outGrpOutGrmCustomerCustId",
    "outGrpOutGrmCustomerCustType",
    "outGrpOutGrmCustomerSurname",
    "outGrpOutGrmIefSuppliedSelectChar",
    "outGrpOutGrmRelationshipEffectiveFrom",
    "outGrpOutGrmRelationshipExpiryDate",
    "outGrpOutGrmRelationshipTypeRelDescription",
    "outGrpOutGrmRelationshipTypeTypeId",
    "outGrpOutGrmOppositeIefSuppliedChar1"
})
public class I0128VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmCustomerCDigit")
    protected short outGrpOutGrmCustomerCDigit;
    @XmlElement(name = "OutGrpOutGrmCustomerCustId")
    protected int outGrpOutGrmCustomerCustId;
    @XmlElement(name = "OutGrpOutGrmCustomerCustType")
    protected String outGrpOutGrmCustomerCustType;
    @XmlElement(name = "OutGrpOutGrmCustomerSurname")
    protected String outGrpOutGrmCustomerSurname;
    @XmlElement(name = "OutGrpOutGrmIefSuppliedSelectChar")
    protected String outGrpOutGrmIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpOutGrmRelationshipEffectiveFrom", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmRelationshipEffectiveFrom;
    @XmlElement(name = "OutGrpOutGrmRelationshipExpiryDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpOutGrmRelationshipExpiryDate;
    @XmlElement(name = "OutGrpOutGrmRelationshipTypeRelDescription")
    protected String outGrpOutGrmRelationshipTypeRelDescription;
    @XmlElement(name = "OutGrpOutGrmRelationshipTypeTypeId")
    protected String outGrpOutGrmRelationshipTypeTypeId;
    @XmlElement(name = "OutGrpOutGrmOppositeIefSuppliedChar1")
    protected String outGrpOutGrmOppositeIefSuppliedChar1;

    /**
     * Gets the value of the outGrpOutGrmCustomerCDigit property.
     * 
     */
    public short getOutGrpOutGrmCustomerCDigit() {
        return outGrpOutGrmCustomerCDigit;
    }

    /**
     * Sets the value of the outGrpOutGrmCustomerCDigit property.
     * 
     */
    public void setOutGrpOutGrmCustomerCDigit(short value) {
        this.outGrpOutGrmCustomerCDigit = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustomerCustId property.
     * 
     */
    public int getOutGrpOutGrmCustomerCustId() {
        return outGrpOutGrmCustomerCustId;
    }

    /**
     * Sets the value of the outGrpOutGrmCustomerCustId property.
     * 
     */
    public void setOutGrpOutGrmCustomerCustId(int value) {
        this.outGrpOutGrmCustomerCustId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustomerCustType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCustomerCustType() {
        return outGrpOutGrmCustomerCustType;
    }

    /**
     * Sets the value of the outGrpOutGrmCustomerCustType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCustomerCustType(String value) {
        this.outGrpOutGrmCustomerCustType = value;
    }

    /**
     * Gets the value of the outGrpOutGrmCustomerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmCustomerSurname() {
        return outGrpOutGrmCustomerSurname;
    }

    /**
     * Sets the value of the outGrpOutGrmCustomerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmCustomerSurname(String value) {
        this.outGrpOutGrmCustomerSurname = value;
    }

    /**
     * Gets the value of the outGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmIefSuppliedSelectChar() {
        return outGrpOutGrmIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpOutGrmIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmIefSuppliedSelectChar(String value) {
        this.outGrpOutGrmIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpOutGrmRelationshipEffectiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmRelationshipEffectiveFrom() {
        return outGrpOutGrmRelationshipEffectiveFrom;
    }

    /**
     * Sets the value of the outGrpOutGrmRelationshipEffectiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmRelationshipEffectiveFrom(XMLGregorianCalendar value) {
        this.outGrpOutGrmRelationshipEffectiveFrom = value;
    }

    /**
     * Gets the value of the outGrpOutGrmRelationshipExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpOutGrmRelationshipExpiryDate() {
        return outGrpOutGrmRelationshipExpiryDate;
    }

    /**
     * Sets the value of the outGrpOutGrmRelationshipExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpOutGrmRelationshipExpiryDate(XMLGregorianCalendar value) {
        this.outGrpOutGrmRelationshipExpiryDate = value;
    }

    /**
     * Gets the value of the outGrpOutGrmRelationshipTypeRelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmRelationshipTypeRelDescription() {
        return outGrpOutGrmRelationshipTypeRelDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmRelationshipTypeRelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmRelationshipTypeRelDescription(String value) {
        this.outGrpOutGrmRelationshipTypeRelDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmRelationshipTypeTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmRelationshipTypeTypeId() {
        return outGrpOutGrmRelationshipTypeTypeId;
    }

    /**
     * Sets the value of the outGrpOutGrmRelationshipTypeTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmRelationshipTypeTypeId(String value) {
        this.outGrpOutGrmRelationshipTypeTypeId = value;
    }

    /**
     * Gets the value of the outGrpOutGrmOppositeIefSuppliedChar1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmOppositeIefSuppliedChar1() {
        return outGrpOutGrmOppositeIefSuppliedChar1;
    }

    /**
     * Sets the value of the outGrpOutGrmOppositeIefSuppliedChar1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmOppositeIefSuppliedChar1(String value) {
        this.outGrpOutGrmOppositeIefSuppliedChar1 = value;
    }

}
