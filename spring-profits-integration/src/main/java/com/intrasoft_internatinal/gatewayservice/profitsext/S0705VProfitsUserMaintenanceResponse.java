
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
 *         &lt;element name="S0705V_ProfitsUserMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}S0705VProfitsUserMaintenanceExport" minOccurs="0"/>
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
    "s0705VProfitsUserMaintenanceResult"
})
@XmlRootElement(name = "S0705V_ProfitsUserMaintenanceResponse")
public class S0705VProfitsUserMaintenanceResponse {

    @XmlElement(name = "S0705V_ProfitsUserMaintenanceResult")
    protected S0705VProfitsUserMaintenanceExport s0705VProfitsUserMaintenanceResult;

    /**
     * Gets the value of the s0705VProfitsUserMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link S0705VProfitsUserMaintenanceExport }
     *     
     */
    public S0705VProfitsUserMaintenanceExport getS0705VProfitsUserMaintenanceResult() {
        return s0705VProfitsUserMaintenanceResult;
    }

    /**
     * Sets the value of the s0705VProfitsUserMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link S0705VProfitsUserMaintenanceExport }
     *     
     */
    public void setS0705VProfitsUserMaintenanceResult(S0705VProfitsUserMaintenanceExport value) {
        this.s0705VProfitsUserMaintenanceResult = value;
    }

}
