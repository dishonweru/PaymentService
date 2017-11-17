
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
 *         &lt;element name="L0401V_LoanAccountMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}LoanAccountMaintenanceExport" minOccurs="0"/>
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
    "l0401VLoanAccountMaintenanceResult"
})
@XmlRootElement(name = "L0401V_LoanAccountMaintenanceResponse")
public class L0401VLoanAccountMaintenanceResponse {

    @XmlElement(name = "L0401V_LoanAccountMaintenanceResult")
    protected LoanAccountMaintenanceExport l0401VLoanAccountMaintenanceResult;

    /**
     * Gets the value of the l0401VLoanAccountMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoanAccountMaintenanceExport }
     *     
     */
    public LoanAccountMaintenanceExport getL0401VLoanAccountMaintenanceResult() {
        return l0401VLoanAccountMaintenanceResult;
    }

    /**
     * Sets the value of the l0401VLoanAccountMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanAccountMaintenanceExport }
     *     
     */
    public void setL0401VLoanAccountMaintenanceResult(LoanAccountMaintenanceExport value) {
        this.l0401VLoanAccountMaintenanceResult = value;
    }

}
