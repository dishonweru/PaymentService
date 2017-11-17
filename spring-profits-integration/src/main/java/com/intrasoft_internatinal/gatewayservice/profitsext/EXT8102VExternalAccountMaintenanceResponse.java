
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
 *         &lt;element name="EXT8102V_ExternalAccountMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}EXT8102VExternalAccountMaintenanceExport" minOccurs="0"/>
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
    "ext8102VExternalAccountMaintenanceResult"
})
@XmlRootElement(name = "EXT8102V_ExternalAccountMaintenanceResponse")
public class EXT8102VExternalAccountMaintenanceResponse {

    @XmlElement(name = "EXT8102V_ExternalAccountMaintenanceResult")
    protected EXT8102VExternalAccountMaintenanceExport ext8102VExternalAccountMaintenanceResult;

    /**
     * Gets the value of the ext8102VExternalAccountMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link EXT8102VExternalAccountMaintenanceExport }
     *     
     */
    public EXT8102VExternalAccountMaintenanceExport getEXT8102VExternalAccountMaintenanceResult() {
        return ext8102VExternalAccountMaintenanceResult;
    }

    /**
     * Sets the value of the ext8102VExternalAccountMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EXT8102VExternalAccountMaintenanceExport }
     *     
     */
    public void setEXT8102VExternalAccountMaintenanceResult(EXT8102VExternalAccountMaintenanceExport value) {
        this.ext8102VExternalAccountMaintenanceResult = value;
    }

}
