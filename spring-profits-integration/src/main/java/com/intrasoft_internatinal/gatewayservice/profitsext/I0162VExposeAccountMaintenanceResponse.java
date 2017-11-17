
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
 *         &lt;element name="I0162V_ExposeAccountMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}ExposeAccountMaintenanceExport" minOccurs="0"/>
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
    "i0162VExposeAccountMaintenanceResult"
})
@XmlRootElement(name = "I0162V_ExposeAccountMaintenanceResponse")
public class I0162VExposeAccountMaintenanceResponse {

    @XmlElement(name = "I0162V_ExposeAccountMaintenanceResult")
    protected ExposeAccountMaintenanceExport i0162VExposeAccountMaintenanceResult;

    /**
     * Gets the value of the i0162VExposeAccountMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link ExposeAccountMaintenanceExport }
     *     
     */
    public ExposeAccountMaintenanceExport getI0162VExposeAccountMaintenanceResult() {
        return i0162VExposeAccountMaintenanceResult;
    }

    /**
     * Sets the value of the i0162VExposeAccountMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExposeAccountMaintenanceExport }
     *     
     */
    public void setI0162VExposeAccountMaintenanceResult(ExposeAccountMaintenanceExport value) {
        this.i0162VExposeAccountMaintenanceResult = value;
    }

}
