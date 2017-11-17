
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpFxTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpFxTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpFxTrxOutFxSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFxTrxOutFxSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpFxTrxItem", propOrder = {
    "outGrpFxTrxOutFxSsSecurityCmcbActionCode",
    "outGrpFxTrxOutFxSsSecurityCmcbTranCode"
})
public class L0705VOutGrpFxTrxItem {

    @XmlElement(name = "OutGrpFxTrxOutFxSsSecurityCmcbActionCode")
    protected String outGrpFxTrxOutFxSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpFxTrxOutFxSsSecurityCmcbTranCode")
    protected String outGrpFxTrxOutFxSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpFxTrxOutFxSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFxTrxOutFxSsSecurityCmcbActionCode() {
        return outGrpFxTrxOutFxSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpFxTrxOutFxSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFxTrxOutFxSsSecurityCmcbActionCode(String value) {
        this.outGrpFxTrxOutFxSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpFxTrxOutFxSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFxTrxOutFxSsSecurityCmcbTranCode() {
        return outGrpFxTrxOutFxSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpFxTrxOutFxSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFxTrxOutFxSsSecurityCmcbTranCode(String value) {
        this.outGrpFxTrxOutFxSsSecurityCmcbTranCode = value;
    }

}
