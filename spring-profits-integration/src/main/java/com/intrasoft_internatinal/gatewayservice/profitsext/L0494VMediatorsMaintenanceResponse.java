
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
 *         &lt;element name="L0494V_MediatorsMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0494VMediatorsMaintenanceExport" minOccurs="0"/>
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
    "l0494VMediatorsMaintenanceResult"
})
@XmlRootElement(name = "L0494V_MediatorsMaintenanceResponse")
public class L0494VMediatorsMaintenanceResponse {

    @XmlElement(name = "L0494V_MediatorsMaintenanceResult")
    protected L0494VMediatorsMaintenanceExport l0494VMediatorsMaintenanceResult;

    /**
     * Gets the value of the l0494VMediatorsMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link L0494VMediatorsMaintenanceExport }
     *     
     */
    public L0494VMediatorsMaintenanceExport getL0494VMediatorsMaintenanceResult() {
        return l0494VMediatorsMaintenanceResult;
    }

    /**
     * Sets the value of the l0494VMediatorsMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link L0494VMediatorsMaintenanceExport }
     *     
     */
    public void setL0494VMediatorsMaintenanceResult(L0494VMediatorsMaintenanceExport value) {
        this.l0494VMediatorsMaintenanceResult = value;
    }

}
