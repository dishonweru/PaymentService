
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SWT3501VInGrpRmaItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501VInGrpRmaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpRmaInGrmRmaSwiftAllnceRmaBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRmaInGrmRmaSwiftAllnceRmaEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpRmaInGrmRmaSwiftAllnceRmaStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRmaInGrmRmaSwiftAllnceRmaSwiftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpRmaInSelRmaIefSuppliedFlagEmpty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501VInGrpRmaItem", propOrder = {
    "inGrpRmaInGrmRmaSwiftAllnceRmaBic",
    "inGrpRmaInGrmRmaSwiftAllnceRmaEndDate",
    "inGrpRmaInGrmRmaSwiftAllnceRmaStartDate",
    "inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn",
    "inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut",
    "inGrpRmaInGrmRmaSwiftAllnceRmaSwiftType",
    "inGrpRmaInSelRmaIefSuppliedFlagEmpty"
})
public class SWT3501VInGrpRmaItem {

    @XmlElement(name = "InGrpRmaInGrmRmaSwiftAllnceRmaBic")
    protected String inGrpRmaInGrmRmaSwiftAllnceRmaBic;
    @XmlElement(name = "InGrpRmaInGrmRmaSwiftAllnceRmaEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpRmaInGrmRmaSwiftAllnceRmaEndDate;
    @XmlElement(name = "InGrpRmaInGrmRmaSwiftAllnceRmaStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpRmaInGrmRmaSwiftAllnceRmaStartDate;
    @XmlElement(name = "InGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn")
    protected String inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn;
    @XmlElement(name = "InGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut")
    protected String inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut;
    @XmlElement(name = "InGrpRmaInGrmRmaSwiftAllnceRmaSwiftType")
    protected String inGrpRmaInGrmRmaSwiftAllnceRmaSwiftType;
    @XmlElement(name = "InGrpRmaInSelRmaIefSuppliedFlagEmpty")
    protected String inGrpRmaInSelRmaIefSuppliedFlagEmpty;

    /**
     * Gets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRmaInGrmRmaSwiftAllnceRmaBic() {
        return inGrpRmaInGrmRmaSwiftAllnceRmaBic;
    }

    /**
     * Sets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRmaInGrmRmaSwiftAllnceRmaBic(String value) {
        this.inGrpRmaInGrmRmaSwiftAllnceRmaBic = value;
    }

    /**
     * Gets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpRmaInGrmRmaSwiftAllnceRmaEndDate() {
        return inGrpRmaInGrmRmaSwiftAllnceRmaEndDate;
    }

    /**
     * Sets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpRmaInGrmRmaSwiftAllnceRmaEndDate(XMLGregorianCalendar value) {
        this.inGrpRmaInGrmRmaSwiftAllnceRmaEndDate = value;
    }

    /**
     * Gets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpRmaInGrmRmaSwiftAllnceRmaStartDate() {
        return inGrpRmaInGrmRmaSwiftAllnceRmaStartDate;
    }

    /**
     * Sets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpRmaInGrmRmaSwiftAllnceRmaStartDate(XMLGregorianCalendar value) {
        this.inGrpRmaInGrmRmaSwiftAllnceRmaStartDate = value;
    }

    /**
     * Gets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn() {
        return inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn;
    }

    /**
     * Sets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn(String value) {
        this.inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnIn = value;
    }

    /**
     * Gets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut() {
        return inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut;
    }

    /**
     * Sets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut(String value) {
        this.inGrpRmaInGrmRmaSwiftAllnceRmaSwiftConnOut = value;
    }

    /**
     * Gets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaSwiftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRmaInGrmRmaSwiftAllnceRmaSwiftType() {
        return inGrpRmaInGrmRmaSwiftAllnceRmaSwiftType;
    }

    /**
     * Sets the value of the inGrpRmaInGrmRmaSwiftAllnceRmaSwiftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRmaInGrmRmaSwiftAllnceRmaSwiftType(String value) {
        this.inGrpRmaInGrmRmaSwiftAllnceRmaSwiftType = value;
    }

    /**
     * Gets the value of the inGrpRmaInSelRmaIefSuppliedFlagEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpRmaInSelRmaIefSuppliedFlagEmpty() {
        return inGrpRmaInSelRmaIefSuppliedFlagEmpty;
    }

    /**
     * Sets the value of the inGrpRmaInSelRmaIefSuppliedFlagEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpRmaInSelRmaIefSuppliedFlagEmpty(String value) {
        this.inGrpRmaInSelRmaIefSuppliedFlagEmpty = value;
    }

}
