
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for R0236VLOutGrpPermHissuItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VLOutGrpPermHissuItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPermHissuOutGrmHissuFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermHissuOutGrmHissuGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermHissuOutGrmHissuGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VLOutGrpPermHissuItem", propOrder = {
    "outGrpPermHissuOutGrmHissuFlagIefSuppliedFlag",
    "outGrpPermHissuOutGrmHissuGenericDetailDescription",
    "outGrpPermHissuOutGrmHissuGenericDetailSerialNum"
})
public class R0236VLOutGrpPermHissuItem {

    @XmlElement(name = "OutGrpPermHissuOutGrmHissuFlagIefSuppliedFlag")
    protected String outGrpPermHissuOutGrmHissuFlagIefSuppliedFlag;
    @XmlElement(name = "OutGrpPermHissuOutGrmHissuGenericDetailDescription")
    protected String outGrpPermHissuOutGrmHissuGenericDetailDescription;
    @XmlElement(name = "OutGrpPermHissuOutGrmHissuGenericDetailSerialNum")
    protected int outGrpPermHissuOutGrmHissuGenericDetailSerialNum;

    /**
     * Gets the value of the outGrpPermHissuOutGrmHissuFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermHissuOutGrmHissuFlagIefSuppliedFlag() {
        return outGrpPermHissuOutGrmHissuFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpPermHissuOutGrmHissuFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermHissuOutGrmHissuFlagIefSuppliedFlag(String value) {
        this.outGrpPermHissuOutGrmHissuFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpPermHissuOutGrmHissuGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermHissuOutGrmHissuGenericDetailDescription() {
        return outGrpPermHissuOutGrmHissuGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpPermHissuOutGrmHissuGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermHissuOutGrmHissuGenericDetailDescription(String value) {
        this.outGrpPermHissuOutGrmHissuGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpPermHissuOutGrmHissuGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpPermHissuOutGrmHissuGenericDetailSerialNum() {
        return outGrpPermHissuOutGrmHissuGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpPermHissuOutGrmHissuGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpPermHissuOutGrmHissuGenericDetailSerialNum(int value) {
        this.outGrpPermHissuOutGrmHissuGenericDetailSerialNum = value;
    }

}
