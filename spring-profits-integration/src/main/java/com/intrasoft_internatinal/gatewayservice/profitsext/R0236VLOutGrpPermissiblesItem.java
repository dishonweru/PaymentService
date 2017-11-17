
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for R0236VLOutGrpPermissiblesItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VLOutGrpPermissiblesItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPermissiblesOutGrmPermCategoryCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermissiblesOutGrmPermFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermissiblesOutGrmPermGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermissiblesOutGrmPermGenericDetailSerialNum" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VLOutGrpPermissiblesItem", propOrder = {
    "outGrpPermissiblesOutGrmPermCategoryCategoryCode",
    "outGrpPermissiblesOutGrmPermFlagIefSuppliedFlag",
    "outGrpPermissiblesOutGrmPermGenericDetailDescription",
    "outGrpPermissiblesOutGrmPermGenericDetailSerialNum"
})
public class R0236VLOutGrpPermissiblesItem {

    @XmlElement(name = "OutGrpPermissiblesOutGrmPermCategoryCategoryCode")
    protected String outGrpPermissiblesOutGrmPermCategoryCategoryCode;
    @XmlElement(name = "OutGrpPermissiblesOutGrmPermFlagIefSuppliedFlag")
    protected String outGrpPermissiblesOutGrmPermFlagIefSuppliedFlag;
    @XmlElement(name = "OutGrpPermissiblesOutGrmPermGenericDetailDescription")
    protected String outGrpPermissiblesOutGrmPermGenericDetailDescription;
    @XmlElement(name = "OutGrpPermissiblesOutGrmPermGenericDetailSerialNum")
    protected int outGrpPermissiblesOutGrmPermGenericDetailSerialNum;

    /**
     * Gets the value of the outGrpPermissiblesOutGrmPermCategoryCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermissiblesOutGrmPermCategoryCategoryCode() {
        return outGrpPermissiblesOutGrmPermCategoryCategoryCode;
    }

    /**
     * Sets the value of the outGrpPermissiblesOutGrmPermCategoryCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermissiblesOutGrmPermCategoryCategoryCode(String value) {
        this.outGrpPermissiblesOutGrmPermCategoryCategoryCode = value;
    }

    /**
     * Gets the value of the outGrpPermissiblesOutGrmPermFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermissiblesOutGrmPermFlagIefSuppliedFlag() {
        return outGrpPermissiblesOutGrmPermFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpPermissiblesOutGrmPermFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermissiblesOutGrmPermFlagIefSuppliedFlag(String value) {
        this.outGrpPermissiblesOutGrmPermFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpPermissiblesOutGrmPermGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermissiblesOutGrmPermGenericDetailDescription() {
        return outGrpPermissiblesOutGrmPermGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpPermissiblesOutGrmPermGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermissiblesOutGrmPermGenericDetailDescription(String value) {
        this.outGrpPermissiblesOutGrmPermGenericDetailDescription = value;
    }

    /**
     * Gets the value of the outGrpPermissiblesOutGrmPermGenericDetailSerialNum property.
     * 
     */
    public int getOutGrpPermissiblesOutGrmPermGenericDetailSerialNum() {
        return outGrpPermissiblesOutGrmPermGenericDetailSerialNum;
    }

    /**
     * Sets the value of the outGrpPermissiblesOutGrmPermGenericDetailSerialNum property.
     * 
     */
    public void setOutGrpPermissiblesOutGrmPermGenericDetailSerialNum(int value) {
        this.outGrpPermissiblesOutGrmPermGenericDetailSerialNum = value;
    }

}
