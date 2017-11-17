
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for P0831VOutGrpUnitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="P0831VOutGrpUnitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpUnitOutGrmUnitIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUnitOutGrmUnitUnitCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpUnitOutGrmUnitUnitUnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "P0831VOutGrpUnitItem", propOrder = {
    "outGrpUnitOutGrmUnitIefSuppliedSelectChar",
    "outGrpUnitOutGrmUnitUnitCode",
    "outGrpUnitOutGrmUnitUnitUnitName"
})
public class P0831VOutGrpUnitItem {

    @XmlElement(name = "OutGrpUnitOutGrmUnitIefSuppliedSelectChar")
    protected String outGrpUnitOutGrmUnitIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpUnitOutGrmUnitUnitCode")
    protected int outGrpUnitOutGrmUnitUnitCode;
    @XmlElement(name = "OutGrpUnitOutGrmUnitUnitUnitName")
    protected String outGrpUnitOutGrmUnitUnitUnitName;

    /**
     * Gets the value of the outGrpUnitOutGrmUnitIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnitOutGrmUnitIefSuppliedSelectChar() {
        return outGrpUnitOutGrmUnitIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpUnitOutGrmUnitIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnitOutGrmUnitIefSuppliedSelectChar(String value) {
        this.outGrpUnitOutGrmUnitIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpUnitOutGrmUnitUnitCode property.
     * 
     */
    public int getOutGrpUnitOutGrmUnitUnitCode() {
        return outGrpUnitOutGrmUnitUnitCode;
    }

    /**
     * Sets the value of the outGrpUnitOutGrmUnitUnitCode property.
     * 
     */
    public void setOutGrpUnitOutGrmUnitUnitCode(int value) {
        this.outGrpUnitOutGrmUnitUnitCode = value;
    }

    /**
     * Gets the value of the outGrpUnitOutGrmUnitUnitUnitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUnitOutGrmUnitUnitUnitName() {
        return outGrpUnitOutGrmUnitUnitUnitName;
    }

    /**
     * Sets the value of the outGrpUnitOutGrmUnitUnitUnitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUnitOutGrmUnitUnitUnitName(String value) {
        this.outGrpUnitOutGrmUnitUnitUnitName = value;
    }

}
