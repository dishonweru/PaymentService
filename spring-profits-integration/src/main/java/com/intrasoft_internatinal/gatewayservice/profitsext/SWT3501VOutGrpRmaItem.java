
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SWT3501VOutGrpRmaItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWT3501VOutGrpRmaItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpRmaOutGrmRmaSwiftAllnceRmaBic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRmaOutGrmRmaSwiftAllnceRmaEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpRmaOutGrmRmaSwiftAllnceRmaStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpRmaOutSelRmaIefSuppliedFlagEmpty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWT3501VOutGrpRmaItem", propOrder = {
    "outGrpRmaOutGrmRmaSwiftAllnceRmaBic",
    "outGrpRmaOutGrmRmaSwiftAllnceRmaEndDate",
    "outGrpRmaOutGrmRmaSwiftAllnceRmaStartDate",
    "outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn",
    "outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut",
    "outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType",
    "outGrpRmaOutSelRmaIefSuppliedFlagEmpty"
})
public class SWT3501VOutGrpRmaItem {

    @XmlElement(name = "OutGrpRmaOutGrmRmaSwiftAllnceRmaBic")
    protected String outGrpRmaOutGrmRmaSwiftAllnceRmaBic;
    @XmlElement(name = "OutGrpRmaOutGrmRmaSwiftAllnceRmaEndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpRmaOutGrmRmaSwiftAllnceRmaEndDate;
    @XmlElement(name = "OutGrpRmaOutGrmRmaSwiftAllnceRmaStartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpRmaOutGrmRmaSwiftAllnceRmaStartDate;
    @XmlElement(name = "OutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn")
    protected String outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn;
    @XmlElement(name = "OutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut")
    protected String outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut;
    @XmlElement(name = "OutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType")
    protected String outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType;
    @XmlElement(name = "OutGrpRmaOutSelRmaIefSuppliedFlagEmpty")
    protected String outGrpRmaOutSelRmaIefSuppliedFlagEmpty;

    /**
     * Gets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaBic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRmaOutGrmRmaSwiftAllnceRmaBic() {
        return outGrpRmaOutGrmRmaSwiftAllnceRmaBic;
    }

    /**
     * Sets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaBic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRmaOutGrmRmaSwiftAllnceRmaBic(String value) {
        this.outGrpRmaOutGrmRmaSwiftAllnceRmaBic = value;
    }

    /**
     * Gets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpRmaOutGrmRmaSwiftAllnceRmaEndDate() {
        return outGrpRmaOutGrmRmaSwiftAllnceRmaEndDate;
    }

    /**
     * Sets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpRmaOutGrmRmaSwiftAllnceRmaEndDate(XMLGregorianCalendar value) {
        this.outGrpRmaOutGrmRmaSwiftAllnceRmaEndDate = value;
    }

    /**
     * Gets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpRmaOutGrmRmaSwiftAllnceRmaStartDate() {
        return outGrpRmaOutGrmRmaSwiftAllnceRmaStartDate;
    }

    /**
     * Sets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpRmaOutGrmRmaSwiftAllnceRmaStartDate(XMLGregorianCalendar value) {
        this.outGrpRmaOutGrmRmaSwiftAllnceRmaStartDate = value;
    }

    /**
     * Gets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn() {
        return outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn;
    }

    /**
     * Sets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn(String value) {
        this.outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnIn = value;
    }

    /**
     * Gets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut() {
        return outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut;
    }

    /**
     * Sets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut(String value) {
        this.outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftConnOut = value;
    }

    /**
     * Gets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType() {
        return outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType;
    }

    /**
     * Sets the value of the outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType(String value) {
        this.outGrpRmaOutGrmRmaSwiftAllnceRmaSwiftType = value;
    }

    /**
     * Gets the value of the outGrpRmaOutSelRmaIefSuppliedFlagEmpty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpRmaOutSelRmaIefSuppliedFlagEmpty() {
        return outGrpRmaOutSelRmaIefSuppliedFlagEmpty;
    }

    /**
     * Sets the value of the outGrpRmaOutSelRmaIefSuppliedFlagEmpty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpRmaOutSelRmaIefSuppliedFlagEmpty(String value) {
        this.outGrpRmaOutSelRmaIefSuppliedFlagEmpty = value;
    }

}
