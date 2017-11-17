
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DTF078VOutGrpClearingSystemItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTF078VOutGrpClearingSystemItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTF078VOutGrpClearingSystemItem", propOrder = {
    "outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode",
    "outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName",
    "outGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar"
})
public class DTF078VOutGrpClearingSystemItem {

    @XmlElement(name = "OutGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode")
    protected String outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode;
    @XmlElement(name = "OutGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName")
    protected String outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName;
    @XmlElement(name = "OutGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar")
    protected String outGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar;

    /**
     * Gets the value of the outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode() {
        return outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode;
    }

    /**
     * Sets the value of the outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode(String value) {
        this.outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmCode = value;
    }

    /**
     * Gets the value of the outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName() {
        return outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName;
    }

    /**
     * Sets the value of the outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName(String value) {
        this.outGrpClearingSystemOutGrmClearingSystemIpsClearingSystemCsmName = value;
    }

    /**
     * Gets the value of the outGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar() {
        return outGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar(String value) {
        this.outGrpClearingSystemOutGrmClearingSystemIefSuppliedSelectChar = value;
    }

}
