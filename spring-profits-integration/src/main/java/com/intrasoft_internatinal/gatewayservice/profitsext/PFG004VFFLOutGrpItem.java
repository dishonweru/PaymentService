
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PFG004VFFLOutGrpItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFG004VFFLOutGrpItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpOutGrmPfgTagSetSetupTagSetCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPfgTagSetSetupDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPfgTagSetSetupSetDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPfgTagSetSetupDefaultTagSetup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPfgTagSetSetupSetType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpOutGrmPfgTagSetSetupInactiveStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFG004VFFLOutGrpItem", propOrder = {
    "outGrpOutGrmPfgTagSetSetupTagSetCode",
    "outGrpOutGrmPfgTagSetSetupDescription",
    "outGrpOutGrmPfgTagSetSetupSetDescription",
    "outGrpOutGrmPfgTagSetSetupDefaultTagSetup",
    "outGrpOutGrmPfgTagSetSetupSetType",
    "outGrpOutGrmPfgTagSetSetupInactiveStatus"
})
public class PFG004VFFLOutGrpItem {

    @XmlElement(name = "OutGrpOutGrmPfgTagSetSetupTagSetCode")
    protected String outGrpOutGrmPfgTagSetSetupTagSetCode;
    @XmlElement(name = "OutGrpOutGrmPfgTagSetSetupDescription")
    protected String outGrpOutGrmPfgTagSetSetupDescription;
    @XmlElement(name = "OutGrpOutGrmPfgTagSetSetupSetDescription")
    protected String outGrpOutGrmPfgTagSetSetupSetDescription;
    @XmlElement(name = "OutGrpOutGrmPfgTagSetSetupDefaultTagSetup")
    protected String outGrpOutGrmPfgTagSetSetupDefaultTagSetup;
    @XmlElement(name = "OutGrpOutGrmPfgTagSetSetupSetType")
    protected String outGrpOutGrmPfgTagSetSetupSetType;
    @XmlElement(name = "OutGrpOutGrmPfgTagSetSetupInactiveStatus")
    protected String outGrpOutGrmPfgTagSetSetupInactiveStatus;

    /**
     * Gets the value of the outGrpOutGrmPfgTagSetSetupTagSetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPfgTagSetSetupTagSetCode() {
        return outGrpOutGrmPfgTagSetSetupTagSetCode;
    }

    /**
     * Sets the value of the outGrpOutGrmPfgTagSetSetupTagSetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPfgTagSetSetupTagSetCode(String value) {
        this.outGrpOutGrmPfgTagSetSetupTagSetCode = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPfgTagSetSetupDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPfgTagSetSetupDescription() {
        return outGrpOutGrmPfgTagSetSetupDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmPfgTagSetSetupDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPfgTagSetSetupDescription(String value) {
        this.outGrpOutGrmPfgTagSetSetupDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPfgTagSetSetupSetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPfgTagSetSetupSetDescription() {
        return outGrpOutGrmPfgTagSetSetupSetDescription;
    }

    /**
     * Sets the value of the outGrpOutGrmPfgTagSetSetupSetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPfgTagSetSetupSetDescription(String value) {
        this.outGrpOutGrmPfgTagSetSetupSetDescription = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPfgTagSetSetupDefaultTagSetup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPfgTagSetSetupDefaultTagSetup() {
        return outGrpOutGrmPfgTagSetSetupDefaultTagSetup;
    }

    /**
     * Sets the value of the outGrpOutGrmPfgTagSetSetupDefaultTagSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPfgTagSetSetupDefaultTagSetup(String value) {
        this.outGrpOutGrmPfgTagSetSetupDefaultTagSetup = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPfgTagSetSetupSetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPfgTagSetSetupSetType() {
        return outGrpOutGrmPfgTagSetSetupSetType;
    }

    /**
     * Sets the value of the outGrpOutGrmPfgTagSetSetupSetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPfgTagSetSetupSetType(String value) {
        this.outGrpOutGrmPfgTagSetSetupSetType = value;
    }

    /**
     * Gets the value of the outGrpOutGrmPfgTagSetSetupInactiveStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpOutGrmPfgTagSetSetupInactiveStatus() {
        return outGrpOutGrmPfgTagSetSetupInactiveStatus;
    }

    /**
     * Sets the value of the outGrpOutGrmPfgTagSetSetupInactiveStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpOutGrmPfgTagSetSetupInactiveStatus(String value) {
        this.outGrpOutGrmPfgTagSetSetupInactiveStatus = value;
    }

}
