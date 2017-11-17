
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpSystemItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpSystemItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpSystemOutSystemSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpSystemOutSystemSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpSystemItem", propOrder = {
    "outGrpSystemOutSystemSsSecurityCmcbActionCode",
    "outGrpSystemOutSystemSsSecurityCmcbTranCode"
})
public class L0705VOutGrpSystemItem {

    @XmlElement(name = "OutGrpSystemOutSystemSsSecurityCmcbActionCode")
    protected String outGrpSystemOutSystemSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpSystemOutSystemSsSecurityCmcbTranCode")
    protected String outGrpSystemOutSystemSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpSystemOutSystemSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSystemOutSystemSsSecurityCmcbActionCode() {
        return outGrpSystemOutSystemSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpSystemOutSystemSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSystemOutSystemSsSecurityCmcbActionCode(String value) {
        this.outGrpSystemOutSystemSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpSystemOutSystemSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpSystemOutSystemSsSecurityCmcbTranCode() {
        return outGrpSystemOutSystemSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpSystemOutSystemSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpSystemOutSystemSsSecurityCmcbTranCode(String value) {
        this.outGrpSystemOutSystemSsSecurityCmcbTranCode = value;
    }

}
