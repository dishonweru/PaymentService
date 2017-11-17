
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SL797VOutSsSecurityCmcb complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SL797VOutSsSecurityCmcb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SL797VOutSsSecurityCmcb", propOrder = {
    "outSsSecurityCmcbTranCode",
    "outSsSecurityCmcbActionCode"
})
public class SL797VOutSsSecurityCmcb {

    @XmlElement(name = "OutSsSecurityCmcbTranCode")
    protected String outSsSecurityCmcbTranCode;
    @XmlElement(name = "OutSsSecurityCmcbActionCode")
    protected String outSsSecurityCmcbActionCode;

    /**
     * Gets the value of the outSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSsSecurityCmcbTranCode() {
        return outSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSsSecurityCmcbTranCode(String value) {
        this.outSsSecurityCmcbTranCode = value;
    }

    /**
     * Gets the value of the outSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutSsSecurityCmcbActionCode() {
        return outSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutSsSecurityCmcbActionCode(String value) {
        this.outSsSecurityCmcbActionCode = value;
    }

}
