
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
 *         &lt;element name="Prt502V_SaveScenarioResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Prt502vSaveScenarioExport" minOccurs="0"/>
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
    "prt502VSaveScenarioResult"
})
@XmlRootElement(name = "Prt502V_SaveScenarioResponse")
public class Prt502VSaveScenarioResponse {

    @XmlElement(name = "Prt502V_SaveScenarioResult")
    protected Prt502VSaveScenarioExport prt502VSaveScenarioResult;

    /**
     * Gets the value of the prt502VSaveScenarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link Prt502VSaveScenarioExport }
     *     
     */
    public Prt502VSaveScenarioExport getPrt502VSaveScenarioResult() {
        return prt502VSaveScenarioResult;
    }

    /**
     * Sets the value of the prt502VSaveScenarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prt502VSaveScenarioExport }
     *     
     */
    public void setPrt502VSaveScenarioResult(Prt502VSaveScenarioExport value) {
        this.prt502VSaveScenarioResult = value;
    }

}
