
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InGrpTfShipment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InGrpTfShipment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpTfShipmentInGrmTfShipmentShipmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="InGrpTfShipmentInGrmTfShipmentShipmentDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InGrpTfShipmentInGrmTfShipmentSn" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="InGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InGrpTfShipment", propOrder = {
    "inGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag",
    "inGrpTfShipmentInGrmTfShipmentShipmentDate",
    "inGrpTfShipmentInGrmTfShipmentShipmentDescr",
    "inGrpTfShipmentInGrmTfShipmentSn",
    "inGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar"
})
public class InGrpTfShipment {

    @XmlElement(name = "InGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag")
    protected String inGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag;
    @XmlElement(name = "InGrpTfShipmentInGrmTfShipmentShipmentDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inGrpTfShipmentInGrmTfShipmentShipmentDate;
    @XmlElement(name = "InGrpTfShipmentInGrmTfShipmentShipmentDescr")
    protected String inGrpTfShipmentInGrmTfShipmentShipmentDescr;
    @XmlElement(name = "InGrpTfShipmentInGrmTfShipmentSn")
    protected short inGrpTfShipmentInGrmTfShipmentSn;
    @XmlElement(name = "InGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar")
    protected String inGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar;

    /**
     * Gets the value of the inGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag() {
        return inGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag;
    }

    /**
     * Sets the value of the inGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag(String value) {
        this.inGrpTfShipmentInGrmShipmentStatusIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the inGrpTfShipmentInGrmTfShipmentShipmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInGrpTfShipmentInGrmTfShipmentShipmentDate() {
        return inGrpTfShipmentInGrmTfShipmentShipmentDate;
    }

    /**
     * Sets the value of the inGrpTfShipmentInGrmTfShipmentShipmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInGrpTfShipmentInGrmTfShipmentShipmentDate(XMLGregorianCalendar value) {
        this.inGrpTfShipmentInGrmTfShipmentShipmentDate = value;
    }

    /**
     * Gets the value of the inGrpTfShipmentInGrmTfShipmentShipmentDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpTfShipmentInGrmTfShipmentShipmentDescr() {
        return inGrpTfShipmentInGrmTfShipmentShipmentDescr;
    }

    /**
     * Sets the value of the inGrpTfShipmentInGrmTfShipmentShipmentDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpTfShipmentInGrmTfShipmentShipmentDescr(String value) {
        this.inGrpTfShipmentInGrmTfShipmentShipmentDescr = value;
    }

    /**
     * Gets the value of the inGrpTfShipmentInGrmTfShipmentSn property.
     * 
     */
    public short getInGrpTfShipmentInGrmTfShipmentSn() {
        return inGrpTfShipmentInGrmTfShipmentSn;
    }

    /**
     * Sets the value of the inGrpTfShipmentInGrmTfShipmentSn property.
     * 
     */
    public void setInGrpTfShipmentInGrmTfShipmentSn(short value) {
        this.inGrpTfShipmentInGrmTfShipmentSn = value;
    }

    /**
     * Gets the value of the inGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar() {
        return inGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the inGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar(String value) {
        this.inGrpTfShipmentInGrmTfShipmentIefSuppliedSelectChar = value;
    }

}
