
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
 *         &lt;element name="Mc2032V_PropertyValuerManagementResult" type="{http://www.intrasoft-internatinal.com/GatewayService/ProfitsExt}Mc2032VPropertyValuerManagementExport" minOccurs="0"/>
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
    "mc2032VPropertyValuerManagementResult"
})
@XmlRootElement(name = "Mc2032V_PropertyValuerManagementResponse")
public class Mc2032VPropertyValuerManagementResponse {

    @XmlElement(name = "Mc2032V_PropertyValuerManagementResult")
    protected Mc2032VPropertyValuerManagementExport mc2032VPropertyValuerManagementResult;

    /**
     * Gets the value of the mc2032VPropertyValuerManagementResult property.
     * 
     * @return
     *     possible object is
     *     {@link Mc2032VPropertyValuerManagementExport }
     *     
     */
    public Mc2032VPropertyValuerManagementExport getMc2032VPropertyValuerManagementResult() {
        return mc2032VPropertyValuerManagementResult;
    }

    /**
     * Sets the value of the mc2032VPropertyValuerManagementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mc2032VPropertyValuerManagementExport }
     *     
     */
    public void setMc2032VPropertyValuerManagementResult(Mc2032VPropertyValuerManagementExport value) {
        this.mc2032VPropertyValuerManagementResult = value;
    }

}
