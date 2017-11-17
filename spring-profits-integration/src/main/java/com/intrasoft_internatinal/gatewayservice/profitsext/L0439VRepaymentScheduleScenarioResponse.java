
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
 *         &lt;element name="L0439v_RepaymentScheduleScenarioResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}RepaymentScheduleScenarioExport" minOccurs="0"/>
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
    "l0439VRepaymentScheduleScenarioResult"
})
@XmlRootElement(name = "L0439v_RepaymentScheduleScenarioResponse")
public class L0439VRepaymentScheduleScenarioResponse {

    @XmlElement(name = "L0439v_RepaymentScheduleScenarioResult")
    protected RepaymentScheduleScenarioExport l0439VRepaymentScheduleScenarioResult;

    /**
     * Gets the value of the l0439VRepaymentScheduleScenarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link RepaymentScheduleScenarioExport }
     *     
     */
    public RepaymentScheduleScenarioExport getL0439VRepaymentScheduleScenarioResult() {
        return l0439VRepaymentScheduleScenarioResult;
    }

    /**
     * Sets the value of the l0439VRepaymentScheduleScenarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepaymentScheduleScenarioExport }
     *     
     */
    public void setL0439VRepaymentScheduleScenarioResult(RepaymentScheduleScenarioExport value) {
        this.l0439VRepaymentScheduleScenarioResult = value;
    }

}
