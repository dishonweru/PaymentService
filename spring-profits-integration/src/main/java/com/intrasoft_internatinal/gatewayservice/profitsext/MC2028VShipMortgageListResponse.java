
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
 *         &lt;element name="MC2028V_ShipMortgageListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2028VShipMortgageListExport" minOccurs="0"/>
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
    "mc2028VShipMortgageListResult"
})
@XmlRootElement(name = "MC2028V_ShipMortgageListResponse")
public class MC2028VShipMortgageListResponse {

    @XmlElement(name = "MC2028V_ShipMortgageListResult")
    protected MC2028VShipMortgageListExport mc2028VShipMortgageListResult;

    /**
     * Gets the value of the mc2028VShipMortgageListResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2028VShipMortgageListExport }
     *     
     */
    public MC2028VShipMortgageListExport getMC2028VShipMortgageListResult() {
        return mc2028VShipMortgageListResult;
    }

    /**
     * Sets the value of the mc2028VShipMortgageListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2028VShipMortgageListExport }
     *     
     */
    public void setMC2028VShipMortgageListResult(MC2028VShipMortgageListExport value) {
        this.mc2028VShipMortgageListResult = value;
    }

}
