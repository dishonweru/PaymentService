
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
 *         &lt;element name="MC2021V_MortgagePrenotationForRealEstatePropertyResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2021VMortgagePrenotationForRealEstatePropertyExport" minOccurs="0"/>
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
    "mc2021VMortgagePrenotationForRealEstatePropertyResult"
})
@XmlRootElement(name = "MC2021V_MortgagePrenotationForRealEstatePropertyResponse")
public class MC2021VMortgagePrenotationForRealEstatePropertyResponse {

    @XmlElement(name = "MC2021V_MortgagePrenotationForRealEstatePropertyResult")
    protected MC2021VMortgagePrenotationForRealEstatePropertyExport mc2021VMortgagePrenotationForRealEstatePropertyResult;

    /**
     * Gets the value of the mc2021VMortgagePrenotationForRealEstatePropertyResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2021VMortgagePrenotationForRealEstatePropertyExport }
     *     
     */
    public MC2021VMortgagePrenotationForRealEstatePropertyExport getMC2021VMortgagePrenotationForRealEstatePropertyResult() {
        return mc2021VMortgagePrenotationForRealEstatePropertyResult;
    }

    /**
     * Sets the value of the mc2021VMortgagePrenotationForRealEstatePropertyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2021VMortgagePrenotationForRealEstatePropertyExport }
     *     
     */
    public void setMC2021VMortgagePrenotationForRealEstatePropertyResult(MC2021VMortgagePrenotationForRealEstatePropertyExport value) {
        this.mc2021VMortgagePrenotationForRealEstatePropertyResult = value;
    }

}
