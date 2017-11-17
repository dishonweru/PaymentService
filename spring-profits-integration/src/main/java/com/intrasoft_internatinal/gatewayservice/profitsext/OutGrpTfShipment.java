
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OutGrpTfShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpTfShipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpTfShipmentOutGrmTfShipmentShipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="OutGrpTfShipmentOutGrmTfShipmentShipmentDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpTfShipmentOutGrmTfShipmentSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="OutGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpTfShipment", propOrder = {
    "outGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag",
    "outGrpTfShipmentOutGrmTfShipmentShipmentDate",
    "outGrpTfShipmentOutGrmTfShipmentShipmentDescr",
    "outGrpTfShipmentOutGrmTfShipmentSn",
    "outGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar"
})
public class OutGrpTfShipment {

    @XmlElement(name = "OutGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag")
    protected String outGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag;
    @XmlElement(name = "OutGrpTfShipmentOutGrmTfShipmentShipmentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar outGrpTfShipmentOutGrmTfShipmentShipmentDate;
    @XmlElement(name = "OutGrpTfShipmentOutGrmTfShipmentShipmentDescr")
    protected String outGrpTfShipmentOutGrmTfShipmentShipmentDescr;
    @XmlElement(name = "OutGrpTfShipmentOutGrmTfShipmentSn")
    protected short outGrpTfShipmentOutGrmTfShipmentSn;
    @XmlElement(name = "OutGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar")
    protected String outGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag() {
        return outGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag(String value) {
        this.outGrpTfShipmentOutGrmShipmentStatusIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpTfShipmentOutGrmTfShipmentShipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOutGrpTfShipmentOutGrmTfShipmentShipmentDate() {
        return outGrpTfShipmentOutGrmTfShipmentShipmentDate;
    }

    /**
     * Sets the value of the outGrpTfShipmentOutGrmTfShipmentShipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOutGrpTfShipmentOutGrmTfShipmentShipmentDate(XMLGregorianCalendar value) {
        this.outGrpTfShipmentOutGrmTfShipmentShipmentDate = value;
    }

    /**
     * Gets the value of the outGrpTfShipmentOutGrmTfShipmentShipmentDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTfShipmentOutGrmTfShipmentShipmentDescr() {
        return outGrpTfShipmentOutGrmTfShipmentShipmentDescr;
    }

    /**
     * Sets the value of the outGrpTfShipmentOutGrmTfShipmentShipmentDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTfShipmentOutGrmTfShipmentShipmentDescr(String value) {
        this.outGrpTfShipmentOutGrmTfShipmentShipmentDescr = value;
    }

    /**
     * Gets the value of the outGrpTfShipmentOutGrmTfShipmentSn property.
     * 
     */
    public short getOutGrpTfShipmentOutGrmTfShipmentSn() {
        return outGrpTfShipmentOutGrmTfShipmentSn;
    }

    /**
     * Sets the value of the outGrpTfShipmentOutGrmTfShipmentSn property.
     * 
     */
    public void setOutGrpTfShipmentOutGrmTfShipmentSn(short value) {
        this.outGrpTfShipmentOutGrmTfShipmentSn = value;
    }

    /**
     * Gets the value of the outGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar() {
        return outGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar(String value) {
        this.outGrpTfShipmentOutGrmTfShipmentIefSuppliedSelectChar = value;
    }

}
