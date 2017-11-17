
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
 *         &lt;element name="I0101V_IndividualCustomerMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}IndividualCustomerMaintenanceExport" minOccurs="0"/>
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
    "i0101VIndividualCustomerMaintenanceResult"
})
@XmlRootElement(name = "I0101V_IndividualCustomerMaintenanceResponse")
public class I0101VIndividualCustomerMaintenanceResponse {

    @XmlElement(name = "I0101V_IndividualCustomerMaintenanceResult")
    protected IndividualCustomerMaintenanceExport i0101VIndividualCustomerMaintenanceResult;

    /**
     * Gets the value of the i0101VIndividualCustomerMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualCustomerMaintenanceExport }
     *     
     */
    public IndividualCustomerMaintenanceExport getI0101VIndividualCustomerMaintenanceResult() {
        return i0101VIndividualCustomerMaintenanceResult;
    }

    /**
     * Sets the value of the i0101VIndividualCustomerMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualCustomerMaintenanceExport }
     *     
     */
    public void setI0101VIndividualCustomerMaintenanceResult(IndividualCustomerMaintenanceExport value) {
        this.i0101VIndividualCustomerMaintenanceResult = value;
    }

}
