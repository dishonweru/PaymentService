
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
 *         &lt;element name="I0106V_CustomerAddressMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CustomerAddressMaintenanceExport" minOccurs="0"/>
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
    "i0106VCustomerAddressMaintenanceResult"
})
@XmlRootElement(name = "I0106V_CustomerAddressMaintenanceResponse")
public class I0106VCustomerAddressMaintenanceResponse {

    @XmlElement(name = "I0106V_CustomerAddressMaintenanceResult")
    protected CustomerAddressMaintenanceExport i0106VCustomerAddressMaintenanceResult;

    /**
     * Gets the value of the i0106VCustomerAddressMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAddressMaintenanceExport }
     *     
     */
    public CustomerAddressMaintenanceExport getI0106VCustomerAddressMaintenanceResult() {
        return i0106VCustomerAddressMaintenanceResult;
    }

    /**
     * Sets the value of the i0106VCustomerAddressMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAddressMaintenanceExport }
     *     
     */
    public void setI0106VCustomerAddressMaintenanceResult(CustomerAddressMaintenanceExport value) {
        this.i0106VCustomerAddressMaintenanceResult = value;
    }

}
