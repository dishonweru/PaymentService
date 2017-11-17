
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
 *         &lt;element name="I0102V_CorporateCustomerMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}CorporateCustomerMaintenanceExport" minOccurs="0"/>
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
    "i0102VCorporateCustomerMaintenanceResult"
})
@XmlRootElement(name = "I0102V_CorporateCustomerMaintenanceResponse")
public class I0102VCorporateCustomerMaintenanceResponse {

    @XmlElement(name = "I0102V_CorporateCustomerMaintenanceResult")
    protected CorporateCustomerMaintenanceExport i0102VCorporateCustomerMaintenanceResult;

    /**
     * Gets the value of the i0102VCorporateCustomerMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateCustomerMaintenanceExport }
     *     
     */
    public CorporateCustomerMaintenanceExport getI0102VCorporateCustomerMaintenanceResult() {
        return i0102VCorporateCustomerMaintenanceResult;
    }

    /**
     * Sets the value of the i0102VCorporateCustomerMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateCustomerMaintenanceExport }
     *     
     */
    public void setI0102VCorporateCustomerMaintenanceResult(CorporateCustomerMaintenanceExport value) {
        this.i0102VCorporateCustomerMaintenanceResult = value;
    }

}
