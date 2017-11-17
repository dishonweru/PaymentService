
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
 *         &lt;element name="I0172V_ProfitabilityResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0172VProfitabilityExport" minOccurs="0"/>
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
    "i0172VProfitabilityResult"
})
@XmlRootElement(name = "I0172V_ProfitabilityResponse")
public class I0172VProfitabilityResponse {

    @XmlElement(name = "I0172V_ProfitabilityResult")
    protected I0172VProfitabilityExport i0172VProfitabilityResult;

    /**
     * Gets the value of the i0172VProfitabilityResult property.
     * 
     * @return
     *     possible object is
     *     {@link I0172VProfitabilityExport }
     *     
     */
    public I0172VProfitabilityExport getI0172VProfitabilityResult() {
        return i0172VProfitabilityResult;
    }

    /**
     * Sets the value of the i0172VProfitabilityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link I0172VProfitabilityExport }
     *     
     */
    public void setI0172VProfitabilityResult(I0172VProfitabilityExport value) {
        this.i0172VProfitabilityResult = value;
    }

}
