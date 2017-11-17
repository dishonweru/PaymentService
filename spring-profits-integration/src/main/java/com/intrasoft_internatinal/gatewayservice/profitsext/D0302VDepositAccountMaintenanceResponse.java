
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
 *         &lt;element name="D0302V_DepositAccountMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}DepositAccountRetrieveExport" minOccurs="0"/>
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
    "d0302VDepositAccountMaintenanceResult"
})
@XmlRootElement(name = "D0302V_DepositAccountMaintenanceResponse")
public class D0302VDepositAccountMaintenanceResponse {

    @XmlElement(name = "D0302V_DepositAccountMaintenanceResult")
    protected DepositAccountRetrieveExport d0302VDepositAccountMaintenanceResult;

    /**
     * Gets the value of the d0302VDepositAccountMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link DepositAccountRetrieveExport }
     *     
     */
    public DepositAccountRetrieveExport getD0302VDepositAccountMaintenanceResult() {
        return d0302VDepositAccountMaintenanceResult;
    }

    /**
     * Sets the value of the d0302VDepositAccountMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepositAccountRetrieveExport }
     *     
     */
    public void setD0302VDepositAccountMaintenanceResult(DepositAccountRetrieveExport value) {
        this.d0302VDepositAccountMaintenanceResult = value;
    }

}
