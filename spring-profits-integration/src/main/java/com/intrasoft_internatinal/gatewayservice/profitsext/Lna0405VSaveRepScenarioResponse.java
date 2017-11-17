
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
 *         &lt;element name="Lna0405V_SaveRepScenarioResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Lna0405VSaveRepScenarioExport" minOccurs="0"/>
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
    "lna0405VSaveRepScenarioResult"
})
@XmlRootElement(name = "Lna0405V_SaveRepScenarioResponse")
public class Lna0405VSaveRepScenarioResponse {

    @XmlElement(name = "Lna0405V_SaveRepScenarioResult")
    protected Lna0405VSaveRepScenarioExport lna0405VSaveRepScenarioResult;

    /**
     * Gets the value of the lna0405VSaveRepScenarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link Lna0405VSaveRepScenarioExport }
     *     
     */
    public Lna0405VSaveRepScenarioExport getLna0405VSaveRepScenarioResult() {
        return lna0405VSaveRepScenarioResult;
    }

    /**
     * Sets the value of the lna0405VSaveRepScenarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lna0405VSaveRepScenarioExport }
     *     
     */
    public void setLna0405VSaveRepScenarioResult(Lna0405VSaveRepScenarioExport value) {
        this.lna0405VSaveRepScenarioResult = value;
    }

}
