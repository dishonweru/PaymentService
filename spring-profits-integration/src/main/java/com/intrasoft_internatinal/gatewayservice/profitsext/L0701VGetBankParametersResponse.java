
package com.intrasoft_internatinal.gatewayservice.profitsext;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="L0701V_GetBankParametersResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0701VGetBankParametersExport" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "l0701VGetBankParametersResult"
})
@XmlRootElement(name = "L0701V_GetBankParametersResponse")
public class L0701VGetBankParametersResponse {

    @XmlElement(name = "L0701V_GetBankParametersResult")
    protected L0701VGetBankParametersExport l0701VGetBankParametersResult;

    /**
     * Gets the value of the l0701VGetBankParametersResult property.
     * 
     * @return
     *     possible object is
     *     {@link L0701VGetBankParametersExport }
     *     
     */
    public L0701VGetBankParametersExport getL0701VGetBankParametersResult() {
        return l0701VGetBankParametersResult;
    }

    /**
     * Sets the value of the l0701VGetBankParametersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link L0701VGetBankParametersExport }
     *     
     */
    public void setL0701VGetBankParametersResult(L0701VGetBankParametersExport value) {
        this.l0701VGetBankParametersResult = value;
    }

}
