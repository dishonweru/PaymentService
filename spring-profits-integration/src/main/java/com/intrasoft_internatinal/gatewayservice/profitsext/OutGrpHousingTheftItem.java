
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OutGrpHousingTheftItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OutGrpHousingTheftItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OutGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="OutGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpHousingTheftOutGrmTheftDesrGenericDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutGrpHousingTheftItem", propOrder = {
    "outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode",
    "outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier",
    "outGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar",
    "outGrpHousingTheftOutGrmTheftDesrGenericDetailDescription"
})
public class OutGrpHousingTheftItem {

    @XmlElement(name = "OutGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode")
    protected int outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode;
    @XmlElement(name = "OutGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier")
    protected double outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier;
    @XmlElement(name = "OutGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar")
    protected String outGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar;
    @XmlElement(name = "OutGrpHousingTheftOutGrmTheftDesrGenericDetailDescription")
    protected String outGrpHousingTheftOutGrmTheftDesrGenericDetailDescription;

    /**
     * Gets the value of the outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode property.
     * 
     */
    public int getOutGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode() {
        return outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode;
    }

    /**
     * Sets the value of the outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode property.
     * 
     */
    public void setOutGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode(int value) {
        this.outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlThiefCode = value;
    }

    /**
     * Gets the value of the outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier property.
     * 
     */
    public double getOutGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier() {
        return outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier;
    }

    /**
     * Sets the value of the outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier property.
     * 
     */
    public void setOutGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier(double value) {
        this.outGrpHousingTheftOutGrmHousingTheftIssHousingTheftDtlTpSoIdentifier = value;
    }

    /**
     * Gets the value of the outGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar() {
        return outGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar;
    }

    /**
     * Sets the value of the outGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar(String value) {
        this.outGrpHousingTheftOutGrmSelcharIefSuppliedSelectChar = value;
    }

    /**
     * Gets the value of the outGrpHousingTheftOutGrmTheftDesrGenericDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpHousingTheftOutGrmTheftDesrGenericDetailDescription() {
        return outGrpHousingTheftOutGrmTheftDesrGenericDetailDescription;
    }

    /**
     * Sets the value of the outGrpHousingTheftOutGrmTheftDesrGenericDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpHousingTheftOutGrmTheftDesrGenericDetailDescription(String value) {
        this.outGrpHousingTheftOutGrmTheftDesrGenericDetailDescription = value;
    }

}
