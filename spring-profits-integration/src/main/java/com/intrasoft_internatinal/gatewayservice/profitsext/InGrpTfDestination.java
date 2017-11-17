
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGrpTfDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpTfDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpTfDestinationInGrmTfDestinationDestinationDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpTfDestinationInGrmTfDestinationReceivingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpTfDestinationInGrmTfDestinationSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpTfDestination", propOrder = {
    "inGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag",
    "inGrpTfDestinationInGrmTfDestinationDestinationDescr",
    "inGrpTfDestinationInGrmTfDestinationReceivingDate",
    "inGrpTfDestinationInGrmTfDestinationSn",
    "inGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar"
})
public class InGrpTfDestination {

    @XmlElement(name = "InGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag")
    protected String inGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag;
    @XmlElement(name = "InGrpTfDestinationInGrmTfDestinationDestinationDescr")
    protected String inGrpTfDestinationInGrmTfDestinationDestinationDescr;
    @XmlElement(name = "InGrpTfDestinationInGrmTfDestinationReceivingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpTfDestinationInGrmTfDestinationReceivingDate;
    @XmlElement(name = "InGrpTfDestinationInGrmTfDestinationSn")
    protected short inGrpTfDestinationInGrmTfDestinationSn;
    @XmlElement(name = "InGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar")
    protected String inGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag() {
        return inGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag;
    }

    /**
     * Sets the value of the inGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag(String value) {
        this.inGrpTfDestinationInGrmDestinationStatusIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpTfDestinationInGrmTfDestinationDestinationDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpTfDestinationInGrmTfDestinationDestinationDescr() {
        return inGrpTfDestinationInGrmTfDestinationDestinationDescr;
    }

    /**
     * Sets the value of the inGrpTfDestinationInGrmTfDestinationDestinationDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpTfDestinationInGrmTfDestinationDestinationDescr(String value) {
        this.inGrpTfDestinationInGrmTfDestinationDestinationDescr = value;
    }

    /**
     * Gets the value of the inGrpTfDestinationInGrmTfDestinationReceivingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpTfDestinationInGrmTfDestinationReceivingDate() {
        return inGrpTfDestinationInGrmTfDestinationReceivingDate;
    }

    /**
     * Sets the value of the inGrpTfDestinationInGrmTfDestinationReceivingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpTfDestinationInGrmTfDestinationReceivingDate(XMLGregorianCalendar value) {
        this.inGrpTfDestinationInGrmTfDestinationReceivingDate = value;
    }

    /**
     * Gets the value of the inGrpTfDestinationInGrmTfDestinationSn property.
     * 
     */
    public short getInGrpTfDestinationInGrmTfDestinationSn() {
        return inGrpTfDestinationInGrmTfDestinationSn;
    }

    /**
     * Sets the value of the inGrpTfDestinationInGrmTfDestinationSn property.
     * 
     */
    public void setInGrpTfDestinationInGrmTfDestinationSn(short value) {
        this.inGrpTfDestinationInGrmTfDestinationSn = value;
    }

    /**
     * Gets the value of the inGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar() {
        return inGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar(String value) {
        this.inGrpTfDestinationInGrmTfDestinationIefSuppliedSelectChar = value;
    }

}
