
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpPrfTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpPrfTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpPrfTrxOutPrfSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpPrfTrxOutPrfSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpPrfTrxItem", propOrder = {
    "outGrpPrfTrxOutPrfSsSecurityCmcbActionCode",
    "outGrpPrfTrxOutPrfSsSecurityCmcbTranCode"
})
public class L0705VOutGrpPrfTrxItem {

    @XmlElement(name = "OutGrpPrfTrxOutPrfSsSecurityCmcbActionCode")
    protected String outGrpPrfTrxOutPrfSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpPrfTrxOutPrfSsSecurityCmcbTranCode")
    protected String outGrpPrfTrxOutPrfSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpPrfTrxOutPrfSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPrfTrxOutPrfSsSecurityCmcbActionCode() {
        return outGrpPrfTrxOutPrfSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpPrfTrxOutPrfSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPrfTrxOutPrfSsSecurityCmcbActionCode(String value) {
        this.outGrpPrfTrxOutPrfSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpPrfTrxOutPrfSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpPrfTrxOutPrfSsSecurityCmcbTranCode() {
        return outGrpPrfTrxOutPrfSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpPrfTrxOutPrfSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpPrfTrxOutPrfSsSecurityCmcbTranCode(String value) {
        this.outGrpPrfTrxOutPrfSsSecurityCmcbTranCode = value;
    }

}
