
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PAR20VOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PAR20VOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpOutGrmGenericDetailShortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PAR20VOutGrpItem", propOrder = {
    "outGrpOutGrmGenericDetailDescription",
    "outGrpOutGrmGenericDetailSerialNum",
    "outGrpOutGrmGenericDetailShortDescription"
})
public class PAR20VOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmGenericDetailDescription")
    protected String outGrpOutGrmGenericDetailDescription;
    @XmlElement(name = "OutGrpOutGrmGenericDetailSerialNum")
    protected int outGrpOutGrmGenericDetailSerialNum;
    @XmlElement(name = "OutGrpOutGrmGenericDetailShortDescription")
    protected String outGrpOutGrmGenericDetailShortDescription;

    /**
     * Gets the value of the outGrpOutGrmGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmGenericDetailDescription() {
        return outGrpOutGrmGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmGenericDetailDescription(String value) {
        this.outGrpOutGrmGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpOutGrmGenericDetailSerialNum() {
        return outGrpOutGrmGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpOutGrmGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpOutGrmGenericDetailSerialNum(int value) {
        this.outGrpOutGrmGenericDetailSerialNum = value;
    }

    /**
     * Gets the value of the outGrpOutGrmGenericDetailShortDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmGenericDetailShortDescription() {
        return outGrpOutGrmGenericDetailShortDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmGenericDetailShortDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmGenericDetailShortDescription(String value) {
        this.outGrpOutGrmGenericDetailShortDescription = value;
    }

}
