
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
 *         &lt;element name="S0702V_ProfitsBankEmployeeManipulationResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}S0702VProfitsBankEmployeeManipulationExport" minOccurs="0"/>
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
    "s0702VProfitsBankEmployeeManipulationResult"
})
@XmlRootElement(name = "S0702V_ProfitsBankEmployeeManipulationResponse")
public class S0702VProfitsBankEmployeeManipulationResponse {

    @XmlElement(name = "S0702V_ProfitsBankEmployeeManipulationResult")
    protected S0702VProfitsBankEmployeeManipulationExport s0702VProfitsBankEmployeeManipulationResult;

    /**
     * Gets the value of the s0702VProfitsBankEmployeeManipulationResult property.
     * 
     * @return
     *     possible object is
     *     {@link S0702VProfitsBankEmployeeManipulationExport }
     *     
     */
    public S0702VProfitsBankEmployeeManipulationExport getS0702VProfitsBankEmployeeManipulationResult() {
        return s0702VProfitsBankEmployeeManipulationResult;
    }

    /**
     * Sets the value of the s0702VProfitsBankEmployeeManipulationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link S0702VProfitsBankEmployeeManipulationExport }
     *     
     */
    public void setS0702VProfitsBankEmployeeManipulationResult(S0702VProfitsBankEmployeeManipulationExport value) {
        this.s0702VProfitsBankEmployeeManipulationResult = value;
    }

}
