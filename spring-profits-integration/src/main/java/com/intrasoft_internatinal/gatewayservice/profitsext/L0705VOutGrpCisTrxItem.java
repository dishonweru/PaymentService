
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpCisTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpCisTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpCisTrxOutCisSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpCisTrxOutCisSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpCisTrxItem", propOrder = {
    "outGrpCisTrxOutCisSsSecurityCmcbActionCode",
    "outGrpCisTrxOutCisSsSecurityCmcbTranCode"
})
public class L0705VOutGrpCisTrxItem {

    @XmlElement(name = "OutGrpCisTrxOutCisSsSecurityCmcbActionCode")
    protected String outGrpCisTrxOutCisSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpCisTrxOutCisSsSecurityCmcbTranCode")
    protected String outGrpCisTrxOutCisSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpCisTrxOutCisSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCisTrxOutCisSsSecurityCmcbActionCode() {
        return outGrpCisTrxOutCisSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpCisTrxOutCisSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCisTrxOutCisSsSecurityCmcbActionCode(String value) {
        this.outGrpCisTrxOutCisSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpCisTrxOutCisSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpCisTrxOutCisSsSecurityCmcbTranCode() {
        return outGrpCisTrxOutCisSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpCisTrxOutCisSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpCisTrxOutCisSsSecurityCmcbTranCode(String value) {
        this.outGrpCisTrxOutCisSsSecurityCmcbTranCode = value;
    }

}
