
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for R0236VLOutGrpPermUnitItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VLOutGrpPermUnitItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPermUnitOutGrmUnitFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermUnitOutGrmUnitGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermUnitOutGrmUnitGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VLOutGrpPermUnitItem", propOrder = {
    "outGrpPermUnitOutGrmUnitFlagIefSuppliedFlag",
    "outGrpPermUnitOutGrmUnitGenericDetailDescription",
    "outGrpPermUnitOutGrmUnitGenericDetailSerialNum"
})
public class R0236VLOutGrpPermUnitItem {

    @XmlElement(name = "OutGrpPermUnitOutGrmUnitFlagIefSuppliedFlag")
    protected String outGrpPermUnitOutGrmUnitFlagIefSuppliedFlag;
    @XmlElement(name = "OutGrpPermUnitOutGrmUnitGenericDetailDescription")
    protected String outGrpPermUnitOutGrmUnitGenericDetailDescription;
    @XmlElement(name = "OutGrpPermUnitOutGrmUnitGenericDetailSerialNum")
    protected int outGrpPermUnitOutGrmUnitGenericDetailSerialNum;

    /**
     * Gets the value of the outGrpPermUnitOutGrmUnitFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermUnitOutGrmUnitFlagIefSuppliedFlag() {
        return outGrpPermUnitOutGrmUnitFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpPermUnitOutGrmUnitFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermUnitOutGrmUnitFlagIefSuppliedFlag(String value) {
        this.outGrpPermUnitOutGrmUnitFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpPermUnitOutGrmUnitGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermUnitOutGrmUnitGenericDetailDescription() {
        return outGrpPermUnitOutGrmUnitGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpPermUnitOutGrmUnitGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermUnitOutGrmUnitGenericDetailDescription(String value) {
        this.outGrpPermUnitOutGrmUnitGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpPermUnitOutGrmUnitGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpPermUnitOutGrmUnitGenericDetailSerialNum() {
        return outGrpPermUnitOutGrmUnitGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpPermUnitOutGrmUnitGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpPermUnitOutGrmUnitGenericDetailSerialNum(int value) {
        this.outGrpPermUnitOutGrmUnitGenericDetailSerialNum = value;
    }

}
