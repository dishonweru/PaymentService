
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
 *         &lt;element name="MC2027V_ShipMortgageResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2027VShipMortgageExport" minOccurs="0"/>
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
    "mc2027VShipMortgageResult"
})
@XmlRootElement(name = "MC2027V_ShipMortgageResponse")
public class MC2027VShipMortgageResponse {

    @XmlElement(name = "MC2027V_ShipMortgageResult")
    protected MC2027VShipMortgageExport mc2027VShipMortgageResult;

    /**
     * Gets the value of the mc2027VShipMortgageResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2027VShipMortgageExport }
     *     
     */
    public MC2027VShipMortgageExport getMC2027VShipMortgageResult() {
        return mc2027VShipMortgageResult;
    }

    /**
     * Sets the value of the mc2027VShipMortgageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2027VShipMortgageExport }
     *     
     */
    public void setMC2027VShipMortgageResult(MC2027VShipMortgageExport value) {
        this.mc2027VShipMortgageResult = value;
    }

}
