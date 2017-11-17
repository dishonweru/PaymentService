
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpAgrTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpAgrTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpAgrTrxOutAgrSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpAgrTrxOutAgrSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpAgrTrxItem", propOrder = {
    "outGrpAgrTrxOutAgrSsSecurityCmcbActionCode",
    "outGrpAgrTrxOutAgrSsSecurityCmcbTranCode"
})
public class L0705VOutGrpAgrTrxItem {

    @XmlElement(name = "OutGrpAgrTrxOutAgrSsSecurityCmcbActionCode")
    protected String outGrpAgrTrxOutAgrSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpAgrTrxOutAgrSsSecurityCmcbTranCode")
    protected String outGrpAgrTrxOutAgrSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpAgrTrxOutAgrSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAgrTrxOutAgrSsSecurityCmcbActionCode() {
        return outGrpAgrTrxOutAgrSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpAgrTrxOutAgrSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAgrTrxOutAgrSsSecurityCmcbActionCode(String value) {
        this.outGrpAgrTrxOutAgrSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpAgrTrxOutAgrSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpAgrTrxOutAgrSsSecurityCmcbTranCode() {
        return outGrpAgrTrxOutAgrSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpAgrTrxOutAgrSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpAgrTrxOutAgrSsSecurityCmcbTranCode(String value) {
        this.outGrpAgrTrxOutAgrSsSecurityCmcbTranCode = value;
    }

}
