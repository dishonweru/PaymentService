
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpDepTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpDepTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpDepTrxOutDepSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpDepTrxOutDepSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpDepTrxItem", propOrder = {
    "outGrpDepTrxOutDepSsSecurityCmcbActionCode",
    "outGrpDepTrxOutDepSsSecurityCmcbTranCode"
})
public class L0705VOutGrpDepTrxItem {

    @XmlElement(name = "OutGrpDepTrxOutDepSsSecurityCmcbActionCode")
    protected String outGrpDepTrxOutDepSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpDepTrxOutDepSsSecurityCmcbTranCode")
    protected String outGrpDepTrxOutDepSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpDepTrxOutDepSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDepTrxOutDepSsSecurityCmcbActionCode() {
        return outGrpDepTrxOutDepSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpDepTrxOutDepSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDepTrxOutDepSsSecurityCmcbActionCode(String value) {
        this.outGrpDepTrxOutDepSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpDepTrxOutDepSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpDepTrxOutDepSsSecurityCmcbTranCode() {
        return outGrpDepTrxOutDepSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpDepTrxOutDepSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpDepTrxOutDepSsSecurityCmcbTranCode(String value) {
        this.outGrpDepTrxOutDepSsSecurityCmcbTranCode = value;
    }

}
