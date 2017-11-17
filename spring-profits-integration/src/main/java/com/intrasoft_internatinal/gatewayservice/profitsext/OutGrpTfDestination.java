
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpTfDestination complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpTfDestination">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpTfDestinationOutGrmTfDestinationDestinationDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpTfDestinationOutGrmTfDestinationReceivingDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpTfDestinationOutGrmTfDestinationSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpTfDestination", propOrder = {
    "outGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag",
    "outGrpTfDestinationOutGrmTfDestinationDestinationDescr",
    "outGrpTfDestinationOutGrmTfDestinationReceivingDate",
    "outGrpTfDestinationOutGrmTfDestinationSn",
    "outGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar"
})
public class OutGrpTfDestination {

    @XmlElement(name = "OutGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag")
    protected String outGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag;
    @XmlElement(name = "OutGrpTfDestinationOutGrmTfDestinationDestinationDescr")
    protected String outGrpTfDestinationOutGrmTfDestinationDestinationDescr;
    @XmlElement(name = "OutGrpTfDestinationOutGrmTfDestinationReceivingDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpTfDestinationOutGrmTfDestinationReceivingDate;
    @XmlElement(name = "OutGrpTfDestinationOutGrmTfDestinationSn")
    protected short outGrpTfDestinationOutGrmTfDestinationSn;
    @XmlElement(name = "OutGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar")
    protected String outGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag() {
        return outGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag(String value) {
        this.outGrpTfDestinationOutGrmDestinationStatusIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpTfDestinationOutGrmTfDestinationDestinationDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTfDestinationOutGrmTfDestinationDestinationDescr() {
        return outGrpTfDestinationOutGrmTfDestinationDestinationDescr;
    }

    /**
     * Sets the value of the outGrpTfDestinationOutGrmTfDestinationDestinationDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTfDestinationOutGrmTfDestinationDestinationDescr(String value) {
        this.outGrpTfDestinationOutGrmTfDestinationDestinationDescr = value;
    }

    /**
     * Gets the value of the outGrpTfDestinationOutGrmTfDestinationReceivingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpTfDestinationOutGrmTfDestinationReceivingDate() {
        return outGrpTfDestinationOutGrmTfDestinationReceivingDate;
    }

    /**
     * Sets the value of the outGrpTfDestinationOutGrmTfDestinationReceivingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpTfDestinationOutGrmTfDestinationReceivingDate(XMLGregorianCalendar value) {
        this.outGrpTfDestinationOutGrmTfDestinationReceivingDate = value;
    }

    /**
     * Gets the value of the outGrpTfDestinationOutGrmTfDestinationSn property.
     * 
     */
    public short getOutGrpTfDestinationOutGrmTfDestinationSn() {
        return outGrpTfDestinationOutGrmTfDestinationSn;
    }

    /**
     * Sets the value of the outGrpTfDestinationOutGrmTfDestinationSn property.
     * 
     */
    public void setOutGrpTfDestinationOutGrmTfDestinationSn(short value) {
        this.outGrpTfDestinationOutGrmTfDestinationSn = value;
    }

    /**
     * Gets the value of the outGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar() {
        return outGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar(String value) {
        this.outGrpTfDestinationOutGrmTfDestinationIefSuppliedSelectChar = value;
    }

}
