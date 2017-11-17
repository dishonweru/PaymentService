
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
 *         &lt;element name="A1901V_AgreementMaintenanceResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}AgreementMaintenanceExport" minOccurs="0"/>
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
    "a1901VAgreementMaintenanceResult"
})
@XmlRootElement(name = "A1901V_AgreementMaintenanceResponse")
public class A1901VAgreementMaintenanceResponse {

    @XmlElement(name = "A1901V_AgreementMaintenanceResult")
    protected AgreementMaintenanceExport a1901VAgreementMaintenanceResult;

    /**
     * Gets the value of the a1901VAgreementMaintenanceResult property.
     * 
     * @return
     *     possible object is
     *     {@link AgreementMaintenanceExport }
     *     
     */
    public AgreementMaintenanceExport getA1901VAgreementMaintenanceResult() {
        return a1901VAgreementMaintenanceResult;
    }

    /**
     * Sets the value of the a1901VAgreementMaintenanceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementMaintenanceExport }
     *     
     */
    public void setA1901VAgreementMaintenanceResult(AgreementMaintenanceExport value) {
        this.a1901VAgreementMaintenanceResult = value;
    }

}
