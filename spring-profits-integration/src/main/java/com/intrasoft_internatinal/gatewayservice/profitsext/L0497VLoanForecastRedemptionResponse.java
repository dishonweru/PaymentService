
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
 *         &lt;element name="L0497V_LoanForecastRedemptionResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}L0497VLoanForecastRedemptionExport" minOccurs="0"/>
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
    "l0497VLoanForecastRedemptionResult"
})
@XmlRootElement(name = "L0497V_LoanForecastRedemptionResponse")
public class L0497VLoanForecastRedemptionResponse {

    @XmlElement(name = "L0497V_LoanForecastRedemptionResult")
    protected L0497VLoanForecastRedemptionExport l0497VLoanForecastRedemptionResult;

    /**
     * Gets the value of the l0497VLoanForecastRedemptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link L0497VLoanForecastRedemptionExport }
     *     
     */
    public L0497VLoanForecastRedemptionExport getL0497VLoanForecastRedemptionResult() {
        return l0497VLoanForecastRedemptionResult;
    }

    /**
     * Sets the value of the l0497VLoanForecastRedemptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link L0497VLoanForecastRedemptionExport }
     *     
     */
    public void setL0497VLoanForecastRedemptionResult(L0497VLoanForecastRedemptionExport value) {
        this.l0497VLoanForecastRedemptionResult = value;
    }

}
