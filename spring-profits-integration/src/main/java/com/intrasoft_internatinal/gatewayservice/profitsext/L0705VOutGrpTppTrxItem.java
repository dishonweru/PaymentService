
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpTppTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpTppTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpTppTrxOutTppSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpTppTrxOutTppSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpTppTrxItem", propOrder = {
    "outGrpTppTrxOutTppSsSecurityCmcbActionCode",
    "outGrpTppTrxOutTppSsSecurityCmcbTranCode"
})
public class L0705VOutGrpTppTrxItem {

    @XmlElement(name = "OutGrpTppTrxOutTppSsSecurityCmcbActionCode")
    protected String outGrpTppTrxOutTppSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpTppTrxOutTppSsSecurityCmcbTranCode")
    protected String outGrpTppTrxOutTppSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpTppTrxOutTppSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTppTrxOutTppSsSecurityCmcbActionCode() {
        return outGrpTppTrxOutTppSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpTppTrxOutTppSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTppTrxOutTppSsSecurityCmcbActionCode(String value) {
        this.outGrpTppTrxOutTppSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpTppTrxOutTppSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpTppTrxOutTppSsSecurityCmcbTranCode() {
        return outGrpTppTrxOutTppSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpTppTrxOutTppSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpTppTrxOutTppSsSecurityCmcbTranCode(String value) {
        this.outGrpTppTrxOutTppSsSecurityCmcbTranCode = value;
    }

}
