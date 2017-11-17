
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for L0705VOutGrpLnsTrxItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="L0705VOutGrpLnsTrxItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OutGrpLnsTrxOutLnsSsSecurityCmcbActionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutGrpLnsTrxOutLnsSsSecurityCmcbTranCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "L0705VOutGrpLnsTrxItem", propOrder = {
    "outGrpLnsTrxOutLnsSsSecurityCmcbActionCode",
    "outGrpLnsTrxOutLnsSsSecurityCmcbTranCode"
})
public class L0705VOutGrpLnsTrxItem {

    @XmlElement(name = "OutGrpLnsTrxOutLnsSsSecurityCmcbActionCode")
    protected String outGrpLnsTrxOutLnsSsSecurityCmcbActionCode;
    @XmlElement(name = "OutGrpLnsTrxOutLnsSsSecurityCmcbTranCode")
    protected String outGrpLnsTrxOutLnsSsSecurityCmcbTranCode;

    /**
     * Gets the value of the outGrpLnsTrxOutLnsSsSecurityCmcbActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLnsTrxOutLnsSsSecurityCmcbActionCode() {
        return outGrpLnsTrxOutLnsSsSecurityCmcbActionCode;
    }

    /**
     * Sets the value of the outGrpLnsTrxOutLnsSsSecurityCmcbActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLnsTrxOutLnsSsSecurityCmcbActionCode(String value) {
        this.outGrpLnsTrxOutLnsSsSecurityCmcbActionCode = value;
    }

    /**
     * Gets the value of the outGrpLnsTrxOutLnsSsSecurityCmcbTranCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutGrpLnsTrxOutLnsSsSecurityCmcbTranCode() {
        return outGrpLnsTrxOutLnsSsSecurityCmcbTranCode;
    }

    /**
     * Sets the value of the outGrpLnsTrxOutLnsSsSecurityCmcbTranCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutGrpLnsTrxOutLnsSsSecurityCmcbTranCode(String value) {
        this.outGrpLnsTrxOutLnsSsSecurityCmcbTranCode = value;
    }

}
