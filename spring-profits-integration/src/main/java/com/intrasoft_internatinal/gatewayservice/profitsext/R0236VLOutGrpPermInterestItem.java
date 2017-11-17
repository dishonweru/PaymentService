
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for R0236VLOutGrpPermInterestItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="R0236VLOutGrpPermInterestItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPermInterestOutGrmIntFlagIefSuppliedFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermInterestOutGrmInterestLnsInterestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPermInterestOutGrmInterestLnsInterestIdInterest" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "R0236VLOutGrpPermInterestItem", propOrder = {
    "outGrpPermInterestOutGrmIntFlagIefSuppliedFlag",
    "outGrpPermInterestOutGrmInterestLnsInterestDescription",
    "outGrpPermInterestOutGrmInterestLnsInterestIdInterest"
})
public class R0236VLOutGrpPermInterestItem {

    @XmlElement(name = "OutGrpPermInterestOutGrmIntFlagIefSuppliedFlag")
    protected String outGrpPermInterestOutGrmIntFlagIefSuppliedFlag;
    @XmlElement(name = "OutGrpPermInterestOutGrmInterestLnsInterestDescription")
    protected String outGrpPermInterestOutGrmInterestLnsInterestDescription;
    @XmlElement(name = "OutGrpPermInterestOutGrmInterestLnsInterestIdInterest")
    protected int outGrpPermInterestOutGrmInterestLnsInterestIdInterest;

    /**
     * Gets the value of the outGrpPermInterestOutGrmIntFlagIefSuppliedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermInterestOutGrmIntFlagIefSuppliedFlag() {
        return outGrpPermInterestOutGrmIntFlagIefSuppliedFlag;
    }

    /**
     * Sets the value of the outGrpPermInterestOutGrmIntFlagIefSuppliedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermInterestOutGrmIntFlagIefSuppliedFlag(String value) {
        this.outGrpPermInterestOutGrmIntFlagIefSuppliedFlag = value;
    }

    /**
     * Gets the value of the outGrpPermInterestOutGrmInterestLnsInterestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPermInterestOutGrmInterestLnsInterestDescription() {
        return outGrpPermInterestOutGrmInterestLnsInterestDescription;
    }

    /**
     * Sets the value of the outGrpPermInterestOutGrmInterestLnsInterestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPermInterestOutGrmInterestLnsInterestDescription(String value) {
        this.outGrpPermInterestOutGrmInterestLnsInterestDescription = value;
    }

    /**
     * Gets the value of the outGrpPermInterestOutGrmInterestLnsInterestIdInterest property.
     * 
     */
    public int getOutGrpPermInterestOutGrmInterestLnsInterestIdInterest() {
        return outGrpPermInterestOutGrmInterestLnsInterestIdInterest;
    }

    /**
     * Sets the value of the outGrpPermInterestOutGrmInterestLnsInterestIdInterest property.
     * 
     */
    public void setOutGrpPermInterestOutGrmInterestLnsInterestIdInterest(int value) {
        this.outGrpPermInterestOutGrmInterestLnsInterestIdInterest = value;
    }

}
