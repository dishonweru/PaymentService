
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
 *         &lt;element name="R0236VL_RepaymentScheduleScenarioResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}R0236VL_RepaymentScheduleScenarioExport" minOccurs="0"/>
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
    "r0236VLRepaymentScheduleScenarioResult"
})
@XmlRootElement(name = "R0236VL_RepaymentScheduleScenarioResponse")
public class R0236VLRepaymentScheduleScenarioResponse {

    @XmlElement(name = "R0236VL_RepaymentScheduleScenarioResult")
    protected R0236VLRepaymentScheduleScenarioExport r0236VLRepaymentScheduleScenarioResult;

    /**
     * Gets the value of the r0236VLRepaymentScheduleScenarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link R0236VLRepaymentScheduleScenarioExport }
     *     
     */
    public R0236VLRepaymentScheduleScenarioExport getR0236VLRepaymentScheduleScenarioResult() {
        return r0236VLRepaymentScheduleScenarioResult;
    }

    /**
     * Sets the value of the r0236VLRepaymentScheduleScenarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link R0236VLRepaymentScheduleScenarioExport }
     *     
     */
    public void setR0236VLRepaymentScheduleScenarioResult(R0236VLRepaymentScheduleScenarioExport value) {
        this.r0236VLRepaymentScheduleScenarioResult = value;
    }

}
