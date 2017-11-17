
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpFtTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpFtTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpFtTrxOutFtSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpFtTrxOutFtSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpFtTrxItem", propOrder = {
    "outGrpFtTrxOutFtSsSecurityCmcbActionCode",
    "outGrpFtTrxOutFtSsSecurityCmcbTranCode"
})
public class L0705VOutGrpFtTrxItem {

    @XmlElement(name = "OutGrpFtTrxOutFtSsSecurityCmcbActionCode")
    protected String outGrpFtTrxOutFtSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpFtTrxOutFtSsSecurityCmcbTranCode")
    protected String outGrpFtTrxOutFtSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpFtTrxOutFtSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFtTrxOutFtSsSecurityCmcbActionCode() {
        return outGrpFtTrxOutFtSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpFtTrxOutFtSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFtTrxOutFtSsSecurityCmcbActionCode(String value) {
        this.outGrpFtTrxOutFtSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpFtTrxOutFtSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpFtTrxOutFtSsSecurityCmcbTranCode() {
        return outGrpFtTrxOutFtSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpFtTrxOutFtSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpFtTrxOutFtSsSecurityCmcbTranCode(String value) {
        this.outGrpFtTrxOutFtSsSecurityCmcbTranCode = value;
    }

}
