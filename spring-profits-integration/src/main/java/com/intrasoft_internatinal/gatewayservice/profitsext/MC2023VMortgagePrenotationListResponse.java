
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
 *         &lt;element name="MC2023V_MortgagePrenotationListResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}MC2023VMortgagePrenotationListExport" minOccurs="0"/>
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
    "mc2023VMortgagePrenotationListResult"
})
@XmlRootElement(name = "MC2023V_MortgagePrenotationListResponse")
public class MC2023VMortgagePrenotationListResponse {

    @XmlElement(name = "MC2023V_MortgagePrenotationListResult")
    protected MC2023VMortgagePrenotationListExport mc2023VMortgagePrenotationListResult;

    /**
     * Gets the value of the mc2023VMortgagePrenotationListResult property.
     * 
     * @return
     *     possible object is
     *     {@link MC2023VMortgagePrenotationListExport }
     *     
     */
    public MC2023VMortgagePrenotationListExport getMC2023VMortgagePrenotationListResult() {
        return mc2023VMortgagePrenotationListResult;
    }

    /**
     * Sets the value of the mc2023VMortgagePrenotationListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MC2023VMortgagePrenotationListExport }
     *     
     */
    public void setMC2023VMortgagePrenotationListResult(MC2023VMortgagePrenotationListExport value) {
        this.mc2023VMortgagePrenotationListResult = value;
    }

}
