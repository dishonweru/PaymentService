
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
 *         &lt;element name="D0360V_TermDepositSpecialRatesMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}TermDepositSpecialRatesMaintenanceExport" minOccurs="0"/>
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
    "d0360VTermDepositSpecialRatesMaintenanceResult"
})
@XmlRootElement(name = "D0360V_TermDepositSpecialRatesMaintenanceResponse")
public class D0360VTermDepositSpecialRatesMaintenanceResponse {

    @XmlElement(name = "D0360V_TermDepositSpecialRatesMaintenanceResult")
    protected TermDepositSpecialRatesMaintenanceExport d0360VTermDepositSpecialRatesMaintenanceResult;

    /**
     * Gets the value of the d0360VTermDepositSpecialRatesMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link TermDepositSpecialRatesMaintenanceExport }
     *     
     */
    public TermDepositSpecialRatesMaintenanceExport getD0360VTermDepositSpecialRatesMaintenanceResult() {
        return d0360VTermDepositSpecialRatesMaintenanceResult;
    }

    /**
     * Sets the value of the d0360VTermDepositSpecialRatesMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermDepositSpecialRatesMaintenanceExport }
     *     
     */
    public void setD0360VTermDepositSpecialRatesMaintenanceResult(TermDepositSpecialRatesMaintenanceExport value) {
        this.d0360VTermDepositSpecialRatesMaintenanceResult = value;
    }

}
