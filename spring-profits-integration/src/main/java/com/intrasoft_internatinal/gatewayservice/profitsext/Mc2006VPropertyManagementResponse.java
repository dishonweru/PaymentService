
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
 *         &lt;element name="Mc2006V_PropertyManagementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2006VPropertyManagementExport" minOccurs="0"/>
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
    "mc2006VPropertyManagementResult"
})
@XmlRootElement(name = "Mc2006V_PropertyManagementResponse")
public class Mc2006VPropertyManagementResponse {

    @XmlElement(name = "Mc2006V_PropertyManagementResult")
    protected Mc2006VPropertyManagementExport mc2006VPropertyManagementResult;

    /**
     * Gets the value of the mc2006VPropertyManagementResult property.
     * 
     * @return
     *     possible object is
     *     {@link Mc2006VPropertyManagementExport }
     *     
     */
    public Mc2006VPropertyManagementExport getMc2006VPropertyManagementResult() {
        return mc2006VPropertyManagementResult;
    }

    /**
     * Sets the value of the mc2006VPropertyManagementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mc2006VPropertyManagementExport }
     *     
     */
    public void setMc2006VPropertyManagementResult(Mc2006VPropertyManagementExport value) {
        this.mc2006VPropertyManagementResult = value;
    }

}
