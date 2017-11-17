
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
 *         &lt;element name="I0135V_CardMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}I0135VCardMaintenanceExport" minOccurs="0"/>
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
    "i0135VCardMaintenanceResult"
})
@XmlRootElement(name = "I0135V_CardMaintenanceResponse")
public class I0135VCardMaintenanceResponse {

    @XmlElement(name = "I0135V_CardMaintenanceResult")
    protected I0135VCardMaintenanceExport i0135VCardMaintenanceResult;

    /**
     * Gets the value of the i0135VCardMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link I0135VCardMaintenanceExport }
     *     
     */
    public I0135VCardMaintenanceExport getI0135VCardMaintenanceResult() {
        return i0135VCardMaintenanceResult;
    }

    /**
     * Sets the value of the i0135VCardMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link I0135VCardMaintenanceExport }
     *     
     */
    public void setI0135VCardMaintenanceResult(I0135VCardMaintenanceExport value) {
        this.i0135VCardMaintenanceResult = value;
    }

}
