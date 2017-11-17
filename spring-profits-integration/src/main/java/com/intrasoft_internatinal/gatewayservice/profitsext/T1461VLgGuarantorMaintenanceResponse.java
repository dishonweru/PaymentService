
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
 *         &lt;element name="T1461V_LgGuarantorMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}T1461VLgGuarantorMaintenanceExport" minOccurs="0"/>
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
    "t1461VLgGuarantorMaintenanceResult"
})
@XmlRootElement(name = "T1461V_LgGuarantorMaintenanceResponse")
public class T1461VLgGuarantorMaintenanceResponse {

    @XmlElement(name = "T1461V_LgGuarantorMaintenanceResult")
    protected T1461VLgGuarantorMaintenanceExport t1461VLgGuarantorMaintenanceResult;

    /**
     * Gets the value of the t1461VLgGuarantorMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link T1461VLgGuarantorMaintenanceExport }
     *     
     */
    public T1461VLgGuarantorMaintenanceExport getT1461VLgGuarantorMaintenanceResult() {
        return t1461VLgGuarantorMaintenanceResult;
    }

    /**
     * Sets the value of the t1461VLgGuarantorMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link T1461VLgGuarantorMaintenanceExport }
     *     
     */
    public void setT1461VLgGuarantorMaintenanceResult(T1461VLgGuarantorMaintenanceExport value) {
        this.t1461VLgGuarantorMaintenanceResult = value;
    }

}
