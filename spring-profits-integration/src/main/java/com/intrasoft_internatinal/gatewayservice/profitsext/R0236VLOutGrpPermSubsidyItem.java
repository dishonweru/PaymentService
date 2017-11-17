
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for R0236VLOutGrpPermSubsidyItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VLOutGrpPermSubsidyItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VLOutGrpPermSubsidyItem", propOrder = {
    "outGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag",
    "outGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription",
    "outGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy"
})
public class R0236VLOutGrpPermSubsidyItem {

    @XmlElement(name = "OutGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag")
    protected String outGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag;
    @XmlElement(name = "OutGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription")
    protected String outGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription;
    @XmlElement(name = "OutGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy")
    protected int outGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy;

    /**
     * Gets the value of the outGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag() {
        return outGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag(String value) {
        this.outGrpPermSubsidyOutGrmSubsidyFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription() {
        return outGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription;
    }

    /**
     * Sets the value of the outGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription(String value) {
        this.outGrpPermSubsidyOutGrmSubsidySubsidyOrderDescription = value;
    }

    /**
     * Gets the value of the outGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy property.
     * 
     */
    public int getOutGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy() {
        return outGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy;
    }

    /**
     * Sets the value of the outGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy property.
     * 
     */
    public void setOutGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy(int value) {
        this.outGrpPermSubsidyOutGrmSubsidySubsidyOrderIdSubsidy = value;
    }

}
