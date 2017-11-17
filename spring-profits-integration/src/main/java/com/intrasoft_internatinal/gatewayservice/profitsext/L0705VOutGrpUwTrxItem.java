
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpUwTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpUwTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpUwTrxOutUwSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpUwTrxOutUwSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpUwTrxItem", propOrder = {
    "outGrpUwTrxOutUwSsSecurityCmcbActionCode",
    "outGrpUwTrxOutUwSsSecurityCmcbTranCode"
})
public class L0705VOutGrpUwTrxItem {

    @XmlElement(name = "OutGrpUwTrxOutUwSsSecurityCmcbActionCode")
    protected String outGrpUwTrxOutUwSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpUwTrxOutUwSsSecurityCmcbTranCode")
    protected String outGrpUwTrxOutUwSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpUwTrxOutUwSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUwTrxOutUwSsSecurityCmcbActionCode() {
        return outGrpUwTrxOutUwSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpUwTrxOutUwSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUwTrxOutUwSsSecurityCmcbActionCode(String value) {
        this.outGrpUwTrxOutUwSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpUwTrxOutUwSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpUwTrxOutUwSsSecurityCmcbTranCode() {
        return outGrpUwTrxOutUwSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpUwTrxOutUwSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpUwTrxOutUwSsSecurityCmcbTranCode(String value) {
        this.outGrpUwTrxOutUwSsSecurityCmcbTranCode = value;
    }

}
